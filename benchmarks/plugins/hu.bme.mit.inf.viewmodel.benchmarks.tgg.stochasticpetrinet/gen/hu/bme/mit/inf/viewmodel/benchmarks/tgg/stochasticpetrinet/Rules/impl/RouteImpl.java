/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ImmediateTransition;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToOperational;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RouteToRepair;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Route;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetFactory;

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
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends AbstractRuleImpl implements Route {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getRoute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute,
			RailwayContainer srcContainer) {

		Object[] result1_black = RouteImpl.pattern_Route_0_1_initialbindings_blackBBBB(this, match, srcRoute,
				srcContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ".");
		}

		Object[] result2_bindingAndBlack = RouteImpl.pattern_Route_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
				srcRoute, srcContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RouteImpl.pattern_Route_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RouteImpl.pattern_Route_0_4_collectelementstobetranslated_blackBBB(match, srcRoute,
					srcContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ".");
			}
			RouteImpl.pattern_Route_0_4_collectelementstobetranslated_greenBBBF(match, srcRoute, srcContainer);
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = RouteImpl.pattern_Route_0_5_collectcontextelements_blackBBB(match, srcRoute,
					srcContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ".");
			}
			RouteImpl.pattern_Route_0_5_collectcontextelements_greenBB(match, srcContainer);

			// 
			RouteImpl.pattern_Route_0_6_registerobjectstomatch_expressionBBBB(this, match, srcRoute, srcContainer);
			return RouteImpl.pattern_Route_0_7_expressionF();
		} else {
			return RouteImpl.pattern_Route_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = RouteImpl
				.pattern_Route_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[0];
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) result1_bindingAndBlack[1];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[2];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = RouteImpl.pattern_Route_1_1_performtransformation_greenFFBFBFFFFF(trgPetrinet,
				srcRoute);
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_green[0];
		Place trgFailed = (Place) result1_green[1];
		Place trgOperational = (Place) result1_green[3];
		ImmediateTransition trgRepair = (ImmediateTransition) result1_green[5];
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_green[6];
		Arc trgFailedToRepair = (Arc) result1_green[7];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_green[8];
		Arc trgRepairToOperational = (Arc) result1_green[9];

		Object[] result2_black = RouteImpl.pattern_Route_1_2_collecttranslatedelements_blackBBBBBBBBB(routeRepairCorr,
				trgFailed, trgOperational, srcRoute, trgRepair, routeOperationalCorr, trgFailedToRepair,
				routeFailedCorr, trgRepairToOperational);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[routeRepairCorr] = "
					+ routeRepairCorr + ", " + "[trgFailed] = " + trgFailed + ", " + "[trgOperational] = "
					+ trgOperational + ", " + "[srcRoute] = " + srcRoute + ", " + "[trgRepair] = " + trgRepair + ", "
					+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[trgFailedToRepair] = "
					+ trgFailedToRepair + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", "
					+ "[trgRepairToOperational] = " + trgRepairToOperational + ".");
		}
		Object[] result2_green = RouteImpl.pattern_Route_1_2_collecttranslatedelements_greenFBBBBBBBBB(routeRepairCorr,
				trgFailed, trgOperational, srcRoute, trgRepair, routeOperationalCorr, trgFailedToRepair,
				routeFailedCorr, trgRepairToOperational);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RouteImpl.pattern_Route_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult,
				routeRepairCorr, trgFailed, trgPetrinet, trgOperational, srcRoute, trgRepair, routeOperationalCorr,
				trgFailedToRepair, routeFailedCorr, srcContainer, containerCorr, trgRepairToOperational);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[routeRepairCorr] = " + routeRepairCorr + ", " + "[trgFailed] = " + trgFailed + ", "
					+ "[trgPetrinet] = " + trgPetrinet + ", " + "[trgOperational] = " + trgOperational + ", "
					+ "[srcRoute] = " + srcRoute + ", " + "[trgRepair] = " + trgRepair + ", "
					+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[trgFailedToRepair] = "
					+ trgFailedToRepair + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[containerCorr] = " + containerCorr + ", " + "[trgRepairToOperational] = "
					+ trgRepairToOperational + ".");
		}
		RouteImpl.pattern_Route_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
				routeRepairCorr, trgFailed, trgPetrinet, trgOperational, srcRoute, trgRepair, routeOperationalCorr,
				trgFailedToRepair, routeFailedCorr, srcContainer, trgRepairToOperational);
		//nothing EMoflonEdge trgFailed__trgPetrinet____petriNet = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge trgPetrinet__trgFailed____nodes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge routeOperationalCorr__trgOperational____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge trgOperational__trgPetrinet____petriNet = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgPetrinet__trgOperational____nodes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgRepair__trgPetrinet____petriNet = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgPetrinet__trgRepair____nodes = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgFailedToRepair__trgFailed____place = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge routeFailedCorr__trgFailed____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge routeRepairCorr__trgRepair____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgFailedToRepair__trgRepair____transition = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgRepair__trgFailedToRepair____arcs = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRepairToOperational__trgRepair____transition = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgRepair__trgRepairToOperational____arcs = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgRepairToOperational__trgOperational____place = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[30];

		// 
		// 
		RouteImpl.pattern_Route_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this, ruleresult, routeRepairCorr,
				trgFailed, trgPetrinet, trgOperational, srcRoute, trgRepair, routeOperationalCorr, trgFailedToRepair,
				routeFailedCorr, srcContainer, containerCorr, trgRepairToOperational);
		return RouteImpl.pattern_Route_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = RouteImpl.pattern_Route_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = RouteImpl.pattern_Route_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = RouteImpl.pattern_Route_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) result2_binding[0];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[1];
		for (Object[] result2_black : RouteImpl.pattern_Route_2_2_corematch_blackFBBFB(srcRoute, srcContainer, match)) {
			PetriNet trgPetrinet = (PetriNet) result2_black[0];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[3];
			// ForEach 
			for (Object[] result3_black : RouteImpl.pattern_Route_2_3_findcontext_blackBBBB(trgPetrinet, srcRoute,
					srcContainer, containerCorr)) {
				Object[] result3_green = RouteImpl.pattern_Route_2_3_findcontext_greenBBBBFFFF(trgPetrinet, srcRoute,
						srcContainer, containerCorr);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = RouteImpl.pattern_Route_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
						isApplicableMatch, trgPetrinet, srcRoute, srcContainer, containerCorr);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[trgPetrinet] = " + trgPetrinet
							+ ", " + "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = " + srcContainer + ", "
							+ "[containerCorr] = " + containerCorr + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (RouteImpl.pattern_Route_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = RouteImpl.pattern_Route_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					RouteImpl.pattern_Route_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return RouteImpl.pattern_Route_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		match.registerObject("srcRoute", srcRoute);
		match.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {// Create CSP
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("containerCorr", containerCorr);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject routeRepairCorr, EObject trgFailed,
			EObject trgPetrinet, EObject trgOperational, EObject srcRoute, EObject trgRepair,
			EObject routeOperationalCorr, EObject trgFailedToRepair, EObject routeFailedCorr, EObject srcContainer,
			EObject containerCorr, EObject trgRepairToOperational) {
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("trgFailed", trgFailed);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgOperational", trgOperational);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("trgRepair", trgRepair);
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("trgFailedToRepair", trgFailedToRepair);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("trgRepairToOperational", trgRepairToOperational);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcRoute").eClass()).equals("railway.Route.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_9(EMoflonEdge _edge_routes) {

		Object[] result1_bindingAndBlack = RouteImpl.pattern_Route_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = RouteImpl.pattern_Route_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : RouteImpl.pattern_Route_10_2_testcorematchandDECs_blackFFB(_edge_routes)) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) result2_black[0];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[1];
			Object[] result2_green = RouteImpl.pattern_Route_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RouteImpl.pattern_Route_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
					srcRoute, srcContainer)) {
				// 
				if (RouteImpl.pattern_Route_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					Object[] result5_black = RouteImpl.pattern_Route_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					RouteImpl.pattern_Route_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return RouteImpl.pattern_Route_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Route");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("trgFailed", "tokens", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgOperational", "tokens", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgFailedToRepair", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRepairToOperational", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
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
	public boolean checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute,
			RailwayContainer srcContainer) {// 
		Object[] result1_black = RouteImpl.pattern_Route_13_1_matchtggpattern_blackBB(srcRoute, srcContainer);
		if (result1_black != null) {
			return RouteImpl.pattern_Route_13_2_expressionF();
		} else {
			return RouteImpl.pattern_Route_13_3_expressionF();
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
		case RulesPackage.ROUTE___IS_APPROPRIATE_FWD__MATCH_ROUTE_RAILWAYCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) arguments.get(1),
					(RailwayContainer) arguments.get(2));
		case RulesPackage.ROUTE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ROUTE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ROUTE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ROUTE_RAILWAYCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) arguments.get(1),
					(RailwayContainer) arguments.get(2));
			return null;
		case RulesPackage.ROUTE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ROUTE_RAILWAYCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) arguments.get(1),
					(RailwayContainer) arguments.get(2));
		case RulesPackage.ROUTE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ROUTE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PETRINET_ROUTE_RAILWAYCONTAINER_RAILWAYCONTAINERTOPETRINET:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PetriNet) arguments.get(1),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) arguments.get(2),
					(RailwayContainer) arguments.get(3), (RailwayContainerToPetriNet) arguments.get(4));
		case RulesPackage.ROUTE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ROUTE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.ROUTE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ROUTE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.ROUTE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ROUTE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ROUTE___CHECK_DEC_FWD__ROUTE_RAILWAYCONTAINER:
			return checkDEC_FWD((hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) arguments.get(0),
					(RailwayContainer) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Route_0_1_initialbindings_blackBBBB(Route _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		return new Object[] { _this, match, srcRoute, srcContainer };
	}

	public static final Object[] pattern_Route_0_2_SolveCSP_bindingFBBBB(Route _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcRoute, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcRoute, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_Route_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Route_0_2_SolveCSP_bindingAndBlackFBBBB(Route _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		Object[] result_pattern_Route_0_2_SolveCSP_binding = pattern_Route_0_2_SolveCSP_bindingFBBBB(_this, match,
				srcRoute, srcContainer);
		if (result_pattern_Route_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Route_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Route_0_2_SolveCSP_black = pattern_Route_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Route_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcRoute, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_Route_0_3_CheckCSP_expressionFBB(Route _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Route_0_4_collectelementstobetranslated_blackBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		return new Object[] { match, srcRoute, srcContainer };
	}

	public static final Object[] pattern_Route_0_4_collectelementstobetranslated_greenBBBF(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcRoute);
		String srcContainer__srcRoute____routes_name_prime = "routes";
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		match.getToBeTranslatedEdges().add(srcContainer__srcRoute____routes);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { match, srcRoute, srcContainer, srcContainer__srcRoute____routes };
	}

	public static final Object[] pattern_Route_0_5_collectcontextelements_blackBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		return new Object[] { match, srcRoute, srcContainer };
	}

	public static final Object[] pattern_Route_0_5_collectcontextelements_greenBB(Match match,
			RailwayContainer srcContainer) {
		match.getContextNodes().add(srcContainer);
		return new Object[] { match, srcContainer };
	}

	public static final void pattern_Route_0_6_registerobjectstomatch_expressionBBBB(Route _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		_this.registerObjectsToMatch_FWD(match, srcRoute, srcContainer);

	}

	public static final boolean pattern_Route_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Route_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Route_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("containerCorr");
		EObject tmpTrgPetrinet = _localVariable_0;
		EObject tmpSrcRoute = _localVariable_1;
		EObject tmpSrcContainer = _localVariable_2;
		EObject tmpContainerCorr = _localVariable_3;
		if (tmpTrgPetrinet instanceof PetriNet) {
			PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
			if (tmpSrcRoute instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) tmpSrcRoute;
				if (tmpSrcContainer instanceof RailwayContainer) {
					RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
					if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
						RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
						return new Object[] { trgPetrinet, srcRoute, srcContainer, containerCorr, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Route_1_1_performtransformation_blackBBBBFBB(PetriNet trgPetrinet,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr, Route _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { trgPetrinet, srcRoute, srcContainer, containerCorr, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Route_1_1_performtransformation_bindingAndBlackFFFFFBB(Route _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Route_1_1_performtransformation_binding = pattern_Route_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_Route_1_1_performtransformation_binding != null) {
			PetriNet trgPetrinet = (PetriNet) result_pattern_Route_1_1_performtransformation_binding[0];
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) result_pattern_Route_1_1_performtransformation_binding[1];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_Route_1_1_performtransformation_binding[2];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_Route_1_1_performtransformation_binding[3];

			Object[] result_pattern_Route_1_1_performtransformation_black = pattern_Route_1_1_performtransformation_blackBBBBFBB(
					trgPetrinet, srcRoute, srcContainer, containerCorr, _this, isApplicableMatch);
			if (result_pattern_Route_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Route_1_1_performtransformation_black[4];

				return new Object[] { trgPetrinet, srcRoute, srcContainer, containerCorr, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Route_1_1_performtransformation_greenFFBFBFFFFF(PetriNet trgPetrinet,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute) {
		RouteToRepair routeRepairCorr = StochasticpetrinetFactory.eINSTANCE.createRouteToRepair();
		Place trgFailed = StochasticPetriNetFactory.eINSTANCE.createPlace();
		Place trgOperational = StochasticPetriNetFactory.eINSTANCE.createPlace();
		ImmediateTransition trgRepair = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		RouteToOperational routeOperationalCorr = StochasticpetrinetFactory.eINSTANCE.createRouteToOperational();
		Arc trgFailedToRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		RouteToFailed routeFailedCorr = StochasticpetrinetFactory.eINSTANCE.createRouteToFailed();
		Arc trgRepairToOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		int trgFailed_tokens_prime = Integer.valueOf(0);
		int trgOperational_tokens_prime = Integer.valueOf(1);
		ArcKind trgFailedToRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgRepairToOperational_kind_prime = ArcKind.OUTPUT;
		routeRepairCorr.setSource(srcRoute);
		trgFailed.setPetriNet(trgPetrinet);
		trgOperational.setPetriNet(trgPetrinet);
		trgRepair.setPetriNet(trgPetrinet);
		routeRepairCorr.setTarget(trgRepair);
		routeOperationalCorr.setTarget(trgOperational);
		routeOperationalCorr.setSource(srcRoute);
		trgFailedToRepair.setPlace(trgFailed);
		trgFailedToRepair.setTransition(trgRepair);
		routeFailedCorr.setTarget(trgFailed);
		routeFailedCorr.setSource(srcRoute);
		trgRepairToOperational.setTransition(trgRepair);
		trgRepairToOperational.setPlace(trgOperational);
		trgFailed.setTokens(Integer.valueOf(trgFailed_tokens_prime));
		trgOperational.setTokens(Integer.valueOf(trgOperational_tokens_prime));
		trgFailedToRepair.setKind(trgFailedToRepair_kind_prime);
		trgRepairToOperational.setKind(trgRepairToOperational_kind_prime);
		return new Object[] { routeRepairCorr, trgFailed, trgPetrinet, trgOperational, srcRoute, trgRepair,
				routeOperationalCorr, trgFailedToRepair, routeFailedCorr, trgRepairToOperational };
	}

	public static final Object[] pattern_Route_1_2_collecttranslatedelements_blackBBBBBBBBB(
			RouteToRepair routeRepairCorr, Place trgFailed, Place trgOperational,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, ImmediateTransition trgRepair,
			RouteToOperational routeOperationalCorr, Arc trgFailedToRepair, RouteToFailed routeFailedCorr,
			Arc trgRepairToOperational) {
		if (!trgFailed.equals(trgOperational)) {
			if (!trgFailedToRepair.equals(trgRepairToOperational)) {
				return new Object[] { routeRepairCorr, trgFailed, trgOperational, srcRoute, trgRepair,
						routeOperationalCorr, trgFailedToRepair, routeFailedCorr, trgRepairToOperational };
			}
		}
		return null;
	}

	public static final Object[] pattern_Route_1_2_collecttranslatedelements_greenFBBBBBBBBB(
			RouteToRepair routeRepairCorr, Place trgFailed, Place trgOperational,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, ImmediateTransition trgRepair,
			RouteToOperational routeOperationalCorr, Arc trgFailedToRepair, RouteToFailed routeFailedCorr,
			Arc trgRepairToOperational) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(routeRepairCorr);
		ruleresult.getCreatedElements().add(trgFailed);
		ruleresult.getCreatedElements().add(trgOperational);
		ruleresult.getTranslatedElements().add(srcRoute);
		ruleresult.getCreatedElements().add(trgRepair);
		ruleresult.getCreatedLinkElements().add(routeOperationalCorr);
		ruleresult.getCreatedElements().add(trgFailedToRepair);
		ruleresult.getCreatedLinkElements().add(routeFailedCorr);
		ruleresult.getCreatedElements().add(trgRepairToOperational);
		return new Object[] { ruleresult, routeRepairCorr, trgFailed, trgOperational, srcRoute, trgRepair,
				routeOperationalCorr, trgFailedToRepair, routeFailedCorr, trgRepairToOperational };
	}

	public static final Object[] pattern_Route_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject routeRepairCorr, EObject trgFailed, EObject trgPetrinet, EObject trgOperational, EObject srcRoute,
			EObject trgRepair, EObject routeOperationalCorr, EObject trgFailedToRepair, EObject routeFailedCorr,
			EObject srcContainer, EObject containerCorr, EObject trgRepairToOperational) {
		if (!routeRepairCorr.equals(trgFailed)) {
			if (!routeRepairCorr.equals(trgPetrinet)) {
				if (!routeRepairCorr.equals(trgOperational)) {
					if (!routeRepairCorr.equals(srcRoute)) {
						if (!routeRepairCorr.equals(trgRepair)) {
							if (!routeRepairCorr.equals(trgFailedToRepair)) {
								if (!routeRepairCorr.equals(srcContainer)) {
									if (!routeRepairCorr.equals(trgRepairToOperational)) {
										if (!trgFailed.equals(trgPetrinet)) {
											if (!trgFailed.equals(trgOperational)) {
												if (!trgFailed.equals(trgRepair)) {
													if (!trgFailed.equals(trgFailedToRepair)) {
														if (!trgFailed.equals(trgRepairToOperational)) {
															if (!trgPetrinet.equals(trgRepair)) {
																if (!trgPetrinet.equals(trgRepairToOperational)) {
																	if (!trgOperational.equals(trgPetrinet)) {
																		if (!trgOperational.equals(trgRepair)) {
																			if (!trgOperational
																					.equals(trgRepairToOperational)) {
																				if (!srcRoute.equals(trgFailed)) {
																					if (!srcRoute.equals(trgPetrinet)) {
																						if (!srcRoute.equals(
																								trgOperational)) {
																							if (!srcRoute.equals(
																									trgRepair)) {
																								if (!srcRoute.equals(
																										trgFailedToRepair)) {
																									if (!srcRoute
																											.equals(trgRepairToOperational)) {
																										if (!trgRepair
																												.equals(trgRepairToOperational)) {
																											if (!routeOperationalCorr
																													.equals(routeRepairCorr)) {
																												if (!routeOperationalCorr
																														.equals(trgFailed)) {
																													if (!routeOperationalCorr
																															.equals(trgPetrinet)) {
																														if (!routeOperationalCorr
																																.equals(trgOperational)) {
																															if (!routeOperationalCorr
																																	.equals(srcRoute)) {
																																if (!routeOperationalCorr
																																		.equals(trgRepair)) {
																																	if (!routeOperationalCorr
																																			.equals(trgFailedToRepair)) {
																																		if (!routeOperationalCorr
																																				.equals(srcContainer)) {
																																			if (!routeOperationalCorr
																																					.equals(trgRepairToOperational)) {
																																				if (!trgFailedToRepair
																																						.equals(trgPetrinet)) {
																																					if (!trgFailedToRepair
																																							.equals(trgOperational)) {
																																						if (!trgFailedToRepair
																																								.equals(trgRepair)) {
																																							if (!trgFailedToRepair
																																									.equals(trgRepairToOperational)) {
																																								if (!routeFailedCorr
																																										.equals(routeRepairCorr)) {
																																									if (!routeFailedCorr
																																											.equals(trgFailed)) {
																																										if (!routeFailedCorr
																																												.equals(trgPetrinet)) {
																																											if (!routeFailedCorr
																																													.equals(trgOperational)) {
																																												if (!routeFailedCorr
																																														.equals(srcRoute)) {
																																													if (!routeFailedCorr
																																															.equals(trgRepair)) {
																																														if (!routeFailedCorr
																																																.equals(routeOperationalCorr)) {
																																															if (!routeFailedCorr
																																																	.equals(trgFailedToRepair)) {
																																																if (!routeFailedCorr
																																																		.equals(srcContainer)) {
																																																	if (!routeFailedCorr
																																																			.equals(trgRepairToOperational)) {
																																																		if (!srcContainer
																																																				.equals(trgFailed)) {
																																																			if (!srcContainer
																																																					.equals(trgPetrinet)) {
																																																				if (!srcContainer
																																																						.equals(trgOperational)) {
																																																					if (!srcContainer
																																																							.equals(srcRoute)) {
																																																						if (!srcContainer
																																																								.equals(trgRepair)) {
																																																							if (!srcContainer
																																																									.equals(trgFailedToRepair)) {
																																																								if (!srcContainer
																																																										.equals(trgRepairToOperational)) {
																																																									if (!containerCorr
																																																											.equals(routeRepairCorr)) {
																																																										if (!containerCorr
																																																												.equals(trgFailed)) {
																																																											if (!containerCorr
																																																													.equals(trgPetrinet)) {
																																																												if (!containerCorr
																																																														.equals(trgOperational)) {
																																																													if (!containerCorr
																																																															.equals(srcRoute)) {
																																																														if (!containerCorr
																																																																.equals(trgRepair)) {
																																																															if (!containerCorr
																																																																	.equals(routeOperationalCorr)) {
																																																																if (!containerCorr
																																																																		.equals(trgFailedToRepair)) {
																																																																	if (!containerCorr
																																																																			.equals(routeFailedCorr)) {
																																																																		if (!containerCorr
																																																																				.equals(srcContainer)) {
																																																																			if (!containerCorr
																																																																					.equals(trgRepairToOperational)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						routeRepairCorr,
																																																																						trgFailed,
																																																																						trgPetrinet,
																																																																						trgOperational,
																																																																						srcRoute,
																																																																						trgRepair,
																																																																						routeOperationalCorr,
																																																																						trgFailedToRepair,
																																																																						routeFailedCorr,
																																																																						srcContainer,
																																																																						containerCorr,
																																																																						trgRepairToOperational };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Route_1_3_bookkeepingforedges_greenBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject routeRepairCorr, EObject trgFailed, EObject trgPetrinet,
			EObject trgOperational, EObject srcRoute, EObject trgRepair, EObject routeOperationalCorr,
			EObject trgFailedToRepair, EObject routeFailedCorr, EObject srcContainer, EObject trgRepairToOperational) {
		EMoflonEdge trgFailed__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFailed____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperational__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgOperational____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRepair____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgFailedToRepair____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgRepairToOperational____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Route";
		String trgFailed__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFailed____nodes_name_prime = "nodes";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		String routeOperationalCorr__trgOperational____target_name_prime = "target";
		String trgOperational__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgOperational____nodes_name_prime = "nodes";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String trgRepair__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRepair____nodes_name_prime = "nodes";
		String trgFailedToRepair__trgFailed____place_name_prime = "place";
		String routeFailedCorr__trgFailed____target_name_prime = "target";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		String routeRepairCorr__trgRepair____target_name_prime = "target";
		String trgFailedToRepair__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgFailedToRepair____arcs_name_prime = "arcs";
		String trgRepairToOperational__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgRepairToOperational____arcs_name_prime = "arcs";
		String trgRepairToOperational__trgOperational____place_name_prime = "place";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		trgFailed__trgPetrinet____petriNet.setSrc(trgFailed);
		trgFailed__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFailed__trgPetrinet____petriNet);
		trgPetrinet__trgFailed____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFailed____nodes.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFailed____nodes);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		ruleresult.getCreatedEdges().add(routeRepairCorr__srcRoute____source);
		routeOperationalCorr__trgOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgOperational____target.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(routeOperationalCorr__trgOperational____target);
		trgOperational__trgPetrinet____petriNet.setSrc(trgOperational);
		trgOperational__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgOperational__trgPetrinet____petriNet);
		trgPetrinet__trgOperational____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgOperational____nodes.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgOperational____nodes);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		ruleresult.getCreatedEdges().add(routeOperationalCorr__srcRoute____source);
		trgRepair__trgPetrinet____petriNet.setSrc(trgRepair);
		trgRepair__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRepair__trgPetrinet____petriNet);
		trgPetrinet__trgRepair____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRepair____nodes.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRepair____nodes);
		trgFailedToRepair__trgFailed____place.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgFailed____place);
		routeFailedCorr__trgFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgFailed____target.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(routeFailedCorr__trgFailed____target);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		ruleresult.getCreatedEdges().add(routeFailedCorr__srcRoute____source);
		routeRepairCorr__trgRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRepair____target.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(routeRepairCorr__trgRepair____target);
		trgFailedToRepair__trgRepair____transition.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgRepair____transition);
		trgRepair__trgFailedToRepair____arcs.setSrc(trgRepair);
		trgRepair__trgFailedToRepair____arcs.setTrg(trgFailedToRepair);
		ruleresult.getCreatedEdges().add(trgRepair__trgFailedToRepair____arcs);
		trgRepairToOperational__trgRepair____transition.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgRepair____transition);
		trgRepair__trgRepairToOperational____arcs.setSrc(trgRepair);
		trgRepair__trgRepairToOperational____arcs.setTrg(trgRepairToOperational);
		ruleresult.getCreatedEdges().add(trgRepair__trgRepairToOperational____arcs);
		trgRepairToOperational__trgOperational____place.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgOperational____place);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		ruleresult.getTranslatedEdges().add(srcContainer__srcRoute____routes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgFailed__trgPetrinet____petriNet.setName(trgFailed__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFailed____nodes.setName(trgPetrinet__trgFailed____nodes_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		routeOperationalCorr__trgOperational____target
				.setName(routeOperationalCorr__trgOperational____target_name_prime);
		trgOperational__trgPetrinet____petriNet.setName(trgOperational__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgOperational____nodes.setName(trgPetrinet__trgOperational____nodes_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		trgRepair__trgPetrinet____petriNet.setName(trgRepair__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRepair____nodes.setName(trgPetrinet__trgRepair____nodes_name_prime);
		trgFailedToRepair__trgFailed____place.setName(trgFailedToRepair__trgFailed____place_name_prime);
		routeFailedCorr__trgFailed____target.setName(routeFailedCorr__trgFailed____target_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		routeRepairCorr__trgRepair____target.setName(routeRepairCorr__trgRepair____target_name_prime);
		trgFailedToRepair__trgRepair____transition.setName(trgFailedToRepair__trgRepair____transition_name_prime);
		trgRepair__trgFailedToRepair____arcs.setName(trgRepair__trgFailedToRepair____arcs_name_prime);
		trgRepairToOperational__trgRepair____transition
				.setName(trgRepairToOperational__trgRepair____transition_name_prime);
		trgRepair__trgRepairToOperational____arcs.setName(trgRepair__trgRepairToOperational____arcs_name_prime);
		trgRepairToOperational__trgOperational____place
				.setName(trgRepairToOperational__trgOperational____place_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { ruleresult, routeRepairCorr, trgFailed, trgPetrinet, trgOperational, srcRoute, trgRepair,
				routeOperationalCorr, trgFailedToRepair, routeFailedCorr, srcContainer, trgRepairToOperational,
				trgFailed__trgPetrinet____petriNet, trgPetrinet__trgFailed____nodes,
				routeRepairCorr__srcRoute____source, routeOperationalCorr__trgOperational____target,
				trgOperational__trgPetrinet____petriNet, trgPetrinet__trgOperational____nodes,
				routeOperationalCorr__srcRoute____source, trgRepair__trgPetrinet____petriNet,
				trgPetrinet__trgRepair____nodes, trgFailedToRepair__trgFailed____place,
				routeFailedCorr__trgFailed____target, routeFailedCorr__srcRoute____source,
				routeRepairCorr__trgRepair____target, trgFailedToRepair__trgRepair____transition,
				trgRepair__trgFailedToRepair____arcs, trgRepairToOperational__trgRepair____transition,
				trgRepair__trgRepairToOperational____arcs, trgRepairToOperational__trgOperational____place,
				srcContainer__srcRoute____routes };
	}

	public static final void pattern_Route_1_5_registerobjects_expressionBBBBBBBBBBBBBB(Route _this,
			PerformRuleResult ruleresult, EObject routeRepairCorr, EObject trgFailed, EObject trgPetrinet,
			EObject trgOperational, EObject srcRoute, EObject trgRepair, EObject routeOperationalCorr,
			EObject trgFailedToRepair, EObject routeFailedCorr, EObject srcContainer, EObject containerCorr,
			EObject trgRepairToOperational) {
		_this.registerObjects_FWD(ruleresult, routeRepairCorr, trgFailed, trgPetrinet, trgOperational, srcRoute,
				trgRepair, routeOperationalCorr, trgFailedToRepair, routeFailedCorr, srcContainer, containerCorr,
				trgRepairToOperational);

	}

	public static final PerformRuleResult pattern_Route_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Route_2_1_preparereturnvalue_bindingFB(Route _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Route_2_1_preparereturnvalue_blackFBB(EClass eClass, Route _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Route_2_1_preparereturnvalue_bindingAndBlackFFB(Route _this) {
		Object[] result_pattern_Route_2_1_preparereturnvalue_binding = pattern_Route_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Route_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Route_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Route_2_1_preparereturnvalue_black = pattern_Route_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Route_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Route_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Route_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Route";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Route_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcRoute");
		EObject _localVariable_1 = match.getObject("srcContainer");
		EObject tmpSrcRoute = _localVariable_0;
		EObject tmpSrcContainer = _localVariable_1;
		if (tmpSrcRoute instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) tmpSrcRoute;
			if (tmpSrcContainer instanceof RailwayContainer) {
				RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
				return new Object[] { srcRoute, srcContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Route_2_2_corematch_blackFBBFB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
			PetriNet trgPetrinet = containerCorr.getTarget();
			if (trgPetrinet != null) {
				_result.add(new Object[] { trgPetrinet, srcRoute, srcContainer, containerCorr, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Route_2_3_findcontext_blackBBBB(PetriNet trgPetrinet,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (trgPetrinet.equals(containerCorr.getTarget())) {
			if (srcContainer.equals(containerCorr.getSource())) {
				if (srcContainer.getRoutes().contains(srcRoute)) {
					_result.add(new Object[] { trgPetrinet, srcRoute, srcContainer, containerCorr });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Route_2_3_findcontext_greenBBBBFFFF(PetriNet trgPetrinet,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String containerCorr__srcContainer____source_name_prime = "source";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { trgPetrinet, srcRoute, srcContainer, containerCorr, isApplicableMatch,
				containerCorr__trgPetrinet____target, containerCorr__srcContainer____source,
				srcContainer__srcRoute____routes };
	}

	public static final Object[] pattern_Route_2_4_solveCSP_bindingFBBBBBB(Route _this,
			IsApplicableMatch isApplicableMatch, PetriNet trgPetrinet,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, trgPetrinet, srcRoute, srcContainer,
				containerCorr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, trgPetrinet, srcRoute, srcContainer, containerCorr };
		}
		return null;
	}

	public static final Object[] pattern_Route_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Route_2_4_solveCSP_bindingAndBlackFBBBBBB(Route _this,
			IsApplicableMatch isApplicableMatch, PetriNet trgPetrinet,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer,
			RailwayContainerToPetriNet containerCorr) {
		Object[] result_pattern_Route_2_4_solveCSP_binding = pattern_Route_2_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, trgPetrinet, srcRoute, srcContainer, containerCorr);
		if (result_pattern_Route_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Route_2_4_solveCSP_binding[0];

			Object[] result_pattern_Route_2_4_solveCSP_black = pattern_Route_2_4_solveCSP_blackB(csp);
			if (result_pattern_Route_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, trgPetrinet, srcRoute, srcContainer,
						containerCorr };
			}
		}
		return null;
	}

	public static final boolean pattern_Route_2_5_checkCSP_expressionFBB(Route _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Route_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Route_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Route";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Route_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Route_10_1_preparereturnvalue_bindingFB(Route _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Route_10_1_preparereturnvalue_blackFBBF(EClass __eClass, Route _this) {
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

	public static final Object[] pattern_Route_10_1_preparereturnvalue_bindingAndBlackFFBF(Route _this) {
		Object[] result_pattern_Route_10_1_preparereturnvalue_binding = pattern_Route_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Route_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Route_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Route_10_1_preparereturnvalue_black = pattern_Route_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Route_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Route_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Route_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Route_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Route_10_2_testcorematchandDECs_blackFFB(EMoflonEdge _edge_routes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcContainer = _edge_routes.getSrc();
		if (tmpSrcContainer instanceof RailwayContainer) {
			RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
			EObject tmpSrcRoute = _edge_routes.getTrg();
			if (tmpSrcRoute instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route) tmpSrcRoute;
				if (srcContainer.getRoutes().contains(srcRoute)) {
					_result.add(new Object[] { srcRoute, srcContainer, _edge_routes });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Route_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Route_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			Route _this, Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute,
			RailwayContainer srcContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcRoute, srcContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Route_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Route _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Route_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Route_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Route_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Route_13_1_matchtggpattern_blackBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route srcRoute, RailwayContainer srcContainer) {
		if (srcContainer.getRoutes().contains(srcRoute)) {
			return new Object[] { srcRoute, srcContainer };
		}
		return null;
	}

	public static final boolean pattern_Route_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Route_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RouteImpl
