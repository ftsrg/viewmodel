/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.util;

import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage
 * @generated
 */
public class ViewModelTraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewModelTracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelTraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewModelTracePackage.eINSTANCE;
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
	protected ViewModelTraceSwitch<Adapter> modelSwitch =
		new ViewModelTraceSwitch<Adapter>() {
			@Override
			public Adapter caseViewModelTrace(ViewModelTrace object) {
				return createViewModelTraceAdapter();
			}
			@Override
			public Adapter caseMatchArgumentTuple(MatchArgumentTuple object) {
				return createMatchArgumentTupleAdapter();
			}
			@Override
			public Adapter caseMatchArgument(MatchArgument object) {
				return createMatchArgumentAdapter();
			}
			@Override
			public Adapter caseEObjectMatchArgument(EObjectMatchArgument object) {
				return createEObjectMatchArgumentAdapter();
			}
			@Override
			public Adapter caseJavaObjectMatchArgument(JavaObjectMatchArgument object) {
				return createJavaObjectMatchArgumentAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseVariableInstantiationTrace(VariableInstantiationTrace object) {
				return createVariableInstantiationTraceAdapter();
			}
			@Override
			public Adapter caseStringVariablePair(StringVariablePair object) {
				return createStringVariablePairAdapter();
			}
			@Override
			public Adapter caseConstraintTrace(ConstraintTrace object) {
				return createConstraintTraceAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace <em>View Model Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTrace
	 * @generated
	 */
	public Adapter createViewModelTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple <em>Match Argument Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgumentTuple
	 * @generated
	 */
	public Adapter createMatchArgumentTupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument <em>Match Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.MatchArgument
	 * @generated
	 */
	public Adapter createMatchArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.EObjectMatchArgument <em>EObject Match Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.EObjectMatchArgument
	 * @generated
	 */
	public Adapter createEObjectMatchArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.JavaObjectMatchArgument <em>Java Object Match Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.JavaObjectMatchArgument
	 * @generated
	 */
	public Adapter createJavaObjectMatchArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace <em>Variable Instantiation Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace
	 * @generated
	 */
	public Adapter createVariableInstantiationTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair <em>String Variable Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.StringVariablePair
	 * @generated
	 */
	public Adapter createStringVariablePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace <em>Constraint Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace
	 * @generated
	 */
	public Adapter createConstraintTraceAdapter() {
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

} //ViewModelTraceAdapterFactory
