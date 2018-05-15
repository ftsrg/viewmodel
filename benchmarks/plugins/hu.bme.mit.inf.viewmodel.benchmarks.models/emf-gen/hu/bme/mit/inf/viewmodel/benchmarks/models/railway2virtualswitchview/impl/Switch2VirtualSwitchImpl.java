/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch;

import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch2 Virtual Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Switch2VirtualSwitchImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Switch2VirtualSwitchImpl#getVirtualSwitch <em>Virtual Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Switch2VirtualSwitchImpl extends MinimalEObjectImpl.Container implements Switch2VirtualSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected Switch switch_;

	/**
	 * The cached value of the '{@link #getVirtualSwitch() <em>Virtual Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSwitch()
	 * @generated
	 * @ordered
	 */
	protected VirtualSwitch virtualSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Switch2VirtualSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Railway2VirtualSwitchViewPackage.Literals.SWITCH2_VIRTUAL_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch getSwitch() {
		if (switch_ != null && switch_.eIsProxy()) {
			InternalEObject oldSwitch = (InternalEObject)switch_;
			switch_ = (Switch)eResolveProxy(oldSwitch);
			if (switch_ != oldSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__SWITCH, oldSwitch, switch_));
			}
		}
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch basicGetSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitch(Switch newSwitch) {
		Switch oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__SWITCH, oldSwitch, switch_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSwitch getVirtualSwitch() {
		if (virtualSwitch != null && virtualSwitch.eIsProxy()) {
			InternalEObject oldVirtualSwitch = (InternalEObject)virtualSwitch;
			virtualSwitch = (VirtualSwitch)eResolveProxy(oldVirtualSwitch);
			if (virtualSwitch != oldVirtualSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH, oldVirtualSwitch, virtualSwitch));
			}
		}
		return virtualSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSwitch basicGetVirtualSwitch() {
		return virtualSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualSwitch(VirtualSwitch newVirtualSwitch) {
		VirtualSwitch oldVirtualSwitch = virtualSwitch;
		virtualSwitch = newVirtualSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH, oldVirtualSwitch, virtualSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__SWITCH:
				if (resolve) return getSwitch();
				return basicGetSwitch();
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH:
				if (resolve) return getVirtualSwitch();
				return basicGetVirtualSwitch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__SWITCH:
				setSwitch((Switch)newValue);
				return;
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH:
				setVirtualSwitch((VirtualSwitch)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__SWITCH:
				setSwitch((Switch)null);
				return;
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH:
				setVirtualSwitch((VirtualSwitch)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__SWITCH:
				return switch_ != null;
			case Railway2VirtualSwitchViewPackage.SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH:
				return virtualSwitch != null;
		}
		return super.eIsSet(featureID);
	}

} //Switch2VirtualSwitchImpl
