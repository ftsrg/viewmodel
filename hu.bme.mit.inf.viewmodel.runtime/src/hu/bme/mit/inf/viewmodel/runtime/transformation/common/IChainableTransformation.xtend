package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.viatra.query.runtime.api.IQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

interface IChainableTransformation {
	def IQueryGroup getQueryGroup()
	
	def PrioritisedRuleGroup createRuleGroup(ViatraQueryEngine queryEngine)
}