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
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext

class IncrementalTggDriver extends TggDriver {
	
	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}
	
	override protected doRunExperiment() {
		stopwatch("batchTransform") [
			loadModel()
			loadTransformation()
			helper.integrateForward
		]
		logSource("before")
		logCorr("before")
		logTarget("before")
		serializeModel("before.xmi", helper.trg)
		gcBarrier
		stopwatch("modifySynchronize") [
			helper.changeSrc = [applyModelModification()]
			helper.integrateForward
		]
		logSource("after")
		logCorr("after")
		logTarget("after")
		serializeModel("after.xmi", helper.trg)
	}
	
}