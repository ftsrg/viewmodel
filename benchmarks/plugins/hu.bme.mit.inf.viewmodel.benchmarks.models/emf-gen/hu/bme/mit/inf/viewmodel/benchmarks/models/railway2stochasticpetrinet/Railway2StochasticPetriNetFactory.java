/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage
 * @generated
 */
public interface Railway2StochasticPetriNetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Railway2StochasticPetriNetFactory eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl.Railway2StochasticPetriNetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Railway2StochasticPetriNetTrace createRailway2StochasticPetriNetTrace();

	/**
	 * Returns a new object of class '<em>Route2 Failure Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route2 Failure Model</em>'.
	 * @generated
	 */
	Route2FailureModel createRoute2FailureModel();

	/**
	 * Returns a new object of class '<em>Required Element2 Failure Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Element2 Failure Model</em>'.
	 * @generated
	 */
	RequiredElement2FailureModel createRequiredElement2FailureModel();

	/**
	 * Returns a new object of class '<em>Required Element2 Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Element2 Connection</em>'.
	 * @generated
	 */
	RequiredElement2Connection createRequiredElement2Connection();

	/**
	 * Returns a new object of class '<em>Railway Container2 Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Railway Container2 Petri Net</em>'.
	 * @generated
	 */
	RailwayContainer2PetriNet createRailwayContainer2PetriNet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Railway2StochasticPetriNetPackage getRailway2StochasticPetriNetPackage();

} //Railway2StochasticPetriNetFactory
