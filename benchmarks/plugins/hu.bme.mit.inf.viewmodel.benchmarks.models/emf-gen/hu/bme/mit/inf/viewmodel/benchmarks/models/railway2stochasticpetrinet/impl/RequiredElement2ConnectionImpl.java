/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayElement;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Element2 Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2ConnectionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2ConnectionImpl#getRailwayElement <em>Railway Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiredElement2ConnectionImpl extends PetriNetModuleTraceLinkImpl implements RequiredElement2Connection {
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
	 * The cached value of the '{@link #getRailwayElement() <em>Railway Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailwayElement()
	 * @generated
	 * @ordered
	 */
	protected RailwayElement railwayElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredElement2ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Railway2StochasticPetriNetPackage.Literals.REQUIRED_ELEMENT2_CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__ROUTE, oldRoute, route));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__ROUTE, oldRoute, route));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT, oldRailwayElement, railwayElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT, oldRailwayElement, railwayElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT:
				if (resolve) return getRailwayElement();
				return basicGetRailwayElement();
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
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__ROUTE:
				setRoute((Route)newValue);
				return;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT:
				setRailwayElement((RailwayElement)newValue);
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
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__ROUTE:
				setRoute((Route)null);
				return;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT:
				setRailwayElement((RailwayElement)null);
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
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__ROUTE:
				return route != null;
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT:
				return railwayElement != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredElement2ConnectionImpl
