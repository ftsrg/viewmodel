package hu.bme.mit.inf.viewmodel.runtime.specification

import org.eclipse.xtend.lib.annotations.Data

@Data
final class VariableSpecification {
	val String name
	
	static def of(String name) {
		new VariableSpecification(name)
	}
}