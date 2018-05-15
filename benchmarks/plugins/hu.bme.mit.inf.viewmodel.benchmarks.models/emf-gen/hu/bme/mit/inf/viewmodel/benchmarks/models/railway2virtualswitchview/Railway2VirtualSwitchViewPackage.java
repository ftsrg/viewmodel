/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview;

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
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewFactory
 * @model kind="package"
 * @generated
 */
public interface Railway2VirtualSwitchViewPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "railway2virtualswitchview";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/railway2virtualswitchview.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "railway2virtualswitchview";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Railway2VirtualSwitchViewPackage eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Switch2VirtualSwitchImpl <em>Switch2 Virtual Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Switch2VirtualSwitchImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewPackageImpl#getSwitch2VirtualSwitch()
	 * @generated
	 */
	int SWITCH2_VIRTUAL_SWITCH = 0;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH2_VIRTUAL_SWITCH__SWITCH = 0;

	/**
	 * The feature id for the '<em><b>Virtual Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH = 1;

	/**
	 * The number of structural features of the '<em>Switch2 Virtual Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH2_VIRTUAL_SWITCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Switch2 Virtual Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH2_VIRTUAL_SWITCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewTraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewTraceImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewPackageImpl#getRailway2VirtualSwitchViewTrace()
	 * @generated
	 */
	int RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE__TRACE_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch <em>Switch2 Virtual Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch2 Virtual Switch</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch
	 * @generated
	 */
	EClass getSwitch2VirtualSwitch();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch#getSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Switch</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch#getSwitch()
	 * @see #getSwitch2VirtualSwitch()
	 * @generated
	 */
	EReference getSwitch2VirtualSwitch_Switch();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch#getVirtualSwitch <em>Virtual Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual Switch</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Switch2VirtualSwitch#getVirtualSwitch()
	 * @see #getSwitch2VirtualSwitch()
	 * @generated
	 */
	EReference getSwitch2VirtualSwitch_VirtualSwitch();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace
	 * @generated
	 */
	EClass getRailway2VirtualSwitchViewTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace#getTraceLinks()
	 * @see #getRailway2VirtualSwitchViewTrace()
	 * @generated
	 */
	EReference getRailway2VirtualSwitchViewTrace_TraceLinks();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.Railway2VirtualSwitchViewTrace#getSource()
	 * @see #getRailway2VirtualSwitchViewTrace()
	 * @generated
	 */
	EReference getRailway2VirtualSwitchViewTrace_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Railway2VirtualSwitchViewFactory getRailway2VirtualSwitchViewFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Switch2VirtualSwitchImpl <em>Switch2 Virtual Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Switch2VirtualSwitchImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewPackageImpl#getSwitch2VirtualSwitch()
		 * @generated
		 */
		EClass SWITCH2_VIRTUAL_SWITCH = eINSTANCE.getSwitch2VirtualSwitch();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH2_VIRTUAL_SWITCH__SWITCH = eINSTANCE.getSwitch2VirtualSwitch_Switch();

		/**
		 * The meta object literal for the '<em><b>Virtual Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH2_VIRTUAL_SWITCH__VIRTUAL_SWITCH = eINSTANCE.getSwitch2VirtualSwitch_VirtualSwitch();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewTraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewTraceImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2virtualswitchview.impl.Railway2VirtualSwitchViewPackageImpl#getRailway2VirtualSwitchViewTrace()
		 * @generated
		 */
		EClass RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE = eINSTANCE.getRailway2VirtualSwitchViewTrace();

		/**
		 * The meta object literal for the '<em><b>Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE__TRACE_LINKS = eINSTANCE.getRailway2VirtualSwitchViewTrace_TraceLinks();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAILWAY2_VIRTUAL_SWITCH_VIEW_TRACE__SOURCE = eINSTANCE.getRailway2VirtualSwitchViewTrace_Source();

	}

} //Railway2VirtualSwitchViewPackage
