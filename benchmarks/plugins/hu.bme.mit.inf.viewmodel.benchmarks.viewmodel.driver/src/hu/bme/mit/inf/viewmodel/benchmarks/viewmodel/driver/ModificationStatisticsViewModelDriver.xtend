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
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModificationStatisticsAdapter
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import org.eclipse.emf.ecore.resource.Resource

class ModificationStatisticsViewModelDriver extends ViewModelDriver {

	ModificationStatisticsAdapter targetAdapter

	new(ExperimentContext experimentContext) {
		super(experimentContext, ManifestationMode.PHYSICAL)
	}

	override protected doRunExperiment() {
		loadModel()
		val sourceAdapter = new ModificationStatisticsAdapter
		sourceAdapter.target = railwayContainer
		createQueryEngine()
		initTransformation()
		chainedTransformation.startExecution(executionSchema)
		logSource("before")
		logLogicModel("before")
		logViewModelTrace("before")
		logManifestationTrace("before")
		logTarget("before")
		sourceAdapter.reset
		targetAdapter.reset
		serializeModel("before.xmi", manifestationManager.results)
		applyModelModification()
		executionSchema.startUnscheduledExecution
		logLogicModel("after")
		logViewModelTrace("after")
		logManifestationTrace("after")
		logTarget("after")
		sourceAdapter.logValues(experimentContext, "modification", "source")
		targetAdapter.logValues(experimentContext, "modification", "target")
		serializeModel("after.xmi", manifestationManager.results)
	}

	override protected getBaseManifestationManager(Resource resource, LogicModel logicModel) {
		val manager = new ModificationStatisticsTraceManager(resource, logicModel)
		targetAdapter = manager.adapter
		manager
	}

}
