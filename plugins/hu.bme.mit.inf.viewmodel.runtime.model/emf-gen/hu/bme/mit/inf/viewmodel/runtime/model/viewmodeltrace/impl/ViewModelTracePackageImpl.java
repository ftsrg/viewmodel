/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage;

import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.EObjectMatchArgument;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.JavaObjectMatchArgument;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.TraceState;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTraceFactory;
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewModelTracePackageImpl extends EPackageImpl implements ViewModelTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchArgumentTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectMatchArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaObjectMatchArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableInstantiationTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVariablePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum traceStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewModelTracePackageImpl() {
		super(eNS_URI, ViewModelTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ViewModelTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewModelTracePackage init() {
		if (isInited) return (ViewModelTracePackage)EPackage.Registry.INSTANCE.getEPackage(ViewModelTracePackage.eNS_URI);

		// Obtain or create and register package
		ViewModelTracePackageImpl theViewModelTracePackage = (ViewModelTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewModelTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewModelTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LogicModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViewModelTracePackage.createPackageContents();

		// Initialize created meta-data
		theViewModelTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewModelTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewModelTracePackage.eNS_URI, theViewModelTracePackage);
		return theViewModelTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModelTrace() {
		return viewModelTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewModelTrace_TraceModelId() {
		return (EAttribute)viewModelTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModelTrace_LogicModel() {
		return (EReference)viewModelTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModelTrace_Traces() {
		return (EReference)viewModelTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchArgumentTuple() {
		return matchArgumentTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMatchArgumentTuple_Elements() {
		return (EReference)matchArgumentTupleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchArgument() {
		return matchArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchArgument_ParameterName() {
		return (EAttribute)matchArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectMatchArgument() {
		return eObjectMatchArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectMatchArgument_Value() {
		return (EReference)eObjectMatchArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaObjectMatchArgument() {
		return javaObjectMatchArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaObjectMatchArgument_Value() {
		return (EAttribute)javaObjectMatchArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrace_TraceName() {
		return (EAttribute)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_ArgumentTuple() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrace_State() {
		return (EAttribute)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableInstantiationTrace() {
		return variableInstantiationTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableInstantiationTrace_Variables() {
		return (EReference)variableInstantiationTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVariablePair() {
		return stringVariablePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVariablePair_Key() {
		return (EAttribute)stringVariablePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringVariablePair_Value() {
		return (EReference)stringVariablePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintTrace() {
		return constraintTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintTrace_LocalVariables() {
		return (EReference)constraintTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintTrace_Constraints() {
		return (EReference)constraintTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTraceState() {
		return traceStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelTraceFactory getViewModelTraceFactory() {
		return (ViewModelTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		viewModelTraceEClass = createEClass(VIEW_MODEL_TRACE);
		createEAttribute(viewModelTraceEClass, VIEW_MODEL_TRACE__TRACE_MODEL_ID);
		createEReference(viewModelTraceEClass, VIEW_MODEL_TRACE__LOGIC_MODEL);
		createEReference(viewModelTraceEClass, VIEW_MODEL_TRACE__TRACES);

		matchArgumentTupleEClass = createEClass(MATCH_ARGUMENT_TUPLE);
		createEReference(matchArgumentTupleEClass, MATCH_ARGUMENT_TUPLE__ELEMENTS);

		matchArgumentEClass = createEClass(MATCH_ARGUMENT);
		createEAttribute(matchArgumentEClass, MATCH_ARGUMENT__PARAMETER_NAME);

		eObjectMatchArgumentEClass = createEClass(EOBJECT_MATCH_ARGUMENT);
		createEReference(eObjectMatchArgumentEClass, EOBJECT_MATCH_ARGUMENT__VALUE);

		javaObjectMatchArgumentEClass = createEClass(JAVA_OBJECT_MATCH_ARGUMENT);
		createEAttribute(javaObjectMatchArgumentEClass, JAVA_OBJECT_MATCH_ARGUMENT__VALUE);

		traceEClass = createEClass(TRACE);
		createEAttribute(traceEClass, TRACE__TRACE_NAME);
		createEReference(traceEClass, TRACE__ARGUMENT_TUPLE);
		createEAttribute(traceEClass, TRACE__STATE);

		variableInstantiationTraceEClass = createEClass(VARIABLE_INSTANTIATION_TRACE);
		createEReference(variableInstantiationTraceEClass, VARIABLE_INSTANTIATION_TRACE__VARIABLES);

		stringVariablePairEClass = createEClass(STRING_VARIABLE_PAIR);
		createEAttribute(stringVariablePairEClass, STRING_VARIABLE_PAIR__KEY);
		createEReference(stringVariablePairEClass, STRING_VARIABLE_PAIR__VALUE);

		constraintTraceEClass = createEClass(CONSTRAINT_TRACE);
		createEReference(constraintTraceEClass, CONSTRAINT_TRACE__LOCAL_VARIABLES);
		createEReference(constraintTraceEClass, CONSTRAINT_TRACE__CONSTRAINTS);

		// Create enums
		traceStateEEnum = createEEnum(TRACE_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LogicModelPackage theLogicModelPackage = (LogicModelPackage)EPackage.Registry.INSTANCE.getEPackage(LogicModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eObjectMatchArgumentEClass.getESuperTypes().add(this.getMatchArgument());
		javaObjectMatchArgumentEClass.getESuperTypes().add(this.getMatchArgument());
		variableInstantiationTraceEClass.getESuperTypes().add(this.getTrace());
		constraintTraceEClass.getESuperTypes().add(this.getTrace());

		// Initialize classes and features; add operations and parameters
		initEClass(viewModelTraceEClass, ViewModelTrace.class, "ViewModelTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewModelTrace_TraceModelId(), ecorePackage.getEString(), "traceModelId", null, 0, 1, ViewModelTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewModelTrace_LogicModel(), theLogicModelPackage.getLogicModel(), null, "logicModel", null, 0, 1, ViewModelTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewModelTrace_Traces(), this.getTrace(), null, "traces", null, 0, -1, ViewModelTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(matchArgumentTupleEClass, MatchArgumentTuple.class, "MatchArgumentTuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMatchArgumentTuple_Elements(), this.getMatchArgument(), null, "elements", null, 0, -1, MatchArgumentTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(matchArgumentEClass, MatchArgument.class, "MatchArgument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchArgument_ParameterName(), ecorePackage.getEString(), "parameterName", null, 0, 1, MatchArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectMatchArgumentEClass, EObjectMatchArgument.class, "EObjectMatchArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectMatchArgument_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, EObjectMatchArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaObjectMatchArgumentEClass, JavaObjectMatchArgument.class, "JavaObjectMatchArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaObjectMatchArgument_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, JavaObjectMatchArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrace_TraceName(), ecorePackage.getEString(), "traceName", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_ArgumentTuple(), this.getMatchArgumentTuple(), null, "argumentTuple", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrace_State(), this.getTraceState(), "state", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableInstantiationTraceEClass, VariableInstantiationTrace.class, "VariableInstantiationTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableInstantiationTrace_Variables(), this.getStringVariablePair(), null, "variables", null, 0, -1, VariableInstantiationTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringVariablePairEClass, StringVariablePair.class, "StringVariablePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringVariablePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, StringVariablePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringVariablePair_Value(), theLogicModelPackage.getVariable(), null, "value", null, 0, 1, StringVariablePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintTraceEClass, ConstraintTrace.class, "ConstraintTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintTrace_LocalVariables(), theLogicModelPackage.getVariable(), null, "localVariables", null, 0, -1, ConstraintTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraintTrace_Constraints(), theLogicModelPackage.getConstraint(), null, "constraints", null, 0, -1, ConstraintTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(traceStateEEnum, TraceState.class, "TraceState");
		addEEnumLiteral(traceStateEEnum, TraceState.USED);
		addEEnumLiteral(traceStateEEnum, TraceState.UNUSED);

		// Create resource
		createResource(eNS_URI);
	}

} //ViewModelTracePackageImpl
