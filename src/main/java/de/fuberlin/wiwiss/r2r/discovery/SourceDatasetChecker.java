package de.fuberlin.wiwiss.r2r.discovery;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.hp.hpl.jena.query.QueryExecution;

import de.fuberlin.wiwiss.r2r.Source;

public class SourceDatasetChecker implements DatasetChecker {
	private final Source source;
	private final ConcurrentMap<String, Boolean> cache;
	
	public SourceDatasetChecker(Source source) {
		this.source = source;
		cache = new ConcurrentHashMap<String, Boolean>();
	}
	
	public boolean containsClass(String uri) {
		Boolean existent = cache.get(uri);
		if(existent==null) {
			StringBuilder query = new StringBuilder();
			query.append("SELECT ?element WHERE { ?s a <").append(uri).append("> } LIMIT 1");
			QueryExecution qe = source.executeQuery(query.toString());
			existent = qe.execSelect().hasNext();
			qe.close();
		}
		return existent;
	}

	public boolean containsProperty(String uri) {
		Boolean existent = cache.get(uri);
		if(existent==null) {
			StringBuilder query = new StringBuilder();
			query.append("SELECT ?element WHERE { ?s <").append(uri).append("> ?o} LIMIT 1");
			QueryExecution qe = source.executeQuery(query.toString());
			existent = qe.execSelect().hasNext();
			qe.close();
		}
		return existent;
	}
	
	public boolean containsTargetElement(String uri) {
		return containsProperty(uri) || containsClass(uri);
	}
}
