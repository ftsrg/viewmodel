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
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Switch;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.StochasticpetrinetFactory;
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
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends AbstractRuleImpl implements Switch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSwitch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch,
			RailwayContainer srcContainer, Region srcRegion) {

		Object[] result1_black = SwitchImpl.pattern_Switch_0_1_initialbindings_blackBBBBB(this, match, srcSwitch,
				srcContainer, srcRegion);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSwitch] = " + srcSwitch + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[srcRegion] = " + srcRegion + ".");
		}

		Object[] result2_bindingAndBlack = SwitchImpl.pattern_Switch_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
				srcSwitch, srcContainer, srcRegion);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSwitch] = " + srcSwitch + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[srcRegion] = " + srcRegion + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SwitchImpl.pattern_Switch_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SwitchImpl.pattern_Switch_0_4_collectelementstobetranslated_blackBBBB(match,
					srcSwitch, srcContainer, srcRegion);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSwitch] = " + srcSwitch + ", " + "[srcContainer] = " + srcContainer + ", "
						+ "[srcRegion] = " + srcRegion + ".");
			}
			SwitchImpl.pattern_Switch_0_4_collectelementstobetranslated_greenBBBF(match, srcSwitch, srcRegion);
			//nothing EMoflonEdge srcRegion__srcSwitch____elements = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SwitchImpl.pattern_Switch_0_5_collectcontextelements_blackBBBB(match, srcSwitch,
					srcContainer, srcRegion);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSwitch] = " + srcSwitch + ", " + "[srcContainer] = " + srcContainer + ", "
						+ "[srcRegion] = " + srcRegion + ".");
			}
			SwitchImpl.pattern_Switch_0_5_collectcontextelements_greenBBBF(match, srcContainer, srcRegion);
			//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result5_green[3];

			// 
			SwitchImpl.pattern_Switch_0_6_registerobjectstomatch_expressionBBBBB(this, match, srcSwitch, srcContainer,
					srcRegion);
			return SwitchImpl.pattern_Switch_0_7_expressionF();
		} else {
			return SwitchImpl.pattern_Switch_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SwitchImpl
				.pattern_Switch_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) result1_bindingAndBlack[0];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[1];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[2];
		Region srcRegion = (Region) result1_bindingAndBlack[3];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SwitchImpl.pattern_Switch_1_1_performtransformation_greenBFBFFFFFFFFFB(srcSwitch,
				trgPetrinet, csp);
		Arc trgOperationToFail = (Arc) result1_green[1];
		TimedTransition trgRepair = (TimedTransition) result1_green[3];
		Place trgFailed = (Place) result1_green[4];
		Arc trgRepairToOperational = (Arc) result1_green[5];
		TimedTransition trgFail = (TimedTransition) result1_green[6];
		Arc trgFailedToRepair = (Arc) result1_green[7];
		Place trgOperational = (Place) result1_green[8];
		SwitchToFailed switchFailedCorr = (SwitchToFailed) result1_green[9];
		SwitchToOperational switchOperationalCorr = (SwitchToOperational) result1_green[10];
		Arc trgFailToFailed = (Arc) result1_green[11];

		Object[] result2_black = SwitchImpl.pattern_Switch_1_2_collecttranslatedelements_blackBBBBBBBBBBB(srcSwitch,
				trgOperationToFail, trgRepair, trgFailed, trgRepairToOperational, trgFail, trgFailedToRepair,
				trgOperational, switchFailedCorr, switchOperationalCorr, trgFailToFailed);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[srcSwitch] = " + srcSwitch + ", "
					+ "[trgOperationToFail] = " + trgOperationToFail + ", " + "[trgRepair] = " + trgRepair + ", "
					+ "[trgFailed] = " + trgFailed + ", " + "[trgRepairToOperational] = " + trgRepairToOperational
					+ ", " + "[trgFail] = " + trgFail + ", " + "[trgFailedToRepair] = " + trgFailedToRepair + ", "
					+ "[trgOperational] = " + trgOperational + ", " + "[switchFailedCorr] = " + switchFailedCorr + ", "
					+ "[switchOperationalCorr] = " + switchOperationalCorr + ", " + "[trgFailToFailed] = "
					+ trgFailToFailed + ".");
		}
		Object[] result2_green = SwitchImpl.pattern_Switch_1_2_collecttranslatedelements_greenFBBBBBBBBBBB(srcSwitch,
				trgOperationToFail, trgRepair, trgFailed, trgRepairToOperational, trgFail, trgFailedToRepair,
				trgOperational, switchFailedCorr, switchOperationalCorr, trgFailToFailed);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SwitchImpl.pattern_Switch_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult,
				srcSwitch, trgOperationToFail, trgPetrinet, trgRepair, trgFailed, srcContainer, trgRepairToOperational,
				trgFail, srcRegion, trgFailedToRepair, trgOperational, containerCorr, switchFailedCorr,
				switchOperationalCorr, trgFailToFailed);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[srcSwitch] = " + srcSwitch + ", " + "[trgOperationToFail] = " + trgOperationToFail + ", "
					+ "[trgPetrinet] = " + trgPetrinet + ", " + "[trgRepair] = " + trgRepair + ", " + "[trgFailed] = "
					+ trgFailed + ", " + "[srcContainer] = " + srcContainer + ", " + "[trgRepairToOperational] = "
					+ trgRepairToOperational + ", " + "[trgFail] = " + trgFail + ", " + "[srcRegion] = " + srcRegion
					+ ", " + "[trgFailedToRepair] = " + trgFailedToRepair + ", " + "[trgOperational] = "
					+ trgOperational + ", " + "[containerCorr] = " + containerCorr + ", " + "[switchFailedCorr] = "
					+ switchFailedCorr + ", " + "[switchOperationalCorr] = " + switchOperationalCorr + ", "
					+ "[trgFailToFailed] = " + trgFailToFailed + ".");
		}
		SwitchImpl.pattern_Switch_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(ruleresult,
				srcSwitch, trgOperationToFail, trgPetrinet, trgRepair, trgFailed, trgRepairToOperational, trgFail,
				srcRegion, trgFailedToRepair, trgOperational, switchFailedCorr, switchOperationalCorr, trgFailToFailed);
		//nothing EMoflonEdge trgOperationToFail__trgFail____transition = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge trgFail__trgOperationToFail____arcs = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge trgFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgPetrinet__trgFail____nodes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgRepairToOperational__trgOperational____place = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge trgFailed__trgPetrinet____petriNet = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgPetrinet__trgFailed____nodes = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgOperationToFail__trgOperational____place = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge srcRegion__srcSwitch____elements = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgFailedToRepair__trgFailed____place = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgFailedToRepair__trgRepair____transition = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge trgRepair__trgFailedToRepair____arcs = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgRepair__trgPetrinet____petriNet = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgPetrinet__trgRepair____nodes = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgOperational__trgPetrinet____petriNet = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgPetrinet__trgOperational____nodes = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge switchFailedCorr__srcSwitch____source = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge switchFailedCorr__trgFailed____target = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge switchOperationalCorr__trgOperational____target = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge switchOperationalCorr__srcSwitch____source = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgRepairToOperational__trgRepair____transition = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgRepair__trgRepairToOperational____arcs = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgFailToFailed__trgFail____transition = (EMoflonEdge) result3_green[36];
		//nothing EMoflonEdge trgFail__trgFailToFailed____arcs = (EMoflonEdge) result3_green[37];
		//nothing EMoflonEdge trgFailToFailed__trgFailed____place = (EMoflonEdge) result3_green[38];

		// 
		// 
		SwitchImpl.pattern_Switch_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this, ruleresult, srcSwitch,
				trgOperationToFail, trgPetrinet, trgRepair, trgFailed, srcContainer, trgRepairToOperational, trgFail,
				srcRegion, trgFailedToRepair, trgOperational, containerCorr, switchFailedCorr, switchOperationalCorr,
				trgFailToFailed);
		return SwitchImpl.pattern_Switch_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SwitchImpl.pattern_Switch_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SwitchImpl.pattern_Switch_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SwitchImpl.pattern_Switch_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) result2_binding[0];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[1];
		Region srcRegion = (Region) result2_binding[2];
		for (Object[] result2_black : SwitchImpl.pattern_Switch_2_2_corematch_blackBFBBFB(srcSwitch, srcContainer,
				srcRegion, match)) {
			PetriNet trgPetrinet = (PetriNet) result2_black[1];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[4];
			// ForEach 
			for (Object[] result3_black : SwitchImpl.pattern_Switch_2_3_findcontext_blackBBBBB(srcSwitch, trgPetrinet,
					srcContainer, srcRegion, containerCorr)) {
				Object[] result3_green = SwitchImpl.pattern_Switch_2_3_findcontext_greenBBBBBFFFFF(srcSwitch,
						trgPetrinet, srcContainer, srcRegion, containerCorr);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge srcRegion__srcSwitch____elements = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = SwitchImpl.pattern_Switch_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
						isApplicableMatch, srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[srcSwitch] = " + srcSwitch + ", "
							+ "[trgPetrinet] = " + trgPetrinet + ", " + "[srcContainer] = " + srcContainer + ", "
							+ "[srcRegion] = " + srcRegion + ", " + "[containerCorr] = " + containerCorr + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SwitchImpl.pattern_Switch_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SwitchImpl.pattern_Switch_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SwitchImpl.pattern_Switch_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SwitchImpl.pattern_Switch_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion) {
		match.registerObject("srcSwitch", srcSwitch);
		match.registerObject("srcContainer", srcContainer);
		match.registerObject("srcRegion", srcRegion);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, PetriNet trgPetrinet,
			RailwayContainer srcContainer, Region srcRegion, RailwayContainerToPetriNet containerCorr) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_srcSwitch_currentPosition = CSPFactoryHelper.eINSTANCE.createVariable("srcSwitch.currentPosition",
				true, csp);
		var_srcSwitch_currentPosition.setValue(srcSwitch.getCurrentPosition());
		var_srcSwitch_currentPosition.setType("railway.Position");

		// Create unbound variables
		Variable var_trgOperational_tokens = CSPFactoryHelper.eINSTANCE.createVariable("trgOperational.tokens", csp);
		var_trgOperational_tokens.setType("int");
		Variable var_trgFailed_tokens = CSPFactoryHelper.eINSTANCE.createVariable("trgFailed.tokens", csp);
		var_trgFailed_tokens.setType("int");

		// Create constraints
		PositionToMarking positionToMarking = new PositionToMarking();

		csp.getConstraints().add(positionToMarking);

		// Solve CSP
		positionToMarking.setRuleName("NoRuleName");
		positionToMarking.solve(var_srcSwitch_currentPosition, var_trgOperational_tokens, var_trgFailed_tokens);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcSwitch", srcSwitch);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("srcRegion", srcRegion);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcSwitch, EObject trgOperationToFail,
			EObject trgPetrinet, EObject trgRepair, EObject trgFailed, EObject srcContainer,
			EObject trgRepairToOperational, EObject trgFail, EObject srcRegion, EObject trgFailedToRepair,
			EObject trgOperational, EObject containerCorr, EObject switchFailedCorr, EObject switchOperationalCorr,
			EObject trgFailToFailed) {
		ruleresult.registerObject("srcSwitch", srcSwitch);
		ruleresult.registerObject("trgOperationToFail", trgOperationToFail);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("trgRepair", trgRepair);
		ruleresult.registerObject("trgFailed", trgFailed);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgRepairToOperational", trgRepairToOperational);
		ruleresult.registerObject("trgFail", trgFail);
		ruleresult.registerObject("srcRegion", srcRegion);
		ruleresult.registerObject("trgFailedToRepair", trgFailedToRepair);
		ruleresult.registerObject("trgOperational", trgOperational);
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("switchFailedCorr", switchFailedCorr);
		ruleresult.registerObject("switchOperationalCorr", switchOperationalCorr);
		ruleresult.registerObject("trgFailToFailed", trgFailToFailed);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcSwitch").eClass())
				.equals("railway.Switch.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(EMoflonEdge _edge_elements) {

		Object[] result1_bindingAndBlack = SwitchImpl.pattern_Switch_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SwitchImpl.pattern_Switch_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SwitchImpl.pattern_Switch_10_2_testcorematchandDECs_blackFFFB(_edge_elements)) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) result2_black[0];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[1];
			Region srcRegion = (Region) result2_black[2];
			Object[] result2_green = SwitchImpl.pattern_Switch_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SwitchImpl.pattern_Switch_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this, match,
					srcSwitch, srcContainer, srcRegion)) {
				// 
				if (SwitchImpl.pattern_Switch_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					Object[] result5_black = SwitchImpl.pattern_Switch_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SwitchImpl.pattern_Switch_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SwitchImpl.pattern_Switch_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Switch");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("trgOperationToFail", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("trgRepairToOperational", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
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

		Variable var_trgOperational_tokens = CSPFactoryHelper.eINSTANCE.createVariable("trgOperational", true, csp);
		var_trgOperational_tokens.setValue(__helper.getValue("trgOperational", "tokens"));
		var_trgOperational_tokens.setType("int");

		Variable var_srcSwitch_currentPosition = CSPFactoryHelper.eINSTANCE.createVariable("srcSwitch", true, csp);
		var_srcSwitch_currentPosition.setValue(__helper.getValue("srcSwitch", "currentPosition"));
		var_srcSwitch_currentPosition.setType("railway.Position");

		Variable var_trgFailed_tokens = CSPFactoryHelper.eINSTANCE.createVariable("trgFailed", true, csp);
		var_trgFailed_tokens.setValue(__helper.getValue("trgFailed", "tokens"));
		var_trgFailed_tokens.setType("int");

		PositionToMarking positionToMarking0 = new PositionToMarking();
		csp.getConstraints().add(positionToMarking0);

		positionToMarking0.setRuleName("Switch");
		positionToMarking0.solve(var_srcSwitch_currentPosition, var_trgOperational_tokens, var_trgFailed_tokens);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_trgOperational_tokens.setBound(false);
			var_trgFailed_tokens.setBound(false);
			positionToMarking0.solve(var_srcSwitch_currentPosition, var_trgOperational_tokens, var_trgFailed_tokens);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("trgOperational", "tokens", var_trgOperational_tokens.getValue());
				__helper.setValue("trgFailed", "tokens", var_trgFailed_tokens.getValue());
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
	public boolean checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch,
			RailwayContainer srcContainer, Region srcRegion) {// 
		Object[] result1_black = SwitchImpl.pattern_Switch_13_1_matchtggpattern_blackBBB(srcSwitch, srcContainer,
				srcRegion);
		if (result1_black != null) {
			return SwitchImpl.pattern_Switch_13_2_expressionF();
		} else {
			return SwitchImpl.pattern_Switch_13_3_expressionF();
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
		case RulesPackage.SWITCH___IS_APPROPRIATE_FWD__MATCH_SWITCH_RAILWAYCONTAINER_REGION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Region) arguments.get(3));
		case RulesPackage.SWITCH___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SWITCH___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SWITCH___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SWITCH_RAILWAYCONTAINER_REGION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Region) arguments.get(3));
			return null;
		case RulesPackage.SWITCH___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SWITCH_RAILWAYCONTAINER_REGION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Region) arguments.get(3));
		case RulesPackage.SWITCH___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SWITCH___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SWITCH_PETRINET_RAILWAYCONTAINER_REGION_RAILWAYCONTAINERTOPETRINET:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) arguments.get(1),
					(PetriNet) arguments.get(2), (RailwayContainer) arguments.get(3), (Region) arguments.get(4),
					(RailwayContainerToPetriNet) arguments.get(5));
		case RulesPackage.SWITCH___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SWITCH___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.SWITCH___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SWITCH___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.SWITCH___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SWITCH___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SWITCH___CHECK_DEC_FWD__SWITCH_RAILWAYCONTAINER_REGION:
			return checkDEC_FWD((hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) arguments.get(0),
					(RailwayContainer) arguments.get(1), (Region) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Switch_0_1_initialbindings_blackBBBBB(Switch _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion) {
		return new Object[] { _this, match, srcSwitch, srcContainer, srcRegion };
	}

	public static final Object[] pattern_Switch_0_2_SolveCSP_bindingFBBBBB(Switch _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSwitch, srcContainer, srcRegion);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSwitch, srcContainer, srcRegion };
		}
		return null;
	}

	public static final Object[] pattern_Switch_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Switch_0_2_SolveCSP_bindingAndBlackFBBBBB(Switch _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion) {
		Object[] result_pattern_Switch_0_2_SolveCSP_binding = pattern_Switch_0_2_SolveCSP_bindingFBBBBB(_this, match,
				srcSwitch, srcContainer, srcRegion);
		if (result_pattern_Switch_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Switch_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Switch_0_2_SolveCSP_black = pattern_Switch_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Switch_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSwitch, srcContainer, srcRegion };
			}
		}
		return null;
	}

	public static final boolean pattern_Switch_0_3_CheckCSP_expressionFBB(Switch _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Switch_0_4_collectelementstobetranslated_blackBBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion) {
		return new Object[] { match, srcSwitch, srcContainer, srcRegion };
	}

	public static final Object[] pattern_Switch_0_4_collectelementstobetranslated_greenBBBF(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, Region srcRegion) {
		EMoflonEdge srcRegion__srcSwitch____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcSwitch);
		String srcRegion__srcSwitch____elements_name_prime = "elements";
		srcRegion__srcSwitch____elements.setSrc(srcRegion);
		srcRegion__srcSwitch____elements.setTrg(srcSwitch);
		match.getToBeTranslatedEdges().add(srcRegion__srcSwitch____elements);
		srcRegion__srcSwitch____elements.setName(srcRegion__srcSwitch____elements_name_prime);
		return new Object[] { match, srcSwitch, srcRegion, srcRegion__srcSwitch____elements };
	}

	public static final Object[] pattern_Switch_0_5_collectcontextelements_blackBBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion) {
		return new Object[] { match, srcSwitch, srcContainer, srcRegion };
	}

	public static final Object[] pattern_Switch_0_5_collectcontextelements_greenBBBF(Match match,
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

	public static final void pattern_Switch_0_6_registerobjectstomatch_expressionBBBBB(Switch _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion) {
		_this.registerObjectsToMatch_FWD(match, srcSwitch, srcContainer, srcRegion);

	}

	public static final boolean pattern_Switch_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Switch_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Switch_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcSwitch");
		EObject _localVariable_1 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcRegion");
		EObject _localVariable_4 = isApplicableMatch.getObject("containerCorr");
		EObject tmpSrcSwitch = _localVariable_0;
		EObject tmpTrgPetrinet = _localVariable_1;
		EObject tmpSrcContainer = _localVariable_2;
		EObject tmpSrcRegion = _localVariable_3;
		EObject tmpContainerCorr = _localVariable_4;
		if (tmpSrcSwitch instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) tmpSrcSwitch;
			if (tmpTrgPetrinet instanceof PetriNet) {
				PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
				if (tmpSrcContainer instanceof RailwayContainer) {
					RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
					if (tmpSrcRegion instanceof Region) {
						Region srcRegion = (Region) tmpSrcRegion;
						if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
							RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
							return new Object[] { srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Switch_1_1_performtransformation_blackBBBBBFBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, PetriNet trgPetrinet,
			RailwayContainer srcContainer, Region srcRegion, RailwayContainerToPetriNet containerCorr, Switch _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Switch_1_1_performtransformation_bindingAndBlackFFFFFFBB(Switch _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Switch_1_1_performtransformation_binding = pattern_Switch_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Switch_1_1_performtransformation_binding != null) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) result_pattern_Switch_1_1_performtransformation_binding[0];
			PetriNet trgPetrinet = (PetriNet) result_pattern_Switch_1_1_performtransformation_binding[1];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_Switch_1_1_performtransformation_binding[2];
			Region srcRegion = (Region) result_pattern_Switch_1_1_performtransformation_binding[3];
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_Switch_1_1_performtransformation_binding[4];

			Object[] result_pattern_Switch_1_1_performtransformation_black = pattern_Switch_1_1_performtransformation_blackBBBBBFBB(
					srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr, _this, isApplicableMatch);
			if (result_pattern_Switch_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Switch_1_1_performtransformation_black[5];

				return new Object[] { srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Switch_1_1_performtransformation_greenBFBFFFFFFFFFB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, PetriNet trgPetrinet, CSP csp) {
		Arc trgOperationToFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		TimedTransition trgRepair = StochasticPetriNetFactory.eINSTANCE.createTimedTransition();
		Place trgFailed = StochasticPetriNetFactory.eINSTANCE.createPlace();
		Arc trgRepairToOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		TimedTransition trgFail = StochasticPetriNetFactory.eINSTANCE.createTimedTransition();
		Arc trgFailedToRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		Place trgOperational = StochasticPetriNetFactory.eINSTANCE.createPlace();
		SwitchToFailed switchFailedCorr = StochasticpetrinetFactory.eINSTANCE.createSwitchToFailed();
		SwitchToOperational switchOperationalCorr = StochasticpetrinetFactory.eINSTANCE.createSwitchToOperational();
		Arc trgFailToFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		ArcKind trgOperationToFail_kind_prime = ArcKind.INPUT;
		Object _localVariable_0 = csp.getValue("trgFailed", "tokens");
		ArcKind trgRepairToOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgFailedToRepair_kind_prime = ArcKind.INPUT;
		Object _localVariable_1 = csp.getValue("trgOperational", "tokens");
		ArcKind trgFailToFailed_kind_prime = ArcKind.OUTPUT;
		trgRepair.setPetriNet(trgPetrinet);
		trgFailed.setPetriNet(trgPetrinet);
		trgRepairToOperational.setTransition(trgRepair);
		trgOperationToFail.setTransition(trgFail);
		trgFail.setPetriNet(trgPetrinet);
		trgFailedToRepair.setPlace(trgFailed);
		trgFailedToRepair.setTransition(trgRepair);
		trgRepairToOperational.setPlace(trgOperational);
		trgOperationToFail.setPlace(trgOperational);
		trgOperational.setPetriNet(trgPetrinet);
		switchFailedCorr.setSource(srcSwitch);
		switchFailedCorr.setTarget(trgFailed);
		switchOperationalCorr.setTarget(trgOperational);
		switchOperationalCorr.setSource(srcSwitch);
		trgFailToFailed.setTransition(trgFail);
		trgFailToFailed.setPlace(trgFailed);
		trgOperationToFail.setKind(trgOperationToFail_kind_prime);
		int trgFailed_tokens_prime = (int) _localVariable_0;
		trgRepairToOperational.setKind(trgRepairToOperational_kind_prime);
		trgFailedToRepair.setKind(trgFailedToRepair_kind_prime);
		int trgOperational_tokens_prime = (int) _localVariable_1;
		trgFailToFailed.setKind(trgFailToFailed_kind_prime);
		trgFailed.setTokens(Integer.valueOf(trgFailed_tokens_prime));
		trgOperational.setTokens(Integer.valueOf(trgOperational_tokens_prime));
		return new Object[] { srcSwitch, trgOperationToFail, trgPetrinet, trgRepair, trgFailed, trgRepairToOperational,
				trgFail, trgFailedToRepair, trgOperational, switchFailedCorr, switchOperationalCorr, trgFailToFailed,
				csp };
	}

	public static final Object[] pattern_Switch_1_2_collecttranslatedelements_blackBBBBBBBBBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, Arc trgOperationToFail,
			TimedTransition trgRepair, Place trgFailed, Arc trgRepairToOperational, TimedTransition trgFail,
			Arc trgFailedToRepair, Place trgOperational, SwitchToFailed switchFailedCorr,
			SwitchToOperational switchOperationalCorr, Arc trgFailToFailed) {
		if (!trgOperationToFail.equals(trgRepairToOperational)) {
			if (!trgFailed.equals(trgOperational)) {
				if (!trgFail.equals(trgRepair)) {
					if (!trgFailedToRepair.equals(trgOperationToFail)) {
						if (!trgFailedToRepair.equals(trgRepairToOperational)) {
							if (!trgFailToFailed.equals(trgOperationToFail)) {
								if (!trgFailToFailed.equals(trgRepairToOperational)) {
									if (!trgFailToFailed.equals(trgFailedToRepair)) {
										return new Object[] { srcSwitch, trgOperationToFail, trgRepair, trgFailed,
												trgRepairToOperational, trgFail, trgFailedToRepair, trgOperational,
												switchFailedCorr, switchOperationalCorr, trgFailToFailed };
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

	public static final Object[] pattern_Switch_1_2_collecttranslatedelements_greenFBBBBBBBBBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, Arc trgOperationToFail,
			TimedTransition trgRepair, Place trgFailed, Arc trgRepairToOperational, TimedTransition trgFail,
			Arc trgFailedToRepair, Place trgOperational, SwitchToFailed switchFailedCorr,
			SwitchToOperational switchOperationalCorr, Arc trgFailToFailed) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcSwitch);
		ruleresult.getCreatedElements().add(trgOperationToFail);
		ruleresult.getCreatedElements().add(trgRepair);
		ruleresult.getCreatedElements().add(trgFailed);
		ruleresult.getCreatedElements().add(trgRepairToOperational);
		ruleresult.getCreatedElements().add(trgFail);
		ruleresult.getCreatedElements().add(trgFailedToRepair);
		ruleresult.getCreatedElements().add(trgOperational);
		ruleresult.getCreatedLinkElements().add(switchFailedCorr);
		ruleresult.getCreatedLinkElements().add(switchOperationalCorr);
		ruleresult.getCreatedElements().add(trgFailToFailed);
		return new Object[] { ruleresult, srcSwitch, trgOperationToFail, trgRepair, trgFailed, trgRepairToOperational,
				trgFail, trgFailedToRepair, trgOperational, switchFailedCorr, switchOperationalCorr, trgFailToFailed };
	}

	public static final Object[] pattern_Switch_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject srcSwitch, EObject trgOperationToFail, EObject trgPetrinet,
			EObject trgRepair, EObject trgFailed, EObject srcContainer, EObject trgRepairToOperational, EObject trgFail,
			EObject srcRegion, EObject trgFailedToRepair, EObject trgOperational, EObject containerCorr,
			EObject switchFailedCorr, EObject switchOperationalCorr, EObject trgFailToFailed) {
		if (!srcSwitch.equals(trgOperationToFail)) {
			if (!srcSwitch.equals(trgPetrinet)) {
				if (!srcSwitch.equals(trgRepair)) {
					if (!srcSwitch.equals(trgFailed)) {
						if (!srcSwitch.equals(trgRepairToOperational)) {
							if (!srcSwitch.equals(trgFail)) {
								if (!srcSwitch.equals(trgFailedToRepair)) {
									if (!srcSwitch.equals(trgOperational)) {
										if (!srcSwitch.equals(switchFailedCorr)) {
											if (!srcSwitch.equals(switchOperationalCorr)) {
												if (!srcSwitch.equals(trgFailToFailed)) {
													if (!trgOperationToFail.equals(trgPetrinet)) {
														if (!trgOperationToFail.equals(trgRepair)) {
															if (!trgOperationToFail.equals(trgRepairToOperational)) {
																if (!trgOperationToFail.equals(trgOperational)) {
																	if (!trgPetrinet.equals(trgRepair)) {
																		if (!trgPetrinet
																				.equals(trgRepairToOperational)) {
																			if (!trgRepair
																					.equals(trgRepairToOperational)) {
																				if (!trgFailed
																						.equals(trgOperationToFail)) {
																					if (!trgFailed
																							.equals(trgPetrinet)) {
																						if (!trgFailed
																								.equals(trgRepair)) {
																							if (!trgFailed.equals(
																									trgRepairToOperational)) {
																								if (!trgFailed.equals(
																										trgFailedToRepair)) {
																									if (!trgFailed
																											.equals(trgOperational)) {
																										if (!srcContainer
																												.equals(srcSwitch)) {
																											if (!srcContainer
																													.equals(trgOperationToFail)) {
																												if (!srcContainer
																														.equals(trgPetrinet)) {
																													if (!srcContainer
																															.equals(trgRepair)) {
																														if (!srcContainer
																																.equals(trgFailed)) {
																															if (!srcContainer
																																	.equals(trgRepairToOperational)) {
																																if (!srcContainer
																																		.equals(trgFail)) {
																																	if (!srcContainer
																																			.equals(srcRegion)) {
																																		if (!srcContainer
																																				.equals(trgFailedToRepair)) {
																																			if (!srcContainer
																																					.equals(trgOperational)) {
																																				if (!srcContainer
																																						.equals(switchFailedCorr)) {
																																					if (!srcContainer
																																							.equals(switchOperationalCorr)) {
																																						if (!srcContainer
																																								.equals(trgFailToFailed)) {
																																							if (!trgFail
																																									.equals(trgOperationToFail)) {
																																								if (!trgFail
																																										.equals(trgPetrinet)) {
																																									if (!trgFail
																																											.equals(trgRepair)) {
																																										if (!trgFail
																																												.equals(trgFailed)) {
																																											if (!trgFail
																																													.equals(trgRepairToOperational)) {
																																												if (!trgFail
																																														.equals(trgFailedToRepair)) {
																																													if (!trgFail
																																															.equals(trgOperational)) {
																																														if (!trgFail
																																																.equals(trgFailToFailed)) {
																																															if (!srcRegion
																																																	.equals(srcSwitch)) {
																																																if (!srcRegion
																																																		.equals(trgOperationToFail)) {
																																																	if (!srcRegion
																																																			.equals(trgPetrinet)) {
																																																		if (!srcRegion
																																																				.equals(trgRepair)) {
																																																			if (!srcRegion
																																																					.equals(trgFailed)) {
																																																				if (!srcRegion
																																																						.equals(trgRepairToOperational)) {
																																																					if (!srcRegion
																																																							.equals(trgFail)) {
																																																						if (!srcRegion
																																																								.equals(trgFailedToRepair)) {
																																																							if (!srcRegion
																																																									.equals(trgOperational)) {
																																																								if (!srcRegion
																																																										.equals(switchFailedCorr)) {
																																																									if (!srcRegion
																																																											.equals(switchOperationalCorr)) {
																																																										if (!srcRegion
																																																												.equals(trgFailToFailed)) {
																																																											if (!trgFailedToRepair
																																																													.equals(trgOperationToFail)) {
																																																												if (!trgFailedToRepair
																																																														.equals(trgPetrinet)) {
																																																													if (!trgFailedToRepair
																																																															.equals(trgRepair)) {
																																																														if (!trgFailedToRepair
																																																																.equals(trgRepairToOperational)) {
																																																															if (!trgFailedToRepair
																																																																	.equals(trgOperational)) {
																																																																if (!trgOperational
																																																																		.equals(trgPetrinet)) {
																																																																	if (!trgOperational
																																																																			.equals(trgRepair)) {
																																																																		if (!trgOperational
																																																																				.equals(trgRepairToOperational)) {
																																																																			if (!containerCorr
																																																																					.equals(srcSwitch)) {
																																																																				if (!containerCorr
																																																																						.equals(trgOperationToFail)) {
																																																																					if (!containerCorr
																																																																							.equals(trgPetrinet)) {
																																																																						if (!containerCorr
																																																																								.equals(trgRepair)) {
																																																																							if (!containerCorr
																																																																									.equals(trgFailed)) {
																																																																								if (!containerCorr
																																																																										.equals(srcContainer)) {
																																																																									if (!containerCorr
																																																																											.equals(trgRepairToOperational)) {
																																																																										if (!containerCorr
																																																																												.equals(trgFail)) {
																																																																											if (!containerCorr
																																																																													.equals(srcRegion)) {
																																																																												if (!containerCorr
																																																																														.equals(trgFailedToRepair)) {
																																																																													if (!containerCorr
																																																																															.equals(trgOperational)) {
																																																																														if (!containerCorr
																																																																																.equals(switchFailedCorr)) {
																																																																															if (!containerCorr
																																																																																	.equals(switchOperationalCorr)) {
																																																																																if (!containerCorr
																																																																																		.equals(trgFailToFailed)) {
																																																																																	if (!switchFailedCorr
																																																																																			.equals(trgOperationToFail)) {
																																																																																		if (!switchFailedCorr
																																																																																				.equals(trgPetrinet)) {
																																																																																			if (!switchFailedCorr
																																																																																					.equals(trgRepair)) {
																																																																																				if (!switchFailedCorr
																																																																																						.equals(trgFailed)) {
																																																																																					if (!switchFailedCorr
																																																																																							.equals(trgRepairToOperational)) {
																																																																																						if (!switchFailedCorr
																																																																																								.equals(trgFail)) {
																																																																																							if (!switchFailedCorr
																																																																																									.equals(trgFailedToRepair)) {
																																																																																								if (!switchFailedCorr
																																																																																										.equals(trgOperational)) {
																																																																																									if (!switchFailedCorr
																																																																																											.equals(switchOperationalCorr)) {
																																																																																										if (!switchFailedCorr
																																																																																												.equals(trgFailToFailed)) {
																																																																																											if (!switchOperationalCorr
																																																																																													.equals(trgOperationToFail)) {
																																																																																												if (!switchOperationalCorr
																																																																																														.equals(trgPetrinet)) {
																																																																																													if (!switchOperationalCorr
																																																																																															.equals(trgRepair)) {
																																																																																														if (!switchOperationalCorr
																																																																																																.equals(trgFailed)) {
																																																																																															if (!switchOperationalCorr
																																																																																																	.equals(trgRepairToOperational)) {
																																																																																																if (!switchOperationalCorr
																																																																																																		.equals(trgFail)) {
																																																																																																	if (!switchOperationalCorr
																																																																																																			.equals(trgFailedToRepair)) {
																																																																																																		if (!switchOperationalCorr
																																																																																																				.equals(trgOperational)) {
																																																																																																			if (!switchOperationalCorr
																																																																																																					.equals(trgFailToFailed)) {
																																																																																																				if (!trgFailToFailed
																																																																																																						.equals(trgOperationToFail)) {
																																																																																																					if (!trgFailToFailed
																																																																																																							.equals(trgPetrinet)) {
																																																																																																						if (!trgFailToFailed
																																																																																																								.equals(trgRepair)) {
																																																																																																							if (!trgFailToFailed
																																																																																																									.equals(trgFailed)) {
																																																																																																								if (!trgFailToFailed
																																																																																																										.equals(trgRepairToOperational)) {
																																																																																																									if (!trgFailToFailed
																																																																																																											.equals(trgFailedToRepair)) {
																																																																																																										if (!trgFailToFailed
																																																																																																												.equals(trgOperational)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													srcSwitch,
																																																																																																													trgOperationToFail,
																																																																																																													trgPetrinet,
																																																																																																													trgRepair,
																																																																																																													trgFailed,
																																																																																																													srcContainer,
																																																																																																													trgRepairToOperational,
																																																																																																													trgFail,
																																																																																																													srcRegion,
																																																																																																													trgFailedToRepair,
																																																																																																													trgOperational,
																																																																																																													containerCorr,
																																																																																																													switchFailedCorr,
																																																																																																													switchOperationalCorr,
																																																																																																													trgFailToFailed };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Switch_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject srcSwitch, EObject trgOperationToFail, EObject trgPetrinet,
			EObject trgRepair, EObject trgFailed, EObject trgRepairToOperational, EObject trgFail, EObject srcRegion,
			EObject trgFailedToRepair, EObject trgOperational, EObject switchFailedCorr, EObject switchOperationalCorr,
			EObject trgFailToFailed) {
		EMoflonEdge trgOperationToFail__trgFail____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgOperationToFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailed__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFailed____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperationToFail__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRegion__srcSwitch____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgFailedToRepair____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRepair____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperational__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgOperational____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchFailedCorr__srcSwitch____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchFailedCorr__trgFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchOperationalCorr__trgOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge switchOperationalCorr__srcSwitch____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgRepairToOperational____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailToFailed__trgFail____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgFailToFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailToFailed__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Switch";
		String trgOperationToFail__trgFail____transition_name_prime = "transition";
		String trgFail__trgOperationToFail____arcs_name_prime = "arcs";
		String trgFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFail____nodes_name_prime = "nodes";
		String trgRepairToOperational__trgOperational____place_name_prime = "place";
		String trgFailed__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFailed____nodes_name_prime = "nodes";
		String trgOperationToFail__trgOperational____place_name_prime = "place";
		String srcRegion__srcSwitch____elements_name_prime = "elements";
		String trgFailedToRepair__trgFailed____place_name_prime = "place";
		String trgFailedToRepair__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgFailedToRepair____arcs_name_prime = "arcs";
		String trgRepair__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRepair____nodes_name_prime = "nodes";
		String trgOperational__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgOperational____nodes_name_prime = "nodes";
		String switchFailedCorr__srcSwitch____source_name_prime = "source";
		String switchFailedCorr__trgFailed____target_name_prime = "target";
		String switchOperationalCorr__trgOperational____target_name_prime = "target";
		String switchOperationalCorr__srcSwitch____source_name_prime = "source";
		String trgRepairToOperational__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgRepairToOperational____arcs_name_prime = "arcs";
		String trgFailToFailed__trgFail____transition_name_prime = "transition";
		String trgFail__trgFailToFailed____arcs_name_prime = "arcs";
		String trgFailToFailed__trgFailed____place_name_prime = "place";
		trgOperationToFail__trgFail____transition.setSrc(trgOperationToFail);
		trgOperationToFail__trgFail____transition.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgOperationToFail__trgFail____transition);
		trgFail__trgOperationToFail____arcs.setSrc(trgFail);
		trgFail__trgOperationToFail____arcs.setTrg(trgOperationToFail);
		ruleresult.getCreatedEdges().add(trgFail__trgOperationToFail____arcs);
		trgFail__trgPetrinet____petriNet.setSrc(trgFail);
		trgFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFail__trgPetrinet____petriNet);
		trgPetrinet__trgFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFail____nodes.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFail____nodes);
		trgRepairToOperational__trgOperational____place.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgOperational____place);
		trgFailed__trgPetrinet____petriNet.setSrc(trgFailed);
		trgFailed__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFailed__trgPetrinet____petriNet);
		trgPetrinet__trgFailed____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFailed____nodes.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFailed____nodes);
		trgOperationToFail__trgOperational____place.setSrc(trgOperationToFail);
		trgOperationToFail__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgOperationToFail__trgOperational____place);
		srcRegion__srcSwitch____elements.setSrc(srcRegion);
		srcRegion__srcSwitch____elements.setTrg(srcSwitch);
		ruleresult.getTranslatedEdges().add(srcRegion__srcSwitch____elements);
		trgFailedToRepair__trgFailed____place.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgFailed____place);
		trgFailedToRepair__trgRepair____transition.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgRepair____transition);
		trgRepair__trgFailedToRepair____arcs.setSrc(trgRepair);
		trgRepair__trgFailedToRepair____arcs.setTrg(trgFailedToRepair);
		ruleresult.getCreatedEdges().add(trgRepair__trgFailedToRepair____arcs);
		trgRepair__trgPetrinet____petriNet.setSrc(trgRepair);
		trgRepair__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRepair__trgPetrinet____petriNet);
		trgPetrinet__trgRepair____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRepair____nodes.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRepair____nodes);
		trgOperational__trgPetrinet____petriNet.setSrc(trgOperational);
		trgOperational__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgOperational__trgPetrinet____petriNet);
		trgPetrinet__trgOperational____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgOperational____nodes.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgOperational____nodes);
		switchFailedCorr__srcSwitch____source.setSrc(switchFailedCorr);
		switchFailedCorr__srcSwitch____source.setTrg(srcSwitch);
		ruleresult.getCreatedEdges().add(switchFailedCorr__srcSwitch____source);
		switchFailedCorr__trgFailed____target.setSrc(switchFailedCorr);
		switchFailedCorr__trgFailed____target.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(switchFailedCorr__trgFailed____target);
		switchOperationalCorr__trgOperational____target.setSrc(switchOperationalCorr);
		switchOperationalCorr__trgOperational____target.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(switchOperationalCorr__trgOperational____target);
		switchOperationalCorr__srcSwitch____source.setSrc(switchOperationalCorr);
		switchOperationalCorr__srcSwitch____source.setTrg(srcSwitch);
		ruleresult.getCreatedEdges().add(switchOperationalCorr__srcSwitch____source);
		trgRepairToOperational__trgRepair____transition.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgRepair____transition);
		trgRepair__trgRepairToOperational____arcs.setSrc(trgRepair);
		trgRepair__trgRepairToOperational____arcs.setTrg(trgRepairToOperational);
		ruleresult.getCreatedEdges().add(trgRepair__trgRepairToOperational____arcs);
		trgFailToFailed__trgFail____transition.setSrc(trgFailToFailed);
		trgFailToFailed__trgFail____transition.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgFailToFailed__trgFail____transition);
		trgFail__trgFailToFailed____arcs.setSrc(trgFail);
		trgFail__trgFailToFailed____arcs.setTrg(trgFailToFailed);
		ruleresult.getCreatedEdges().add(trgFail__trgFailToFailed____arcs);
		trgFailToFailed__trgFailed____place.setSrc(trgFailToFailed);
		trgFailToFailed__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailToFailed__trgFailed____place);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgOperationToFail__trgFail____transition.setName(trgOperationToFail__trgFail____transition_name_prime);
		trgFail__trgOperationToFail____arcs.setName(trgFail__trgOperationToFail____arcs_name_prime);
		trgFail__trgPetrinet____petriNet.setName(trgFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFail____nodes.setName(trgPetrinet__trgFail____nodes_name_prime);
		trgRepairToOperational__trgOperational____place
				.setName(trgRepairToOperational__trgOperational____place_name_prime);
		trgFailed__trgPetrinet____petriNet.setName(trgFailed__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFailed____nodes.setName(trgPetrinet__trgFailed____nodes_name_prime);
		trgOperationToFail__trgOperational____place.setName(trgOperationToFail__trgOperational____place_name_prime);
		srcRegion__srcSwitch____elements.setName(srcRegion__srcSwitch____elements_name_prime);
		trgFailedToRepair__trgFailed____place.setName(trgFailedToRepair__trgFailed____place_name_prime);
		trgFailedToRepair__trgRepair____transition.setName(trgFailedToRepair__trgRepair____transition_name_prime);
		trgRepair__trgFailedToRepair____arcs.setName(trgRepair__trgFailedToRepair____arcs_name_prime);
		trgRepair__trgPetrinet____petriNet.setName(trgRepair__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRepair____nodes.setName(trgPetrinet__trgRepair____nodes_name_prime);
		trgOperational__trgPetrinet____petriNet.setName(trgOperational__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgOperational____nodes.setName(trgPetrinet__trgOperational____nodes_name_prime);
		switchFailedCorr__srcSwitch____source.setName(switchFailedCorr__srcSwitch____source_name_prime);
		switchFailedCorr__trgFailed____target.setName(switchFailedCorr__trgFailed____target_name_prime);
		switchOperationalCorr__trgOperational____target
				.setName(switchOperationalCorr__trgOperational____target_name_prime);
		switchOperationalCorr__srcSwitch____source.setName(switchOperationalCorr__srcSwitch____source_name_prime);
		trgRepairToOperational__trgRepair____transition
				.setName(trgRepairToOperational__trgRepair____transition_name_prime);
		trgRepair__trgRepairToOperational____arcs.setName(trgRepair__trgRepairToOperational____arcs_name_prime);
		trgFailToFailed__trgFail____transition.setName(trgFailToFailed__trgFail____transition_name_prime);
		trgFail__trgFailToFailed____arcs.setName(trgFail__trgFailToFailed____arcs_name_prime);
		trgFailToFailed__trgFailed____place.setName(trgFailToFailed__trgFailed____place_name_prime);
		return new Object[] { ruleresult, srcSwitch, trgOperationToFail, trgPetrinet, trgRepair, trgFailed,
				trgRepairToOperational, trgFail, srcRegion, trgFailedToRepair, trgOperational, switchFailedCorr,
				switchOperationalCorr, trgFailToFailed, trgOperationToFail__trgFail____transition,
				trgFail__trgOperationToFail____arcs, trgFail__trgPetrinet____petriNet, trgPetrinet__trgFail____nodes,
				trgRepairToOperational__trgOperational____place, trgFailed__trgPetrinet____petriNet,
				trgPetrinet__trgFailed____nodes, trgOperationToFail__trgOperational____place,
				srcRegion__srcSwitch____elements, trgFailedToRepair__trgFailed____place,
				trgFailedToRepair__trgRepair____transition, trgRepair__trgFailedToRepair____arcs,
				trgRepair__trgPetrinet____petriNet, trgPetrinet__trgRepair____nodes,
				trgOperational__trgPetrinet____petriNet, trgPetrinet__trgOperational____nodes,
				switchFailedCorr__srcSwitch____source, switchFailedCorr__trgFailed____target,
				switchOperationalCorr__trgOperational____target, switchOperationalCorr__srcSwitch____source,
				trgRepairToOperational__trgRepair____transition, trgRepair__trgRepairToOperational____arcs,
				trgFailToFailed__trgFail____transition, trgFail__trgFailToFailed____arcs,
				trgFailToFailed__trgFailed____place };
	}

	public static final void pattern_Switch_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(Switch _this,
			PerformRuleResult ruleresult, EObject srcSwitch, EObject trgOperationToFail, EObject trgPetrinet,
			EObject trgRepair, EObject trgFailed, EObject srcContainer, EObject trgRepairToOperational, EObject trgFail,
			EObject srcRegion, EObject trgFailedToRepair, EObject trgOperational, EObject containerCorr,
			EObject switchFailedCorr, EObject switchOperationalCorr, EObject trgFailToFailed) {
		_this.registerObjects_FWD(ruleresult, srcSwitch, trgOperationToFail, trgPetrinet, trgRepair, trgFailed,
				srcContainer, trgRepairToOperational, trgFail, srcRegion, trgFailedToRepair, trgOperational,
				containerCorr, switchFailedCorr, switchOperationalCorr, trgFailToFailed);

	}

	public static final PerformRuleResult pattern_Switch_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Switch_2_1_preparereturnvalue_bindingFB(Switch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Switch_2_1_preparereturnvalue_blackFBB(EClass eClass, Switch _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Switch_2_1_preparereturnvalue_bindingAndBlackFFB(Switch _this) {
		Object[] result_pattern_Switch_2_1_preparereturnvalue_binding = pattern_Switch_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Switch_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Switch_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Switch_2_1_preparereturnvalue_black = pattern_Switch_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Switch_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Switch_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Switch_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Switch";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Switch_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcSwitch");
		EObject _localVariable_1 = match.getObject("srcContainer");
		EObject _localVariable_2 = match.getObject("srcRegion");
		EObject tmpSrcSwitch = _localVariable_0;
		EObject tmpSrcContainer = _localVariable_1;
		EObject tmpSrcRegion = _localVariable_2;
		if (tmpSrcSwitch instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) tmpSrcSwitch;
			if (tmpSrcContainer instanceof RailwayContainer) {
				RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
				if (tmpSrcRegion instanceof Region) {
					Region srcRegion = (Region) tmpSrcRegion;
					return new Object[] { srcSwitch, srcContainer, srcRegion, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Switch_2_2_corematch_blackBFBBFB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
			PetriNet trgPetrinet = containerCorr.getTarget();
			if (trgPetrinet != null) {
				_result.add(new Object[] { srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Switch_2_3_findcontext_blackBBBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, PetriNet trgPetrinet,
			RailwayContainer srcContainer, Region srcRegion, RailwayContainerToPetriNet containerCorr) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcContainer.getRegions().contains(srcRegion)) {
			if (srcRegion.getElements().contains(srcSwitch)) {
				if (trgPetrinet.equals(containerCorr.getTarget())) {
					if (srcContainer.equals(containerCorr.getSource())) {
						_result.add(new Object[] { srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Switch_2_3_findcontext_greenBBBBBFFFFF(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, PetriNet trgPetrinet,
			RailwayContainer srcContainer, Region srcRegion, RailwayContainerToPetriNet containerCorr) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRegion__srcSwitch____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcContainer__srcRegion____regions_name_prime = "regions";
		String srcRegion__srcSwitch____elements_name_prime = "elements";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String containerCorr__srcContainer____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(srcSwitch);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(srcRegion);
		isApplicableMatch.getAllContextElements().add(containerCorr);
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRegion____regions);
		srcRegion__srcSwitch____elements.setSrc(srcRegion);
		srcRegion__srcSwitch____elements.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(srcRegion__srcSwitch____elements);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		srcRegion__srcSwitch____elements.setName(srcRegion__srcSwitch____elements_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		return new Object[] { srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr, isApplicableMatch,
				srcContainer__srcRegion____regions, srcRegion__srcSwitch____elements,
				containerCorr__trgPetrinet____target, containerCorr__srcContainer____source };
	}

	public static final Object[] pattern_Switch_2_4_solveCSP_bindingFBBBBBBB(Switch _this,
			IsApplicableMatch isApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch,
			PetriNet trgPetrinet, RailwayContainer srcContainer, Region srcRegion,
			RailwayContainerToPetriNet containerCorr) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcSwitch, trgPetrinet, srcContainer,
				srcRegion, containerCorr);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcSwitch, trgPetrinet, srcContainer, srcRegion,
					containerCorr };
		}
		return null;
	}

	public static final Object[] pattern_Switch_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Switch_2_4_solveCSP_bindingAndBlackFBBBBBBB(Switch _this,
			IsApplicableMatch isApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch,
			PetriNet trgPetrinet, RailwayContainer srcContainer, Region srcRegion,
			RailwayContainerToPetriNet containerCorr) {
		Object[] result_pattern_Switch_2_4_solveCSP_binding = pattern_Switch_2_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, srcSwitch, trgPetrinet, srcContainer, srcRegion, containerCorr);
		if (result_pattern_Switch_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Switch_2_4_solveCSP_binding[0];

			Object[] result_pattern_Switch_2_4_solveCSP_black = pattern_Switch_2_4_solveCSP_blackB(csp);
			if (result_pattern_Switch_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcSwitch, trgPetrinet, srcContainer, srcRegion,
						containerCorr };
			}
		}
		return null;
	}

	public static final boolean pattern_Switch_2_5_checkCSP_expressionFBB(Switch _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Switch_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Switch_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Switch";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Switch_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Switch_10_1_preparereturnvalue_bindingFB(Switch _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Switch_10_1_preparereturnvalue_blackFBBF(EClass __eClass, Switch _this) {
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

	public static final Object[] pattern_Switch_10_1_preparereturnvalue_bindingAndBlackFFBF(Switch _this) {
		Object[] result_pattern_Switch_10_1_preparereturnvalue_binding = pattern_Switch_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Switch_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Switch_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Switch_10_1_preparereturnvalue_black = pattern_Switch_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Switch_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Switch_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Switch_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Switch_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Switch_10_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_elements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcRegion = _edge_elements.getSrc();
		if (tmpSrcRegion instanceof Region) {
			Region srcRegion = (Region) tmpSrcRegion;
			EObject tmpSrcSwitch = _edge_elements.getTrg();
			if (tmpSrcSwitch instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch) tmpSrcSwitch;
				if (srcRegion.getElements().contains(srcSwitch)) {
					for (RailwayContainer srcContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(srcRegion, RailwayContainer.class, "regions")) {
						_result.add(new Object[] { srcSwitch, srcContainer, srcRegion, _edge_elements });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Switch_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Switch_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			Switch _this, Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch,
			RailwayContainer srcContainer, Region srcRegion) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSwitch, srcContainer, srcRegion);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Switch_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Switch _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Switch_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Switch_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Switch_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Switch_13_1_matchtggpattern_blackBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch srcSwitch, RailwayContainer srcContainer,
			Region srcRegion) {
		if (srcContainer.getRegions().contains(srcRegion)) {
			if (srcRegion.getElements().contains(srcSwitch)) {
				return new Object[] { srcSwitch, srcContainer, srcRegion };
			}
		}
		return null;
	}

	public static final boolean pattern_Switch_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Switch_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SwitchImpl
