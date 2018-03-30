package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.viatra.query.runtime.api.IQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.api.ExecutionSchema

interface IChainableTransformation {
	def ViatraQueryEngine getQueryEngine()

	def IQueryGroup getQueryGroup()
	
	def PrioritisedRuleGroup getRuleGroup()
	
	def getConflictResolver() {
		ruleGroup.toConflictResolver
	}
	
	def void startExecution(ExecutionSchema executionSchema)
}