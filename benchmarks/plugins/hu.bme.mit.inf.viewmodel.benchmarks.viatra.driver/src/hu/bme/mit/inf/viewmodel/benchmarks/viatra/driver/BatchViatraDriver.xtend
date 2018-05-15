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
package hu.bme.mit.inf.viewmodel.benchmarks.viatra.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.runtime.utils.NullScheduler

class BatchViatraDriver extends ViatraDriver {
	
	new(ExperimentContext experimentContext, PreconditionStyle preconditionStyle) {
		super(experimentContext, preconditionStyle)
	}
	
	override protected doRunExperiment() {
		stopwatch("modelLoad") [
			loadModel()
			applyModelModification()
		]
		logSource("batch")
		gcBarrier
		stopwatch("modelQuery") [
			loadTransformation()
			transformation.createQueryEngine()
		]
		stopwatch("transformInit") [
			transformation.createTransformation(NullScheduler.factory)
		]
		stopwatch("execute") [
			transformation.startUnscheduledExecution
		]
		logTrace("batch")
		logTarget("batch")
		serializeModel("batch.xmi", transformation.targetResource.contents)
	}
	
}