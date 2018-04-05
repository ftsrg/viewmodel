/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch;

import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewPackage;

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
public class Railway2VirtualSwitchViewPackageImpl extends EPackageImpl implements Railway2VirtualSwitchViewPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switch2VirtualSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railway2VirtualSwitchViewTraceEClass = null;

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
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Railway2VirtualSwitchViewPackageImpl() {
		super(eNS_URI, Railway2VirtualSwitchViewFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Railway2VirtualSwitchViewPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Railway2VirtualSwitchViewPackage init() {
		if (isInited) return (Railway2VirtualSwitchViewPackage)EPackage.Registry.INSTANCE.getEPackage(Railway2VirtualSwitchViewPackage.eNS_URI);

		// Obtain or create and register package
		Railway2VirtualSwitchViewPackageImpl theRailway2VirtualSwitchViewPackage = (Railway2VirtualSwitchViewPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Railway2VirtualSwitchViewPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Railway2VirtualSwitchViewPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RailwayPackage.eINSTANCE.eClass();
		VirtualSwitchViewPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRailway2VirtualSwitchViewPackage.createPackageContents();

		// Initialize created meta-data
		theRailway2VirtualSwitchViewPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRailway2VirtualSwitchViewPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Railway2VirtualSwitchViewPackage.eNS_URI, theRailway2VirtualSwitchViewPackage);
		return theRailway2VirtualSwitchViewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch2VirtualSwitch() {
		return switch2VirtualSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch2VirtualSwitch_Switch() {
		return (EReference)switch2VirtualSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch2VirtualSwitch_VirtualSwitch() {
		return (EReference)switch2VirtualSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailway2VirtualSwitchViewTrace() {
		return railway2VirtualSwitchViewTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailway2VirtualSwitchViewTrace_TraceLinks() {
		return (EReference)railway2VirtualSwitchViewTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailway2VirtualSwitchViewTrace_Source() {
		return (EReference)railway2VirtualSwitchViewTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2VirtualSwitchViewFactory getRailway2VirtualSwitchViewFactory() {
		return (Railway2VirtualSwitchViewFactory)getEFactoryInstance();
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
		switch2VirtualSwitchEClass = createEClass(SWITCH2_VIRTUAL_SWITCH);
		createEReference(switch2VirtualSwitchEClass, SWITCH2_VIRTUAL_SWITCH__SWITCH);
		createEReference(switch2VirtualSwitchEClass, SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH);

		railway2VirtualSwitchViewTraceEClass = createEClass(RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE);
		createEReference(railway2VirtualSwitchViewTraceEClass, RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE__TRACE_LINKS);
		createEReference(railway2VirtualSwitchViewTraceEClass, RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE__SOURCE);
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
		VirtualSwitchViewPackage theVirtualSwitchViewPackage = (VirtualSwitchViewPackage)EPackage.Registry.INSTANCE.getEPackage(VirtualSwitchViewPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(switch2VirtualSwitchEClass, Switch2VirtualSwitch.class, "Switch2VirtualSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitch2VirtualSwitch_Switch(), theRailwayPackage.getSwitch(), null, "switch", null, 0, 1, Switch2VirtualSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch2VirtualSwitch_VirtualSwitch(), theVirtualSwitchViewPackage.getVirtualSwitch(), null, "virtualSwitch", null, 0, 1, Switch2VirtualSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railway2VirtualSwitchViewTraceEClass, Railway2VirtualSwitchViewTrace.class, "Railway2VirtualSwitchViewTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRailway2VirtualSwitchViewTrace_TraceLinks(), this.getSwitch2VirtualSwitch(), null, "traceLinks", null, 0, -1, Railway2VirtualSwitchViewTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailway2VirtualSwitchViewTrace_Source(), theRailwayPackage.getRailwayContainer(), null, "source", null, 0, 1, Railway2VirtualSwitchViewTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Railway2VirtualSwitchViewPackageImpl
