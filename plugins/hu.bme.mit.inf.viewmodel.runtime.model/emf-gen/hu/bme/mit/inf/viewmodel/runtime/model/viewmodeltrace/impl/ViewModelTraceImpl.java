/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel;

import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage;

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
 * An implementation of the model object '<em><b>View Model Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTraceImpl#getTraceModelId <em>Trace Model Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTraceImpl#getLogicModel <em>Logic Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTraceImpl#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewModelTraceImpl extends MinimalEObjectImpl.Container implements ViewModelTrace {
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
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> traces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewModelTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewModelTracePackage.Literals.VIEW_MODEL_TRACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelTracePackage.VIEW_MODEL_TRACE__TRACE_MODEL_ID, oldTraceModelId, traceModelId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewModelTracePackage.VIEW_MODEL_TRACE__LOGIC_MODEL, oldLogicModel, logicModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelTracePackage.VIEW_MODEL_TRACE__LOGIC_MODEL, oldLogicModel, logicModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getTraces() {
		if (traces == null) {
			traces = new EObjectContainmentEList<Trace>(Trace.class, this, ViewModelTracePackage.VIEW_MODEL_TRACE__TRACES);
		}
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACES:
				return ((InternalEList<?>)getTraces()).basicRemove(otherEnd, msgs);
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
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACE_MODEL_ID:
				return getTraceModelId();
			case ViewModelTracePackage.VIEW_MODEL_TRACE__LOGIC_MODEL:
				if (resolve) return getLogicModel();
				return basicGetLogicModel();
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACES:
				return getTraces();
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
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACE_MODEL_ID:
				setTraceModelId((String)newValue);
				return;
			case ViewModelTracePackage.VIEW_MODEL_TRACE__LOGIC_MODEL:
				setLogicModel((LogicModel)newValue);
				return;
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACES:
				getTraces().clear();
				getTraces().addAll((Collection<? extends Trace>)newValue);
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
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACE_MODEL_ID:
				setTraceModelId(TRACE_MODEL_ID_EDEFAULT);
				return;
			case ViewModelTracePackage.VIEW_MODEL_TRACE__LOGIC_MODEL:
				setLogicModel((LogicModel)null);
				return;
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACES:
				getTraces().clear();
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
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACE_MODEL_ID:
				return TRACE_MODEL_ID_EDEFAULT == null ? traceModelId != null : !TRACE_MODEL_ID_EDEFAULT.equals(traceModelId);
			case ViewModelTracePackage.VIEW_MODEL_TRACE__LOGIC_MODEL:
				return logicModel != null;
			case ViewModelTracePackage.VIEW_MODEL_TRACE__TRACES:
				return traces != null && !traces.isEmpty();
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

} //ViewModelTraceImpl
