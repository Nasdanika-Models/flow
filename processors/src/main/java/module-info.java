module org.nasdanika.models.flow.processors {
		
	requires transitive org.nasdanika.models.flow;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.flow.processors;
	opens org.nasdanika.models.flow.processors; // For loading resources
	
}
