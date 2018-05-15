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