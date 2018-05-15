/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RailwayContainer2PetriNet;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Railway Container2 Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl#getRailwayContainer <em>Railway Container</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailwayContainer2PetriNetImpl extends TraceLinkImpl implements RailwayContainer2PetriNet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The cached value of the '{@link #getRailwayContainer() <em>Railway Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailwayContainer()
	 * @generated
	 * @ordered
	 */
	protected RailwayContainer railwayContainer;

	/**
	 * The cached value of the '{@link #getPetriNet() <em>Petri Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetriNet()
	 * @generated
	 * @ordered
	 */
	protected PetriNet petriNet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailwayContainer2PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Railway2StochasticPetriNetPackage.Literals.RAILWAY_CONTAINER2_PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainer getRailwayContainer() {
		if (railwayContainer != null && railwayContainer.eIsProxy()) {
			InternalEObject oldRailwayContainer = (InternalEObject)railwayContainer;
			railwayContainer = (RailwayContainer)eResolveProxy(oldRailwayContainer);
			if (railwayContainer != oldRailwayContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER, oldRailwayContainer, railwayContainer));
			}
		}
		return railwayContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainer basicGetRailwayContainer() {
		return railwayContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRailwayContainer(RailwayContainer newRailwayContainer) {
		RailwayContainer oldRailwayContainer = railwayContainer;
		railwayContainer = newRailwayContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER, oldRailwayContainer, railwayContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getPetriNet() {
		if (petriNet != null && petriNet.eIsProxy()) {
			InternalEObject oldPetriNet = (InternalEObject)petriNet;
			petriNet = (PetriNet)eResolveProxy(oldPetriNet);
			if (petriNet != oldPetriNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET, oldPetriNet, petriNet));
			}
		}
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetPetriNet() {
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetriNet(PetriNet newPetriNet) {
		PetriNet oldPetriNet = petriNet;
		petriNet = newPetriNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET, oldPetriNet, petriNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER:
				if (resolve) return getRailwayContainer();
				return basicGetRailwayContainer();
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET:
				if (resolve) return getPetriNet();
				return basicGetPetriNet();
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
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER:
				setRailwayContainer((RailwayContainer)newValue);
				return;
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET:
				setPetriNet((PetriNet)newValue);
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
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER:
				setRailwayContainer((RailwayContainer)null);
				return;
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET:
				setPetriNet((PetriNet)null);
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
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER:
				return railwayContainer != null;
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET:
				return petriNet != null;
		}
		return super.eIsSet(featureID);
	}

} //RailwayContainer2PetriNetImpl
