/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.runtime.AbstractRule;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.TripleMatch;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage#getRequiredSwitch()
 * @model
 * @generated
 */
public interface RequiredSwitch extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, Route srcRoute, RailwayContainer srcContainer,
			SwitchPosition srcSwitchPosition, Switch srcSwitch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, Route srcRoute, RailwayContainer srcContainer,
			SwitchPosition srcSwitchPosition, Switch srcSwitch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, Route srcRoute, RailwayContainer srcContainer,
			SwitchPosition srcSwitchPosition, Switch srcSwitch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Transition trgRouteRepair, Route srcRoute,
			Place trgRouteOperational, SwitchToFailed switchFailedCorr, RouteToRepair routeRepairCorr,
			SwitchToOperational switchOperationalCorr, Place trgSwitchOperational, RouteToFailed routeFailedCorr,
			RouteToOperational routeOperationalCorr, Place trgRouteFailed, RailwayContainer srcContainer,
			Place trgSwitchFailed, SwitchPosition srcSwitchPosition, RailwayContainerToPetriNet containerCorr,
			PetriNet trgPetrinet, Switch srcSwitch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgRouteRepair, EObject srcRoute,
			EObject trgRouteOperational, EObject trgSwitchFailedToRouteFail, EObject switchFailedCorr,
			EObject routeRepairCorr, EObject switchOperationalCorr, EObject trgSwitchOperational,
			EObject routeFailedCorr, EObject routeOperationalCorr, EObject trgRouteFailToRouteFailed,
			EObject trgRouteOperationalToRouteFail, EObject trgRouteFailed, EObject trgRouteFailToSwitchFailed,
			EObject trgSwitchOperationalToRouteRepair, EObject srcContainer, EObject trgSwitchFailed,
			EObject trgRouteRepairToSwitchOperational, EObject srcSwitchPosition, EObject containerCorr,
			EObject trgPetrinet, EObject srcSwitch, EObject trgRouteFail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_47(EMoflonEdge _edge_follows);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_FWD(Route srcRoute, RailwayContainer srcContainer, SwitchPosition srcSwitchPosition,
			Switch srcSwitch);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // RequiredSwitch
