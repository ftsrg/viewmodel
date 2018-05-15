/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel#getRailwayElement <em>Railway Element</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage#getErrorModel()
 * @model abstract="true"
 * @generated
 */
public interface ErrorModel extends EObject {
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
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage#getErrorModel_RailwayElement()
	 * @model required="true"
	 * @generated
	 */
	RailwayElement getRailwayElement();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel#getRailwayElement <em>Railway Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Railway Element</em>' reference.
	 * @see #getRailwayElement()
	 * @generated
	 */
	void setRailwayElement(RailwayElement value);

} // ErrorModel
