/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection#getNamespaceImports <em>Namespace Imports</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getImportSection()
 * @model
 * @generated
 */
public interface ImportSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace Imports</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Imports</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getImportSection_NamespaceImports()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamespaceImport> getNamespaceImports();

} // ImportSection
