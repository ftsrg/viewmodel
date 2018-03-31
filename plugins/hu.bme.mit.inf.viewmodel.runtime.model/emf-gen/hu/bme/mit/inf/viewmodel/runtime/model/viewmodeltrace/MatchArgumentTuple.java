/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Argument Tuple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getMatchArgumentTuple()
 * @model
 * @generated
 */
public interface MatchArgumentTuple extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage#getMatchArgumentTuple_Elements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MatchArgument> getElements();

} // MatchArgumentTuple
