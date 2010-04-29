package de.fuberlin.wiwiss.r2r;

import java.util.List;

/**
 * A Java representation of a target vocabulary definition.
 * @author andreas
 *
 */
public interface TargetSchema {
	public List<String> getClassList();
	
	public List<String> getPropertyList(String classUri);
}
