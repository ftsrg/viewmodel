/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ViewModelTraceFactoryImpl extends EFactoryImpl implements ViewModelTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewModelTraceFactory init() {
		try {
			ViewModelTraceFactory theViewModelTraceFactory = (ViewModelTraceFactory)EPackage.Registry.INSTANCE.getEFactory(ViewModelTracePackage.eNS_URI);
			if (theViewModelTraceFactory != null) {
				return theViewModelTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewModelTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelTraceFactoryImpl() {
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
			case ViewModelTracePackage.VIEW_MODEL_TRACE: return createViewModelTrace();
			case ViewModelTracePackage.MATCH_ARGUMENT_TUPLE: return createMatchArgumentTuple();
			case ViewModelTracePackage.EOBJECT_MATCH_ARGUMENT: return createEObjectMatchArgument();
			case ViewModelTracePackage.JAVA_OBJECT_MATCH_ARGUMENT: return createJavaObjectMatchArgument();
			case ViewModelTracePackage.VARIABLE_INSTANTIATION_TRACE: return createVariableInstantiationTrace();
			case ViewModelTracePackage.STRING_VARIABLE_PAIR: return createStringVariablePair();
			case ViewModelTracePackage.CONSTRAINT_TRACE: return createConstraintTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ViewModelTracePackage.TRACE_STATE:
				return createTraceStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ViewModelTracePackage.TRACE_STATE:
				return convertTraceStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelTrace createViewModelTrace() {
		ViewModelTraceImpl viewModelTrace = new ViewModelTraceImpl();
		return viewModelTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchArgumentTuple createMatchArgumentTuple() {
		MatchArgumentTupleImpl matchArgumentTuple = new MatchArgumentTupleImpl();
		return matchArgumentTuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectMatchArgument createEObjectMatchArgument() {
		EObjectMatchArgumentImpl eObjectMatchArgument = new EObjectMatchArgumentImpl();
		return eObjectMatchArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaObjectMatchArgument createJavaObjectMatchArgument() {
		JavaObjectMatchArgumentImpl javaObjectMatchArgument = new JavaObjectMatchArgumentImpl();
		return javaObjectMatchArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableInstantiationTrace createVariableInstantiationTrace() {
		VariableInstantiationTraceImpl variableInstantiationTrace = new VariableInstantiationTraceImpl();
		return variableInstantiationTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVariablePair createStringVariablePair() {
		StringVariablePairImpl stringVariablePair = new StringVariablePairImpl();
		return stringVariablePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTrace createConstraintTrace() {
		ConstraintTraceImpl constraintTrace = new ConstraintTraceImpl();
		return constraintTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceState createTraceStateFromString(EDataType eDataType, String initialValue) {
		TraceState result = TraceState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTraceStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelTracePackage getViewModelTracePackage() {
		return (ViewModelTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewModelTracePackage getPackage() {
		return ViewModelTracePackage.eINSTANCE;
	}

} //ViewModelTraceFactoryImpl
