/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement#getMonitoredBy <em>Monitored By</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement#getConnectsTo <em>Connects To</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getTrackElement()
 * @model abstract="true"
 * @generated
 */
public interface TrackElement extends RailwayElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the Train Benchmark and ViewModel projects\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Monitored By</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored By</em>' reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getTrackElement_MonitoredBy()
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor#getMonitors
	 * @model opposite="monitors"
	 * @generated
	 */
	EList<Sensor> getMonitoredBy();

	/**
	 * Returns the value of the '<em><b>Connects To</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects To</em>' reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getTrackElement_ConnectsTo()
	 * @model
	 * @generated
	 */
	EList<TrackElement> getConnectsTo();

} // TrackElement
