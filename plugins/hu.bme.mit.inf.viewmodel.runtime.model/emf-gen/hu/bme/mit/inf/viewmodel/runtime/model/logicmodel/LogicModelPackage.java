/**
 */
package hu.bme.mit.inf.viewmodel.runtime.model.logicmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/hu.bme.mit.inf.viewmodel.runtime.model/src-gen' prefix='LogicModel' fileExtensions='logicmodel' providerName='BME MIT FTSRG' operationReflection='false' basePackage='hu.bme.mit.inf.viewmodel.runtime.model'"
 * @generated
 */
public interface LogicModelPackage extends EPackage {
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
	String eNAME = "logicmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inf.mit.bme.hu/emf/2017/LogicModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logicmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicModelPackage eINSTANCE = hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelImpl <em>Logic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getLogicModel()
	 * @generated
	 */
	int LOGIC_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Logic Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MODEL__LOGIC_MODEL_ID = 0;

	/**
	 * The feature id for the '<em><b>Clusters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MODEL__CLUSTERS = 1;

	/**
	 * The number of structural features of the '<em>Logic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.VariableImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CLUSTER = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.UnaryConstraintImpl <em>Unary Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.UnaryConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getUnaryConstraint()
	 * @generated
	 */
	int UNARY_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONSTRAINT__VARIABLE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.BinaryConstraintImpl <em>Binary Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.BinaryConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getBinaryConstraint()
	 * @generated
	 */
	int BINARY_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONSTRAINT__LEFT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONSTRAINT__RIGHT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EClassConstraintImpl <em>EClass Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EClassConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getEClassConstraint()
	 * @generated
	 */
	int ECLASS_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONSTRAINT__VARIABLE = UNARY_CONSTRAINT__VARIABLE;

	/**
	 * The feature id for the '<em><b>Target EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONSTRAINT__TARGET_ECLASS = UNARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EClass Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONSTRAINT_FEATURE_COUNT = UNARY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.JavaClassConstraintImpl <em>Java Class Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.JavaClassConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getJavaClassConstraint()
	 * @generated
	 */
	int JAVA_CLASS_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_CONSTRAINT__VARIABLE = UNARY_CONSTRAINT__VARIABLE;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_CONSTRAINT__TARGET_CLASS = UNARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Class Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_CLASS_CONSTRAINT_FEATURE_COUNT = UNARY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstantEObjectConstraintImpl <em>Constant EObject Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstantEObjectConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getConstantEObjectConstraint()
	 * @generated
	 */
	int CONSTANT_EOBJECT_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EOBJECT_CONSTRAINT__VARIABLE = UNARY_CONSTRAINT__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EOBJECT_CONSTRAINT__VALUE = UNARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EOBJECT_CONSTRAINT__VALUE_TYPE = UNARY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant EObject Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EOBJECT_CONSTRAINT_FEATURE_COUNT = UNARY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstantJavaObjectConstraintImpl <em>Constant Java Object Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstantJavaObjectConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getConstantJavaObjectConstraint()
	 * @generated
	 */
	int CONSTANT_JAVA_OBJECT_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_JAVA_OBJECT_CONSTRAINT__VARIABLE = UNARY_CONSTRAINT__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_JAVA_OBJECT_CONSTRAINT__VALUE = UNARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_JAVA_OBJECT_CONSTRAINT__VALUE_TYPE = UNARY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant Java Object Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_JAVA_OBJECT_CONSTRAINT_FEATURE_COUNT = UNARY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EquivalenceConstraintImpl <em>Equivalence Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EquivalenceConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getEquivalenceConstraint()
	 * @generated
	 */
	int EQUIVALENCE_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_CONSTRAINT__LEFT = BINARY_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_CONSTRAINT__RIGHT = BINARY_CONSTRAINT__RIGHT;

	/**
	 * The number of structural features of the '<em>Equivalence Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENCE_CONSTRAINT_FEATURE_COUNT = BINARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.RelationConstraintImpl <em>Relation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.RelationConstraintImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getRelationConstraint()
	 * @generated
	 */
	int RELATION_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT__LEFT = BINARY_CONSTRAINT__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT__RIGHT = BINARY_CONSTRAINT__RIGHT;

	/**
	 * The feature id for the '<em><b>Target Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT__TARGET_RELATION = BINARY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CONSTRAINT_FEATURE_COUNT = BINARY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ClusterImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ID = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__STATE = 1;

	/**
	 * The feature id for the '<em><b>Manifestation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__MANIFESTATION = 2;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationTraceImpl <em>Manifestation Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationTraceImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getManifestationTrace()
	 * @generated
	 */
	int MANIFESTATION_TRACE = 12;

