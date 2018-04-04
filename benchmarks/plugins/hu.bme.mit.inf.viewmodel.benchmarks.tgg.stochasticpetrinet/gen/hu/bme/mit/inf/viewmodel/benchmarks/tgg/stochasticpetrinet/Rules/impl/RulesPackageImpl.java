/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.impl.StochasticpetrinetPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass railwayContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semaphoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredSensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredEntrySemaphoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorMonitorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackElementConnectsToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredExitSemaphoreEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RailwayPackage.eINSTANCE.eClass();
		StochasticPetriNetPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StochasticpetrinetPackageImpl theStochasticpetrinetPackage = (StochasticpetrinetPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StochasticpetrinetPackage.eNS_URI) instanceof StochasticpetrinetPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(StochasticpetrinetPackage.eNS_URI)
						: StochasticpetrinetPackage.eINSTANCE);

		// Load packages
		theStochasticpetrinetPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theStochasticpetrinetPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoute() {
		if (routeEClass == null) {
			routeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(0);
		}
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__IsAppropriate_FWD__Match_RailwayContainer_Route() {
		return getRoute().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__Perform_FWD__IsApplicableMatch() {
		return getRoute().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__IsApplicable_FWD__Match() {
		return getRoute().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__RegisterObjectsToMatch_FWD__Match_RailwayContainer_Route() {
		return getRoute().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__IsAppropriate_solveCsp_FWD__Match_RailwayContainer_Route() {
		return getRoute().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__IsAppropriate_checkCsp_FWD__CSP() {
		return getRoute().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__IsApplicable_solveCsp_FWD__IsApplicableMatch_RailwayContainer_RailwayContainerToPetriNet_PetriNet_Route() {
		return getRoute().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__IsApplicable_checkCsp_FWD__CSP() {
		return getRoute().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getRoute().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__CheckTypes_FWD__Match() {
		return getRoute().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getRoute().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__CheckAttributes_FWD__TripleMatch() {
		return getRoute().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__IsApplicable_CC__Match_Match() {
		return getRoute().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoute__CheckDEC_FWD__RailwayContainer_Route() {
		return getRoute().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		if (regionEClass == null) {
			regionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(1);
		}
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsAppropriate_FWD__Match_Region_RailwayContainer() {
		return getRegion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__Perform_FWD__IsApplicableMatch() {
		return getRegion().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsApplicable_FWD__Match() {
		return getRegion().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__RegisterObjectsToMatch_FWD__Match_Region_RailwayContainer() {
		return getRegion().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsAppropriate_solveCsp_FWD__Match_Region_RailwayContainer() {
		return getRegion().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsAppropriate_checkCsp_FWD__CSP() {
		return getRegion().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsApplicable_solveCsp_FWD__IsApplicableMatch_Region_RailwayContainer() {
		return getRegion().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsApplicable_checkCsp_FWD__CSP() {
		return getRegion().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getRegion().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__CheckTypes_FWD__Match() {
		return getRegion().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsAppropriate_FWD_EMoflonEdge_14__EMoflonEdge() {
		return getRegion().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__CheckAttributes_FWD__TripleMatch() {
		return getRegion().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsApplicable_CC__Match_Match() {
		return getRegion().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__CheckDEC_FWD__Region_RailwayContainer() {
		return getRegion().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		if (switchEClass == null) {
			switchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(2);
		}
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__IsAppropriate_FWD__Match_Switch_RailwayContainer_Region() {
		return getSwitch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__Perform_FWD__IsApplicableMatch() {
		return getSwitch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__IsApplicable_FWD__Match() {
		return getSwitch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__RegisterObjectsToMatch_FWD__Match_Switch_RailwayContainer_Region() {
		return getSwitch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__IsAppropriate_solveCsp_FWD__Match_Switch_RailwayContainer_Region() {
		return getSwitch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__IsAppropriate_checkCsp_FWD__CSP() {
		return getSwitch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__IsApplicable_solveCsp_FWD__IsApplicableMatch_PetriNet_RailwayContainerToPetriNet_Switch_RailwayContainer_Region() {
		return getSwitch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__IsApplicable_checkCsp_FWD__CSP() {
		return getSwitch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSwitch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__CheckTypes_FWD__Match() {
		return getSwitch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__IsAppropriate_FWD_EMoflonEdge_15__EMoflonEdge() {
		return getSwitch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__CheckAttributes_FWD__TripleMatch() {
		return getSwitch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__IsApplicable_CC__Match_Match() {
		return getSwitch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitch__CheckDEC_FWD__Switch_RailwayContainer_Region() {
		return getSwitch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRailwayContainer() {
		if (railwayContainerEClass == null) {
			railwayContainerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return railwayContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__IsAppropriate_FWD__Match_RailwayContainer() {
		return getRailwayContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__Perform_FWD__IsApplicableMatch() {
		return getRailwayContainer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__IsApplicable_FWD__Match() {
		return getRailwayContainer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__RegisterObjectsToMatch_FWD__Match_RailwayContainer() {
		return getRailwayContainer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__IsAppropriate_solveCsp_FWD__Match_RailwayContainer() {
		return getRailwayContainer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__IsAppropriate_checkCsp_FWD__CSP() {
		return getRailwayContainer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__IsApplicable_solveCsp_FWD__IsApplicableMatch_RailwayContainer() {
		return getRailwayContainer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__IsApplicable_checkCsp_FWD__CSP() {
		return getRailwayContainer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getRailwayContainer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__CheckTypes_FWD__Match() {
		return getRailwayContainer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__IsAppropriate_FWD_RailwayContainer_1__RailwayContainer() {
		return getRailwayContainer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__CheckAttributes_FWD__TripleMatch() {
		return getRailwayContainer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__IsApplicable_CC__Match_Match() {
		return getRailwayContainer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRailwayContainer__CheckDEC_FWD__RailwayContainer() {
		return getRailwayContainer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchPosition() {
		if (switchPositionEClass == null) {
			switchPositionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return switchPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__IsAppropriate_FWD__Match_SwitchPosition_Switch() {
		return getSwitchPosition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__Perform_FWD__IsApplicableMatch() {
		return getSwitchPosition().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__IsApplicable_FWD__Match() {
		return getSwitchPosition().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__RegisterObjectsToMatch_FWD__Match_SwitchPosition_Switch() {
		return getSwitchPosition().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__IsAppropriate_solveCsp_FWD__Match_SwitchPosition_Switch() {
		return getSwitchPosition().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__IsAppropriate_checkCsp_FWD__CSP() {
		return getSwitchPosition().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__IsApplicable_solveCsp_FWD__IsApplicableMatch_SwitchPosition_Switch() {
		return getSwitchPosition().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__IsApplicable_checkCsp_FWD__CSP() {
		return getSwitchPosition().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getSwitchPosition().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__CheckTypes_FWD__Match() {
		return getSwitchPosition().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__IsAppropriate_FWD_EMoflonEdge_16__EMoflonEdge() {
		return getSwitchPosition().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__CheckAttributes_FWD__TripleMatch() {
		return getSwitchPosition().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__IsApplicable_CC__Match_Match() {
		return getSwitchPosition().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSwitchPosition__CheckDEC_FWD__SwitchPosition_Switch() {
		return getSwitchPosition().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemaphore() {
		if (semaphoreEClass == null) {
			semaphoreEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(5);
		}
		return semaphoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__IsAppropriate_FWD__Match_Region_Semaphore_RailwayContainer_Segment() {
		return getSemaphore().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__Perform_FWD__IsApplicableMatch() {
		return getSemaphore().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__IsApplicable_FWD__Match() {
		return getSemaphore().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__RegisterObjectsToMatch_FWD__Match_Region_Semaphore_RailwayContainer_Segment() {
		return getSemaphore().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__IsAppropriate_solveCsp_FWD__Match_Region_Semaphore_RailwayContainer_Segment() {
		return getSemaphore().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__IsAppropriate_checkCsp_FWD__CSP() {
		return getSemaphore().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__IsApplicable_solveCsp_FWD__IsApplicableMatch_Region_Semaphore_RailwayContainerToPetriNet_RailwayContainer_Segment_PetriNet() {
		return getSemaphore().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__IsApplicable_checkCsp_FWD__CSP() {
		return getSemaphore().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSemaphore().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__CheckTypes_FWD__Match() {
		return getSemaphore().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__IsAppropriate_FWD_EMoflonEdge_17__EMoflonEdge() {
		return getSemaphore().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__CheckAttributes_FWD__TripleMatch() {
		return getSemaphore().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__IsApplicable_CC__Match_Match() {
		return getSemaphore().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSemaphore__CheckDEC_FWD__Region_Semaphore_RailwayContainer_Segment() {
		return getSemaphore().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		if (sensorEClass == null) {
			sensorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(6);
		}
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsAppropriate_FWD__Match_Sensor_Region_RailwayContainer() {
		return getSensor().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__Perform_FWD__IsApplicableMatch() {
		return getSensor().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsApplicable_FWD__Match() {
		return getSensor().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__RegisterObjectsToMatch_FWD__Match_Sensor_Region_RailwayContainer() {
		return getSensor().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsAppropriate_solveCsp_FWD__Match_Sensor_Region_RailwayContainer() {
		return getSensor().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsAppropriate_checkCsp_FWD__CSP() {
		return getSensor().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsApplicable_solveCsp_FWD__IsApplicableMatch_RailwayContainerToPetriNet_Sensor_Region_PetriNet_RailwayContainer() {
		return getSensor().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsApplicable_checkCsp_FWD__CSP() {
		return getSensor().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSensor().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__CheckTypes_FWD__Match() {
		return getSensor().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsAppropriate_FWD_EMoflonEdge_18__EMoflonEdge() {
		return getSensor().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__CheckAttributes_FWD__TripleMatch() {
		return getSensor().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsApplicable_CC__Match_Match() {
		return getSensor().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__CheckDEC_FWD__Sensor_Region_RailwayContainer() {
		return getSensor().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredSwitch() {
		if (requiredSwitchEClass == null) {
			requiredSwitchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return requiredSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__IsAppropriate_FWD__Match_SwitchPosition_RailwayContainer_Route_Switch() {
		return getRequiredSwitch().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__Perform_FWD__IsApplicableMatch() {
		return getRequiredSwitch().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__IsApplicable_FWD__Match() {
		return getRequiredSwitch().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__RegisterObjectsToMatch_FWD__Match_SwitchPosition_RailwayContainer_Route_Switch() {
		return getRequiredSwitch().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__IsAppropriate_solveCsp_FWD__Match_SwitchPosition_RailwayContainer_Route_Switch() {
		return getRequiredSwitch().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__IsAppropriate_checkCsp_FWD__CSP() {
		return getRequiredSwitch().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__IsApplicable_solveCsp_FWD__IsApplicableMatch_PetriNet_Place_Place_Place_SwitchToOperational_RouteToRepair_RailwayContainerToPetriNet_SwitchToFailed_Place_RouteToFailed_RouteToOperational_SwitchPosition_RailwayContainer_Route_Transition_Switch() {
		return getRequiredSwitch().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__IsApplicable_checkCsp_FWD__CSP() {
		return getRequiredSwitch().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getRequiredSwitch().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__CheckTypes_FWD__Match() {
		return getRequiredSwitch().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__IsAppropriate_FWD_EMoflonEdge_19__EMoflonEdge() {
		return getRequiredSwitch().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__CheckAttributes_FWD__TripleMatch() {
		return getRequiredSwitch().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__IsApplicable_CC__Match_Match() {
		return getRequiredSwitch().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSwitch__CheckDEC_FWD__SwitchPosition_RailwayContainer_Route_Switch() {
		return getRequiredSwitch().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredSensor() {
		if (requiredSensorEClass == null) {
			requiredSensorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return requiredSensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__IsAppropriate_FWD__Match_Sensor_Route_RailwayContainer() {
		return getRequiredSensor().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__Perform_FWD__IsApplicableMatch() {
		return getRequiredSensor().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__IsApplicable_FWD__Match() {
		return getRequiredSensor().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__RegisterObjectsToMatch_FWD__Match_Sensor_Route_RailwayContainer() {
		return getRequiredSensor().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__IsAppropriate_solveCsp_FWD__Match_Sensor_Route_RailwayContainer() {
		return getRequiredSensor().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__IsAppropriate_checkCsp_FWD__CSP() {
		return getRequiredSensor().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__IsApplicable_solveCsp_FWD__IsApplicableMatch_PetriNet_Place_Place_RouteToFailed_RouteToRepair_SensorToFailed_Sensor_Route_SensorToOperational_Place_RailwayContainerToPetriNet_RouteToOperational_Transition_RailwayContainer_Place() {
		return getRequiredSensor().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__IsApplicable_checkCsp_FWD__CSP() {
		return getRequiredSensor().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getRequiredSensor().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__CheckTypes_FWD__Match() {
		return getRequiredSensor().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__IsAppropriate_FWD_EMoflonEdge_20__EMoflonEdge() {
		return getRequiredSensor().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__CheckAttributes_FWD__TripleMatch() {
		return getRequiredSensor().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__IsApplicable_CC__Match_Match() {
		return getRequiredSensor().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredSensor__CheckDEC_FWD__Sensor_Route_RailwayContainer() {
		return getRequiredSensor().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegment() {
		if (segmentEClass == null) {
			segmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI).getEClassifiers()
					.get(9);
		}
		return segmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__IsAppropriate_FWD__Match_Segment_Region() {
		return getSegment().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__Perform_FWD__IsApplicableMatch() {
		return getSegment().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__IsApplicable_FWD__Match() {
		return getSegment().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__RegisterObjectsToMatch_FWD__Match_Segment_Region() {
		return getSegment().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__IsAppropriate_solveCsp_FWD__Match_Segment_Region() {
		return getSegment().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__IsAppropriate_checkCsp_FWD__CSP() {
		return getSegment().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__IsApplicable_solveCsp_FWD__IsApplicableMatch_Segment_Region() {
		return getSegment().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__IsApplicable_checkCsp_FWD__CSP() {
		return getSegment().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getSegment().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__CheckTypes_FWD__Match() {
		return getSegment().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__IsAppropriate_FWD_EMoflonEdge_21__EMoflonEdge() {
		return getSegment().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__CheckAttributes_FWD__TripleMatch() {
		return getSegment().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__IsApplicable_CC__Match_Match() {
		return getSegment().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSegment__CheckDEC_FWD__Segment_Region() {
		return getSegment().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredEntrySemaphore() {
		if (requiredEntrySemaphoreEClass == null) {
			requiredEntrySemaphoreEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return requiredEntrySemaphoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__IsAppropriate_FWD__Match_RailwayContainer_Semaphore_Route() {
		return getRequiredEntrySemaphore().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__Perform_FWD__IsApplicableMatch() {
		return getRequiredEntrySemaphore().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__IsApplicable_FWD__Match() {
		return getRequiredEntrySemaphore().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__RegisterObjectsToMatch_FWD__Match_RailwayContainer_Semaphore_Route() {
		return getRequiredEntrySemaphore().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__IsAppropriate_solveCsp_FWD__Match_RailwayContainer_Semaphore_Route() {
		return getRequiredEntrySemaphore().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__IsAppropriate_checkCsp_FWD__CSP() {
		return getRequiredEntrySemaphore().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__IsApplicable_solveCsp_FWD__IsApplicableMatch_RouteToRepair_PetriNet_RouteToOperational_RouteToFailed_RailwayContainer_Transition_Place_SemaphoreToOperational_Place_SemaphoreToFailed_RailwayContainerToPetriNet_Place_Semaphore_Route_Place() {
		return getRequiredEntrySemaphore().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__IsApplicable_checkCsp_FWD__CSP() {
		return getRequiredEntrySemaphore().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getRequiredEntrySemaphore().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__CheckTypes_FWD__Match() {
		return getRequiredEntrySemaphore().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__IsAppropriate_FWD_EMoflonEdge_22__EMoflonEdge() {
		return getRequiredEntrySemaphore().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__CheckAttributes_FWD__TripleMatch() {
		return getRequiredEntrySemaphore().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__IsApplicable_CC__Match_Match() {
		return getRequiredEntrySemaphore().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredEntrySemaphore__CheckDEC_FWD__RailwayContainer_Semaphore_Route() {
		return getRequiredEntrySemaphore().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorMonitors() {
		if (sensorMonitorsEClass == null) {
			sensorMonitorsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return sensorMonitorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__IsAppropriate_FWD__Match_TrackElement_Sensor() {
		return getSensorMonitors().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__Perform_FWD__IsApplicableMatch() {
		return getSensorMonitors().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__IsApplicable_FWD__Match() {
		return getSensorMonitors().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__RegisterObjectsToMatch_FWD__Match_TrackElement_Sensor() {
		return getSensorMonitors().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__IsAppropriate_solveCsp_FWD__Match_TrackElement_Sensor() {
		return getSensorMonitors().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__IsAppropriate_checkCsp_FWD__CSP() {
		return getSensorMonitors().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__IsApplicable_solveCsp_FWD__IsApplicableMatch_TrackElement_Sensor() {
		return getSensorMonitors().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__IsApplicable_checkCsp_FWD__CSP() {
		return getSensorMonitors().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getSensorMonitors().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__CheckTypes_FWD__Match() {
		return getSensorMonitors().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__IsAppropriate_FWD_EMoflonEdge_23__EMoflonEdge() {
		return getSensorMonitors().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__CheckAttributes_FWD__TripleMatch() {
		return getSensorMonitors().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__IsApplicable_CC__Match_Match() {
		return getSensorMonitors().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorMonitors__CheckDEC_FWD__TrackElement_Sensor() {
		return getSensorMonitors().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrackElementConnectsTo() {
		if (trackElementConnectsToEClass == null) {
			trackElementConnectsToEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return trackElementConnectsToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__IsAppropriate_FWD__Match_TrackElement_TrackElement() {
		return getTrackElementConnectsTo().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__Perform_FWD__IsApplicableMatch() {
		return getTrackElementConnectsTo().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__IsApplicable_FWD__Match() {
		return getTrackElementConnectsTo().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__RegisterObjectsToMatch_FWD__Match_TrackElement_TrackElement() {
		return getTrackElementConnectsTo().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__IsAppropriate_solveCsp_FWD__Match_TrackElement_TrackElement() {
		return getTrackElementConnectsTo().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__IsAppropriate_checkCsp_FWD__CSP() {
		return getTrackElementConnectsTo().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__IsApplicable_solveCsp_FWD__IsApplicableMatch_TrackElement_TrackElement() {
		return getTrackElementConnectsTo().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__IsApplicable_checkCsp_FWD__CSP() {
		return getTrackElementConnectsTo().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__RegisterObjects_FWD__PerformRuleResult_EObject_EObject() {
		return getTrackElementConnectsTo().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__CheckTypes_FWD__Match() {
		return getTrackElementConnectsTo().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__IsAppropriate_FWD_EMoflonEdge_24__EMoflonEdge() {
		return getTrackElementConnectsTo().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__CheckAttributes_FWD__TripleMatch() {
		return getTrackElementConnectsTo().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__IsApplicable_CC__Match_Match() {
		return getTrackElementConnectsTo().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrackElementConnectsTo__CheckDEC_FWD__TrackElement_TrackElement() {
		return getTrackElementConnectsTo().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredExitSemaphore() {
		if (requiredExitSemaphoreEClass == null) {
			requiredExitSemaphoreEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(13);
		}
		return requiredExitSemaphoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__IsAppropriate_FWD__Match_Semaphore_Route_RailwayContainer() {
		return getRequiredExitSemaphore().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__Perform_FWD__IsApplicableMatch() {
		return getRequiredExitSemaphore().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__IsApplicable_FWD__Match() {
		return getRequiredExitSemaphore().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__RegisterObjectsToMatch_FWD__Match_Semaphore_Route_RailwayContainer() {
		return getRequiredExitSemaphore().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__IsAppropriate_solveCsp_FWD__Match_Semaphore_Route_RailwayContainer() {
		return getRequiredExitSemaphore().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__IsAppropriate_checkCsp_FWD__CSP() {
		return getRequiredExitSemaphore().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__IsApplicable_solveCsp_FWD__IsApplicableMatch_RailwayContainerToPetriNet_RouteToOperational_RouteToFailed_Place_Transition_Semaphore_Place_Place_SemaphoreToFailed_RouteToRepair_SemaphoreToOperational_Place_Route_PetriNet_RailwayContainer() {
		return getRequiredExitSemaphore().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__IsApplicable_checkCsp_FWD__CSP() {
		return getRequiredExitSemaphore().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getRequiredExitSemaphore().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__CheckTypes_FWD__Match() {
		return getRequiredExitSemaphore().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__IsAppropriate_FWD_EMoflonEdge_25__EMoflonEdge() {
		return getRequiredExitSemaphore().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__CheckAttributes_FWD__TripleMatch() {
		return getRequiredExitSemaphore().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__IsApplicable_CC__Match_Match() {
		return getRequiredExitSemaphore().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequiredExitSemaphore__CheckDEC_FWD__Semaphore_Route_RailwayContainer() {
		return getRequiredExitSemaphore().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName(
					"hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
