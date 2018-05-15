/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage
 * @generated
 */
public interface Dependability2StochasticPetriNetFactory extends EFactory {
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
	Dependability2StochasticPetriNetFactory eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Dependability2StochasticPetriNetTrace createDependability2StochasticPetriNetTrace();

	/**
	 * Returns a new object of class '<em>Error Model2 Petri Net Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model2 Petri Net Module</em>'.
	 * @generated
	 */
	ErrorModel2PetriNetModule createErrorModel2PetriNetModule();

	/**
	 * Returns a new object of class '<em>Railway Container2 Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Railway Container2 Petri Net</em>'.
	 * @generated
	 */
	RailwayContainer2PetriNet createRailwayContainer2PetriNet();

	/**
	 * Returns a new object of class '<em>Required Element2 Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Element2 Connection</em>'.
	 * @generated
	 */
	RequiredElement2Connection createRequiredElement2Connection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Dependability2StochasticPetriNetPackage getDependability2StochasticPetriNetPackage();

} //Dependability2StochasticPetriNetFactory
