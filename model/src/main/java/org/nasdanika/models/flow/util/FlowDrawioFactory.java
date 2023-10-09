package org.nasdanika.models.flow.util;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.drawio.model.Document;
import org.nasdanika.drawio.model.Node;
import org.nasdanika.drawio.model.Page;
import org.nasdanika.models.flow.FlowFactory;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.InputPort;
import org.nasdanika.models.flow.OutputPort;
import org.nasdanika.models.flow.Package;
import org.nasdanika.models.flow.Process;
import org.nasdanika.models.flow.ProcessElement;
import org.nasdanika.ncore.Marker;
import org.nasdanika.persistence.ConfigurationException;

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
	public org.nasdanika.models.flow.Package createPackage(
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
	
	protected org.nasdanika.models.flow.Package createPackage(ProgressMonitor progressMonitor) {
		return factory.createPackage();
	}
		
	/**
	 * {@link Page} is transformed to a {@link Process}
	 * @param page
	 * @param parallel
	 * @param elementProvider
	 * @param registry
	 * @param progressMonitor
	 * @return
	 */
	@org.nasdanika.common.Transformer.Factory
	public org.nasdanika.models.flow.Process createProcess(
			org.nasdanika.drawio.model.Page page,
			boolean parallel,
			BiConsumer<EObject, BiConsumer<EObject,ProgressMonitor>> elementProvider, 
			Consumer<BiConsumer<Map<EObject, EObject>,ProgressMonitor>> registry,
			ProgressMonitor progressMonitor) {
		
		Process process = createProcess(progressMonitor);
		process.setName(page.getName());
		process.setAnnotation("page-id", page.getId());
		
		for (Marker marker: page.getMarkers()) {
			process.getMarkers().add(EcoreUtil.copy(marker));
		}
		
		configureModelElement(
				page.getModel().getRoot(), 
				process, 
				elementProvider, 
				registry, 
				progressMonitor);
		
		if (isTopLevelPage(page)) {
			elementProvider.accept(page.eContainer(), (pce, pm) -> ((org.nasdanika.models.flow.Package) pce).getProcesses().add(process));
		} 
		
		return process;
	}
	
	private boolean isTopLevelPage(Page page) {
		return page.getLinks().isEmpty();
	}

	protected org.nasdanika.models.flow.Process createProcess(ProgressMonitor progressMonitor) {
		return factory.createProcess();
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
	public EObject createModelElement(
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
			configureModelElement(
					modelElement, 
					(org.nasdanika.models.flow.ModelElement) ret,
					elementProvider,
					registry,
					progressMonitor);
		}
		
		registry.accept((r,p) -> wireModelElement(modelElement, ret, r, p));		
		return ret;
	}
	
	protected void wireModelElement(
			org.nasdanika.drawio.model.ModelElement drawioModelElement,
			EObject flowModelElement,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		if (flowModelElement instanceof ProcessElement) {
			// Wiring to containing process
			EObject containingProcess = findContainer(drawioModelElement, registry::get, org.nasdanika.models.flow.Process.class::isInstance);
			if (containingProcess instanceof org.nasdanika.models.flow.Process) {
				((org.nasdanika.models.flow.Process) containingProcess).getElements().add((ProcessElement) flowModelElement);
			}				
		}
		if (flowModelElement instanceof InputPort) {
			// Wiring to containing Node
			EObject containingNode = findContainer(drawioModelElement, registry::get, org.nasdanika.models.flow.Node.class::isInstance);
			if (containingNode instanceof org.nasdanika.models.flow.Node) {
				((org.nasdanika.models.flow.Node) containingNode).getInputPorts().add((InputPort) flowModelElement);
			}				
		}
		if (flowModelElement instanceof OutputPort) {
			// Wiring to containing Node
			EObject containingNode = findContainer(drawioModelElement, registry::get, org.nasdanika.models.flow.Node.class::isInstance);
			if (containingNode instanceof org.nasdanika.models.flow.Node) {
				((org.nasdanika.models.flow.Node) containingNode).getOutputPorts().add((OutputPort) flowModelElement);
			}				
		}
		
		if (flowModelElement instanceof org.nasdanika.models.flow.Process) {
			Page linkedPage = drawioModelElement.getLinkedPage();
			if (linkedPage != null) {
				EObject linkedPageFlowElement = registry.get(linkedPage);
				if (linkedPageFlowElement instanceof org.nasdanika.models.flow.Process) {
					// Merging the linked page into this element
					org.nasdanika.models.flow.Process process = (org.nasdanika.models.flow.Process) flowModelElement;
					org.nasdanika.models.flow.Process linkedProcess = EcoreUtil.copy((org.nasdanika.models.flow.Process) linkedPageFlowElement); // There might be multiple links
					process.setAnnotation("linked-page-id", linkedPage.getId());
					process.getContextHelp().addAll(linkedProcess.getContextHelp());
					if (Util.isBlank(process.getDescription())) {
						process.setDescription(linkedProcess.getDescription());
					};
					process.getDocumentation().addAll(linkedProcess.getDocumentation());
					process.getElements().addAll(linkedProcess.getElements());
					process.getInputPorts().addAll(linkedProcess.getInputPorts());
					process.getInputs().addAll(linkedProcess.getInputs());
					process.getMarkers().addAll(linkedProcess.getMarkers());
					if (Util.isBlank(process.getName())) {
						process.setName(linkedProcess.getName());
					}
					process.getOutputPorts().addAll(linkedProcess.getOutputPorts());
					process.getOutputs().addAll(linkedProcess.getOutputs());
					process.getRequirements().addAll(linkedProcess.getRequirements());
				}
			}
		}
		
		if (flowModelElement instanceof org.nasdanika.models.flow.Connection) {
			org.nasdanika.drawio.model.Connection drawioConnection = (org.nasdanika.drawio.model.Connection) drawioModelElement;
			Node source = drawioConnection.getSource();
			if (source == null) {
				throw new ConfigurationException("Connection without source", drawioConnection);
			}
			EObject flowSource = registry.get(source);
			if (flowSource instanceof org.nasdanika.models.flow.Source) {
				((org.nasdanika.models.flow.Source) flowSource).getOutgoingConnections().add(((org.nasdanika.models.flow.Connection) flowModelElement));
			} else {
				throw new ConfigurationException("Connection source is not of org.nasdanika.models.flow.Source kind", drawioConnection);
			}

			Node target = drawioConnection.getTarget();
			if (target == null) {
				throw new ConfigurationException("Connection without target", drawioConnection);
			}
			EObject flowTarget = registry.get(target);
			if (flowTarget instanceof org.nasdanika.models.flow.Target) {
				((org.nasdanika.models.flow.Connection) flowModelElement).setTarget((org.nasdanika.models.flow.Target) flowTarget);
			} else {
				throw new ConfigurationException("Connection target is not of org.nasdanika.models.flow.Target kind", drawioConnection);
			}
		}
	}
	
	protected EObject findContainer(
			EObject obj, 
			Function<EObject, EObject> registry, 
			Predicate<EObject> predicate) {
		
		EObject container = obj.eContainer();
		if (container == null) {
			return null;
		}
		EObject ret = registry.apply(container);
		if (ret != null && predicate.test(ret)) {
			return ret;
		}
		
		return findContainer(container, registry, predicate);
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
	
}
