package org.nasdanika.models.flow.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;

public class PackageNodeProcessor extends ModelElementNodeProcessor<org.nasdanika.models.flow.Package> {
	
	public PackageNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			Context context,
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}	
	
//	EList<org.nasdanika.models.flow.Process> getProcesses();
//	EList<Participant> getParticipants();
//	EList<Resource> getResources();
//	EList<Artifact> getArtifacts();
//	EList<Package> getSubPackages();
//	EList<DataElement> getDataElements();
//	EList<DataType> getDataTypes();
		
}
