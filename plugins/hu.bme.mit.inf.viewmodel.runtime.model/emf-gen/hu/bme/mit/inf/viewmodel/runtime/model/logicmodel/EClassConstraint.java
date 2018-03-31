/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint#getTargetEClass <em>Target EClass</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getEClassConstraint()
 * @model
 * @generated
 */
public interface EClassConstraint extends UnaryConstraint {
	/**
	 * Returns the value of the '<em><b>Target EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target EClass</em>' reference.
	 * @see #setTargetEClass(EClass)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getEClassConstraint_TargetEClass()
	 * @model
	 * @generated
	 */
	EClass getTargetEClass();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint#getTargetEClass <em>Target EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target EClass</em>' reference.
	 * @see #getTargetEClass()
	 * @generated
	 */
	void setTargetEClass(EClass value);

} // EClassConstraint
