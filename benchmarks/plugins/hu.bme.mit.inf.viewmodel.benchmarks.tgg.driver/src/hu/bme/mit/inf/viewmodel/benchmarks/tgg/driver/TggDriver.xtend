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
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.ExperimentDriver
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper

abstract class TggDriver extends ExperimentDriver {
	protected SynchronizationHelper helper

	new(ExperimentContext experimentContext) {
		super(experimentContext)
	}

	protected def void loadTransformation() {
		val corrPackage = switch (transformationCase) {
			case PETRI_NET: StochasticpetrinetPackage.eINSTANCE
			default: throw new IllegalArgumentException("Unknown transformation case: " + transformationCase)
		}
		helper = new PlatformPluginSynchronizationHelper(corrPackage, resourceSet)
		helper.src = railwayContainer
	}

	protected def logCorr(String checkpoint) {
		val corrSize = helper.corr.correspondences.size
		logValue(checkpoint, "corr", "count", corrSize)
	}

	protected def logTarget(String checkpoint) {
		logValue(checkpoint, "target", "rootCount", 1)
		logModelStatistics(checkpoint, "target", helper.trg)
	}
}
