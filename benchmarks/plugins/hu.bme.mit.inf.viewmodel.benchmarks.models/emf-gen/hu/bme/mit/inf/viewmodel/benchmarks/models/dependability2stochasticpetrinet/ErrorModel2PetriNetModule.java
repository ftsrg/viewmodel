/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model2 Petri Net Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getErrorModel <em>Error Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getUp <em>Up</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getDown <em>Down</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getRepair <em>Repair</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getErrorModel2PetriNetModule()
 * @model
 * @generated
 */
public interface ErrorModel2PetriNetModule extends PetriNetModuleTraceLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model</em>' reference.
	 * @see #setErrorModel(ErrorModel)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getErrorModel2PetriNetModule_ErrorModel()
	 * @model required="true"
	 * @generated
	 */
	ErrorModel getErrorModel();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getErrorModel <em>Error Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Model</em>' reference.
	 * @see #getErrorModel()
	 * @generated
	 */
	void setErrorModel(ErrorModel value);

	/**
	 * Returns the value of the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Up</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up</em>' reference.
	 * @see #setUp(Place)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getErrorModel2PetriNetModule_Up()
	 * @model required="true"
	 * @generated
	 */
	Place getUp();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getUp <em>Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up</em>' reference.
	 * @see #getUp()
	 * @generated
	 */
	void setUp(Place value);

	/**
	 * Returns the value of the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Down</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Down</em>' reference.
	 * @see #setDown(Place)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getErrorModel2PetriNetModule_Down()
	 * @model required="true"
	 * @generated
	 */
	Place getDown();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getDown <em>Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Down</em>' reference.
	 * @see #getDown()
	 * @generated
	 */
	void setDown(Place value);

	/**
	 * Returns the value of the '<em><b>Repair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repair</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repair</em>' reference.
	 * @see #setRepair(Transition)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getErrorModel2PetriNetModule_Repair()
	 * @model required="true"
	 * @generated
	 */
	Transition getRepair();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getRepair <em>Repair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repair</em>' reference.
	 * @see #getRepair()
	 * @generated
	 */
	void setRepair(Transition value);

} // ErrorModel2PetriNetModule
