/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory
 * @model kind="package"
 * @generated
 */
public interface StochasticPetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stochasticpetrinet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/hu.bme.mit.inf.viewmodel.benchmarks.models/model/stochasticpetrinet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stochasticpetrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StochasticPetriNetPackage eINSTANCE = hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.PetriNetImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NODES = 0;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.NodeImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PETRI_NET = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.TransitionImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PETRI_NET = NODE__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ARCS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.PlaceImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PETRI_NET = NODE__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKENS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.ArcImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PLACE = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__KIND = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.TimedTransitionImpl <em>Timed Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.TimedTransitionImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getTimedTransition()
	 * @generated
	 */
	int TIMED_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__PETRI_NET = TRANSITION__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION__ARCS = TRANSITION__ARCS;

	/**
	 * The number of structural features of the '<em>Timed Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timed Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.ImmediateTransitionImpl <em>Immediate Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.ImmediateTransitionImpl
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getImmediateTransition()
	 * @generated
	 */
	int IMMEDIATE_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION__PETRI_NET = TRANSITION__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION__ARCS = TRANSITION__ARCS;

	/**
	 * The number of structural features of the '<em>Immediate Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Immediate Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMEDIATE_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind <em>Arc Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getArcKind()
	 * @generated
	 */
	int ARC_KIND = 7;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet#getNodes()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Nodes();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition#getArcs()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Arcs();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Tokens();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc#getTransition()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Transition();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc#getPlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Place();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc#getKind()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Kind();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.TimedTransition <em>Timed Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Transition</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.TimedTransition
	 * @generated
	 */
	EClass getTimedTransition();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ImmediateTransition <em>Immediate Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immediate Transition</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ImmediateTransition
	 * @generated
	 */
	EClass getImmediateTransition();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the container reference '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Petri Net</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Node#getPetriNet()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_PetriNet();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind <em>Arc Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arc Kind</em>'.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind
	 * @generated
	 */
	EEnum getArcKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StochasticPetriNetFactory getStochasticPetriNetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.PetriNetImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__NODES = eINSTANCE.getPetriNet_Nodes();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.TransitionImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ARCS = eINSTANCE.getTransition_Arcs();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.PlaceImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.ArcImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TRANSITION = eINSTANCE.getArc_Transition();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PLACE = eINSTANCE.getArc_Place();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__KIND = eINSTANCE.getArc_Kind();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.TimedTransitionImpl <em>Timed Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.TimedTransitionImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getTimedTransition()
		 * @generated
		 */
		EClass TIMED_TRANSITION = eINSTANCE.getTimedTransition();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.ImmediateTransitionImpl <em>Immediate Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.ImmediateTransitionImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getImmediateTransition()
		 * @generated
		 */
		EClass IMMEDIATE_TRANSITION = eINSTANCE.getImmediateTransition();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.NodeImpl
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PETRI_NET = eINSTANCE.getNode_PetriNet();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind <em>Arc Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind
		 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.impl.StochasticPetriNetPackageImpl#getArcKind()
		 * @generated
		 */
		EEnum ARC_KIND = eINSTANCE.getArcKind();

	}

} //StochasticPetriNetPackage
