package org.nasdanika.models.flow.generator.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.diagramgenerator.plantuml.PlantUMLDiagramGenerator;
import org.nasdanika.emf.persistence.EObjectLoader;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectGraphFactory;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NopEndpointProcessorConfigFactory;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessorReflectiveFactory;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.Link;
import org.nasdanika.html.model.app.gen.ActionSiteGenerator;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.html.model.app.graph.emf.EObjectReflectiveProcessorFactoryProvider;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Package;
import org.nasdanika.models.flow.processors.doc.FlowNodeProcessorFactory;
import org.nasdanika.models.flow.util.FlowDrawioFactory;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.persistence.ObjectLoader;

public class TestFlow {
	
	@Test
	public void testLoadFlowDocument() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Context context = Context.EMPTY_CONTEXT;
		ResourceSet resourceSet = org.nasdanika.html.model.app.gen.Util.createResourceSet(context, progressMonitor);
		URI diagramURI = URI.createFileURI(new File("flow.drawio").getCanonicalPath());
		Resource diagramModel = resourceSet.getResource(diagramURI, true);

		Transformer<EObject,EObject> flowFactory = new Transformer<>(new FlowDrawioFactory() {
			
			@Override
			protected Package createPackage(ProgressMonitor progressMonitor) {
				Package pkg = super.createPackage(progressMonitor);
				ObjectLoader objectLoader = new EObjectLoader(resourceSet);
				try {
					objectLoader.loadYaml(new File("flow.drawio.yml").getCanonicalFile(), pkg, null, progressMonitor);
					return pkg;
				} catch (Exception e) {
					throw new NasdanikaException(e);
				}				
			}
			
		});
		Collection<EObject> diagramModelContents = new ArrayList<>();
		diagramModel.getAllContents().forEachRemaining(e -> {
			if (e instanceof org.nasdanika.drawio.model.Document
					|| e instanceof org.nasdanika.drawio.model.Page
					|| e instanceof org.nasdanika.drawio.model.ModelElement) {
				diagramModelContents.add(e);
			}
		});
		Map<EObject, EObject> flowElements = flowFactory.transform(diagramModelContents, false, progressMonitor);
		
		URI flowURI = URI.createFileURI(new File("target/flow.xmi").getCanonicalPath());
		Resource flowResource = resourceSet.createResource(flowURI);
		diagramModel.getContents().stream().map(flowElements::get).forEach(flowResource.getContents()::add);
		flowResource.save(null);		
	}
	
	@Test
	public void testGenerateFlowDoc() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		context.register(DiagramGenerator.class, new PlantUMLDiagramGenerator());
		ResourceSet resourceSet = org.nasdanika.html.model.app.gen.Util.createResourceSet(context, progressMonitor);
		resourceSet.getPackageRegistry().put(FlowPackage.eNS_URI, FlowPackage.eINSTANCE);
		
		URI flowURI = URI.createFileURI(new File("target/flow.xmi").getCanonicalPath());
		Resource flowResource = resourceSet.getResource(flowURI, true);
		
		Transformer<EObject,Element> graphFactory = new Transformer<>(new EObjectGraphFactory());
		Map<EObject, Element> graph = graphFactory.transform(flowResource.getContents(), false, progressMonitor);

		NopEndpointProcessorConfigFactory<WidgetFactory> configFactory = new NopEndpointProcessorConfigFactory<>() {
			
			@Override
			protected boolean isPassThrough(Connection connection) {
				return false;
			}
			
		};
		
		Transformer<Element,ProcessorConfig> processorConfigTransformer = new Transformer<>(configFactory);				
		Map<Element, ProcessorConfig> configs = processorConfigTransformer.transform(graph.values(), false, progressMonitor);
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);
		FlowNodeProcessorFactory flowNodeProcessorFactory = new FlowNodeProcessorFactory(context, null);		
		
		EObjectNodeProcessorReflectiveFactory<WidgetFactory, WidgetFactory> eObjectNodeProcessorReflectiveFactory = new EObjectNodeProcessorReflectiveFactory<>(flowNodeProcessorFactory);
		EObjectReflectiveProcessorFactoryProvider eObjectReflectiveProcessorFactoryProvider = new EObjectReflectiveProcessorFactoryProvider(eObjectNodeProcessorReflectiveFactory);
		Map<Element, ProcessorInfo<Object>> registry = eObjectReflectiveProcessorFactoryProvider.getFactory().createProcessors(configs.values(), false, progressMonitor);
		
		WidgetFactory flowProcessor = null;
		Collection<Throwable> resolveFailures = new ArrayList<>();		
		URI baseActionURI = URI.createURI("local://flow.models.nasdanika.org/demo/");
		
		Map<EObject, URI> uriMap = Map.ofEntries(
				Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
				Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/")),			
				Map.entry(CapabilityPackage.eINSTANCE, URI.createURI("https://capability.models.nasdanika.org/")),			
				Map.entry(FlowPackage.eINSTANCE, URI.createURI("https://flow.models.nasdanika.org/")),
				Map.entry(flowResource.getContents().get(0), baseActionURI)				
			);
		
		for (EObject topLevel: uriMap.keySet()) {
			for (Entry<Element, ProcessorInfo<Object>> re: registry.entrySet()) {
				Element element = re.getKey();
				if (element instanceof EObjectNode) {
					EObjectNode eObjNode = (EObjectNode) element;
					EObject target = eObjNode.get();
					if (target == topLevel) {
						ProcessorInfo<Object> info = re.getValue();
						Object processor = info.getProcessor();
						if (processor instanceof WidgetFactory) {
							WidgetFactory widgetFactoryNodeProcessor = (WidgetFactory) processor;
							widgetFactoryNodeProcessor.resolve(uriMap.get(topLevel), progressMonitor);
							
							if (topLevel == flowResource.getContents().get(0)) { 							
								flowProcessor = widgetFactoryNodeProcessor;
							}
						}
					}
				}
			}			
		}
		
		if (!resolveFailures.isEmpty()) {
			NasdanikaException ne = new NasdanikaException("Theres's been " + resolveFailures.size() +  " failures during URI resolution: " + resolveFailures);
			for (Throwable failure: resolveFailures) {
				ne.addSuppressed(failure);
			}
			throw ne;
		}								
		
		ResourceSet actionModelsResourceSet = new ResourceSetImpl();
		actionModelsResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		
		File output = new File(actionModelsDir, "flow-actions.xmi");
		Resource actionModelResource = actionModelsResourceSet.createResource(URI.createFileURI(output.getAbsolutePath()));
		Collection<Label> labels = flowProcessor.createLabelsSupplier().call(progressMonitor, diagnosticConsumer);
		for (Label label: labels) {
			if (label instanceof Link) {
				Link link = (Link) label;
				String location = link.getLocation();
				if (!org.nasdanika.common.Util.isBlank(location)) {
					URI uri = URI.createURI(location);
					if (!uri.isRelative()) {
						link.setLocation("${base-uri}" + uri.deresolve(baseActionURI, true, true, true).toString());
					}
				}
			}
		}
						
		actionModelResource.getContents().addAll(labels);
		actionModelResource.save(null);
				
		String rootActionResource = "flow-actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://flow.models.nasdanika.org/demo";		
		ActionSiteGenerator actionSiteGenerator = new ActionSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path);				
			};
			
		};		
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(rootActionURI, pageTemplateURI, siteMapDomain, new File("../docs/demo"), new File("target/flow-doc-site-work-dir"), true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errors.size() != 0) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
		
	}
	

}
