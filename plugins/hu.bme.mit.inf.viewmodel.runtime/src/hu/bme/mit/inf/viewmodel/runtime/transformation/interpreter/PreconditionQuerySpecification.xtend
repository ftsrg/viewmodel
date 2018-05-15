/********************************************************************************
 * Copyright (c) 2018 Contributors to the ViewModel project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-1.0
 ********************************************************************************/
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
