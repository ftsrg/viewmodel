package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.api.event.EventFilter
import org.eclipse.viatra.transformation.evm.specific.ExecutionSchemas
import org.eclipse.viatra.transformation.evm.specific.Schedulers

final class ChainableTransformations {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def createExecutionSchema(ViatraQueryEngine queryEngine, IChainableTransformation transformation) {
		transformation.queryGroup.prepare(queryEngine)
		val prioritisedRuleGroup = transformation.createRuleGroup(queryEngine)
		val schedulerFactory = Schedulers.getQueryEngineSchedulerFactory(queryEngine)
		val conflictResolver = prioritisedRuleGroup.toConflictResolver
		val executionSchema = ExecutionSchemas.createViatraQueryExecutionSchema(queryEngine, schedulerFactory, conflictResolver)
		for (rule : prioritisedRuleGroup.toTransformationRuleGroup) {
			// HACK Evil casting.
			executionSchema.addRule(rule.ruleSpecification, rule.filter as EventFilter<? super IPatternMatch>)
		}
		executionSchema
	}
}
