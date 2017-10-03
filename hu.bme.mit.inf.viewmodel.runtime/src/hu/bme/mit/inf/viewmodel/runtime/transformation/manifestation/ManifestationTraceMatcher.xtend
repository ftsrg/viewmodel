package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.model.manifestationtrace.Cluster
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.EquivalenceConstraintMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.ReferencingRelationSettingMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.EquivalenceConstraintQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.util.ReferencingRelationSettingQuerySpecification
import java.util.ArrayDeque
import java.util.Collection
import java.util.HashSet
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

class ManifestationTraceMatcher {
	val ManifestationTraceManager manifestationTraceManager
	val EquivalenceConstraintMatcher equivalenceConstraintMatcher
	val ReferencingRelationSettingMatcher referencingRelationSettingMatcher

	new(ManifestationTraceManager manifestationTraceManager, ViatraQueryEngine queryEngine) {
		this.manifestationTraceManager = manifestationTraceManager
		equivalenceConstraintMatcher = EquivalenceConstraintMatcher.on(queryEngine)
		referencingRelationSettingMatcher = ReferencingRelationSettingMatcher.on(queryEngine)
	}

	static def getQueryGroup() {
		GenericQueryGroup.of(
			EquivalenceConstraintQuerySpecification.instance,
			ReferencingRelationSettingQuerySpecification.instance
		)
	}

	def getManifestationTrace() {
		manifestationTraceManager.manifestationTrace
	}

	def getLogicModel() {
		manifestationTraceManager.logicModel
	}

	def void rearrangeClusters() {
		if (manifestationTrace.dirtyClusters) {
			doRearrangeClusters()
			manifestationTrace.dirtyClusters = false
		}
	}

	def void doRearrangeClusters() {
		val unprocessedVariables = new HashSet(logicModel.variables)
		val clustersToRemove = new HashSet
		for (cluster : manifestationTrace.clusters) {
			val variableIterator = cluster.variables.iterator
			var Variable representant = null
			val variablesToRemove = new HashSet
			while (variableIterator.hasNext) {
				val variable = variableIterator.next
				if (unprocessedVariables.contains(variable)) {
					representant = variable
				} else {
					variablesToRemove += variable
				}
			}
			if (representant === null) {
				clustersToRemove += cluster
			} else {
				val clusterVariables = findCluster(representant)
				unprocessedVariables.removeAll(clusterVariables)
				clusterVariables -= representant
				while (variableIterator.hasNext) {
					val variable = variableIterator.next
					if (clusterVariables.contains(variable)) {
						clusterVariables -= variable
					} else {
						variablesToRemove += variable
					}
				}
				// Use the ManifestationTraceManager instead of Iterator#remove
				// so that an IModelManipulations can be hooked in later.
				manifestationTraceManager.removeVariables(cluster, variablesToRemove)
				manifestationTraceManager.addVariables(cluster, clusterVariables)
			}
		}
		removeClusters(clustersToRemove)
		while (!unprocessedVariables.empty) {
			val variable = unprocessedVariables.head
			val clusterVariables = findCluster(variable)
			unprocessedVariables.removeAll(clusterVariables)
			manifestationTraceManager.createCluster(clusterVariables)
		}
	}

	protected def removeClusters(Collection<Cluster> clusters) {
		val relationSettings = new HashSet
		for (cluster : clusters) {
			val referencingSettings = referencingRelationSettingMatcher.getAllValuesOfSetting(cluster)
			relationSettings.addAll(referencingSettings)
		}
		manifestationTraceManager.removeRelationSettings(relationSettings)
		manifestationTraceManager.forceRemoveClusters(clusters)
	}

	protected def findCluster(Variable variable) {
		val cluster = new HashSet
		val queue = new ArrayDeque
		cluster += variable
		queue += variable
		while (!queue.empty) {
			val current = queue.remove
			for (neighbor : equivalenceConstraintMatcher.getAllValuesOfRight(current)) {
				if (!cluster.contains(neighbor)) {
					cluster += neighbor
					queue += neighbor
				}
			}
		}
		cluster
	}
}