	/**
	 * The feature id for the '<em><b>Trace Model Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFESTATION_TRACE__TRACE_MODEL_ID = 0;

	/**
	 * The feature id for the '<em><b>Logic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFESTATION_TRACE__LOGIC_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFESTATION_TRACE__RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Manifestation Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFESTATION_TRACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationImpl <em>Manifestation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getManifestation()
	 * @generated
	 */
	int MANIFESTATION = 13;

	/**
	 * The number of structural features of the '<em>Manifestation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFESTATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.InterpretedManifestationImpl <em>Interpreted Manifestation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.InterpretedManifestationImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getInterpretedManifestation()
	 * @generated
	 */
	int INTERPRETED_MANIFESTATION = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETED_MANIFESTATION__TYPE = MANIFESTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manifested EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT = MANIFESTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interpreted Manifestation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPRETED_MANIFESTATION_FEATURE_COUNT = MANIFESTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.UninterpretedManifestationImpl <em>Uninterpreted Manifestation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.UninterpretedManifestationImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getUninterpretedManifestation()
	 * @generated
	 */
	int UNINTERPRETED_MANIFESTATION = 15;

	/**
	 * The feature id for the '<em><b>Source EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTERPRETED_MANIFESTATION__SOURCE_EOBJECT = MANIFESTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uninterpreted Manifestation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNINTERPRETED_MANIFESTATION_FEATURE_COUNT = MANIFESTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.PrimitiveManifestationImpl <em>Primitive Manifestation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.PrimitiveManifestationImpl
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getPrimitiveManifestation()
	 * @generated
	 */
	int PRIMITIVE_MANIFESTATION = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_MANIFESTATION__VALUE = MANIFESTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Manifestation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_MANIFESTATION_FEATURE_COUNT = MANIFESTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState <em>Cluster State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getClusterState()
	 * @generated
	 */
	int CLUSTER_STATE = 17;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel <em>Logic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
	 * @generated
	 */
	EClass getLogicModel();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel#getLogicModelId <em>Logic Model Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic Model Id</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel#getLogicModelId()
	 * @see #getLogicModel()
	 * @generated
	 */
	EAttribute getLogicModel_LogicModelId();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clusters</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel#getClusters()
	 * @see #getLogicModel()
	 * @generated
	 */
	EReference getLogicModel_Clusters();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable#getId()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Id();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable#getCluster()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Cluster();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint <em>Unary Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint
	 * @generated
	 */
	EClass getUnaryConstraint();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UnaryConstraint#getVariable()
	 * @see #getUnaryConstraint()
	 * @generated
	 */
	EReference getUnaryConstraint_Variable();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint <em>Binary Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint
	 * @generated
	 */
	EClass getBinaryConstraint();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint#getLeft()
	 * @see #getBinaryConstraint()
	 * @generated
	 */
	EReference getBinaryConstraint_Left();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.BinaryConstraint#getRight()
	 * @see #getBinaryConstraint()
	 * @generated
	 */
	EReference getBinaryConstraint_Right();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint <em>EClass Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint
	 * @generated
	 */
	EClass getEClassConstraint();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint#getTargetEClass <em>Target EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target EClass</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EClassConstraint#getTargetEClass()
	 * @see #getEClassConstraint()
	 * @generated
	 */
	EReference getEClassConstraint_TargetEClass();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint <em>Java Class Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Class Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint
	 * @generated
	 */
	EClass getJavaClassConstraint();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.JavaClassConstraint#getTargetClass()
	 * @see #getJavaClassConstraint()
	 * @generated
	 */
	EAttribute getJavaClassConstraint_TargetClass();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint <em>Constant EObject Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant EObject Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint
	 * @generated
	 */
	EClass getConstantEObjectConstraint();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint#getValue()
	 * @see #getConstantEObjectConstraint()
	 * @generated
	 */
	EReference getConstantEObjectConstraint_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantEObjectConstraint#getValueType()
	 * @see #getConstantEObjectConstraint()
	 * @generated
	 */
	EReference getConstantEObjectConstraint_ValueType();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint <em>Constant Java Object Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Java Object Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint
	 * @generated
	 */
	EClass getConstantJavaObjectConstraint();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint#getValue()
	 * @see #getConstantJavaObjectConstraint()
	 * @generated
	 */
	EAttribute getConstantJavaObjectConstraint_Value();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ConstantJavaObjectConstraint#getValueType()
	 * @see #getConstantJavaObjectConstraint()
	 * @generated
	 */
	EAttribute getConstantJavaObjectConstraint_ValueType();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EquivalenceConstraint <em>Equivalence Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalence Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EquivalenceConstraint
	 * @generated
	 */
	EClass getEquivalenceConstraint();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint <em>Relation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Constraint</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint
	 * @generated
	 */
	EClass getRelationConstraint();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint#getTargetRelation <em>Target Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Relation</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.RelationConstraint#getTargetRelation()
	 * @see #getRelationConstraint()
	 * @generated
	 */
	EReference getRelationConstraint_TargetRelation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster#getId()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_Id();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster#getState()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_State();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster#getManifestation <em>Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manifestation</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Cluster#getManifestation()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Manifestation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace <em>Manifestation Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifestation Trace</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace
	 * @generated
	 */
	EClass getManifestationTrace();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getTraceModelId <em>Trace Model Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Model Id</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getTraceModelId()
	 * @see #getManifestationTrace()
	 * @generated
	 */
	EAttribute getManifestationTrace_TraceModelId();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getLogicModel <em>Logic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logic Model</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getLogicModel()
	 * @see #getManifestationTrace()
	 * @generated
	 */
	EReference getManifestationTrace_LogicModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ManifestationTrace#getResults()
	 * @see #getManifestationTrace()
	 * @generated
	 */
	EReference getManifestationTrace_Results();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation <em>Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manifestation</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Manifestation
	 * @generated
	 */
	EClass getManifestation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation <em>Interpreted Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpreted Manifestation</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation
	 * @generated
	 */
	EClass getInterpretedManifestation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation#getType()
	 * @see #getInterpretedManifestation()
	 * @generated
	 */
	EReference getInterpretedManifestation_Type();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation#getManifestedEObject <em>Manifested EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manifested EObject</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation#getManifestedEObject()
	 * @see #getInterpretedManifestation()
	 * @generated
	 */
	EReference getInterpretedManifestation_ManifestedEObject();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation <em>Uninterpreted Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uninterpreted Manifestation</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation
	 * @generated
	 */
	EClass getUninterpretedManifestation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation#getSourceEObject <em>Source EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source EObject</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation#getSourceEObject()
	 * @see #getUninterpretedManifestation()
	 * @generated
	 */
	EReference getUninterpretedManifestation_SourceEObject();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation <em>Primitive Manifestation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Manifestation</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation
	 * @generated
	 */
	EClass getPrimitiveManifestation();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation#getValue()
	 * @see #getPrimitiveManifestation()
	 * @generated
	 */
	EAttribute getPrimitiveManifestation_Value();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState <em>Cluster State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cluster State</em>'.
	 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState
	 * @generated
	 */
	EEnum getClusterState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicModelFactory getLogicModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelImpl <em>Logic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getLogicModel()
		 * @generated
		 */
		EClass LOGIC_MODEL = eINSTANCE.getLogicModel();

