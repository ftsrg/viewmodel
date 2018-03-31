/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.RelationConstraintImpl#getTargetRelation <em>Target Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationConstraintImpl extends BinaryConstraintImpl implements RelationConstraint {
	/**
	 * The cached value of the '{@link #getTargetRelation() <em>Target Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRelation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature targetRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicModelPackage.Literals.RELATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getTargetRelation() {
		if (targetRelation != null && targetRelation.eIsProxy()) {
			InternalEObject oldTargetRelation = (InternalEObject)targetRelation;
			targetRelation = (EStructuralFeature)eResolveProxy(oldTargetRelation);
			if (targetRelation != oldTargetRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicModelPackage.RELATION_CONSTRAINT__TARGET_RELATION, oldTargetRelation, targetRelation));
			}
		}
		return targetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetTargetRelation() {
		return targetRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRelation(EStructuralFeature newTargetRelation) {
		EStructuralFeature oldTargetRelation = targetRelation;
		targetRelation = newTargetRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.RELATION_CONSTRAINT__TARGET_RELATION, oldTargetRelation, targetRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicModelPackage.RELATION_CONSTRAINT__TARGET_RELATION:
				if (resolve) return getTargetRelation();
				return basicGetTargetRelation();
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
			case LogicModelPackage.RELATION_CONSTRAINT__TARGET_RELATION:
				setTargetRelation((EStructuralFeature)newValue);
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
			case LogicModelPackage.RELATION_CONSTRAINT__TARGET_RELATION:
				setTargetRelation((EStructuralFeature)null);
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
			case LogicModelPackage.RELATION_CONSTRAINT__TARGET_RELATION:
				return targetRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationConstraintImpl
