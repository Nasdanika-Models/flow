package org.nasdanika.models.flow.processors.doc;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.graph.emf.EReferenceConnection;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.html.model.app.graph.emf.EObjectNodeProcessor;
import org.nasdanika.ncore.NamedElement;

public class ModelElementNodeProcessor<T extends org.nasdanika.models.flow.ModelElement> extends EObjectNodeProcessor<T> {
	
	public ModelElementNodeProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			Context context,
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider) {
		super(config, context, prototypeProvider);
	}	
	

	/**
	 * Suppressing default behavior, explicit specification of how to build.
	 */	
	@Override
	protected void addReferenceChildren(
			EReference eReference, 
			Collection<Label> labels, 
			Map<EReferenceConnection, Collection<Label>> outgoingLabels, 
			ProgressMonitor progressMonitor) {
	}

//	@Override
//	protected String getName(NamedElement namedElement) {
//		String name = super.getName(namedElement);
//		if (Util.isBlank(name) && namedElement instanceof org.nasdanika.models.flow.ModelElement) {
//			name = namedElement.eClass().getName() + " " + ((org.nasdanika.models.flow.ModelElement) namedElement).getId();
//		}
//		return name;
//	}
	
}
