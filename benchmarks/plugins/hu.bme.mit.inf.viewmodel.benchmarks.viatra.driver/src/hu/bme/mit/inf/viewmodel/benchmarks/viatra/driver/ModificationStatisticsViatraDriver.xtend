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
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModificationStatisticsAdapter
import hu.bme.mit.inf.viewmodel.runtime.utils.NullScheduler

class ModificationStatisticsViatraDriver extends ViatraDriver {

	new(ExperimentContext experimentContext, PreconditionStyle preconditionStyle) {
		super(experimentContext, preconditionStyle)
	}

	override protected doRunExperiment() {
		loadModel()
		val sourceAdapter = new ModificationStatisticsAdapter
		sourceAdapter.target = railwayContainer
		loadTransformation()
		transformation.createQueryEngine()
		transformation.createTransformation(NullScheduler.factory)
		val targetAdapter = new ModificationStatisticsAdapter
		transformation.startUnscheduledExecution
		targetAdapter.target = transformation.targetResource
		logSource("before")
		logTrace("before")
		logTarget("before")
		sourceAdapter.reset()
		targetAdapter.reset()
		serializeModel("before.xmi", transformation.targetResource.contents)
		applyModelModification()
		logSource("after")
		transformation.startUnscheduledExecution
		logTrace("after")
		logTarget("after")
		sourceAdapter.logValues(experimentContext, "modification", "source")
		targetAdapter.logValues(experimentContext, "modification", "target")
		serializeModel("after.xmi", transformation.targetResource.contents)
	}

}
