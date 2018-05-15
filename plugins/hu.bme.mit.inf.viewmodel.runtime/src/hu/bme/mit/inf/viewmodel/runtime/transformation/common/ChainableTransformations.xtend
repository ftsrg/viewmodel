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

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.ExecutionSchemas
import org.eclipse.viatra.transformation.evm.specific.Schedulers

final class ChainableTransformations {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def createExecutionSchema(ViatraQueryEngine queryEngine, IChainableTransformationFactory transformationFactory) {
		val transformation = transformationFactory.createTransformation(queryEngine)
		val schedulerFactory = Schedulers.getQueryEngineSchedulerFactory(queryEngine)
		val conflictResolver = transformation.conflictResolver
		val executionSchema = ExecutionSchemas.createViatraQueryExecutionSchema(queryEngine, schedulerFactory, conflictResolver)
		transformation.startExecution(executionSchema)
		executionSchema
	}
}
