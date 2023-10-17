package org.nasdanika.models.flow.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.model.Document;
import org.nasdanika.drawio.model.Page;
import org.nasdanika.drawio.model.Root;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.flow.FlowFactory;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.ModelElement;
import org.nasdanika.models.flow.Package;
import org.nasdanika.models.flow.Process;
import org.nasdanika.ncore.Marker;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * A factory creating flow model elements from Drawio model elements.
 * Bottom-up wiring - child elements are responsible for wiring themselves to containers.
 * E.g. process (page) to package (document).
 * @author Pavel
 *
 */
public class FlowDrawioFactory {
	
	private static final String CAPABILITY_PACKAGE_KEY = "capability";
	private static final String FLOW_PACKAGE_KEY = "flow";
	
	
	// --- Generic methods to extract to a base class ---
	
	protected boolean isTopLevelPage(Page page) {
		return page.getLinks().isEmpty();
	}
	
	protected String getKindProperty() {
		return "kind";
	}	
		
	/**
	 * Semantic ID is used instead of the Drawio element ID if provided. E.g. "my-process" instead of "HP_1aCX3hRniy5izKEYK"  
	 * @return
	 */
	protected String getSemanticIdProperty() {
		return "semantic-id";
	}	
	
	protected EClassifier getKind(String kind) {
		if (Util.isBlank(kind)) {
			return null;
		}
		int dotIdx = kind.indexOf('.');
		EPackage ePackage = dotIdx == -1 ? getEPackage(FLOW_PACKAGE_KEY) : getEPackage(kind.substring(0, dotIdx));
		return ePackage.getEClassifier(dotIdx == -1 ? kind : kind.substring(dotIdx + 1));		
	}
	
	/**
	 * Creates an instance of specified kind/type.
	 * This implementation uses flow model EClass names as kinds to instantiate respective {@link EClass}es using factory
	 * @param kind
	 * @return
	 */
	protected EObject create(String kind) {
		EClassifier classifier = getKind(kind);
		if (classifier instanceof EClass) {
			return create((EClass) classifier);
		}
		
		throw new IllegalArgumentException("Unsupported element kind: " + kind);
	}
	
	protected EPackage getEPackage(String name) {
		switch (name) {
		case FLOW_PACKAGE_KEY: return FlowPackage.eINSTANCE;
		case CAPABILITY_PACKAGE_KEY: return CapabilityPackage.eINSTANCE;
		}
		throw new IllegalArgumentException("Unsupported package key: " + name);
	}
	
	/**
	 * Creates an instance of argument EClass. This implementation delegates to the factory.
	 * Override to customize, e.g. use specializations (sub-classes) instead of the argument EClass.
	 * @param type
	 * @return
	 */
	protected EObject create(EClass type) {
		return factory.create(type);
	}
	
	/**
	 * 
	 * @param eObject
	 * @return Tree iterator which is aware of page links and fails on double-visits (circular references)
	 */
	protected TreeIterator<EObject> allContents(EObject eObject) {		
		return new AbstractTreeIterator<EObject>(eObject, false) {

			private static final long serialVersionUID = 1L;

			private Set<EObject> tracker = new HashSet<>();

			@Override
			public Iterator<EObject> getChildren(Object object) {
				return contents((EObject) object, tracker).iterator();
			}

		};
	}
	
	/**
	 * 
	 * @param eObject
	 * @param tracker prevents infinite loops in case of circular references
	 * @return Tree iterator which is aware of page links and fails on double-visits (circular references)
	 */
	protected List<EObject> contents(EObject eObject, Collection<EObject> tracker) {
		if (tracker.add(eObject)) {
	    	EList<EObject> eContents = eObject.eContents();
	    	if (eObject instanceof org.nasdanika.drawio.model.ModelElement) {
	    		org.nasdanika.drawio.model.ModelElement drawioModelElement = (org.nasdanika.drawio.model.ModelElement) eObject;
	    		Page linkedPage = drawioModelElement.getLinkedPage();
	    		if (linkedPage != null) {
	    			List<EObject> ret = new ArrayList<>(eContents);
	    			ret.add(linkedPage);
	    			return ret;
	    		}
	    	}
			return eContents;
		}
		return Collections.emptyList(); // Silently preventing infinite loops
	}
	
	protected String getRefIdProperty() {
		return "ref-id";
	}
	
