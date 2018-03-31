/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifestation Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationTraceImpl#getTraceModelId <em>Trace Model Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationTraceImpl#getLogicModel <em>Logic Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationTraceImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManifestationTraceImpl extends MinimalEObjectImpl.Container implements ManifestationTrace {
	/**
	 * The default value of the '{@link #getTraceModelId() <em>Trace Model Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceModelId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_MODEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceModelId() <em>Trace Model Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceModelId()
	 * @generated
	 * @ordered
	 */
	protected String traceModelId = TRACE_MODEL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicModel() <em>Logic Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicModel()
	 * @generated
	 * @ordered
	 */
	protected LogicModel logicModel;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> results;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestationTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicModelPackage.Literals.MANIFESTATION_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceModelId() {
		return traceModelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceModelId(String newTraceModelId) {
		String oldTraceModelId = traceModelId;
		traceModelId = newTraceModelId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.MANIFESTATION_TRACE__TRACE_MODEL_ID, oldTraceModelId, traceModelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicModel getLogicModel() {
		if (logicModel != null && logicModel.eIsProxy()) {
			InternalEObject oldLogicModel = (InternalEObject)logicModel;
			logicModel = (LogicModel)eResolveProxy(oldLogicModel);
			if (logicModel != oldLogicModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicModelPackage.MANIFESTATION_TRACE__LOGIC_MODEL, oldLogicModel, logicModel));
			}
		}
		return logicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicModel basicGetLogicModel() {
		return logicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicModel(LogicModel newLogicModel) {
		LogicModel oldLogicModel = logicModel;
		logicModel = newLogicModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicModelPackage.MANIFESTATION_TRACE__LOGIC_MODEL, oldLogicModel, logicModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<EObject>(EObject.class, this, LogicModelPackage.MANIFESTATION_TRACE__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicModelPackage.MANIFESTATION_TRACE__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
			case LogicModelPackage.MANIFESTATION_TRACE__TRACE_MODEL_ID:
				return getTraceModelId();
			case LogicModelPackage.MANIFESTATION_TRACE__LOGIC_MODEL:
				if (resolve) return getLogicModel();
				return basicGetLogicModel();
			case LogicModelPackage.MANIFESTATION_TRACE__RESULTS:
				return getResults();
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
			case LogicModelPackage.MANIFESTATION_TRACE__TRACE_MODEL_ID:
				setTraceModelId((String)newValue);
				return;
			case LogicModelPackage.MANIFESTATION_TRACE__LOGIC_MODEL:
				setLogicModel((LogicModel)newValue);
				return;
			case LogicModelPackage.MANIFESTATION_TRACE__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends EObject>)newValue);
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
			case LogicModelPackage.MANIFESTATION_TRACE__TRACE_MODEL_ID:
				setTraceModelId(TRACE_MODEL_ID_EDEFAULT);
				return;
			case LogicModelPackage.MANIFESTATION_TRACE__LOGIC_MODEL:
				setLogicModel((LogicModel)null);
				return;
			case LogicModelPackage.MANIFESTATION_TRACE__RESULTS:
				getResults().clear();
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
			case LogicModelPackage.MANIFESTATION_TRACE__TRACE_MODEL_ID:
				return TRACE_MODEL_ID_EDEFAULT == null ? traceModelId != null : !TRACE_MODEL_ID_EDEFAULT.equals(traceModelId);
			case LogicModelPackage.MANIFESTATION_TRACE__LOGIC_MODEL:
				return logicModel != null;
			case LogicModelPackage.MANIFESTATION_TRACE__RESULTS:
				return results != null && !results.isEmpty();
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
		result.append(" (traceModelId: ");
		result.append(traceModelId);
		result.append(')');
		return result.toString();
	}

} //ManifestationTraceImpl
