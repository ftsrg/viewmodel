/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewPackage
 * @generated
 */
public interface Railway2VirtualSwitchViewFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Railway2VirtualSwitchViewFactory eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Switch2 Virtual Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch2 Virtual Switch</em>'.
	 * @generated
	 */
	Switch2VirtualSwitch createSwitch2VirtualSwitch();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Railway2VirtualSwitchViewTrace createRailway2VirtualSwitchViewTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Railway2VirtualSwitchViewPackage getRailway2VirtualSwitchViewPackage();

} //Railway2VirtualSwitchViewFactory
