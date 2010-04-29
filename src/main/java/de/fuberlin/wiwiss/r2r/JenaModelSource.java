package de.fuberlin.wiwiss.r2r;

import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * Implementation of the Source interface which wraps a Jena Model.
 * @author andreas
 *
 */
public class JenaModelSource implements Source {
	private Model model;

	/**
	 * 
	 * @param model The Jena Model
	 */
	public JenaModelSource(Model model) {
		this.model = model;
	}
	
	public ResultSet executeSelectQuery(String query) {
		return QueryExecutionFactory.create(query, model).execSelect();
	}
	
	public Model executeDescribeQuery(String query) {
		return QueryExecutionFactory.create(query, model).execDescribe();
	}
	
	public Model executeConstructQuery(String query) {
		return QueryExecutionFactory.create(query, model).execConstruct();
	}
}
