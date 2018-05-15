/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability;

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
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityFactory
 * @model kind="package"
 * @generated
 */
public interface DependabilityPackage extends EPackage {
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
	String eNAME = "dependability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/dependability.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dependability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependabilityPackage eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityModelImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl#getDependabilityModel()
	 * @generated
	 */
	int DEPENDABILITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Error Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_MODEL__ERROR_MODELS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDABILITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ErrorModelImpl <em>Error Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ErrorModelImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl#getErrorModel()
	 * @generated
	 */
	int ERROR_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Railway Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL__RAILWAY_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Error Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Error Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.FailureRepairModelImpl <em>Failure Repair Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.FailureRepairModelImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl#getFailureRepairModel()
	 * @generated
	 */
	int FAILURE_REPAIR_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Railway Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_REPAIR_MODEL__RAILWAY_ELEMENT = ERROR_MODEL__RAILWAY_ELEMENT;

	/**
	 * The number of structural features of the '<em>Failure Repair Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_REPAIR_MODEL_FEATURE_COUNT = ERROR_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure Repair Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_REPAIR_MODEL_OPERATION_COUNT = ERROR_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ImmediateRepairModelImpl <em>Immediate Repair Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ImmediateRepairModelImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl#getImmediateRepairModel()
	 * @generated
	 */
	int IMMEDIATE_REPAIR_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Railway Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_REPAIR_MODEL__RAILWAY_ELEMENT = ERROR_MODEL__RAILWAY_ELEMENT;

	/**
	 * The number of structural features of the '<em>Immediate Repair Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_REPAIR_MODEL_FEATURE_COUNT = ERROR_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Immediate Repair Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_REPAIR_MODEL_OPERATION_COUNT = ERROR_MODEL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel
	 * @generated
	 */
	EClass getDependabilityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel#getErrorModels <em>Error Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Models</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel#getErrorModels()
	 * @see #getDependabilityModel()
	 * @generated
	 */
	EReference getDependabilityModel_ErrorModels();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel <em>Error Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel
	 * @generated
	 */
	EClass getErrorModel();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel#getRailwayElement <em>Railway Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Railway Element</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel#getRailwayElement()
	 * @see #getErrorModel()
	 * @generated
	 */
	EReference getErrorModel_RailwayElement();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.FailureRepairModel <em>Failure Repair Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Repair Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.FailureRepairModel
	 * @generated
	 */
	EClass getFailureRepairModel();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ImmediateRepairModel <em>Immediate Repair Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Repair Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ImmediateRepairModel
	 * @generated
	 */
	EClass getImmediateRepairModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DependabilityFactory getDependabilityFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityModelImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl#getDependabilityModel()
		 * @generated
		 */
		EClass DEPENDABILITY_MODEL = eINSTANCE.getDependabilityModel();

		/**
		 * The meta object literal for the '<em><b>Error Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDABILITY_MODEL__ERROR_MODELS = eINSTANCE.getDependabilityModel_ErrorModels();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ErrorModelImpl <em>Error Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ErrorModelImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl#getErrorModel()
		 * @generated
		 */
		EClass ERROR_MODEL = eINSTANCE.getErrorModel();

		/**
		 * The meta object literal for the '<em><b>Railway Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL__RAILWAY_ELEMENT = eINSTANCE.getErrorModel_RailwayElement();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.FailureRepairModelImpl <em>Failure Repair Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.FailureRepairModelImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl#getFailureRepairModel()
		 * @generated
		 */
		EClass FAILURE_REPAIR_MODEL = eINSTANCE.getFailureRepairModel();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ImmediateRepairModelImpl <em>Immediate Repair Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.ImmediateRepairModelImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl.DependabilityPackageImpl#getImmediateRepairModel()
		 * @generated
		 */
		EClass IMMEDIATE_REPAIR_MODEL = eINSTANCE.getImmediateRepairModel();

	}

} //DependabilityPackage
