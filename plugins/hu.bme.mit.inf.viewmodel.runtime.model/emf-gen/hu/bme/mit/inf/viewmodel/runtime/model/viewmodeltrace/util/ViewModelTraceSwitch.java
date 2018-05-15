/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.util;

import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.*;

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
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage
 * @generated
 */
public class ViewModelTraceSwitch<T> extends Switch<T> {
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
	protected static ViewModelTracePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelTraceSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewModelTracePackage.eINSTANCE;
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
			case ViewModelTracePackage.VIEW_MODEL_TRACE: {
				ViewModelTrace viewModelTrace = (ViewModelTrace)theEObject;
				T result = caseViewModelTrace(viewModelTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewModelTracePackage.MATCH_ARGUMENT_TUPLE: {
				MatchArgumentTuple matchArgumentTuple = (MatchArgumentTuple)theEObject;
				T result = caseMatchArgumentTuple(matchArgumentTuple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewModelTracePackage.MATCH_ARGUMENT: {
				MatchArgument matchArgument = (MatchArgument)theEObject;
				T result = caseMatchArgument(matchArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewModelTracePackage.EOBJECT_MATCH_ARGUMENT: {
				EObjectMatchArgument eObjectMatchArgument = (EObjectMatchArgument)theEObject;
				T result = caseEObjectMatchArgument(eObjectMatchArgument);
				if (result == null) result = caseMatchArgument(eObjectMatchArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewModelTracePackage.JAVA_OBJECT_MATCH_ARGUMENT: {
				JavaObjectMatchArgument javaObjectMatchArgument = (JavaObjectMatchArgument)theEObject;
				T result = caseJavaObjectMatchArgument(javaObjectMatchArgument);
				if (result == null) result = caseMatchArgument(javaObjectMatchArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewModelTracePackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewModelTracePackage.VARIABLE_INSTANTIATION_TRACE: {
				VariableInstantiationTrace variableInstantiationTrace = (VariableInstantiationTrace)theEObject;
				T result = caseVariableInstantiationTrace(variableInstantiationTrace);
				if (result == null) result = caseTrace(variableInstantiationTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewModelTracePackage.STRING_VARIABLE_PAIR: {
				StringVariablePair stringVariablePair = (StringVariablePair)theEObject;
				T result = caseStringVariablePair(stringVariablePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewModelTracePackage.CONSTRAINT_TRACE: {
				ConstraintTrace constraintTrace = (ConstraintTrace)theEObject;
				T result = caseConstraintTrace(constraintTrace);
				if (result == null) result = caseTrace(constraintTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Model Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Model Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewModelTrace(ViewModelTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Argument Tuple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Argument Tuple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchArgumentTuple(MatchArgumentTuple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchArgument(MatchArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Match Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Match Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectMatchArgument(EObjectMatchArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Object Match Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Object Match Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaObjectMatchArgument(JavaObjectMatchArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Instantiation Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Instantiation Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableInstantiationTrace(VariableInstantiationTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Variable Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Variable Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVariablePair(StringVariablePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintTrace(ConstraintTrace object) {
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

} //ViewModelTraceSwitch
