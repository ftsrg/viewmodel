/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.PatternReferenceImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.PatternReferenceImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternReferenceImpl extends MinimalEObjectImpl.Container implements PatternReference {
	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern pattern;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewModelLanguagePackage.Literals.PATTERN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getPattern() {
		if (pattern != null && pattern.eIsProxy()) {
			InternalEObject oldPattern = (InternalEObject)pattern;
			pattern = (Pattern)eResolveProxy(oldPattern);
			if (pattern != oldPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewModelLanguagePackage.PATTERN_REFERENCE__PATTERN, oldPattern, pattern));
			}
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern basicGetPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(Pattern newPattern) {
		Pattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.PATTERN_REFERENCE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<Variable>(Variable.class, this, ViewModelLanguagePackage.PATTERN_REFERENCE__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewModelLanguagePackage.PATTERN_REFERENCE__PATTERN:
				if (resolve) return getPattern();
				return basicGetPattern();
			case ViewModelLanguagePackage.PATTERN_REFERENCE__ARGUMENTS:
				return getArguments();
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
			case ViewModelLanguagePackage.PATTERN_REFERENCE__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case ViewModelLanguagePackage.PATTERN_REFERENCE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Variable>)newValue);
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
			case ViewModelLanguagePackage.PATTERN_REFERENCE__PATTERN:
				setPattern((Pattern)null);
				return;
			case ViewModelLanguagePackage.PATTERN_REFERENCE__ARGUMENTS:
				getArguments().clear();
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
			case ViewModelLanguagePackage.PATTERN_REFERENCE__PATTERN:
				return pattern != null;
			case ViewModelLanguagePackage.PATTERN_REFERENCE__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PatternReferenceImpl
