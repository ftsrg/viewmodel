package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import java.util.Map
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IQuerySpecification

class PreconditionQueries {
	val Map<String, PreconditionQuerySpecification> constraintQueries

	new(ViewSpecification<? extends IQuerySpecification<?>, ?> viewSpecification, TraceQueries traceQueries) {
		val builder = ImmutableMap.builder
		for (ruleSpecification : viewSpecification.ruleSpecifications.filter(ConstraintRuleSpecification)) {
			val constraintSpecification = ruleSpecification as ConstraintRuleSpecification<? extends IQuerySpecification<?>, ?>
			val preconditionQuery = new PreconditionQuerySpecification(constraintSpecification, traceQueries)
			builder.put(constraintSpecification.name, preconditionQuery)
		}
		constraintQueries = builder.build
	}

	def getQueryGroup() {
		GenericQueryGroup.of(constraintQueries.values)
	}

	def getConstraintPreconditionQuery(String ruleName) {
		val traceQuery = constraintQueries.get(ruleName)
		if (traceQuery === null) {
			throw new IllegalArgumentException("No constraint precondition query for rule " + ruleName)
		}
		traceQuery
	}

	def getConstraintPreconditionQuery(
		ConstraintRuleSpecification<? extends IQuerySpecification<?>, ?> ruleSpecification) {
		getConstraintPreconditionQuery(ruleSpecification.name)
	}
}
