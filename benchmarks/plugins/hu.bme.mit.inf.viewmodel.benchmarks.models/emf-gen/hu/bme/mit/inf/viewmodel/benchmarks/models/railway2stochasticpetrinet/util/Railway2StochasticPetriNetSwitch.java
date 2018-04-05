/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.util;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.railway2stochasticpetrinet.Railway2StochasticPetriNetPackage
 * @generated
 */
public class Railway2StochasticPetriNetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Railway2StochasticPetriNetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Railway2StochasticPetriNetSwitch() {
		if (modelPackage == null) {
			modelPackage = Railway2StochasticPetriNetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Railway2StochasticPetriNetPackage.RAILWAY2_STOCHASTIC_PETRI_NET_TRACE: {
				Railway2StochasticPetriNetTrace railway2StochasticPetriNetTrace = (Railway2StochasticPetriNetTrace)theEObject;
				T result = caseRailway2StochasticPetriNetTrace(railway2StochasticPetriNetTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Railway2StochasticPetriNetPackage.PETRI_NET_MODULE_TRACE_LINK: {
				PetriNetModuleTraceLink petriNetModuleTraceLink = (PetriNetModuleTraceLink)theEObject;
				T result = casePetriNetModuleTraceLink(petriNetModuleTraceLink);
				if (result == null) result = caseTraceLink(petriNetModuleTraceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Railway2StochasticPetriNetPackage.ROUTE2_FAILURE_MODEL: {
				Route2FailureModel route2FailureModel = (Route2FailureModel)theEObject;
				T result = caseRoute2FailureModel(route2FailureModel);
				if (result == null) result = casePetriNetModuleTraceLink(route2FailureModel);
				if (result == null) result = caseTraceLink(route2FailureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_FAILURE_MODEL: {
				RequiredElement2FailureModel requiredElement2FailureModel = (RequiredElement2FailureModel)theEObject;
				T result = caseRequiredElement2FailureModel(requiredElement2FailureModel);
				if (result == null) result = casePetriNetModuleTraceLink(requiredElement2FailureModel);
				if (result == null) result = caseTraceLink(requiredElement2FailureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Railway2StochasticPetriNetPackage.REQUIRED_ELEMENT2_CONNECTION: {
				RequiredElement2Connection requiredElement2Connection = (RequiredElement2Connection)theEObject;
				T result = caseRequiredElement2Connection(requiredElement2Connection);
				if (result == null) result = casePetriNetModuleTraceLink(requiredElement2Connection);
				if (result == null) result = caseTraceLink(requiredElement2Connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Railway2StochasticPetriNetPackage.RAILWAY_CONTAINER2_PETRI_NET: {
				RailwayContainer2PetriNet railwayContainer2PetriNet = (RailwayContainer2PetriNet)theEObject;
				T result = caseRailwayContainer2PetriNet(railwayContainer2PetriNet);
				if (result == null) result = caseTraceLink(railwayContainer2PetriNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Railway2StochasticPetriNetPackage.TRACE_LINK: {
				TraceLink traceLink = (TraceLink)theEObject;
				T result = caseTraceLink(traceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRailway2StochasticPetriNetTrace(Railway2StochasticPetriNetTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Petri Net Module Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Petri Net Module Trace Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePetriNetModuleTraceLink(PetriNetModuleTraceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route2 Failure Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route2 Failure Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute2FailureModel(Route2FailureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Element2 Failure Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Element2 Failure Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredElement2FailureModel(RequiredElement2FailureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Element2 Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Element2 Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredElement2Connection(RequiredElement2Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Railway Container2 Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Railway Container2 Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRailwayContainer2PetriNet(RailwayContainer2PetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceLink(TraceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Railway2StochasticPetriNetSwitch
