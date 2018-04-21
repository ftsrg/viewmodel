/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage
 * @generated
 */
public interface StochasticpetrinetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StochasticpetrinetFactory eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Route To Failed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route To Failed</em>'.
	 * @generated
	 */
	RouteToFailed createRouteToFailed();

	/**
	 * Returns a new object of class '<em>Semaphore To Operational</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semaphore To Operational</em>'.
	 * @generated
	 */
	SemaphoreToOperational createSemaphoreToOperational();

	/**
	 * Returns a new object of class '<em>Sensor To Operational</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor To Operational</em>'.
	 * @generated
	 */
	SensorToOperational createSensorToOperational();

	/**
	 * Returns a new object of class '<em>Route To Operational</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route To Operational</em>'.
	 * @generated
	 */
	RouteToOperational createRouteToOperational();

	/**
	 * Returns a new object of class '<em>Switch To Failed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch To Failed</em>'.
	 * @generated
	 */
	SwitchToFailed createSwitchToFailed();

	/**
	 * Returns a new object of class '<em>Switch To Operational</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch To Operational</em>'.
	 * @generated
	 */
	SwitchToOperational createSwitchToOperational();

	/**
	 * Returns a new object of class '<em>Railway Container To Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Railway Container To Petri Net</em>'.
	 * @generated
	 */
	RailwayContainerToPetriNet createRailwayContainerToPetriNet();

	/**
	 * Returns a new object of class '<em>Route To Repair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route To Repair</em>'.
	 * @generated
	 */
	RouteToRepair createRouteToRepair();

	/**
	 * Returns a new object of class '<em>Semaphore To Failed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semaphore To Failed</em>'.
	 * @generated
	 */
	SemaphoreToFailed createSemaphoreToFailed();

	/**
	 * Returns a new object of class '<em>Sensor To Failed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor To Failed</em>'.
	 * @generated
	 */
	SensorToFailed createSensorToFailed();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StochasticpetrinetPackage getStochasticpetrinetPackage();

} //StochasticpetrinetFactory
