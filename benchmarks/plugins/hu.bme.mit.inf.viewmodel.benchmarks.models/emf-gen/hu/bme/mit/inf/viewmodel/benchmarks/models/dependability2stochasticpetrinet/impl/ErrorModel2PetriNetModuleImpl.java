/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model2 Petri Net Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.ErrorModel2PetriNetModuleImpl#getErrorModel <em>Error Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.ErrorModel2PetriNetModuleImpl#getUp <em>Up</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.ErrorModel2PetriNetModuleImpl#getDown <em>Down</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.ErrorModel2PetriNetModuleImpl#getRepair <em>Repair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorModel2PetriNetModuleImpl extends PetriNetModuleTraceLinkImpl implements ErrorModel2PetriNetModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The cached value of the '{@link #getErrorModel() <em>Error Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModel()
	 * @generated
	 * @ordered
	 */
	protected ErrorModel errorModel;

	/**
	 * The cached value of the '{@link #getUp() <em>Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUp()
	 * @generated
	 * @ordered
	 */
	protected Place up;

	/**
	 * The cached value of the '{@link #getDown() <em>Down</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDown()
	 * @generated
	 * @ordered
	 */
	protected Place down;

	/**
	 * The cached value of the '{@link #getRepair() <em>Repair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepair()
	 * @generated
	 * @ordered
	 */
	protected Transition repair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModel2PetriNetModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability2StochasticPetriNetPackage.Literals.ERROR_MODEL2_PETRI_NET_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModel getErrorModel() {
		if (errorModel != null && errorModel.eIsProxy()) {
			InternalEObject oldErrorModel = (InternalEObject)errorModel;
			errorModel = (ErrorModel)eResolveProxy(oldErrorModel);
			if (errorModel != oldErrorModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL, oldErrorModel, errorModel));
			}
		}
		return errorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModel basicGetErrorModel() {
		return errorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorModel(ErrorModel newErrorModel) {
		ErrorModel oldErrorModel = errorModel;
		errorModel = newErrorModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL, oldErrorModel, errorModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getUp() {
		if (up != null && up.eIsProxy()) {
			InternalEObject oldUp = (InternalEObject)up;
			up = (Place)eResolveProxy(oldUp);
			if (up != oldUp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__UP, oldUp, up));
			}
		}
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetUp() {
		return up;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUp(Place newUp) {
		Place oldUp = up;
		up = newUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__UP, oldUp, up));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getDown() {
		if (down != null && down.eIsProxy()) {
			InternalEObject oldDown = (InternalEObject)down;
			down = (Place)eResolveProxy(oldDown);
			if (down != oldDown) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__DOWN, oldDown, down));
			}
		}
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetDown() {
		return down;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDown(Place newDown) {
		Place oldDown = down;
		down = newDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__DOWN, oldDown, down));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getRepair() {
		if (repair != null && repair.eIsProxy()) {
			InternalEObject oldRepair = (InternalEObject)repair;
			repair = (Transition)eResolveProxy(oldRepair);
			if (repair != oldRepair) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__REPAIR, oldRepair, repair));
			}
		}
		return repair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetRepair() {
		return repair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepair(Transition newRepair) {
		Transition oldRepair = repair;
		repair = newRepair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__REPAIR, oldRepair, repair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL:
				if (resolve) return getErrorModel();
				return basicGetErrorModel();
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__UP:
				if (resolve) return getUp();
				return basicGetUp();
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__DOWN:
				if (resolve) return getDown();
				return basicGetDown();
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__REPAIR:
				if (resolve) return getRepair();
				return basicGetRepair();
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
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL:
				setErrorModel((ErrorModel)newValue);
				return;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__UP:
				setUp((Place)newValue);
				return;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__DOWN:
				setDown((Place)newValue);
				return;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__REPAIR:
				setRepair((Transition)newValue);
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
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL:
				setErrorModel((ErrorModel)null);
				return;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__UP:
				setUp((Place)null);
				return;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__DOWN:
				setDown((Place)null);
				return;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__REPAIR:
				setRepair((Transition)null);
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
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL:
				return errorModel != null;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__UP:
				return up != null;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__DOWN:
				return down != null;
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE__REPAIR:
				return repair != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorModel2PetriNetModuleImpl
