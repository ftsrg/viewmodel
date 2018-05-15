/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.TraceLink;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetTraceImpl#getRailwayContainer <em>Railway Container</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetTraceImpl#getDependabilityModel <em>Dependability Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetTraceImpl#getTraceLinks <em>Trace Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Dependability2StochasticPetriNetTraceImpl extends MinimalEObjectImpl.Container implements Dependability2StochasticPetriNetTrace {
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
	 * The cached value of the '{@link #getDependabilityModel() <em>Dependability Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependabilityModel()
	 * @generated
	 * @ordered
	 */
	protected DependabilityModel dependabilityModel;

	/**
	 * The cached value of the '{@link #getTraceLinks() <em>Trace Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceLink> traceLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dependability2StochasticPetriNetTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dependability2StochasticPetriNetPackage.Literals.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER, oldRailwayContainer, railwayContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER, oldRailwayContainer, railwayContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityModel getDependabilityModel() {
		if (dependabilityModel != null && dependabilityModel.eIsProxy()) {
			InternalEObject oldDependabilityModel = (InternalEObject)dependabilityModel;
			dependabilityModel = (DependabilityModel)eResolveProxy(oldDependabilityModel);
			if (dependabilityModel != oldDependabilityModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL, oldDependabilityModel, dependabilityModel));
			}
		}
		return dependabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityModel basicGetDependabilityModel() {
		return dependabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependabilityModel(DependabilityModel newDependabilityModel) {
		DependabilityModel oldDependabilityModel = dependabilityModel;
		dependabilityModel = newDependabilityModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL, oldDependabilityModel, dependabilityModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceLink> getTraceLinks() {
		if (traceLinks == null) {
			traceLinks = new EObjectContainmentEList<TraceLink>(TraceLink.class, this, Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS);
		}
		return traceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				return ((InternalEList<?>)getTraceLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER:
				if (resolve) return getRailwayContainer();
				return basicGetRailwayContainer();
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL:
				if (resolve) return getDependabilityModel();
				return basicGetDependabilityModel();
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				return getTraceLinks();
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
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER:
				setRailwayContainer((RailwayContainer)newValue);
				return;
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL:
				setDependabilityModel((DependabilityModel)newValue);
				return;
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				getTraceLinks().clear();
				getTraceLinks().addAll((Collection<? extends TraceLink>)newValue);
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
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER:
				setRailwayContainer((RailwayContainer)null);
				return;
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL:
				setDependabilityModel((DependabilityModel)null);
				return;
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				getTraceLinks().clear();
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
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER:
				return railwayContainer != null;
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL:
				return dependabilityModel != null;
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS:
				return traceLinks != null && !traceLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Dependability2StochasticPetriNetTraceImpl
