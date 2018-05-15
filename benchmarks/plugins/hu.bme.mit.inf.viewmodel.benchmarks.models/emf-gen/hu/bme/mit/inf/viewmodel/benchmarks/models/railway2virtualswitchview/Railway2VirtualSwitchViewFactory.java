/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewPackage
 * @generated
 */
public interface Railway2VirtualSwitchViewFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Railway2VirtualSwitchViewFactory eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Switch2 Virtual Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch2 Virtual Switch</em>'.
	 * @generated
	 */
	Switch2VirtualSwitch createSwitch2VirtualSwitch();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Railway2VirtualSwitchViewTrace createRailway2VirtualSwitchViewTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Railway2VirtualSwitchViewPackage getRailway2VirtualSwitchViewPackage();

} //Railway2VirtualSwitchViewFactory
