/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRailway2StochasticPetriNetTrace()
 * @model
 * @generated
 */
public interface Railway2StochasticPetriNetTrace extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Links</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRailway2StochasticPetriNetTrace_TraceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(RailwayContainer)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#getRailway2StochasticPetriNetTrace_Source()
	 * @model
	 * @generated
	 */
	RailwayContainer getSource();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RailwayContainer value);

} // Railway2StochasticPetriNetTrace
