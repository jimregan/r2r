package de.fuberlin.wiwiss.r2r;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.shared.NotFoundException;
import com.hp.hpl.jena.util.FileManager;

/**
 * Implementation of the Source Interface which reads a file or URI resource into memory.
 * @author andreas
 *
 */
public class FileOrURISource implements Source {

	private Model model;
	
	/**
	 * 
	 * @param fileOrURI A file name or a URI.
	 */
	public FileOrURISource(String fileOrURI) throws NotFoundException {
		FileManager fileManager = FileManager.get();
		model = fileManager.loadModel(fileOrURI);
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
