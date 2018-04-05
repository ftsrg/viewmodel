/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet;

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
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetFactory
 * @model kind="package"
 * @generated
 */
public interface Railway2StochasticPetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "railway2stochasticpetrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/railway2stochasticpetrinet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "railway2stochasticpetrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Railway2StochasticPetriNetPackage eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetTraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetTraceImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRailway2StochasticPetriNetTrace()
	 * @generated
	 */
	int RAILWAY2_STOCHASTIC_PETRI_NET_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY2_STOCHASTIC_PETRI_NET_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY2_STOCHASTIC_PETRI_NET_TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.TraceLinkImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 6;

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
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.PetriNetModuleTraceLinkImpl <em>Petri Net Module Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.PetriNetModuleTraceLinkImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getPetriNetModuleTraceLink()
	 * @generated
	 */
	int PETRI_NET_MODULE_TRACE_LINK = 1;

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
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Route2FailureModelImpl <em>Route2 Failure Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Route2FailureModelImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRoute2FailureModel()
	 * @generated
	 */
	int ROUTE2_FAILURE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE2_FAILURE_MODEL__NODES = PETRI_NET_MODULE_TRACE_LINK__NODES;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE2_FAILURE_MODEL__ARCS = PETRI_NET_MODULE_TRACE_LINK__ARCS;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE2_FAILURE_MODEL__ROUTE = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE2_FAILURE_MODEL__OPERATIONAL = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE2_FAILURE_MODEL__FAILED = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE2_FAILURE_MODEL__REPAIR = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Route2 Failure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE2_FAILURE_MODEL_FEATURE_COUNT = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Route2 Failure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE2_FAILURE_MODEL_OPERATION_COUNT = PETRI_NET_MODULE_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2FailureModelImpl <em>Required Element2 Failure Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2FailureModelImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRequiredElement2FailureModel()
	 * @generated
	 */
	int REQUIRED_ELEMENT2_FAILURE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_FAILURE_MODEL__NODES = PETRI_NET_MODULE_TRACE_LINK__NODES;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_FAILURE_MODEL__ARCS = PETRI_NET_MODULE_TRACE_LINK__ARCS;

	/**
	 * The feature id for the '<em><b>Railway Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Required Element2 Failure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_FAILURE_MODEL_FEATURE_COUNT = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Required Element2 Failure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_FAILURE_MODEL_OPERATION_COUNT = PETRI_NET_MODULE_TRACE_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2ConnectionImpl <em>Required Element2 Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2ConnectionImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRequiredElement2Connection()
	 * @generated
	 */
	int REQUIRED_ELEMENT2_CONNECTION = 4;

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
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_CONNECTION__ROUTE = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Railway Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT = PETRI_NET_MODULE_TRACE_LINK_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl <em>Railway Container2 Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRailwayContainer2PetriNet()
	 * @generated
	 */
	int RAILWAY_CONTAINER2_PETRI_NET = 5;

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
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace
	 * @generated
	 */
	EClass getRailway2StochasticPetriNetTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace#getTraceLinks()
	 * @see #getRailway2StochasticPetriNetTrace()
	 * @generated
	 */
	EReference getRailway2StochasticPetriNetTrace_TraceLinks();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetTrace#getSource()
	 * @see #getRailway2StochasticPetriNetTrace()
	 * @generated
	 */
	EReference getRailway2StochasticPetriNetTrace_Source();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.PetriNetModuleTraceLink <em>Petri Net Module Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net Module Trace Link</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.PetriNetModuleTraceLink
	 * @generated
	 */
	EClass getPetriNetModuleTraceLink();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.PetriNetModuleTraceLink#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.PetriNetModuleTraceLink#getNodes()
	 * @see #getPetriNetModuleTraceLink()
	 * @generated
	 */
	EReference getPetriNetModuleTraceLink_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.PetriNetModuleTraceLink#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arcs</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.PetriNetModuleTraceLink#getArcs()
	 * @see #getPetriNetModuleTraceLink()
	 * @generated
	 */
	EReference getPetriNetModuleTraceLink_Arcs();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel <em>Route2 Failure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route2 Failure Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel
	 * @generated
	 */
	EClass getRoute2FailureModel();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel#getRoute()
	 * @see #getRoute2FailureModel()
	 * @generated
	 */
	EReference getRoute2FailureModel_Route();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel#getOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operational</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel#getOperational()
	 * @see #getRoute2FailureModel()
	 * @generated
	 */
	EReference getRoute2FailureModel_Operational();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel#getFailed <em>Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failed</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel#getFailed()
	 * @see #getRoute2FailureModel()
	 * @generated
	 */
	EReference getRoute2FailureModel_Failed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel#getRepair <em>Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Route2FailureModel#getRepair()
	 * @see #getRoute2FailureModel()
	 * @generated
	 */
	EReference getRoute2FailureModel_Repair();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel <em>Required Element2 Failure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Element2 Failure Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel
	 * @generated
	 */
	EClass getRequiredElement2FailureModel();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getRailwayElement <em>Railway Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Railway Element</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getRailwayElement()
	 * @see #getRequiredElement2FailureModel()
	 * @generated
	 */
	EReference getRequiredElement2FailureModel_RailwayElement();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operational</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getOperational()
	 * @see #getRequiredElement2FailureModel()
	 * @generated
	 */
	EReference getRequiredElement2FailureModel_Operational();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getFailed <em>Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failed</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2FailureModel#getFailed()
	 * @see #getRequiredElement2FailureModel()
	 * @generated
	 */
	EReference getRequiredElement2FailureModel_Failed();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection <em>Required Element2 Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Element2 Connection</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection
	 * @generated
	 */
	EClass getRequiredElement2Connection();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection#getRoute()
	 * @see #getRequiredElement2Connection()
	 * @generated
	 */
	EReference getRequiredElement2Connection_Route();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection#getRailwayElement <em>Railway Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Railway Element</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RequiredElement2Connection#getRailwayElement()
	 * @see #getRequiredElement2Connection()
	 * @generated
	 */
	EReference getRequiredElement2Connection_RailwayElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RailwayContainer2PetriNet <em>Railway Container2 Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Container2 Petri Net</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RailwayContainer2PetriNet
	 * @generated
	 */
	EClass getRailwayContainer2PetriNet();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RailwayContainer2PetriNet#getRailwayContainer <em>Railway Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Railway Container</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RailwayContainer2PetriNet#getRailwayContainer()
	 * @see #getRailwayContainer2PetriNet()
	 * @generated
	 */
	EReference getRailwayContainer2PetriNet_RailwayContainer();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RailwayContainer2PetriNet#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petri Net</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.RailwayContainer2PetriNet#getPetriNet()
	 * @see #getRailwayContainer2PetriNet()
	 * @generated
	 */
	EReference getRailwayContainer2PetriNet_PetriNet();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Railway2StochasticPetriNetFactory getRailway2StochasticPetriNetFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetTraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetTraceImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRailway2StochasticPetriNetTrace()
		 * @generated
		 */
		EClass RAILWAY2_STOCHASTIC_PETRI_NET_TRACE = eINSTANCE.getRailway2StochasticPetriNetTrace();

		/**
		 * The meta object literal for the '<em><b>Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__TRACE_LINKS = eINSTANCE.getRailway2StochasticPetriNetTrace_TraceLinks();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY2_STOCHASTIC_PETRI_NET_TRACE__SOURCE = eINSTANCE.getRailway2StochasticPetriNetTrace_Source();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.PetriNetModuleTraceLinkImpl <em>Petri Net Module Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.PetriNetModuleTraceLinkImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getPetriNetModuleTraceLink()
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
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Route2FailureModelImpl <em>Route2 Failure Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Route2FailureModelImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRoute2FailureModel()
		 * @generated
		 */
		EClass ROUTE2_FAILURE_MODEL = eINSTANCE.getRoute2FailureModel();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE2_FAILURE_MODEL__ROUTE = eINSTANCE.getRoute2FailureModel_Route();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE2_FAILURE_MODEL__OPERATIONAL = eINSTANCE.getRoute2FailureModel_Operational();

		/**
		 * The meta object literal for the '<em><b>Failed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE2_FAILURE_MODEL__FAILED = eINSTANCE.getRoute2FailureModel_Failed();

		/**
		 * The meta object literal for the '<em><b>Repair</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE2_FAILURE_MODEL__REPAIR = eINSTANCE.getRoute2FailureModel_Repair();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2FailureModelImpl <em>Required Element2 Failure Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2FailureModelImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRequiredElement2FailureModel()
		 * @generated
		 */
		EClass REQUIRED_ELEMENT2_FAILURE_MODEL = eINSTANCE.getRequiredElement2FailureModel();

		/**
		 * The meta object literal for the '<em><b>Railway Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT2_FAILURE_MODEL__RAILWAY_ELEMENT = eINSTANCE.getRequiredElement2FailureModel_RailwayElement();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT2_FAILURE_MODEL__OPERATIONAL = eINSTANCE.getRequiredElement2FailureModel_Operational();

		/**
		 * The meta object literal for the '<em><b>Failed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT2_FAILURE_MODEL__FAILED = eINSTANCE.getRequiredElement2FailureModel_Failed();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2ConnectionImpl <em>Required Element2 Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RequiredElement2ConnectionImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRequiredElement2Connection()
		 * @generated
		 */
		EClass REQUIRED_ELEMENT2_CONNECTION = eINSTANCE.getRequiredElement2Connection();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT2_CONNECTION__ROUTE = eINSTANCE.getRequiredElement2Connection_Route();

		/**
		 * The meta object literal for the '<em><b>Railway Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_ELEMENT2_CONNECTION__RAILWAY_ELEMENT = eINSTANCE.getRequiredElement2Connection_RailwayElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl <em>Railway Container2 Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.RailwayContainer2PetriNetImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getRailwayContainer2PetriNet()
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
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.TraceLinkImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetPackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

	}

} //Railway2StochasticPetriNetPackage
