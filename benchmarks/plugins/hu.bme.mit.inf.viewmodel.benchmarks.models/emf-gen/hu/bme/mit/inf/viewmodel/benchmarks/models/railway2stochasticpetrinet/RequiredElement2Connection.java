/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayElement;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Element2 Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection#getRoute <em>Route</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection#getRailwayElement <em>Railway Element</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRequiredElement2Connection()
 * @model
 * @generated
 */
public interface RequiredElement2Connection extends PetriNetModuleTraceLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRequiredElement2Connection_Route()
	 * @model
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

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
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRequiredElement2Connection_RailwayElement()
	 * @model
	 * @generated
	 */
	RailwayElement getRailwayElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection#getRailwayElement <em>Railway Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Railway Element</em>' reference.
	 * @see #getRailwayElement()
	 * @generated
	 */
	void setRailwayElement(RailwayElement value);

} // RequiredElement2Connection
