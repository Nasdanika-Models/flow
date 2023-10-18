package org.nasdanika.models.flow.util;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.ContentMapper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.model.Document;
import org.nasdanika.drawio.model.Page;
import org.nasdanika.drawio.model.Root;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.flow.ArtifactDomain;
import org.nasdanika.models.flow.ArtifactDomainElement;
import org.nasdanika.models.flow.FlowFactory;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.ModelElement;
import org.nasdanika.models.flow.Package;
import org.nasdanika.models.flow.Process;
import org.nasdanika.ncore.Marker;

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
	
	protected String getRefIdProperty() {
		return "ref-id";
	}
	
	
	// ---
	
	protected FlowFactory factory;
	protected ContentMapper<EObject, EObject> containmentContentMapper;
	protected ContentMapper<EObject, EObject> nonContainmentContentMapper;
	
	/**
	 * 
	 * @param containmentContentMapper Used in wiring phase 0 to map/wire containment references
	 * @param nonContainmentContentMapper Used in wiring phase 1 to map/wire non-containment references
	 */
	public FlowDrawioFactory(
			ContentMapper<EObject,EObject> containmentContentMapper,
			ContentMapper<EObject,EObject> nonContainmentContentMapper) {
		this(containmentContentMapper, nonContainmentContentMapper, FlowFactory.eINSTANCE);
	}

	/**
	 * 
	 * @param containmentContentMapper Used in wiring phase 0 to map/wire containment references
	 * @param nonContainmentContentMapper Used in wiring phase 1 to map/wire non-containment references
	 * @param factory
	 */
	public FlowDrawioFactory(
			ContentMapper<EObject,EObject> containmentContentMapper,
			ContentMapper<EObject,EObject> nonContainmentContentMapper,
			FlowFactory factory) {
		this.factory = factory;
		this.containmentContentMapper = containmentContentMapper;
		this.nonContainmentContentMapper = nonContainmentContentMapper;
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
		
		if (containmentContentMapper != null) {
			containmentContentMapper.wire(document, registry, progressMonitor);
		}
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
		
		if (containmentContentMapper != null) {
			containmentContentMapper.wire(drawioModelElement, registry, progressMonitor);
		}
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
		
		if (nonContainmentContentMapper != null) {
			nonContainmentContentMapper.wire(document, registry, progressMonitor);
		}
	}
	
	@org.nasdanika.common.Transformer.Wire(phase = 1)
	public void wireModelElementNonContainment(
			org.nasdanika.drawio.model.ModelElement drawioModelElement,
			org.nasdanika.models.flow.ModelElement flowModelElement,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {
				
		if (nonContainmentContentMapper != null) {
			nonContainmentContentMapper.wire(drawioModelElement, registry, progressMonitor);
		}
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

		Package rootPackage = null;
		for (EObject semanticElement: registry.values()) {
			if (semanticElement instanceof Package && rootPackage == null || EcoreUtil.isAncestor(semanticElement, rootPackage)) {
				rootPackage = (Package) semanticElement;
			}
		}
		
		switch (segments[0]) {
		case "artifacts":
			ArtifactDomainElement artifactDomainElement = findArtifact(rootPackage, segments, 1);
			if (artifactDomainElement == null) {
				throw new IllegalArgumentException("Artifact not found, ref-id: " + refId);
			}
			registry.put(modelElement, artifactDomainElement);
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
	
	protected ArtifactDomainElement findArtifact(ArtifactDomain artifactDomain, String[] path, int idx) {
		for (ArtifactDomainElement artifactDomainElement: artifactDomain.getArtifacts()) {
			if (artifactDomainElement.getId().equals(path[idx])) {
				if (idx == path.length - 1) {
					return artifactDomainElement;
				}
				return findArtifact(((ArtifactDomain) artifactDomainElement), path, idx + 1);
			}
		}
		return null;
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
