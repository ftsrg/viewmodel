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
package hu.bme.mit.inf.viewmodel.benchmarks.core.modification

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch
import java.util.Map

class ModelModifications extends AbstractModelModifications {
	
	new(long randomSeed, RailwayContainer railwayContainer, Map<ModelModification, Integer> mix) {
		super(randomSeed, railwayContainer, mix, railwayContainer)
	}
	
	override protected switchCreated(Switch ^switch) {
		// Nothing to do.
	}
	
	override protected segmentCreated(Segment segment) {
		// Nothing to do.
	}
	
	override protected routeCreated(Route route) {
		// Nothing to do.
	}
	
	override protected routeRemoved(Route route) {
		// Nothing to do.
	}
	
}