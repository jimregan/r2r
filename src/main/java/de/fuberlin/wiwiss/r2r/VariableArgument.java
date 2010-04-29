package de.fuberlin.wiwiss.r2r;


public class VariableArgument implements Argument {
	private final String variableName;

	public VariableArgument(String variableName) {
		super();
		this.variableName = variableName;
	}

	public String getVariableName() {
		return variableName;
	}	
}
