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