package hu.bme.mit.inf.viewmodel.benchmarks.core.configuration;

import com.google.gson.annotations.SerializedName;

public enum TransformationCase {
	@SerializedName("petriNet")
	PETRI_NET("petriNet"),

	@SerializedName("virtualSwitch")
	VIRTUAL_SWITCH("virtualSwitch"),
	
	@SerializedName("dependability")
	DEPENDABILITY("dependability");

	private final String name;
	
	private TransformationCase(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}