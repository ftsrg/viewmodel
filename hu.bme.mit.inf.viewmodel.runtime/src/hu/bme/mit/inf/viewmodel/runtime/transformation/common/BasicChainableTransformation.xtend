package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.api.ExecutionSchema
import org.eclipse.viatra.transformation.evm.api.event.EventFilter
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class BasicChainableTransformation implements IChainableTransformation {
	@Accessors(PUBLIC_GETTER) val ViatraQueryEngine queryEngine
	@Accessors(PUBLIC_GETTER) val IQueryGroup queryGroup
	@Accessors(PUBLIC_GETTER) val PrioritisedRuleGroup ruleGroup
	
	override startExecution(ExecutionSchema executionSchema) {
		queryGroup.prepare(queryEngine)
		for (rule : ruleGroup.toTransformationRuleGroup) {
			// HACK Evil casting.
			executionSchema.addRule(rule.ruleSpecification, rule.filter as EventFilter<? super IPatternMatch>)
		}
		executionSchema.startUnscheduledExecution
	}
	
}