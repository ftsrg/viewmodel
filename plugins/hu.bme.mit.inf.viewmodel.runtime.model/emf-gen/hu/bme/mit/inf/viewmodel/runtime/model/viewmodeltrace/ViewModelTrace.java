/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Model Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getTraceModelId <em>Trace Model Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getLogicModel <em>Logic Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getViewModelTrace()
 * @model
 * @generated
 */
public interface ViewModelTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Model Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Model Id</em>' attribute.
	 * @see #setTraceModelId(String)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getViewModelTrace_TraceModelId()
	 * @model unique="false"
	 * @generated
	 */
	String getTraceModelId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getTraceModelId <em>Trace Model Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Model Id</em>' attribute.
	 * @see #getTraceModelId()
	 * @generated
	 */
	void setTraceModelId(String value);

	/**
	 * Returns the value of the '<em><b>Logic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Model</em>' reference.
	 * @see #setLogicModel(LogicModel)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getViewModelTrace_LogicModel()
	 * @model
	 * @generated
	 */
	LogicModel getLogicModel();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getLogicModel <em>Logic Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Model</em>' reference.
	 * @see #getLogicModel()
	 * @generated
	 */
	void setLogicModel(LogicModel value);

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getViewModelTrace_Traces()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Trace> getTraces();

} // ViewModelTrace
