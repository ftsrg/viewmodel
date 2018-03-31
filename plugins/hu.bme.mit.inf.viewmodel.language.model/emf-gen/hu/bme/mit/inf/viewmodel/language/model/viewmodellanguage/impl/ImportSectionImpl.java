/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage;

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
 * An implementation of the model object '<em><b>Import Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ImportSectionImpl#getNamespaceImports <em>Namespace Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportSectionImpl extends MinimalEObjectImpl.Container implements ImportSection {
	/**
	 * The cached value of the '{@link #getNamespaceImports() <em>Namespace Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceImports()
	 * @generated
	 * @ordered
	 */
	protected EList<NamespaceImport> namespaceImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewModelLanguagePackage.Literals.IMPORT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamespaceImport> getNamespaceImports() {
		if (namespaceImports == null) {
			namespaceImports = new EObjectContainmentEList<NamespaceImport>(NamespaceImport.class, this, ViewModelLanguagePackage.IMPORT_SECTION__NAMESPACE_IMPORTS);
		}
		return namespaceImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewModelLanguagePackage.IMPORT_SECTION__NAMESPACE_IMPORTS:
				return ((InternalEList<?>)getNamespaceImports()).basicRemove(otherEnd, msgs);
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
			case ViewModelLanguagePackage.IMPORT_SECTION__NAMESPACE_IMPORTS:
				return getNamespaceImports();
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
			case ViewModelLanguagePackage.IMPORT_SECTION__NAMESPACE_IMPORTS:
				getNamespaceImports().clear();
				getNamespaceImports().addAll((Collection<? extends NamespaceImport>)newValue);
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
			case ViewModelLanguagePackage.IMPORT_SECTION__NAMESPACE_IMPORTS:
				getNamespaceImports().clear();
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
			case ViewModelLanguagePackage.IMPORT_SECTION__NAMESPACE_IMPORTS:
				return namespaceImports != null && !namespaceImports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImportSectionImpl
