/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ImmediateTransition;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route2 Failure Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Route2FailureModelImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Route2FailureModelImpl#getOperational <em>Operational</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Route2FailureModelImpl#getFailed <em>Failed</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Route2FailureModelImpl#getRepair <em>Repair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Route2FailureModelImpl extends PetriNetModuleTraceLinkImpl implements Route2FailureModel {
	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

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
	 * The cached value of the '{@link #getRepair() <em>Repair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepair()
	 * @generated
	 * @ordered
	 */
	protected ImmediateTransition repair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Route2FailureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Railway2StochasticPetriNetPackage.Literals.ROUTE2_FAILURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (Route)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__ROUTE, oldRoute, route));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__OPERATIONAL, oldOperational, operational));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__OPERATIONAL, oldOperational, operational));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__FAILED, oldFailed, failed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__FAILED, oldFailed, failed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateTransition getRepair() {
		if (repair != null && repair.eIsProxy()) {
			InternalEObject oldRepair = (InternalEObject)repair;
			repair = (ImmediateTransition)eResolveProxy(oldRepair);
			if (repair != oldRepair) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__REPAIR, oldRepair, repair));
			}
		}
		return repair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateTransition basicGetRepair() {
		return repair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepair(ImmediateTransition newRepair) {
		ImmediateTransition oldRepair = repair;
		repair = newRepair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__REPAIR, oldRepair, repair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__OPERATIONAL:
				if (resolve) return getOperational();
				return basicGetOperational();
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__FAILED:
				if (resolve) return getFailed();
				return basicGetFailed();
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__REPAIR:
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
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__ROUTE:
				setRoute((Route)newValue);
				return;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__OPERATIONAL:
				setOperational((Place)newValue);
				return;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__FAILED:
				setFailed((Place)newValue);
				return;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__REPAIR:
				setRepair((ImmediateTransition)newValue);
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
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__ROUTE:
				setRoute((Route)null);
				return;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__OPERATIONAL:
				setOperational((Place)null);
				return;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__FAILED:
				setFailed((Place)null);
				return;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__REPAIR:
				setRepair((ImmediateTransition)null);
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
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__ROUTE:
				return route != null;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__OPERATIONAL:
				return operational != null;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__FAILED:
				return failed != null;
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL__REPAIR:
				return repair != null;
		}
		return super.eIsSet(featureID);
	}

} //Route2FailureModelImpl
