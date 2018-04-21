/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.util;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage
 * @generated
 */
public class StochasticpetrinetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StochasticpetrinetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticpetrinetSwitch() {
		if (modelPackage == null) {
			modelPackage = StochasticpetrinetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StochasticpetrinetPackage.ROUTE_TO_FAILED: {
			RouteToFailed routeToFailed = (RouteToFailed) theEObject;
			T result = caseRouteToFailed(routeToFailed);
			if (result == null)
				result = caseAbstractCorrespondence(routeToFailed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.SEMAPHORE_TO_OPERATIONAL: {
			SemaphoreToOperational semaphoreToOperational = (SemaphoreToOperational) theEObject;
			T result = caseSemaphoreToOperational(semaphoreToOperational);
			if (result == null)
				result = caseAbstractCorrespondence(semaphoreToOperational);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.SENSOR_TO_OPERATIONAL: {
			SensorToOperational sensorToOperational = (SensorToOperational) theEObject;
			T result = caseSensorToOperational(sensorToOperational);
			if (result == null)
				result = caseAbstractCorrespondence(sensorToOperational);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.ROUTE_TO_OPERATIONAL: {
			RouteToOperational routeToOperational = (RouteToOperational) theEObject;
			T result = caseRouteToOperational(routeToOperational);
			if (result == null)
				result = caseAbstractCorrespondence(routeToOperational);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.SWITCH_TO_FAILED: {
			SwitchToFailed switchToFailed = (SwitchToFailed) theEObject;
			T result = caseSwitchToFailed(switchToFailed);
			if (result == null)
				result = caseAbstractCorrespondence(switchToFailed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.SWITCH_TO_OPERATIONAL: {
			SwitchToOperational switchToOperational = (SwitchToOperational) theEObject;
			T result = caseSwitchToOperational(switchToOperational);
			if (result == null)
				result = caseAbstractCorrespondence(switchToOperational);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.RAILWAY_CONTAINER_TO_PETRI_NET: {
			RailwayContainerToPetriNet railwayContainerToPetriNet = (RailwayContainerToPetriNet) theEObject;
			T result = caseRailwayContainerToPetriNet(railwayContainerToPetriNet);
			if (result == null)
				result = caseAbstractCorrespondence(railwayContainerToPetriNet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.ROUTE_TO_REPAIR: {
			RouteToRepair routeToRepair = (RouteToRepair) theEObject;
			T result = caseRouteToRepair(routeToRepair);
			if (result == null)
				result = caseAbstractCorrespondence(routeToRepair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.SEMAPHORE_TO_FAILED: {
			SemaphoreToFailed semaphoreToFailed = (SemaphoreToFailed) theEObject;
			T result = caseSemaphoreToFailed(semaphoreToFailed);
			if (result == null)
				result = caseAbstractCorrespondence(semaphoreToFailed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StochasticpetrinetPackage.SENSOR_TO_FAILED: {
			SensorToFailed sensorToFailed = (SensorToFailed) theEObject;
			T result = caseSensorToFailed(sensorToFailed);
			if (result == null)
				result = caseAbstractCorrespondence(sensorToFailed);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route To Failed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route To Failed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteToFailed(RouteToFailed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semaphore To Operational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semaphore To Operational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemaphoreToOperational(SemaphoreToOperational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor To Operational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor To Operational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorToOperational(SensorToOperational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route To Operational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route To Operational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteToOperational(RouteToOperational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch To Failed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch To Failed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchToFailed(SwitchToFailed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch To Operational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch To Operational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchToOperational(SwitchToOperational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Railway Container To Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Railway Container To Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRailwayContainerToPetriNet(RailwayContainerToPetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route To Repair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route To Repair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteToRepair(RouteToRepair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semaphore To Failed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semaphore To Failed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemaphoreToFailed(SemaphoreToFailed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor To Failed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor To Failed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorToFailed(SensorToFailed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StochasticpetrinetSwitch
