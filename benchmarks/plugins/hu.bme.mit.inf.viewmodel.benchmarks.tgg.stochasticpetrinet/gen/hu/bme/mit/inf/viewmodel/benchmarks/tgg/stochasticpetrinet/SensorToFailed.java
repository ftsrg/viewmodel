/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor To Failed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed#getSource <em>Source</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage#getSensorToFailed()
 * @model
 * @generated
 */
public interface SensorToFailed extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Sensor)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage#getSensorToFailed_Source()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSource();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Sensor value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Place)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage#getSensorToFailed_Target()
	 * @model required="true"
	 * @generated
	 */
	Place getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Place value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SensorToFailed
