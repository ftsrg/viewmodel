/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint#getTargetRelation <em>Target Relation</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getRelationConstraint()
 * @model
 * @generated
 */
public interface RelationConstraint extends BinaryConstraint {
	/**
	 * Returns the value of the '<em><b>Target Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Relation</em>' reference.
	 * @see #setTargetRelation(EStructuralFeature)
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#getRelationConstraint_TargetRelation()
	 * @model
	 * @generated
	 */
	EStructuralFeature getTargetRelation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint#getTargetRelation <em>Target Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Relation</em>' reference.
	 * @see #getTargetRelation()
	 * @generated
	 */
	void setTargetRelation(EStructuralFeature value);

} // RelationConstraint
