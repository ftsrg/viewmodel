/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route To Repair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair#getSource <em>Source</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage#getRouteToRepair()
 * @model
 * @generated
 */
public interface RouteToRepair extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Route)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage#getRouteToRepair_Source()
	 * @model required="true"
	 * @generated
	 */
	Route getSource();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Route value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Transition)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage#getRouteToRepair_Target()
	 * @model required="true"
	 * @generated
	 */
	Transition getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Transition value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // RouteToRepair
