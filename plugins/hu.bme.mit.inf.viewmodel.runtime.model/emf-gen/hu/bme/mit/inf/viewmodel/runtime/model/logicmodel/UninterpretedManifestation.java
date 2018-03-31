/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uninterpreted Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation#getSourceEObject <em>Source EObject</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getUninterpretedManifestation()
 * @model
 * @generated
 */
public interface UninterpretedManifestation extends Manifestation {
	/**
	 * Returns the value of the '<em><b>Source EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source EObject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source EObject</em>' reference.
	 * @see #setSourceEObject(EObject)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getUninterpretedManifestation_SourceEObject()
	 * @model
	 * @generated
	 */
	EObject getSourceEObject();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation#getSourceEObject <em>Source EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source EObject</em>' reference.
	 * @see #getSourceEObject()
	 * @generated
	 */
	void setSourceEObject(EObject value);

} // UninterpretedManifestation
