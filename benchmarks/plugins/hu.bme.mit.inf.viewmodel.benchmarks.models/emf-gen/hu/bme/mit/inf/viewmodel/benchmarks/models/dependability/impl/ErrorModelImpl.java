/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ErrorModelImpl#getRailwayElement <em>Railway Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ErrorModelImpl extends MinimalEObjectImpl.Container implements ErrorModel {
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
	protected ErrorModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependabilityPackage.Literals.ERROR_MODEL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DependabilityPackage.ERROR_MODEL__RAILWAY_ELEMENT, oldRailwayElement, railwayElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependabilityPackage.ERROR_MODEL__RAILWAY_ELEMENT, oldRailwayElement, railwayElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DependabilityPackage.ERROR_MODEL__RAILWAY_ELEMENT:
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
			case DependabilityPackage.ERROR_MODEL__RAILWAY_ELEMENT:
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
			case DependabilityPackage.ERROR_MODEL__RAILWAY_ELEMENT:
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
			case DependabilityPackage.ERROR_MODEL__RAILWAY_ELEMENT:
				return railwayElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorModelImpl
