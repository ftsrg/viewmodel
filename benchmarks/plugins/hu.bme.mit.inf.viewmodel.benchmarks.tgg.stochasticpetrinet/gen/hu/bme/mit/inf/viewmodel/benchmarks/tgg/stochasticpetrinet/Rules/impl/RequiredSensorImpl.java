/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Route;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor;

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

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RequiredSensor;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational;

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
 * An implementation of the model object '<em><b>Required Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RequiredSensorImpl extends AbstractRuleImpl implements RequiredSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getRequiredSensor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {

		Object[] result1_black = RequiredSensorImpl.pattern_RequiredSensor_0_1_initialbindings_blackBBBBB(this, match,
				srcSensor, srcRoute, srcContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSensor] = " + srcSensor + ", " + "[srcRoute] = " + srcRoute
					+ ", " + "[srcContainer] = " + srcContainer + ".");
		}

		Object[] result2_bindingAndBlack = RequiredSensorImpl.pattern_RequiredSensor_0_2_SolveCSP_bindingAndBlackFBBBBB(
				this, match, srcSensor, srcRoute, srcContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSensor] = " + srcSensor + ", " + "[srcRoute] = " + srcRoute
					+ ", " + "[srcContainer] = " + srcContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RequiredSensorImpl.pattern_RequiredSensor_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RequiredSensorImpl
					.pattern_RequiredSensor_0_4_collectelementstobetranslated_blackBBBB(match, srcSensor, srcRoute,
							srcContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSensor] = " + srcSensor + ", " + "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = "
						+ srcContainer + ".");
			}
			RequiredSensorImpl.pattern_RequiredSensor_0_4_collectelementstobetranslated_greenBBBF(match, srcSensor,
					srcRoute);
			//nothing EMoflonEdge srcRoute__srcSensor____requires = (EMoflonEdge) result4_green[3];

			Object[] result5_black = RequiredSensorImpl.pattern_RequiredSensor_0_5_collectcontextelements_blackBBBB(
					match, srcSensor, srcRoute, srcContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSensor] = " + srcSensor + ", " + "[srcRoute] = " + srcRoute + ", " + "[srcContainer] = "
						+ srcContainer + ".");
			}
			RequiredSensorImpl.pattern_RequiredSensor_0_5_collectcontextelements_greenBBBBF(match, srcSensor, srcRoute,
					srcContainer);
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result5_green[4];

			// 
			RequiredSensorImpl.pattern_RequiredSensor_0_6_registerobjectstomatch_expressionBBBBB(this, match, srcSensor,
					srcRoute, srcContainer);
			return RequiredSensorImpl.pattern_RequiredSensor_0_7_expressionF();
		} else {
			return RequiredSensorImpl.pattern_RequiredSensor_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = RequiredSensorImpl
				.pattern_RequiredSensor_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[0];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_bindingAndBlack[1];
		Sensor srcSensor = (Sensor) result1_bindingAndBlack[2];
		SensorToFailed sensorFailedCorr = (SensorToFailed) result1_bindingAndBlack[3];
		Transition trgRouteRepair = (Transition) result1_bindingAndBlack[4];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[5];
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_bindingAndBlack[6];
		Route srcRoute = (Route) result1_bindingAndBlack[7];
		Place trgRouteFailed = (Place) result1_bindingAndBlack[8];
		Place trgSensorFailed = (Place) result1_bindingAndBlack[9];
		Place trgSensorOperational = (Place) result1_bindingAndBlack[10];
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_bindingAndBlack[11];
		SensorToOperational sensorOperationalCorr = (SensorToOperational) result1_bindingAndBlack[12];
		Place trgRouteOperational = (Place) result1_bindingAndBlack[13];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[14];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[15];
		Object[] result1_green = RequiredSensorImpl.pattern_RequiredSensor_1_1_performtransformation_greenFFFFBBFBBBBFF(
				trgRouteRepair, trgPetrinet, trgRouteFailed, trgSensorFailed, trgSensorOperational,
				trgRouteOperational);
		Arc trgRouteFailToRouteFailed = (Arc) result1_green[0];
		Arc trgRouteOperationalToRouteFail = (Arc) result1_green[1];
		Arc trgRouteRepairToSensorOperational = (Arc) result1_green[2];
		Arc trgSensorFailedToRouteFail = (Arc) result1_green[3];
		Arc trgSensorOperationalToRouteRepair = (Arc) result1_green[6];
		Arc trgRouteFailToSensorFailed = (Arc) result1_green[11];
		ImmediateTransition trgRouteFail = (ImmediateTransition) result1_green[12];

		Object[] result2_black = RequiredSensorImpl.pattern_RequiredSensor_1_2_collecttranslatedelements_blackBBBBBBB(
				trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail, trgRouteRepairToSensorOperational,
				trgSensorFailedToRouteFail, trgSensorOperationalToRouteRepair, trgRouteFailToSensorFailed,
				trgRouteFail);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[trgRouteFailToRouteFailed] = "
					+ trgRouteFailToRouteFailed + ", " + "[trgRouteOperationalToRouteFail] = "
					+ trgRouteOperationalToRouteFail + ", " + "[trgRouteRepairToSensorOperational] = "
					+ trgRouteRepairToSensorOperational + ", " + "[trgSensorFailedToRouteFail] = "
					+ trgSensorFailedToRouteFail + ", " + "[trgSensorOperationalToRouteRepair] = "
					+ trgSensorOperationalToRouteRepair + ", " + "[trgRouteFailToSensorFailed] = "
					+ trgRouteFailToSensorFailed + ", " + "[trgRouteFail] = " + trgRouteFail + ".");
		}
		Object[] result2_green = RequiredSensorImpl.pattern_RequiredSensor_1_2_collecttranslatedelements_greenFBBBBBBB(
				trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail, trgRouteRepairToSensorOperational,
				trgSensorFailedToRouteFail, trgSensorOperationalToRouteRepair, trgRouteFailToSensorFailed,
				trgRouteFail);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RequiredSensorImpl
				.pattern_RequiredSensor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(ruleresult, containerCorr,
						trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail, trgRouteRepairToSensorOperational,
						trgSensorFailedToRouteFail, routeFailedCorr, srcSensor, sensorFailedCorr, trgRouteRepair,
						trgPetrinet, trgSensorOperationalToRouteRepair, routeOperationalCorr, srcRoute, trgRouteFailed,
						trgSensorFailed, trgSensorOperational, routeRepairCorr, sensorOperationalCorr,
						trgRouteOperational, srcContainer, trgRouteFailToSensorFailed, trgRouteFail);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[containerCorr] = " + containerCorr + ", " + "[trgRouteFailToRouteFailed] = "
					+ trgRouteFailToRouteFailed + ", " + "[trgRouteOperationalToRouteFail] = "
					+ trgRouteOperationalToRouteFail + ", " + "[trgRouteRepairToSensorOperational] = "
					+ trgRouteRepairToSensorOperational + ", " + "[trgSensorFailedToRouteFail] = "
					+ trgSensorFailedToRouteFail + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", "
					+ "[srcSensor] = " + srcSensor + ", " + "[sensorFailedCorr] = " + sensorFailedCorr + ", "
					+ "[trgRouteRepair] = " + trgRouteRepair + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
					+ "[trgSensorOperationalToRouteRepair] = " + trgSensorOperationalToRouteRepair + ", "
					+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[srcRoute] = " + srcRoute + ", "
					+ "[trgRouteFailed] = " + trgRouteFailed + ", " + "[trgSensorFailed] = " + trgSensorFailed + ", "
					+ "[trgSensorOperational] = " + trgSensorOperational + ", " + "[routeRepairCorr] = "
					+ routeRepairCorr + ", " + "[sensorOperationalCorr] = " + sensorOperationalCorr + ", "
					+ "[trgRouteOperational] = " + trgRouteOperational + ", " + "[srcContainer] = " + srcContainer
					+ ", " + "[trgRouteFailToSensorFailed] = " + trgRouteFailToSensorFailed + ", " + "[trgRouteFail] = "
					+ trgRouteFail + ".");
		}
		RequiredSensorImpl.pattern_RequiredSensor_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
				ruleresult, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail,
				trgRouteRepairToSensorOperational, trgSensorFailedToRouteFail, srcSensor, trgRouteRepair, trgPetrinet,
				trgSensorOperationalToRouteRepair, srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational,
				trgRouteOperational, trgRouteFailToSensorFailed, trgRouteFail);
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgSensorFailedToRouteFail__trgSensorFailed____place = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgSensorFailedToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgRouteFail__trgSensorFailedToRouteFail____arcs = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgRouteRepairToSensorOperational__trgSensorOperational____place = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgRouteRepairToSensorOperational__trgRouteRepair____transition = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgRouteRepair__trgRouteRepairToSensorOperational____arcs = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgSensorOperationalToRouteRepair__trgRouteRepair____transition = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRouteRepair__trgSensorOperationalToRouteRepair____arcs = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge srcRoute__srcSensor____requires = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgRouteFailToSensorFailed__trgSensorFailed____place = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgRouteFailToSensorFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToSensorFailed____arcs = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgSensorOperationalToRouteRepair__trgSensorOperational____place = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgRouteFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgPetrinet__trgRouteFail____nodes = (EMoflonEdge) result3_green[36];

		// 
		// 
		RequiredSensorImpl.pattern_RequiredSensor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(this,
				ruleresult, containerCorr, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail,
				trgRouteRepairToSensorOperational, trgSensorFailedToRouteFail, routeFailedCorr, srcSensor,
				sensorFailedCorr, trgRouteRepair, trgPetrinet, trgSensorOperationalToRouteRepair, routeOperationalCorr,
				srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational, routeRepairCorr, sensorOperationalCorr,
				trgRouteOperational, srcContainer, trgRouteFailToSensorFailed, trgRouteFail);
		return RequiredSensorImpl.pattern_RequiredSensor_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = RequiredSensorImpl
				.pattern_RequiredSensor_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = RequiredSensorImpl
				.pattern_RequiredSensor_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = RequiredSensorImpl.pattern_RequiredSensor_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Sensor srcSensor = (Sensor) result2_binding[0];
		Route srcRoute = (Route) result2_binding[1];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[2];
		for (Object[] result2_black : RequiredSensorImpl
				.pattern_RequiredSensor_2_2_corematch_blackFFBFFFFBFFFFFFBB(srcSensor, srcRoute, srcContainer, match)) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[0];
			RouteToFailed routeFailedCorr = (RouteToFailed) result2_black[1];
			SensorToFailed sensorFailedCorr = (SensorToFailed) result2_black[3];
			Transition trgRouteRepair = (Transition) result2_black[4];
			PetriNet trgPetrinet = (PetriNet) result2_black[5];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result2_black[6];
			Place trgRouteFailed = (Place) result2_black[8];
			Place trgSensorFailed = (Place) result2_black[9];
			Place trgSensorOperational = (Place) result2_black[10];
			RouteToRepair routeRepairCorr = (RouteToRepair) result2_black[11];
			SensorToOperational sensorOperationalCorr = (SensorToOperational) result2_black[12];
			Place trgRouteOperational = (Place) result2_black[13];
			// ForEach 
			for (Object[] result3_black : RequiredSensorImpl
					.pattern_RequiredSensor_2_3_findcontext_blackBBBBBBBBBBBBBBB(containerCorr, routeFailedCorr,
							srcSensor, sensorFailedCorr, trgRouteRepair, trgPetrinet, routeOperationalCorr, srcRoute,
							trgRouteFailed, trgSensorFailed, trgSensorOperational, routeRepairCorr,
							sensorOperationalCorr, trgRouteOperational, srcContainer)) {
				Object[] result3_green = RequiredSensorImpl
						.pattern_RequiredSensor_2_3_findcontext_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(containerCorr,
								routeFailedCorr, srcSensor, sensorFailedCorr, trgRouteRepair, trgPetrinet,
								routeOperationalCorr, srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational,
								routeRepairCorr, sensorOperationalCorr, trgRouteOperational, srcContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[15];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge sensorFailedCorr__srcSensor____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge srcRoute__srcSensor____requires = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge routeFailedCorr__trgRouteFailed____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge sensorOperationalCorr__srcSensor____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge routeOperationalCorr__trgRouteOperational____target = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge sensorOperationalCorr__trgSensorOperational____target = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge routeRepairCorr__trgRouteRepair____target = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge sensorFailedCorr__trgSensorFailed____target = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[29];

				Object[] result4_bindingAndBlack = RequiredSensorImpl
						.pattern_RequiredSensor_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(this, isApplicableMatch,
								containerCorr, routeFailedCorr, srcSensor, sensorFailedCorr, trgRouteRepair,
								trgPetrinet, routeOperationalCorr, srcRoute, trgRouteFailed, trgSensorFailed,
								trgSensorOperational, routeRepairCorr, sensorOperationalCorr, trgRouteOperational,
								srcContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[containerCorr] = " + containerCorr
							+ ", " + "[routeFailedCorr] = " + routeFailedCorr + ", " + "[srcSensor] = " + srcSensor
							+ ", " + "[sensorFailedCorr] = " + sensorFailedCorr + ", " + "[trgRouteRepair] = "
							+ trgRouteRepair + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
							+ "[routeOperationalCorr] = " + routeOperationalCorr + ", " + "[srcRoute] = " + srcRoute
							+ ", " + "[trgRouteFailed] = " + trgRouteFailed + ", " + "[trgSensorFailed] = "
							+ trgSensorFailed + ", " + "[trgSensorOperational] = " + trgSensorOperational + ", "
							+ "[routeRepairCorr] = " + routeRepairCorr + ", " + "[sensorOperationalCorr] = "
							+ sensorOperationalCorr + ", " + "[trgRouteOperational] = " + trgRouteOperational + ", "
							+ "[srcContainer] = " + srcContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (RequiredSensorImpl.pattern_RequiredSensor_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = RequiredSensorImpl
							.pattern_RequiredSensor_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					RequiredSensorImpl.pattern_RequiredSensor_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return RequiredSensorImpl.pattern_RequiredSensor_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Sensor srcSensor, Route srcRoute,
			RailwayContainer srcContainer) {
		match.registerObject("srcSensor", srcSensor);
		match.registerObject("srcRoute", srcRoute);
		match.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Sensor srcSensor, Route srcRoute,
			RailwayContainer srcContainer) {// Create CSP
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
			RouteToFailed routeFailedCorr, Sensor srcSensor, SensorToFailed sensorFailedCorr, Transition trgRouteRepair,
			PetriNet trgPetrinet, RouteToOperational routeOperationalCorr, Route srcRoute, Place trgRouteFailed,
			Place trgSensorFailed, Place trgSensorOperational, RouteToRepair routeRepairCorr,
			SensorToOperational sensorOperationalCorr, Place trgRouteOperational, RailwayContainer srcContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("routeFailedCorr", routeFailedCorr);
		isApplicableMatch.registerObject("srcSensor", srcSensor);
		isApplicableMatch.registerObject("sensorFailedCorr", sensorFailedCorr);
		isApplicableMatch.registerObject("trgRouteRepair", trgRouteRepair);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("routeOperationalCorr", routeOperationalCorr);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("trgRouteFailed", trgRouteFailed);
		isApplicableMatch.registerObject("trgSensorFailed", trgSensorFailed);
		isApplicableMatch.registerObject("trgSensorOperational", trgSensorOperational);
		isApplicableMatch.registerObject("routeRepairCorr", routeRepairCorr);
		isApplicableMatch.registerObject("sensorOperationalCorr", sensorOperationalCorr);
		isApplicableMatch.registerObject("trgRouteOperational", trgRouteOperational);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject containerCorr,
			EObject trgRouteFailToRouteFailed, EObject trgRouteOperationalToRouteFail,
			EObject trgRouteRepairToSensorOperational, EObject trgSensorFailedToRouteFail, EObject routeFailedCorr,
			EObject srcSensor, EObject sensorFailedCorr, EObject trgRouteRepair, EObject trgPetrinet,
			EObject trgSensorOperationalToRouteRepair, EObject routeOperationalCorr, EObject srcRoute,
			EObject trgRouteFailed, EObject trgSensorFailed, EObject trgSensorOperational, EObject routeRepairCorr,
			EObject sensorOperationalCorr, EObject trgRouteOperational, EObject srcContainer,
			EObject trgRouteFailToSensorFailed, EObject trgRouteFail) {
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("trgRouteFailToRouteFailed", trgRouteFailToRouteFailed);
		ruleresult.registerObject("trgRouteOperationalToRouteFail", trgRouteOperationalToRouteFail);
		ruleresult.registerObject("trgRouteRepairToSensorOperational", trgRouteRepairToSensorOperational);
		ruleresult.registerObject("trgSensorFailedToRouteFail", trgSensorFailedToRouteFail);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("srcSensor", srcSensor);
		ruleresult.registerObject("sensorFailedCorr", sensorFailedCorr);
		ruleresult.registerObject("trgRouteRepair", trgRouteRepair);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgSensorOperationalToRouteRepair", trgSensorOperationalToRouteRepair);
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("trgRouteFailed", trgRouteFailed);
		ruleresult.registerObject("trgSensorFailed", trgSensorFailed);
		ruleresult.registerObject("trgSensorOperational", trgSensorOperational);
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("sensorOperationalCorr", sensorOperationalCorr);
		ruleresult.registerObject("trgRouteOperational", trgRouteOperational);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgRouteFailToSensorFailed", trgRouteFailToSensorFailed);
		ruleresult.registerObject("trgRouteFail", trgRouteFail);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_196(EMoflonEdge _edge_requires) {

		Object[] result1_bindingAndBlack = RequiredSensorImpl
				.pattern_RequiredSensor_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = RequiredSensorImpl.pattern_RequiredSensor_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : RequiredSensorImpl
				.pattern_RequiredSensor_10_2_testcorematchandDECs_blackFFFB(_edge_requires)) {
			Sensor srcSensor = (Sensor) result2_black[0];
			Route srcRoute = (Route) result2_black[1];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[2];
			Object[] result2_green = RequiredSensorImpl
					.pattern_RequiredSensor_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RequiredSensorImpl
					.pattern_RequiredSensor_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							srcSensor, srcRoute, srcContainer)) {
				// 
				if (RequiredSensorImpl
						.pattern_RequiredSensor_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = RequiredSensorImpl
							.pattern_RequiredSensor_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					RequiredSensorImpl.pattern_RequiredSensor_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return RequiredSensorImpl.pattern_RequiredSensor_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("RequiredSensor");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("trgRouteFailToRouteFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteOperationalToRouteFail", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteRepairToSensorOperational", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSensorFailedToRouteFail", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSensorOperationalToRouteRepair", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToSensorFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
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
	public boolean checkDEC_FWD(Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {// 
		Object[] result1_black = RequiredSensorImpl.pattern_RequiredSensor_13_1_matchtggpattern_blackBBB(srcSensor,
				srcRoute, srcContainer);
		if (result1_black != null) {
			return RequiredSensorImpl.pattern_RequiredSensor_13_2_expressionF();
		} else {
			return RequiredSensorImpl.pattern_RequiredSensor_13_3_expressionF();
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
		case RulesPackage.REQUIRED_SENSOR___IS_APPROPRIATE_FWD__MATCH_SENSOR_ROUTE_RAILWAYCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (Sensor) arguments.get(1), (Route) arguments.get(2),
					(RailwayContainer) arguments.get(3));
		case RulesPackage.REQUIRED_SENSOR___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SENSOR_ROUTE_RAILWAYCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Sensor) arguments.get(1), (Route) arguments.get(2),
					(RailwayContainer) arguments.get(3));
			return null;
		case RulesPackage.REQUIRED_SENSOR___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SENSOR_ROUTE_RAILWAYCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Sensor) arguments.get(1),
					(Route) arguments.get(2), (RailwayContainer) arguments.get(3));
		case RulesPackage.REQUIRED_SENSOR___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINERTOPETRINET_ROUTETOFAILED_SENSOR_SENSORTOFAILED_TRANSITION_PETRINET_ROUTETOOPERATIONAL_ROUTE_PLACE_PLACE_PLACE_ROUTETOREPAIR_SENSORTOOPERATIONAL_PLACE_RAILWAYCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(RailwayContainerToPetriNet) arguments.get(1), (RouteToFailed) arguments.get(2),
					(Sensor) arguments.get(3), (SensorToFailed) arguments.get(4), (Transition) arguments.get(5),
					(PetriNet) arguments.get(6), (RouteToOperational) arguments.get(7), (Route) arguments.get(8),
					(Place) arguments.get(9), (Place) arguments.get(10), (Place) arguments.get(11),
					(RouteToRepair) arguments.get(12), (SensorToOperational) arguments.get(13),
					(Place) arguments.get(14), (RailwayContainer) arguments.get(15));
		case RulesPackage.REQUIRED_SENSOR___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16),
					(EObject) arguments.get(17), (EObject) arguments.get(18), (EObject) arguments.get(19),
					(EObject) arguments.get(20), (EObject) arguments.get(21), (EObject) arguments.get(22));
			return null;
		case RulesPackage.REQUIRED_SENSOR___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___IS_APPROPRIATE_FWD_EMOFLON_EDGE_196__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_196((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQUIRED_SENSOR___CHECK_DEC_FWD__SENSOR_ROUTE_RAILWAYCONTAINER:
			return checkDEC_FWD((Sensor) arguments.get(0), (Route) arguments.get(1),
					(RailwayContainer) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RequiredSensor_0_1_initialbindings_blackBBBBB(RequiredSensor _this,
			Match match, Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {
		return new Object[] { _this, match, srcSensor, srcRoute, srcContainer };
	}

	public static final Object[] pattern_RequiredSensor_0_2_SolveCSP_bindingFBBBBB(RequiredSensor _this, Match match,
			Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSensor, srcRoute, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSensor, srcRoute, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSensor_0_2_SolveCSP_bindingAndBlackFBBBBB(RequiredSensor _this,
			Match match, Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {
		Object[] result_pattern_RequiredSensor_0_2_SolveCSP_binding = pattern_RequiredSensor_0_2_SolveCSP_bindingFBBBBB(
				_this, match, srcSensor, srcRoute, srcContainer);
		if (result_pattern_RequiredSensor_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSensor_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RequiredSensor_0_2_SolveCSP_black = pattern_RequiredSensor_0_2_SolveCSP_blackB(csp);
			if (result_pattern_RequiredSensor_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSensor, srcRoute, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSensor_0_3_CheckCSP_expressionFBB(RequiredSensor _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSensor_0_4_collectelementstobetranslated_blackBBBB(Match match,
			Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {
		return new Object[] { match, srcSensor, srcRoute, srcContainer };
	}

	public static final Object[] pattern_RequiredSensor_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Sensor srcSensor, Route srcRoute) {
		EMoflonEdge srcRoute__srcSensor____requires = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRoute__srcSensor____requires_name_prime = "requires";
		srcRoute__srcSensor____requires.setSrc(srcRoute);
		srcRoute__srcSensor____requires.setTrg(srcSensor);
		match.getToBeTranslatedEdges().add(srcRoute__srcSensor____requires);
		srcRoute__srcSensor____requires.setName(srcRoute__srcSensor____requires_name_prime);
		return new Object[] { match, srcSensor, srcRoute, srcRoute__srcSensor____requires };
	}

	public static final Object[] pattern_RequiredSensor_0_5_collectcontextelements_blackBBBB(Match match,
			Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {
		return new Object[] { match, srcSensor, srcRoute, srcContainer };
	}

	public static final Object[] pattern_RequiredSensor_0_5_collectcontextelements_greenBBBBF(Match match,
			Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcSensor);
		match.getContextNodes().add(srcRoute);
		match.getContextNodes().add(srcContainer);
		String srcContainer__srcRoute____routes_name_prime = "routes";
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		match.getContextEdges().add(srcContainer__srcRoute____routes);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { match, srcSensor, srcRoute, srcContainer, srcContainer__srcRoute____routes };
	}

	public static final void pattern_RequiredSensor_0_6_registerobjectstomatch_expressionBBBBB(RequiredSensor _this,
			Match match, Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {
		_this.registerObjectsToMatch_FWD(match, srcSensor, srcRoute, srcContainer);

	}

	public static final boolean pattern_RequiredSensor_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredSensor_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_RequiredSensor_1_1_performtransformation_bindingFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_1 = isApplicableMatch.getObject("routeFailedCorr");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcSensor");
		EObject _localVariable_3 = isApplicableMatch.getObject("sensorFailedCorr");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgRouteRepair");
		EObject _localVariable_5 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_6 = isApplicableMatch.getObject("routeOperationalCorr");
		EObject _localVariable_7 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_8 = isApplicableMatch.getObject("trgRouteFailed");
		EObject _localVariable_9 = isApplicableMatch.getObject("trgSensorFailed");
		EObject _localVariable_10 = isApplicableMatch.getObject("trgSensorOperational");
		EObject _localVariable_11 = isApplicableMatch.getObject("routeRepairCorr");
		EObject _localVariable_12 = isApplicableMatch.getObject("sensorOperationalCorr");
		EObject _localVariable_13 = isApplicableMatch.getObject("trgRouteOperational");
		EObject _localVariable_14 = isApplicableMatch.getObject("srcContainer");
		EObject tmpContainerCorr = _localVariable_0;
		EObject tmpRouteFailedCorr = _localVariable_1;
		EObject tmpSrcSensor = _localVariable_2;
		EObject tmpSensorFailedCorr = _localVariable_3;
		EObject tmpTrgRouteRepair = _localVariable_4;
		EObject tmpTrgPetrinet = _localVariable_5;
		EObject tmpRouteOperationalCorr = _localVariable_6;
		EObject tmpSrcRoute = _localVariable_7;
		EObject tmpTrgRouteFailed = _localVariable_8;
		EObject tmpTrgSensorFailed = _localVariable_9;
		EObject tmpTrgSensorOperational = _localVariable_10;
		EObject tmpRouteRepairCorr = _localVariable_11;
		EObject tmpSensorOperationalCorr = _localVariable_12;
		EObject tmpTrgRouteOperational = _localVariable_13;
		EObject tmpSrcContainer = _localVariable_14;
		if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
			if (tmpRouteFailedCorr instanceof RouteToFailed) {
				RouteToFailed routeFailedCorr = (RouteToFailed) tmpRouteFailedCorr;
				if (tmpSrcSensor instanceof Sensor) {
					Sensor srcSensor = (Sensor) tmpSrcSensor;
					if (tmpSensorFailedCorr instanceof SensorToFailed) {
						SensorToFailed sensorFailedCorr = (SensorToFailed) tmpSensorFailedCorr;
						if (tmpTrgRouteRepair instanceof Transition) {
							Transition trgRouteRepair = (Transition) tmpTrgRouteRepair;
							if (tmpTrgPetrinet instanceof PetriNet) {
								PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
								if (tmpRouteOperationalCorr instanceof RouteToOperational) {
									RouteToOperational routeOperationalCorr = (RouteToOperational) tmpRouteOperationalCorr;
									if (tmpSrcRoute instanceof Route) {
										Route srcRoute = (Route) tmpSrcRoute;
										if (tmpTrgRouteFailed instanceof Place) {
											Place trgRouteFailed = (Place) tmpTrgRouteFailed;
											if (tmpTrgSensorFailed instanceof Place) {
												Place trgSensorFailed = (Place) tmpTrgSensorFailed;
												if (tmpTrgSensorOperational instanceof Place) {
													Place trgSensorOperational = (Place) tmpTrgSensorOperational;
													if (tmpRouteRepairCorr instanceof RouteToRepair) {
														RouteToRepair routeRepairCorr = (RouteToRepair) tmpRouteRepairCorr;
														if (tmpSensorOperationalCorr instanceof SensorToOperational) {
															SensorToOperational sensorOperationalCorr = (SensorToOperational) tmpSensorOperationalCorr;
															if (tmpTrgRouteOperational instanceof Place) {
																Place trgRouteOperational = (Place) tmpTrgRouteOperational;
																if (tmpSrcContainer instanceof RailwayContainer) {
																	RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
																	return new Object[] { containerCorr,
																			routeFailedCorr, srcSensor,
																			sensorFailedCorr, trgRouteRepair,
																			trgPetrinet, routeOperationalCorr, srcRoute,
																			trgRouteFailed, trgSensorFailed,
																			trgSensorOperational, routeRepairCorr,
																			sensorOperationalCorr, trgRouteOperational,
																			srcContainer, isApplicableMatch };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredSensor_1_1_performtransformation_blackBBBBBBBBBBBBBBBFBB(
			RailwayContainerToPetriNet containerCorr, RouteToFailed routeFailedCorr, Sensor srcSensor,
			SensorToFailed sensorFailedCorr, Transition trgRouteRepair, PetriNet trgPetrinet,
			RouteToOperational routeOperationalCorr, Route srcRoute, Place trgRouteFailed, Place trgSensorFailed,
			Place trgSensorOperational, RouteToRepair routeRepairCorr, SensorToOperational sensorOperationalCorr,
			Place trgRouteOperational, RailwayContainer srcContainer, RequiredSensor _this,
			IsApplicableMatch isApplicableMatch) {
		if (!trgRouteFailed.equals(trgSensorFailed)) {
			if (!trgRouteFailed.equals(trgSensorOperational)) {
				if (!trgRouteFailed.equals(trgRouteOperational)) {
					if (!trgSensorFailed.equals(trgSensorOperational)) {
						if (!trgRouteOperational.equals(trgSensorFailed)) {
							if (!trgRouteOperational.equals(trgSensorOperational)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { containerCorr, routeFailedCorr, srcSensor,
												sensorFailedCorr, trgRouteRepair, trgPetrinet, routeOperationalCorr,
												srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational,
												routeRepairCorr, sensorOperationalCorr, trgRouteOperational,
												srcContainer, csp, _this, isApplicableMatch };
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

	public static final Object[] pattern_RequiredSensor_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFBB(
			RequiredSensor _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_RequiredSensor_1_1_performtransformation_binding = pattern_RequiredSensor_1_1_performtransformation_bindingFFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_RequiredSensor_1_1_performtransformation_binding != null) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_RequiredSensor_1_1_performtransformation_binding[0];
			RouteToFailed routeFailedCorr = (RouteToFailed) result_pattern_RequiredSensor_1_1_performtransformation_binding[1];
			Sensor srcSensor = (Sensor) result_pattern_RequiredSensor_1_1_performtransformation_binding[2];
			SensorToFailed sensorFailedCorr = (SensorToFailed) result_pattern_RequiredSensor_1_1_performtransformation_binding[3];
			Transition trgRouteRepair = (Transition) result_pattern_RequiredSensor_1_1_performtransformation_binding[4];
			PetriNet trgPetrinet = (PetriNet) result_pattern_RequiredSensor_1_1_performtransformation_binding[5];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result_pattern_RequiredSensor_1_1_performtransformation_binding[6];
			Route srcRoute = (Route) result_pattern_RequiredSensor_1_1_performtransformation_binding[7];
			Place trgRouteFailed = (Place) result_pattern_RequiredSensor_1_1_performtransformation_binding[8];
			Place trgSensorFailed = (Place) result_pattern_RequiredSensor_1_1_performtransformation_binding[9];
			Place trgSensorOperational = (Place) result_pattern_RequiredSensor_1_1_performtransformation_binding[10];
			RouteToRepair routeRepairCorr = (RouteToRepair) result_pattern_RequiredSensor_1_1_performtransformation_binding[11];
			SensorToOperational sensorOperationalCorr = (SensorToOperational) result_pattern_RequiredSensor_1_1_performtransformation_binding[12];
			Place trgRouteOperational = (Place) result_pattern_RequiredSensor_1_1_performtransformation_binding[13];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_RequiredSensor_1_1_performtransformation_binding[14];

			Object[] result_pattern_RequiredSensor_1_1_performtransformation_black = pattern_RequiredSensor_1_1_performtransformation_blackBBBBBBBBBBBBBBBFBB(
					containerCorr, routeFailedCorr, srcSensor, sensorFailedCorr, trgRouteRepair, trgPetrinet,
					routeOperationalCorr, srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational,
					routeRepairCorr, sensorOperationalCorr, trgRouteOperational, srcContainer, _this,
					isApplicableMatch);
			if (result_pattern_RequiredSensor_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RequiredSensor_1_1_performtransformation_black[15];

				return new Object[] { containerCorr, routeFailedCorr, srcSensor, sensorFailedCorr, trgRouteRepair,
						trgPetrinet, routeOperationalCorr, srcRoute, trgRouteFailed, trgSensorFailed,
						trgSensorOperational, routeRepairCorr, sensorOperationalCorr, trgRouteOperational, srcContainer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_1_1_performtransformation_greenFFFFBBFBBBBFF(
			Transition trgRouteRepair, PetriNet trgPetrinet, Place trgRouteFailed, Place trgSensorFailed,
			Place trgSensorOperational, Place trgRouteOperational) {
		Arc trgRouteFailToRouteFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteOperationalToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteRepairToSensorOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSensorFailedToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSensorOperationalToRouteRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToSensorFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		ImmediateTransition trgRouteFail = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		ArcKind trgRouteFailToRouteFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteOperationalToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteRepairToSensorOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgSensorFailedToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgSensorOperationalToRouteRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteFailToSensorFailed_kind_prime = ArcKind.OUTPUT;
		trgRouteFailToRouteFailed.setPlace(trgRouteFailed);
		trgRouteOperationalToRouteFail.setPlace(trgRouteOperational);
		trgRouteRepairToSensorOperational.setPlace(trgSensorOperational);
		trgRouteRepairToSensorOperational.setTransition(trgRouteRepair);
		trgSensorFailedToRouteFail.setPlace(trgSensorFailed);
		trgSensorOperationalToRouteRepair.setTransition(trgRouteRepair);
		trgSensorOperationalToRouteRepair.setPlace(trgSensorOperational);
		trgRouteFailToSensorFailed.setPlace(trgSensorFailed);
		trgRouteFailToRouteFailed.setTransition(trgRouteFail);
		trgSensorFailedToRouteFail.setTransition(trgRouteFail);
		trgRouteOperationalToRouteFail.setTransition(trgRouteFail);
		trgRouteFailToSensorFailed.setTransition(trgRouteFail);
		trgRouteFail.setPetriNet(trgPetrinet);
		trgRouteFailToRouteFailed.setKind(trgRouteFailToRouteFailed_kind_prime);
		trgRouteOperationalToRouteFail.setKind(trgRouteOperationalToRouteFail_kind_prime);
		trgRouteRepairToSensorOperational.setKind(trgRouteRepairToSensorOperational_kind_prime);
		trgSensorFailedToRouteFail.setKind(trgSensorFailedToRouteFail_kind_prime);
		trgSensorOperationalToRouteRepair.setKind(trgSensorOperationalToRouteRepair_kind_prime);
		trgRouteFailToSensorFailed.setKind(trgRouteFailToSensorFailed_kind_prime);
		return new Object[] { trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail,
				trgRouteRepairToSensorOperational, trgSensorFailedToRouteFail, trgRouteRepair, trgPetrinet,
				trgSensorOperationalToRouteRepair, trgRouteFailed, trgSensorFailed, trgSensorOperational,
				trgRouteOperational, trgRouteFailToSensorFailed, trgRouteFail };
	}

	public static final Object[] pattern_RequiredSensor_1_2_collecttranslatedelements_blackBBBBBBB(
			Arc trgRouteFailToRouteFailed, Arc trgRouteOperationalToRouteFail, Arc trgRouteRepairToSensorOperational,
			Arc trgSensorFailedToRouteFail, Arc trgSensorOperationalToRouteRepair, Arc trgRouteFailToSensorFailed,
			ImmediateTransition trgRouteFail) {
		if (!trgRouteFailToRouteFailed.equals(trgRouteOperationalToRouteFail)) {
			if (!trgRouteFailToRouteFailed.equals(trgRouteRepairToSensorOperational)) {
				if (!trgRouteFailToRouteFailed.equals(trgSensorFailedToRouteFail)) {
					if (!trgRouteFailToRouteFailed.equals(trgSensorOperationalToRouteRepair)) {
						if (!trgRouteFailToRouteFailed.equals(trgRouteFailToSensorFailed)) {
							if (!trgRouteOperationalToRouteFail.equals(trgRouteRepairToSensorOperational)) {
								if (!trgRouteOperationalToRouteFail.equals(trgSensorFailedToRouteFail)) {
									if (!trgRouteOperationalToRouteFail.equals(trgSensorOperationalToRouteRepair)) {
										if (!trgRouteRepairToSensorOperational.equals(trgSensorFailedToRouteFail)) {
											if (!trgRouteRepairToSensorOperational
													.equals(trgSensorOperationalToRouteRepair)) {
												if (!trgSensorFailedToRouteFail
														.equals(trgSensorOperationalToRouteRepair)) {
													if (!trgRouteFailToSensorFailed
															.equals(trgRouteOperationalToRouteFail)) {
														if (!trgRouteFailToSensorFailed
																.equals(trgRouteRepairToSensorOperational)) {
															if (!trgRouteFailToSensorFailed
																	.equals(trgSensorFailedToRouteFail)) {
																if (!trgRouteFailToSensorFailed
																		.equals(trgSensorOperationalToRouteRepair)) {
																	return new Object[] { trgRouteFailToRouteFailed,
																			trgRouteOperationalToRouteFail,
																			trgRouteRepairToSensorOperational,
																			trgSensorFailedToRouteFail,
																			trgSensorOperationalToRouteRepair,
																			trgRouteFailToSensorFailed, trgRouteFail };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredSensor_1_2_collecttranslatedelements_greenFBBBBBBB(
			Arc trgRouteFailToRouteFailed, Arc trgRouteOperationalToRouteFail, Arc trgRouteRepairToSensorOperational,
			Arc trgSensorFailedToRouteFail, Arc trgSensorOperationalToRouteRepair, Arc trgRouteFailToSensorFailed,
			ImmediateTransition trgRouteFail) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgRouteFailToRouteFailed);
		ruleresult.getCreatedElements().add(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedElements().add(trgRouteRepairToSensorOperational);
		ruleresult.getCreatedElements().add(trgSensorFailedToRouteFail);
		ruleresult.getCreatedElements().add(trgSensorOperationalToRouteRepair);
		ruleresult.getCreatedElements().add(trgRouteFailToSensorFailed);
		ruleresult.getCreatedElements().add(trgRouteFail);
		return new Object[] { ruleresult, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail,
				trgRouteRepairToSensorOperational, trgSensorFailedToRouteFail, trgSensorOperationalToRouteRepair,
				trgRouteFailToSensorFailed, trgRouteFail };
	}

	public static final Object[] pattern_RequiredSensor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject containerCorr, EObject trgRouteFailToRouteFailed,
			EObject trgRouteOperationalToRouteFail, EObject trgRouteRepairToSensorOperational,
			EObject trgSensorFailedToRouteFail, EObject routeFailedCorr, EObject srcSensor, EObject sensorFailedCorr,
			EObject trgRouteRepair, EObject trgPetrinet, EObject trgSensorOperationalToRouteRepair,
			EObject routeOperationalCorr, EObject srcRoute, EObject trgRouteFailed, EObject trgSensorFailed,
			EObject trgSensorOperational, EObject routeRepairCorr, EObject sensorOperationalCorr,
			EObject trgRouteOperational, EObject srcContainer, EObject trgRouteFailToSensorFailed,
			EObject trgRouteFail) {
		if (!containerCorr.equals(trgRouteFailToRouteFailed)) {
			if (!containerCorr.equals(trgRouteOperationalToRouteFail)) {
				if (!containerCorr.equals(trgRouteRepairToSensorOperational)) {
					if (!containerCorr.equals(trgSensorFailedToRouteFail)) {
						if (!containerCorr.equals(routeFailedCorr)) {
							if (!containerCorr.equals(srcSensor)) {
								if (!containerCorr.equals(sensorFailedCorr)) {
									if (!containerCorr.equals(trgRouteRepair)) {
										if (!containerCorr.equals(trgPetrinet)) {
											if (!containerCorr.equals(trgSensorOperationalToRouteRepair)) {
												if (!containerCorr.equals(routeOperationalCorr)) {
													if (!containerCorr.equals(srcRoute)) {
														if (!containerCorr.equals(trgRouteFailed)) {
															if (!containerCorr.equals(trgSensorFailed)) {
																if (!containerCorr.equals(trgSensorOperational)) {
																	if (!containerCorr.equals(routeRepairCorr)) {
																		if (!containerCorr
																				.equals(sensorOperationalCorr)) {
																			if (!containerCorr
																					.equals(trgRouteOperational)) {
																				if (!containerCorr
																						.equals(srcContainer)) {
																					if (!containerCorr.equals(
																							trgRouteFailToSensorFailed)) {
																						if (!containerCorr
																								.equals(trgRouteFail)) {
																							if (!trgRouteFailToRouteFailed
																									.equals(trgRouteOperationalToRouteFail)) {
																								if (!trgRouteFailToRouteFailed
																										.equals(trgRouteRepairToSensorOperational)) {
																									if (!trgRouteFailToRouteFailed
																											.equals(trgSensorFailedToRouteFail)) {
																										if (!trgRouteFailToRouteFailed
																												.equals(trgRouteRepair)) {
																											if (!trgRouteFailToRouteFailed
																													.equals(trgSensorOperationalToRouteRepair)) {
																												if (!trgRouteFailToRouteFailed
																														.equals(trgRouteFailed)) {
																													if (!trgRouteFailToRouteFailed
																															.equals(trgSensorFailed)) {
																														if (!trgRouteFailToRouteFailed
																																.equals(trgSensorOperational)) {
																															if (!trgRouteFailToRouteFailed
																																	.equals(trgRouteOperational)) {
																																if (!trgRouteFailToRouteFailed
																																		.equals(trgRouteFailToSensorFailed)) {
																																	if (!trgRouteOperationalToRouteFail
																																			.equals(trgRouteRepairToSensorOperational)) {
																																		if (!trgRouteOperationalToRouteFail
																																				.equals(trgSensorFailedToRouteFail)) {
																																			if (!trgRouteOperationalToRouteFail
																																					.equals(trgRouteRepair)) {
																																				if (!trgRouteOperationalToRouteFail
																																						.equals(trgSensorOperationalToRouteRepair)) {
																																					if (!trgRouteOperationalToRouteFail
																																							.equals(trgSensorFailed)) {
																																						if (!trgRouteOperationalToRouteFail
																																								.equals(trgSensorOperational)) {
																																							if (!trgRouteRepairToSensorOperational
																																									.equals(trgSensorFailedToRouteFail)) {
																																								if (!trgRouteRepairToSensorOperational
																																										.equals(trgSensorOperationalToRouteRepair)) {
																																									if (!trgRouteRepairToSensorOperational
																																											.equals(trgSensorFailed)) {
																																										if (!trgRouteRepairToSensorOperational
																																												.equals(trgSensorOperational)) {
																																											if (!trgSensorFailedToRouteFail
																																													.equals(trgSensorOperationalToRouteRepair)) {
																																												if (!trgSensorFailedToRouteFail
																																														.equals(trgSensorOperational)) {
																																													if (!routeFailedCorr
																																															.equals(trgRouteFailToRouteFailed)) {
																																														if (!routeFailedCorr
																																																.equals(trgRouteOperationalToRouteFail)) {
																																															if (!routeFailedCorr
																																																	.equals(trgRouteRepairToSensorOperational)) {
																																																if (!routeFailedCorr
																																																		.equals(trgSensorFailedToRouteFail)) {
																																																	if (!routeFailedCorr
																																																			.equals(srcSensor)) {
																																																		if (!routeFailedCorr
																																																				.equals(sensorFailedCorr)) {
																																																			if (!routeFailedCorr
																																																					.equals(trgRouteRepair)) {
																																																				if (!routeFailedCorr
																																																						.equals(trgPetrinet)) {
																																																					if (!routeFailedCorr
																																																							.equals(trgSensorOperationalToRouteRepair)) {
																																																						if (!routeFailedCorr
																																																								.equals(routeOperationalCorr)) {
																																																							if (!routeFailedCorr
																																																									.equals(srcRoute)) {
																																																								if (!routeFailedCorr
																																																										.equals(trgRouteFailed)) {
																																																									if (!routeFailedCorr
																																																											.equals(trgSensorFailed)) {
																																																										if (!routeFailedCorr
																																																												.equals(trgSensorOperational)) {
																																																											if (!routeFailedCorr
																																																													.equals(routeRepairCorr)) {
																																																												if (!routeFailedCorr
																																																														.equals(sensorOperationalCorr)) {
																																																													if (!routeFailedCorr
																																																															.equals(trgRouteOperational)) {
																																																														if (!routeFailedCorr
																																																																.equals(srcContainer)) {
																																																															if (!routeFailedCorr
																																																																	.equals(trgRouteFailToSensorFailed)) {
																																																																if (!routeFailedCorr
																																																																		.equals(trgRouteFail)) {
																																																																	if (!srcSensor
																																																																			.equals(trgRouteFailToRouteFailed)) {
																																																																		if (!srcSensor
																																																																				.equals(trgRouteOperationalToRouteFail)) {
																																																																			if (!srcSensor
																																																																					.equals(trgRouteRepairToSensorOperational)) {
																																																																				if (!srcSensor
																																																																						.equals(trgSensorFailedToRouteFail)) {
																																																																					if (!srcSensor
																																																																							.equals(trgRouteRepair)) {
																																																																						if (!srcSensor
																																																																								.equals(trgPetrinet)) {
																																																																							if (!srcSensor
																																																																									.equals(trgSensorOperationalToRouteRepair)) {
																																																																								if (!srcSensor
																																																																										.equals(trgRouteFailed)) {
																																																																									if (!srcSensor
																																																																											.equals(trgSensorFailed)) {
																																																																										if (!srcSensor
																																																																												.equals(trgSensorOperational)) {
																																																																											if (!srcSensor
																																																																													.equals(trgRouteOperational)) {
																																																																												if (!srcSensor
																																																																														.equals(trgRouteFailToSensorFailed)) {
																																																																													if (!srcSensor
																																																																															.equals(trgRouteFail)) {
																																																																														if (!sensorFailedCorr
																																																																																.equals(trgRouteFailToRouteFailed)) {
																																																																															if (!sensorFailedCorr
																																																																																	.equals(trgRouteOperationalToRouteFail)) {
																																																																																if (!sensorFailedCorr
																																																																																		.equals(trgRouteRepairToSensorOperational)) {
																																																																																	if (!sensorFailedCorr
																																																																																			.equals(trgSensorFailedToRouteFail)) {
																																																																																		if (!sensorFailedCorr
																																																																																				.equals(srcSensor)) {
																																																																																			if (!sensorFailedCorr
																																																																																					.equals(trgRouteRepair)) {
																																																																																				if (!sensorFailedCorr
																																																																																						.equals(trgPetrinet)) {
																																																																																					if (!sensorFailedCorr
																																																																																							.equals(trgSensorOperationalToRouteRepair)) {
																																																																																						if (!sensorFailedCorr
																																																																																								.equals(srcRoute)) {
																																																																																							if (!sensorFailedCorr
																																																																																									.equals(trgRouteFailed)) {
																																																																																								if (!sensorFailedCorr
																																																																																										.equals(trgSensorFailed)) {
																																																																																									if (!sensorFailedCorr
																																																																																											.equals(trgSensorOperational)) {
																																																																																										if (!sensorFailedCorr
																																																																																												.equals(sensorOperationalCorr)) {
																																																																																											if (!sensorFailedCorr
																																																																																													.equals(trgRouteOperational)) {
																																																																																												if (!sensorFailedCorr
																																																																																														.equals(srcContainer)) {
																																																																																													if (!sensorFailedCorr
																																																																																															.equals(trgRouteFailToSensorFailed)) {
																																																																																														if (!sensorFailedCorr
																																																																																																.equals(trgRouteFail)) {
																																																																																															if (!trgRouteRepair
																																																																																																	.equals(trgRouteRepairToSensorOperational)) {
																																																																																																if (!trgRouteRepair
																																																																																																		.equals(trgSensorFailedToRouteFail)) {
																																																																																																	if (!trgRouteRepair
																																																																																																			.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																		if (!trgRouteRepair
																																																																																																				.equals(trgSensorFailed)) {
																																																																																																			if (!trgRouteRepair
																																																																																																					.equals(trgSensorOperational)) {
																																																																																																				if (!trgPetrinet
																																																																																																						.equals(trgRouteFailToRouteFailed)) {
																																																																																																					if (!trgPetrinet
																																																																																																							.equals(trgRouteOperationalToRouteFail)) {
																																																																																																						if (!trgPetrinet
																																																																																																								.equals(trgRouteRepairToSensorOperational)) {
																																																																																																							if (!trgPetrinet
																																																																																																									.equals(trgSensorFailedToRouteFail)) {
																																																																																																								if (!trgPetrinet
																																																																																																										.equals(trgRouteRepair)) {
																																																																																																									if (!trgPetrinet
																																																																																																											.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																										if (!trgPetrinet
																																																																																																												.equals(trgRouteFailed)) {
																																																																																																											if (!trgPetrinet
																																																																																																													.equals(trgSensorFailed)) {
																																																																																																												if (!trgPetrinet
																																																																																																														.equals(trgSensorOperational)) {
																																																																																																													if (!trgPetrinet
																																																																																																															.equals(trgRouteOperational)) {
																																																																																																														if (!trgPetrinet
																																																																																																																.equals(trgRouteFailToSensorFailed)) {
																																																																																																															if (!trgPetrinet
																																																																																																																	.equals(trgRouteFail)) {
																																																																																																																if (!routeOperationalCorr
																																																																																																																		.equals(trgRouteFailToRouteFailed)) {
																																																																																																																	if (!routeOperationalCorr
																																																																																																																			.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																		if (!routeOperationalCorr
																																																																																																																				.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																			if (!routeOperationalCorr
																																																																																																																					.equals(trgSensorFailedToRouteFail)) {
																																																																																																																				if (!routeOperationalCorr
																																																																																																																						.equals(srcSensor)) {
																																																																																																																					if (!routeOperationalCorr
																																																																																																																							.equals(sensorFailedCorr)) {
																																																																																																																						if (!routeOperationalCorr
																																																																																																																								.equals(trgRouteRepair)) {
																																																																																																																							if (!routeOperationalCorr
																																																																																																																									.equals(trgPetrinet)) {
																																																																																																																								if (!routeOperationalCorr
																																																																																																																										.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																									if (!routeOperationalCorr
																																																																																																																											.equals(srcRoute)) {
																																																																																																																										if (!routeOperationalCorr
																																																																																																																												.equals(trgRouteFailed)) {
																																																																																																																											if (!routeOperationalCorr
																																																																																																																													.equals(trgSensorFailed)) {
																																																																																																																												if (!routeOperationalCorr
																																																																																																																														.equals(trgSensorOperational)) {
																																																																																																																													if (!routeOperationalCorr
																																																																																																																															.equals(routeRepairCorr)) {
																																																																																																																														if (!routeOperationalCorr
																																																																																																																																.equals(sensorOperationalCorr)) {
																																																																																																																															if (!routeOperationalCorr
																																																																																																																																	.equals(trgRouteOperational)) {
																																																																																																																																if (!routeOperationalCorr
																																																																																																																																		.equals(srcContainer)) {
																																																																																																																																	if (!routeOperationalCorr
																																																																																																																																			.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																		if (!routeOperationalCorr
																																																																																																																																				.equals(trgRouteFail)) {
																																																																																																																																			if (!srcRoute
																																																																																																																																					.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																				if (!srcRoute
																																																																																																																																						.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																					if (!srcRoute
																																																																																																																																							.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																						if (!srcRoute
																																																																																																																																								.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																							if (!srcRoute
																																																																																																																																									.equals(srcSensor)) {
																																																																																																																																								if (!srcRoute
																																																																																																																																										.equals(trgRouteRepair)) {
																																																																																																																																									if (!srcRoute
																																																																																																																																											.equals(trgPetrinet)) {
																																																																																																																																										if (!srcRoute
																																																																																																																																												.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																											if (!srcRoute
																																																																																																																																													.equals(trgRouteFailed)) {
																																																																																																																																												if (!srcRoute
																																																																																																																																														.equals(trgSensorFailed)) {
																																																																																																																																													if (!srcRoute
																																																																																																																																															.equals(trgSensorOperational)) {
																																																																																																																																														if (!srcRoute
																																																																																																																																																.equals(trgRouteOperational)) {
																																																																																																																																															if (!srcRoute
																																																																																																																																																	.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																if (!srcRoute
																																																																																																																																																		.equals(trgRouteFail)) {
																																																																																																																																																	if (!trgRouteFailed
																																																																																																																																																			.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																		if (!trgRouteFailed
																																																																																																																																																				.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																			if (!trgRouteFailed
																																																																																																																																																					.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																				if (!trgRouteFailed
																																																																																																																																																						.equals(trgRouteRepair)) {
																																																																																																																																																					if (!trgRouteFailed
																																																																																																																																																							.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																						if (!trgRouteFailed
																																																																																																																																																								.equals(trgSensorFailed)) {
																																																																																																																																																							if (!trgRouteFailed
																																																																																																																																																									.equals(trgSensorOperational)) {
																																																																																																																																																								if (!trgRouteFailed
																																																																																																																																																										.equals(trgRouteOperational)) {
																																																																																																																																																									if (!trgSensorFailed
																																																																																																																																																											.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																										if (!trgSensorFailed
																																																																																																																																																												.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																											if (!trgSensorFailed
																																																																																																																																																													.equals(trgSensorOperational)) {
																																																																																																																																																												if (!trgSensorOperational
																																																																																																																																																														.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																													if (!routeRepairCorr
																																																																																																																																																															.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																														if (!routeRepairCorr
																																																																																																																																																																.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																															if (!routeRepairCorr
																																																																																																																																																																	.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																if (!routeRepairCorr
																																																																																																																																																																		.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																	if (!routeRepairCorr
																																																																																																																																																																			.equals(srcSensor)) {
																																																																																																																																																																		if (!routeRepairCorr
																																																																																																																																																																				.equals(sensorFailedCorr)) {
																																																																																																																																																																			if (!routeRepairCorr
																																																																																																																																																																					.equals(trgRouteRepair)) {
																																																																																																																																																																				if (!routeRepairCorr
																																																																																																																																																																						.equals(trgPetrinet)) {
																																																																																																																																																																					if (!routeRepairCorr
																																																																																																																																																																							.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																						if (!routeRepairCorr
																																																																																																																																																																								.equals(srcRoute)) {
																																																																																																																																																																							if (!routeRepairCorr
																																																																																																																																																																									.equals(trgRouteFailed)) {
																																																																																																																																																																								if (!routeRepairCorr
																																																																																																																																																																										.equals(trgSensorFailed)) {
																																																																																																																																																																									if (!routeRepairCorr
																																																																																																																																																																											.equals(trgSensorOperational)) {
																																																																																																																																																																										if (!routeRepairCorr
																																																																																																																																																																												.equals(sensorOperationalCorr)) {
																																																																																																																																																																											if (!routeRepairCorr
																																																																																																																																																																													.equals(trgRouteOperational)) {
																																																																																																																																																																												if (!routeRepairCorr
																																																																																																																																																																														.equals(srcContainer)) {
																																																																																																																																																																													if (!routeRepairCorr
																																																																																																																																																																															.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																																														if (!routeRepairCorr
																																																																																																																																																																																.equals(trgRouteFail)) {
																																																																																																																																																																															if (!sensorOperationalCorr
																																																																																																																																																																																	.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																if (!sensorOperationalCorr
																																																																																																																																																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																	if (!sensorOperationalCorr
																																																																																																																																																																																			.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																		if (!sensorOperationalCorr
																																																																																																																																																																																				.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																			if (!sensorOperationalCorr
																																																																																																																																																																																					.equals(srcSensor)) {
																																																																																																																																																																																				if (!sensorOperationalCorr
																																																																																																																																																																																						.equals(trgRouteRepair)) {
																																																																																																																																																																																					if (!sensorOperationalCorr
																																																																																																																																																																																							.equals(trgPetrinet)) {
																																																																																																																																																																																						if (!sensorOperationalCorr
																																																																																																																																																																																								.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																							if (!sensorOperationalCorr
																																																																																																																																																																																									.equals(srcRoute)) {
																																																																																																																																																																																								if (!sensorOperationalCorr
																																																																																																																																																																																										.equals(trgRouteFailed)) {
																																																																																																																																																																																									if (!sensorOperationalCorr
																																																																																																																																																																																											.equals(trgSensorFailed)) {
																																																																																																																																																																																										if (!sensorOperationalCorr
																																																																																																																																																																																												.equals(trgSensorOperational)) {
																																																																																																																																																																																											if (!sensorOperationalCorr
																																																																																																																																																																																													.equals(trgRouteOperational)) {
																																																																																																																																																																																												if (!sensorOperationalCorr
																																																																																																																																																																																														.equals(srcContainer)) {
																																																																																																																																																																																													if (!sensorOperationalCorr
																																																																																																																																																																																															.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																																																														if (!sensorOperationalCorr
																																																																																																																																																																																																.equals(trgRouteFail)) {
																																																																																																																																																																																															if (!trgRouteOperational
																																																																																																																																																																																																	.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																if (!trgRouteOperational
																																																																																																																																																																																																		.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																																	if (!trgRouteOperational
																																																																																																																																																																																																			.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																																		if (!trgRouteOperational
																																																																																																																																																																																																				.equals(trgRouteRepair)) {
																																																																																																																																																																																																			if (!trgRouteOperational
																																																																																																																																																																																																					.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																				if (!trgRouteOperational
																																																																																																																																																																																																						.equals(trgSensorFailed)) {
																																																																																																																																																																																																					if (!trgRouteOperational
																																																																																																																																																																																																							.equals(trgSensorOperational)) {
																																																																																																																																																																																																						if (!srcContainer
																																																																																																																																																																																																								.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																							if (!srcContainer
																																																																																																																																																																																																									.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																								if (!srcContainer
																																																																																																																																																																																																										.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																																									if (!srcContainer
																																																																																																																																																																																																											.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																																										if (!srcContainer
																																																																																																																																																																																																												.equals(srcSensor)) {
																																																																																																																																																																																																											if (!srcContainer
																																																																																																																																																																																																													.equals(trgRouteRepair)) {
																																																																																																																																																																																																												if (!srcContainer
																																																																																																																																																																																																														.equals(trgPetrinet)) {
																																																																																																																																																																																																													if (!srcContainer
																																																																																																																																																																																																															.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																														if (!srcContainer
																																																																																																																																																																																																																.equals(srcRoute)) {
																																																																																																																																																																																																															if (!srcContainer
																																																																																																																																																																																																																	.equals(trgRouteFailed)) {
																																																																																																																																																																																																																if (!srcContainer
																																																																																																																																																																																																																		.equals(trgSensorFailed)) {
																																																																																																																																																																																																																	if (!srcContainer
																																																																																																																																																																																																																			.equals(trgSensorOperational)) {
																																																																																																																																																																																																																		if (!srcContainer
																																																																																																																																																																																																																				.equals(trgRouteOperational)) {
																																																																																																																																																																																																																			if (!srcContainer
																																																																																																																																																																																																																					.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																																																																																				if (!srcContainer
																																																																																																																																																																																																																						.equals(trgRouteFail)) {
																																																																																																																																																																																																																					if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																							.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																						if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																								.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																																																							if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																									.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																																																								if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																										.equals(trgRouteRepair)) {
																																																																																																																																																																																																																									if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																											.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																																										if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																												.equals(trgRouteFailed)) {
																																																																																																																																																																																																																											if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																													.equals(trgSensorFailed)) {
																																																																																																																																																																																																																												if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																														.equals(trgSensorOperational)) {
																																																																																																																																																																																																																													if (!trgRouteFailToSensorFailed
																																																																																																																																																																																																																															.equals(trgRouteOperational)) {
																																																																																																																																																																																																																														if (!trgRouteFail
																																																																																																																																																																																																																																.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																															if (!trgRouteFail
																																																																																																																																																																																																																																	.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																if (!trgRouteFail
																																																																																																																																																																																																																																		.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																																																																	if (!trgRouteFail
																																																																																																																																																																																																																																			.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																																																																		if (!trgRouteFail
																																																																																																																																																																																																																																				.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																			if (!trgRouteFail
																																																																																																																																																																																																																																					.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																																																				if (!trgRouteFail
																																																																																																																																																																																																																																						.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																					if (!trgRouteFail
																																																																																																																																																																																																																																							.equals(trgSensorFailed)) {
																																																																																																																																																																																																																																						if (!trgRouteFail
																																																																																																																																																																																																																																								.equals(trgSensorOperational)) {
																																																																																																																																																																																																																																							if (!trgRouteFail
																																																																																																																																																																																																																																									.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																								if (!trgRouteFail
																																																																																																																																																																																																																																										.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																																																																																																									return new Object[] {
																																																																																																																																																																																																																																											ruleresult,
																																																																																																																																																																																																																																											containerCorr,
																																																																																																																																																																																																																																											trgRouteFailToRouteFailed,
																																																																																																																																																																																																																																											trgRouteOperationalToRouteFail,
																																																																																																																																																																																																																																											trgRouteRepairToSensorOperational,
																																																																																																																																																																																																																																											trgSensorFailedToRouteFail,
																																																																																																																																																																																																																																											routeFailedCorr,
																																																																																																																																																																																																																																											srcSensor,
																																																																																																																																																																																																																																											sensorFailedCorr,
																																																																																																																																																																																																																																											trgRouteRepair,
																																																																																																																																																																																																																																											trgPetrinet,
																																																																																																																																																																																																																																											trgSensorOperationalToRouteRepair,
																																																																																																																																																																																																																																											routeOperationalCorr,
																																																																																																																																																																																																																																											srcRoute,
																																																																																																																																																																																																																																											trgRouteFailed,
																																																																																																																																																																																																																																											trgSensorFailed,
																																																																																																																																																																																																																																											trgSensorOperational,
																																																																																																																																																																																																																																											routeRepairCorr,
																																																																																																																																																																																																																																											sensorOperationalCorr,
																																																																																																																																																																																																																																											trgRouteOperational,
																																																																																																																																																																																																																																											srcContainer,
																																																																																																																																																																																																																																											trgRouteFailToSensorFailed,
																																																																																																																																																																																																																																											trgRouteFail };
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredSensor_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject trgRouteFailToRouteFailed, EObject trgRouteOperationalToRouteFail,
			EObject trgRouteRepairToSensorOperational, EObject trgSensorFailedToRouteFail, EObject srcSensor,
			EObject trgRouteRepair, EObject trgPetrinet, EObject trgSensorOperationalToRouteRepair, EObject srcRoute,
			EObject trgRouteFailed, EObject trgSensorFailed, EObject trgSensorOperational, EObject trgRouteOperational,
			EObject trgRouteFailToSensorFailed, EObject trgRouteFail) {
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSensorFailedToRouteFail__trgSensorFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSensorFailedToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgSensorFailedToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSensorOperational__trgSensorOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSensorOperational__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgRouteRepairToSensorOperational____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSensorOperationalToRouteRepair__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgSensorOperationalToRouteRepair____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSensor____requires = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSensorFailed__trgSensorFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSensorFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToSensorFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSensorOperationalToRouteRepair__trgSensorOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRouteFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RequiredSensor";
		String trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime = "arcs";
		String trgSensorFailedToRouteFail__trgSensorFailed____place_name_prime = "place";
		String trgSensorFailedToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgSensorFailedToRouteFail____arcs_name_prime = "arcs";
		String trgRouteRepairToSensorOperational__trgSensorOperational____place_name_prime = "place";
		String trgRouteRepairToSensorOperational__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgRouteRepairToSensorOperational____arcs_name_prime = "arcs";
		String trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime = "place";
		String trgSensorOperationalToRouteRepair__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgSensorOperationalToRouteRepair____arcs_name_prime = "arcs";
		String srcRoute__srcSensor____requires_name_prime = "requires";
		String trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime = "arcs";
		String trgRouteFailToSensorFailed__trgSensorFailed____place_name_prime = "place";
		String trgRouteFailToSensorFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToSensorFailed____arcs_name_prime = "arcs";
		String trgSensorOperationalToRouteRepair__trgSensorOperational____place_name_prime = "place";
		String trgRouteFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRouteFail____nodes_name_prime = "nodes";
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setTrg(trgRouteOperational);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteOperational____place);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setTrg(trgRouteFailToRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToRouteFailed____arcs);
		trgSensorFailedToRouteFail__trgSensorFailed____place.setSrc(trgSensorFailedToRouteFail);
		trgSensorFailedToRouteFail__trgSensorFailed____place.setTrg(trgSensorFailed);
		ruleresult.getCreatedEdges().add(trgSensorFailedToRouteFail__trgSensorFailed____place);
		trgSensorFailedToRouteFail__trgRouteFail____transition.setSrc(trgSensorFailedToRouteFail);
		trgSensorFailedToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgSensorFailedToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgSensorFailedToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgSensorFailedToRouteFail____arcs.setTrg(trgSensorFailedToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgSensorFailedToRouteFail____arcs);
		trgRouteRepairToSensorOperational__trgSensorOperational____place.setSrc(trgRouteRepairToSensorOperational);
		trgRouteRepairToSensorOperational__trgSensorOperational____place.setTrg(trgSensorOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSensorOperational__trgSensorOperational____place);
		trgRouteRepairToSensorOperational__trgRouteRepair____transition.setSrc(trgRouteRepairToSensorOperational);
		trgRouteRepairToSensorOperational__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSensorOperational__trgRouteRepair____transition);
		trgRouteRepair__trgRouteRepairToSensorOperational____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgRouteRepairToSensorOperational____arcs.setTrg(trgRouteRepairToSensorOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgRouteRepairToSensorOperational____arcs);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setTrg(trgRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFailed____place);
		trgSensorOperationalToRouteRepair__trgRouteRepair____transition.setSrc(trgSensorOperationalToRouteRepair);
		trgSensorOperationalToRouteRepair__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgSensorOperationalToRouteRepair__trgRouteRepair____transition);
		trgRouteRepair__trgSensorOperationalToRouteRepair____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgSensorOperationalToRouteRepair____arcs.setTrg(trgSensorOperationalToRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgSensorOperationalToRouteRepair____arcs);
		srcRoute__srcSensor____requires.setSrc(srcRoute);
		srcRoute__srcSensor____requires.setTrg(srcSensor);
		ruleresult.getTranslatedEdges().add(srcRoute__srcSensor____requires);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setTrg(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteOperationalToRouteFail____arcs);
		trgRouteFailToSensorFailed__trgSensorFailed____place.setSrc(trgRouteFailToSensorFailed);
		trgRouteFailToSensorFailed__trgSensorFailed____place.setTrg(trgSensorFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToSensorFailed__trgSensorFailed____place);
		trgRouteFailToSensorFailed__trgRouteFail____transition.setSrc(trgRouteFailToSensorFailed);
		trgRouteFailToSensorFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToSensorFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToSensorFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToSensorFailed____arcs.setTrg(trgRouteFailToSensorFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToSensorFailed____arcs);
		trgSensorOperationalToRouteRepair__trgSensorOperational____place.setSrc(trgSensorOperationalToRouteRepair);
		trgSensorOperationalToRouteRepair__trgSensorOperational____place.setTrg(trgSensorOperational);
		ruleresult.getCreatedEdges().add(trgSensorOperationalToRouteRepair__trgSensorOperational____place);
		trgRouteFail__trgPetrinet____petriNet.setSrc(trgRouteFail);
		trgRouteFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgPetrinet____petriNet);
		trgPetrinet__trgRouteFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRouteFail____nodes.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRouteFail____nodes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgRouteOperationalToRouteFail__trgRouteOperational____place
				.setName(trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFail____transition
				.setName(trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToRouteFailed____arcs
				.setName(trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime);
		trgSensorFailedToRouteFail__trgSensorFailed____place
				.setName(trgSensorFailedToRouteFail__trgSensorFailed____place_name_prime);
		trgSensorFailedToRouteFail__trgRouteFail____transition
				.setName(trgSensorFailedToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgSensorFailedToRouteFail____arcs
				.setName(trgRouteFail__trgSensorFailedToRouteFail____arcs_name_prime);
		trgRouteRepairToSensorOperational__trgSensorOperational____place
				.setName(trgRouteRepairToSensorOperational__trgSensorOperational____place_name_prime);
		trgRouteRepairToSensorOperational__trgRouteRepair____transition
				.setName(trgRouteRepairToSensorOperational__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgRouteRepairToSensorOperational____arcs
				.setName(trgRouteRepair__trgRouteRepairToSensorOperational____arcs_name_prime);
		trgRouteFailToRouteFailed__trgRouteFailed____place
				.setName(trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime);
		trgSensorOperationalToRouteRepair__trgRouteRepair____transition
				.setName(trgSensorOperationalToRouteRepair__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgSensorOperationalToRouteRepair____arcs
				.setName(trgRouteRepair__trgSensorOperationalToRouteRepair____arcs_name_prime);
		srcRoute__srcSensor____requires.setName(srcRoute__srcSensor____requires_name_prime);
		trgRouteOperationalToRouteFail__trgRouteFail____transition
				.setName(trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs
				.setName(trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime);
		trgRouteFailToSensorFailed__trgSensorFailed____place
				.setName(trgRouteFailToSensorFailed__trgSensorFailed____place_name_prime);
		trgRouteFailToSensorFailed__trgRouteFail____transition
				.setName(trgRouteFailToSensorFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToSensorFailed____arcs
				.setName(trgRouteFail__trgRouteFailToSensorFailed____arcs_name_prime);
		trgSensorOperationalToRouteRepair__trgSensorOperational____place
				.setName(trgSensorOperationalToRouteRepair__trgSensorOperational____place_name_prime);
		trgRouteFail__trgPetrinet____petriNet.setName(trgRouteFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRouteFail____nodes.setName(trgPetrinet__trgRouteFail____nodes_name_prime);
		return new Object[] { ruleresult, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail,
				trgRouteRepairToSensorOperational, trgSensorFailedToRouteFail, srcSensor, trgRouteRepair, trgPetrinet,
				trgSensorOperationalToRouteRepair, srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational,
				trgRouteOperational, trgRouteFailToSensorFailed, trgRouteFail,
				trgRouteOperationalToRouteFail__trgRouteOperational____place,
				trgRouteFailToRouteFailed__trgRouteFail____transition, trgRouteFail__trgRouteFailToRouteFailed____arcs,
				trgSensorFailedToRouteFail__trgSensorFailed____place,
				trgSensorFailedToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgSensorFailedToRouteFail____arcs,
				trgRouteRepairToSensorOperational__trgSensorOperational____place,
				trgRouteRepairToSensorOperational__trgRouteRepair____transition,
				trgRouteRepair__trgRouteRepairToSensorOperational____arcs,
				trgRouteFailToRouteFailed__trgRouteFailed____place,
				trgSensorOperationalToRouteRepair__trgRouteRepair____transition,
				trgRouteRepair__trgSensorOperationalToRouteRepair____arcs, srcRoute__srcSensor____requires,
				trgRouteOperationalToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgRouteOperationalToRouteFail____arcs,
				trgRouteFailToSensorFailed__trgSensorFailed____place,
				trgRouteFailToSensorFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToSensorFailed____arcs,
				trgSensorOperationalToRouteRepair__trgSensorOperational____place, trgRouteFail__trgPetrinet____petriNet,
				trgPetrinet__trgRouteFail____nodes };
	}

	public static final void pattern_RequiredSensor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
			RequiredSensor _this, PerformRuleResult ruleresult, EObject containerCorr,
			EObject trgRouteFailToRouteFailed, EObject trgRouteOperationalToRouteFail,
			EObject trgRouteRepairToSensorOperational, EObject trgSensorFailedToRouteFail, EObject routeFailedCorr,
			EObject srcSensor, EObject sensorFailedCorr, EObject trgRouteRepair, EObject trgPetrinet,
			EObject trgSensorOperationalToRouteRepair, EObject routeOperationalCorr, EObject srcRoute,
			EObject trgRouteFailed, EObject trgSensorFailed, EObject trgSensorOperational, EObject routeRepairCorr,
			EObject sensorOperationalCorr, EObject trgRouteOperational, EObject srcContainer,
			EObject trgRouteFailToSensorFailed, EObject trgRouteFail) {
		_this.registerObjects_FWD(ruleresult, containerCorr, trgRouteFailToRouteFailed, trgRouteOperationalToRouteFail,
				trgRouteRepairToSensorOperational, trgSensorFailedToRouteFail, routeFailedCorr, srcSensor,
				sensorFailedCorr, trgRouteRepair, trgPetrinet, trgSensorOperationalToRouteRepair, routeOperationalCorr,
				srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational, routeRepairCorr, sensorOperationalCorr,
				trgRouteOperational, srcContainer, trgRouteFailToSensorFailed, trgRouteFail);

	}

	public static final PerformRuleResult pattern_RequiredSensor_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredSensor_2_1_preparereturnvalue_bindingFB(RequiredSensor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_2_1_preparereturnvalue_blackFBB(EClass eClass,
			RequiredSensor _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_2_1_preparereturnvalue_bindingAndBlackFFB(
			RequiredSensor _this) {
		Object[] result_pattern_RequiredSensor_2_1_preparereturnvalue_binding = pattern_RequiredSensor_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredSensor_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_RequiredSensor_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredSensor_2_1_preparereturnvalue_black = pattern_RequiredSensor_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_RequiredSensor_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_RequiredSensor_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "RequiredSensor";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_RequiredSensor_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcSensor");
		EObject _localVariable_1 = match.getObject("srcRoute");
		EObject _localVariable_2 = match.getObject("srcContainer");
		EObject tmpSrcSensor = _localVariable_0;
		EObject tmpSrcRoute = _localVariable_1;
		EObject tmpSrcContainer = _localVariable_2;
		if (tmpSrcSensor instanceof Sensor) {
			Sensor srcSensor = (Sensor) tmpSrcSensor;
			if (tmpSrcRoute instanceof Route) {
				Route srcRoute = (Route) tmpSrcRoute;
				if (tmpSrcContainer instanceof RailwayContainer) {
					RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
					return new Object[] { srcSensor, srcRoute, srcContainer, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RequiredSensor_2_2_corematch_blackFFBFFFFBFFFFFFBB(Sensor srcSensor,
			Route srcRoute, RailwayContainer srcContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SensorToFailed sensorFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcSensor, SensorToFailed.class, "source")) {
			Place trgSensorFailed = sensorFailedCorr.getTarget();
			if (trgSensorFailed != null) {
				for (RouteToOperational routeOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcRoute, RouteToOperational.class, "source")) {
					Place trgRouteOperational = routeOperationalCorr.getTarget();
					if (trgRouteOperational != null) {
						if (!trgRouteOperational.equals(trgSensorFailed)) {
							for (SensorToOperational sensorOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(srcSensor, SensorToOperational.class, "source")) {
								Place trgSensorOperational = sensorOperationalCorr.getTarget();
								if (trgSensorOperational != null) {
									if (!trgSensorFailed.equals(trgSensorOperational)) {
										if (!trgRouteOperational.equals(trgSensorOperational)) {
											for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(srcContainer,
															RailwayContainerToPetriNet.class, "source")) {
												PetriNet trgPetrinet = containerCorr.getTarget();
												if (trgPetrinet != null) {
													for (RouteToRepair routeRepairCorr : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(srcRoute, RouteToRepair.class,
																	"source")) {
														Transition trgRouteRepair = routeRepairCorr.getTarget();
														if (trgRouteRepair != null) {
															for (RouteToFailed routeFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(srcRoute,
																			RouteToFailed.class, "source")) {
																Place trgRouteFailed = routeFailedCorr.getTarget();
																if (trgRouteFailed != null) {
																	if (!trgRouteFailed.equals(trgSensorFailed)) {
																		if (!trgRouteFailed
																				.equals(trgSensorOperational)) {
																			if (!trgRouteFailed
																					.equals(trgRouteOperational)) {
																				_result.add(new Object[] {
																						containerCorr, routeFailedCorr,
																						srcSensor, sensorFailedCorr,
																						trgRouteRepair, trgPetrinet,
																						routeOperationalCorr, srcRoute,
																						trgRouteFailed, trgSensorFailed,
																						trgSensorOperational,
																						routeRepairCorr,
																						sensorOperationalCorr,
																						trgRouteOperational,
																						srcContainer, match });
																			}
																		}
																	}
																}

															}
														}

													}
												}

											}
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

	public static final Iterable<Object[]> pattern_RequiredSensor_2_3_findcontext_blackBBBBBBBBBBBBBBB(
			RailwayContainerToPetriNet containerCorr, RouteToFailed routeFailedCorr, Sensor srcSensor,
			SensorToFailed sensorFailedCorr, Transition trgRouteRepair, PetriNet trgPetrinet,
			RouteToOperational routeOperationalCorr, Route srcRoute, Place trgRouteFailed, Place trgSensorFailed,
			Place trgSensorOperational, RouteToRepair routeRepairCorr, SensorToOperational sensorOperationalCorr,
			Place trgRouteOperational, RailwayContainer srcContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!trgRouteFailed.equals(trgSensorFailed)) {
			if (!trgRouteFailed.equals(trgSensorOperational)) {
				if (!trgRouteFailed.equals(trgRouteOperational)) {
					if (!trgSensorFailed.equals(trgSensorOperational)) {
						if (!trgRouteOperational.equals(trgSensorFailed)) {
							if (!trgRouteOperational.equals(trgSensorOperational)) {
								if (trgPetrinet.equals(containerCorr.getTarget())) {
									if (srcSensor.equals(sensorFailedCorr.getSource())) {
										if (srcRoute.equals(routeOperationalCorr.getSource())) {
											if (srcRoute.getRequires().contains(srcSensor)) {
												if (trgRouteFailed.equals(routeFailedCorr.getTarget())) {
													if (srcSensor.equals(sensorOperationalCorr.getSource())) {
														if (trgRouteOperational
																.equals(routeOperationalCorr.getTarget())) {
															if (trgSensorOperational
																	.equals(sensorOperationalCorr.getTarget())) {
																if (srcContainer.getRoutes().contains(srcRoute)) {
																	if (trgRouteRepair
																			.equals(routeRepairCorr.getTarget())) {
																		if (srcContainer
																				.equals(containerCorr.getSource())) {
																			if (trgSensorFailed.equals(
																					sensorFailedCorr.getTarget())) {
																				if (srcRoute.equals(
																						routeRepairCorr.getSource())) {
																					if (srcRoute.equals(routeFailedCorr
																							.getSource())) {
																						_result.add(new Object[] {
																								containerCorr,
																								routeFailedCorr,
																								srcSensor,
																								sensorFailedCorr,
																								trgRouteRepair,
																								trgPetrinet,
																								routeOperationalCorr,
																								srcRoute,
																								trgRouteFailed,
																								trgSensorFailed,
																								trgSensorOperational,
																								routeRepairCorr,
																								sensorOperationalCorr,
																								trgRouteOperational,
																								srcContainer });
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_RequiredSensor_2_3_findcontext_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			RailwayContainerToPetriNet containerCorr, RouteToFailed routeFailedCorr, Sensor srcSensor,
			SensorToFailed sensorFailedCorr, Transition trgRouteRepair, PetriNet trgPetrinet,
			RouteToOperational routeOperationalCorr, Route srcRoute, Place trgRouteFailed, Place trgSensorFailed,
			Place trgSensorOperational, RouteToRepair routeRepairCorr, SensorToOperational sensorOperationalCorr,
			Place trgRouteOperational, RailwayContainer srcContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorFailedCorr__srcSensor____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSensor____requires = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgRouteFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorOperationalCorr__srcSensor____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgRouteOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorOperationalCorr__trgSensorOperational____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRouteRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorFailedCorr__trgSensorFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String sensorFailedCorr__srcSensor____source_name_prime = "source";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String srcRoute__srcSensor____requires_name_prime = "requires";
		String routeFailedCorr__trgRouteFailed____target_name_prime = "target";
		String sensorOperationalCorr__srcSensor____source_name_prime = "source";
		String routeOperationalCorr__trgRouteOperational____target_name_prime = "target";
		String sensorOperationalCorr__trgSensorOperational____target_name_prime = "target";
		String srcContainer__srcRoute____routes_name_prime = "routes";
		String routeRepairCorr__trgRouteRepair____target_name_prime = "target";
		String containerCorr__srcContainer____source_name_prime = "source";
		String sensorFailedCorr__trgSensorFailed____target_name_prime = "target";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr);
		isApplicableMatch.getAllContextElements().add(srcSensor);
		isApplicableMatch.getAllContextElements().add(sensorFailedCorr);
		isApplicableMatch.getAllContextElements().add(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(trgSensorFailed);
		isApplicableMatch.getAllContextElements().add(trgSensorOperational);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr);
		isApplicableMatch.getAllContextElements().add(sensorOperationalCorr);
		isApplicableMatch.getAllContextElements().add(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		sensorFailedCorr__srcSensor____source.setSrc(sensorFailedCorr);
		sensorFailedCorr__srcSensor____source.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(sensorFailedCorr__srcSensor____source);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__srcRoute____source);
		srcRoute__srcSensor____requires.setSrc(srcRoute);
		srcRoute__srcSensor____requires.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(srcRoute__srcSensor____requires);
		routeFailedCorr__trgRouteFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgRouteFailed____target.setTrg(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__trgRouteFailed____target);
		sensorOperationalCorr__srcSensor____source.setSrc(sensorOperationalCorr);
		sensorOperationalCorr__srcSensor____source.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(sensorOperationalCorr__srcSensor____source);
		routeOperationalCorr__trgRouteOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgRouteOperational____target.setTrg(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__trgRouteOperational____target);
		sensorOperationalCorr__trgSensorOperational____target.setSrc(sensorOperationalCorr);
		sensorOperationalCorr__trgSensorOperational____target.setTrg(trgSensorOperational);
		isApplicableMatch.getAllContextElements().add(sensorOperationalCorr__trgSensorOperational____target);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		routeRepairCorr__trgRouteRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRouteRepair____target.setTrg(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__trgRouteRepair____target);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		sensorFailedCorr__trgSensorFailed____target.setSrc(sensorFailedCorr);
		sensorFailedCorr__trgSensorFailed____target.setTrg(trgSensorFailed);
		isApplicableMatch.getAllContextElements().add(sensorFailedCorr__trgSensorFailed____target);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__srcRoute____source);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__srcRoute____source);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		sensorFailedCorr__srcSensor____source.setName(sensorFailedCorr__srcSensor____source_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		srcRoute__srcSensor____requires.setName(srcRoute__srcSensor____requires_name_prime);
		routeFailedCorr__trgRouteFailed____target.setName(routeFailedCorr__trgRouteFailed____target_name_prime);
		sensorOperationalCorr__srcSensor____source.setName(sensorOperationalCorr__srcSensor____source_name_prime);
		routeOperationalCorr__trgRouteOperational____target
				.setName(routeOperationalCorr__trgRouteOperational____target_name_prime);
		sensorOperationalCorr__trgSensorOperational____target
				.setName(sensorOperationalCorr__trgSensorOperational____target_name_prime);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		routeRepairCorr__trgRouteRepair____target.setName(routeRepairCorr__trgRouteRepair____target_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		sensorFailedCorr__trgSensorFailed____target.setName(sensorFailedCorr__trgSensorFailed____target_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		return new Object[] { containerCorr, routeFailedCorr, srcSensor, sensorFailedCorr, trgRouteRepair, trgPetrinet,
				routeOperationalCorr, srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational, routeRepairCorr,
				sensorOperationalCorr, trgRouteOperational, srcContainer, isApplicableMatch,
				containerCorr__trgPetrinet____target, sensorFailedCorr__srcSensor____source,
				routeOperationalCorr__srcRoute____source, srcRoute__srcSensor____requires,
				routeFailedCorr__trgRouteFailed____target, sensorOperationalCorr__srcSensor____source,
				routeOperationalCorr__trgRouteOperational____target,
				sensorOperationalCorr__trgSensorOperational____target, srcContainer__srcRoute____routes,
				routeRepairCorr__trgRouteRepair____target, containerCorr__srcContainer____source,
				sensorFailedCorr__trgSensorFailed____target, routeRepairCorr__srcRoute____source,
				routeFailedCorr__srcRoute____source };
	}

	public static final Object[] pattern_RequiredSensor_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(RequiredSensor _this,
			IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			RouteToFailed routeFailedCorr, Sensor srcSensor, SensorToFailed sensorFailedCorr, Transition trgRouteRepair,
			PetriNet trgPetrinet, RouteToOperational routeOperationalCorr, Route srcRoute, Place trgRouteFailed,
			Place trgSensorFailed, Place trgSensorOperational, RouteToRepair routeRepairCorr,
			SensorToOperational sensorOperationalCorr, Place trgRouteOperational, RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, containerCorr, routeFailedCorr,
				srcSensor, sensorFailedCorr, trgRouteRepair, trgPetrinet, routeOperationalCorr, srcRoute,
				trgRouteFailed, trgSensorFailed, trgSensorOperational, routeRepairCorr, sensorOperationalCorr,
				trgRouteOperational, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, containerCorr, routeFailedCorr, srcSensor,
					sensorFailedCorr, trgRouteRepair, trgPetrinet, routeOperationalCorr, srcRoute, trgRouteFailed,
					trgSensorFailed, trgSensorOperational, routeRepairCorr, sensorOperationalCorr, trgRouteOperational,
					srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSensor_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			RequiredSensor _this, IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			RouteToFailed routeFailedCorr, Sensor srcSensor, SensorToFailed sensorFailedCorr, Transition trgRouteRepair,
			PetriNet trgPetrinet, RouteToOperational routeOperationalCorr, Route srcRoute, Place trgRouteFailed,
			Place trgSensorFailed, Place trgSensorOperational, RouteToRepair routeRepairCorr,
			SensorToOperational sensorOperationalCorr, Place trgRouteOperational, RailwayContainer srcContainer) {
		Object[] result_pattern_RequiredSensor_2_4_solveCSP_binding = pattern_RequiredSensor_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, containerCorr, routeFailedCorr, srcSensor, sensorFailedCorr, trgRouteRepair,
				trgPetrinet, routeOperationalCorr, srcRoute, trgRouteFailed, trgSensorFailed, trgSensorOperational,
				routeRepairCorr, sensorOperationalCorr, trgRouteOperational, srcContainer);
		if (result_pattern_RequiredSensor_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSensor_2_4_solveCSP_binding[0];

			Object[] result_pattern_RequiredSensor_2_4_solveCSP_black = pattern_RequiredSensor_2_4_solveCSP_blackB(csp);
			if (result_pattern_RequiredSensor_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, containerCorr, routeFailedCorr, srcSensor,
						sensorFailedCorr, trgRouteRepair, trgPetrinet, routeOperationalCorr, srcRoute, trgRouteFailed,
						trgSensorFailed, trgSensorOperational, routeRepairCorr, sensorOperationalCorr,
						trgRouteOperational, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSensor_2_5_checkCSP_expressionFBB(RequiredSensor _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSensor_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_RequiredSensor_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "RequiredSensor";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_RequiredSensor_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RequiredSensor_10_1_preparereturnvalue_bindingFB(RequiredSensor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			RequiredSensor _this) {
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

	public static final Object[] pattern_RequiredSensor_10_1_preparereturnvalue_bindingAndBlackFFBF(
			RequiredSensor _this) {
		Object[] result_pattern_RequiredSensor_10_1_preparereturnvalue_binding = pattern_RequiredSensor_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RequiredSensor_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_RequiredSensor_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RequiredSensor_10_1_preparereturnvalue_black = pattern_RequiredSensor_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_RequiredSensor_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_RequiredSensor_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_RequiredSensor_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_RequiredSensor_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_requires) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcRoute = _edge_requires.getSrc();
		if (tmpSrcRoute instanceof Route) {
			Route srcRoute = (Route) tmpSrcRoute;
			EObject tmpSrcSensor = _edge_requires.getTrg();
			if (tmpSrcSensor instanceof Sensor) {
				Sensor srcSensor = (Sensor) tmpSrcSensor;
				if (srcRoute.getRequires().contains(srcSensor)) {
					for (RailwayContainer srcContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(srcRoute, RailwayContainer.class, "routes")) {
						_result.add(new Object[] { srcSensor, srcRoute, srcContainer, _edge_requires });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_RequiredSensor_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_RequiredSensor_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			RequiredSensor _this, Match match, Sensor srcSensor, Route srcRoute, RailwayContainer srcContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSensor, srcRoute, srcContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_RequiredSensor_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			RequiredSensor _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RequiredSensor_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_RequiredSensor_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_RequiredSensor_13_1_matchtggpattern_blackBBB(Sensor srcSensor, Route srcRoute,
			RailwayContainer srcContainer) {
		if (srcRoute.getRequires().contains(srcSensor)) {
			if (srcContainer.getRoutes().contains(srcRoute)) {
				return new Object[] { srcSensor, srcRoute, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_RequiredSensor_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RequiredSensor_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RequiredSensorImpl
