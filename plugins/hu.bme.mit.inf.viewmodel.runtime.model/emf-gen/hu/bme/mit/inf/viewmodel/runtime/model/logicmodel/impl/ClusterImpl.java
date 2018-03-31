/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ClusterImpl#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ClusterImpl#getState <em>State</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ClusterImpl#getManifestation <em>Manifestation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends MinimalEObjectImpl.Container implements Cluster {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ClusterState STATE_EDEFAULT = ClusterState.CLEAN;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ClusterState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManifestation() <em>Manifestation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestation()
	 * @generated
	 * @ordered
	 */
	protected Manifestation manifestation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicModelPackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.CLUSTER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ClusterState newState) {
		ClusterState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.CLUSTER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifestation getManifestation() {
		return manifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManifestation(Manifestation newManifestation, NotificationChain msgs) {
		Manifestation oldManifestation = manifestation;
		manifestation = newManifestation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicModelPackage.CLUSTER__MANIFESTATION, oldManifestation, newManifestation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManifestation(Manifestation newManifestation) {
		if (newManifestation != manifestation) {
			NotificationChain msgs = null;
			if (manifestation != null)
				msgs = ((InternalEObject)manifestation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicModelPackage.CLUSTER__MANIFESTATION, null, msgs);
			if (newManifestation != null)
				msgs = ((InternalEObject)newManifestation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicModelPackage.CLUSTER__MANIFESTATION, null, msgs);
			msgs = basicSetManifestation(newManifestation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.CLUSTER__MANIFESTATION, newManifestation, newManifestation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicModelPackage.CLUSTER__MANIFESTATION:
				return basicSetManifestation(null, msgs);
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
			case LogicModelPackage.CLUSTER__ID:
				return getId();
			case LogicModelPackage.CLUSTER__STATE:
				return getState();
			case LogicModelPackage.CLUSTER__MANIFESTATION:
				return getManifestation();
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
			case LogicModelPackage.CLUSTER__ID:
				setId((Long)newValue);
				return;
			case LogicModelPackage.CLUSTER__STATE:
				setState((ClusterState)newValue);
				return;
			case LogicModelPackage.CLUSTER__MANIFESTATION:
				setManifestation((Manifestation)newValue);
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
			case LogicModelPackage.CLUSTER__ID:
				setId(ID_EDEFAULT);
				return;
			case LogicModelPackage.CLUSTER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case LogicModelPackage.CLUSTER__MANIFESTATION:
				setManifestation((Manifestation)null);
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
			case LogicModelPackage.CLUSTER__ID:
				return id != ID_EDEFAULT;
			case LogicModelPackage.CLUSTER__STATE:
				return state != STATE_EDEFAULT;
			case LogicModelPackage.CLUSTER__MANIFESTATION:
				return manifestation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ClusterImpl
