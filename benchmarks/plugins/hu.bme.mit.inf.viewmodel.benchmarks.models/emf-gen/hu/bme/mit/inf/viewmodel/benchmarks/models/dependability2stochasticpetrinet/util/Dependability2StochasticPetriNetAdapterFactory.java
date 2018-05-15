/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.util;

import hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetPackage
 * @generated
 */
public class Dependability2StochasticPetriNetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2018 Contributors to the ViewModel project\n\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nSPDX-License-Identifier: EPL-1.0";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dependability2StochasticPetriNetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependability2StochasticPetriNetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Dependability2StochasticPetriNetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dependability2StochasticPetriNetSwitch<Adapter> modelSwitch =
		new Dependability2StochasticPetriNetSwitch<Adapter>() {
			@Override
			public Adapter caseDependability2StochasticPetriNetTrace(Dependability2StochasticPetriNetTrace object) {
				return createDependability2StochasticPetriNetTraceAdapter();
			}
			@Override
			public Adapter caseTraceLink(TraceLink object) {
				return createTraceLinkAdapter();
			}
			@Override
			public Adapter caseErrorModel2PetriNetModule(ErrorModel2PetriNetModule object) {
				return createErrorModel2PetriNetModuleAdapter();
			}
			@Override
			public Adapter caseRailwayContainer2PetriNet(RailwayContainer2PetriNet object) {
				return createRailwayContainer2PetriNetAdapter();
			}
			@Override
			public Adapter casePetriNetModuleTraceLink(PetriNetModuleTraceLink object) {
				return createPetriNetModuleTraceLinkAdapter();
			}
			@Override
			public Adapter caseRequiredElement2Connection(RequiredElement2Connection object) {
				return createRequiredElement2ConnectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.Dependability2StochasticPetriNetTrace
	 * @generated
	 */
	public Adapter createDependability2StochasticPetriNetTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.TraceLink
	 * @generated
	 */
	public Adapter createTraceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule <em>Error Model2 Petri Net Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.ErrorModel2PetriNetModule
	 * @generated
	 */
	public Adapter createErrorModel2PetriNetModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet <em>Railway Container2 Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RailwayContainer2PetriNet
	 * @generated
	 */
	public Adapter createRailwayContainer2PetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink <em>Petri Net Module Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.PetriNetModuleTraceLink
	 * @generated
	 */
	public Adapter createPetriNetModuleTraceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection <em>Required Element2 Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability2stochasticpetrinet.RequiredElement2Connection
	 * @generated
	 */
	public Adapter createRequiredElement2ConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Dependability2StochasticPetriNetAdapterFactory
