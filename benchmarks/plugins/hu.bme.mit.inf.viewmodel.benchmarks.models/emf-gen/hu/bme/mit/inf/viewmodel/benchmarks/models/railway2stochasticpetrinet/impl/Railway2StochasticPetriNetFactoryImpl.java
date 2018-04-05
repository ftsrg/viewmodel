/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.*;

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
public class Railway2StochasticPetriNetFactoryImpl extends EFactoryImpl implements Railway2StochasticPetriNetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Railway2StochasticPetriNetFactory init() {
		try {
			Railway2StochasticPetriNetFactory theRailway2StochasticPetriNetFactory = (Railway2StochasticPetriNetFactory)EPackage.Registry.INSTANCE.getEFactory(Railway2StochasticPetriNetPackage.eNS_URI);
			if (theRailway2StochasticPetriNetFactory != null) {
				return theRailway2StochasticPetriNetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Railway2StochasticPetriNetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2StochasticPetriNetFactoryImpl() {
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
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE: return createRailway2StochasticPetriNetTrace();
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL: return createRoute2FailureModel();
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL: return createRequiredElement2FailureModel();
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION: return createRequiredElement2Connection();
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET: return createRailwayContainer2PetriNet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2StochasticPetriNetTrace createRailway2StochasticPetriNetTrace() {
		Railway2StochasticPetriNetTraceImpl railway2StochasticPetriNetTrace = new Railway2StochasticPetriNetTraceImpl();
		return railway2StochasticPetriNetTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route2FailureModel createRoute2FailureModel() {
		Route2FailureModelImpl route2FailureModel = new Route2FailureModelImpl();
		return route2FailureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredElement2FailureModel createRequiredElement2FailureModel() {
		RequiredElement2FailureModelImpl requiredElement2FailureModel = new RequiredElement2FailureModelImpl();
		return requiredElement2FailureModel;
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
	public RailwayContainer2PetriNet createRailwayContainer2PetriNet() {
		RailwayContainer2PetriNetImpl railwayContainer2PetriNet = new RailwayContainer2PetriNetImpl();
		return railwayContainer2PetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2StochasticPetriNetPackage getRailway2StochasticPetriNetPackage() {
		return (Railway2StochasticPetriNetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Railway2StochasticPetriNetPackage getPackage() {
		return Railway2StochasticPetriNetPackage.eINSTANCE;
	}

} //Railway2StochasticPetriNetFactoryImpl
