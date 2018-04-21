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
			RailwayContainer srcContainer, Region srcRegion) {

		Object[] result1_black = SensorImpl.pattern_Sensor_0_1_initialbindings_blackBBBBB(this, match, srcSensor,
				srcContainer, srcRegion);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSensor] = " + srcSensor + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[srcRegion] = " + srcRegion + ".");
		}

		Object[] result2_bindingAndBlack = SensorImpl.pattern_Sensor_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
				srcSensor, srcContainer, srcRegion);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSensor] = " + srcSensor + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[srcRegion] = " + srcRegion + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SensorImpl.pattern_Sensor_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SensorImpl.pattern_Sensor_0_4_collectelementstobetranslated_blackBBBB(match,
					srcSensor, srcContainer, srcRegion);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSensor] = " + srcSensor + ", " + "[srcContainer] = " + srcContainer + ", "
						+ "[srcRegion] = " + srcRegion + ".");
			}
			SensorImpl.pattern_Sensor_0_4_collectelementstobetranslated_greenBBBF(match, srcSensor, srcRegion);
			//nothing EMoflonEdge srcRegion__srcSensor____sensors = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SensorImpl.pattern_Sensor_0_5_collectcontextelements_blackBBBB(match, srcSensor,
					srcContainer, srcRegion);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSensor] = " + srcSensor + ", " + "[srcContainer] = " + srcContainer + ", "
						+ "[srcRegion] = " + srcRegion + ".");
			}
			SensorImpl.pattern_Sensor_0_5_collectcontextelements_greenBBBF(match, srcContainer, srcRegion);
			//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result5_green[3];

			// 
			SensorImpl.pattern_Sensor_0_6_registerobjectstomatch_expressionBBBBB(this, match, srcSensor, srcContainer,
					srcRegion);
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
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) result1_bindingAndBlack[0];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[1];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[2];
		Region srcRegion = (Region) result1_bindingAndBlack[3];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SensorImpl.pattern_Sensor_1_1_performtransformation_greenBFFFFFFFFBFF(srcSensor,
				trgPetrinet);
		Place trgFailed = (Place) result1_green[1];
		SensorToOperational sensorOperationalCoor = (SensorToOperational) result1_green[2];
		Arc trgRepairToOperational = (Arc) result1_green[3];
		Arc trgOperationToFail = (Arc) result1_green[4];
		Arc trgFailedToRepair = (Arc) result1_green[5];
		SensorToFailed sensorFailedCorr = (SensorToFailed) result1_green[6];
		Arc trgFailToFailed = (Arc) result1_green[7];
		TimedTransition trgRepair = (TimedTransition) result1_green[8];
		Place trgOperational = (Place) result1_green[10];
		TimedTransition trgFail = (TimedTransition) result1_green[11];

		Object[] result2_black = SensorImpl.pattern_Sensor_1_2_collecttranslatedelements_blackBBBBBBBBBBB(srcSensor,
				trgFailed, sensorOperationalCoor, trgRepairToOperational, trgOperationToFail, trgFailedToRepair,
				sensorFailedCorr, trgFailToFailed, trgRepair, trgOperational, trgFail);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[srcSensor] = " + srcSensor + ", "
					+ "[trgFailed] = " + trgFailed + ", " + "[sensorOperationalCoor] = " + sensorOperationalCoor + ", "
					+ "[trgRepairToOperational] = " + trgRepairToOperational + ", " + "[trgOperationToFail] = "
					+ trgOperationToFail + ", " + "[trgFailedToRepair] = " + trgFailedToRepair + ", "
					+ "[sensorFailedCorr] = " + sensorFailedCorr + ", " + "[trgFailToFailed] = " + trgFailToFailed
					+ ", " + "[trgRepair] = " + trgRepair + ", " + "[trgOperational] = " + trgOperational + ", "
					+ "[trgFail] = " + trgFail + ".");
		}
		Object[] result2_green = SensorImpl.pattern_Sensor_1_2_collecttranslatedelements_greenFBBBBBBBBBBB(srcSensor,
				trgFailed, sensorOperationalCoor, trgRepairToOperational, trgOperationToFail, trgFailedToRepair,
				sensorFailedCorr, trgFailToFailed, trgRepair, trgOperational, trgFail);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SensorImpl.pattern_Sensor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult,
				srcSensor, trgFailed, sensorOperationalCoor, trgRepairToOperational, containerCorr, trgOperationToFail,
				srcContainer, trgFailedToRepair, sensorFailedCorr, trgFailToFailed, srcRegion, trgRepair, trgPetrinet,
				trgOperational, trgFail);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[srcSensor] = " + srcSensor + ", " + "[trgFailed] = " + trgFailed + ", "
					+ "[sensorOperationalCoor] = " + sensorOperationalCoor + ", " + "[trgRepairToOperational] = "
					+ trgRepairToOperational + ", " + "[containerCorr] = " + containerCorr + ", "
					+ "[trgOperationToFail] = " + trgOperationToFail + ", " + "[srcContainer] = " + srcContainer + ", "
					+ "[trgFailedToRepair] = " + trgFailedToRepair + ", " + "[sensorFailedCorr] = " + sensorFailedCorr
					+ ", " + "[trgFailToFailed] = " + trgFailToFailed + ", " + "[srcRegion] = " + srcRegion + ", "
					+ "[trgRepair] = " + trgRepair + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
					+ "[trgOperational] = " + trgOperational + ", " + "[trgFail] = " + trgFail + ".");
		}
		SensorImpl.pattern_Sensor_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(ruleresult,
				srcSensor, trgFailed, sensorOperationalCoor, trgRepairToOperational, trgOperationToFail,
				trgFailedToRepair, sensorFailedCorr, trgFailToFailed, srcRegion, trgRepair, trgPetrinet, trgOperational,
				trgFail);
		//nothing EMoflonEdge sensorOperationalCoor__srcSensor____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge trgRepairToOperational__trgOperational____place = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge trgFailToFailed__trgFailed____place = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgRepair__trgPetrinet____petriNet = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgPetrinet__trgRepair____nodes = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge sensorFailedCorr__srcSensor____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgFailedToRepair__trgRepair____transition = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgRepair__trgFailedToRepair____arcs = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge trgFailToFailed__trgFail____transition = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgFail__trgFailToFailed____arcs = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgRepairToOperational__trgRepair____transition = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgRepair__trgRepairToOperational____arcs = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgOperationToFail__trgOperational____place = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgOperational__trgPetrinet____petriNet = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgPetrinet__trgOperational____nodes = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge sensorOperationalCoor__trgOperational____target = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge srcRegion__srcSensor____sensors = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgOperationToFail__trgFail____transition = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgFail__trgOperationToFail____arcs = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge sensorFailedCorr__trgFailed____target = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgFailedToRepair__trgFailed____place = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgPetrinet__trgFail____nodes = (EMoflonEdge) result3_green[36];
		//nothing EMoflonEdge trgFailed__trgPetrinet____petriNet = (EMoflonEdge) result3_green[37];
		//nothing EMoflonEdge trgPetrinet__trgFailed____nodes = (EMoflonEdge) result3_green[38];

		// 
		// 
		SensorImpl.pattern_Sensor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, srcSensor,
				trgFailed, sensorOperationalCoor, trgRepairToOperational, containerCorr, trgOperationToFail,
				srcContainer, trgFailedToRepair, sensorFailedCorr, trgFailToFailed, srcRegion, trgRepair, trgPetrinet,
				trgOperational, trgFail);
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
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[1];
		Region srcRegion = (Region) result2_binding[2];
		for (Object[] result2_black : SensorImpl.pattern_Sensor_2_2_corematch_blackBFBBFB(srcSensor, srcContainer,
				srcRegion, match)) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[1];
			PetriNet trgPetrinet = (PetriNet) result2_black[4];
			// ForEach 
			for (Object[] result3_black : SensorImpl.pattern_Sensor_2_3_findcontext_blackBBBBB(srcSensor, containerCorr,
					srcContainer, srcRegion, trgPetrinet)) {
				Object[] result3_green = SensorImpl.pattern_Sensor_2_3_findcontext_greenBBBBBFFFFF(srcSensor,
						containerCorr, srcContainer, srcRegion, trgPetrinet);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge srcRegion__srcSensor____sensors = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = SensorImpl.pattern_Sensor_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
						isApplicableMatch, srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[srcSensor] = " + srcSensor + ", "
							+ "[containerCorr] = " + containerCorr + ", " + "[srcContainer] = " + srcContainer + ", "
							+ "[srcRegion] = " + srcRegion + ", " + "[trgPetrinet] = " + trgPetrinet + ".");
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {
		match.registerObject("srcSensor", srcSensor);
		match.registerObject("srcContainer", srcContainer);
		match.registerObject("srcRegion", srcRegion);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			RailwayContainerToPetriNet containerCorr, RailwayContainer srcContainer, Region srcRegion,
			PetriNet trgPetrinet) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcSensor", srcSensor);
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("srcRegion", srcRegion);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcSensor, EObject trgFailed,
			EObject sensorOperationalCoor, EObject trgRepairToOperational, EObject containerCorr,
			EObject trgOperationToFail, EObject srcContainer, EObject trgFailedToRepair, EObject sensorFailedCorr,
			EObject trgFailToFailed, EObject srcRegion, EObject trgRepair, EObject trgPetrinet, EObject trgOperational,
			EObject trgFail) {
		ruleresult.registerObject("srcSensor", srcSensor);
		ruleresult.registerObject("trgFailed", trgFailed);
		ruleresult.registerObject("sensorOperationalCoor", sensorOperationalCoor);
		ruleresult.registerObject("trgRepairToOperational", trgRepairToOperational);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("trgOperationToFail", trgOperationToFail);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgFailedToRepair", trgFailedToRepair);
		ruleresult.registerObject("sensorFailedCorr", sensorFailedCorr);
		ruleresult.registerObject("trgFailToFailed", trgFailToFailed);
		ruleresult.registerObject("srcRegion", srcRegion);
		ruleresult.registerObject("trgRepair", trgRepair);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgOperational", trgOperational);
		ruleresult.registerObject("trgFail", trgFail);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(EMoflonEdge _edge_sensors) {

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
			RailwayContainer srcContainer = (RailwayContainer) result2_black[1];
			Region srcRegion = (Region) result2_black[2];
			Object[] result2_green = SensorImpl.pattern_Sensor_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SensorImpl.pattern_Sensor_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
					srcSensor, srcContainer, srcRegion)) {
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

		if (!__helper.hasExpectedValue("trgFailed", "tokens", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRepairToOperational", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
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

		if (!__helper.hasExpectedValue("trgFailToFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgOperational", "tokens", 1, ComparingOperator.EQUAL)) {
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
	public boolean checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			RailwayContainer srcContainer, Region srcRegion) {// 
		Object[] result1_black = SensorImpl.pattern_Sensor_13_1_matchtggpattern_blackBBB(srcSensor, srcContainer,
				srcRegion);
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
		case RulesPackage.SENSOR___IS_APPROPRIATE_FWD__MATCH_SENSOR_RAILWAYCONTAINER_REGION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Region) arguments.get(3));
		case RulesPackage.SENSOR___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SENSOR___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SENSOR___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SENSOR_RAILWAYCONTAINER_REGION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Region) arguments.get(3));
			return null;
		case RulesPackage.SENSOR___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SENSOR_RAILWAYCONTAINER_REGION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Region) arguments.get(3));
		case RulesPackage.SENSOR___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SENSOR___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SENSOR_RAILWAYCONTAINERTOPETRINET_RAILWAYCONTAINER_REGION_PETRINET:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(1),
					(RailwayContainerToPetriNet) arguments.get(2), (RailwayContainer) arguments.get(3),
					(Region) arguments.get(4), (PetriNet) arguments.get(5));
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
		case RulesPackage.SENSOR___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.SENSOR___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SENSOR___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SENSOR___CHECK_DEC_FWD__SENSOR_RAILWAYCONTAINER_REGION:
			return checkDEC_FWD((hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) arguments.get(0),
					(RailwayContainer) arguments.get(1), (Region) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Sensor_0_1_initialbindings_blackBBBBB(Sensor _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {
		return new Object[] { _this, match, srcSensor, srcContainer, srcRegion };
	}

	public static final Object[] pattern_Sensor_0_2_SolveCSP_bindingFBBBBB(Sensor _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSensor, srcContainer, srcRegion);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSensor, srcContainer, srcRegion };
		}
		return null;
	}

	public static final Object[] pattern_Sensor_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Sensor_0_2_SolveCSP_bindingAndBlackFBBBBB(Sensor _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {
		Object[] result_pattern_Sensor_0_2_SolveCSP_binding = pattern_Sensor_0_2_SolveCSP_bindingFBBBBB(_this, match,
				srcSensor, srcContainer, srcRegion);
		if (result_pattern_Sensor_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Sensor_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Sensor_0_2_SolveCSP_black = pattern_Sensor_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Sensor_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSensor, srcContainer, srcRegion };
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {
		return new Object[] { match, srcSensor, srcContainer, srcRegion };
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {
		return new Object[] { match, srcSensor, srcContainer, srcRegion };
	}

	public static final Object[] pattern_Sensor_0_5_collectcontextelements_greenBBBF(Match match,
			RailwayContainer srcContainer, Region srcRegion) {
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcContainer);
		match.getContextNodes().add(srcRegion);
		String srcContainer__srcRegion____regions_name_prime = "regions";
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		match.getContextEdges().add(srcContainer__srcRegion____regions);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		return new Object[] { match, srcContainer, srcRegion, srcContainer__srcRegion____regions };
	}

	public static final void pattern_Sensor_0_6_registerobjectstomatch_expressionBBBBB(Sensor _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {
		_this.registerObjectsToMatch_FWD(match, srcSensor, srcContainer, srcRegion);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("srcSensor");
		EObject _localVariable_1 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcRegion");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgPetrinet");
		EObject tmpSrcSensor = _localVariable_0;
		EObject tmpContainerCorr = _localVariable_1;
		EObject tmpSrcContainer = _localVariable_2;
		EObject tmpSrcRegion = _localVariable_3;
		EObject tmpTrgPetrinet = _localVariable_4;
		if (tmpSrcSensor instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) tmpSrcSensor;
			if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
				RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
				if (tmpSrcContainer instanceof RailwayContainer) {
					RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
					if (tmpSrcRegion instanceof Region) {
						Region srcRegion = (Region) tmpSrcRegion;
						if (tmpTrgPetrinet instanceof PetriNet) {
							PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
							return new Object[] { srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Sensor_1_1_performtransformation_blackBBBBBFBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			RailwayContainerToPetriNet containerCorr, RailwayContainer srcContainer, Region srcRegion,
			PetriNet trgPetrinet, Sensor _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet, csp, _this,
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) result_pattern_Sensor_1_1_performtransformation_binding[0];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_Sensor_1_1_performtransformation_binding[1];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_Sensor_1_1_performtransformation_binding[2];
			Region srcRegion = (Region) result_pattern_Sensor_1_1_performtransformation_binding[3];
			PetriNet trgPetrinet = (PetriNet) result_pattern_Sensor_1_1_performtransformation_binding[4];

			Object[] result_pattern_Sensor_1_1_performtransformation_black = pattern_Sensor_1_1_performtransformation_blackBBBBBFBB(
					srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet, _this, isApplicableMatch);
			if (result_pattern_Sensor_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Sensor_1_1_performtransformation_black[5];

				return new Object[] { srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Sensor_1_1_performtransformation_greenBFFFFFFFFBFF(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, PetriNet trgPetrinet) {
		Place trgFailed = StochasticPetriNetFactory.eINSTANCE.createPlace();
		SensorToOperational sensorOperationalCoor = StochasticpetrinetFactory.eINSTANCE.createSensorToOperational();
		Arc trgRepairToOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgOperationToFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgFailedToRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		SensorToFailed sensorFailedCorr = StochasticpetrinetFactory.eINSTANCE.createSensorToFailed();
		Arc trgFailToFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		TimedTransition trgRepair = StochasticPetriNetFactory.eINSTANCE.createTimedTransition();
		Place trgOperational = StochasticPetriNetFactory.eINSTANCE.createPlace();
		TimedTransition trgFail = StochasticPetriNetFactory.eINSTANCE.createTimedTransition();
		int trgFailed_tokens_prime = Integer.valueOf(0);
		ArcKind trgRepairToOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgOperationToFail_kind_prime = ArcKind.INPUT;
		ArcKind trgFailedToRepair_kind_prime = ArcKind.INPUT;
		ArcKind trgFailToFailed_kind_prime = ArcKind.OUTPUT;
		int trgOperational_tokens_prime = Integer.valueOf(1);
		trgFailed.setPetriNet(trgPetrinet);
		sensorOperationalCoor.setSource(srcSensor);
		trgFailedToRepair.setPlace(trgFailed);
		sensorFailedCorr.setSource(srcSensor);
		sensorFailedCorr.setTarget(trgFailed);
		trgFailToFailed.setPlace(trgFailed);
		trgRepair.setPetriNet(trgPetrinet);
		trgFailedToRepair.setTransition(trgRepair);
		trgRepairToOperational.setTransition(trgRepair);
		trgRepairToOperational.setPlace(trgOperational);
		trgOperationToFail.setPlace(trgOperational);
		trgOperational.setPetriNet(trgPetrinet);
		sensorOperationalCoor.setTarget(trgOperational);
		trgFailToFailed.setTransition(trgFail);
		trgOperationToFail.setTransition(trgFail);
		trgFail.setPetriNet(trgPetrinet);
		trgFailed.setTokens(Integer.valueOf(trgFailed_tokens_prime));
		trgRepairToOperational.setKind(trgRepairToOperational_kind_prime);
		trgOperationToFail.setKind(trgOperationToFail_kind_prime);
		trgFailedToRepair.setKind(trgFailedToRepair_kind_prime);
		trgFailToFailed.setKind(trgFailToFailed_kind_prime);
		trgOperational.setTokens(Integer.valueOf(trgOperational_tokens_prime));
		return new Object[] { srcSensor, trgFailed, sensorOperationalCoor, trgRepairToOperational, trgOperationToFail,
				trgFailedToRepair, sensorFailedCorr, trgFailToFailed, trgRepair, trgPetrinet, trgOperational, trgFail };
	}

	public static final Object[] pattern_Sensor_1_2_collecttranslatedelements_blackBBBBBBBBBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Place trgFailed,
			SensorToOperational sensorOperationalCoor, Arc trgRepairToOperational, Arc trgOperationToFail,
			Arc trgFailedToRepair, SensorToFailed sensorFailedCorr, Arc trgFailToFailed, TimedTransition trgRepair,
			Place trgOperational, TimedTransition trgFail) {
		if (!trgFailed.equals(trgOperational)) {
			if (!trgOperationToFail.equals(trgRepairToOperational)) {
				if (!trgFailedToRepair.equals(trgRepairToOperational)) {
					if (!trgFailedToRepair.equals(trgOperationToFail)) {
						if (!trgFailToFailed.equals(trgRepairToOperational)) {
							if (!trgFailToFailed.equals(trgOperationToFail)) {
								if (!trgFailToFailed.equals(trgFailedToRepair)) {
									if (!trgFail.equals(trgRepair)) {
										return new Object[] { srcSensor, trgFailed, sensorOperationalCoor,
												trgRepairToOperational, trgOperationToFail, trgFailedToRepair,
												sensorFailedCorr, trgFailToFailed, trgRepair, trgOperational, trgFail };
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

	public static final Object[] pattern_Sensor_1_2_collecttranslatedelements_greenFBBBBBBBBBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, Place trgFailed,
			SensorToOperational sensorOperationalCoor, Arc trgRepairToOperational, Arc trgOperationToFail,
			Arc trgFailedToRepair, SensorToFailed sensorFailedCorr, Arc trgFailToFailed, TimedTransition trgRepair,
			Place trgOperational, TimedTransition trgFail) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcSensor);
		ruleresult.getCreatedElements().add(trgFailed);
		ruleresult.getCreatedLinkElements().add(sensorOperationalCoor);
		ruleresult.getCreatedElements().add(trgRepairToOperational);
		ruleresult.getCreatedElements().add(trgOperationToFail);
		ruleresult.getCreatedElements().add(trgFailedToRepair);
		ruleresult.getCreatedLinkElements().add(sensorFailedCorr);
		ruleresult.getCreatedElements().add(trgFailToFailed);
		ruleresult.getCreatedElements().add(trgRepair);
		ruleresult.getCreatedElements().add(trgOperational);
		ruleresult.getCreatedElements().add(trgFail);
		return new Object[] { ruleresult, srcSensor, trgFailed, sensorOperationalCoor, trgRepairToOperational,
				trgOperationToFail, trgFailedToRepair, sensorFailedCorr, trgFailToFailed, trgRepair, trgOperational,
				trgFail };
	}

	public static final Object[] pattern_Sensor_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcSensor, EObject trgFailed, EObject sensorOperationalCoor,
			EObject trgRepairToOperational, EObject containerCorr, EObject trgOperationToFail, EObject srcContainer,
			EObject trgFailedToRepair, EObject sensorFailedCorr, EObject trgFailToFailed, EObject srcRegion,
			EObject trgRepair, EObject trgPetrinet, EObject trgOperational, EObject trgFail) {
		if (!srcSensor.equals(trgFailed)) {
			if (!srcSensor.equals(trgRepairToOperational)) {
				if (!srcSensor.equals(trgOperationToFail)) {
					if (!srcSensor.equals(trgFailedToRepair)) {
						if (!srcSensor.equals(trgFailToFailed)) {
							if (!srcSensor.equals(trgRepair)) {
								if (!srcSensor.equals(trgPetrinet)) {
									if (!srcSensor.equals(trgOperational)) {
										if (!srcSensor.equals(trgFail)) {
											if (!trgFailed.equals(trgRepairToOperational)) {
												if (!trgFailed.equals(trgOperationToFail)) {
													if (!trgFailed.equals(trgFailedToRepair)) {
														if (!trgFailed.equals(trgRepair)) {
															if (!trgFailed.equals(trgPetrinet)) {
																if (!trgFailed.equals(trgOperational)) {
																	if (!sensorOperationalCoor.equals(srcSensor)) {
																		if (!sensorOperationalCoor.equals(trgFailed)) {
																			if (!sensorOperationalCoor
																					.equals(trgRepairToOperational)) {
																				if (!sensorOperationalCoor
																						.equals(trgOperationToFail)) {
																					if (!sensorOperationalCoor
																							.equals(srcContainer)) {
																						if (!sensorOperationalCoor
																								.equals(trgFailedToRepair)) {
																							if (!sensorOperationalCoor
																									.equals(trgFailToFailed)) {
																								if (!sensorOperationalCoor
																										.equals(srcRegion)) {
																									if (!sensorOperationalCoor
																											.equals(trgRepair)) {
																										if (!sensorOperationalCoor
																												.equals(trgPetrinet)) {
																											if (!sensorOperationalCoor
																													.equals(trgOperational)) {
																												if (!sensorOperationalCoor
																														.equals(trgFail)) {
																													if (!containerCorr
																															.equals(srcSensor)) {
																														if (!containerCorr
																																.equals(trgFailed)) {
																															if (!containerCorr
																																	.equals(sensorOperationalCoor)) {
																																if (!containerCorr
																																		.equals(trgRepairToOperational)) {
																																	if (!containerCorr
																																			.equals(trgOperationToFail)) {
																																		if (!containerCorr
																																				.equals(srcContainer)) {
																																			if (!containerCorr
																																					.equals(trgFailedToRepair)) {
																																				if (!containerCorr
																																						.equals(sensorFailedCorr)) {
																																					if (!containerCorr
																																							.equals(trgFailToFailed)) {
																																						if (!containerCorr
																																								.equals(srcRegion)) {
																																							if (!containerCorr
																																									.equals(trgRepair)) {
																																								if (!containerCorr
																																										.equals(trgPetrinet)) {
																																									if (!containerCorr
																																											.equals(trgOperational)) {
																																										if (!containerCorr
																																												.equals(trgFail)) {
																																											if (!trgOperationToFail
																																													.equals(trgRepairToOperational)) {
																																												if (!trgOperationToFail
																																														.equals(trgRepair)) {
																																													if (!trgOperationToFail
																																															.equals(trgPetrinet)) {
																																														if (!trgOperationToFail
																																																.equals(trgOperational)) {
																																															if (!srcContainer
																																																	.equals(srcSensor)) {
																																																if (!srcContainer
																																																		.equals(trgFailed)) {
																																																	if (!srcContainer
																																																			.equals(trgRepairToOperational)) {
																																																		if (!srcContainer
																																																				.equals(trgOperationToFail)) {
																																																			if (!srcContainer
																																																					.equals(trgFailedToRepair)) {
																																																				if (!srcContainer
																																																						.equals(trgFailToFailed)) {
																																																					if (!srcContainer
																																																							.equals(srcRegion)) {
																																																						if (!srcContainer
																																																								.equals(trgRepair)) {
																																																							if (!srcContainer
																																																									.equals(trgPetrinet)) {
																																																								if (!srcContainer
																																																										.equals(trgOperational)) {
																																																									if (!srcContainer
																																																											.equals(trgFail)) {
																																																										if (!trgFailedToRepair
																																																												.equals(trgRepairToOperational)) {
																																																											if (!trgFailedToRepair
																																																													.equals(trgOperationToFail)) {
																																																												if (!trgFailedToRepair
																																																														.equals(trgRepair)) {
																																																													if (!trgFailedToRepair
																																																															.equals(trgPetrinet)) {
																																																														if (!trgFailedToRepair
																																																																.equals(trgOperational)) {
																																																															if (!sensorFailedCorr
																																																																	.equals(srcSensor)) {
																																																																if (!sensorFailedCorr
																																																																		.equals(trgFailed)) {
																																																																	if (!sensorFailedCorr
																																																																			.equals(sensorOperationalCoor)) {
																																																																		if (!sensorFailedCorr
																																																																				.equals(trgRepairToOperational)) {
																																																																			if (!sensorFailedCorr
																																																																					.equals(trgOperationToFail)) {
																																																																				if (!sensorFailedCorr
																																																																						.equals(srcContainer)) {
																																																																					if (!sensorFailedCorr
																																																																							.equals(trgFailedToRepair)) {
																																																																						if (!sensorFailedCorr
																																																																								.equals(trgFailToFailed)) {
																																																																							if (!sensorFailedCorr
																																																																									.equals(srcRegion)) {
																																																																								if (!sensorFailedCorr
																																																																										.equals(trgRepair)) {
																																																																									if (!sensorFailedCorr
																																																																											.equals(trgPetrinet)) {
																																																																										if (!sensorFailedCorr
																																																																												.equals(trgOperational)) {
																																																																											if (!sensorFailedCorr
																																																																													.equals(trgFail)) {
																																																																												if (!trgFailToFailed
																																																																														.equals(trgFailed)) {
																																																																													if (!trgFailToFailed
																																																																															.equals(trgRepairToOperational)) {
																																																																														if (!trgFailToFailed
																																																																																.equals(trgOperationToFail)) {
																																																																															if (!trgFailToFailed
																																																																																	.equals(trgFailedToRepair)) {
																																																																																if (!trgFailToFailed
																																																																																		.equals(trgRepair)) {
																																																																																	if (!trgFailToFailed
																																																																																			.equals(trgPetrinet)) {
																																																																																		if (!trgFailToFailed
																																																																																				.equals(trgOperational)) {
																																																																																			if (!srcRegion
																																																																																					.equals(srcSensor)) {
																																																																																				if (!srcRegion
																																																																																						.equals(trgFailed)) {
																																																																																					if (!srcRegion
																																																																																							.equals(trgRepairToOperational)) {
																																																																																						if (!srcRegion
																																																																																								.equals(trgOperationToFail)) {
																																																																																							if (!srcRegion
																																																																																									.equals(trgFailedToRepair)) {
																																																																																								if (!srcRegion
																																																																																										.equals(trgFailToFailed)) {
																																																																																									if (!srcRegion
																																																																																											.equals(trgRepair)) {
																																																																																										if (!srcRegion
																																																																																												.equals(trgPetrinet)) {
																																																																																											if (!srcRegion
																																																																																													.equals(trgOperational)) {
																																																																																												if (!srcRegion
																																																																																														.equals(trgFail)) {
																																																																																													if (!trgRepair
																																																																																															.equals(trgRepairToOperational)) {
																																																																																														if (!trgPetrinet
																																																																																																.equals(trgRepairToOperational)) {
																																																																																															if (!trgPetrinet
																																																																																																	.equals(trgRepair)) {
																																																																																																if (!trgOperational
																																																																																																		.equals(trgRepairToOperational)) {
																																																																																																	if (!trgOperational
																																																																																																			.equals(trgRepair)) {
																																																																																																		if (!trgOperational
																																																																																																				.equals(trgPetrinet)) {
																																																																																																			if (!trgFail
																																																																																																					.equals(trgFailed)) {
																																																																																																				if (!trgFail
																																																																																																						.equals(trgRepairToOperational)) {
																																																																																																					if (!trgFail
																																																																																																							.equals(trgOperationToFail)) {
																																																																																																						if (!trgFail
																																																																																																								.equals(trgFailedToRepair)) {
																																																																																																							if (!trgFail
																																																																																																									.equals(trgFailToFailed)) {
																																																																																																								if (!trgFail
																																																																																																										.equals(trgRepair)) {
																																																																																																									if (!trgFail
																																																																																																											.equals(trgPetrinet)) {
																																																																																																										if (!trgFail
																																																																																																												.equals(trgOperational)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													srcSensor,
																																																																																																													trgFailed,
																																																																																																													sensorOperationalCoor,
																																																																																																													trgRepairToOperational,
																																																																																																													containerCorr,
																																																																																																													trgOperationToFail,
																																																																																																													srcContainer,
																																																																																																													trgFailedToRepair,
																																																																																																													sensorFailedCorr,
																																																																																																													trgFailToFailed,
																																																																																																													srcRegion,
																																																																																																													trgRepair,
																																																																																																													trgPetrinet,
																																																																																																													trgOperational,
																																																																																																													trgFail };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject srcSensor, EObject trgFailed, EObject sensorOperationalCoor,
			EObject trgRepairToOperational, EObject trgOperationToFail, EObject trgFailedToRepair,
			EObject sensorFailedCorr, EObject trgFailToFailed, EObject srcRegion, EObject trgRepair,
			EObject trgPetrinet, EObject trgOperational, EObject trgFail) {
		EMoflonEdge sensorOperationalCoor__srcSensor____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailToFailed__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRepair____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorFailedCorr__srcSensor____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgFailedToRepair____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailToFailed__trgFail____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgFailToFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgRepairToOperational____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperationToFail__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperational__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgOperational____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorOperationalCoor__trgOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRegion__srcSensor____sensors = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperationToFail__trgFail____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgOperationToFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sensorFailedCorr__trgFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailed__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFailed____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Sensor";
		String sensorOperationalCoor__srcSensor____source_name_prime = "source";
		String trgRepairToOperational__trgOperational____place_name_prime = "place";
		String trgFailToFailed__trgFailed____place_name_prime = "place";
		String trgRepair__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRepair____nodes_name_prime = "nodes";
		String sensorFailedCorr__srcSensor____source_name_prime = "source";
		String trgFailedToRepair__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgFailedToRepair____arcs_name_prime = "arcs";
		String trgFailToFailed__trgFail____transition_name_prime = "transition";
		String trgFail__trgFailToFailed____arcs_name_prime = "arcs";
		String trgRepairToOperational__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgRepairToOperational____arcs_name_prime = "arcs";
		String trgOperationToFail__trgOperational____place_name_prime = "place";
		String trgOperational__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgOperational____nodes_name_prime = "nodes";
		String sensorOperationalCoor__trgOperational____target_name_prime = "target";
		String srcRegion__srcSensor____sensors_name_prime = "sensors";
		String trgOperationToFail__trgFail____transition_name_prime = "transition";
		String trgFail__trgOperationToFail____arcs_name_prime = "arcs";
		String sensorFailedCorr__trgFailed____target_name_prime = "target";
		String trgFailedToRepair__trgFailed____place_name_prime = "place";
		String trgFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFail____nodes_name_prime = "nodes";
		String trgFailed__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFailed____nodes_name_prime = "nodes";
		sensorOperationalCoor__srcSensor____source.setSrc(sensorOperationalCoor);
		sensorOperationalCoor__srcSensor____source.setTrg(srcSensor);
		ruleresult.getCreatedEdges().add(sensorOperationalCoor__srcSensor____source);
		trgRepairToOperational__trgOperational____place.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgOperational____place);
		trgFailToFailed__trgFailed____place.setSrc(trgFailToFailed);
		trgFailToFailed__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailToFailed__trgFailed____place);
		trgRepair__trgPetrinet____petriNet.setSrc(trgRepair);
		trgRepair__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRepair__trgPetrinet____petriNet);
		trgPetrinet__trgRepair____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRepair____nodes.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRepair____nodes);
		sensorFailedCorr__srcSensor____source.setSrc(sensorFailedCorr);
		sensorFailedCorr__srcSensor____source.setTrg(srcSensor);
		ruleresult.getCreatedEdges().add(sensorFailedCorr__srcSensor____source);
		trgFailedToRepair__trgRepair____transition.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgRepair____transition);
		trgRepair__trgFailedToRepair____arcs.setSrc(trgRepair);
		trgRepair__trgFailedToRepair____arcs.setTrg(trgFailedToRepair);
		ruleresult.getCreatedEdges().add(trgRepair__trgFailedToRepair____arcs);
		trgFailToFailed__trgFail____transition.setSrc(trgFailToFailed);
		trgFailToFailed__trgFail____transition.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgFailToFailed__trgFail____transition);
		trgFail__trgFailToFailed____arcs.setSrc(trgFail);
		trgFail__trgFailToFailed____arcs.setTrg(trgFailToFailed);
		ruleresult.getCreatedEdges().add(trgFail__trgFailToFailed____arcs);
		trgRepairToOperational__trgRepair____transition.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgRepair____transition);
		trgRepair__trgRepairToOperational____arcs.setSrc(trgRepair);
		trgRepair__trgRepairToOperational____arcs.setTrg(trgRepairToOperational);
		ruleresult.getCreatedEdges().add(trgRepair__trgRepairToOperational____arcs);
		trgOperationToFail__trgOperational____place.setSrc(trgOperationToFail);
		trgOperationToFail__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgOperationToFail__trgOperational____place);
		trgOperational__trgPetrinet____petriNet.setSrc(trgOperational);
		trgOperational__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgOperational__trgPetrinet____petriNet);
		trgPetrinet__trgOperational____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgOperational____nodes.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgOperational____nodes);
		sensorOperationalCoor__trgOperational____target.setSrc(sensorOperationalCoor);
		sensorOperationalCoor__trgOperational____target.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(sensorOperationalCoor__trgOperational____target);
		srcRegion__srcSensor____sensors.setSrc(srcRegion);
		srcRegion__srcSensor____sensors.setTrg(srcSensor);
		ruleresult.getTranslatedEdges().add(srcRegion__srcSensor____sensors);
		trgOperationToFail__trgFail____transition.setSrc(trgOperationToFail);
		trgOperationToFail__trgFail____transition.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgOperationToFail__trgFail____transition);
		trgFail__trgOperationToFail____arcs.setSrc(trgFail);
		trgFail__trgOperationToFail____arcs.setTrg(trgOperationToFail);
		ruleresult.getCreatedEdges().add(trgFail__trgOperationToFail____arcs);
		sensorFailedCorr__trgFailed____target.setSrc(sensorFailedCorr);
		sensorFailedCorr__trgFailed____target.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(sensorFailedCorr__trgFailed____target);
		trgFailedToRepair__trgFailed____place.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgFailed____place);
		trgFail__trgPetrinet____petriNet.setSrc(trgFail);
		trgFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFail__trgPetrinet____petriNet);
		trgPetrinet__trgFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFail____nodes.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFail____nodes);
		trgFailed__trgPetrinet____petriNet.setSrc(trgFailed);
		trgFailed__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFailed__trgPetrinet____petriNet);
		trgPetrinet__trgFailed____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFailed____nodes.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFailed____nodes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		sensorOperationalCoor__srcSensor____source.setName(sensorOperationalCoor__srcSensor____source_name_prime);
		trgRepairToOperational__trgOperational____place
				.setName(trgRepairToOperational__trgOperational____place_name_prime);
		trgFailToFailed__trgFailed____place.setName(trgFailToFailed__trgFailed____place_name_prime);
		trgRepair__trgPetrinet____petriNet.setName(trgRepair__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRepair____nodes.setName(trgPetrinet__trgRepair____nodes_name_prime);
		sensorFailedCorr__srcSensor____source.setName(sensorFailedCorr__srcSensor____source_name_prime);
		trgFailedToRepair__trgRepair____transition.setName(trgFailedToRepair__trgRepair____transition_name_prime);
		trgRepair__trgFailedToRepair____arcs.setName(trgRepair__trgFailedToRepair____arcs_name_prime);
		trgFailToFailed__trgFail____transition.setName(trgFailToFailed__trgFail____transition_name_prime);
		trgFail__trgFailToFailed____arcs.setName(trgFail__trgFailToFailed____arcs_name_prime);
		trgRepairToOperational__trgRepair____transition
				.setName(trgRepairToOperational__trgRepair____transition_name_prime);
		trgRepair__trgRepairToOperational____arcs.setName(trgRepair__trgRepairToOperational____arcs_name_prime);
		trgOperationToFail__trgOperational____place.setName(trgOperationToFail__trgOperational____place_name_prime);
		trgOperational__trgPetrinet____petriNet.setName(trgOperational__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgOperational____nodes.setName(trgPetrinet__trgOperational____nodes_name_prime);
		sensorOperationalCoor__trgOperational____target
				.setName(sensorOperationalCoor__trgOperational____target_name_prime);
		srcRegion__srcSensor____sensors.setName(srcRegion__srcSensor____sensors_name_prime);
		trgOperationToFail__trgFail____transition.setName(trgOperationToFail__trgFail____transition_name_prime);
		trgFail__trgOperationToFail____arcs.setName(trgFail__trgOperationToFail____arcs_name_prime);
		sensorFailedCorr__trgFailed____target.setName(sensorFailedCorr__trgFailed____target_name_prime);
		trgFailedToRepair__trgFailed____place.setName(trgFailedToRepair__trgFailed____place_name_prime);
		trgFail__trgPetrinet____petriNet.setName(trgFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFail____nodes.setName(trgPetrinet__trgFail____nodes_name_prime);
		trgFailed__trgPetrinet____petriNet.setName(trgFailed__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFailed____nodes.setName(trgPetrinet__trgFailed____nodes_name_prime);
		return new Object[] { ruleresult, srcSensor, trgFailed, sensorOperationalCoor, trgRepairToOperational,
				trgOperationToFail, trgFailedToRepair, sensorFailedCorr, trgFailToFailed, srcRegion, trgRepair,
				trgPetrinet, trgOperational, trgFail, sensorOperationalCoor__srcSensor____source,
				trgRepairToOperational__trgOperational____place, trgFailToFailed__trgFailed____place,
				trgRepair__trgPetrinet____petriNet, trgPetrinet__trgRepair____nodes,
				sensorFailedCorr__srcSensor____source, trgFailedToRepair__trgRepair____transition,
				trgRepair__trgFailedToRepair____arcs, trgFailToFailed__trgFail____transition,
				trgFail__trgFailToFailed____arcs, trgRepairToOperational__trgRepair____transition,
				trgRepair__trgRepairToOperational____arcs, trgOperationToFail__trgOperational____place,
				trgOperational__trgPetrinet____petriNet, trgPetrinet__trgOperational____nodes,
				sensorOperationalCoor__trgOperational____target, srcRegion__srcSensor____sensors,
				trgOperationToFail__trgFail____transition, trgFail__trgOperationToFail____arcs,
				sensorFailedCorr__trgFailed____target, trgFailedToRepair__trgFailed____place,
				trgFail__trgPetrinet____petriNet, trgPetrinet__trgFail____nodes, trgFailed__trgPetrinet____petriNet,
				trgPetrinet__trgFailed____nodes };
	}

	public static final void pattern_Sensor_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(Sensor _this,
			PerformRuleResult ruleresult, EObject srcSensor, EObject trgFailed, EObject sensorOperationalCoor,
			EObject trgRepairToOperational, EObject containerCorr, EObject trgOperationToFail, EObject srcContainer,
			EObject trgFailedToRepair, EObject sensorFailedCorr, EObject trgFailToFailed, EObject srcRegion,
			EObject trgRepair, EObject trgPetrinet, EObject trgOperational, EObject trgFail) {
		_this.registerObjects_FWD(ruleresult, srcSensor, trgFailed, sensorOperationalCoor, trgRepairToOperational,
				containerCorr, trgOperationToFail, srcContainer, trgFailedToRepair, sensorFailedCorr, trgFailToFailed,
				srcRegion, trgRepair, trgPetrinet, trgOperational, trgFail);

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
		EObject _localVariable_1 = match.getObject("srcContainer");
		EObject _localVariable_2 = match.getObject("srcRegion");
		EObject tmpSrcSensor = _localVariable_0;
		EObject tmpSrcContainer = _localVariable_1;
		EObject tmpSrcRegion = _localVariable_2;
		if (tmpSrcSensor instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor) tmpSrcSensor;
			if (tmpSrcContainer instanceof RailwayContainer) {
				RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
				if (tmpSrcRegion instanceof Region) {
					Region srcRegion = (Region) tmpSrcRegion;
					return new Object[] { srcSensor, srcContainer, srcRegion, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Sensor_2_2_corematch_blackBFBBFB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
			PetriNet trgPetrinet = containerCorr.getTarget();
			if (trgPetrinet != null) {
				_result.add(new Object[] { srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Sensor_2_3_findcontext_blackBBBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			RailwayContainerToPetriNet containerCorr, RailwayContainer srcContainer, Region srcRegion,
			PetriNet trgPetrinet) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcContainer.getRegions().contains(srcRegion)) {
			if (srcContainer.equals(containerCorr.getSource())) {
				if (trgPetrinet.equals(containerCorr.getTarget())) {
					if (srcRegion.getSensors().contains(srcSensor)) {
						_result.add(new Object[] { srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Sensor_2_3_findcontext_greenBBBBBFFFFF(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			RailwayContainerToPetriNet containerCorr, RailwayContainer srcContainer, Region srcRegion,
			PetriNet trgPetrinet) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRegion__srcSensor____sensors = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcContainer__srcRegion____regions_name_prime = "regions";
		String containerCorr__srcContainer____source_name_prime = "source";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String srcRegion__srcSensor____sensors_name_prime = "sensors";
		isApplicableMatch.getAllContextElements().add(srcSensor);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(srcRegion);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRegion____regions);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		srcRegion__srcSensor____sensors.setSrc(srcRegion);
		srcRegion__srcSensor____sensors.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(srcRegion__srcSensor____sensors);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		srcRegion__srcSensor____sensors.setName(srcRegion__srcSensor____sensors_name_prime);
		return new Object[] { srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet, isApplicableMatch,
				srcContainer__srcRegion____regions, containerCorr__srcContainer____source,
				containerCorr__trgPetrinet____target, srcRegion__srcSensor____sensors };
	}

	public static final Object[] pattern_Sensor_2_4_solveCSP_bindingFBBBBBBB(Sensor _this,
			IsApplicableMatch isApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			RailwayContainerToPetriNet containerCorr, RailwayContainer srcContainer, Region srcRegion,
			PetriNet trgPetrinet) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcSensor, containerCorr,
				srcContainer, srcRegion, trgPetrinet);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcSensor, containerCorr, srcContainer, srcRegion,
					trgPetrinet };
		}
		return null;
	}

	public static final Object[] pattern_Sensor_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Sensor_2_4_solveCSP_bindingAndBlackFBBBBBBB(Sensor _this,
			IsApplicableMatch isApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor,
			RailwayContainerToPetriNet containerCorr, RailwayContainer srcContainer, Region srcRegion,
			PetriNet trgPetrinet) {
		Object[] result_pattern_Sensor_2_4_solveCSP_binding = pattern_Sensor_2_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, srcSensor, containerCorr, srcContainer, srcRegion, trgPetrinet);
		if (result_pattern_Sensor_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Sensor_2_4_solveCSP_binding[0];

			Object[] result_pattern_Sensor_2_4_solveCSP_black = pattern_Sensor_2_4_solveCSP_blackB(csp);
			if (result_pattern_Sensor_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcSensor, containerCorr, srcContainer, srcRegion,
						trgPetrinet };
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
						_result.add(new Object[] { srcSensor, srcContainer, srcRegion, _edge_sensors });
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
			RailwayContainer srcContainer, Region srcRegion) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSensor, srcContainer, srcRegion);
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor srcSensor, RailwayContainer srcContainer,
			Region srcRegion) {
		if (srcContainer.getRegions().contains(srcRegion)) {
			if (srcRegion.getSensors().contains(srcSensor)) {
				return new Object[] { srcSensor, srcContainer, srcRegion };
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
