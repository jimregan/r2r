package de.fuberlin.wiwiss.r2r.discovery;

import java.util.Set;
import java.util.Map;

/**
 * A class holding mapping meta data
 * @author andreas
 *
 */
public class MappingMetaData {
	Map<String, Set<String>> metaData;
	
	public MappingMetaData(Map<String, Set<String>> data) {
		this.metaData = data;
	}
	
	/**
	 * get the lexical values of the specified property
	 * @param property the property URI
	 * @return lexical property values
	 */
	public Set<String> getValuesForProperty(String property) {
		return metaData.get(property);
	}
}
