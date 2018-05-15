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

import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModificationStatisticsAdapter
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation.ManifestationTraceManager
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.Accessors

class ModificationStatisticsTraceManager extends ManifestationTraceManager {
	@Accessors val adapter = new ModificationStatisticsAdapter

	new(LogicModel logicModel) {
		super(logicModel)
	}

	new(Resource resource, LogicModel logicModel) {
		super(resource, logicModel)
	}

	protected override doManifestInterpretedEObject(Cluster cluster, EClass type) {
		val manifestedEObject = type.EPackage.EFactoryInstance.create(type)
		adapter.addAdapter(manifestedEObject)
		manifestationTrace.results += manifestedEObject
		cluster.manifestation = createInterpretedManifestation => [
			it.manifestedEObject = manifestedEObject
			it.type = type
		]
	}

	protected override doRemoveInterpretedManifestation(InterpretedManifestation manifestation) {
		super.doRemoveInterpretedManifestation(manifestation)
		val eObject = manifestation.manifestedEObject
		if (eObject.eAdapters.contains(adapter)) {
			adapter.removeAdapter(eObject)
		}
	}
}
