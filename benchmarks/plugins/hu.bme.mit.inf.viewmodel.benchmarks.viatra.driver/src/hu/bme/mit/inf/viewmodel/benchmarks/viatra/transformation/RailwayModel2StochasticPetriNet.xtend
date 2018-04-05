package hu.bme.mit.inf.viewmodel.benchmarks.viatra.transformation

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.PetriNetModuleTraceLink
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.RailwayContainerTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.RequiredElementConnectionTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.RequiredElementTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.RouteTraceMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.TracedTrainBenchmarkQueries
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.TrainBenchmarkQueries
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.FailedRequiredElementTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.FailedRouteTraceQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RailwayContainerQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RequiredElementInRailwayModelQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RouteInRailwayModelQuerySpecification
import hu.bme.mit.inf.viewmodel.benchmarks.queries.stochasticpetrinet.util.RouteRequiresElementInRailwayModelQuerySpecification
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.runtime.emf.rules.EventDrivenTransformationRuleGroup

class RailwayModel2StochasticPetriNet extends HandCodedTransformation {

	Railway2StochasticPetriNetTrace traceModel
	RailwayContainerTraceMatcher railwayContainerTraceMatcher
	RouteTraceMatcher routeTraceMatcher
	RequiredElementTraceMatcher requiredElementTraceMatcher
	RequiredElementConnectionTraceMatcher requiredElementConnectionTraceMatcher

	new(RailwayContainer railwayContainer, ResourceSet resourceSet) {
		super(railwayContainer, resourceSet)
	}

	override protected createTraceModel(RailwayContainer railwayContainer) {
		traceModel = Railway2StochasticPetriNetFactory.eINSTANCE.createRailway2StochasticPetriNetTrace => [
			source = railwayContainer
		]
	}

	override getTraceLinkCount() {
		traceModel.traceLinks.size
	}

	override protected getQueryGroup() {
		GenericQueryGroup.of(TrainBenchmarkQueries.instance, TracedTrainBenchmarkQueries.instance)
	}

	override protected createMatchers(ViatraQueryEngine queryEngine) {
		railwayContainerTraceMatcher = RailwayContainerTraceMatcher.on(queryEngine)
		routeTraceMatcher = RouteTraceMatcher.on(queryEngine)
		requiredElementTraceMatcher = RequiredElementTraceMatcher.on(queryEngine)
		requiredElementConnectionTraceMatcher = RequiredElementConnectionTraceMatcher.on(queryEngine)
	}

	override protected getTransformationRuleGroup() {
		extension val StochasticPetriNetFactory = StochasticPetriNetFactory.eINSTANCE
		extension val Railway2StochasticPetriNetFactory = Railway2StochasticPetriNetFactory.eINSTANCE

		val railwayContainerRule = createRule.precondition(RailwayContainerQuerySpecification.instance).action(
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

		val routeRule = createRule.precondition(RouteInRailwayModelQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			val traceLink = createRoute2FailureModel
			traceLink.route = route
			val operational = createPlace => [tokens = 1]
			val failed = createPlace
			val repair = createImmediateTransition
			traceLink.operational = operational
			traceLink.failed = failed
			traceLink.repair = repair
			traceLink.nodes += #[operational, failed, repair]
			traceLink.arcs += createArc(failed, repair)
			traceLink.arcs += createArc(repair, operational)
			petriNet.nodes += traceLink.nodes
			traceModel.traceLinks += traceLink
		].action(CRUDActivationStateEnum.DELETED) [
			for (traceLink : routeTraceMatcher.getAllValuesOfTraceLink(traceModel, route)) {
				removePetriNetModule(petriNet, traceLink)
			}
		].filter[match|match.traceModel == traceModel].build

		val failedRouteRule = createRule.precondition(FailedRouteTraceQuerySpecification.instance).action(
			CRUDActivationStateEnum.CREATED) [
			traceLink.operational.tokens = 0
			traceLink.failed.tokens = 1
		].action(CRUDActivationStateEnum.DELETED) [
			traceLink.operational.tokens = 1
			traceLink.failed.tokens = 0
		].filter[match|match.traceModel == traceModel].build

		val requiredElementRule = createRule.precondition(RequiredElementInRailwayModelQuerySpecification.instance).
			action(CRUDActivationStateEnum.CREATED) [
				val traceLink = createRequiredElement2FailureModel
				traceLink.railwayElement = element
				val operational = createPlace => [tokens = 1]
				val failed = createPlace
				val fail = createTimedTransition
				val repair = createTimedTransition
				traceLink.operational = operational
				traceLink.failed = failed
				traceLink.nodes += #[operational, failed, fail, repair]
				traceLink.arcs += createArc(operational, fail)
				traceLink.arcs += createArc(fail, failed)
				traceLink.arcs += createArc(failed, repair)
				traceLink.arcs += createArc(repair, operational)
				petriNet.nodes += traceLink.nodes
				traceModel.traceLinks += traceLink
			].action(CRUDActivationStateEnum.DELETED) [
				for (traceLink : requiredElementTraceMatcher.getAllValuesOfTraceLink(traceModel, element)) {
					removePetriNetModule(petriNet, traceLink)
				}
			].filter[match|match.traceModel == traceModel].build

		val failedRequiredElementRule = createRule.precondition(FailedRequiredElementTraceQuerySpecification.instance).
			action(CRUDActivationStateEnum.CREATED) [
				traceLink.operational.tokens = 0
				traceLink.failed.tokens = 1
			].action(CRUDActivationStateEnum.DELETED) [
				traceLink.operational.tokens = 1
				traceLink.failed.tokens = 0
			].filter[match|match.traceModel == traceModel].build

		val connectionRule = createRule.precondition(RouteRequiresElementInRailwayModelQuerySpecification.instance).
			action(CRUDActivationStateEnum.CREATED) [
				val traceLink = createRequiredElement2Connection
				traceLink.route = routeLink.route
				traceLink.railwayElement = elementLink.railwayElement
				val fail = createImmediateTransition
				traceLink.nodes += fail
				traceLink.arcs += createArc(routeLink.operational, fail)
				traceLink.arcs += createArc(fail, routeLink.failed)
				traceLink.arcs += createArc(elementLink.failed, fail)
				traceLink.arcs += createArc(fail, elementLink.failed)
				traceLink.arcs += createArc(elementLink.operational, routeLink.repair)
				traceLink.arcs += createArc(routeLink.repair, elementLink.operational)
				petriNet.nodes += traceLink.nodes
				traceModel.traceLinks += traceLink
			].action(CRUDActivationStateEnum.DELETED) [
				for (traceLink : requiredElementConnectionTraceMatcher.getAllValuesOfTraceLink(traceModel,
					routeLink.route, elementLink.railwayElement)) {
					removePetriNetModule(petriNet, traceLink)
				}
			].filter[match|match.traceModel == traceModel].build

		new EventDrivenTransformationRuleGroup(railwayContainerRule, routeRule, failedRouteRule, requiredElementRule,
			failedRequiredElementRule, connectionRule)
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
