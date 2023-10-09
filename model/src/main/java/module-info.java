module org.nasdanika.models.flow {
	exports org.nasdanika.models.flow;
	exports org.nasdanika.models.flow.impl;
	exports org.nasdanika.models.flow.util;
	opens org.nasdanika.models.flow.util; // For reflection
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.capability;
	requires transitive org.nasdanika.drawio.model;
}