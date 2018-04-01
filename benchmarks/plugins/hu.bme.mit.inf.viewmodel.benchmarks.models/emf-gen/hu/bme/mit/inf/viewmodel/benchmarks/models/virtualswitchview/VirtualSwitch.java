/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch#getCountConnectedInFailure <em>Count Connected In Failure</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewPackage#getVirtualSwitch()
 * @model
 * @generated
 */
public interface VirtualSwitch extends EObject {
	/**
	 * Returns the value of the '<em><b>Count Connected In Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Connected In Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Connected In Failure</em>' attribute.
	 * @see #setCountConnectedInFailure(int)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewPackage#getVirtualSwitch_CountConnectedInFailure()
	 * @model
	 * @generated
	 */
	int getCountConnectedInFailure();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch#getCountConnectedInFailure <em>Count Connected In Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Connected In Failure</em>' attribute.
	 * @see #getCountConnectedInFailure()
	 * @generated
	 */
	void setCountConnectedInFailure(int value);

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewPackage#getVirtualSwitch_ConnectedTo()
	 * @model
	 * @generated
	 */
	EList<VirtualSwitch> getConnectedTo();

} // VirtualSwitch
