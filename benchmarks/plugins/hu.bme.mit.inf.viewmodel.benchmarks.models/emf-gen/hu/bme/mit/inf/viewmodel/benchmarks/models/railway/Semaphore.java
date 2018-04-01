/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSemaphore()
 * @model
 * @generated
 */
public interface Semaphore extends RailwayElement {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' attribute.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Signal
	 * @see #setSignal(Signal)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage#getSemaphore_Signal()
	 * @model unique="false"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore#getSignal <em>Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' attribute.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Signal
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // Semaphore
