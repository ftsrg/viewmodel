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
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class DependabiltyModelGenerator {
	extension DependabilityFactory = DependabilityFactory.eINSTANCE

	val ResourceSet resourceSet
	val Resource railwayModelResource
	val Resource dependabilityModelResource
	val dependabilityModel = createDependabilityModel

	new(URI railwayModelUri, URI dependabilityModelUri) {
		resourceSet = new ResourceSetImpl
		railwayModelResource = resourceSet.getResource(railwayModelUri, true)
		dependabilityModelResource = resourceSet.createResource(dependabilityModelUri)
		dependabilityModelResource.contents += dependabilityModel
	}

	def createErrorModels() {
		val iterator = railwayModelResource.allContents
		while (iterator.hasNext) {
			val eObject = iterator.next
			createErrorModel(eObject)
		}
		dependabilityModelResource.save(emptyMap)
	}

	protected def createErrorModel(EObject eObj) {
		switch (eObj) {
			Route:
				dependabilityModel.errorModels += createImmediateRepairModel => [railwayElement = eObj]
			Switch,
			Semaphore,
			Sensor:
				dependabilityModel.errorModels += createFailureRepairModel => [railwayElement = eObj]
			default: {
				// Nothing to do.
			}
		}
	}
}
