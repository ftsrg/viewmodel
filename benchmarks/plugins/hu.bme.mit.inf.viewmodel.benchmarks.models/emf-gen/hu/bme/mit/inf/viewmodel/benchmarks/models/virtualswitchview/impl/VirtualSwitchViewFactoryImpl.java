/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.*;

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
public class VirtualSwitchViewFactoryImpl extends EFactoryImpl implements VirtualSwitchViewFactory {
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
	public static VirtualSwitchViewFactory init() {
		try {
			VirtualSwitchViewFactory theVirtualSwitchViewFactory = (VirtualSwitchViewFactory)EPackage.Registry.INSTANCE.getEFactory(VirtualSwitchViewPackage.eNS_URI);
			if (theVirtualSwitchViewFactory != null) {
				return theVirtualSwitchViewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VirtualSwitchViewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSwitchViewFactoryImpl() {
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
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH: return createVirtualSwitch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSwitch createVirtualSwitch() {
		VirtualSwitchImpl virtualSwitch = new VirtualSwitchImpl();
		return virtualSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSwitchViewPackage getVirtualSwitchViewPackage() {
		return (VirtualSwitchViewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VirtualSwitchViewPackage getPackage() {
		return VirtualSwitchViewPackage.eINSTANCE;
	}

} //VirtualSwitchViewFactoryImpl
