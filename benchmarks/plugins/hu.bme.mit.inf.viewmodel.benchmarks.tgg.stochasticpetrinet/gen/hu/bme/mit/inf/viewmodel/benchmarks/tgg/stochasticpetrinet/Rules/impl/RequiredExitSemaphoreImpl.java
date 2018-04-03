/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore;

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

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredExitSemaphore;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational;

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
 * An implementation of the model object '<em><b>Required Exit Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RequiredExitSemaphoreImpl extends AbstractRuleImpl implements RequiredExitSemaphore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredExitSemaphoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getRequiredExitSemaphore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Semaphore srcSemaphore, RailwayContainer srcContainer,
			Route srcRoute) {

		Object[] result1_black = RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_0_1_initialbindings_blackBBBBB(
				this, match, srcSemaphore, srcContainer, srcRoute);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[srcRoute] = " + srcRoute + ".");
		}

		Object[] result2_bindingAndBlack = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, srcSemaphore,
						srcContainer, srcRoute);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[srcRoute] = " + srcRoute + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RequiredExitSemaphoreImpl
					.pattern_RequiredExitSemaphore_0_4_collectelementstobetranslated_blackBBBB(match, srcSemaphore,
							srcContainer, srcRoute);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = " + srcContainer + ", "
						+ "[srcRoute] = " + srcRoute + ".");
			}
			RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_0_4_collectelementstobetranslated_greenBBBF(match,
					srcSemaphore, srcRoute);
			//nothing EMoflonEdge srcRoute__srcSemaphore____exit = (EMoflonEdge) result4_green[3];

			Object[] result5_black = RequiredExitSemaphoreImpl
					.pattern_RequiredExitSemaphore_0_5_collectcontextelements_blackBBBB(match, srcSemaphore,
							srcContainer, srcRoute);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = " + srcContainer + ", "
						+ "[srcRoute] = " + srcRoute + ".");
			}
			RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_0_5_collectcontextelements_greenBBBBF(match,
					srcSemaphore, srcContainer, srcRoute);
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result5_green[4];

			// 
			RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, srcSemaphore, srcContainer, srcRoute);
			return RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_0_7_expressionF();
		} else {
			return RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[0];
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_bindingAndBlack[1];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_bindingAndBlack[2];
		Semaphore srcSemaphore = (Semaphore) result1_bindingAndBlack[3];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[4];
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_bindingAndBlack[5];
		Place trgSemaphoreOperational = (Place) result1_bindingAndBlack[6];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[7];
		Transition trgRouteRepair = (Transition) result1_bindingAndBlack[8];
		SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result1_bindingAndBlack[9];
		Place trgSemaphoreFailed = (Place) result1_bindingAndBlack[10];
		Place trgRouteFailed = (Place) result1_bindingAndBlack[11];
		Place trgRouteOperational = (Place) result1_bindingAndBlack[12];
		Route srcRoute = (Route) result1_bindingAndBlack[13];
		SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result1_bindingAndBlack[14];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[15];
		Object[] result1_green = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_1_1_performtransformation_greenFFFBFBBFFBBBF(trgSemaphoreOperational,
						trgPetrinet, trgRouteRepair, trgSemaphoreFailed, trgRouteFailed, trgRouteOperational);
		Arc trgRouteOperationalToRouteFail = (Arc) result1_green[0];
		Arc trgRouteRepairToSemaphoreOperational = (Arc) result1_green[1];
		Arc trgRouteFailToRouteFailed = (Arc) result1_green[2];
		Arc trgSemaphoreOperationalToRouteRepair = (Arc) result1_green[4];
		ImmediateTransition trgRouteFail = (ImmediateTransition) result1_green[7];
		Arc trgSemaphoreFailedToRouteFail = (Arc) result1_green[8];
		Arc trgRouteFailToSemaphoreFailed = (Arc) result1_green[12];

		Object[] result2_black = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_1_2_collecttranslatedelements_blackBBBBBBB(
						trgRouteOperationalToRouteFail, trgRouteRepairToSemaphoreOperational, trgRouteFailToRouteFailed,
						trgSemaphoreOperationalToRouteRepair, trgRouteFail, trgSemaphoreFailedToRouteFail,
						trgRouteFailToSemaphoreFailed);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[trgRouteOperationalToRouteFail] = "
							+ trgRouteOperationalToRouteFail + ", " + "[trgRouteRepairToSemaphoreOperational] = "
							+ trgRouteRepairToSemaphoreOperational + ", " + "[trgRouteFailToRouteFailed] = "
							+ trgRouteFailToRouteFailed + ", " + "[trgSemaphoreOperationalToRouteRepair] = "
							+ trgSemaphoreOperationalToRouteRepair + ", " + "[trgRouteFail] = " + trgRouteFail + ", "
							+ "[trgSemaphoreFailedToRouteFail] = " + trgSemaphoreFailedToRouteFail + ", "
							+ "[trgRouteFailToSemaphoreFailed] = " + trgRouteFailToSemaphoreFailed + ".");
		}
		Object[] result2_green = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_1_2_collecttranslatedelements_greenFBBBBBBB(
						trgRouteOperationalToRouteFail, trgRouteRepairToSemaphoreOperational, trgRouteFailToRouteFailed,
						trgSemaphoreOperationalToRouteRepair, trgRouteFail, trgSemaphoreFailedToRouteFail,
						trgRouteFailToSemaphoreFailed);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(ruleresult,
						containerCorr, routeRepairCorr, trgRouteOperationalToRouteFail,
						trgRouteRepairToSemaphoreOperational, routeFailedCorr, srcSemaphore, srcContainer,
						trgRouteFailToRouteFailed, routeOperationalCorr, trgSemaphoreOperational,
						trgSemaphoreOperationalToRouteRepair, trgPetrinet, trgRouteRepair, trgRouteFail,
						trgSemaphoreFailedToRouteFail, semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed,
						trgRouteOperational, srcRoute, semaphoreOperationalCorr, trgRouteFailToSemaphoreFailed);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[containerCorr] = " + containerCorr + ", " + "[routeRepairCorr] = " + routeRepairCorr
					+ ", " + "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail + ", "
					+ "[trgRouteRepairToSemaphoreOperational] = " + trgRouteRepairToSemaphoreOperational + ", "
					+ "[routeFailedCorr] = " + routeFailedCorr + ", " + "[srcSemaphore] = " + srcSemaphore + ", "
					+ "[srcContainer] = " + srcContainer + ", " + "[trgRouteFailToRouteFailed] = "
					+ trgRouteFailToRouteFailed + ", " + "[routeOperationalCorr] = " + routeOperationalCorr + ", "
					+ "[trgSemaphoreOperational] = " + trgSemaphoreOperational + ", "
					+ "[trgSemaphoreOperationalToRouteRepair] = " + trgSemaphoreOperationalToRouteRepair + ", "
					+ "[trgPetrinet] = " + trgPetrinet + ", " + "[trgRouteRepair] = " + trgRouteRepair + ", "
					+ "[trgRouteFail] = " + trgRouteFail + ", " + "[trgSemaphoreFailedToRouteFail] = "
					+ trgSemaphoreFailedToRouteFail + ", " + "[semaphoreFailedCorr] = " + semaphoreFailedCorr + ", "
					+ "[trgSemaphoreFailed] = " + trgSemaphoreFailed + ", " + "[trgRouteFailed] = " + trgRouteFailed
					+ ", " + "[trgRouteOperational] = " + trgRouteOperational + ", " + "[srcRoute] = " + srcRoute + ", "
					+ "[semaphoreOperationalCorr] = " + semaphoreOperationalCorr + ", "
					+ "[trgRouteFailToSemaphoreFailed] = " + trgRouteFailToSemaphoreFailed + ".");
		}
		RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, trgRouteOperationalToRouteFail, trgRouteRepairToSemaphoreOperational, srcSemaphore,
						trgRouteFailToRouteFailed, trgSemaphoreOperational, trgSemaphoreOperationalToRouteRepair,
						trgPetrinet, trgRouteRepair, trgRouteFail, trgSemaphoreFailedToRouteFail, trgSemaphoreFailed,
						trgRouteFailed, trgRouteOperational, srcRoute, trgRouteFailToSemaphoreFailed);
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgRouteFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgPetrinet__trgRouteFail____nodes = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgSemaphoreFailedToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgRouteFail__trgSemaphoreFailedToRouteFail____arcs = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge srcRoute__srcSemaphore____exit = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgRouteFailToSemaphoreFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToSemaphoreFailed____arcs = (EMoflonEdge) result3_green[36];

		// 
		// 
		RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
				this, ruleresult, containerCorr, routeRepairCorr, trgRouteOperationalToRouteFail,
				trgRouteRepairToSemaphoreOperational, routeFailedCorr, srcSemaphore, srcContainer,
				trgRouteFailToRouteFailed, routeOperationalCorr, trgSemaphoreOperational,
				trgSemaphoreOperationalToRouteRepair, trgPetrinet, trgRouteRepair, trgRouteFail,
				trgSemaphoreFailedToRouteFail, semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed,
				trgRouteOperational, srcRoute, semaphoreOperationalCorr, trgRouteFailToSemaphoreFailed);
		return RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Semaphore srcSemaphore = (Semaphore) result2_binding[0];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[1];
		Route srcRoute = (Route) result2_binding[2];
		for (Object[] result2_black : RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_2_2_corematch_blackFFFBBFFFFFFFFBFB(srcSemaphore, srcContainer, srcRoute,
						match)) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[0];
			RouteToRepair routeRepairCorr = (RouteToRepair) result2_black[1];
			RouteToFailed routeFailedCorr = (RouteToFailed) result2_black[2];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result2_black[5];
			Place trgSemaphoreOperational = (Place) result2_black[6];
			PetriNet trgPetrinet = (PetriNet) result2_black[7];
			Transition trgRouteRepair = (Transition) result2_black[8];
			SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result2_black[9];
			Place trgSemaphoreFailed = (Place) result2_black[10];
			Place trgRouteFailed = (Place) result2_black[11];
			Place trgRouteOperational = (Place) result2_black[12];
			SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result2_black[14];
			// ForEach 
			for (Object[] result3_black : RequiredExitSemaphoreImpl
					.pattern_RequiredExitSemaphore_2_3_findcontext_blackBBBBBBBBBBBBBBB(containerCorr, routeRepairCorr,
							routeFailedCorr, srcSemaphore, srcContainer, routeOperationalCorr, trgSemaphoreOperational,
							trgPetrinet, trgRouteRepair, semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed,
							trgRouteOperational, srcRoute, semaphoreOperationalCorr)) {
				Object[] result3_green = RequiredExitSemaphoreImpl
						.pattern_RequiredExitSemaphore_2_3_findcontext_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
								containerCorr, routeRepairCorr, routeFailedCorr, srcSemaphore, srcContainer,
								routeOperationalCorr, trgSemaphoreOperational, trgPetrinet, trgRouteRepair,
								semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed, trgRouteOperational, srcRoute,
								semaphoreOperationalCorr);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[15];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge routeRepairCorr__trgRouteRepair____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge semaphoreFailedCorr__srcSemaphore____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge semaphoreFailedCorr__trgSemaphoreFailed____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge routeFailedCorr__trgRouteFailed____target = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge routeOperationalCorr__trgRouteOperational____target = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge srcRoute__srcSemaphore____exit = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge semaphoreOperationalCorr__trgSemaphoreOperational____target = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge semaphoreOperationalCorr__srcSemaphore____source = (EMoflonEdge) result3_green[29];

				Object[] result4_bindingAndBlack = RequiredExitSemaphoreImpl
						.pattern_RequiredExitSemaphore_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(this,
								isApplicableMatch, containerCorr, routeRepairCorr, routeFailedCorr, srcSemaphore,
								srcContainer, routeOperationalCorr, trgSemaphoreOperational, trgPetrinet,
								trgRouteRepair, semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed,
								trgRouteOperational, srcRoute, semaphoreOperationalCorr);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[containerCorr] = " + containerCorr
							+ ", " + "[routeRepairCorr] = " + routeRepairCorr + ", " + "[routeFailedCorr] = "
							+ routeFailedCorr + ", " + "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = "
							+ srcContainer + ", " + "[routeOperationalCorr] = " + routeOperationalCorr + ", "
							+ "[trgSemaphoreOperational] = " + trgSemaphoreOperational + ", " + "[trgPetrinet] = "
							+ trgPetrinet + ", " + "[trgRouteRepair] = " + trgRouteRepair + ", "
							+ "[semaphoreFailedCorr] = " + semaphoreFailedCorr + ", " + "[trgSemaphoreFailed] = "
							+ trgSemaphoreFailed + ", " + "[trgRouteFailed] = " + trgRouteFailed + ", "
							+ "[trgRouteOperational] = " + trgRouteOperational + ", " + "[srcRoute] = " + srcRoute
							+ ", " + "[semaphoreOperationalCorr] = " + semaphoreOperationalCorr + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = RequiredExitSemaphoreImpl
							.pattern_RequiredExitSemaphore_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Semaphore srcSemaphore, RailwayContainer srcContainer,
			Route srcRoute) {
		match.registerObject("srcSemaphore", srcSemaphore);
		match.registerObject("srcContainer", srcContainer);
		match.registerObject("srcRoute", srcRoute);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Semaphore srcSemaphore, RailwayContainer srcContainer,
			Route srcRoute) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			RouteToRepair routeRepairCorr, RouteToFailed routeFailedCorr, Semaphore srcSemaphore,
			RailwayContainer srcContainer, RouteToOperational routeOperationalCorr, Place trgSemaphoreOperational,
			PetriNet trgPetrinet, Transition trgRouteRepair, SemaphoreToFailed semaphoreFailedCorr,
			Place trgSemaphoreFailed, Place trgRouteFailed, Place trgRouteOperational, Route srcRoute,
			SemaphoreToOperational semaphoreOperationalCorr) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("routeRepairCorr", routeRepairCorr);
		isApplicableMatch.registerObject("routeFailedCorr", routeFailedCorr);
		isApplicableMatch.registerObject("srcSemaphore", srcSemaphore);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("routeOperationalCorr", routeOperationalCorr);
		isApplicableMatch.registerObject("trgSemaphoreOperational", trgSemaphoreOperational);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("trgRouteRepair", trgRouteRepair);
		isApplicableMatch.registerObject("semaphoreFailedCorr", semaphoreFailedCorr);
		isApplicableMatch.registerObject("trgSemaphoreFailed", trgSemaphoreFailed);
		isApplicableMatch.registerObject("trgRouteFailed", trgRouteFailed);
		isApplicableMatch.registerObject("trgRouteOperational", trgRouteOperational);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("semaphoreOperationalCorr", semaphoreOperationalCorr);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject containerCorr, EObject routeRepairCorr,
			EObject trgRouteOperationalToRouteFail, EObject trgRouteRepairToSemaphoreOperational,
			EObject routeFailedCorr, EObject srcSemaphore, EObject srcContainer, EObject trgRouteFailToRouteFailed,
			EObject routeOperationalCorr, EObject trgSemaphoreOperational, EObject trgSemaphoreOperationalToRouteRepair,
			EObject trgPetrinet, EObject trgRouteRepair, EObject trgRouteFail, EObject trgSemaphoreFailedToRouteFail,
			EObject semaphoreFailedCorr, EObject trgSemaphoreFailed, EObject trgRouteFailed,
			EObject trgRouteOperational, EObject srcRoute, EObject semaphoreOperationalCorr,
			EObject trgRouteFailToSemaphoreFailed) {
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("trgRouteOperationalToRouteFail", trgRouteOperationalToRouteFail);
		ruleresult.registerObject("trgRouteRepairToSemaphoreOperational", trgRouteRepairToSemaphoreOperational);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("srcSemaphore", srcSemaphore);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgRouteFailToRouteFailed", trgRouteFailToRouteFailed);
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("trgSemaphoreOperational", trgSemaphoreOperational);
		ruleresult.registerObject("trgSemaphoreOperationalToRouteRepair", trgSemaphoreOperationalToRouteRepair);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgRouteRepair", trgRouteRepair);
		ruleresult.registerObject("trgRouteFail", trgRouteFail);
		ruleresult.registerObject("trgSemaphoreFailedToRouteFail", trgSemaphoreFailedToRouteFail);
		ruleresult.registerObject("semaphoreFailedCorr", semaphoreFailedCorr);
		ruleresult.registerObject("trgSemaphoreFailed", trgSemaphoreFailed);
		ruleresult.registerObject("trgRouteFailed", trgRouteFailed);
		ruleresult.registerObject("trgRouteOperational", trgRouteOperational);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("semaphoreOperationalCorr", semaphoreOperationalCorr);
		ruleresult.registerObject("trgRouteFailToSemaphoreFailed", trgRouteFailToSemaphoreFailed);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_38(EMoflonEdge _edge_exit) {

		Object[] result1_bindingAndBlack = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_10_2_testcorematchandDECs_blackFFFB(_edge_exit)) {
			Semaphore srcSemaphore = (Semaphore) result2_black[0];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[1];
			Route srcRoute = (Route) result2_black[2];
			Object[] result2_green = RequiredExitSemaphoreImpl
					.pattern_RequiredExitSemaphore_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RequiredExitSemaphoreImpl
					.pattern_RequiredExitSemaphore_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, srcSemaphore, srcContainer, srcRoute)) {
				// 
				if (RequiredExitSemaphoreImpl
						.pattern_RequiredExitSemaphore_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = RequiredExitSemaphoreImpl
							.pattern_RequiredExitSemaphore_10_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("RequiredExitSemaphore");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("trgRouteOperationalToRouteFail", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteRepairToSemaphoreOperational", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToRouteFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSemaphoreOperationalToRouteRepair", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSemaphoreFailedToRouteFail", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToSemaphoreFailed", "kind", ArcKind.OUTPUT,
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
	public boolean checkDEC_FWD(Semaphore srcSemaphore, RailwayContainer srcContainer, Route srcRoute) {// 
		Object[] result1_black = RequiredExitSemaphoreImpl
				.pattern_RequiredExitSemaphore_13_1_matchtggpattern_blackBBB(srcSemaphore, srcContainer, srcRoute);
		if (result1_black != null) {
			return RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_13_2_expressionF();
		} else {
			return RequiredExitSemaphoreImpl.pattern_RequiredExitSemaphore_13_3_expressionF();
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
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___IS_APPROPRIATE_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_ROUTE:
			return isAppropriate_FWD((Match) arguments.get(0), (Semaphore) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Route) arguments.get(3));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_ROUTE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Semaphore) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Route) arguments.get(3));
			return null;
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_ROUTE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Semaphore) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Route) arguments.get(3));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINERTOPETRINET_ROUTETOREPAIR_ROUTETOFAILED_SEMAPHORE_RAILWAYCONTAINER_ROUTETOOPERATIONAL_PLACE_PETRINET_TRANSITION_SEMAPHORETOFAILED_PLACE_PLACE_PLACE_ROUTE_SEMAPHORETOOPERATIONAL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(RailwayContainerToPetriNet) arguments.get(1), (RouteToRepair) arguments.get(2),
					(RouteToFailed) arguments.get(3), (Semaphore) arguments.get(4), (RailwayContainer) arguments.get(5),
					(RouteToOperational) arguments.get(6), (Place) arguments.get(7), (PetriNet) arguments.get(8),
					(Transition) arguments.get(9), (SemaphoreToFailed) arguments.get(10), (Place) arguments.get(11),
					(Place) arguments.get(12), (Place) arguments.get(13), (Route) arguments.get(14),
					(SemaphoreToOperational) arguments.get(15));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18), (EObject) arguments.get(19),
					(EObject) arguments.get(20), (EObject) arguments.get(21), (EObject) arguments.get(22));
			return null;
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_38__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_38((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQUIRED_EXIT_SEMAPHORE___CHECK_DEC_FWD__SEMAPHORE_RAILWAYCONTAINER_ROUTE:
			return checkDEC_FWD((Semaphore) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Route) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RequiredExitSemaphore_0_1_initialbindings_blackBBBBB(
			RequiredExitSemaphore _this, Match match, Semaphore srcSemaphore, RailwayContainer srcContainer,
			Route srcRoute) {
		return new Object[] { _this, match, srcSemaphore, srcContainer, srcRoute };
	}

	public static final Object[] pattern_RequiredExitSemaphore_0_2_SolveCSP_bindingFBBBBB(RequiredExitSemaphore _this,
			Match match, Semaphore srcSemaphore, RailwayContainer srcContainer, Route srcRoute) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSemaphore, srcContainer, srcRoute);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSemaphore, srcContainer, srcRoute };
		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredExitSemaphore_0_2_SolveCSP_bindingAndBlackFBBBBB(
			RequiredExitSemaphore _this, Match match, Semaphore srcSemaphore, RailwayContainer srcContainer,
			Route srcRoute) {
		Object[] result_pattern_RequiredExitSemaphore_0_2_SolveCSP_binding = pattern_RequiredExitSemaphore_0_2_SolveCSP_bindingFBBBBB(
				_this, match, srcSemaphore, srcContainer, srcRoute);
		if (result_pattern_RequiredExitSemaphore_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredExitSemaphore_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RequiredExitSemaphore_0_2_SolveCSP_black = pattern_RequiredExitSemaphore_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_RequiredExitSemaphore_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSemaphore, srcContainer, srcRoute };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredExitSemaphore_0_3_CheckCSP_expressionFBB(RequiredExitSemaphore _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredExitSemaphore_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Semaphore srcSemaphore, RailwayContainer srcContainer, Route srcRoute) {
		return new Object[] { match, srcSemaphore, srcContainer, srcRoute };
	}

	public static final Object[] pattern_RequiredExitSemaphore_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Semaphore srcSemaphore, Route srcRoute) {
		EMoflonEdge srcRoute__srcSemaphore____exit = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRoute__srcSemaphore____exit_name_prime = "exit";
		srcRoute__srcSemaphore____exit.setSrc(srcRoute);
		srcRoute__srcSemaphore____exit.setTrg(srcSemaphore);
		match.getToBeTranslatedEdges().add(srcRoute__srcSemaphore____exit);
		srcRoute__srcSemaphore____exit.setName(srcRoute__srcSemaphore____exit_name_prime);
		return new Object[] { match, srcSemaphore, srcRoute, srcRoute__srcSemaphore____exit };
	}

	public static final Object[] pattern_RequiredExitSemaphore_0_5_collectcontextelements_blackBBBB(Match match,
			Semaphore srcSemaphore, RailwayContainer srcContainer, Route srcRoute) {
		return new Object[] { match, srcSemaphore, srcContainer, srcRoute };
	}

	public static final Object[] pattern_RequiredExitSemaphore_0_5_collectcontextelements_greenBBBBF(Match match,
			Semaphore srcSemaphore, RailwayContainer srcContainer, Route srcRoute) {
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcSemaphore);
		match.getContextNodes().add(srcContainer);
		match.getContextNodes().add(srcRoute);
		String srcContainer__srcRoute____routes_name_prime = "routes";
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		match.getContextEdges().add(srcContainer__srcRoute____routes);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { match, srcSemaphore, srcContainer, srcRoute, srcContainer__srcRoute____routes };
	}

	public static final void pattern_RequiredExitSemaphore_0_6_registerobjectstomatch_expressionBBBBB(
			RequiredExitSemaphore _this, Match match, Semaphore srcSemaphore, RailwayContainer srcContainer,
			Route srcRoute) {
		_this.registerObjectsToMatch_FWD(match, srcSemaphore, srcContainer, srcRoute);

	}

	public static final boolean pattern_RequiredExitSemaphore_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredExitSemaphore_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_RequiredExitSemaphore_1_1_performtransformation_bindingFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_1 = isApplicableMatch.getObject("routeRepairCorr");
		EObject _localVariable_2 = isApplicableMatch.getObject("routeFailedCorr");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcSemaphore");
		EObject _localVariable_4 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("routeOperationalCorr");
		EObject _localVariable_6 = isApplicableMatch.getObject("trgSemaphoreOperational");
		EObject _localVariable_7 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_8 = isApplicableMatch.getObject("trgRouteRepair");
		EObject _localVariable_9 = isApplicableMatch.getObject("semaphoreFailedCorr");
		EObject _localVariable_10 = isApplicableMatch.getObject("trgSemaphoreFailed");
		EObject _localVariable_11 = isApplicableMatch.getObject("trgRouteFailed");
		EObject _localVariable_12 = isApplicableMatch.getObject("trgRouteOperational");
		EObject _localVariable_13 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_14 = isApplicableMatch.getObject("semaphoreOperationalCorr");
		EObject tmpContainerCorr = _localVariable_0;
		EObject tmpRouteRepairCorr = _localVariable_1;
		EObject tmpRouteFailedCorr = _localVariable_2;
		EObject tmpSrcSemaphore = _localVariable_3;
		EObject tmpSrcContainer = _localVariable_4;
		EObject tmpRouteOperationalCorr = _localVariable_5;
		EObject tmpTrgSemaphoreOperational = _localVariable_6;
		EObject tmpTrgPetrinet = _localVariable_7;
		EObject tmpTrgRouteRepair = _localVariable_8;
		EObject tmpSemaphoreFailedCorr = _localVariable_9;
		EObject tmpTrgSemaphoreFailed = _localVariable_10;
		EObject tmpTrgRouteFailed = _localVariable_11;
		EObject tmpTrgRouteOperational = _localVariable_12;
		EObject tmpSrcRoute = _localVariable_13;
		EObject tmpSemaphoreOperationalCorr = _localVariable_14;
		if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
			if (tmpRouteRepairCorr instanceof RouteToRepair) {
				RouteToRepair routeRepairCorr = (RouteToRepair) tmpRouteRepairCorr;
				if (tmpRouteFailedCorr instanceof RouteToFailed) {
					RouteToFailed routeFailedCorr = (RouteToFailed) tmpRouteFailedCorr;
					if (tmpSrcSemaphore instanceof Semaphore) {
						Semaphore srcSemaphore = (Semaphore) tmpSrcSemaphore;
						if (tmpSrcContainer instanceof RailwayContainer) {
							RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
							if (tmpRouteOperationalCorr instanceof RouteToOperational) {
								RouteToOperational routeOperationalCorr = (RouteToOperational) tmpRouteOperationalCorr;
								if (tmpTrgSemaphoreOperational instanceof Place) {
									Place trgSemaphoreOperational = (Place) tmpTrgSemaphoreOperational;
									if (tmpTrgPetrinet instanceof PetriNet) {
										PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
										if (tmpTrgRouteRepair instanceof Transition) {
											Transition trgRouteRepair = (Transition) tmpTrgRouteRepair;
											if (tmpSemaphoreFailedCorr instanceof SemaphoreToFailed) {
												SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) tmpSemaphoreFailedCorr;
												if (tmpTrgSemaphoreFailed instanceof Place) {
													Place trgSemaphoreFailed = (Place) tmpTrgSemaphoreFailed;
													if (tmpTrgRouteFailed instanceof Place) {
														Place trgRouteFailed = (Place) tmpTrgRouteFailed;
														if (tmpTrgRouteOperational instanceof Place) {
															Place trgRouteOperational = (Place) tmpTrgRouteOperational;
															if (tmpSrcRoute instanceof Route) {
																Route srcRoute = (Route) tmpSrcRoute;
																if (tmpSemaphoreOperationalCorr instanceof SemaphoreToOperational) {
																	SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) tmpSemaphoreOperationalCorr;
																	return new Object[] { containerCorr,
																			routeRepairCorr, routeFailedCorr,
																			srcSemaphore, srcContainer,
																			routeOperationalCorr,
																			trgSemaphoreOperational, trgPetrinet,
																			trgRouteRepair, semaphoreFailedCorr,
																			trgSemaphoreFailed, trgRouteFailed,
																			trgRouteOperational, srcRoute,
																			semaphoreOperationalCorr,
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
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_1_1_performtransformation_blackBBBBBBBBBBBBBBBFBB(
			RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr, RouteToFailed routeFailedCorr,
			Semaphore srcSemaphore, RailwayContainer srcContainer, RouteToOperational routeOperationalCorr,
			Place trgSemaphoreOperational, PetriNet trgPetrinet, Transition trgRouteRepair,
			SemaphoreToFailed semaphoreFailedCorr, Place trgSemaphoreFailed, Place trgRouteFailed,
			Place trgRouteOperational, Route srcRoute, SemaphoreToOperational semaphoreOperationalCorr,
			RequiredExitSemaphore _this, IsApplicableMatch isApplicableMatch) {
		if (!trgSemaphoreFailed.equals(trgSemaphoreOperational)) {
			if (!trgRouteFailed.equals(trgSemaphoreOperational)) {
				if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
					if (!trgRouteFailed.equals(trgRouteOperational)) {
						if (!trgRouteOperational.equals(trgSemaphoreOperational)) {
							if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { containerCorr, routeRepairCorr, routeFailedCorr,
												srcSemaphore, srcContainer, routeOperationalCorr,
												trgSemaphoreOperational, trgPetrinet, trgRouteRepair,
												semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed,
												trgRouteOperational, srcRoute, semaphoreOperationalCorr, csp, _this,
												isApplicableMatch };
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

	public static final Object[] pattern_RequiredExitSemaphore_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFBB(
			RequiredExitSemaphore _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding = pattern_RequiredExitSemaphore_1_1_performtransformation_bindingFFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding != null) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[0];
			RouteToRepair routeRepairCorr = (RouteToRepair) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[1];
			RouteToFailed routeFailedCorr = (RouteToFailed) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[2];
			Semaphore srcSemaphore = (Semaphore) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[3];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[4];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[5];
			Place trgSemaphoreOperational = (Place) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[6];
			PetriNet trgPetrinet = (PetriNet) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[7];
			Transition trgRouteRepair = (Transition) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[8];
			SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[9];
			Place trgSemaphoreFailed = (Place) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[10];
			Place trgRouteFailed = (Place) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[11];
			Place trgRouteOperational = (Place) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[12];
			Route srcRoute = (Route) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[13];
			SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result_pattern_RequiredExitSemaphore_1_1_performtransformation_binding[14];

			Object[] result_pattern_RequiredExitSemaphore_1_1_performtransformation_black = pattern_RequiredExitSemaphore_1_1_performtransformation_blackBBBBBBBBBBBBBBBFBB(
					containerCorr, routeRepairCorr, routeFailedCorr, srcSemaphore, srcContainer, routeOperationalCorr,
					trgSemaphoreOperational, trgPetrinet, trgRouteRepair, semaphoreFailedCorr, trgSemaphoreFailed,
					trgRouteFailed, trgRouteOperational, srcRoute, semaphoreOperationalCorr, _this, isApplicableMatch);
			if (result_pattern_RequiredExitSemaphore_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RequiredExitSemaphore_1_1_performtransformation_black[15];

				return new Object[] { containerCorr, routeRepairCorr, routeFailedCorr, srcSemaphore, srcContainer,
						routeOperationalCorr, trgSemaphoreOperational, trgPetrinet, trgRouteRepair, semaphoreFailedCorr,
						trgSemaphoreFailed, trgRouteFailed, trgRouteOperational, srcRoute, semaphoreOperationalCorr,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_1_1_performtransformation_greenFFFBFBBFFBBBF(
			Place trgSemaphoreOperational, PetriNet trgPetrinet, Transition trgRouteRepair, Place trgSemaphoreFailed,
			Place trgRouteFailed, Place trgRouteOperational) {
		Arc trgRouteOperationalToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteRepairToSemaphoreOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToRouteFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSemaphoreOperationalToRouteRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		ImmediateTransition trgRouteFail = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		Arc trgSemaphoreFailedToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToSemaphoreFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		ArcKind trgRouteOperationalToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteRepairToSemaphoreOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteFailToRouteFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgSemaphoreOperationalToRouteRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgSemaphoreFailedToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteFailToSemaphoreFailed_kind_prime = ArcKind.OUTPUT;
		trgRouteOperationalToRouteFail.setPlace(trgRouteOperational);
		trgRouteRepairToSemaphoreOperational.setTransition(trgRouteRepair);
		trgRouteRepairToSemaphoreOperational.setPlace(trgSemaphoreOperational);
		trgRouteFailToRouteFailed.setPlace(trgRouteFailed);
		trgSemaphoreOperationalToRouteRepair.setPlace(trgSemaphoreOperational);
		trgSemaphoreOperationalToRouteRepair.setTransition(trgRouteRepair);
		trgRouteOperationalToRouteFail.setTransition(trgRouteFail);
		trgRouteFail.setPetriNet(trgPetrinet);
		trgRouteFailToRouteFailed.setTransition(trgRouteFail);
		trgSemaphoreFailedToRouteFail.setTransition(trgRouteFail);
		trgSemaphoreFailedToRouteFail.setPlace(trgSemaphoreFailed);
		trgRouteFailToSemaphoreFailed.setPlace(trgSemaphoreFailed);
		trgRouteFailToSemaphoreFailed.setTransition(trgRouteFail);
		trgRouteOperationalToRouteFail.setKind(trgRouteOperationalToRouteFail_kind_prime);
		trgRouteRepairToSemaphoreOperational.setKind(trgRouteRepairToSemaphoreOperational_kind_prime);
		trgRouteFailToRouteFailed.setKind(trgRouteFailToRouteFailed_kind_prime);
		trgSemaphoreOperationalToRouteRepair.setKind(trgSemaphoreOperationalToRouteRepair_kind_prime);
		trgSemaphoreFailedToRouteFail.setKind(trgSemaphoreFailedToRouteFail_kind_prime);
		trgRouteFailToSemaphoreFailed.setKind(trgRouteFailToSemaphoreFailed_kind_prime);
		return new Object[] { trgRouteOperationalToRouteFail, trgRouteRepairToSemaphoreOperational,
				trgRouteFailToRouteFailed, trgSemaphoreOperational, trgSemaphoreOperationalToRouteRepair, trgPetrinet,
				trgRouteRepair, trgRouteFail, trgSemaphoreFailedToRouteFail, trgSemaphoreFailed, trgRouteFailed,
				trgRouteOperational, trgRouteFailToSemaphoreFailed };
	}

	public static final Object[] pattern_RequiredExitSemaphore_1_2_collecttranslatedelements_blackBBBBBBB(
			Arc trgRouteOperationalToRouteFail, Arc trgRouteRepairToSemaphoreOperational, Arc trgRouteFailToRouteFailed,
			Arc trgSemaphoreOperationalToRouteRepair, ImmediateTransition trgRouteFail,
			Arc trgSemaphoreFailedToRouteFail, Arc trgRouteFailToSemaphoreFailed) {
		if (!trgRouteOperationalToRouteFail.equals(trgRouteRepairToSemaphoreOperational)) {
			if (!trgRouteOperationalToRouteFail.equals(trgSemaphoreOperationalToRouteRepair)) {
				if (!trgRouteOperationalToRouteFail.equals(trgSemaphoreFailedToRouteFail)) {
					if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreOperationalToRouteRepair)) {
						if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreFailedToRouteFail)) {
							if (!trgRouteFailToRouteFailed.equals(trgRouteOperationalToRouteFail)) {
								if (!trgRouteFailToRouteFailed.equals(trgRouteRepairToSemaphoreOperational)) {
									if (!trgRouteFailToRouteFailed.equals(trgSemaphoreOperationalToRouteRepair)) {
										if (!trgRouteFailToRouteFailed.equals(trgSemaphoreFailedToRouteFail)) {
											if (!trgRouteFailToRouteFailed.equals(trgRouteFailToSemaphoreFailed)) {
												if (!trgSemaphoreFailedToRouteFail
														.equals(trgSemaphoreOperationalToRouteRepair)) {
													if (!trgRouteFailToSemaphoreFailed
															.equals(trgRouteOperationalToRouteFail)) {
														if (!trgRouteFailToSemaphoreFailed
																.equals(trgRouteRepairToSemaphoreOperational)) {
															if (!trgRouteFailToSemaphoreFailed
																	.equals(trgSemaphoreOperationalToRouteRepair)) {
																if (!trgRouteFailToSemaphoreFailed
																		.equals(trgSemaphoreFailedToRouteFail)) {
																	return new Object[] {
																			trgRouteOperationalToRouteFail,
																			trgRouteRepairToSemaphoreOperational,
																			trgRouteFailToRouteFailed,
																			trgSemaphoreOperationalToRouteRepair,
																			trgRouteFail, trgSemaphoreFailedToRouteFail,
																			trgRouteFailToSemaphoreFailed };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredExitSemaphore_1_2_collecttranslatedelements_greenFBBBBBBB(
			Arc trgRouteOperationalToRouteFail, Arc trgRouteRepairToSemaphoreOperational, Arc trgRouteFailToRouteFailed,
			Arc trgSemaphoreOperationalToRouteRepair, ImmediateTransition trgRouteFail,
			Arc trgSemaphoreFailedToRouteFail, Arc trgRouteFailToSemaphoreFailed) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedElements().add(trgRouteRepairToSemaphoreOperational);
		ruleresult.getCreatedElements().add(trgRouteFailToRouteFailed);
		ruleresult.getCreatedElements().add(trgSemaphoreOperationalToRouteRepair);
		ruleresult.getCreatedElements().add(trgRouteFail);
		ruleresult.getCreatedElements().add(trgSemaphoreFailedToRouteFail);
		ruleresult.getCreatedElements().add(trgRouteFailToSemaphoreFailed);
		return new Object[] { ruleresult, trgRouteOperationalToRouteFail, trgRouteRepairToSemaphoreOperational,
				trgRouteFailToRouteFailed, trgSemaphoreOperationalToRouteRepair, trgRouteFail,
				trgSemaphoreFailedToRouteFail, trgRouteFailToSemaphoreFailed };
	}

	public static final Object[] pattern_RequiredExitSemaphore_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject containerCorr, EObject routeRepairCorr,
			EObject trgRouteOperationalToRouteFail, EObject trgRouteRepairToSemaphoreOperational,
			EObject routeFailedCorr, EObject srcSemaphore, EObject srcContainer, EObject trgRouteFailToRouteFailed,
			EObject routeOperationalCorr, EObject trgSemaphoreOperational, EObject trgSemaphoreOperationalToRouteRepair,
			EObject trgPetrinet, EObject trgRouteRepair, EObject trgRouteFail, EObject trgSemaphoreFailedToRouteFail,
			EObject semaphoreFailedCorr, EObject trgSemaphoreFailed, EObject trgRouteFailed,
			EObject trgRouteOperational, EObject srcRoute, EObject semaphoreOperationalCorr,
			EObject trgRouteFailToSemaphoreFailed) {
		if (!containerCorr.equals(routeRepairCorr)) {
			if (!containerCorr.equals(trgRouteOperationalToRouteFail)) {
				if (!containerCorr.equals(trgRouteRepairToSemaphoreOperational)) {
					if (!containerCorr.equals(routeFailedCorr)) {
						if (!containerCorr.equals(srcSemaphore)) {
							if (!containerCorr.equals(srcContainer)) {
								if (!containerCorr.equals(trgRouteFailToRouteFailed)) {
									if (!containerCorr.equals(routeOperationalCorr)) {
										if (!containerCorr.equals(trgSemaphoreOperational)) {
											if (!containerCorr.equals(trgSemaphoreOperationalToRouteRepair)) {
												if (!containerCorr.equals(trgPetrinet)) {
													if (!containerCorr.equals(trgRouteRepair)) {
														if (!containerCorr.equals(trgRouteFail)) {
															if (!containerCorr.equals(trgSemaphoreFailedToRouteFail)) {
																if (!containerCorr.equals(semaphoreFailedCorr)) {
																	if (!containerCorr.equals(trgSemaphoreFailed)) {
																		if (!containerCorr.equals(trgRouteFailed)) {
																			if (!containerCorr
																					.equals(trgRouteOperational)) {
																				if (!containerCorr.equals(srcRoute)) {
																					if (!containerCorr.equals(
																							semaphoreOperationalCorr)) {
																						if (!containerCorr.equals(
																								trgRouteFailToSemaphoreFailed)) {
																							if (!routeRepairCorr.equals(
																									trgRouteOperationalToRouteFail)) {
																								if (!routeRepairCorr
																										.equals(trgRouteRepairToSemaphoreOperational)) {
																									if (!routeRepairCorr
																											.equals(srcSemaphore)) {
																										if (!routeRepairCorr
																												.equals(srcContainer)) {
																											if (!routeRepairCorr
																													.equals(trgRouteFailToRouteFailed)) {
																												if (!routeRepairCorr
																														.equals(trgSemaphoreOperational)) {
																													if (!routeRepairCorr
																															.equals(trgSemaphoreOperationalToRouteRepair)) {
																														if (!routeRepairCorr
																																.equals(trgPetrinet)) {
																															if (!routeRepairCorr
																																	.equals(trgRouteRepair)) {
																																if (!routeRepairCorr
																																		.equals(trgRouteFail)) {
																																	if (!routeRepairCorr
																																			.equals(trgSemaphoreFailedToRouteFail)) {
																																		if (!routeRepairCorr
																																				.equals(semaphoreFailedCorr)) {
																																			if (!routeRepairCorr
																																					.equals(trgSemaphoreFailed)) {
																																				if (!routeRepairCorr
																																						.equals(trgRouteFailed)) {
																																					if (!routeRepairCorr
																																							.equals(trgRouteOperational)) {
																																						if (!routeRepairCorr
																																								.equals(srcRoute)) {
																																							if (!routeRepairCorr
																																									.equals(semaphoreOperationalCorr)) {
																																								if (!routeRepairCorr
																																										.equals(trgRouteFailToSemaphoreFailed)) {
																																									if (!trgRouteOperationalToRouteFail
																																											.equals(trgRouteRepairToSemaphoreOperational)) {
																																										if (!trgRouteOperationalToRouteFail
																																												.equals(trgSemaphoreOperational)) {
																																											if (!trgRouteOperationalToRouteFail
																																													.equals(trgSemaphoreOperationalToRouteRepair)) {
																																												if (!trgRouteOperationalToRouteFail
																																														.equals(trgRouteRepair)) {
																																													if (!trgRouteOperationalToRouteFail
																																															.equals(trgSemaphoreFailedToRouteFail)) {
																																														if (!trgRouteOperationalToRouteFail
																																																.equals(trgSemaphoreFailed)) {
																																															if (!trgRouteRepairToSemaphoreOperational
																																																	.equals(trgSemaphoreOperational)) {
																																																if (!trgRouteRepairToSemaphoreOperational
																																																		.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																	if (!trgRouteRepairToSemaphoreOperational
																																																			.equals(trgSemaphoreFailedToRouteFail)) {
																																																		if (!trgRouteRepairToSemaphoreOperational
																																																				.equals(trgSemaphoreFailed)) {
																																																			if (!routeFailedCorr
																																																					.equals(routeRepairCorr)) {
																																																				if (!routeFailedCorr
																																																						.equals(trgRouteOperationalToRouteFail)) {
																																																					if (!routeFailedCorr
																																																							.equals(trgRouteRepairToSemaphoreOperational)) {
																																																						if (!routeFailedCorr
																																																								.equals(srcSemaphore)) {
																																																							if (!routeFailedCorr
																																																									.equals(srcContainer)) {
																																																								if (!routeFailedCorr
																																																										.equals(trgRouteFailToRouteFailed)) {
																																																									if (!routeFailedCorr
																																																											.equals(routeOperationalCorr)) {
																																																										if (!routeFailedCorr
																																																												.equals(trgSemaphoreOperational)) {
																																																											if (!routeFailedCorr
																																																													.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																												if (!routeFailedCorr
																																																														.equals(trgPetrinet)) {
																																																													if (!routeFailedCorr
																																																															.equals(trgRouteRepair)) {
																																																														if (!routeFailedCorr
																																																																.equals(trgRouteFail)) {
																																																															if (!routeFailedCorr
																																																																	.equals(trgSemaphoreFailedToRouteFail)) {
																																																																if (!routeFailedCorr
																																																																		.equals(semaphoreFailedCorr)) {
																																																																	if (!routeFailedCorr
																																																																			.equals(trgSemaphoreFailed)) {
																																																																		if (!routeFailedCorr
																																																																				.equals(trgRouteFailed)) {
																																																																			if (!routeFailedCorr
																																																																					.equals(trgRouteOperational)) {
																																																																				if (!routeFailedCorr
																																																																						.equals(srcRoute)) {
																																																																					if (!routeFailedCorr
																																																																							.equals(semaphoreOperationalCorr)) {
																																																																						if (!routeFailedCorr
																																																																								.equals(trgRouteFailToSemaphoreFailed)) {
																																																																							if (!srcSemaphore
																																																																									.equals(trgRouteOperationalToRouteFail)) {
																																																																								if (!srcSemaphore
																																																																										.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																									if (!srcSemaphore
																																																																											.equals(trgRouteFailToRouteFailed)) {
																																																																										if (!srcSemaphore
																																																																												.equals(trgSemaphoreOperational)) {
																																																																											if (!srcSemaphore
																																																																													.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																												if (!srcSemaphore
																																																																														.equals(trgPetrinet)) {
																																																																													if (!srcSemaphore
																																																																															.equals(trgRouteRepair)) {
																																																																														if (!srcSemaphore
																																																																																.equals(trgRouteFail)) {
																																																																															if (!srcSemaphore
																																																																																	.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																if (!srcSemaphore
																																																																																		.equals(trgSemaphoreFailed)) {
																																																																																	if (!srcSemaphore
																																																																																			.equals(trgRouteFailed)) {
																																																																																		if (!srcSemaphore
																																																																																				.equals(trgRouteOperational)) {
																																																																																			if (!srcSemaphore
																																																																																					.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																				if (!srcContainer
																																																																																						.equals(trgRouteOperationalToRouteFail)) {
																																																																																					if (!srcContainer
																																																																																							.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																						if (!srcContainer
																																																																																								.equals(srcSemaphore)) {
																																																																																							if (!srcContainer
																																																																																									.equals(trgRouteFailToRouteFailed)) {
																																																																																								if (!srcContainer
																																																																																										.equals(trgSemaphoreOperational)) {
																																																																																									if (!srcContainer
																																																																																											.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																										if (!srcContainer
																																																																																												.equals(trgPetrinet)) {
																																																																																											if (!srcContainer
																																																																																													.equals(trgRouteRepair)) {
																																																																																												if (!srcContainer
																																																																																														.equals(trgRouteFail)) {
																																																																																													if (!srcContainer
																																																																																															.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																														if (!srcContainer
																																																																																																.equals(trgSemaphoreFailed)) {
																																																																																															if (!srcContainer
																																																																																																	.equals(trgRouteFailed)) {
																																																																																																if (!srcContainer
																																																																																																		.equals(trgRouteOperational)) {
																																																																																																	if (!srcContainer
																																																																																																			.equals(srcRoute)) {
																																																																																																		if (!srcContainer
																																																																																																				.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																			if (!trgRouteFailToRouteFailed
																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																				if (!trgRouteFailToRouteFailed
																																																																																																						.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																					if (!trgRouteFailToRouteFailed
																																																																																																							.equals(trgSemaphoreOperational)) {
																																																																																																						if (!trgRouteFailToRouteFailed
																																																																																																								.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																							if (!trgRouteFailToRouteFailed
																																																																																																									.equals(trgRouteRepair)) {
																																																																																																								if (!trgRouteFailToRouteFailed
																																																																																																										.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																									if (!trgRouteFailToRouteFailed
																																																																																																											.equals(trgSemaphoreFailed)) {
																																																																																																										if (!trgRouteFailToRouteFailed
																																																																																																												.equals(trgRouteFailed)) {
																																																																																																											if (!trgRouteFailToRouteFailed
																																																																																																													.equals(trgRouteOperational)) {
																																																																																																												if (!trgRouteFailToRouteFailed
																																																																																																														.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																													if (!routeOperationalCorr
																																																																																																															.equals(routeRepairCorr)) {
																																																																																																														if (!routeOperationalCorr
																																																																																																																.equals(trgRouteOperationalToRouteFail)) {
																																																																																																															if (!routeOperationalCorr
																																																																																																																	.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																if (!routeOperationalCorr
																																																																																																																		.equals(srcSemaphore)) {
																																																																																																																	if (!routeOperationalCorr
																																																																																																																			.equals(srcContainer)) {
																																																																																																																		if (!routeOperationalCorr
																																																																																																																				.equals(trgRouteFailToRouteFailed)) {
																																																																																																																			if (!routeOperationalCorr
																																																																																																																					.equals(trgSemaphoreOperational)) {
																																																																																																																				if (!routeOperationalCorr
																																																																																																																						.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																					if (!routeOperationalCorr
																																																																																																																							.equals(trgPetrinet)) {
																																																																																																																						if (!routeOperationalCorr
																																																																																																																								.equals(trgRouteRepair)) {
																																																																																																																							if (!routeOperationalCorr
																																																																																																																									.equals(trgRouteFail)) {
																																																																																																																								if (!routeOperationalCorr
																																																																																																																										.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																									if (!routeOperationalCorr
																																																																																																																											.equals(semaphoreFailedCorr)) {
																																																																																																																										if (!routeOperationalCorr
																																																																																																																												.equals(trgSemaphoreFailed)) {
																																																																																																																											if (!routeOperationalCorr
																																																																																																																													.equals(trgRouteFailed)) {
																																																																																																																												if (!routeOperationalCorr
																																																																																																																														.equals(trgRouteOperational)) {
																																																																																																																													if (!routeOperationalCorr
																																																																																																																															.equals(srcRoute)) {
																																																																																																																														if (!routeOperationalCorr
																																																																																																																																.equals(semaphoreOperationalCorr)) {
																																																																																																																															if (!routeOperationalCorr
																																																																																																																																	.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																if (!trgSemaphoreOperational
																																																																																																																																		.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																	if (!trgPetrinet
																																																																																																																																			.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																		if (!trgPetrinet
																																																																																																																																				.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																			if (!trgPetrinet
																																																																																																																																					.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																				if (!trgPetrinet
																																																																																																																																						.equals(trgSemaphoreOperational)) {
																																																																																																																																					if (!trgPetrinet
																																																																																																																																							.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																						if (!trgPetrinet
																																																																																																																																								.equals(trgRouteRepair)) {
																																																																																																																																							if (!trgPetrinet
																																																																																																																																									.equals(trgRouteFail)) {
																																																																																																																																								if (!trgPetrinet
																																																																																																																																										.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																									if (!trgPetrinet
																																																																																																																																											.equals(trgSemaphoreFailed)) {
																																																																																																																																										if (!trgPetrinet
																																																																																																																																												.equals(trgRouteFailed)) {
																																																																																																																																											if (!trgPetrinet
																																																																																																																																													.equals(trgRouteOperational)) {
																																																																																																																																												if (!trgPetrinet
																																																																																																																																														.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																													if (!trgRouteRepair
																																																																																																																																															.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																														if (!trgRouteRepair
																																																																																																																																																.equals(trgSemaphoreOperational)) {
																																																																																																																																															if (!trgRouteRepair
																																																																																																																																																	.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																if (!trgRouteRepair
																																																																																																																																																		.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																	if (!trgRouteRepair
																																																																																																																																																			.equals(trgSemaphoreFailed)) {
																																																																																																																																																		if (!trgRouteFail
																																																																																																																																																				.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																			if (!trgRouteFail
																																																																																																																																																					.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																				if (!trgRouteFail
																																																																																																																																																						.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																					if (!trgRouteFail
																																																																																																																																																							.equals(trgSemaphoreOperational)) {
																																																																																																																																																						if (!trgRouteFail
																																																																																																																																																								.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																							if (!trgRouteFail
																																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																																								if (!trgRouteFail
																																																																																																																																																										.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																									if (!trgRouteFail
																																																																																																																																																											.equals(trgSemaphoreFailed)) {
																																																																																																																																																										if (!trgRouteFail
																																																																																																																																																												.equals(trgRouteFailed)) {
																																																																																																																																																											if (!trgRouteFail
																																																																																																																																																													.equals(trgRouteOperational)) {
																																																																																																																																																												if (!trgRouteFail
																																																																																																																																																														.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																													if (!trgSemaphoreFailedToRouteFail
																																																																																																																																																															.equals(trgSemaphoreOperational)) {
																																																																																																																																																														if (!trgSemaphoreFailedToRouteFail
																																																																																																																																																																.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																															if (!semaphoreFailedCorr
																																																																																																																																																																	.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																if (!semaphoreFailedCorr
																																																																																																																																																																		.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																	if (!semaphoreFailedCorr
																																																																																																																																																																			.equals(srcSemaphore)) {
																																																																																																																																																																		if (!semaphoreFailedCorr
																																																																																																																																																																				.equals(srcContainer)) {
																																																																																																																																																																			if (!semaphoreFailedCorr
																																																																																																																																																																					.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																				if (!semaphoreFailedCorr
																																																																																																																																																																						.equals(trgSemaphoreOperational)) {
																																																																																																																																																																					if (!semaphoreFailedCorr
																																																																																																																																																																							.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																						if (!semaphoreFailedCorr
																																																																																																																																																																								.equals(trgPetrinet)) {
																																																																																																																																																																							if (!semaphoreFailedCorr
																																																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																																																								if (!semaphoreFailedCorr
																																																																																																																																																																										.equals(trgRouteFail)) {
																																																																																																																																																																									if (!semaphoreFailedCorr
																																																																																																																																																																											.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																										if (!semaphoreFailedCorr
																																																																																																																																																																												.equals(trgSemaphoreFailed)) {
																																																																																																																																																																											if (!semaphoreFailedCorr
																																																																																																																																																																													.equals(trgRouteFailed)) {
																																																																																																																																																																												if (!semaphoreFailedCorr
																																																																																																																																																																														.equals(trgRouteOperational)) {
																																																																																																																																																																													if (!semaphoreFailedCorr
																																																																																																																																																																															.equals(srcRoute)) {
																																																																																																																																																																														if (!semaphoreFailedCorr
																																																																																																																																																																																.equals(semaphoreOperationalCorr)) {
																																																																																																																																																																															if (!semaphoreFailedCorr
																																																																																																																																																																																	.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																if (!trgSemaphoreFailed
																																																																																																																																																																																		.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																	if (!trgSemaphoreFailed
																																																																																																																																																																																			.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																		if (!trgSemaphoreFailed
																																																																																																																																																																																				.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																			if (!trgRouteFailed
																																																																																																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																				if (!trgRouteFailed
																																																																																																																																																																																						.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																					if (!trgRouteFailed
																																																																																																																																																																																							.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																						if (!trgRouteFailed
																																																																																																																																																																																								.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																							if (!trgRouteFailed
																																																																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																																																																								if (!trgRouteFailed
																																																																																																																																																																																										.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																									if (!trgRouteFailed
																																																																																																																																																																																											.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																										if (!trgRouteFailed
																																																																																																																																																																																												.equals(trgRouteOperational)) {
																																																																																																																																																																																											if (!trgRouteOperational
																																																																																																																																																																																													.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																												if (!trgRouteOperational
																																																																																																																																																																																														.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																													if (!trgRouteOperational
																																																																																																																																																																																															.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																														if (!trgRouteOperational
																																																																																																																																																																																																.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																															if (!trgRouteOperational
																																																																																																																																																																																																	.equals(trgRouteRepair)) {
																																																																																																																																																																																																if (!trgRouteOperational
																																																																																																																																																																																																		.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																	if (!trgRouteOperational
																																																																																																																																																																																																			.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																		if (!srcRoute
																																																																																																																																																																																																				.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																			if (!srcRoute
																																																																																																																																																																																																					.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																				if (!srcRoute
																																																																																																																																																																																																						.equals(srcSemaphore)) {
																																																																																																																																																																																																					if (!srcRoute
																																																																																																																																																																																																							.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																						if (!srcRoute
																																																																																																																																																																																																								.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																							if (!srcRoute
																																																																																																																																																																																																									.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																								if (!srcRoute
																																																																																																																																																																																																										.equals(trgPetrinet)) {
																																																																																																																																																																																																									if (!srcRoute
																																																																																																																																																																																																											.equals(trgRouteRepair)) {
																																																																																																																																																																																																										if (!srcRoute
																																																																																																																																																																																																												.equals(trgRouteFail)) {
																																																																																																																																																																																																											if (!srcRoute
																																																																																																																																																																																																													.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																												if (!srcRoute
																																																																																																																																																																																																														.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																													if (!srcRoute
																																																																																																																																																																																																															.equals(trgRouteFailed)) {
																																																																																																																																																																																																														if (!srcRoute
																																																																																																																																																																																																																.equals(trgRouteOperational)) {
																																																																																																																																																																																																															if (!srcRoute
																																																																																																																																																																																																																	.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																																																if (!semaphoreOperationalCorr
																																																																																																																																																																																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																	if (!semaphoreOperationalCorr
																																																																																																																																																																																																																			.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																																		if (!semaphoreOperationalCorr
																																																																																																																																																																																																																				.equals(srcSemaphore)) {
																																																																																																																																																																																																																			if (!semaphoreOperationalCorr
																																																																																																																																																																																																																					.equals(srcContainer)) {
																																																																																																																																																																																																																				if (!semaphoreOperationalCorr
																																																																																																																																																																																																																						.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																					if (!semaphoreOperationalCorr
																																																																																																																																																																																																																							.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																																						if (!semaphoreOperationalCorr
																																																																																																																																																																																																																								.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																																							if (!semaphoreOperationalCorr
																																																																																																																																																																																																																									.equals(trgPetrinet)) {
																																																																																																																																																																																																																								if (!semaphoreOperationalCorr
																																																																																																																																																																																																																										.equals(trgRouteRepair)) {
																																																																																																																																																																																																																									if (!semaphoreOperationalCorr
																																																																																																																																																																																																																											.equals(trgRouteFail)) {
																																																																																																																																																																																																																										if (!semaphoreOperationalCorr
																																																																																																																																																																																																																												.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																																											if (!semaphoreOperationalCorr
																																																																																																																																																																																																																													.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																																												if (!semaphoreOperationalCorr
																																																																																																																																																																																																																														.equals(trgRouteFailed)) {
																																																																																																																																																																																																																													if (!semaphoreOperationalCorr
																																																																																																																																																																																																																															.equals(trgRouteOperational)) {
																																																																																																																																																																																																																														if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																.equals(srcRoute)) {
																																																																																																																																																																																																																															if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																	.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																																																																if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																	if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																			.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																																																		if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																				.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																																																			if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																					.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																																																				if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																						.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																					if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																							.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																																																						if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																								.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																																																							if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																									.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																								if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																																																																																																										.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																									return new Object[] {
																																																																																																																																																																																																																																											ruleresult,
																																																																																																																																																																																																																																											containerCorr,
																																																																																																																																																																																																																																											routeRepairCorr,
																																																																																																																																																																																																																																											trgRouteOperationalToRouteFail,
																																																																																																																																																																																																																																											trgRouteRepairToSemaphoreOperational,
																																																																																																																																																																																																																																											routeFailedCorr,
																																																																																																																																																																																																																																											srcSemaphore,
																																																																																																																																																																																																																																											srcContainer,
																																																																																																																																																																																																																																											trgRouteFailToRouteFailed,
																																																																																																																																																																																																																																											routeOperationalCorr,
																																																																																																																																																																																																																																											trgSemaphoreOperational,
																																																																																																																																																																																																																																											trgSemaphoreOperationalToRouteRepair,
																																																																																																																																																																																																																																											trgPetrinet,
																																																																																																																																																																																																																																											trgRouteRepair,
																																																																																																																																																																																																																																											trgRouteFail,
																																																																																																																																																																																																																																											trgSemaphoreFailedToRouteFail,
																																																																																																																																																																																																																																											semaphoreFailedCorr,
																																																																																																																																																																																																																																											trgSemaphoreFailed,
																																																																																																																																																																																																																																											trgRouteFailed,
																																																																																																																																																																																																																																											trgRouteOperational,
																																																																																																																																																																																																																																											srcRoute,
																																																																																																																																																																																																																																											semaphoreOperationalCorr,
																																																																																																																																																																																																																																											trgRouteFailToSemaphoreFailed };
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredExitSemaphore_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject trgRouteOperationalToRouteFail,
			EObject trgRouteRepairToSemaphoreOperational, EObject srcSemaphore, EObject trgRouteFailToRouteFailed,
			EObject trgSemaphoreOperational, EObject trgSemaphoreOperationalToRouteRepair, EObject trgPetrinet,
			EObject trgRouteRepair, EObject trgRouteFail, EObject trgSemaphoreFailedToRouteFail,
			EObject trgSemaphoreFailed, EObject trgRouteFailed, EObject trgRouteOperational, EObject srcRoute,
			EObject trgRouteFailToSemaphoreFailed) {
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRouteFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSemaphoreFailedToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgSemaphoreFailedToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSemaphore____exit = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSemaphoreFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToSemaphoreFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RequiredExitSemaphore";
		String trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime = "arcs";
		String trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime = "place";
		String trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs_name_prime = "arcs";
		String trgRouteFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRouteFail____nodes_name_prime = "nodes";
		String trgSemaphoreFailedToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgSemaphoreFailedToRouteFail____arcs_name_prime = "arcs";
		String trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place_name_prime = "place";
		String trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime = "arcs";
		String srcRoute__srcSemaphore____exit_name_prime = "exit";
		String trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place_name_prime = "place";
		String trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place_name_prime = "place";
		String trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place_name_prime = "place";
		String trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs_name_prime = "arcs";
		String trgRouteFailToSemaphoreFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToSemaphoreFailed____arcs_name_prime = "arcs";
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setTrg(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteOperationalToRouteFail____arcs);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setTrg(trgRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFailed____place);
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition.setSrc(trgRouteRepairToSemaphoreOperational);
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs.setTrg(trgRouteRepairToSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs);
		trgRouteFail__trgPetrinet____petriNet.setSrc(trgRouteFail);
		trgRouteFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgPetrinet____petriNet);
		trgPetrinet__trgRouteFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRouteFail____nodes.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRouteFail____nodes);
		trgSemaphoreFailedToRouteFail__trgRouteFail____transition.setSrc(trgSemaphoreFailedToRouteFail);
		trgSemaphoreFailedToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgSemaphoreFailedToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgSemaphoreFailedToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgSemaphoreFailedToRouteFail____arcs.setTrg(trgSemaphoreFailedToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgSemaphoreFailedToRouteFail____arcs);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place.setSrc(trgSemaphoreFailedToRouteFail);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place.setTrg(trgSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setTrg(trgRouteOperational);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteOperational____place);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setTrg(trgRouteFailToRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToRouteFailed____arcs);
		srcRoute__srcSemaphore____exit.setSrc(srcRoute);
		srcRoute__srcSemaphore____exit.setTrg(srcSemaphore);
		ruleresult.getTranslatedEdges().add(srcRoute__srcSemaphore____exit);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place
				.setSrc(trgSemaphoreOperationalToRouteRepair);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place.setTrg(trgSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place
				.setSrc(trgRouteRepairToSemaphoreOperational);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place.setTrg(trgSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place.setSrc(trgRouteFailToSemaphoreFailed);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place.setTrg(trgSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place);
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition.setSrc(trgSemaphoreOperationalToRouteRepair);
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs.setTrg(trgSemaphoreOperationalToRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition.setSrc(trgRouteFailToSemaphoreFailed);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToSemaphoreFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs.setTrg(trgRouteFailToSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToSemaphoreFailed____arcs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgRouteOperationalToRouteFail__trgRouteFail____transition
				.setName(trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs
				.setName(trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime);
		trgRouteFailToRouteFailed__trgRouteFailed____place
				.setName(trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime);
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition
				.setName(trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs
				.setName(trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs_name_prime);
		trgRouteFail__trgPetrinet____petriNet.setName(trgRouteFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRouteFail____nodes.setName(trgPetrinet__trgRouteFail____nodes_name_prime);
		trgSemaphoreFailedToRouteFail__trgRouteFail____transition
				.setName(trgSemaphoreFailedToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgSemaphoreFailedToRouteFail____arcs
				.setName(trgRouteFail__trgSemaphoreFailedToRouteFail____arcs_name_prime);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place
				.setName(trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place_name_prime);
		trgRouteOperationalToRouteFail__trgRouteOperational____place
				.setName(trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFail____transition
				.setName(trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToRouteFailed____arcs
				.setName(trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime);
		srcRoute__srcSemaphore____exit.setName(srcRoute__srcSemaphore____exit_name_prime);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place
				.setName(trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place_name_prime);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place
				.setName(trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place_name_prime);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place
				.setName(trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place_name_prime);
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition
				.setName(trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs
				.setName(trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs_name_prime);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition
				.setName(trgRouteFailToSemaphoreFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs
				.setName(trgRouteFail__trgRouteFailToSemaphoreFailed____arcs_name_prime);
		return new Object[] { ruleresult, trgRouteOperationalToRouteFail, trgRouteRepairToSemaphoreOperational,
				srcSemaphore, trgRouteFailToRouteFailed, trgSemaphoreOperational, trgSemaphoreOperationalToRouteRepair,
				trgPetrinet, trgRouteRepair, trgRouteFail, trgSemaphoreFailedToRouteFail, trgSemaphoreFailed,
				trgRouteFailed, trgRouteOperational, srcRoute, trgRouteFailToSemaphoreFailed,
				trgRouteOperationalToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgRouteOperationalToRouteFail____arcs,
				trgRouteFailToRouteFailed__trgRouteFailed____place,
				trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition,
				trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs, trgRouteFail__trgPetrinet____petriNet,
				trgPetrinet__trgRouteFail____nodes, trgSemaphoreFailedToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgSemaphoreFailedToRouteFail____arcs,
				trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place,
				trgRouteOperationalToRouteFail__trgRouteOperational____place,
				trgRouteFailToRouteFailed__trgRouteFail____transition, trgRouteFail__trgRouteFailToRouteFailed____arcs,
				srcRoute__srcSemaphore____exit, trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place,
				trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place,
				trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place,
				trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition,
				trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs,
				trgRouteFailToSemaphoreFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToSemaphoreFailed____arcs };
	}

	public static final void pattern_RequiredExitSemaphore_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
			RequiredExitSemaphore _this, PerformRuleResult ruleresult, EObject containerCorr, EObject routeRepairCorr,
			EObject trgRouteOperationalToRouteFail, EObject trgRouteRepairToSemaphoreOperational,
			EObject routeFailedCorr, EObject srcSemaphore, EObject srcContainer, EObject trgRouteFailToRouteFailed,
			EObject routeOperationalCorr, EObject trgSemaphoreOperational, EObject trgSemaphoreOperationalToRouteRepair,
			EObject trgPetrinet, EObject trgRouteRepair, EObject trgRouteFail, EObject trgSemaphoreFailedToRouteFail,
			EObject semaphoreFailedCorr, EObject trgSemaphoreFailed, EObject trgRouteFailed,
			EObject trgRouteOperational, EObject srcRoute, EObject semaphoreOperationalCorr,
			EObject trgRouteFailToSemaphoreFailed) {
		_this.registerObjects_FWD(ruleresult, containerCorr, routeRepairCorr, trgRouteOperationalToRouteFail,
				trgRouteRepairToSemaphoreOperational, routeFailedCorr, srcSemaphore, srcContainer,
				trgRouteFailToRouteFailed, routeOperationalCorr, trgSemaphoreOperational,
				trgSemaphoreOperationalToRouteRepair, trgPetrinet, trgRouteRepair, trgRouteFail,
				trgSemaphoreFailedToRouteFail, semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed,
				trgRouteOperational, srcRoute, semaphoreOperationalCorr, trgRouteFailToSemaphoreFailed);

	}

	public static final PerformRuleResult pattern_RequiredExitSemaphore_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_1_preparereturnvalue_bindingFB(
			RequiredExitSemaphore _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_1_preparereturnvalue_blackFBB(EClass eClass,
			RequiredExitSemaphore _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_1_preparereturnvalue_bindingAndBlackFFB(
			RequiredExitSemaphore _this) {
		Object[] result_pattern_RequiredExitSemaphore_2_1_preparereturnvalue_binding = pattern_RequiredExitSemaphore_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredExitSemaphore_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_RequiredExitSemaphore_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredExitSemaphore_2_1_preparereturnvalue_black = pattern_RequiredExitSemaphore_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_RequiredExitSemaphore_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_RequiredExitSemaphore_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "RequiredExitSemaphore";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcSemaphore");
		EObject _localVariable_1 = match.getObject("srcContainer");
		EObject _localVariable_2 = match.getObject("srcRoute");
		EObject tmpSrcSemaphore = _localVariable_0;
		EObject tmpSrcContainer = _localVariable_1;
		EObject tmpSrcRoute = _localVariable_2;
		if (tmpSrcSemaphore instanceof Semaphore) {
			Semaphore srcSemaphore = (Semaphore) tmpSrcSemaphore;
			if (tmpSrcContainer instanceof RailwayContainer) {
				RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
				if (tmpSrcRoute instanceof Route) {
					Route srcRoute = (Route) tmpSrcRoute;
					return new Object[] { srcSemaphore, srcContainer, srcRoute, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RequiredExitSemaphore_2_2_corematch_blackFFFBBFFFFFFFFBFB(
			Semaphore srcSemaphore, RailwayContainer srcContainer, Route srcRoute, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SemaphoreToFailed semaphoreFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcSemaphore, SemaphoreToFailed.class, "source")) {
			Place trgSemaphoreFailed = semaphoreFailedCorr.getTarget();
			if (trgSemaphoreFailed != null) {
				for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
					PetriNet trgPetrinet = containerCorr.getTarget();
					if (trgPetrinet != null) {
						for (RouteToOperational routeOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(srcRoute, RouteToOperational.class, "source")) {
							Place trgRouteOperational = routeOperationalCorr.getTarget();
							if (trgRouteOperational != null) {
								if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
									for (RouteToFailed routeFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(srcRoute, RouteToFailed.class, "source")) {
										Place trgRouteFailed = routeFailedCorr.getTarget();
										if (trgRouteFailed != null) {
											if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
												if (!trgRouteFailed.equals(trgRouteOperational)) {
													for (RouteToRepair routeRepairCorr : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(srcRoute, RouteToRepair.class,
																	"source")) {
														Transition trgRouteRepair = routeRepairCorr.getTarget();
														if (trgRouteRepair != null) {
															for (SemaphoreToOperational semaphoreOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(srcSemaphore,
																			SemaphoreToOperational.class, "source")) {
																Place trgSemaphoreOperational = semaphoreOperationalCorr
																		.getTarget();
																if (trgSemaphoreOperational != null) {
																	if (!trgSemaphoreFailed
																			.equals(trgSemaphoreOperational)) {
																		if (!trgRouteFailed
																				.equals(trgSemaphoreOperational)) {
																			if (!trgRouteOperational
																					.equals(trgSemaphoreOperational)) {
																				_result.add(new Object[] {
																						containerCorr, routeRepairCorr,
																						routeFailedCorr, srcSemaphore,
																						srcContainer,
																						routeOperationalCorr,
																						trgSemaphoreOperational,
																						trgPetrinet, trgRouteRepair,
																						semaphoreFailedCorr,
																						trgSemaphoreFailed,
																						trgRouteFailed,
																						trgRouteOperational, srcRoute,
																						semaphoreOperationalCorr,
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

	public static final Iterable<Object[]> pattern_RequiredExitSemaphore_2_3_findcontext_blackBBBBBBBBBBBBBBB(
			RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr, RouteToFailed routeFailedCorr,
			Semaphore srcSemaphore, RailwayContainer srcContainer, RouteToOperational routeOperationalCorr,
			Place trgSemaphoreOperational, PetriNet trgPetrinet, Transition trgRouteRepair,
			SemaphoreToFailed semaphoreFailedCorr, Place trgSemaphoreFailed, Place trgRouteFailed,
			Place trgRouteOperational, Route srcRoute, SemaphoreToOperational semaphoreOperationalCorr) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!trgSemaphoreFailed.equals(trgSemaphoreOperational)) {
			if (!trgRouteFailed.equals(trgSemaphoreOperational)) {
				if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
					if (!trgRouteFailed.equals(trgRouteOperational)) {
						if (!trgRouteOperational.equals(trgSemaphoreOperational)) {
							if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
								if (srcContainer.getRoutes().contains(srcRoute)) {
									if (trgRouteRepair.equals(routeRepairCorr.getTarget())) {
										if (srcSemaphore.equals(semaphoreFailedCorr.getSource())) {
											if (srcContainer.equals(containerCorr.getSource())) {
												if (trgSemaphoreFailed.equals(semaphoreFailedCorr.getTarget())) {
													if (trgPetrinet.equals(containerCorr.getTarget())) {
														if (trgRouteFailed.equals(routeFailedCorr.getTarget())) {
															if (trgRouteOperational
																	.equals(routeOperationalCorr.getTarget())) {
																if (srcSemaphore.equals(srcRoute.getExit())) {
																	if (srcRoute
																			.equals(routeOperationalCorr.getSource())) {
																		if (srcRoute
																				.equals(routeFailedCorr.getSource())) {
																			if (trgSemaphoreOperational
																					.equals(semaphoreOperationalCorr
																							.getTarget())) {
																				if (srcRoute.equals(
																						routeRepairCorr.getSource())) {
																					if (srcSemaphore.equals(
																							semaphoreOperationalCorr
																									.getSource())) {
																						_result.add(new Object[] {
																								containerCorr,
																								routeRepairCorr,
																								routeFailedCorr,
																								srcSemaphore,
																								srcContainer,
																								routeOperationalCorr,
																								trgSemaphoreOperational,
																								trgPetrinet,
																								trgRouteRepair,
																								semaphoreFailedCorr,
																								trgSemaphoreFailed,
																								trgRouteFailed,
																								trgRouteOperational,
																								srcRoute,
																								semaphoreOperationalCorr });
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredExitSemaphore_2_3_findcontext_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr, RouteToFailed routeFailedCorr,
			Semaphore srcSemaphore, RailwayContainer srcContainer, RouteToOperational routeOperationalCorr,
			Place trgSemaphoreOperational, PetriNet trgPetrinet, Transition trgRouteRepair,
			SemaphoreToFailed semaphoreFailedCorr, Place trgSemaphoreFailed, Place trgRouteFailed,
			Place trgRouteOperational, Route srcRoute, SemaphoreToOperational semaphoreOperationalCorr) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRouteRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreFailedCorr__srcSemaphore____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreFailedCorr__trgSemaphoreFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgRouteFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgRouteOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSemaphore____exit = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreOperationalCorr__trgSemaphoreOperational____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreOperationalCorr__srcSemaphore____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcContainer__srcRoute____routes_name_prime = "routes";
		String routeRepairCorr__trgRouteRepair____target_name_prime = "target";
		String semaphoreFailedCorr__srcSemaphore____source_name_prime = "source";
		String containerCorr__srcContainer____source_name_prime = "source";
		String semaphoreFailedCorr__trgSemaphoreFailed____target_name_prime = "target";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String routeFailedCorr__trgRouteFailed____target_name_prime = "target";
		String routeOperationalCorr__trgRouteOperational____target_name_prime = "target";
		String srcRoute__srcSemaphore____exit_name_prime = "exit";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		String semaphoreOperationalCorr__trgSemaphoreOperational____target_name_prime = "target";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		String semaphoreOperationalCorr__srcSemaphore____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr);
		isApplicableMatch.getAllContextElements().add(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr);
		isApplicableMatch.getAllContextElements().add(trgSemaphoreOperational);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr);
		isApplicableMatch.getAllContextElements().add(trgSemaphoreFailed);
		isApplicableMatch.getAllContextElements().add(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		routeRepairCorr__trgRouteRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRouteRepair____target.setTrg(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__trgRouteRepair____target);
		semaphoreFailedCorr__srcSemaphore____source.setSrc(semaphoreFailedCorr);
		semaphoreFailedCorr__srcSemaphore____source.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr__srcSemaphore____source);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		semaphoreFailedCorr__trgSemaphoreFailed____target.setSrc(semaphoreFailedCorr);
		semaphoreFailedCorr__trgSemaphoreFailed____target.setTrg(trgSemaphoreFailed);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr__trgSemaphoreFailed____target);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		routeFailedCorr__trgRouteFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgRouteFailed____target.setTrg(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__trgRouteFailed____target);
		routeOperationalCorr__trgRouteOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgRouteOperational____target.setTrg(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__trgRouteOperational____target);
		srcRoute__srcSemaphore____exit.setSrc(srcRoute);
		srcRoute__srcSemaphore____exit.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(srcRoute__srcSemaphore____exit);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__srcRoute____source);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__srcRoute____source);
		semaphoreOperationalCorr__trgSemaphoreOperational____target.setSrc(semaphoreOperationalCorr);
		semaphoreOperationalCorr__trgSemaphoreOperational____target.setTrg(trgSemaphoreOperational);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr__trgSemaphoreOperational____target);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__srcRoute____source);
		semaphoreOperationalCorr__srcSemaphore____source.setSrc(semaphoreOperationalCorr);
		semaphoreOperationalCorr__srcSemaphore____source.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr__srcSemaphore____source);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		routeRepairCorr__trgRouteRepair____target.setName(routeRepairCorr__trgRouteRepair____target_name_prime);
		semaphoreFailedCorr__srcSemaphore____source.setName(semaphoreFailedCorr__srcSemaphore____source_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		semaphoreFailedCorr__trgSemaphoreFailed____target
				.setName(semaphoreFailedCorr__trgSemaphoreFailed____target_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		routeFailedCorr__trgRouteFailed____target.setName(routeFailedCorr__trgRouteFailed____target_name_prime);
		routeOperationalCorr__trgRouteOperational____target
				.setName(routeOperationalCorr__trgRouteOperational____target_name_prime);
		srcRoute__srcSemaphore____exit.setName(srcRoute__srcSemaphore____exit_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		semaphoreOperationalCorr__trgSemaphoreOperational____target
				.setName(semaphoreOperationalCorr__trgSemaphoreOperational____target_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		semaphoreOperationalCorr__srcSemaphore____source
				.setName(semaphoreOperationalCorr__srcSemaphore____source_name_prime);
		return new Object[] { containerCorr, routeRepairCorr, routeFailedCorr, srcSemaphore, srcContainer,
				routeOperationalCorr, trgSemaphoreOperational, trgPetrinet, trgRouteRepair, semaphoreFailedCorr,
				trgSemaphoreFailed, trgRouteFailed, trgRouteOperational, srcRoute, semaphoreOperationalCorr,
				isApplicableMatch, srcContainer__srcRoute____routes, routeRepairCorr__trgRouteRepair____target,
				semaphoreFailedCorr__srcSemaphore____source, containerCorr__srcContainer____source,
				semaphoreFailedCorr__trgSemaphoreFailed____target, containerCorr__trgPetrinet____target,
				routeFailedCorr__trgRouteFailed____target, routeOperationalCorr__trgRouteOperational____target,
				srcRoute__srcSemaphore____exit, routeOperationalCorr__srcRoute____source,
				routeFailedCorr__srcRoute____source, semaphoreOperationalCorr__trgSemaphoreOperational____target,
				routeRepairCorr__srcRoute____source, semaphoreOperationalCorr__srcSemaphore____source };
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
			RequiredExitSemaphore _this, IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			RouteToRepair routeRepairCorr, RouteToFailed routeFailedCorr, Semaphore srcSemaphore,
			RailwayContainer srcContainer, RouteToOperational routeOperationalCorr, Place trgSemaphoreOperational,
			PetriNet trgPetrinet, Transition trgRouteRepair, SemaphoreToFailed semaphoreFailedCorr,
			Place trgSemaphoreFailed, Place trgRouteFailed, Place trgRouteOperational, Route srcRoute,
			SemaphoreToOperational semaphoreOperationalCorr) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, containerCorr, routeRepairCorr,
				routeFailedCorr, srcSemaphore, srcContainer, routeOperationalCorr, trgSemaphoreOperational, trgPetrinet,
				trgRouteRepair, semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed, trgRouteOperational, srcRoute,
				semaphoreOperationalCorr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, containerCorr, routeRepairCorr, routeFailedCorr,
					srcSemaphore, srcContainer, routeOperationalCorr, trgSemaphoreOperational, trgPetrinet,
					trgRouteRepair, semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed, trgRouteOperational,
					srcRoute, semaphoreOperationalCorr };
		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			RequiredExitSemaphore _this, IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			RouteToRepair routeRepairCorr, RouteToFailed routeFailedCorr, Semaphore srcSemaphore,
			RailwayContainer srcContainer, RouteToOperational routeOperationalCorr, Place trgSemaphoreOperational,
			PetriNet trgPetrinet, Transition trgRouteRepair, SemaphoreToFailed semaphoreFailedCorr,
			Place trgSemaphoreFailed, Place trgRouteFailed, Place trgRouteOperational, Route srcRoute,
			SemaphoreToOperational semaphoreOperationalCorr) {
		Object[] result_pattern_RequiredExitSemaphore_2_4_solveCSP_binding = pattern_RequiredExitSemaphore_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, containerCorr, routeRepairCorr, routeFailedCorr, srcSemaphore, srcContainer,
				routeOperationalCorr, trgSemaphoreOperational, trgPetrinet, trgRouteRepair, semaphoreFailedCorr,
				trgSemaphoreFailed, trgRouteFailed, trgRouteOperational, srcRoute, semaphoreOperationalCorr);
		if (result_pattern_RequiredExitSemaphore_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredExitSemaphore_2_4_solveCSP_binding[0];

			Object[] result_pattern_RequiredExitSemaphore_2_4_solveCSP_black = pattern_RequiredExitSemaphore_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_RequiredExitSemaphore_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, containerCorr, routeRepairCorr, routeFailedCorr,
						srcSemaphore, srcContainer, routeOperationalCorr, trgSemaphoreOperational, trgPetrinet,
						trgRouteRepair, semaphoreFailedCorr, trgSemaphoreFailed, trgRouteFailed, trgRouteOperational,
						srcRoute, semaphoreOperationalCorr };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredExitSemaphore_2_5_checkCSP_expressionFBB(RequiredExitSemaphore _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_RequiredExitSemaphore_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "RequiredExitSemaphore";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_RequiredExitSemaphore_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredExitSemaphore_10_1_preparereturnvalue_bindingFB(
			RequiredExitSemaphore _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			RequiredExitSemaphore _this) {
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

	public static final Object[] pattern_RequiredExitSemaphore_10_1_preparereturnvalue_bindingAndBlackFFBF(
			RequiredExitSemaphore _this) {
		Object[] result_pattern_RequiredExitSemaphore_10_1_preparereturnvalue_binding = pattern_RequiredExitSemaphore_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredExitSemaphore_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_RequiredExitSemaphore_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredExitSemaphore_10_1_preparereturnvalue_black = pattern_RequiredExitSemaphore_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_RequiredExitSemaphore_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_RequiredExitSemaphore_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_RequiredExitSemaphore_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_RequiredExitSemaphore_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_exit) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcRoute = _edge_exit.getSrc();
		if (tmpSrcRoute instanceof Route) {
			Route srcRoute = (Route) tmpSrcRoute;
			EObject tmpSrcSemaphore = _edge_exit.getTrg();
			if (tmpSrcSemaphore instanceof Semaphore) {
				Semaphore srcSemaphore = (Semaphore) tmpSrcSemaphore;
				if (srcSemaphore.equals(srcRoute.getExit())) {
					for (RailwayContainer srcContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(srcRoute, RailwayContainer.class, "routes")) {
						_result.add(new Object[] { srcSemaphore, srcContainer, srcRoute, _edge_exit });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_RequiredExitSemaphore_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_RequiredExitSemaphore_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			RequiredExitSemaphore _this, Match match, Semaphore srcSemaphore, RailwayContainer srcContainer,
			Route srcRoute) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSemaphore, srcContainer, srcRoute);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_RequiredExitSemaphore_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			RequiredExitSemaphore _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredExitSemaphore_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_RequiredExitSemaphore_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_RequiredExitSemaphore_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_RequiredExitSemaphore_13_1_matchtggpattern_blackBBB(Semaphore srcSemaphore,
			RailwayContainer srcContainer, Route srcRoute) {
		if (srcContainer.getRoutes().contains(srcRoute)) {
			if (srcSemaphore.equals(srcRoute.getExit())) {
				return new Object[] { srcSemaphore, srcContainer, srcRoute };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredExitSemaphore_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredExitSemaphore_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RequiredExitSemaphoreImpl
