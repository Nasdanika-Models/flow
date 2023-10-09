/**
 */
package org.nasdanika.models.flow.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.flow.Artifact;

public class ArtifactNodeProcessor extends ModelElementNodeProcessor<Artifact> {
	
	public ArtifactNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			Context context,
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}	
	
//	EList<Resource> getResources();
//	EList<DataElement> getDataElements();
//	EList<ArtifactInfo> getInfos();
//	EList<Participant> getParticipants();

} 
