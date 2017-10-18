package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EquivalenceConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelFactory
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.AnyEObjectConstantValueMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.AnyJavaObjectConstantValueMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.EObjectClusterMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.EquivalenceConstraintMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.JavaObjectClusterMatcher
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.AnyEObjectConstantValueQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.AnyJavaObjectConstantValueQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.EObjectClusterQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.EquivalenceConstraintQuerySpecification
import hu.bme.mit.inf.viewmodel.runtime.queries.logicmodel.util.JavaObjectClusterQuerySpecification
import java.util.ArrayDeque
import java.util.Collection
import java.util.HashSet
import java.util.Queue
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
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

	new(LogicModelManager logicModelManager, ViatraQueryEngine queryEngine) {
		this.logicModelManager = logicModelManager
		equivalenceConstraintMatcher = EquivalenceConstraintMatcher.on(queryEngine)
		anyEObjectConstantValueMatcher = AnyEObjectConstantValueMatcher.on(queryEngine)
		anyJavaObjectConstantValueMatcher = AnyJavaObjectConstantValueMatcher.on(queryEngine)
		eObjectClusterMatcher = EObjectClusterMatcher.on(queryEngine)
		javaObjectClusterMatcher = JavaObjectClusterMatcher.on(queryEngine)
	}

	static def getQueryGroup() {
		new GenericQueryGroup(#{
			EquivalenceConstraintQuerySpecification.instance,
			AnyEObjectConstantValueQuerySpecification.instance,
			AnyJavaObjectConstantValueQuerySpecification.instance,
			EObjectClusterQuerySpecification.instance,
			JavaObjectClusterQuerySpecification.instance
		})
	}

	def getLogicModel() {
		logicModelManager.logicModel
	}

	def newVariable() {
		logicModelManager.newVariable
	}

	def void removeVariables(Collection<Variable> variables) {
		logicModelManager.removeVariables(variables)
	}

	def addEquivalenceConstraint(Variable left, Variable right) {
		val constraint = LogicModelFactory.eINSTANCE.createEquivalenceConstraint
		constraint.left = left
		constraint.right = right
		logicModel.constraints += constraint
		logicModelManager.mergeClusters(left.cluster, right.cluster)
		constraint
	}

	def addEClassConstraint(Variable variable, EClass eClass) {
		val constraint = LogicModelFactory.eINSTANCE.createEClassConstraint
		constraint.variable = variable
		constraint.targetEClass = eClass
		logicModel.constraints += constraint
		constraint
	}

	def addJavaClassConstraint(Variable variable, Class<?> javaClass) {
		val constraint = LogicModelFactory.eINSTANCE.createJavaClassConstraint
		constraint.variable = variable
		constraint.targetClass = javaClass
		logicModel.constraints += constraint
		constraint
	}

	def addConstantEObjectConstraint(Variable variable, EObject value) {
		val constraint = LogicModelFactory.eINSTANCE.createConstantEObjectConstraint
		constraint.variable = variable
		constraint.value = value
		constraint.valueType = value.eClass
		val clusterIterator = eObjectClusterMatcher.getAllValuesOfRep(logicModel, value).iterator
		if (clusterIterator.hasNext) {
			val eObjectCluster = clusterIterator.next
			logicModelManager.mergeClusters(variable.cluster, eObjectCluster)
		}
		if (clusterIterator.hasNext) {
			throw new IllegalStateException("Multiple clusters for EObject " + value)
		}
		logicModel.constraints += constraint
		constraint
	}

	def addConstantJavaObjectConstraint(Variable variable, Object value) {
		val constraint = LogicModelFactory.eINSTANCE.createConstantJavaObjectConstraint
		constraint.variable = variable
		constraint.value = value
		constraint.valueType = value.class
		val clusterIterator = javaObjectClusterMatcher.getAllValuesOfRep(logicModel, value).iterator
		if (clusterIterator.hasNext) {
			val javaObjectCluster = clusterIterator.next
			logicModelManager.mergeClusters(variable.cluster, javaObjectCluster)
		}
		if (clusterIterator.hasNext) {
			throw new IllegalStateException("Multiple clusters for java Object " + value)
		}
		logicModel.constraints += constraint
		constraint
	}

	def addRelationConstraint(Variable left, Variable right, EStructuralFeature relation) {
		val constraint = LogicModelFactory.eINSTANCE.createRelationConstraint
		constraint.left = left
		constraint.right = right
		constraint.targetRelation = relation
		logicModel.constraints += constraint
		constraint
	}

	def void removeConstraints(Collection<Constraint> constraints) {
		logicModel.constraints.removeAll(constraints)
		for (constraint : constraints) {
			onConstraintRemoved(constraint)
		}
	}

	protected dispatch def void onConstraintRemoved(EquivalenceConstraint constraint) {
		splitCluster(constraint.left.cluster)
	}
	
	protected dispatch def void onConstraintRemoved(ConstantEObjectConstraint constraint) {
		splitCluster(constraint.variable.cluster)
	}
	
	protected dispatch def void onConstraintRemoved(ConstantJavaObjectConstraint constraint) {
		splitCluster(constraint.variable.cluster)
	}

	protected dispatch def void onConstraintRemoved(Constraint constraint) {
		// Do nothing.
	}

	protected def splitCluster(Cluster cluster) {
		val remaining = new HashSet
		remaining.addAll(cluster.variables)
		val variablesToKeep = dfs(remaining.head)
		remaining.removeAll(variablesToKeep)
		while (!remaining.empty) {
			val nextCluster = dfs(remaining.head)
			remaining.removeAll(nextCluster)
			logicModelManager.newCluster(nextCluster)
		}
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
