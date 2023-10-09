package org.nasdanika.models.flow.processors.doc;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessor;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.AppFactory;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.flow.Connection;
import org.nasdanika.models.flow.Transition;
import org.nasdanika.ncore.util.NcoreUtil;

/**
 * Node processor factory to use with {@link EObjectReflectiveProcessorFactory} to generate flow documentation.
 * @author Pavel
 *
 */
public class FlowNodeProcessorFactory {
			
	private Context context;
	private java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider;

	protected java.util.function.Function<ProgressMonitor, Action> getPrototypeProvider(NodeProcessorConfig<WidgetFactory, WidgetFactory> config) {
		return progressMonitor -> {
			if (prototypeProvider != null) {
				for (URI identifier: NcoreUtil.getIdentifiers(((EObjectNode) config.getElement()).get())) {
					Action prototype = prototypeProvider.apply(identifier, progressMonitor);
					if (prototype != null) {
						return prototype;
					}				
				}			
			}
			return AppFactory.eINSTANCE.createAction();
		};		
	}
	
	/**
	 * 
	 * @param context
	 * @param reflectiveFactories Objects with annotated methods for creating processors. 
	 */
	public FlowNodeProcessorFactory(
			Context context, 
			java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider)  {
		this.context = context;
		this.prototypeProvider = prototypeProvider;
	}
			
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Activity.class)
	public Object createActivityNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ActivityNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Artifact.class)
	public Object createArtifactNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ArtifactNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Call.class)
	public Object createCallNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new CallNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.ComplexDataElement.class)
	public Object createComplexDataElementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ComplexDataElementNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Connection.class)
	public Object createConnectionNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ConnectionNodeProcessor<Connection>(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.EcoreDataType.class)
	public Object createEcoreDataTypeNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new EcoreDataTypeNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.End.class)
	public Object createEndNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new EndNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Gateway.class)
	public Object createGatewayNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new GatewayNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.InputPort.class)
	public Object createInputPortNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new InputPortNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.OutputPort.class)
	public Object createOutputPortNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new OutputPortNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Package.class)
	public Object createPackageNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new PackageNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Participant.class)
	public Object createParticipantNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ParticipantNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Process.class)
	public Object createProcessNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ProcessNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Resource.class)
	public Object createResourceNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new ResourceNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Role.class)
	public Object createRoleNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new RoleNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.SimpleDataElement.class)
	public Object createSimpleDataElementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new SimpleDataElementNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Start.class)
	public Object createStartNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new StartNodeProcessor(config, context, getPrototypeProvider(config));
	}	
	
	@EObjectNodeProcessor(type = org.nasdanika.models.flow.Transition.class)
	public Object createTransitionNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			boolean parallel, 
			BiConsumer<Element,BiConsumer<ProcessorInfo<Object>,ProgressMonitor>> infoProvider,
			ProgressMonitor progressMonitor) {
		
		return new TransitionNodeProcessor<Transition>(config, context, getPrototypeProvider(config));
	}	
	

}
