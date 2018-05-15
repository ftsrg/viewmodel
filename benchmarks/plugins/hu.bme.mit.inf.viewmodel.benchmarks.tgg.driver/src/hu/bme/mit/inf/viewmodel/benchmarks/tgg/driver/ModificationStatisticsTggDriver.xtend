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
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModificationStatisticsAdapter

class ModificationStatisticsTggDriver extends TggDriver {

	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}

	override protected doRunExperiment() {
		loadModel()
		val sourceAdapter = new ModificationStatisticsAdapter
		sourceAdapter.target = railwayContainer
		loadTransformation()
		helper.integrateForward
		val targetAdapter = new ModificationStatisticsAdapter
		targetAdapter.target = helper.trg.eResource
		logSource("before")
		logCorr("before")
		logTarget("before")
		sourceAdapter.reset
		targetAdapter.reset
		serializeModel("before.xmi", helper.trg)
		helper.changeSrc = [applyModelModification()]
		helper.integrateForward
		logSource("after")
		logCorr("after")
		logTarget("after")
		println(targetAdapter.target === helper.trg)
		sourceAdapter.logValues(experimentContext, "modification", "source")
		targetAdapter.logValues(experimentContext, "modification", "target")
		serializeModel("after.xmi", helper.trg)
	}

}
