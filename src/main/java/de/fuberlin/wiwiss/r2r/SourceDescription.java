package de.fuberlin.wiwiss.r2r;

public class SourceDescription {
	private String sourceDataset;
	private String sparqlEndpoint;
	private String defaultGraph;
	
	public SourceDescription(String sourceDataset, String sparqlEndpoint,
			String defaultGraph) {
		super();
		this.sourceDataset = sourceDataset;
		this.sparqlEndpoint = sparqlEndpoint;
		this.defaultGraph = defaultGraph;
	}

	public String getSourceDataset() {
		return sourceDataset;
	}

	public String getSparqlEndpoint() {
		return sparqlEndpoint;
	}

	public String getDefaultGraph() {
		return defaultGraph;
	}
}
