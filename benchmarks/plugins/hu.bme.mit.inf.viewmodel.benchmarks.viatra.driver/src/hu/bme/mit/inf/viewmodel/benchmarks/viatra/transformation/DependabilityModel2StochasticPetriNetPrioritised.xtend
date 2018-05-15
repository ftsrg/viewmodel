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

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.FailureRepairModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ImmediateRepairModel
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.ErrorModelTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.RailwayContainerTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.RequiredElementConnectionTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.ErrorModelTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.NotTracedErrorModelQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.NotTracedFailedErrorModelQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.NotTracedRouteRequiredElementInRailwayModelQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.RailwayContainerTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.RequiredElementConnectionTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.dependability.util.RouteRequiresElementInRailwayModelQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwayContainerQuerySpecification
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.evm.specific.resolver.InvertedDisappearancePriorityConflictResolver
import org.eclipse.viatra.transformation.runtime.emf.rules.EventDrivenTransformationRuleGroup
import org.eclipse.viatra.transformation.runtime.emf.rules.eventdriven.EventDrivenTransformationRule

class DependabilityModel2StochasticPetriNetPrioritised extends HandCodedTransformation {

	val DependabilityModel dependabilityModel

	Dependability2StochasticPetriNetTrace traceModel

	RailwayContainerTraceMatcher railwayContainerTraceMatcher
	ErrorModelTraceMatcher errorModelTraceMatcher
	RequiredElementConnectionTraceMatcher requiredElementConnectionTraceMatcher

	EventDrivenTransformationRule<?, ?> railwayContainerRule
	EventDrivenTransformationRule<?, ?> errorModelRule
	EventDrivenTransformationRule<?, ?> failedErrorModelRule
	EventDrivenTransformationRule<?, ?> connectionRule

	new(RailwayContainer railwayContainer, DependabilityModel dependabilityModel, ResourceSet resourceSet) {
		super(railwayContainer, resourceSet)
		this.dependabilityModel = dependabilityModel
		traceModel.dependabilityModel = dependabilityModel
	}

	override protected createTraceModel(RailwayContainer railwayContainer) {
		traceModel = Dependability2StochasticPetriNetFactory.eINSTANCE.createDependability2StochasticPetriNetTrace => [
			it.railwayContainer = railwayContainer
		]
	}

	override getTraceLinkCount() {
		traceModel.traceLinks.size
	}

	override protected getQueryGroup() {
		GenericQueryGroup.of(
			RailwayContainerQuerySpecification.instance,
			NotTracedErrorModelQuerySpecification.instance,
			NotTracedFailedErrorModelQuerySpecification.instance,
			RouteRequiresElementInRailwayModelQuerySpecification.instance
		)
	}

	override protected createMatchers(ViatraQueryEngine queryEngine) {
		GenericQueryGroup.of(RailwayContainerTraceQuerySpecification.instance,
			ErrorModelTraceQuerySpecification.instance, RequiredElementConnectionTraceQuerySpecification.instance).
			prepare(queryEngine)
		railwayContainerTraceMatcher = RailwayContainerTraceMatcher.on(queryEngine)
		errorModelTraceMatcher = ErrorModelTraceMatcher.on(queryEngine)
		requiredElementConnectionTraceMatcher = RequiredElementConnectionTraceMatcher.on(queryEngine)
	}

