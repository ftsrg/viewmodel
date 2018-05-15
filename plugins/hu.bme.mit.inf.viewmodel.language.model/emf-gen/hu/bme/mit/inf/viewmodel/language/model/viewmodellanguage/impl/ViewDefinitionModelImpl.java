/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel;
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
 * An implementation of the model object '<em><b>View Definition Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewDefinitionModelImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewDefinitionModelImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewDefinitionModelImpl#getRuleDefinitions <em>Rule Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewDefinitionModelImpl extends MinimalEObjectImpl.Container implements ViewDefinitionModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportSection() <em>Import Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportSection()
	 * @generated
	 * @ordered
	 */
	protected ImportSection importSection;

	/**
	 * The cached value of the '{@link #getRuleDefinitions() <em>Rule Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleDefinition> ruleDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewDefinitionModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewModelLanguagePackage.Literals.VIEW_DEFINITION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportSection getImportSection() {
		return importSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportSection(ImportSection newImportSection, NotificationChain msgs) {
		ImportSection oldImportSection = importSection;
		importSection = newImportSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION, oldImportSection, newImportSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportSection(ImportSection newImportSection) {
		if (newImportSection != importSection) {
			NotificationChain msgs = null;
			if (importSection != null)
				msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION, null, msgs);
			if (newImportSection != null)
				msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION, null, msgs);
			msgs = basicSetImportSection(newImportSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION, newImportSection, newImportSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleDefinition> getRuleDefinitions() {
		if (ruleDefinitions == null) {
			ruleDefinitions = new EObjectContainmentEList<RuleDefinition>(RuleDefinition.class, this, ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__RULE_DEFINITIONS);
		}
		return ruleDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION:
				return basicSetImportSection(null, msgs);
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__RULE_DEFINITIONS:
				return ((InternalEList<?>)getRuleDefinitions()).basicRemove(otherEnd, msgs);
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
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__PACKAGE_NAME:
				return getPackageName();
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION:
				return getImportSection();
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__RULE_DEFINITIONS:
				return getRuleDefinitions();
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
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION:
				setImportSection((ImportSection)newValue);
				return;
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__RULE_DEFINITIONS:
				getRuleDefinitions().clear();
				getRuleDefinitions().addAll((Collection<? extends RuleDefinition>)newValue);
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
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION:
				setImportSection((ImportSection)null);
				return;
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__RULE_DEFINITIONS:
				getRuleDefinitions().clear();
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
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__IMPORT_SECTION:
				return importSection != null;
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL__RULE_DEFINITIONS:
				return ruleDefinitions != null && !ruleDefinitions.isEmpty();
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
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //ViewDefinitionModelImpl
