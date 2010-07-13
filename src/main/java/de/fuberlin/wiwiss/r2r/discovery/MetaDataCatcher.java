package de.fuberlin.wiwiss.r2r.discovery;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import de.fuberlin.wiwiss.r2r.*;

public class MetaDataCatcher {
	ConcurrentMap<String, MappingMetaData> metaData;
	MetadataRepository repository;
	
	public MetaDataCatcher(MetadataRepository repository) {
		this.repository = repository;
		metaData = new ConcurrentHashMap<String, MappingMetaData>();
	}
	
	public MappingMetaData getMetaDataForMapping(String mappingURI) {
		if(!metaData.containsKey(mappingURI))
			metaData.putIfAbsent(mappingURI, new MappingMetaData(repository.getMappingMetaData(mappingURI)));
		return metaData.get(mappingURI);
	}
}
