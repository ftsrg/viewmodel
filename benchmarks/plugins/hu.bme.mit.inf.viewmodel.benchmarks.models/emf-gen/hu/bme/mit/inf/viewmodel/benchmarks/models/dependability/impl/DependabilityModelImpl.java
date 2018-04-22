/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityModelImpl#getErrorModels <em>Error Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependabilityModelImpl extends MinimalEObjectImpl.Container implements DependabilityModel {
	/**
	 * The cached value of the '{@link #getErrorModels() <em>Error Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorModel> errorModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependabilityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependabilityPackage.Literals.DEPENDABILITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorModel> getErrorModels() {
		if (errorModels == null) {
			errorModels = new EObjectContainmentEList<ErrorModel>(ErrorModel.class, this, DependabilityPackage.DEPENDABILITY_MODEL__ERROR_MODELS);
		}
		return errorModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependabilityPackage.DEPENDABILITY_MODEL__ERROR_MODELS:
				return ((InternalEList<?>)getErrorModels()).basicRemove(otherEnd, msgs);
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
			case DependabilityPackage.DEPENDABILITY_MODEL__ERROR_MODELS:
				return getErrorModels();
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
			case DependabilityPackage.DEPENDABILITY_MODEL__ERROR_MODELS:
				getErrorModels().clear();
				getErrorModels().addAll((Collection<? extends ErrorModel>)newValue);
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
			case DependabilityPackage.DEPENDABILITY_MODEL__ERROR_MODELS:
				getErrorModels().clear();
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
			case DependabilityPackage.DEPENDABILITY_MODEL__ERROR_MODELS:
				return errorModels != null && !errorModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DependabilityModelImpl
