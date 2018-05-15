/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.FailureRepairModel;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ImmediateRepairModel;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependabilityPackageImpl extends EPackageImpl implements DependabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependabilityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureRepairModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateRepairModelEClass = null;

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
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DependabilityPackageImpl() {
		super(eNS_URI, DependabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DependabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DependabilityPackage init() {
		if (isInited) return (DependabilityPackage)EPackage.Registry.INSTANCE.getEPackage(DependabilityPackage.eNS_URI);

		// Obtain or create and register package
		DependabilityPackageImpl theDependabilityPackage = (DependabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DependabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DependabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RailwayPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDependabilityPackage.createPackageContents();

		// Initialize created meta-data
		theDependabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDependabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DependabilityPackage.eNS_URI, theDependabilityPackage);
		return theDependabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependabilityModel() {
		return dependabilityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependabilityModel_ErrorModels() {
		return (EReference)dependabilityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModel() {
		return errorModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModel_RailwayElement() {
		return (EReference)errorModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureRepairModel() {
		return failureRepairModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmediateRepairModel() {
		return immediateRepairModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityFactory getDependabilityFactory() {
		return (DependabilityFactory)getEFactoryInstance();
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
		dependabilityModelEClass = createEClass(DEPENDABILITY_MODEL);
		createEReference(dependabilityModelEClass, DEPENDABILITY_MODEL__ERROR_MODELS);

		errorModelEClass = createEClass(ERROR_MODEL);
		createEReference(errorModelEClass, ERROR_MODEL__RAILWAY_ELEMENT);

		failureRepairModelEClass = createEClass(FAILURE_REPAIR_MODEL);

		immediateRepairModelEClass = createEClass(IMMEDIATE_REPAIR_MODEL);
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
		RailwayPackage theRailwayPackage = (RailwayPackage)EPackage.Registry.INSTANCE.getEPackage(RailwayPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		failureRepairModelEClass.getESuperTypes().add(this.getErrorModel());
		immediateRepairModelEClass.getESuperTypes().add(this.getErrorModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(dependabilityModelEClass, DependabilityModel.class, "DependabilityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependabilityModel_ErrorModels(), this.getErrorModel(), null, "errorModels", null, 0, -1, DependabilityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorModelEClass, ErrorModel.class, "ErrorModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModel_RailwayElement(), theRailwayPackage.getRailwayElement(), null, "railwayElement", null, 1, 1, ErrorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureRepairModelEClass, FailureRepairModel.class, "FailureRepairModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(immediateRepairModelEClass, ImmediateRepairModel.class, "ImmediateRepairModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DependabilityPackageImpl