		/**
		 * The meta object literal for the '<em><b>Logic Model Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIC_MODEL__LOGIC_MODEL_ID = eINSTANCE.getLogicModel_LogicModelId();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_MODEL__CLUSTERS = eINSTANCE.getLogicModel_Clusters();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.VariableImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ID = eINSTANCE.getVariable_Id();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CLUSTER = eINSTANCE.getVariable_Cluster();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.UnaryConstraintImpl <em>Unary Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.UnaryConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getUnaryConstraint()
		 * @generated
		 */
		EClass UNARY_CONSTRAINT = eINSTANCE.getUnaryConstraint();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_CONSTRAINT__VARIABLE = eINSTANCE.getUnaryConstraint_Variable();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.BinaryConstraintImpl <em>Binary Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.BinaryConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getBinaryConstraint()
		 * @generated
		 */
		EClass BINARY_CONSTRAINT = eINSTANCE.getBinaryConstraint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONSTRAINT__LEFT = eINSTANCE.getBinaryConstraint_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONSTRAINT__RIGHT = eINSTANCE.getBinaryConstraint_Right();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EClassConstraintImpl <em>EClass Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EClassConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getEClassConstraint()
		 * @generated
		 */
		EClass ECLASS_CONSTRAINT = eINSTANCE.getEClassConstraint();

