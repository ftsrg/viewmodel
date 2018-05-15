/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends RailwayElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the Train Benchmark and ViewModel projects\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement#getMonitoredBy <em>Monitored By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSensor_Monitors()
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement#getMonitoredBy
	 * @model opposite="monitoredBy"
	 * @generated
	 */
	EList<TrackElement> getMonitors();

} // Sensor
