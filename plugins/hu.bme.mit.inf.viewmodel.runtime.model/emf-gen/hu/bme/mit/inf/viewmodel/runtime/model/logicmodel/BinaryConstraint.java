/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getBinaryConstraint()
 * @model abstract="true"
 * @generated
 */
public interface BinaryConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Variable)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getBinaryConstraint_Left()
	 * @model
	 * @generated
	 */
	Variable getLeft();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Variable value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Variable)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getBinaryConstraint_Right()
	 * @model
	 * @generated
	 */
	Variable getRight();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Variable value);

} // BinaryConstraint
