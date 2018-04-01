/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewPackage
 * @generated
 */
public interface VirtualSwitchViewFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VirtualSwitchViewFactory eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchViewFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Switch</em>'.
	 * @generated
	 */
	VirtualSwitch createVirtualSwitch();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VirtualSwitchViewPackage getVirtualSwitchViewPackage();

} //VirtualSwitchViewFactory
