/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument#getParameterName <em>Parameter Name</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getMatchArgument()
 * @model abstract="true"
 * @generated
 */
public interface MatchArgument extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getMatchArgument_ParameterName()
	 * @model unique="false"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

} // MatchArgument
