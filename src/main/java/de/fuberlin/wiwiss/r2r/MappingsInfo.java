package de.fuberlin.wiwiss.r2r;

import java.util.Collection;
import java.util.Map;

/*
 * This Class contains information about how mappings should be executed
 */
public class MappingsInfo {
	public final Collection<String> classRestrictionMappings;
	public final Collection<String> allMappings;
	public final Map<String, Collection<String>> restrictions;  
	
	public MappingsInfo(Collection<String> contextMappings, Collection<String> allMappings) {
		super();
		this.classRestrictionMappings = contextMappings;
		this.allMappings = allMappings;
		restrictions = null; 
	}
	
	public MappingsInfo(Collection<String> contextMappings, Collection<String> allMappings, Map<String, Collection<String>> restrictions) {
		super();
		this.classRestrictionMappings = contextMappings;
		this.allMappings = allMappings;
		this.restrictions = restrictions;
	}
	
	/*
	 * checks if a mapping is restricted to execute target patterns with a certain property
	 */
	public boolean isRestricted(String mappingUri) {
		if(restrictions==null)
			return false;
		return restrictions.get(mappingUri)!=null;
	}
	
	/*
	 * returns the restriction (URI String) of the specified mapping or null if not restricted
	 */
	public Collection<String> getRestrictions(String mappingUri) {
		if(restrictions==null)
			return null;
		return restrictions.get(mappingUri);
	}
}
