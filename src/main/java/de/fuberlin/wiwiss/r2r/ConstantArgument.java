package de.fuberlin.wiwiss.r2r;

public class ConstantArgument implements Argument {
	private final ConstantType type;
	private final String value;
	
	public ConstantArgument(ConstantType type, String value) {
		this.type = type;
		this.value = value;
	}

	public ConstantType getType() {
		return type;
	}

	public String getValue() {
		return value;
	}


}

