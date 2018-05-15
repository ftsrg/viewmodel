/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayElement;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Element2 Failure Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getRailwayElement <em>Railway Element</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getOperational <em>Operational</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getFailed <em>Failed</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRequiredElement2FailureModel()
 * @model
 * @generated
 */
public interface RequiredElement2FailureModel extends PetriNetModuleTraceLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Railway Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Railway Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Railway Element</em>' reference.
	 * @see #setRailwayElement(RailwayElement)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRequiredElement2FailureModel_RailwayElement()
	 * @model
	 * @generated
	 */
	RailwayElement getRailwayElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getRailwayElement <em>Railway Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Railway Element</em>' reference.
	 * @see #getRailwayElement()
	 * @generated
	 */
	void setRailwayElement(RailwayElement value);

	/**
	 * Returns the value of the '<em><b>Operational</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational</em>' reference.
	 * @see #setOperational(Place)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRequiredElement2FailureModel_Operational()
	 * @model
	 * @generated
	 */
	Place getOperational();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getOperational <em>Operational</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational</em>' reference.
	 * @see #getOperational()
	 * @generated
	 */
	void setOperational(Place value);

	/**
	 * Returns the value of the '<em><b>Failed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed</em>' reference.
	 * @see #setFailed(Place)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRequiredElement2FailureModel_Failed()
	 * @model
	 * @generated
	 */
	Place getFailed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getFailed <em>Failed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed</em>' reference.
	 * @see #getFailed()
	 * @generated
	 */
	void setFailed(Place value);

} // RequiredElement2FailureModel
