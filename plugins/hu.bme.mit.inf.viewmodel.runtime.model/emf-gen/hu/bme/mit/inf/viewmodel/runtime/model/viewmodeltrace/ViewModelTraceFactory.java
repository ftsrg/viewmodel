/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage
 * @generated
 */
public interface ViewModelTraceFactory extends EFactory {
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
	ViewModelTraceFactory eINSTANCE = hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>View Model Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Model Trace</em>'.
	 * @generated
	 */
	ViewModelTrace createViewModelTrace();

	/**
	 * Returns a new object of class '<em>Match Argument Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Argument Tuple</em>'.
	 * @generated
	 */
	MatchArgumentTuple createMatchArgumentTuple();

	/**
	 * Returns a new object of class '<em>EObject Match Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Match Argument</em>'.
	 * @generated
	 */
	EObjectMatchArgument createEObjectMatchArgument();

	/**
	 * Returns a new object of class '<em>Java Object Match Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Object Match Argument</em>'.
	 * @generated
	 */
	JavaObjectMatchArgument createJavaObjectMatchArgument();

	/**
	 * Returns a new object of class '<em>Variable Instantiation Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Instantiation Trace</em>'.
	 * @generated
	 */
	VariableInstantiationTrace createVariableInstantiationTrace();

	/**
	 * Returns a new object of class '<em>String Variable Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Variable Pair</em>'.
	 * @generated
	 */
	StringVariablePair createStringVariablePair();

	/**
	 * Returns a new object of class '<em>Constraint Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Trace</em>'.
	 * @generated
	 */
	ConstraintTrace createConstraintTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewModelTracePackage getViewModelTracePackage();

} //ViewModelTraceFactory
