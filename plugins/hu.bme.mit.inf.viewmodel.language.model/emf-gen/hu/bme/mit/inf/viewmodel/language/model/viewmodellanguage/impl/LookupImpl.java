/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupImpl#getRuleDefinition <em>Rule Definition</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupImpl#getPreconditionArguments <em>Precondition Arguments</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupImpl#getResult <em>Result</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupImpl#isAtomic <em>Atomic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookupImpl extends MinimalEObjectImpl.Container implements Lookup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The cached value of the '{@link #getRuleDefinition() <em>Rule Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleDefinition()
	 * @generated
	 * @ordered
	 */
	protected RuleDefinition ruleDefinition;

	/**
	 * The cached value of the '{@link #getPreconditionArguments() <em>Precondition Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> preconditionArguments;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected LookupResult result;

	/**
	 * The default value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtomic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATOMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtomic()
	 * @generated
	 * @ordered
	 */
	protected boolean atomic = ATOMIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewModelLanguagePackage.Literals.LOOKUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDefinition getRuleDefinition() {
		if (ruleDefinition != null && ruleDefinition.eIsProxy()) {
			InternalEObject oldRuleDefinition = (InternalEObject)ruleDefinition;
			ruleDefinition = (RuleDefinition)eResolveProxy(oldRuleDefinition);
			if (ruleDefinition != oldRuleDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewModelLanguagePackage.LOOKUP__RULE_DEFINITION, oldRuleDefinition, ruleDefinition));
			}
		}
		return ruleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDefinition basicGetRuleDefinition() {
		return ruleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleDefinition(RuleDefinition newRuleDefinition) {
		RuleDefinition oldRuleDefinition = ruleDefinition;
		ruleDefinition = newRuleDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.LOOKUP__RULE_DEFINITION, oldRuleDefinition, ruleDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getPreconditionArguments() {
		if (preconditionArguments == null) {
			preconditionArguments = new EObjectResolvingEList<Variable>(Variable.class, this, ViewModelLanguagePackage.LOOKUP__PRECONDITION_ARGUMENTS);
		}
		return preconditionArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupResult getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(LookupResult newResult, NotificationChain msgs) {
		LookupResult oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.LOOKUP__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(LookupResult newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewModelLanguagePackage.LOOKUP__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewModelLanguagePackage.LOOKUP__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.LOOKUP__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAtomic() {
		return atomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomic(boolean newAtomic) {
		boolean oldAtomic = atomic;
		atomic = newAtomic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.LOOKUP__ATOMIC, oldAtomic, atomic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewModelLanguagePackage.LOOKUP__RESULT:
				return basicSetResult(null, msgs);
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
			case ViewModelLanguagePackage.LOOKUP__RULE_DEFINITION:
				if (resolve) return getRuleDefinition();
				return basicGetRuleDefinition();
			case ViewModelLanguagePackage.LOOKUP__PRECONDITION_ARGUMENTS:
				return getPreconditionArguments();
			case ViewModelLanguagePackage.LOOKUP__RESULT:
				return getResult();
			case ViewModelLanguagePackage.LOOKUP__ATOMIC:
				return isAtomic();
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
			case ViewModelLanguagePackage.LOOKUP__RULE_DEFINITION:
				setRuleDefinition((RuleDefinition)newValue);
				return;
			case ViewModelLanguagePackage.LOOKUP__PRECONDITION_ARGUMENTS:
				getPreconditionArguments().clear();
				getPreconditionArguments().addAll((Collection<? extends Variable>)newValue);
				return;
			case ViewModelLanguagePackage.LOOKUP__RESULT:
				setResult((LookupResult)newValue);
				return;
			case ViewModelLanguagePackage.LOOKUP__ATOMIC:
				setAtomic((Boolean)newValue);
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
			case ViewModelLanguagePackage.LOOKUP__RULE_DEFINITION:
				setRuleDefinition((RuleDefinition)null);
				return;
			case ViewModelLanguagePackage.LOOKUP__PRECONDITION_ARGUMENTS:
				getPreconditionArguments().clear();
				return;
			case ViewModelLanguagePackage.LOOKUP__RESULT:
				setResult((LookupResult)null);
				return;
			case ViewModelLanguagePackage.LOOKUP__ATOMIC:
				setAtomic(ATOMIC_EDEFAULT);
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
			case ViewModelLanguagePackage.LOOKUP__RULE_DEFINITION:
				return ruleDefinition != null;
			case ViewModelLanguagePackage.LOOKUP__PRECONDITION_ARGUMENTS:
				return preconditionArguments != null && !preconditionArguments.isEmpty();
			case ViewModelLanguagePackage.LOOKUP__RESULT:
				return result != null;
			case ViewModelLanguagePackage.LOOKUP__ATOMIC:
				return atomic != ATOMIC_EDEFAULT;
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
		result.append(" (atomic: ");
		result.append(atomic);
		result.append(')');
		return result.toString();
	}

} //LookupImpl
