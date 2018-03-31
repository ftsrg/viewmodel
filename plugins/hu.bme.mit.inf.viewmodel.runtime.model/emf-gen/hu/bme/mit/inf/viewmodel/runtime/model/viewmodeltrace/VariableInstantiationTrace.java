/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Instantiation Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getVariableInstantiationTrace()
 * @model
 * @generated
 */
public interface VariableInstantiationTrace extends Trace {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getVariableInstantiationTrace_Variables()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StringVariablePair> getVariables();

} // VariableInstantiationTrace
