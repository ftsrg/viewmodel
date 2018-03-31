/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.TraceImpl#getTraceName <em>Trace Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.TraceImpl#getArgumentTuple <em>Argument Tuple</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.TraceImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The default value of the '{@link #getTraceName() <em>Trace Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceName() <em>Trace Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceName()
	 * @generated
	 * @ordered
	 */
	protected String traceName = TRACE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgumentTuple() <em>Argument Tuple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentTuple()
	 * @generated
	 * @ordered
	 */
	protected MatchArgumentTuple argumentTuple;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final TraceState STATE_EDEFAULT = TraceState.USED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected TraceState state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewModelTracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceName() {
		return traceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceName(String newTraceName) {
		String oldTraceName = traceName;
		traceName = newTraceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelTracePackage.TRACE__TRACE_NAME, oldTraceName, traceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchArgumentTuple getArgumentTuple() {
		return argumentTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentTuple(MatchArgumentTuple newArgumentTuple, NotificationChain msgs) {
		MatchArgumentTuple oldArgumentTuple = argumentTuple;
		argumentTuple = newArgumentTuple;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewModelTracePackage.TRACE__ARGUMENT_TUPLE, oldArgumentTuple, newArgumentTuple);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentTuple(MatchArgumentTuple newArgumentTuple) {
		if (newArgumentTuple != argumentTuple) {
			NotificationChain msgs = null;
			if (argumentTuple != null)
				msgs = ((InternalEObject)argumentTuple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewModelTracePackage.TRACE__ARGUMENT_TUPLE, null, msgs);
			if (newArgumentTuple != null)
				msgs = ((InternalEObject)newArgumentTuple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewModelTracePackage.TRACE__ARGUMENT_TUPLE, null, msgs);
			msgs = basicSetArgumentTuple(newArgumentTuple, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelTracePackage.TRACE__ARGUMENT_TUPLE, newArgumentTuple, newArgumentTuple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(TraceState newState) {
		TraceState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelTracePackage.TRACE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewModelTracePackage.TRACE__ARGUMENT_TUPLE:
				return basicSetArgumentTuple(null, msgs);
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
			case ViewModelTracePackage.TRACE__TRACE_NAME:
				return getTraceName();
			case ViewModelTracePackage.TRACE__ARGUMENT_TUPLE:
				return getArgumentTuple();
			case ViewModelTracePackage.TRACE__STATE:
				return getState();
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
			case ViewModelTracePackage.TRACE__TRACE_NAME:
				setTraceName((String)newValue);
				return;
			case ViewModelTracePackage.TRACE__ARGUMENT_TUPLE:
				setArgumentTuple((MatchArgumentTuple)newValue);
				return;
			case ViewModelTracePackage.TRACE__STATE:
				setState((TraceState)newValue);
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
			case ViewModelTracePackage.TRACE__TRACE_NAME:
				setTraceName(TRACE_NAME_EDEFAULT);
				return;
			case ViewModelTracePackage.TRACE__ARGUMENT_TUPLE:
				setArgumentTuple((MatchArgumentTuple)null);
				return;
			case ViewModelTracePackage.TRACE__STATE:
				setState(STATE_EDEFAULT);
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
			case ViewModelTracePackage.TRACE__TRACE_NAME:
				return TRACE_NAME_EDEFAULT == null ? traceName != null : !TRACE_NAME_EDEFAULT.equals(traceName);
			case ViewModelTracePackage.TRACE__ARGUMENT_TUPLE:
				return argumentTuple != null;
			case ViewModelTracePackage.TRACE__STATE:
				return state != STATE_EDEFAULT;
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
		result.append(" (traceName: ");
		result.append(traceName);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //TraceImpl
