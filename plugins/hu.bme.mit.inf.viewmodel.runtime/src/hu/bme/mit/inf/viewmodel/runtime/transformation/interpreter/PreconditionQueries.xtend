package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import java.util.List
import java.util.Map
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IQuerySpecification

class PreconditionQueries {
	val List<IQuerySpecification<?>> variableInstantiationQueries
	val Map<String, PreconditionQuerySpecification> constraintQueries

	new(ViewSpecification<? extends IQuerySpecification<?>, ?> viewSpecification, TraceQueries traceQueries) {
		val variableInstantiationBuilder = ImmutableList.builder
		val constraintBuilder = ImmutableMap.builder
		for (ruleSpecification : viewSpecification.ruleSpecifications) {
			switch (ruleSpecification) {
				VariableInstantiationRuleSpecification<? extends IQuerySpecification<?>, ?>:
					variableInstantiationBuilder.add(ruleSpecification.preconditionPattern)
				ConstraintRuleSpecification<? extends IQuerySpecification<?>, ?>: {
					val preconditionQuery = new PreconditionQuerySpecification(ruleSpecification, traceQueries)
					constraintBuilder.put(ruleSpecification.name, preconditionQuery)
				}
				default: {
					// Nothing to do.
				}
			}
		}
		variableInstantiationQueries = variableInstantiationBuilder.build
		constraintQueries = constraintBuilder.build
	}

	def getQueryGroup() {
		GenericQueryGroup.of(variableInstantiationQueries + constraintQueries.values)
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
