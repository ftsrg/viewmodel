/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EquivalenceConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelFactory;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation;
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicModelPackageImpl extends EPackageImpl implements LogicModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaClassConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEObjectConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantJavaObjectConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalenceConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestationTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interpretedManifestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uninterpretedManifestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveManifestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clusterStateEEnum = null;

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
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicModelPackageImpl() {
		super(eNS_URI, LogicModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogicModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicModelPackage init() {
		if (isInited) return (LogicModelPackage)EPackage.Registry.INSTANCE.getEPackage(LogicModelPackage.eNS_URI);

		// Obtain or create and register package
		LogicModelPackageImpl theLogicModelPackage = (LogicModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogicModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogicModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLogicModelPackage.createPackageContents();

		// Initialize created meta-data
		theLogicModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogicModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogicModelPackage.eNS_URI, theLogicModelPackage);
		return theLogicModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicModel() {
		return logicModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicModel_LogicModelId() {
		return (EAttribute)logicModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicModel_Clusters() {
		return (EReference)logicModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Id() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Cluster() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryConstraint() {
		return unaryConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryConstraint_Variable() {
		return (EReference)unaryConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryConstraint() {
		return binaryConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryConstraint_Left() {
		return (EReference)binaryConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryConstraint_Right() {
		return (EReference)binaryConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassConstraint() {
		return eClassConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassConstraint_TargetEClass() {
		return (EReference)eClassConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaClassConstraint() {
		return javaClassConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaClassConstraint_TargetClass() {
		return (EAttribute)javaClassConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantEObjectConstraint() {
		return constantEObjectConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantEObjectConstraint_Value() {
		return (EReference)constantEObjectConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantEObjectConstraint_ValueType() {
		return (EReference)constantEObjectConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantJavaObjectConstraint() {
		return constantJavaObjectConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantJavaObjectConstraint_Value() {
		return (EAttribute)constantJavaObjectConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantJavaObjectConstraint_ValueType() {
		return (EAttribute)constantJavaObjectConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalenceConstraint() {
		return equivalenceConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationConstraint() {
		return relationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationConstraint_TargetRelation() {
		return (EReference)relationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_Id() {
		return (EAttribute)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_State() {
		return (EAttribute)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Manifestation() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestationTrace() {
		return manifestationTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManifestationTrace_TraceModelId() {
		return (EAttribute)manifestationTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestationTrace_LogicModel() {
		return (EReference)manifestationTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestationTrace_Results() {
		return (EReference)manifestationTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestation() {
		return manifestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterpretedManifestation() {
		return interpretedManifestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterpretedManifestation_Type() {
		return (EReference)interpretedManifestationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterpretedManifestation_ManifestedEObject() {
		return (EReference)interpretedManifestationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUninterpretedManifestation() {
		return uninterpretedManifestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUninterpretedManifestation_SourceEObject() {
		return (EReference)uninterpretedManifestationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveManifestation() {
		return primitiveManifestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveManifestation_Value() {
		return (EAttribute)primitiveManifestationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClusterState() {
		return clusterStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicModelFactory getLogicModelFactory() {
		return (LogicModelFactory)getEFactoryInstance();
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
		logicModelEClass = createEClass(LOGIC_MODEL);
		createEAttribute(logicModelEClass, LOGIC_MODEL__LOGIC_MODEL_ID);
		createEReference(logicModelEClass, LOGIC_MODEL__CLUSTERS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__ID);
		createEReference(variableEClass, VARIABLE__CLUSTER);

		constraintEClass = createEClass(CONSTRAINT);

		unaryConstraintEClass = createEClass(UNARY_CONSTRAINT);
		createEReference(unaryConstraintEClass, UNARY_CONSTRAINT__VARIABLE);

		binaryConstraintEClass = createEClass(BINARY_CONSTRAINT);
		createEReference(binaryConstraintEClass, BINARY_CONSTRAINT__LEFT);
		createEReference(binaryConstraintEClass, BINARY_CONSTRAINT__RIGHT);

		eClassConstraintEClass = createEClass(ECLASS_CONSTRAINT);
		createEReference(eClassConstraintEClass, ECLASS_CONSTRAINT__TARGET_ECLASS);

		javaClassConstraintEClass = createEClass(JAVA_CLASS_CONSTRAINT);
		createEAttribute(javaClassConstraintEClass, JAVA_CLASS_CONSTRAINT__TARGET_CLASS);

		constantEObjectConstraintEClass = createEClass(CONSTANT_EOBJECT_CONSTRAINT);
		createEReference(constantEObjectConstraintEClass, CONSTANT_EOBJECT_CONSTRAINT__VALUE);
		createEReference(constantEObjectConstraintEClass, CONSTANT_EOBJECT_CONSTRAINT__VALUE_TYPE);

		constantJavaObjectConstraintEClass = createEClass(CONSTANT_JAVA_OBJECT_CONSTRAINT);
		createEAttribute(constantJavaObjectConstraintEClass, CONSTANT_JAVA_OBJECT_CONSTRAINT__VALUE);
		createEAttribute(constantJavaObjectConstraintEClass, CONSTANT_JAVA_OBJECT_CONSTRAINT__VALUE_TYPE);

		equivalenceConstraintEClass = createEClass(EQUIVALENCE_CONSTRAINT);

		relationConstraintEClass = createEClass(RELATION_CONSTRAINT);
		createEReference(relationConstraintEClass, RELATION_CONSTRAINT__TARGET_RELATION);

		clusterEClass = createEClass(CLUSTER);
		createEAttribute(clusterEClass, CLUSTER__ID);
		createEAttribute(clusterEClass, CLUSTER__STATE);
		createEReference(clusterEClass, CLUSTER__MANIFESTATION);

		manifestationTraceEClass = createEClass(MANIFESTATION_TRACE);
		createEAttribute(manifestationTraceEClass, MANIFESTATION_TRACE__TRACE_MODEL_ID);
		createEReference(manifestationTraceEClass, MANIFESTATION_TRACE__LOGIC_MODEL);
		createEReference(manifestationTraceEClass, MANIFESTATION_TRACE__RESULTS);

		manifestationEClass = createEClass(MANIFESTATION);

		interpretedManifestationEClass = createEClass(INTERPRETED_MANIFESTATION);
		createEReference(interpretedManifestationEClass, INTERPRETED_MANIFESTATION__TYPE);
		createEReference(interpretedManifestationEClass, INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT);

		uninterpretedManifestationEClass = createEClass(UNINTERPRETED_MANIFESTATION);
		createEReference(uninterpretedManifestationEClass, UNINTERPRETED_MANIFESTATION__SOURCE_EOBJECT);

		primitiveManifestationEClass = createEClass(PRIMITIVE_MANIFESTATION);
		createEAttribute(primitiveManifestationEClass, PRIMITIVE_MANIFESTATION__VALUE);

		// Create enums
		clusterStateEEnum = createEEnum(CLUSTER_STATE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unaryConstraintEClass.getESuperTypes().add(this.getConstraint());
		binaryConstraintEClass.getESuperTypes().add(this.getConstraint());
		eClassConstraintEClass.getESuperTypes().add(this.getUnaryConstraint());
		javaClassConstraintEClass.getESuperTypes().add(this.getUnaryConstraint());
		constantEObjectConstraintEClass.getESuperTypes().add(this.getUnaryConstraint());
		constantJavaObjectConstraintEClass.getESuperTypes().add(this.getUnaryConstraint());
		equivalenceConstraintEClass.getESuperTypes().add(this.getBinaryConstraint());
		relationConstraintEClass.getESuperTypes().add(this.getBinaryConstraint());
		interpretedManifestationEClass.getESuperTypes().add(this.getManifestation());
		uninterpretedManifestationEClass.getESuperTypes().add(this.getManifestation());
		primitiveManifestationEClass.getESuperTypes().add(this.getManifestation());

		// Initialize classes and features; add operations and parameters
		initEClass(logicModelEClass, LogicModel.class, "LogicModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicModel_LogicModelId(), ecorePackage.getEString(), "logicModelId", null, 0, 1, LogicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicModel_Clusters(), this.getCluster(), null, "clusters", null, 0, -1, LogicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Id(), ecorePackage.getELong(), "id", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Cluster(), this.getCluster(), null, "cluster", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryConstraintEClass, UnaryConstraint.class, "UnaryConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryConstraint_Variable(), this.getVariable(), null, "variable", null, 0, 1, UnaryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryConstraintEClass, BinaryConstraint.class, "BinaryConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryConstraint_Left(), this.getVariable(), null, "left", null, 0, 1, BinaryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryConstraint_Right(), this.getVariable(), null, "right", null, 0, 1, BinaryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassConstraintEClass, EClassConstraint.class, "EClassConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassConstraint_TargetEClass(), ecorePackage.getEClass(), null, "targetEClass", null, 0, 1, EClassConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaClassConstraintEClass, JavaClassConstraint.class, "JavaClassConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getJavaClassConstraint_TargetClass(), g1, "targetClass", null, 0, 1, JavaClassConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEObjectConstraintEClass, ConstantEObjectConstraint.class, "ConstantEObjectConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantEObjectConstraint_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, ConstantEObjectConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstantEObjectConstraint_ValueType(), ecorePackage.getEClass(), null, "valueType", null, 0, 1, ConstantEObjectConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantJavaObjectConstraintEClass, ConstantJavaObjectConstraint.class, "ConstantJavaObjectConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantJavaObjectConstraint_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, ConstantJavaObjectConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getConstantJavaObjectConstraint_ValueType(), g1, "valueType", null, 0, 1, ConstantJavaObjectConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equivalenceConstraintEClass, EquivalenceConstraint.class, "EquivalenceConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationConstraintEClass, RelationConstraint.class, "RelationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationConstraint_TargetRelation(), ecorePackage.getEStructuralFeature(), null, "targetRelation", null, 0, 1, RelationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCluster_Id(), ecorePackage.getELong(), "id", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCluster_State(), this.getClusterState(), "state", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Manifestation(), this.getManifestation(), null, "manifestation", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manifestationTraceEClass, ManifestationTrace.class, "ManifestationTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManifestationTrace_TraceModelId(), ecorePackage.getEString(), "traceModelId", null, 0, 1, ManifestationTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifestationTrace_LogicModel(), this.getLogicModel(), null, "logicModel", null, 0, 1, ManifestationTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManifestationTrace_Results(), ecorePackage.getEObject(), null, "results", null, 0, -1, ManifestationTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(manifestationEClass, Manifestation.class, "Manifestation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interpretedManifestationEClass, InterpretedManifestation.class, "InterpretedManifestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterpretedManifestation_Type(), ecorePackage.getEClass(), null, "type", null, 0, 1, InterpretedManifestation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterpretedManifestation_ManifestedEObject(), ecorePackage.getEObject(), null, "manifestedEObject", null, 0, 1, InterpretedManifestation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uninterpretedManifestationEClass, UninterpretedManifestation.class, "UninterpretedManifestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUninterpretedManifestation_SourceEObject(), ecorePackage.getEObject(), null, "sourceEObject", null, 0, 1, UninterpretedManifestation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveManifestationEClass, PrimitiveManifestation.class, "PrimitiveManifestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveManifestation_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, PrimitiveManifestation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(clusterStateEEnum, ClusterState.class, "ClusterState");
		addEEnumLiteral(clusterStateEEnum, ClusterState.CLEAN);
		addEEnumLiteral(clusterStateEEnum, ClusterState.DIRTY);

		// Create resource
		createResource(eNS_URI);
	}

} //LogicModelPackageImpl
