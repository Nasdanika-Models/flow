/**
 */
package org.nasdanika.models.flow.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.flow.Node;

public class NodeNodeProcessor<T extends Node> extends ProcessElementNodeProcessor<T> {
	
	public NodeNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			Context context,
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}	
	
	// Source facet
	// Target facet
	// ArtifactProcessor facet
	
//	EList<InputPort> getInputPorts();
//	EList<OutputPort> getOutputPorts();

} // Node
