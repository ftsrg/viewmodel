/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getTraceName <em>Trace Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getArgumentTuple <em>Argument Tuple</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getState <em>State</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getTrace()
 * @model abstract="true"
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Name</em>' attribute.
	 * @see #setTraceName(String)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getTrace_TraceName()
	 * @model unique="false"
	 * @generated
	 */
	String getTraceName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getTraceName <em>Trace Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Name</em>' attribute.
	 * @see #getTraceName()
	 * @generated
	 */
	void setTraceName(String value);

	/**
	 * Returns the value of the '<em><b>Argument Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Tuple</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Tuple</em>' containment reference.
	 * @see #setArgumentTuple(MatchArgumentTuple)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getTrace_ArgumentTuple()
	 * @model containment="true"
	 * @generated
	 */
	MatchArgumentTuple getArgumentTuple();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getArgumentTuple <em>Argument Tuple</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Tuple</em>' containment reference.
	 * @see #getArgumentTuple()
	 * @generated
	 */
	void setArgumentTuple(MatchArgumentTuple value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState
	 * @see #setState(TraceState)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getTrace_State()
	 * @model unique="false"
	 * @generated
	 */
	TraceState getState();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState
	 * @see #getState()
	 * @generated
	 */
	void setState(TraceState value);

} // Trace
