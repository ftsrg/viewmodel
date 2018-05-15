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
package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext

class IncrementalViewModelDriver extends ViewModelDriver {
	
	new(ExperimentContext experimentContext, ManifestationMode manifestationMode) {
		super(experimentContext, manifestationMode)
	}
	
	override protected doRunExperiment() {
		stopwatch("batchTransform") [
			loadModel()
			createQueryEngine()
			initTransformation()
			chainedTransformation.startExecution(executionSchema)
		]
		logSource("before")
		logLogicModel("before")
		logViewModelTrace("before")
		logManifestationTrace("before")
		logTarget("before")
		serializeModel("before.xmi", manifestationManager.results)
		gcBarrier
		stopwatch("modelModification") [
			applyModelModification()
		]
		logSource("after")
		gcBarrier
		stopwatch("synchronization") [
			executionSchema.startUnscheduledExecution
		]
		logLogicModel("after")
		logViewModelTrace("after")
		logManifestationTrace("after")
		logTarget("after")
		serializeModel("after.xmi", manifestationManager.results)
	}
}