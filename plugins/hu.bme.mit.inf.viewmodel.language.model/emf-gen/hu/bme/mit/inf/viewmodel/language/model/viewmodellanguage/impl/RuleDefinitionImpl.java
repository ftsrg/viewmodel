/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage;

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
 * An implementation of the model object '<em><b>Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.RuleDefinitionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.RuleDefinitionImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.RuleDefinitionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.RuleDefinitionImpl#getLookups <em>Lookups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleDefinitionImpl extends MinimalEObjectImpl.Container implements RuleDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected PatternReference precondition;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected PatternReference result;

	/**
	 * The cached value of the '{@link #getLookups() <em>Lookups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookups()
	 * @generated
	 * @ordered
	 */
	protected EList<Lookup> lookups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewModelLanguagePackage.Literals.RULE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, ViewModelLanguagePackage.RULE_DEFINITION__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternReference getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(PatternReference newPrecondition, NotificationChain msgs) {
		PatternReference oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(PatternReference newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternReference getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(PatternReference newResult, NotificationChain msgs) {
		PatternReference oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.RULE_DEFINITION__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(PatternReference newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewModelLanguagePackage.RULE_DEFINITION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewModelLanguagePackage.RULE_DEFINITION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.RULE_DEFINITION__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lookup> getLookups() {
		if (lookups == null) {
			lookups = new EObjectContainmentEList<Lookup>(Lookup.class, this, ViewModelLanguagePackage.RULE_DEFINITION__LOOKUPS);
		}
		return lookups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewModelLanguagePackage.RULE_DEFINITION__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case ViewModelLanguagePackage.RULE_DEFINITION__RESULT:
				return basicSetResult(null, msgs);
			case ViewModelLanguagePackage.RULE_DEFINITION__LOOKUPS:
				return ((InternalEList<?>)getLookups()).basicRemove(otherEnd, msgs);
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
			case ViewModelLanguagePackage.RULE_DEFINITION__VARIABLES:
				return getVariables();
			case ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION:
				return getPrecondition();
			case ViewModelLanguagePackage.RULE_DEFINITION__RESULT:
				return getResult();
			case ViewModelLanguagePackage.RULE_DEFINITION__LOOKUPS:
				return getLookups();
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
			case ViewModelLanguagePackage.RULE_DEFINITION__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION:
				setPrecondition((PatternReference)newValue);
				return;
			case ViewModelLanguagePackage.RULE_DEFINITION__RESULT:
				setResult((PatternReference)newValue);
				return;
			case ViewModelLanguagePackage.RULE_DEFINITION__LOOKUPS:
				getLookups().clear();
				getLookups().addAll((Collection<? extends Lookup>)newValue);
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
			case ViewModelLanguagePackage.RULE_DEFINITION__VARIABLES:
				getVariables().clear();
				return;
			case ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION:
				setPrecondition((PatternReference)null);
				return;
			case ViewModelLanguagePackage.RULE_DEFINITION__RESULT:
				setResult((PatternReference)null);
				return;
			case ViewModelLanguagePackage.RULE_DEFINITION__LOOKUPS:
				getLookups().clear();
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
			case ViewModelLanguagePackage.RULE_DEFINITION__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ViewModelLanguagePackage.RULE_DEFINITION__PRECONDITION:
				return precondition != null;
			case ViewModelLanguagePackage.RULE_DEFINITION__RESULT:
				return result != null;
			case ViewModelLanguagePackage.RULE_DEFINITION__LOOKUPS:
				return lookups != null && !lookups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleDefinitionImpl
