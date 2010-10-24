package de.fuberlin.wiwiss.r2r;

import com.hp.hpl.jena.query.QueryExecution;
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
	
	public QueryExecution executeQuery(String query) {
		return QueryExecutionFactory.create(query, model);
	}

	public Model executeDescribeQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		Model model = qe.execDescribe();
		qe.close();
		return model;
	}

	public Model executeConstructQuery(String query) {
		QueryExecution qe = QueryExecutionFactory.create(query, model);
		Model model = qe.execConstruct();
		qe.close();
		return model;
	}
}