		/**
		 * The meta object literal for the '<em><b>Target EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS_CONSTRAINT__TARGET_ECLASS = eINSTANCE.getEClassConstraint_TargetEClass();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.JavaClassConstraintImpl <em>Java Class Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.JavaClassConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getJavaClassConstraint()
		 * @generated
		 */
		EClass JAVA_CLASS_CONSTRAINT = eINSTANCE.getJavaClassConstraint();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_CLASS_CONSTRAINT__TARGET_CLASS = eINSTANCE.getJavaClassConstraint_TargetClass();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstantEObjectConstraintImpl <em>Constant EObject Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstantEObjectConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getConstantEObjectConstraint()
		 * @generated
		 */
		EClass CONSTANT_EOBJECT_CONSTRAINT = eINSTANCE.getConstantEObjectConstraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_EOBJECT_CONSTRAINT__VALUE = eINSTANCE.getConstantEObjectConstraint_Value();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_EOBJECT_CONSTRAINT__VALUE_TYPE = eINSTANCE.getConstantEObjectConstraint_ValueType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstantJavaObjectConstraintImpl <em>Constant Java Object Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ConstantJavaObjectConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getConstantJavaObjectConstraint()
		 * @generated
		 */
		EClass CONSTANT_JAVA_OBJECT_CONSTRAINT = eINSTANCE.getConstantJavaObjectConstraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_JAVA_OBJECT_CONSTRAINT__VALUE = eINSTANCE.getConstantJavaObjectConstraint_Value();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_JAVA_OBJECT_CONSTRAINT__VALUE_TYPE = eINSTANCE.getConstantJavaObjectConstraint_ValueType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EquivalenceConstraintImpl <em>Equivalence Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.EquivalenceConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getEquivalenceConstraint()
		 * @generated
		 */
		EClass EQUIVALENCE_CONSTRAINT = eINSTANCE.getEquivalenceConstraint();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.RelationConstraintImpl <em>Relation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.RelationConstraintImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getRelationConstraint()
		 * @generated
		 */
		EClass RELATION_CONSTRAINT = eINSTANCE.getRelationConstraint();

		/**
		 * The meta object literal for the '<em><b>Target Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CONSTRAINT__TARGET_RELATION = eINSTANCE.getRelationConstraint_TargetRelation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ClusterImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__ID = eINSTANCE.getCluster_Id();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__STATE = eINSTANCE.getCluster_State();

		/**
		 * The meta object literal for the '<em><b>Manifestation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__MANIFESTATION = eINSTANCE.getCluster_Manifestation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationTraceImpl <em>Manifestation Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationTraceImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getManifestationTrace()
		 * @generated
		 */
		EClass MANIFESTATION_TRACE = eINSTANCE.getManifestationTrace();

		/**
		 * The meta object literal for the '<em><b>Trace Model Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFESTATION_TRACE__TRACE_MODEL_ID = eINSTANCE.getManifestationTrace_TraceModelId();

		/**
		 * The meta object literal for the '<em><b>Logic Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFESTATION_TRACE__LOGIC_MODEL = eINSTANCE.getManifestationTrace_LogicModel();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANIFESTATION_TRACE__RESULTS = eINSTANCE.getManifestationTrace_Results();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationImpl <em>Manifestation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.ManifestationImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getManifestation()
		 * @generated
		 */
		EClass MANIFESTATION = eINSTANCE.getManifestation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.InterpretedManifestationImpl <em>Interpreted Manifestation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.InterpretedManifestationImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getInterpretedManifestation()
		 * @generated
		 */
		EClass INTERPRETED_MANIFESTATION = eINSTANCE.getInterpretedManifestation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETED_MANIFESTATION__TYPE = eINSTANCE.getInterpretedManifestation_Type();

		/**
		 * The meta object literal for the '<em><b>Manifested EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPRETED_MANIFESTATION__MANIFESTED_EOBJECT = eINSTANCE.getInterpretedManifestation_ManifestedEObject();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.UninterpretedManifestationImpl <em>Uninterpreted Manifestation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.UninterpretedManifestationImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getUninterpretedManifestation()
		 * @generated
		 */
		EClass UNINTERPRETED_MANIFESTATION = eINSTANCE.getUninterpretedManifestation();

		/**
		 * The meta object literal for the '<em><b>Source EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNINTERPRETED_MANIFESTATION__SOURCE_EOBJECT = eINSTANCE.getUninterpretedManifestation_SourceEObject();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.PrimitiveManifestationImpl <em>Primitive Manifestation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.PrimitiveManifestationImpl
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getPrimitiveManifestation()
		 * @generated
		 */
		EClass PRIMITIVE_MANIFESTATION = eINSTANCE.getPrimitiveManifestation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_MANIFESTATION__VALUE = eINSTANCE.getPrimitiveManifestation_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState <em>Cluster State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.ClusterState
		 * @see hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.impl.LogicModelPackageImpl#getClusterState()
		 * @generated
		 */
		EEnum CLUSTER_STATE = eINSTANCE.getClusterState();

	}

} //LogicModelPackage
