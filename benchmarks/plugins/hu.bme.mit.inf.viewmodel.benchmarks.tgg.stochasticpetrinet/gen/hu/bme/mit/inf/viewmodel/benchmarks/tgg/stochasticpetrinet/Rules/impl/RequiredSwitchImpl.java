/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ImmediateTransition;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Transition;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSwitch;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SwitchToOperational;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RequiredSwitchImpl extends AbstractRuleImpl implements RequiredSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getRequiredSwitch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute,
			RailwayContainer srcContainer) {

		Object[] result1_black = RequiredSwitchImpl.pattern_RequiredSwitch_0_1_initialbindings_blackBBBBBB(this, match,
				srcSwitch, srcSwitchPosition, srcRoute, srcContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[srcSwitch] = " + srcSwitch + ", " + "[srcSwitchPosition] = " + srcSwitchPosition
							+ ", " + "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ".");
		}

		Object[] result2_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, srcSwitch, srcSwitchPosition,
						srcRoute, srcContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[srcSwitch] = " + srcSwitch + ", " + "[srcSwitchPosition] = " + srcSwitchPosition
							+ ", " + "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RequiredSwitchImpl.pattern_RequiredSwitch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RequiredSwitchImpl
					.pattern_RequiredSwitch_0_4_collectelementstobetranslated_blackBBBBB(match, srcSwitch,
							srcSwitchPosition, srcRoute, srcContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSwitch] = " + srcSwitch + ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", "
						+ "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ".");
			}
			RequiredSwitchImpl.pattern_RequiredSwitch_0_4_collectelementstobetranslated_greenBBBFF(match,
					srcSwitchPosition, srcRoute);
			//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result4_green[4];

			Object[] result5_black = RequiredSwitchImpl.pattern_RequiredSwitch_0_5_collectcontextelements_blackBBBBB(
					match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSwitch] = " + srcSwitch + ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", "
						+ "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ".");
			}
			RequiredSwitchImpl.pattern_RequiredSwitch_0_5_collectcontextelements_greenBBBBBFFF(match, srcSwitch,
					srcSwitchPosition, srcRoute, srcContainer);
			//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result5_green[7];

			// 
			RequiredSwitchImpl.pattern_RequiredSwitch_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					srcSwitch, srcSwitchPosition, srcRoute, srcContainer);
			return RequiredSwitchImpl.pattern_RequiredSwitch_0_7_expressionF();
		} else {
			return RequiredSwitchImpl.pattern_RequiredSwitch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Switch srcSwitch = (Switch) result1_bindingAndBlack[0];
		Place trgRouteOperational = (Place) result1_bindingAndBlack[1];
		SwitchToOperational switchOperationalCorr = (SwitchToOperational) result1_bindingAndBlack[2];
		SwitchPosition srcSwitchPosition = (SwitchPosition) result1_bindingAndBlack[3];
		Place trgSwitchOperational = (Place) result1_bindingAndBlack[4];
		SwitchToFailed switchFailedCorr = (SwitchToFailed) result1_bindingAndBlack[5];
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_bindingAndBlack[6];
		Route srcRoute = (Route) result1_bindingAndBlack[7];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[8];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[9];
		Transition trgRouteRepair = (Transition) result1_bindingAndBlack[10];
		Place trgRouteFailed = (Place) result1_bindingAndBlack[11];
		Place trgSwitchFailed = (Place) result1_bindingAndBlack[12];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_bindingAndBlack[13];
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_bindingAndBlack[14];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[15];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[16];
		Object[] result1_green = RequiredSwitchImpl.pattern_RequiredSwitch_1_1_performtransformation_greenFBFBFBBFBFFBF(
				trgRouteOperational, trgSwitchOperational, trgRouteRepair, trgRouteFailed, trgSwitchFailed,
				trgPetrinet);
		Arc trgRouteRepairToSwitchOperational = (Arc) result1_green[0];
		ImmediateTransition trgRouteFail = (ImmediateTransition) result1_green[2];
		Arc trgSwitchFailedToRouteFail = (Arc) result1_green[4];
		Arc trgRouteFailToSwitchFailed = (Arc) result1_green[7];
		Arc trgSwitchOperationalToRouteRepair = (Arc) result1_green[9];
		Arc trgRouteOperationalToRouteFail = (Arc) result1_green[10];
		Arc trgRouteFailToRouteFailed = (Arc) result1_green[12];

		Object[] result2_black = RequiredSwitchImpl.pattern_RequiredSwitch_1_2_collecttranslatedelements_blackBBBBBBB(
				trgRouteRepairToSwitchOperational, trgRouteFail, trgSwitchFailedToRouteFail, trgRouteFailToSwitchFailed,
				trgSwitchOperationalToRouteRepair, trgRouteOperationalToRouteFail, trgRouteFailToRouteFailed);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: "
					+ "[trgRouteRepairToSwitchOperational] = " + trgRouteRepairToSwitchOperational + ", "
					+ "[trgRouteFail] = " + trgRouteFail + ", " + "[trgSwitchFailedToRouteFail] = "
					+ trgSwitchFailedToRouteFail + ", " + "[trgRouteFailToSwitchFailed] = " + trgRouteFailToSwitchFailed
					+ ", " + "[trgSwitchOperationalToRouteRepair] = " + trgSwitchOperationalToRouteRepair + ", "
					+ "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail + ", "
					+ "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ".");
		}
		Object[] result2_green = RequiredSwitchImpl.pattern_RequiredSwitch_1_2_collecttranslatedelements_greenFBBBBBBB(
				trgRouteRepairToSwitchOperational, trgRouteFail, trgSwitchFailedToRouteFail, trgRouteFailToSwitchFailed,
				trgSwitchOperationalToRouteRepair, trgRouteOperationalToRouteFail, trgRouteFailToRouteFailed);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RequiredSwitchImpl
				.pattern_RequiredSwitch_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBBB(ruleresult, srcSwitch,
						trgRouteRepairToSwitchOperational, trgRouteOperational, trgRouteFail, switchOperationalCorr,
						srcSwitchPosition, trgSwitchOperational, switchFailedCorr, routeOperationalCorr, srcRoute,
						srcContainer, trgSwitchFailedToRouteFail, containerCorr, trgRouteRepair, trgRouteFailed,
						trgRouteFailToSwitchFailed, trgSwitchFailed, trgSwitchOperationalToRouteRepair, routeFailedCorr,
						trgRouteOperationalToRouteFail, routeRepairCorr, trgPetrinet, trgRouteFailToRouteFailed);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[srcSwitch] = " + srcSwitch + ", " + "[trgRouteRepairToSwitchOperational] = "
					+ trgRouteRepairToSwitchOperational + ", " + "[trgRouteOperational] = " + trgRouteOperational + ", "
					+ "[trgRouteFail] = " + trgRouteFail + ", " + "[switchOperationalCorr] = " + switchOperationalCorr
					+ ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", " + "[trgSwitchOperational] = "
					+ trgSwitchOperational + ", " + "[switchFailedCorr] = " + switchFailedCorr + ", "
					+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[srcRoute] = " + srcRoute + ", "
					+ "[srcContainer] = " + srcContainer + ", " + "[trgSwitchFailedToRouteFail] = "
					+ trgSwitchFailedToRouteFail + ", " + "[containerCorr] = " + containerCorr + ", "
					+ "[trgRouteRepair] = " + trgRouteRepair + ", " + "[trgRouteFailed] = " + trgRouteFailed + ", "
					+ "[trgRouteFailToSwitchFailed] = " + trgRouteFailToSwitchFailed + ", " + "[trgSwitchFailed] = "
					+ trgSwitchFailed + ", " + "[trgSwitchOperationalToRouteRepair] = "
					+ trgSwitchOperationalToRouteRepair + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", "
					+ "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail + ", "
					+ "[routeRepairCorr] = " + routeRepairCorr + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
					+ "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ".");
		}
		RequiredSwitchImpl.pattern_RequiredSwitch_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
				ruleresult, trgRouteRepairToSwitchOperational, trgRouteOperational, trgRouteFail, srcSwitchPosition,
				trgSwitchOperational, srcRoute, trgSwitchFailedToRouteFail, trgRouteRepair, trgRouteFailed,
				trgRouteFailToSwitchFailed, trgSwitchFailed, trgSwitchOperationalToRouteRepair,
				trgRouteOperationalToRouteFail, trgPetrinet, trgRouteFailToRouteFailed);
		//nothing EMoflonEdge trgRouteRepairToSwitchOperational__trgSwitchOperational____place = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgRouteRepairToSwitchOperational__trgRouteRepair____transition = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgRouteRepair__trgRouteRepairToSwitchOperational____arcs = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgSwitchFailedToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgRouteFail__trgSwitchFailedToRouteFail____arcs = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgSwitchFailedToRouteFail__trgSwitchFailed____place = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgRouteFailToSwitchFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToSwitchFailed____arcs = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgSwitchOperationalToRouteRepair__trgRouteRepair____transition = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgRouteFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgPetrinet__trgRouteFail____nodes = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgSwitchOperationalToRouteRepair__trgSwitchOperational____place = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgRouteFailToSwitchFailed__trgSwitchFailed____place = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[36];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = (EMoflonEdge) result3_green[37];

		// 
		// 
		RequiredSwitchImpl.pattern_RequiredSwitch_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBBB(this,
				ruleresult, srcSwitch, trgRouteRepairToSwitchOperational, trgRouteOperational, trgRouteFail,
				switchOperationalCorr, srcSwitchPosition, trgSwitchOperational, switchFailedCorr, routeOperationalCorr,
				srcRoute, srcContainer, trgSwitchFailedToRouteFail, containerCorr, trgRouteRepair, trgRouteFailed,
				trgRouteFailToSwitchFailed, trgSwitchFailed, trgSwitchOperationalToRouteRepair, routeFailedCorr,
				trgRouteOperationalToRouteFail, routeRepairCorr, trgPetrinet, trgRouteFailToRouteFailed);
		return RequiredSwitchImpl.pattern_RequiredSwitch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = RequiredSwitchImpl
				.pattern_RequiredSwitch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = RequiredSwitchImpl.pattern_RequiredSwitch_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Switch srcSwitch = (Switch) result2_binding[0];
		SwitchPosition srcSwitchPosition = (SwitchPosition) result2_binding[1];
		Route srcRoute = (Route) result2_binding[2];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[3];
		for (Object[] result2_black : RequiredSwitchImpl.pattern_RequiredSwitch_2_2_corematch_blackBFFBFFFBBFFFFFFFB(
				srcSwitch, srcSwitchPosition, srcRoute, srcContainer, match)) {
			Place trgRouteOperational = (Place) result2_black[1];
			SwitchToOperational switchOperationalCorr = (SwitchToOperational) result2_black[2];
			Place trgSwitchOperational = (Place) result2_black[4];
			SwitchToFailed switchFailedCorr = (SwitchToFailed) result2_black[5];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result2_black[6];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[9];
			Transition trgRouteRepair = (Transition) result2_black[10];
			Place trgRouteFailed = (Place) result2_black[11];
			Place trgSwitchFailed = (Place) result2_black[12];
			RouteToFailed routeFailedCorr = (RouteToFailed) result2_black[13];
			RouteToRepair routeRepairCorr = (RouteToRepair) result2_black[14];
			PetriNet trgPetrinet = (PetriNet) result2_black[15];
			// ForEach 
			for (Object[] result3_black : RequiredSwitchImpl
					.pattern_RequiredSwitch_2_3_findcontext_blackBBBBBBBBBBBBBBBB(srcSwitch, trgRouteOperational,
							switchOperationalCorr, srcSwitchPosition, trgSwitchOperational, switchFailedCorr,
							routeOperationalCorr, srcRoute, srcContainer, containerCorr, trgRouteRepair, trgRouteFailed,
							trgSwitchFailed, routeFailedCorr, routeRepairCorr, trgPetrinet)) {
				Object[] result3_green = RequiredSwitchImpl
						.pattern_RequiredSwitch_2_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(srcSwitch,
								trgRouteOperational, switchOperationalCorr, srcSwitchPosition, trgSwitchOperational,
								switchFailedCorr, routeOperationalCorr, srcRoute, srcContainer, containerCorr,
								trgRouteRepair, trgRouteFailed, trgSwitchFailed, routeFailedCorr, routeRepairCorr,
								trgPetrinet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[16];
				//nothing EMoflonEdge switchOperationalCorr__srcSwitch____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge switchFailedCorr__srcSwitch____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge routeOperationalCorr__trgRouteOperational____target = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge switchFailedCorr__trgSwitchFailed____target = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge routeFailedCorr__trgRouteFailed____target = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge routeRepairCorr__trgRouteRepair____target = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[32];
				//nothing EMoflonEdge switchOperationalCorr__trgSwitchOperational____target = (EMoflonEdge) result3_green[33];

				Object[] result4_bindingAndBlack = RequiredSwitchImpl
						.pattern_RequiredSwitch_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(this, isApplicableMatch,
								srcSwitch, trgRouteOperational, switchOperationalCorr, srcSwitchPosition,
								trgSwitchOperational, switchFailedCorr, routeOperationalCorr, srcRoute, srcContainer,
								containerCorr, trgRouteRepair, trgRouteFailed, trgSwitchFailed, routeFailedCorr,
								routeRepairCorr, trgPetrinet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[srcSwitch] = " + srcSwitch + ", "
							+ "[trgRouteOperational] = " + trgRouteOperational + ", " + "[switchOperationalCorr] = "
							+ switchOperationalCorr + ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", "
							+ "[trgSwitchOperational] = " + trgSwitchOperational + ", " + "[switchFailedCorr] = "
							+ switchFailedCorr + ", " + "[routeOperationalCorr] = " + routeOperationalCorr + ", "
							+ "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ", "
							+ "[containerCorr] = " + containerCorr + ", " + "[trgRouteRepair] = " + trgRouteRepair
							+ ", " + "[trgRouteFailed] = " + trgRouteFailed + ", " + "[trgSwitchFailed] = "
							+ trgSwitchFailed + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", "
							+ "[routeRepairCorr] = " + routeRepairCorr + ", " + "[trgPetrinet] = " + trgPetrinet + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (RequiredSwitchImpl.pattern_RequiredSwitch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = RequiredSwitchImpl
							.pattern_RequiredSwitch_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					RequiredSwitchImpl.pattern_RequiredSwitch_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return RequiredSwitchImpl.pattern_RequiredSwitch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Switch srcSwitch, SwitchPosition srcSwitchPosition,
			Route srcRoute, RailwayContainer srcContainer) {
		match.registerObject("srcSwitch", srcSwitch);
		match.registerObject("srcSwitchPosition", srcSwitchPosition);
		match.registerObject("srcRoute", srcRoute);
		match.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Switch srcSwitch, SwitchPosition srcSwitchPosition,
			Route srcRoute, RailwayContainer srcContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Switch srcSwitch,
			Place trgRouteOperational, SwitchToOperational switchOperationalCorr, SwitchPosition srcSwitchPosition,
			Place trgSwitchOperational, SwitchToFailed switchFailedCorr, RouteToOperational routeOperationalCorr,
			Route srcRoute, RailwayContainer srcContainer, RailwayContainerToPetriNet containerCorr,
			Transition trgRouteRepair, Place trgRouteFailed, Place trgSwitchFailed, RouteToFailed routeFailedCorr,
			RouteToRepair routeRepairCorr, PetriNet trgPetrinet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcSwitch", srcSwitch);
		isApplicableMatch.registerObject("trgRouteOperational", trgRouteOperational);
		isApplicableMatch.registerObject("switchOperationalCorr", switchOperationalCorr);
		isApplicableMatch.registerObject("srcSwitchPosition", srcSwitchPosition);
		isApplicableMatch.registerObject("trgSwitchOperational", trgSwitchOperational);
		isApplicableMatch.registerObject("switchFailedCorr", switchFailedCorr);
		isApplicableMatch.registerObject("routeOperationalCorr", routeOperationalCorr);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("trgRouteRepair", trgRouteRepair);
		isApplicableMatch.registerObject("trgRouteFailed", trgRouteFailed);
		isApplicableMatch.registerObject("trgSwitchFailed", trgSwitchFailed);
		isApplicableMatch.registerObject("routeFailedCorr", routeFailedCorr);
		isApplicableMatch.registerObject("routeRepairCorr", routeRepairCorr);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcSwitch,
			EObject trgRouteRepairToSwitchOperational, EObject trgRouteOperational, EObject trgRouteFail,
			EObject switchOperationalCorr, EObject srcSwitchPosition, EObject trgSwitchOperational,
			EObject switchFailedCorr, EObject routeOperationalCorr, EObject srcRoute, EObject srcContainer,
			EObject trgSwitchFailedToRouteFail, EObject containerCorr, EObject trgRouteRepair, EObject trgRouteFailed,
			EObject trgRouteFailToSwitchFailed, EObject trgSwitchFailed, EObject trgSwitchOperationalToRouteRepair,
			EObject routeFailedCorr, EObject trgRouteOperationalToRouteFail, EObject routeRepairCorr,
			EObject trgPetrinet, EObject trgRouteFailToRouteFailed) {
		ruleresult.registerObject("srcSwitch", srcSwitch);
		ruleresult.registerObject("trgRouteRepairToSwitchOperational", trgRouteRepairToSwitchOperational);
		ruleresult.registerObject("trgRouteOperational", trgRouteOperational);
		ruleresult.registerObject("trgRouteFail", trgRouteFail);
		ruleresult.registerObject("switchOperationalCorr", switchOperationalCorr);
		ruleresult.registerObject("srcSwitchPosition", srcSwitchPosition);
		ruleresult.registerObject("trgSwitchOperational", trgSwitchOperational);
		ruleresult.registerObject("switchFailedCorr", switchFailedCorr);
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgSwitchFailedToRouteFail", trgSwitchFailedToRouteFail);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("trgRouteRepair", trgRouteRepair);
		ruleresult.registerObject("trgRouteFailed", trgRouteFailed);
		ruleresult.registerObject("trgRouteFailToSwitchFailed", trgRouteFailToSwitchFailed);
		ruleresult.registerObject("trgSwitchFailed", trgSwitchFailed);
		ruleresult.registerObject("trgSwitchOperationalToRouteRepair", trgSwitchOperationalToRouteRepair);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("trgRouteOperationalToRouteFail", trgRouteOperationalToRouteFail);
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgRouteFailToRouteFailed", trgRouteFailToRouteFailed);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_206(EMoflonEdge _edge_follows) {

		Object[] result1_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = RequiredSwitchImpl.pattern_RequiredSwitch_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : RequiredSwitchImpl
				.pattern_RequiredSwitch_10_2_testcorematchandDECs_blackFFFFB(_edge_follows)) {
			Switch srcSwitch = (Switch) result2_black[0];
			SwitchPosition srcSwitchPosition = (SwitchPosition) result2_black[1];
			Route srcRoute = (Route) result2_black[2];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[3];
			Object[] result2_green = RequiredSwitchImpl
					.pattern_RequiredSwitch_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RequiredSwitchImpl
					.pattern_RequiredSwitch_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer)) {
				// 
				if (RequiredSwitchImpl
						.pattern_RequiredSwitch_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = RequiredSwitchImpl
							.pattern_RequiredSwitch_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					RequiredSwitchImpl.pattern_RequiredSwitch_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return RequiredSwitchImpl.pattern_RequiredSwitch_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("RequiredSwitch");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("trgRouteRepairToSwitchOperational", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSwitchFailedToRouteFail", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToSwitchFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSwitchOperationalToRouteRepair", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteOperationalToRouteFail", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToRouteFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute,
			RailwayContainer srcContainer) {// 
		Object[] result1_black = RequiredSwitchImpl.pattern_RequiredSwitch_13_1_matchtggpattern_blackBBBB(srcSwitch,
				srcSwitchPosition, srcRoute, srcContainer);
		if (result1_black != null) {
			return RequiredSwitchImpl.pattern_RequiredSwitch_13_2_expressionF();
		} else {
			return RequiredSwitchImpl.pattern_RequiredSwitch_13_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_FWD__MATCH_SWITCH_SWITCHPOSITION_ROUTE_RAILWAYCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (Switch) arguments.get(1),
					(SwitchPosition) arguments.get(2), (Route) arguments.get(3), (RailwayContainer) arguments.get(4));
		case RulesPackage.REQUIRED_SWITCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SWITCH_SWITCHPOSITION_ROUTE_RAILWAYCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Switch) arguments.get(1),
					(SwitchPosition) arguments.get(2), (Route) arguments.get(3), (RailwayContainer) arguments.get(4));
			return null;
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SWITCH_SWITCHPOSITION_ROUTE_RAILWAYCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Switch) arguments.get(1),
					(SwitchPosition) arguments.get(2), (Route) arguments.get(3), (RailwayContainer) arguments.get(4));
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SWITCH_PLACE_SWITCHTOOPERATIONAL_SWITCHPOSITION_PLACE_SWITCHTOFAILED_ROUTETOOPERATIONAL_ROUTE_RAILWAYCONTAINER_RAILWAYCONTAINERTOPETRINET_TRANSITION_PLACE_PLACE_ROUTETOFAILED_ROUTETOREPAIR_PETRINET:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Switch) arguments.get(1),
					(Place) arguments.get(2), (SwitchToOperational) arguments.get(3), (SwitchPosition) arguments.get(4),
					(Place) arguments.get(5), (SwitchToFailed) arguments.get(6), (RouteToOperational) arguments.get(7),
					(Route) arguments.get(8), (RailwayContainer) arguments.get(9),
					(RailwayContainerToPetriNet) arguments.get(10), (Transition) arguments.get(11),
					(Place) arguments.get(12), (Place) arguments.get(13), (RouteToFailed) arguments.get(14),
					(RouteToRepair) arguments.get(15), (PetriNet) arguments.get(16));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18), (EObject) arguments.get(19),
					(EObject) arguments.get(20), (EObject) arguments.get(21), (EObject) arguments.get(22),
					(EObject) arguments.get(23));
			return null;
		case RulesPackage.REQUIRED_SWITCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_206__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_206((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQUIRED_SWITCH___CHECK_DEC_FWD__SWITCH_SWITCHPOSITION_ROUTE_RAILWAYCONTAINER:
			return checkDEC_FWD((Switch) arguments.get(0), (SwitchPosition) arguments.get(1), (Route) arguments.get(2),
					(RailwayContainer) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RequiredSwitch_0_1_initialbindings_blackBBBBBB(RequiredSwitch _this,
			Match match, Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute,
			RailwayContainer srcContainer) {
		return new Object[] { _this, match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer };
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_bindingFBBBBBB(RequiredSwitch _this, Match match,
			Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute, RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSwitch, srcSwitchPosition, srcRoute,
				srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_bindingAndBlackFBBBBBB(RequiredSwitch _this,
			Match match, Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute,
			RailwayContainer srcContainer) {
		Object[] result_pattern_RequiredSwitch_0_2_SolveCSP_binding = pattern_RequiredSwitch_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer);
		if (result_pattern_RequiredSwitch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSwitch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RequiredSwitch_0_2_SolveCSP_black = pattern_RequiredSwitch_0_2_SolveCSP_blackB(csp);
			if (result_pattern_RequiredSwitch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSwitch_0_3_CheckCSP_expressionFBB(RequiredSwitch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute, RailwayContainer srcContainer) {
		return new Object[] { match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer };
	}

	public static final Object[] pattern_RequiredSwitch_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			SwitchPosition srcSwitchPosition, Route srcRoute) {
		EMoflonEdge srcRoute__srcSwitchPosition____follows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcRoute____route = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRoute__srcSwitchPosition____follows_name_prime = "follows";
		String srcSwitchPosition__srcRoute____route_name_prime = "route";
		srcRoute__srcSwitchPosition____follows.setSrc(srcRoute);
		srcRoute__srcSwitchPosition____follows.setTrg(srcSwitchPosition);
		match.getToBeTranslatedEdges().add(srcRoute__srcSwitchPosition____follows);
		srcSwitchPosition__srcRoute____route.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcRoute____route.setTrg(srcRoute);
		match.getToBeTranslatedEdges().add(srcSwitchPosition__srcRoute____route);
		srcRoute__srcSwitchPosition____follows.setName(srcRoute__srcSwitchPosition____follows_name_prime);
		srcSwitchPosition__srcRoute____route.setName(srcSwitchPosition__srcRoute____route_name_prime);
		return new Object[] { match, srcSwitchPosition, srcRoute, srcRoute__srcSwitchPosition____follows,
				srcSwitchPosition__srcRoute____route };
	}

	public static final Object[] pattern_RequiredSwitch_0_5_collectcontextelements_blackBBBBB(Match match,
			Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute, RailwayContainer srcContainer) {
		return new Object[] { match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer };
	}

	public static final Object[] pattern_RequiredSwitch_0_5_collectcontextelements_greenBBBBBFFF(Match match,
			Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute, RailwayContainer srcContainer) {
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcSwitch);
		match.getContextNodes().add(srcSwitchPosition);
		match.getContextNodes().add(srcRoute);
		match.getContextNodes().add(srcContainer);
		String srcSwitchPosition__srcSwitch____target_name_prime = "target";
		String srcSwitch__srcSwitchPosition____positions_name_prime = "positions";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		srcSwitchPosition__srcSwitch____target.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcSwitch____target.setTrg(srcSwitch);
		match.getContextEdges().add(srcSwitchPosition__srcSwitch____target);
		srcSwitch__srcSwitchPosition____positions.setSrc(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setTrg(srcSwitchPosition);
		match.getContextEdges().add(srcSwitch__srcSwitchPosition____positions);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		match.getContextEdges().add(srcContainer__srcRoute____routes);
		srcSwitchPosition__srcSwitch____target.setName(srcSwitchPosition__srcSwitch____target_name_prime);
		srcSwitch__srcSwitchPosition____positions.setName(srcSwitch__srcSwitchPosition____positions_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer,
				srcSwitchPosition__srcSwitch____target, srcSwitch__srcSwitchPosition____positions,
				srcContainer__srcRoute____routes };
	}

	public static final void pattern_RequiredSwitch_0_6_registerobjectstomatch_expressionBBBBBB(RequiredSwitch _this,
			Match match, Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute,
			RailwayContainer srcContainer) {
		_this.registerObjectsToMatch_FWD(match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer);

	}

	public static final boolean pattern_RequiredSwitch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredSwitch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_bindingFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcSwitch");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgRouteOperational");
		EObject _localVariable_2 = isApplicableMatch.getObject("switchOperationalCorr");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcSwitchPosition");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgSwitchOperational");
		EObject _localVariable_5 = isApplicableMatch.getObject("switchFailedCorr");
		EObject _localVariable_6 = isApplicableMatch.getObject("routeOperationalCorr");
		EObject _localVariable_7 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_8 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_9 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_10 = isApplicableMatch.getObject("trgRouteRepair");
		EObject _localVariable_11 = isApplicableMatch.getObject("trgRouteFailed");
		EObject _localVariable_12 = isApplicableMatch.getObject("trgSwitchFailed");
		EObject _localVariable_13 = isApplicableMatch.getObject("routeFailedCorr");
		EObject _localVariable_14 = isApplicableMatch.getObject("routeRepairCorr");
		EObject _localVariable_15 = isApplicableMatch.getObject("trgPetrinet");
		EObject tmpSrcSwitch = _localVariable_0;
		EObject tmpTrgRouteOperational = _localVariable_1;
		EObject tmpSwitchOperationalCorr = _localVariable_2;
		EObject tmpSrcSwitchPosition = _localVariable_3;
		EObject tmpTrgSwitchOperational = _localVariable_4;
		EObject tmpSwitchFailedCorr = _localVariable_5;
		EObject tmpRouteOperationalCorr = _localVariable_6;
		EObject tmpSrcRoute = _localVariable_7;
		EObject tmpSrcContainer = _localVariable_8;
		EObject tmpContainerCorr = _localVariable_9;
		EObject tmpTrgRouteRepair = _localVariable_10;
		EObject tmpTrgRouteFailed = _localVariable_11;
		EObject tmpTrgSwitchFailed = _localVariable_12;
		EObject tmpRouteFailedCorr = _localVariable_13;
		EObject tmpRouteRepairCorr = _localVariable_14;
		EObject tmpTrgPetrinet = _localVariable_15;
		if (tmpSrcSwitch instanceof Switch) {
			Switch srcSwitch = (Switch) tmpSrcSwitch;
			if (tmpTrgRouteOperational instanceof Place) {
				Place trgRouteOperational = (Place) tmpTrgRouteOperational;
				if (tmpSwitchOperationalCorr instanceof SwitchToOperational) {
					SwitchToOperational switchOperationalCorr = (SwitchToOperational) tmpSwitchOperationalCorr;
					if (tmpSrcSwitchPosition instanceof SwitchPosition) {
						SwitchPosition srcSwitchPosition = (SwitchPosition) tmpSrcSwitchPosition;
						if (tmpTrgSwitchOperational instanceof Place) {
							Place trgSwitchOperational = (Place) tmpTrgSwitchOperational;
							if (tmpSwitchFailedCorr instanceof SwitchToFailed) {
								SwitchToFailed switchFailedCorr = (SwitchToFailed) tmpSwitchFailedCorr;
								if (tmpRouteOperationalCorr instanceof RouteToOperational) {
									RouteToOperational routeOperationalCorr = (RouteToOperational) tmpRouteOperationalCorr;
									if (tmpSrcRoute instanceof Route) {
										Route srcRoute = (Route) tmpSrcRoute;
										if (tmpSrcContainer instanceof RailwayContainer) {
											RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
											if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
												RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
												if (tmpTrgRouteRepair instanceof Transition) {
													Transition trgRouteRepair = (Transition) tmpTrgRouteRepair;
													if (tmpTrgRouteFailed instanceof Place) {
														Place trgRouteFailed = (Place) tmpTrgRouteFailed;
														if (tmpTrgSwitchFailed instanceof Place) {
															Place trgSwitchFailed = (Place) tmpTrgSwitchFailed;
															if (tmpRouteFailedCorr instanceof RouteToFailed) {
																RouteToFailed routeFailedCorr = (RouteToFailed) tmpRouteFailedCorr;
																if (tmpRouteRepairCorr instanceof RouteToRepair) {
																	RouteToRepair routeRepairCorr = (RouteToRepair) tmpRouteRepairCorr;
																	if (tmpTrgPetrinet instanceof PetriNet) {
																		PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
																		return new Object[] { srcSwitch,
																				trgRouteOperational,
																				switchOperationalCorr,
																				srcSwitchPosition, trgSwitchOperational,
																				switchFailedCorr, routeOperationalCorr,
																				srcRoute, srcContainer, containerCorr,
																				trgRouteRepair, trgRouteFailed,
																				trgSwitchFailed, routeFailedCorr,
																				routeRepairCorr, trgPetrinet,
																				isApplicableMatch };
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
			Switch srcSwitch, Place trgRouteOperational, SwitchToOperational switchOperationalCorr,
			SwitchPosition srcSwitchPosition, Place trgSwitchOperational, SwitchToFailed switchFailedCorr,
			RouteToOperational routeOperationalCorr, Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr, Transition trgRouteRepair, Place trgRouteFailed,
			Place trgSwitchFailed, RouteToFailed routeFailedCorr, RouteToRepair routeRepairCorr, PetriNet trgPetrinet,
			RequiredSwitch _this, IsApplicableMatch isApplicableMatch) {
		if (!trgRouteOperational.equals(trgSwitchOperational)) {
			if (!trgRouteOperational.equals(trgSwitchFailed)) {
				if (!trgRouteFailed.equals(trgRouteOperational)) {
					if (!trgRouteFailed.equals(trgSwitchOperational)) {
						if (!trgRouteFailed.equals(trgSwitchFailed)) {
							if (!trgSwitchFailed.equals(trgSwitchOperational)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { srcSwitch, trgRouteOperational, switchOperationalCorr,
												srcSwitchPosition, trgSwitchOperational, switchFailedCorr,
												routeOperationalCorr, srcRoute, srcContainer, containerCorr,
												trgRouteRepair, trgRouteFailed, trgSwitchFailed, routeFailedCorr,
												routeRepairCorr, trgPetrinet, csp, _this, isApplicableMatch };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
			RequiredSwitch _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_RequiredSwitch_1_1_performtransformation_binding = pattern_RequiredSwitch_1_1_performtransformation_bindingFFFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_RequiredSwitch_1_1_performtransformation_binding != null) {
			Switch srcSwitch = (Switch) result_pattern_RequiredSwitch_1_1_performtransformation_binding[0];
			Place trgRouteOperational = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[1];
			SwitchToOperational switchOperationalCorr = (SwitchToOperational) result_pattern_RequiredSwitch_1_1_performtransformation_binding[2];
			SwitchPosition srcSwitchPosition = (SwitchPosition) result_pattern_RequiredSwitch_1_1_performtransformation_binding[3];
			Place trgSwitchOperational = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[4];
			SwitchToFailed switchFailedCorr = (SwitchToFailed) result_pattern_RequiredSwitch_1_1_performtransformation_binding[5];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result_pattern_RequiredSwitch_1_1_performtransformation_binding[6];
			Route srcRoute = (Route) result_pattern_RequiredSwitch_1_1_performtransformation_binding[7];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_RequiredSwitch_1_1_performtransformation_binding[8];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_RequiredSwitch_1_1_performtransformation_binding[9];
			Transition trgRouteRepair = (Transition) result_pattern_RequiredSwitch_1_1_performtransformation_binding[10];
			Place trgRouteFailed = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[11];
			Place trgSwitchFailed = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[12];
			RouteToFailed routeFailedCorr = (RouteToFailed) result_pattern_RequiredSwitch_1_1_performtransformation_binding[13];
			RouteToRepair routeRepairCorr = (RouteToRepair) result_pattern_RequiredSwitch_1_1_performtransformation_binding[14];
			PetriNet trgPetrinet = (PetriNet) result_pattern_RequiredSwitch_1_1_performtransformation_binding[15];

			Object[] result_pattern_RequiredSwitch_1_1_performtransformation_black = pattern_RequiredSwitch_1_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
					srcSwitch, trgRouteOperational, switchOperationalCorr, srcSwitchPosition, trgSwitchOperational,
					switchFailedCorr, routeOperationalCorr, srcRoute, srcContainer, containerCorr, trgRouteRepair,
					trgRouteFailed, trgSwitchFailed, routeFailedCorr, routeRepairCorr, trgPetrinet, _this,
					isApplicableMatch);
			if (result_pattern_RequiredSwitch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RequiredSwitch_1_1_performtransformation_black[16];

				return new Object[] { srcSwitch, trgRouteOperational, switchOperationalCorr, srcSwitchPosition,
						trgSwitchOperational, switchFailedCorr, routeOperationalCorr, srcRoute, srcContainer,
						containerCorr, trgRouteRepair, trgRouteFailed, trgSwitchFailed, routeFailedCorr,
						routeRepairCorr, trgPetrinet, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_greenFBFBFBBFBFFBF(
			Place trgRouteOperational, Place trgSwitchOperational, Transition trgRouteRepair, Place trgRouteFailed,
			Place trgSwitchFailed, PetriNet trgPetrinet) {
		Arc trgRouteRepairToSwitchOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		ImmediateTransition trgRouteFail = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		Arc trgSwitchFailedToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToSwitchFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSwitchOperationalToRouteRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteOperationalToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToRouteFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		ArcKind trgRouteRepairToSwitchOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgSwitchFailedToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteFailToSwitchFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgSwitchOperationalToRouteRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteOperationalToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteFailToRouteFailed_kind_prime = ArcKind.OUTPUT;
		trgRouteRepairToSwitchOperational.setPlace(trgSwitchOperational);
		trgRouteRepairToSwitchOperational.setTransition(trgRouteRepair);
		trgRouteFail.setPetriNet(trgPetrinet);
		trgSwitchFailedToRouteFail.setTransition(trgRouteFail);
		trgSwitchFailedToRouteFail.setPlace(trgSwitchFailed);
		trgRouteFailToSwitchFailed.setTransition(trgRouteFail);
		trgRouteFailToSwitchFailed.setPlace(trgSwitchFailed);
		trgSwitchOperationalToRouteRepair.setTransition(trgRouteRepair);
		trgSwitchOperationalToRouteRepair.setPlace(trgSwitchOperational);
		trgRouteOperationalToRouteFail.setTransition(trgRouteFail);
		trgRouteOperationalToRouteFail.setPlace(trgRouteOperational);
		trgRouteFailToRouteFailed.setPlace(trgRouteFailed);
		trgRouteFailToRouteFailed.setTransition(trgRouteFail);
		trgRouteRepairToSwitchOperational.setKind(trgRouteRepairToSwitchOperational_kind_prime);
		trgSwitchFailedToRouteFail.setKind(trgSwitchFailedToRouteFail_kind_prime);
		trgRouteFailToSwitchFailed.setKind(trgRouteFailToSwitchFailed_kind_prime);
		trgSwitchOperationalToRouteRepair.setKind(trgSwitchOperationalToRouteRepair_kind_prime);
		trgRouteOperationalToRouteFail.setKind(trgRouteOperationalToRouteFail_kind_prime);
		trgRouteFailToRouteFailed.setKind(trgRouteFailToRouteFailed_kind_prime);
		return new Object[] { trgRouteRepairToSwitchOperational, trgRouteOperational, trgRouteFail,
				trgSwitchOperational, trgSwitchFailedToRouteFail, trgRouteRepair, trgRouteFailed,
				trgRouteFailToSwitchFailed, trgSwitchFailed, trgSwitchOperationalToRouteRepair,
				trgRouteOperationalToRouteFail, trgPetrinet, trgRouteFailToRouteFailed };
	}

	public static final Object[] pattern_RequiredSwitch_1_2_collecttranslatedelements_blackBBBBBBB(
			Arc trgRouteRepairToSwitchOperational, ImmediateTransition trgRouteFail, Arc trgSwitchFailedToRouteFail,
			Arc trgRouteFailToSwitchFailed, Arc trgSwitchOperationalToRouteRepair, Arc trgRouteOperationalToRouteFail,
			Arc trgRouteFailToRouteFailed) {
		if (!trgRouteRepairToSwitchOperational.equals(trgSwitchFailedToRouteFail)) {
			if (!trgRouteRepairToSwitchOperational.equals(trgSwitchOperationalToRouteRepair)) {
				if (!trgSwitchFailedToRouteFail.equals(trgSwitchOperationalToRouteRepair)) {
					if (!trgRouteFailToSwitchFailed.equals(trgRouteRepairToSwitchOperational)) {
						if (!trgRouteFailToSwitchFailed.equals(trgSwitchFailedToRouteFail)) {
							if (!trgRouteFailToSwitchFailed.equals(trgSwitchOperationalToRouteRepair)) {
								if (!trgRouteFailToSwitchFailed.equals(trgRouteOperationalToRouteFail)) {
									if (!trgRouteOperationalToRouteFail.equals(trgRouteRepairToSwitchOperational)) {
										if (!trgRouteOperationalToRouteFail.equals(trgSwitchFailedToRouteFail)) {
											if (!trgRouteOperationalToRouteFail
													.equals(trgSwitchOperationalToRouteRepair)) {
												if (!trgRouteFailToRouteFailed
														.equals(trgRouteRepairToSwitchOperational)) {
													if (!trgRouteFailToRouteFailed.equals(trgSwitchFailedToRouteFail)) {
														if (!trgRouteFailToRouteFailed
																.equals(trgRouteFailToSwitchFailed)) {
															if (!trgRouteFailToRouteFailed
																	.equals(trgSwitchOperationalToRouteRepair)) {
																if (!trgRouteFailToRouteFailed
																		.equals(trgRouteOperationalToRouteFail)) {
																	return new Object[] {
																			trgRouteRepairToSwitchOperational,
																			trgRouteFail, trgSwitchFailedToRouteFail,
																			trgRouteFailToSwitchFailed,
																			trgSwitchOperationalToRouteRepair,
																			trgRouteOperationalToRouteFail,
																			trgRouteFailToRouteFailed };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_2_collecttranslatedelements_greenFBBBBBBB(
			Arc trgRouteRepairToSwitchOperational, ImmediateTransition trgRouteFail, Arc trgSwitchFailedToRouteFail,
			Arc trgRouteFailToSwitchFailed, Arc trgSwitchOperationalToRouteRepair, Arc trgRouteOperationalToRouteFail,
			Arc trgRouteFailToRouteFailed) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgRouteRepairToSwitchOperational);
		ruleresult.getCreatedElements().add(trgRouteFail);
		ruleresult.getCreatedElements().add(trgSwitchFailedToRouteFail);
		ruleresult.getCreatedElements().add(trgRouteFailToSwitchFailed);
		ruleresult.getCreatedElements().add(trgSwitchOperationalToRouteRepair);
		ruleresult.getCreatedElements().add(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedElements().add(trgRouteFailToRouteFailed);
		return new Object[] { ruleresult, trgRouteRepairToSwitchOperational, trgRouteFail, trgSwitchFailedToRouteFail,
				trgRouteFailToSwitchFailed, trgSwitchOperationalToRouteRepair, trgRouteOperationalToRouteFail,
				trgRouteFailToRouteFailed };
	}

	public static final Object[] pattern_RequiredSwitch_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcSwitch, EObject trgRouteRepairToSwitchOperational,
			EObject trgRouteOperational, EObject trgRouteFail, EObject switchOperationalCorr, EObject srcSwitchPosition,
			EObject trgSwitchOperational, EObject switchFailedCorr, EObject routeOperationalCorr, EObject srcRoute,
			EObject srcContainer, EObject trgSwitchFailedToRouteFail, EObject containerCorr, EObject trgRouteRepair,
			EObject trgRouteFailed, EObject trgRouteFailToSwitchFailed, EObject trgSwitchFailed,
			EObject trgSwitchOperationalToRouteRepair, EObject routeFailedCorr, EObject trgRouteOperationalToRouteFail,
			EObject routeRepairCorr, EObject trgPetrinet, EObject trgRouteFailToRouteFailed) {
		if (!srcSwitch.equals(trgRouteRepairToSwitchOperational)) {
			if (!srcSwitch.equals(trgRouteOperational)) {
				if (!srcSwitch.equals(trgRouteFail)) {
					if (!srcSwitch.equals(switchOperationalCorr)) {
						if (!srcSwitch.equals(srcSwitchPosition)) {
							if (!srcSwitch.equals(trgSwitchOperational)) {
								if (!srcSwitch.equals(switchFailedCorr)) {
									if (!srcSwitch.equals(trgSwitchFailedToRouteFail)) {
										if (!srcSwitch.equals(trgRouteRepair)) {
											if (!srcSwitch.equals(trgRouteFailed)) {
												if (!srcSwitch.equals(trgRouteFailToSwitchFailed)) {
													if (!srcSwitch.equals(trgSwitchFailed)) {
														if (!srcSwitch.equals(trgSwitchOperationalToRouteRepair)) {
															if (!srcSwitch.equals(trgRouteOperationalToRouteFail)) {
																if (!srcSwitch.equals(trgPetrinet)) {
																	if (!srcSwitch.equals(trgRouteFailToRouteFailed)) {
																		if (!trgRouteRepairToSwitchOperational
																				.equals(trgSwitchOperational)) {
																			if (!trgRouteRepairToSwitchOperational
																					.equals(trgSwitchFailedToRouteFail)) {
																				if (!trgRouteRepairToSwitchOperational
																						.equals(trgSwitchFailed)) {
																					if (!trgRouteRepairToSwitchOperational
																							.equals(trgSwitchOperationalToRouteRepair)) {
																						if (!trgRouteOperational.equals(
																								trgRouteRepairToSwitchOperational)) {
																							if (!trgRouteOperational
																									.equals(trgSwitchOperational)) {
																								if (!trgRouteOperational
																										.equals(trgSwitchFailedToRouteFail)) {
																									if (!trgRouteOperational
																											.equals(trgRouteRepair)) {
																										if (!trgRouteOperational
																												.equals(trgSwitchFailed)) {
																											if (!trgRouteOperational
																													.equals(trgSwitchOperationalToRouteRepair)) {
																												if (!trgRouteOperational
																														.equals(trgRouteOperationalToRouteFail)) {
																													if (!trgRouteFail
																															.equals(trgRouteRepairToSwitchOperational)) {
																														if (!trgRouteFail
																																.equals(trgRouteOperational)) {
																															if (!trgRouteFail
																																	.equals(trgSwitchOperational)) {
																																if (!trgRouteFail
																																		.equals(trgSwitchFailedToRouteFail)) {
																																	if (!trgRouteFail
																																			.equals(trgRouteRepair)) {
																																		if (!trgRouteFail
																																				.equals(trgRouteFailed)) {
																																			if (!trgRouteFail
																																					.equals(trgRouteFailToSwitchFailed)) {
																																				if (!trgRouteFail
																																						.equals(trgSwitchFailed)) {
																																					if (!trgRouteFail
																																							.equals(trgSwitchOperationalToRouteRepair)) {
																																						if (!trgRouteFail
																																								.equals(trgRouteOperationalToRouteFail)) {
																																							if (!trgRouteFail
																																									.equals(trgRouteFailToRouteFailed)) {
																																								if (!switchOperationalCorr
																																										.equals(trgRouteRepairToSwitchOperational)) {
																																									if (!switchOperationalCorr
																																											.equals(trgRouteOperational)) {
																																										if (!switchOperationalCorr
																																												.equals(trgRouteFail)) {
																																											if (!switchOperationalCorr
																																													.equals(trgSwitchOperational)) {
																																												if (!switchOperationalCorr
																																														.equals(trgSwitchFailedToRouteFail)) {
																																													if (!switchOperationalCorr
																																															.equals(trgRouteRepair)) {
																																														if (!switchOperationalCorr
																																																.equals(trgRouteFailed)) {
																																															if (!switchOperationalCorr
																																																	.equals(trgRouteFailToSwitchFailed)) {
																																																if (!switchOperationalCorr
																																																		.equals(trgSwitchFailed)) {
																																																	if (!switchOperationalCorr
																																																			.equals(trgSwitchOperationalToRouteRepair)) {
																																																		if (!switchOperationalCorr
																																																				.equals(trgRouteOperationalToRouteFail)) {
																																																			if (!switchOperationalCorr
																																																					.equals(trgPetrinet)) {
																																																				if (!switchOperationalCorr
																																																						.equals(trgRouteFailToRouteFailed)) {
																																																					if (!srcSwitchPosition
																																																							.equals(trgRouteRepairToSwitchOperational)) {
																																																						if (!srcSwitchPosition
																																																								.equals(trgRouteOperational)) {
																																																							if (!srcSwitchPosition
																																																									.equals(trgRouteFail)) {
																																																								if (!srcSwitchPosition
																																																										.equals(switchOperationalCorr)) {
																																																									if (!srcSwitchPosition
																																																											.equals(trgSwitchOperational)) {
																																																										if (!srcSwitchPosition
																																																												.equals(switchFailedCorr)) {
																																																											if (!srcSwitchPosition
																																																													.equals(trgSwitchFailedToRouteFail)) {
																																																												if (!srcSwitchPosition
																																																														.equals(trgRouteRepair)) {
																																																													if (!srcSwitchPosition
																																																															.equals(trgRouteFailed)) {
																																																														if (!srcSwitchPosition
																																																																.equals(trgRouteFailToSwitchFailed)) {
																																																															if (!srcSwitchPosition
																																																																	.equals(trgSwitchFailed)) {
																																																																if (!srcSwitchPosition
																																																																		.equals(trgSwitchOperationalToRouteRepair)) {
																																																																	if (!srcSwitchPosition
																																																																			.equals(trgRouteOperationalToRouteFail)) {
																																																																		if (!srcSwitchPosition
																																																																				.equals(trgPetrinet)) {
																																																																			if (!srcSwitchPosition
																																																																					.equals(trgRouteFailToRouteFailed)) {
																																																																				if (!trgSwitchOperational
																																																																						.equals(trgSwitchOperationalToRouteRepair)) {
																																																																					if (!switchFailedCorr
																																																																							.equals(trgRouteRepairToSwitchOperational)) {
																																																																						if (!switchFailedCorr
																																																																								.equals(trgRouteOperational)) {
																																																																							if (!switchFailedCorr
																																																																									.equals(trgRouteFail)) {
																																																																								if (!switchFailedCorr
																																																																										.equals(switchOperationalCorr)) {
																																																																									if (!switchFailedCorr
																																																																											.equals(trgSwitchOperational)) {
																																																																										if (!switchFailedCorr
																																																																												.equals(trgSwitchFailedToRouteFail)) {
																																																																											if (!switchFailedCorr
																																																																													.equals(trgRouteRepair)) {
																																																																												if (!switchFailedCorr
																																																																														.equals(trgRouteFailed)) {
																																																																													if (!switchFailedCorr
																																																																															.equals(trgRouteFailToSwitchFailed)) {
																																																																														if (!switchFailedCorr
																																																																																.equals(trgSwitchFailed)) {
																																																																															if (!switchFailedCorr
																																																																																	.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																if (!switchFailedCorr
																																																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																																																	if (!switchFailedCorr
																																																																																			.equals(trgPetrinet)) {
																																																																																		if (!switchFailedCorr
																																																																																				.equals(trgRouteFailToRouteFailed)) {
																																																																																			if (!routeOperationalCorr
																																																																																					.equals(srcSwitch)) {
																																																																																				if (!routeOperationalCorr
																																																																																						.equals(trgRouteRepairToSwitchOperational)) {
																																																																																					if (!routeOperationalCorr
																																																																																							.equals(trgRouteOperational)) {
																																																																																						if (!routeOperationalCorr
																																																																																								.equals(trgRouteFail)) {
																																																																																							if (!routeOperationalCorr
																																																																																									.equals(switchOperationalCorr)) {
																																																																																								if (!routeOperationalCorr
																																																																																										.equals(srcSwitchPosition)) {
																																																																																									if (!routeOperationalCorr
																																																																																											.equals(trgSwitchOperational)) {
																																																																																										if (!routeOperationalCorr
																																																																																												.equals(switchFailedCorr)) {
																																																																																											if (!routeOperationalCorr
																																																																																													.equals(srcRoute)) {
																																																																																												if (!routeOperationalCorr
																																																																																														.equals(srcContainer)) {
																																																																																													if (!routeOperationalCorr
																																																																																															.equals(trgSwitchFailedToRouteFail)) {
																																																																																														if (!routeOperationalCorr
																																																																																																.equals(trgRouteRepair)) {
																																																																																															if (!routeOperationalCorr
																																																																																																	.equals(trgRouteFailed)) {
																																																																																																if (!routeOperationalCorr
																																																																																																		.equals(trgRouteFailToSwitchFailed)) {
																																																																																																	if (!routeOperationalCorr
																																																																																																			.equals(trgSwitchFailed)) {
																																																																																																		if (!routeOperationalCorr
																																																																																																				.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																			if (!routeOperationalCorr
																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																				if (!routeOperationalCorr
																																																																																																						.equals(routeRepairCorr)) {
																																																																																																					if (!routeOperationalCorr
																																																																																																							.equals(trgPetrinet)) {
																																																																																																						if (!routeOperationalCorr
																																																																																																								.equals(trgRouteFailToRouteFailed)) {
																																																																																																							if (!srcRoute
																																																																																																									.equals(srcSwitch)) {
																																																																																																								if (!srcRoute
																																																																																																										.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																									if (!srcRoute
																																																																																																											.equals(trgRouteOperational)) {
																																																																																																										if (!srcRoute
																																																																																																												.equals(trgRouteFail)) {
																																																																																																											if (!srcRoute
																																																																																																													.equals(switchOperationalCorr)) {
																																																																																																												if (!srcRoute
																																																																																																														.equals(srcSwitchPosition)) {
																																																																																																													if (!srcRoute
																																																																																																															.equals(trgSwitchOperational)) {
																																																																																																														if (!srcRoute
																																																																																																																.equals(switchFailedCorr)) {
																																																																																																															if (!srcRoute
																																																																																																																	.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																if (!srcRoute
																																																																																																																		.equals(trgRouteRepair)) {
																																																																																																																	if (!srcRoute
																																																																																																																			.equals(trgRouteFailed)) {
																																																																																																																		if (!srcRoute
																																																																																																																				.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																			if (!srcRoute
																																																																																																																					.equals(trgSwitchFailed)) {
																																																																																																																				if (!srcRoute
																																																																																																																						.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																					if (!srcRoute
																																																																																																																							.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																						if (!srcRoute
																																																																																																																								.equals(trgPetrinet)) {
																																																																																																																							if (!srcRoute
																																																																																																																									.equals(trgRouteFailToRouteFailed)) {
																																																																																																																								if (!srcContainer
																																																																																																																										.equals(srcSwitch)) {
																																																																																																																									if (!srcContainer
																																																																																																																											.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																										if (!srcContainer
																																																																																																																												.equals(trgRouteOperational)) {
																																																																																																																											if (!srcContainer
																																																																																																																													.equals(trgRouteFail)) {
																																																																																																																												if (!srcContainer
																																																																																																																														.equals(switchOperationalCorr)) {
																																																																																																																													if (!srcContainer
																																																																																																																															.equals(srcSwitchPosition)) {
																																																																																																																														if (!srcContainer
																																																																																																																																.equals(trgSwitchOperational)) {
																																																																																																																															if (!srcContainer
																																																																																																																																	.equals(switchFailedCorr)) {
																																																																																																																																if (!srcContainer
																																																																																																																																		.equals(srcRoute)) {
																																																																																																																																	if (!srcContainer
																																																																																																																																			.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																		if (!srcContainer
																																																																																																																																				.equals(trgRouteRepair)) {
																																																																																																																																			if (!srcContainer
																																																																																																																																					.equals(trgRouteFailed)) {
																																																																																																																																				if (!srcContainer
																																																																																																																																						.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																					if (!srcContainer
																																																																																																																																							.equals(trgSwitchFailed)) {
																																																																																																																																						if (!srcContainer
																																																																																																																																								.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																							if (!srcContainer
																																																																																																																																									.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																								if (!srcContainer
																																																																																																																																										.equals(trgPetrinet)) {
																																																																																																																																									if (!srcContainer
																																																																																																																																											.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																										if (!trgSwitchFailedToRouteFail
																																																																																																																																												.equals(trgSwitchOperational)) {
																																																																																																																																											if (!trgSwitchFailedToRouteFail
																																																																																																																																													.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																												if (!containerCorr
																																																																																																																																														.equals(srcSwitch)) {
																																																																																																																																													if (!containerCorr
																																																																																																																																															.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																														if (!containerCorr
																																																																																																																																																.equals(trgRouteOperational)) {
																																																																																																																																															if (!containerCorr
																																																																																																																																																	.equals(trgRouteFail)) {
																																																																																																																																																if (!containerCorr
																																																																																																																																																		.equals(switchOperationalCorr)) {
																																																																																																																																																	if (!containerCorr
																																																																																																																																																			.equals(srcSwitchPosition)) {
																																																																																																																																																		if (!containerCorr
																																																																																																																																																				.equals(trgSwitchOperational)) {
																																																																																																																																																			if (!containerCorr
																																																																																																																																																					.equals(switchFailedCorr)) {
																																																																																																																																																				if (!containerCorr
																																																																																																																																																						.equals(routeOperationalCorr)) {
																																																																																																																																																					if (!containerCorr
																																																																																																																																																							.equals(srcRoute)) {
																																																																																																																																																						if (!containerCorr
																																																																																																																																																								.equals(srcContainer)) {
																																																																																																																																																							if (!containerCorr
																																																																																																																																																									.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																								if (!containerCorr
																																																																																																																																																										.equals(trgRouteRepair)) {
																																																																																																																																																									if (!containerCorr
																																																																																																																																																											.equals(trgRouteFailed)) {
																																																																																																																																																										if (!containerCorr
																																																																																																																																																												.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																											if (!containerCorr
																																																																																																																																																													.equals(trgSwitchFailed)) {
																																																																																																																																																												if (!containerCorr
																																																																																																																																																														.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																													if (!containerCorr
																																																																																																																																																															.equals(routeFailedCorr)) {
																																																																																																																																																														if (!containerCorr
																																																																																																																																																																.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																															if (!containerCorr
																																																																																																																																																																	.equals(routeRepairCorr)) {
																																																																																																																																																																if (!containerCorr
																																																																																																																																																																		.equals(trgPetrinet)) {
																																																																																																																																																																	if (!containerCorr
																																																																																																																																																																			.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																		if (!trgRouteRepair
																																																																																																																																																																				.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																			if (!trgRouteRepair
																																																																																																																																																																					.equals(trgSwitchOperational)) {
																																																																																																																																																																				if (!trgRouteRepair
																																																																																																																																																																						.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																					if (!trgRouteRepair
																																																																																																																																																																							.equals(trgSwitchFailed)) {
																																																																																																																																																																						if (!trgRouteRepair
																																																																																																																																																																								.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																							if (!trgRouteFailed
																																																																																																																																																																									.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																								if (!trgRouteFailed
																																																																																																																																																																										.equals(trgRouteOperational)) {
																																																																																																																																																																									if (!trgRouteFailed
																																																																																																																																																																											.equals(trgSwitchOperational)) {
																																																																																																																																																																										if (!trgRouteFailed
																																																																																																																																																																												.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																											if (!trgRouteFailed
																																																																																																																																																																													.equals(trgRouteRepair)) {
																																																																																																																																																																												if (!trgRouteFailed
																																																																																																																																																																														.equals(trgSwitchFailed)) {
																																																																																																																																																																													if (!trgRouteFailed
																																																																																																																																																																															.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																														if (!trgRouteFailed
																																																																																																																																																																																.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																															if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																	.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																		.equals(trgRouteOperational)) {
																																																																																																																																																																																	if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																			.equals(trgSwitchOperational)) {
																																																																																																																																																																																		if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																				.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																			if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																					.equals(trgRouteRepair)) {
																																																																																																																																																																																				if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																						.equals(trgRouteFailed)) {
																																																																																																																																																																																					if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																							.equals(trgSwitchFailed)) {
																																																																																																																																																																																						if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																								.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																							if (!trgRouteFailToSwitchFailed
																																																																																																																																																																																									.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																								if (!trgSwitchFailed
																																																																																																																																																																																										.equals(trgSwitchOperational)) {
																																																																																																																																																																																									if (!trgSwitchFailed
																																																																																																																																																																																											.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																										if (!trgSwitchFailed
																																																																																																																																																																																												.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																											if (!routeFailedCorr
																																																																																																																																																																																													.equals(srcSwitch)) {
																																																																																																																																																																																												if (!routeFailedCorr
																																																																																																																																																																																														.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																													if (!routeFailedCorr
																																																																																																																																																																																															.equals(trgRouteOperational)) {
																																																																																																																																																																																														if (!routeFailedCorr
																																																																																																																																																																																																.equals(trgRouteFail)) {
																																																																																																																																																																																															if (!routeFailedCorr
																																																																																																																																																																																																	.equals(switchOperationalCorr)) {
																																																																																																																																																																																																if (!routeFailedCorr
																																																																																																																																																																																																		.equals(srcSwitchPosition)) {
																																																																																																																																																																																																	if (!routeFailedCorr
																																																																																																																																																																																																			.equals(trgSwitchOperational)) {
																																																																																																																																																																																																		if (!routeFailedCorr
																																																																																																																																																																																																				.equals(switchFailedCorr)) {
																																																																																																																																																																																																			if (!routeFailedCorr
																																																																																																																																																																																																					.equals(routeOperationalCorr)) {
																																																																																																																																																																																																				if (!routeFailedCorr
																																																																																																																																																																																																						.equals(srcRoute)) {
																																																																																																																																																																																																					if (!routeFailedCorr
																																																																																																																																																																																																							.equals(srcContainer)) {
																																																																																																																																																																																																						if (!routeFailedCorr
																																																																																																																																																																																																								.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																							if (!routeFailedCorr
																																																																																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																																																																																								if (!routeFailedCorr
																																																																																																																																																																																																										.equals(trgRouteFailed)) {
																																																																																																																																																																																																									if (!routeFailedCorr
																																																																																																																																																																																																											.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																										if (!routeFailedCorr
																																																																																																																																																																																																												.equals(trgSwitchFailed)) {
																																																																																																																																																																																																											if (!routeFailedCorr
																																																																																																																																																																																																													.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																												if (!routeFailedCorr
																																																																																																																																																																																																														.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																													if (!routeFailedCorr
																																																																																																																																																																																																															.equals(routeRepairCorr)) {
																																																																																																																																																																																																														if (!routeFailedCorr
																																																																																																																																																																																																																.equals(trgPetrinet)) {
																																																																																																																																																																																																															if (!routeFailedCorr
																																																																																																																																																																																																																	.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																																		.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																	if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																																			.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																		if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																																				.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																			if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																																					.equals(trgRouteRepair)) {
																																																																																																																																																																																																																				if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																																						.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																					if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																																							.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																						if (!routeRepairCorr
																																																																																																																																																																																																																								.equals(srcSwitch)) {
																																																																																																																																																																																																																							if (!routeRepairCorr
																																																																																																																																																																																																																									.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																								if (!routeRepairCorr
																																																																																																																																																																																																																										.equals(trgRouteOperational)) {
																																																																																																																																																																																																																									if (!routeRepairCorr
																																																																																																																																																																																																																											.equals(trgRouteFail)) {
																																																																																																																																																																																																																										if (!routeRepairCorr
																																																																																																																																																																																																																												.equals(switchOperationalCorr)) {
																																																																																																																																																																																																																											if (!routeRepairCorr
																																																																																																																																																																																																																													.equals(srcSwitchPosition)) {
																																																																																																																																																																																																																												if (!routeRepairCorr
																																																																																																																																																																																																																														.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																													if (!routeRepairCorr
																																																																																																																																																																																																																															.equals(switchFailedCorr)) {
																																																																																																																																																																																																																														if (!routeRepairCorr
																																																																																																																																																																																																																																.equals(srcRoute)) {
																																																																																																																																																																																																																															if (!routeRepairCorr
																																																																																																																																																																																																																																	.equals(srcContainer)) {
																																																																																																																																																																																																																																if (!routeRepairCorr
																																																																																																																																																																																																																																		.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																																	if (!routeRepairCorr
																																																																																																																																																																																																																																			.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																		if (!routeRepairCorr
																																																																																																																																																																																																																																				.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																			if (!routeRepairCorr
																																																																																																																																																																																																																																					.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																																																				if (!routeRepairCorr
																																																																																																																																																																																																																																						.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																																					if (!routeRepairCorr
																																																																																																																																																																																																																																							.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																																						if (!routeRepairCorr
																																																																																																																																																																																																																																								.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																							if (!routeRepairCorr
																																																																																																																																																																																																																																									.equals(trgPetrinet)) {
																																																																																																																																																																																																																																								if (!routeRepairCorr
																																																																																																																																																																																																																																										.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																																									if (!trgPetrinet
																																																																																																																																																																																																																																											.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																																										if (!trgPetrinet
																																																																																																																																																																																																																																												.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																											if (!trgPetrinet
																																																																																																																																																																																																																																													.equals(trgRouteFail)) {
																																																																																																																																																																																																																																												if (!trgPetrinet
																																																																																																																																																																																																																																														.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																																													if (!trgPetrinet
																																																																																																																																																																																																																																															.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																																														if (!trgPetrinet
																																																																																																																																																																																																																																																.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																															if (!trgPetrinet
																																																																																																																																																																																																																																																	.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																																if (!trgPetrinet
																																																																																																																																																																																																																																																		.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																																																																	if (!trgPetrinet
																																																																																																																																																																																																																																																			.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																																																		if (!trgPetrinet
																																																																																																																																																																																																																																																				.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																																																			if (!trgPetrinet
																																																																																																																																																																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																																				if (!trgPetrinet
																																																																																																																																																																																																																																																						.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																																																					if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																							.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																																																						if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																								.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																																							if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																									.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																																																								if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																										.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																																																									if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																											.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																																										if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																												.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																																											if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																													.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																																																																												if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																														.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																																																													if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																															.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																																																														if (!trgRouteFailToRouteFailed
																																																																																																																																																																																																																																																																.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																																															return new Object[] {
																																																																																																																																																																																																																																																																	ruleresult,
																																																																																																																																																																																																																																																																	srcSwitch,
																																																																																																																																																																																																																																																																	trgRouteRepairToSwitchOperational,
																																																																																																																																																																																																																																																																	trgRouteOperational,
																																																																																																																																																																																																																																																																	trgRouteFail,
																																																																																																																																																																																																																																																																	switchOperationalCorr,
																																																																																																																																																																																																																																																																	srcSwitchPosition,
																																																																																																																																																																																																																																																																	trgSwitchOperational,
																																																																																																																																																																																																																																																																	switchFailedCorr,
																																																																																																																																																																																																																																																																	routeOperationalCorr,
																																																																																																																																																																																																																																																																	srcRoute,
																																																																																																																																																																																																																																																																	srcContainer,
																																																																																																																																																																																																																																																																	trgSwitchFailedToRouteFail,
																																																																																																																																																																																																																																																																	containerCorr,
																																																																																																																																																																																																																																																																	trgRouteRepair,
																																																																																																																																																																																																																																																																	trgRouteFailed,
																																																																																																																																																																																																																																																																	trgRouteFailToSwitchFailed,
																																																																																																																																																																																																																																																																	trgSwitchFailed,
																																																																																																																																																																																																																																																																	trgSwitchOperationalToRouteRepair,
																																																																																																																																																																																																																																																																	routeFailedCorr,
																																																																																																																																																																																																																																																																	trgRouteOperationalToRouteFail,
																																																																																																																																																																																																																																																																	routeRepairCorr,
																																																																																																																																																																																																																																																																	trgPetrinet,
																																																																																																																																																																																																																																																																	trgRouteFailToRouteFailed };
																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																															}
																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject trgRouteRepairToSwitchOperational, EObject trgRouteOperational,
			EObject trgRouteFail, EObject srcSwitchPosition, EObject trgSwitchOperational, EObject srcRoute,
			EObject trgSwitchFailedToRouteFail, EObject trgRouteRepair, EObject trgRouteFailed,
			EObject trgRouteFailToSwitchFailed, EObject trgSwitchFailed, EObject trgSwitchOperationalToRouteRepair,
			EObject trgRouteOperationalToRouteFail, EObject trgPetrinet, EObject trgRouteFailToRouteFailed) {
		EMoflonEdge trgRouteRepairToSwitchOperational__trgSwitchOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSwitchOperational__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgRouteRepairToSwitchOperational____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSwitchFailedToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgSwitchFailedToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchFailedToRouteFail__trgSwitchFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSwitchFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToSwitchFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSwitchPosition____follows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcRoute____route = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchOperationalToRouteRepair__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRouteFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchOperationalToRouteRepair__trgSwitchOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSwitchFailed__trgSwitchFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RequiredSwitch";
		String trgRouteRepairToSwitchOperational__trgSwitchOperational____place_name_prime = "place";
		String trgRouteRepairToSwitchOperational__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgRouteRepairToSwitchOperational____arcs_name_prime = "arcs";
		String trgSwitchFailedToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgSwitchFailedToRouteFail____arcs_name_prime = "arcs";
		String trgSwitchFailedToRouteFail__trgSwitchFailed____place_name_prime = "place";
		String trgRouteFailToSwitchFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToSwitchFailed____arcs_name_prime = "arcs";
		String srcRoute__srcSwitchPosition____follows_name_prime = "follows";
		String srcSwitchPosition__srcRoute____route_name_prime = "route";
		String trgSwitchOperationalToRouteRepair__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs_name_prime = "arcs";
		String trgRouteFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRouteFail____nodes_name_prime = "nodes";
		String trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime = "arcs";
		String trgSwitchOperationalToRouteRepair__trgSwitchOperational____place_name_prime = "place";
		String trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime = "place";
		String trgRouteFailToSwitchFailed__trgSwitchFailed____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime = "arcs";
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place.setSrc(trgRouteRepairToSwitchOperational);
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place.setTrg(trgSwitchOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSwitchOperational__trgSwitchOperational____place);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition.setSrc(trgRouteRepairToSwitchOperational);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSwitchOperational__trgRouteRepair____transition);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs.setTrg(trgRouteRepairToSwitchOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgRouteRepairToSwitchOperational____arcs);
		trgSwitchFailedToRouteFail__trgRouteFail____transition.setSrc(trgSwitchFailedToRouteFail);
		trgSwitchFailedToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgSwitchFailedToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs.setTrg(trgSwitchFailedToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgSwitchFailedToRouteFail____arcs);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place.setSrc(trgSwitchFailedToRouteFail);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place.setTrg(trgSwitchFailed);
		ruleresult.getCreatedEdges().add(trgSwitchFailedToRouteFail__trgSwitchFailed____place);
		trgRouteFailToSwitchFailed__trgRouteFail____transition.setSrc(trgRouteFailToSwitchFailed);
		trgRouteFailToSwitchFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToSwitchFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs.setTrg(trgRouteFailToSwitchFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToSwitchFailed____arcs);
		srcRoute__srcSwitchPosition____follows.setSrc(srcRoute);
		srcRoute__srcSwitchPosition____follows.setTrg(srcSwitchPosition);
		ruleresult.getTranslatedEdges().add(srcRoute__srcSwitchPosition____follows);
		srcSwitchPosition__srcRoute____route.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcRoute____route.setTrg(srcRoute);
		ruleresult.getTranslatedEdges().add(srcSwitchPosition__srcRoute____route);
		trgSwitchOperationalToRouteRepair__trgRouteRepair____transition.setSrc(trgSwitchOperationalToRouteRepair);
		trgSwitchOperationalToRouteRepair__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgSwitchOperationalToRouteRepair__trgRouteRepair____transition);
		trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs.setTrg(trgSwitchOperationalToRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs);
		trgRouteFail__trgPetrinet____petriNet.setSrc(trgRouteFail);
		trgRouteFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgPetrinet____petriNet);
		trgPetrinet__trgRouteFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRouteFail____nodes.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRouteFail____nodes);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setTrg(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteOperationalToRouteFail____arcs);
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place.setSrc(trgSwitchOperationalToRouteRepair);
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place.setTrg(trgSwitchOperational);
		ruleresult.getCreatedEdges().add(trgSwitchOperationalToRouteRepair__trgSwitchOperational____place);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setTrg(trgRouteOperational);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteOperational____place);
		trgRouteFailToSwitchFailed__trgSwitchFailed____place.setSrc(trgRouteFailToSwitchFailed);
		trgRouteFailToSwitchFailed__trgSwitchFailed____place.setTrg(trgSwitchFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToSwitchFailed__trgSwitchFailed____place);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setTrg(trgRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFailed____place);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setTrg(trgRouteFailToRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToRouteFailed____arcs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place
				.setName(trgRouteRepairToSwitchOperational__trgSwitchOperational____place_name_prime);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition
				.setName(trgRouteRepairToSwitchOperational__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs
				.setName(trgRouteRepair__trgRouteRepairToSwitchOperational____arcs_name_prime);
		trgSwitchFailedToRouteFail__trgRouteFail____transition
				.setName(trgSwitchFailedToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs
				.setName(trgRouteFail__trgSwitchFailedToRouteFail____arcs_name_prime);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place
				.setName(trgSwitchFailedToRouteFail__trgSwitchFailed____place_name_prime);
		trgRouteFailToSwitchFailed__trgRouteFail____transition
				.setName(trgRouteFailToSwitchFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs
				.setName(trgRouteFail__trgRouteFailToSwitchFailed____arcs_name_prime);
		srcRoute__srcSwitchPosition____follows.setName(srcRoute__srcSwitchPosition____follows_name_prime);
		srcSwitchPosition__srcRoute____route.setName(srcSwitchPosition__srcRoute____route_name_prime);
		trgSwitchOperationalToRouteRepair__trgRouteRepair____transition
				.setName(trgSwitchOperationalToRouteRepair__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs
				.setName(trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs_name_prime);
		trgRouteFail__trgPetrinet____petriNet.setName(trgRouteFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRouteFail____nodes.setName(trgPetrinet__trgRouteFail____nodes_name_prime);
		trgRouteOperationalToRouteFail__trgRouteFail____transition
				.setName(trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs
				.setName(trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime);
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place
				.setName(trgSwitchOperationalToRouteRepair__trgSwitchOperational____place_name_prime);
		trgRouteOperationalToRouteFail__trgRouteOperational____place
				.setName(trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime);
		trgRouteFailToSwitchFailed__trgSwitchFailed____place
				.setName(trgRouteFailToSwitchFailed__trgSwitchFailed____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFailed____place
				.setName(trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFail____transition
				.setName(trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToRouteFailed____arcs
				.setName(trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime);
		return new Object[] { ruleresult, trgRouteRepairToSwitchOperational, trgRouteOperational, trgRouteFail,
				srcSwitchPosition, trgSwitchOperational, srcRoute, trgSwitchFailedToRouteFail, trgRouteRepair,
				trgRouteFailed, trgRouteFailToSwitchFailed, trgSwitchFailed, trgSwitchOperationalToRouteRepair,
				trgRouteOperationalToRouteFail, trgPetrinet, trgRouteFailToRouteFailed,
				trgRouteRepairToSwitchOperational__trgSwitchOperational____place,
				trgRouteRepairToSwitchOperational__trgRouteRepair____transition,
				trgRouteRepair__trgRouteRepairToSwitchOperational____arcs,
				trgSwitchFailedToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgSwitchFailedToRouteFail____arcs, trgSwitchFailedToRouteFail__trgSwitchFailed____place,
				trgRouteFailToSwitchFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToSwitchFailed____arcs, srcRoute__srcSwitchPosition____follows,
				srcSwitchPosition__srcRoute____route, trgSwitchOperationalToRouteRepair__trgRouteRepair____transition,
				trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs, trgRouteFail__trgPetrinet____petriNet,
				trgPetrinet__trgRouteFail____nodes, trgRouteOperationalToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgRouteOperationalToRouteFail____arcs,
				trgSwitchOperationalToRouteRepair__trgSwitchOperational____place,
				trgRouteOperationalToRouteFail__trgRouteOperational____place,
				trgRouteFailToSwitchFailed__trgSwitchFailed____place,
				trgRouteFailToRouteFailed__trgRouteFailed____place,
				trgRouteFailToRouteFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToRouteFailed____arcs };
	}

	public static final void pattern_RequiredSwitch_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBBB(
			RequiredSwitch _this, PerformRuleResult ruleresult, EObject srcSwitch,
			EObject trgRouteRepairToSwitchOperational, EObject trgRouteOperational, EObject trgRouteFail,
			EObject switchOperationalCorr, EObject srcSwitchPosition, EObject trgSwitchOperational,
			EObject switchFailedCorr, EObject routeOperationalCorr, EObject srcRoute, EObject srcContainer,
			EObject trgSwitchFailedToRouteFail, EObject containerCorr, EObject trgRouteRepair, EObject trgRouteFailed,
			EObject trgRouteFailToSwitchFailed, EObject trgSwitchFailed, EObject trgSwitchOperationalToRouteRepair,
			EObject routeFailedCorr, EObject trgRouteOperationalToRouteFail, EObject routeRepairCorr,
			EObject trgPetrinet, EObject trgRouteFailToRouteFailed) {
		_this.registerObjects_FWD(ruleresult, srcSwitch, trgRouteRepairToSwitchOperational, trgRouteOperational,
				trgRouteFail, switchOperationalCorr, srcSwitchPosition, trgSwitchOperational, switchFailedCorr,
				routeOperationalCorr, srcRoute, srcContainer, trgSwitchFailedToRouteFail, containerCorr, trgRouteRepair,
				trgRouteFailed, trgRouteFailToSwitchFailed, trgSwitchFailed, trgSwitchOperationalToRouteRepair,
				routeFailedCorr, trgRouteOperationalToRouteFail, routeRepairCorr, trgPetrinet,
				trgRouteFailToRouteFailed);

	}

	public static final PerformRuleResult pattern_RequiredSwitch_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_2_1_preparereturnvalue_bindingFB(RequiredSwitch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_1_preparereturnvalue_blackFBB(EClass eClass,
			RequiredSwitch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_1_preparereturnvalue_bindingAndBlackFFB(
			RequiredSwitch _this) {
		Object[] result_pattern_RequiredSwitch_2_1_preparereturnvalue_binding = pattern_RequiredSwitch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredSwitch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_RequiredSwitch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredSwitch_2_1_preparereturnvalue_black = pattern_RequiredSwitch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_RequiredSwitch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_RequiredSwitch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "RequiredSwitch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_RequiredSwitch_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcSwitch");
		EObject _localVariable_1 = match.getObject("srcSwitchPosition");
		EObject _localVariable_2 = match.getObject("srcRoute");
		EObject _localVariable_3 = match.getObject("srcContainer");
		EObject tmpSrcSwitch = _localVariable_0;
		EObject tmpSrcSwitchPosition = _localVariable_1;
		EObject tmpSrcRoute = _localVariable_2;
		EObject tmpSrcContainer = _localVariable_3;
		if (tmpSrcSwitch instanceof Switch) {
			Switch srcSwitch = (Switch) tmpSrcSwitch;
			if (tmpSrcSwitchPosition instanceof SwitchPosition) {
				SwitchPosition srcSwitchPosition = (SwitchPosition) tmpSrcSwitchPosition;
				if (tmpSrcRoute instanceof Route) {
					Route srcRoute = (Route) tmpSrcRoute;
					if (tmpSrcContainer instanceof RailwayContainer) {
						RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
						return new Object[] { srcSwitch, srcSwitchPosition, srcRoute, srcContainer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RequiredSwitch_2_2_corematch_blackBFFBFFFBBFFFFFFFB(Switch srcSwitch,
			SwitchPosition srcSwitchPosition, Route srcRoute, RailwayContainer srcContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SwitchToOperational switchOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcSwitch, SwitchToOperational.class, "source")) {
			Place trgSwitchOperational = switchOperationalCorr.getTarget();
			if (trgSwitchOperational != null) {
				for (SwitchToFailed switchFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcSwitch, SwitchToFailed.class, "source")) {
					Place trgSwitchFailed = switchFailedCorr.getTarget();
					if (trgSwitchFailed != null) {
						if (!trgSwitchFailed.equals(trgSwitchOperational)) {
							for (RouteToOperational routeOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(srcRoute, RouteToOperational.class, "source")) {
								Place trgRouteOperational = routeOperationalCorr.getTarget();
								if (trgRouteOperational != null) {
									if (!trgRouteOperational.equals(trgSwitchOperational)) {
										if (!trgRouteOperational.equals(trgSwitchFailed)) {
											for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(srcContainer,
															RailwayContainerToPetriNet.class, "source")) {
												PetriNet trgPetrinet = containerCorr.getTarget();
												if (trgPetrinet != null) {
													for (RouteToFailed routeFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(srcRoute, RouteToFailed.class,
																	"source")) {
														Place trgRouteFailed = routeFailedCorr.getTarget();
														if (trgRouteFailed != null) {
															if (!trgRouteFailed.equals(trgRouteOperational)) {
																if (!trgRouteFailed.equals(trgSwitchOperational)) {
																	if (!trgRouteFailed.equals(trgSwitchFailed)) {
																		for (RouteToRepair routeRepairCorr : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(srcRoute,
																						RouteToRepair.class,
																						"source")) {
																			Transition trgRouteRepair = routeRepairCorr
																					.getTarget();
																			if (trgRouteRepair != null) {
																				_result.add(new Object[] { srcSwitch,
																						trgRouteOperational,
																						switchOperationalCorr,
																						srcSwitchPosition,
																						trgSwitchOperational,
																						switchFailedCorr,
																						routeOperationalCorr, srcRoute,
																						srcContainer, containerCorr,
																						trgRouteRepair, trgRouteFailed,
																						trgSwitchFailed,
																						routeFailedCorr,
																						routeRepairCorr, trgPetrinet,
																						match });
																			}

																		}
																	}
																}
															}
														}

													}
												}

											}
										}
									}
								}

							}
						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_RequiredSwitch_2_3_findcontext_blackBBBBBBBBBBBBBBBB(
			Switch srcSwitch, Place trgRouteOperational, SwitchToOperational switchOperationalCorr,
			SwitchPosition srcSwitchPosition, Place trgSwitchOperational, SwitchToFailed switchFailedCorr,
			RouteToOperational routeOperationalCorr, Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr, Transition trgRouteRepair, Place trgRouteFailed,
			Place trgSwitchFailed, RouteToFailed routeFailedCorr, RouteToRepair routeRepairCorr, PetriNet trgPetrinet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!trgRouteOperational.equals(trgSwitchOperational)) {
			if (!trgRouteOperational.equals(trgSwitchFailed)) {
				if (!trgRouteFailed.equals(trgRouteOperational)) {
					if (!trgRouteFailed.equals(trgSwitchOperational)) {
						if (!trgRouteFailed.equals(trgSwitchFailed)) {
							if (!trgSwitchFailed.equals(trgSwitchOperational)) {
								if (srcSwitch.equals(switchOperationalCorr.getSource())) {
									if (srcSwitch.equals(switchFailedCorr.getSource())) {
										if (srcRoute.equals(routeOperationalCorr.getSource())) {
											if (srcSwitch.equals(srcSwitchPosition.getTarget())) {
												if (trgRouteOperational.equals(routeOperationalCorr.getTarget())) {
													if (srcContainer.getRoutes().contains(srcRoute)) {
														if (srcRoute.getFollows().contains(srcSwitchPosition)) {
															if (srcContainer.equals(containerCorr.getSource())) {
																if (srcRoute.equals(routeFailedCorr.getSource())) {
																	if (trgSwitchFailed
																			.equals(switchFailedCorr.getTarget())) {
																		if (trgRouteFailed
																				.equals(routeFailedCorr.getTarget())) {
																			if (trgRouteRepair.equals(
																					routeRepairCorr.getTarget())) {
																				if (srcRoute.equals(
																						routeRepairCorr.getSource())) {
																					if (trgPetrinet.equals(containerCorr
																							.getTarget())) {
																						if (trgSwitchOperational.equals(
																								switchOperationalCorr
																										.getTarget())) {
																							_result.add(new Object[] {
																									srcSwitch,
																									trgRouteOperational,
																									switchOperationalCorr,
																									srcSwitchPosition,
																									trgSwitchOperational,
																									switchFailedCorr,
																									routeOperationalCorr,
																									srcRoute,
																									srcContainer,
																									containerCorr,
																									trgRouteRepair,
																									trgRouteFailed,
																									trgSwitchFailed,
																									routeFailedCorr,
																									routeRepairCorr,
																									trgPetrinet });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_2_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(
			Switch srcSwitch, Place trgRouteOperational, SwitchToOperational switchOperationalCorr,
			SwitchPosition srcSwitchPosition, Place trgSwitchOperational, SwitchToFailed switchFailedCorr,
			RouteToOperational routeOperationalCorr, Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr, Transition trgRouteRepair, Place trgRouteFailed,
			Place trgSwitchFailed, RouteToFailed routeFailedCorr, RouteToRepair routeRepairCorr, PetriNet trgPetrinet) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge switchOperationalCorr__srcSwitch____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchFailedCorr__srcSwitch____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgRouteOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSwitchPosition____follows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcRoute____route = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchFailedCorr__trgSwitchFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgRouteFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRouteRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchOperationalCorr__trgSwitchOperational____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String switchOperationalCorr__srcSwitch____source_name_prime = "source";
		String switchFailedCorr__srcSwitch____source_name_prime = "source";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String srcSwitchPosition__srcSwitch____target_name_prime = "target";
		String srcSwitch__srcSwitchPosition____positions_name_prime = "positions";
		String routeOperationalCorr__trgRouteOperational____target_name_prime = "target";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		String srcRoute__srcSwitchPosition____follows_name_prime = "follows";
		String srcSwitchPosition__srcRoute____route_name_prime = "route";
		String containerCorr__srcContainer____source_name_prime = "source";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		String switchFailedCorr__trgSwitchFailed____target_name_prime = "target";
		String routeFailedCorr__trgRouteFailed____target_name_prime = "target";
		String routeRepairCorr__trgRouteRepair____target_name_prime = "target";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String switchOperationalCorr__trgSwitchOperational____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(srcSwitch);
		isApplicableMatch.getAllContextElements().add(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(trgSwitchOperational);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(trgSwitchFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		switchOperationalCorr__srcSwitch____source.setSrc(switchOperationalCorr);
		switchOperationalCorr__srcSwitch____source.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr__srcSwitch____source);
		switchFailedCorr__srcSwitch____source.setSrc(switchFailedCorr);
		switchFailedCorr__srcSwitch____source.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr__srcSwitch____source);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__srcRoute____source);
		srcSwitchPosition__srcSwitch____target.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcSwitch____target.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition__srcSwitch____target);
		srcSwitch__srcSwitchPosition____positions.setSrc(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setTrg(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcSwitch__srcSwitchPosition____positions);
		routeOperationalCorr__trgRouteOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgRouteOperational____target.setTrg(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__trgRouteOperational____target);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		srcRoute__srcSwitchPosition____follows.setSrc(srcRoute);
		srcRoute__srcSwitchPosition____follows.setTrg(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcRoute__srcSwitchPosition____follows);
		srcSwitchPosition__srcRoute____route.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcRoute____route.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition__srcRoute____route);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__srcRoute____source);
		switchFailedCorr__trgSwitchFailed____target.setSrc(switchFailedCorr);
		switchFailedCorr__trgSwitchFailed____target.setTrg(trgSwitchFailed);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr__trgSwitchFailed____target);
		routeFailedCorr__trgRouteFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgRouteFailed____target.setTrg(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__trgRouteFailed____target);
		routeRepairCorr__trgRouteRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRouteRepair____target.setTrg(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__trgRouteRepair____target);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__srcRoute____source);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		switchOperationalCorr__trgSwitchOperational____target.setSrc(switchOperationalCorr);
		switchOperationalCorr__trgSwitchOperational____target.setTrg(trgSwitchOperational);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr__trgSwitchOperational____target);
		switchOperationalCorr__srcSwitch____source.setName(switchOperationalCorr__srcSwitch____source_name_prime);
		switchFailedCorr__srcSwitch____source.setName(switchFailedCorr__srcSwitch____source_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		srcSwitchPosition__srcSwitch____target.setName(srcSwitchPosition__srcSwitch____target_name_prime);
		srcSwitch__srcSwitchPosition____positions.setName(srcSwitch__srcSwitchPosition____positions_name_prime);
		routeOperationalCorr__trgRouteOperational____target
				.setName(routeOperationalCorr__trgRouteOperational____target_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		srcRoute__srcSwitchPosition____follows.setName(srcRoute__srcSwitchPosition____follows_name_prime);
		srcSwitchPosition__srcRoute____route.setName(srcSwitchPosition__srcRoute____route_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		switchFailedCorr__trgSwitchFailed____target.setName(switchFailedCorr__trgSwitchFailed____target_name_prime);
		routeFailedCorr__trgRouteFailed____target.setName(routeFailedCorr__trgRouteFailed____target_name_prime);
		routeRepairCorr__trgRouteRepair____target.setName(routeRepairCorr__trgRouteRepair____target_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		switchOperationalCorr__trgSwitchOperational____target
				.setName(switchOperationalCorr__trgSwitchOperational____target_name_prime);
		return new Object[] { srcSwitch, trgRouteOperational, switchOperationalCorr, srcSwitchPosition,
				trgSwitchOperational, switchFailedCorr, routeOperationalCorr, srcRoute, srcContainer, containerCorr,
				trgRouteRepair, trgRouteFailed, trgSwitchFailed, routeFailedCorr, routeRepairCorr, trgPetrinet,
				isApplicableMatch, switchOperationalCorr__srcSwitch____source, switchFailedCorr__srcSwitch____source,
				routeOperationalCorr__srcRoute____source, srcSwitchPosition__srcSwitch____target,
				srcSwitch__srcSwitchPosition____positions, routeOperationalCorr__trgRouteOperational____target,
				srcContainer__srcRoute____routes, srcRoute__srcSwitchPosition____follows,
				srcSwitchPosition__srcRoute____route, containerCorr__srcContainer____source,
				routeFailedCorr__srcRoute____source, switchFailedCorr__trgSwitchFailed____target,
				routeFailedCorr__trgRouteFailed____target, routeRepairCorr__trgRouteRepair____target,
				routeRepairCorr__srcRoute____source, containerCorr__trgPetrinet____target,
				switchOperationalCorr__trgSwitchOperational____target };
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(RequiredSwitch _this,
			IsApplicableMatch isApplicableMatch, Switch srcSwitch, Place trgRouteOperational,
			SwitchToOperational switchOperationalCorr, SwitchPosition srcSwitchPosition, Place trgSwitchOperational,
			SwitchToFailed switchFailedCorr, RouteToOperational routeOperationalCorr, Route srcRoute,
			RailwayContainer srcContainer, RailwayContainerToPetriNet containerCorr, Transition trgRouteRepair,
			Place trgRouteFailed, Place trgSwitchFailed, RouteToFailed routeFailedCorr, RouteToRepair routeRepairCorr,
			PetriNet trgPetrinet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcSwitch, trgRouteOperational,
				switchOperationalCorr, srcSwitchPosition, trgSwitchOperational, switchFailedCorr, routeOperationalCorr,
				srcRoute, srcContainer, containerCorr, trgRouteRepair, trgRouteFailed, trgSwitchFailed, routeFailedCorr,
				routeRepairCorr, trgPetrinet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcSwitch, trgRouteOperational, switchOperationalCorr,
					srcSwitchPosition, trgSwitchOperational, switchFailedCorr, routeOperationalCorr, srcRoute,
					srcContainer, containerCorr, trgRouteRepair, trgRouteFailed, trgSwitchFailed, routeFailedCorr,
					routeRepairCorr, trgPetrinet };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
			RequiredSwitch _this, IsApplicableMatch isApplicableMatch, Switch srcSwitch, Place trgRouteOperational,
			SwitchToOperational switchOperationalCorr, SwitchPosition srcSwitchPosition, Place trgSwitchOperational,
			SwitchToFailed switchFailedCorr, RouteToOperational routeOperationalCorr, Route srcRoute,
			RailwayContainer srcContainer, RailwayContainerToPetriNet containerCorr, Transition trgRouteRepair,
			Place trgRouteFailed, Place trgSwitchFailed, RouteToFailed routeFailedCorr, RouteToRepair routeRepairCorr,
			PetriNet trgPetrinet) {
		Object[] result_pattern_RequiredSwitch_2_4_solveCSP_binding = pattern_RequiredSwitch_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, srcSwitch, trgRouteOperational, switchOperationalCorr, srcSwitchPosition,
				trgSwitchOperational, switchFailedCorr, routeOperationalCorr, srcRoute, srcContainer, containerCorr,
				trgRouteRepair, trgRouteFailed, trgSwitchFailed, routeFailedCorr, routeRepairCorr, trgPetrinet);
		if (result_pattern_RequiredSwitch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSwitch_2_4_solveCSP_binding[0];

			Object[] result_pattern_RequiredSwitch_2_4_solveCSP_black = pattern_RequiredSwitch_2_4_solveCSP_blackB(csp);
			if (result_pattern_RequiredSwitch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcSwitch, trgRouteOperational,
						switchOperationalCorr, srcSwitchPosition, trgSwitchOperational, switchFailedCorr,
						routeOperationalCorr, srcRoute, srcContainer, containerCorr, trgRouteRepair, trgRouteFailed,
						trgSwitchFailed, routeFailedCorr, routeRepairCorr, trgPetrinet };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSwitch_2_5_checkCSP_expressionFBB(RequiredSwitch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_RequiredSwitch_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "RequiredSwitch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_RequiredSwitch_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_10_1_preparereturnvalue_bindingFB(RequiredSwitch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			RequiredSwitch _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_10_1_preparereturnvalue_bindingAndBlackFFBF(
			RequiredSwitch _this) {
		Object[] result_pattern_RequiredSwitch_10_1_preparereturnvalue_binding = pattern_RequiredSwitch_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredSwitch_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_RequiredSwitch_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredSwitch_10_1_preparereturnvalue_black = pattern_RequiredSwitch_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_RequiredSwitch_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_RequiredSwitch_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_RequiredSwitch_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_RequiredSwitch_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_follows) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcRoute = _edge_follows.getSrc();
		if (tmpSrcRoute instanceof Route) {
			Route srcRoute = (Route) tmpSrcRoute;
			EObject tmpSrcSwitchPosition = _edge_follows.getTrg();
			if (tmpSrcSwitchPosition instanceof SwitchPosition) {
				SwitchPosition srcSwitchPosition = (SwitchPosition) tmpSrcSwitchPosition;
				if (srcRoute.getFollows().contains(srcSwitchPosition)) {
					Switch srcSwitch = srcSwitchPosition.getTarget();
					if (srcSwitch != null) {
						for (RailwayContainer srcContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(srcRoute, RailwayContainer.class, "routes")) {
							_result.add(new Object[] { srcSwitch, srcSwitchPosition, srcRoute, srcContainer,
									_edge_follows });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_RequiredSwitch_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			RequiredSwitch _this, Match match, Switch srcSwitch, SwitchPosition srcSwitchPosition, Route srcRoute,
			RailwayContainer srcContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSwitch, srcSwitchPosition, srcRoute, srcContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_RequiredSwitch_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			RequiredSwitch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_RequiredSwitch_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_RequiredSwitch_13_1_matchtggpattern_blackBBBB(Switch srcSwitch,
			SwitchPosition srcSwitchPosition, Route srcRoute, RailwayContainer srcContainer) {
		if (srcSwitch.equals(srcSwitchPosition.getTarget())) {
			if (srcContainer.getRoutes().contains(srcRoute)) {
				if (srcRoute.getFollows().contains(srcSwitchPosition)) {
					return new Object[] { srcSwitch, srcSwitchPosition, srcRoute, srcContainer };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSwitch_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredSwitch_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RequiredSwitchImpl
