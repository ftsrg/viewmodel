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
package hu.bme.mit.inf.viewmodel.runtime.transformation

import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.viatraquery.QuerySpecificationTemplateParser
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.ChainableTransformations
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.TransformationChain
import hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter.LogicModelManager
import hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter.ViewModelTraceManager
import hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter.ViewModelTransformation
import hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation.ManifestationTraceManager
import hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation.ViewModelManifestation
import hu.bme.mit.inf.viewmodel.runtime.utils.BadlyBehavingFeatureUtils
import hu.bme.mit.inf.viewmodel.runtime.utils.EmfScopeUtils
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.evm.api.ExecutionSchema
import org.eclipse.xtend.lib.annotations.Accessors

class ViewModel {
	@Accessors(PUBLIC_GETTER) val ViatraQueryEngine queryEngine
	val ViewModelTraceManager viewModelTraceManager
	val LogicModelManager logicModelManager
	val ManifestationTraceManager manifestationTraceManager
	@Accessors(PUBLIC_GETTER) val ExecutionSchema executionSchema

	def getViewModelTrace() {
		viewModelTraceManager.traceModel
	}

	def getLogicModel() {
		logicModelManager.logicModel
	}
	
	def getResults() {
		manifestationTraceManager.results
	}

	new(ViatraQueryEngine queryEngine, ViewSpecification<? extends IQuerySpecification<?>, Void> viewSpecification) {
		BadlyBehavingFeatureUtils.registerEcorePackageAsWellBehaving()
		this.queryEngine = queryEngine
		val traceResource = EmfScopeUtils.getTraceModelResource(queryEngine)
		EmfScopeUtils.addMetamodelsToScope(queryEngine, viewSpecification.requiredMetamodels)
		logicModelManager = new LogicModelManager(traceResource)
		val logicModel = logicModelManager.logicModel
		viewModelTraceManager = new ViewModelTraceManager(traceResource, logicModel)
		manifestationTraceManager = new ManifestationTraceManager(traceResource, logicModel)
		val viewModelTransformation = new ViewModelTransformation(viewSpecification, viewModelTraceManager,
			logicModelManager)
		val viewModelManifestation = new ViewModelManifestation(manifestationTraceManager)
		val transformationChain = TransformationChain.of(viewModelTransformation, viewModelManifestation)
		executionSchema = ChainableTransformations.createExecutionSchema(queryEngine, transformationChain)
	}
	
	def startUnscheduledExecution() {
		executionSchema.startUnscheduledExecution
	}
	
	def dispose() {
		executionSchema.dispose
	}

	static def create(ViatraQueryEngine queryEngine,
		ViewSpecification<? extends IQuerySpecification<?>, ? extends IQuerySpecification<?>> viewSpecification) {
		val parsedSpecification = QuerySpecificationTemplateParser.parse(viewSpecification)
		new ViewModel(queryEngine, parsedSpecification)
	}
	
	static def create(Notifier notifier,
		ViewSpecification<? extends IQuerySpecification<?>, ? extends IQuerySpecification<?>> viewSpecification) {
		val queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(notifier))
		create(queryEngine, viewSpecification)
	}
}