	/**
	 * Recursive wiring of drawio containment 
	 * 
	 * @param path containment path with the first element being the immediate child of the wiring element 
	 * @param consumer Consumes descendant path, returns true if traversal shall continue
	 * @param tracker Tracker to avoid infinite loops
	 */
	protected void wireContent(LinkedList<EObject> path, Function<LinkedList<EObject>,Boolean> consumer, Collection<EObject> tracker) {
		if (consumer.apply(path)) {
			for (EObject child: contents(path.getLast(), tracker)) {
				LinkedList<EObject> subPath = new LinkedList<>(path);
				subPath.add(child);
				wireContent(subPath, consumer, tracker);
			}			
		}
	}
		
	/**
	 * 
	 * @param sourceDrawioElement Source drawio element 
	 * @param semanticSource source semantic element
	 * @param sourceReferences source semantic element references to possibly add the semantic target to
	 * @param targetDrawioPath Drawio containment path of the target
	 * @param semanticTarget target semantic element
	 * @param registry
	 * @param pass
	 * @param progressMonitor
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected boolean wireReferences(
		EObject sourceDrawioElement,
		org.nasdanika.models.flow.ModelElement semanticSource,
		List<EReference> sourceReferences,
		List<EObject> targetDrawioPath,
		EObject semanticTarget,
		Map<EObject, EObject> registry,
		int pass,
		ProgressMonitor progressMonitor) {
		
		EClass semanticSourceEClass = semanticSource.eClass();
		Optional<EReference> refOptional = sourceReferences
			.stream()
			.filter(ref -> semanticSourceEClass.getFeatureType(ref).isInstance(semanticTarget)) // Reference compatibility
			.filter(ref -> matchReference(sourceDrawioElement, semanticSource, ref, targetDrawioPath, semanticTarget, registry, pass, progressMonitor))
			.sorted((a,b) -> NcoreUtil.cmpDistance(semanticTarget.eClass(), semanticSourceEClass.getFeatureType(a), semanticSourceEClass.getFeatureType(b)))
			.findFirst();
		
		if (refOptional.isEmpty()) {
			return true; // Nothing wired, keep going
		}
		
		EReference ref = refOptional.get();
		if (ref.isMany()) {
			((Collection<Object>) semanticSource.eGet(ref)).add(semanticTarget);
		} else {
			semanticSource.eSet(ref, semanticTarget);
		}
		
		return isWireContents(
				sourceDrawioElement, 
				semanticSource, 
				ref, 
				targetDrawioPath, 
				semanticTarget, 
				registry, 
				pass, 
				progressMonitor);
	}
	
	/**
	 * Matches reference using properties of source, target, and path elements. 
	 * @return
	 */
	protected boolean matchReference(
			EObject sourceDrawioElement,
			org.nasdanika.models.flow.ModelElement semanticSource,
			EReference sourceReference,
			List<EObject> targetDrawioPath,
			EObject semanticTarget,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {
		
		// Containment is pushed down - children can take contained objects from parents, other changes of existing containment are not allowed.
		EObject semanticTargetContainer = semanticTarget.eContainer();
		if (sourceReference.isContainment() 
				&& semanticTargetContainer != null
				&& !EcoreUtil.isAncestor(semanticTargetContainer, semanticSource)) {
			return false;
		}
		
		// TODO - wire matching
		
		return true;
	}
	
	/**
	 * If this method returns true then wiring continues to the contents of just wired element. 
	 * @return
	 */
	protected boolean isWireContents(
			EObject sourceDrawioElement,
			org.nasdanika.models.flow.ModelElement semanticSource,
			EReference sourceReference,
			List<EObject> targetDrawioPath,
			EObject semanticTarget,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {
		
		return !sourceReference.isContainment();
	}
	
	
	
	
//	/**
//	 * Recursive wiring of drawio containment 
//	 * @param drawioElement
//	 * @param flowModelElement
//	 * @param registry
//	 * @param referenceStream
//	 * @param progressMonitor
//	 */
//	protected void wireContent(
//			EObject drawioElement,
//			Map<EObject, EObject> registry,
//			Collection<EReference> references,
//			ReferencePredicate referencePredicate,
//			BiConsumer<EReference, EObject> elementConsumer,
//			Collection<EObject> tracker,
//			ProgressMonitor progressMonitor) {
//		
//		EObject flowModelElement = registry.get(drawioElement);
//		if (flowModelElement == null) {
//			// Check for reference property, filter references - pass predicate?
//			
//			for (EObject drawioChild: contents(drawioElement, tracker)) {
//				wireReferences(
//						drawioChild, 
//						registry, 
//						references, 
//						referencePredicate,
//						elementConsumer,
//						tracker,
//						progressMonitor);
//			}
//			
//		} else { 
//			references
//				.stream()
//				.filter(ref -> flowModelElement.eClass().getFeatureType(ref).isInstance(flowModelElement))
//				.filter(ref -> matchReference(drawioElement, flowModelElement, ref, nextFlowModelChild))
//					.sorted((a,b) -> NcoreUtil.cmpDistance(nextFlowModelChild.eClass(), flowModelElement.eClass().getFeatureType(a), flowModelElement.eClass().getFeatureType(b)))
//					.findFirst()
//					.ifPresent(ref -> {
////						System.out.println("Containment " + flowModelElement + " *-" + ref.getName() + "- " + nextFlowModelChild);
//						if (ref.isMany()) {
//							((Collection<Object>) flowModelElement.eGet(ref)).add(nextFlowModelChild);
//						} else {
//							flowModelElement.eSet(ref, nextFlowModelChild);
//						}
//						cit.prune();
//					});
//		}
//	}
	
//	/**
//	 * 
//	 * @param drawioModelElement
//	 * @param container
//	 * @param eReference
//	 * @param candidate
//	 * @return
//	 */
//	protected boolean matchReference(
//			EObject drawioElement,
//			EObject container, 
//			EReference eReference, 
//			EObject candidate) {
//		if (drawioElement instanceof org.nasdanika.drawio.model.ModelElement) {
//			String referenceProperty = getReferenceProperty();
//			if (!Util.isBlank(referenceProperty)) {
//				String refStr = ((org.nasdanika.drawio.model.ModelElement) drawioElement).getProperties().get(referenceProperty);
//				if (!Util.isBlank(refStr)) {
//					int dotIdx = refStr.lastIndexOf('.');
//					if (dotIdx == -1) {
//						throw new IllegalArgumentException("Invalid reference specification: " + refStr);					
//					}
//					if (!eReference.getName().equals(refStr.substring(dotIdx + 1))) {
//						return false;
//					}
//					EClassifier classifier = getKind(refStr.substring(0, dotIdx));
//					return classifier.isInstance(container);
//				}
//			}
//		}
//		return true;
//	}
//	
//	protected String getReferenceProperty() {
//		return "reference";
//	}

	
	/**
	 * Recursively inspects contained drawio elements and adds them to containment references if they match reference type and predicates.
	 * @param drawioElement
	 * @param flowModelElement
	 * @param registry
	 * @param pass
	 * @param progressMonitor
	 */
	protected void wireContainment(
			EObject drawioElement,
			org.nasdanika.models.flow.ModelElement semanticElement,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {

		EList<EReference> allContainments = semanticElement.eClass().getEAllContainments();
		HashSet<EObject> tracker = new HashSet<>();
		
		for (EObject drawioChild: contents(drawioElement, tracker)) {
			LinkedList<EObject> path = new LinkedList<>();
			path.add(drawioChild);
			EObject semanticTarget = registry.get(drawioChild);
			Function<LinkedList<EObject>, Boolean> consumer = cPath -> {
				if (semanticTarget == null) {
					return true; 
				}
				return wireReferences(
						drawioElement, 
						semanticElement, 
						allContainments, 
						path, semanticTarget, 
						registry, 
						pass, 
						progressMonitor);
			};
			
			wireContent(path, consumer, tracker);
		}
	}
	
	/**
	 * Recursively inspects contained drawio elements and adds them to containment references if they match reference type and predicates.
	 * @param drawioElement
	 * @param flowModelElement
	 * @param registry
	 * @param pass
	 * @param progressMonitor
	 */
	protected void wireNonContainment(
			EObject drawioElement,
			org.nasdanika.models.flow.ModelElement semanticElement,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {

		List<EReference> allNonContainments = semanticElement
				.eClass()
				.getEAllReferences()
				.stream()
				.filter(r -> !r.isContainment())
				.toList();
		
		HashSet<EObject> tracker = new HashSet<>();
		
		for (EObject drawioChild: contents(drawioElement, tracker)) {
			LinkedList<EObject> path = new LinkedList<>();
			path.add(drawioChild);
			EObject semanticTarget = registry.get(drawioChild);
			Function<LinkedList<EObject>, Boolean> consumer = cPath -> {
				if (semanticTarget == null) {
					return true; 
				}
				return wireReferences(
						drawioElement, 
						semanticElement, 
						allNonContainments, 
						path, semanticTarget, 
						registry, 
						pass, 
						progressMonitor);
			};
			
			wireContent(path, consumer, tracker);
		}
	}
	
	// ---
	
	protected FlowFactory factory;
	
	public FlowDrawioFactory() {
		this(FlowFactory.eINSTANCE);
	}
	
	public FlowDrawioFactory(FlowFactory factory) {
		this.factory = factory;
	}
		
	/**
	 * {@link Document} is transformed to a flow package.
	 * @param document
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 * @return
	 */
	@org.nasdanika.common.Transformer.Factory
	public Package createPackage(
			org.nasdanika.drawio.model.Document document,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		Package pkg = createPackage(progressMonitor);
		String source = document.getSource();
		if (!Util.isBlank(source)) {
			pkg.getRepresentations().put("drawio", source);
		}
		for (Marker marker: document.getMarkers()) {
			pkg.getMarkers().add(EcoreUtil.copy(marker));
		}
		return pkg;
	}
	
	protected Package createPackage(ProgressMonitor progressMonitor) {
		return factory.createPackage();
	}

	protected Process createProcess(ProgressMonitor progressMonitor) {
		return factory.createProcess();
	}
	
	/**
	 * Creates a model element depending on the kind
	 * @param page
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 * @return
	 */
	@org.nasdanika.common.Transformer.Factory
	public Object createModelElement(
			org.nasdanika.drawio.model.ModelElement modelElement,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
	
		String kindProperty = getKindProperty();
		if (Util.isBlank(kindProperty)) {
			return null;
		}
		
		String kind = modelElement.getProperties().get(kindProperty);
		if (Util.isBlank(kind)) {
			return null;
		}
		
		EObject ret = create(kind.trim());
		if (ret instanceof org.nasdanika.models.flow.ModelElement) {
			ModelElement retModelElement = (org.nasdanika.models.flow.ModelElement) ret;
			configureModelElement(
					modelElement, 
					retModelElement,
					elementProvider,
					registry,
					progressMonitor);
			
			for (Marker marker: modelElement.getMarkers()) {
				retModelElement.getMarkers().add(EcoreUtil.copy(marker));
			}
			
			// Root is logically "merged" with the containing page
			if (modelElement instanceof Root) {
				Page page = (Page) modelElement.eContainer().eContainer();
				retModelElement.setName(page.getName());
				retModelElement.setAnnotation("page-id", page.getId());				
			}
		}
		return ret;
	}
	
	protected void configureModelElement(
			org.nasdanika.drawio.model.ModelElement drawioModelElement,
			org.nasdanika.models.flow.ModelElement flowModelElement,
			BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		String semanticIdProperty = getSemanticIdProperty();
		String elementId = drawioModelElement.getId();
		if (!Util.isBlank(semanticIdProperty)) {
			String semanticId = drawioModelElement.getProperties().get(semanticIdProperty);
			if (Util.isBlank(semanticId)) {
				flowModelElement.setId(elementId);
			} else {
				flowModelElement.setId(semanticId);				
			}
		}
		
		String label = drawioModelElement.getLabel();
		if (!Util.isBlank(label)) {
			flowModelElement.setName(label);
		}
		String tooltip = drawioModelElement.getTooltip();
		if (!Util.isBlank(tooltip)) {
			flowModelElement.setDescription(tooltip);
		}
		flowModelElement.setAnnotation("model-element-id", elementId);
		
		// TODO - properties like documentation, doc-ref, spec, spec-ref
		
	}
	
	// === Wiring ===
	
	// --- Phase 0: Top-down containment & ref-id's in # of path segments pass
	
	/**
	 * Adds contained elements into containment references.
	 * Traverses page links.
	 * 
	 * @param document
	 * @param pkg
	 * @param registry
	 * @param pass
	 * @param progressMonitor
	 */
	@org.nasdanika.common.Transformer.Wire
	public void wireDocumentContainment(
			org.nasdanika.drawio.model.Document document,
			Package pkg,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {

		wireContainment(
				document, 
				pkg, 
				registry, 
				pass, 
				progressMonitor);
	}
	
	/**
	 * Adds contained elements into containment references.
	 * Traverses page links.
	 * 
	 * @param drawioModelElement
	 * @param flowModelElement
	 * @param registry
	 * @param pass
	 * @param progressMonitor
	 */
	@org.nasdanika.common.Transformer.Wire
	public void wireModelElementContainment(
			org.nasdanika.drawio.model.ModelElement drawioModelElement,
			org.nasdanika.models.flow.ModelElement flowModelElement,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {
		
		wireContainment(
				drawioModelElement, 
				flowModelElement, 
				registry, 
				pass, 
				progressMonitor);
		
	}

	/**
	 * Adds contained elements into containment references.
	 * Traverses page links.
	 * 
	 * @param document
	 * @param pkg
	 * @param registry
	 * @param pass
	 * @param progressMonitor
	 */
	@org.nasdanika.common.Transformer.Wire(phase = 1)
	public void wireDocumentNonContainment(
			org.nasdanika.drawio.model.Document document,
			Package pkg,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {

		wireNonContainment(
				document, 
				pkg, 
				registry, 
				pass, 
				progressMonitor);
	}
	
	@org.nasdanika.common.Transformer.Wire(phase = 1)
	public void wireModelElementNonContainment(
			org.nasdanika.drawio.model.ModelElement drawioModelElement,
			org.nasdanika.models.flow.ModelElement flowModelElement,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {
		
		wireNonContainment(
				drawioModelElement, 
				flowModelElement, 
				registry, 
				pass, 
				progressMonitor);
		
	}
	
	/**
	 * Wires elements with ref-id property. Remaps which triggers wireContainment.
	 * @param modelElement
	 * @param registry
	 * @param pass
	 * @param progressMonitor
	 */
	@org.nasdanika.common.Transformer.Wire(targetType = Void.class)
	public boolean wireRefIds(
			org.nasdanika.drawio.model.ModelElement modelElement,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {

		String refIdPropertyName = getRefIdProperty();
		if (Util.isBlank(refIdPropertyName)) {
			return true;
		}
		String refId = modelElement.getProperties().get(refIdPropertyName);
		if (Util.isBlank(refId)) {
			return true;
		}
		
		String[] segments = refId.split("/");
		if (segments.length > pass) {
			return false;
		}

		switch (segments[0]) {
		case "artifacts":
			System.out.println("Yeah!");			
			return true;
		case "processes":
		case "participants":
		case "capabilities":
		case "data-elements":
		case "data-types":
		case "packages":

			return true;
		default:
			throw new IllegalArgumentException("Unsupported ref-id: '" + refId + "' in " + modelElement);						
		}

	}
	
	
	// --- Phase 1: Ref-id's - replace value, "grab" contained elements - prune iterator
	
	// --- Phase 3: Drawio containment, flow model non-containment. E.g. activity in participant

	
	
	
	// --- Phase 0: Capabilities. TODO - extract to capabilities where possible ---
	
	// --- Phase 1: Data Types ---
		//	DataType.java
		//	DataTypeDomain.java
		//	DataTypeDomainElement.java
	
	// --- Phase 2: Data Elements ---
		//	ComplexDataElement.java
		//	DataDomain.java
		//	DataDomainElement.java
		//	DataElement.java
		//	EcoreDataType.java
		//	SimpleDataElement.java
	
	// --- Phase 3: Artifacts ---
		//	Artifact.java
		//	ArtifactConsumer.java
		//	ArtifactDomain.java
		//	ArtifactDomainElement.java
		//	ArtifactInfo.java
		//	ArtifactProcessor.java
		//	ArtifactProcessorRole.java
		//	ArtifactProducer.java
		//	CompositeArtifact.java
	
	// --- Phase 4: Resources ---
		//	CompositeResource.java
		//	Resource.java
		//	ResourceDomain.java
		//	ResourceDomainElement.java
	
	// --- Phase 5: Participants ---
		//	Participant.java
		//	ParticipantDomain.java
		//	ParticipantDomainElement.java
	
	// --- Phase 6: Process Elements ---
		//	Activity.java
		//	Call.java
		//	End.java
		//	Gateway.java
		//	InputPort.java
		//	Node.java
		//	OutputPort.java
		//	Process.java
		//	ProcessDomain.java
		//	ProcessDomainElement.java
		//	ProcessElement.java
		//	Service.java
		//	Start.java
		//	Transition.java
	
	// --- Phase 7: Connection references ---
	
	
	// --- Misc ---	
		//	Collaboratable.java
		//	ModelElement.java
		//	Package.java
		//	Role.java
		//	Source.java
		//	Target.java
	
	// Wire test
	
	
	// --- Phase 0 - Domains ---

	// --- Phase 1 - Domain elements to domains ---
	
	// --- Phase 2 - Containment ---
	
	// --- Phase 3 - ref-id ---
		
	// --- Phase 4 - Connection references ---
	
	
	
	
	
	
	
	
}
