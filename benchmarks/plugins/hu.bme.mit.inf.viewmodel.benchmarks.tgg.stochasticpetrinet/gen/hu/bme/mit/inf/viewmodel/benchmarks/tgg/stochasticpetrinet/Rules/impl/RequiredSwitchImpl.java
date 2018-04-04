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
	public boolean isAppropriate_FWD(Match match, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer,
			Route srcRoute, Switch srcSwitch) {

		Object[] result1_black = RequiredSwitchImpl.pattern_RequiredSwitch_0_1_initialbindings_blackBBBBBB(this, match,
				srcSwitchPosition, srcContainer, srcRoute, srcSwitch);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", "
					+ "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = " + srcRoute + ", " + "[srcSwitch] = "
					+ srcSwitch + ".");
		}

		Object[] result2_bindingAndBlack = RequiredSwitchImpl
				.pattern_RequiredSwitch_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, srcSwitchPosition,
						srcContainer, srcRoute, srcSwitch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", "
					+ "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = " + srcRoute + ", " + "[srcSwitch] = "
					+ srcSwitch + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RequiredSwitchImpl.pattern_RequiredSwitch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RequiredSwitchImpl
					.pattern_RequiredSwitch_0_4_collectelementstobetranslated_blackBBBBB(match, srcSwitchPosition,
							srcContainer, srcRoute, srcSwitch);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSwitchPosition] = " + srcSwitchPosition + ", " + "[srcContainer] = " + srcContainer
						+ ", " + "[srcRoute] = " + srcRoute + ", " + "[srcSwitch] = " + srcSwitch + ".");
			}
			RequiredSwitchImpl.pattern_RequiredSwitch_0_4_collectelementstobetranslated_greenBBBFF(match,
					srcSwitchPosition, srcRoute);
			//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result4_green[4];

			Object[] result5_black = RequiredSwitchImpl.pattern_RequiredSwitch_0_5_collectcontextelements_blackBBBBB(
					match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSwitchPosition] = " + srcSwitchPosition + ", " + "[srcContainer] = " + srcContainer
						+ ", " + "[srcRoute] = " + srcRoute + ", " + "[srcSwitch] = " + srcSwitch + ".");
			}
			RequiredSwitchImpl.pattern_RequiredSwitch_0_5_collectcontextelements_greenBBBBBFFF(match, srcSwitchPosition,
					srcContainer, srcRoute, srcSwitch);
			//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result5_green[7];

			// 
			RequiredSwitchImpl.pattern_RequiredSwitch_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					srcSwitchPosition, srcContainer, srcRoute, srcSwitch);
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
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[0];
		Place trgRouteFailed = (Place) result1_bindingAndBlack[1];
		Place trgSwitchFailed = (Place) result1_bindingAndBlack[2];
		Place trgSwitchOperational = (Place) result1_bindingAndBlack[3];
		SwitchToOperational switchOperationalCorr = (SwitchToOperational) result1_bindingAndBlack[4];
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_bindingAndBlack[5];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[6];
		SwitchToFailed switchFailedCorr = (SwitchToFailed) result1_bindingAndBlack[7];
		Place trgRouteOperational = (Place) result1_bindingAndBlack[8];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_bindingAndBlack[9];
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_bindingAndBlack[10];
		SwitchPosition srcSwitchPosition = (SwitchPosition) result1_bindingAndBlack[11];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[12];
		Route srcRoute = (Route) result1_bindingAndBlack[13];
		Transition trgRouteRepair = (Transition) result1_bindingAndBlack[14];
		Switch srcSwitch = (Switch) result1_bindingAndBlack[15];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[16];
		Object[] result1_green = RequiredSwitchImpl.pattern_RequiredSwitch_1_1_performtransformation_greenBFBBFFBFBFFFB(
				trgPetrinet, trgRouteFailed, trgSwitchFailed, trgSwitchOperational, trgRouteOperational,
				trgRouteRepair);
		Arc trgSwitchFailedToRouteFail = (Arc) result1_green[1];
		Arc trgSwitchOperationalToRouteRepair = (Arc) result1_green[4];
		Arc trgRouteFailToSwitchFailed = (Arc) result1_green[5];
		ImmediateTransition trgRouteFail = (ImmediateTransition) result1_green[7];
		Arc trgRouteRepairToSwitchOperational = (Arc) result1_green[9];
		Arc trgRouteFailToRouteFailed = (Arc) result1_green[10];
		Arc trgRouteOperationalToRouteFail = (Arc) result1_green[11];

		Object[] result2_black = RequiredSwitchImpl.pattern_RequiredSwitch_1_2_collecttranslatedelements_blackBBBBBBB(
				trgSwitchFailedToRouteFail, trgSwitchOperationalToRouteRepair, trgRouteFailToSwitchFailed, trgRouteFail,
				trgRouteRepairToSwitchOperational, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[trgSwitchFailedToRouteFail] = "
					+ trgSwitchFailedToRouteFail + ", " + "[trgSwitchOperationalToRouteRepair] = "
					+ trgSwitchOperationalToRouteRepair + ", " + "[trgRouteFailToSwitchFailed] = "
					+ trgRouteFailToSwitchFailed + ", " + "[trgRouteFail] = " + trgRouteFail + ", "
					+ "[trgRouteRepairToSwitchOperational] = " + trgRouteRepairToSwitchOperational + ", "
					+ "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ", "
					+ "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail + ".");
		}
		Object[] result2_green = RequiredSwitchImpl.pattern_RequiredSwitch_1_2_collecttranslatedelements_greenFBBBBBBB(
				trgSwitchFailedToRouteFail, trgSwitchOperationalToRouteRepair, trgRouteFailToSwitchFailed, trgRouteFail,
				trgRouteRepairToSwitchOperational, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RequiredSwitchImpl
				.pattern_RequiredSwitch_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBBB(ruleresult, trgPetrinet,
						trgSwitchFailedToRouteFail, trgRouteFailed, trgSwitchFailed, trgSwitchOperationalToRouteRepair,
						trgRouteFailToSwitchFailed, trgSwitchOperational, switchOperationalCorr, trgRouteFail,
						routeRepairCorr, containerCorr, switchFailedCorr, trgRouteOperational, routeFailedCorr,
						routeOperationalCorr, trgRouteRepairToSwitchOperational, trgRouteFailToRouteFailed,
						srcSwitchPosition, trgRouteOperationalToRouteFail, srcContainer, srcRoute, trgRouteRepair,
						srcSwitch);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[trgPetrinet] = " + trgPetrinet + ", " + "[trgSwitchFailedToRouteFail] = "
					+ trgSwitchFailedToRouteFail + ", " + "[trgRouteFailed] = " + trgRouteFailed + ", "
					+ "[trgSwitchFailed] = " + trgSwitchFailed + ", " + "[trgSwitchOperationalToRouteRepair] = "
					+ trgSwitchOperationalToRouteRepair + ", " + "[trgRouteFailToSwitchFailed] = "
					+ trgRouteFailToSwitchFailed + ", " + "[trgSwitchOperational] = " + trgSwitchOperational + ", "
					+ "[switchOperationalCorr] = " + switchOperationalCorr + ", " + "[trgRouteFail] = " + trgRouteFail
					+ ", " + "[routeRepairCorr] = " + routeRepairCorr + ", " + "[containerCorr] = " + containerCorr
					+ ", " + "[switchFailedCorr] = " + switchFailedCorr + ", " + "[trgRouteOperational] = "
					+ trgRouteOperational + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", "
					+ "[routeOperationalCorr] = " + routeOperationalCorr + ", "
					+ "[trgRouteRepairToSwitchOperational] = " + trgRouteRepairToSwitchOperational + ", "
					+ "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ", " + "[srcSwitchPosition] = "
					+ srcSwitchPosition + ", " + "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail
					+ ", " + "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = " + srcRoute + ", "
					+ "[trgRouteRepair] = " + trgRouteRepair + ", " + "[srcSwitch] = " + srcSwitch + ".");
		}
		RequiredSwitchImpl.pattern_RequiredSwitch_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFF(
				ruleresult, trgPetrinet, trgSwitchFailedToRouteFail, trgRouteFailed, trgSwitchFailed,
				trgSwitchOperationalToRouteRepair, trgRouteFailToSwitchFailed, trgSwitchOperational, trgRouteFail,
				trgRouteOperational, trgRouteRepairToSwitchOperational, trgRouteFailToRouteFailed, srcSwitchPosition,
				trgRouteOperationalToRouteFail, srcRoute, trgRouteRepair);
		//nothing EMoflonEdge trgRouteFailToSwitchFailed__trgSwitchFailed____place = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgRouteFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgPetrinet__trgRouteFail____nodes = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgSwitchFailedToRouteFail__trgSwitchFailed____place = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgRouteRepairToSwitchOperational__trgSwitchOperational____place = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgRouteRepairToSwitchOperational__trgRouteRepair____transition = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgRouteRepair__trgRouteRepairToSwitchOperational____arcs = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgSwitchOperationalToRouteRepair__trgSwitchOperational____place = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgSwitchOperationalToRouteRepair__trgRouteRepair____transition = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgSwitchFailedToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgRouteFail__trgSwitchFailedToRouteFail____arcs = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgRouteFailToSwitchFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[36];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToSwitchFailed____arcs = (EMoflonEdge) result3_green[37];

		// 
		// 
		RequiredSwitchImpl.pattern_RequiredSwitch_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBBB(this,
				ruleresult, trgPetrinet, trgSwitchFailedToRouteFail, trgRouteFailed, trgSwitchFailed,
				trgSwitchOperationalToRouteRepair, trgRouteFailToSwitchFailed, trgSwitchOperational,
				switchOperationalCorr, trgRouteFail, routeRepairCorr, containerCorr, switchFailedCorr,
				trgRouteOperational, routeFailedCorr, routeOperationalCorr, trgRouteRepairToSwitchOperational,
				trgRouteFailToRouteFailed, srcSwitchPosition, trgRouteOperationalToRouteFail, srcContainer, srcRoute,
				trgRouteRepair, srcSwitch);
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
		SwitchPosition srcSwitchPosition = (SwitchPosition) result2_binding[0];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[1];
		Route srcRoute = (Route) result2_binding[2];
		Switch srcSwitch = (Switch) result2_binding[3];
		for (Object[] result2_black : RequiredSwitchImpl.pattern_RequiredSwitch_2_2_corematch_blackFFFFFFFFFFFBBBFBB(
				srcSwitchPosition, srcContainer, srcRoute, srcSwitch, match)) {
			PetriNet trgPetrinet = (PetriNet) result2_black[0];
			Place trgRouteFailed = (Place) result2_black[1];
			Place trgSwitchFailed = (Place) result2_black[2];
			Place trgSwitchOperational = (Place) result2_black[3];
			SwitchToOperational switchOperationalCorr = (SwitchToOperational) result2_black[4];
			RouteToRepair routeRepairCorr = (RouteToRepair) result2_black[5];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[6];
			SwitchToFailed switchFailedCorr = (SwitchToFailed) result2_black[7];
			Place trgRouteOperational = (Place) result2_black[8];
			RouteToFailed routeFailedCorr = (RouteToFailed) result2_black[9];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result2_black[10];
			Transition trgRouteRepair = (Transition) result2_black[14];
			// ForEach 
			for (Object[] result3_black : RequiredSwitchImpl
					.pattern_RequiredSwitch_2_3_findcontext_blackBBBBBBBBBBBBBBBB(trgPetrinet, trgRouteFailed,
							trgSwitchFailed, trgSwitchOperational, switchOperationalCorr, routeRepairCorr,
							containerCorr, switchFailedCorr, trgRouteOperational, routeFailedCorr, routeOperationalCorr,
							srcSwitchPosition, srcContainer, srcRoute, trgRouteRepair, srcSwitch)) {
				Object[] result3_green = RequiredSwitchImpl
						.pattern_RequiredSwitch_2_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFF(trgPetrinet,
								trgRouteFailed, trgSwitchFailed, trgSwitchOperational, switchOperationalCorr,
								routeRepairCorr, containerCorr, switchFailedCorr, trgRouteOperational, routeFailedCorr,
								routeOperationalCorr, srcSwitchPosition, srcContainer, srcRoute, trgRouteRepair,
								srcSwitch);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[16];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge routeOperationalCorr__trgRouteOperational____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge switchFailedCorr__trgSwitchFailed____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge routeFailedCorr__trgRouteFailed____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge srcRoute__srcSwitchPosition____follows = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge srcSwitchPosition__srcRoute____route = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge switchOperationalCorr__trgSwitchOperational____target = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge routeRepairCorr__trgRouteRepair____target = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge switchFailedCorr__srcSwitch____source = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge switchOperationalCorr__srcSwitch____source = (EMoflonEdge) result3_green[32];
				//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[33];

				Object[] result4_bindingAndBlack = RequiredSwitchImpl
						.pattern_RequiredSwitch_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(this, isApplicableMatch,
								trgPetrinet, trgRouteFailed, trgSwitchFailed, trgSwitchOperational,
								switchOperationalCorr, routeRepairCorr, containerCorr, switchFailedCorr,
								trgRouteOperational, routeFailedCorr, routeOperationalCorr, srcSwitchPosition,
								srcContainer, srcRoute, trgRouteRepair, srcSwitch);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[trgPetrinet] = " + trgPetrinet
							+ ", " + "[trgRouteFailed] = " + trgRouteFailed + ", " + "[trgSwitchFailed] = "
							+ trgSwitchFailed + ", " + "[trgSwitchOperational] = " + trgSwitchOperational + ", "
							+ "[switchOperationalCorr] = " + switchOperationalCorr + ", " + "[routeRepairCorr] = "
							+ routeRepairCorr + ", " + "[containerCorr] = " + containerCorr + ", "
							+ "[switchFailedCorr] = " + switchFailedCorr + ", " + "[trgRouteOperational] = "
							+ trgRouteOperational + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", "
							+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[srcSwitchPosition] = "
							+ srcSwitchPosition + ", " + "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = "
							+ srcRoute + ", " + "[trgRouteRepair] = " + trgRouteRepair + ", " + "[srcSwitch] = "
							+ srcSwitch + ".");
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
	public void registerObjectsToMatch_FWD(Match match, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer,
			Route srcRoute, Switch srcSwitch) {
		match.registerObject("srcSwitchPosition", srcSwitchPosition);
		match.registerObject("srcContainer", srcContainer);
		match.registerObject("srcRoute", srcRoute);
		match.registerObject("srcSwitch", srcSwitch);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer,
			Route srcRoute, Switch srcSwitch) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, PetriNet trgPetrinet,
			Place trgRouteFailed, Place trgSwitchFailed, Place trgSwitchOperational,
			SwitchToOperational switchOperationalCorr, RouteToRepair routeRepairCorr,
			RailwayContainerToPetriNet containerCorr, SwitchToFailed switchFailedCorr, Place trgRouteOperational,
			RouteToFailed routeFailedCorr, RouteToOperational routeOperationalCorr, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer, Route srcRoute, Transition trgRouteRepair, Switch srcSwitch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("trgRouteFailed", trgRouteFailed);
		isApplicableMatch.registerObject("trgSwitchFailed", trgSwitchFailed);
		isApplicableMatch.registerObject("trgSwitchOperational", trgSwitchOperational);
		isApplicableMatch.registerObject("switchOperationalCorr", switchOperationalCorr);
		isApplicableMatch.registerObject("routeRepairCorr", routeRepairCorr);
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("switchFailedCorr", switchFailedCorr);
		isApplicableMatch.registerObject("trgRouteOperational", trgRouteOperational);
		isApplicableMatch.registerObject("routeFailedCorr", routeFailedCorr);
		isApplicableMatch.registerObject("routeOperationalCorr", routeOperationalCorr);
		isApplicableMatch.registerObject("srcSwitchPosition", srcSwitchPosition);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("trgRouteRepair", trgRouteRepair);
		isApplicableMatch.registerObject("srcSwitch", srcSwitch);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgPetrinet,
			EObject trgSwitchFailedToRouteFail, EObject trgRouteFailed, EObject trgSwitchFailed,
			EObject trgSwitchOperationalToRouteRepair, EObject trgRouteFailToSwitchFailed, EObject trgSwitchOperational,
			EObject switchOperationalCorr, EObject trgRouteFail, EObject routeRepairCorr, EObject containerCorr,
			EObject switchFailedCorr, EObject trgRouteOperational, EObject routeFailedCorr,
			EObject routeOperationalCorr, EObject trgRouteRepairToSwitchOperational, EObject trgRouteFailToRouteFailed,
			EObject srcSwitchPosition, EObject trgRouteOperationalToRouteFail, EObject srcContainer, EObject srcRoute,
			EObject trgRouteRepair, EObject srcSwitch) {
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgSwitchFailedToRouteFail", trgSwitchFailedToRouteFail);
		ruleresult.registerObject("trgRouteFailed", trgRouteFailed);
		ruleresult.registerObject("trgSwitchFailed", trgSwitchFailed);
		ruleresult.registerObject("trgSwitchOperationalToRouteRepair", trgSwitchOperationalToRouteRepair);
		ruleresult.registerObject("trgRouteFailToSwitchFailed", trgRouteFailToSwitchFailed);
		ruleresult.registerObject("trgSwitchOperational", trgSwitchOperational);
		ruleresult.registerObject("switchOperationalCorr", switchOperationalCorr);
		ruleresult.registerObject("trgRouteFail", trgRouteFail);
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("switchFailedCorr", switchFailedCorr);
		ruleresult.registerObject("trgRouteOperational", trgRouteOperational);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("trgRouteRepairToSwitchOperational", trgRouteRepairToSwitchOperational);
		ruleresult.registerObject("trgRouteFailToRouteFailed", trgRouteFailToRouteFailed);
		ruleresult.registerObject("srcSwitchPosition", srcSwitchPosition);
		ruleresult.registerObject("trgRouteOperationalToRouteFail", trgRouteOperationalToRouteFail);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("trgRouteRepair", trgRouteRepair);
		ruleresult.registerObject("srcSwitch", srcSwitch);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_19(EMoflonEdge _edge_follows) {

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
			SwitchPosition srcSwitchPosition = (SwitchPosition) result2_black[0];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[1];
			Route srcRoute = (Route) result2_black[2];
			Switch srcSwitch = (Switch) result2_black[3];
			Object[] result2_green = RequiredSwitchImpl
					.pattern_RequiredSwitch_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RequiredSwitchImpl
					.pattern_RequiredSwitch_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch)) {
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

		if (!__helper.hasExpectedValue("trgSwitchFailedToRouteFail", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSwitchOperationalToRouteRepair", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToSwitchFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteRepairToSwitchOperational", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToRouteFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteOperationalToRouteFail", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
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
	public boolean checkDEC_FWD(SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute,
			Switch srcSwitch) {// 
		Object[] result1_black = RequiredSwitchImpl.pattern_RequiredSwitch_13_1_matchtggpattern_blackBBBB(
				srcSwitchPosition, srcContainer, srcRoute, srcSwitch);
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
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_FWD__MATCH_SWITCHPOSITION_RAILWAYCONTAINER_ROUTE_SWITCH:
			return isAppropriate_FWD((Match) arguments.get(0), (SwitchPosition) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Route) arguments.get(3), (Switch) arguments.get(4));
		case RulesPackage.REQUIRED_SWITCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SWITCHPOSITION_RAILWAYCONTAINER_ROUTE_SWITCH:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SwitchPosition) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Route) arguments.get(3), (Switch) arguments.get(4));
			return null;
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SWITCHPOSITION_RAILWAYCONTAINER_ROUTE_SWITCH:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SwitchPosition) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Route) arguments.get(3), (Switch) arguments.get(4));
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PETRINET_PLACE_PLACE_PLACE_SWITCHTOOPERATIONAL_ROUTETOREPAIR_RAILWAYCONTAINERTOPETRINET_SWITCHTOFAILED_PLACE_ROUTETOFAILED_ROUTETOOPERATIONAL_SWITCHPOSITION_RAILWAYCONTAINER_ROUTE_TRANSITION_SWITCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PetriNet) arguments.get(1),
					(Place) arguments.get(2), (Place) arguments.get(3), (Place) arguments.get(4),
					(SwitchToOperational) arguments.get(5), (RouteToRepair) arguments.get(6),
					(RailwayContainerToPetriNet) arguments.get(7), (SwitchToFailed) arguments.get(8),
					(Place) arguments.get(9), (RouteToFailed) arguments.get(10), (RouteToOperational) arguments.get(11),
					(SwitchPosition) arguments.get(12), (RailwayContainer) arguments.get(13), (Route) arguments.get(14),
					(Transition) arguments.get(15), (Switch) arguments.get(16));
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
		case RulesPackage.REQUIRED_SWITCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_19__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_19((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SWITCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQUIRED_SWITCH___CHECK_DEC_FWD__SWITCHPOSITION_RAILWAYCONTAINER_ROUTE_SWITCH:
			return checkDEC_FWD((SwitchPosition) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Route) arguments.get(2), (Switch) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RequiredSwitch_0_1_initialbindings_blackBBBBBB(RequiredSwitch _this,
			Match match, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute,
			Switch srcSwitch) {
		return new Object[] { _this, match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch };
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_bindingFBBBBBB(RequiredSwitch _this, Match match,
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute, Switch srcSwitch) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSwitchPosition, srcContainer, srcRoute,
				srcSwitch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSwitch_0_2_SolveCSP_bindingAndBlackFBBBBBB(RequiredSwitch _this,
			Match match, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute,
			Switch srcSwitch) {
		Object[] result_pattern_RequiredSwitch_0_2_SolveCSP_binding = pattern_RequiredSwitch_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch);
		if (result_pattern_RequiredSwitch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSwitch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RequiredSwitch_0_2_SolveCSP_black = pattern_RequiredSwitch_0_2_SolveCSP_blackB(csp);
			if (result_pattern_RequiredSwitch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch };
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
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute, Switch srcSwitch) {
		return new Object[] { match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch };
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
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute, Switch srcSwitch) {
		return new Object[] { match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch };
	}

	public static final Object[] pattern_RequiredSwitch_0_5_collectcontextelements_greenBBBBBFFF(Match match,
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute, Switch srcSwitch) {
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcSwitchPosition);
		match.getContextNodes().add(srcContainer);
		match.getContextNodes().add(srcRoute);
		match.getContextNodes().add(srcSwitch);
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
		return new Object[] { match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch,
				srcSwitchPosition__srcSwitch____target, srcSwitch__srcSwitchPosition____positions,
				srcContainer__srcRoute____routes };
	}

	public static final void pattern_RequiredSwitch_0_6_registerobjectstomatch_expressionBBBBBB(RequiredSwitch _this,
			Match match, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute,
			Switch srcSwitch) {
		_this.registerObjectsToMatch_FWD(match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgRouteFailed");
		EObject _localVariable_2 = isApplicableMatch.getObject("trgSwitchFailed");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgSwitchOperational");
		EObject _localVariable_4 = isApplicableMatch.getObject("switchOperationalCorr");
		EObject _localVariable_5 = isApplicableMatch.getObject("routeRepairCorr");
		EObject _localVariable_6 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_7 = isApplicableMatch.getObject("switchFailedCorr");
		EObject _localVariable_8 = isApplicableMatch.getObject("trgRouteOperational");
		EObject _localVariable_9 = isApplicableMatch.getObject("routeFailedCorr");
		EObject _localVariable_10 = isApplicableMatch.getObject("routeOperationalCorr");
		EObject _localVariable_11 = isApplicableMatch.getObject("srcSwitchPosition");
		EObject _localVariable_12 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_13 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_14 = isApplicableMatch.getObject("trgRouteRepair");
		EObject _localVariable_15 = isApplicableMatch.getObject("srcSwitch");
		EObject tmpTrgPetrinet = _localVariable_0;
		EObject tmpTrgRouteFailed = _localVariable_1;
		EObject tmpTrgSwitchFailed = _localVariable_2;
		EObject tmpTrgSwitchOperational = _localVariable_3;
		EObject tmpSwitchOperationalCorr = _localVariable_4;
		EObject tmpRouteRepairCorr = _localVariable_5;
		EObject tmpContainerCorr = _localVariable_6;
		EObject tmpSwitchFailedCorr = _localVariable_7;
		EObject tmpTrgRouteOperational = _localVariable_8;
		EObject tmpRouteFailedCorr = _localVariable_9;
		EObject tmpRouteOperationalCorr = _localVariable_10;
		EObject tmpSrcSwitchPosition = _localVariable_11;
		EObject tmpSrcContainer = _localVariable_12;
		EObject tmpSrcRoute = _localVariable_13;
		EObject tmpTrgRouteRepair = _localVariable_14;
		EObject tmpSrcSwitch = _localVariable_15;
		if (tmpTrgPetrinet instanceof PetriNet) {
			PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
			if (tmpTrgRouteFailed instanceof Place) {
				Place trgRouteFailed = (Place) tmpTrgRouteFailed;
				if (tmpTrgSwitchFailed instanceof Place) {
					Place trgSwitchFailed = (Place) tmpTrgSwitchFailed;
					if (tmpTrgSwitchOperational instanceof Place) {
						Place trgSwitchOperational = (Place) tmpTrgSwitchOperational;
						if (tmpSwitchOperationalCorr instanceof SwitchToOperational) {
							SwitchToOperational switchOperationalCorr = (SwitchToOperational) tmpSwitchOperationalCorr;
							if (tmpRouteRepairCorr instanceof RouteToRepair) {
								RouteToRepair routeRepairCorr = (RouteToRepair) tmpRouteRepairCorr;
								if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
									RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
									if (tmpSwitchFailedCorr instanceof SwitchToFailed) {
										SwitchToFailed switchFailedCorr = (SwitchToFailed) tmpSwitchFailedCorr;
										if (tmpTrgRouteOperational instanceof Place) {
											Place trgRouteOperational = (Place) tmpTrgRouteOperational;
											if (tmpRouteFailedCorr instanceof RouteToFailed) {
												RouteToFailed routeFailedCorr = (RouteToFailed) tmpRouteFailedCorr;
												if (tmpRouteOperationalCorr instanceof RouteToOperational) {
													RouteToOperational routeOperationalCorr = (RouteToOperational) tmpRouteOperationalCorr;
													if (tmpSrcSwitchPosition instanceof SwitchPosition) {
														SwitchPosition srcSwitchPosition = (SwitchPosition) tmpSrcSwitchPosition;
														if (tmpSrcContainer instanceof RailwayContainer) {
															RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
															if (tmpSrcRoute instanceof Route) {
																Route srcRoute = (Route) tmpSrcRoute;
																if (tmpTrgRouteRepair instanceof Transition) {
																	Transition trgRouteRepair = (Transition) tmpTrgRouteRepair;
																	if (tmpSrcSwitch instanceof Switch) {
																		Switch srcSwitch = (Switch) tmpSrcSwitch;
																		return new Object[] { trgPetrinet,
																				trgRouteFailed, trgSwitchFailed,
																				trgSwitchOperational,
																				switchOperationalCorr, routeRepairCorr,
																				containerCorr, switchFailedCorr,
																				trgRouteOperational, routeFailedCorr,
																				routeOperationalCorr, srcSwitchPosition,
																				srcContainer, srcRoute, trgRouteRepair,
																				srcSwitch, isApplicableMatch };
																	}
																}
															}
														}
													}
												}
											}
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
			PetriNet trgPetrinet, Place trgRouteFailed, Place trgSwitchFailed, Place trgSwitchOperational,
			SwitchToOperational switchOperationalCorr, RouteToRepair routeRepairCorr,
			RailwayContainerToPetriNet containerCorr, SwitchToFailed switchFailedCorr, Place trgRouteOperational,
			RouteToFailed routeFailedCorr, RouteToOperational routeOperationalCorr, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer, Route srcRoute, Transition trgRouteRepair, Switch srcSwitch,
			RequiredSwitch _this, IsApplicableMatch isApplicableMatch) {
		if (!trgRouteFailed.equals(trgSwitchFailed)) {
			if (!trgRouteFailed.equals(trgSwitchOperational)) {
				if (!trgRouteFailed.equals(trgRouteOperational)) {
					if (!trgSwitchFailed.equals(trgSwitchOperational)) {
						if (!trgRouteOperational.equals(trgSwitchFailed)) {
							if (!trgRouteOperational.equals(trgSwitchOperational)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { trgPetrinet, trgRouteFailed, trgSwitchFailed,
												trgSwitchOperational, switchOperationalCorr, routeRepairCorr,
												containerCorr, switchFailedCorr, trgRouteOperational, routeFailedCorr,
												routeOperationalCorr, srcSwitchPosition, srcContainer, srcRoute,
												trgRouteRepair, srcSwitch, csp, _this, isApplicableMatch };
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
			PetriNet trgPetrinet = (PetriNet) result_pattern_RequiredSwitch_1_1_performtransformation_binding[0];
			Place trgRouteFailed = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[1];
			Place trgSwitchFailed = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[2];
			Place trgSwitchOperational = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[3];
			SwitchToOperational switchOperationalCorr = (SwitchToOperational) result_pattern_RequiredSwitch_1_1_performtransformation_binding[4];
			RouteToRepair routeRepairCorr = (RouteToRepair) result_pattern_RequiredSwitch_1_1_performtransformation_binding[5];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_RequiredSwitch_1_1_performtransformation_binding[6];
			SwitchToFailed switchFailedCorr = (SwitchToFailed) result_pattern_RequiredSwitch_1_1_performtransformation_binding[7];
			Place trgRouteOperational = (Place) result_pattern_RequiredSwitch_1_1_performtransformation_binding[8];
			RouteToFailed routeFailedCorr = (RouteToFailed) result_pattern_RequiredSwitch_1_1_performtransformation_binding[9];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result_pattern_RequiredSwitch_1_1_performtransformation_binding[10];
			SwitchPosition srcSwitchPosition = (SwitchPosition) result_pattern_RequiredSwitch_1_1_performtransformation_binding[11];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_RequiredSwitch_1_1_performtransformation_binding[12];
			Route srcRoute = (Route) result_pattern_RequiredSwitch_1_1_performtransformation_binding[13];
			Transition trgRouteRepair = (Transition) result_pattern_RequiredSwitch_1_1_performtransformation_binding[14];
			Switch srcSwitch = (Switch) result_pattern_RequiredSwitch_1_1_performtransformation_binding[15];

			Object[] result_pattern_RequiredSwitch_1_1_performtransformation_black = pattern_RequiredSwitch_1_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
					trgPetrinet, trgRouteFailed, trgSwitchFailed, trgSwitchOperational, switchOperationalCorr,
					routeRepairCorr, containerCorr, switchFailedCorr, trgRouteOperational, routeFailedCorr,
					routeOperationalCorr, srcSwitchPosition, srcContainer, srcRoute, trgRouteRepair, srcSwitch, _this,
					isApplicableMatch);
			if (result_pattern_RequiredSwitch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RequiredSwitch_1_1_performtransformation_black[16];

				return new Object[] { trgPetrinet, trgRouteFailed, trgSwitchFailed, trgSwitchOperational,
						switchOperationalCorr, routeRepairCorr, containerCorr, switchFailedCorr, trgRouteOperational,
						routeFailedCorr, routeOperationalCorr, srcSwitchPosition, srcContainer, srcRoute,
						trgRouteRepair, srcSwitch, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_1_1_performtransformation_greenBFBBFFBFBFFFB(
			PetriNet trgPetrinet, Place trgRouteFailed, Place trgSwitchFailed, Place trgSwitchOperational,
			Place trgRouteOperational, Transition trgRouteRepair) {
		Arc trgSwitchFailedToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSwitchOperationalToRouteRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToSwitchFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		ImmediateTransition trgRouteFail = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		Arc trgRouteRepairToSwitchOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToRouteFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteOperationalToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		ArcKind trgSwitchFailedToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgSwitchOperationalToRouteRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteFailToSwitchFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteRepairToSwitchOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteFailToRouteFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteOperationalToRouteFail_kind_prime = ArcKind.INPUT;
		trgSwitchFailedToRouteFail.setPlace(trgSwitchFailed);
		trgSwitchOperationalToRouteRepair.setPlace(trgSwitchOperational);
		trgSwitchOperationalToRouteRepair.setTransition(trgRouteRepair);
		trgRouteFailToSwitchFailed.setPlace(trgSwitchFailed);
		trgRouteFail.setPetriNet(trgPetrinet);
		trgSwitchFailedToRouteFail.setTransition(trgRouteFail);
		trgRouteFailToSwitchFailed.setTransition(trgRouteFail);
		trgRouteRepairToSwitchOperational.setPlace(trgSwitchOperational);
		trgRouteRepairToSwitchOperational.setTransition(trgRouteRepair);
		trgRouteFailToRouteFailed.setTransition(trgRouteFail);
		trgRouteFailToRouteFailed.setPlace(trgRouteFailed);
		trgRouteOperationalToRouteFail.setTransition(trgRouteFail);
		trgRouteOperationalToRouteFail.setPlace(trgRouteOperational);
		trgSwitchFailedToRouteFail.setKind(trgSwitchFailedToRouteFail_kind_prime);
		trgSwitchOperationalToRouteRepair.setKind(trgSwitchOperationalToRouteRepair_kind_prime);
		trgRouteFailToSwitchFailed.setKind(trgRouteFailToSwitchFailed_kind_prime);
		trgRouteRepairToSwitchOperational.setKind(trgRouteRepairToSwitchOperational_kind_prime);
		trgRouteFailToRouteFailed.setKind(trgRouteFailToRouteFailed_kind_prime);
		trgRouteOperationalToRouteFail.setKind(trgRouteOperationalToRouteFail_kind_prime);
		return new Object[] { trgPetrinet, trgSwitchFailedToRouteFail, trgRouteFailed, trgSwitchFailed,
				trgSwitchOperationalToRouteRepair, trgRouteFailToSwitchFailed, trgSwitchOperational, trgRouteFail,
				trgRouteOperational, trgRouteRepairToSwitchOperational, trgRouteFailToRouteFailed,
				trgRouteOperationalToRouteFail, trgRouteRepair };
	}

	public static final Object[] pattern_RequiredSwitch_1_2_collecttranslatedelements_blackBBBBBBB(
			Arc trgSwitchFailedToRouteFail, Arc trgSwitchOperationalToRouteRepair, Arc trgRouteFailToSwitchFailed,
			ImmediateTransition trgRouteFail, Arc trgRouteRepairToSwitchOperational, Arc trgRouteFailToRouteFailed,
			Arc trgRouteOperationalToRouteFail) {
		if (!trgSwitchFailedToRouteFail.equals(trgSwitchOperationalToRouteRepair)) {
			if (!trgRouteFailToSwitchFailed.equals(trgSwitchFailedToRouteFail)) {
				if (!trgRouteFailToSwitchFailed.equals(trgSwitchOperationalToRouteRepair)) {
					if (!trgRouteFailToSwitchFailed.equals(trgRouteRepairToSwitchOperational)) {
						if (!trgRouteFailToSwitchFailed.equals(trgRouteOperationalToRouteFail)) {
							if (!trgRouteRepairToSwitchOperational.equals(trgSwitchFailedToRouteFail)) {
								if (!trgRouteRepairToSwitchOperational.equals(trgSwitchOperationalToRouteRepair)) {
									if (!trgRouteFailToRouteFailed.equals(trgSwitchFailedToRouteFail)) {
										if (!trgRouteFailToRouteFailed.equals(trgSwitchOperationalToRouteRepair)) {
											if (!trgRouteFailToRouteFailed.equals(trgRouteFailToSwitchFailed)) {
												if (!trgRouteFailToRouteFailed
														.equals(trgRouteRepairToSwitchOperational)) {
													if (!trgRouteFailToRouteFailed
															.equals(trgRouteOperationalToRouteFail)) {
														if (!trgRouteOperationalToRouteFail
																.equals(trgSwitchFailedToRouteFail)) {
															if (!trgRouteOperationalToRouteFail
																	.equals(trgSwitchOperationalToRouteRepair)) {
																if (!trgRouteOperationalToRouteFail
																		.equals(trgRouteRepairToSwitchOperational)) {
																	return new Object[] { trgSwitchFailedToRouteFail,
																			trgSwitchOperationalToRouteRepair,
																			trgRouteFailToSwitchFailed, trgRouteFail,
																			trgRouteRepairToSwitchOperational,
																			trgRouteFailToRouteFailed,
																			trgRouteOperationalToRouteFail };
																}
															}
														}
													}
												}
											}
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
			Arc trgSwitchFailedToRouteFail, Arc trgSwitchOperationalToRouteRepair, Arc trgRouteFailToSwitchFailed,
			ImmediateTransition trgRouteFail, Arc trgRouteRepairToSwitchOperational, Arc trgRouteFailToRouteFailed,
			Arc trgRouteOperationalToRouteFail) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgSwitchFailedToRouteFail);
		ruleresult.getCreatedElements().add(trgSwitchOperationalToRouteRepair);
		ruleresult.getCreatedElements().add(trgRouteFailToSwitchFailed);
		ruleresult.getCreatedElements().add(trgRouteFail);
		ruleresult.getCreatedElements().add(trgRouteRepairToSwitchOperational);
		ruleresult.getCreatedElements().add(trgRouteFailToRouteFailed);
		ruleresult.getCreatedElements().add(trgRouteOperationalToRouteFail);
		return new Object[] { ruleresult, trgSwitchFailedToRouteFail, trgSwitchOperationalToRouteRepair,
				trgRouteFailToSwitchFailed, trgRouteFail, trgRouteRepairToSwitchOperational, trgRouteFailToRouteFailed,
				trgRouteOperationalToRouteFail };
	}

	public static final Object[] pattern_RequiredSwitch_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject trgPetrinet, EObject trgSwitchFailedToRouteFail,
			EObject trgRouteFailed, EObject trgSwitchFailed, EObject trgSwitchOperationalToRouteRepair,
			EObject trgRouteFailToSwitchFailed, EObject trgSwitchOperational, EObject switchOperationalCorr,
			EObject trgRouteFail, EObject routeRepairCorr, EObject containerCorr, EObject switchFailedCorr,
			EObject trgRouteOperational, EObject routeFailedCorr, EObject routeOperationalCorr,
			EObject trgRouteRepairToSwitchOperational, EObject trgRouteFailToRouteFailed, EObject srcSwitchPosition,
			EObject trgRouteOperationalToRouteFail, EObject srcContainer, EObject srcRoute, EObject trgRouteRepair,
			EObject srcSwitch) {
		if (!trgPetrinet.equals(trgSwitchFailedToRouteFail)) {
			if (!trgPetrinet.equals(trgRouteFailed)) {
				if (!trgPetrinet.equals(trgSwitchFailed)) {
					if (!trgPetrinet.equals(trgSwitchOperationalToRouteRepair)) {
						if (!trgPetrinet.equals(trgRouteFailToSwitchFailed)) {
							if (!trgPetrinet.equals(trgSwitchOperational)) {
								if (!trgPetrinet.equals(trgRouteFail)) {
									if (!trgPetrinet.equals(trgRouteOperational)) {
										if (!trgPetrinet.equals(trgRouteRepairToSwitchOperational)) {
											if (!trgPetrinet.equals(trgRouteFailToRouteFailed)) {
												if (!trgPetrinet.equals(trgRouteOperationalToRouteFail)) {
													if (!trgPetrinet.equals(trgRouteRepair)) {
														if (!trgSwitchFailedToRouteFail
																.equals(trgSwitchOperationalToRouteRepair)) {
															if (!trgSwitchFailedToRouteFail
																	.equals(trgSwitchOperational)) {
																if (!trgRouteFailed
																		.equals(trgSwitchFailedToRouteFail)) {
																	if (!trgRouteFailed.equals(trgSwitchFailed)) {
																		if (!trgRouteFailed.equals(
																				trgSwitchOperationalToRouteRepair)) {
																			if (!trgRouteFailed
																					.equals(trgSwitchOperational)) {
																				if (!trgRouteFailed
																						.equals(trgRouteOperational)) {
																					if (!trgRouteFailed.equals(
																							trgRouteRepairToSwitchOperational)) {
																						if (!trgRouteFailed.equals(
																								trgRouteOperationalToRouteFail)) {
																							if (!trgRouteFailed.equals(
																									trgRouteRepair)) {
																								if (!trgSwitchFailed
																										.equals(trgSwitchFailedToRouteFail)) {
																									if (!trgSwitchFailed
																											.equals(trgSwitchOperationalToRouteRepair)) {
																										if (!trgSwitchFailed
																												.equals(trgSwitchOperational)) {
																											if (!trgRouteFailToSwitchFailed
																													.equals(trgSwitchFailedToRouteFail)) {
																												if (!trgRouteFailToSwitchFailed
																														.equals(trgRouteFailed)) {
																													if (!trgRouteFailToSwitchFailed
																															.equals(trgSwitchFailed)) {
																														if (!trgRouteFailToSwitchFailed
																																.equals(trgSwitchOperationalToRouteRepair)) {
																															if (!trgRouteFailToSwitchFailed
																																	.equals(trgSwitchOperational)) {
																																if (!trgRouteFailToSwitchFailed
																																		.equals(trgRouteOperational)) {
																																	if (!trgRouteFailToSwitchFailed
																																			.equals(trgRouteRepairToSwitchOperational)) {
																																		if (!trgRouteFailToSwitchFailed
																																				.equals(trgRouteOperationalToRouteFail)) {
																																			if (!trgRouteFailToSwitchFailed
																																					.equals(trgRouteRepair)) {
																																				if (!trgSwitchOperational
																																						.equals(trgSwitchOperationalToRouteRepair)) {
																																					if (!switchOperationalCorr
																																							.equals(trgPetrinet)) {
																																						if (!switchOperationalCorr
																																								.equals(trgSwitchFailedToRouteFail)) {
																																							if (!switchOperationalCorr
																																									.equals(trgRouteFailed)) {
																																								if (!switchOperationalCorr
																																										.equals(trgSwitchFailed)) {
																																									if (!switchOperationalCorr
																																											.equals(trgSwitchOperationalToRouteRepair)) {
																																										if (!switchOperationalCorr
																																												.equals(trgRouteFailToSwitchFailed)) {
																																											if (!switchOperationalCorr
																																													.equals(trgSwitchOperational)) {
																																												if (!switchOperationalCorr
																																														.equals(trgRouteFail)) {
																																													if (!switchOperationalCorr
																																															.equals(trgRouteOperational)) {
																																														if (!switchOperationalCorr
																																																.equals(trgRouteRepairToSwitchOperational)) {
																																															if (!switchOperationalCorr
																																																	.equals(trgRouteFailToRouteFailed)) {
																																																if (!switchOperationalCorr
																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																	if (!switchOperationalCorr
																																																			.equals(trgRouteRepair)) {
																																																		if (!trgRouteFail
																																																				.equals(trgSwitchFailedToRouteFail)) {
																																																			if (!trgRouteFail
																																																					.equals(trgRouteFailed)) {
																																																				if (!trgRouteFail
																																																						.equals(trgSwitchFailed)) {
																																																					if (!trgRouteFail
																																																							.equals(trgSwitchOperationalToRouteRepair)) {
																																																						if (!trgRouteFail
																																																								.equals(trgRouteFailToSwitchFailed)) {
																																																							if (!trgRouteFail
																																																									.equals(trgSwitchOperational)) {
																																																								if (!trgRouteFail
																																																										.equals(trgRouteOperational)) {
																																																									if (!trgRouteFail
																																																											.equals(trgRouteRepairToSwitchOperational)) {
																																																										if (!trgRouteFail
																																																												.equals(trgRouteFailToRouteFailed)) {
																																																											if (!trgRouteFail
																																																													.equals(trgRouteOperationalToRouteFail)) {
																																																												if (!trgRouteFail
																																																														.equals(trgRouteRepair)) {
																																																													if (!routeRepairCorr
																																																															.equals(trgPetrinet)) {
																																																														if (!routeRepairCorr
																																																																.equals(trgSwitchFailedToRouteFail)) {
																																																															if (!routeRepairCorr
																																																																	.equals(trgRouteFailed)) {
																																																																if (!routeRepairCorr
																																																																		.equals(trgSwitchFailed)) {
																																																																	if (!routeRepairCorr
																																																																			.equals(trgSwitchOperationalToRouteRepair)) {
																																																																		if (!routeRepairCorr
																																																																				.equals(trgRouteFailToSwitchFailed)) {
																																																																			if (!routeRepairCorr
																																																																					.equals(trgSwitchOperational)) {
																																																																				if (!routeRepairCorr
																																																																						.equals(switchOperationalCorr)) {
																																																																					if (!routeRepairCorr
																																																																							.equals(trgRouteFail)) {
																																																																						if (!routeRepairCorr
																																																																								.equals(switchFailedCorr)) {
																																																																							if (!routeRepairCorr
																																																																									.equals(trgRouteOperational)) {
																																																																								if (!routeRepairCorr
																																																																										.equals(trgRouteRepairToSwitchOperational)) {
																																																																									if (!routeRepairCorr
																																																																											.equals(trgRouteFailToRouteFailed)) {
																																																																										if (!routeRepairCorr
																																																																												.equals(srcSwitchPosition)) {
																																																																											if (!routeRepairCorr
																																																																													.equals(trgRouteOperationalToRouteFail)) {
																																																																												if (!routeRepairCorr
																																																																														.equals(srcContainer)) {
																																																																													if (!routeRepairCorr
																																																																															.equals(srcRoute)) {
																																																																														if (!routeRepairCorr
																																																																																.equals(trgRouteRepair)) {
																																																																															if (!routeRepairCorr
																																																																																	.equals(srcSwitch)) {
																																																																																if (!containerCorr
																																																																																		.equals(trgPetrinet)) {
																																																																																	if (!containerCorr
																																																																																			.equals(trgSwitchFailedToRouteFail)) {
																																																																																		if (!containerCorr
																																																																																				.equals(trgRouteFailed)) {
																																																																																			if (!containerCorr
																																																																																					.equals(trgSwitchFailed)) {
																																																																																				if (!containerCorr
																																																																																						.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																					if (!containerCorr
																																																																																							.equals(trgRouteFailToSwitchFailed)) {
																																																																																						if (!containerCorr
																																																																																								.equals(trgSwitchOperational)) {
																																																																																							if (!containerCorr
																																																																																									.equals(switchOperationalCorr)) {
																																																																																								if (!containerCorr
																																																																																										.equals(trgRouteFail)) {
																																																																																									if (!containerCorr
																																																																																											.equals(routeRepairCorr)) {
																																																																																										if (!containerCorr
																																																																																												.equals(switchFailedCorr)) {
																																																																																											if (!containerCorr
																																																																																													.equals(trgRouteOperational)) {
																																																																																												if (!containerCorr
																																																																																														.equals(routeFailedCorr)) {
																																																																																													if (!containerCorr
																																																																																															.equals(routeOperationalCorr)) {
																																																																																														if (!containerCorr
																																																																																																.equals(trgRouteRepairToSwitchOperational)) {
																																																																																															if (!containerCorr
																																																																																																	.equals(trgRouteFailToRouteFailed)) {
																																																																																																if (!containerCorr
																																																																																																		.equals(srcSwitchPosition)) {
																																																																																																	if (!containerCorr
																																																																																																			.equals(trgRouteOperationalToRouteFail)) {
																																																																																																		if (!containerCorr
																																																																																																				.equals(srcContainer)) {
																																																																																																			if (!containerCorr
																																																																																																					.equals(srcRoute)) {
																																																																																																				if (!containerCorr
																																																																																																						.equals(trgRouteRepair)) {
																																																																																																					if (!containerCorr
																																																																																																							.equals(srcSwitch)) {
																																																																																																						if (!switchFailedCorr
																																																																																																								.equals(trgPetrinet)) {
																																																																																																							if (!switchFailedCorr
																																																																																																									.equals(trgSwitchFailedToRouteFail)) {
																																																																																																								if (!switchFailedCorr
																																																																																																										.equals(trgRouteFailed)) {
																																																																																																									if (!switchFailedCorr
																																																																																																											.equals(trgSwitchFailed)) {
																																																																																																										if (!switchFailedCorr
																																																																																																												.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																											if (!switchFailedCorr
																																																																																																													.equals(trgRouteFailToSwitchFailed)) {
																																																																																																												if (!switchFailedCorr
																																																																																																														.equals(trgSwitchOperational)) {
																																																																																																													if (!switchFailedCorr
																																																																																																															.equals(switchOperationalCorr)) {
																																																																																																														if (!switchFailedCorr
																																																																																																																.equals(trgRouteFail)) {
																																																																																																															if (!switchFailedCorr
																																																																																																																	.equals(trgRouteOperational)) {
																																																																																																																if (!switchFailedCorr
																																																																																																																		.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																	if (!switchFailedCorr
																																																																																																																			.equals(trgRouteFailToRouteFailed)) {
																																																																																																																		if (!switchFailedCorr
																																																																																																																				.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																			if (!switchFailedCorr
																																																																																																																					.equals(trgRouteRepair)) {
																																																																																																																				if (!trgRouteOperational
																																																																																																																						.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																					if (!trgRouteOperational
																																																																																																																							.equals(trgSwitchFailed)) {
																																																																																																																						if (!trgRouteOperational
																																																																																																																								.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																							if (!trgRouteOperational
																																																																																																																									.equals(trgSwitchOperational)) {
																																																																																																																								if (!trgRouteOperational
																																																																																																																										.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																									if (!trgRouteOperational
																																																																																																																											.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																										if (!trgRouteOperational
																																																																																																																												.equals(trgRouteRepair)) {
																																																																																																																											if (!routeFailedCorr
																																																																																																																													.equals(trgPetrinet)) {
																																																																																																																												if (!routeFailedCorr
																																																																																																																														.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																													if (!routeFailedCorr
																																																																																																																															.equals(trgRouteFailed)) {
																																																																																																																														if (!routeFailedCorr
																																																																																																																																.equals(trgSwitchFailed)) {
																																																																																																																															if (!routeFailedCorr
																																																																																																																																	.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																if (!routeFailedCorr
																																																																																																																																		.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																	if (!routeFailedCorr
																																																																																																																																			.equals(trgSwitchOperational)) {
																																																																																																																																		if (!routeFailedCorr
																																																																																																																																				.equals(switchOperationalCorr)) {
																																																																																																																																			if (!routeFailedCorr
																																																																																																																																					.equals(trgRouteFail)) {
																																																																																																																																				if (!routeFailedCorr
																																																																																																																																						.equals(routeRepairCorr)) {
																																																																																																																																					if (!routeFailedCorr
																																																																																																																																							.equals(switchFailedCorr)) {
																																																																																																																																						if (!routeFailedCorr
																																																																																																																																								.equals(trgRouteOperational)) {
																																																																																																																																							if (!routeFailedCorr
																																																																																																																																									.equals(routeOperationalCorr)) {
																																																																																																																																								if (!routeFailedCorr
																																																																																																																																										.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																									if (!routeFailedCorr
																																																																																																																																											.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																										if (!routeFailedCorr
																																																																																																																																												.equals(srcSwitchPosition)) {
																																																																																																																																											if (!routeFailedCorr
																																																																																																																																													.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																												if (!routeFailedCorr
																																																																																																																																														.equals(srcContainer)) {
																																																																																																																																													if (!routeFailedCorr
																																																																																																																																															.equals(srcRoute)) {
																																																																																																																																														if (!routeFailedCorr
																																																																																																																																																.equals(trgRouteRepair)) {
																																																																																																																																															if (!routeFailedCorr
																																																																																																																																																	.equals(srcSwitch)) {
																																																																																																																																																if (!routeOperationalCorr
																																																																																																																																																		.equals(trgPetrinet)) {
																																																																																																																																																	if (!routeOperationalCorr
																																																																																																																																																			.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																		if (!routeOperationalCorr
																																																																																																																																																				.equals(trgRouteFailed)) {
																																																																																																																																																			if (!routeOperationalCorr
																																																																																																																																																					.equals(trgSwitchFailed)) {
																																																																																																																																																				if (!routeOperationalCorr
																																																																																																																																																						.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																					if (!routeOperationalCorr
																																																																																																																																																							.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																						if (!routeOperationalCorr
																																																																																																																																																								.equals(trgSwitchOperational)) {
																																																																																																																																																							if (!routeOperationalCorr
																																																																																																																																																									.equals(switchOperationalCorr)) {
																																																																																																																																																								if (!routeOperationalCorr
																																																																																																																																																										.equals(trgRouteFail)) {
																																																																																																																																																									if (!routeOperationalCorr
																																																																																																																																																											.equals(routeRepairCorr)) {
																																																																																																																																																										if (!routeOperationalCorr
																																																																																																																																																												.equals(switchFailedCorr)) {
																																																																																																																																																											if (!routeOperationalCorr
																																																																																																																																																													.equals(trgRouteOperational)) {
																																																																																																																																																												if (!routeOperationalCorr
																																																																																																																																																														.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																													if (!routeOperationalCorr
																																																																																																																																																															.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																														if (!routeOperationalCorr
																																																																																																																																																																.equals(srcSwitchPosition)) {
																																																																																																																																																															if (!routeOperationalCorr
																																																																																																																																																																	.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																if (!routeOperationalCorr
																																																																																																																																																																		.equals(srcContainer)) {
																																																																																																																																																																	if (!routeOperationalCorr
																																																																																																																																																																			.equals(srcRoute)) {
																																																																																																																																																																		if (!routeOperationalCorr
																																																																																																																																																																				.equals(trgRouteRepair)) {
																																																																																																																																																																			if (!routeOperationalCorr
																																																																																																																																																																					.equals(srcSwitch)) {
																																																																																																																																																																				if (!trgRouteRepairToSwitchOperational
																																																																																																																																																																						.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																					if (!trgRouteRepairToSwitchOperational
																																																																																																																																																																							.equals(trgSwitchFailed)) {
																																																																																																																																																																						if (!trgRouteRepairToSwitchOperational
																																																																																																																																																																								.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																							if (!trgRouteRepairToSwitchOperational
																																																																																																																																																																									.equals(trgSwitchOperational)) {
																																																																																																																																																																								if (!trgRouteFailToRouteFailed
																																																																																																																																																																										.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																									if (!trgRouteFailToRouteFailed
																																																																																																																																																																											.equals(trgRouteFailed)) {
																																																																																																																																																																										if (!trgRouteFailToRouteFailed
																																																																																																																																																																												.equals(trgSwitchFailed)) {
																																																																																																																																																																											if (!trgRouteFailToRouteFailed
																																																																																																																																																																													.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																												if (!trgRouteFailToRouteFailed
																																																																																																																																																																														.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																													if (!trgRouteFailToRouteFailed
																																																																																																																																																																															.equals(trgSwitchOperational)) {
																																																																																																																																																																														if (!trgRouteFailToRouteFailed
																																																																																																																																																																																.equals(trgRouteOperational)) {
																																																																																																																																																																															if (!trgRouteFailToRouteFailed
																																																																																																																																																																																	.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																if (!trgRouteFailToRouteFailed
																																																																																																																																																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																	if (!trgRouteFailToRouteFailed
																																																																																																																																																																																			.equals(trgRouteRepair)) {
																																																																																																																																																																																		if (!srcSwitchPosition
																																																																																																																																																																																				.equals(trgPetrinet)) {
																																																																																																																																																																																			if (!srcSwitchPosition
																																																																																																																																																																																					.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																				if (!srcSwitchPosition
																																																																																																																																																																																						.equals(trgRouteFailed)) {
																																																																																																																																																																																					if (!srcSwitchPosition
																																																																																																																																																																																							.equals(trgSwitchFailed)) {
																																																																																																																																																																																						if (!srcSwitchPosition
																																																																																																																																																																																								.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																							if (!srcSwitchPosition
																																																																																																																																																																																									.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																								if (!srcSwitchPosition
																																																																																																																																																																																										.equals(trgSwitchOperational)) {
																																																																																																																																																																																									if (!srcSwitchPosition
																																																																																																																																																																																											.equals(switchOperationalCorr)) {
																																																																																																																																																																																										if (!srcSwitchPosition
																																																																																																																																																																																												.equals(trgRouteFail)) {
																																																																																																																																																																																											if (!srcSwitchPosition
																																																																																																																																																																																													.equals(switchFailedCorr)) {
																																																																																																																																																																																												if (!srcSwitchPosition
																																																																																																																																																																																														.equals(trgRouteOperational)) {
																																																																																																																																																																																													if (!srcSwitchPosition
																																																																																																																																																																																															.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																														if (!srcSwitchPosition
																																																																																																																																																																																																.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																															if (!srcSwitchPosition
																																																																																																																																																																																																	.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																if (!srcSwitchPosition
																																																																																																																																																																																																		.equals(trgRouteRepair)) {
																																																																																																																																																																																																	if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																			.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																		if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																				.equals(trgSwitchFailed)) {
																																																																																																																																																																																																			if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																					.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																				if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																						.equals(trgSwitchOperational)) {
																																																																																																																																																																																																					if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																							.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																						if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																								.equals(trgRouteRepair)) {
																																																																																																																																																																																																							if (!srcContainer
																																																																																																																																																																																																									.equals(trgPetrinet)) {
																																																																																																																																																																																																								if (!srcContainer
																																																																																																																																																																																																										.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																									if (!srcContainer
																																																																																																																																																																																																											.equals(trgRouteFailed)) {
																																																																																																																																																																																																										if (!srcContainer
																																																																																																																																																																																																												.equals(trgSwitchFailed)) {
																																																																																																																																																																																																											if (!srcContainer
																																																																																																																																																																																																													.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																												if (!srcContainer
																																																																																																																																																																																																														.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																													if (!srcContainer
																																																																																																																																																																																																															.equals(trgSwitchOperational)) {
																																																																																																																																																																																																														if (!srcContainer
																																																																																																																																																																																																																.equals(switchOperationalCorr)) {
																																																																																																																																																																																																															if (!srcContainer
																																																																																																																																																																																																																	.equals(trgRouteFail)) {
																																																																																																																																																																																																																if (!srcContainer
																																																																																																																																																																																																																		.equals(switchFailedCorr)) {
																																																																																																																																																																																																																	if (!srcContainer
																																																																																																																																																																																																																			.equals(trgRouteOperational)) {
																																																																																																																																																																																																																		if (!srcContainer
																																																																																																																																																																																																																				.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																			if (!srcContainer
																																																																																																																																																																																																																					.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																				if (!srcContainer
																																																																																																																																																																																																																						.equals(srcSwitchPosition)) {
																																																																																																																																																																																																																					if (!srcContainer
																																																																																																																																																																																																																							.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																						if (!srcContainer
																																																																																																																																																																																																																								.equals(srcRoute)) {
																																																																																																																																																																																																																							if (!srcContainer
																																																																																																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																																																																																																								if (!srcContainer
																																																																																																																																																																																																																										.equals(srcSwitch)) {
																																																																																																																																																																																																																									if (!srcRoute
																																																																																																																																																																																																																											.equals(trgPetrinet)) {
																																																																																																																																																																																																																										if (!srcRoute
																																																																																																																																																																																																																												.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																											if (!srcRoute
																																																																																																																																																																																																																													.equals(trgRouteFailed)) {
																																																																																																																																																																																																																												if (!srcRoute
																																																																																																																																																																																																																														.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																													if (!srcRoute
																																																																																																																																																																																																																															.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																														if (!srcRoute
																																																																																																																																																																																																																																.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																																															if (!srcRoute
																																																																																																																																																																																																																																	.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																																if (!srcRoute
																																																																																																																																																																																																																																		.equals(switchOperationalCorr)) {
																																																																																																																																																																																																																																	if (!srcRoute
																																																																																																																																																																																																																																			.equals(trgRouteFail)) {
																																																																																																																																																																																																																																		if (!srcRoute
																																																																																																																																																																																																																																				.equals(switchFailedCorr)) {
																																																																																																																																																																																																																																			if (!srcRoute
																																																																																																																																																																																																																																					.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																				if (!srcRoute
																																																																																																																																																																																																																																						.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																																					if (!srcRoute
																																																																																																																																																																																																																																							.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																																						if (!srcRoute
																																																																																																																																																																																																																																								.equals(srcSwitchPosition)) {
																																																																																																																																																																																																																																							if (!srcRoute
																																																																																																																																																																																																																																									.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																								if (!srcRoute
																																																																																																																																																																																																																																										.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																									if (!srcRoute
																																																																																																																																																																																																																																											.equals(srcSwitch)) {
																																																																																																																																																																																																																																										if (!trgRouteRepair
																																																																																																																																																																																																																																												.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																																											if (!trgRouteRepair
																																																																																																																																																																																																																																													.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																																												if (!trgRouteRepair
																																																																																																																																																																																																																																														.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																																													if (!trgRouteRepair
																																																																																																																																																																																																																																															.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																																														if (!trgRouteRepair
																																																																																																																																																																																																																																																.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																																															if (!srcSwitch
																																																																																																																																																																																																																																																	.equals(trgPetrinet)) {
																																																																																																																																																																																																																																																if (!srcSwitch
																																																																																																																																																																																																																																																		.equals(trgSwitchFailedToRouteFail)) {
																																																																																																																																																																																																																																																	if (!srcSwitch
																																																																																																																																																																																																																																																			.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																																		if (!srcSwitch
																																																																																																																																																																																																																																																				.equals(trgSwitchFailed)) {
																																																																																																																																																																																																																																																			if (!srcSwitch
																																																																																																																																																																																																																																																					.equals(trgSwitchOperationalToRouteRepair)) {
																																																																																																																																																																																																																																																				if (!srcSwitch
																																																																																																																																																																																																																																																						.equals(trgRouteFailToSwitchFailed)) {
																																																																																																																																																																																																																																																					if (!srcSwitch
																																																																																																																																																																																																																																																							.equals(trgSwitchOperational)) {
																																																																																																																																																																																																																																																						if (!srcSwitch
																																																																																																																																																																																																																																																								.equals(switchOperationalCorr)) {
																																																																																																																																																																																																																																																							if (!srcSwitch
																																																																																																																																																																																																																																																									.equals(trgRouteFail)) {
																																																																																																																																																																																																																																																								if (!srcSwitch
																																																																																																																																																																																																																																																										.equals(switchFailedCorr)) {
																																																																																																																																																																																																																																																									if (!srcSwitch
																																																																																																																																																																																																																																																											.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																																										if (!srcSwitch
																																																																																																																																																																																																																																																												.equals(trgRouteRepairToSwitchOperational)) {
																																																																																																																																																																																																																																																											if (!srcSwitch
																																																																																																																																																																																																																																																													.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																																																												if (!srcSwitch
																																																																																																																																																																																																																																																														.equals(srcSwitchPosition)) {
																																																																																																																																																																																																																																																													if (!srcSwitch
																																																																																																																																																																																																																																																															.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																																														if (!srcSwitch
																																																																																																																																																																																																																																																																.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																																															return new Object[] {
																																																																																																																																																																																																																																																																	ruleresult,
																																																																																																																																																																																																																																																																	trgPetrinet,
																																																																																																																																																																																																																																																																	trgSwitchFailedToRouteFail,
																																																																																																																																																																																																																																																																	trgRouteFailed,
																																																																																																																																																																																																																																																																	trgSwitchFailed,
																																																																																																																																																																																																																																																																	trgSwitchOperationalToRouteRepair,
																																																																																																																																																																																																																																																																	trgRouteFailToSwitchFailed,
																																																																																																																																																																																																																																																																	trgSwitchOperational,
																																																																																																																																																																																																																																																																	switchOperationalCorr,
																																																																																																																																																																																																																																																																	trgRouteFail,
																																																																																																																																																																																																																																																																	routeRepairCorr,
																																																																																																																																																																																																																																																																	containerCorr,
																																																																																																																																																																																																																																																																	switchFailedCorr,
																																																																																																																																																																																																																																																																	trgRouteOperational,
																																																																																																																																																																																																																																																																	routeFailedCorr,
																																																																																																																																																																																																																																																																	routeOperationalCorr,
																																																																																																																																																																																																																																																																	trgRouteRepairToSwitchOperational,
																																																																																																																																																																																																																																																																	trgRouteFailToRouteFailed,
																																																																																																																																																																																																																																																																	srcSwitchPosition,
																																																																																																																																																																																																																																																																	trgRouteOperationalToRouteFail,
																																																																																																																																																																																																																																																																	srcContainer,
																																																																																																																																																																																																																																																																	srcRoute,
																																																																																																																																																																																																																																																																	trgRouteRepair,
																																																																																																																																																																																																																																																																	srcSwitch };
																																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																															}
																																																																																																																																																																																																																																														}
																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																												}
																																																																																																																																																																																																																																											}
																																																																																																																																																																																																																																										}
																																																																																																																																																																																																																																									}
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject trgPetrinet, EObject trgSwitchFailedToRouteFail,
			EObject trgRouteFailed, EObject trgSwitchFailed, EObject trgSwitchOperationalToRouteRepair,
			EObject trgRouteFailToSwitchFailed, EObject trgSwitchOperational, EObject trgRouteFail,
			EObject trgRouteOperational, EObject trgRouteRepairToSwitchOperational, EObject trgRouteFailToRouteFailed,
			EObject srcSwitchPosition, EObject trgRouteOperationalToRouteFail, EObject srcRoute,
			EObject trgRouteRepair) {
		EMoflonEdge trgRouteFailToSwitchFailed__trgSwitchFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRouteFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchFailedToRouteFail__trgSwitchFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSwitchOperational__trgSwitchOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSwitchOperational__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgRouteRepairToSwitchOperational____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchOperationalToRouteRepair__trgSwitchOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSwitchPosition____follows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcRoute____route = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSwitchOperationalToRouteRepair__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSwitchFailedToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgSwitchFailedToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSwitchFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToSwitchFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RequiredSwitch";
		String trgRouteFailToSwitchFailed__trgSwitchFailed____place_name_prime = "place";
		String trgRouteFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRouteFail____nodes_name_prime = "nodes";
		String trgSwitchFailedToRouteFail__trgSwitchFailed____place_name_prime = "place";
		String trgRouteRepairToSwitchOperational__trgSwitchOperational____place_name_prime = "place";
		String trgRouteRepairToSwitchOperational__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgRouteRepairToSwitchOperational____arcs_name_prime = "arcs";
		String trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime = "arcs";
		String trgSwitchOperationalToRouteRepair__trgSwitchOperational____place_name_prime = "place";
		String trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime = "arcs";
		String trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime = "place";
		String srcRoute__srcSwitchPosition____follows_name_prime = "follows";
		String srcSwitchPosition__srcRoute____route_name_prime = "route";
		String trgSwitchOperationalToRouteRepair__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs_name_prime = "arcs";
		String trgSwitchFailedToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgSwitchFailedToRouteFail____arcs_name_prime = "arcs";
		String trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime = "place";
		String trgRouteFailToSwitchFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToSwitchFailed____arcs_name_prime = "arcs";
		trgRouteFailToSwitchFailed__trgSwitchFailed____place.setSrc(trgRouteFailToSwitchFailed);
		trgRouteFailToSwitchFailed__trgSwitchFailed____place.setTrg(trgSwitchFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToSwitchFailed__trgSwitchFailed____place);
		trgRouteFail__trgPetrinet____petriNet.setSrc(trgRouteFail);
		trgRouteFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgPetrinet____petriNet);
		trgPetrinet__trgRouteFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRouteFail____nodes.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRouteFail____nodes);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place.setSrc(trgSwitchFailedToRouteFail);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place.setTrg(trgSwitchFailed);
		ruleresult.getCreatedEdges().add(trgSwitchFailedToRouteFail__trgSwitchFailed____place);
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place.setSrc(trgRouteRepairToSwitchOperational);
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place.setTrg(trgSwitchOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSwitchOperational__trgSwitchOperational____place);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition.setSrc(trgRouteRepairToSwitchOperational);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSwitchOperational__trgRouteRepair____transition);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs.setTrg(trgRouteRepairToSwitchOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgRouteRepairToSwitchOperational____arcs);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setTrg(trgRouteFailToRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToRouteFailed____arcs);
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place.setSrc(trgSwitchOperationalToRouteRepair);
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place.setTrg(trgSwitchOperational);
		ruleresult.getCreatedEdges().add(trgSwitchOperationalToRouteRepair__trgSwitchOperational____place);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setTrg(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteOperationalToRouteFail____arcs);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setTrg(trgRouteOperational);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteOperational____place);
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
		trgSwitchFailedToRouteFail__trgRouteFail____transition.setSrc(trgSwitchFailedToRouteFail);
		trgSwitchFailedToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgSwitchFailedToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs.setTrg(trgSwitchFailedToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgSwitchFailedToRouteFail____arcs);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setTrg(trgRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFailed____place);
		trgRouteFailToSwitchFailed__trgRouteFail____transition.setSrc(trgRouteFailToSwitchFailed);
		trgRouteFailToSwitchFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToSwitchFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs.setTrg(trgRouteFailToSwitchFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToSwitchFailed____arcs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgRouteFailToSwitchFailed__trgSwitchFailed____place
				.setName(trgRouteFailToSwitchFailed__trgSwitchFailed____place_name_prime);
		trgRouteFail__trgPetrinet____petriNet.setName(trgRouteFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRouteFail____nodes.setName(trgPetrinet__trgRouteFail____nodes_name_prime);
		trgSwitchFailedToRouteFail__trgSwitchFailed____place
				.setName(trgSwitchFailedToRouteFail__trgSwitchFailed____place_name_prime);
		trgRouteRepairToSwitchOperational__trgSwitchOperational____place
				.setName(trgRouteRepairToSwitchOperational__trgSwitchOperational____place_name_prime);
		trgRouteRepairToSwitchOperational__trgRouteRepair____transition
				.setName(trgRouteRepairToSwitchOperational__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgRouteRepairToSwitchOperational____arcs
				.setName(trgRouteRepair__trgRouteRepairToSwitchOperational____arcs_name_prime);
		trgRouteFailToRouteFailed__trgRouteFail____transition
				.setName(trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToRouteFailed____arcs
				.setName(trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime);
		trgSwitchOperationalToRouteRepair__trgSwitchOperational____place
				.setName(trgSwitchOperationalToRouteRepair__trgSwitchOperational____place_name_prime);
		trgRouteOperationalToRouteFail__trgRouteFail____transition
				.setName(trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs
				.setName(trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime);
		trgRouteOperationalToRouteFail__trgRouteOperational____place
				.setName(trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime);
		srcRoute__srcSwitchPosition____follows.setName(srcRoute__srcSwitchPosition____follows_name_prime);
		srcSwitchPosition__srcRoute____route.setName(srcSwitchPosition__srcRoute____route_name_prime);
		trgSwitchOperationalToRouteRepair__trgRouteRepair____transition
				.setName(trgSwitchOperationalToRouteRepair__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs
				.setName(trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs_name_prime);
		trgSwitchFailedToRouteFail__trgRouteFail____transition
				.setName(trgSwitchFailedToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgSwitchFailedToRouteFail____arcs
				.setName(trgRouteFail__trgSwitchFailedToRouteFail____arcs_name_prime);
		trgRouteFailToRouteFailed__trgRouteFailed____place
				.setName(trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime);
		trgRouteFailToSwitchFailed__trgRouteFail____transition
				.setName(trgRouteFailToSwitchFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToSwitchFailed____arcs
				.setName(trgRouteFail__trgRouteFailToSwitchFailed____arcs_name_prime);
		return new Object[] { ruleresult, trgPetrinet, trgSwitchFailedToRouteFail, trgRouteFailed, trgSwitchFailed,
				trgSwitchOperationalToRouteRepair, trgRouteFailToSwitchFailed, trgSwitchOperational, trgRouteFail,
				trgRouteOperational, trgRouteRepairToSwitchOperational, trgRouteFailToRouteFailed, srcSwitchPosition,
				trgRouteOperationalToRouteFail, srcRoute, trgRouteRepair,
				trgRouteFailToSwitchFailed__trgSwitchFailed____place, trgRouteFail__trgPetrinet____petriNet,
				trgPetrinet__trgRouteFail____nodes, trgSwitchFailedToRouteFail__trgSwitchFailed____place,
				trgRouteRepairToSwitchOperational__trgSwitchOperational____place,
				trgRouteRepairToSwitchOperational__trgRouteRepair____transition,
				trgRouteRepair__trgRouteRepairToSwitchOperational____arcs,
				trgRouteFailToRouteFailed__trgRouteFail____transition, trgRouteFail__trgRouteFailToRouteFailed____arcs,
				trgSwitchOperationalToRouteRepair__trgSwitchOperational____place,
				trgRouteOperationalToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgRouteOperationalToRouteFail____arcs,
				trgRouteOperationalToRouteFail__trgRouteOperational____place, srcRoute__srcSwitchPosition____follows,
				srcSwitchPosition__srcRoute____route, trgSwitchOperationalToRouteRepair__trgRouteRepair____transition,
				trgRouteRepair__trgSwitchOperationalToRouteRepair____arcs,
				trgSwitchFailedToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgSwitchFailedToRouteFail____arcs, trgRouteFailToRouteFailed__trgRouteFailed____place,
				trgRouteFailToSwitchFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToSwitchFailed____arcs };
	}

	public static final void pattern_RequiredSwitch_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBBB(
			RequiredSwitch _this, PerformRuleResult ruleresult, EObject trgPetrinet, EObject trgSwitchFailedToRouteFail,
			EObject trgRouteFailed, EObject trgSwitchFailed, EObject trgSwitchOperationalToRouteRepair,
			EObject trgRouteFailToSwitchFailed, EObject trgSwitchOperational, EObject switchOperationalCorr,
			EObject trgRouteFail, EObject routeRepairCorr, EObject containerCorr, EObject switchFailedCorr,
			EObject trgRouteOperational, EObject routeFailedCorr, EObject routeOperationalCorr,
			EObject trgRouteRepairToSwitchOperational, EObject trgRouteFailToRouteFailed, EObject srcSwitchPosition,
			EObject trgRouteOperationalToRouteFail, EObject srcContainer, EObject srcRoute, EObject trgRouteRepair,
			EObject srcSwitch) {
		_this.registerObjects_FWD(ruleresult, trgPetrinet, trgSwitchFailedToRouteFail, trgRouteFailed, trgSwitchFailed,
				trgSwitchOperationalToRouteRepair, trgRouteFailToSwitchFailed, trgSwitchOperational,
				switchOperationalCorr, trgRouteFail, routeRepairCorr, containerCorr, switchFailedCorr,
				trgRouteOperational, routeFailedCorr, routeOperationalCorr, trgRouteRepairToSwitchOperational,
				trgRouteFailToRouteFailed, srcSwitchPosition, trgRouteOperationalToRouteFail, srcContainer, srcRoute,
				trgRouteRepair, srcSwitch);

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
		EObject _localVariable_0 = match.getObject("srcSwitchPosition");
		EObject _localVariable_1 = match.getObject("srcContainer");
		EObject _localVariable_2 = match.getObject("srcRoute");
		EObject _localVariable_3 = match.getObject("srcSwitch");
		EObject tmpSrcSwitchPosition = _localVariable_0;
		EObject tmpSrcContainer = _localVariable_1;
		EObject tmpSrcRoute = _localVariable_2;
		EObject tmpSrcSwitch = _localVariable_3;
		if (tmpSrcSwitchPosition instanceof SwitchPosition) {
			SwitchPosition srcSwitchPosition = (SwitchPosition) tmpSrcSwitchPosition;
			if (tmpSrcContainer instanceof RailwayContainer) {
				RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
				if (tmpSrcRoute instanceof Route) {
					Route srcRoute = (Route) tmpSrcRoute;
					if (tmpSrcSwitch instanceof Switch) {
						Switch srcSwitch = (Switch) tmpSrcSwitch;
						return new Object[] { srcSwitchPosition, srcContainer, srcRoute, srcSwitch, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RequiredSwitch_2_2_corematch_blackFFFFFFFFFFFBBBFBB(
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute, Switch srcSwitch,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RouteToFailed routeFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcRoute, RouteToFailed.class, "source")) {
			Place trgRouteFailed = routeFailedCorr.getTarget();
			if (trgRouteFailed != null) {
				for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
					PetriNet trgPetrinet = containerCorr.getTarget();
					if (trgPetrinet != null) {
						for (RouteToOperational routeOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(srcRoute, RouteToOperational.class, "source")) {
							Place trgRouteOperational = routeOperationalCorr.getTarget();
							if (trgRouteOperational != null) {
								if (!trgRouteFailed.equals(trgRouteOperational)) {
									for (SwitchToFailed switchFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(srcSwitch, SwitchToFailed.class, "source")) {
										Place trgSwitchFailed = switchFailedCorr.getTarget();
										if (trgSwitchFailed != null) {
											if (!trgRouteFailed.equals(trgSwitchFailed)) {
												if (!trgRouteOperational.equals(trgSwitchFailed)) {
													for (SwitchToOperational switchOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(srcSwitch,
																	SwitchToOperational.class, "source")) {
														Place trgSwitchOperational = switchOperationalCorr.getTarget();
														if (trgSwitchOperational != null) {
															if (!trgRouteFailed.equals(trgSwitchOperational)) {
																if (!trgSwitchFailed.equals(trgSwitchOperational)) {
																	if (!trgRouteOperational
																			.equals(trgSwitchOperational)) {
																		for (RouteToRepair routeRepairCorr : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(srcRoute,
																						RouteToRepair.class,
																						"source")) {
																			Transition trgRouteRepair = routeRepairCorr
																					.getTarget();
																			if (trgRouteRepair != null) {
																				_result.add(new Object[] { trgPetrinet,
																						trgRouteFailed, trgSwitchFailed,
																						trgSwitchOperational,
																						switchOperationalCorr,
																						routeRepairCorr, containerCorr,
																						switchFailedCorr,
																						trgRouteOperational,
																						routeFailedCorr,
																						routeOperationalCorr,
																						srcSwitchPosition, srcContainer,
																						srcRoute, trgRouteRepair,
																						srcSwitch, match });
																			}

																		}
																	}
																}
															}
														}

													}
												}
											}
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
			PetriNet trgPetrinet, Place trgRouteFailed, Place trgSwitchFailed, Place trgSwitchOperational,
			SwitchToOperational switchOperationalCorr, RouteToRepair routeRepairCorr,
			RailwayContainerToPetriNet containerCorr, SwitchToFailed switchFailedCorr, Place trgRouteOperational,
			RouteToFailed routeFailedCorr, RouteToOperational routeOperationalCorr, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer, Route srcRoute, Transition trgRouteRepair, Switch srcSwitch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!trgRouteFailed.equals(trgSwitchFailed)) {
			if (!trgRouteFailed.equals(trgSwitchOperational)) {
				if (!trgRouteFailed.equals(trgRouteOperational)) {
					if (!trgSwitchFailed.equals(trgSwitchOperational)) {
						if (!trgRouteOperational.equals(trgSwitchFailed)) {
							if (!trgRouteOperational.equals(trgSwitchOperational)) {
								if (trgPetrinet.equals(containerCorr.getTarget())) {
									if (trgRouteOperational.equals(routeOperationalCorr.getTarget())) {
										if (trgSwitchFailed.equals(switchFailedCorr.getTarget())) {
											if (trgRouteFailed.equals(routeFailedCorr.getTarget())) {
												if (srcRoute.equals(routeFailedCorr.getSource())) {
													if (srcRoute.getFollows().contains(srcSwitchPosition)) {
														if (srcContainer.equals(containerCorr.getSource())) {
															if (trgSwitchOperational
																	.equals(switchOperationalCorr.getTarget())) {
																if (srcSwitch.equals(srcSwitchPosition.getTarget())) {
																	if (srcContainer.getRoutes().contains(srcRoute)) {
																		if (srcRoute.equals(
																				routeOperationalCorr.getSource())) {
																			if (trgRouteRepair.equals(
																					routeRepairCorr.getTarget())) {
																				if (srcSwitch.equals(
																						switchFailedCorr.getSource())) {
																					if (srcSwitch.equals(
																							switchOperationalCorr
																									.getSource())) {
																						if (srcRoute
																								.equals(routeRepairCorr
																										.getSource())) {
																							_result.add(new Object[] {
																									trgPetrinet,
																									trgRouteFailed,
																									trgSwitchFailed,
																									trgSwitchOperational,
																									switchOperationalCorr,
																									routeRepairCorr,
																									containerCorr,
																									switchFailedCorr,
																									trgRouteOperational,
																									routeFailedCorr,
																									routeOperationalCorr,
																									srcSwitchPosition,
																									srcContainer,
																									srcRoute,
																									trgRouteRepair,
																									srcSwitch });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PetriNet trgPetrinet, Place trgRouteFailed, Place trgSwitchFailed, Place trgSwitchOperational,
			SwitchToOperational switchOperationalCorr, RouteToRepair routeRepairCorr,
			RailwayContainerToPetriNet containerCorr, SwitchToFailed switchFailedCorr, Place trgRouteOperational,
			RouteToFailed routeFailedCorr, RouteToOperational routeOperationalCorr, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer, Route srcRoute, Transition trgRouteRepair, Switch srcSwitch) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgRouteOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchFailedCorr__trgSwitchFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgRouteFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSwitchPosition____follows = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcRoute____route = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchOperationalCorr__trgSwitchOperational____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRouteRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchFailedCorr__srcSwitch____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchOperationalCorr__srcSwitch____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String routeOperationalCorr__trgRouteOperational____target_name_prime = "target";
		String switchFailedCorr__trgSwitchFailed____target_name_prime = "target";
		String routeFailedCorr__trgRouteFailed____target_name_prime = "target";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		String srcRoute__srcSwitchPosition____follows_name_prime = "follows";
		String srcSwitchPosition__srcRoute____route_name_prime = "route";
		String containerCorr__srcContainer____source_name_prime = "source";
		String switchOperationalCorr__trgSwitchOperational____target_name_prime = "target";
		String srcSwitchPosition__srcSwitch____target_name_prime = "target";
		String srcSwitch__srcSwitchPosition____positions_name_prime = "positions";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String routeRepairCorr__trgRouteRepair____target_name_prime = "target";
		String switchFailedCorr__srcSwitch____source_name_prime = "source";
		String switchOperationalCorr__srcSwitch____source_name_prime = "source";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(trgSwitchFailed);
		isApplicableMatch.getAllContextElements().add(trgSwitchOperational);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr);
		isApplicableMatch.getAllContextElements().add(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(srcSwitch);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		routeOperationalCorr__trgRouteOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgRouteOperational____target.setTrg(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__trgRouteOperational____target);
		switchFailedCorr__trgSwitchFailed____target.setSrc(switchFailedCorr);
		switchFailedCorr__trgSwitchFailed____target.setTrg(trgSwitchFailed);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr__trgSwitchFailed____target);
		routeFailedCorr__trgRouteFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgRouteFailed____target.setTrg(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__trgRouteFailed____target);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__srcRoute____source);
		srcRoute__srcSwitchPosition____follows.setSrc(srcRoute);
		srcRoute__srcSwitchPosition____follows.setTrg(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcRoute__srcSwitchPosition____follows);
		srcSwitchPosition__srcRoute____route.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcRoute____route.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition__srcRoute____route);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		switchOperationalCorr__trgSwitchOperational____target.setSrc(switchOperationalCorr);
		switchOperationalCorr__trgSwitchOperational____target.setTrg(trgSwitchOperational);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr__trgSwitchOperational____target);
		srcSwitchPosition__srcSwitch____target.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcSwitch____target.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition__srcSwitch____target);
		srcSwitch__srcSwitchPosition____positions.setSrc(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setTrg(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcSwitch__srcSwitchPosition____positions);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__srcRoute____source);
		routeRepairCorr__trgRouteRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRouteRepair____target.setTrg(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__trgRouteRepair____target);
		switchFailedCorr__srcSwitch____source.setSrc(switchFailedCorr);
		switchFailedCorr__srcSwitch____source.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(switchFailedCorr__srcSwitch____source);
		switchOperationalCorr__srcSwitch____source.setSrc(switchOperationalCorr);
		switchOperationalCorr__srcSwitch____source.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(switchOperationalCorr__srcSwitch____source);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__srcRoute____source);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		routeOperationalCorr__trgRouteOperational____target
				.setName(routeOperationalCorr__trgRouteOperational____target_name_prime);
		switchFailedCorr__trgSwitchFailed____target.setName(switchFailedCorr__trgSwitchFailed____target_name_prime);
		routeFailedCorr__trgRouteFailed____target.setName(routeFailedCorr__trgRouteFailed____target_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		srcRoute__srcSwitchPosition____follows.setName(srcRoute__srcSwitchPosition____follows_name_prime);
		srcSwitchPosition__srcRoute____route.setName(srcSwitchPosition__srcRoute____route_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		switchOperationalCorr__trgSwitchOperational____target
				.setName(switchOperationalCorr__trgSwitchOperational____target_name_prime);
		srcSwitchPosition__srcSwitch____target.setName(srcSwitchPosition__srcSwitch____target_name_prime);
		srcSwitch__srcSwitchPosition____positions.setName(srcSwitch__srcSwitchPosition____positions_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		routeRepairCorr__trgRouteRepair____target.setName(routeRepairCorr__trgRouteRepair____target_name_prime);
		switchFailedCorr__srcSwitch____source.setName(switchFailedCorr__srcSwitch____source_name_prime);
		switchOperationalCorr__srcSwitch____source.setName(switchOperationalCorr__srcSwitch____source_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		return new Object[] { trgPetrinet, trgRouteFailed, trgSwitchFailed, trgSwitchOperational, switchOperationalCorr,
				routeRepairCorr, containerCorr, switchFailedCorr, trgRouteOperational, routeFailedCorr,
				routeOperationalCorr, srcSwitchPosition, srcContainer, srcRoute, trgRouteRepair, srcSwitch,
				isApplicableMatch, containerCorr__trgPetrinet____target,
				routeOperationalCorr__trgRouteOperational____target, switchFailedCorr__trgSwitchFailed____target,
				routeFailedCorr__trgRouteFailed____target, routeFailedCorr__srcRoute____source,
				srcRoute__srcSwitchPosition____follows, srcSwitchPosition__srcRoute____route,
				containerCorr__srcContainer____source, switchOperationalCorr__trgSwitchOperational____target,
				srcSwitchPosition__srcSwitch____target, srcSwitch__srcSwitchPosition____positions,
				srcContainer__srcRoute____routes, routeOperationalCorr__srcRoute____source,
				routeRepairCorr__trgRouteRepair____target, switchFailedCorr__srcSwitch____source,
				switchOperationalCorr__srcSwitch____source, routeRepairCorr__srcRoute____source };
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(RequiredSwitch _this,
			IsApplicableMatch isApplicableMatch, PetriNet trgPetrinet, Place trgRouteFailed, Place trgSwitchFailed,
			Place trgSwitchOperational, SwitchToOperational switchOperationalCorr, RouteToRepair routeRepairCorr,
			RailwayContainerToPetriNet containerCorr, SwitchToFailed switchFailedCorr, Place trgRouteOperational,
			RouteToFailed routeFailedCorr, RouteToOperational routeOperationalCorr, SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer, Route srcRoute, Transition trgRouteRepair, Switch srcSwitch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, trgPetrinet, trgRouteFailed,
				trgSwitchFailed, trgSwitchOperational, switchOperationalCorr, routeRepairCorr, containerCorr,
				switchFailedCorr, trgRouteOperational, routeFailedCorr, routeOperationalCorr, srcSwitchPosition,
				srcContainer, srcRoute, trgRouteRepair, srcSwitch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, trgPetrinet, trgRouteFailed, trgSwitchFailed,
					trgSwitchOperational, switchOperationalCorr, routeRepairCorr, containerCorr, switchFailedCorr,
					trgRouteOperational, routeFailedCorr, routeOperationalCorr, srcSwitchPosition, srcContainer,
					srcRoute, trgRouteRepair, srcSwitch };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSwitch_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
			RequiredSwitch _this, IsApplicableMatch isApplicableMatch, PetriNet trgPetrinet, Place trgRouteFailed,
			Place trgSwitchFailed, Place trgSwitchOperational, SwitchToOperational switchOperationalCorr,
			RouteToRepair routeRepairCorr, RailwayContainerToPetriNet containerCorr, SwitchToFailed switchFailedCorr,
			Place trgRouteOperational, RouteToFailed routeFailedCorr, RouteToOperational routeOperationalCorr,
			SwitchPosition srcSwitchPosition, RailwayContainer srcContainer, Route srcRoute, Transition trgRouteRepair,
			Switch srcSwitch) {
		Object[] result_pattern_RequiredSwitch_2_4_solveCSP_binding = pattern_RequiredSwitch_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, trgPetrinet, trgRouteFailed, trgSwitchFailed, trgSwitchOperational,
				switchOperationalCorr, routeRepairCorr, containerCorr, switchFailedCorr, trgRouteOperational,
				routeFailedCorr, routeOperationalCorr, srcSwitchPosition, srcContainer, srcRoute, trgRouteRepair,
				srcSwitch);
		if (result_pattern_RequiredSwitch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSwitch_2_4_solveCSP_binding[0];

			Object[] result_pattern_RequiredSwitch_2_4_solveCSP_black = pattern_RequiredSwitch_2_4_solveCSP_blackB(csp);
			if (result_pattern_RequiredSwitch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, trgPetrinet, trgRouteFailed, trgSwitchFailed,
						trgSwitchOperational, switchOperationalCorr, routeRepairCorr, containerCorr, switchFailedCorr,
						trgRouteOperational, routeFailedCorr, routeOperationalCorr, srcSwitchPosition, srcContainer,
						srcRoute, trgRouteRepair, srcSwitch };
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
							_result.add(new Object[] { srcSwitchPosition, srcContainer, srcRoute, srcSwitch,
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
			RequiredSwitch _this, Match match, SwitchPosition srcSwitchPosition, RailwayContainer srcContainer,
			Route srcRoute, Switch srcSwitch) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSwitchPosition, srcContainer, srcRoute, srcSwitch);
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

	public static final Object[] pattern_RequiredSwitch_13_1_matchtggpattern_blackBBBB(SwitchPosition srcSwitchPosition,
			RailwayContainer srcContainer, Route srcRoute, Switch srcSwitch) {
		if (srcRoute.getFollows().contains(srcSwitchPosition)) {
			if (srcSwitch.equals(srcSwitchPosition.getTarget())) {
				if (srcContainer.getRoutes().contains(srcRoute)) {
					return new Object[] { srcSwitchPosition, srcContainer, srcRoute, srcSwitch };
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
