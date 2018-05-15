/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl;

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.*;

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
public class LogicModelFactoryImpl extends EFactoryImpl implements LogicModelFactory {
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
	public static LogicModelFactory init() {
		try {
			LogicModelFactory theLogicModelFactory = (LogicModelFactory)EPackage.Registry.INSTANCE.getEFactory(LogicModelPackage.eNS_URI);
			if (theLogicModelFactory != null) {
				return theLogicModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicModelFactoryImpl() {
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
			case LogicModelPackage.LOGIC_MODEL: return createLogicModel();
			case LogicModelPackage.VARIABLE: return createVariable();
			case LogicModelPackage.ECLASS_CONSTRAINT: return createEClassConstraint();
			case LogicModelPackage.JAVA_CLASS_CONSTRAINT: return createJavaClassConstraint();
			case LogicModelPackage.CONSTANT_EOBJECT_CONSTRAINT: return createConstantEObjectConstraint();
			case LogicModelPackage.CONSTANT_JAVA_OBJECT_CONSTRAINT: return createConstantJavaObjectConstraint();
			case LogicModelPackage.EQUIVALENCE_CONSTRAINT: return createEquivalenceConstraint();
			case LogicModelPackage.RELATION_CONSTRAINT: return createRelationConstraint();
			case LogicModelPackage.CLUSTER: return createCluster();
			case LogicModelPackage.MANIFESTATION_TRACE: return createManifestationTrace();
			case LogicModelPackage.INTERPRETED_MANIFESTATION: return createInterpretedManifestation();
			case LogicModelPackage.UNINTERPRETED_MANIFESTATION: return createUninterpretedManifestation();
			case LogicModelPackage.PRIMITIVE_MANIFESTATION: return createPrimitiveManifestation();
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
			case LogicModelPackage.CLUSTER_STATE:
				return createClusterStateFromString(eDataType, initialValue);
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
			case LogicModelPackage.CLUSTER_STATE:
				return convertClusterStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicModel createLogicModel() {
		LogicModelImpl logicModel = new LogicModelImpl();
		return logicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassConstraint createEClassConstraint() {
		EClassConstraintImpl eClassConstraint = new EClassConstraintImpl();
		return eClassConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClassConstraint createJavaClassConstraint() {
		JavaClassConstraintImpl javaClassConstraint = new JavaClassConstraintImpl();
		return javaClassConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantEObjectConstraint createConstantEObjectConstraint() {
		ConstantEObjectConstraintImpl constantEObjectConstraint = new ConstantEObjectConstraintImpl();
		return constantEObjectConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantJavaObjectConstraint createConstantJavaObjectConstraint() {
		ConstantJavaObjectConstraintImpl constantJavaObjectConstraint = new ConstantJavaObjectConstraintImpl();
		return constantJavaObjectConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalenceConstraint createEquivalenceConstraint() {
		EquivalenceConstraintImpl equivalenceConstraint = new EquivalenceConstraintImpl();
		return equivalenceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationConstraint createRelationConstraint() {
		RelationConstraintImpl relationConstraint = new RelationConstraintImpl();
		return relationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestationTrace createManifestationTrace() {
		ManifestationTraceImpl manifestationTrace = new ManifestationTraceImpl();
		return manifestationTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpretedManifestation createInterpretedManifestation() {
		InterpretedManifestationImpl interpretedManifestation = new InterpretedManifestationImpl();
		return interpretedManifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UninterpretedManifestation createUninterpretedManifestation() {
		UninterpretedManifestationImpl uninterpretedManifestation = new UninterpretedManifestationImpl();
		return uninterpretedManifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveManifestation createPrimitiveManifestation() {
		PrimitiveManifestationImpl primitiveManifestation = new PrimitiveManifestationImpl();
		return primitiveManifestation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterState createClusterStateFromString(EDataType eDataType, String initialValue) {
		ClusterState result = ClusterState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClusterStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicModelPackage getLogicModelPackage() {
		return (LogicModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicModelPackage getPackage() {
		return LogicModelPackage.eINSTANCE;
	}

} //LogicModelFactoryImpl
