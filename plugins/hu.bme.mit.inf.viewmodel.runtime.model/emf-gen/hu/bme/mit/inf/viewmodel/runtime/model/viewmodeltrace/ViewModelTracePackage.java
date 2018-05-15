/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTraceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/hu.bme.mit.inf.viewmodel.runtime.model/src-gen' prefix='ViewModelTrace' fileExtensions='viewmodeltrace' providerName='BME MIT FTSRG' operationReflection='false' basePackage='hu.bme.mit.inf.viewmodel.runtime.model'"
 * @generated
 */
public interface ViewModelTracePackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viewmodeltrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/emf/2017/ViewModelTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "viewmodeltrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewModelTracePackage eINSTANCE = hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTraceImpl <em>View Model Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTraceImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getViewModelTrace()
	 * @generated
	 */
	int VIEW_MODEL_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Trace Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_TRACE__TRACE_MODEL_ID = 0;

	/**
	 * The feature id for the '<em><b>Logic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_TRACE__LOGIC_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_TRACE__TRACES = 2;

	/**
	 * The number of structural features of the '<em>View Model Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_TRACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.MatchArgumentTupleImpl <em>Match Argument Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.MatchArgumentTupleImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getMatchArgumentTuple()
	 * @generated
	 */
	int MATCH_ARGUMENT_TUPLE = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_ARGUMENT_TUPLE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Match Argument Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_ARGUMENT_TUPLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.MatchArgumentImpl <em>Match Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.MatchArgumentImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getMatchArgument()
	 * @generated
	 */
	int MATCH_ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_ARGUMENT__PARAMETER_NAME = 0;

	/**
	 * The number of structural features of the '<em>Match Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_ARGUMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.EObjectMatchArgumentImpl <em>EObject Match Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.EObjectMatchArgumentImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getEObjectMatchArgument()
	 * @generated
	 */
	int EOBJECT_MATCH_ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_MATCH_ARGUMENT__PARAMETER_NAME = MATCH_ARGUMENT__PARAMETER_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_MATCH_ARGUMENT__VALUE = MATCH_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Match Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_MATCH_ARGUMENT_FEATURE_COUNT = MATCH_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.JavaObjectMatchArgumentImpl <em>Java Object Match Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.JavaObjectMatchArgumentImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getJavaObjectMatchArgument()
	 * @generated
	 */
	int JAVA_OBJECT_MATCH_ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OBJECT_MATCH_ARGUMENT__PARAMETER_NAME = MATCH_ARGUMENT__PARAMETER_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OBJECT_MATCH_ARGUMENT__VALUE = MATCH_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Object Match Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OBJECT_MATCH_ARGUMENT_FEATURE_COUNT = MATCH_ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.TraceImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 5;

	/**
	 * The feature id for the '<em><b>Trace Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TRACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Argument Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ARGUMENT_TUPLE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__STATE = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.VariableInstantiationTraceImpl <em>Variable Instantiation Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.VariableInstantiationTraceImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getVariableInstantiationTrace()
	 * @generated
	 */
	int VARIABLE_INSTANTIATION_TRACE = 6;

	/**
	 * The feature id for the '<em><b>Trace Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INSTANTIATION_TRACE__TRACE_NAME = TRACE__TRACE_NAME;

	/**
	 * The feature id for the '<em><b>Argument Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INSTANTIATION_TRACE__ARGUMENT_TUPLE = TRACE__ARGUMENT_TUPLE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INSTANTIATION_TRACE__STATE = TRACE__STATE;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INSTANTIATION_TRACE__VARIABLES = TRACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Instantiation Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INSTANTIATION_TRACE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.StringVariablePairImpl <em>String Variable Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.StringVariablePairImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getStringVariablePair()
	 * @generated
	 */
	int STRING_VARIABLE_PAIR = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String Variable Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ConstraintTraceImpl <em>Constraint Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ConstraintTraceImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getConstraintTrace()
	 * @generated
	 */
	int CONSTRAINT_TRACE = 8;

	/**
	 * The feature id for the '<em><b>Trace Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TRACE__TRACE_NAME = TRACE__TRACE_NAME;

	/**
	 * The feature id for the '<em><b>Argument Tuple</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TRACE__ARGUMENT_TUPLE = TRACE__ARGUMENT_TUPLE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TRACE__STATE = TRACE__STATE;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TRACE__LOCAL_VARIABLES = TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TRACE__CONSTRAINTS = TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constraint Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TRACE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState <em>Trace State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getTraceState()
	 * @generated
	 */
	int TRACE_STATE = 9;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace <em>View Model Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model Trace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace
	 * @generated
	 */
	EClass getViewModelTrace();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getTraceModelId <em>Trace Model Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Model Id</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getTraceModelId()
	 * @see #getViewModelTrace()
	 * @generated
	 */
	EAttribute getViewModelTrace_TraceModelId();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getLogicModel <em>Logic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logic Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getLogicModel()
	 * @see #getViewModelTrace()
	 * @generated
	 */
	EReference getViewModelTrace_LogicModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace#getTraces()
	 * @see #getViewModelTrace()
	 * @generated
	 */
	EReference getViewModelTrace_Traces();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple <em>Match Argument Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Argument Tuple</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple
	 * @generated
	 */
	EClass getMatchArgumentTuple();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple#getElements()
	 * @see #getMatchArgumentTuple()
	 * @generated
	 */
	EReference getMatchArgumentTuple_Elements();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument <em>Match Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Argument</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument
	 * @generated
	 */
	EClass getMatchArgument();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument#getParameterName()
	 * @see #getMatchArgument()
	 * @generated
	 */
	EAttribute getMatchArgument_ParameterName();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.EObjectMatchArgument <em>EObject Match Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Match Argument</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.EObjectMatchArgument
	 * @generated
	 */
	EClass getEObjectMatchArgument();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.EObjectMatchArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.EObjectMatchArgument#getValue()
	 * @see #getEObjectMatchArgument()
	 * @generated
	 */
	EReference getEObjectMatchArgument_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.JavaObjectMatchArgument <em>Java Object Match Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Object Match Argument</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.JavaObjectMatchArgument
	 * @generated
	 */
	EClass getJavaObjectMatchArgument();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.JavaObjectMatchArgument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.JavaObjectMatchArgument#getValue()
	 * @see #getJavaObjectMatchArgument()
	 * @generated
	 */
	EAttribute getJavaObjectMatchArgument_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getTraceName <em>Trace Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Name</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getTraceName()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_TraceName();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getArgumentTuple <em>Argument Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument Tuple</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getArgumentTuple()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_ArgumentTuple();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace#getState()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_State();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace <em>Variable Instantiation Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Instantiation Trace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace
	 * @generated
	 */
	EClass getVariableInstantiationTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace#getVariables()
	 * @see #getVariableInstantiationTrace()
	 * @generated
	 */
	EReference getVariableInstantiationTrace_Variables();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair <em>String Variable Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Variable Pair</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair
	 * @generated
	 */
	EClass getStringVariablePair();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair#getKey()
	 * @see #getStringVariablePair()
	 * @generated
	 */
	EAttribute getStringVariablePair_Key();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair#getValue()
	 * @see #getStringVariablePair()
	 * @generated
	 */
	EReference getStringVariablePair_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace <em>Constraint Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Trace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace
	 * @generated
	 */
	EClass getConstraintTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace#getLocalVariables()
	 * @see #getConstraintTrace()
	 * @generated
	 */
	EReference getConstraintTrace_LocalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace#getConstraints()
	 * @see #getConstraintTrace()
	 * @generated
	 */
	EReference getConstraintTrace_Constraints();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState <em>Trace State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trace State</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState
	 * @generated
	 */
	EEnum getTraceState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewModelTraceFactory getViewModelTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTraceImpl <em>View Model Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTraceImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getViewModelTrace()
		 * @generated
		 */
		EClass VIEW_MODEL_TRACE = eINSTANCE.getViewModelTrace();

		/**
		 * The meta object literal for the '<em><b>Trace Model Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_MODEL_TRACE__TRACE_MODEL_ID = eINSTANCE.getViewModelTrace_TraceModelId();

		/**
		 * The meta object literal for the '<em><b>Logic Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL_TRACE__LOGIC_MODEL = eINSTANCE.getViewModelTrace_LogicModel();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL_TRACE__TRACES = eINSTANCE.getViewModelTrace_Traces();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.MatchArgumentTupleImpl <em>Match Argument Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.MatchArgumentTupleImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getMatchArgumentTuple()
		 * @generated
		 */
		EClass MATCH_ARGUMENT_TUPLE = eINSTANCE.getMatchArgumentTuple();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_ARGUMENT_TUPLE__ELEMENTS = eINSTANCE.getMatchArgumentTuple_Elements();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.MatchArgumentImpl <em>Match Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.MatchArgumentImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getMatchArgument()
		 * @generated
		 */
		EClass MATCH_ARGUMENT = eINSTANCE.getMatchArgument();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_ARGUMENT__PARAMETER_NAME = eINSTANCE.getMatchArgument_ParameterName();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.EObjectMatchArgumentImpl <em>EObject Match Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.EObjectMatchArgumentImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getEObjectMatchArgument()
		 * @generated
		 */
		EClass EOBJECT_MATCH_ARGUMENT = eINSTANCE.getEObjectMatchArgument();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_MATCH_ARGUMENT__VALUE = eINSTANCE.getEObjectMatchArgument_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.JavaObjectMatchArgumentImpl <em>Java Object Match Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.JavaObjectMatchArgumentImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getJavaObjectMatchArgument()
		 * @generated
		 */
		EClass JAVA_OBJECT_MATCH_ARGUMENT = eINSTANCE.getJavaObjectMatchArgument();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_OBJECT_MATCH_ARGUMENT__VALUE = eINSTANCE.getJavaObjectMatchArgument_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.TraceImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Trace Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__TRACE_NAME = eINSTANCE.getTrace_TraceName();

		/**
		 * The meta object literal for the '<em><b>Argument Tuple</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__ARGUMENT_TUPLE = eINSTANCE.getTrace_ArgumentTuple();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__STATE = eINSTANCE.getTrace_State();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.VariableInstantiationTraceImpl <em>Variable Instantiation Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.VariableInstantiationTraceImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getVariableInstantiationTrace()
		 * @generated
		 */
		EClass VARIABLE_INSTANTIATION_TRACE = eINSTANCE.getVariableInstantiationTrace();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INSTANTIATION_TRACE__VARIABLES = eINSTANCE.getVariableInstantiationTrace_Variables();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.StringVariablePairImpl <em>String Variable Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.StringVariablePairImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getStringVariablePair()
		 * @generated
		 */
		EClass STRING_VARIABLE_PAIR = eINSTANCE.getStringVariablePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VARIABLE_PAIR__KEY = eINSTANCE.getStringVariablePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_VARIABLE_PAIR__VALUE = eINSTANCE.getStringVariablePair_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ConstraintTraceImpl <em>Constraint Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ConstraintTraceImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getConstraintTrace()
		 * @generated
		 */
		EClass CONSTRAINT_TRACE = eINSTANCE.getConstraintTrace();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_TRACE__LOCAL_VARIABLES = eINSTANCE.getConstraintTrace_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_TRACE__CONSTRAINTS = eINSTANCE.getConstraintTrace_Constraints();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState <em>Trace State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl.ViewModelTracePackageImpl#getTraceState()
		 * @generated
		 */
		EEnum TRACE_STATE = eINSTANCE.getTraceState();

	}

} //ViewModelTracePackage
