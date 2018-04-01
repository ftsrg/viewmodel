/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage#getTransition()
 * @model abstract="true"
 * @generated
 */
public interface Transition extends Node {
	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage#getTransition_Arcs()
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc#getTransition
	 * @model opposite="transition" containment="true" required="true"
	 * @generated
	 */
	EList<Arc> getArcs();

} // Transition
