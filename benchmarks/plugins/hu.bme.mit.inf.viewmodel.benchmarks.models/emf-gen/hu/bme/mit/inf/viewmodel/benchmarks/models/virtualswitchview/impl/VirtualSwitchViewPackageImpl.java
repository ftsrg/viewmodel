/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch;
import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class VirtualSwitchViewPackageImpl extends EPackageImpl implements VirtualSwitchViewPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualSwitchEClass = null;

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
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VirtualSwitchViewPackageImpl() {
		super(eNS_URI, VirtualSwitchViewFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VirtualSwitchViewPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VirtualSwitchViewPackage init() {
		if (isInited) return (VirtualSwitchViewPackage)EPackage.Registry.INSTANCE.getEPackage(VirtualSwitchViewPackage.eNS_URI);

		// Obtain or create and register package
		VirtualSwitchViewPackageImpl theVirtualSwitchViewPackage = (VirtualSwitchViewPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VirtualSwitchViewPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VirtualSwitchViewPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVirtualSwitchViewPackage.createPackageContents();

		// Initialize created meta-data
		theVirtualSwitchViewPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVirtualSwitchViewPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VirtualSwitchViewPackage.eNS_URI, theVirtualSwitchViewPackage);
		return theVirtualSwitchViewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualSwitch() {
		return virtualSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualSwitch_CountConnectedInFailure() {
		return (EAttribute)virtualSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualSwitch_ConnectedTo() {
		return (EReference)virtualSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSwitchViewFactory getVirtualSwitchViewFactory() {
		return (VirtualSwitchViewFactory)getEFactoryInstance();
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
		virtualSwitchEClass = createEClass(VIRTUAL_SWITCH);
		createEAttribute(virtualSwitchEClass, VIRTUAL_SWITCH__COUNT_CONNECTED_IN_FAILURE);
		createEReference(virtualSwitchEClass, VIRTUAL_SWITCH__CONNECTED_TO);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualSwitchEClass, VirtualSwitch.class, "VirtualSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualSwitch_CountConnectedInFailure(), ecorePackage.getEInt(), "countConnectedInFailure", null, 0, 1, VirtualSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualSwitch_ConnectedTo(), this.getVirtualSwitch(), null, "connectedTo", null, 0, -1, VirtualSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VirtualSwitchViewPackageImpl
