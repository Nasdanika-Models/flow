/**
 */
package org.nasdanika.models.flow.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.flow.Resource;

public class ResourceNodeProcessor extends ModelElementNodeProcessor<Resource> {
	
	public ResourceNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			Context context,
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}	
	
//	EList<Artifact> getArtifacts();
//	EList<Role> getRoles();
//	EList<Participant> getParticipants();
//	EList<ArtifactInfo> getInfos();

} 
