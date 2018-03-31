/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getConstraintTrace()
 * @model
 * @generated
 */
public interface ConstraintTrace extends Trace {
	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getConstraintTrace_LocalVariables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getConstraintTrace_Constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // ConstraintTrace
