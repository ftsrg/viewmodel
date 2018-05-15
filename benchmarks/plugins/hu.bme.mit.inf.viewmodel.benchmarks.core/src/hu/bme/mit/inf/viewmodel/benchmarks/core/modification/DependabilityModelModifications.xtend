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

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.RouteErrorModelMatcher
import java.util.Map
import org.eclipse.emf.ecore.resource.ResourceSet

class DependabilityModelModifications extends AbstractModelModifications {
	extension val DependabilityFactory = DependabilityFactory.eINSTANCE

	val DependabilityModel dependabilityModel
	val RouteErrorModelMatcher routeErrorModelMatcher

	new(long randomSeed, ResourceSet resourceSet, RailwayContainer railwayContainer,
		DependabilityModel dependabilityModel, Map<ModelModification, Integer> mix) {
		super(randomSeed, railwayContainer, mix, resourceSet)
		if (railwayContainer.eResource?.resourceSet != resourceSet) {
			throw new IllegalArgumentException("Railway container must be in the resource set.")
		}
		if (dependabilityModel.eResource?.resourceSet != resourceSet) {
			throw new IllegalArgumentException("Dependability model must be in the resource set.")
		}
		this.dependabilityModel = dependabilityModel
		routeErrorModelMatcher = RouteErrorModelMatcher.on(queryEngine)
	}

	override protected switchCreated(Switch ^switch) {
		val errorModel = createFailureRepairModel
		errorModel.railwayElement = ^switch
		dependabilityModel.errorModels += errorModel
	}

	override protected segmentCreated(Segment segment) {
		// Nothing to do.
	}

	override protected routeCreated(Route route) {
		val errorModel = createImmediateRepairModel
		errorModel.railwayElement = route
		dependabilityModel.errorModels += errorModel
	}

	override protected routeRemoved(Route route) {
		dependabilityModel.errorModels -= routeErrorModelMatcher.getAllValuesOfModel(route)
	}

}
