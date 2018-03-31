/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable#getId <em>Id</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable#getCluster <em>Cluster</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getVariable_Id()
	 * @model unique="false"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference.
	 * @see #setCluster(Cluster)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getVariable_Cluster()
	 * @model
	 * @generated
	 */
	Cluster getCluster();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable#getCluster <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(Cluster value);

} // Variable
