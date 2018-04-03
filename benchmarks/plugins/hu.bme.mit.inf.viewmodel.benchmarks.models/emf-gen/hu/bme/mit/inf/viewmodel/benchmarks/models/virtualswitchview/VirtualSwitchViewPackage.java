/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitchViewFactory
 * @model kind="package"
 * @generated
 */
public interface VirtualSwitchViewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "virtualswitchview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/virtualswitchview.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "virtualswitchview";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VirtualSwitchViewPackage eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchViewPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchImpl <em>Virtual Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchViewPackageImpl#getVirtualSwitch()
	 * @generated
	 */
	int VIRTUAL_SWITCH = 0;

	/**
	 * The feature id for the '<em><b>Count Connected In Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SWITCH__COUNT_CONNECTED_IN_FAILURE = 0;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SWITCH__CONNECTED_TO = 1;

	/**
	 * The number of structural features of the '<em>Virtual Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SWITCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Virtual Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SWITCH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch <em>Virtual Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Switch</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch
	 * @generated
	 */
	EClass getVirtualSwitch();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch#getCountConnectedInFailure <em>Count Connected In Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Connected In Failure</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch#getCountConnectedInFailure()
	 * @see #getVirtualSwitch()
	 * @generated
	 */
	EAttribute getVirtualSwitch_CountConnectedInFailure();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.VirtualSwitch#getConnectedTo()
	 * @see #getVirtualSwitch()
	 * @generated
	 */
	EReference getVirtualSwitch_ConnectedTo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VirtualSwitchViewFactory getVirtualSwitchViewFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchImpl <em>Virtual Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.virtualswitchview.impl.VirtualSwitchViewPackageImpl#getVirtualSwitch()
		 * @generated
		 */
		EClass VIRTUAL_SWITCH = eINSTANCE.getVirtualSwitch();

		/**
		 * The meta object literal for the '<em><b>Count Connected In Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_SWITCH__COUNT_CONNECTED_IN_FAILURE = eINSTANCE.getVirtualSwitch_CountConnectedInFailure();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_SWITCH__CONNECTED_TO = eINSTANCE.getVirtualSwitch_ConnectedTo();

	}

} //VirtualSwitchViewPackage
