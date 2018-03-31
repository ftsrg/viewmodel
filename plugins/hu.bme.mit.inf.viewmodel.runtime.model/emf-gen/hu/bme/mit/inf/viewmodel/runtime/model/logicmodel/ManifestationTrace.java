/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifestation Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getTraceModelId <em>Trace Model Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getLogicModel <em>Logic Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getManifestationTrace()
 * @model
 * @generated
 */
public interface ManifestationTrace extends EObject {
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
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getManifestationTrace_TraceModelId()
	 * @model unique="false"
	 * @generated
	 */
	String getTraceModelId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getTraceModelId <em>Trace Model Id</em>}' attribute.
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
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getManifestationTrace_LogicModel()
	 * @model
	 * @generated
	 */
	LogicModel getLogicModel();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getLogicModel <em>Logic Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Model</em>' reference.
	 * @see #getLogicModel()
	 * @generated
	 */
	void setLogicModel(LogicModel value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getManifestationTrace_Results()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getResults();

} // ManifestationTrace
