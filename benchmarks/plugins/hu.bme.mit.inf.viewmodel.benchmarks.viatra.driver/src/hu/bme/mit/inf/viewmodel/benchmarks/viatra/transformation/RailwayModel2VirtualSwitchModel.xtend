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
package hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace
import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewFactory
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.VirtualSwitchTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.ConnectedSwitchesTracedQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.CountConnectedInFailureTracedQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.virtualswitchview.util.VirtualSwitchesQuerySpecification
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.EventDrivenTransformationRuleGroup
import org.eclipse.xtend.lib.annotations.Accessors

class RailwayModel2VirtualSwitchModel extends HandCodedTransformation {
	@Accessors(PUBLIC_GETTER) Railway2VirtualSwitchViewTrace traceModel

	VirtualSwitchTraceMatcher virtualSwitchTracedMatcher

	new(RailwayContainer railwayContainer, ResourceSet resourceSet) {
		super(railwayContainer, resourceSet)
	}

	protected override createTraceModel(RailwayContainer railwayContainer) {
		traceModel = Railway2VirtualSwitchViewFactory.eINSTANCE.createRailway2VirtualSwitchViewTrace => [
			source = railwayContainer
		]
	}

	override getTraceLinkCount() {
		traceModel.traceLinks.size
	}

	protected override getQueryGroup() {
		GenericQueryGroup.of(
			VirtualSwitchesQuerySpecification.instance,
			ConnectedSwitchesTracedQuerySpecification.instance,
			CountConnectedInFailureTracedQuerySpecification.instance
		)
	}

	protected override createMatchers(ViatraQueryEngine queryEngine) {
		virtualSwitchTracedMatcher = VirtualSwitchTraceMatcher.on(queryEngine)
	}

	override protected createRules() {
		// Rules are created in getTransformationRuleGroup
	}

	protected override getTransformationRuleGroup() {
		extension val VirtualSwitchViewFactory = VirtualSwitchViewFactory.eINSTANCE
		extension val Railway2VirtualSwitchViewFactory = Railway2VirtualSwitchViewFactory.eINSTANCE

		val virtualSwitchRule = createRule.precondition(VirtualSwitchesQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val virtualSwitch = createVirtualSwitch
			val traceLink = createSwitch2VirtualSwitch
			traceLink.^switch = ^switch
			traceLink.virtualSwitch = virtualSwitch
			traceModel.traceLinks += traceLink
			targetResource.contents += virtualSwitch
		].action(CRUDActivationStateEnum.DELETED) [
			for (traceLink : virtualSwitchTracedMatcher.getAllValuesOfTraceLink(traceModel, ^switch)) {
				traceModel.traceLinks -= traceLink
				targetResource.contents -= traceLink.virtualSwitch
			}
		].build

		val connectedSwitchesRule = createRule.precondition(ConnectedSwitchesTracedQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			virtualLeft.connectedTo += virtualRight
		].action(CRUDActivationStateEnum.DELETED) [
			virtualLeft.connectedTo -= virtualRight
		].build

		val countConnectedInFailureRule = createRule.precondition(
			CountConnectedInFailureTracedQuerySpecification.instance).action(CRUDActivationStateEnum.CREATED) [
			virtualSwitch.countConnectedInFailure = n
		].build

		new EventDrivenTransformationRuleGroup(virtualSwitchRule, connectedSwitchesRule, countConnectedInFailureRule)
	}
}
