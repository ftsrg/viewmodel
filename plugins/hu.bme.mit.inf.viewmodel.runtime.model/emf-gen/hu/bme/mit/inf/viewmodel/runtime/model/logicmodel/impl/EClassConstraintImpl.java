/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EClassConstraintImpl#getTargetEClass <em>Target EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassConstraintImpl extends UnaryConstraintImpl implements EClassConstraint {
	/**
	 * The cached value of the '{@link #getTargetEClass() <em>Target EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass targetEClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicModelPackage.Literals.ECLASS_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetEClass() {
		if (targetEClass != null && targetEClass.eIsProxy()) {
			InternalEObject oldTargetEClass = (InternalEObject)targetEClass;
			targetEClass = (EClass)eResolveProxy(oldTargetEClass);
			if (targetEClass != oldTargetEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicModelPackage.ECLASS_CONSTRAINT__TARGET_ECLASS, oldTargetEClass, targetEClass));
			}
		}
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetEClass() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEClass(EClass newTargetEClass) {
		EClass oldTargetEClass = targetEClass;
		targetEClass = newTargetEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.ECLASS_CONSTRAINT__TARGET_ECLASS, oldTargetEClass, targetEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicModelPackage.ECLASS_CONSTRAINT__TARGET_ECLASS:
				if (resolve) return getTargetEClass();
				return basicGetTargetEClass();
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
			case LogicModelPackage.ECLASS_CONSTRAINT__TARGET_ECLASS:
				setTargetEClass((EClass)newValue);
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
			case LogicModelPackage.ECLASS_CONSTRAINT__TARGET_ECLASS:
				setTargetEClass((EClass)null);
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
			case LogicModelPackage.ECLASS_CONSTRAINT__TARGET_ECLASS:
				return targetEClass != null;
		}
		return super.eIsSet(featureID);
	}

} //EClassConstraintImpl
