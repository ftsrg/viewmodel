/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch;

import hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch2 Virtual Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch#getSwitch <em>Switch</em>}</li>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch#getVirtualSwitch <em>Virtual Switch</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewPackage#getSwitch2VirtualSwitch()
 * @model
 * @generated
 */
public interface Switch2VirtualSwitch extends EObject {
	/**
	 * Returns the value of the '<em><b>Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' reference.
	 * @see #setSwitch(Switch)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewPackage#getSwitch2VirtualSwitch_Switch()
	 * @model
	 * @generated
	 */
	Switch getSwitch();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch#getSwitch <em>Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' reference.
	 * @see #getSwitch()
	 * @generated
	 */
	void setSwitch(Switch value);

	/**
	 * Returns the value of the '<em><b>Virtual Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Switch</em>' reference.
	 * @see #setVirtualSwitch(VirtualSwitch)
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewPackage#getSwitch2VirtualSwitch_VirtualSwitch()
	 * @model
	 * @generated
	 */
	VirtualSwitch getVirtualSwitch();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch#getVirtualSwitch <em>Virtual Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Switch</em>' reference.
	 * @see #getVirtualSwitch()
	 * @generated
	 */
	void setVirtualSwitch(VirtualSwitch value);

} // Switch2VirtualSwitch
