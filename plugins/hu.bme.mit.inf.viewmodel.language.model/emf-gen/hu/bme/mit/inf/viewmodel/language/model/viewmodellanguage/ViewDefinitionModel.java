/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Definition Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getRuleDefinitions <em>Rule Definitions</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getViewDefinitionModel()
 * @model
 * @generated
 */
public interface ViewDefinitionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getViewDefinitionModel_PackageName()
	 * @model unique="false"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Section</em>' containment reference.
	 * @see #setImportSection(ImportSection)
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getViewDefinitionModel_ImportSection()
	 * @model containment="true"
	 * @generated
	 */
	ImportSection getImportSection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel#getImportSection <em>Import Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Section</em>' containment reference.
	 * @see #getImportSection()
	 * @generated
	 */
	void setImportSection(ImportSection value);

	/**
	 * Returns the value of the '<em><b>Rule Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Definitions</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getViewDefinitionModel_RuleDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleDefinition> getRuleDefinitions();

} // ViewDefinitionModel
