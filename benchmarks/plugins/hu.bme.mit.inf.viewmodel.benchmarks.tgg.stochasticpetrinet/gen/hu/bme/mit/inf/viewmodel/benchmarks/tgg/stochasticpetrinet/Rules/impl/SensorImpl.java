/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.TimedTransition;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Sensor;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SensorToOperational;
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
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends AbstractRuleImpl implements Sensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSensor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			Region srcRegion, RailwayContainer srcContainer) {

		Object[] result1_black = SensorImpl.pattern_Sensor_0_1_initialbindings_blackBBBBB(this, match, srcSensor,
				srcRegion, srcContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSensor] = " + srcSensor + ", " + "[srcRegion] = " + srcRegion
					+ ", " + "[srcContainer] = " + srcContainer + ".");
		}

		Object[] result2_bindingAndBlack = SensorImpl.pattern_Sensor_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
				srcSensor, srcRegion, srcContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSensor] = " + srcSensor + ", " + "[srcRegion] = " + srcRegion
					+ ", " + "[srcContainer] = " + srcContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SensorImpl.pattern_Sensor_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SensorImpl.pattern_Sensor_0_4_collectelementstobetranslated_blackBBBB(match,
					srcSensor, srcRegion, srcContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSensor] = " + srcSensor + ", " + "[srcRegion] = " + srcRegion + ", "
						+ "[srcContainer] = " + srcContainer + ".");
			}
			SensorImpl.pattern_Sensor_0_4_collectelementstobetranslated_greenBBBF(match, srcSensor, srcRegion);
			//nothing EMoflonEdge srcRegion__srcSensor____sensors = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SensorImpl.pattern_Sensor_0_5_collectcontextelements_blackBBBB(match, srcSensor,
					srcRegion, srcContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSensor] = " + srcSensor + ", " + "[srcRegion] = " + srcRegion + ", "
						+ "[srcContainer] = " + srcContainer + ".");
			}
			SensorImpl.pattern_Sensor_0_5_collectcontextelements_greenBBBF(match, srcRegion, srcContainer);
			//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result5_green[3];

			// 
			SensorImpl.pattern_Sensor_0_6_registerobjectstomatch_expressionBBBBB(this, match, srcSensor, srcRegion,
					srcContainer);
			return SensorImpl.pattern_Sensor_0_7_expressionF();
		} else {
			return SensorImpl.pattern_Sensor_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SensorImpl
				.pattern_Sensor_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[0];
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) result1_bindingAndBlack[1];
		Region srcRegion = (Region) result1_bindingAndBlack[2];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[3];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SensorImpl.pattern_Sensor_1_1_performtransformation_greenFFFFFBFFFFFB(srcSensor,
				trgPetrinet);
		Arc trgFailToFailed = (Arc) result1_green[0];
		TimedTransition trgFail = (TimedTransition) result1_green[1];
		SensorToFailed sensorFailedCorr = (SensorToFailed) result1_green[2];
		Arc trgOperationToFail = (Arc) result1_green[3];
		Arc trgFailedToRepair = (Arc) result1_green[4];
		TimedTransition trgRepair = (TimedTransition) result1_green[6];
		Arc trgRepairToOperational = (Arc) result1_green[7];
		Place trgOperational = (Place) result1_green[8];
		Place trgFailed = (Place) result1_green[9];
		SensorToOperational sensorOperationalCoor = (SensorToOperational) result1_green[10];

		Object[] result2_black = SensorImpl.pattern_Sensor_1_2_collecttranslatedelements_blackBBBBBBBBBBB(
				trgFailToFailed, trgFail, sensorFailedCorr, trgOperationToFail, trgFailedToRepair, srcSensor, trgRepair,
				trgRepairToOperational, trgOperational, trgFailed, sensorOperationalCoor);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[trgFailToFailed] = "
					+ trgFailToFailed + ", " + "[trgFail] = " + trgFail + ", " + "[sensorFailedCorr] = "
					+ sensorFailedCorr + ", " + "[trgOperationToFail] = " + trgOperationToFail + ", "
					+ "[trgFailedToRepair] = " + trgFailedToRepair + ", " + "[srcSensor] = " + srcSensor + ", "
					+ "[trgRepair] = " + trgRepair + ", " + "[trgRepairToOperational] = " + trgRepairToOperational
					+ ", " + "[trgOperational] = " + trgOperational + ", " + "[trgFailed] = " + trgFailed + ", "
					+ "[sensorOperationalCoor] = " + sensorOperationalCoor + ".");
		}
		Object[] result2_green = SensorImpl.pattern_Sensor_1_2_collecttranslatedelements_greenFBBBBBBBBBBB(
				trgFailToFailed, trgFail, sensorFailedCorr, trgOperationToFail, trgFailedToRepair, srcSensor, trgRepair,
				trgRepairToOperational, trgOperational, trgFailed, sensorOperationalCoor);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SensorImpl.pattern_Sensor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult,
				trgFailToFailed, trgFail, sensorFailedCorr, trgOperationToFail, trgFailedToRepair, containerCorr,
				srcSensor, trgRepair, trgRepairToOperational, srcRegion, trgOperational, trgFailed,
				sensorOperationalCoor, trgPetrinet, srcContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[trgFailToFailed] = " + trgFailToFailed + ", " + "[trgFail] = " + trgFail + ", "
					+ "[sensorFailedCorr] = " + sensorFailedCorr + ", " + "[trgOperationToFail] = " + trgOperationToFail
					+ ", " + "[trgFailedToRepair] = " + trgFailedToRepair + ", " + "[containerCorr] = " + containerCorr
					+ ", " + "[srcSensor] = " + srcSensor + ", " + "[trgRepair] = " + trgRepair + ", "
					+ "[trgRepairToOperational] = " + trgRepairToOperational + ", " + "[srcRegion] = " + srcRegion
					+ ", " + "[trgOperational] = " + trgOperational + ", " + "[trgFailed] = " + trgFailed + ", "
					+ "[sensorOperationalCoor] = " + sensorOperationalCoor + ", " + "[trgPetrinet] = " + trgPetrinet
					+ ", " + "[srcContainer] = " + srcContainer + ".");
		}
		SensorImpl.pattern_Sensor_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(ruleresult,
				trgFailToFailed, trgFail, sensorFailedCorr, trgOperationToFail, trgFailedToRepair, srcSensor, trgRepair,
				trgRepairToOperational, srcRegion, trgOperational, trgFailed, sensorOperationalCoor, trgPetrinet);
		//nothing EMoflonEdge trgFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge trgPetrinet__trgFail____nodes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge trgOperationToFail__trgOperational____place = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgFailToFailed__trgFailed____place = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgRepair__trgPetrinet____petriNet = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgPetrinet__trgRepair____nodes = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgOperationToFail__trgFail____transition = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgFail__trgOperationToFail____arcs = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgFailedToRepair__trgFailed____place = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge srcRegion__srcSensor____sensors = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgOperational__trgPetrinet____petriNet = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgPetrinet__trgOperational____nodes = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgFailedToRepair__trgRepair____transition = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRepair__trgFailedToRepair____arcs = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge sensorFailedCorr__trgFailed____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge sensorOperationalCoor__srcSensor____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge sensorOperationalCoor__trgOperational____target = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgFailed__trgPetrinet____petriNet = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgPetrinet__trgFailed____nodes = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgFailToFailed__trgFail____transition = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgFail__trgFailToFailed____arcs = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge sensorFailedCorr__srcSensor____source = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgRepairToOperational__trgRepair____transition = (EMoflonEdge) result3_green[36];
		//nothing EMoflonEdge trgRepair__trgRepairToOperational____arcs = (EMoflonEdge) result3_green[37];
		//nothing EMoflonEdge trgRepairToOperational__trgOperational____place = (EMoflonEdge) result3_green[38];

		// 
		// 
		SensorImpl.pattern_Sensor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, trgFailToFailed,
				trgFail, sensorFailedCorr, trgOperationToFail, trgFailedToRepair, containerCorr, srcSensor, trgRepair,
				trgRepairToOperational, srcRegion, trgOperational, trgFailed, sensorOperationalCoor, trgPetrinet,
				srcContainer);
		return SensorImpl.pattern_Sensor_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SensorImpl.pattern_Sensor_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SensorImpl.pattern_Sensor_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SensorImpl.pattern_Sensor_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) result2_binding[0];
		Region srcRegion = (Region) result2_binding[1];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[2];
		for (Object[] result2_black : SensorImpl.pattern_Sensor_2_2_corematch_blackFBBFBB(srcSensor, srcRegion,
				srcContainer, match)) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[0];
			PetriNet trgPetrinet = (PetriNet) result2_black[3];
			// ForEach 
			for (Object[] result3_black : SensorImpl.pattern_Sensor_2_3_findcontext_blackBBBBB(containerCorr, srcSensor,
					srcRegion, trgPetrinet, srcContainer)) {
				Object[] result3_green = SensorImpl.pattern_Sensor_2_3_findcontext_greenBBBBBFFFFF(containerCorr,
						srcSensor, srcRegion, trgPetrinet, srcContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge srcRegion__srcSensor____sensors = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = SensorImpl.pattern_Sensor_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
						isApplicableMatch, containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[containerCorr] = " + containerCorr
							+ ", " + "[srcSensor] = " + srcSensor + ", " + "[srcRegion] = " + srcRegion + ", "
							+ "[trgPetrinet] = " + trgPetrinet + ", " + "[srcContainer] = " + srcContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SensorImpl.pattern_Sensor_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SensorImpl.pattern_Sensor_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SensorImpl.pattern_Sensor_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SensorImpl.pattern_Sensor_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {
		match.registerObject("srcSensor", srcSensor);
		match.registerObject("srcRegion", srcRegion);
		match.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion, PetriNet trgPetrinet,
			RailwayContainer srcContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("srcSensor", srcSensor);
		isApplicableMatch.registerObject("srcRegion", srcRegion);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject trgFailToFailed, EObject trgFail,
			EObject sensorFailedCorr, EObject trgOperationToFail, EObject trgFailedToRepair, EObject containerCorr,
			EObject srcSensor, EObject trgRepair, EObject trgRepairToOperational, EObject srcRegion,
			EObject trgOperational, EObject trgFailed, EObject sensorOperationalCoor, EObject trgPetrinet,
			EObject srcContainer) {
		ruleresult.registerObject("trgFailToFailed", trgFailToFailed);
		ruleresult.registerObject("trgFail", trgFail);
		ruleresult.registerObject("sensorFailedCorr", sensorFailedCorr);
		ruleresult.registerObject("trgOperationToFail", trgOperationToFail);
		ruleresult.registerObject("trgFailedToRepair", trgFailedToRepair);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("srcSensor", srcSensor);
		ruleresult.registerObject("trgRepair", trgRepair);
		ruleresult.registerObject("trgRepairToOperational", trgRepairToOperational);
		ruleresult.registerObject("srcRegion", srcRegion);
		ruleresult.registerObject("trgOperational", trgOperational);
		ruleresult.registerObject("trgFailed", trgFailed);
		ruleresult.registerObject("sensorOperationalCoor", sensorOperationalCoor);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcSensor").eClass())
				.equals("railway.Sensor.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_18(EMoflonEdge _edge_sensors) {

		Object[] result1_bindingAndBlack = SensorImpl.pattern_Sensor_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SensorImpl.pattern_Sensor_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SensorImpl.pattern_Sensor_10_2_testcorematchandDECs_blackFFFB(_edge_sensors)) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) result2_black[0];
			Region srcRegion = (Region) result2_black[1];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[2];
			Object[] result2_green = SensorImpl.pattern_Sensor_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SensorImpl.pattern_Sensor_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
					srcSensor, srcRegion, srcContainer)) {
				// 
				if (SensorImpl.pattern_Sensor_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					Object[] result5_black = SensorImpl.pattern_Sensor_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SensorImpl.pattern_Sensor_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SensorImpl.pattern_Sensor_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Sensor");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("trgFailToFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgOperationToFail", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
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

		if (!__helper.hasExpectedValue("trgOperational", "tokens", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgFailed", "tokens", 0, ComparingOperator.EQUAL)) {
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
	public boolean checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {// 
		Object[] result1_black = SensorImpl.pattern_Sensor_13_1_matchtggpattern_blackBBB(srcSensor, srcRegion,
				srcContainer);
		if (result1_black != null) {
			return SensorImpl.pattern_Sensor_13_2_expressionF();
		} else {
			return SensorImpl.pattern_Sensor_13_3_expressionF();
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
		case RulesPackage.SENSOR___IS_APPROPRIATE_FWD__MATCH_SENSOR_REGION_RAILWAYCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(1),
					(Region) arguments.get(2), (RailwayContainer) arguments.get(3));
		case RulesPackage.SENSOR___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SENSOR___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SENSOR___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SENSOR_REGION_RAILWAYCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(1),
					(Region) arguments.get(2), (RailwayContainer) arguments.get(3));
			return null;
		case RulesPackage.SENSOR___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SENSOR_REGION_RAILWAYCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(1),
					(Region) arguments.get(2), (RailwayContainer) arguments.get(3));
		case RulesPackage.SENSOR___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SENSOR___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINERTOPETRINET_SENSOR_REGION_PETRINET_RAILWAYCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(RailwayContainerToPetriNet) arguments.get(1),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(2),
					(Region) arguments.get(3), (PetriNet) arguments.get(4), (RailwayContainer) arguments.get(5));
		case RulesPackage.SENSOR___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SENSOR___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.SENSOR___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SENSOR___IS_APPROPRIATE_FWD_EMOFLON_EDGE_18__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_18((EMoflonEdge) arguments.get(0));
		case RulesPackage.SENSOR___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SENSOR___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SENSOR___CHECK_DEC_FWD__SENSOR_REGION_RAILWAYCONTAINER:
			return checkDEC_FWD((hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(0),
					(Region) arguments.get(1), (RailwayContainer) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Sensor_0_1_initialbindings_blackBBBBB(Sensor _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {
		return new Object[] { _this, match, srcSensor, srcRegion, srcContainer };
	}

	public static final Object[] pattern_Sensor_0_2_SolveCSP_bindingFBBBBB(Sensor _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSensor, srcRegion, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSensor, srcRegion, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_Sensor_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Sensor_0_2_SolveCSP_bindingAndBlackFBBBBB(Sensor _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {
		Object[] result_pattern_Sensor_0_2_SolveCSP_binding = pattern_Sensor_0_2_SolveCSP_bindingFBBBBB(_this, match,
				srcSensor, srcRegion, srcContainer);
		if (result_pattern_Sensor_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Sensor_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Sensor_0_2_SolveCSP_black = pattern_Sensor_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Sensor_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSensor, srcRegion, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_Sensor_0_3_CheckCSP_expressionFBB(Sensor _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Sensor_0_4_collectelementstobetranslated_blackBBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {
		return new Object[] { match, srcSensor, srcRegion, srcContainer };
	}

	public static final Object[] pattern_Sensor_0_4_collectelementstobetranslated_greenBBBF(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion) {
		EMoflonEdge srcRegion__srcSensor____sensors = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcSensor);
		String srcRegion__srcSensor____sensors_name_prime = "sensors";
		srcRegion__srcSensor____sensors.setSrc(srcRegion);
		srcRegion__srcSensor____sensors.setTrg(srcSensor);
		match.getToBeTranslatedEdges().add(srcRegion__srcSensor____sensors);
		srcRegion__srcSensor____sensors.setName(srcRegion__srcSensor____sensors_name_prime);
		return new Object[] { match, srcSensor, srcRegion, srcRegion__srcSensor____sensors };
	}

	public static final Object[] pattern_Sensor_0_5_collectcontextelements_blackBBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {
		return new Object[] { match, srcSensor, srcRegion, srcContainer };
	}

	public static final Object[] pattern_Sensor_0_5_collectcontextelements_greenBBBF(Match match, Region srcRegion,
			RailwayContainer srcContainer) {
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcRegion);
		match.getContextNodes().add(srcContainer);
		String srcContainer__srcRegion____regions_name_prime = "regions";
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		match.getContextEdges().add(srcContainer__srcRegion____regions);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		return new Object[] { match, srcRegion, srcContainer, srcContainer__srcRegion____regions };
	}

	public static final void pattern_Sensor_0_6_registerobjectstomatch_expressionBBBBB(Sensor _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {
		_this.registerObjectsToMatch_FWD(match, srcSensor, srcRegion, srcContainer);

	}

	public static final boolean pattern_Sensor_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Sensor_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Sensor_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcSensor");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcRegion");
		EObject _localVariable_3 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_4 = isApplicableMatch.getObject("srcContainer");
		EObject tmpContainerCorr = _localVariable_0;
		EObject tmpSrcSensor = _localVariable_1;
		EObject tmpSrcRegion = _localVariable_2;
		EObject tmpTrgPetrinet = _localVariable_3;
		EObject tmpSrcContainer = _localVariable_4;
		if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
			if (tmpSrcSensor instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) tmpSrcSensor;
				if (tmpSrcRegion instanceof Region) {
					Region srcRegion = (Region) tmpSrcRegion;
					if (tmpTrgPetrinet instanceof PetriNet) {
						PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
						if (tmpSrcContainer instanceof RailwayContainer) {
							RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
							return new Object[] { containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Sensor_1_1_performtransformation_blackBBBBBFBB(
			RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion, PetriNet trgPetrinet,
			RailwayContainer srcContainer, Sensor _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Sensor_1_1_performtransformation_bindingAndBlackFFFFFFBB(Sensor _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Sensor_1_1_performtransformation_binding = pattern_Sensor_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Sensor_1_1_performtransformation_binding != null) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_Sensor_1_1_performtransformation_binding[0];
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) result_pattern_Sensor_1_1_performtransformation_binding[1];
			Region srcRegion = (Region) result_pattern_Sensor_1_1_performtransformation_binding[2];
			PetriNet trgPetrinet = (PetriNet) result_pattern_Sensor_1_1_performtransformation_binding[3];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_Sensor_1_1_performtransformation_binding[4];

			Object[] result_pattern_Sensor_1_1_performtransformation_black = pattern_Sensor_1_1_performtransformation_blackBBBBBFBB(
					containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer, _this, isApplicableMatch);
			if (result_pattern_Sensor_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Sensor_1_1_performtransformation_black[5];

				return new Object[] { containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Sensor_1_1_performtransformation_greenFFFFFBFFFFFB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, PetriNet trgPetrinet) {
		Arc trgFailToFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		TimedTransition trgFail = StochasticPetriNetFactory.eINSTANCE.createTimedTransition();
		SensorToFailed sensorFailedCorr = StochasticpetrinetFactory.eINSTANCE.createSensorToFailed();
		Arc trgOperationToFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgFailedToRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		TimedTransition trgRepair = StochasticPetriNetFactory.eINSTANCE.createTimedTransition();
		Arc trgRepairToOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Place trgOperational = StochasticPetriNetFactory.eINSTANCE.createPlace();
		Place trgFailed = StochasticPetriNetFactory.eINSTANCE.createPlace();
		SensorToOperational sensorOperationalCoor = StochasticpetrinetFactory.eINSTANCE.createSensorToOperational();
		ArcKind trgFailToFailed_kind_prime = ArcKind.OUTPUT;
		ArcKind trgOperationToFail_kind_prime = ArcKind.INPUT;
		ArcKind trgFailedToRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgRepairToOperational_kind_prime = ArcKind.OUTPUT;
		int trgOperational_tokens_prime = Integer.valueOf(1);
		int trgFailed_tokens_prime = Integer.valueOf(0);
		trgFail.setPetriNet(trgPetrinet);
		trgFailToFailed.setTransition(trgFail);
		sensorFailedCorr.setSource(srcSensor);
		trgOperationToFail.setTransition(trgFail);
		trgRepair.setPetriNet(trgPetrinet);
		trgFailedToRepair.setTransition(trgRepair);
		trgRepairToOperational.setTransition(trgRepair);
		trgOperationToFail.setPlace(trgOperational);
		trgOperational.setPetriNet(trgPetrinet);
		trgRepairToOperational.setPlace(trgOperational);
		trgFailToFailed.setPlace(trgFailed);
		trgFailedToRepair.setPlace(trgFailed);
		sensorFailedCorr.setTarget(trgFailed);
		trgFailed.setPetriNet(trgPetrinet);
		sensorOperationalCoor.setSource(srcSensor);
		sensorOperationalCoor.setTarget(trgOperational);
		trgFailToFailed.setKind(trgFailToFailed_kind_prime);
		trgOperationToFail.setKind(trgOperationToFail_kind_prime);
		trgFailedToRepair.setKind(trgFailedToRepair_kind_prime);
		trgRepairToOperational.setKind(trgRepairToOperational_kind_prime);
		trgOperational.setTokens(Integer.valueOf(trgOperational_tokens_prime));
		trgFailed.setTokens(Integer.valueOf(trgFailed_tokens_prime));
		return new Object[] { trgFailToFailed, trgFail, sensorFailedCorr, trgOperationToFail, trgFailedToRepair,
				srcSensor, trgRepair, trgRepairToOperational, trgOperational, trgFailed, sensorOperationalCoor,
				trgPetrinet };
	}

	public static final Object[] pattern_Sensor_1_2_collecttranslatedelements_blackBBBBBBBBBBB(Arc trgFailToFailed,
			TimedTransition trgFail, SensorToFailed sensorFailedCorr, Arc trgOperationToFail, Arc trgFailedToRepair,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, TimedTransition trgRepair,
			Arc trgRepairToOperational, Place trgOperational, Place trgFailed,
			SensorToOperational sensorOperationalCoor) {
		if (!trgFailToFailed.equals(trgOperationToFail)) {
			if (!trgFailToFailed.equals(trgFailedToRepair)) {
				if (!trgFailToFailed.equals(trgRepairToOperational)) {
					if (!trgFail.equals(trgRepair)) {
						if (!trgOperationToFail.equals(trgRepairToOperational)) {
							if (!trgFailedToRepair.equals(trgOperationToFail)) {
								if (!trgFailedToRepair.equals(trgRepairToOperational)) {
									if (!trgFailed.equals(trgOperational)) {
										return new Object[] { trgFailToFailed, trgFail, sensorFailedCorr,
												trgOperationToFail, trgFailedToRepair, srcSensor, trgRepair,
												trgRepairToOperational, trgOperational, trgFailed,
												sensorOperationalCoor };
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

	public static final Object[] pattern_Sensor_1_2_collecttranslatedelements_greenFBBBBBBBBBBB(Arc trgFailToFailed,
			TimedTransition trgFail, SensorToFailed sensorFailedCorr, Arc trgOperationToFail, Arc trgFailedToRepair,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, TimedTransition trgRepair,
			Arc trgRepairToOperational, Place trgOperational, Place trgFailed,
			SensorToOperational sensorOperationalCoor) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgFailToFailed);
		ruleresult.getCreatedElements().add(trgFail);
		ruleresult.getCreatedLinkElements().add(sensorFailedCorr);
		ruleresult.getCreatedElements().add(trgOperationToFail);
		ruleresult.getCreatedElements().add(trgFailedToRepair);
		ruleresult.getTranslatedElements().add(srcSensor);
		ruleresult.getCreatedElements().add(trgRepair);
		ruleresult.getCreatedElements().add(trgRepairToOperational);
		ruleresult.getCreatedElements().add(trgOperational);
		ruleresult.getCreatedElements().add(trgFailed);
		ruleresult.getCreatedLinkElements().add(sensorOperationalCoor);
		return new Object[] { ruleresult, trgFailToFailed, trgFail, sensorFailedCorr, trgOperationToFail,
				trgFailedToRepair, srcSensor, trgRepair, trgRepairToOperational, trgOperational, trgFailed,
				sensorOperationalCoor };
	}

	public static final Object[] pattern_Sensor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject trgFailToFailed, EObject trgFail, EObject sensorFailedCorr,
			EObject trgOperationToFail, EObject trgFailedToRepair, EObject containerCorr, EObject srcSensor,
			EObject trgRepair, EObject trgRepairToOperational, EObject srcRegion, EObject trgOperational,
			EObject trgFailed, EObject sensorOperationalCoor, EObject trgPetrinet, EObject srcContainer) {
		if (!trgFailToFailed.equals(trgOperationToFail)) {
			if (!trgFailToFailed.equals(trgFailedToRepair)) {
				if (!trgFailToFailed.equals(trgRepair)) {
					if (!trgFailToFailed.equals(trgRepairToOperational)) {
						if (!trgFailToFailed.equals(trgOperational)) {
							if (!trgFailToFailed.equals(trgFailed)) {
								if (!trgFailToFailed.equals(trgPetrinet)) {
									if (!trgFail.equals(trgFailToFailed)) {
										if (!trgFail.equals(trgOperationToFail)) {
											if (!trgFail.equals(trgFailedToRepair)) {
												if (!trgFail.equals(trgRepair)) {
													if (!trgFail.equals(trgRepairToOperational)) {
														if (!trgFail.equals(trgOperational)) {
															if (!trgFail.equals(trgFailed)) {
																if (!trgFail.equals(trgPetrinet)) {
																	if (!sensorFailedCorr.equals(trgFailToFailed)) {
																		if (!sensorFailedCorr.equals(trgFail)) {
																			if (!sensorFailedCorr
																					.equals(trgOperationToFail)) {
																				if (!sensorFailedCorr
																						.equals(trgFailedToRepair)) {
																					if (!sensorFailedCorr
																							.equals(srcSensor)) {
																						if (!sensorFailedCorr
																								.equals(trgRepair)) {
																							if (!sensorFailedCorr
																									.equals(trgRepairToOperational)) {
																								if (!sensorFailedCorr
																										.equals(srcRegion)) {
																									if (!sensorFailedCorr
																											.equals(trgOperational)) {
																										if (!sensorFailedCorr
																												.equals(trgFailed)) {
																											if (!sensorFailedCorr
																													.equals(sensorOperationalCoor)) {
																												if (!sensorFailedCorr
																														.equals(trgPetrinet)) {
																													if (!sensorFailedCorr
																															.equals(srcContainer)) {
																														if (!trgOperationToFail
																																.equals(trgRepair)) {
																															if (!trgOperationToFail
																																	.equals(trgRepairToOperational)) {
																																if (!trgOperationToFail
																																		.equals(trgOperational)) {
																																	if (!trgOperationToFail
																																			.equals(trgPetrinet)) {
																																		if (!trgFailedToRepair
																																				.equals(trgOperationToFail)) {
																																			if (!trgFailedToRepair
																																					.equals(trgRepair)) {
																																				if (!trgFailedToRepair
																																						.equals(trgRepairToOperational)) {
																																					if (!trgFailedToRepair
																																							.equals(trgOperational)) {
																																						if (!trgFailedToRepair
																																								.equals(trgPetrinet)) {
																																							if (!containerCorr
																																									.equals(trgFailToFailed)) {
																																								if (!containerCorr
																																										.equals(trgFail)) {
																																									if (!containerCorr
																																											.equals(sensorFailedCorr)) {
																																										if (!containerCorr
																																												.equals(trgOperationToFail)) {
																																											if (!containerCorr
																																													.equals(trgFailedToRepair)) {
																																												if (!containerCorr
																																														.equals(srcSensor)) {
																																													if (!containerCorr
																																															.equals(trgRepair)) {
																																														if (!containerCorr
																																																.equals(trgRepairToOperational)) {
																																															if (!containerCorr
																																																	.equals(srcRegion)) {
																																																if (!containerCorr
																																																		.equals(trgOperational)) {
																																																	if (!containerCorr
																																																			.equals(trgFailed)) {
																																																		if (!containerCorr
																																																				.equals(sensorOperationalCoor)) {
																																																			if (!containerCorr
																																																					.equals(trgPetrinet)) {
																																																				if (!containerCorr
																																																						.equals(srcContainer)) {
																																																					if (!srcSensor
																																																							.equals(trgFailToFailed)) {
																																																						if (!srcSensor
																																																								.equals(trgFail)) {
																																																							if (!srcSensor
																																																									.equals(trgOperationToFail)) {
																																																								if (!srcSensor
																																																										.equals(trgFailedToRepair)) {
																																																									if (!srcSensor
																																																											.equals(trgRepair)) {
																																																										if (!srcSensor
																																																												.equals(trgRepairToOperational)) {
																																																											if (!srcSensor
																																																													.equals(trgOperational)) {
																																																												if (!srcSensor
																																																														.equals(trgFailed)) {
																																																													if (!srcSensor
																																																															.equals(trgPetrinet)) {
																																																														if (!trgRepair
																																																																.equals(trgRepairToOperational)) {
																																																															if (!srcRegion
																																																																	.equals(trgFailToFailed)) {
																																																																if (!srcRegion
																																																																		.equals(trgFail)) {
																																																																	if (!srcRegion
																																																																			.equals(trgOperationToFail)) {
																																																																		if (!srcRegion
																																																																				.equals(trgFailedToRepair)) {
																																																																			if (!srcRegion
																																																																					.equals(srcSensor)) {
																																																																				if (!srcRegion
																																																																						.equals(trgRepair)) {
																																																																					if (!srcRegion
																																																																							.equals(trgRepairToOperational)) {
																																																																						if (!srcRegion
																																																																								.equals(trgOperational)) {
																																																																							if (!srcRegion
																																																																									.equals(trgFailed)) {
																																																																								if (!srcRegion
																																																																										.equals(trgPetrinet)) {
																																																																									if (!trgOperational
																																																																											.equals(trgRepair)) {
																																																																										if (!trgOperational
																																																																												.equals(trgRepairToOperational)) {
																																																																											if (!trgOperational
																																																																													.equals(trgPetrinet)) {
																																																																												if (!trgFailed
																																																																														.equals(trgOperationToFail)) {
																																																																													if (!trgFailed
																																																																															.equals(trgFailedToRepair)) {
																																																																														if (!trgFailed
																																																																																.equals(trgRepair)) {
																																																																															if (!trgFailed
																																																																																	.equals(trgRepairToOperational)) {
																																																																																if (!trgFailed
																																																																																		.equals(trgOperational)) {
																																																																																	if (!trgFailed
																																																																																			.equals(trgPetrinet)) {
																																																																																		if (!sensorOperationalCoor
																																																																																				.equals(trgFailToFailed)) {
																																																																																			if (!sensorOperationalCoor
																																																																																					.equals(trgFail)) {
																																																																																				if (!sensorOperationalCoor
																																																																																						.equals(trgOperationToFail)) {
																																																																																					if (!sensorOperationalCoor
																																																																																							.equals(trgFailedToRepair)) {
																																																																																						if (!sensorOperationalCoor
																																																																																								.equals(srcSensor)) {
																																																																																							if (!sensorOperationalCoor
																																																																																									.equals(trgRepair)) {
																																																																																								if (!sensorOperationalCoor
																																																																																										.equals(trgRepairToOperational)) {
																																																																																									if (!sensorOperationalCoor
																																																																																											.equals(srcRegion)) {
																																																																																										if (!sensorOperationalCoor
																																																																																												.equals(trgOperational)) {
																																																																																											if (!sensorOperationalCoor
																																																																																													.equals(trgFailed)) {
																																																																																												if (!sensorOperationalCoor
																																																																																														.equals(trgPetrinet)) {
																																																																																													if (!sensorOperationalCoor
																																																																																															.equals(srcContainer)) {
																																																																																														if (!trgPetrinet
																																																																																																.equals(trgRepair)) {
																																																																																															if (!trgPetrinet
																																																																																																	.equals(trgRepairToOperational)) {
																																																																																																if (!srcContainer
																																																																																																		.equals(trgFailToFailed)) {
																																																																																																	if (!srcContainer
																																																																																																			.equals(trgFail)) {
																																																																																																		if (!srcContainer
																																																																																																				.equals(trgOperationToFail)) {
																																																																																																			if (!srcContainer
																																																																																																					.equals(trgFailedToRepair)) {
																																																																																																				if (!srcContainer
																																																																																																						.equals(srcSensor)) {
																																																																																																					if (!srcContainer
																																																																																																							.equals(trgRepair)) {
																																																																																																						if (!srcContainer
																																																																																																								.equals(trgRepairToOperational)) {
																																																																																																							if (!srcContainer
																																																																																																									.equals(srcRegion)) {
																																																																																																								if (!srcContainer
																																																																																																										.equals(trgOperational)) {
																																																																																																									if (!srcContainer
																																																																																																											.equals(trgFailed)) {
																																																																																																										if (!srcContainer
																																																																																																												.equals(trgPetrinet)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													trgFailToFailed,
																																																																																																													trgFail,
																																																																																																													sensorFailedCorr,
																																																																																																													trgOperationToFail,
																																																																																																													trgFailedToRepair,
																																																																																																													containerCorr,
																																																																																																													srcSensor,
																																																																																																													trgRepair,
																																																																																																													trgRepairToOperational,
																																																																																																													srcRegion,
																																																																																																													trgOperational,
																																																																																																													trgFailed,
																																																																																																													sensorOperationalCoor,
																																																																																																													trgPetrinet,
																																																																																																													srcContainer };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Sensor_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject trgFailToFailed, EObject trgFail, EObject sensorFailedCorr,
			EObject trgOperationToFail, EObject trgFailedToRepair, EObject srcSensor, EObject trgRepair,
			EObject trgRepairToOperational, EObject srcRegion, EObject trgOperational, EObject trgFailed,
			EObject sensorOperationalCoor, EObject trgPetrinet) {
		EMoflonEdge trgFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperationToFail__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailToFailed__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRepair____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperationToFail__trgFail____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgOperationToFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRegion__srcSensor____sensors = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperational__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgOperational____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgFailedToRepair____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorFailedCorr__trgFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorOperationalCoor__srcSensor____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorOperationalCoor__trgOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailed__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFailed____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailToFailed__trgFail____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgFailToFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorFailedCorr__srcSensor____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgRepairToOperational____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Sensor";
		String trgFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFail____nodes_name_prime = "nodes";
		String trgOperationToFail__trgOperational____place_name_prime = "place";
		String trgFailToFailed__trgFailed____place_name_prime = "place";
		String trgRepair__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRepair____nodes_name_prime = "nodes";
		String trgOperationToFail__trgFail____transition_name_prime = "transition";
		String trgFail__trgOperationToFail____arcs_name_prime = "arcs";
		String trgFailedToRepair__trgFailed____place_name_prime = "place";
		String srcRegion__srcSensor____sensors_name_prime = "sensors";
		String trgOperational__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgOperational____nodes_name_prime = "nodes";
		String trgFailedToRepair__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgFailedToRepair____arcs_name_prime = "arcs";
		String sensorFailedCorr__trgFailed____target_name_prime = "target";
		String sensorOperationalCoor__srcSensor____source_name_prime = "source";
		String sensorOperationalCoor__trgOperational____target_name_prime = "target";
		String trgFailed__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFailed____nodes_name_prime = "nodes";
		String trgFailToFailed__trgFail____transition_name_prime = "transition";
		String trgFail__trgFailToFailed____arcs_name_prime = "arcs";
		String sensorFailedCorr__srcSensor____source_name_prime = "source";
		String trgRepairToOperational__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgRepairToOperational____arcs_name_prime = "arcs";
		String trgRepairToOperational__trgOperational____place_name_prime = "place";
		trgFail__trgPetrinet____petriNet.setSrc(trgFail);
		trgFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFail__trgPetrinet____petriNet);
		trgPetrinet__trgFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFail____nodes.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFail____nodes);
		trgOperationToFail__trgOperational____place.setSrc(trgOperationToFail);
		trgOperationToFail__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgOperationToFail__trgOperational____place);
		trgFailToFailed__trgFailed____place.setSrc(trgFailToFailed);
		trgFailToFailed__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailToFailed__trgFailed____place);
		trgRepair__trgPetrinet____petriNet.setSrc(trgRepair);
		trgRepair__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRepair__trgPetrinet____petriNet);
		trgPetrinet__trgRepair____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRepair____nodes.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRepair____nodes);
		trgOperationToFail__trgFail____transition.setSrc(trgOperationToFail);
		trgOperationToFail__trgFail____transition.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgOperationToFail__trgFail____transition);
		trgFail__trgOperationToFail____arcs.setSrc(trgFail);
		trgFail__trgOperationToFail____arcs.setTrg(trgOperationToFail);
		ruleresult.getCreatedEdges().add(trgFail__trgOperationToFail____arcs);
		trgFailedToRepair__trgFailed____place.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgFailed____place);
		srcRegion__srcSensor____sensors.setSrc(srcRegion);
		srcRegion__srcSensor____sensors.setTrg(srcSensor);
		ruleresult.getTranslatedEdges().add(srcRegion__srcSensor____sensors);
		trgOperational__trgPetrinet____petriNet.setSrc(trgOperational);
		trgOperational__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgOperational__trgPetrinet____petriNet);
		trgPetrinet__trgOperational____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgOperational____nodes.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgOperational____nodes);
		trgFailedToRepair__trgRepair____transition.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgRepair____transition);
		trgRepair__trgFailedToRepair____arcs.setSrc(trgRepair);
		trgRepair__trgFailedToRepair____arcs.setTrg(trgFailedToRepair);
		ruleresult.getCreatedEdges().add(trgRepair__trgFailedToRepair____arcs);
		sensorFailedCorr__trgFailed____target.setSrc(sensorFailedCorr);
		sensorFailedCorr__trgFailed____target.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(sensorFailedCorr__trgFailed____target);
		sensorOperationalCoor__srcSensor____source.setSrc(sensorOperationalCoor);
		sensorOperationalCoor__srcSensor____source.setTrg(srcSensor);
		ruleresult.getCreatedEdges().add(sensorOperationalCoor__srcSensor____source);
		sensorOperationalCoor__trgOperational____target.setSrc(sensorOperationalCoor);
		sensorOperationalCoor__trgOperational____target.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(sensorOperationalCoor__trgOperational____target);
		trgFailed__trgPetrinet____petriNet.setSrc(trgFailed);
		trgFailed__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFailed__trgPetrinet____petriNet);
		trgPetrinet__trgFailed____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFailed____nodes.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFailed____nodes);
		trgFailToFailed__trgFail____transition.setSrc(trgFailToFailed);
		trgFailToFailed__trgFail____transition.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgFailToFailed__trgFail____transition);
		trgFail__trgFailToFailed____arcs.setSrc(trgFail);
		trgFail__trgFailToFailed____arcs.setTrg(trgFailToFailed);
		ruleresult.getCreatedEdges().add(trgFail__trgFailToFailed____arcs);
		sensorFailedCorr__srcSensor____source.setSrc(sensorFailedCorr);
		sensorFailedCorr__srcSensor____source.setTrg(srcSensor);
		ruleresult.getCreatedEdges().add(sensorFailedCorr__srcSensor____source);
		trgRepairToOperational__trgRepair____transition.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgRepair____transition);
		trgRepair__trgRepairToOperational____arcs.setSrc(trgRepair);
		trgRepair__trgRepairToOperational____arcs.setTrg(trgRepairToOperational);
		ruleresult.getCreatedEdges().add(trgRepair__trgRepairToOperational____arcs);
		trgRepairToOperational__trgOperational____place.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgOperational____place);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgFail__trgPetrinet____petriNet.setName(trgFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFail____nodes.setName(trgPetrinet__trgFail____nodes_name_prime);
		trgOperationToFail__trgOperational____place.setName(trgOperationToFail__trgOperational____place_name_prime);
		trgFailToFailed__trgFailed____place.setName(trgFailToFailed__trgFailed____place_name_prime);
		trgRepair__trgPetrinet____petriNet.setName(trgRepair__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRepair____nodes.setName(trgPetrinet__trgRepair____nodes_name_prime);
		trgOperationToFail__trgFail____transition.setName(trgOperationToFail__trgFail____transition_name_prime);
		trgFail__trgOperationToFail____arcs.setName(trgFail__trgOperationToFail____arcs_name_prime);
		trgFailedToRepair__trgFailed____place.setName(trgFailedToRepair__trgFailed____place_name_prime);
		srcRegion__srcSensor____sensors.setName(srcRegion__srcSensor____sensors_name_prime);
		trgOperational__trgPetrinet____petriNet.setName(trgOperational__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgOperational____nodes.setName(trgPetrinet__trgOperational____nodes_name_prime);
		trgFailedToRepair__trgRepair____transition.setName(trgFailedToRepair__trgRepair____transition_name_prime);
		trgRepair__trgFailedToRepair____arcs.setName(trgRepair__trgFailedToRepair____arcs_name_prime);
		sensorFailedCorr__trgFailed____target.setName(sensorFailedCorr__trgFailed____target_name_prime);
		sensorOperationalCoor__srcSensor____source.setName(sensorOperationalCoor__srcSensor____source_name_prime);
		sensorOperationalCoor__trgOperational____target
				.setName(sensorOperationalCoor__trgOperational____target_name_prime);
		trgFailed__trgPetrinet____petriNet.setName(trgFailed__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFailed____nodes.setName(trgPetrinet__trgFailed____nodes_name_prime);
		trgFailToFailed__trgFail____transition.setName(trgFailToFailed__trgFail____transition_name_prime);
		trgFail__trgFailToFailed____arcs.setName(trgFail__trgFailToFailed____arcs_name_prime);
		sensorFailedCorr__srcSensor____source.setName(sensorFailedCorr__srcSensor____source_name_prime);
		trgRepairToOperational__trgRepair____transition
				.setName(trgRepairToOperational__trgRepair____transition_name_prime);
		trgRepair__trgRepairToOperational____arcs.setName(trgRepair__trgRepairToOperational____arcs_name_prime);
		trgRepairToOperational__trgOperational____place
				.setName(trgRepairToOperational__trgOperational____place_name_prime);
		return new Object[] { ruleresult, trgFailToFailed, trgFail, sensorFailedCorr, trgOperationToFail,
				trgFailedToRepair, srcSensor, trgRepair, trgRepairToOperational, srcRegion, trgOperational, trgFailed,
				sensorOperationalCoor, trgPetrinet, trgFail__trgPetrinet____petriNet, trgPetrinet__trgFail____nodes,
				trgOperationToFail__trgOperational____place, trgFailToFailed__trgFailed____place,
				trgRepair__trgPetrinet____petriNet, trgPetrinet__trgRepair____nodes,
				trgOperationToFail__trgFail____transition, trgFail__trgOperationToFail____arcs,
				trgFailedToRepair__trgFailed____place, srcRegion__srcSensor____sensors,
				trgOperational__trgPetrinet____petriNet, trgPetrinet__trgOperational____nodes,
				trgFailedToRepair__trgRepair____transition, trgRepair__trgFailedToRepair____arcs,
				sensorFailedCorr__trgFailed____target, sensorOperationalCoor__srcSensor____source,
				sensorOperationalCoor__trgOperational____target, trgFailed__trgPetrinet____petriNet,
				trgPetrinet__trgFailed____nodes, trgFailToFailed__trgFail____transition,
				trgFail__trgFailToFailed____arcs, sensorFailedCorr__srcSensor____source,
				trgRepairToOperational__trgRepair____transition, trgRepair__trgRepairToOperational____arcs,
				trgRepairToOperational__trgOperational____place };
	}

	public static final void pattern_Sensor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(Sensor _this,
			PerformRuleResult ruleresult, EObject trgFailToFailed, EObject trgFail, EObject sensorFailedCorr,
			EObject trgOperationToFail, EObject trgFailedToRepair, EObject containerCorr, EObject srcSensor,
			EObject trgRepair, EObject trgRepairToOperational, EObject srcRegion, EObject trgOperational,
			EObject trgFailed, EObject sensorOperationalCoor, EObject trgPetrinet, EObject srcContainer) {
		_this.registerObjects_FWD(ruleresult, trgFailToFailed, trgFail, sensorFailedCorr, trgOperationToFail,
				trgFailedToRepair, containerCorr, srcSensor, trgRepair, trgRepairToOperational, srcRegion,
				trgOperational, trgFailed, sensorOperationalCoor, trgPetrinet, srcContainer);

	}

	public static final PerformRuleResult pattern_Sensor_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Sensor_2_1_preparereturnvalue_bindingFB(Sensor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Sensor_2_1_preparereturnvalue_blackFBB(EClass eClass, Sensor _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Sensor_2_1_preparereturnvalue_bindingAndBlackFFB(Sensor _this) {
		Object[] result_pattern_Sensor_2_1_preparereturnvalue_binding = pattern_Sensor_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Sensor_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Sensor_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Sensor_2_1_preparereturnvalue_black = pattern_Sensor_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Sensor_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Sensor_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Sensor_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Sensor";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Sensor_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcSensor");
		EObject _localVariable_1 = match.getObject("srcRegion");
		EObject _localVariable_2 = match.getObject("srcContainer");
		EObject tmpSrcSensor = _localVariable_0;
		EObject tmpSrcRegion = _localVariable_1;
		EObject tmpSrcContainer = _localVariable_2;
		if (tmpSrcSensor instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) tmpSrcSensor;
			if (tmpSrcRegion instanceof Region) {
				Region srcRegion = (Region) tmpSrcRegion;
				if (tmpSrcContainer instanceof RailwayContainer) {
					RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
					return new Object[] { srcSensor, srcRegion, srcContainer, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Sensor_2_2_corematch_blackFBBFBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
			PetriNet trgPetrinet = containerCorr.getTarget();
			if (trgPetrinet != null) {
				_result.add(new Object[] { containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Sensor_2_3_findcontext_blackBBBBB(
			RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion, PetriNet trgPetrinet,
			RailwayContainer srcContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcRegion.getSensors().contains(srcSensor)) {
			if (trgPetrinet.equals(containerCorr.getTarget())) {
				if (srcContainer.equals(containerCorr.getSource())) {
					if (srcContainer.getRegions().contains(srcRegion)) {
						_result.add(new Object[] { containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Sensor_2_3_findcontext_greenBBBBBFFFFF(
			RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion, PetriNet trgPetrinet,
			RailwayContainer srcContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcRegion__srcSensor____sensors = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcRegion__srcSensor____sensors_name_prime = "sensors";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String containerCorr__srcContainer____source_name_prime = "source";
		String srcContainer__srcRegion____regions_name_prime = "regions";
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(srcSensor);
		isApplicableMatch.getAllContextElements().add(srcRegion);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		srcRegion__srcSensor____sensors.setSrc(srcRegion);
		srcRegion__srcSensor____sensors.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(srcRegion__srcSensor____sensors);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRegion____regions);
		srcRegion__srcSensor____sensors.setName(srcRegion__srcSensor____sensors_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		return new Object[] { containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer, isApplicableMatch,
				srcRegion__srcSensor____sensors, containerCorr__trgPetrinet____target,
				containerCorr__srcContainer____source, srcContainer__srcRegion____regions };
	}

	public static final Object[] pattern_Sensor_2_4_solveCSP_bindingFBBBBBBB(Sensor _this,
			IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion, PetriNet trgPetrinet,
			RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, containerCorr, srcSensor, srcRegion,
				trgPetrinet, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, containerCorr, srcSensor, srcRegion, trgPetrinet,
					srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_Sensor_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Sensor_2_4_solveCSP_bindingAndBlackFBBBBBBB(Sensor _this,
			IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion, PetriNet trgPetrinet,
			RailwayContainer srcContainer) {
		Object[] result_pattern_Sensor_2_4_solveCSP_binding = pattern_Sensor_2_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, containerCorr, srcSensor, srcRegion, trgPetrinet, srcContainer);
		if (result_pattern_Sensor_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Sensor_2_4_solveCSP_binding[0];

			Object[] result_pattern_Sensor_2_4_solveCSP_black = pattern_Sensor_2_4_solveCSP_blackB(csp);
			if (result_pattern_Sensor_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, containerCorr, srcSensor, srcRegion, trgPetrinet,
						srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_Sensor_2_5_checkCSP_expressionFBB(Sensor _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Sensor_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Sensor_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Sensor";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Sensor_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Sensor_10_1_preparereturnvalue_bindingFB(Sensor _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Sensor_10_1_preparereturnvalue_blackFBBF(EClass __eClass, Sensor _this) {
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

	public static final Object[] pattern_Sensor_10_1_preparereturnvalue_bindingAndBlackFFBF(Sensor _this) {
		Object[] result_pattern_Sensor_10_1_preparereturnvalue_binding = pattern_Sensor_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Sensor_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Sensor_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Sensor_10_1_preparereturnvalue_black = pattern_Sensor_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Sensor_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Sensor_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Sensor_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Sensor_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Sensor_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_sensors) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcRegion = _edge_sensors.getSrc();
		if (tmpSrcRegion instanceof Region) {
			Region srcRegion = (Region) tmpSrcRegion;
			EObject tmpSrcSensor = _edge_sensors.getTrg();
			if (tmpSrcSensor instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) tmpSrcSensor;
				if (srcRegion.getSensors().contains(srcSensor)) {
					for (RailwayContainer srcContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(srcRegion, RailwayContainer.class, "regions")) {
						_result.add(new Object[] { srcSensor, srcRegion, srcContainer, _edge_sensors });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Sensor_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Sensor_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			Sensor _this, Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			Region srcRegion, RailwayContainer srcContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSensor, srcRegion, srcContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Sensor_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Sensor _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Sensor_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Sensor_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Sensor_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Sensor_13_1_matchtggpattern_blackBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Region srcRegion,
			RailwayContainer srcContainer) {
		if (srcRegion.getSensors().contains(srcSensor)) {
			if (srcContainer.getRegions().contains(srcRegion)) {
				return new Object[] { srcSensor, srcRegion, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_Sensor_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Sensor_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SensorImpl
