/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.util;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage
 * @generated
 */
public class LogicModelSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicModelSwitch() {
		if (modelPackage == null) {
			modelPackage = LogicModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogicModelPackage.LOGIC_MODEL: {
				LogicModel logicModel = (LogicModel)theEObject;
				T result = caseLogicModel(logicModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.UNARY_CONSTRAINT: {
				UnaryConstraint unaryConstraint = (UnaryConstraint)theEObject;
				T result = caseUnaryConstraint(unaryConstraint);
				if (result == null) result = caseConstraint(unaryConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.BINARY_CONSTRAINT: {
				BinaryConstraint binaryConstraint = (BinaryConstraint)theEObject;
				T result = caseBinaryConstraint(binaryConstraint);
				if (result == null) result = caseConstraint(binaryConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.ECLASS_CONSTRAINT: {
				EClassConstraint eClassConstraint = (EClassConstraint)theEObject;
				T result = caseEClassConstraint(eClassConstraint);
				if (result == null) result = caseUnaryConstraint(eClassConstraint);
				if (result == null) result = caseConstraint(eClassConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.JAVA_CLASS_CONSTRAINT: {
				JavaClassConstraint javaClassConstraint = (JavaClassConstraint)theEObject;
				T result = caseJavaClassConstraint(javaClassConstraint);
				if (result == null) result = caseUnaryConstraint(javaClassConstraint);
				if (result == null) result = caseConstraint(javaClassConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.CONSTANT_EOBJECT_CONSTRAINT: {
				ConstantEObjectConstraint constantEObjectConstraint = (ConstantEObjectConstraint)theEObject;
				T result = caseConstantEObjectConstraint(constantEObjectConstraint);
				if (result == null) result = caseUnaryConstraint(constantEObjectConstraint);
				if (result == null) result = caseConstraint(constantEObjectConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.CONSTANT_JAVA_OBJECT_CONSTRAINT: {
				ConstantJavaObjectConstraint constantJavaObjectConstraint = (ConstantJavaObjectConstraint)theEObject;
				T result = caseConstantJavaObjectConstraint(constantJavaObjectConstraint);
				if (result == null) result = caseUnaryConstraint(constantJavaObjectConstraint);
				if (result == null) result = caseConstraint(constantJavaObjectConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.EQUIVALENCE_CONSTRAINT: {
				EquivalenceConstraint equivalenceConstraint = (EquivalenceConstraint)theEObject;
				T result = caseEquivalenceConstraint(equivalenceConstraint);
				if (result == null) result = caseBinaryConstraint(equivalenceConstraint);
				if (result == null) result = caseConstraint(equivalenceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.RELATION_CONSTRAINT: {
				RelationConstraint relationConstraint = (RelationConstraint)theEObject;
				T result = caseRelationConstraint(relationConstraint);
				if (result == null) result = caseBinaryConstraint(relationConstraint);
				if (result == null) result = caseConstraint(relationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.CLUSTER: {
				Cluster cluster = (Cluster)theEObject;
				T result = caseCluster(cluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.MANIFESTATION_TRACE: {
				ManifestationTrace manifestationTrace = (ManifestationTrace)theEObject;
				T result = caseManifestationTrace(manifestationTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.MANIFESTATION: {
				Manifestation manifestation = (Manifestation)theEObject;
				T result = caseManifestation(manifestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.INTERPRETED_MANIFESTATION: {
				InterpretedManifestation interpretedManifestation = (InterpretedManifestation)theEObject;
				T result = caseInterpretedManifestation(interpretedManifestation);
				if (result == null) result = caseManifestation(interpretedManifestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.UNINTERPRETED_MANIFESTATION: {
				UninterpretedManifestation uninterpretedManifestation = (UninterpretedManifestation)theEObject;
				T result = caseUninterpretedManifestation(uninterpretedManifestation);
				if (result == null) result = caseManifestation(uninterpretedManifestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicModelPackage.PRIMITIVE_MANIFESTATION: {
				PrimitiveManifestation primitiveManifestation = (PrimitiveManifestation)theEObject;
				T result = casePrimitiveManifestation(primitiveManifestation);
				if (result == null) result = caseManifestation(primitiveManifestation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicModel(LogicModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryConstraint(UnaryConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryConstraint(BinaryConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassConstraint(EClassConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Class Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Class Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaClassConstraint(JavaClassConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant EObject Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant EObject Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantEObjectConstraint(ConstantEObjectConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Java Object Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Java Object Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantJavaObjectConstraint(ConstantJavaObjectConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalence Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalence Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalenceConstraint(EquivalenceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationConstraint(RelationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster(Cluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifestation Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifestation Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestationTrace(ManifestationTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestation(Manifestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interpreted Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interpreted Manifestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterpretedManifestation(InterpretedManifestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uninterpreted Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uninterpreted Manifestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUninterpretedManifestation(UninterpretedManifestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Manifestation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Manifestation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveManifestation(PrimitiveManifestation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogicModelSwitch
