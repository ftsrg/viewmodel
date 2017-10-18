package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelFactory
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import java.util.Collection
import java.util.HashSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class LogicModelManager {
	@Accessors(PUBLIC_GETTER) val LogicModel logicModel
	var long variableId = 0
	var long clusterId = 0

	new() {
		this(LogicModelFactory.eINSTANCE.createLogicModel)
	}

	new(Resource resource) {
		this()
		resource.contents += logicModel
	}
	
	def getConstraintManagerQueryGroup() {
		LogicModelConstraintManager.queryGroup
	}
	
	def createConstraintManager(ViatraQueryEngine queryEngine) {
		new LogicModelConstraintManager(this, queryEngine)
	}

	def newVariable() {
		val variable = LogicModelFactory.eINSTANCE.createVariable
		variable.id = variableId
		variableId++
		logicModel.variables += variable
		newCluster(#[variable])
		variable
	}

	def void removeVariables(Collection<Variable> variables) {
		logicModel.variables.removeAll(variables)
		val clustersToRemove = new HashSet
		for (variable : variables) {
			if (variable.cluster.variables.empty) {
				clustersToRemove += variable.cluster
			}
		}
		logicModel.clusters.removeAll(clustersToRemove)
	}

	def newCluster(Collection<Variable> variables) {
		val cluster = LogicModelFactory.eINSTANCE.createCluster
		cluster.id = clusterId
		clusterId++
		val clustersToRemove = new HashSet
		for (variable : variables) {
			val oldCluster = variable.cluster
			if (oldCluster !== null  && oldCluster.variables.size <= 1) {
				clustersToRemove += oldCluster
			}
		}
		cluster.variables.addAll(variables)
		logicModel.clusters += cluster
		logicModel.clusters.removeAll(clustersToRemove)
		cluster
	}

	def mergeClusters(Cluster left, Cluster right) {
		if (left === right) {
			return
		}
		if (left.variables.size >= right.variables.size) {
			mergeClustersDirected(left, right)
		} else {
			mergeClustersDirected(right, left)
		}
	}

	protected def void mergeClustersDirected(Cluster toKeep, Cluster toRemove) {
		toKeep.variables.addAll(toRemove.variables)
		logicModel.clusters -= toRemove
	}
}
