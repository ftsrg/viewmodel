/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.util;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseTrackElementConnectsTo(TrackElementConnectsTo object) {
			return createTrackElementConnectsToAdapter();
		}

		@Override
		public Adapter caseSwitchPosition(SwitchPosition object) {
			return createSwitchPositionAdapter();
		}

		@Override
		public Adapter caseRequiredExitSemaphore(RequiredExitSemaphore object) {
			return createRequiredExitSemaphoreAdapter();
		}

		@Override
		public Adapter caseRequiredSensor(RequiredSensor object) {
			return createRequiredSensorAdapter();
		}

		@Override
		public Adapter caseSwitch(Switch object) {
			return createSwitchAdapter();
		}

		@Override
		public Adapter caseSemaphore(Semaphore object) {
			return createSemaphoreAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter caseRequiredEntrySemaphore(RequiredEntrySemaphore object) {
			return createRequiredEntrySemaphoreAdapter();
		}

		@Override
		public Adapter caseSensorMonitors(SensorMonitors object) {
			return createSensorMonitorsAdapter();
		}

		@Override
		public Adapter caseRailwayContainer(RailwayContainer object) {
			return createRailwayContainerAdapter();
		}

		@Override
		public Adapter caseSegment(Segment object) {
			return createSegmentAdapter();
		}

		@Override
		public Adapter caseRequiredSwitch(RequiredSwitch object) {
			return createRequiredSwitchAdapter();
		}

		@Override
		public Adapter caseRegion(Region object) {
			return createRegionAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo <em>Track Element Connects To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.TrackElementConnectsTo
	 * @generated
	 */
	public Adapter createTrackElementConnectsToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition <em>Switch Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition
	 * @generated
	 */
	public Adapter createSwitchPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore <em>Required Exit Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore
	 * @generated
	 */
	public Adapter createRequiredExitSemaphoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor <em>Required Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor
	 * @generated
	 */
	public Adapter createRequiredSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore <em>Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore
	 * @generated
	 */
	public Adapter createSemaphoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore <em>Required Entry Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore
	 * @generated
	 */
	public Adapter createRequiredEntrySemaphoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors <em>Sensor Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors
	 * @generated
	 */
	public Adapter createSensorMonitorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer <em>Railway Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer
	 * @generated
	 */
	public Adapter createRailwayContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch <em>Required Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch
	 * @generated
	 */
	public Adapter createRequiredSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RulesAdapterFactory
