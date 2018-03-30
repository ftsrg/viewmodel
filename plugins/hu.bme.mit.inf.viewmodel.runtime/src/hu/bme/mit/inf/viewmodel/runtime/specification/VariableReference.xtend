package hu.bme.mit.inf.viewmodel.runtime.specification

import org.eclipse.xtend.lib.annotations.Data

abstract class VariableReference {
	package new() {
	}
}

@Data
final class LookupVariableReference extends VariableReference {
	val String lookupName
	val String variableName

	static def of(String lookupName, String variableName) {
		new LookupVariableReference(lookupName, variableName)
	}
}

@Data
final class LocalVariableReference extends VariableReference {
	val String variableName

	static def of(String variableName) {
		new LocalVariableReference(variableName)
	}
}
