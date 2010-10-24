package de.fuberlin.wiwiss.r2r;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * The Source interface wraps different source dataset representations.
 * @author andreas
 *
 */
public interface Source {
	/**
	 * Execute a query against this Source object
	 * @param query SPARQL query
	 * @return Jena QueryExecution
	 */
	public QueryExecution executeQuery(String query);
	
	public Model executeDescribeQuery(String query);
	
	public Model executeConstructQuery(String query);
}
