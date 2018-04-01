/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net</em>' container reference.
	 * @see #setPetriNet(PetriNet)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage#getNode_PetriNet()
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	PetriNet getPetriNet();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node#getPetriNet <em>Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri Net</em>' container reference.
	 * @see #getPetriNet()
	 * @generated
	 */
	void setPetriNet(PetriNet value);

} // Node
