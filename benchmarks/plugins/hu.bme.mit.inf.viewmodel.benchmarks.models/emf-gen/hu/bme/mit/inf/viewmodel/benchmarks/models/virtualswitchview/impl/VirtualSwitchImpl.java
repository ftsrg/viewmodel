/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch;
import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchImpl#getCountConnectedInFailure <em>Count Connected In Failure</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchImpl#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualSwitchImpl extends MinimalEObjectImpl.Container implements VirtualSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The default value of the '{@link #getCountConnectedInFailure() <em>Count Connected In Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountConnectedInFailure()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_CONNECTED_IN_FAILURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountConnectedInFailure() <em>Count Connected In Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountConnectedInFailure()
	 * @generated
	 * @ordered
	 */
	protected int countConnectedInFailure = COUNT_CONNECTED_IN_FAILURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualSwitch> connectedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VirtualSwitchViewPackage.Literals.VIRTUAL_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountConnectedInFailure() {
		return countConnectedInFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountConnectedInFailure(int newCountConnectedInFailure) {
		int oldCountConnectedInFailure = countConnectedInFailure;
		countConnectedInFailure = newCountConnectedInFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualSwitchViewPackage.VIRTUAL_SWITCH__COUNT_CONNECTED_IN_FAILURE, oldCountConnectedInFailure, countConnectedInFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualSwitch> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectResolvingEList<VirtualSwitch>(VirtualSwitch.class, this, VirtualSwitchViewPackage.VIRTUAL_SWITCH__CONNECTED_TO);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH__COUNT_CONNECTED_IN_FAILURE:
				return getCountConnectedInFailure();
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH__CONNECTED_TO:
				return getConnectedTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH__COUNT_CONNECTED_IN_FAILURE:
				setCountConnectedInFailure((Integer)newValue);
				return;
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends VirtualSwitch>)newValue);
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
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH__COUNT_CONNECTED_IN_FAILURE:
				setCountConnectedInFailure(COUNT_CONNECTED_IN_FAILURE_EDEFAULT);
				return;
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH__CONNECTED_TO:
				getConnectedTo().clear();
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
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH__COUNT_CONNECTED_IN_FAILURE:
				return countConnectedInFailure != COUNT_CONNECTED_IN_FAILURE_EDEFAULT;
			case VirtualSwitchViewPackage.VIRTUAL_SWITCH__CONNECTED_TO:
				return connectedTo != null && !connectedTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (countConnectedInFailure: ");
		result.append(countConnectedInFailure);
		result.append(')');
		return result.toString();
	}

} //VirtualSwitchImpl
