module org.nasdanika.models.flow.processors {
		
	requires transitive org.nasdanika.models.flow;
	requires transitive org.nasdanika.models.ecore.graph;
	requires transitive org.nasdanika.models.capability.processors;
	requires transitive org.nasdanika.models.graph.processors;
	
	exports org.nasdanika.models.flow.processors.doc;
	opens org.nasdanika.models.flow.processors.doc; // For loading resources
	exports org.nasdanika.models.flow.processors.ecore;
	opens org.nasdanika.models.flow.processors.ecore; // For loading resources
	
}
