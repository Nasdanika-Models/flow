/**
 */
package org.nasdanika.models.flow.processors.doc;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.models.flow.ProcessDomainElement;

public class ProcessDomainElementNodeProcessor<T extends ProcessDomainElement> extends ModelElementNodeProcessor<T> {

	public ProcessDomainElementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			Context context,
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}
	
} 
