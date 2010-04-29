package de.fuberlin.wiwiss.r2r;

import java.util.Map;
import java.util.HashMap;

public class SimpleMappingCache {
	private MappingRepository repository;
	private Map<String, Mapping> cache;
	
	public SimpleMappingCache(MappingRepository repository) {
		this.repository = repository;
		cache = new HashMap<String, Mapping>();
	}
	
	public Mapping getMapping(String mappingURI) {
		if(cache.containsKey(mappingURI))
			return cache.get(mappingURI);
		
		Mapping mapping = repository.getMappingOfUri(mappingURI);
		cache.put(mappingURI, mapping);
		return mapping;
	}
}
