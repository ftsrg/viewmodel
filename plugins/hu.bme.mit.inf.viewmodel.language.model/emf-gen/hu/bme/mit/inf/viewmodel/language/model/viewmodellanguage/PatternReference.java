/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference#getPattern <em>Pattern</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getPatternReference()
 * @model
 * @generated
 */
public interface PatternReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(Pattern)
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getPatternReference_Pattern()
	 * @model
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getPatternReference_Arguments()
	 * @model
	 * @generated
	 */
	EList<Variable> getArguments();

} // PatternReference
