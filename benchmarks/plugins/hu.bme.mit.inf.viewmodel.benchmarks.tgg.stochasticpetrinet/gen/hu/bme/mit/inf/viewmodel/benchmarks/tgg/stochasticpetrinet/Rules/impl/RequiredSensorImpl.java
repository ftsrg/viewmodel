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
	public boolean isAppropriate_FWD(Match match, RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {

		Object[] result1_black = RequiredSensorImpl.pattern_RequiredSensor_0_1_initialbindings_blackBBBBB(this, match,
				srcContainer, srcRoute, srcSensor);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = "
					+ srcRoute + ", " + "[srcSensor] = " + srcSensor + ".");
		}

		Object[] result2_bindingAndBlack = RequiredSensorImpl.pattern_RequiredSensor_0_2_SolveCSP_bindingAndBlackFBBBBB(
				this, match, srcContainer, srcRoute, srcSensor);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = "
					+ srcRoute + ", " + "[srcSensor] = " + srcSensor + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RequiredSensorImpl.pattern_RequiredSensor_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RequiredSensorImpl
					.pattern_RequiredSensor_0_4_collectelementstobetranslated_blackBBBB(match, srcContainer, srcRoute,
							srcSensor);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = " + srcRoute + ", "
						+ "[srcSensor] = " + srcSensor + ".");
			}
			RequiredSensorImpl.pattern_RequiredSensor_0_4_collectelementstobetranslated_greenBBBF(match, srcRoute,
					srcSensor);
			//nothing EMoflonEdge srcRoute__srcSensor____requires = (EMoflonEdge) result4_green[3];

			Object[] result5_black = RequiredSensorImpl.pattern_RequiredSensor_0_5_collectcontextelements_blackBBBB(
					match, srcContainer, srcRoute, srcSensor);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcContainer] = " + srcContainer + ", " + "[srcRoute] = " + srcRoute + ", "
						+ "[srcSensor] = " + srcSensor + ".");
			}
			RequiredSensorImpl.pattern_RequiredSensor_0_5_collectcontextelements_greenBBBBF(match, srcContainer,
					srcRoute, srcSensor);
			//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result5_green[4];

			// 
			RequiredSensorImpl.pattern_RequiredSensor_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					srcContainer, srcRoute, srcSensor);
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
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[0];
		RouteToOperational routeOperationalCorr = (RouteToOperational) result1_bindingAndBlack[1];
		Place trgRouteOperational = (Place) result1_bindingAndBlack[2];
		RouteToRepair routeRepairCorr = (RouteToRepair) result1_bindingAndBlack[3];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[4];
		SensorToOperational sensorOperationalCorr = (SensorToOperational) result1_bindingAndBlack[5];
		Route srcRoute = (Route) result1_bindingAndBlack[6];
		SensorToFailed sensorFailedCorr = (SensorToFailed) result1_bindingAndBlack[7];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[8];
		Sensor srcSensor = (Sensor) result1_bindingAndBlack[9];
		Transition trgRouteRepair = (Transition) result1_bindingAndBlack[10];
		Place trgSensorOperational = (Place) result1_bindingAndBlack[11];
		Place trgSensorFailed = (Place) result1_bindingAndBlack[12];
		RouteToFailed routeFailedCorr = (RouteToFailed) result1_bindingAndBlack[13];
		Place trgRouteFailed = (Place) result1_bindingAndBlack[14];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[15];
		Object[] result1_green = RequiredSensorImpl.pattern_RequiredSensor_1_1_performtransformation_greenFFBFFBFFBFBBB(
				trgRouteOperational, trgPetrinet, trgRouteRepair, trgSensorOperational, trgSensorFailed,
				trgRouteFailed);
		Arc trgRouteRepairToSensorOperational = (Arc) result1_green[0];
		Arc trgRouteFailToSensorFailed = (Arc) result1_green[1];
		Arc trgRouteOperationalToRouteFail = (Arc) result1_green[3];
		Arc trgSensorOperationalToRouteRepair = (Arc) result1_green[4];
		Arc trgRouteFailToRouteFailed = (Arc) result1_green[6];
		ImmediateTransition trgRouteFail = (ImmediateTransition) result1_green[7];
		Arc trgSensorFailedToRouteFail = (Arc) result1_green[9];

		Object[] result2_black = RequiredSensorImpl.pattern_RequiredSensor_1_2_collecttranslatedelements_blackBBBBBBB(
				trgRouteRepairToSensorOperational, trgRouteFailToSensorFailed, trgRouteOperationalToRouteFail,
				trgSensorOperationalToRouteRepair, trgRouteFailToRouteFailed, trgRouteFail, trgSensorFailedToRouteFail);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: "
					+ "[trgRouteRepairToSensorOperational] = " + trgRouteRepairToSensorOperational + ", "
					+ "[trgRouteFailToSensorFailed] = " + trgRouteFailToSensorFailed + ", "
					+ "[trgRouteOperationalToRouteFail] = " + trgRouteOperationalToRouteFail + ", "
					+ "[trgSensorOperationalToRouteRepair] = " + trgSensorOperationalToRouteRepair + ", "
					+ "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ", " + "[trgRouteFail] = "
					+ trgRouteFail + ", " + "[trgSensorFailedToRouteFail] = " + trgSensorFailedToRouteFail + ".");
		}
		Object[] result2_green = RequiredSensorImpl.pattern_RequiredSensor_1_2_collecttranslatedelements_greenFBBBBBBB(
				trgRouteRepairToSensorOperational, trgRouteFailToSensorFailed, trgRouteOperationalToRouteFail,
				trgSensorOperationalToRouteRepair, trgRouteFailToRouteFailed, trgRouteFail, trgSensorFailedToRouteFail);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RequiredSensorImpl
				.pattern_RequiredSensor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(ruleresult,
						trgRouteRepairToSensorOperational, srcContainer, trgRouteFailToSensorFailed,
						routeOperationalCorr, trgRouteOperational, trgRouteOperationalToRouteFail, routeRepairCorr,
						trgSensorOperationalToRouteRepair, trgPetrinet, sensorOperationalCorr,
						trgRouteFailToRouteFailed, srcRoute, sensorFailedCorr, containerCorr, srcSensor, trgRouteFail,
						trgRouteRepair, trgSensorFailedToRouteFail, trgSensorOperational, trgSensorFailed,
						routeFailedCorr, trgRouteFailed);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[trgRouteRepairToSensorOperational] = " + trgRouteRepairToSensorOperational + ", "
					+ "[srcContainer] = " + srcContainer + ", " + "[trgRouteFailToSensorFailed] = "
					+ trgRouteFailToSensorFailed + ", " + "[routeOperationalCorr] = " + routeOperationalCorr + ", "
					+ "[trgRouteOperational] = " + trgRouteOperational + ", " + "[trgRouteOperationalToRouteFail] = "
					+ trgRouteOperationalToRouteFail + ", " + "[routeRepairCorr] = " + routeRepairCorr + ", "
					+ "[trgSensorOperationalToRouteRepair] = " + trgSensorOperationalToRouteRepair + ", "
					+ "[trgPetrinet] = " + trgPetrinet + ", " + "[sensorOperationalCorr] = " + sensorOperationalCorr
					+ ", " + "[trgRouteFailToRouteFailed] = " + trgRouteFailToRouteFailed + ", " + "[srcRoute] = "
					+ srcRoute + ", " + "[sensorFailedCorr] = " + sensorFailedCorr + ", " + "[containerCorr] = "
					+ containerCorr + ", " + "[srcSensor] = " + srcSensor + ", " + "[trgRouteFail] = " + trgRouteFail
					+ ", " + "[trgRouteRepair] = " + trgRouteRepair + ", " + "[trgSensorFailedToRouteFail] = "
					+ trgSensorFailedToRouteFail + ", " + "[trgSensorOperational] = " + trgSensorOperational + ", "
					+ "[trgSensorFailed] = " + trgSensorFailed + ", " + "[routeFailedCorr] = " + routeFailedCorr + ", "
					+ "[trgRouteFailed] = " + trgRouteFailed + ".");
		}
		RequiredSensorImpl.pattern_RequiredSensor_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
				ruleresult, trgRouteRepairToSensorOperational, trgRouteFailToSensorFailed, trgRouteOperational,
				trgRouteOperationalToRouteFail, trgSensorOperationalToRouteRepair, trgPetrinet,
				trgRouteFailToRouteFailed, srcRoute, srcSensor, trgRouteFail, trgRouteRepair,
				trgSensorFailedToRouteFail, trgSensorOperational, trgSensorFailed, trgRouteFailed);
		//nothing EMoflonEdge trgRouteRepairToSensorOperational__trgRouteRepair____transition = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgRouteRepair__trgRouteRepairToSensorOperational____arcs = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgSensorOperationalToRouteRepair__trgRouteRepair____transition = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgRouteRepair__trgSensorOperationalToRouteRepair____arcs = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgRouteFailToSensorFailed__trgSensorFailed____place = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge srcRoute__srcSensor____requires = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgRouteRepairToSensorOperational__trgSensorOperational____place = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgRouteFailToSensorFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToSensorFailed____arcs = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgSensorFailedToRouteFail__trgRouteFail____transition = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgRouteFail__trgSensorFailedToRouteFail____arcs = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge trgSensorOperationalToRouteRepair__trgSensorOperational____place = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgSensorFailedToRouteFail__trgSensorFailed____place = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgRouteFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgPetrinet__trgRouteFail____nodes = (EMoflonEdge) result3_green[36];

		// 
		// 
		RequiredSensorImpl.pattern_RequiredSensor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(this,
				ruleresult, trgRouteRepairToSensorOperational, srcContainer, trgRouteFailToSensorFailed,
				routeOperationalCorr, trgRouteOperational, trgRouteOperationalToRouteFail, routeRepairCorr,
				trgSensorOperationalToRouteRepair, trgPetrinet, sensorOperationalCorr, trgRouteFailToRouteFailed,
				srcRoute, sensorFailedCorr, containerCorr, srcSensor, trgRouteFail, trgRouteRepair,
				trgSensorFailedToRouteFail, trgSensorOperational, trgSensorFailed, routeFailedCorr, trgRouteFailed);
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
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[0];
		Route srcRoute = (Route) result2_binding[1];
		Sensor srcSensor = (Sensor) result2_binding[2];
		for (Object[] result2_black : RequiredSensorImpl
				.pattern_RequiredSensor_2_2_corematch_blackBFFFFFBFFBFFFFFB(srcContainer, srcRoute, srcSensor, match)) {
			RouteToOperational routeOperationalCorr = (RouteToOperational) result2_black[1];
			Place trgRouteOperational = (Place) result2_black[2];
			RouteToRepair routeRepairCorr = (RouteToRepair) result2_black[3];
			PetriNet trgPetrinet = (PetriNet) result2_black[4];
			SensorToOperational sensorOperationalCorr = (SensorToOperational) result2_black[5];
			SensorToFailed sensorFailedCorr = (SensorToFailed) result2_black[7];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[8];
			Transition trgRouteRepair = (Transition) result2_black[10];
			Place trgSensorOperational = (Place) result2_black[11];
			Place trgSensorFailed = (Place) result2_black[12];
			RouteToFailed routeFailedCorr = (RouteToFailed) result2_black[13];
			Place trgRouteFailed = (Place) result2_black[14];
			// ForEach 
			for (Object[] result3_black : RequiredSensorImpl
					.pattern_RequiredSensor_2_3_findcontext_blackBBBBBBBBBBBBBBB(srcContainer, routeOperationalCorr,
							trgRouteOperational, routeRepairCorr, trgPetrinet, sensorOperationalCorr, srcRoute,
							sensorFailedCorr, containerCorr, srcSensor, trgRouteRepair, trgSensorOperational,
							trgSensorFailed, routeFailedCorr, trgRouteFailed)) {
				Object[] result3_green = RequiredSensorImpl
						.pattern_RequiredSensor_2_3_findcontext_greenBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(srcContainer,
								routeOperationalCorr, trgRouteOperational, routeRepairCorr, trgPetrinet,
								sensorOperationalCorr, srcRoute, sensorFailedCorr, containerCorr, srcSensor,
								trgRouteRepair, trgSensorOperational, trgSensorFailed, routeFailedCorr, trgRouteFailed);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[15];
				//nothing EMoflonEdge srcContainer__srcRoute____routes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge srcRoute__srcSensor____requires = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge routeRepairCorr__srcRoute____source = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge sensorOperationalCorr__srcSensor____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge sensorFailedCorr__srcSensor____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge routeRepairCorr__trgRouteRepair____target = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge routeOperationalCorr__srcRoute____source = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge routeOperationalCorr__trgRouteOperational____target = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge sensorOperationalCorr__trgSensorOperational____target = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge sensorFailedCorr__trgSensorFailed____target = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge routeFailedCorr__trgRouteFailed____target = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge routeFailedCorr__srcRoute____source = (EMoflonEdge) result3_green[29];

				Object[] result4_bindingAndBlack = RequiredSensorImpl
						.pattern_RequiredSensor_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(this, isApplicableMatch,
								srcContainer, routeOperationalCorr, trgRouteOperational, routeRepairCorr, trgPetrinet,
								sensorOperationalCorr, srcRoute, sensorFailedCorr, containerCorr, srcSensor,
								trgRouteRepair, trgSensorOperational, trgSensorFailed, routeFailedCorr, trgRouteFailed);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[srcContainer] = " + srcContainer
							+ ", " + "[routeOperationalCorr] = " + routeOperationalCorr + ", "
							+ "[trgRouteOperational] = " + trgRouteOperational + ", " + "[routeRepairCorr] = "
							+ routeRepairCorr + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
							+ "[sensorOperationalCorr] = " + sensorOperationalCorr + ", " + "[srcRoute] = " + srcRoute
							+ ", " + "[sensorFailedCorr] = " + sensorFailedCorr + ", " + "[containerCorr] = "
							+ containerCorr + ", " + "[srcSensor] = " + srcSensor + ", " + "[trgRouteRepair] = "
							+ trgRouteRepair + ", " + "[trgSensorOperational] = " + trgSensorOperational + ", "
							+ "[trgSensorFailed] = " + trgSensorFailed + ", " + "[routeFailedCorr] = " + routeFailedCorr
							+ ", " + "[trgRouteFailed] = " + trgRouteFailed + ".");
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
	public void registerObjectsToMatch_FWD(Match match, RailwayContainer srcContainer, Route srcRoute,
			Sensor srcSensor) {
		match.registerObject("srcContainer", srcContainer);
		match.registerObject("srcRoute", srcRoute);
		match.registerObject("srcSensor", srcSensor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, RailwayContainer srcContainer, Route srcRoute,
			Sensor srcSensor) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, RailwayContainer srcContainer,
			RouteToOperational routeOperationalCorr, Place trgRouteOperational, RouteToRepair routeRepairCorr,
			PetriNet trgPetrinet, SensorToOperational sensorOperationalCorr, Route srcRoute,
			SensorToFailed sensorFailedCorr, RailwayContainerToPetriNet containerCorr, Sensor srcSensor,
			Transition trgRouteRepair, Place trgSensorOperational, Place trgSensorFailed, RouteToFailed routeFailedCorr,
			Place trgRouteFailed) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("routeOperationalCorr", routeOperationalCorr);
		isApplicableMatch.registerObject("trgRouteOperational", trgRouteOperational);
		isApplicableMatch.registerObject("routeRepairCorr", routeRepairCorr);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("sensorOperationalCorr", sensorOperationalCorr);
		isApplicableMatch.registerObject("srcRoute", srcRoute);
		isApplicableMatch.registerObject("sensorFailedCorr", sensorFailedCorr);
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("srcSensor", srcSensor);
		isApplicableMatch.registerObject("trgRouteRepair", trgRouteRepair);
		isApplicableMatch.registerObject("trgSensorOperational", trgSensorOperational);
		isApplicableMatch.registerObject("trgSensorFailed", trgSensorFailed);
		isApplicableMatch.registerObject("routeFailedCorr", routeFailedCorr);
		isApplicableMatch.registerObject("trgRouteFailed", trgRouteFailed);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgRouteRepairToSensorOperational,
			EObject srcContainer, EObject trgRouteFailToSensorFailed, EObject routeOperationalCorr,
			EObject trgRouteOperational, EObject trgRouteOperationalToRouteFail, EObject routeRepairCorr,
			EObject trgSensorOperationalToRouteRepair, EObject trgPetrinet, EObject sensorOperationalCorr,
			EObject trgRouteFailToRouteFailed, EObject srcRoute, EObject sensorFailedCorr, EObject containerCorr,
			EObject srcSensor, EObject trgRouteFail, EObject trgRouteRepair, EObject trgSensorFailedToRouteFail,
			EObject trgSensorOperational, EObject trgSensorFailed, EObject routeFailedCorr, EObject trgRouteFailed) {
		ruleresult.registerObject("trgRouteRepairToSensorOperational", trgRouteRepairToSensorOperational);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgRouteFailToSensorFailed", trgRouteFailToSensorFailed);
		ruleresult.registerObject("routeOperationalCorr", routeOperationalCorr);
		ruleresult.registerObject("trgRouteOperational", trgRouteOperational);
		ruleresult.registerObject("trgRouteOperationalToRouteFail", trgRouteOperationalToRouteFail);
		ruleresult.registerObject("routeRepairCorr", routeRepairCorr);
		ruleresult.registerObject("trgSensorOperationalToRouteRepair", trgSensorOperationalToRouteRepair);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("sensorOperationalCorr", sensorOperationalCorr);
		ruleresult.registerObject("trgRouteFailToRouteFailed", trgRouteFailToRouteFailed);
		ruleresult.registerObject("srcRoute", srcRoute);
		ruleresult.registerObject("sensorFailedCorr", sensorFailedCorr);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("srcSensor", srcSensor);
		ruleresult.registerObject("trgRouteFail", trgRouteFail);
		ruleresult.registerObject("trgRouteRepair", trgRouteRepair);
		ruleresult.registerObject("trgSensorFailedToRouteFail", trgSensorFailedToRouteFail);
		ruleresult.registerObject("trgSensorOperational", trgSensorOperational);
		ruleresult.registerObject("trgSensorFailed", trgSensorFailed);
		ruleresult.registerObject("routeFailedCorr", routeFailedCorr);
		ruleresult.registerObject("trgRouteFailed", trgRouteFailed);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1(EMoflonEdge _edge_requires) {

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
			RailwayContainer srcContainer = (RailwayContainer) result2_black[0];
			Route srcRoute = (Route) result2_black[1];
			Sensor srcSensor = (Sensor) result2_black[2];
			Object[] result2_green = RequiredSensorImpl
					.pattern_RequiredSensor_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RequiredSensorImpl
					.pattern_RequiredSensor_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
							srcContainer, srcRoute, srcSensor)) {
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

		if (!__helper.hasExpectedValue("trgRouteRepairToSensorOperational", "kind", ArcKind.OUTPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToSensorFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteOperationalToRouteFail", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSensorOperationalToRouteRepair", "kind", ArcKind.INPUT,
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRouteFailToRouteFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgSensorFailedToRouteFail", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
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
	public boolean checkDEC_FWD(RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {// 
		Object[] result1_black = RequiredSensorImpl.pattern_RequiredSensor_13_1_matchtggpattern_blackBBB(srcContainer,
				srcRoute, srcSensor);
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
		case RulesPackage.REQUIRED_SENSOR___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SENSOR:
			return isAppropriate_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Route) arguments.get(2), (Sensor) arguments.get(3));
		case RulesPackage.REQUIRED_SENSOR___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SENSOR:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Route) arguments.get(2), (Sensor) arguments.get(3));
			return null;
		case RulesPackage.REQUIRED_SENSOR___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER_ROUTE_SENSOR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (RailwayContainer) arguments.get(1),
					(Route) arguments.get(2), (Sensor) arguments.get(3));
		case RulesPackage.REQUIRED_SENSOR___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINER_ROUTETOOPERATIONAL_PLACE_ROUTETOREPAIR_PETRINET_SENSORTOOPERATIONAL_ROUTE_SENSORTOFAILED_RAILWAYCONTAINERTOPETRINET_SENSOR_TRANSITION_PLACE_PLACE_ROUTETOFAILED_PLACE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (RailwayContainer) arguments.get(1),
					(RouteToOperational) arguments.get(2), (Place) arguments.get(3), (RouteToRepair) arguments.get(4),
					(PetriNet) arguments.get(5), (SensorToOperational) arguments.get(6), (Route) arguments.get(7),
					(SensorToFailed) arguments.get(8), (RailwayContainerToPetriNet) arguments.get(9),
					(Sensor) arguments.get(10), (Transition) arguments.get(11), (Place) arguments.get(12),
					(Place) arguments.get(13), (RouteToFailed) arguments.get(14), (Place) arguments.get(15));
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
		case RulesPackage.REQUIRED_SENSOR___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_1((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQUIRED_SENSOR___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQUIRED_SENSOR___CHECK_DEC_FWD__RAILWAYCONTAINER_ROUTE_SENSOR:
			return checkDEC_FWD((RailwayContainer) arguments.get(0), (Route) arguments.get(1),
					(Sensor) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RequiredSensor_0_1_initialbindings_blackBBBBB(RequiredSensor _this,
			Match match, RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {
		return new Object[] { _this, match, srcContainer, srcRoute, srcSensor };
	}

	public static final Object[] pattern_RequiredSensor_0_2_SolveCSP_bindingFBBBBB(RequiredSensor _this, Match match,
			RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcContainer, srcRoute, srcSensor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcContainer, srcRoute, srcSensor };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSensor_0_2_SolveCSP_bindingAndBlackFBBBBB(RequiredSensor _this,
			Match match, RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {
		Object[] result_pattern_RequiredSensor_0_2_SolveCSP_binding = pattern_RequiredSensor_0_2_SolveCSP_bindingFBBBBB(
				_this, match, srcContainer, srcRoute, srcSensor);
		if (result_pattern_RequiredSensor_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSensor_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RequiredSensor_0_2_SolveCSP_black = pattern_RequiredSensor_0_2_SolveCSP_blackB(csp);
			if (result_pattern_RequiredSensor_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcContainer, srcRoute, srcSensor };
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
			RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {
		return new Object[] { match, srcContainer, srcRoute, srcSensor };
	}

	public static final Object[] pattern_RequiredSensor_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Route srcRoute, Sensor srcSensor) {
		EMoflonEdge srcRoute__srcSensor____requires = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRoute__srcSensor____requires_name_prime = "requires";
		srcRoute__srcSensor____requires.setSrc(srcRoute);
		srcRoute__srcSensor____requires.setTrg(srcSensor);
		match.getToBeTranslatedEdges().add(srcRoute__srcSensor____requires);
		srcRoute__srcSensor____requires.setName(srcRoute__srcSensor____requires_name_prime);
		return new Object[] { match, srcRoute, srcSensor, srcRoute__srcSensor____requires };
	}

	public static final Object[] pattern_RequiredSensor_0_5_collectcontextelements_blackBBBB(Match match,
			RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {
		return new Object[] { match, srcContainer, srcRoute, srcSensor };
	}

	public static final Object[] pattern_RequiredSensor_0_5_collectcontextelements_greenBBBBF(Match match,
			RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcContainer);
		match.getContextNodes().add(srcRoute);
		match.getContextNodes().add(srcSensor);
		String srcContainer__srcRoute____routes_name_prime = "routes";
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		match.getContextEdges().add(srcContainer__srcRoute____routes);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		return new Object[] { match, srcContainer, srcRoute, srcSensor, srcContainer__srcRoute____routes };
	}

	public static final void pattern_RequiredSensor_0_6_registerobjectstomatch_expressionBBBBB(RequiredSensor _this,
			Match match, RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {
		_this.registerObjectsToMatch_FWD(match, srcContainer, srcRoute, srcSensor);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("routeOperationalCorr");
		EObject _localVariable_2 = isApplicableMatch.getObject("trgRouteOperational");
		EObject _localVariable_3 = isApplicableMatch.getObject("routeRepairCorr");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_5 = isApplicableMatch.getObject("sensorOperationalCorr");
		EObject _localVariable_6 = isApplicableMatch.getObject("srcRoute");
		EObject _localVariable_7 = isApplicableMatch.getObject("sensorFailedCorr");
		EObject _localVariable_8 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_9 = isApplicableMatch.getObject("srcSensor");
		EObject _localVariable_10 = isApplicableMatch.getObject("trgRouteRepair");
		EObject _localVariable_11 = isApplicableMatch.getObject("trgSensorOperational");
		EObject _localVariable_12 = isApplicableMatch.getObject("trgSensorFailed");
		EObject _localVariable_13 = isApplicableMatch.getObject("routeFailedCorr");
		EObject _localVariable_14 = isApplicableMatch.getObject("trgRouteFailed");
		EObject tmpSrcContainer = _localVariable_0;
		EObject tmpRouteOperationalCorr = _localVariable_1;
		EObject tmpTrgRouteOperational = _localVariable_2;
		EObject tmpRouteRepairCorr = _localVariable_3;
		EObject tmpTrgPetrinet = _localVariable_4;
		EObject tmpSensorOperationalCorr = _localVariable_5;
		EObject tmpSrcRoute = _localVariable_6;
		EObject tmpSensorFailedCorr = _localVariable_7;
		EObject tmpContainerCorr = _localVariable_8;
		EObject tmpSrcSensor = _localVariable_9;
		EObject tmpTrgRouteRepair = _localVariable_10;
		EObject tmpTrgSensorOperational = _localVariable_11;
		EObject tmpTrgSensorFailed = _localVariable_12;
		EObject tmpRouteFailedCorr = _localVariable_13;
		EObject tmpTrgRouteFailed = _localVariable_14;
		if (tmpSrcContainer instanceof RailwayContainer) {
			RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
			if (tmpRouteOperationalCorr instanceof RouteToOperational) {
				RouteToOperational routeOperationalCorr = (RouteToOperational) tmpRouteOperationalCorr;
				if (tmpTrgRouteOperational instanceof Place) {
					Place trgRouteOperational = (Place) tmpTrgRouteOperational;
					if (tmpRouteRepairCorr instanceof RouteToRepair) {
						RouteToRepair routeRepairCorr = (RouteToRepair) tmpRouteRepairCorr;
						if (tmpTrgPetrinet instanceof PetriNet) {
							PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
							if (tmpSensorOperationalCorr instanceof SensorToOperational) {
								SensorToOperational sensorOperationalCorr = (SensorToOperational) tmpSensorOperationalCorr;
								if (tmpSrcRoute instanceof Route) {
									Route srcRoute = (Route) tmpSrcRoute;
									if (tmpSensorFailedCorr instanceof SensorToFailed) {
										SensorToFailed sensorFailedCorr = (SensorToFailed) tmpSensorFailedCorr;
										if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
											RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
											if (tmpSrcSensor instanceof Sensor) {
												Sensor srcSensor = (Sensor) tmpSrcSensor;
												if (tmpTrgRouteRepair instanceof Transition) {
													Transition trgRouteRepair = (Transition) tmpTrgRouteRepair;
													if (tmpTrgSensorOperational instanceof Place) {
														Place trgSensorOperational = (Place) tmpTrgSensorOperational;
														if (tmpTrgSensorFailed instanceof Place) {
															Place trgSensorFailed = (Place) tmpTrgSensorFailed;
															if (tmpRouteFailedCorr instanceof RouteToFailed) {
																RouteToFailed routeFailedCorr = (RouteToFailed) tmpRouteFailedCorr;
																if (tmpTrgRouteFailed instanceof Place) {
																	Place trgRouteFailed = (Place) tmpTrgRouteFailed;
																	return new Object[] { srcContainer,
																			routeOperationalCorr, trgRouteOperational,
																			routeRepairCorr, trgPetrinet,
																			sensorOperationalCorr, srcRoute,
																			sensorFailedCorr, containerCorr, srcSensor,
																			trgRouteRepair, trgSensorOperational,
																			trgSensorFailed, routeFailedCorr,
																			trgRouteFailed, isApplicableMatch };
																}
															}
														}
													}
												}
											}
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
			RailwayContainer srcContainer, RouteToOperational routeOperationalCorr, Place trgRouteOperational,
			RouteToRepair routeRepairCorr, PetriNet trgPetrinet, SensorToOperational sensorOperationalCorr,
			Route srcRoute, SensorToFailed sensorFailedCorr, RailwayContainerToPetriNet containerCorr, Sensor srcSensor,
			Transition trgRouteRepair, Place trgSensorOperational, Place trgSensorFailed, RouteToFailed routeFailedCorr,
			Place trgRouteFailed, RequiredSensor _this, IsApplicableMatch isApplicableMatch) {
		if (!trgRouteOperational.equals(trgSensorOperational)) {
			if (!trgRouteOperational.equals(trgSensorFailed)) {
				if (!trgSensorFailed.equals(trgSensorOperational)) {
					if (!trgRouteFailed.equals(trgRouteOperational)) {
						if (!trgRouteFailed.equals(trgSensorOperational)) {
							if (!trgRouteFailed.equals(trgSensorFailed)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { srcContainer, routeOperationalCorr, trgRouteOperational,
												routeRepairCorr, trgPetrinet, sensorOperationalCorr, srcRoute,
												sensorFailedCorr, containerCorr, srcSensor, trgRouteRepair,
												trgSensorOperational, trgSensorFailed, routeFailedCorr, trgRouteFailed,
												csp, _this, isApplicableMatch };
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
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_RequiredSensor_1_1_performtransformation_binding[0];
			RouteToOperational routeOperationalCorr = (RouteToOperational) result_pattern_RequiredSensor_1_1_performtransformation_binding[1];
			Place trgRouteOperational = (Place) result_pattern_RequiredSensor_1_1_performtransformation_binding[2];
			RouteToRepair routeRepairCorr = (RouteToRepair) result_pattern_RequiredSensor_1_1_performtransformation_binding[3];
			PetriNet trgPetrinet = (PetriNet) result_pattern_RequiredSensor_1_1_performtransformation_binding[4];
			SensorToOperational sensorOperationalCorr = (SensorToOperational) result_pattern_RequiredSensor_1_1_performtransformation_binding[5];
			Route srcRoute = (Route) result_pattern_RequiredSensor_1_1_performtransformation_binding[6];
			SensorToFailed sensorFailedCorr = (SensorToFailed) result_pattern_RequiredSensor_1_1_performtransformation_binding[7];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_RequiredSensor_1_1_performtransformation_binding[8];
			Sensor srcSensor = (Sensor) result_pattern_RequiredSensor_1_1_performtransformation_binding[9];
			Transition trgRouteRepair = (Transition) result_pattern_RequiredSensor_1_1_performtransformation_binding[10];
			Place trgSensorOperational = (Place) result_pattern_RequiredSensor_1_1_performtransformation_binding[11];
			Place trgSensorFailed = (Place) result_pattern_RequiredSensor_1_1_performtransformation_binding[12];
			RouteToFailed routeFailedCorr = (RouteToFailed) result_pattern_RequiredSensor_1_1_performtransformation_binding[13];
			Place trgRouteFailed = (Place) result_pattern_RequiredSensor_1_1_performtransformation_binding[14];

			Object[] result_pattern_RequiredSensor_1_1_performtransformation_black = pattern_RequiredSensor_1_1_performtransformation_blackBBBBBBBBBBBBBBBFBB(
					srcContainer, routeOperationalCorr, trgRouteOperational, routeRepairCorr, trgPetrinet,
					sensorOperationalCorr, srcRoute, sensorFailedCorr, containerCorr, srcSensor, trgRouteRepair,
					trgSensorOperational, trgSensorFailed, routeFailedCorr, trgRouteFailed, _this, isApplicableMatch);
			if (result_pattern_RequiredSensor_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RequiredSensor_1_1_performtransformation_black[15];

				return new Object[] { srcContainer, routeOperationalCorr, trgRouteOperational, routeRepairCorr,
						trgPetrinet, sensorOperationalCorr, srcRoute, sensorFailedCorr, containerCorr, srcSensor,
						trgRouteRepair, trgSensorOperational, trgSensorFailed, routeFailedCorr, trgRouteFailed, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_1_1_performtransformation_greenFFBFFBFFBFBBB(
			Place trgRouteOperational, PetriNet trgPetrinet, Transition trgRouteRepair, Place trgSensorOperational,
			Place trgSensorFailed, Place trgRouteFailed) {
		Arc trgRouteRepairToSensorOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToSensorFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteOperationalToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgSensorOperationalToRouteRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgRouteFailToRouteFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		ImmediateTransition trgRouteFail = StochasticPetriNetFactory.eINSTANCE.createImmediateTransition();
		Arc trgSensorFailedToRouteFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		ArcKind trgRouteRepairToSensorOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteFailToSensorFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgRouteOperationalToRouteFail_kind_prime = ArcKind.INPUT;
		ArcKind trgSensorOperationalToRouteRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgRouteFailToRouteFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgSensorFailedToRouteFail_kind_prime = ArcKind.INPUT;
		trgRouteRepairToSensorOperational.setTransition(trgRouteRepair);
		trgRouteRepairToSensorOperational.setPlace(trgSensorOperational);
		trgRouteFailToSensorFailed.setPlace(trgSensorFailed);
		trgRouteOperationalToRouteFail.setPlace(trgRouteOperational);
		trgSensorOperationalToRouteRepair.setTransition(trgRouteRepair);
		trgSensorOperationalToRouteRepair.setPlace(trgSensorOperational);
		trgRouteFailToRouteFailed.setPlace(trgRouteFailed);
		trgRouteOperationalToRouteFail.setTransition(trgRouteFail);
		trgRouteFailToSensorFailed.setTransition(trgRouteFail);
		trgRouteFailToRouteFailed.setTransition(trgRouteFail);
		trgRouteFail.setPetriNet(trgPetrinet);
		trgSensorFailedToRouteFail.setTransition(trgRouteFail);
		trgSensorFailedToRouteFail.setPlace(trgSensorFailed);
		trgRouteRepairToSensorOperational.setKind(trgRouteRepairToSensorOperational_kind_prime);
		trgRouteFailToSensorFailed.setKind(trgRouteFailToSensorFailed_kind_prime);
		trgRouteOperationalToRouteFail.setKind(trgRouteOperationalToRouteFail_kind_prime);
		trgSensorOperationalToRouteRepair.setKind(trgSensorOperationalToRouteRepair_kind_prime);
		trgRouteFailToRouteFailed.setKind(trgRouteFailToRouteFailed_kind_prime);
		trgSensorFailedToRouteFail.setKind(trgSensorFailedToRouteFail_kind_prime);
		return new Object[] { trgRouteRepairToSensorOperational, trgRouteFailToSensorFailed, trgRouteOperational,
				trgRouteOperationalToRouteFail, trgSensorOperationalToRouteRepair, trgPetrinet,
				trgRouteFailToRouteFailed, trgRouteFail, trgRouteRepair, trgSensorFailedToRouteFail,
				trgSensorOperational, trgSensorFailed, trgRouteFailed };
	}

	public static final Object[] pattern_RequiredSensor_1_2_collecttranslatedelements_blackBBBBBBB(
			Arc trgRouteRepairToSensorOperational, Arc trgRouteFailToSensorFailed, Arc trgRouteOperationalToRouteFail,
			Arc trgSensorOperationalToRouteRepair, Arc trgRouteFailToRouteFailed, ImmediateTransition trgRouteFail,
			Arc trgSensorFailedToRouteFail) {
		if (!trgRouteRepairToSensorOperational.equals(trgSensorOperationalToRouteRepair)) {
			if (!trgRouteRepairToSensorOperational.equals(trgSensorFailedToRouteFail)) {
				if (!trgRouteFailToSensorFailed.equals(trgRouteRepairToSensorOperational)) {
					if (!trgRouteFailToSensorFailed.equals(trgRouteOperationalToRouteFail)) {
						if (!trgRouteFailToSensorFailed.equals(trgSensorOperationalToRouteRepair)) {
							if (!trgRouteFailToSensorFailed.equals(trgSensorFailedToRouteFail)) {
								if (!trgRouteOperationalToRouteFail.equals(trgRouteRepairToSensorOperational)) {
									if (!trgRouteOperationalToRouteFail.equals(trgSensorOperationalToRouteRepair)) {
										if (!trgRouteOperationalToRouteFail.equals(trgSensorFailedToRouteFail)) {
											if (!trgRouteFailToRouteFailed.equals(trgRouteRepairToSensorOperational)) {
												if (!trgRouteFailToRouteFailed.equals(trgRouteFailToSensorFailed)) {
													if (!trgRouteFailToRouteFailed
															.equals(trgRouteOperationalToRouteFail)) {
														if (!trgRouteFailToRouteFailed
																.equals(trgSensorOperationalToRouteRepair)) {
															if (!trgRouteFailToRouteFailed
																	.equals(trgSensorFailedToRouteFail)) {
																if (!trgSensorFailedToRouteFail
																		.equals(trgSensorOperationalToRouteRepair)) {
																	return new Object[] {
																			trgRouteRepairToSensorOperational,
																			trgRouteFailToSensorFailed,
																			trgRouteOperationalToRouteFail,
																			trgSensorOperationalToRouteRepair,
																			trgRouteFailToRouteFailed, trgRouteFail,
																			trgSensorFailedToRouteFail };
																}
															}
														}
													}
												}
											}
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
			Arc trgRouteRepairToSensorOperational, Arc trgRouteFailToSensorFailed, Arc trgRouteOperationalToRouteFail,
			Arc trgSensorOperationalToRouteRepair, Arc trgRouteFailToRouteFailed, ImmediateTransition trgRouteFail,
			Arc trgSensorFailedToRouteFail) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgRouteRepairToSensorOperational);
		ruleresult.getCreatedElements().add(trgRouteFailToSensorFailed);
		ruleresult.getCreatedElements().add(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedElements().add(trgSensorOperationalToRouteRepair);
		ruleresult.getCreatedElements().add(trgRouteFailToRouteFailed);
		ruleresult.getCreatedElements().add(trgRouteFail);
		ruleresult.getCreatedElements().add(trgSensorFailedToRouteFail);
		return new Object[] { ruleresult, trgRouteRepairToSensorOperational, trgRouteFailToSensorFailed,
				trgRouteOperationalToRouteFail, trgSensorOperationalToRouteRepair, trgRouteFailToRouteFailed,
				trgRouteFail, trgSensorFailedToRouteFail };
	}

	public static final Object[] pattern_RequiredSensor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject trgRouteRepairToSensorOperational, EObject srcContainer,
			EObject trgRouteFailToSensorFailed, EObject routeOperationalCorr, EObject trgRouteOperational,
			EObject trgRouteOperationalToRouteFail, EObject routeRepairCorr, EObject trgSensorOperationalToRouteRepair,
			EObject trgPetrinet, EObject sensorOperationalCorr, EObject trgRouteFailToRouteFailed, EObject srcRoute,
			EObject sensorFailedCorr, EObject containerCorr, EObject srcSensor, EObject trgRouteFail,
			EObject trgRouteRepair, EObject trgSensorFailedToRouteFail, EObject trgSensorOperational,
			EObject trgSensorFailed, EObject routeFailedCorr, EObject trgRouteFailed) {
		if (!trgRouteRepairToSensorOperational.equals(trgSensorOperationalToRouteRepair)) {
			if (!trgRouteRepairToSensorOperational.equals(trgSensorFailedToRouteFail)) {
				if (!trgRouteRepairToSensorOperational.equals(trgSensorOperational)) {
					if (!trgRouteRepairToSensorOperational.equals(trgSensorFailed)) {
						if (!srcContainer.equals(trgRouteRepairToSensorOperational)) {
							if (!srcContainer.equals(trgRouteFailToSensorFailed)) {
								if (!srcContainer.equals(trgRouteOperational)) {
									if (!srcContainer.equals(trgRouteOperationalToRouteFail)) {
										if (!srcContainer.equals(trgSensorOperationalToRouteRepair)) {
											if (!srcContainer.equals(trgPetrinet)) {
												if (!srcContainer.equals(trgRouteFailToRouteFailed)) {
													if (!srcContainer.equals(srcRoute)) {
														if (!srcContainer.equals(srcSensor)) {
															if (!srcContainer.equals(trgRouteFail)) {
																if (!srcContainer.equals(trgRouteRepair)) {
																	if (!srcContainer
																			.equals(trgSensorFailedToRouteFail)) {
																		if (!srcContainer
																				.equals(trgSensorOperational)) {
																			if (!srcContainer.equals(trgSensorFailed)) {
																				if (!srcContainer
																						.equals(trgRouteFailed)) {
																					if (!trgRouteFailToSensorFailed
																							.equals(trgRouteRepairToSensorOperational)) {
																						if (!trgRouteFailToSensorFailed
																								.equals(trgRouteOperational)) {
																							if (!trgRouteFailToSensorFailed
																									.equals(trgRouteOperationalToRouteFail)) {
																								if (!trgRouteFailToSensorFailed
																										.equals(trgSensorOperationalToRouteRepair)) {
																									if (!trgRouteFailToSensorFailed
																											.equals(trgRouteRepair)) {
																										if (!trgRouteFailToSensorFailed
																												.equals(trgSensorFailedToRouteFail)) {
																											if (!trgRouteFailToSensorFailed
																													.equals(trgSensorOperational)) {
																												if (!trgRouteFailToSensorFailed
																														.equals(trgSensorFailed)) {
																													if (!trgRouteFailToSensorFailed
																															.equals(trgRouteFailed)) {
																														if (!routeOperationalCorr
																																.equals(trgRouteRepairToSensorOperational)) {
																															if (!routeOperationalCorr
																																	.equals(srcContainer)) {
																																if (!routeOperationalCorr
																																		.equals(trgRouteFailToSensorFailed)) {
																																	if (!routeOperationalCorr
																																			.equals(trgRouteOperational)) {
																																		if (!routeOperationalCorr
																																				.equals(trgRouteOperationalToRouteFail)) {
																																			if (!routeOperationalCorr
																																					.equals(routeRepairCorr)) {
																																				if (!routeOperationalCorr
																																						.equals(trgSensorOperationalToRouteRepair)) {
																																					if (!routeOperationalCorr
																																							.equals(trgPetrinet)) {
																																						if (!routeOperationalCorr
																																								.equals(sensorOperationalCorr)) {
																																							if (!routeOperationalCorr
																																									.equals(trgRouteFailToRouteFailed)) {
																																								if (!routeOperationalCorr
																																										.equals(srcRoute)) {
																																									if (!routeOperationalCorr
																																											.equals(sensorFailedCorr)) {
																																										if (!routeOperationalCorr
																																												.equals(srcSensor)) {
																																											if (!routeOperationalCorr
																																													.equals(trgRouteFail)) {
																																												if (!routeOperationalCorr
																																														.equals(trgRouteRepair)) {
																																													if (!routeOperationalCorr
																																															.equals(trgSensorFailedToRouteFail)) {
																																														if (!routeOperationalCorr
																																																.equals(trgSensorOperational)) {
																																															if (!routeOperationalCorr
																																																	.equals(trgSensorFailed)) {
																																																if (!routeOperationalCorr
																																																		.equals(trgRouteFailed)) {
																																																	if (!trgRouteOperational
																																																			.equals(trgRouteRepairToSensorOperational)) {
																																																		if (!trgRouteOperational
																																																				.equals(trgRouteOperationalToRouteFail)) {
																																																			if (!trgRouteOperational
																																																					.equals(trgSensorOperationalToRouteRepair)) {
																																																				if (!trgRouteOperational
																																																						.equals(trgRouteRepair)) {
																																																					if (!trgRouteOperational
																																																							.equals(trgSensorFailedToRouteFail)) {
																																																						if (!trgRouteOperational
																																																								.equals(trgSensorOperational)) {
																																																							if (!trgRouteOperational
																																																									.equals(trgSensorFailed)) {
																																																								if (!trgRouteOperationalToRouteFail
																																																										.equals(trgRouteRepairToSensorOperational)) {
																																																									if (!trgRouteOperationalToRouteFail
																																																											.equals(trgSensorOperationalToRouteRepair)) {
																																																										if (!trgRouteOperationalToRouteFail
																																																												.equals(trgRouteRepair)) {
																																																											if (!trgRouteOperationalToRouteFail
																																																													.equals(trgSensorFailedToRouteFail)) {
																																																												if (!trgRouteOperationalToRouteFail
																																																														.equals(trgSensorOperational)) {
																																																													if (!trgRouteOperationalToRouteFail
																																																															.equals(trgSensorFailed)) {
																																																														if (!routeRepairCorr
																																																																.equals(trgRouteRepairToSensorOperational)) {
																																																															if (!routeRepairCorr
																																																																	.equals(srcContainer)) {
																																																																if (!routeRepairCorr
																																																																		.equals(trgRouteFailToSensorFailed)) {
																																																																	if (!routeRepairCorr
																																																																			.equals(trgRouteOperational)) {
																																																																		if (!routeRepairCorr
																																																																				.equals(trgRouteOperationalToRouteFail)) {
																																																																			if (!routeRepairCorr
																																																																					.equals(trgSensorOperationalToRouteRepair)) {
																																																																				if (!routeRepairCorr
																																																																						.equals(trgPetrinet)) {
																																																																					if (!routeRepairCorr
																																																																							.equals(sensorOperationalCorr)) {
																																																																						if (!routeRepairCorr
																																																																								.equals(trgRouteFailToRouteFailed)) {
																																																																							if (!routeRepairCorr
																																																																									.equals(srcRoute)) {
																																																																								if (!routeRepairCorr
																																																																										.equals(sensorFailedCorr)) {
																																																																									if (!routeRepairCorr
																																																																											.equals(srcSensor)) {
																																																																										if (!routeRepairCorr
																																																																												.equals(trgRouteFail)) {
																																																																											if (!routeRepairCorr
																																																																													.equals(trgRouteRepair)) {
																																																																												if (!routeRepairCorr
																																																																														.equals(trgSensorFailedToRouteFail)) {
																																																																													if (!routeRepairCorr
																																																																															.equals(trgSensorOperational)) {
																																																																														if (!routeRepairCorr
																																																																																.equals(trgSensorFailed)) {
																																																																															if (!routeRepairCorr
																																																																																	.equals(trgRouteFailed)) {
																																																																																if (!trgPetrinet
																																																																																		.equals(trgRouteRepairToSensorOperational)) {
																																																																																	if (!trgPetrinet
																																																																																			.equals(trgRouteFailToSensorFailed)) {
																																																																																		if (!trgPetrinet
																																																																																				.equals(trgRouteOperational)) {
																																																																																			if (!trgPetrinet
																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																				if (!trgPetrinet
																																																																																						.equals(trgSensorOperationalToRouteRepair)) {
																																																																																					if (!trgPetrinet
																																																																																							.equals(trgRouteFailToRouteFailed)) {
																																																																																						if (!trgPetrinet
																																																																																								.equals(trgRouteFail)) {
																																																																																							if (!trgPetrinet
																																																																																									.equals(trgRouteRepair)) {
																																																																																								if (!trgPetrinet
																																																																																										.equals(trgSensorFailedToRouteFail)) {
																																																																																									if (!trgPetrinet
																																																																																											.equals(trgSensorOperational)) {
																																																																																										if (!trgPetrinet
																																																																																												.equals(trgSensorFailed)) {
																																																																																											if (!trgPetrinet
																																																																																													.equals(trgRouteFailed)) {
																																																																																												if (!sensorOperationalCorr
																																																																																														.equals(trgRouteRepairToSensorOperational)) {
																																																																																													if (!sensorOperationalCorr
																																																																																															.equals(srcContainer)) {
																																																																																														if (!sensorOperationalCorr
																																																																																																.equals(trgRouteFailToSensorFailed)) {
																																																																																															if (!sensorOperationalCorr
																																																																																																	.equals(trgRouteOperational)) {
																																																																																																if (!sensorOperationalCorr
																																																																																																		.equals(trgRouteOperationalToRouteFail)) {
																																																																																																	if (!sensorOperationalCorr
																																																																																																			.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																		if (!sensorOperationalCorr
																																																																																																				.equals(trgPetrinet)) {
																																																																																																			if (!sensorOperationalCorr
																																																																																																					.equals(trgRouteFailToRouteFailed)) {
																																																																																																				if (!sensorOperationalCorr
																																																																																																						.equals(srcRoute)) {
																																																																																																					if (!sensorOperationalCorr
																																																																																																							.equals(srcSensor)) {
																																																																																																						if (!sensorOperationalCorr
																																																																																																								.equals(trgRouteFail)) {
																																																																																																							if (!sensorOperationalCorr
																																																																																																									.equals(trgRouteRepair)) {
																																																																																																								if (!sensorOperationalCorr
																																																																																																										.equals(trgSensorFailedToRouteFail)) {
																																																																																																									if (!sensorOperationalCorr
																																																																																																											.equals(trgSensorOperational)) {
																																																																																																										if (!sensorOperationalCorr
																																																																																																												.equals(trgSensorFailed)) {
																																																																																																											if (!sensorOperationalCorr
																																																																																																													.equals(trgRouteFailed)) {
																																																																																																												if (!trgRouteFailToRouteFailed
																																																																																																														.equals(trgRouteRepairToSensorOperational)) {
																																																																																																													if (!trgRouteFailToRouteFailed
																																																																																																															.equals(trgRouteFailToSensorFailed)) {
																																																																																																														if (!trgRouteFailToRouteFailed
																																																																																																																.equals(trgRouteOperational)) {
																																																																																																															if (!trgRouteFailToRouteFailed
																																																																																																																	.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																if (!trgRouteFailToRouteFailed
																																																																																																																		.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																	if (!trgRouteFailToRouteFailed
																																																																																																																			.equals(trgRouteRepair)) {
																																																																																																																		if (!trgRouteFailToRouteFailed
																																																																																																																				.equals(trgSensorFailedToRouteFail)) {
																																																																																																																			if (!trgRouteFailToRouteFailed
																																																																																																																					.equals(trgSensorOperational)) {
																																																																																																																				if (!trgRouteFailToRouteFailed
																																																																																																																						.equals(trgSensorFailed)) {
																																																																																																																					if (!trgRouteFailToRouteFailed
																																																																																																																							.equals(trgRouteFailed)) {
																																																																																																																						if (!srcRoute
																																																																																																																								.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																							if (!srcRoute
																																																																																																																									.equals(trgRouteFailToSensorFailed)) {
																																																																																																																								if (!srcRoute
																																																																																																																										.equals(trgRouteOperational)) {
																																																																																																																									if (!srcRoute
																																																																																																																											.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																										if (!srcRoute
																																																																																																																												.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																											if (!srcRoute
																																																																																																																													.equals(trgPetrinet)) {
																																																																																																																												if (!srcRoute
																																																																																																																														.equals(trgRouteFailToRouteFailed)) {
																																																																																																																													if (!srcRoute
																																																																																																																															.equals(srcSensor)) {
																																																																																																																														if (!srcRoute
																																																																																																																																.equals(trgRouteFail)) {
																																																																																																																															if (!srcRoute
																																																																																																																																	.equals(trgRouteRepair)) {
																																																																																																																																if (!srcRoute
																																																																																																																																		.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																	if (!srcRoute
																																																																																																																																			.equals(trgSensorOperational)) {
																																																																																																																																		if (!srcRoute
																																																																																																																																				.equals(trgSensorFailed)) {
																																																																																																																																			if (!srcRoute
																																																																																																																																					.equals(trgRouteFailed)) {
																																																																																																																																				if (!sensorFailedCorr
																																																																																																																																						.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																					if (!sensorFailedCorr
																																																																																																																																							.equals(srcContainer)) {
																																																																																																																																						if (!sensorFailedCorr
																																																																																																																																								.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																							if (!sensorFailedCorr
																																																																																																																																									.equals(trgRouteOperational)) {
																																																																																																																																								if (!sensorFailedCorr
																																																																																																																																										.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																									if (!sensorFailedCorr
																																																																																																																																											.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																										if (!sensorFailedCorr
																																																																																																																																												.equals(trgPetrinet)) {
																																																																																																																																											if (!sensorFailedCorr
																																																																																																																																													.equals(sensorOperationalCorr)) {
																																																																																																																																												if (!sensorFailedCorr
																																																																																																																																														.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																													if (!sensorFailedCorr
																																																																																																																																															.equals(srcRoute)) {
																																																																																																																																														if (!sensorFailedCorr
																																																																																																																																																.equals(srcSensor)) {
																																																																																																																																															if (!sensorFailedCorr
																																																																																																																																																	.equals(trgRouteFail)) {
																																																																																																																																																if (!sensorFailedCorr
																																																																																																																																																		.equals(trgRouteRepair)) {
																																																																																																																																																	if (!sensorFailedCorr
																																																																																																																																																			.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																		if (!sensorFailedCorr
																																																																																																																																																				.equals(trgSensorOperational)) {
																																																																																																																																																			if (!sensorFailedCorr
																																																																																																																																																					.equals(trgSensorFailed)) {
																																																																																																																																																				if (!sensorFailedCorr
																																																																																																																																																						.equals(trgRouteFailed)) {
																																																																																																																																																					if (!containerCorr
																																																																																																																																																							.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																						if (!containerCorr
																																																																																																																																																								.equals(srcContainer)) {
																																																																																																																																																							if (!containerCorr
																																																																																																																																																									.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																								if (!containerCorr
																																																																																																																																																										.equals(routeOperationalCorr)) {
																																																																																																																																																									if (!containerCorr
																																																																																																																																																											.equals(trgRouteOperational)) {
																																																																																																																																																										if (!containerCorr
																																																																																																																																																												.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																											if (!containerCorr
																																																																																																																																																													.equals(routeRepairCorr)) {
																																																																																																																																																												if (!containerCorr
																																																																																																																																																														.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																													if (!containerCorr
																																																																																																																																																															.equals(trgPetrinet)) {
																																																																																																																																																														if (!containerCorr
																																																																																																																																																																.equals(sensorOperationalCorr)) {
																																																																																																																																																															if (!containerCorr
																																																																																																																																																																	.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																if (!containerCorr
																																																																																																																																																																		.equals(srcRoute)) {
																																																																																																																																																																	if (!containerCorr
																																																																																																																																																																			.equals(sensorFailedCorr)) {
																																																																																																																																																																		if (!containerCorr
																																																																																																																																																																				.equals(srcSensor)) {
																																																																																																																																																																			if (!containerCorr
																																																																																																																																																																					.equals(trgRouteFail)) {
																																																																																																																																																																				if (!containerCorr
																																																																																																																																																																						.equals(trgRouteRepair)) {
																																																																																																																																																																					if (!containerCorr
																																																																																																																																																																							.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																						if (!containerCorr
																																																																																																																																																																								.equals(trgSensorOperational)) {
																																																																																																																																																																							if (!containerCorr
																																																																																																																																																																									.equals(trgSensorFailed)) {
																																																																																																																																																																								if (!containerCorr
																																																																																																																																																																										.equals(routeFailedCorr)) {
																																																																																																																																																																									if (!containerCorr
																																																																																																																																																																											.equals(trgRouteFailed)) {
																																																																																																																																																																										if (!srcSensor
																																																																																																																																																																												.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																											if (!srcSensor
																																																																																																																																																																													.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																																												if (!srcSensor
																																																																																																																																																																														.equals(trgRouteOperational)) {
																																																																																																																																																																													if (!srcSensor
																																																																																																																																																																															.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																														if (!srcSensor
																																																																																																																																																																																.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																															if (!srcSensor
																																																																																																																																																																																	.equals(trgPetrinet)) {
																																																																																																																																																																																if (!srcSensor
																																																																																																																																																																																		.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																	if (!srcSensor
																																																																																																																																																																																			.equals(trgRouteFail)) {
																																																																																																																																																																																		if (!srcSensor
																																																																																																																																																																																				.equals(trgRouteRepair)) {
																																																																																																																																																																																			if (!srcSensor
																																																																																																																																																																																					.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																				if (!srcSensor
																																																																																																																																																																																						.equals(trgSensorOperational)) {
																																																																																																																																																																																					if (!srcSensor
																																																																																																																																																																																							.equals(trgSensorFailed)) {
																																																																																																																																																																																						if (!srcSensor
																																																																																																																																																																																								.equals(trgRouteFailed)) {
																																																																																																																																																																																							if (!trgRouteFail
																																																																																																																																																																																									.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																								if (!trgRouteFail
																																																																																																																																																																																										.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																																																									if (!trgRouteFail
																																																																																																																																																																																											.equals(trgRouteOperational)) {
																																																																																																																																																																																										if (!trgRouteFail
																																																																																																																																																																																												.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																											if (!trgRouteFail
																																																																																																																																																																																													.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																												if (!trgRouteFail
																																																																																																																																																																																														.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																													if (!trgRouteFail
																																																																																																																																																																																															.equals(trgRouteRepair)) {
																																																																																																																																																																																														if (!trgRouteFail
																																																																																																																																																																																																.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																															if (!trgRouteFail
																																																																																																																																																																																																	.equals(trgSensorOperational)) {
																																																																																																																																																																																																if (!trgRouteFail
																																																																																																																																																																																																		.equals(trgSensorFailed)) {
																																																																																																																																																																																																	if (!trgRouteFail
																																																																																																																																																																																																			.equals(trgRouteFailed)) {
																																																																																																																																																																																																		if (!trgRouteRepair
																																																																																																																																																																																																				.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																																			if (!trgRouteRepair
																																																																																																																																																																																																					.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																				if (!trgRouteRepair
																																																																																																																																																																																																						.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																																					if (!trgRouteRepair
																																																																																																																																																																																																							.equals(trgSensorOperational)) {
																																																																																																																																																																																																						if (!trgRouteRepair
																																																																																																																																																																																																								.equals(trgSensorFailed)) {
																																																																																																																																																																																																							if (!trgSensorFailedToRouteFail
																																																																																																																																																																																																									.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																								if (!trgSensorFailedToRouteFail
																																																																																																																																																																																																										.equals(trgSensorOperational)) {
																																																																																																																																																																																																									if (!trgSensorOperational
																																																																																																																																																																																																											.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																										if (!trgSensorFailed
																																																																																																																																																																																																												.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																											if (!trgSensorFailed
																																																																																																																																																																																																													.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																																												if (!trgSensorFailed
																																																																																																																																																																																																														.equals(trgSensorOperational)) {
																																																																																																																																																																																																													if (!routeFailedCorr
																																																																																																																																																																																																															.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																																														if (!routeFailedCorr
																																																																																																																																																																																																																.equals(srcContainer)) {
																																																																																																																																																																																																															if (!routeFailedCorr
																																																																																																																																																																																																																	.equals(trgRouteFailToSensorFailed)) {
																																																																																																																																																																																																																if (!routeFailedCorr
																																																																																																																																																																																																																		.equals(routeOperationalCorr)) {
																																																																																																																																																																																																																	if (!routeFailedCorr
																																																																																																																																																																																																																			.equals(trgRouteOperational)) {
																																																																																																																																																																																																																		if (!routeFailedCorr
																																																																																																																																																																																																																				.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																			if (!routeFailedCorr
																																																																																																																																																																																																																					.equals(routeRepairCorr)) {
																																																																																																																																																																																																																				if (!routeFailedCorr
																																																																																																																																																																																																																						.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																																					if (!routeFailedCorr
																																																																																																																																																																																																																							.equals(trgPetrinet)) {
																																																																																																																																																																																																																						if (!routeFailedCorr
																																																																																																																																																																																																																								.equals(sensorOperationalCorr)) {
																																																																																																																																																																																																																							if (!routeFailedCorr
																																																																																																																																																																																																																									.equals(trgRouteFailToRouteFailed)) {
																																																																																																																																																																																																																								if (!routeFailedCorr
																																																																																																																																																																																																																										.equals(srcRoute)) {
																																																																																																																																																																																																																									if (!routeFailedCorr
																																																																																																																																																																																																																											.equals(sensorFailedCorr)) {
																																																																																																																																																																																																																										if (!routeFailedCorr
																																																																																																																																																																																																																												.equals(srcSensor)) {
																																																																																																																																																																																																																											if (!routeFailedCorr
																																																																																																																																																																																																																													.equals(trgRouteFail)) {
																																																																																																																																																																																																																												if (!routeFailedCorr
																																																																																																																																																																																																																														.equals(trgRouteRepair)) {
																																																																																																																																																																																																																													if (!routeFailedCorr
																																																																																																																																																																																																																															.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																																																														if (!routeFailedCorr
																																																																																																																																																																																																																																.equals(trgSensorOperational)) {
																																																																																																																																																																																																																															if (!routeFailedCorr
																																																																																																																																																																																																																																	.equals(trgSensorFailed)) {
																																																																																																																																																																																																																																if (!routeFailedCorr
																																																																																																																																																																																																																																		.equals(trgRouteFailed)) {
																																																																																																																																																																																																																																	if (!trgRouteFailed
																																																																																																																																																																																																																																			.equals(trgRouteRepairToSensorOperational)) {
																																																																																																																																																																																																																																		if (!trgRouteFailed
																																																																																																																																																																																																																																				.equals(trgRouteOperational)) {
																																																																																																																																																																																																																																			if (!trgRouteFailed
																																																																																																																																																																																																																																					.equals(trgRouteOperationalToRouteFail)) {
																																																																																																																																																																																																																																				if (!trgRouteFailed
																																																																																																																																																																																																																																						.equals(trgSensorOperationalToRouteRepair)) {
																																																																																																																																																																																																																																					if (!trgRouteFailed
																																																																																																																																																																																																																																							.equals(trgRouteRepair)) {
																																																																																																																																																																																																																																						if (!trgRouteFailed
																																																																																																																																																																																																																																								.equals(trgSensorFailedToRouteFail)) {
																																																																																																																																																																																																																																							if (!trgRouteFailed
																																																																																																																																																																																																																																									.equals(trgSensorOperational)) {
																																																																																																																																																																																																																																								if (!trgRouteFailed
																																																																																																																																																																																																																																										.equals(trgSensorFailed)) {
																																																																																																																																																																																																																																									return new Object[] {
																																																																																																																																																																																																																																											ruleresult,
																																																																																																																																																																																																																																											trgRouteRepairToSensorOperational,
																																																																																																																																																																																																																																											srcContainer,
																																																																																																																																																																																																																																											trgRouteFailToSensorFailed,
																																																																																																																																																																																																																																											routeOperationalCorr,
																																																																																																																																																																																																																																											trgRouteOperational,
																																																																																																																																																																																																																																											trgRouteOperationalToRouteFail,
																																																																																																																																																																																																																																											routeRepairCorr,
																																																																																																																																																																																																																																											trgSensorOperationalToRouteRepair,
																																																																																																																																																																																																																																											trgPetrinet,
																																																																																																																																																																																																																																											sensorOperationalCorr,
																																																																																																																																																																																																																																											trgRouteFailToRouteFailed,
																																																																																																																																																																																																																																											srcRoute,
																																																																																																																																																																																																																																											sensorFailedCorr,
																																																																																																																																																																																																																																											containerCorr,
																																																																																																																																																																																																																																											srcSensor,
																																																																																																																																																																																																																																											trgRouteFail,
																																																																																																																																																																																																																																											trgRouteRepair,
																																																																																																																																																																																																																																											trgSensorFailedToRouteFail,
																																																																																																																																																																																																																																											trgSensorOperational,
																																																																																																																																																																																																																																											trgSensorFailed,
																																																																																																																																																																																																																																											routeFailedCorr,
																																																																																																																																																																																																																																											trgRouteFailed };
																																																																																																																																																																																																																																								}
																																																																																																																																																																																																																																							}
																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																		}
																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																															}
																																																																																																																																																																																																																														}
																																																																																																																																																																																																																													}
																																																																																																																																																																																																																												}
																																																																																																																																																																																																																											}
																																																																																																																																																																																																																										}
																																																																																																																																																																																																																									}
																																																																																																																																																																																																																								}
																																																																																																																																																																																																																							}
																																																																																																																																																																																																																						}
																																																																																																																																																																																																																					}
																																																																																																																																																																																																																				}
																																																																																																																																																																																																																			}
																																																																																																																																																																																																																		}
																																																																																																																																																																																																																	}
																																																																																																																																																																																																																}
																																																																																																																																																																																																															}
																																																																																																																																																																																																														}
																																																																																																																																																																																																													}
																																																																																																																																																																																																												}
																																																																																																																																																																																																											}
																																																																																																																																																																																																										}
																																																																																																																																																																																																									}
																																																																																																																																																																																																								}
																																																																																																																																																																																																							}
																																																																																																																																																																																																						}
																																																																																																																																																																																																					}
																																																																																																																																																																																																				}
																																																																																																																																																																																																			}
																																																																																																																																																																																																		}
																																																																																																																																																																																																	}
																																																																																																																																																																																																}
																																																																																																																																																																																															}
																																																																																																																																																																																														}
																																																																																																																																																																																													}
																																																																																																																																																																																												}
																																																																																																																																																																																											}
																																																																																																																																																																																										}
																																																																																																																																																																																									}
																																																																																																																																																																																								}
																																																																																																																																																																																							}
																																																																																																																																																																																						}
																																																																																																																																																																																					}
																																																																																																																																																																																				}
																																																																																																																																																																																			}
																																																																																																																																																																																		}
																																																																																																																																																																																	}
																																																																																																																																																																																}
																																																																																																																																																																															}
																																																																																																																																																																														}
																																																																																																																																																																													}
																																																																																																																																																																												}
																																																																																																																																																																											}
																																																																																																																																																																										}
																																																																																																																																																																									}
																																																																																																																																																																								}
																																																																																																																																																																							}
																																																																																																																																																																						}
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																			}
																																																																																																																																																																		}
																																																																																																																																																																	}
																																																																																																																																																																}
																																																																																																																																																															}
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												}
																																																																																																																																																											}
																																																																																																																																																										}
																																																																																																																																																									}
																																																																																																																																																								}
																																																																																																																																																							}
																																																																																																																																																						}
																																																																																																																																																					}
																																																																																																																																																				}
																																																																																																																																																			}
																																																																																																																																																		}
																																																																																																																																																	}
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														}
																																																																																																																																													}
																																																																																																																																												}
																																																																																																																																											}
																																																																																																																																										}
																																																																																																																																									}
																																																																																																																																								}
																																																																																																																																							}
																																																																																																																																						}
																																																																																																																																					}
																																																																																																																																				}
																																																																																																																																			}
																																																																																																																																		}
																																																																																																																																	}
																																																																																																																																}
																																																																																																																															}
																																																																																																																														}
																																																																																																																													}
																																																																																																																												}
																																																																																																																											}
																																																																																																																										}
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject trgRouteRepairToSensorOperational, EObject trgRouteFailToSensorFailed,
			EObject trgRouteOperational, EObject trgRouteOperationalToRouteFail,
			EObject trgSensorOperationalToRouteRepair, EObject trgPetrinet, EObject trgRouteFailToRouteFailed,
			EObject srcRoute, EObject srcSensor, EObject trgRouteFail, EObject trgRouteRepair,
			EObject trgSensorFailedToRouteFail, EObject trgSensorOperational, EObject trgSensorFailed,
			EObject trgRouteFailed) {
		EMoflonEdge trgRouteRepairToSensorOperational__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgRouteRepairToSensorOperational____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteOperationalToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSensorOperationalToRouteRepair__trgRouteRepair____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteRepair__trgSensorOperationalToRouteRepair____arcs = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSensorFailed__trgSensorFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSensor____requires = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteRepairToSensorOperational__trgSensorOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToSensorFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToSensorFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSensorFailedToRouteFail__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgSensorFailedToRouteFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgSensorOperationalToRouteRepair__trgSensorOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgSensorFailedToRouteFail__trgSensorFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteOperationalToRouteFail__trgRouteOperational____place = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFailToRouteFailed__trgRouteFail____transition = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgRouteFailToRouteFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRouteFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRouteFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RequiredSensor";
		String trgRouteRepairToSensorOperational__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgRouteRepairToSensorOperational____arcs_name_prime = "arcs";
		String trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime = "arcs";
		String trgSensorOperationalToRouteRepair__trgRouteRepair____transition_name_prime = "transition";
		String trgRouteRepair__trgSensorOperationalToRouteRepair____arcs_name_prime = "arcs";
		String trgRouteFailToSensorFailed__trgSensorFailed____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime = "place";
		String srcRoute__srcSensor____requires_name_prime = "requires";
		String trgRouteRepairToSensorOperational__trgSensorOperational____place_name_prime = "place";
		String trgRouteFailToSensorFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToSensorFailed____arcs_name_prime = "arcs";
		String trgSensorFailedToRouteFail__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgSensorFailedToRouteFail____arcs_name_prime = "arcs";
		String trgSensorOperationalToRouteRepair__trgSensorOperational____place_name_prime = "place";
		String trgSensorFailedToRouteFail__trgSensorFailed____place_name_prime = "place";
		String trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime = "place";
		String trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime = "transition";
		String trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime = "arcs";
		String trgRouteFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRouteFail____nodes_name_prime = "nodes";
		trgRouteRepairToSensorOperational__trgRouteRepair____transition.setSrc(trgRouteRepairToSensorOperational);
		trgRouteRepairToSensorOperational__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSensorOperational__trgRouteRepair____transition);
		trgRouteRepair__trgRouteRepairToSensorOperational____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgRouteRepairToSensorOperational____arcs.setTrg(trgRouteRepairToSensorOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgRouteRepairToSensorOperational____arcs);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs.setTrg(trgRouteOperationalToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteOperationalToRouteFail____arcs);
		trgSensorOperationalToRouteRepair__trgRouteRepair____transition.setSrc(trgSensorOperationalToRouteRepair);
		trgSensorOperationalToRouteRepair__trgRouteRepair____transition.setTrg(trgRouteRepair);
		ruleresult.getCreatedEdges().add(trgSensorOperationalToRouteRepair__trgRouteRepair____transition);
		trgRouteRepair__trgSensorOperationalToRouteRepair____arcs.setSrc(trgRouteRepair);
		trgRouteRepair__trgSensorOperationalToRouteRepair____arcs.setTrg(trgSensorOperationalToRouteRepair);
		ruleresult.getCreatedEdges().add(trgRouteRepair__trgSensorOperationalToRouteRepair____arcs);
		trgRouteFailToSensorFailed__trgSensorFailed____place.setSrc(trgRouteFailToSensorFailed);
		trgRouteFailToSensorFailed__trgSensorFailed____place.setTrg(trgSensorFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToSensorFailed__trgSensorFailed____place);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFailed____place.setTrg(trgRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFailed____place);
		srcRoute__srcSensor____requires.setSrc(srcRoute);
		srcRoute__srcSensor____requires.setTrg(srcSensor);
		ruleresult.getTranslatedEdges().add(srcRoute__srcSensor____requires);
		trgRouteRepairToSensorOperational__trgSensorOperational____place.setSrc(trgRouteRepairToSensorOperational);
		trgRouteRepairToSensorOperational__trgSensorOperational____place.setTrg(trgSensorOperational);
		ruleresult.getCreatedEdges().add(trgRouteRepairToSensorOperational__trgSensorOperational____place);
		trgRouteFailToSensorFailed__trgRouteFail____transition.setSrc(trgRouteFailToSensorFailed);
		trgRouteFailToSensorFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToSensorFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToSensorFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToSensorFailed____arcs.setTrg(trgRouteFailToSensorFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToSensorFailed____arcs);
		trgSensorFailedToRouteFail__trgRouteFail____transition.setSrc(trgSensorFailedToRouteFail);
		trgSensorFailedToRouteFail__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgSensorFailedToRouteFail__trgRouteFail____transition);
		trgRouteFail__trgSensorFailedToRouteFail____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgSensorFailedToRouteFail____arcs.setTrg(trgSensorFailedToRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgSensorFailedToRouteFail____arcs);
		trgSensorOperationalToRouteRepair__trgSensorOperational____place.setSrc(trgSensorOperationalToRouteRepair);
		trgSensorOperationalToRouteRepair__trgSensorOperational____place.setTrg(trgSensorOperational);
		ruleresult.getCreatedEdges().add(trgSensorOperationalToRouteRepair__trgSensorOperational____place);
		trgSensorFailedToRouteFail__trgSensorFailed____place.setSrc(trgSensorFailedToRouteFail);
		trgSensorFailedToRouteFail__trgSensorFailed____place.setTrg(trgSensorFailed);
		ruleresult.getCreatedEdges().add(trgSensorFailedToRouteFail__trgSensorFailed____place);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setSrc(trgRouteOperationalToRouteFail);
		trgRouteOperationalToRouteFail__trgRouteOperational____place.setTrg(trgRouteOperational);
		ruleresult.getCreatedEdges().add(trgRouteOperationalToRouteFail__trgRouteOperational____place);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setSrc(trgRouteFailToRouteFailed);
		trgRouteFailToRouteFailed__trgRouteFail____transition.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgRouteFailToRouteFailed__trgRouteFail____transition);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setSrc(trgRouteFail);
		trgRouteFail__trgRouteFailToRouteFailed____arcs.setTrg(trgRouteFailToRouteFailed);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgRouteFailToRouteFailed____arcs);
		trgRouteFail__trgPetrinet____petriNet.setSrc(trgRouteFail);
		trgRouteFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRouteFail__trgPetrinet____petriNet);
		trgPetrinet__trgRouteFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRouteFail____nodes.setTrg(trgRouteFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRouteFail____nodes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgRouteRepairToSensorOperational__trgRouteRepair____transition
				.setName(trgRouteRepairToSensorOperational__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgRouteRepairToSensorOperational____arcs
				.setName(trgRouteRepair__trgRouteRepairToSensorOperational____arcs_name_prime);
		trgRouteOperationalToRouteFail__trgRouteFail____transition
				.setName(trgRouteOperationalToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteOperationalToRouteFail____arcs
				.setName(trgRouteFail__trgRouteOperationalToRouteFail____arcs_name_prime);
		trgSensorOperationalToRouteRepair__trgRouteRepair____transition
				.setName(trgSensorOperationalToRouteRepair__trgRouteRepair____transition_name_prime);
		trgRouteRepair__trgSensorOperationalToRouteRepair____arcs
				.setName(trgRouteRepair__trgSensorOperationalToRouteRepair____arcs_name_prime);
		trgRouteFailToSensorFailed__trgSensorFailed____place
				.setName(trgRouteFailToSensorFailed__trgSensorFailed____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFailed____place
				.setName(trgRouteFailToRouteFailed__trgRouteFailed____place_name_prime);
		srcRoute__srcSensor____requires.setName(srcRoute__srcSensor____requires_name_prime);
		trgRouteRepairToSensorOperational__trgSensorOperational____place
				.setName(trgRouteRepairToSensorOperational__trgSensorOperational____place_name_prime);
		trgRouteFailToSensorFailed__trgRouteFail____transition
				.setName(trgRouteFailToSensorFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToSensorFailed____arcs
				.setName(trgRouteFail__trgRouteFailToSensorFailed____arcs_name_prime);
		trgSensorFailedToRouteFail__trgRouteFail____transition
				.setName(trgSensorFailedToRouteFail__trgRouteFail____transition_name_prime);
		trgRouteFail__trgSensorFailedToRouteFail____arcs
				.setName(trgRouteFail__trgSensorFailedToRouteFail____arcs_name_prime);
		trgSensorOperationalToRouteRepair__trgSensorOperational____place
				.setName(trgSensorOperationalToRouteRepair__trgSensorOperational____place_name_prime);
		trgSensorFailedToRouteFail__trgSensorFailed____place
				.setName(trgSensorFailedToRouteFail__trgSensorFailed____place_name_prime);
		trgRouteOperationalToRouteFail__trgRouteOperational____place
				.setName(trgRouteOperationalToRouteFail__trgRouteOperational____place_name_prime);
		trgRouteFailToRouteFailed__trgRouteFail____transition
				.setName(trgRouteFailToRouteFailed__trgRouteFail____transition_name_prime);
		trgRouteFail__trgRouteFailToRouteFailed____arcs
				.setName(trgRouteFail__trgRouteFailToRouteFailed____arcs_name_prime);
		trgRouteFail__trgPetrinet____petriNet.setName(trgRouteFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRouteFail____nodes.setName(trgPetrinet__trgRouteFail____nodes_name_prime);
		return new Object[] { ruleresult, trgRouteRepairToSensorOperational, trgRouteFailToSensorFailed,
				trgRouteOperational, trgRouteOperationalToRouteFail, trgSensorOperationalToRouteRepair, trgPetrinet,
				trgRouteFailToRouteFailed, srcRoute, srcSensor, trgRouteFail, trgRouteRepair,
				trgSensorFailedToRouteFail, trgSensorOperational, trgSensorFailed, trgRouteFailed,
				trgRouteRepairToSensorOperational__trgRouteRepair____transition,
				trgRouteRepair__trgRouteRepairToSensorOperational____arcs,
				trgRouteOperationalToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgRouteOperationalToRouteFail____arcs,
				trgSensorOperationalToRouteRepair__trgRouteRepair____transition,
				trgRouteRepair__trgSensorOperationalToRouteRepair____arcs,
				trgRouteFailToSensorFailed__trgSensorFailed____place,
				trgRouteFailToRouteFailed__trgRouteFailed____place, srcRoute__srcSensor____requires,
				trgRouteRepairToSensorOperational__trgSensorOperational____place,
				trgRouteFailToSensorFailed__trgRouteFail____transition,
				trgRouteFail__trgRouteFailToSensorFailed____arcs,
				trgSensorFailedToRouteFail__trgRouteFail____transition,
				trgRouteFail__trgSensorFailedToRouteFail____arcs,
				trgSensorOperationalToRouteRepair__trgSensorOperational____place,
				trgSensorFailedToRouteFail__trgSensorFailed____place,
				trgRouteOperationalToRouteFail__trgRouteOperational____place,
				trgRouteFailToRouteFailed__trgRouteFail____transition, trgRouteFail__trgRouteFailToRouteFailed____arcs,
				trgRouteFail__trgPetrinet____petriNet, trgPetrinet__trgRouteFail____nodes };
	}

	public static final void pattern_RequiredSensor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBBBBBBBB(
			RequiredSensor _this, PerformRuleResult ruleresult, EObject trgRouteRepairToSensorOperational,
			EObject srcContainer, EObject trgRouteFailToSensorFailed, EObject routeOperationalCorr,
			EObject trgRouteOperational, EObject trgRouteOperationalToRouteFail, EObject routeRepairCorr,
			EObject trgSensorOperationalToRouteRepair, EObject trgPetrinet, EObject sensorOperationalCorr,
			EObject trgRouteFailToRouteFailed, EObject srcRoute, EObject sensorFailedCorr, EObject containerCorr,
			EObject srcSensor, EObject trgRouteFail, EObject trgRouteRepair, EObject trgSensorFailedToRouteFail,
			EObject trgSensorOperational, EObject trgSensorFailed, EObject routeFailedCorr, EObject trgRouteFailed) {
		_this.registerObjects_FWD(ruleresult, trgRouteRepairToSensorOperational, srcContainer,
				trgRouteFailToSensorFailed, routeOperationalCorr, trgRouteOperational, trgRouteOperationalToRouteFail,
				routeRepairCorr, trgSensorOperationalToRouteRepair, trgPetrinet, sensorOperationalCorr,
				trgRouteFailToRouteFailed, srcRoute, sensorFailedCorr, containerCorr, srcSensor, trgRouteFail,
				trgRouteRepair, trgSensorFailedToRouteFail, trgSensorOperational, trgSensorFailed, routeFailedCorr,
				trgRouteFailed);

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
		EObject _localVariable_0 = match.getObject("srcContainer");
		EObject _localVariable_1 = match.getObject("srcRoute");
		EObject _localVariable_2 = match.getObject("srcSensor");
		EObject tmpSrcContainer = _localVariable_0;
		EObject tmpSrcRoute = _localVariable_1;
		EObject tmpSrcSensor = _localVariable_2;
		if (tmpSrcContainer instanceof RailwayContainer) {
			RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
			if (tmpSrcRoute instanceof Route) {
				Route srcRoute = (Route) tmpSrcRoute;
				if (tmpSrcSensor instanceof Sensor) {
					Sensor srcSensor = (Sensor) tmpSrcSensor;
					return new Object[] { srcContainer, srcRoute, srcSensor, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RequiredSensor_2_2_corematch_blackBFFFFFBFFBFFFFFB(
			RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
			PetriNet trgPetrinet = containerCorr.getTarget();
			if (trgPetrinet != null) {
				for (RouteToRepair routeRepairCorr : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(srcRoute, RouteToRepair.class, "source")) {
					Transition trgRouteRepair = routeRepairCorr.getTarget();
					if (trgRouteRepair != null) {
						for (SensorToOperational sensorOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(srcSensor, SensorToOperational.class, "source")) {
							Place trgSensorOperational = sensorOperationalCorr.getTarget();
							if (trgSensorOperational != null) {
								for (SensorToFailed sensorFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(srcSensor, SensorToFailed.class, "source")) {
									Place trgSensorFailed = sensorFailedCorr.getTarget();
									if (trgSensorFailed != null) {
										if (!trgSensorFailed.equals(trgSensorOperational)) {
											for (RouteToOperational routeOperationalCorr : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(srcRoute, RouteToOperational.class,
															"source")) {
												Place trgRouteOperational = routeOperationalCorr.getTarget();
												if (trgRouteOperational != null) {
													if (!trgRouteOperational.equals(trgSensorOperational)) {
														if (!trgRouteOperational.equals(trgSensorFailed)) {
															for (RouteToFailed routeFailedCorr : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(srcRoute,
																			RouteToFailed.class, "source")) {
																Place trgRouteFailed = routeFailedCorr.getTarget();
																if (trgRouteFailed != null) {
																	if (!trgRouteFailed.equals(trgRouteOperational)) {
																		if (!trgRouteFailed
																				.equals(trgSensorOperational)) {
																			if (!trgRouteFailed
																					.equals(trgSensorFailed)) {
																				_result.add(new Object[] { srcContainer,
																						routeOperationalCorr,
																						trgRouteOperational,
																						routeRepairCorr, trgPetrinet,
																						sensorOperationalCorr, srcRoute,
																						sensorFailedCorr, containerCorr,
																						srcSensor, trgRouteRepair,
																						trgSensorOperational,
																						trgSensorFailed,
																						routeFailedCorr, trgRouteFailed,
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

	public static final Iterable<Object[]> pattern_RequiredSensor_2_3_findcontext_blackBBBBBBBBBBBBBBB(
			RailwayContainer srcContainer, RouteToOperational routeOperationalCorr, Place trgRouteOperational,
			RouteToRepair routeRepairCorr, PetriNet trgPetrinet, SensorToOperational sensorOperationalCorr,
			Route srcRoute, SensorToFailed sensorFailedCorr, RailwayContainerToPetriNet containerCorr, Sensor srcSensor,
			Transition trgRouteRepair, Place trgSensorOperational, Place trgSensorFailed, RouteToFailed routeFailedCorr,
			Place trgRouteFailed) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!trgRouteOperational.equals(trgSensorOperational)) {
			if (!trgRouteOperational.equals(trgSensorFailed)) {
				if (!trgSensorFailed.equals(trgSensorOperational)) {
					if (!trgRouteFailed.equals(trgRouteOperational)) {
						if (!trgRouteFailed.equals(trgSensorOperational)) {
							if (!trgRouteFailed.equals(trgSensorFailed)) {
								if (srcContainer.getRoutes().contains(srcRoute)) {
									if (srcRoute.getRequires().contains(srcSensor)) {
										if (srcContainer.equals(containerCorr.getSource())) {
											if (trgPetrinet.equals(containerCorr.getTarget())) {
												if (srcRoute.equals(routeRepairCorr.getSource())) {
													if (srcSensor.equals(sensorOperationalCorr.getSource())) {
														if (srcSensor.equals(sensorFailedCorr.getSource())) {
															if (trgRouteRepair.equals(routeRepairCorr.getTarget())) {
																if (srcRoute.equals(routeOperationalCorr.getSource())) {
																	if (trgRouteOperational
																			.equals(routeOperationalCorr.getTarget())) {
																		if (trgSensorOperational.equals(
																				sensorOperationalCorr.getTarget())) {
																			if (trgSensorFailed.equals(
																					sensorFailedCorr.getTarget())) {
																				if (trgRouteFailed.equals(
																						routeFailedCorr.getTarget())) {
																					if (srcRoute.equals(routeFailedCorr
																							.getSource())) {
																						_result.add(new Object[] {
																								srcContainer,
																								routeOperationalCorr,
																								trgRouteOperational,
																								routeRepairCorr,
																								trgPetrinet,
																								sensorOperationalCorr,
																								srcRoute,
																								sensorFailedCorr,
																								containerCorr,
																								srcSensor,
																								trgRouteRepair,
																								trgSensorOperational,
																								trgSensorFailed,
																								routeFailedCorr,
																								trgRouteFailed });
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			RailwayContainer srcContainer, RouteToOperational routeOperationalCorr, Place trgRouteOperational,
			RouteToRepair routeRepairCorr, PetriNet trgPetrinet, SensorToOperational sensorOperationalCorr,
			Route srcRoute, SensorToFailed sensorFailedCorr, RailwayContainerToPetriNet containerCorr, Sensor srcSensor,
			Transition trgRouteRepair, Place trgSensorOperational, Place trgSensorFailed, RouteToFailed routeFailedCorr,
			Place trgRouteFailed) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcContainer__srcRoute____routes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRoute__srcSensor____requires = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorOperationalCorr__srcSensor____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorFailedCorr__srcSensor____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeRepairCorr__trgRouteRepair____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeOperationalCorr__trgRouteOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorOperationalCorr__trgSensorOperational____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sensorFailedCorr__trgSensorFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__trgRouteFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge routeFailedCorr__srcRoute____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcContainer__srcRoute____routes_name_prime = "routes";
		String srcRoute__srcSensor____requires_name_prime = "requires";
		String containerCorr__srcContainer____source_name_prime = "source";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String routeRepairCorr__srcRoute____source_name_prime = "source";
		String sensorOperationalCorr__srcSensor____source_name_prime = "source";
		String sensorFailedCorr__srcSensor____source_name_prime = "source";
		String routeRepairCorr__trgRouteRepair____target_name_prime = "target";
		String routeOperationalCorr__srcRoute____source_name_prime = "source";
		String routeOperationalCorr__trgRouteOperational____target_name_prime = "target";
		String sensorOperationalCorr__trgSensorOperational____target_name_prime = "target";
		String sensorFailedCorr__trgSensorFailed____target_name_prime = "target";
		String routeFailedCorr__trgRouteFailed____target_name_prime = "target";
		String routeFailedCorr__srcRoute____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr);
		isApplicableMatch.getAllContextElements().add(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(sensorOperationalCorr);
		isApplicableMatch.getAllContextElements().add(srcRoute);
		isApplicableMatch.getAllContextElements().add(sensorFailedCorr);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(srcSensor);
		isApplicableMatch.getAllContextElements().add(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(trgSensorOperational);
		isApplicableMatch.getAllContextElements().add(trgSensorFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr);
		isApplicableMatch.getAllContextElements().add(trgRouteFailed);
		srcContainer__srcRoute____routes.setSrc(srcContainer);
		srcContainer__srcRoute____routes.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRoute____routes);
		srcRoute__srcSensor____requires.setSrc(srcRoute);
		srcRoute__srcSensor____requires.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(srcRoute__srcSensor____requires);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		routeRepairCorr__srcRoute____source.setSrc(routeRepairCorr);
		routeRepairCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__srcRoute____source);
		sensorOperationalCorr__srcSensor____source.setSrc(sensorOperationalCorr);
		sensorOperationalCorr__srcSensor____source.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(sensorOperationalCorr__srcSensor____source);
		sensorFailedCorr__srcSensor____source.setSrc(sensorFailedCorr);
		sensorFailedCorr__srcSensor____source.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(sensorFailedCorr__srcSensor____source);
		routeRepairCorr__trgRouteRepair____target.setSrc(routeRepairCorr);
		routeRepairCorr__trgRouteRepair____target.setTrg(trgRouteRepair);
		isApplicableMatch.getAllContextElements().add(routeRepairCorr__trgRouteRepair____target);
		routeOperationalCorr__srcRoute____source.setSrc(routeOperationalCorr);
		routeOperationalCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__srcRoute____source);
		routeOperationalCorr__trgRouteOperational____target.setSrc(routeOperationalCorr);
		routeOperationalCorr__trgRouteOperational____target.setTrg(trgRouteOperational);
		isApplicableMatch.getAllContextElements().add(routeOperationalCorr__trgRouteOperational____target);
		sensorOperationalCorr__trgSensorOperational____target.setSrc(sensorOperationalCorr);
		sensorOperationalCorr__trgSensorOperational____target.setTrg(trgSensorOperational);
		isApplicableMatch.getAllContextElements().add(sensorOperationalCorr__trgSensorOperational____target);
		sensorFailedCorr__trgSensorFailed____target.setSrc(sensorFailedCorr);
		sensorFailedCorr__trgSensorFailed____target.setTrg(trgSensorFailed);
		isApplicableMatch.getAllContextElements().add(sensorFailedCorr__trgSensorFailed____target);
		routeFailedCorr__trgRouteFailed____target.setSrc(routeFailedCorr);
		routeFailedCorr__trgRouteFailed____target.setTrg(trgRouteFailed);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__trgRouteFailed____target);
		routeFailedCorr__srcRoute____source.setSrc(routeFailedCorr);
		routeFailedCorr__srcRoute____source.setTrg(srcRoute);
		isApplicableMatch.getAllContextElements().add(routeFailedCorr__srcRoute____source);
		srcContainer__srcRoute____routes.setName(srcContainer__srcRoute____routes_name_prime);
		srcRoute__srcSensor____requires.setName(srcRoute__srcSensor____requires_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		routeRepairCorr__srcRoute____source.setName(routeRepairCorr__srcRoute____source_name_prime);
		sensorOperationalCorr__srcSensor____source.setName(sensorOperationalCorr__srcSensor____source_name_prime);
		sensorFailedCorr__srcSensor____source.setName(sensorFailedCorr__srcSensor____source_name_prime);
		routeRepairCorr__trgRouteRepair____target.setName(routeRepairCorr__trgRouteRepair____target_name_prime);
		routeOperationalCorr__srcRoute____source.setName(routeOperationalCorr__srcRoute____source_name_prime);
		routeOperationalCorr__trgRouteOperational____target
				.setName(routeOperationalCorr__trgRouteOperational____target_name_prime);
		sensorOperationalCorr__trgSensorOperational____target
				.setName(sensorOperationalCorr__trgSensorOperational____target_name_prime);
		sensorFailedCorr__trgSensorFailed____target.setName(sensorFailedCorr__trgSensorFailed____target_name_prime);
		routeFailedCorr__trgRouteFailed____target.setName(routeFailedCorr__trgRouteFailed____target_name_prime);
		routeFailedCorr__srcRoute____source.setName(routeFailedCorr__srcRoute____source_name_prime);
		return new Object[] { srcContainer, routeOperationalCorr, trgRouteOperational, routeRepairCorr, trgPetrinet,
				sensorOperationalCorr, srcRoute, sensorFailedCorr, containerCorr, srcSensor, trgRouteRepair,
				trgSensorOperational, trgSensorFailed, routeFailedCorr, trgRouteFailed, isApplicableMatch,
				srcContainer__srcRoute____routes, srcRoute__srcSensor____requires,
				containerCorr__srcContainer____source, containerCorr__trgPetrinet____target,
				routeRepairCorr__srcRoute____source, sensorOperationalCorr__srcSensor____source,
				sensorFailedCorr__srcSensor____source, routeRepairCorr__trgRouteRepair____target,
				routeOperationalCorr__srcRoute____source, routeOperationalCorr__trgRouteOperational____target,
				sensorOperationalCorr__trgSensorOperational____target, sensorFailedCorr__trgSensorFailed____target,
				routeFailedCorr__trgRouteFailed____target, routeFailedCorr__srcRoute____source };
	}

	public static final Object[] pattern_RequiredSensor_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(RequiredSensor _this,
			IsApplicableMatch isApplicableMatch, RailwayContainer srcContainer, RouteToOperational routeOperationalCorr,
			Place trgRouteOperational, RouteToRepair routeRepairCorr, PetriNet trgPetrinet,
			SensorToOperational sensorOperationalCorr, Route srcRoute, SensorToFailed sensorFailedCorr,
			RailwayContainerToPetriNet containerCorr, Sensor srcSensor, Transition trgRouteRepair,
			Place trgSensorOperational, Place trgSensorFailed, RouteToFailed routeFailedCorr, Place trgRouteFailed) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcContainer, routeOperationalCorr,
				trgRouteOperational, routeRepairCorr, trgPetrinet, sensorOperationalCorr, srcRoute, sensorFailedCorr,
				containerCorr, srcSensor, trgRouteRepair, trgSensorOperational, trgSensorFailed, routeFailedCorr,
				trgRouteFailed);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcContainer, routeOperationalCorr,
					trgRouteOperational, routeRepairCorr, trgPetrinet, sensorOperationalCorr, srcRoute,
					sensorFailedCorr, containerCorr, srcSensor, trgRouteRepair, trgSensorOperational, trgSensorFailed,
					routeFailedCorr, trgRouteFailed };
		}
		return null;
	}

	public static final Object[] pattern_RequiredSensor_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RequiredSensor_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			RequiredSensor _this, IsApplicableMatch isApplicableMatch, RailwayContainer srcContainer,
			RouteToOperational routeOperationalCorr, Place trgRouteOperational, RouteToRepair routeRepairCorr,
			PetriNet trgPetrinet, SensorToOperational sensorOperationalCorr, Route srcRoute,
			SensorToFailed sensorFailedCorr, RailwayContainerToPetriNet containerCorr, Sensor srcSensor,
			Transition trgRouteRepair, Place trgSensorOperational, Place trgSensorFailed, RouteToFailed routeFailedCorr,
			Place trgRouteFailed) {
		Object[] result_pattern_RequiredSensor_2_4_solveCSP_binding = pattern_RequiredSensor_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, srcContainer, routeOperationalCorr, trgRouteOperational, routeRepairCorr,
				trgPetrinet, sensorOperationalCorr, srcRoute, sensorFailedCorr, containerCorr, srcSensor,
				trgRouteRepair, trgSensorOperational, trgSensorFailed, routeFailedCorr, trgRouteFailed);
		if (result_pattern_RequiredSensor_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RequiredSensor_2_4_solveCSP_binding[0];

			Object[] result_pattern_RequiredSensor_2_4_solveCSP_black = pattern_RequiredSensor_2_4_solveCSP_blackB(csp);
			if (result_pattern_RequiredSensor_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcContainer, routeOperationalCorr,
						trgRouteOperational, routeRepairCorr, trgPetrinet, sensorOperationalCorr, srcRoute,
						sensorFailedCorr, containerCorr, srcSensor, trgRouteRepair, trgSensorOperational,
						trgSensorFailed, routeFailedCorr, trgRouteFailed };
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
						_result.add(new Object[] { srcContainer, srcRoute, srcSensor, _edge_requires });
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
			RequiredSensor _this, Match match, RailwayContainer srcContainer, Route srcRoute, Sensor srcSensor) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcContainer, srcRoute, srcSensor);
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

	public static final Object[] pattern_RequiredSensor_13_1_matchtggpattern_blackBBB(RailwayContainer srcContainer,
			Route srcRoute, Sensor srcSensor) {
		if (srcContainer.getRoutes().contains(srcRoute)) {
			if (srcRoute.getRequires().contains(srcSensor)) {
				return new Object[] { srcContainer, srcRoute, srcSensor };
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
