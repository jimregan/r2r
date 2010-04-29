package de.fuberlin.wiwiss.r2r;

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
