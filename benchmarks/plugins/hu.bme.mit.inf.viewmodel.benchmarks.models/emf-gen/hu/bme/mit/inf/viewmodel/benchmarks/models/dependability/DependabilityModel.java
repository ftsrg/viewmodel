/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel#getErrorModels <em>Error Models</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage#getDependabilityModel()
 * @model
 * @generated
 */
public interface DependabilityModel extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Error Models</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Models</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage#getDependabilityModel_ErrorModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorModel> getErrorModels();

} // DependabilityModel
