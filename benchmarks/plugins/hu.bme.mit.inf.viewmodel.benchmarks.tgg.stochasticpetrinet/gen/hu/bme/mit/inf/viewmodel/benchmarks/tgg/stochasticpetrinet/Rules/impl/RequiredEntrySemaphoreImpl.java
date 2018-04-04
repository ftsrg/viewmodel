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
	public boolean isAppropriate_FWD(Match match, RailwayContainer srcContainer, Semaphore srcSemaphore,
			Route srcRoute) {

		Object[] result1_black = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_0_1_initialbindings_blackBBBBB(this, match, srcContainer, srcSemaphore,
						srcRoute);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcContainer] = " + srcContainer + ", " + "[srcSemaphore] = "
					+ srcSemaphore + ", " + "[srcRoute] = " + srcRoute + ".");
		}

		Object[] result2_bindingAndBlack = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, srcContainer,
						srcSemaphore, srcRoute);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcContainer] = " + srcContainer + ", " + "[srcSemaphore] = "
					+ srcSemaphore + ", " + "[srcRoute] = " + srcRoute + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_0_4_collectelementstobetranslated_blackBBBB(match, srcContainer,
							srcSemaphore, srcRoute);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcContainer] = " + srcContainer + ", " + "[srcSemaphore] = " + srcSemaphore + ", "
						+ "[srcRoute] = " + srcRoute + ".");
			}
			RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_4_collectelementstobetranslated_greenBBBF(match,
					srcSemaphore, srcRoute);
			//nothing EMoflonEdge srcRoute__srcSemaphore____entry = (EMoflonEdge) result4_green[3];

			Object[] result5_black = RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_0_5_collectcontextelements_blackBBBB(match, srcContainer,
							srcSemaphore, srcRoute);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcContainer] = " + srcContainer + ", " + "[srcSemaphore] = " + srcSemaphore + ", "
						+ "[srcRoute] = " + srcRoute + ".");
			}
			RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_5_collectcontextelements_greenBBBBF(match,
					srcContainer, srcSemaphore, srcRoute);
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result5_green[4];

			// 
			RequiredEntrySemaphoreImpl.pattern_RequiredEntrySemaphore_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, srcContainer, srcSemaphore, srcRoute);
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
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_bindingAndBlack[0];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[1];
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_bindingAndBlack[2];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_bindingAndBlack[3];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[4];
		Transition trgRouteRepair = (Transition) result1_bindingAndBlack[5];
		Place trgSemaphoreFailed = (Place) result1_bindingAndBlack[6];
		SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result1_bindingAndBlack[7];
		Place trgSemaphoreOperational = (Place) result1_bindingAndBlack[8];
		SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result1_bindingAndBlack[9];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[10];
		Place trgRouteFailed = (Place) result1_bindingAndBlack[11];
		Semaphore srcSemaphore = (Semaphore) result1_bindingAndBlack[12];
		Route srcRoute = (Route) result1_bindingAndBlack[13];
		Place trgRouteOperational = (Place) result1_bindingAndBlack[14];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[15];
		Object[] result1_green = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_1_performtransformation_greenFBFFBBFBFFFBB(trgPetrinet,
						trgRouteRepair, trgSemaphoreFailed, trgSemaphoreOperational, trgRouteFailed,
						trgRouteOperational);
		Arc trgRouteRepairToSemaphoreOperational = (Arc) result1_green[0];
		Arc trgRouteOperationalToRouteFail = (Arc) result1_green[2];
		Arc trgSemaphoreOperationalToRouteRepair = (Arc) result1_green[3];
		Arc trgRouteFailToSemaphoreFailed = (Arc) result1_green[6];
		Arc trgSemaphoreFailedToRouteFail = (Arc) result1_green[8];
		Arc trgRouteFailToRouteFailed = (Arc) result1_green[9];
		ImmediateTransition trgRouteFail = (ImmediateTransition) result1_green[10];

		Object[] result2_black = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_2_collecttranslatedelements_blackBBBBBBB(
						trgRouteRepairToSemaphoreOperational, trgRouteOperationalToRouteFail,
						trgSemaphoreOperationalToRouteRepair, trgRouteFailToSemaphoreFailed,
						trgSemaphoreFailedToRouteFail, trgRouteFailToRouteFailed, trgRouteFail);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[trgRouteRepairToSemaphoreOperational] = "
							+ trgRouteRepairToSemaphoreOperational + ", " + "[trgRouteOperationalToRouteFail] = "
							+ trgRouteOperationalToRouteFail + ", " + "[trgSemaphoreOperationalToRouteRepair] = "
							+ trgSemaphoreOperationalToRouteRepair + ", " + "[trgRouteFailToSemaphoreFailed] = "
							+ trgRouteFailToSemaphoreFailed + ", " + "[trgSemaphoreFailedToRouteFail] = "
							+ trgSemaphoreFailedToRouteFail + ", " + "[trgRouteFailToRouteFailed] = "
							+ trgRouteFailToRouteFailed + ", " + "[trgRouteFail] = " + trgRouteFail + ".");
		}
		Object[] result2_green = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_2_collecttranslatedelements_greenFBBBBBBB(
						trgRouteRepairToSemaphoreOperational, trgRouteOperationalToRouteFail,
						trgSemaphoreOperationalToRouteRepair, trgRouteFailToSemaphoreFailed,
						trgSemaphoreFailedToRouteFail, trgRouteFailToRouteFailed, trgRouteFail);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(ruleresult,
						trgRouteRepairToSemaphoreOperational, routeRepairCorr, trgPetrinet, routeOperationalCorr,
						routeFailedCorr, trgRouteOperationalToRouteFail, srcContainer,
						trgSemaphoreOperationalToRouteRepair, trgRouteRepair, trgSemaphoreFailed,
						trgRouteFailToSemaphoreFailed, semaphoreOperationalCorr, trgSemaphoreOperational,
						semaphoreFailedCorr, trgSemaphoreFailedToRouteFail, containerCorr, trgRouteFailToRouteFailed,
						trgRouteFail, trgRouteFailed, srcSemaphore, srcRoute, trgRouteOperational);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[trgRouteRepairToSemaphoreOperational] = " + trgRouteRepairToSemaphoreOperational + ", "
					+ "[routeRepairCorr] = " + routeRepairCorr + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
					+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[routeFailedCorr] = "
					+ routeFailedCorr + ", " + "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail
					+ ", " + "[srcContainer] = " + srcContainer + ", " + "[trgSemaphoreOperationalToRouteRepair] = "
					+ trgSemaphoreOperationalToRouteRepair + ", " + "[trgRouteRepair] = " + trgRouteRepair + ", "
					+ "[trgSemaphoreFailed] = " + trgSemaphoreFailed + ", " + "[trgRouteFailToSemaphoreFailed] = "
					+ trgRouteFailToSemaphoreFailed + ", " + "[semaphoreOperationalCorr] = " + semaphoreOperationalCorr
					+ ", " + "[trgSemaphoreOperational] = " + trgSemaphoreOperational + ", "
					+ "[semaphoreFailedCorr] = " + semaphoreFailedCorr + ", " + "[trgSemaphoreFailedToRouteFail] = "
					+ trgSemaphoreFailedToRouteFail + ", " + "[containerCorr] = " + containerCorr + ", "
					+ "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ", " + "[trgRouteFail] = "
					+ trgRouteFail + ", " + "[trgRouteFailed] = " + trgRouteFailed + ", " + "[srcSemaphore] = "
					+ srcSemaphore + ", " + "[srcRoute] = " + srcRoute + ", " + "[trgRouteOperational] = "
					+ trgRouteOperational + ".");
		}
		RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
						ruleresult, trgRouteRepairToSemaphoreOperational, trgPetrinet, trgRouteOperationalToRouteFail,
						trgSemaphoreOperationalToRouteRepair, trgRouteRepair, trgSemaphoreFailed,
						trgRouteFailToSemaphoreFailed, trgSemaphoreOperational, trgSemaphoreFailedToRouteFail,
						trgRouteFailToRouteFailed, trgRouteFail, trgRouteFailed, srcSemaphore, srcRoute,
						trgRouteOperational);
		//nothing EMoflonEdge trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgRouteFailToSemaphoreFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToSemaphoreFailed____arcs = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge srcRoute__srcSemaphore____entry = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgRouteFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgPetrinet__trgRouteFail____nodes = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgSemaphoreFailedToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgRouteFail__trgSemaphoreFailedToRouteFail____arcs = (EMoflonEdge) result3_green[36];

		// 
		// 
		RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(this, ruleresult,
						trgRouteRepairToSemaphoreOperational, routeRepairCorr, trgPetrinet, routeOperationalCorr,
						routeFailedCorr, trgRouteOperationalToRouteFail, srcContainer,
						trgSemaphoreOperationalToRouteRepair, trgRouteRepair, trgSemaphoreFailed,
						trgRouteFailToSemaphoreFailed, semaphoreOperationalCorr, trgSemaphoreOperational,
						semaphoreFailedCorr, trgSemaphoreFailedToRouteFail, containerCorr, trgRouteFailToRouteFailed,
						trgRouteFail, trgRouteFailed, srcSemaphore, srcRoute, trgRouteOperational);
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
		Semaphore srcSemaphore = (Semaphore) result2_binding[1];
		Route srcRoute = (Route) result2_binding[2];
		for (Object[] result2_black : RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_2_2_corematch_blackFFFFBFFFFFFFBBFB(srcContainer, srcSemaphore,
						srcRoute, match)) {
			RouteToRepair routeRepairCorr = (RouteToRepair) result2_black[0];
			PetriNet trgPetrinet = (PetriNet) result2_black[1];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result2_black[2];
			RouteToFailed routeFailedCorr = (RouteToFailed) result2_black[3];
			Transition trgRouteRepair = (Transition) result2_black[5];
			Place trgSemaphoreFailed = (Place) result2_black[6];
			SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result2_black[7];
			Place trgSemaphoreOperational = (Place) result2_black[8];
			SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result2_black[9];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[10];
			Place trgRouteFailed = (Place) result2_black[11];
			Place trgRouteOperational = (Place) result2_black[14];
			// ForEach 
			for (Object[] result3_black : RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_2_3_findcontext_blackBBBBBBBBBBBBBBB(routeRepairCorr, trgPetrinet,
							routeOperationalCorr, routeFailedCorr, srcContainer, trgRouteRepair, trgSemaphoreFailed,
							semaphoreOperationalCorr, trgSemaphoreOperational, semaphoreFailedCorr, containerCorr,
							trgRouteFailed, srcSemaphore, srcRoute, trgRouteOperational)) {
				Object[] result3_green = RequiredEntrySemaphoreImpl
						.pattern_RequiredEntrySemaphore_2_3_findcontext_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
								routeRepairCorr, trgPetrinet, routeOperationalCorr, routeFailedCorr, srcContainer,
								trgRouteRepair, trgSemaphoreFailed, semaphoreOperationalCorr, trgSemaphoreOperational,
								semaphoreFailedCorr, containerCorr, trgRouteFailed, srcSemaphore, srcRoute,
								trgRouteOperational);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[15];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge routeRepairCorr__trgRouteRepair____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge semaphoreFailedCorr__trgSemaphoreFailed____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge semaphoreOperationalCorr__trgSemaphoreOperational____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge srcRoute__srcSemaphore____entry = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge semaphoreOperationalCorr__srcSemaphore____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge semaphoreFailedCorr__srcSemaphore____source = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge routeFailedCorr__trgRouteFailed____target = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge routeOperationalCorr__trgRouteOperational____target = (EMoflonEdge) result3_green[29];

				Object[] result4_bindingAndBlack = RequiredEntrySemaphoreImpl
						.pattern_RequiredEntrySemaphore_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(this,
								isApplicableMatch, routeRepairCorr, trgPetrinet, routeOperationalCorr, routeFailedCorr,
								srcContainer, trgRouteRepair, trgSemaphoreFailed, semaphoreOperationalCorr,
								trgSemaphoreOperational, semaphoreFailedCorr, containerCorr, trgRouteFailed,
								srcSemaphore, srcRoute, trgRouteOperational);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[routeRepairCorr] = "
							+ routeRepairCorr + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
							+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[routeFailedCorr] = "
							+ routeFailedCorr + ", " + "[srcContainer] = " + srcContainer + ", " + "[trgRouteRepair] = "
							+ trgRouteRepair + ", " + "[trgSemaphoreFailed] = " + trgSemaphoreFailed + ", "
							+ "[semaphoreOperationalCorr] = " + semaphoreOperationalCorr + ", "
							+ "[trgSemaphoreOperational] = " + trgSemaphoreOperational + ", "
							+ "[semaphoreFailedCorr] = " + semaphoreFailedCorr + ", " + "[containerCorr] = "
							+ containerCorr + ", " + "[trgRouteFailed] = " + trgRouteFailed + ", " + "[srcSemaphore] = "
							+ srcSemaphore + ", " + "[srcRoute] = " + srcRoute + ", " + "[trgRouteOperational] = "
							+ trgRouteOperational + ".");
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
	public void registerObjectsToMatch_FWD(Match match, RailwayContainer srcContainer, Semaphore srcSemaphore,
			Route srcRoute) {
		match.registerObject("srcContainer", srcContainer);
		match.registerObject("srcSemaphore", srcSemaphore);
		match.registerObject("srcRoute", srcRoute);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, RailwayContainer srcContainer, Semaphore srcSemaphore,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, RouteToRepair routeRepairCorr,
			PetriNet trgPetrinet, RouteToOperational routeOperationalCorr, RouteToFailed routeFailedCorr,
			RailwayContainer srcContainer, Transition trgRouteRepair, Place trgSemaphoreFailed,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational,
			SemaphoreToFailed semaphoreFailedCorr, RailwayContainerToPetriNet containerCorr, Place trgRouteFailed,
			Semaphore srcSemaphore, Route srcRoute, Place trgRouteOperational) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("routeRepairCorr", routeRepairCorr);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("routeOperationalCorr", routeOperationalCorr);
		isApplicableMatch.registerObject("routeFailedCorr", routeFailedCorr);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("trgRouteRepair", trgRouteRepair);
		isApplicableMatch.registerObject("trgSemaphoreFailed", trgSemaphoreFailed);
		isApplicableMatch.registerObject("semaphoreOperationalCorr", semaphoreOperationalCorr);
		isApplicableMatch.registerObject("trgSemaphoreOperational", trgSemaphoreOperational);
		isApplicableMatch.registerObject("semaphoreFailedCorr", semaphoreFailedCorr);
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("trgRouteFailed", trgRouteFailed);
		isApplicableMatch.registerObject("srcSemaphore", srcSemaphore);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("trgRouteOperational", trgRouteOperational);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgRouteRepairToSemaphoreOperational,
			EObject routeRepairCorr, EObject trgPetrinet, EObject routeOperationalCorr, EObject routeFailedCorr,
			EObject trgRouteOperationalToRouteFail, EObject srcContainer, EObject trgSemaphoreOperationalToRouteRepair,
			EObject trgRouteRepair, EObject trgSemaphoreFailed, EObject trgRouteFailToSemaphoreFailed,
			EObject semaphoreOperationalCorr, EObject trgSemaphoreOperational, EObject semaphoreFailedCorr,
			EObject trgSemaphoreFailedToRouteFail, EObject containerCorr, EObject trgRouteFailToRouteFailed,
			EObject trgRouteFail, EObject trgRouteFailed, EObject srcSemaphore, EObject srcRoute,
			EObject trgRouteOperational) {
		ruleresult.registerObject("trgRouteRepairToSemaphoreOperational", trgRouteRepairToSemaphoreOperational);
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("trgRouteOperationalToRouteFail", trgRouteOperationalToRouteFail);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgSemaphoreOperationalToRouteRepair", trgSemaphoreOperationalToRouteRepair);
		ruleresult.registerObject("trgRouteRepair", trgRouteRepair);
		ruleresult.registerObject("trgSemaphoreFailed", trgSemaphoreFailed);
		ruleresult.registerObject("trgRouteFailToSemaphoreFailed", trgRouteFailToSemaphoreFailed);
		ruleresult.registerObject("semaphoreOperationalCorr", semaphoreOperationalCorr);
		ruleresult.registerObject("trgSemaphoreOperational", trgSemaphoreOperational);
		ruleresult.registerObject("semaphoreFailedCorr", semaphoreFailedCorr);
		ruleresult.registerObject("trgSemaphoreFailedToRouteFail", trgSemaphoreFailedToRouteFail);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("trgRouteFailToRouteFailed", trgRouteFailToRouteFailed);
		ruleresult.registerObject("trgRouteFail", trgRouteFail);
		ruleresult.registerObject("trgRouteFailed", trgRouteFailed);
		ruleresult.registerObject("srcSemaphore", srcSemaphore);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("trgRouteOperational", trgRouteOperational);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_22(EMoflonEdge _edge_entry) {

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
			Semaphore srcSemaphore = (Semaphore) result2_black[1];
			Route srcRoute = (Route) result2_black[2];
			Object[] result2_green = RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RequiredEntrySemaphoreImpl
					.pattern_RequiredEntrySemaphore_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, srcContainer, srcSemaphore, srcRoute)) {
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

		if (!__helper.hasExpectedValue("trgRouteRepairToSemaphoreOperational", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteOperationalToRouteFail", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSemaphoreOperationalToRouteRepair", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToSemaphoreFailed", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSemaphoreFailedToRouteFail", "kind", ArcKind.INPUT,
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
	public boolean checkDEC_FWD(RailwayContainer srcContainer, Semaphore srcSemaphore, Route srcRoute) {// 
		Object[] result1_black = RequiredEntrySemaphoreImpl
				.pattern_RequiredEntrySemaphore_13_1_matchtggpattern_blackBBB(srcContainer, srcSemaphore, srcRoute);
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
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER_SEMAPHORE_ROUTE:
			return isAppropriate_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Semaphore) arguments.get(2), (Route) arguments.get(3));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER_SEMAPHORE_ROUTE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Semaphore) arguments.get(2), (Route) arguments.get(3));
			return null;
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER_SEMAPHORE_ROUTE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Semaphore) arguments.get(2), (Route) arguments.get(3));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ROUTETOREPAIR_PETRINET_ROUTETOOPERATIONAL_ROUTETOFAILED_RAILWAYCONTAINER_TRANSITION_PLACE_SEMAPHORETOOPERATIONAL_PLACE_SEMAPHORETOFAILED_RAILWAYCONTAINERTOPETRINET_PLACE_SEMAPHORE_ROUTE_PLACE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (RouteToRepair) arguments.get(1),
					(PetriNet) arguments.get(2), (RouteToOperational) arguments.get(3),
					(RouteToFailed) arguments.get(4), (RailwayContainer) arguments.get(5),
					(Transition) arguments.get(6), (Place) arguments.get(7), (SemaphoreToOperational) arguments.get(8),
					(Place) arguments.get(9), (SemaphoreToFailed) arguments.get(10),
					(RailwayContainerToPetriNet) arguments.get(11), (Place) arguments.get(12),
					(Semaphore) arguments.get(13), (Route) arguments.get(14), (Place) arguments.get(15));
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
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_22((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQUIRED_ENTRY_SEMAPHORE___CHECK_DEC_FWD__RAILWAYCONTAINER_SEMAPHORE_ROUTE:
			return checkDEC_FWD((RailwayContainer) arguments.get(0), (Semaphore) arguments.get(1),
					(Route) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_1_initialbindings_blackBBBBB(
			RequiredEntrySemaphore _this, Match match, RailwayContainer srcContainer, Semaphore srcSemaphore,
			Route srcRoute) {
		return new Object[] { _this, match, srcContainer, srcSemaphore, srcRoute };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_2_SolveCSP_bindingFBBBBB(RequiredEntrySemaphore _this,
			Match match, RailwayContainer srcContainer, Semaphore srcSemaphore, Route srcRoute) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcContainer, srcSemaphore, srcRoute);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcContainer, srcSemaphore, srcRoute };
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_2_SolveCSP_bindingAndBlackFBBBBB(
			RequiredEntrySemaphore _this, Match match, RailwayContainer srcContainer, Semaphore srcSemaphore,
			Route srcRoute) {
		Object[] result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_binding = pattern_RequiredEntrySemaphore_0_2_SolveCSP_bindingFBBBBB(
				_this, match, srcContainer, srcSemaphore, srcRoute);
		if (result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_black = pattern_RequiredEntrySemaphore_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_RequiredEntrySemaphore_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcContainer, srcSemaphore, srcRoute };
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
			RailwayContainer srcContainer, Semaphore srcSemaphore, Route srcRoute) {
		return new Object[] { match, srcContainer, srcSemaphore, srcRoute };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Semaphore srcSemaphore, Route srcRoute) {
		EMoflonEdge srcRoute__srcSemaphore____entry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRoute__srcSemaphore____entry_name_prime = "entry";
		srcRoute__srcSemaphore____entry.setSrc(srcRoute);
		srcRoute__srcSemaphore____entry.setTrg(srcSemaphore);
		match.getToBeTranslatedEdges().add(srcRoute__srcSemaphore____entry);
		srcRoute__srcSemaphore____entry.setName(srcRoute__srcSemaphore____entry_name_prime);
		return new Object[] { match, srcSemaphore, srcRoute, srcRoute__srcSemaphore____entry };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_5_collectcontextelements_blackBBBB(Match match,
			RailwayContainer srcContainer, Semaphore srcSemaphore, Route srcRoute) {
		return new Object[] { match, srcContainer, srcSemaphore, srcRoute };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_0_5_collectcontextelements_greenBBBBF(Match match,
			RailwayContainer srcContainer, Semaphore srcSemaphore, Route srcRoute) {
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcContainer);
		match.getContextNodes().add(srcSemaphore);
		match.getContextNodes().add(srcRoute);
		String srcContainer__srcRoute____routes_name_prime = "routes";
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		match.getContextEdges().add(srcContainer__srcRoute____routes);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { match, srcContainer, srcSemaphore, srcRoute, srcContainer__srcRoute____routes };
	}

	public static final void pattern_RequiredEntrySemaphore_0_6_registerobjectstomatch_expressionBBBBB(
			RequiredEntrySemaphore _this, Match match, RailwayContainer srcContainer, Semaphore srcSemaphore,
			Route srcRoute) {
		_this.registerObjectsToMatch_FWD(match, srcContainer, srcSemaphore, srcRoute);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("routeRepairCorr");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_2 = isApplicableMatch.getObject("routeOperationalCorr");
		EObject _localVariable_3 = isApplicableMatch.getObject("routeFailedCorr");
		EObject _localVariable_4 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("trgRouteRepair");
		EObject _localVariable_6 = isApplicableMatch.getObject("trgSemaphoreFailed");
		EObject _localVariable_7 = isApplicableMatch.getObject("semaphoreOperationalCorr");
		EObject _localVariable_8 = isApplicableMatch.getObject("trgSemaphoreOperational");
		EObject _localVariable_9 = isApplicableMatch.getObject("semaphoreFailedCorr");
		EObject _localVariable_10 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_11 = isApplicableMatch.getObject("trgRouteFailed");
		EObject _localVariable_12 = isApplicableMatch.getObject("srcSemaphore");
		EObject _localVariable_13 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_14 = isApplicableMatch.getObject("trgRouteOperational");
		EObject tmpRouteRepairCorr = _localVariable_0;
		EObject tmpTrgPetrinet = _localVariable_1;
		EObject tmpRouteOperationalCorr = _localVariable_2;
		EObject tmpRouteFailedCorr = _localVariable_3;
		EObject tmpSrcContainer = _localVariable_4;
		EObject tmpTrgRouteRepair = _localVariable_5;
		EObject tmpTrgSemaphoreFailed = _localVariable_6;
		EObject tmpSemaphoreOperationalCorr = _localVariable_7;
		EObject tmpTrgSemaphoreOperational = _localVariable_8;
		EObject tmpSemaphoreFailedCorr = _localVariable_9;
		EObject tmpContainerCorr = _localVariable_10;
		EObject tmpTrgRouteFailed = _localVariable_11;
		EObject tmpSrcSemaphore = _localVariable_12;
		EObject tmpSrcRoute = _localVariable_13;
		EObject tmpTrgRouteOperational = _localVariable_14;
		if (tmpRouteRepairCorr instanceof RouteToRepair) {
			RouteToRepair routeRepairCorr = (RouteToRepair) tmpRouteRepairCorr;
			if (tmpTrgPetrinet instanceof PetriNet) {
				PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
				if (tmpRouteOperationalCorr instanceof RouteToOperational) {
					RouteToOperational routeOperationalCorr = (RouteToOperational) tmpRouteOperationalCorr;
					if (tmpRouteFailedCorr instanceof RouteToFailed) {
						RouteToFailed routeFailedCorr = (RouteToFailed) tmpRouteFailedCorr;
						if (tmpSrcContainer instanceof RailwayContainer) {
							RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
							if (tmpTrgRouteRepair instanceof Transition) {
								Transition trgRouteRepair = (Transition) tmpTrgRouteRepair;
								if (tmpTrgSemaphoreFailed instanceof Place) {
									Place trgSemaphoreFailed = (Place) tmpTrgSemaphoreFailed;
									if (tmpSemaphoreOperationalCorr instanceof SemaphoreToOperational) {
										SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) tmpSemaphoreOperationalCorr;
										if (tmpTrgSemaphoreOperational instanceof Place) {
											Place trgSemaphoreOperational = (Place) tmpTrgSemaphoreOperational;
											if (tmpSemaphoreFailedCorr instanceof SemaphoreToFailed) {
												SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) tmpSemaphoreFailedCorr;
												if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
													RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
													if (tmpTrgRouteFailed instanceof Place) {
														Place trgRouteFailed = (Place) tmpTrgRouteFailed;
														if (tmpSrcSemaphore instanceof Semaphore) {
															Semaphore srcSemaphore = (Semaphore) tmpSrcSemaphore;
															if (tmpSrcRoute instanceof Route) {
																Route srcRoute = (Route) tmpSrcRoute;
																if (tmpTrgRouteOperational instanceof Place) {
																	Place trgRouteOperational = (Place) tmpTrgRouteOperational;
																	return new Object[] { routeRepairCorr, trgPetrinet,
																			routeOperationalCorr, routeFailedCorr,
																			srcContainer, trgRouteRepair,
																			trgSemaphoreFailed,
																			semaphoreOperationalCorr,
																			trgSemaphoreOperational,
																			semaphoreFailedCorr, containerCorr,
																			trgRouteFailed, srcSemaphore, srcRoute,
																			trgRouteOperational, isApplicableMatch };
																}
															}
														}
													}
												}
											}
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
			RouteToRepair routeRepairCorr, PetriNet trgPetrinet, RouteToOperational routeOperationalCorr,
			RouteToFailed routeFailedCorr, RailwayContainer srcContainer, Transition trgRouteRepair,
			Place trgSemaphoreFailed, SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational,
			SemaphoreToFailed semaphoreFailedCorr, RailwayContainerToPetriNet containerCorr, Place trgRouteFailed,
			Semaphore srcSemaphore, Route srcRoute, Place trgRouteOperational, RequiredEntrySemaphore _this,
			IsApplicableMatch isApplicableMatch) {
		if (!trgSemaphoreFailed.equals(trgSemaphoreOperational)) {
			if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
				if (!trgRouteFailed.equals(trgSemaphoreOperational)) {
					if (!trgRouteFailed.equals(trgRouteOperational)) {
						if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
							if (!trgRouteOperational.equals(trgSemaphoreOperational)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { routeRepairCorr, trgPetrinet, routeOperationalCorr,
												routeFailedCorr, srcContainer, trgRouteRepair, trgSemaphoreFailed,
												semaphoreOperationalCorr, trgSemaphoreOperational, semaphoreFailedCorr,
												containerCorr, trgRouteFailed, srcSemaphore, srcRoute,
												trgRouteOperational, csp, _this, isApplicableMatch };
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
			RouteToRepair routeRepairCorr = (RouteToRepair) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[0];
			PetriNet trgPetrinet = (PetriNet) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[1];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[2];
			RouteToFailed routeFailedCorr = (RouteToFailed) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[3];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[4];
			Transition trgRouteRepair = (Transition) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[5];
			Place trgSemaphoreFailed = (Place) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[6];
			SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[7];
			Place trgSemaphoreOperational = (Place) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[8];
			SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[9];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[10];
			Place trgRouteFailed = (Place) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[11];
			Semaphore srcSemaphore = (Semaphore) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[12];
			Route srcRoute = (Route) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[13];
			Place trgRouteOperational = (Place) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_binding[14];

			Object[] result_pattern_RequiredEntrySemaphore_1_1_performtransformation_black = pattern_RequiredEntrySemaphore_1_1_performtransformation_blackBBBBBBBBBBBBBBBFBB(
					routeRepairCorr, trgPetrinet, routeOperationalCorr, routeFailedCorr, srcContainer, trgRouteRepair,
					trgSemaphoreFailed, semaphoreOperationalCorr, trgSemaphoreOperational, semaphoreFailedCorr,
					containerCorr, trgRouteFailed, srcSemaphore, srcRoute, trgRouteOperational, _this,
					isApplicableMatch);
			if (result_pattern_RequiredEntrySemaphore_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RequiredEntrySemaphore_1_1_performtransformation_black[15];

				return new Object[] { routeRepairCorr, trgPetrinet, routeOperationalCorr, routeFailedCorr, srcContainer,
						trgRouteRepair, trgSemaphoreFailed, semaphoreOperationalCorr, trgSemaphoreOperational,
						semaphoreFailedCorr, containerCorr, trgRouteFailed, srcSemaphore, srcRoute, trgRouteOperational,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_1_1_performtransformation_greenFBFFBBFBFFFBB(
			PetriNet trgPetrinet, Transition trgRouteRepair, Place trgSemaphoreFailed, Place trgSemaphoreOperational,
			Place trgRouteFailed, Place trgRouteOperational) {
		Arc trgRouteRepairToSemaphoreOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteOperationalToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSemaphoreOperationalToRouteRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToSemaphoreFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSemaphoreFailedToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToRouteFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		ImmediateTransition trgRouteFail = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		ArcKind trgRouteRepairToSemaphoreOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteOperationalToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgSemaphoreOperationalToRouteRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteFailToSemaphoreFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgSemaphoreFailedToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteFailToRouteFailed_kind_prime = ArcKind.OUTPUT;
		trgRouteRepairToSemaphoreOperational.setTransition(trgRouteRepair);
		trgRouteRepairToSemaphoreOperational.setPlace(trgSemaphoreOperational);
		trgRouteOperationalToRouteFail.setPlace(trgRouteOperational);
		trgSemaphoreOperationalToRouteRepair.setTransition(trgRouteRepair);
		trgSemaphoreOperationalToRouteRepair.setPlace(trgSemaphoreOperational);
		trgRouteFailToSemaphoreFailed.setPlace(trgSemaphoreFailed);
		trgSemaphoreFailedToRouteFail.setPlace(trgSemaphoreFailed);
		trgRouteFailToRouteFailed.setPlace(trgRouteFailed);
		trgRouteFailToSemaphoreFailed.setTransition(trgRouteFail);
		trgRouteOperationalToRouteFail.setTransition(trgRouteFail);
		trgRouteFailToRouteFailed.setTransition(trgRouteFail);
		trgRouteFail.setPetriNet(trgPetrinet);
		trgSemaphoreFailedToRouteFail.setTransition(trgRouteFail);
		trgRouteRepairToSemaphoreOperational.setKind(trgRouteRepairToSemaphoreOperational_kind_prime);
		trgRouteOperationalToRouteFail.setKind(trgRouteOperationalToRouteFail_kind_prime);
		trgSemaphoreOperationalToRouteRepair.setKind(trgSemaphoreOperationalToRouteRepair_kind_prime);
		trgRouteFailToSemaphoreFailed.setKind(trgRouteFailToSemaphoreFailed_kind_prime);
		trgSemaphoreFailedToRouteFail.setKind(trgSemaphoreFailedToRouteFail_kind_prime);
		trgRouteFailToRouteFailed.setKind(trgRouteFailToRouteFailed_kind_prime);
		return new Object[] { trgRouteRepairToSemaphoreOperational, trgPetrinet, trgRouteOperationalToRouteFail,
				trgSemaphoreOperationalToRouteRepair, trgRouteRepair, trgSemaphoreFailed, trgRouteFailToSemaphoreFailed,
				trgSemaphoreOperational, trgSemaphoreFailedToRouteFail, trgRouteFailToRouteFailed, trgRouteFail,
				trgRouteFailed, trgRouteOperational };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_1_2_collecttranslatedelements_blackBBBBBBB(
			Arc trgRouteRepairToSemaphoreOperational, Arc trgRouteOperationalToRouteFail,
			Arc trgSemaphoreOperationalToRouteRepair, Arc trgRouteFailToSemaphoreFailed,
			Arc trgSemaphoreFailedToRouteFail, Arc trgRouteFailToRouteFailed, ImmediateTransition trgRouteFail) {
		if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreOperationalToRouteRepair)) {
			if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreFailedToRouteFail)) {
				if (!trgRouteOperationalToRouteFail.equals(trgRouteRepairToSemaphoreOperational)) {
					if (!trgRouteOperationalToRouteFail.equals(trgSemaphoreOperationalToRouteRepair)) {
						if (!trgRouteOperationalToRouteFail.equals(trgSemaphoreFailedToRouteFail)) {
							if (!trgRouteFailToSemaphoreFailed.equals(trgRouteRepairToSemaphoreOperational)) {
								if (!trgRouteFailToSemaphoreFailed.equals(trgRouteOperationalToRouteFail)) {
									if (!trgRouteFailToSemaphoreFailed.equals(trgSemaphoreOperationalToRouteRepair)) {
										if (!trgRouteFailToSemaphoreFailed.equals(trgSemaphoreFailedToRouteFail)) {
											if (!trgSemaphoreFailedToRouteFail
													.equals(trgSemaphoreOperationalToRouteRepair)) {
												if (!trgRouteFailToRouteFailed
														.equals(trgRouteRepairToSemaphoreOperational)) {
													if (!trgRouteFailToRouteFailed
															.equals(trgRouteOperationalToRouteFail)) {
														if (!trgRouteFailToRouteFailed
																.equals(trgSemaphoreOperationalToRouteRepair)) {
															if (!trgRouteFailToRouteFailed
																	.equals(trgRouteFailToSemaphoreFailed)) {
																if (!trgRouteFailToRouteFailed
																		.equals(trgSemaphoreFailedToRouteFail)) {
																	return new Object[] {
																			trgRouteRepairToSemaphoreOperational,
																			trgRouteOperationalToRouteFail,
																			trgSemaphoreOperationalToRouteRepair,
																			trgRouteFailToSemaphoreFailed,
																			trgSemaphoreFailedToRouteFail,
																			trgRouteFailToRouteFailed, trgRouteFail };
																}
															}
														}
													}
												}
											}
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
			Arc trgRouteRepairToSemaphoreOperational, Arc trgRouteOperationalToRouteFail,
			Arc trgSemaphoreOperationalToRouteRepair, Arc trgRouteFailToSemaphoreFailed,
			Arc trgSemaphoreFailedToRouteFail, Arc trgRouteFailToRouteFailed, ImmediateTransition trgRouteFail) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgRouteRepairToSemaphoreOperational);
		ruleresult.getCreatedElements().add(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedElements().add(trgSemaphoreOperationalToRouteRepair);
		ruleresult.getCreatedElements().add(trgRouteFailToSemaphoreFailed);
		ruleresult.getCreatedElements().add(trgSemaphoreFailedToRouteFail);
		ruleresult.getCreatedElements().add(trgRouteFailToRouteFailed);
		ruleresult.getCreatedElements().add(trgRouteFail);
		return new Object[] { ruleresult, trgRouteRepairToSemaphoreOperational, trgRouteOperationalToRouteFail,
				trgSemaphoreOperationalToRouteRepair, trgRouteFailToSemaphoreFailed, trgSemaphoreFailedToRouteFail,
				trgRouteFailToRouteFailed, trgRouteFail };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject trgRouteRepairToSemaphoreOperational, EObject routeRepairCorr,
			EObject trgPetrinet, EObject routeOperationalCorr, EObject routeFailedCorr,
			EObject trgRouteOperationalToRouteFail, EObject srcContainer, EObject trgSemaphoreOperationalToRouteRepair,
			EObject trgRouteRepair, EObject trgSemaphoreFailed, EObject trgRouteFailToSemaphoreFailed,
			EObject semaphoreOperationalCorr, EObject trgSemaphoreOperational, EObject semaphoreFailedCorr,
			EObject trgSemaphoreFailedToRouteFail, EObject containerCorr, EObject trgRouteFailToRouteFailed,
			EObject trgRouteFail, EObject trgRouteFailed, EObject srcSemaphore, EObject srcRoute,
			EObject trgRouteOperational) {
		if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreOperationalToRouteRepair)) {
			if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreFailed)) {
				if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreOperational)) {
					if (!trgRouteRepairToSemaphoreOperational.equals(trgSemaphoreFailedToRouteFail)) {
						if (!routeRepairCorr.equals(trgRouteRepairToSemaphoreOperational)) {
							if (!routeRepairCorr.equals(trgPetrinet)) {
								if (!routeRepairCorr.equals(trgRouteOperationalToRouteFail)) {
									if (!routeRepairCorr.equals(srcContainer)) {
										if (!routeRepairCorr.equals(trgSemaphoreOperationalToRouteRepair)) {
											if (!routeRepairCorr.equals(trgRouteRepair)) {
												if (!routeRepairCorr.equals(trgSemaphoreFailed)) {
													if (!routeRepairCorr.equals(trgRouteFailToSemaphoreFailed)) {
														if (!routeRepairCorr.equals(semaphoreOperationalCorr)) {
															if (!routeRepairCorr.equals(trgSemaphoreOperational)) {
																if (!routeRepairCorr.equals(semaphoreFailedCorr)) {
																	if (!routeRepairCorr
																			.equals(trgSemaphoreFailedToRouteFail)) {
																		if (!routeRepairCorr
																				.equals(trgRouteFailToRouteFailed)) {
																			if (!routeRepairCorr.equals(trgRouteFail)) {
																				if (!routeRepairCorr
																						.equals(trgRouteFailed)) {
																					if (!routeRepairCorr
																							.equals(srcSemaphore)) {
																						if (!routeRepairCorr
																								.equals(srcRoute)) {
																							if (!routeRepairCorr.equals(
																									trgRouteOperational)) {
																								if (!trgPetrinet.equals(
																										trgRouteRepairToSemaphoreOperational)) {
																									if (!trgPetrinet
																											.equals(trgRouteOperationalToRouteFail)) {
																										if (!trgPetrinet
																												.equals(trgSemaphoreOperationalToRouteRepair)) {
																											if (!trgPetrinet
																													.equals(trgRouteRepair)) {
																												if (!trgPetrinet
																														.equals(trgSemaphoreFailed)) {
																													if (!trgPetrinet
																															.equals(trgRouteFailToSemaphoreFailed)) {
																														if (!trgPetrinet
																																.equals(trgSemaphoreOperational)) {
																															if (!trgPetrinet
																																	.equals(trgSemaphoreFailedToRouteFail)) {
																																if (!trgPetrinet
																																		.equals(trgRouteFailToRouteFailed)) {
																																	if (!trgPetrinet
																																			.equals(trgRouteFail)) {
																																		if (!trgPetrinet
																																				.equals(trgRouteFailed)) {
																																			if (!trgPetrinet
																																					.equals(trgRouteOperational)) {
																																				if (!routeOperationalCorr
																																						.equals(trgRouteRepairToSemaphoreOperational)) {
																																					if (!routeOperationalCorr
																																							.equals(routeRepairCorr)) {
																																						if (!routeOperationalCorr
																																								.equals(trgPetrinet)) {
																																							if (!routeOperationalCorr
																																									.equals(trgRouteOperationalToRouteFail)) {
																																								if (!routeOperationalCorr
																																										.equals(srcContainer)) {
																																									if (!routeOperationalCorr
																																											.equals(trgSemaphoreOperationalToRouteRepair)) {
																																										if (!routeOperationalCorr
																																												.equals(trgRouteRepair)) {
																																											if (!routeOperationalCorr
																																													.equals(trgSemaphoreFailed)) {
																																												if (!routeOperationalCorr
																																														.equals(trgRouteFailToSemaphoreFailed)) {
																																													if (!routeOperationalCorr
																																															.equals(semaphoreOperationalCorr)) {
																																														if (!routeOperationalCorr
																																																.equals(trgSemaphoreOperational)) {
																																															if (!routeOperationalCorr
																																																	.equals(semaphoreFailedCorr)) {
																																																if (!routeOperationalCorr
																																																		.equals(trgSemaphoreFailedToRouteFail)) {
																																																	if (!routeOperationalCorr
																																																			.equals(trgRouteFailToRouteFailed)) {
																																																		if (!routeOperationalCorr
																																																				.equals(trgRouteFail)) {
																																																			if (!routeOperationalCorr
																																																					.equals(trgRouteFailed)) {
																																																				if (!routeOperationalCorr
																																																						.equals(srcSemaphore)) {
																																																					if (!routeOperationalCorr
																																																							.equals(srcRoute)) {
																																																						if (!routeOperationalCorr
																																																								.equals(trgRouteOperational)) {
																																																							if (!routeFailedCorr
																																																									.equals(trgRouteRepairToSemaphoreOperational)) {
																																																								if (!routeFailedCorr
																																																										.equals(routeRepairCorr)) {
																																																									if (!routeFailedCorr
																																																											.equals(trgPetrinet)) {
																																																										if (!routeFailedCorr
																																																												.equals(routeOperationalCorr)) {
																																																											if (!routeFailedCorr
																																																													.equals(trgRouteOperationalToRouteFail)) {
																																																												if (!routeFailedCorr
																																																														.equals(srcContainer)) {
																																																													if (!routeFailedCorr
																																																															.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																														if (!routeFailedCorr
																																																																.equals(trgRouteRepair)) {
																																																															if (!routeFailedCorr
																																																																	.equals(trgSemaphoreFailed)) {
																																																																if (!routeFailedCorr
																																																																		.equals(trgRouteFailToSemaphoreFailed)) {
																																																																	if (!routeFailedCorr
																																																																			.equals(semaphoreOperationalCorr)) {
																																																																		if (!routeFailedCorr
																																																																				.equals(trgSemaphoreOperational)) {
																																																																			if (!routeFailedCorr
																																																																					.equals(semaphoreFailedCorr)) {
																																																																				if (!routeFailedCorr
																																																																						.equals(trgSemaphoreFailedToRouteFail)) {
																																																																					if (!routeFailedCorr
																																																																							.equals(trgRouteFailToRouteFailed)) {
																																																																						if (!routeFailedCorr
																																																																								.equals(trgRouteFail)) {
																																																																							if (!routeFailedCorr
																																																																									.equals(trgRouteFailed)) {
																																																																								if (!routeFailedCorr
																																																																										.equals(srcSemaphore)) {
																																																																									if (!routeFailedCorr
																																																																											.equals(srcRoute)) {
																																																																										if (!routeFailedCorr
																																																																												.equals(trgRouteOperational)) {
																																																																											if (!trgRouteOperationalToRouteFail
																																																																													.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																												if (!trgRouteOperationalToRouteFail
																																																																														.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																													if (!trgRouteOperationalToRouteFail
																																																																															.equals(trgRouteRepair)) {
																																																																														if (!trgRouteOperationalToRouteFail
																																																																																.equals(trgSemaphoreFailed)) {
																																																																															if (!trgRouteOperationalToRouteFail
																																																																																	.equals(trgSemaphoreOperational)) {
																																																																																if (!trgRouteOperationalToRouteFail
																																																																																		.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																	if (!srcContainer
																																																																																			.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																		if (!srcContainer
																																																																																				.equals(trgPetrinet)) {
																																																																																			if (!srcContainer
																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																				if (!srcContainer
																																																																																						.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																					if (!srcContainer
																																																																																							.equals(trgRouteRepair)) {
																																																																																						if (!srcContainer
																																																																																								.equals(trgSemaphoreFailed)) {
																																																																																							if (!srcContainer
																																																																																									.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																								if (!srcContainer
																																																																																										.equals(trgSemaphoreOperational)) {
																																																																																									if (!srcContainer
																																																																																											.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																										if (!srcContainer
																																																																																												.equals(trgRouteFailToRouteFailed)) {
																																																																																											if (!srcContainer
																																																																																													.equals(trgRouteFail)) {
																																																																																												if (!srcContainer
																																																																																														.equals(trgRouteFailed)) {
																																																																																													if (!srcContainer
																																																																																															.equals(srcSemaphore)) {
																																																																																														if (!srcContainer
																																																																																																.equals(srcRoute)) {
																																																																																															if (!srcContainer
																																																																																																	.equals(trgRouteOperational)) {
																																																																																																if (!trgRouteRepair
																																																																																																		.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																	if (!trgRouteRepair
																																																																																																			.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																		if (!trgRouteRepair
																																																																																																				.equals(trgSemaphoreFailed)) {
																																																																																																			if (!trgRouteRepair
																																																																																																					.equals(trgSemaphoreOperational)) {
																																																																																																				if (!trgRouteRepair
																																																																																																						.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																					if (!trgSemaphoreFailed
																																																																																																							.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																						if (!trgSemaphoreFailed
																																																																																																								.equals(trgSemaphoreOperational)) {
																																																																																																							if (!trgSemaphoreFailed
																																																																																																									.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																								if (!trgRouteFailToSemaphoreFailed
																																																																																																										.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																									if (!trgRouteFailToSemaphoreFailed
																																																																																																											.equals(trgRouteOperationalToRouteFail)) {
																																																																																																										if (!trgRouteFailToSemaphoreFailed
																																																																																																												.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																											if (!trgRouteFailToSemaphoreFailed
																																																																																																													.equals(trgRouteRepair)) {
																																																																																																												if (!trgRouteFailToSemaphoreFailed
																																																																																																														.equals(trgSemaphoreFailed)) {
																																																																																																													if (!trgRouteFailToSemaphoreFailed
																																																																																																															.equals(trgSemaphoreOperational)) {
																																																																																																														if (!trgRouteFailToSemaphoreFailed
																																																																																																																.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																															if (!trgRouteFailToSemaphoreFailed
																																																																																																																	.equals(trgRouteFailed)) {
																																																																																																																if (!trgRouteFailToSemaphoreFailed
																																																																																																																		.equals(trgRouteOperational)) {
																																																																																																																	if (!semaphoreOperationalCorr
																																																																																																																			.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																		if (!semaphoreOperationalCorr
																																																																																																																				.equals(trgPetrinet)) {
																																																																																																																			if (!semaphoreOperationalCorr
																																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																				if (!semaphoreOperationalCorr
																																																																																																																						.equals(srcContainer)) {
																																																																																																																					if (!semaphoreOperationalCorr
																																																																																																																							.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																						if (!semaphoreOperationalCorr
																																																																																																																								.equals(trgRouteRepair)) {
																																																																																																																							if (!semaphoreOperationalCorr
																																																																																																																									.equals(trgSemaphoreFailed)) {
																																																																																																																								if (!semaphoreOperationalCorr
																																																																																																																										.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																									if (!semaphoreOperationalCorr
																																																																																																																											.equals(trgSemaphoreOperational)) {
																																																																																																																										if (!semaphoreOperationalCorr
																																																																																																																												.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																											if (!semaphoreOperationalCorr
																																																																																																																													.equals(trgRouteFailToRouteFailed)) {
																																																																																																																												if (!semaphoreOperationalCorr
																																																																																																																														.equals(trgRouteFail)) {
																																																																																																																													if (!semaphoreOperationalCorr
																																																																																																																															.equals(trgRouteFailed)) {
																																																																																																																														if (!semaphoreOperationalCorr
																																																																																																																																.equals(srcSemaphore)) {
																																																																																																																															if (!semaphoreOperationalCorr
																																																																																																																																	.equals(srcRoute)) {
																																																																																																																																if (!semaphoreOperationalCorr
																																																																																																																																		.equals(trgRouteOperational)) {
																																																																																																																																	if (!trgSemaphoreOperational
																																																																																																																																			.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																		if (!semaphoreFailedCorr
																																																																																																																																				.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																			if (!semaphoreFailedCorr
																																																																																																																																					.equals(trgPetrinet)) {
																																																																																																																																				if (!semaphoreFailedCorr
																																																																																																																																						.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																					if (!semaphoreFailedCorr
																																																																																																																																							.equals(srcContainer)) {
																																																																																																																																						if (!semaphoreFailedCorr
																																																																																																																																								.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																							if (!semaphoreFailedCorr
																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																								if (!semaphoreFailedCorr
																																																																																																																																										.equals(trgSemaphoreFailed)) {
																																																																																																																																									if (!semaphoreFailedCorr
																																																																																																																																											.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																										if (!semaphoreFailedCorr
																																																																																																																																												.equals(semaphoreOperationalCorr)) {
																																																																																																																																											if (!semaphoreFailedCorr
																																																																																																																																													.equals(trgSemaphoreOperational)) {
																																																																																																																																												if (!semaphoreFailedCorr
																																																																																																																																														.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																													if (!semaphoreFailedCorr
																																																																																																																																															.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																														if (!semaphoreFailedCorr
																																																																																																																																																.equals(trgRouteFail)) {
																																																																																																																																															if (!semaphoreFailedCorr
																																																																																																																																																	.equals(trgRouteFailed)) {
																																																																																																																																																if (!semaphoreFailedCorr
																																																																																																																																																		.equals(srcSemaphore)) {
																																																																																																																																																	if (!semaphoreFailedCorr
																																																																																																																																																			.equals(srcRoute)) {
																																																																																																																																																		if (!semaphoreFailedCorr
																																																																																																																																																				.equals(trgRouteOperational)) {
																																																																																																																																																			if (!trgSemaphoreFailedToRouteFail
																																																																																																																																																					.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																				if (!trgSemaphoreFailedToRouteFail
																																																																																																																																																						.equals(trgSemaphoreOperational)) {
																																																																																																																																																					if (!containerCorr
																																																																																																																																																							.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																						if (!containerCorr
																																																																																																																																																								.equals(routeRepairCorr)) {
																																																																																																																																																							if (!containerCorr
																																																																																																																																																									.equals(trgPetrinet)) {
																																																																																																																																																								if (!containerCorr
																																																																																																																																																										.equals(routeOperationalCorr)) {
																																																																																																																																																									if (!containerCorr
																																																																																																																																																											.equals(routeFailedCorr)) {
																																																																																																																																																										if (!containerCorr
																																																																																																																																																												.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																											if (!containerCorr
																																																																																																																																																													.equals(srcContainer)) {
																																																																																																																																																												if (!containerCorr
																																																																																																																																																														.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																													if (!containerCorr
																																																																																																																																																															.equals(trgRouteRepair)) {
																																																																																																																																																														if (!containerCorr
																																																																																																																																																																.equals(trgSemaphoreFailed)) {
																																																																																																																																																															if (!containerCorr
																																																																																																																																																																	.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																if (!containerCorr
																																																																																																																																																																		.equals(semaphoreOperationalCorr)) {
																																																																																																																																																																	if (!containerCorr
																																																																																																																																																																			.equals(trgSemaphoreOperational)) {
																																																																																																																																																																		if (!containerCorr
																																																																																																																																																																				.equals(semaphoreFailedCorr)) {
																																																																																																																																																																			if (!containerCorr
																																																																																																																																																																					.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																				if (!containerCorr
																																																																																																																																																																						.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																					if (!containerCorr
																																																																																																																																																																							.equals(trgRouteFail)) {
																																																																																																																																																																						if (!containerCorr
																																																																																																																																																																								.equals(trgRouteFailed)) {
																																																																																																																																																																							if (!containerCorr
																																																																																																																																																																									.equals(srcSemaphore)) {
																																																																																																																																																																								if (!containerCorr
																																																																																																																																																																										.equals(srcRoute)) {
																																																																																																																																																																									if (!containerCorr
																																																																																																																																																																											.equals(trgRouteOperational)) {
																																																																																																																																																																										if (!trgRouteFailToRouteFailed
																																																																																																																																																																												.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																											if (!trgRouteFailToRouteFailed
																																																																																																																																																																													.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																												if (!trgRouteFailToRouteFailed
																																																																																																																																																																														.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																													if (!trgRouteFailToRouteFailed
																																																																																																																																																																															.equals(trgRouteRepair)) {
																																																																																																																																																																														if (!trgRouteFailToRouteFailed
																																																																																																																																																																																.equals(trgSemaphoreFailed)) {
																																																																																																																																																																															if (!trgRouteFailToRouteFailed
																																																																																																																																																																																	.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																if (!trgRouteFailToRouteFailed
																																																																																																																																																																																		.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																	if (!trgRouteFailToRouteFailed
																																																																																																																																																																																			.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																		if (!trgRouteFailToRouteFailed
																																																																																																																																																																																				.equals(trgRouteFailed)) {
																																																																																																																																																																																			if (!trgRouteFailToRouteFailed
																																																																																																																																																																																					.equals(trgRouteOperational)) {
																																																																																																																																																																																				if (!trgRouteFail
																																																																																																																																																																																						.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																					if (!trgRouteFail
																																																																																																																																																																																							.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																						if (!trgRouteFail
																																																																																																																																																																																								.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																							if (!trgRouteFail
																																																																																																																																																																																									.equals(trgRouteRepair)) {
																																																																																																																																																																																								if (!trgRouteFail
																																																																																																																																																																																										.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																									if (!trgRouteFail
																																																																																																																																																																																											.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																										if (!trgRouteFail
																																																																																																																																																																																												.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																											if (!trgRouteFail
																																																																																																																																																																																													.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																												if (!trgRouteFail
																																																																																																																																																																																														.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																													if (!trgRouteFail
																																																																																																																																																																																															.equals(trgRouteFailed)) {
																																																																																																																																																																																														if (!trgRouteFail
																																																																																																																																																																																																.equals(trgRouteOperational)) {
																																																																																																																																																																																															if (!trgRouteFailed
																																																																																																																																																																																																	.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																if (!trgRouteFailed
																																																																																																																																																																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																	if (!trgRouteFailed
																																																																																																																																																																																																			.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																		if (!trgRouteFailed
																																																																																																																																																																																																				.equals(trgRouteRepair)) {
																																																																																																																																																																																																			if (!trgRouteFailed
																																																																																																																																																																																																					.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																				if (!trgRouteFailed
																																																																																																																																																																																																						.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																					if (!trgRouteFailed
																																																																																																																																																																																																							.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																						if (!trgRouteFailed
																																																																																																																																																																																																								.equals(trgRouteOperational)) {
																																																																																																																																																																																																							if (!srcSemaphore
																																																																																																																																																																																																									.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																								if (!srcSemaphore
																																																																																																																																																																																																										.equals(trgPetrinet)) {
																																																																																																																																																																																																									if (!srcSemaphore
																																																																																																																																																																																																											.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																										if (!srcSemaphore
																																																																																																																																																																																																												.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																											if (!srcSemaphore
																																																																																																																																																																																																													.equals(trgRouteRepair)) {
																																																																																																																																																																																																												if (!srcSemaphore
																																																																																																																																																																																																														.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																													if (!srcSemaphore
																																																																																																																																																																																																															.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																																														if (!srcSemaphore
																																																																																																																																																																																																																.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																															if (!srcSemaphore
																																																																																																																																																																																																																	.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																																if (!srcSemaphore
																																																																																																																																																																																																																		.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																	if (!srcSemaphore
																																																																																																																																																																																																																			.equals(trgRouteFail)) {
																																																																																																																																																																																																																		if (!srcSemaphore
																																																																																																																																																																																																																				.equals(trgRouteFailed)) {
																																																																																																																																																																																																																			if (!srcSemaphore
																																																																																																																																																																																																																					.equals(trgRouteOperational)) {
																																																																																																																																																																																																																				if (!srcRoute
																																																																																																																																																																																																																						.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																																					if (!srcRoute
																																																																																																																																																																																																																							.equals(trgPetrinet)) {
																																																																																																																																																																																																																						if (!srcRoute
																																																																																																																																																																																																																								.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																							if (!srcRoute
																																																																																																																																																																																																																									.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																																								if (!srcRoute
																																																																																																																																																																																																																										.equals(trgRouteRepair)) {
																																																																																																																																																																																																																									if (!srcRoute
																																																																																																																																																																																																																											.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																																										if (!srcRoute
																																																																																																																																																																																																																												.equals(trgRouteFailToSemaphoreFailed)) {
																																																																																																																																																																																																																											if (!srcRoute
																																																																																																																																																																																																																													.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																																												if (!srcRoute
																																																																																																																																																																																																																														.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																																													if (!srcRoute
																																																																																																																																																																																																																															.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																														if (!srcRoute
																																																																																																																																																																																																																																.equals(trgRouteFail)) {
																																																																																																																																																																																																																															if (!srcRoute
																																																																																																																																																																																																																																	.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																if (!srcRoute
																																																																																																																																																																																																																																		.equals(srcSemaphore)) {
																																																																																																																																																																																																																																	if (!srcRoute
																																																																																																																																																																																																																																			.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																		if (!trgRouteOperational
																																																																																																																																																																																																																																				.equals(trgRouteRepairToSemaphoreOperational)) {
																																																																																																																																																																																																																																			if (!trgRouteOperational
																																																																																																																																																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																				if (!trgRouteOperational
																																																																																																																																																																																																																																						.equals(trgSemaphoreOperationalToRouteRepair)) {
																																																																																																																																																																																																																																					if (!trgRouteOperational
																																																																																																																																																																																																																																							.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																						if (!trgRouteOperational
																																																																																																																																																																																																																																								.equals(trgSemaphoreFailed)) {
																																																																																																																																																																																																																																							if (!trgRouteOperational
																																																																																																																																																																																																																																									.equals(trgSemaphoreOperational)) {
																																																																																																																																																																																																																																								if (!trgRouteOperational
																																																																																																																																																																																																																																										.equals(trgSemaphoreFailedToRouteFail)) {
																																																																																																																																																																																																																																									return new Object[] {
																																																																																																																																																																																																																																											ruleresult,
																																																																																																																																																																																																																																											trgRouteRepairToSemaphoreOperational,
																																																																																																																																																																																																																																											routeRepairCorr,
																																																																																																																																																																																																																																											trgPetrinet,
																																																																																																																																																																																																																																											routeOperationalCorr,
																																																																																																																																																																																																																																											routeFailedCorr,
																																																																																																																																																																																																																																											trgRouteOperationalToRouteFail,
																																																																																																																																																																																																																																											srcContainer,
																																																																																																																																																																																																																																											trgSemaphoreOperationalToRouteRepair,
																																																																																																																																																																																																																																											trgRouteRepair,
																																																																																																																																																																																																																																											trgSemaphoreFailed,
																																																																																																																																																																																																																																											trgRouteFailToSemaphoreFailed,
																																																																																																																																																																																																																																											semaphoreOperationalCorr,
																																																																																																																																																																																																																																											trgSemaphoreOperational,
																																																																																																																																																																																																																																											semaphoreFailedCorr,
																																																																																																																																																																																																																																											trgSemaphoreFailedToRouteFail,
																																																																																																																																																																																																																																											containerCorr,
																																																																																																																																																																																																																																											trgRouteFailToRouteFailed,
																																																																																																																																																																																																																																											trgRouteFail,
																																																																																																																																																																																																																																											trgRouteFailed,
																																																																																																																																																																																																																																											srcSemaphore,
																																																																																																																																																																																																																																											srcRoute,
																																																																																																																																																																																																																																											trgRouteOperational };
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject trgRouteRepairToSemaphoreOperational, EObject trgPetrinet,
			EObject trgRouteOperationalToRouteFail, EObject trgSemaphoreOperationalToRouteRepair,
			EObject trgRouteRepair, EObject trgSemaphoreFailed, EObject trgRouteFailToSemaphoreFailed,
			EObject trgSemaphoreOperational, EObject trgSemaphoreFailedToRouteFail, EObject trgRouteFailToRouteFailed,
			EObject trgRouteFail, EObject trgRouteFailed, EObject srcSemaphore, EObject srcRoute,
			EObject trgRouteOperational) {
		EMoflonEdge trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSemaphoreFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToSemaphoreFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSemaphore____entry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRouteFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSemaphoreFailedToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgSemaphoreFailedToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RequiredEntrySemaphore";
		String trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs_name_prime = "arcs";
		String trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime = "place";
		String trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs_name_prime = "arcs";
		String trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place_name_prime = "place";
		String trgRouteFailToSemaphoreFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToSemaphoreFailed____arcs_name_prime = "arcs";
		String trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime = "arcs";
		String trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place_name_prime = "place";
		String trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place_name_prime = "place";
		String trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime = "arcs";
		String trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime = "place";
		String srcRoute__srcSemaphore____entry_name_prime = "entry";
		String trgRouteFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRouteFail____nodes_name_prime = "nodes";
		String trgSemaphoreFailedToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgSemaphoreFailedToRouteFail____arcs_name_prime = "arcs";
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition.setSrc(trgRouteRepairToSemaphoreOperational);
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs.setTrg(trgRouteRepairToSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setTrg(trgRouteOperational);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteOperational____place);
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition.setSrc(trgSemaphoreOperationalToRouteRepair);
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs.setTrg(trgSemaphoreOperationalToRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place
				.setSrc(trgSemaphoreOperationalToRouteRepair);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place.setTrg(trgSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition.setSrc(trgRouteFailToSemaphoreFailed);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToSemaphoreFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs.setTrg(trgRouteFailToSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToSemaphoreFailed____arcs);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setTrg(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteOperationalToRouteFail____arcs);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place
				.setSrc(trgRouteRepairToSemaphoreOperational);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place.setTrg(trgSemaphoreOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place.setSrc(trgSemaphoreFailedToRouteFail);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place.setTrg(trgSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place.setSrc(trgRouteFailToSemaphoreFailed);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place.setTrg(trgSemaphoreFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setTrg(trgRouteFailToRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToRouteFailed____arcs);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setTrg(trgRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFailed____place);
		srcRoute__srcSemaphore____entry.setSrc(srcRoute);
		srcRoute__srcSemaphore____entry.setTrg(srcSemaphore);
		ruleresult.getTranslatedEdges().add(srcRoute__srcSemaphore____entry);
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
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition
				.setName(trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs
				.setName(trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs_name_prime);
		trgRouteOperationalToRouteFail__trgRouteOperational____place
				.setName(trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime);
		trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition
				.setName(trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs
				.setName(trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs_name_prime);
		trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place
				.setName(trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place_name_prime);
		trgRouteFailToSemaphoreFailed__trgRouteFail____transition
				.setName(trgRouteFailToSemaphoreFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToSemaphoreFailed____arcs
				.setName(trgRouteFail__trgRouteFailToSemaphoreFailed____arcs_name_prime);
		trgRouteOperationalToRouteFail__trgRouteFail____transition
				.setName(trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs
				.setName(trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime);
		trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place
				.setName(trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place_name_prime);
		trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place
				.setName(trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place_name_prime);
		trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place
				.setName(trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFail____transition
				.setName(trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToRouteFailed____arcs
				.setName(trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime);
		trgRouteFailToRouteFailed__trgRouteFailed____place
				.setName(trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime);
		srcRoute__srcSemaphore____entry.setName(srcRoute__srcSemaphore____entry_name_prime);
		trgRouteFail__trgPetrinet____petriNet.setName(trgRouteFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRouteFail____nodes.setName(trgPetrinet__trgRouteFail____nodes_name_prime);
		trgSemaphoreFailedToRouteFail__trgRouteFail____transition
				.setName(trgSemaphoreFailedToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgSemaphoreFailedToRouteFail____arcs
				.setName(trgRouteFail__trgSemaphoreFailedToRouteFail____arcs_name_prime);
		return new Object[] { ruleresult, trgRouteRepairToSemaphoreOperational, trgPetrinet,
				trgRouteOperationalToRouteFail, trgSemaphoreOperationalToRouteRepair, trgRouteRepair,
				trgSemaphoreFailed, trgRouteFailToSemaphoreFailed, trgSemaphoreOperational,
				trgSemaphoreFailedToRouteFail, trgRouteFailToRouteFailed, trgRouteFail, trgRouteFailed, srcSemaphore,
				srcRoute, trgRouteOperational, trgRouteRepairToSemaphoreOperational__trgRouteRepair____transition,
				trgRouteRepair__trgRouteRepairToSemaphoreOperational____arcs,
				trgRouteOperationalToRouteFail__trgRouteOperational____place,
				trgSemaphoreOperationalToRouteRepair__trgRouteRepair____transition,
				trgRouteRepair__trgSemaphoreOperationalToRouteRepair____arcs,
				trgSemaphoreOperationalToRouteRepair__trgSemaphoreOperational____place,
				trgRouteFailToSemaphoreFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToSemaphoreFailed____arcs,
				trgRouteOperationalToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgRouteOperationalToRouteFail____arcs,
				trgRouteRepairToSemaphoreOperational__trgSemaphoreOperational____place,
				trgSemaphoreFailedToRouteFail__trgSemaphoreFailed____place,
				trgRouteFailToSemaphoreFailed__trgSemaphoreFailed____place,
				trgRouteFailToRouteFailed__trgRouteFail____transition, trgRouteFail__trgRouteFailToRouteFailed____arcs,
				trgRouteFailToRouteFailed__trgRouteFailed____place, srcRoute__srcSemaphore____entry,
				trgRouteFail__trgPetrinet____petriNet, trgPetrinet__trgRouteFail____nodes,
				trgSemaphoreFailedToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgSemaphoreFailedToRouteFail____arcs };
	}

	public static final void pattern_RequiredEntrySemaphore_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
			RequiredEntrySemaphore _this, PerformRuleResult ruleresult, EObject trgRouteRepairToSemaphoreOperational,
			EObject routeRepairCorr, EObject trgPetrinet, EObject routeOperationalCorr, EObject routeFailedCorr,
			EObject trgRouteOperationalToRouteFail, EObject srcContainer, EObject trgSemaphoreOperationalToRouteRepair,
			EObject trgRouteRepair, EObject trgSemaphoreFailed, EObject trgRouteFailToSemaphoreFailed,
			EObject semaphoreOperationalCorr, EObject trgSemaphoreOperational, EObject semaphoreFailedCorr,
			EObject trgSemaphoreFailedToRouteFail, EObject containerCorr, EObject trgRouteFailToRouteFailed,
			EObject trgRouteFail, EObject trgRouteFailed, EObject srcSemaphore, EObject srcRoute,
			EObject trgRouteOperational) {
		_this.registerObjects_FWD(ruleresult, trgRouteRepairToSemaphoreOperational, routeRepairCorr, trgPetrinet,
				routeOperationalCorr, routeFailedCorr, trgRouteOperationalToRouteFail, srcContainer,
				trgSemaphoreOperationalToRouteRepair, trgRouteRepair, trgSemaphoreFailed, trgRouteFailToSemaphoreFailed,
				semaphoreOperationalCorr, trgSemaphoreOperational, semaphoreFailedCorr, trgSemaphoreFailedToRouteFail,
				containerCorr, trgRouteFailToRouteFailed, trgRouteFail, trgRouteFailed, srcSemaphore, srcRoute,
				trgRouteOperational);

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
		EObject _localVariable_1 = match.getObject("srcSemaphore");
		EObject _localVariable_2 = match.getObject("srcRoute");
		EObject tmpSrcContainer = _localVariable_0;
		EObject tmpSrcSemaphore = _localVariable_1;
		EObject tmpSrcRoute = _localVariable_2;
		if (tmpSrcContainer instanceof RailwayContainer) {
			RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
			if (tmpSrcSemaphore instanceof Semaphore) {
				Semaphore srcSemaphore = (Semaphore) tmpSrcSemaphore;
				if (tmpSrcRoute instanceof Route) {
					Route srcRoute = (Route) tmpSrcRoute;
					return new Object[] { srcContainer, srcSemaphore, srcRoute, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RequiredEntrySemaphore_2_2_corematch_blackFFFFBFFFFFFFBBFB(
			RailwayContainer srcContainer, Semaphore srcSemaphore, Route srcRoute, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SemaphoreToOperational semaphoreOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcSemaphore, SemaphoreToOperational.class, "source")) {
			Place trgSemaphoreOperational = semaphoreOperationalCorr.getTarget();
			if (trgSemaphoreOperational != null) {
				for (RouteToOperational routeOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcRoute, RouteToOperational.class, "source")) {
					Place trgRouteOperational = routeOperationalCorr.getTarget();
					if (trgRouteOperational != null) {
						if (!trgRouteOperational.equals(trgSemaphoreOperational)) {
							for (SemaphoreToFailed semaphoreFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(srcSemaphore, SemaphoreToFailed.class, "source")) {
								Place trgSemaphoreFailed = semaphoreFailedCorr.getTarget();
								if (trgSemaphoreFailed != null) {
									if (!trgSemaphoreFailed.equals(trgSemaphoreOperational)) {
										if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
											for (RouteToFailed routeFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(srcRoute, RouteToFailed.class,
															"source")) {
												Place trgRouteFailed = routeFailedCorr.getTarget();
												if (trgRouteFailed != null) {
													if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
														if (!trgRouteFailed.equals(trgSemaphoreOperational)) {
															if (!trgRouteFailed.equals(trgRouteOperational)) {
																for (RouteToRepair routeRepairCorr : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(srcRoute,
																				RouteToRepair.class, "source")) {
																	Transition trgRouteRepair = routeRepairCorr
																			.getTarget();
																	if (trgRouteRepair != null) {
																		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(srcContainer,
																						RailwayContainerToPetriNet.class,
																						"source")) {
																			PetriNet trgPetrinet = containerCorr
																					.getTarget();
																			if (trgPetrinet != null) {
																				_result.add(new Object[] {
																						routeRepairCorr, trgPetrinet,
																						routeOperationalCorr,
																						routeFailedCorr, srcContainer,
																						trgRouteRepair,
																						trgSemaphoreFailed,
																						semaphoreOperationalCorr,
																						trgSemaphoreOperational,
																						semaphoreFailedCorr,
																						containerCorr, trgRouteFailed,
																						srcSemaphore, srcRoute,
																						trgRouteOperational, match });
																			}

																		}
																	}

																}
															}
														}
													}
												}

											}
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
			RouteToRepair routeRepairCorr, PetriNet trgPetrinet, RouteToOperational routeOperationalCorr,
			RouteToFailed routeFailedCorr, RailwayContainer srcContainer, Transition trgRouteRepair,
			Place trgSemaphoreFailed, SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational,
			SemaphoreToFailed semaphoreFailedCorr, RailwayContainerToPetriNet containerCorr, Place trgRouteFailed,
			Semaphore srcSemaphore, Route srcRoute, Place trgRouteOperational) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!trgSemaphoreFailed.equals(trgSemaphoreOperational)) {
			if (!trgRouteFailed.equals(trgSemaphoreFailed)) {
				if (!trgRouteFailed.equals(trgSemaphoreOperational)) {
					if (!trgRouteFailed.equals(trgRouteOperational)) {
						if (!trgRouteOperational.equals(trgSemaphoreFailed)) {
							if (!trgRouteOperational.equals(trgSemaphoreOperational)) {
								if (srcContainer.getRoutes().contains(srcRoute)) {
									if (trgRouteRepair.equals(routeRepairCorr.getTarget())) {
										if (trgSemaphoreFailed.equals(semaphoreFailedCorr.getTarget())) {
											if (trgPetrinet.equals(containerCorr.getTarget())) {
												if (trgSemaphoreOperational
														.equals(semaphoreOperationalCorr.getTarget())) {
													if (srcSemaphore.equals(srcRoute.getEntry())) {
														if (srcSemaphore.equals(semaphoreOperationalCorr.getSource())) {
															if (srcRoute.equals(routeOperationalCorr.getSource())) {
																if (srcSemaphore
																		.equals(semaphoreFailedCorr.getSource())) {
																	if (srcRoute.equals(routeFailedCorr.getSource())) {
																		if (srcRoute
																				.equals(routeRepairCorr.getSource())) {
																			if (trgRouteFailed.equals(
																					routeFailedCorr.getTarget())) {
																				if (srcContainer.equals(
																						containerCorr.getSource())) {
																					if (trgRouteOperational
																							.equals(routeOperationalCorr
																									.getTarget())) {
																						_result.add(new Object[] {
																								routeRepairCorr,
																								trgPetrinet,
																								routeOperationalCorr,
																								routeFailedCorr,
																								srcContainer,
																								trgRouteRepair,
																								trgSemaphoreFailed,
																								semaphoreOperationalCorr,
																								trgSemaphoreOperational,
																								semaphoreFailedCorr,
																								containerCorr,
																								trgRouteFailed,
																								srcSemaphore, srcRoute,
																								trgRouteOperational });
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			RouteToRepair routeRepairCorr, PetriNet trgPetrinet, RouteToOperational routeOperationalCorr,
			RouteToFailed routeFailedCorr, RailwayContainer srcContainer, Transition trgRouteRepair,
			Place trgSemaphoreFailed, SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational,
			SemaphoreToFailed semaphoreFailedCorr, RailwayContainerToPetriNet containerCorr, Place trgRouteFailed,
			Semaphore srcSemaphore, Route srcRoute, Place trgRouteOperational) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRouteRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreFailedCorr__trgSemaphoreFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreOperationalCorr__trgSemaphoreOperational____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSemaphore____entry = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreOperationalCorr__srcSemaphore____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreFailedCorr__srcSemaphore____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgRouteFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgRouteOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcContainer__srcRoute____routes_name_prime = "routes";
		String routeRepairCorr__trgRouteRepair____target_name_prime = "target";
		String semaphoreFailedCorr__trgSemaphoreFailed____target_name_prime = "target";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String semaphoreOperationalCorr__trgSemaphoreOperational____target_name_prime = "target";
		String srcRoute__srcSemaphore____entry_name_prime = "entry";
		String semaphoreOperationalCorr__srcSemaphore____source_name_prime = "source";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String semaphoreFailedCorr__srcSemaphore____source_name_prime = "source";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		String routeFailedCorr__trgRouteFailed____target_name_prime = "target";
		String containerCorr__srcContainer____source_name_prime = "source";
		String routeOperationalCorr__trgRouteOperational____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(routeRepairCorr);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(trgSemaphoreFailed);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr);
		isApplicableMatch.getAllContextElements().add(trgSemaphoreOperational);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(trgRouteOperational);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		routeRepairCorr__trgRouteRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRouteRepair____target.setTrg(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__trgRouteRepair____target);
		semaphoreFailedCorr__trgSemaphoreFailed____target.setSrc(semaphoreFailedCorr);
		semaphoreFailedCorr__trgSemaphoreFailed____target.setTrg(trgSemaphoreFailed);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr__trgSemaphoreFailed____target);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		semaphoreOperationalCorr__trgSemaphoreOperational____target.setSrc(semaphoreOperationalCorr);
		semaphoreOperationalCorr__trgSemaphoreOperational____target.setTrg(trgSemaphoreOperational);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr__trgSemaphoreOperational____target);
		srcRoute__srcSemaphore____entry.setSrc(srcRoute);
		srcRoute__srcSemaphore____entry.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(srcRoute__srcSemaphore____entry);
		semaphoreOperationalCorr__srcSemaphore____source.setSrc(semaphoreOperationalCorr);
		semaphoreOperationalCorr__srcSemaphore____source.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(semaphoreOperationalCorr__srcSemaphore____source);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__srcRoute____source);
		semaphoreFailedCorr__srcSemaphore____source.setSrc(semaphoreFailedCorr);
		semaphoreFailedCorr__srcSemaphore____source.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(semaphoreFailedCorr__srcSemaphore____source);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__srcRoute____source);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__srcRoute____source);
		routeFailedCorr__trgRouteFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgRouteFailed____target.setTrg(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__trgRouteFailed____target);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		routeOperationalCorr__trgRouteOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgRouteOperational____target.setTrg(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__trgRouteOperational____target);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		routeRepairCorr__trgRouteRepair____target.setName(routeRepairCorr__trgRouteRepair____target_name_prime);
		semaphoreFailedCorr__trgSemaphoreFailed____target
				.setName(semaphoreFailedCorr__trgSemaphoreFailed____target_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		semaphoreOperationalCorr__trgSemaphoreOperational____target
				.setName(semaphoreOperationalCorr__trgSemaphoreOperational____target_name_prime);
		srcRoute__srcSemaphore____entry.setName(srcRoute__srcSemaphore____entry_name_prime);
		semaphoreOperationalCorr__srcSemaphore____source
				.setName(semaphoreOperationalCorr__srcSemaphore____source_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		semaphoreFailedCorr__srcSemaphore____source.setName(semaphoreFailedCorr__srcSemaphore____source_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		routeFailedCorr__trgRouteFailed____target.setName(routeFailedCorr__trgRouteFailed____target_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		routeOperationalCorr__trgRouteOperational____target
				.setName(routeOperationalCorr__trgRouteOperational____target_name_prime);
		return new Object[] { routeRepairCorr, trgPetrinet, routeOperationalCorr, routeFailedCorr, srcContainer,
				trgRouteRepair, trgSemaphoreFailed, semaphoreOperationalCorr, trgSemaphoreOperational,
				semaphoreFailedCorr, containerCorr, trgRouteFailed, srcSemaphore, srcRoute, trgRouteOperational,
				isApplicableMatch, srcContainer__srcRoute____routes, routeRepairCorr__trgRouteRepair____target,
				semaphoreFailedCorr__trgSemaphoreFailed____target, containerCorr__trgPetrinet____target,
				semaphoreOperationalCorr__trgSemaphoreOperational____target, srcRoute__srcSemaphore____entry,
				semaphoreOperationalCorr__srcSemaphore____source, routeOperationalCorr__srcRoute____source,
				semaphoreFailedCorr__srcSemaphore____source, routeFailedCorr__srcRoute____source,
				routeRepairCorr__srcRoute____source, routeFailedCorr__trgRouteFailed____target,
				containerCorr__srcContainer____source, routeOperationalCorr__trgRouteOperational____target };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
			RequiredEntrySemaphore _this, IsApplicableMatch isApplicableMatch, RouteToRepair routeRepairCorr,
			PetriNet trgPetrinet, RouteToOperational routeOperationalCorr, RouteToFailed routeFailedCorr,
			RailwayContainer srcContainer, Transition trgRouteRepair, Place trgSemaphoreFailed,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational,
			SemaphoreToFailed semaphoreFailedCorr, RailwayContainerToPetriNet containerCorr, Place trgRouteFailed,
			Semaphore srcSemaphore, Route srcRoute, Place trgRouteOperational) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, routeRepairCorr, trgPetrinet,
				routeOperationalCorr, routeFailedCorr, srcContainer, trgRouteRepair, trgSemaphoreFailed,
				semaphoreOperationalCorr, trgSemaphoreOperational, semaphoreFailedCorr, containerCorr, trgRouteFailed,
				srcSemaphore, srcRoute, trgRouteOperational);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, routeRepairCorr, trgPetrinet, routeOperationalCorr,
					routeFailedCorr, srcContainer, trgRouteRepair, trgSemaphoreFailed, semaphoreOperationalCorr,
					trgSemaphoreOperational, semaphoreFailedCorr, containerCorr, trgRouteFailed, srcSemaphore, srcRoute,
					trgRouteOperational };
		}
		return null;
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredEntrySemaphore_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			RequiredEntrySemaphore _this, IsApplicableMatch isApplicableMatch, RouteToRepair routeRepairCorr,
			PetriNet trgPetrinet, RouteToOperational routeOperationalCorr, RouteToFailed routeFailedCorr,
			RailwayContainer srcContainer, Transition trgRouteRepair, Place trgSemaphoreFailed,
			SemaphoreToOperational semaphoreOperationalCorr, Place trgSemaphoreOperational,
			SemaphoreToFailed semaphoreFailedCorr, RailwayContainerToPetriNet containerCorr, Place trgRouteFailed,
			Semaphore srcSemaphore, Route srcRoute, Place trgRouteOperational) {
		Object[] result_pattern_RequiredEntrySemaphore_2_4_solveCSP_binding = pattern_RequiredEntrySemaphore_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, routeRepairCorr, trgPetrinet, routeOperationalCorr, routeFailedCorr,
				srcContainer, trgRouteRepair, trgSemaphoreFailed, semaphoreOperationalCorr, trgSemaphoreOperational,
				semaphoreFailedCorr, containerCorr, trgRouteFailed, srcSemaphore, srcRoute, trgRouteOperational);
		if (result_pattern_RequiredEntrySemaphore_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredEntrySemaphore_2_4_solveCSP_binding[0];

			Object[] result_pattern_RequiredEntrySemaphore_2_4_solveCSP_black = pattern_RequiredEntrySemaphore_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_RequiredEntrySemaphore_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, routeRepairCorr, trgPetrinet, routeOperationalCorr,
						routeFailedCorr, srcContainer, trgRouteRepair, trgSemaphoreFailed, semaphoreOperationalCorr,
						trgSemaphoreOperational, semaphoreFailedCorr, containerCorr, trgRouteFailed, srcSemaphore,
						srcRoute, trgRouteOperational };
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
						_result.add(new Object[] { srcContainer, srcSemaphore, srcRoute, _edge_entry });
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
			RequiredEntrySemaphore _this, Match match, RailwayContainer srcContainer, Semaphore srcSemaphore,
			Route srcRoute) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcContainer, srcSemaphore, srcRoute);
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
			RailwayContainer srcContainer, Semaphore srcSemaphore, Route srcRoute) {
		if (srcContainer.getRoutes().contains(srcRoute)) {
			if (srcSemaphore.equals(srcRoute.getEntry())) {
				return new Object[] { srcContainer, srcSemaphore, srcRoute };
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
