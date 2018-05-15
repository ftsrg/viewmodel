/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.PetriNetModuleTraceLink;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RailwayContainer2PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.TraceLink;

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
public class Railway2StochasticPetriNetPackageImpl extends EPackageImpl implements Railway2StochasticPetriNetPackage {
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
	private EClass railway2StochasticPetriNetTraceEClass = null;

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
	private EClass route2FailureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredElement2FailureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredElement2ConnectionEClass = null;

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
	private EClass traceLinkEClass = null;

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
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Railway2StochasticPetriNetPackageImpl() {
		super(eNS_URI, Railway2StochasticPetriNetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Railway2StochasticPetriNetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Railway2StochasticPetriNetPackage init() {
		if (isInited) return (Railway2StochasticPetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(Railway2StochasticPetriNetPackage.eNS_URI);

		// Obtain or create and register package
		Railway2StochasticPetriNetPackageImpl theRailway2StochasticPetriNetPackage = (Railway2StochasticPetriNetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Railway2StochasticPetriNetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Railway2StochasticPetriNetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RailwayPackage.eINSTANCE.eClass();
		StochasticPetriNetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRailway2StochasticPetriNetPackage.createPackageContents();

		// Initialize created meta-data
		theRailway2StochasticPetriNetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRailway2StochasticPetriNetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Railway2StochasticPetriNetPackage.eNS_URI, theRailway2StochasticPetriNetPackage);
		return theRailway2StochasticPetriNetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailway2StochasticPetriNetTrace() {
		return railway2StochasticPetriNetTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailway2StochasticPetriNetTrace_TraceLinks() {
		return (EReference)railway2StochasticPetriNetTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRailway2StochasticPetriNetTrace_Source() {
		return (EReference)railway2StochasticPetriNetTraceEClass.getEStructuralFeatures().get(1);
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
	public EClass getRoute2FailureModel() {
		return route2FailureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute2FailureModel_Route() {
		return (EReference)route2FailureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute2FailureModel_Operational() {
		return (EReference)route2FailureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute2FailureModel_Failed() {
		return (EReference)route2FailureModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoute2FailureModel_Repair() {
		return (EReference)route2FailureModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredElement2FailureModel() {
		return requiredElement2FailureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredElement2FailureModel_RailwayElement() {
		return (EReference)requiredElement2FailureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredElement2FailureModel_Operational() {
		return (EReference)requiredElement2FailureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredElement2FailureModel_Failed() {
		return (EReference)requiredElement2FailureModelEClass.getEStructuralFeatures().get(2);
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
	public EReference getRequiredElement2Connection_Route() {
		return (EReference)requiredElement2ConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredElement2Connection_RailwayElement() {
		return (EReference)requiredElement2ConnectionEClass.getEStructuralFeatures().get(1);
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
	public EClass getTraceLink() {
		return traceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2StochasticPetriNetFactory getRailway2StochasticPetriNetFactory() {
		return (Railway2StochasticPetriNetFactory)getEFactoryInstance();
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
		railway2StochasticPetriNetTraceEClass = createEClass(RAILWAY2_STOCHASTIC_PETRI_NET_TRACE);
		createEReference(railway2StochasticPetriNetTraceEClass, RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS);
		createEReference(railway2StochasticPetriNetTraceEClass, RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE);

		petriNetModuleTraceLinkEClass = createEClass(PETRI_NET_MODULE_TRACE_LINK);
		createEReference(petriNetModuleTraceLinkEClass, PETRI_NET_MODULE_TRACE_LINK__NODES);
		createEReference(petriNetModuleTraceLinkEClass, PETRI_NET_MODULE_TRACE_LINK__ARCS);

		route2FailureModelEClass = createEClass(ROUTE2_FAILURE_MODEL);
		createEReference(route2FailureModelEClass, ROUTE2_FAILURE_MODEL__ROUTE);
		createEReference(route2FailureModelEClass, ROUTE2_FAILURE_MODEL__OPERATIONAL);
		createEReference(route2FailureModelEClass, ROUTE2_FAILURE_MODEL__FAILED);
		createEReference(route2FailureModelEClass, ROUTE2_FAILURE_MODEL__REPAIR);

		requiredElement2FailureModelEClass = createEClass(REQUIRED_ELEMENT2_FAILURE_MODEL);
		createEReference(requiredElement2FailureModelEClass, REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT);
		createEReference(requiredElement2FailureModelEClass, REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL);
		createEReference(requiredElement2FailureModelEClass, REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED);

		requiredElement2ConnectionEClass = createEClass(REQUIRED_ELEMENT2_CONNECTION);
		createEReference(requiredElement2ConnectionEClass, REQUIRED_ELEMENT2_CONNECTION__ROUTE);
		createEReference(requiredElement2ConnectionEClass, REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT);

		railwayContainer2PetriNetEClass = createEClass(RAILWAY_CONTAINER2_PETRI_NET);
		createEReference(railwayContainer2PetriNetEClass, RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER);
		createEReference(railwayContainer2PetriNetEClass, RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET);

		traceLinkEClass = createEClass(TRACE_LINK);
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
		StochasticPetriNetPackage theStochasticPetriNetPackage = (StochasticPetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(StochasticPetriNetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		petriNetModuleTraceLinkEClass.getESuperTypes().add(this.getTraceLink());
		route2FailureModelEClass.getESuperTypes().add(this.getPetriNetModuleTraceLink());
		requiredElement2FailureModelEClass.getESuperTypes().add(this.getPetriNetModuleTraceLink());
		requiredElement2ConnectionEClass.getESuperTypes().add(this.getPetriNetModuleTraceLink());
		railwayContainer2PetriNetEClass.getESuperTypes().add(this.getTraceLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(railway2StochasticPetriNetTraceEClass, Railway2StochasticPetriNetTrace.class, "Railway2StochasticPetriNetTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRailway2StochasticPetriNetTrace_TraceLinks(), this.getTraceLink(), null, "traceLinks", null, 0, -1, Railway2StochasticPetriNetTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailway2StochasticPetriNetTrace_Source(), theRailwayPackage.getRailwayContainer(), null, "source", null, 0, 1, Railway2StochasticPetriNetTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriNetModuleTraceLinkEClass, PetriNetModuleTraceLink.class, "PetriNetModuleTraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetriNetModuleTraceLink_Nodes(), theStochasticPetriNetPackage.getNode(), null, "nodes", null, 0, -1, PetriNetModuleTraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNetModuleTraceLink_Arcs(), theStochasticPetriNetPackage.getArc(), null, "arcs", null, 0, -1, PetriNetModuleTraceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(route2FailureModelEClass, Route2FailureModel.class, "Route2FailureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoute2FailureModel_Route(), theRailwayPackage.getRoute(), null, "route", null, 0, 1, Route2FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute2FailureModel_Operational(), theStochasticPetriNetPackage.getPlace(), null, "operational", null, 0, 1, Route2FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute2FailureModel_Failed(), theStochasticPetriNetPackage.getPlace(), null, "failed", null, 0, 1, Route2FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute2FailureModel_Repair(), theStochasticPetriNetPackage.getImmediateTransition(), null, "repair", null, 0, 1, Route2FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredElement2FailureModelEClass, RequiredElement2FailureModel.class, "RequiredElement2FailureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredElement2FailureModel_RailwayElement(), theRailwayPackage.getRailwayElement(), null, "railwayElement", null, 0, 1, RequiredElement2FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredElement2FailureModel_Operational(), theStochasticPetriNetPackage.getPlace(), null, "operational", null, 0, 1, RequiredElement2FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredElement2FailureModel_Failed(), theStochasticPetriNetPackage.getPlace(), null, "failed", null, 0, 1, RequiredElement2FailureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredElement2ConnectionEClass, RequiredElement2Connection.class, "RequiredElement2Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredElement2Connection_Route(), theRailwayPackage.getRoute(), null, "route", null, 0, 1, RequiredElement2Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredElement2Connection_RailwayElement(), theRailwayPackage.getRailwayElement(), null, "railwayElement", null, 0, 1, RequiredElement2Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(railwayContainer2PetriNetEClass, RailwayContainer2PetriNet.class, "RailwayContainer2PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRailwayContainer2PetriNet_RailwayContainer(), theRailwayPackage.getRailwayContainer(), null, "railwayContainer", null, 0, 1, RailwayContainer2PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRailwayContainer2PetriNet_PetriNet(), theStochasticPetriNetPackage.getPetriNet(), null, "petriNet", null, 0, 1, RailwayContainer2PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceLinkEClass, TraceLink.class, "TraceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Railway2StochasticPetriNetPackageImpl
