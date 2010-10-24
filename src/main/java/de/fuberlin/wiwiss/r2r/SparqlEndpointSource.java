package de.fuberlin.wiwiss.r2r;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.rdf.model.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the Source interface, wrapping a SPARQL endpoint.
 * @author andreas
 *
 */
public class SparqlEndpointSource implements Source {

	private String sparqlEndpointURI;
	private List<String> defaultGraphs = null;
	private List<String> namedGraphs = null;
	
	/**
	 * 
	 * @param endpointURI The URL of the SPARQL endpoint
	 * @param defaultGraph default graph
	 * @param namedGraphURIs a list of named graphs
	 */
	public SparqlEndpointSource(String endpointURI, String defaultGraph, List<String> namedGraphURIs) {
		this.sparqlEndpointURI = endpointURI;
		defaultGraphs = new ArrayList<String>();
		defaultGraphs.add(defaultGraph);
		namedGraphs = namedGraphURIs;
	}
	
	/**
	 * 
	 * @param endpointURI URL of the SPARQL endpoint
	 */
	public SparqlEndpointSource(String endpointURI) {
		this.sparqlEndpointURI = endpointURI;
	}
	
	/**
	 * 
	 * @param endpointURI URL of the SPARQL endpoint
	 * @param defaultGraph the default graph
	 */
	public SparqlEndpointSource(String endpointURI, String defaultGraph) {
		this.sparqlEndpointURI = endpointURI;
		defaultGraphs = new ArrayList<String>();
		defaultGraphs.add(defaultGraph);
	}
	
	public QueryExecution executeQuery(String query) {
		return QueryExecutionFactory.sparqlService(sparqlEndpointURI, query, defaultGraphs, namedGraphs);
	}

	public Model executeDescribeQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.sparqlService(sparqlEndpointURI, query, defaultGraphs, namedGraphs);
		Model model = qe.execDescribe();
		qe.close();
		return model;
	}

	public Model executeConstructQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.sparqlService(sparqlEndpointURI, query, defaultGraphs, namedGraphs);
		Model model = qe.execConstruct();
		qe.close();
		return model;
	}
}
