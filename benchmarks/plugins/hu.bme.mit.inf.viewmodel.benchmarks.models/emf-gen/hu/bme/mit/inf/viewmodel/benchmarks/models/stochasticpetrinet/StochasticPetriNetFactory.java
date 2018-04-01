/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage
 * @generated
 */
public interface StochasticPetriNetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StochasticPetriNetFactory eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri Net</em>'.
	 * @generated
	 */
	PetriNet createPetriNet();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc</em>'.
	 * @generated
	 */
	Arc createArc();

	/**
	 * Returns a new object of class '<em>Timed Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Transition</em>'.
	 * @generated
	 */
	TimedTransition createTimedTransition();

	/**
	 * Returns a new object of class '<em>Immediate Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Transition</em>'.
	 * @generated
	 */
	ImmediateTransition createImmediateTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StochasticPetriNetPackage getStochasticPetriNetPackage();

} //StochasticPetriNetFactory
