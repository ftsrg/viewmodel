/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage
 * @generated
 */
public interface DependabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependabilityFactory eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	DependabilityModel createDependabilityModel();

	/**
	 * Returns a new object of class '<em>Failure Repair Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Repair Model</em>'.
	 * @generated
	 */
	FailureRepairModel createFailureRepairModel();

	/**
	 * Returns a new object of class '<em>Immediate Repair Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Repair Model</em>'.
	 * @generated
	 */
	ImmediateRepairModel createImmediateRepairModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DependabilityPackage getDependabilityPackage();

} //DependabilityFactory
