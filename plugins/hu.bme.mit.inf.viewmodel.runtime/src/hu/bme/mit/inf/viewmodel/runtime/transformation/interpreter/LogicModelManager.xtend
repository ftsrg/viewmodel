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
package hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter

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

	def newEmptyCluster() {
		val newCluster = LogicModelFactory.eINSTANCE.createCluster
		newCluster.id = clusterId
		clusterId++
		newCluster
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
		// Nothing to be done, variables are removed by removing their containing
		// Trace from the scope.
	}
}
