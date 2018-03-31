/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.PatternLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguageFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/hu.bme.mit.inf.viewmodel.language.model/src-gen' prefix='ViewModelLanguage' fileExtensions='viewmodellanguage' providerName='BME MIT FTSRG' operationReflection='false' basePackage='hu.bme.mit.inf.viewmodel.language.model'"
 * @generated
 */
public interface ViewModelLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viewmodellanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/emf/2017/ViewModelLanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "viewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewModelLanguagePackage eINSTANCE = hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewDefinitionModelImpl <em>View Definition Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewDefinitionModelImpl
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getViewDefinitionModel()
	 * @generated
	 */
	int VIEW_DEFINITION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEFINITION_MODEL__PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Import Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEFINITION_MODEL__IMPORT_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Rule Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEFINITION_MODEL__RULE_DEFINITIONS = 2;

	/**
	 * The number of structural features of the '<em>View Definition Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEFINITION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ImportSectionImpl <em>Import Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ImportSectionImpl
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getImportSection()
	 * @generated
	 */
	int IMPORT_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Namespace Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SECTION__NAMESPACE_IMPORTS = 0;

	/**
	 * The number of structural features of the '<em>Import Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.NamespaceImportImpl <em>Namespace Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.NamespaceImportImpl
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getNamespaceImport()
	 * @generated
	 */
	int NAMESPACE_IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Namespace Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.RuleDefinitionImpl <em>Rule Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.RuleDefinitionImpl
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getRuleDefinition()
	 * @generated
	 */
	int RULE_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__RESULT = 2;

	/**
	 * The feature id for the '<em><b>Lookups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION__LOOKUPS = 3;

	/**
	 * The number of structural features of the '<em>Rule Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.PatternReferenceImpl <em>Pattern Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.PatternReferenceImpl
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getPatternReference()
	 * @generated
	 */
	int PATTERN_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REFERENCE__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REFERENCE__ARGUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Pattern Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.VariableImpl
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = PatternLanguagePackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = PatternLanguagePackage.VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__REFERENCES = PatternLanguagePackage.VARIABLE__REFERENCES;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = PatternLanguagePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupImpl <em>Lookup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupImpl
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getLookup()
	 * @generated
	 */
	int LOOKUP = 6;

	/**
	 * The feature id for the '<em><b>Rule Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP__RULE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Precondition Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP__PRECONDITION_ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP__RESULT = 2;

	/**
	 * The feature id for the '<em><b>Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP__ATOMIC = 3;

	/**
	 * The number of structural features of the '<em>Lookup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupResultImpl <em>Lookup Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupResultImpl
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getLookupResult()
	 * @generated
	 */
	int LOOKUP_RESULT = 7;

	/**
	 * The feature id for the '<em><b>Result Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_RESULT__RESULT_ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Lookup Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_RESULT_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel <em>View Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Definition Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
	 * @generated
	 */
	EClass getViewDefinitionModel();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getPackageName()
	 * @see #getViewDefinitionModel()
	 * @generated
	 */
	EAttribute getViewDefinitionModel_PackageName();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getImportSection <em>Import Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Section</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getImportSection()
	 * @see #getViewDefinitionModel()
	 * @generated
	 */
	EReference getViewDefinitionModel_ImportSection();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getRuleDefinitions <em>Rule Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Definitions</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getRuleDefinitions()
	 * @see #getViewDefinitionModel()
	 * @generated
	 */
	EReference getViewDefinitionModel_RuleDefinitions();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection <em>Import Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Section</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection
	 * @generated
	 */
	EClass getImportSection();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection#getNamespaceImports <em>Namespace Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespace Imports</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection#getNamespaceImports()
	 * @see #getImportSection()
	 * @generated
	 */
	EReference getImportSection_NamespaceImports();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport <em>Namespace Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Import</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport
	 * @generated
	 */
	EClass getNamespaceImport();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport#getImportedNamespace()
	 * @see #getNamespaceImport()
	 * @generated
	 */
	EAttribute getNamespaceImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition <em>Rule Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Definition</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
	 * @generated
	 */
	EClass getRuleDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition#getVariables()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition#getPrecondition()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition#getResult()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition#getLookups <em>Lookups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lookups</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition#getLookups()
	 * @see #getRuleDefinition()
	 * @generated
	 */
	EReference getRuleDefinition_Lookups();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference <em>Pattern Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Reference</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference
	 * @generated
	 */
	EClass getPatternReference();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference#getPattern()
	 * @see #getPatternReference()
	 * @generated
	 */
	EReference getPatternReference_Pattern();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference#getArguments()
	 * @see #getPatternReference()
	 * @generated
	 */
	EReference getPatternReference_Arguments();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup
	 * @generated
	 */
	EClass getLookup();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getRuleDefinition <em>Rule Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule Definition</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getRuleDefinition()
	 * @see #getLookup()
	 * @generated
	 */
	EReference getLookup_RuleDefinition();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getPreconditionArguments <em>Precondition Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precondition Arguments</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getPreconditionArguments()
	 * @see #getLookup()
	 * @generated
	 */
	EReference getLookup_PreconditionArguments();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getResult()
	 * @see #getLookup()
	 * @generated
	 */
	EReference getLookup_Result();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#isAtomic <em>Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atomic</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#isAtomic()
	 * @see #getLookup()
	 * @generated
	 */
	EAttribute getLookup_Atomic();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult <em>Lookup Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Result</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult
	 * @generated
	 */
	EClass getLookupResult();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult#getResultArguments <em>Result Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Result Arguments</em>'.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult#getResultArguments()
	 * @see #getLookupResult()
	 * @generated
	 */
	EReference getLookupResult_ResultArguments();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewModelLanguageFactory getViewModelLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewDefinitionModelImpl <em>View Definition Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewDefinitionModelImpl
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getViewDefinitionModel()
		 * @generated
		 */
		EClass VIEW_DEFINITION_MODEL = eINSTANCE.getViewDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DEFINITION_MODEL__PACKAGE_NAME = eINSTANCE.getViewDefinitionModel_PackageName();

		/**
		 * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_DEFINITION_MODEL__IMPORT_SECTION = eINSTANCE.getViewDefinitionModel_ImportSection();

		/**
		 * The meta object literal for the '<em><b>Rule Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_DEFINITION_MODEL__RULE_DEFINITIONS = eINSTANCE.getViewDefinitionModel_RuleDefinitions();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ImportSectionImpl <em>Import Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ImportSectionImpl
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getImportSection()
		 * @generated
		 */
		EClass IMPORT_SECTION = eINSTANCE.getImportSection();

		/**
		 * The meta object literal for the '<em><b>Namespace Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_SECTION__NAMESPACE_IMPORTS = eINSTANCE.getImportSection_NamespaceImports();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.NamespaceImportImpl <em>Namespace Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.NamespaceImportImpl
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getNamespaceImport()
		 * @generated
		 */
		EClass NAMESPACE_IMPORT = eINSTANCE.getNamespaceImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getNamespaceImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.RuleDefinitionImpl <em>Rule Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.RuleDefinitionImpl
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getRuleDefinition()
		 * @generated
		 */
		EClass RULE_DEFINITION = eINSTANCE.getRuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__VARIABLES = eINSTANCE.getRuleDefinition_Variables();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__PRECONDITION = eINSTANCE.getRuleDefinition_Precondition();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__RESULT = eINSTANCE.getRuleDefinition_Result();

		/**
		 * The meta object literal for the '<em><b>Lookups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DEFINITION__LOOKUPS = eINSTANCE.getRuleDefinition_Lookups();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.PatternReferenceImpl <em>Pattern Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.PatternReferenceImpl
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getPatternReference()
		 * @generated
		 */
		EClass PATTERN_REFERENCE = eINSTANCE.getPatternReference();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_REFERENCE__PATTERN = eINSTANCE.getPatternReference_Pattern();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_REFERENCE__ARGUMENTS = eINSTANCE.getPatternReference_Arguments();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.VariableImpl
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupImpl <em>Lookup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupImpl
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getLookup()
		 * @generated
		 */
		EClass LOOKUP = eINSTANCE.getLookup();

		/**
		 * The meta object literal for the '<em><b>Rule Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP__RULE_DEFINITION = eINSTANCE.getLookup_RuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Precondition Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP__PRECONDITION_ARGUMENTS = eINSTANCE.getLookup_PreconditionArguments();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP__RESULT = eINSTANCE.getLookup_Result();

		/**
		 * The meta object literal for the '<em><b>Atomic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP__ATOMIC = eINSTANCE.getLookup_Atomic();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupResultImpl <em>Lookup Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.LookupResultImpl
		 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.impl.ViewModelLanguagePackageImpl#getLookupResult()
		 * @generated
		 */
		EClass LOOKUP_RESULT = eINSTANCE.getLookupResult();

		/**
		 * The meta object literal for the '<em><b>Result Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_RESULT__RESULT_ARGUMENTS = eINSTANCE.getLookupResult_ResultArguments();

	}

} //ViewModelLanguagePackage
