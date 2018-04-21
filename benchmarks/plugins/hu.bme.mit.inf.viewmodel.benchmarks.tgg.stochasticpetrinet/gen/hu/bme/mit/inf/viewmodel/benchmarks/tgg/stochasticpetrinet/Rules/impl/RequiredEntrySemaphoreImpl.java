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

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredEntrySemaphore;
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
 * An implementation of the model object '<em><b>Required Entry Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RequiredEntrySemaphoreImpl extends AbstractRuleImpl implements RequiredEntrySemaphore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredEntrySemaphoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getRequiredEntrySemaphore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, RailwayContainer srcContainer, Route srcRoute,
			Semaphore srcSemaphore) {

		Object[] result1_black = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_0_1_initialbindings_blackBBBBB(this, match, srcContainer, srcRoute,
						srcSemaphore);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = "
					+ srcRoute + ", " + "[srcSemaphore] = " + srcSemaphore + ".");
		}

		Object[] result2_bindingAndBlack = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, srcContainer, srcRoute,
						srcSemaphore);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = "
					+ srcRoute + ", " + "[srcSemaphore] = " + srcSemaphore + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_0_4_collectelementstobetranslated_blackBBBB(match, srcContainer,
							srcRoute, srcSemaphore);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = " + srcRoute + ", "
						+ "[srcSemaphore] = " + srcSemaphore + ".");
			}
			RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_4_collectelementstobetranslated_greenBBBF(match,
					srcRoute, srcSemaphore);
			//nothing EMoflonEdge srcRoute__srcSemaphore____entry = (EMoflonEdge) result4_green[3];

			Object[] result5_black = RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_0_5_collectcontextelements_blackBBBB(match, srcContainer, srcRoute,
							srcSemaphore);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = " + srcRoute + ", "
						+ "[srcSemaphore] = " + srcSemaphore + ".");
			}
			RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_5_collectcontextelements_greenBBBBF(match,
					srcContainer, srcRoute, srcSemaphore);
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result5_green[4];

			// 
			RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, srcContainer, srcRoute, srcSemaphore);
			return RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_7_expressionF();
		} else {
			return RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_bindingAndBlack[0];
		Place trgSemaphoreFailed = (Place) result1_bindingAndBlack[1];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[2];
		Route srcRoute = (Route) result1_bindingAndBlack[3];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[4];
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_bindingAndBlack[5];
		SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result1_bindingAndBlack[6];
		Transition trgRouteRepair = (Transition) result1_bindingAndBlack[7];
		Semaphore srcSemaphore = (Semaphore) result1_bindingAndBlack[8];
		Place trgRouteOperational = (Place) result1_bindingAndBlack[9];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[10];
		Place trgRouteFailed = (Place) result1_bindingAndBlack[11];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_bindingAndBlack[12];
		SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result1_bindingAndBlack[13];
		Place trgSemaphoreOperational = (Place) result1_bindingAndBlack[14];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[15];
		Object[] result1_green = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_1_performtransformation_greenBFFFFBFFBBBFB(trgSemaphoreFailed,
						trgRouteRepair, trgRouteOperational, trgPetrinet, trgRouteFailed, trgSemaphoreOperational);
		Arc trgSemaphoreOperationalToRouteRepair = (Arc) result1_green[1];
		Arc trgSemaphoreFailedToRouteFail = (Arc) result1_green[2];
		ImmediateTransition trgRouteFail = (ImmediateTransition) result1_green[3];
		Arc trgRouteRepairToSemaphoreOperational = (Arc) result1_green[4];
		Arc trgRouteFailToRouteFailed = (Arc) result1_green[6];
		Arc trgRouteFailToSemaphoreFailed = (Arc) result1_green[7];
		Arc trgRouteOperationalToRouteFail = (Arc) result1_green[11];

		Object[] result2_black = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_2_collecttranslatedelements_blackBBBBBBB(
						trgSemaphoreOperationalToRouteRepair, trgSemaphoreFailedToRouteFail, trgRouteFail,
						trgRouteRepairToSemaphoreOperational, trgRouteFailToRouteFailed, trgRouteFailToSemaphoreFailed,
						trgRouteOperationalToRouteFail);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[trgSemaphoreOperationalToRouteRepair] = "
							+ trgSemaphoreOperationalToRouteRepair + ", " + "[trgSemaphoreFailedToRouteFail] = "
							+ trgSemaphoreFailedToRouteFail + ", " + "[trgRouteFail] = " + trgRouteFail + ", "
							+ "[trgRouteRepairToSemaphoreOperational] = " + trgRouteRepairToSemaphoreOperational + ", "
							+ "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ", "
							+ "[trgRouteFailToSemaphoreFailed] = " + trgRouteFailToSemaphoreFailed + ", "
							+ "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail + ".");
		}
		Object[] result2_green = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_2_collecttranslatedelements_greenFBBBBBBB(
						trgSemaphoreOperationalToRouteRepair, trgSemaphoreFailedToRouteFail, trgRouteFail,
						trgRouteRepairToSemaphoreOperational, trgRouteFailToRouteFailed, trgRouteFailToSemaphoreFailed,
						trgRouteOperationalToRouteFail);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(ruleresult,
						routeOperationalCorr, trgSemaphoreFailed, srcContainer, trgSemaphoreOperationalToRouteRepair,
						srcRoute, trgSemaphoreFailedToRouteFail, containerCorr, trgRouteFail, routeRepairCorr,
						semaphoreFailedCorr, trgRouteRepairToSemaphoreOperational, trgRouteRepair,
						trgRouteFailToRouteFailed, trgRouteFailToSemaphoreFailed, srcSemaphore, trgRouteOperational,
						trgPetrinet, trgRouteFailed, trgRouteOperationalToRouteFail, routeFailedCorr,
						semaphoreOperationalCorr, trgSemaphoreOperational);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[trgSemaphoreFailed] = "
					+ trgSemaphoreFailed + ", " + "[srcContainer] = " + srcContainer + ", "
					+ "[trgSemaphoreOperationalToRouteRepair] = " + trgSemaphoreOperationalToRouteRepair + ", "
					+ "[srcRoute] = " + srcRoute + ", " + "[trgSemaphoreFailedToRouteFail] = "
					+ trgSemaphoreFailedToRouteFail + ", " + "[containerCorr] = " + containerCorr + ", "
					+ "[trgRouteFail] = " + trgRouteFail + ", " + "[routeRepairCorr] = " + routeRepairCorr + ", "
					+ "[semaphoreFailedCorr] = " + semaphoreFailedCorr + ", "
					+ "[trgRouteRepairToSemaphoreOperational] = " + trgRouteRepairToSemaphoreOperational + ", "
					+ "[trgRouteRepair] = " + trgRouteRepair + ", " + "[trgRouteFailToRouteFailed] = "
					+ trgRouteFailToRouteFailed + ", " + "[trgRouteFailToSemaphoreFailed] = "
					+ trgRouteFailToSemaphoreFailed + ", " + "[srcSemaphore] = " + srcSemaphore + ", "
					+ "[trgRouteOperational] = " + trgRouteOperational + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
					+ "[trgRouteFailed] = " + trgRouteFailed + ", " + "[trgRouteOperationalToRouteFail] = "
					+ trgRouteOperationalToRouteFail + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", "
					+ "[semaphoreOperationalCorr] = " + semaphoreOperationalCorr + ", " + "[trgSemaphoreOperational] = "
					+ trgSemaphoreOperational + ".");
		}
		RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, trgSemaphoreFailed, trgSemaphoreOperationalToRouteRepair, srcRoute,
						trgSemaphoreFailedToRouteFail, trgRouteFail, trgRouteRepairToSemaphoreOperational,
						trgRouteRepair, trgRouteFailToRouteFailed, trgRouteFailToSemaphoreFailed, srcSemaphore,
						trgRouteOperational, trgPetrinet, trgRouteFailed, trgRouteOperationalToRouteFail,
						trgSemaphoreOperational);
		//nothing EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgSemaphoreFailedToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgRouteFail__trgSemaphoreFailedToRouteFail____arcs = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgRouteFailToSemaphoreFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToSemaphoreFailed____arcs = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgRouteFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgPetrinet__trgRouteFail____nodes = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge srcRoute__srcSemaphore____entry = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = (EMoflonEdge) result3_green[36];

		// 
		// 
		RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(this, ruleresult,
						routeOperationalCorr, trgSemaphoreFailed, srcContainer, trgSemaphoreOperationalToRouteRepair,
						srcRoute, trgSemaphoreFailedToRouteFail, containerCorr, trgRouteFail, routeRepairCorr,
						semaphoreFailedCorr, trgRouteRepairToSemaphoreOperational, trgRouteRepair,
						trgRouteFailToRouteFailed, trgRouteFailToSemaphoreFailed, srcSemaphore, trgRouteOperational,
						trgPetrinet, trgRouteFailed, trgRouteOperationalToRouteFail, routeFailedCorr,
						semaphoreOperationalCorr, trgSemaphoreOperational);
		return RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[0];
		Route srcRoute = (Route) result2_binding[1];
		Semaphore srcSemaphore = (Semaphore) result2_binding[2];
		for (Object[] result2_black : RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_2_2_corematch_blackFFBBFFFFBFFFFFFB(srcContainer, srcRoute,
						srcSemaphore, match)) {
			RouteToOperational routeOperationalCorr = (RouteToOperational) result2_black[0];
			Place trgSemaphoreFailed = (Place) result2_black[1];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[4];
			RouteToRepair routeRepairCorr = (RouteToRepair) result2_black[5];
			SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result2_black[6];
			Transition trgRouteRepair = (Transition) result2_black[7];
			Place trgRouteOperational = (Place) result2_black[9];
			PetriNet trgPetrinet = (PetriNet) result2_black[10];
			Place trgRouteFailed = (Place) result2_black[11];
			RouteToFailed routeFailedCorr = (RouteToFailed) result2_black[12];
			SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result2_black[13];
			Place trgSemaphoreOperational = (Place) result2_black[14];
			// ForEach 
			for (Object[] result3_black : RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_2_3_findcontext_blackBBBBBBBBBBBBBBB(routeOperationalCorr,
							trgSemaphoreFailed, srcContainer, srcRoute, containerCorr, routeRepairCorr,
							semaphoreFailedCorr, trgRouteRepair, srcSemaphore, trgRouteOperational, trgPetrinet,
							trgRouteFailed, routeFailedCorr, semaphoreOperationalCorr, trgSemaphoreOperational)) {
				Object[] result3_green = RequiredEntrySemaphoreImpl
						.pattern_RequiredEntrySemaphore_2_3_findcontext_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
								routeOperationalCorr, trgSemaphoreFailed, srcContainer, srcRoute, containerCorr,
								routeRepairCorr, semaphoreFailedCorr, trgRouteRepair, srcSemaphore, trgRouteOperational,
								trgPetrinet, trgRouteFailed, routeFailedCorr, semaphoreOperationalCorr,
								trgSemaphoreOperational);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[15];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge semaphoreFailedCorr__trgSemaphoreFailed____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge routeRepairCorr__trgRouteRepair____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge semaphoreFailedCorr__srcSemaphore____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge srcRoute__srcSemaphore____entry = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge routeOperationalCorr__trgRouteOperational____target = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge semaphoreOperationalCorr__srcSemaphore____source = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge routeFailedCorr__trgRouteFailed____target = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge semaphoreOperationalCorr__trgSemaphoreOperational____target = (EMoflonEdge) result3_green[29];

				Object[] result4_bindingAndBlack = RequiredEntrySemaphoreImpl
						.pattern_RequiredEntrySemaphore_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(this,
								isApplicableMatch, routeOperationalCorr, trgSemaphoreFailed, srcContainer, srcRoute,
								containerCorr, routeRepairCorr, semaphoreFailedCorr, trgRouteRepair, srcSemaphore,
								trgRouteOperational, trgPetrinet, trgRouteFailed, routeFailedCorr,
								semaphoreOperationalCorr, trgSemaphoreOperational);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[routeOperationalCorr] = "
							+ routeOperationalCorr + ", " + "[trgSemaphoreFailed] = " + trgSemaphoreFailed + ", "
							+ "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = " + srcRoute + ", "
							+ "[containerCorr] = " + containerCorr + ", " + "[routeRepairCorr] = " + routeRepairCorr
							+ ", " + "[semaphoreFailedCorr] = " + semaphoreFailedCorr + ", " + "[trgRouteRepair] = "
							+ trgRouteRepair + ", " + "[srcSemaphore] = " + srcSemaphore + ", "
							+ "[trgRouteOperational] = " + trgRouteOperational + ", " + "[trgPetrinet] = " + trgPetrinet
							+ ", " + "[trgRouteFailed] = " + trgRouteFailed + ", " + "[routeFailedCorr] = "
							+ routeFailedCorr + ", " + "[semaphoreOperationalCorr] = " + semaphoreOperationalCorr + ", "
							+ "[trgSemaphoreOperational] = " + trgSemaphoreOperational + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = RequiredEntrySemaphoreImpl
							.pattern_RequiredEntrySemaphore_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, RailwayContainer srcContainer, Route srcRoute,
			Semaphore srcSemaphore) {
		match.registerObject("srcContainer", srcContainer);
		match.registerObject("srcRoute", srcRoute);
		match.registerObject("srcSemaphore", srcSemaphore);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, RailwayContainer srcContainer, Route srcRoute,
			Semaphore srcSemaphore) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, RouteToOperational routeOperationalCorr,
			Place trgSemaphoreFailed, RailwayContainer srcContainer, Route srcRoute,
			RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr,
			SemaphoreToFailed semaphoreFailedCorr, Transition trgRouteRepair, Semaphore srcSemaphore,
			Place trgRouteOperational, PetriNet trgPetrinet, Place trgRouteFailed, RouteToFailed routeFailedCorr,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("routeOperationalCorr", routeOperationalCorr);
		isApplicableMatch.registerObject("trgSemaphoreFailed", trgSemaphoreFailed);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("routeRepairCorr", routeRepairCorr);
		isApplicableMatch.registerObject("semaphoreFailedCorr", semaphoreFailedCorr);
		isApplicableMatch.registerObject("trgRouteRepair", trgRouteRepair);
		isApplicableMatch.registerObject("srcSemaphore", srcSemaphore);
		isApplicableMatch.registerObject("trgRouteOperational", trgRouteOperational);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("trgRouteFailed", trgRouteFailed);
		isApplicableMatch.registerObject("routeFailedCorr", routeFailedCorr);
		isApplicableMatch.registerObject("semaphoreOperationalCorr", semaphoreOperationalCorr);
		isApplicableMatch.registerObject("trgSemaphoreOperational", trgSemaphoreOperational);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject routeOperationalCorr,
			EObject trgSemaphoreFailed, EObject srcContainer, EObject trgSemaphoreOperationalToRouteRepair,
			EObject srcRoute, EObject trgSemaphoreFailedToRouteFail, EObject containerCorr, EObject trgRouteFail,
			EObject routeRepairCorr, EObject semaphoreFailedCorr, EObject trgRouteRepairToSemaphoreOperational,
			EObject trgRouteRepair, EObject trgRouteFailToRouteFailed, EObject trgRouteFailToSemaphoreFailed,
			EObject srcSemaphore, EObject trgRouteOperational, EObject trgPetrinet, EObject trgRouteFailed,
			EObject trgRouteOperationalToRouteFail, EObject routeFailedCorr, EObject semaphoreOperationalCorr,
			EObject trgSemaphoreOperational) {
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("trgSemaphoreFailed", trgSemaphoreFailed);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgSemaphoreOperationalToRouteRepair", trgSemaphoreOperationalToRouteRepair);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("trgSemaphoreFailedToRouteFail", trgSemaphoreFailedToRouteFail);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("trgRouteFail", trgRouteFail);
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("semaphoreFailedCorr", semaphoreFailedCorr);
		ruleresult.registerObject("trgRouteRepairToSemaphoreOperational", trgRouteRepairToSemaphoreOperational);
		ruleresult.registerObject("trgRouteRepair", trgRouteRepair);
		ruleresult.registerObject("trgRouteFailToRouteFailed", trgRouteFailToRouteFailed);
		ruleresult.registerObject("trgRouteFailToSemaphoreFailed", trgRouteFailToSemaphoreFailed);
		ruleresult.registerObject("srcSemaphore", srcSemaphore);
		ruleresult.registerObject("trgRouteOperational", trgRouteOperational);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgRouteFailed", trgRouteFailed);
		ruleresult.registerObject("trgRouteOperationalToRouteFail", trgRouteOperationalToRouteFail);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("semaphoreOperationalCorr", semaphoreOperationalCorr);
		ruleresult.registerObject("trgSemaphoreOperational", trgSemaphoreOperational);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(EMoflonEdge _edge_entry) {

		Object[] result1_bindingAndBlack = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_10_2_testcorematchandDECs_blackFFFB(_edge_entry)) {
			RailwayContainer srcContainer = (RailwayContainer) result2_black[0];
			Route srcRoute = (Route) result2_black[1];
			Semaphore srcSemaphore = (Semaphore) result2_black[2];
			Object[] result2_green = RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, srcContainer, srcRoute, srcSemaphore)) {
				// 
				if (RequiredEntrySemaphoreImpl
						.pattern_RequiredEntrySemaphore_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = RequiredEntrySemaphoreImpl
							.pattern_RequiredEntrySemaphore_10_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("RequiredEntrySemaphore");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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

		if (!__helper.hasExpectedValue("trgRouteRepairToSemaphoreOperational", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToRouteFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToSemaphoreFailed", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
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
	public boolean checkDEC_FWD(RailwayContainer srcContainer, Route srcRoute, Semaphore srcSemaphore) {// 
		Object[] result1_black = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_13_1_matchtggpattern_blackBBB(srcContainer, srcRoute, srcSemaphore);
		if (result1_black != null) {
			return RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_13_2_expressionF();
		} else {
			return RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_13_3_expressionF();
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
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SEMAPHORE:
			return isAppropriate_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Route) arguments.get(2), (Semaphore) arguments.get(3));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SEMAPHORE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Route) arguments.get(2), (Semaphore) arguments.get(3));
			return null;
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SEMAPHORE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Route) arguments.get(2), (Semaphore) arguments.get(3));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ROUTETOOPERATIONAL_PLACE_RAILWAYCONTAINER_ROUTE_RAILWAYCONTAINERTOPETRINET_ROUTETOREPAIR_SEMAPHORETOFAILED_TRANSITION_SEMAPHORE_PLACE_PETRINET_PLACE_ROUTETOFAILED_SEMAPHORETOOPERATIONAL_PLACE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(RouteToOperational) arguments.get(1), (Place) arguments.get(2),
					(RailwayContainer) arguments.get(3), (Route) arguments.get(4),
					(RailwayContainerToPetriNet) arguments.get(5), (RouteToRepair) arguments.get(6),
					(SemaphoreToFailed) arguments.get(7), (Transition) arguments.get(8), (Semaphore) arguments.get(9),
					(Place) arguments.get(10), (PetriNet) arguments.get(11), (Place) arguments.get(12),
					(RouteToFailed) arguments.get(13), (SemaphoreToOperational) arguments.get(14),
					(Place) arguments.get(15));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18), (EObject) arguments.get(19),
					(EObject) arguments.get(20), (EObject) arguments.get(21), (EObject) arguments.get(22));
			return null;
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___CHECK_DEC_FWD__RAILWAYCONTAINER_ROUTE_SEMAPHORE:
			return checkDEC_FWD((RailwayContainer) arguments.get(0), (Route) arguments.get(1),
					(Semaphore) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_1_initialbindings_blackBBBBB(
			RequiredEntrySemaphore _this, Match match, RailwayContainer srcContainer, Route srcRoute,
			Semaphore srcSemaphore) {
		return new Object[] { _this, match, srcContainer, srcRoute, srcSemaphore };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_2_SolveCSP_bindingFBBBBB(RequiredEntrySemaphore _this,
			Match match, RailwayContainer srcContainer, Route srcRoute, Semaphore srcSemaphore) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcContainer, srcRoute, srcSemaphore);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcContainer, srcRoute, srcSemaphore };
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_2_SolveCSP_bindingAndBlackFBBBBB(
			RequiredEntrySemaphore _this, Match match, RailwayContainer srcContainer, Route srcRoute,
			Semaphore srcSemaphore) {
		Object[] result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_binding = pattern_RequiredEntrySemaphore_0_2_SolveCSP_bindingFBBBBB(
				_this, match, srcContainer, srcRoute, srcSemaphore);
		if (result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_black = pattern_RequiredEntrySemaphore_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcContainer, srcRoute, srcSemaphore };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredEntrySemaphore_0_3_CheckCSP_expressionFBB(RequiredEntrySemaphore _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_4_collectelementstobetranslated_blackBBBB(Match match,
			RailwayContainer srcContainer, Route srcRoute, Semaphore srcSemaphore) {
		return new Object[] { match, srcContainer, srcRoute, srcSemaphore };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Route srcRoute, Semaphore srcSemaphore) {
		EMoflonEdge srcRoute__srcSemaphore____entry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRoute__srcSemaphore____entry_name_prime = "entry";
		srcRoute__srcSemaphore____entry.setSrc(srcRoute);
		srcRoute__srcSemaphore____entry.setTrg(srcSemaphore);
		match.getToBeTranslatedEdges().add(srcRoute__srcSemaphore____entry);
		srcRoute__srcSemaphore____entry.setName(srcRoute__srcSemaphore____entry_name_prime);
		return new Object[] { match, srcRoute, srcSemaphore, srcRoute__srcSemaphore____entry };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_5_collectcontextelements_blackBBBB(Match match,
			RailwayContainer srcContainer, Route srcRoute, Semaphore srcSemaphore) {
		return new Object[] { match, srcContainer, srcRoute, srcSemaphore };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_5_collectcontextelements_greenBBBBF(Match match,
			RailwayContainer srcContainer, Route srcRoute, Semaphore srcSemaphore) {
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcContainer);
		match.getContextNodes().add(srcRoute);
		match.getContextNodes().add(srcSemaphore);
		String srcContainer__srcRoute____routes_name_prime = "routes";
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		match.getContextEdges().add(srcContainer__srcRoute____routes);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { match, srcContainer, srcRoute, srcSemaphore, srcContainer__srcRoute____routes };
	}

	public static final void pattern_RequiredEntrySemaphore_0_6_registerobjectstomatch_expressionBBBBB(
			RequiredEntrySemaphore _this, Match match, RailwayContainer srcContainer, Route srcRoute,
			Semaphore srcSemaphore) {
		_this.registerObjectsToMatch_FWD(match, srcContainer, srcRoute, srcSemaphore);

	}

	public static final boolean pattern_RequiredEntrySemaphore_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredEntrySemaphore_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_1_1_performtransformation_bindingFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("routeOperationalCorr");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgSemaphoreFailed");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_4 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_5 = isApplicableMatch.getObject("routeRepairCorr");
		EObject _localVariable_6 = isApplicableMatch.getObject("semaphoreFailedCorr");
		EObject _localVariable_7 = isApplicableMatch.getObject("trgRouteRepair");
		EObject _localVariable_8 = isApplicableMatch.getObject("srcSemaphore");
		EObject _localVariable_9 = isApplicableMatch.getObject("trgRouteOperational");
		EObject _localVariable_10 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_11 = isApplicableMatch.getObject("trgRouteFailed");
		EObject _localVariable_12 = isApplicableMatch.getObject("routeFailedCorr");
		EObject _localVariable_13 = isApplicableMatch.getObject("semaphoreOperationalCorr");
		EObject _localVariable_14 = isApplicableMatch.getObject("trgSemaphoreOperational");
		EObject tmpRouteOperationalCorr = _localVariable_0;
		EObject tmpTrgSemaphoreFailed = _localVariable_1;
		EObject tmpSrcContainer = _localVariable_2;
		EObject tmpSrcRoute = _localVariable_3;
		EObject tmpContainerCorr = _localVariable_4;
		EObject tmpRouteRepairCorr = _localVariable_5;
		EObject tmpSemaphoreFailedCorr = _localVariable_6;
		EObject tmpTrgRouteRepair = _localVariable_7;
		EObject tmpSrcSemaphore = _localVariable_8;
		EObject tmpTrgRouteOperational = _localVariable_9;
		EObject tmpTrgPetrinet = _localVariable_10;
		EObject tmpTrgRouteFailed = _localVariable_11;
		EObject tmpRouteFailedCorr = _localVariable_12;
		EObject tmpSemaphoreOperationalCorr = _localVariable_13;
		EObject tmpTrgSemaphoreOperational = _localVariable_14;
		if (tmpRouteOperationalCorr instanceof RouteToOperational) {
			RouteToOperational routeOperationalCorr = (RouteToOperational) tmpRouteOperationalCorr;
			if (tmpTrgSemaphoreFailed instanceof Place) {
				Place trgSemaphoreFailed = (Place) tmpTrgSemaphoreFailed;
				if (tmpSrcContainer instanceof RailwayContainer) {
					RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
					if (tmpSrcRoute instanceof Route) {
						Route srcRoute = (Route) tmpSrcRoute;
						if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
							RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
							if (tmpRouteRepairCorr instanceof RouteToRepair) {
								RouteToRepair routeRepairCorr = (RouteToRepair) tmpRouteRepairCorr;
								if (tmpSemaphoreFailedCorr instanceof SemaphoreToFailed) {
									SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) tmpSemaphoreFailedCorr;
									if (tmpTrgRouteRepair instanceof Transition) {
										Transition trgRouteRepair = (Transition) tmpTrgRouteRepair;
										if (tmpSrcSemaphore instanceof Semaphore) {
											Semaphore srcSemaphore = (Semaphore) tmpSrcSemaphore;
											if (tmpTrgRouteOperational instanceof Place) {
												Place trgRouteOperational = (Place) tmpTrgRouteOperational;
												if (tmpTrgPetrinet instanceof PetriNet) {
													PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
													if (tmpTrgRouteFailed instanceof Place) {
														Place trgRouteFailed = (Place) tmpTrgRouteFailed;
														if (tmpRouteFailedCorr instanceof RouteToFailed) {
															RouteToFailed routeFailedCorr = (RouteToFailed) tmpRouteFailedCorr;
															if (tmpSemaphoreOperationalCorr instanceof SemaphoreToOperational) {
																SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) tmpSemaphoreOperationalCorr;
																if (tmpTrgSemaphoreOperational instanceof Place) {
																	Place trgSemaphoreOperational = (Place) tmpTrgSemaphoreOperational;
																	return new Object[] { routeOperationalCorr,
																			trgSemaphoreFailed, srcContainer, srcRoute,
																			containerCorr, routeRepairCorr,
																			semaphoreFailedCorr, trgRouteRepair,
																			srcSemaphore, trgRouteOperational,
																			trgPetrinet, trgRouteFailed,
																			routeFailedCorr, semaphoreOperationalCorr,
																			trgSemaphoreOperational,
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

	public static final Object[] pattern_RequiredEntrySemaphore_1_1_performtransformation_blackBBBBBBBBBBBBBBBFBB(
			RouteToOperational routeOperationalCorr, Place trgSemaphoreFailed, RailwayContainer srcContainer,
			Route srcRoute, RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr,
			SemaphoreToFailed semaphoreFailedCorr, Transition trgRouteRepair, Semaphore srcSemaphore,
			Place trgRouteOperational, PetriNet trgPetrinet, Place trgRouteFailed, RouteToFailed routeFailedCorr,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational,
			RequiredEntrySemaphore _this, IsApplicableMatch isApplicableMatch) {
		if (!trgSemaphoreFailed.equals(trgSemaphoreOperational)) {
			if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
				if (!trgRouteOperational.equals(trgSemaphoreOperational)) {
					if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
						if (!trgRouteFailed.equals(trgRouteOperational)) {
							if (!trgRouteFailed.equals(trgSemaphoreOperational)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { routeOperationalCorr, trgSemaphoreFailed, srcContainer,
												srcRoute, containerCorr, routeRepairCorr, semaphoreFailedCorr,
												trgRouteRepair, srcSemaphore, trgRouteOperational, trgPetrinet,
												trgRouteFailed, routeFailedCorr, semaphoreOperationalCorr,
												trgSemaphoreOperational, csp, _this, isApplicableMatch };
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

	public static final Object[] pattern_RequiredEntrySemaphore_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFBB(
			RequiredEntrySemaphore _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding = pattern_RequiredEntrySemaphore_1_1_performtransformation_bindingFFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding != null) {
			RouteToOperational routeOperationalCorr = (RouteToOperational) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[0];
			Place trgSemaphoreFailed = (Place) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[1];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[2];
			Route srcRoute = (Route) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[3];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[4];
			RouteToRepair routeRepairCorr = (RouteToRepair) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[5];
			SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[6];
			Transition trgRouteRepair = (Transition) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[7];
			Semaphore srcSemaphore = (Semaphore) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[8];
			Place trgRouteOperational = (Place) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[9];
			PetriNet trgPetrinet = (PetriNet) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[10];
			Place trgRouteFailed = (Place) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[11];
			RouteToFailed routeFailedCorr = (RouteToFailed) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[12];
			SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[13];
			Place trgSemaphoreOperational = (Place) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[14];

			Object[] result_pattern_RequiredEntrySemaphore_1_1_performtransformation_black = pattern_RequiredEntrySemaphore_1_1_performtransformation_blackBBBBBBBBBBBBBBBFBB(
					routeOperationalCorr, trgSemaphoreFailed, srcContainer, srcRoute, containerCorr, routeRepairCorr,
					semaphoreFailedCorr, trgRouteRepair, srcSemaphore, trgRouteOperational, trgPetrinet, trgRouteFailed,
					routeFailedCorr, semaphoreOperationalCorr, trgSemaphoreOperational, _this, isApplicableMatch);
			if (result_pattern_RequiredEntrySemaphore_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_black[15];

				return new Object[] { routeOperationalCorr, trgSemaphoreFailed, srcContainer, srcRoute, containerCorr,
						routeRepairCorr, semaphoreFailedCorr, trgRouteRepair, srcSemaphore, trgRouteOperational,
						trgPetrinet, trgRouteFailed, routeFailedCorr, semaphoreOperationalCorr, trgSemaphoreOperational,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_1_1_performtransformation_greenBFFFFBFFBBBFB(
			Place trgSemaphoreFailed, Transition trgRouteRepair, Place trgRouteOperational, PetriNet trgPetrinet,
			Place trgRouteFailed, Place trgSemaphoreOperational) {
		Arc trgSemaphoreOperationalToRouteRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSemaphoreFailedToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		ImmediateTransition trgRouteFail = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		Arc trgRouteRepairToSemaphoreOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToRouteFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToSemaphoreFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteOperationalToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		ArcKind trgSemaphoreOperationalToRouteRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgSemaphoreFailedToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteRepairToSemaphoreOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteFailToRouteFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteFailToSemaphoreFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteOperationalToRouteFail_kind_prime = ArcKind.INPUT;
		trgSemaphoreOperationalToRouteRepair.setTransition(trgRouteRepair);
		trgSemaphoreOperationalToRouteRepair.setPlace(trgSemaphoreOperational);
		trgSemaphoreFailedToRouteFail.setPlace(trgSemaphoreFailed);
		trgSemaphoreFailedToRouteFail.setTransition(trgRouteFail);
		trgRouteFail.setPetriNet(trgPetrinet);
		trgRouteRepairToSemaphoreOperational.setPlace(trgSemaphoreOperational);
		trgRouteRepairToSemaphoreOperational.setTransition(trgRouteRepair);
		trgRouteFailToRouteFailed.setPlace(trgRouteFailed);
		trgRouteFailToRouteFailed.setTransition(trgRouteFail);
		trgRouteFailToSemaphoreFailed.setTransition(trgRouteFail);
		trgRouteFailToSemaphoreFailed.setPlace(trgSemaphoreFailed);
		trgRouteOperationalToRouteFail.setPlace(trgRouteOperational);
		trgRouteOperationalToRouteFail.setTransition(trgRouteFail);
		trgSemaphoreOperationalToRouteRepair.setKind(trgSemaphoreOperationalToRouteRepair_kind_prime);
		trgSemaphoreFailedToRouteFail.setKind(trgSemaphoreFailedToRouteFail_kind_prime);
		trgRouteRepairToSemaphoreOperational.setKind(trgRouteRepairToSemaphoreOperational_kind_prime);
		trgRouteFailToRouteFailed.setKind(trgRouteFailToRouteFailed_kind_prime);
		trgRouteFailToSemaphoreFailed.setKind(trgRouteFailToSemaphoreFailed_kind_prime);
		trgRouteOperationalToRouteFail.setKind(trgRouteOperationalToRouteFail_kind_prime);
		return new Object[] { trgSemaphoreFailed, trgSemaphoreOperationalToRouteRepair, trgSemaphoreFailedToRouteFail,
				trgRouteFail, trgRouteRepairToSemaphoreOperational, trgRouteRepair, trgRouteFailToRouteFailed,
				trgRouteFailToSemaphoreFailed, trgRouteOperational, trgPetrinet, trgRouteFailed,
				trgRouteOperationalToRouteFail, trgSemaphoreOperational };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_1_2_collecttranslatedelements_blackBBBBBBB(
			Arc trgSemaphoreOperationalToRouteRepair, Arc trgSemaphoreFailedToRouteFail,
			ImmediateTransition trgRouteFail, Arc trgRouteRepairToSemaphoreOperational, Arc trgRouteFailToRouteFailed,
			Arc trgRouteFailToSemaphoreFailed, Arc trgRouteOperationalToRouteFail) {
		if (!trgSemaphoreFailedToRouteFail.equals(trgSemaphoreOperationalToRouteRepair)) {
			if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreOperationalToRouteRepair)) {
				if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreFailedToRouteFail)) {
					if (!trgRouteFailToRouteFailed.equals(trgSemaphoreOperationalToRouteRepair)) {
						if (!trgRouteFailToRouteFailed.equals(trgSemaphoreFailedToRouteFail)) {
							if (!trgRouteFailToRouteFailed.equals(trgRouteRepairToSemaphoreOperational)) {
								if (!trgRouteFailToRouteFailed.equals(trgRouteFailToSemaphoreFailed)) {
									if (!trgRouteFailToRouteFailed.equals(trgRouteOperationalToRouteFail)) {
										if (!trgRouteFailToSemaphoreFailed
												.equals(trgSemaphoreOperationalToRouteRepair)) {
											if (!trgRouteFailToSemaphoreFailed.equals(trgSemaphoreFailedToRouteFail)) {
												if (!trgRouteFailToSemaphoreFailed
														.equals(trgRouteRepairToSemaphoreOperational)) {
													if (!trgRouteFailToSemaphoreFailed
															.equals(trgRouteOperationalToRouteFail)) {
														if (!trgRouteOperationalToRouteFail
																.equals(trgSemaphoreOperationalToRouteRepair)) {
															if (!trgRouteOperationalToRouteFail
																	.equals(trgSemaphoreFailedToRouteFail)) {
																if (!trgRouteOperationalToRouteFail
																		.equals(trgRouteRepairToSemaphoreOperational)) {
																	return new Object[] {
																			trgSemaphoreOperationalToRouteRepair,
																			trgSemaphoreFailedToRouteFail, trgRouteFail,
																			trgRouteRepairToSemaphoreOperational,
																			trgRouteFailToRouteFailed,
																			trgRouteFailToSemaphoreFailed,
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

	public static final Object[] pattern_RequiredEntrySemaphore_1_2_collecttranslatedelements_greenFBBBBBBB(
			Arc trgSemaphoreOperationalToRouteRepair, Arc trgSemaphoreFailedToRouteFail,
			ImmediateTransition trgRouteFail, Arc trgRouteRepairToSemaphoreOperational, Arc trgRouteFailToRouteFailed,
			Arc trgRouteFailToSemaphoreFailed, Arc trgRouteOperationalToRouteFail) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgSemaphoreOperationalToRouteRepair);
		ruleresult.getCreatedElements().add(trgSemaphoreFailedToRouteFail);
		ruleresult.getCreatedElements().add(trgRouteFail);
		ruleresult.getCreatedElements().add(trgRouteRepairToSemaphoreOperational);
		ruleresult.getCreatedElements().add(trgRouteFailToRouteFailed);
		ruleresult.getCreatedElements().add(trgRouteFailToSemaphoreFailed);
		ruleresult.getCreatedElements().add(trgRouteOperationalToRouteFail);
		return new Object[] { ruleresult, trgSemaphoreOperationalToRouteRepair, trgSemaphoreFailedToRouteFail,
				trgRouteFail, trgRouteRepairToSemaphoreOperational, trgRouteFailToRouteFailed,
				trgRouteFailToSemaphoreFailed, trgRouteOperationalToRouteFail };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject routeOperationalCorr, EObject trgSemaphoreFailed,
			EObject srcContainer, EObject trgSemaphoreOperationalToRouteRepair, EObject srcRoute,
			EObject trgSemaphoreFailedToRouteFail, EObject containerCorr, EObject trgRouteFail, EObject routeRepairCorr,
			EObject semaphoreFailedCorr, EObject trgRouteRepairToSemaphoreOperational, EObject trgRouteRepair,
			EObject trgRouteFailToRouteFailed, EObject trgRouteFailToSemaphoreFailed, EObject srcSemaphore,
			EObject trgRouteOperational, EObject trgPetrinet, EObject trgRouteFailed,
			EObject trgRouteOperationalToRouteFail, EObject routeFailedCorr, EObject semaphoreOperationalCorr,
			EObject trgSemaphoreOperational) {
		if (!routeOperationalCorr.equals(trgSemaphoreFailed)) {
			if (!routeOperationalCorr.equals(srcContainer)) {
				if (!routeOperationalCorr.equals(trgSemaphoreOperationalToRouteRepair)) {
					if (!routeOperationalCorr.equals(srcRoute)) {
						if (!routeOperationalCorr.equals(trgSemaphoreFailedToRouteFail)) {
							if (!routeOperationalCorr.equals(trgRouteFail)) {
								if (!routeOperationalCorr.equals(routeRepairCorr)) {
									if (!routeOperationalCorr.equals(semaphoreFailedCorr)) {
										if (!routeOperationalCorr.equals(trgRouteRepairToSemaphoreOperational)) {
											if (!routeOperationalCorr.equals(trgRouteRepair)) {
												if (!routeOperationalCorr.equals(trgRouteFailToRouteFailed)) {
													if (!routeOperationalCorr.equals(trgRouteFailToSemaphoreFailed)) {
														if (!routeOperationalCorr.equals(srcSemaphore)) {
															if (!routeOperationalCorr.equals(trgRouteOperational)) {
																if (!routeOperationalCorr.equals(trgPetrinet)) {
																	if (!routeOperationalCorr.equals(trgRouteFailed)) {
																		if (!routeOperationalCorr.equals(
																				trgRouteOperationalToRouteFail)) {
																			if (!routeOperationalCorr
																					.equals(semaphoreOperationalCorr)) {
																				if (!routeOperationalCorr.equals(
																						trgSemaphoreOperational)) {
																					if (!trgSemaphoreFailed.equals(
																							trgSemaphoreOperationalToRouteRepair)) {
																						if (!trgSemaphoreFailed.equals(
																								trgSemaphoreFailedToRouteFail)) {
																							if (!trgSemaphoreFailed
																									.equals(trgSemaphoreOperational)) {
																								if (!srcContainer
																										.equals(trgSemaphoreFailed)) {
																									if (!srcContainer
																											.equals(trgSemaphoreOperationalToRouteRepair)) {
																										if (!srcContainer
																												.equals(srcRoute)) {
																											if (!srcContainer
																													.equals(trgSemaphoreFailedToRouteFail)) {
																												if (!srcContainer
																														.equals(trgRouteFail)) {
																													if (!srcContainer
																															.equals(trgRouteRepairToSemaphoreOperational)) {
																														if (!srcContainer
																																.equals(trgRouteRepair)) {
																															if (!srcContainer
																																	.equals(trgRouteFailToRouteFailed)) {
																																if (!srcContainer
																																		.equals(trgRouteFailToSemaphoreFailed)) {
																																	if (!srcContainer
																																			.equals(srcSemaphore)) {
																																		if (!srcContainer
																																				.equals(trgRouteOperational)) {
																																			if (!srcContainer
																																					.equals(trgPetrinet)) {
																																				if (!srcContainer
																																						.equals(trgRouteFailed)) {
																																					if (!srcContainer
																																							.equals(trgRouteOperationalToRouteFail)) {
																																						if (!srcContainer
																																								.equals(trgSemaphoreOperational)) {
																																							if (!srcRoute
																																									.equals(trgSemaphoreFailed)) {
																																								if (!srcRoute
																																										.equals(trgSemaphoreOperationalToRouteRepair)) {
																																									if (!srcRoute
																																											.equals(trgSemaphoreFailedToRouteFail)) {
																																										if (!srcRoute
																																												.equals(trgRouteFail)) {
																																											if (!srcRoute
																																													.equals(trgRouteRepairToSemaphoreOperational)) {
																																												if (!srcRoute
																																														.equals(trgRouteRepair)) {
																																													if (!srcRoute
																																															.equals(trgRouteFailToRouteFailed)) {
																																														if (!srcRoute
																																																.equals(trgRouteFailToSemaphoreFailed)) {
																																															if (!srcRoute
																																																	.equals(srcSemaphore)) {
																																																if (!srcRoute
																																																		.equals(trgRouteOperational)) {
																																																	if (!srcRoute
																																																			.equals(trgPetrinet)) {
																																																		if (!srcRoute
																																																				.equals(trgRouteFailed)) {
																																																			if (!srcRoute
																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																				if (!srcRoute
																																																						.equals(trgSemaphoreOperational)) {
																																																					if (!trgSemaphoreFailedToRouteFail
																																																							.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																						if (!trgSemaphoreFailedToRouteFail
																																																								.equals(trgSemaphoreOperational)) {
																																																							if (!containerCorr
																																																									.equals(routeOperationalCorr)) {
																																																								if (!containerCorr
																																																										.equals(trgSemaphoreFailed)) {
																																																									if (!containerCorr
																																																											.equals(srcContainer)) {
																																																										if (!containerCorr
																																																												.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																											if (!containerCorr
																																																													.equals(srcRoute)) {
																																																												if (!containerCorr
																																																														.equals(trgSemaphoreFailedToRouteFail)) {
																																																													if (!containerCorr
																																																															.equals(trgRouteFail)) {
																																																														if (!containerCorr
																																																																.equals(routeRepairCorr)) {
																																																															if (!containerCorr
																																																																	.equals(semaphoreFailedCorr)) {
																																																																if (!containerCorr
																																																																		.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																	if (!containerCorr
																																																																			.equals(trgRouteRepair)) {
																																																																		if (!containerCorr
																																																																				.equals(trgRouteFailToRouteFailed)) {
																																																																			if (!containerCorr
																																																																					.equals(trgRouteFailToSemaphoreFailed)) {
																																																																				if (!containerCorr
																																																																						.equals(srcSemaphore)) {
																																																																					if (!containerCorr
																																																																							.equals(trgRouteOperational)) {
																																																																						if (!containerCorr
																																																																								.equals(trgPetrinet)) {
																																																																							if (!containerCorr
																																																																									.equals(trgRouteFailed)) {
																																																																								if (!containerCorr
																																																																										.equals(trgRouteOperationalToRouteFail)) {
																																																																									if (!containerCorr
																																																																											.equals(routeFailedCorr)) {
																																																																										if (!containerCorr
																																																																												.equals(semaphoreOperationalCorr)) {
																																																																											if (!containerCorr
																																																																													.equals(trgSemaphoreOperational)) {
																																																																												if (!trgRouteFail
																																																																														.equals(trgSemaphoreFailed)) {
																																																																													if (!trgRouteFail
																																																																															.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																														if (!trgRouteFail
																																																																																.equals(trgSemaphoreFailedToRouteFail)) {
																																																																															if (!trgRouteFail
																																																																																	.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																if (!trgRouteFail
																																																																																		.equals(trgRouteRepair)) {
																																																																																	if (!trgRouteFail
																																																																																			.equals(trgRouteFailToRouteFailed)) {
																																																																																		if (!trgRouteFail
																																																																																				.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																			if (!trgRouteFail
																																																																																					.equals(trgRouteOperational)) {
																																																																																				if (!trgRouteFail
																																																																																						.equals(trgRouteFailed)) {
																																																																																					if (!trgRouteFail
																																																																																							.equals(trgRouteOperationalToRouteFail)) {
																																																																																						if (!trgRouteFail
																																																																																								.equals(trgSemaphoreOperational)) {
																																																																																							if (!routeRepairCorr
																																																																																									.equals(trgSemaphoreFailed)) {
																																																																																								if (!routeRepairCorr
																																																																																										.equals(srcContainer)) {
																																																																																									if (!routeRepairCorr
																																																																																											.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																										if (!routeRepairCorr
																																																																																												.equals(srcRoute)) {
																																																																																											if (!routeRepairCorr
																																																																																													.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																												if (!routeRepairCorr
																																																																																														.equals(trgRouteFail)) {
																																																																																													if (!routeRepairCorr
																																																																																															.equals(semaphoreFailedCorr)) {
																																																																																														if (!routeRepairCorr
																																																																																																.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																															if (!routeRepairCorr
																																																																																																	.equals(trgRouteRepair)) {
																																																																																																if (!routeRepairCorr
																																																																																																		.equals(trgRouteFailToRouteFailed)) {
																																																																																																	if (!routeRepairCorr
																																																																																																			.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																		if (!routeRepairCorr
																																																																																																				.equals(srcSemaphore)) {
																																																																																																			if (!routeRepairCorr
																																																																																																					.equals(trgRouteOperational)) {
																																																																																																				if (!routeRepairCorr
																																																																																																						.equals(trgPetrinet)) {
																																																																																																					if (!routeRepairCorr
																																																																																																							.equals(trgRouteFailed)) {
																																																																																																						if (!routeRepairCorr
																																																																																																								.equals(trgRouteOperationalToRouteFail)) {
																																																																																																							if (!routeRepairCorr
																																																																																																									.equals(semaphoreOperationalCorr)) {
																																																																																																								if (!routeRepairCorr
																																																																																																										.equals(trgSemaphoreOperational)) {
																																																																																																									if (!semaphoreFailedCorr
																																																																																																											.equals(trgSemaphoreFailed)) {
																																																																																																										if (!semaphoreFailedCorr
																																																																																																												.equals(srcContainer)) {
																																																																																																											if (!semaphoreFailedCorr
																																																																																																													.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																												if (!semaphoreFailedCorr
																																																																																																														.equals(srcRoute)) {
																																																																																																													if (!semaphoreFailedCorr
																																																																																																															.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																														if (!semaphoreFailedCorr
																																																																																																																.equals(trgRouteFail)) {
																																																																																																															if (!semaphoreFailedCorr
																																																																																																																	.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																if (!semaphoreFailedCorr
																																																																																																																		.equals(trgRouteRepair)) {
																																																																																																																	if (!semaphoreFailedCorr
																																																																																																																			.equals(trgRouteFailToRouteFailed)) {
																																																																																																																		if (!semaphoreFailedCorr
																																																																																																																				.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																			if (!semaphoreFailedCorr
																																																																																																																					.equals(srcSemaphore)) {
																																																																																																																				if (!semaphoreFailedCorr
																																																																																																																						.equals(trgRouteOperational)) {
																																																																																																																					if (!semaphoreFailedCorr
																																																																																																																							.equals(trgPetrinet)) {
																																																																																																																						if (!semaphoreFailedCorr
																																																																																																																								.equals(trgRouteFailed)) {
																																																																																																																							if (!semaphoreFailedCorr
																																																																																																																									.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																								if (!semaphoreFailedCorr
																																																																																																																										.equals(semaphoreOperationalCorr)) {
																																																																																																																									if (!semaphoreFailedCorr
																																																																																																																											.equals(trgSemaphoreOperational)) {
																																																																																																																										if (!trgRouteRepairToSemaphoreOperational
																																																																																																																												.equals(trgSemaphoreFailed)) {
																																																																																																																											if (!trgRouteRepairToSemaphoreOperational
																																																																																																																													.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																												if (!trgRouteRepairToSemaphoreOperational
																																																																																																																														.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																													if (!trgRouteRepairToSemaphoreOperational
																																																																																																																															.equals(trgSemaphoreOperational)) {
																																																																																																																														if (!trgRouteRepair
																																																																																																																																.equals(trgSemaphoreFailed)) {
																																																																																																																															if (!trgRouteRepair
																																																																																																																																	.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																if (!trgRouteRepair
																																																																																																																																		.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																	if (!trgRouteRepair
																																																																																																																																			.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																		if (!trgRouteRepair
																																																																																																																																				.equals(trgSemaphoreOperational)) {
																																																																																																																																			if (!trgRouteFailToRouteFailed
																																																																																																																																					.equals(trgSemaphoreFailed)) {
																																																																																																																																				if (!trgRouteFailToRouteFailed
																																																																																																																																						.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																					if (!trgRouteFailToRouteFailed
																																																																																																																																							.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																						if (!trgRouteFailToRouteFailed
																																																																																																																																								.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																							if (!trgRouteFailToRouteFailed
																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																								if (!trgRouteFailToRouteFailed
																																																																																																																																										.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																									if (!trgRouteFailToRouteFailed
																																																																																																																																											.equals(trgRouteOperational)) {
																																																																																																																																										if (!trgRouteFailToRouteFailed
																																																																																																																																												.equals(trgRouteFailed)) {
																																																																																																																																											if (!trgRouteFailToRouteFailed
																																																																																																																																													.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																												if (!trgRouteFailToRouteFailed
																																																																																																																																														.equals(trgSemaphoreOperational)) {
																																																																																																																																													if (!trgRouteFailToSemaphoreFailed
																																																																																																																																															.equals(trgSemaphoreFailed)) {
																																																																																																																																														if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																															if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																	.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																		.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																	if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																			.equals(trgRouteRepair)) {
																																																																																																																																																		if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																				.equals(trgRouteOperational)) {
																																																																																																																																																			if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																					.equals(trgRouteFailed)) {
																																																																																																																																																				if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																						.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																					if (!trgRouteFailToSemaphoreFailed
																																																																																																																																																							.equals(trgSemaphoreOperational)) {
																																																																																																																																																						if (!srcSemaphore
																																																																																																																																																								.equals(trgSemaphoreFailed)) {
																																																																																																																																																							if (!srcSemaphore
																																																																																																																																																									.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																								if (!srcSemaphore
																																																																																																																																																										.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																									if (!srcSemaphore
																																																																																																																																																											.equals(trgRouteFail)) {
																																																																																																																																																										if (!srcSemaphore
																																																																																																																																																												.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																											if (!srcSemaphore
																																																																																																																																																													.equals(trgRouteRepair)) {
																																																																																																																																																												if (!srcSemaphore
																																																																																																																																																														.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																													if (!srcSemaphore
																																																																																																																																																															.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																														if (!srcSemaphore
																																																																																																																																																																.equals(trgRouteOperational)) {
																																																																																																																																																															if (!srcSemaphore
																																																																																																																																																																	.equals(trgPetrinet)) {
																																																																																																																																																																if (!srcSemaphore
																																																																																																																																																																		.equals(trgRouteFailed)) {
																																																																																																																																																																	if (!srcSemaphore
																																																																																																																																																																			.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																		if (!srcSemaphore
																																																																																																																																																																				.equals(trgSemaphoreOperational)) {
																																																																																																																																																																			if (!trgRouteOperational
																																																																																																																																																																					.equals(trgSemaphoreFailed)) {
																																																																																																																																																																				if (!trgRouteOperational
																																																																																																																																																																						.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																					if (!trgRouteOperational
																																																																																																																																																																							.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																						if (!trgRouteOperational
																																																																																																																																																																								.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																							if (!trgRouteOperational
																																																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																																																								if (!trgRouteOperational
																																																																																																																																																																										.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																									if (!trgRouteOperational
																																																																																																																																																																											.equals(trgSemaphoreOperational)) {
																																																																																																																																																																										if (!trgPetrinet
																																																																																																																																																																												.equals(trgSemaphoreFailed)) {
																																																																																																																																																																											if (!trgPetrinet
																																																																																																																																																																													.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																												if (!trgPetrinet
																																																																																																																																																																														.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																													if (!trgPetrinet
																																																																																																																																																																															.equals(trgRouteFail)) {
																																																																																																																																																																														if (!trgPetrinet
																																																																																																																																																																																.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																															if (!trgPetrinet
																																																																																																																																																																																	.equals(trgRouteRepair)) {
																																																																																																																																																																																if (!trgPetrinet
																																																																																																																																																																																		.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																	if (!trgPetrinet
																																																																																																																																																																																			.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																		if (!trgPetrinet
																																																																																																																																																																																				.equals(trgRouteOperational)) {
																																																																																																																																																																																			if (!trgPetrinet
																																																																																																																																																																																					.equals(trgRouteFailed)) {
																																																																																																																																																																																				if (!trgPetrinet
																																																																																																																																																																																						.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																					if (!trgPetrinet
																																																																																																																																																																																							.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																						if (!trgRouteFailed
																																																																																																																																																																																								.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																							if (!trgRouteFailed
																																																																																																																																																																																									.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																								if (!trgRouteFailed
																																																																																																																																																																																										.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																									if (!trgRouteFailed
																																																																																																																																																																																											.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																										if (!trgRouteFailed
																																																																																																																																																																																												.equals(trgRouteRepair)) {
																																																																																																																																																																																											if (!trgRouteFailed
																																																																																																																																																																																													.equals(trgRouteOperational)) {
																																																																																																																																																																																												if (!trgRouteFailed
																																																																																																																																																																																														.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																													if (!trgRouteFailed
																																																																																																																																																																																															.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																														if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																															if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																	.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																		.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																	if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																			.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																		if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																				.equals(trgRouteRepair)) {
																																																																																																																																																																																																			if (!trgRouteOperationalToRouteFail
																																																																																																																																																																																																					.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																				if (!routeFailedCorr
																																																																																																																																																																																																						.equals(routeOperationalCorr)) {
																																																																																																																																																																																																					if (!routeFailedCorr
																																																																																																																																																																																																							.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																						if (!routeFailedCorr
																																																																																																																																																																																																								.equals(srcContainer)) {
																																																																																																																																																																																																							if (!routeFailedCorr
																																																																																																																																																																																																									.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																								if (!routeFailedCorr
																																																																																																																																																																																																										.equals(srcRoute)) {
																																																																																																																																																																																																									if (!routeFailedCorr
																																																																																																																																																																																																											.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																										if (!routeFailedCorr
																																																																																																																																																																																																												.equals(trgRouteFail)) {
																																																																																																																																																																																																											if (!routeFailedCorr
																																																																																																																																																																																																													.equals(routeRepairCorr)) {
																																																																																																																																																																																																												if (!routeFailedCorr
																																																																																																																																																																																																														.equals(semaphoreFailedCorr)) {
																																																																																																																																																																																																													if (!routeFailedCorr
																																																																																																																																																																																																															.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																														if (!routeFailedCorr
																																																																																																																																																																																																																.equals(trgRouteRepair)) {
																																																																																																																																																																																																															if (!routeFailedCorr
																																																																																																																																																																																																																	.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																if (!routeFailedCorr
																																																																																																																																																																																																																		.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																																																	if (!routeFailedCorr
																																																																																																																																																																																																																			.equals(srcSemaphore)) {
																																																																																																																																																																																																																		if (!routeFailedCorr
																																																																																																																																																																																																																				.equals(trgRouteOperational)) {
																																																																																																																																																																																																																			if (!routeFailedCorr
																																																																																																																																																																																																																					.equals(trgPetrinet)) {
																																																																																																																																																																																																																				if (!routeFailedCorr
																																																																																																																																																																																																																						.equals(trgRouteFailed)) {
																																																																																																																																																																																																																					if (!routeFailedCorr
																																																																																																																																																																																																																							.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																						if (!routeFailedCorr
																																																																																																																																																																																																																								.equals(semaphoreOperationalCorr)) {
																																																																																																																																																																																																																							if (!routeFailedCorr
																																																																																																																																																																																																																									.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																																								if (!semaphoreOperationalCorr
																																																																																																																																																																																																																										.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																																									if (!semaphoreOperationalCorr
																																																																																																																																																																																																																											.equals(srcContainer)) {
																																																																																																																																																																																																																										if (!semaphoreOperationalCorr
																																																																																																																																																																																																																												.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																																											if (!semaphoreOperationalCorr
																																																																																																																																																																																																																													.equals(srcRoute)) {
																																																																																																																																																																																																																												if (!semaphoreOperationalCorr
																																																																																																																																																																																																																														.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																																													if (!semaphoreOperationalCorr
																																																																																																																																																																																																																															.equals(trgRouteFail)) {
																																																																																																																																																																																																																														if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																																															if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																	.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																		.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																																	if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																			.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																																																																		if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																				.equals(srcSemaphore)) {
																																																																																																																																																																																																																																			if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																					.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																				if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																						.equals(trgPetrinet)) {
																																																																																																																																																																																																																																					if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																							.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																						if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																								.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																							if (!semaphoreOperationalCorr
																																																																																																																																																																																																																																									.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																																																								if (!trgSemaphoreOperational
																																																																																																																																																																																																																																										.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																																																									return new Object[] {
																																																																																																																																																																																																																																											ruleresult,
																																																																																																																																																																																																																																											routeOperationalCorr,
																																																																																																																																																																																																																																											trgSemaphoreFailed,
																																																																																																																																																																																																																																											srcContainer,
																																																																																																																																																																																																																																											trgSemaphoreOperationalToRouteRepair,
																																																																																																																																																																																																																																											srcRoute,
																																																																																																																																																																																																																																											trgSemaphoreFailedToRouteFail,
																																																																																																																																																																																																																																											containerCorr,
																																																																																																																																																																																																																																											trgRouteFail,
																																																																																																																																																																																																																																											routeRepairCorr,
																																																																																																																																																																																																																																											semaphoreFailedCorr,
																																																																																																																																																																																																																																											trgRouteRepairToSemaphoreOperational,
																																																																																																																																																																																																																																											trgRouteRepair,
																																																																																																																																																																																																																																											trgRouteFailToRouteFailed,
																																																																																																																																																																																																																																											trgRouteFailToSemaphoreFailed,
																																																																																																																																																																																																																																											srcSemaphore,
																																																																																																																																																																																																																																											trgRouteOperational,
																																																																																																																																																																																																																																											trgPetrinet,
																																																																																																																																																																																																																																											trgRouteFailed,
																																																																																																																																																																																																																																											trgRouteOperationalToRouteFail,
																																																																																																																																																																																																																																											routeFailedCorr,
																																																																																																																																																																																																																																											semaphoreOperationalCorr,
																																																																																																																																																																																																																																											trgSemaphoreOperational };
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredEntrySemaphore_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject trgSemaphoreFailed, EObject trgSemaphoreOperationalToRouteRepair,
			EObject srcRoute, EObject trgSemaphoreFailedToRouteFail, EObject trgRouteFail,
			EObject trgRouteRepairToSemaphoreOperational, EObject trgRouteRepair, EObject trgRouteFailToRouteFailed,
			EObject trgRouteFailToSemaphoreFailed, EObject srcSemaphore, EObject trgRouteOperational,
			EObject trgPetrinet, EObject trgRouteFailed, EObject trgRouteOperationalToRouteFail,
			EObject trgSemaphoreOperational) {
		EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSemaphoreFailedToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgSemaphoreFailedToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSemaphoreFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToSemaphoreFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRouteFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSemaphore____entry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RequiredEntrySemaphore";
		String trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs_name_prime = "arcs";
		String trgSemaphoreFailedToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgSemaphoreFailedToRouteFail____arcs_name_prime = "arcs";
		String trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place_name_prime = "place";
		String trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime = "place";
		String trgRouteFailToSemaphoreFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToSemaphoreFailed____arcs_name_prime = "arcs";
		String trgRouteFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRouteFail____nodes_name_prime = "nodes";
		String trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place_name_prime = "place";
		String srcRoute__srcSemaphore____entry_name_prime = "entry";
		String trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs_name_prime = "arcs";
		String trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime = "arcs";
		String trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime = "place";
		String trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place_name_prime = "place";
		String trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime = "arcs";
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition.setSrc(trgSemaphoreOperationalToRouteRepair);
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs.setTrg(trgSemaphoreOperationalToRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs);
		trgSemaphoreFailedToRouteFail__trgRouteFail____transition.setSrc(trgSemaphoreFailedToRouteFail);
		trgSemaphoreFailedToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgSemaphoreFailedToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgSemaphoreFailedToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgSemaphoreFailedToRouteFail____arcs.setTrg(trgSemaphoreFailedToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgSemaphoreFailedToRouteFail____arcs);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place
				.setSrc(trgRouteRepairToSemaphoreOperational);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place.setTrg(trgSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place.setSrc(trgSemaphoreFailedToRouteFail);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place.setTrg(trgSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setTrg(trgRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFailed____place);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition.setSrc(trgRouteFailToSemaphoreFailed);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToSemaphoreFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs.setTrg(trgRouteFailToSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToSemaphoreFailed____arcs);
		trgRouteFail__trgPetrinet____petriNet.setSrc(trgRouteFail);
		trgRouteFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgPetrinet____petriNet);
		trgPetrinet__trgRouteFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRouteFail____nodes.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRouteFail____nodes);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place
				.setSrc(trgSemaphoreOperationalToRouteRepair);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place.setTrg(trgSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place);
		srcRoute__srcSemaphore____entry.setSrc(srcRoute);
		srcRoute__srcSemaphore____entry.setTrg(srcSemaphore);
		ruleresult.getTranslatedEdges().add(srcRoute__srcSemaphore____entry);
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition.setSrc(trgRouteRepairToSemaphoreOperational);
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs.setTrg(trgRouteRepairToSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setTrg(trgRouteFailToRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToRouteFailed____arcs);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setTrg(trgRouteOperational);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteOperational____place);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place.setSrc(trgRouteFailToSemaphoreFailed);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place.setTrg(trgSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setTrg(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteOperationalToRouteFail____arcs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition
				.setName(trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs
				.setName(trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs_name_prime);
		trgSemaphoreFailedToRouteFail__trgRouteFail____transition
				.setName(trgSemaphoreFailedToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgSemaphoreFailedToRouteFail____arcs
				.setName(trgRouteFail__trgSemaphoreFailedToRouteFail____arcs_name_prime);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place
				.setName(trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place_name_prime);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place
				.setName(trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFailed____place
				.setName(trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition
				.setName(trgRouteFailToSemaphoreFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs
				.setName(trgRouteFail__trgRouteFailToSemaphoreFailed____arcs_name_prime);
		trgRouteFail__trgPetrinet____petriNet.setName(trgRouteFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRouteFail____nodes.setName(trgPetrinet__trgRouteFail____nodes_name_prime);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place
				.setName(trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place_name_prime);
		srcRoute__srcSemaphore____entry.setName(srcRoute__srcSemaphore____entry_name_prime);
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition
				.setName(trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs
				.setName(trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs_name_prime);
		trgRouteFailToRouteFailed__trgRouteFail____transition
				.setName(trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToRouteFailed____arcs
				.setName(trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime);
		trgRouteOperationalToRouteFail__trgRouteOperational____place
				.setName(trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place
				.setName(trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place_name_prime);
		trgRouteOperationalToRouteFail__trgRouteFail____transition
				.setName(trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs
				.setName(trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime);
		return new Object[] { ruleresult, trgSemaphoreFailed, trgSemaphoreOperationalToRouteRepair, srcRoute,
				trgSemaphoreFailedToRouteFail, trgRouteFail, trgRouteRepairToSemaphoreOperational, trgRouteRepair,
				trgRouteFailToRouteFailed, trgRouteFailToSemaphoreFailed, srcSemaphore, trgRouteOperational,
				trgPetrinet, trgRouteFailed, trgRouteOperationalToRouteFail, trgSemaphoreOperational,
				trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition,
				trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs,
				trgSemaphoreFailedToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgSemaphoreFailedToRouteFail____arcs,
				trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place,
				trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place,
				trgRouteFailToRouteFailed__trgRouteFailed____place,
				trgRouteFailToSemaphoreFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToSemaphoreFailed____arcs, trgRouteFail__trgPetrinet____petriNet,
				trgPetrinet__trgRouteFail____nodes,
				trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place, srcRoute__srcSemaphore____entry,
				trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition,
				trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs,
				trgRouteFailToRouteFailed__trgRouteFail____transition, trgRouteFail__trgRouteFailToRouteFailed____arcs,
				trgRouteOperationalToRouteFail__trgRouteOperational____place,
				trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place,
				trgRouteOperationalToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgRouteOperationalToRouteFail____arcs };
	}

	public static final void pattern_RequiredEntrySemaphore_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
			RequiredEntrySemaphore _this, PerformRuleResult ruleresult, EObject routeOperationalCorr,
			EObject trgSemaphoreFailed, EObject srcContainer, EObject trgSemaphoreOperationalToRouteRepair,
			EObject srcRoute, EObject trgSemaphoreFailedToRouteFail, EObject containerCorr, EObject trgRouteFail,
			EObject routeRepairCorr, EObject semaphoreFailedCorr, EObject trgRouteRepairToSemaphoreOperational,
			EObject trgRouteRepair, EObject trgRouteFailToRouteFailed, EObject trgRouteFailToSemaphoreFailed,
			EObject srcSemaphore, EObject trgRouteOperational, EObject trgPetrinet, EObject trgRouteFailed,
			EObject trgRouteOperationalToRouteFail, EObject routeFailedCorr, EObject semaphoreOperationalCorr,
			EObject trgSemaphoreOperational) {
		_this.registerObjects_FWD(ruleresult, routeOperationalCorr, trgSemaphoreFailed, srcContainer,
				trgSemaphoreOperationalToRouteRepair, srcRoute, trgSemaphoreFailedToRouteFail, containerCorr,
				trgRouteFail, routeRepairCorr, semaphoreFailedCorr, trgRouteRepairToSemaphoreOperational,
				trgRouteRepair, trgRouteFailToRouteFailed, trgRouteFailToSemaphoreFailed, srcSemaphore,
				trgRouteOperational, trgPetrinet, trgRouteFailed, trgRouteOperationalToRouteFail, routeFailedCorr,
				semaphoreOperationalCorr, trgSemaphoreOperational);

	}

	public static final PerformRuleResult pattern_RequiredEntrySemaphore_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_bindingFB(
			RequiredEntrySemaphore _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_blackFBB(EClass eClass,
			RequiredEntrySemaphore _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_bindingAndBlackFFB(
			RequiredEntrySemaphore _this) {
		Object[] result_pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_binding = pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_black = pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "RequiredEntrySemaphore";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcContainer");
		EObject _localVariable_1 = match.getObject("srcRoute");
		EObject _localVariable_2 = match.getObject("srcSemaphore");
		EObject tmpSrcContainer = _localVariable_0;
		EObject tmpSrcRoute = _localVariable_1;
		EObject tmpSrcSemaphore = _localVariable_2;
		if (tmpSrcContainer instanceof RailwayContainer) {
			RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
			if (tmpSrcRoute instanceof Route) {
				Route srcRoute = (Route) tmpSrcRoute;
				if (tmpSrcSemaphore instanceof Semaphore) {
					Semaphore srcSemaphore = (Semaphore) tmpSrcSemaphore;
					return new Object[] { srcContainer, srcRoute, srcSemaphore, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RequiredEntrySemaphore_2_2_corematch_blackFFBBFFFFBFFFFFFB(
			RailwayContainer srcContainer, Route srcRoute, Semaphore srcSemaphore, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
			PetriNet trgPetrinet = containerCorr.getTarget();
			if (trgPetrinet != null) {
				for (RouteToRepair routeRepairCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcRoute, RouteToRepair.class, "source")) {
					Transition trgRouteRepair = routeRepairCorr.getTarget();
					if (trgRouteRepair != null) {
						for (SemaphoreToFailed semaphoreFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(srcSemaphore, SemaphoreToFailed.class, "source")) {
							Place trgSemaphoreFailed = semaphoreFailedCorr.getTarget();
							if (trgSemaphoreFailed != null) {
								for (RouteToOperational routeOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(srcRoute, RouteToOperational.class, "source")) {
									Place trgRouteOperational = routeOperationalCorr.getTarget();
									if (trgRouteOperational != null) {
										if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
											for (RouteToFailed routeFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(srcRoute, RouteToFailed.class,
															"source")) {
												Place trgRouteFailed = routeFailedCorr.getTarget();
												if (trgRouteFailed != null) {
													if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
														if (!trgRouteFailed.equals(trgRouteOperational)) {
															for (SemaphoreToOperational semaphoreOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(srcSemaphore,
																			SemaphoreToOperational.class, "source")) {
																Place trgSemaphoreOperational = semaphoreOperationalCorr
																		.getTarget();
																if (trgSemaphoreOperational != null) {
																	if (!trgSemaphoreFailed
																			.equals(trgSemaphoreOperational)) {
																		if (!trgRouteOperational
																				.equals(trgSemaphoreOperational)) {
																			if (!trgRouteFailed
																					.equals(trgSemaphoreOperational)) {
																				_result.add(new Object[] {
																						routeOperationalCorr,
																						trgSemaphoreFailed,
																						srcContainer, srcRoute,
																						containerCorr, routeRepairCorr,
																						semaphoreFailedCorr,
																						trgRouteRepair, srcSemaphore,
																						trgRouteOperational,
																						trgPetrinet, trgRouteFailed,
																						routeFailedCorr,
																						semaphoreOperationalCorr,
																						trgSemaphoreOperational,
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

	public static final Iterable<Object[]> pattern_RequiredEntrySemaphore_2_3_findcontext_blackBBBBBBBBBBBBBBB(
			RouteToOperational routeOperationalCorr, Place trgSemaphoreFailed, RailwayContainer srcContainer,
			Route srcRoute, RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr,
			SemaphoreToFailed semaphoreFailedCorr, Transition trgRouteRepair, Semaphore srcSemaphore,
			Place trgRouteOperational, PetriNet trgPetrinet, Place trgRouteFailed, RouteToFailed routeFailedCorr,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!trgSemaphoreFailed.equals(trgSemaphoreOperational)) {
			if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
				if (!trgRouteOperational.equals(trgSemaphoreOperational)) {
					if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
						if (!trgRouteFailed.equals(trgRouteOperational)) {
							if (!trgRouteFailed.equals(trgSemaphoreOperational)) {
								if (srcContainer.equals(containerCorr.getSource())) {
									if (srcRoute.equals(routeRepairCorr.getSource())) {
										if (trgSemaphoreFailed.equals(semaphoreFailedCorr.getTarget())) {
											if (srcContainer.getRoutes().contains(srcRoute)) {
												if (trgRouteRepair.equals(routeRepairCorr.getTarget())) {
													if (srcSemaphore.equals(semaphoreFailedCorr.getSource())) {
														if (srcRoute.equals(routeOperationalCorr.getSource())) {
															if (srcSemaphore.equals(srcRoute.getEntry())) {
																if (trgRouteOperational
																		.equals(routeOperationalCorr.getTarget())) {
																	if (trgPetrinet.equals(containerCorr.getTarget())) {
																		if (srcRoute
																				.equals(routeFailedCorr.getSource())) {
																			if (srcSemaphore
																					.equals(semaphoreOperationalCorr
																							.getSource())) {
																				if (trgRouteFailed.equals(
																						routeFailedCorr.getTarget())) {
																					if (trgSemaphoreOperational.equals(
																							semaphoreOperationalCorr
																									.getTarget())) {
																						_result.add(new Object[] {
																								routeOperationalCorr,
																								trgSemaphoreFailed,
																								srcContainer, srcRoute,
																								containerCorr,
																								routeRepairCorr,
																								semaphoreFailedCorr,
																								trgRouteRepair,
																								srcSemaphore,
																								trgRouteOperational,
																								trgPetrinet,
																								trgRouteFailed,
																								routeFailedCorr,
																								semaphoreOperationalCorr,
																								trgSemaphoreOperational });
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredEntrySemaphore_2_3_findcontext_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			RouteToOperational routeOperationalCorr, Place trgSemaphoreFailed, RailwayContainer srcContainer,
			Route srcRoute, RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr,
			SemaphoreToFailed semaphoreFailedCorr, Transition trgRouteRepair, Semaphore srcSemaphore,
			Place trgRouteOperational, PetriNet trgPetrinet, Place trgRouteFailed, RouteToFailed routeFailedCorr,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreFailedCorr__trgSemaphoreFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRouteRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreFailedCorr__srcSemaphore____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSemaphore____entry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgRouteOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreOperationalCorr__srcSemaphore____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgRouteFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreOperationalCorr__trgSemaphoreOperational____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String containerCorr__srcContainer____source_name_prime = "source";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		String semaphoreFailedCorr__trgSemaphoreFailed____target_name_prime = "target";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		String routeRepairCorr__trgRouteRepair____target_name_prime = "target";
		String semaphoreFailedCorr__srcSemaphore____source_name_prime = "source";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String srcRoute__srcSemaphore____entry_name_prime = "entry";
		String routeOperationalCorr__trgRouteOperational____target_name_prime = "target";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		String semaphoreOperationalCorr__srcSemaphore____source_name_prime = "source";
		String routeFailedCorr__trgRouteFailed____target_name_prime = "target";
		String semaphoreOperationalCorr__trgSemaphoreOperational____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr);
		isApplicableMatch.getAllContextElements().add(trgSemaphoreFailed);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr);
		isApplicableMatch.getAllContextElements().add(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr);
		isApplicableMatch.getAllContextElements().add(trgSemaphoreOperational);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__srcRoute____source);
		semaphoreFailedCorr__trgSemaphoreFailed____target.setSrc(semaphoreFailedCorr);
		semaphoreFailedCorr__trgSemaphoreFailed____target.setTrg(trgSemaphoreFailed);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr__trgSemaphoreFailed____target);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		routeRepairCorr__trgRouteRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRouteRepair____target.setTrg(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__trgRouteRepair____target);
		semaphoreFailedCorr__srcSemaphore____source.setSrc(semaphoreFailedCorr);
		semaphoreFailedCorr__srcSemaphore____source.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr__srcSemaphore____source);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__srcRoute____source);
		srcRoute__srcSemaphore____entry.setSrc(srcRoute);
		srcRoute__srcSemaphore____entry.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(srcRoute__srcSemaphore____entry);
		routeOperationalCorr__trgRouteOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgRouteOperational____target.setTrg(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__trgRouteOperational____target);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__srcRoute____source);
		semaphoreOperationalCorr__srcSemaphore____source.setSrc(semaphoreOperationalCorr);
		semaphoreOperationalCorr__srcSemaphore____source.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr__srcSemaphore____source);
		routeFailedCorr__trgRouteFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgRouteFailed____target.setTrg(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__trgRouteFailed____target);
		semaphoreOperationalCorr__trgSemaphoreOperational____target.setSrc(semaphoreOperationalCorr);
		semaphoreOperationalCorr__trgSemaphoreOperational____target.setTrg(trgSemaphoreOperational);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr__trgSemaphoreOperational____target);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		semaphoreFailedCorr__trgSemaphoreFailed____target
				.setName(semaphoreFailedCorr__trgSemaphoreFailed____target_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		routeRepairCorr__trgRouteRepair____target.setName(routeRepairCorr__trgRouteRepair____target_name_prime);
		semaphoreFailedCorr__srcSemaphore____source.setName(semaphoreFailedCorr__srcSemaphore____source_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		srcRoute__srcSemaphore____entry.setName(srcRoute__srcSemaphore____entry_name_prime);
		routeOperationalCorr__trgRouteOperational____target
				.setName(routeOperationalCorr__trgRouteOperational____target_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		semaphoreOperationalCorr__srcSemaphore____source
				.setName(semaphoreOperationalCorr__srcSemaphore____source_name_prime);
		routeFailedCorr__trgRouteFailed____target.setName(routeFailedCorr__trgRouteFailed____target_name_prime);
		semaphoreOperationalCorr__trgSemaphoreOperational____target
				.setName(semaphoreOperationalCorr__trgSemaphoreOperational____target_name_prime);
		return new Object[] { routeOperationalCorr, trgSemaphoreFailed, srcContainer, srcRoute, containerCorr,
				routeRepairCorr, semaphoreFailedCorr, trgRouteRepair, srcSemaphore, trgRouteOperational, trgPetrinet,
				trgRouteFailed, routeFailedCorr, semaphoreOperationalCorr, trgSemaphoreOperational, isApplicableMatch,
				containerCorr__srcContainer____source, routeRepairCorr__srcRoute____source,
				semaphoreFailedCorr__trgSemaphoreFailed____target, srcContainer__srcRoute____routes,
				routeRepairCorr__trgRouteRepair____target, semaphoreFailedCorr__srcSemaphore____source,
				routeOperationalCorr__srcRoute____source, srcRoute__srcSemaphore____entry,
				routeOperationalCorr__trgRouteOperational____target, containerCorr__trgPetrinet____target,
				routeFailedCorr__srcRoute____source, semaphoreOperationalCorr__srcSemaphore____source,
				routeFailedCorr__trgRouteFailed____target,
				semaphoreOperationalCorr__trgSemaphoreOperational____target };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
			RequiredEntrySemaphore _this, IsApplicableMatch isApplicableMatch, RouteToOperational routeOperationalCorr,
			Place trgSemaphoreFailed, RailwayContainer srcContainer, Route srcRoute,
			RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr,
			SemaphoreToFailed semaphoreFailedCorr, Transition trgRouteRepair, Semaphore srcSemaphore,
			Place trgRouteOperational, PetriNet trgPetrinet, Place trgRouteFailed, RouteToFailed routeFailedCorr,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, routeOperationalCorr,
				trgSemaphoreFailed, srcContainer, srcRoute, containerCorr, routeRepairCorr, semaphoreFailedCorr,
				trgRouteRepair, srcSemaphore, trgRouteOperational, trgPetrinet, trgRouteFailed, routeFailedCorr,
				semaphoreOperationalCorr, trgSemaphoreOperational);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, routeOperationalCorr, trgSemaphoreFailed, srcContainer,
					srcRoute, containerCorr, routeRepairCorr, semaphoreFailedCorr, trgRouteRepair, srcSemaphore,
					trgRouteOperational, trgPetrinet, trgRouteFailed, routeFailedCorr, semaphoreOperationalCorr,
					trgSemaphoreOperational };
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			RequiredEntrySemaphore _this, IsApplicableMatch isApplicableMatch, RouteToOperational routeOperationalCorr,
			Place trgSemaphoreFailed, RailwayContainer srcContainer, Route srcRoute,
			RailwayContainerToPetriNet containerCorr, RouteToRepair routeRepairCorr,
			SemaphoreToFailed semaphoreFailedCorr, Transition trgRouteRepair, Semaphore srcSemaphore,
			Place trgRouteOperational, PetriNet trgPetrinet, Place trgRouteFailed, RouteToFailed routeFailedCorr,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational) {
		Object[] result_pattern_RequiredEntrySemaphore_2_4_solveCSP_binding = pattern_RequiredEntrySemaphore_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, routeOperationalCorr, trgSemaphoreFailed, srcContainer, srcRoute,
				containerCorr, routeRepairCorr, semaphoreFailedCorr, trgRouteRepair, srcSemaphore, trgRouteOperational,
				trgPetrinet, trgRouteFailed, routeFailedCorr, semaphoreOperationalCorr, trgSemaphoreOperational);
		if (result_pattern_RequiredEntrySemaphore_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredEntrySemaphore_2_4_solveCSP_binding[0];

			Object[] result_pattern_RequiredEntrySemaphore_2_4_solveCSP_black = pattern_RequiredEntrySemaphore_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_RequiredEntrySemaphore_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, routeOperationalCorr, trgSemaphoreFailed,
						srcContainer, srcRoute, containerCorr, routeRepairCorr, semaphoreFailedCorr, trgRouteRepair,
						srcSemaphore, trgRouteOperational, trgPetrinet, trgRouteFailed, routeFailedCorr,
						semaphoreOperationalCorr, trgSemaphoreOperational };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredEntrySemaphore_2_5_checkCSP_expressionFBB(RequiredEntrySemaphore _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "RequiredEntrySemaphore";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_RequiredEntrySemaphore_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_bindingFB(
			RequiredEntrySemaphore _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			RequiredEntrySemaphore _this) {
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

	public static final Object[] pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_bindingAndBlackFFBF(
			RequiredEntrySemaphore _this) {
		Object[] result_pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_binding = pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_black = pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_RequiredEntrySemaphore_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_entry) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcRoute = _edge_entry.getSrc();
		if (tmpSrcRoute instanceof Route) {
			Route srcRoute = (Route) tmpSrcRoute;
			EObject tmpSrcSemaphore = _edge_entry.getTrg();
			if (tmpSrcSemaphore instanceof Semaphore) {
				Semaphore srcSemaphore = (Semaphore) tmpSrcSemaphore;
				if (srcSemaphore.equals(srcRoute.getEntry())) {
					for (RailwayContainer srcContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(srcRoute, RailwayContainer.class, "routes")) {
						_result.add(new Object[] { srcContainer, srcRoute, srcSemaphore, _edge_entry });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_RequiredEntrySemaphore_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			RequiredEntrySemaphore _this, Match match, RailwayContainer srcContainer, Route srcRoute,
			Semaphore srcSemaphore) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcContainer, srcRoute, srcSemaphore);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_RequiredEntrySemaphore_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			RequiredEntrySemaphore _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_RequiredEntrySemaphore_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_13_1_matchtggpattern_blackBBB(
			RailwayContainer srcContainer, Route srcRoute, Semaphore srcSemaphore) {
		if (srcContainer.getRoutes().contains(srcRoute)) {
			if (srcSemaphore.equals(srcRoute.getEntry())) {
				return new Object[] { srcContainer, srcRoute, srcSemaphore };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredEntrySemaphore_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredEntrySemaphore_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RequiredEntrySemaphoreImpl
