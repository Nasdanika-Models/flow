package org.nasdanika.models.flow.util;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.model.Document;
import org.nasdanika.drawio.model.Page;
import org.nasdanika.drawio.model.Root;
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
	 * Creates a layer element depending on the kind
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
		
		EObject ret = create(kind);
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
	
	/**
	 * Creates an instance of specified kind/type.
	 * This implementation uses flow model EClass names as kinds to instantiate respective {@link EClass}es using factory
	 * @param kind
	 * @return
	 */
	protected EObject create(String kind) {
		if (Util.isBlank(kind)) {
			return null;
		}
		EClassifier classifier = FlowPackage.eINSTANCE.getEClassifier(kind.trim());
		if (classifier instanceof EClass) {
			return create((EClass) classifier);
		} 
		
		throw new IllegalArgumentException("Unsupported element kind: " + kind);
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
	
	// === Wiring ===
	
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
	@org.nasdanika.common.Transformer.Wire
	public void wirePackage(
			org.nasdanika.drawio.model.Document document,
			Package pkg,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {

		System.out.println("Wiring: " + document + " " + pass);
		
	}

	@org.nasdanika.common.Transformer.Wire(targetType = Void.class)
	public void wireNulls(
			org.nasdanika.drawio.model.ModelElement modelElement,
			Map<EObject, EObject> registry,
			int pass,
			ProgressMonitor progressMonitor) {

		System.out.println("Wiring null target: " + modelElement + " " + pass);
		
	}
	
	
	// --- Phase 0 - Domains ---

	// --- Phase 1 - Domain elements to domains ---
	
	// --- Phase 2 - Containment ---
	
	// --- Phase 3 - ref-id ---
		
	// --- Phase 4 - Connection references ---
	
	
	
	
	
//	private boolean isTopLevelPage(Page page) {
//		return page.getLinks().isEmpty();
//	}
	
//	protected void wireModelElement(
//			org.nasdanika.drawio.model.ModelElement drawioModelElement,
//			EObject flowModelElement,
//			Map<EObject, EObject> registry,
//			ProgressMonitor progressMonitor) {
//		
//		// --- Nodes ---
//		// Activity to containing participant(s) and resource(s) 
//		if (flowModelElement instanceof Activity) {
//			Activity activity = (Activity) flowModelElement;
//			for (EObject container = drawioModelElement.eContainer(); container != null; container = container.eContainer()) {
//				EObject fContainer = registry.get(container);
//				if (fContainer instanceof Participant) {
//					activity.getParticipants().add(((Participant) fContainer));
//				}
//				if (fContainer instanceof Resource) {
//					activity.getResources().add(((Resource) fContainer));
//				}
//			}			
//			
//			// TODO - support references
//		}
////		Artifact.java
////		ArtifactConsumer.java - inputs
////		ArtifactInfo.java
////		ArtifactProcessor.java
////		ArtifactProcessorRole.java
////		ArtifactProducer.java
////		Collaboratable.java - roles
//
////		End.java
////		FlowFactory.java
////		FlowPackage.java
////		Gateway.java
////		InputPort.java
//		if (flowModelElement instanceof InputPort) {
//			// Wiring to containing Node
//			EObject containingNode = findContainer(drawioModelElement, registry::get, org.nasdanika.models.flow.Node.class::isInstance);
//			if (containingNode instanceof org.nasdanika.models.flow.Node) {
//				((org.nasdanika.models.flow.Node) containingNode).getInputPorts().add((InputPort) flowModelElement);
//			}				
//		}
////		ModelElement.java
////		Node.java
////		OutputPort.java
//		if (flowModelElement instanceof OutputPort) {
//			// Wiring to containing Node
//			EObject containingNode = findContainer(drawioModelElement, registry::get, org.nasdanika.models.flow.Node.class::isInstance);
//			if (containingNode instanceof org.nasdanika.models.flow.Node) {
//				((org.nasdanika.models.flow.Node) containingNode).getOutputPorts().add((OutputPort) flowModelElement);
//			}				
//		}
////		TODO Participant.java
////		Process.java
//		if (flowModelElement instanceof Process) {
//			if (drawioModelElement instanceof Root) {
//				Page page = (Page) drawioModelElement.eContainer().eContainer();
//				if (isTopLevelPage(page)) {
//					org.nasdanika.models.flow.Package pkg = (org.nasdanika.models.flow.Package) registry.get(page.eContainer());
//					pkg.getProcesses().add((Process) flowModelElement);
//				}
//			}
//			
//			Page linkedPage = drawioModelElement.getLinkedPage();
//			if (linkedPage != null) {
//				EObject linkedPageFlowElement = registry.get(linkedPage);
//				if (linkedPageFlowElement instanceof Process) {
//					// Merging the linked page into this element
//					Process process = (Process) flowModelElement;
//					Process linkedProcess = EcoreUtil.copy((Process) linkedPageFlowElement); // There might be multiple links
//					process.setAnnotation("linked-page-id", linkedPage.getId());
//					process.getContextHelp().addAll(linkedProcess.getContextHelp());
//					if (Util.isBlank(process.getDescription())) {
//						process.setDescription(linkedProcess.getDescription());
//					};
//					process.getDocumentation().addAll(linkedProcess.getDocumentation());
//					process.getElements().addAll(linkedProcess.getElements());
//					process.getInputPorts().addAll(linkedProcess.getInputPorts());
//					process.getInputs().addAll(linkedProcess.getInputs());
//					process.getMarkers().addAll(linkedProcess.getMarkers());
//					if (Util.isBlank(process.getName())) {
//						process.setName(linkedProcess.getName());
//					}
//					process.getOutputPorts().addAll(linkedProcess.getOutputPorts());
//					process.getOutputs().addAll(linkedProcess.getOutputs());
//					process.getRequirements().addAll(linkedProcess.getRequirements());
//				}
//			}
//		}
//		
////		ProcessElement.java
//		if (flowModelElement instanceof ProcessElement) {
//			// Wiring to containing process
//			EObject containingProcess = findContainer(drawioModelElement, registry::get, Process.class::isInstance);
//			if (containingProcess instanceof Process) {
//				((Process) containingProcess).getElements().add((ProcessElement) flowModelElement);
//			}				
//		}
////		Resource.java
////		Role.java - participants, resources
////		Service.java - process (top  level)
////		Source.java
////		Start.java
////		Target.java
//		
//
//		// --- Connections ---
//		// Connection
//		// Transition - payload		
//		// Call.java - response
//		if (flowModelElement instanceof org.nasdanika.models.flow.Connection) {
//			org.nasdanika.drawio.model.Connection drawioConnection = (org.nasdanika.drawio.model.Connection) drawioModelElement;
//			Node source = drawioConnection.getSource();
//			if (source == null) {
//				throw new ConfigurationException("Connection without source", drawioConnection);
//			}
//			EObject flowSource = registry.get(source);
//			if (flowSource instanceof org.nasdanika.models.flow.Source) {
//				((org.nasdanika.models.flow.Source) flowSource).getOutgoingConnections().add(((org.nasdanika.models.flow.Connection) flowModelElement));
//			} else {
//				throw new ConfigurationException("Connection source is not of org.nasdanika.models.flow.Source kind", drawioConnection);
//			}
//
//			Node target = drawioConnection.getTarget();
//			if (target == null) {
//				throw new ConfigurationException("Connection without target", drawioConnection);
//			}
//			EObject flowTarget = registry.get(target);
//			if (flowTarget instanceof org.nasdanika.models.flow.Target) {
//				((org.nasdanika.models.flow.Connection) flowModelElement).setTarget((org.nasdanika.models.flow.Target) flowTarget);
//			} else {
//				throw new ConfigurationException("Connection target is not of org.nasdanika.models.flow.Target kind", drawioConnection);
//			}
//		}
//		
//		// --- Data ---		
//		// DataElement
//		// ComplexDataElement
//		// DataType
//		// EcoreDataType
//		// SimpleDataElement
//
//		
//		// --- References ---
//		if (drawioModelElement instanceof org.nasdanika.drawio.model.Connection) {
//			String referenceName = drawioModelElement.getProperties().get("reference");
//			if (!Util.isBlank(referenceName)) {
//				org.nasdanika.drawio.model.Connection connection = (org.nasdanika.drawio.model.Connection) drawioModelElement;
//				Node source = connection.getSource();
//				if (source == null) {
//					throw new ConfigurationException("Reference connection shall have source");
//				}
//			}
//		}
//		
//	}
//	
//	/**
//	 * Resolves object definition (kind property) present in the registry and object reference - property with object type name (e.g. participant) and object id value (e.g. developer)
//	 * @param drawioModelElement
//	 * @param flowModelElement
//	 * @param registry
//	 * @param progressMonitor
//	 * @return
//	 */
//	protected EObject resolve(org.nasdanika.drawio.model.ModelElement drawioModelElement, Map<EObject, EObject> registry) {		
//		EObject definition = registry.get(drawioModelElement);
//		if (definition != null) {
//			return definition;
//		}
//		
//		// References
//		
//	}
//	
//	protected EObject findContainer(
//			EObject obj, 
//			Function<EObject, EObject> registry, 
//			Predicate<EObject> predicate) {
//		
//		EObject container = obj.eContainer();
//		if (container == null) {
//			return null;
//		}
//		EObject ret = registry.apply(container);
//		if (ret != null && predicate.test(ret)) {
//			return ret;
//		}
//		
//		return findContainer(container, registry, predicate);
//	}
	
	
}
