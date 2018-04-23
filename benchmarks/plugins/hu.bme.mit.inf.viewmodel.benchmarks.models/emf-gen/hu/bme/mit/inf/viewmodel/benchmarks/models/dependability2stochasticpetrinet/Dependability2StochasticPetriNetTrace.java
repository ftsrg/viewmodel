/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getRailwayContainer <em>Railway Container</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getDependabilityModel <em>Dependability Model</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getTraceLinks <em>Trace Links</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getDependability2StochasticPetriNetTrace()
 * @model
 * @generated
 */
public interface Dependability2StochasticPetriNetTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Railway Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Railway Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Railway Container</em>' reference.
	 * @see #setRailwayContainer(RailwayContainer)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getDependability2StochasticPetriNetTrace_RailwayContainer()
	 * @model required="true"
	 * @generated
	 */
	RailwayContainer getRailwayContainer();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getRailwayContainer <em>Railway Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Railway Container</em>' reference.
	 * @see #getRailwayContainer()
	 * @generated
	 */
	void setRailwayContainer(RailwayContainer value);

	/**
	 * Returns the value of the '<em><b>Dependability Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependability Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependability Model</em>' reference.
	 * @see #setDependabilityModel(DependabilityModel)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getDependability2StochasticPetriNetTrace_DependabilityModel()
	 * @model required="true"
	 * @generated
	 */
	DependabilityModel getDependabilityModel();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace#getDependabilityModel <em>Dependability Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependability Model</em>' reference.
	 * @see #getDependabilityModel()
	 * @generated
	 */
	void setDependabilityModel(DependabilityModel value);

	/**
	 * Returns the value of the '<em><b>Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.TraceLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Links</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage#getDependability2StochasticPetriNetTrace_TraceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

} // Dependability2StochasticPetriNetTrace
