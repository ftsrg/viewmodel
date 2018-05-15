/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

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
 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='hu.bme.mit.inf.viewmodel.benchmarks.tgg'"
 * @generated
 */
public interface StochasticpetrinetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stochasticpetrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet/model/Stochasticpetrinet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StochasticpetrinetPackage eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToFailedImpl <em>Semaphore To Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToFailedImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSemaphoreToFailed()
	 * @generated
	 */
	int SEMAPHORE_TO_FAILED = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_TO_FAILED__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_TO_FAILED__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semaphore To Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_TO_FAILED_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semaphore To Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_TO_FAILED_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SwitchToFailedImpl <em>Switch To Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SwitchToFailedImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSwitchToFailed()
	 * @generated
	 */
	int SWITCH_TO_FAILED = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TO_FAILED__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TO_FAILED__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch To Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TO_FAILED_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch To Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TO_FAILED_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToOperationalImpl <em>Route To Operational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToOperationalImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getRouteToOperational()
	 * @generated
	 */
	int ROUTE_TO_OPERATIONAL = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_OPERATIONAL__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_OPERATIONAL__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Route To Operational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_OPERATIONAL_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Route To Operational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_OPERATIONAL_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SensorToOperationalImpl <em>Sensor To Operational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SensorToOperationalImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSensorToOperational()
	 * @generated
	 */
	int SENSOR_TO_OPERATIONAL = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TO_OPERATIONAL__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TO_OPERATIONAL__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor To Operational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TO_OPERATIONAL_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor To Operational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TO_OPERATIONAL_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToOperationalImpl <em>Semaphore To Operational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToOperationalImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSemaphoreToOperational()
	 * @generated
	 */
	int SEMAPHORE_TO_OPERATIONAL = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_TO_OPERATIONAL__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_TO_OPERATIONAL__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semaphore To Operational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_TO_OPERATIONAL_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semaphore To Operational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMAPHORE_TO_OPERATIONAL_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToRepairImpl <em>Route To Repair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToRepairImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getRouteToRepair()
	 * @generated
	 */
	int ROUTE_TO_REPAIR = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_REPAIR__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_REPAIR__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Route To Repair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_REPAIR_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Route To Repair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_REPAIR_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SensorToFailedImpl <em>Sensor To Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SensorToFailedImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSensorToFailed()
	 * @generated
	 */
	int SENSOR_TO_FAILED = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TO_FAILED__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TO_FAILED__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor To Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TO_FAILED_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor To Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_TO_FAILED_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToFailedImpl <em>Route To Failed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToFailedImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getRouteToFailed()
	 * @generated
	 */
	int ROUTE_TO_FAILED = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_FAILED__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_FAILED__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Route To Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_FAILED_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Route To Failed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_TO_FAILED_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SwitchToOperationalImpl <em>Switch To Operational</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SwitchToOperationalImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSwitchToOperational()
	 * @generated
	 */
	int SWITCH_TO_OPERATIONAL = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TO_OPERATIONAL__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TO_OPERATIONAL__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch To Operational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TO_OPERATIONAL_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch To Operational</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TO_OPERATIONAL_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RailwayContainerToPetriNetImpl <em>Railway Container To Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RailwayContainerToPetriNetImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getRailwayContainerToPetriNet()
	 * @generated
	 */
	int RAILWAY_CONTAINER_TO_PETRI_NET = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER_TO_PETRI_NET__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER_TO_PETRI_NET__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Railway Container To Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER_TO_PETRI_NET_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Railway Container To Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY_CONTAINER_TO_PETRI_NET_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed <em>Semaphore To Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore To Failed</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed
	 * @generated
	 */
	EClass getSemaphoreToFailed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed#getSource()
	 * @see #getSemaphoreToFailed()
	 * @generated
	 */
	EReference getSemaphoreToFailed_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed#getTarget()
	 * @see #getSemaphoreToFailed()
	 * @generated
	 */
	EReference getSemaphoreToFailed_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed <em>Switch To Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch To Failed</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed
	 * @generated
	 */
	EClass getSwitchToFailed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed#getSource()
	 * @see #getSwitchToFailed()
	 * @generated
	 */
	EReference getSwitchToFailed_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed#getTarget()
	 * @see #getSwitchToFailed()
	 * @generated
	 */
	EReference getSwitchToFailed_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational <em>Route To Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route To Operational</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational
	 * @generated
	 */
	EClass getRouteToOperational();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational#getSource()
	 * @see #getRouteToOperational()
	 * @generated
	 */
	EReference getRouteToOperational_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational#getTarget()
	 * @see #getRouteToOperational()
	 * @generated
	 */
	EReference getRouteToOperational_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational <em>Sensor To Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor To Operational</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational
	 * @generated
	 */
	EClass getSensorToOperational();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational#getSource()
	 * @see #getSensorToOperational()
	 * @generated
	 */
	EReference getSensorToOperational_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational#getTarget()
	 * @see #getSensorToOperational()
	 * @generated
	 */
	EReference getSensorToOperational_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational <em>Semaphore To Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semaphore To Operational</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational
	 * @generated
	 */
	EClass getSemaphoreToOperational();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational#getSource()
	 * @see #getSemaphoreToOperational()
	 * @generated
	 */
	EReference getSemaphoreToOperational_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational#getTarget()
	 * @see #getSemaphoreToOperational()
	 * @generated
	 */
	EReference getSemaphoreToOperational_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair <em>Route To Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route To Repair</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair
	 * @generated
	 */
	EClass getRouteToRepair();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair#getSource()
	 * @see #getRouteToRepair()
	 * @generated
	 */
	EReference getRouteToRepair_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair#getTarget()
	 * @see #getRouteToRepair()
	 * @generated
	 */
	EReference getRouteToRepair_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed <em>Sensor To Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor To Failed</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed
	 * @generated
	 */
	EClass getSensorToFailed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed#getSource()
	 * @see #getSensorToFailed()
	 * @generated
	 */
	EReference getSensorToFailed_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed#getTarget()
	 * @see #getSensorToFailed()
	 * @generated
	 */
	EReference getSensorToFailed_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed <em>Route To Failed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route To Failed</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed
	 * @generated
	 */
	EClass getRouteToFailed();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed#getSource()
	 * @see #getRouteToFailed()
	 * @generated
	 */
	EReference getRouteToFailed_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed#getTarget()
	 * @see #getRouteToFailed()
	 * @generated
	 */
	EReference getRouteToFailed_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational <em>Switch To Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch To Operational</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational
	 * @generated
	 */
	EClass getSwitchToOperational();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational#getSource()
	 * @see #getSwitchToOperational()
	 * @generated
	 */
	EReference getSwitchToOperational_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational#getTarget()
	 * @see #getSwitchToOperational()
	 * @generated
	 */
	EReference getSwitchToOperational_Target();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet <em>Railway Container To Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Railway Container To Petri Net</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet
	 * @generated
	 */
	EClass getRailwayContainerToPetriNet();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet#getSource()
	 * @see #getRailwayContainerToPetriNet()
	 * @generated
	 */
	EReference getRailwayContainerToPetriNet_Source();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet#getTarget()
	 * @see #getRailwayContainerToPetriNet()
	 * @generated
	 */
	EReference getRailwayContainerToPetriNet_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StochasticpetrinetFactory getStochasticpetrinetFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToFailedImpl <em>Semaphore To Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToFailedImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSemaphoreToFailed()
		 * @generated
		 */
		EClass SEMAPHORE_TO_FAILED = eINSTANCE.getSemaphoreToFailed();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAPHORE_TO_FAILED__SOURCE = eINSTANCE.getSemaphoreToFailed_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAPHORE_TO_FAILED__TARGET = eINSTANCE.getSemaphoreToFailed_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SwitchToFailedImpl <em>Switch To Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SwitchToFailedImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSwitchToFailed()
		 * @generated
		 */
		EClass SWITCH_TO_FAILED = eINSTANCE.getSwitchToFailed();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_TO_FAILED__SOURCE = eINSTANCE.getSwitchToFailed_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_TO_FAILED__TARGET = eINSTANCE.getSwitchToFailed_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToOperationalImpl <em>Route To Operational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToOperationalImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getRouteToOperational()
		 * @generated
		 */
		EClass ROUTE_TO_OPERATIONAL = eINSTANCE.getRouteToOperational();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TO_OPERATIONAL__SOURCE = eINSTANCE.getRouteToOperational_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TO_OPERATIONAL__TARGET = eINSTANCE.getRouteToOperational_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SensorToOperationalImpl <em>Sensor To Operational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SensorToOperationalImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSensorToOperational()
		 * @generated
		 */
		EClass SENSOR_TO_OPERATIONAL = eINSTANCE.getSensorToOperational();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_TO_OPERATIONAL__SOURCE = eINSTANCE.getSensorToOperational_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_TO_OPERATIONAL__TARGET = eINSTANCE.getSensorToOperational_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToOperationalImpl <em>Semaphore To Operational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SemaphoreToOperationalImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSemaphoreToOperational()
		 * @generated
		 */
		EClass SEMAPHORE_TO_OPERATIONAL = eINSTANCE.getSemaphoreToOperational();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAPHORE_TO_OPERATIONAL__SOURCE = eINSTANCE.getSemaphoreToOperational_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMAPHORE_TO_OPERATIONAL__TARGET = eINSTANCE.getSemaphoreToOperational_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToRepairImpl <em>Route To Repair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToRepairImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getRouteToRepair()
		 * @generated
		 */
		EClass ROUTE_TO_REPAIR = eINSTANCE.getRouteToRepair();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TO_REPAIR__SOURCE = eINSTANCE.getRouteToRepair_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TO_REPAIR__TARGET = eINSTANCE.getRouteToRepair_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SensorToFailedImpl <em>Sensor To Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SensorToFailedImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSensorToFailed()
		 * @generated
		 */
		EClass SENSOR_TO_FAILED = eINSTANCE.getSensorToFailed();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_TO_FAILED__SOURCE = eINSTANCE.getSensorToFailed_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_TO_FAILED__TARGET = eINSTANCE.getSensorToFailed_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToFailedImpl <em>Route To Failed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RouteToFailedImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getRouteToFailed()
		 * @generated
		 */
		EClass ROUTE_TO_FAILED = eINSTANCE.getRouteToFailed();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TO_FAILED__SOURCE = eINSTANCE.getRouteToFailed_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_TO_FAILED__TARGET = eINSTANCE.getRouteToFailed_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SwitchToOperationalImpl <em>Switch To Operational</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.SwitchToOperationalImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getSwitchToOperational()
		 * @generated
		 */
		EClass SWITCH_TO_OPERATIONAL = eINSTANCE.getSwitchToOperational();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_TO_OPERATIONAL__SOURCE = eINSTANCE.getSwitchToOperational_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_TO_OPERATIONAL__TARGET = eINSTANCE.getSwitchToOperational_Target();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RailwayContainerToPetriNetImpl <em>Railway Container To Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.RailwayContainerToPetriNetImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl#getRailwayContainerToPetriNet()
		 * @generated
		 */
		EClass RAILWAY_CONTAINER_TO_PETRI_NET = eINSTANCE.getRailwayContainerToPetriNet();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_CONTAINER_TO_PETRI_NET__SOURCE = eINSTANCE.getRailwayContainerToPetriNet_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY_CONTAINER_TO_PETRI_NET__TARGET = eINSTANCE.getRailwayContainerToPetriNet_Target();

	}

} //StochasticpetrinetPackage
