/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends TrackElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the Train Benchmark and ViewModel projects\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Current Position</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Position</em>' attribute.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Position
	 * @see #setCurrentPosition(Position)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSwitch_CurrentPosition()
	 * @model unique="false"
	 * @generated
	 */
	Position getCurrentPosition();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch#getCurrentPosition <em>Current Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Position</em>' attribute.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Position
	 * @see #getCurrentPosition()
	 * @generated
	 */
	void setCurrentPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Positions</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSwitch_Positions()
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<SwitchPosition> getPositions();

} // Switch
