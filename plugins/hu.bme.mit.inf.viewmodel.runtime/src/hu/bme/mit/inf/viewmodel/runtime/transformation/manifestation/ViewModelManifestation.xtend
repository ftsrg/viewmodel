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
package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ManifestableConcreteVariableQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ManifestableEObjectConstantValueQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ManifestableJavaObjectConstantValueQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ManifestableRelationQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.BasicChainableTransformationFactory
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.CreateDeletePriority
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.PrioritisedRuleGroup
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRuleFactory
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class ViewModelManifestation extends BasicChainableTransformationFactory {
	static val MANIFESTATION_PRIORITY = CreateDeletePriority.of(20, -10)
	static val CONSTANT_MANIFESTATION_PRIORITY = CreateDeletePriority.of(19, -9)
	static val REFERENCE_PRIORITY = CreateDeletePriority.of(10, -20)

	val IManifestationTraceManager traceManager
	extension val EventDrivenTransformationRuleFactory = new EventDrivenTransformationRuleFactory

	override getQueryGroup() {
		new GenericQueryGroup(emptySet)
	}

	override createRuleGroup(ViatraQueryEngine queryEngine) {
		PrioritisedRuleGroup.of(
			MANIFESTATION_PRIORITY ->
				createRule.precondition(ManifestableConcreteVariableQuerySpecification.instance).action(
					CRUDActivationStateEnum.CREATED) [
					// println("CREATED " + rep + " : " + type.name)
					traceManager.manifestInterpretedEObject(rep, type)
				].action(CRUDActivationStateEnum.DELETED) [
					// println("DELETED " + rep + " : " + type.name)
					traceManager.removeManifestation(rep)
				].filter[traceModelId == traceManager.traceModelId].build,
			CONSTANT_MANIFESTATION_PRIORITY ->
				createRule.precondition(ManifestableEObjectConstantValueQuerySpecification.instance).action(
					CRUDActivationStateEnum.CREATED) [
					// println("CREATED " + rep + " = " + value)
					traceManager.manifestUninterpretedEObject(rep, value)
				].action(CRUDActivationStateEnum.DELETED) [
					// println("DELETED " + rep + " = " + value)
					traceManager.removeManifestation(rep)
				].filter[traceModelId == traceManager.traceModelId].build,
			CONSTANT_MANIFESTATION_PRIORITY ->
				createRule.precondition(ManifestableJavaObjectConstantValueQuerySpecification.instance).action(
					CRUDActivationStateEnum.CREATED) [
					// println("CREATED " + rep + " = " + value)
					traceManager.manifestPrimitive(rep, value)
				].action(CRUDActivationStateEnum.DELETED) [
					// println("DELETED " + rep + " = " + value)
					traceManager.removeManifestation(rep)
				].filter[traceModelId == traceManager.traceModelId].build,
			REFERENCE_PRIORITY ->
				createRule.precondition(ManifestableRelationQuerySpecification.instance).action(
					CRUDActivationStateEnum.CREATED) [
					// println("CREATED " + leftManifestation + " -[" + relation.name + "]-> " + rightManifestation)
					traceManager.setRelation(leftManifestation, rightManifestation, relation)
				].action(CRUDActivationStateEnum.DELETED) [
					// println("DELETED " + leftManifestation + " -[" + relation.name + "]-> " + rightManifestation)
					traceManager.unsetRelation(leftManifestation, rightManifestation, relation)
				].filter[traceModelId == traceManager.traceModelId].build
		)
	}
}
