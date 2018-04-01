package hu.bme.mit.inf.viewmodel.benchmarks.core.modification

import com.google.common.collect.Lists
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Position
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayFactory
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.ModificationQueries
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.RouteMatch
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.RouteMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.SemaphoreMatch
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.SemaphoreMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.SetSwitchFailedMatch
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.SetSwitchFailedMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.SetSwitchOperationalMatch
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.SetSwitchOperationalMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.SwitchMatch
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.SwitchMatcher
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.TrackElementMatch
import hu.bme.mit.inf.viewmodel.benchmarks.queries.modifications.TrackElementMatcher
import java.util.Collections
import java.util.List
import java.util.Map
import java.util.Random
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope

class ModelModifications {
	val Random random
	val RailwayContainer railwayContainer
	val List<ModelModification> schedule
	val AdvancedViatraQueryEngine queryEngine
	val OrderedMatcher<TrackElementMatch> trackElementMatcher
	val OrderedMatcher<SemaphoreMatch> semaphoreMatcher
	val OrderedMatcher<RouteMatch> routeMatcher
	val OrderedMatcher<SwitchMatch> switchMatcher
	val OrderedMatcher<SetSwitchFailedMatch> setSwitchFailedMatcher
	val OrderedMatcher<SetSwitchOperationalMatch> setSwitchOperationalMatcher

	extension val RailwayFactory = RailwayFactory.eINSTANCE

	var nextId = -1

	new(long randomSeed, RailwayContainer railwayContainer, Map<ModelModification, Integer> mix) {
		random = new Random(randomSeed)
		this.railwayContainer = railwayContainer
		this.schedule = shuffle(mix)
		queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(railwayContainer))
		ModificationQueries.instance.prepare(queryEngine)
		trackElementMatcher = OrderedMatcher.from(TrackElementMatcher.on(queryEngine))
		semaphoreMatcher = OrderedMatcher.from(SemaphoreMatcher.on(queryEngine))
		routeMatcher = OrderedMatcher.from(RouteMatcher.on(queryEngine))
		switchMatcher = OrderedMatcher.from(SwitchMatcher.on(queryEngine))
		setSwitchFailedMatcher = OrderedMatcher.from(SetSwitchFailedMatcher.on(queryEngine))
		setSwitchOperationalMatcher = OrderedMatcher.from(SetSwitchOperationalMatcher.on(queryEngine))
	}

	def void dispose() {
		queryEngine.dispose
	}

	private def shuffle(Map<ModelModification, Integer> mix) {
		val schedule = Lists.newArrayListWithExpectedSize(mix.values.fold(0)[a, b|a + b])
		// Do not depend on the iteration order of mix.entrySet.
		for (modification : ModelModification.values) {
			val int count = mix.getOrDefault(modification, 0)
			for (var int i = 0; i < count; i++) {
				schedule.add(modification)
			}
		}
		Collections.shuffle(schedule, random)
		schedule
	}

	def apply() {
		for (modification : schedule) {
			apply(modification)
		}
	}

	protected def void apply(ModelModification modification) {
		switch (modification) {
			case CREATE_SWITCH: {
				trackElementMatcher.forOneRandomMatch(random) [
					val newElement = createSwitch
					newElement.id = generateId
					newElement.currentPosition = Position.STRAIGHT
					val region = element.eContainer as Region
					region.elements += newElement
					element.connectsTo += newElement
				]
			}
			case CREATE_SEGMENT: {
				trackElementMatcher.forOneRandomMatch(random) [
					val newElement = createSegment
					newElement.id = generateId
					val region = element.eContainer as Region
					region.elements += newElement
					element.connectsTo += newElement
				]
			}
			case CONNECT_TRACK_ELEMENTS: {
				while (true) {
					val left = trackElementMatcher.getOneRandomMatch(random).element
					val right = trackElementMatcher.getOneRandomMatch(random).element
					if (!left.connectsTo.contains(right) && !right.connectsTo.contains(left)) {
						left.connectsTo += right
						return
					}
				}
			}
			case DISCONNECT_TRACK_ELEMENTS: {
				while (true) {
					val element = trackElementMatcher.getOneRandomMatch(random).element
					if (!element.connectsTo.empty) {
						val i = random.nextInt(element.connectsTo.size)
						element.connectsTo.remove(i)
						return
					}
				}
			}
			case CREATE_ROUTE: {
				while (true) {
					val entry = semaphoreMatcher.getOneRandomMatch(random).semaphore
					val exit = semaphoreMatcher.getOneRandomMatch(random).semaphore
					if (entry.eContainer != exit.eContainer) {
						railwayContainer.routes += createRoute => [ route |
							route.id = generateId
							route.active = true
							route.entry = entry
							route.exit = exit
						]
					}
					return
				}
			}
			case REMOVE_ROUTE: {
				routeMatcher.forOneRandomMatch(random) [
					railwayContainer.routes -= route
				]
			}
			case ADD_SWITCH_TO_ROUTE: {
				while (true) {
					val route = routeMatcher.getOneRandomMatch(random).route
					val ^switch = switchMatcher.getOneRandomMatch(random).^switch
					if (!route.follows.exists[target == ^switch]) {
						route.follows += createSwitchPosition => [ position |
							position.id = generateId
							position.target = ^switch
							position.position = Position.DIVERGING
						]
						return
					}
				}
			}
			case REMOVE_SWITCH_FROM_ROUTE: {
				while (true) {
					val route = routeMatcher.getOneRandomMatch(random).route
					if (!route.follows.empty) {
						val i = random.nextInt(route.follows.size)
						route.follows.remove(i)
						return
					}
				}
			}
			case SET_SWITCH_FAILED: {
				setSwitchFailedMatcher.forOneRandomMatch(random) [
					^switch.currentPosition = Position.FAILURE
				]
			}
			case SET_SWITCH_OPERATIONAL: {
				setSwitchOperationalMatcher.forOneRandomMatch(random) [
					^switch.currentPosition = Position.STRAIGHT
				]
			}
		}
	}

	protected def generateId() {
		nextId--
	}
}
