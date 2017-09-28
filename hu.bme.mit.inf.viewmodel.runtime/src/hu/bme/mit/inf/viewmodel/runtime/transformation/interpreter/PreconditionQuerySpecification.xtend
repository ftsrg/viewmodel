package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.PreconditionSpecification
import java.util.List
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher

class PreconditionQuerySpecification extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {

	new(
		String name,
		List<String> argumentNames,
		List<? extends PreconditionSpecification<? extends IQuerySpecification<?>>> preconditionSpecifications,
		TraceQueries traceQueryManager
	) {
		super(new PreconditionPQuery(name, argumentNames, preconditionSpecifications, traceQueryManager))
	}

	new(ConstraintRuleSpecification<? extends IQuerySpecification<?>, ?> constraintRuleSpecification,
		TraceQueries traceQueryManager) {
		this(constraintRuleSpecification.name, constraintRuleSpecification.parameters,
			constraintRuleSpecification.preconditionSpecifications, traceQueryManager)
	}
}
