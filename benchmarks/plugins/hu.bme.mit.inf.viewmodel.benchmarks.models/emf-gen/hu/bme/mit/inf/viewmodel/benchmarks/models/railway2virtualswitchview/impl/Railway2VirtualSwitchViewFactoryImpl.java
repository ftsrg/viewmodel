/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Railway2VirtualSwitchViewFactoryImpl extends EFactoryImpl implements Railway2VirtualSwitchViewFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Railway2VirtualSwitchViewFactory init() {
		try {
			Railway2VirtualSwitchViewFactory theRailway2VirtualSwitchViewFactory = (Railway2VirtualSwitchViewFactory)EPackage.Registry.INSTANCE.getEFactory(Railway2VirtualSwitchViewPackage.eNS_URI);
			if (theRailway2VirtualSwitchViewFactory != null) {
				return theRailway2VirtualSwitchViewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Railway2VirtualSwitchViewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2VirtualSwitchViewFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH: return createSwitch2VirtualSwitch();
			case Railway2VirtualSwitchViewPackage.RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE: return createRailway2VirtualSwitchViewTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch2VirtualSwitch createSwitch2VirtualSwitch() {
		Switch2VirtualSwitchImpl switch2VirtualSwitch = new Switch2VirtualSwitchImpl();
		return switch2VirtualSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2VirtualSwitchViewTrace createRailway2VirtualSwitchViewTrace() {
		Railway2VirtualSwitchViewTraceImpl railway2VirtualSwitchViewTrace = new Railway2VirtualSwitchViewTraceImpl();
		return railway2VirtualSwitchViewTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2VirtualSwitchViewPackage getRailway2VirtualSwitchViewPackage() {
		return (Railway2VirtualSwitchViewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Railway2VirtualSwitchViewPackage getPackage() {
		return Railway2VirtualSwitchViewPackage.eINSTANCE;
	}

} //Railway2VirtualSwitchViewFactoryImpl
