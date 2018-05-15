/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewModelLanguageFactoryImpl extends EFactoryImpl implements ViewModelLanguageFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewModelLanguageFactory init() {
		try {
			ViewModelLanguageFactory theViewModelLanguageFactory = (ViewModelLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(ViewModelLanguagePackage.eNS_URI);
			if (theViewModelLanguageFactory != null) {
				return theViewModelLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewModelLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewModelLanguagePackage.VIEW_DEFINITION_MODEL: return createViewDefinitionModel();
			case ViewModelLanguagePackage.IMPORT_SECTION: return createImportSection();
			case ViewModelLanguagePackage.NAMESPACE_IMPORT: return createNamespaceImport();
			case ViewModelLanguagePackage.RULE_DEFINITION: return createRuleDefinition();
			case ViewModelLanguagePackage.PATTERN_REFERENCE: return createPatternReference();
			case ViewModelLanguagePackage.VARIABLE: return createVariable();
			case ViewModelLanguagePackage.LOOKUP: return createLookup();
			case ViewModelLanguagePackage.LOOKUP_RESULT: return createLookupResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewDefinitionModel createViewDefinitionModel() {
		ViewDefinitionModelImpl viewDefinitionModel = new ViewDefinitionModelImpl();
		return viewDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportSection createImportSection() {
		ImportSectionImpl importSection = new ImportSectionImpl();
		return importSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceImport createNamespaceImport() {
		NamespaceImportImpl namespaceImport = new NamespaceImportImpl();
		return namespaceImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDefinition createRuleDefinition() {
		RuleDefinitionImpl ruleDefinition = new RuleDefinitionImpl();
		return ruleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternReference createPatternReference() {
		PatternReferenceImpl patternReference = new PatternReferenceImpl();
		return patternReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lookup createLookup() {
		LookupImpl lookup = new LookupImpl();
		return lookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupResult createLookupResult() {
		LookupResultImpl lookupResult = new LookupResultImpl();
		return lookupResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelLanguagePackage getViewModelLanguagePackage() {
		return (ViewModelLanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewModelLanguagePackage getPackage() {
		return ViewModelLanguagePackage.eINSTANCE;
	}

} //ViewModelLanguageFactoryImpl
