/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpreted Manifestation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.InterpretedManifestationImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.InterpretedManifestationImpl#getManifestedEObject <em>Manifested EObject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterpretedManifestationImpl extends ManifestationImpl implements InterpretedManifestation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The cached value of the '{@link #getManifestedEObject() <em>Manifested EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestedEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject manifestedEObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterpretedManifestationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicModelPackage.Literals.INTERPRETED_MANIFESTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicModelPackage.INTERPRETED_MANIFESTATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.INTERPRETED_MANIFESTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getManifestedEObject() {
		if (manifestedEObject != null && manifestedEObject.eIsProxy()) {
			InternalEObject oldManifestedEObject = (InternalEObject)manifestedEObject;
			manifestedEObject = eResolveProxy(oldManifestedEObject);
			if (manifestedEObject != oldManifestedEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicModelPackage.INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT, oldManifestedEObject, manifestedEObject));
			}
		}
		return manifestedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetManifestedEObject() {
		return manifestedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifestedEObject(EObject newManifestedEObject) {
		EObject oldManifestedEObject = manifestedEObject;
		manifestedEObject = newManifestedEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT, oldManifestedEObject, manifestedEObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicModelPackage.INTERPRETED_MANIFESTATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case LogicModelPackage.INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT:
				if (resolve) return getManifestedEObject();
				return basicGetManifestedEObject();
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
			case LogicModelPackage.INTERPRETED_MANIFESTATION__TYPE:
				setType((EClass)newValue);
				return;
			case LogicModelPackage.INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT:
				setManifestedEObject((EObject)newValue);
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
			case LogicModelPackage.INTERPRETED_MANIFESTATION__TYPE:
				setType((EClass)null);
				return;
			case LogicModelPackage.INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT:
				setManifestedEObject((EObject)null);
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
			case LogicModelPackage.INTERPRETED_MANIFESTATION__TYPE:
				return type != null;
			case LogicModelPackage.INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT:
				return manifestedEObject != null;
		}
		return super.eIsSet(featureID);
	}

} //InterpretedManifestationImpl
