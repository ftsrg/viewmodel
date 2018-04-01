/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage#getPetriNet_Nodes()
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node#getPetriNet
	 * @model opposite="petriNet" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // PetriNet
