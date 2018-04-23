/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetFactory
 * @model kind="package"
 * @generated
 */
public interface Dependability2StochasticPetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dependability2stochasticpetrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/dependability2stochasticpetrinet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dependability2stochasticpetrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dependability2StochasticPetriNetPackage eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetTraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetTraceImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getDependability2StochasticPetriNetTrace()
	 * @generated
	 */
	int DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Railway Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Dependability Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS = 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.TraceLinkImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 1;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.PetriNetModuleTraceLinkImpl <em>Petri Net Module Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.PetriNetModuleTraceLinkImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getPetriNetModuleTraceLink()
	 * @generated
	 */
	int PETRI_NET_MODULE_TRACE_LINK = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_MODULE_TRACE_LINK__NODES = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_MODULE_TRACE_LINK__ARCS = TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Petri Net Module Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Petri Net Module Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_MODULE_TRACE_LINK_OPERATION_COUNT = TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.ErrorModel2PetriNetModuleImpl <em>Error Model2 Petri Net Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.ErrorModel2PetriNetModuleImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getErrorModel2PetriNetModule()
	 * @generated
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE__NODES = PETRI_NET_MODULE_TRACE_LINK__NODES;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE__ARCS = PETRI_NET_MODULE_TRACE_LINK__ARCS;

	/**
	 * The feature id for the '<em><b>Error Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE__UP = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Down</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE__DOWN = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE__REPAIR = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Error Model2 Petri Net Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE_FEATURE_COUNT = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Error Model2 Petri Net Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL2_PETRI_NET_MODULE_OPERATION_COUNT = PETRI_NET_MODULE_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl <em>Railway Container2 Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getRailwayContainer2PetriNet()
	 * @generated
	 */
	int RAILWAY_CONTAINER2_PETRI_NET = 3;

	/**
	 * The feature id for the '<em><b>Railway Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET = TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Railway Container2 Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER2_PETRI_NET_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Railway Container2 Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER2_PETRI_NET_OPERATION_COUNT = TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.RequiredElement2ConnectionImpl <em>Required Element2 Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.RequiredElement2ConnectionImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getRequiredElement2Connection()
	 * @generated
	 */
	int REQUIRED_ELEMENT2_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_CONNECTION__NODES = PETRI_NET_MODULE_TRACE_LINK__NODES;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_CONNECTION__ARCS = PETRI_NET_MODULE_TRACE_LINK__ARCS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_CONNECTION__SOURCE = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_CONNECTION__TARGET = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Required Element2 Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_CONNECTION_FEATURE_COUNT = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Required Element2 Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_CONNECTION_OPERATION_COUNT = PETRI_NET_MODULE_TRACE_LINK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace
	 * @generated
	 */
	EClass getDependability2StochasticPetriNetTrace();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getRailwayContainer <em>Railway Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Railway Container</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getRailwayContainer()
	 * @see #getDependability2StochasticPetriNetTrace()
	 * @generated
	 */
	EReference getDependability2StochasticPetriNetTrace_RailwayContainer();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getDependabilityModel <em>Dependability Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependability Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getDependabilityModel()
	 * @see #getDependability2StochasticPetriNetTrace()
	 * @generated
	 */
	EReference getDependability2StochasticPetriNetTrace_DependabilityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getTraceLinks()
	 * @see #getDependability2StochasticPetriNetTrace()
	 * @generated
	 */
	EReference getDependability2StochasticPetriNetTrace_TraceLinks();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule <em>Error Model2 Petri Net Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model2 Petri Net Module</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule
	 * @generated
	 */
	EClass getErrorModel2PetriNetModule();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getErrorModel <em>Error Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getErrorModel()
	 * @see #getErrorModel2PetriNetModule()
	 * @generated
	 */
	EReference getErrorModel2PetriNetModule_ErrorModel();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getUp <em>Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Up</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getUp()
	 * @see #getErrorModel2PetriNetModule()
	 * @generated
	 */
	EReference getErrorModel2PetriNetModule_Up();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getDown <em>Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Down</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getDown()
	 * @see #getErrorModel2PetriNetModule()
	 * @generated
	 */
	EReference getErrorModel2PetriNetModule_Down();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getRepair <em>Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule#getRepair()
	 * @see #getErrorModel2PetriNetModule()
	 * @generated
	 */
	EReference getErrorModel2PetriNetModule_Repair();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet <em>Railway Container2 Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Container2 Petri Net</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet
	 * @generated
	 */
	EClass getRailwayContainer2PetriNet();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet#getRailwayContainer <em>Railway Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Railway Container</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet#getRailwayContainer()
	 * @see #getRailwayContainer2PetriNet()
	 * @generated
	 */
	EReference getRailwayContainer2PetriNet_RailwayContainer();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petri Net</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet#getPetriNet()
	 * @see #getRailwayContainer2PetriNet()
	 * @generated
	 */
	EReference getRailwayContainer2PetriNet_PetriNet();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink <em>Petri Net Module Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net Module Trace Link</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink
	 * @generated
	 */
	EClass getPetriNetModuleTraceLink();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink#getNodes()
	 * @see #getPetriNetModuleTraceLink()
	 * @generated
	 */
	EReference getPetriNetModuleTraceLink_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arcs</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink#getArcs()
	 * @see #getPetriNetModuleTraceLink()
	 * @generated
	 */
	EReference getPetriNetModuleTraceLink_Arcs();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection <em>Required Element2 Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Element2 Connection</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection
	 * @generated
	 */
	EClass getRequiredElement2Connection();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection#getSource()
	 * @see #getRequiredElement2Connection()
	 * @generated
	 */
	EReference getRequiredElement2Connection_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection#getTarget()
	 * @see #getRequiredElement2Connection()
	 * @generated
	 */
	EReference getRequiredElement2Connection_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dependability2StochasticPetriNetFactory getDependability2StochasticPetriNetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetTraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetTraceImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getDependability2StochasticPetriNetTrace()
		 * @generated
		 */
		EClass DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE = eINSTANCE.getDependability2StochasticPetriNetTrace();

		/**
		 * The meta object literal for the '<em><b>Railway Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__RAILWAY_CONTAINER = eINSTANCE.getDependability2StochasticPetriNetTrace_RailwayContainer();

		/**
		 * The meta object literal for the '<em><b>Dependability Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__DEPENDABILITY_MODEL = eINSTANCE.getDependability2StochasticPetriNetTrace_DependabilityModel();

		/**
		 * The meta object literal for the '<em><b>Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS = eINSTANCE.getDependability2StochasticPetriNetTrace_TraceLinks();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.TraceLinkImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.ErrorModel2PetriNetModuleImpl <em>Error Model2 Petri Net Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.ErrorModel2PetriNetModuleImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getErrorModel2PetriNetModule()
		 * @generated
		 */
		EClass ERROR_MODEL2_PETRI_NET_MODULE = eINSTANCE.getErrorModel2PetriNetModule();

		/**
		 * The meta object literal for the '<em><b>Error Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL2_PETRI_NET_MODULE__ERROR_MODEL = eINSTANCE.getErrorModel2PetriNetModule_ErrorModel();

		/**
		 * The meta object literal for the '<em><b>Up</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL2_PETRI_NET_MODULE__UP = eINSTANCE.getErrorModel2PetriNetModule_Up();

		/**
		 * The meta object literal for the '<em><b>Down</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL2_PETRI_NET_MODULE__DOWN = eINSTANCE.getErrorModel2PetriNetModule_Down();

		/**
		 * The meta object literal for the '<em><b>Repair</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL2_PETRI_NET_MODULE__REPAIR = eINSTANCE.getErrorModel2PetriNetModule_Repair();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl <em>Railway Container2 Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getRailwayContainer2PetriNet()
		 * @generated
		 */
		EClass RAILWAY_CONTAINER2_PETRI_NET = eINSTANCE.getRailwayContainer2PetriNet();

		/**
		 * The meta object literal for the '<em><b>Railway Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_CONTAINER2_PETRI_NET__RAILWAY_CONTAINER = eINSTANCE.getRailwayContainer2PetriNet_RailwayContainer();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_CONTAINER2_PETRI_NET__PETRI_NET = eINSTANCE.getRailwayContainer2PetriNet_PetriNet();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.PetriNetModuleTraceLinkImpl <em>Petri Net Module Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.PetriNetModuleTraceLinkImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getPetriNetModuleTraceLink()
		 * @generated
		 */
		EClass PETRI_NET_MODULE_TRACE_LINK = eINSTANCE.getPetriNetModuleTraceLink();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET_MODULE_TRACE_LINK__NODES = eINSTANCE.getPetriNetModuleTraceLink_Nodes();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET_MODULE_TRACE_LINK__ARCS = eINSTANCE.getPetriNetModuleTraceLink_Arcs();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.RequiredElement2ConnectionImpl <em>Required Element2 Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.RequiredElement2ConnectionImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl.Dependability2StochasticPetriNetPackageImpl#getRequiredElement2Connection()
		 * @generated
		 */
		EClass REQUIRED_ELEMENT2_CONNECTION = eINSTANCE.getRequiredElement2Connection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT2_CONNECTION__SOURCE = eINSTANCE.getRequiredElement2Connection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT2_CONNECTION__TARGET = eINSTANCE.getRequiredElement2Connection_Target();

	}

} //Dependability2StochasticPetriNetPackage
