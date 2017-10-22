package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import com.google.common.collect.Lists
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EquivalenceConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.AnyEObjectConstantValueMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.AnyJavaObjectConstantValueMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.DirtyClusterMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.EObjectClusterMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.EquivalenceConstraintMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.JavaObjectClusterMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.UnusedClusterMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.AnyEObjectConstantValueQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.AnyJavaObjectConstantValueQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.DirtyClusterQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.EObjectClusterQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.EquivalenceConstraintQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.JavaObjectClusterQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.UnusedClusterQuerySpecification
import java.util.ArrayDeque
import java.util.ArrayList
import java.util.Collection
import java.util.HashSet
import java.util.List
import java.util.Queue
import java.util.Set
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class LogicModelConstraintManager {
	val LogicModelManager logicModelManager
	val EquivalenceConstraintMatcher equivalenceConstraintMatcher
	val AnyEObjectConstantValueMatcher anyEObjectConstantValueMatcher
	val AnyJavaObjectConstantValueMatcher anyJavaObjectConstantValueMatcher
	val EObjectClusterMatcher eObjectClusterMatcher
	val JavaObjectClusterMatcher javaObjectClusterMatcher
	val DirtyClusterMatcher dirtClusterMatcher
	val UnusedClusterMatcher unusedClusterMatcher

	new(LogicModelManager logicModelManager, ViatraQueryEngine queryEngine) {
		this.logicModelManager = logicModelManager
		equivalenceConstraintMatcher = EquivalenceConstraintMatcher.on(queryEngine)
		anyEObjectConstantValueMatcher = AnyEObjectConstantValueMatcher.on(queryEngine)
		anyJavaObjectConstantValueMatcher = AnyJavaObjectConstantValueMatcher.on(queryEngine)
		eObjectClusterMatcher = EObjectClusterMatcher.on(queryEngine)
		javaObjectClusterMatcher = JavaObjectClusterMatcher.on(queryEngine)
		dirtClusterMatcher = DirtyClusterMatcher.on(queryEngine)
		unusedClusterMatcher = UnusedClusterMatcher.on(queryEngine)
	}

	static def getQueryGroup() {
		new GenericQueryGroup(#{
			EquivalenceConstraintQuerySpecification.instance,
			AnyEObjectConstantValueQuerySpecification.instance,
			AnyJavaObjectConstantValueQuerySpecification.instance,
			EObjectClusterQuerySpecification.instance,
			JavaObjectClusterQuerySpecification.instance,
			DirtyClusterQuerySpecification.instance,
			UnusedClusterQuerySpecification.instance
		})
	}

	def getLogicModel() {
		logicModelManager.logicModel
	}

	def void registerVariables(Collection<Variable> variables) {
		for (variable : variables) {
			if (variable.cluster === null) {
				newCluster(#[variable])
			}
		}
	}

	protected dispatch def void registerConstraint(EquivalenceConstraint constraint) {
		mergeClustersLazy(constraint.left.cluster, constraint.right.cluster)
	}

	def void registerConstraints(Collection<Constraint> constraints) {
		for (constraint : constraints) {
			registerConstraint(constraint)
		}
	}

	protected dispatch def void registerConstraint(ConstantEObjectConstraint constraint) {
		val clusterIterator = eObjectClusterMatcher.getAllValuesOfRep(logicModel, constraint.value).iterator
		if (clusterIterator.hasNext) {
			val eObjectCluster = clusterIterator.next
			mergeClustersLazy(eObjectCluster, constraint.variable)
			if (clusterIterator.hasNext) {
				throw new IllegalStateException("Multiple clusters for EObject " + constraint.value)
			}
		} else {
			newCluster(#[constraint.variable])
		}
	}

	protected dispatch def void registerConstraint(ConstantJavaObjectConstraint constraint) {
		val clusterIterator = javaObjectClusterMatcher.getAllValuesOfRep(logicModel, constraint.value).iterator
		if (clusterIterator.hasNext) {
			val javaObjectCluster = clusterIterator.next
			mergeClustersLazy(javaObjectCluster, constraint.variable)
			if (clusterIterator.hasNext) {
				throw new IllegalStateException("Multiple clusters for java Object " + constraint.value)
			}
		} else {
			newCluster(#[constraint.variable])
		}
	}

	protected dispatch def void registerConstraint(Constraint constraint) {
		// Do nothing.
	}

	def void unregisterConstraints(Collection<Constraint> constraints) {
		for (constraint : constraints) {
			unregisterConstraint(constraint)
		}
	}

	protected dispatch def void unregisterConstraint(EquivalenceConstraint constraint) {
		splitClusterLazy(constraint.left.cluster)
	}

	protected dispatch def void unregisterConstraint(ConstantEObjectConstraint constraint) {
		splitClusterLazy(constraint.variable.cluster)
	}

	protected dispatch def void unregisterConstraint(ConstantJavaObjectConstraint constraint) {
		splitClusterLazy(constraint.variable.cluster)
	}

	protected dispatch def void unregisterConstraint(Constraint constraint) {
		// Do nothing.
	}

	def void unregisterVariables(Collection<Variable> variables) {
		logicModelManager.removeVariables(variables)
	}

	def mergeClustersLazy(Variable left, Variable right) {
		if (left.cluster !== null) {
			mergeClustersLazy(left.cluster, right)
		} else if (right.cluster !== null) {
			right.cluster.variables += left
		} else {
			newCluster(#[left, right])
		}
	}

	def mergeClustersLazy(Cluster left, Variable right) {
		if (right.cluster === null) {
			left.variables += right
		} else {
			mergeClustersLazy(left, right.cluster)
		}
	}

	def mergeClustersLazy(Cluster left, Cluster right) {
		if (!left.dirty && !right.dirty) {
			logicModelManager.mergeClusters(left, right)
		}
	}

	protected def splitClusterLazy(Cluster cluster) {
		logicModelManager.markClusterDirty(cluster)
	}

	protected def splitClusters() {
		val dirtyCluters = Lists.newArrayList(dirtClusterMatcher.getAllValuesOfRep(logicModelManager.logicModelId))
		dirtyCluters.sortInplaceBy[-variables.size]
		for (dirtyCluster : dirtyCluters) {
			splitCluster(dirtyCluster)
		}
		val unusedClusters = unusedClusterMatcher.getAllValuesOfRep(logicModelManager.logicModelId)
		logicModel.clusters.removeAll(unusedClusters)
	}

	protected def splitCluster(Cluster cluster) {
		val remaining = new HashSet
		remaining.addAll(cluster.variables)
		var Set<Variable> toKeep = null
		val List<Set<Variable>> toSplit = new ArrayList
		while (!remaining.empty) {
			val nextCluster = dfs(remaining.head)
			remaining.removeAll(nextCluster)
			if (toKeep === null) {
				toKeep = nextCluster
			} else if (toKeep.size < nextCluster.size) {
				toSplit += toKeep
				toKeep = nextCluster
			} else {
				toSplit += nextCluster
			}
		}
		for (newCluster : toSplit) {
			newCluster(newCluster)
		}
		cluster.state = ClusterState.CLEAN
	}

	protected def newCluster(Collection<Variable> variables) {
		val clusterToReuse = unusedClusterMatcher.getOneArbitraryMatch(logicModel.logicModelId, null)?.rep
		logicModelManager.newCluster(variables, clusterToReuse)
	}

	protected def dfs(Variable variable) {
		val cluster = new HashSet
		cluster += variable
		val queue = new ArrayDeque
		queue.add(variable)
		val eObjects = new HashSet
		val javaObjects = new HashSet
		while (!queue.empty) {
			val current = queue.remove
			for (next : equivalenceConstraintMatcher.getAllValuesOfRight(current)) {
				enqueue(cluster, queue, next)
			}
			for (next : equivalenceConstraintMatcher.getAllValuesOfLeft(current)) {
				enqueue(cluster, queue, next)
			}
			for (eObjectValue : anyEObjectConstantValueMatcher.getAllValuesOfValue(current)) {
				if (eObjects.add(eObjectValue)) {
					for (next : anyEObjectConstantValueMatcher.getAllValuesOfVar(eObjectValue)) {
						enqueue(cluster, queue, next)
					}
				}
			}
			for (javaObjectValue : anyJavaObjectConstantValueMatcher.getAllValuesOfValue(current)) {
				if (javaObjects.add(javaObjectValue)) {
					for (next : anyJavaObjectConstantValueMatcher.getAllValuesOfVar(javaObjectValue)) {
						enqueue(cluster, queue, next)
					}
				}
			}
		}
		cluster
	}

	private def enqueue(Set<Variable> cluster, Queue<Variable> queue, Variable variable) {
		if (cluster.add(variable)) {
			cluster += variable
			queue.add(variable)
		}
	}
}
