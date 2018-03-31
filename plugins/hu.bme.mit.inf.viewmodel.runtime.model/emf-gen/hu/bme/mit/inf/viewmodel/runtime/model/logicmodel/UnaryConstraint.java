/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getUnaryConstraint()
 * @model abstract="true"
 * @generated
 */
public interface UnaryConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getUnaryConstraint_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // UnaryConstraint
