package de.fuberlin.wiwiss.r2r;

import java.util.Collection;

/**
 * Java representation of target vocabulary definition.
 * @author andreas
 *
 */
public class TargetVocabulary {
	private final String classRestriction;
	private final Collection<String> entities;
	private final boolean addMappingOfClassRestriction; 
	
	public TargetVocabulary(String classRestriction, Collection<String> entities, boolean addMappingOfClassRestriction) {
		this.classRestriction = classRestriction;
		this.entities = entities;
		this.addMappingOfClassRestriction = addMappingOfClassRestriction;
	}

	public boolean addMappingOfClassRestriction() {
		return addMappingOfClassRestriction;
	}

	public String getClassRestriction() {
		return classRestriction;
	}

	public Collection<String> getEntities() {
		return entities;
	}
}
