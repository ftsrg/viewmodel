/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependabilityFactoryImpl extends EFactoryImpl implements DependabilityFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DependabilityFactory init() {
		try {
			DependabilityFactory theDependabilityFactory = (DependabilityFactory)EPackage.Registry.INSTANCE.getEFactory(DependabilityPackage.eNS_URI);
			if (theDependabilityFactory != null) {
				return theDependabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DependabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DependabilityPackage.DEPENDABILITY_MODEL: return createDependabilityModel();
			case DependabilityPackage.FAILURE_REPAIR_MODEL: return createFailureRepairModel();
			case DependabilityPackage.IMMEDIATE_REPAIR_MODEL: return createImmediateRepairModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityModel createDependabilityModel() {
		DependabilityModelImpl dependabilityModel = new DependabilityModelImpl();
		return dependabilityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureRepairModel createFailureRepairModel() {
		FailureRepairModelImpl failureRepairModel = new FailureRepairModelImpl();
		return failureRepairModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmediateRepairModel createImmediateRepairModel() {
		ImmediateRepairModelImpl immediateRepairModel = new ImmediateRepairModelImpl();
		return immediateRepairModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependabilityPackage getDependabilityPackage() {
		return (DependabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DependabilityPackage getPackage() {
		return DependabilityPackage.eINSTANCE;
	}

} //DependabilityFactoryImpl
