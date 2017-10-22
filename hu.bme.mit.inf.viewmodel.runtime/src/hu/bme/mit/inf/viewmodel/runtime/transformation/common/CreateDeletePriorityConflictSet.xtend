package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import com.google.common.collect.ImmutableSet
import com.google.common.collect.Multimap
import com.google.common.collect.Multimaps
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.TreeMap
import org.eclipse.viatra.transformation.evm.api.Activation
import org.eclipse.viatra.transformation.evm.api.RuleSpecification
import org.eclipse.viatra.transformation.evm.api.resolver.ChangeableConflictSet
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.xtend.lib.annotations.Accessors

class CreateDeletePriorityConflictSet implements ChangeableConflictSet {

	@Accessors(PUBLIC_GETTER) val CreateDeletePriorityConflictResolver conflictResolver
	val Map<RuleSpecification<?>, CreateDeletePriority> priorities
	val Multimap<Integer, Activation<?>> activations = Multimaps.newSetMultimap(new TreeMap)[new HashSet]

	new(CreateDeletePriorityConflictResolver conflictResolver,
		Map<RuleSpecification<?>, CreateDeletePriority> priorities) {
		this.conflictResolver = conflictResolver
		this.priorities = new HashMap(priorities)
	}

	protected def void setPriority(RuleSpecification<?> specification, CreateDeletePriority priority) {
		val oldPriority = getRulePriority(specification)
		if (priority == oldPriority) {
			return
		}
		val oldActivations = removeActivations(specification, oldPriority.createPriority)
		val oldInverseActivations = removeActivations(specification, oldPriority.deletePriority)
		activations.putAll(priority.createPriority, oldActivations)
		activations.putAll(priority.deletePriority, oldInverseActivations)
		priorities.put(specification, priority)
	}

	private def removeActivations(RuleSpecification<?> specification, int oldPriority) {
		val bucket = activations.get(oldPriority)
		if (bucket === null) {
			return Collections.emptySet
		}
		val oldActivations = bucket.filter[instance.specification == specification].toSet
		activations.get(oldPriority).removeAll(oldActivations)
		oldActivations
	}

	override addActivation(Activation<?> activation) {
		val priority = getActivationPriority(activation)
		if (activation.state == CRUDActivationStateEnum.DELETED) {
			activations.remove(priority.createPriority, activation)
			activations.put(priority.deletePriority, activation)
		} else {
			activations.remove(priority.deletePriority, activation)
			activations.put(priority.deletePriority, activation)
		}
	}

	override removeActivation(Activation<?> activation) {
		val priority = getActivationPriority(activation)
		activations.remove(priority.createPriority, activation) ||
			activations.remove(priority.deletePriority, activation)
	}

	override getConflictingActivations() {
		ImmutableSet.copyOf(activations.values)
	}

	protected def getNextBucket() {
		for (bucket : activations.asMap.values) {
			if (!bucket.empty) {
				return bucket
			}
		}
		null
	}

	override getNextActivation() {
		val lastBucket = getNextBucket
		if (lastBucket === null) {
			null
		} else {
			lastBucket.iterator.next
		}
	}

	override getNextActivations() {
		val lastBucket = getNextBucket
		if (lastBucket === null) {
			Collections.emptySet
		} else {
			ImmutableSet.copyOf(lastBucket)
		}
	}

	protected def getActivationPriority(Activation<?> activation) {
		val specification = activation.instance.specification
		getRulePriority(specification)
	}

	protected def getRulePriority(RuleSpecification<?> specification) {
		priorities.getOrDefault(specification, CreateDeletePriority.DEFAULT)
	}

}
