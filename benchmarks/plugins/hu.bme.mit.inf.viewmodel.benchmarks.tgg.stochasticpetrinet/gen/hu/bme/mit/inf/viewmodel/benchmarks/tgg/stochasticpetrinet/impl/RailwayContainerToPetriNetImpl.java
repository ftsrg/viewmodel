/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet;
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
 * An implementation of the model object '<em><b>Railway Container To Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RailwayContainerToPetriNetImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RailwayContainerToPetriNetImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RailwayContainerToPetriNetImpl extends AbstractCorrespondenceImpl implements RailwayContainerToPetriNet {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected RailwayContainer source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected PetriNet target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailwayContainerToPetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StochasticpetrinetPackage.Literals.RAILWAY_CONTAINER_TO_PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainer getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (RailwayContainer) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainer basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(RailwayContainer newSource) {
		RailwayContainer oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (PetriNet) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(PetriNet newTarget) {
		PetriNet oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__TARGET:
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
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__SOURCE:
			setSource((RailwayContainer) newValue);
			return;
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__TARGET:
			setTarget((PetriNet) newValue);
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
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__SOURCE:
			setSource((RailwayContainer) null);
			return;
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__TARGET:
			setTarget((PetriNet) null);
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
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__SOURCE:
			return source != null;
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RailwayContainerToPetriNetImpl
