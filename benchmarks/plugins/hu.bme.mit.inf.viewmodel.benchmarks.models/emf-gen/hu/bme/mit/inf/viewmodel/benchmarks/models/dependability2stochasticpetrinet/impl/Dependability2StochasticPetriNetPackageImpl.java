/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection;
import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.TraceLink;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage;

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
public class Dependability2StochasticPetriNetPackageImpl extends EPackageImpl implements Dependability2StochasticPetriNetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependability2StochasticPetriNetTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModel2PetriNetModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railwayContainer2PetriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetModuleTraceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredElement2ConnectionEClass = null;

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
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Dependability2StochasticPetriNetPackageImpl() {
		super(eNS_URI, Dependability2StochasticPetriNetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Dependability2StochasticPetriNetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Dependability2StochasticPetriNetPackage init() {
		if (isInited) return (Dependability2StochasticPetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(Dependability2StochasticPetriNetPackage.eNS_URI);

		// Obtain or create and register package
		Dependability2StochasticPetriNetPackageImpl theDependability2StochasticPetriNetPackage = (Dependability2StochasticPetriNetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Dependability2StochasticPetriNetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Dependability2StochasticPetriNetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DependabilityPackage.eINSTANCE.eClass();
		RailwayPackage.eINSTANCE.eClass();
		StochasticPetriNetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDependability2StochasticPetriNetPackage.createPackageContents();

		// Initialize created meta-data
		theDependability2StochasticPetriNetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDependability2StochasticPetriNetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Dependability2StochasticPetriNetPackage.eNS_URI, theDependability2StochasticPetriNetPackage);
		return theDependability2StochasticPetriNetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependability2StochasticPetriNetTrace() {
		return dependability2StochasticPetriNetTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependability2StochasticPetriNetTrace_RailwayContainer() {
		return (EReference)dependability2StochasticPetriNetTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependability2StochasticPetriNetTrace_DependabilityModel() {
		return (EReference)dependability2StochasticPetriNetTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependability2StochasticPetriNetTrace_TraceLinks() {
		return (EReference)dependability2StochasticPetriNetTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceLink() {
		return traceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModel2PetriNetModule() {
		return errorModel2PetriNetModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModel2PetriNetModule_ErrorModel() {
		return (EReference)errorModel2PetriNetModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModel2PetriNetModule_Up() {
		return (EReference)errorModel2PetriNetModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModel2PetriNetModule_Down() {
		return (EReference)errorModel2PetriNetModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModel2PetriNetModule_Repair() {
		return (EReference)errorModel2PetriNetModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailwayContainer2PetriNet() {
		return railwayContainer2PetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayContainer2PetriNet_RailwayContainer() {
		return (EReference)railwayContainer2PetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailwayContainer2PetriNet_PetriNet() {
		return (EReference)railwayContainer2PetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNetModuleTraceLink() {
		return petriNetModuleTraceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNetModuleTraceLink_Nodes() {
		return (EReference)petriNetModuleTraceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNetModuleTraceLink_Arcs() {
		return (EReference)petriNetModuleTraceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredElement2Connection() {
		return requiredElement2ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredElement2Connection_Source() {
		return (EReference)requiredElement2ConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredElement2Connection_Target() {
		return (EReference)requiredElement2ConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability2StochasticPetriNetFactory getDependability2StochasticPetriNetFactory() {
		return (Dependability2StochasticPetriNetFactory)getEFactoryInstance();
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
		dependability2StochasticPetriNetTraceEClass = createEClass(DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE);
		createEReference(dependability2StochasticPetriNetTraceEClass, DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER);
		createEReference(dependability2StochasticPetriNetTraceEClass, DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL);
		createEReference(dependability2StochasticPetriNetTraceEClass, DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS);

		traceLinkEClass = createEClass(TRACE_LINK);

		errorModel2PetriNetModuleEClass = createEClass(ERROR_MODEL2_PETRI_NET_MODULE);
		createEReference(errorModel2PetriNetModuleEClass, ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL);
		createEReference(errorModel2PetriNetModuleEClass, ERROR_MODEL2_PETRI_NET_MODULE__UP);
		createEReference(errorModel2PetriNetModuleEClass, ERROR_MODEL2_PETRI_NET_MODULE__DOWN);
		createEReference(errorModel2PetriNetModuleEClass, ERROR_MODEL2_PETRI_NET_MODULE__REPAIR);

		railwayContainer2PetriNetEClass = createEClass(RAILWAY_CONTAINER2_PETRI_NET);
		createEReference(railwayContainer2PetriNetEClass, RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER);
		createEReference(railwayContainer2PetriNetEClass, RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET);

		petriNetModuleTraceLinkEClass = createEClass(PETRI_NET_MODULE_TRACE_LINK);
		createEReference(petriNetModuleTraceLinkEClass, PETRI_NET_MODULE_TRACE_LINK__NODES);
		createEReference(petriNetModuleTraceLinkEClass, PETRI_NET_MODULE_TRACE_LINK__ARCS);

		requiredElement2ConnectionEClass = createEClass(REQUIRED_ELEMENT2_CONNECTION);
		createEReference(requiredElement2ConnectionEClass, REQUIRED_ELEMENT2_CONNECTION__SOURCE);
		createEReference(requiredElement2ConnectionEClass, REQUIRED_ELEMENT2_CONNECTION__TARGET);
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
		DependabilityPackage theDependabilityPackage = (DependabilityPackage)EPackage.Registry.INSTANCE.getEPackage(DependabilityPackage.eNS_URI);
		StochasticPetriNetPackage theStochasticPetriNetPackage = (StochasticPetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(StochasticPetriNetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		errorModel2PetriNetModuleEClass.getESuperTypes().add(this.getPetriNetModuleTraceLink());
		railwayContainer2PetriNetEClass.getESuperTypes().add(this.getTraceLink());
		petriNetModuleTraceLinkEClass.getESuperTypes().add(this.getTraceLink());
		requiredElement2ConnectionEClass.getESuperTypes().add(this.getPetriNetModuleTraceLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(dependability2StochasticPetriNetTraceEClass, Dependability2StochasticPetriNetTrace.class, "Dependability2StochasticPetriNetTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependability2StochasticPetriNetTrace_RailwayContainer(), theRailwayPackage.getRailwayContainer(), null, "railwayContainer", null, 1, 1, Dependability2StochasticPetriNetTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependability2StochasticPetriNetTrace_DependabilityModel(), theDependabilityPackage.getDependabilityModel(), null, "dependabilityModel", null, 1, 1, Dependability2StochasticPetriNetTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependability2StochasticPetriNetTrace_TraceLinks(), this.getTraceLink(), null, "traceLinks", null, 0, -1, Dependability2StochasticPetriNetTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceLinkEClass, TraceLink.class, "TraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorModel2PetriNetModuleEClass, ErrorModel2PetriNetModule.class, "ErrorModel2PetriNetModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModel2PetriNetModule_ErrorModel(), theDependabilityPackage.getErrorModel(), null, "errorModel", null, 1, 1, ErrorModel2PetriNetModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorModel2PetriNetModule_Up(), theStochasticPetriNetPackage.getPlace(), null, "up", null, 1, 1, ErrorModel2PetriNetModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorModel2PetriNetModule_Down(), theStochasticPetriNetPackage.getPlace(), null, "down", null, 1, 1, ErrorModel2PetriNetModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorModel2PetriNetModule_Repair(), theStochasticPetriNetPackage.getTransition(), null, "repair", null, 1, 1, ErrorModel2PetriNetModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railwayContainer2PetriNetEClass, RailwayContainer2PetriNet.class, "RailwayContainer2PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRailwayContainer2PetriNet_RailwayContainer(), theRailwayPackage.getRailwayContainer(), null, "railwayContainer", null, 1, 1, RailwayContainer2PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayContainer2PetriNet_PetriNet(), theStochasticPetriNetPackage.getPetriNet(), null, "petriNet", null, 1, 1, RailwayContainer2PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriNetModuleTraceLinkEClass, PetriNetModuleTraceLink.class, "PetriNetModuleTraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetriNetModuleTraceLink_Nodes(), theStochasticPetriNetPackage.getNode(), null, "nodes", null, 0, -1, PetriNetModuleTraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNetModuleTraceLink_Arcs(), theStochasticPetriNetPackage.getArc(), null, "arcs", null, 0, -1, PetriNetModuleTraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredElement2ConnectionEClass, RequiredElement2Connection.class, "RequiredElement2Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredElement2Connection_Source(), theDependabilityPackage.getErrorModel(), null, "source", null, 1, 1, RequiredElement2Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredElement2Connection_Target(), theDependabilityPackage.getErrorModel(), null, "target", null, 1, 1, RequiredElement2Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Dependability2StochasticPetriNetPackageImpl
