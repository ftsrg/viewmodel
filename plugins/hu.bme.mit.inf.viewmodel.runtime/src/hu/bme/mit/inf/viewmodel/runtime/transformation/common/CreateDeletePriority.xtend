package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.xtend.lib.annotations.Data

@Data
class CreateDeletePriority {
	public static val DEFAULT = CreateDeletePriority.of(0)
	
	val int createPriority
	val int deletePriority
	
	def getMin() {
		Math.min(createPriority, deletePriority)
	}
	
	def getMax() {
		Math.max(createPriority, deletePriority)
	}
	
	def operator_plus(int i) {
		new CreateDeletePriority(createPriority + i, deletePriority + i)
	}
	
	static def of(int createPriority, int deletePriority) {
		new CreateDeletePriority(createPriority, deletePriority)	
	}
	
	static def of(int priority) {
		of(priority, priority)
	}
}