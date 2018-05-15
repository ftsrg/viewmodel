/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.*;

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
public class Dependability2StochasticPetriNetFactoryImpl extends EFactoryImpl implements Dependability2StochasticPetriNetFactory {
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
	public static Dependability2StochasticPetriNetFactory init() {
		try {
			Dependability2StochasticPetriNetFactory theDependability2StochasticPetriNetFactory = (Dependability2StochasticPetriNetFactory)EPackage.Registry.INSTANCE.getEFactory(Dependability2StochasticPetriNetPackage.eNS_URI);
			if (theDependability2StochasticPetriNetFactory != null) {
				return theDependability2StochasticPetriNetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dependability2StochasticPetriNetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability2StochasticPetriNetFactoryImpl() {
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
			case Dependability2StochasticPetriNetPackage.DEPENDABILITY2_STOCHASTIC_PETRI_NET_TRACE: return createDependability2StochasticPetriNetTrace();
			case Dependability2StochasticPetriNetPackage.ERROR_MODEL2_PETRI_NET_MODULE: return createErrorModel2PetriNetModule();
			case Dependability2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET: return createRailwayContainer2PetriNet();
			case Dependability2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION: return createRequiredElement2Connection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability2StochasticPetriNetTrace createDependability2StochasticPetriNetTrace() {
		Dependability2StochasticPetriNetTraceImpl dependability2StochasticPetriNetTrace = new Dependability2StochasticPetriNetTraceImpl();
		return dependability2StochasticPetriNetTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModel2PetriNetModule createErrorModel2PetriNetModule() {
		ErrorModel2PetriNetModuleImpl errorModel2PetriNetModule = new ErrorModel2PetriNetModuleImpl();
		return errorModel2PetriNetModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RailwayContainer2PetriNet createRailwayContainer2PetriNet() {
		RailwayContainer2PetriNetImpl railwayContainer2PetriNet = new RailwayContainer2PetriNetImpl();
		return railwayContainer2PetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredElement2Connection createRequiredElement2Connection() {
		RequiredElement2ConnectionImpl requiredElement2Connection = new RequiredElement2ConnectionImpl();
		return requiredElement2Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability2StochasticPetriNetPackage getDependability2StochasticPetriNetPackage() {
		return (Dependability2StochasticPetriNetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dependability2StochasticPetriNetPackage getPackage() {
		return Dependability2StochasticPetriNetPackage.eINSTANCE;
	}

} //Dependability2StochasticPetriNetFactoryImpl
