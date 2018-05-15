/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition#getRoute <em>Route</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSwitchPosition()
 * @model
 * @generated
 */
public interface SwitchPosition extends RailwayElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the Train Benchmark and ViewModel projects\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Position
	 * @see #setPosition(Position)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSwitchPosition_Position()
	 * @model unique="false"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route#getFollows <em>Follows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' container reference.
	 * @see #setRoute(Route)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSwitchPosition_Route()
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route#getFollows
	 * @model opposite="follows" transient="false"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition#getRoute <em>Route</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' container reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Switch)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSwitchPosition_Target()
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch#getPositions
	 * @model opposite="positions"
	 * @generated
	 */
	Switch getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Switch value);

} // SwitchPosition
