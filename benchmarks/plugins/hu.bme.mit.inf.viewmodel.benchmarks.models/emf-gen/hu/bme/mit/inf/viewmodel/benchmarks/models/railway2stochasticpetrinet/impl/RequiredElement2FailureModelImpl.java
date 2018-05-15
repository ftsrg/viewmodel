/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayElement;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Element2 Failure Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2FailureModelImpl#getRailwayElement <em>Railway Element</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2FailureModelImpl#getOperational <em>Operational</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2FailureModelImpl#getFailed <em>Failed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredElement2FailureModelImpl extends PetriNetModuleTraceLinkImpl implements RequiredElement2FailureModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The cached value of the '{@link #getRailwayElement() <em>Railway Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailwayElement()
	 * @generated
	 * @ordered
	 */
	protected RailwayElement railwayElement;

	/**
	 * The cached value of the '{@link #getOperational() <em>Operational</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperational()
	 * @generated
	 * @ordered
	 */
	protected Place operational;

	/**
	 * The cached value of the '{@link #getFailed() <em>Failed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailed()
	 * @generated
	 * @ordered
	 */
	protected Place failed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredElement2FailureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Railway2StochasticPetriNetPackage.Literals.REQUIRED_ELEMENT2_FAILURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayElement getRailwayElement() {
		if (railwayElement != null && railwayElement.eIsProxy()) {
			InternalEObject oldRailwayElement = (InternalEObject)railwayElement;
			railwayElement = (RailwayElement)eResolveProxy(oldRailwayElement);
			if (railwayElement != oldRailwayElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT, oldRailwayElement, railwayElement));
			}
		}
		return railwayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayElement basicGetRailwayElement() {
		return railwayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRailwayElement(RailwayElement newRailwayElement) {
		RailwayElement oldRailwayElement = railwayElement;
		railwayElement = newRailwayElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT, oldRailwayElement, railwayElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getOperational() {
		if (operational != null && operational.eIsProxy()) {
			InternalEObject oldOperational = (InternalEObject)operational;
			operational = (Place)eResolveProxy(oldOperational);
			if (operational != oldOperational) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL, oldOperational, operational));
			}
		}
		return operational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetOperational() {
		return operational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperational(Place newOperational) {
		Place oldOperational = operational;
		operational = newOperational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL, oldOperational, operational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getFailed() {
		if (failed != null && failed.eIsProxy()) {
			InternalEObject oldFailed = (InternalEObject)failed;
			failed = (Place)eResolveProxy(oldFailed);
			if (failed != oldFailed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED, oldFailed, failed));
			}
		}
		return failed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetFailed() {
		return failed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailed(Place newFailed) {
		Place oldFailed = failed;
		failed = newFailed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED, oldFailed, failed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT:
				if (resolve) return getRailwayElement();
				return basicGetRailwayElement();
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL:
				if (resolve) return getOperational();
				return basicGetOperational();
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED:
				if (resolve) return getFailed();
				return basicGetFailed();
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
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT:
				setRailwayElement((RailwayElement)newValue);
				return;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL:
				setOperational((Place)newValue);
				return;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED:
				setFailed((Place)newValue);
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
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT:
				setRailwayElement((RailwayElement)null);
				return;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL:
				setOperational((Place)null);
				return;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED:
				setFailed((Place)null);
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
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT:
				return railwayElement != null;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL:
				return operational != null;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED:
				return failed != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredElement2FailureModelImpl
