/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel#getLogicModelId <em>Logic Model Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel#getClusters <em>Clusters</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getLogicModel()
 * @model
 * @generated
 */
public interface LogicModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Logic Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Model Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Model Id</em>' attribute.
	 * @see #setLogicModelId(String)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getLogicModel_LogicModelId()
	 * @model unique="false"
	 * @generated
	 */
	String getLogicModelId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel#getLogicModelId <em>Logic Model Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Model Id</em>' attribute.
	 * @see #getLogicModelId()
	 * @generated
	 */
	void setLogicModelId(String value);

	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clusters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getLogicModel_Clusters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Cluster> getClusters();

} // LogicModel
