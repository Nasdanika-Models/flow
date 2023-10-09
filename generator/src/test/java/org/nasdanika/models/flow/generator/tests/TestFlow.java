package org.nasdanika.models.flow.generator.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.util.FlowDrawioFactory;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.StringProperty;

public class TestFlow {
	
	@Test
	public void testLoadFlowDocument() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Context context = Context.EMPTY_CONTEXT;
		ResourceSet resourceSet = org.nasdanika.html.model.app.gen.Util.createResourceSet(context, progressMonitor);
		URI diagramURI = URI.createFileURI(new File("flow.drawio").getCanonicalPath());
		Resource diagramModel = resourceSet.getResource(diagramURI, true);

		Transformer<EObject,EObject> flowFactory = new Transformer<>(new FlowDrawioFactory());
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
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(NcorePackage.eNS_URI, NcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(FlowPackage.eNS_URI, FlowPackage.eINSTANCE);
		
		URI flowURI = URI.createFileURI(new File("target/flow.xmi").getCanonicalPath());
		Resource flowResource = resourceSet.getResource(flowURI, true);
		flowResource.getAllContents().forEachRemaining(e -> {
			if (e instanceof org.nasdanika.models.flow.Process) {
				org.nasdanika.models.flow.Process process = (org.nasdanika.models.flow.Process) e;
				System.out.println(((StringProperty) process.getAnnotation("page-id")).getValue());
				System.out.println(((StringProperty) process.getAnnotation("model-element-id")).getValue());
			}
		});
	}
	

}
