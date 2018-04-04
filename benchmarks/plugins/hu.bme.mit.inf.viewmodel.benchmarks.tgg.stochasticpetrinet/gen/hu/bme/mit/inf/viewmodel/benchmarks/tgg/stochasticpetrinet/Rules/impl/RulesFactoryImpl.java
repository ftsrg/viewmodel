/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.*;

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
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
		case RulesPackage.ROUTE:
			return createRoute();
		case RulesPackage.REGION:
			return createRegion();
		case RulesPackage.SWITCH:
			return createSwitch();
		case RulesPackage.RAILWAY_CONTAINER:
			return createRailwayContainer();
		case RulesPackage.SWITCH_POSITION:
			return createSwitchPosition();
		case RulesPackage.SEMAPHORE:
			return createSemaphore();
		case RulesPackage.SENSOR:
			return createSensor();
		case RulesPackage.REQUIRED_SWITCH:
			return createRequiredSwitch();
		case RulesPackage.REQUIRED_SENSOR:
			return createRequiredSensor();
		case RulesPackage.SEGMENT:
			return createSegment();
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE:
			return createRequiredEntrySemaphore();
		case RulesPackage.SENSOR_MONITORS:
			return createSensorMonitors();
		case RulesPackage.TRACK_ELEMENT_CONNECTS_TO:
			return createTrackElementConnectsTo();
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE:
			return createRequiredExitSemaphore();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainer createRailwayContainer() {
		RailwayContainerImpl railwayContainer = new RailwayContainerImpl();
		return railwayContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchPosition createSwitchPosition() {
		SwitchPositionImpl switchPosition = new SwitchPositionImpl();
		return switchPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semaphore createSemaphore() {
		SemaphoreImpl semaphore = new SemaphoreImpl();
		return semaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredSwitch createRequiredSwitch() {
		RequiredSwitchImpl requiredSwitch = new RequiredSwitchImpl();
		return requiredSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredSensor createRequiredSensor() {
		RequiredSensorImpl requiredSensor = new RequiredSensorImpl();
		return requiredSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredEntrySemaphore createRequiredEntrySemaphore() {
		RequiredEntrySemaphoreImpl requiredEntrySemaphore = new RequiredEntrySemaphoreImpl();
		return requiredEntrySemaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorMonitors createSensorMonitors() {
		SensorMonitorsImpl sensorMonitors = new SensorMonitorsImpl();
		return sensorMonitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElementConnectsTo createTrackElementConnectsTo() {
		TrackElementConnectsToImpl trackElementConnectsTo = new TrackElementConnectsToImpl();
		return trackElementConnectsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredExitSemaphore createRequiredExitSemaphore() {
		RequiredExitSemaphoreImpl requiredExitSemaphore = new RequiredExitSemaphoreImpl();
		return requiredExitSemaphore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
