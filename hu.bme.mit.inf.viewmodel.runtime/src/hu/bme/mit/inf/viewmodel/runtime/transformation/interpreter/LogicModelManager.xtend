package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelFactory
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import java.util.Collection
import java.util.UUID
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
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
		this(LogicModelFactory.eINSTANCE.createLogicModel => [
			logicModelId = UUID.randomUUID.toString
		])
	}

	new(Resource resource) {
		this()
		resource.contents += logicModel
	}

	def getLogicModelId() {
		logicModel.logicModelId
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
		variable
	}

	def newEquivalenceConstraint(Variable left, Variable right) {
		val constraint = LogicModelFactory.eINSTANCE.createEquivalenceConstraint
		constraint.left = left
		constraint.right = right
		constraint
	}

	def newEClassConstraint(Variable variable, EClass eClass) {
		val constraint = LogicModelFactory.eINSTANCE.createEClassConstraint
		constraint.variable = variable
		constraint.targetEClass = eClass
		constraint
	}

	def newJavaClassConstraint(Variable variable, Class<?> javaClass) {
		val constraint = LogicModelFactory.eINSTANCE.createJavaClassConstraint
		constraint.variable = variable
		constraint.targetClass = javaClass
		constraint
	}

	def newConstantEObjectConstraint(Variable variable, EObject value) {
		val constraint = LogicModelFactory.eINSTANCE.createConstantEObjectConstraint
		constraint.variable = variable
		constraint.value = value
		constraint.valueType = value.eClass
		constraint
	}

	def newConstantJavaObjectConstraint(Variable variable, Object value) {
		val constraint = LogicModelFactory.eINSTANCE.createConstantJavaObjectConstraint
		constraint.variable = variable
		constraint.value = value
		constraint.valueType = value.class
		constraint
	}

	def newRelationConstraint(Variable left, Variable right, EStructuralFeature relation) {
		val constraint = LogicModelFactory.eINSTANCE.createRelationConstraint
		constraint.left = left
		constraint.right = right
		constraint.targetRelation = relation
		constraint
	}

	def void removeVariables(Collection<Variable> variables) {
		for (variable : variables) {
			val cluster = variable.cluster
			cluster.variables -= variable
			if (cluster.variables.empty) {
				cluster.state = ClusterState.UNUSED
			}
		}
	}

	def newCluster(Collection<Variable> variables, Cluster clusterToReuse) {
		val cluster = if (clusterToReuse === null) {
				val newCluster = LogicModelFactory.eINSTANCE.createCluster
				newCluster.id = clusterId
				clusterId++
				newCluster
			} else {
				if (clusterToReuse.state != ClusterState.UNUSED || !clusterToReuse.variables.empty) {
					throw new IllegalArgumentException("Only unused clusters can be reused.")
				}
				clusterToReuse.state = ClusterState.CLEAN
				clusterToReuse
			}
		for (variable : variables) {
			val oldCluster = variable.cluster
			if (oldCluster !== null && oldCluster.variables.size <= 1) {
				oldCluster.state = ClusterState.UNUSED
			}
		}
		cluster.variables.addAll(variables)
		if (cluster.eContainer != logicModel) {
			logicModel.clusters += cluster
		}
		cluster
	}

	def markClusterDirty(Cluster cluster) {
		cluster.state = ClusterState.DIRTY
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
		if (toRemove.state === ClusterState.DIRTY && toKeep.state !== ClusterState.DIRTY) {
			markClusterDirty(toKeep)
		}
		toRemove.state = ClusterState.UNUSED
	}
}
