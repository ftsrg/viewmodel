/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult#getResultArguments <em>Result Arguments</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getLookupResult()
 * @model
 * @generated
 */
public interface LookupResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Arguments</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Arguments</em>' reference list.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getLookupResult_ResultArguments()
	 * @model
	 * @generated
	 */
	EList<Variable> getResultArguments();

} // LookupResult
