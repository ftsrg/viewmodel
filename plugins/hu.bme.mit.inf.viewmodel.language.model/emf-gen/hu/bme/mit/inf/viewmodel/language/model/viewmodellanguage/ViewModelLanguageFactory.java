/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage
 * @generated
 */
public interface ViewModelLanguageFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewModelLanguageFactory eINSTANCE = hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>View Definition Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Definition Model</em>'.
	 * @generated
	 */
	ViewDefinitionModel createViewDefinitionModel();

	/**
	 * Returns a new object of class '<em>Import Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Section</em>'.
	 * @generated
	 */
	ImportSection createImportSection();

	/**
	 * Returns a new object of class '<em>Namespace Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace Import</em>'.
	 * @generated
	 */
	NamespaceImport createNamespaceImport();

	/**
	 * Returns a new object of class '<em>Rule Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Definition</em>'.
	 * @generated
	 */
	RuleDefinition createRuleDefinition();

	/**
	 * Returns a new object of class '<em>Pattern Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Reference</em>'.
	 * @generated
	 */
	PatternReference createPatternReference();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Lookup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup</em>'.
	 * @generated
	 */
	Lookup createLookup();

	/**
	 * Returns a new object of class '<em>Lookup Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup Result</em>'.
	 * @generated
	 */
	LookupResult createLookupResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewModelLanguagePackage getViewModelLanguagePackage();

} //ViewModelLanguageFactory