	override protected def createRules() {
		extension val StochasticPetriNetFactory = StochasticPetriNetFactory.eINSTANCE
		extension val Dependability2StochasticPetriNetFactory = Dependability2StochasticPetriNetFactory.eINSTANCE

		railwayContainerRule = createRule.precondition(RailwayContainerQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val petriNet = createPetriNet
			val traceLink = createRailwayContainer2PetriNet
			traceLink.railwayContainer = container
			traceLink.petriNet = petriNet
			targetResource.contents += petriNet
			traceModel.traceLinks += traceLink
		].action(CRUDActivationStateEnum.DELETED) [
			for (traceLink : railwayContainerTraceMatcher.getAllValuesOfTraceLink(traceModel, container)) {
				targetResource.contents -= traceLink.petriNet
				traceModel.traceLinks -= traceLink
			}
		].build

		errorModelRule = createRule.precondition(NotTracedErrorModelQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val petriNet = getPetriNet(container)
			val traceLink = createErrorModel2PetriNetModule
			traceLink.errorModel = model
			val up = createPlace => [tokens = 1]
			val down = createPlace
			traceLink.up = up
			traceLink.down = down
			var Transition repair
			switch (model) {
				FailureRepairModel: {
					val fail = createTimedTransition
					traceLink.nodes += fail
					traceLink.arcs += createArc(up, fail)
					traceLink.arcs += createArc(fail, down)
					repair = createTimedTransition
				}
				ImmediateRepairModel: {
					repair = createImmediateTransition
				}
				default:
					throw new IllegalArgumentException("Unknown ErrorModel: " + model)
			}
			traceLink.repair = repair
			traceLink.nodes += #[up, down, repair]
			petriNet.nodes += traceLink.nodes
			traceLink.arcs += createArc(down, repair)
			traceLink.arcs += createArc(repair, up)
			traceModel.traceLinks += traceLink
		].action(CRUDActivationStateEnum.DELETED) [
			for (traceLink : errorModelTraceMatcher.getAllValuesOfTraceLink(traceModel, model)) {
				removePetriNetModule(getPetriNet(container), traceLink)
			}
		].build

		failedErrorModelRule = createRule.precondition(NotTracedFailedErrorModelQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val traceLink = getErrorModelTrace(model)
			traceLink.up.tokens = 0
			traceLink.down.tokens = 1
		].action(CRUDActivationStateEnum.DELETED) [
			val traceLink = getErrorModelTrace(model)
			traceLink.up.tokens = 1
			traceLink.down.tokens = 0
		].build

		connectionRule = createRule.precondition(
			NotTracedRouteRequiredElementInRailwayModelQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val sourceLink = getErrorModelTrace(sourceModel)
			val targetLink = getErrorModelTrace(targetModel)
			val petriNet = getPetriNet(container)
			val traceLink = createRequiredElement2Connection
			traceLink.source = sourceLink.errorModel
			traceLink.target = targetLink.errorModel
			val fail = createImmediateTransition
			traceLink.nodes += fail
			traceLink.arcs += createArc(targetLink.up, fail)
			traceLink.arcs += createArc(fail, targetLink.down)
			traceLink.arcs += createArc(sourceLink.down, fail)
			traceLink.arcs += createArc(fail, sourceLink.down)
			traceLink.arcs += createArc(sourceLink.up, targetLink.repair)
			traceLink.arcs += createArc(targetLink.repair, sourceLink.up)
			petriNet.nodes += traceLink.nodes
			traceModel.traceLinks += traceLink
		].action(CRUDActivationStateEnum.DELETED) [
			val sourceLink = getErrorModelTrace(sourceModel)
			val targetLink = getErrorModelTrace(targetModel)
			val petriNet = getPetriNet(container)
			for (traceLink : requiredElementConnectionTraceMatcher.getAllValuesOfTraceLink(traceModel, sourceLink,
				targetLink)) {
				removePetriNetModule(petriNet, traceLink)
			}
		].build
	}

	private def getPetriNet(RailwayContainer railwayContainer) {
		railwayContainerTraceMatcher.getOneArbitraryMatch(traceModel, railwayContainer, null).traceLink.petriNet
	}

	private def getErrorModelTrace(ErrorModel model) {
		errorModelTraceMatcher.getOneArbitraryMatch(traceModel, model, null).traceLink
	}

	override protected getTransformationRuleGroup() {
		new EventDrivenTransformationRuleGroup(railwayContainerRule, errorModelRule, failedErrorModelRule,
			connectionRule)
	}

	override protected getConflictResolver() {
		val resolver = new InvertedDisappearancePriorityConflictResolver
		resolver.setPriority(railwayContainerRule.ruleSpecification, 0)
		resolver.setPriority(errorModelRule.ruleSpecification, 10)
		resolver.setPriority(failedErrorModelRule.ruleSpecification, 20)
		resolver.setPriority(connectionRule.ruleSpecification, 120)
		resolver
	}

	private def createArc(ArcKind kind, Place place, Transition transition) {
		val arc = StochasticPetriNetFactory.eINSTANCE.createArc
		arc.kind = kind
		arc.place = place
		arc.transition = transition
		arc
	}

	private def createArc(Place place, Transition transition) {
		createArc(ArcKind.INPUT, place, transition)
	}

	private def createArc(Transition transition, Place place) {
		createArc(ArcKind.OUTPUT, place, transition)
	}

	private def void removePetriNetModule(PetriNet petriNet, PetriNetModuleTraceLink traceLink) {
		petriNet.nodes.removeAll(traceLink.nodes)
		EcoreUtil.removeAll(traceLink.arcs)
		traceModel.traceLinks -= traceLink
	}
}
