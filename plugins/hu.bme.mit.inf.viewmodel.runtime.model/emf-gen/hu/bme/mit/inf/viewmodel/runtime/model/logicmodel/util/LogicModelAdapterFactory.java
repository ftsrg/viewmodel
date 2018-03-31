/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.util;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage
 * @generated
 */
public class LogicModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogicModelPackage.eINSTANCE;
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
	protected LogicModelSwitch<Adapter> modelSwitch =
		new LogicModelSwitch<Adapter>() {
			@Override
			public Adapter caseLogicModel(LogicModel object) {
				return createLogicModelAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseUnaryConstraint(UnaryConstraint object) {
				return createUnaryConstraintAdapter();
			}
			@Override
			public Adapter caseBinaryConstraint(BinaryConstraint object) {
				return createBinaryConstraintAdapter();
			}
			@Override
			public Adapter caseEClassConstraint(EClassConstraint object) {
				return createEClassConstraintAdapter();
			}
			@Override
			public Adapter caseJavaClassConstraint(JavaClassConstraint object) {
				return createJavaClassConstraintAdapter();
			}
			@Override
			public Adapter caseConstantEObjectConstraint(ConstantEObjectConstraint object) {
				return createConstantEObjectConstraintAdapter();
			}
			@Override
			public Adapter caseConstantJavaObjectConstraint(ConstantJavaObjectConstraint object) {
				return createConstantJavaObjectConstraintAdapter();
			}
			@Override
			public Adapter caseEquivalenceConstraint(EquivalenceConstraint object) {
				return createEquivalenceConstraintAdapter();
			}
			@Override
			public Adapter caseRelationConstraint(RelationConstraint object) {
				return createRelationConstraintAdapter();
			}
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter caseManifestationTrace(ManifestationTrace object) {
				return createManifestationTraceAdapter();
			}
			@Override
			public Adapter caseManifestation(Manifestation object) {
				return createManifestationAdapter();
			}
			@Override
			public Adapter caseInterpretedManifestation(InterpretedManifestation object) {
				return createInterpretedManifestationAdapter();
			}
			@Override
			public Adapter caseUninterpretedManifestation(UninterpretedManifestation object) {
				return createUninterpretedManifestationAdapter();
			}
			@Override
			public Adapter casePrimitiveManifestation(PrimitiveManifestation object) {
				return createPrimitiveManifestationAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel <em>Logic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
	 * @generated
	 */
	public Adapter createLogicModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint <em>Unary Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint
	 * @generated
	 */
	public Adapter createUnaryConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint <em>Binary Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint
	 * @generated
	 */
	public Adapter createBinaryConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint <em>EClass Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint
	 * @generated
	 */
	public Adapter createEClassConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint <em>Java Class Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint
	 * @generated
	 */
	public Adapter createJavaClassConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint <em>Constant EObject Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint
	 * @generated
	 */
	public Adapter createConstantEObjectConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint <em>Constant Java Object Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint
	 * @generated
	 */
	public Adapter createConstantJavaObjectConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EquivalenceConstraint <em>Equivalence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EquivalenceConstraint
	 * @generated
	 */
	public Adapter createEquivalenceConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint <em>Relation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint
	 * @generated
	 */
	public Adapter createRelationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
	 * @generated
	 */
	public Adapter createClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace <em>Manifestation Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace
	 * @generated
	 */
	public Adapter createManifestationTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation <em>Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation
	 * @generated
	 */
	public Adapter createManifestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation <em>Interpreted Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation
	 * @generated
	 */
	public Adapter createInterpretedManifestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation <em>Uninterpreted Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation
	 * @generated
	 */
	public Adapter createUninterpretedManifestationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation <em>Primitive Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation
	 * @generated
	 */
	public Adapter createPrimitiveManifestationAdapter() {
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

} //LogicModelAdapterFactory
