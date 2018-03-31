/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpreted Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation#getManifestedEObject <em>Manifested EObject</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getInterpretedManifestation()
 * @model
 * @generated
 */
public interface InterpretedManifestation extends Manifestation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getInterpretedManifestation_Type()
	 * @model
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Manifested EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifested EObject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifested EObject</em>' reference.
	 * @see #setManifestedEObject(EObject)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getInterpretedManifestation_ManifestedEObject()
	 * @model
	 * @generated
	 */
	EObject getManifestedEObject();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation#getManifestedEObject <em>Manifested EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifested EObject</em>' reference.
	 * @see #getManifestedEObject()
	 * @generated
	 */
	void setManifestedEObject(EObject value);

} // InterpretedManifestation
