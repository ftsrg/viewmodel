package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.viatra.query.runtime.api.IQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

abstract class BasicChainableTransformationFactory implements IChainableTransformationFactory {
	
	override createTransformation(ViatraQueryEngine queryEngine) {
		val ruleGroup = createRuleGroup(queryEngine)
		new BasicChainableTransformation(queryEngine, queryGroup, ruleGroup)
	}
	
	protected abstract def IQueryGroup getQueryGroup()
	
	protected abstract def PrioritisedRuleGroup createRuleGroup(ViatraQueryEngine queryEngine)
}