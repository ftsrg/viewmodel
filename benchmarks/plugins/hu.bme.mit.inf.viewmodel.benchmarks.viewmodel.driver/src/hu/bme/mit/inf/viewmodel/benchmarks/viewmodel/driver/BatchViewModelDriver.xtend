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

class BatchViewModelDriver extends ViewModelDriver {
	
	new(ExperimentContext experimentContext, ManifestationMode manifestationMode) {
		super(experimentContext, manifestationMode)
	}
	
	override protected doRunExperiment() {
		stopwatch("modelLoad") [
			loadModel()
			applyModelModification()
		]
		logSource("batch")
		gcBarrier
		stopwatch("modelQuery") [
			createQueryEngine()
		]
		stopwatch("transformInit") [
			initTransformation()
		]
		stopwatch("s2ptRete") [
			viewTransformation.queryGroup.prepare(queryEngine)
		]
		stopwatch("s2ptExecute") [
			viewTransformation.startExecution(executionSchema)
		]
		logLogicModel("batch")
		logViewModelTrace("batch")
		gcBarrier
		stopwatch("pt2tRete") [
			manifestationTransformation.queryGroup.prepare(queryEngine)
		]
		stopwatch("pt2tExecute") [
			manifestationTransformation.startExecution(executionSchema)
		]
		logManifestationTrace("batch")
		logTarget("batch")
		serializeModel("batch.xmi", manifestationManager.results)
	}
	
}