/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupResultImpl#getResultArguments <em>Result Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookupResultImpl extends MinimalEObjectImpl.Container implements LookupResult {
	/**
	 * The cached value of the '{@link #getResultArguments() <em>Result Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> resultArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewModelLanguagePackage.Literals.LOOKUP_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getResultArguments() {
		if (resultArguments == null) {
			resultArguments = new EObjectResolvingEList<Variable>(Variable.class, this, ViewModelLanguagePackage.LOOKUP_RESULT__RESULT_ARGUMENTS);
		}
		return resultArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewModelLanguagePackage.LOOKUP_RESULT__RESULT_ARGUMENTS:
				return getResultArguments();
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
			case ViewModelLanguagePackage.LOOKUP_RESULT__RESULT_ARGUMENTS:
				getResultArguments().clear();
				getResultArguments().addAll((Collection<? extends Variable>)newValue);
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
			case ViewModelLanguagePackage.LOOKUP_RESULT__RESULT_ARGUMENTS:
				getResultArguments().clear();
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
			case ViewModelLanguagePackage.LOOKUP_RESULT__RESULT_ARGUMENTS:
				return resultArguments != null && !resultArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LookupResultImpl
