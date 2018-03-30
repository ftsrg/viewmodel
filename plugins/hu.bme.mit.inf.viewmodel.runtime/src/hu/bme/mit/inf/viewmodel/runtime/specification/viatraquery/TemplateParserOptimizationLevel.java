package hu.bme.mit.inf.viewmodel.runtime.specification.viatraquery;

public enum TemplateParserOptimizationLevel {
	NONE(false, false),
	FLATTEN(true, false),
	FLATTEN_IMPLIED(true, true);
	
	private final boolean flattenAndNormalize;
	private final boolean calculateImpliedTypes;
	
	private TemplateParserOptimizationLevel(boolean flattenAndNormalize, boolean calculateImpliedTypes) {
		this.flattenAndNormalize = flattenAndNormalize;
		this.calculateImpliedTypes = calculateImpliedTypes;
	}

	public boolean isFlattenAndNormalize() {
		return flattenAndNormalize;
	}

	public boolean isCalculateImpliedTypes() {
		return calculateImpliedTypes;
	}	
}
