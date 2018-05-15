/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage
 * @generated
 */
public interface LogicModelFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicModelFactory eINSTANCE = hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Model</em>'.
	 * @generated
	 */
	LogicModel createLogicModel();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>EClass Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass Constraint</em>'.
	 * @generated
	 */
	EClassConstraint createEClassConstraint();

	/**
	 * Returns a new object of class '<em>Java Class Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Class Constraint</em>'.
	 * @generated
	 */
	JavaClassConstraint createJavaClassConstraint();

	/**
	 * Returns a new object of class '<em>Constant EObject Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant EObject Constraint</em>'.
	 * @generated
	 */
	ConstantEObjectConstraint createConstantEObjectConstraint();

	/**
	 * Returns a new object of class '<em>Constant Java Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Java Object Constraint</em>'.
	 * @generated
	 */
	ConstantJavaObjectConstraint createConstantJavaObjectConstraint();

	/**
	 * Returns a new object of class '<em>Equivalence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equivalence Constraint</em>'.
	 * @generated
	 */
	EquivalenceConstraint createEquivalenceConstraint();

	/**
	 * Returns a new object of class '<em>Relation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Constraint</em>'.
	 * @generated
	 */
	RelationConstraint createRelationConstraint();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns a new object of class '<em>Manifestation Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manifestation Trace</em>'.
	 * @generated
	 */
	ManifestationTrace createManifestationTrace();

	/**
	 * Returns a new object of class '<em>Interpreted Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpreted Manifestation</em>'.
	 * @generated
	 */
	InterpretedManifestation createInterpretedManifestation();

	/**
	 * Returns a new object of class '<em>Uninterpreted Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uninterpreted Manifestation</em>'.
	 * @generated
	 */
	UninterpretedManifestation createUninterpretedManifestation();

	/**
	 * Returns a new object of class '<em>Primitive Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Manifestation</em>'.
	 * @generated
	 */
	PrimitiveManifestation createPrimitiveManifestation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogicModelPackage getLogicModelPackage();

} //LogicModelFactory
