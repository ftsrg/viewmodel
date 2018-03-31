/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Class Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getJavaClassConstraint()
 * @model
 * @generated
 */
public interface JavaClassConstraint extends UnaryConstraint {
	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' attribute.
	 * @see #setTargetClass(Class)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getJavaClassConstraint_TargetClass()
	 * @model unique="false"
	 * @generated
	 */
	Class<?> getTargetClass();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint#getTargetClass <em>Target Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' attribute.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(Class<?> value);

} // JavaClassConstraint
