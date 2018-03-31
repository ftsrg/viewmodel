/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguageFactory;
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternLanguagePackage;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewModelLanguagePackageImpl extends EPackageImpl implements ViewModelLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupResultEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewModelLanguagePackageImpl() {
		super(eNS_URI, ViewModelLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ViewModelLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewModelLanguagePackage init() {
		if (isInited) return (ViewModelLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(ViewModelLanguagePackage.eNS_URI);

		// Obtain or create and register package
		ViewModelLanguagePackageImpl theViewModelLanguagePackage = (ViewModelLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewModelLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewModelLanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PatternLanguagePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViewModelLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theViewModelLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewModelLanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewModelLanguagePackage.eNS_URI, theViewModelLanguagePackage);
		return theViewModelLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewDefinitionModel() {
		return viewDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewDefinitionModel_PackageName() {
		return (EAttribute)viewDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewDefinitionModel_ImportSection() {
		return (EReference)viewDefinitionModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewDefinitionModel_RuleDefinitions() {
		return (EReference)viewDefinitionModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportSection() {
		return importSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportSection_NamespaceImports() {
		return (EReference)importSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceImport() {
		return namespaceImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceImport_ImportedNamespace() {
		return (EAttribute)namespaceImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleDefinition() {
		return ruleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_Variables() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_Precondition() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_Result() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDefinition_Lookups() {
		return (EReference)ruleDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternReference() {
		return patternReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternReference_Pattern() {
		return (EReference)patternReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternReference_Arguments() {
		return (EReference)patternReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookup() {
		return lookupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookup_RuleDefinition() {
		return (EReference)lookupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookup_PreconditionArguments() {
		return (EReference)lookupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookup_Result() {
		return (EReference)lookupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookup_Atomic() {
		return (EAttribute)lookupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupResult() {
		return lookupResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupResult_ResultArguments() {
		return (EReference)lookupResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelLanguageFactory getViewModelLanguageFactory() {
		return (ViewModelLanguageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		viewDefinitionModelEClass = createEClass(VIEW_DEFINITION_MODEL);
		createEAttribute(viewDefinitionModelEClass, VIEW_DEFINITION_MODEL__PACKAGE_NAME);
		createEReference(viewDefinitionModelEClass, VIEW_DEFINITION_MODEL__IMPORT_SECTION);
		createEReference(viewDefinitionModelEClass, VIEW_DEFINITION_MODEL__RULE_DEFINITIONS);

		importSectionEClass = createEClass(IMPORT_SECTION);
		createEReference(importSectionEClass, IMPORT_SECTION__NAMESPACE_IMPORTS);

		namespaceImportEClass = createEClass(NAMESPACE_IMPORT);
		createEAttribute(namespaceImportEClass, NAMESPACE_IMPORT__IMPORTED_NAMESPACE);

		ruleDefinitionEClass = createEClass(RULE_DEFINITION);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__VARIABLES);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__PRECONDITION);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__RESULT);
		createEReference(ruleDefinitionEClass, RULE_DEFINITION__LOOKUPS);

		patternReferenceEClass = createEClass(PATTERN_REFERENCE);
		createEReference(patternReferenceEClass, PATTERN_REFERENCE__PATTERN);
		createEReference(patternReferenceEClass, PATTERN_REFERENCE__ARGUMENTS);

		variableEClass = createEClass(VARIABLE);

		lookupEClass = createEClass(LOOKUP);
		createEReference(lookupEClass, LOOKUP__RULE_DEFINITION);
		createEReference(lookupEClass, LOOKUP__PRECONDITION_ARGUMENTS);
		createEReference(lookupEClass, LOOKUP__RESULT);
		createEAttribute(lookupEClass, LOOKUP__ATOMIC);

		lookupResultEClass = createEClass(LOOKUP_RESULT);
		createEReference(lookupResultEClass, LOOKUP_RESULT__RESULT_ARGUMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PatternLanguagePackage thePatternLanguagePackage = (PatternLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(PatternLanguagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(thePatternLanguagePackage.getVariable());

		// Initialize classes and features; add operations and parameters
		initEClass(viewDefinitionModelEClass, ViewDefinitionModel.class, "ViewDefinitionModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewDefinitionModel_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, ViewDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewDefinitionModel_ImportSection(), this.getImportSection(), null, "importSection", null, 0, 1, ViewDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewDefinitionModel_RuleDefinitions(), this.getRuleDefinition(), null, "ruleDefinitions", null, 0, -1, ViewDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importSectionEClass, ImportSection.class, "ImportSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportSection_NamespaceImports(), this.getNamespaceImport(), null, "namespaceImports", null, 0, -1, ImportSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceImportEClass, NamespaceImport.class, "NamespaceImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespaceImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, NamespaceImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleDefinitionEClass, RuleDefinition.class, "RuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleDefinition_Variables(), this.getVariable(), null, "variables", null, 0, -1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleDefinition_Precondition(), this.getPatternReference(), null, "precondition", null, 0, 1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleDefinition_Result(), this.getPatternReference(), null, "result", null, 0, 1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleDefinition_Lookups(), this.getLookup(), null, "lookups", null, 0, -1, RuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternReferenceEClass, PatternReference.class, "PatternReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternReference_Pattern(), thePatternLanguagePackage.getPattern(), null, "pattern", null, 0, 1, PatternReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternReference_Arguments(), this.getVariable(), null, "arguments", null, 0, -1, PatternReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lookupEClass, Lookup.class, "Lookup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLookup_RuleDefinition(), this.getRuleDefinition(), null, "ruleDefinition", null, 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLookup_PreconditionArguments(), this.getVariable(), null, "preconditionArguments", null, 0, -1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLookup_Result(), this.getLookupResult(), null, "result", null, 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookup_Atomic(), ecorePackage.getEBoolean(), "atomic", "false", 0, 1, Lookup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookupResultEClass, LookupResult.class, "LookupResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLookupResult_ResultArguments(), this.getVariable(), null, "resultArguments", null, 0, -1, LookupResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ViewModelLanguagePackageImpl
