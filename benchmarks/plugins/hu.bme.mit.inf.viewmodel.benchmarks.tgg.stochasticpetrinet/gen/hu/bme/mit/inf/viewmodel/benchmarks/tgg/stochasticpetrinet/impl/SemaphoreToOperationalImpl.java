/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaphore To Operational</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToOperationalImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToOperationalImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemaphoreToOperationalImpl extends AbstractCorrespondenceImpl implements SemaphoreToOperational {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Semaphore source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Place target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemaphoreToOperationalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StochasticpetrinetPackage.Literals.SEMAPHORE_TO_OPERATIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Semaphore) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Semaphore newSource) {
		Semaphore oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Place) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Place newTarget) {
		Place oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__SOURCE:
			setSource((Semaphore) newValue);
			return;
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__TARGET:
			setTarget((Place) newValue);
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
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__SOURCE:
			setSource((Semaphore) null);
			return;
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__TARGET:
			setTarget((Place) null);
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
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__SOURCE:
			return source != null;
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SemaphoreToOperationalImpl
