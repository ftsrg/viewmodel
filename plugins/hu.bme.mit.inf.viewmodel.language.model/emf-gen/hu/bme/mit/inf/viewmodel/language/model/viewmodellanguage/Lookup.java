/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getRuleDefinition <em>Rule Definition</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getPreconditionArguments <em>Precondition Arguments</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getResult <em>Result</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#isAtomic <em>Atomic</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getLookup()
 * @model
 * @generated
 */
public interface Lookup extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Returns the value of the '<em><b>Rule Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Definition</em>' reference.
	 * @see #setRuleDefinition(RuleDefinition)
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getLookup_RuleDefinition()
	 * @model
	 * @generated
	 */
	RuleDefinition getRuleDefinition();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getRuleDefinition <em>Rule Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Definition</em>' reference.
	 * @see #getRuleDefinition()
	 * @generated
	 */
	void setRuleDefinition(RuleDefinition value);

	/**
	 * Returns the value of the '<em><b>Precondition Arguments</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition Arguments</em>' reference list.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getLookup_PreconditionArguments()
	 * @model
	 * @generated
	 */
	EList<Variable> getPreconditionArguments();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(LookupResult)
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getLookup_Result()
	 * @model containment="true"
	 * @generated
	 */
	LookupResult getResult();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(LookupResult value);

	/**
	 * Returns the value of the '<em><b>Atomic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atomic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomic</em>' attribute.
	 * @see #setAtomic(boolean)
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage#getLookup_Atomic()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isAtomic();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup#isAtomic <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomic</em>' attribute.
	 * @see #isAtomic()
	 * @generated
	 */
	void setAtomic(boolean value);

} // Lookup
