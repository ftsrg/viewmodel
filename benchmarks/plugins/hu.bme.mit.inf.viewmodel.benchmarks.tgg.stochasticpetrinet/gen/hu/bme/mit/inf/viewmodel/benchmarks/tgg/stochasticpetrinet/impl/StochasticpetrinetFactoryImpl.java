/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StochasticpetrinetFactoryImpl extends EFactoryImpl implements StochasticpetrinetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StochasticpetrinetFactory init() {
		try {
			StochasticpetrinetFactory theStochasticpetrinetFactory = (StochasticpetrinetFactory) EPackage.Registry.INSTANCE
					.getEFactory(StochasticpetrinetPackage.eNS_URI);
			if (theStochasticpetrinetFactory != null) {
				return theStochasticpetrinetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StochasticpetrinetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticpetrinetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StochasticpetrinetPackage.ROUTE_TO_FAILED:
			return createRouteToFailed();
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL:
			return createSemaphoreToOperational();
		case StochasticpetrinetPackage.SENSOR_TO_OPERATIONAL:
			return createSensorToOperational();
		case StochasticpetrinetPackage.ROUTE_TO_OPERATIONAL:
			return createRouteToOperational();
		case StochasticpetrinetPackage.SWITCH_TO_FAILED:
			return createSwitchToFailed();
		case StochasticpetrinetPackage.SWITCH_TO_OPERATIONAL:
			return createSwitchToOperational();
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET:
			return createRailwayContainerToPetriNet();
		case StochasticpetrinetPackage.ROUTE_TO_REPAIR:
			return createRouteToRepair();
		case StochasticpetrinetPackage.SEMAPHORE_TO_FAILED:
			return createSemaphoreToFailed();
		case StochasticpetrinetPackage.SENSOR_TO_FAILED:
			return createSensorToFailed();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteToFailed createRouteToFailed() {
		RouteToFailedImpl routeToFailed = new RouteToFailedImpl();
		return routeToFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreToOperational createSemaphoreToOperational() {
		SemaphoreToOperationalImpl semaphoreToOperational = new SemaphoreToOperationalImpl();
		return semaphoreToOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorToOperational createSensorToOperational() {
		SensorToOperationalImpl sensorToOperational = new SensorToOperationalImpl();
		return sensorToOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteToOperational createRouteToOperational() {
		RouteToOperationalImpl routeToOperational = new RouteToOperationalImpl();
		return routeToOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchToFailed createSwitchToFailed() {
		SwitchToFailedImpl switchToFailed = new SwitchToFailedImpl();
		return switchToFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchToOperational createSwitchToOperational() {
		SwitchToOperationalImpl switchToOperational = new SwitchToOperationalImpl();
		return switchToOperational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainerToPetriNet createRailwayContainerToPetriNet() {
		RailwayContainerToPetriNetImpl railwayContainerToPetriNet = new RailwayContainerToPetriNetImpl();
		return railwayContainerToPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteToRepair createRouteToRepair() {
		RouteToRepairImpl routeToRepair = new RouteToRepairImpl();
		return routeToRepair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemaphoreToFailed createSemaphoreToFailed() {
		SemaphoreToFailedImpl semaphoreToFailed = new SemaphoreToFailedImpl();
		return semaphoreToFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorToFailed createSensorToFailed() {
		SensorToFailedImpl sensorToFailed = new SensorToFailedImpl();
		return sensorToFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticpetrinetPackage getStochasticpetrinetPackage() {
		return (StochasticpetrinetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StochasticpetrinetPackage getPackage() {
		return StochasticpetrinetPackage.eINSTANCE;
	}

} //StochasticpetrinetFactoryImpl
