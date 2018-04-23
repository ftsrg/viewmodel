/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Segment;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Arc;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.ArcKind;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.Place;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.TimedTransition;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Semaphore;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToFailed;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.SemaphoreToOperational;
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
 * An implementation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SemaphoreImpl extends AbstractRuleImpl implements Semaphore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemaphoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSemaphore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {

		Object[] result1_black = SemaphoreImpl.pattern_Semaphore_0_1_initialbindings_blackBBBBBB(this, match,
				srcSemaphore, srcContainer, srcSegment, srcRegion);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[srcSegment] = " + srcSegment + ", " + "[srcRegion] = " + srcRegion + ".");
		}

		Object[] result2_bindingAndBlack = SemaphoreImpl.pattern_Semaphore_0_2_SolveCSP_bindingAndBlackFBBBBBB(this,
				match, srcSemaphore, srcContainer, srcSegment, srcRegion);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = "
					+ srcContainer + ", " + "[srcSegment] = " + srcSegment + ", " + "[srcRegion] = " + srcRegion + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SemaphoreImpl.pattern_Semaphore_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SemaphoreImpl.pattern_Semaphore_0_4_collectelementstobetranslated_blackBBBBB(match,
					srcSemaphore, srcContainer, srcSegment, srcRegion);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = " + srcContainer + ", "
						+ "[srcSegment] = " + srcSegment + ", " + "[srcRegion] = " + srcRegion + ".");
			}
			SemaphoreImpl.pattern_Semaphore_0_4_collectelementstobetranslated_greenBBBF(match, srcSemaphore,
					srcSegment);
			//nothing EMoflonEdge srcSegment__srcSemaphore____semaphores = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SemaphoreImpl.pattern_Semaphore_0_5_collectcontextelements_blackBBBBB(match,
					srcSemaphore, srcContainer, srcSegment, srcRegion);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = " + srcContainer + ", "
						+ "[srcSegment] = " + srcSegment + ", " + "[srcRegion] = " + srcRegion + ".");
			}
			SemaphoreImpl.pattern_Semaphore_0_5_collectcontextelements_greenBBBBFF(match, srcContainer, srcSegment,
					srcRegion);
			//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge srcRegion__srcSegment____elements = (EMoflonEdge) result5_green[5];

			// 
			SemaphoreImpl.pattern_Semaphore_0_6_registerobjectstomatch_expressionBBBBBB(this, match, srcSemaphore,
					srcContainer, srcSegment, srcRegion);
			return SemaphoreImpl.pattern_Semaphore_0_7_expressionF();
		} else {
			return SemaphoreImpl.pattern_Semaphore_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SemaphoreImpl
				.pattern_Semaphore_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_bindingAndBlack[0];
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) result1_bindingAndBlack[1];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[2];
		Segment srcSegment = (Segment) result1_bindingAndBlack[3];
		PetriNet trgPetrinet = (PetriNet) result1_bindingAndBlack[4];
		Region srcRegion = (Region) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = SemaphoreImpl
				.pattern_Semaphore_1_1_performtransformation_greenFBFFFBFFFFFFB(srcSemaphore, trgPetrinet, csp);
		Arc trgFailedToRepair = (Arc) result1_green[0];
		SemaphoreToFailed semaphoreFailedCorr = (SemaphoreToFailed) result1_green[2];
		TimedTransition trgRepair = (TimedTransition) result1_green[3];
		Place trgOperational = (Place) result1_green[4];
		SemaphoreToOperational semaphoreOperationalCorr = (SemaphoreToOperational) result1_green[6];
		Arc trgRepairToOperational = (Arc) result1_green[7];
		Arc trgOperationToFail = (Arc) result1_green[8];
		Place trgFailed = (Place) result1_green[9];
		Arc trgFailToFailed = (Arc) result1_green[10];
		TimedTransition trgFail = (TimedTransition) result1_green[11];

		Object[] result2_black = SemaphoreImpl.pattern_Semaphore_1_2_collecttranslatedelements_blackBBBBBBBBBBB(
				trgFailedToRepair, srcSemaphore, semaphoreFailedCorr, trgRepair, trgOperational,
				semaphoreOperationalCorr, trgRepairToOperational, trgOperationToFail, trgFailed, trgFailToFailed,
				trgFail);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[trgFailedToRepair] = "
					+ trgFailedToRepair + ", " + "[srcSemaphore] = " + srcSemaphore + ", " + "[semaphoreFailedCorr] = "
					+ semaphoreFailedCorr + ", " + "[trgRepair] = " + trgRepair + ", " + "[trgOperational] = "
					+ trgOperational + ", " + "[semaphoreOperationalCorr] = " + semaphoreOperationalCorr + ", "
					+ "[trgRepairToOperational] = " + trgRepairToOperational + ", " + "[trgOperationToFail] = "
					+ trgOperationToFail + ", " + "[trgFailed] = " + trgFailed + ", " + "[trgFailToFailed] = "
					+ trgFailToFailed + ", " + "[trgFail] = " + trgFail + ".");
		}
		Object[] result2_green = SemaphoreImpl.pattern_Semaphore_1_2_collecttranslatedelements_greenFBBBBBBBBBBB(
				trgFailedToRepair, srcSemaphore, semaphoreFailedCorr, trgRepair, trgOperational,
				semaphoreOperationalCorr, trgRepairToOperational, trgOperationToFail, trgFailed, trgFailToFailed,
				trgFail);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SemaphoreImpl.pattern_Semaphore_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(
				ruleresult, containerCorr, trgFailedToRepair, srcSemaphore, semaphoreFailedCorr, srcContainer,
				trgRepair, trgOperational, srcSegment, trgPetrinet, semaphoreOperationalCorr, trgRepairToOperational,
				trgOperationToFail, srcRegion, trgFailed, trgFailToFailed, trgFail);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[containerCorr] = " + containerCorr + ", " + "[trgFailedToRepair] = " + trgFailedToRepair
					+ ", " + "[srcSemaphore] = " + srcSemaphore + ", " + "[semaphoreFailedCorr] = "
					+ semaphoreFailedCorr + ", " + "[srcContainer] = " + srcContainer + ", " + "[trgRepair] = "
					+ trgRepair + ", " + "[trgOperational] = " + trgOperational + ", " + "[srcSegment] = " + srcSegment
					+ ", " + "[trgPetrinet] = " + trgPetrinet + ", " + "[semaphoreOperationalCorr] = "
					+ semaphoreOperationalCorr + ", " + "[trgRepairToOperational] = " + trgRepairToOperational + ", "
					+ "[trgOperationToFail] = " + trgOperationToFail + ", " + "[srcRegion] = " + srcRegion + ", "
					+ "[trgFailed] = " + trgFailed + ", " + "[trgFailToFailed] = " + trgFailToFailed + ", "
					+ "[trgFail] = " + trgFail + ".");
		}
		SemaphoreImpl.pattern_Semaphore_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(ruleresult,
				trgFailedToRepair, srcSemaphore, semaphoreFailedCorr, trgRepair, trgOperational, srcSegment,
				trgPetrinet, semaphoreOperationalCorr, trgRepairToOperational, trgOperationToFail, trgFailed,
				trgFailToFailed, trgFail);
		//nothing EMoflonEdge trgFailedToRepair__trgFailed____place = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge semaphoreFailedCorr__srcSemaphore____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge semaphoreOperationalCorr__trgOperational____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge trgOperationToFail__trgOperational____place = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge trgRepairToOperational__trgOperational____place = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge srcSegment__srcSemaphore____semaphores = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge trgFailedToRepair__trgRepair____transition = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge trgRepair__trgFailedToRepair____arcs = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge semaphoreFailedCorr__trgFailed____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge trgRepair__trgPetrinet____petriNet = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge trgPetrinet__trgRepair____nodes = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge semaphoreOperationalCorr__srcSemaphore____source = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge trgRepairToOperational__trgRepair____transition = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge trgRepair__trgRepairToOperational____arcs = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge trgOperational__trgPetrinet____petriNet = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge trgPetrinet__trgOperational____nodes = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge trgFailToFailed__trgFail____transition = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge trgFail__trgFailToFailed____arcs = (EMoflonEdge) result3_green[31];
		//nothing EMoflonEdge trgFailed__trgPetrinet____petriNet = (EMoflonEdge) result3_green[32];
		//nothing EMoflonEdge trgPetrinet__trgFailed____nodes = (EMoflonEdge) result3_green[33];
		//nothing EMoflonEdge trgFailToFailed__trgFailed____place = (EMoflonEdge) result3_green[34];
		//nothing EMoflonEdge trgFail__trgPetrinet____petriNet = (EMoflonEdge) result3_green[35];
		//nothing EMoflonEdge trgPetrinet__trgFail____nodes = (EMoflonEdge) result3_green[36];
		//nothing EMoflonEdge trgOperationToFail__trgFail____transition = (EMoflonEdge) result3_green[37];
		//nothing EMoflonEdge trgFail__trgOperationToFail____arcs = (EMoflonEdge) result3_green[38];

		// 
		// 
		SemaphoreImpl.pattern_Semaphore_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(this, ruleresult,
				containerCorr, trgFailedToRepair, srcSemaphore, semaphoreFailedCorr, srcContainer, trgRepair,
				trgOperational, srcSegment, trgPetrinet, semaphoreOperationalCorr, trgRepairToOperational,
				trgOperationToFail, srcRegion, trgFailed, trgFailToFailed, trgFail);
		return SemaphoreImpl.pattern_Semaphore_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SemaphoreImpl
				.pattern_Semaphore_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SemaphoreImpl.pattern_Semaphore_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SemaphoreImpl.pattern_Semaphore_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) result2_binding[0];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[1];
		Segment srcSegment = (Segment) result2_binding[2];
		Region srcRegion = (Region) result2_binding[3];
		for (Object[] result2_black : SemaphoreImpl.pattern_Semaphore_2_2_corematch_blackFBBBFBB(srcSemaphore,
				srcContainer, srcSegment, srcRegion, match)) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result2_black[0];
			PetriNet trgPetrinet = (PetriNet) result2_black[4];
			// ForEach 
			for (Object[] result3_black : SemaphoreImpl.pattern_Semaphore_2_3_findcontext_blackBBBBBB(containerCorr,
					srcSemaphore, srcContainer, srcSegment, trgPetrinet, srcRegion)) {
				Object[] result3_green = SemaphoreImpl.pattern_Semaphore_2_3_findcontext_greenBBBBBBFFFFFF(
						containerCorr, srcSemaphore, srcContainer, srcSegment, trgPetrinet, srcRegion);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge srcSegment__srcSemaphore____semaphores = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge srcRegion__srcSegment____elements = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = SemaphoreImpl
						.pattern_Semaphore_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, containerCorr,
								srcSemaphore, srcContainer, srcSegment, trgPetrinet, srcRegion);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[containerCorr] = " + containerCorr
							+ ", " + "[srcSemaphore] = " + srcSemaphore + ", " + "[srcContainer] = " + srcContainer
							+ ", " + "[srcSegment] = " + srcSegment + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
							+ "[srcRegion] = " + srcRegion + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SemaphoreImpl.pattern_Semaphore_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SemaphoreImpl
							.pattern_Semaphore_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SemaphoreImpl.pattern_Semaphore_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SemaphoreImpl.pattern_Semaphore_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {
		match.registerObject("srcSemaphore", srcSemaphore);
		match.registerObject("srcContainer", srcContainer);
		match.registerObject("srcSegment", srcSegment);
		match.registerObject("srcRegion", srcRegion);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {// Create CSP
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, PetriNet trgPetrinet, Region srcRegion) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_srcSemaphore_signal = CSPFactoryHelper.eINSTANCE.createVariable("srcSemaphore.signal", true, csp);
		var_srcSemaphore_signal.setValue(srcSemaphore.getSignal());
		var_srcSemaphore_signal.setType("railway.Signal");

		// Create unbound variables
		Variable var_trgOperational_tokens = CSPFactoryHelper.eINSTANCE.createVariable("trgOperational.tokens", csp);
		var_trgOperational_tokens.setType("int");
		Variable var_trgFailed_tokens = CSPFactoryHelper.eINSTANCE.createVariable("trgFailed.tokens", csp);
		var_trgFailed_tokens.setType("int");

		// Create constraints
		SignalToMarking signalToMarking = new SignalToMarking();

		csp.getConstraints().add(signalToMarking);

		// Solve CSP
		signalToMarking.setRuleName("NoRuleName");
		signalToMarking.solve(var_srcSemaphore_signal, var_trgOperational_tokens, var_trgFailed_tokens);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("containerCorr", containerCorr);
		isApplicableMatch.registerObject("srcSemaphore", srcSemaphore);
		isApplicableMatch.registerObject("srcContainer", srcContainer);
		isApplicableMatch.registerObject("srcSegment", srcSegment);
		isApplicableMatch.registerObject("trgPetrinet", trgPetrinet);
		isApplicableMatch.registerObject("srcRegion", srcRegion);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject containerCorr, EObject trgFailedToRepair,
			EObject srcSemaphore, EObject semaphoreFailedCorr, EObject srcContainer, EObject trgRepair,
			EObject trgOperational, EObject srcSegment, EObject trgPetrinet, EObject semaphoreOperationalCorr,
			EObject trgRepairToOperational, EObject trgOperationToFail, EObject srcRegion, EObject trgFailed,
			EObject trgFailToFailed, EObject trgFail) {
		ruleresult.registerObject("containerCorr", containerCorr);
		ruleresult.registerObject("trgFailedToRepair", trgFailedToRepair);
		ruleresult.registerObject("srcSemaphore", srcSemaphore);
		ruleresult.registerObject("semaphoreFailedCorr", semaphoreFailedCorr);
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgRepair", trgRepair);
		ruleresult.registerObject("trgOperational", trgOperational);
		ruleresult.registerObject("srcSegment", srcSegment);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("semaphoreOperationalCorr", semaphoreOperationalCorr);
		ruleresult.registerObject("trgRepairToOperational", trgRepairToOperational);
		ruleresult.registerObject("trgOperationToFail", trgOperationToFail);
		ruleresult.registerObject("srcRegion", srcRegion);
		ruleresult.registerObject("trgFailed", trgFailed);
		ruleresult.registerObject("trgFailToFailed", trgFailToFailed);
		ruleresult.registerObject("trgFail", trgFail);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcSemaphore").eClass())
				.equals("railway.Semaphore.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_8(EMoflonEdge _edge_semaphores) {

		Object[] result1_bindingAndBlack = SemaphoreImpl
				.pattern_Semaphore_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SemaphoreImpl.pattern_Semaphore_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SemaphoreImpl
				.pattern_Semaphore_10_2_testcorematchandDECs_blackFFFFB(_edge_semaphores)) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) result2_black[0];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[1];
			Segment srcSegment = (Segment) result2_black[2];
			Region srcRegion = (Region) result2_black[3];
			Object[] result2_green = SemaphoreImpl.pattern_Semaphore_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SemaphoreImpl.pattern_Semaphore_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
					match, srcSemaphore, srcContainer, srcSegment, srcRegion)) {
				// 
				if (SemaphoreImpl.pattern_Semaphore_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = SemaphoreImpl.pattern_Semaphore_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SemaphoreImpl.pattern_Semaphore_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SemaphoreImpl.pattern_Semaphore_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Semaphore");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("trgFailedToRepair", "kind", ArcKind.INPUT, ComparingOperator.EQUAL)) {
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

		if (!__helper.hasExpectedValue("trgFailToFailed", "kind", ArcKind.OUTPUT, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_trgOperational_tokens = CSPFactoryHelper.eINSTANCE.createVariable("trgOperational", true, csp);
		var_trgOperational_tokens.setValue(__helper.getValue("trgOperational", "tokens"));
		var_trgOperational_tokens.setType("int");

		Variable var_srcSemaphore_signal = CSPFactoryHelper.eINSTANCE.createVariable("srcSemaphore", true, csp);
		var_srcSemaphore_signal.setValue(__helper.getValue("srcSemaphore", "signal"));
		var_srcSemaphore_signal.setType("railway.Signal");

		Variable var_trgFailed_tokens = CSPFactoryHelper.eINSTANCE.createVariable("trgFailed", true, csp);
		var_trgFailed_tokens.setValue(__helper.getValue("trgFailed", "tokens"));
		var_trgFailed_tokens.setType("int");

		SignalToMarking signalToMarking0 = new SignalToMarking();
		csp.getConstraints().add(signalToMarking0);

		signalToMarking0.setRuleName("Semaphore");
		signalToMarking0.solve(var_srcSemaphore_signal, var_trgOperational_tokens, var_trgFailed_tokens);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_trgOperational_tokens.setBound(false);
			var_trgFailed_tokens.setBound(false);
			signalToMarking0.solve(var_srcSemaphore_signal, var_trgOperational_tokens, var_trgFailed_tokens);
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
	public boolean checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore,
			RailwayContainer srcContainer, Segment srcSegment, Region srcRegion) {// 
		Object[] result1_black = SemaphoreImpl.pattern_Semaphore_13_1_matchtggpattern_blackBBBB(srcSemaphore,
				srcContainer, srcSegment, srcRegion);
		if (result1_black != null) {
			return SemaphoreImpl.pattern_Semaphore_13_2_expressionF();
		} else {
			return SemaphoreImpl.pattern_Semaphore_13_3_expressionF();
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
		case RulesPackage.SEMAPHORE___IS_APPROPRIATE_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_SEGMENT_REGION:
			return isAppropriate_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Segment) arguments.get(3), (Region) arguments.get(4));
		case RulesPackage.SEMAPHORE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SEMAPHORE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SEMAPHORE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_SEGMENT_REGION:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Segment) arguments.get(3), (Region) arguments.get(4));
			return null;
		case RulesPackage.SEMAPHORE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SEMAPHORE_RAILWAYCONTAINER_SEGMENT_REGION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) arguments.get(1),
					(RailwayContainer) arguments.get(2), (Segment) arguments.get(3), (Region) arguments.get(4));
		case RulesPackage.SEMAPHORE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEMAPHORE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINERTOPETRINET_SEMAPHORE_RAILWAYCONTAINER_SEGMENT_PETRINET_REGION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(RailwayContainerToPetriNet) arguments.get(1),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) arguments.get(2),
					(RailwayContainer) arguments.get(3), (Segment) arguments.get(4), (PetriNet) arguments.get(5),
					(Region) arguments.get(6));
		case RulesPackage.SEMAPHORE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SEMAPHORE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.SEMAPHORE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SEMAPHORE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.SEMAPHORE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SEMAPHORE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SEMAPHORE___CHECK_DEC_FWD__SEMAPHORE_RAILWAYCONTAINER_SEGMENT_REGION:
			return checkDEC_FWD((hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) arguments.get(0),
					(RailwayContainer) arguments.get(1), (Segment) arguments.get(2), (Region) arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Semaphore_0_1_initialbindings_blackBBBBBB(Semaphore _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {
		return new Object[] { _this, match, srcSemaphore, srcContainer, srcSegment, srcRegion };
	}

	public static final Object[] pattern_Semaphore_0_2_SolveCSP_bindingFBBBBBB(Semaphore _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSemaphore, srcContainer, srcSegment,
				srcRegion);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSemaphore, srcContainer, srcSegment, srcRegion };
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Semaphore_0_2_SolveCSP_bindingAndBlackFBBBBBB(Semaphore _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {
		Object[] result_pattern_Semaphore_0_2_SolveCSP_binding = pattern_Semaphore_0_2_SolveCSP_bindingFBBBBBB(_this,
				match, srcSemaphore, srcContainer, srcSegment, srcRegion);
		if (result_pattern_Semaphore_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Semaphore_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Semaphore_0_2_SolveCSP_black = pattern_Semaphore_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Semaphore_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSemaphore, srcContainer, srcSegment, srcRegion };
			}
		}
		return null;
	}

	public static final boolean pattern_Semaphore_0_3_CheckCSP_expressionFBB(Semaphore _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Semaphore_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {
		return new Object[] { match, srcSemaphore, srcContainer, srcSegment, srcRegion };
	}

	public static final Object[] pattern_Semaphore_0_4_collectelementstobetranslated_greenBBBF(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, Segment srcSegment) {
		EMoflonEdge srcSegment__srcSemaphore____semaphores = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcSemaphore);
		String srcSegment__srcSemaphore____semaphores_name_prime = "semaphores";
		srcSegment__srcSemaphore____semaphores.setSrc(srcSegment);
		srcSegment__srcSemaphore____semaphores.setTrg(srcSemaphore);
		match.getToBeTranslatedEdges().add(srcSegment__srcSemaphore____semaphores);
		srcSegment__srcSemaphore____semaphores.setName(srcSegment__srcSemaphore____semaphores_name_prime);
		return new Object[] { match, srcSemaphore, srcSegment, srcSegment__srcSemaphore____semaphores };
	}

	public static final Object[] pattern_Semaphore_0_5_collectcontextelements_blackBBBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {
		return new Object[] { match, srcSemaphore, srcContainer, srcSegment, srcRegion };
	}

	public static final Object[] pattern_Semaphore_0_5_collectcontextelements_greenBBBBFF(Match match,
			RailwayContainer srcContainer, Segment srcSegment, Region srcRegion) {
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRegion__srcSegment____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(srcContainer);
		match.getContextNodes().add(srcSegment);
		match.getContextNodes().add(srcRegion);
		String srcContainer__srcRegion____regions_name_prime = "regions";
		String srcRegion__srcSegment____elements_name_prime = "elements";
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		match.getContextEdges().add(srcContainer__srcRegion____regions);
		srcRegion__srcSegment____elements.setSrc(srcRegion);
		srcRegion__srcSegment____elements.setTrg(srcSegment);
		match.getContextEdges().add(srcRegion__srcSegment____elements);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		srcRegion__srcSegment____elements.setName(srcRegion__srcSegment____elements_name_prime);
		return new Object[] { match, srcContainer, srcSegment, srcRegion, srcContainer__srcRegion____regions,
				srcRegion__srcSegment____elements };
	}

	public static final void pattern_Semaphore_0_6_registerobjectstomatch_expressionBBBBBB(Semaphore _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {
		_this.registerObjectsToMatch_FWD(match, srcSemaphore, srcContainer, srcSegment, srcRegion);

	}

	public static final boolean pattern_Semaphore_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Semaphore_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Semaphore_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("containerCorr");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcSemaphore");
		EObject _localVariable_2 = isApplicableMatch.getObject("srcContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("srcSegment");
		EObject _localVariable_4 = isApplicableMatch.getObject("trgPetrinet");
		EObject _localVariable_5 = isApplicableMatch.getObject("srcRegion");
		EObject tmpContainerCorr = _localVariable_0;
		EObject tmpSrcSemaphore = _localVariable_1;
		EObject tmpSrcContainer = _localVariable_2;
		EObject tmpSrcSegment = _localVariable_3;
		EObject tmpTrgPetrinet = _localVariable_4;
		EObject tmpSrcRegion = _localVariable_5;
		if (tmpContainerCorr instanceof RailwayContainerToPetriNet) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) tmpContainerCorr;
			if (tmpSrcSemaphore instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) tmpSrcSemaphore;
				if (tmpSrcContainer instanceof RailwayContainer) {
					RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
					if (tmpSrcSegment instanceof Segment) {
						Segment srcSegment = (Segment) tmpSrcSegment;
						if (tmpTrgPetrinet instanceof PetriNet) {
							PetriNet trgPetrinet = (PetriNet) tmpTrgPetrinet;
							if (tmpSrcRegion instanceof Region) {
								Region srcRegion = (Region) tmpSrcRegion;
								return new Object[] { containerCorr, srcSemaphore, srcContainer, srcSegment,
										trgPetrinet, srcRegion, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_1_1_performtransformation_blackBBBBBBFBB(
			RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, PetriNet trgPetrinet, Region srcRegion, Semaphore _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { containerCorr, srcSemaphore, srcContainer, srcSegment, trgPetrinet, srcRegion,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_1_1_performtransformation_bindingAndBlackFFFFFFFBB(Semaphore _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Semaphore_1_1_performtransformation_binding = pattern_Semaphore_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Semaphore_1_1_performtransformation_binding != null) {
			RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result_pattern_Semaphore_1_1_performtransformation_binding[0];
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) result_pattern_Semaphore_1_1_performtransformation_binding[1];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_Semaphore_1_1_performtransformation_binding[2];
			Segment srcSegment = (Segment) result_pattern_Semaphore_1_1_performtransformation_binding[3];
			PetriNet trgPetrinet = (PetriNet) result_pattern_Semaphore_1_1_performtransformation_binding[4];
			Region srcRegion = (Region) result_pattern_Semaphore_1_1_performtransformation_binding[5];

			Object[] result_pattern_Semaphore_1_1_performtransformation_black = pattern_Semaphore_1_1_performtransformation_blackBBBBBBFBB(
					containerCorr, srcSemaphore, srcContainer, srcSegment, trgPetrinet, srcRegion, _this,
					isApplicableMatch);
			if (result_pattern_Semaphore_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Semaphore_1_1_performtransformation_black[6];

				return new Object[] { containerCorr, srcSemaphore, srcContainer, srcSegment, trgPetrinet, srcRegion,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_1_1_performtransformation_greenFBFFFBFFFFFFB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, PetriNet trgPetrinet, CSP csp) {
		Arc trgFailedToRepair = StochasticPetriNetFactory.eINSTANCE.createArc();
		SemaphoreToFailed semaphoreFailedCorr = StochasticpetrinetFactory.eINSTANCE.createSemaphoreToFailed();
		TimedTransition trgRepair = StochasticPetriNetFactory.eINSTANCE.createTimedTransition();
		Place trgOperational = StochasticPetriNetFactory.eINSTANCE.createPlace();
		SemaphoreToOperational semaphoreOperationalCorr = StochasticpetrinetFactory.eINSTANCE
				.createSemaphoreToOperational();
		Arc trgRepairToOperational = StochasticPetriNetFactory.eINSTANCE.createArc();
		Arc trgOperationToFail = StochasticPetriNetFactory.eINSTANCE.createArc();
		Place trgFailed = StochasticPetriNetFactory.eINSTANCE.createPlace();
		Arc trgFailToFailed = StochasticPetriNetFactory.eINSTANCE.createArc();
		TimedTransition trgFail = StochasticPetriNetFactory.eINSTANCE.createTimedTransition();
		ArcKind trgFailedToRepair_kind_prime = ArcKind.INPUT;
		Object _localVariable_0 = csp.getValue("trgOperational", "tokens");
		ArcKind trgRepairToOperational_kind_prime = ArcKind.OUTPUT;
		ArcKind trgOperationToFail_kind_prime = ArcKind.INPUT;
		Object _localVariable_1 = csp.getValue("trgFailed", "tokens");
		ArcKind trgFailToFailed_kind_prime = ArcKind.OUTPUT;
		semaphoreFailedCorr.setSource(srcSemaphore);
		trgFailedToRepair.setTransition(trgRepair);
		trgRepair.setPetriNet(trgPetrinet);
		trgOperational.setPetriNet(trgPetrinet);
		semaphoreOperationalCorr.setTarget(trgOperational);
		semaphoreOperationalCorr.setSource(srcSemaphore);
		trgRepairToOperational.setPlace(trgOperational);
		trgRepairToOperational.setTransition(trgRepair);
		trgOperationToFail.setPlace(trgOperational);
		trgFailedToRepair.setPlace(trgFailed);
		semaphoreFailedCorr.setTarget(trgFailed);
		trgFailed.setPetriNet(trgPetrinet);
		trgFailToFailed.setPlace(trgFailed);
		trgFailToFailed.setTransition(trgFail);
		trgFail.setPetriNet(trgPetrinet);
		trgOperationToFail.setTransition(trgFail);
		trgFailedToRepair.setKind(trgFailedToRepair_kind_prime);
		int trgOperational_tokens_prime = (int) _localVariable_0;
		trgRepairToOperational.setKind(trgRepairToOperational_kind_prime);
		trgOperationToFail.setKind(trgOperationToFail_kind_prime);
		int trgFailed_tokens_prime = (int) _localVariable_1;
		trgFailToFailed.setKind(trgFailToFailed_kind_prime);
		trgOperational.setTokens(Integer.valueOf(trgOperational_tokens_prime));
		trgFailed.setTokens(Integer.valueOf(trgFailed_tokens_prime));
		return new Object[] { trgFailedToRepair, srcSemaphore, semaphoreFailedCorr, trgRepair, trgOperational,
				trgPetrinet, semaphoreOperationalCorr, trgRepairToOperational, trgOperationToFail, trgFailed,
				trgFailToFailed, trgFail, csp };
	}

	public static final Object[] pattern_Semaphore_1_2_collecttranslatedelements_blackBBBBBBBBBBB(Arc trgFailedToRepair,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore,
			SemaphoreToFailed semaphoreFailedCorr, TimedTransition trgRepair, Place trgOperational,
			SemaphoreToOperational semaphoreOperationalCorr, Arc trgRepairToOperational, Arc trgOperationToFail,
			Place trgFailed, Arc trgFailToFailed, TimedTransition trgFail) {
		if (!trgFailedToRepair.equals(trgRepairToOperational)) {
			if (!trgFailedToRepair.equals(trgOperationToFail)) {
				if (!trgOperationToFail.equals(trgRepairToOperational)) {
					if (!trgFailed.equals(trgOperational)) {
						if (!trgFailToFailed.equals(trgFailedToRepair)) {
							if (!trgFailToFailed.equals(trgRepairToOperational)) {
								if (!trgFailToFailed.equals(trgOperationToFail)) {
									if (!trgFail.equals(trgRepair)) {
										return new Object[] { trgFailedToRepair, srcSemaphore, semaphoreFailedCorr,
												trgRepair, trgOperational, semaphoreOperationalCorr,
												trgRepairToOperational, trgOperationToFail, trgFailed, trgFailToFailed,
												trgFail };
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

	public static final Object[] pattern_Semaphore_1_2_collecttranslatedelements_greenFBBBBBBBBBBB(
			Arc trgFailedToRepair, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore,
			SemaphoreToFailed semaphoreFailedCorr, TimedTransition trgRepair, Place trgOperational,
			SemaphoreToOperational semaphoreOperationalCorr, Arc trgRepairToOperational, Arc trgOperationToFail,
			Place trgFailed, Arc trgFailToFailed, TimedTransition trgFail) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(trgFailedToRepair);
		ruleresult.getTranslatedElements().add(srcSemaphore);
		ruleresult.getCreatedLinkElements().add(semaphoreFailedCorr);
		ruleresult.getCreatedElements().add(trgRepair);
		ruleresult.getCreatedElements().add(trgOperational);
		ruleresult.getCreatedLinkElements().add(semaphoreOperationalCorr);
		ruleresult.getCreatedElements().add(trgRepairToOperational);
		ruleresult.getCreatedElements().add(trgOperationToFail);
		ruleresult.getCreatedElements().add(trgFailed);
		ruleresult.getCreatedElements().add(trgFailToFailed);
		ruleresult.getCreatedElements().add(trgFail);
		return new Object[] { ruleresult, trgFailedToRepair, srcSemaphore, semaphoreFailedCorr, trgRepair,
				trgOperational, semaphoreOperationalCorr, trgRepairToOperational, trgOperationToFail, trgFailed,
				trgFailToFailed, trgFail };
	}

	public static final Object[] pattern_Semaphore_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject containerCorr, EObject trgFailedToRepair, EObject srcSemaphore,
			EObject semaphoreFailedCorr, EObject srcContainer, EObject trgRepair, EObject trgOperational,
			EObject srcSegment, EObject trgPetrinet, EObject semaphoreOperationalCorr, EObject trgRepairToOperational,
			EObject trgOperationToFail, EObject srcRegion, EObject trgFailed, EObject trgFailToFailed,
			EObject trgFail) {
		if (!containerCorr.equals(trgFailedToRepair)) {
			if (!containerCorr.equals(srcSemaphore)) {
				if (!containerCorr.equals(semaphoreFailedCorr)) {
					if (!containerCorr.equals(srcContainer)) {
						if (!containerCorr.equals(trgRepair)) {
							if (!containerCorr.equals(trgOperational)) {
								if (!containerCorr.equals(srcSegment)) {
									if (!containerCorr.equals(trgPetrinet)) {
										if (!containerCorr.equals(semaphoreOperationalCorr)) {
											if (!containerCorr.equals(trgRepairToOperational)) {
												if (!containerCorr.equals(trgOperationToFail)) {
													if (!containerCorr.equals(srcRegion)) {
														if (!containerCorr.equals(trgFailed)) {
															if (!containerCorr.equals(trgFailToFailed)) {
																if (!containerCorr.equals(trgFail)) {
																	if (!trgFailedToRepair.equals(trgRepair)) {
																		if (!trgFailedToRepair.equals(trgOperational)) {
																			if (!trgFailedToRepair
																					.equals(trgPetrinet)) {
																				if (!trgFailedToRepair.equals(
																						trgRepairToOperational)) {
																					if (!trgFailedToRepair.equals(
																							trgOperationToFail)) {
																						if (!srcSemaphore.equals(
																								trgFailedToRepair)) {
																							if (!srcSemaphore.equals(
																									trgRepair)) {
																								if (!srcSemaphore
																										.equals(trgOperational)) {
																									if (!srcSemaphore
																											.equals(trgPetrinet)) {
																										if (!srcSemaphore
																												.equals(trgRepairToOperational)) {
																											if (!srcSemaphore
																													.equals(trgOperationToFail)) {
																												if (!srcSemaphore
																														.equals(trgFailed)) {
																													if (!srcSemaphore
																															.equals(trgFailToFailed)) {
																														if (!srcSemaphore
																																.equals(trgFail)) {
																															if (!semaphoreFailedCorr
																																	.equals(trgFailedToRepair)) {
																																if (!semaphoreFailedCorr
																																		.equals(srcSemaphore)) {
																																	if (!semaphoreFailedCorr
																																			.equals(srcContainer)) {
																																		if (!semaphoreFailedCorr
																																				.equals(trgRepair)) {
																																			if (!semaphoreFailedCorr
																																					.equals(trgOperational)) {
																																				if (!semaphoreFailedCorr
																																						.equals(srcSegment)) {
																																					if (!semaphoreFailedCorr
																																							.equals(trgPetrinet)) {
																																						if (!semaphoreFailedCorr
																																								.equals(semaphoreOperationalCorr)) {
																																							if (!semaphoreFailedCorr
																																									.equals(trgRepairToOperational)) {
																																								if (!semaphoreFailedCorr
																																										.equals(trgOperationToFail)) {
																																									if (!semaphoreFailedCorr
																																											.equals(srcRegion)) {
																																										if (!semaphoreFailedCorr
																																												.equals(trgFailed)) {
																																											if (!semaphoreFailedCorr
																																													.equals(trgFailToFailed)) {
																																												if (!semaphoreFailedCorr
																																														.equals(trgFail)) {
																																													if (!srcContainer
																																															.equals(trgFailedToRepair)) {
																																														if (!srcContainer
																																																.equals(srcSemaphore)) {
																																															if (!srcContainer
																																																	.equals(trgRepair)) {
																																																if (!srcContainer
																																																		.equals(trgOperational)) {
																																																	if (!srcContainer
																																																			.equals(srcSegment)) {
																																																		if (!srcContainer
																																																				.equals(trgPetrinet)) {
																																																			if (!srcContainer
																																																					.equals(trgRepairToOperational)) {
																																																				if (!srcContainer
																																																						.equals(trgOperationToFail)) {
																																																					if (!srcContainer
																																																							.equals(srcRegion)) {
																																																						if (!srcContainer
																																																								.equals(trgFailed)) {
																																																							if (!srcContainer
																																																									.equals(trgFailToFailed)) {
																																																								if (!srcContainer
																																																										.equals(trgFail)) {
																																																									if (!trgRepair
																																																											.equals(trgRepairToOperational)) {
																																																										if (!trgOperational
																																																												.equals(trgRepair)) {
																																																											if (!trgOperational
																																																													.equals(trgPetrinet)) {
																																																												if (!trgOperational
																																																														.equals(trgRepairToOperational)) {
																																																													if (!srcSegment
																																																															.equals(trgFailedToRepair)) {
																																																														if (!srcSegment
																																																																.equals(srcSemaphore)) {
																																																															if (!srcSegment
																																																																	.equals(trgRepair)) {
																																																																if (!srcSegment
																																																																		.equals(trgOperational)) {
																																																																	if (!srcSegment
																																																																			.equals(trgPetrinet)) {
																																																																		if (!srcSegment
																																																																				.equals(trgRepairToOperational)) {
																																																																			if (!srcSegment
																																																																					.equals(trgOperationToFail)) {
																																																																				if (!srcSegment
																																																																						.equals(trgFailed)) {
																																																																					if (!srcSegment
																																																																							.equals(trgFailToFailed)) {
																																																																						if (!srcSegment
																																																																								.equals(trgFail)) {
																																																																							if (!trgPetrinet
																																																																									.equals(trgRepair)) {
																																																																								if (!trgPetrinet
																																																																										.equals(trgRepairToOperational)) {
																																																																									if (!semaphoreOperationalCorr
																																																																											.equals(trgFailedToRepair)) {
																																																																										if (!semaphoreOperationalCorr
																																																																												.equals(srcSemaphore)) {
																																																																											if (!semaphoreOperationalCorr
																																																																													.equals(srcContainer)) {
																																																																												if (!semaphoreOperationalCorr
																																																																														.equals(trgRepair)) {
																																																																													if (!semaphoreOperationalCorr
																																																																															.equals(trgOperational)) {
																																																																														if (!semaphoreOperationalCorr
																																																																																.equals(srcSegment)) {
																																																																															if (!semaphoreOperationalCorr
																																																																																	.equals(trgPetrinet)) {
																																																																																if (!semaphoreOperationalCorr
																																																																																		.equals(trgRepairToOperational)) {
																																																																																	if (!semaphoreOperationalCorr
																																																																																			.equals(trgOperationToFail)) {
																																																																																		if (!semaphoreOperationalCorr
																																																																																				.equals(srcRegion)) {
																																																																																			if (!semaphoreOperationalCorr
																																																																																					.equals(trgFailed)) {
																																																																																				if (!semaphoreOperationalCorr
																																																																																						.equals(trgFailToFailed)) {
																																																																																					if (!semaphoreOperationalCorr
																																																																																							.equals(trgFail)) {
																																																																																						if (!trgOperationToFail
																																																																																								.equals(trgRepair)) {
																																																																																							if (!trgOperationToFail
																																																																																									.equals(trgOperational)) {
																																																																																								if (!trgOperationToFail
																																																																																										.equals(trgPetrinet)) {
																																																																																									if (!trgOperationToFail
																																																																																											.equals(trgRepairToOperational)) {
																																																																																										if (!srcRegion
																																																																																												.equals(trgFailedToRepair)) {
																																																																																											if (!srcRegion
																																																																																													.equals(srcSemaphore)) {
																																																																																												if (!srcRegion
																																																																																														.equals(trgRepair)) {
																																																																																													if (!srcRegion
																																																																																															.equals(trgOperational)) {
																																																																																														if (!srcRegion
																																																																																																.equals(srcSegment)) {
																																																																																															if (!srcRegion
																																																																																																	.equals(trgPetrinet)) {
																																																																																																if (!srcRegion
																																																																																																		.equals(trgRepairToOperational)) {
																																																																																																	if (!srcRegion
																																																																																																			.equals(trgOperationToFail)) {
																																																																																																		if (!srcRegion
																																																																																																				.equals(trgFailed)) {
																																																																																																			if (!srcRegion
																																																																																																					.equals(trgFailToFailed)) {
																																																																																																				if (!srcRegion
																																																																																																						.equals(trgFail)) {
																																																																																																					if (!trgFailed
																																																																																																							.equals(trgFailedToRepair)) {
																																																																																																						if (!trgFailed
																																																																																																								.equals(trgRepair)) {
																																																																																																							if (!trgFailed
																																																																																																									.equals(trgOperational)) {
																																																																																																								if (!trgFailed
																																																																																																										.equals(trgPetrinet)) {
																																																																																																									if (!trgFailed
																																																																																																											.equals(trgRepairToOperational)) {
																																																																																																										if (!trgFailed
																																																																																																												.equals(trgOperationToFail)) {
																																																																																																											if (!trgFailToFailed
																																																																																																													.equals(trgFailedToRepair)) {
																																																																																																												if (!trgFailToFailed
																																																																																																														.equals(trgRepair)) {
																																																																																																													if (!trgFailToFailed
																																																																																																															.equals(trgOperational)) {
																																																																																																														if (!trgFailToFailed
																																																																																																																.equals(trgPetrinet)) {
																																																																																																															if (!trgFailToFailed
																																																																																																																	.equals(trgRepairToOperational)) {
																																																																																																																if (!trgFailToFailed
																																																																																																																		.equals(trgOperationToFail)) {
																																																																																																																	if (!trgFailToFailed
																																																																																																																			.equals(trgFailed)) {
																																																																																																																		if (!trgFail
																																																																																																																				.equals(trgFailedToRepair)) {
																																																																																																																			if (!trgFail
																																																																																																																					.equals(trgRepair)) {
																																																																																																																				if (!trgFail
																																																																																																																						.equals(trgOperational)) {
																																																																																																																					if (!trgFail
																																																																																																																							.equals(trgPetrinet)) {
																																																																																																																						if (!trgFail
																																																																																																																								.equals(trgRepairToOperational)) {
																																																																																																																							if (!trgFail
																																																																																																																									.equals(trgOperationToFail)) {
																																																																																																																								if (!trgFail
																																																																																																																										.equals(trgFailed)) {
																																																																																																																									if (!trgFail
																																																																																																																											.equals(trgFailToFailed)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												containerCorr,
																																																																																																																												trgFailedToRepair,
																																																																																																																												srcSemaphore,
																																																																																																																												semaphoreFailedCorr,
																																																																																																																												srcContainer,
																																																																																																																												trgRepair,
																																																																																																																												trgOperational,
																																																																																																																												srcSegment,
																																																																																																																												trgPetrinet,
																																																																																																																												semaphoreOperationalCorr,
																																																																																																																												trgRepairToOperational,
																																																																																																																												trgOperationToFail,
																																																																																																																												srcRegion,
																																																																																																																												trgFailed,
																																																																																																																												trgFailToFailed,
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
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Semaphore_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject trgFailedToRepair, EObject srcSemaphore, EObject semaphoreFailedCorr,
			EObject trgRepair, EObject trgOperational, EObject srcSegment, EObject trgPetrinet,
			EObject semaphoreOperationalCorr, EObject trgRepairToOperational, EObject trgOperationToFail,
			EObject trgFailed, EObject trgFailToFailed, EObject trgFail) {
		EMoflonEdge trgFailedToRepair__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreFailedCorr__srcSemaphore____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreOperationalCorr__trgOperational____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperationToFail__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgOperational____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSegment__srcSemaphore____semaphores = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailedToRepair__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgFailedToRepair____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreFailedCorr__trgFailed____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgRepair____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge semaphoreOperationalCorr__srcSemaphore____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepairToOperational__trgRepair____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgRepair__trgRepairToOperational____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperational__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgOperational____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailToFailed__trgFail____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgFailToFailed____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailed__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFailed____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFailToFailed__trgFailed____place = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgPetrinet____petriNet = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgPetrinet__trgFail____nodes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgOperationToFail__trgFail____transition = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge trgFail__trgOperationToFail____arcs = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Semaphore";
		String trgFailedToRepair__trgFailed____place_name_prime = "place";
		String semaphoreFailedCorr__srcSemaphore____source_name_prime = "source";
		String semaphoreOperationalCorr__trgOperational____target_name_prime = "target";
		String trgOperationToFail__trgOperational____place_name_prime = "place";
		String trgRepairToOperational__trgOperational____place_name_prime = "place";
		String srcSegment__srcSemaphore____semaphores_name_prime = "semaphores";
		String trgFailedToRepair__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgFailedToRepair____arcs_name_prime = "arcs";
		String semaphoreFailedCorr__trgFailed____target_name_prime = "target";
		String trgRepair__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgRepair____nodes_name_prime = "nodes";
		String semaphoreOperationalCorr__srcSemaphore____source_name_prime = "source";
		String trgRepairToOperational__trgRepair____transition_name_prime = "transition";
		String trgRepair__trgRepairToOperational____arcs_name_prime = "arcs";
		String trgOperational__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgOperational____nodes_name_prime = "nodes";
		String trgFailToFailed__trgFail____transition_name_prime = "transition";
		String trgFail__trgFailToFailed____arcs_name_prime = "arcs";
		String trgFailed__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFailed____nodes_name_prime = "nodes";
		String trgFailToFailed__trgFailed____place_name_prime = "place";
		String trgFail__trgPetrinet____petriNet_name_prime = "petriNet";
		String trgPetrinet__trgFail____nodes_name_prime = "nodes";
		String trgOperationToFail__trgFail____transition_name_prime = "transition";
		String trgFail__trgOperationToFail____arcs_name_prime = "arcs";
		trgFailedToRepair__trgFailed____place.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgFailed____place);
		semaphoreFailedCorr__srcSemaphore____source.setSrc(semaphoreFailedCorr);
		semaphoreFailedCorr__srcSemaphore____source.setTrg(srcSemaphore);
		ruleresult.getCreatedEdges().add(semaphoreFailedCorr__srcSemaphore____source);
		semaphoreOperationalCorr__trgOperational____target.setSrc(semaphoreOperationalCorr);
		semaphoreOperationalCorr__trgOperational____target.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(semaphoreOperationalCorr__trgOperational____target);
		trgOperationToFail__trgOperational____place.setSrc(trgOperationToFail);
		trgOperationToFail__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgOperationToFail__trgOperational____place);
		trgRepairToOperational__trgOperational____place.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgOperational____place.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgOperational____place);
		srcSegment__srcSemaphore____semaphores.setSrc(srcSegment);
		srcSegment__srcSemaphore____semaphores.setTrg(srcSemaphore);
		ruleresult.getTranslatedEdges().add(srcSegment__srcSemaphore____semaphores);
		trgFailedToRepair__trgRepair____transition.setSrc(trgFailedToRepair);
		trgFailedToRepair__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgFailedToRepair__trgRepair____transition);
		trgRepair__trgFailedToRepair____arcs.setSrc(trgRepair);
		trgRepair__trgFailedToRepair____arcs.setTrg(trgFailedToRepair);
		ruleresult.getCreatedEdges().add(trgRepair__trgFailedToRepair____arcs);
		semaphoreFailedCorr__trgFailed____target.setSrc(semaphoreFailedCorr);
		semaphoreFailedCorr__trgFailed____target.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(semaphoreFailedCorr__trgFailed____target);
		trgRepair__trgPetrinet____petriNet.setSrc(trgRepair);
		trgRepair__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgRepair__trgPetrinet____petriNet);
		trgPetrinet__trgRepair____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgRepair____nodes.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgRepair____nodes);
		semaphoreOperationalCorr__srcSemaphore____source.setSrc(semaphoreOperationalCorr);
		semaphoreOperationalCorr__srcSemaphore____source.setTrg(srcSemaphore);
		ruleresult.getCreatedEdges().add(semaphoreOperationalCorr__srcSemaphore____source);
		trgRepairToOperational__trgRepair____transition.setSrc(trgRepairToOperational);
		trgRepairToOperational__trgRepair____transition.setTrg(trgRepair);
		ruleresult.getCreatedEdges().add(trgRepairToOperational__trgRepair____transition);
		trgRepair__trgRepairToOperational____arcs.setSrc(trgRepair);
		trgRepair__trgRepairToOperational____arcs.setTrg(trgRepairToOperational);
		ruleresult.getCreatedEdges().add(trgRepair__trgRepairToOperational____arcs);
		trgOperational__trgPetrinet____petriNet.setSrc(trgOperational);
		trgOperational__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgOperational__trgPetrinet____petriNet);
		trgPetrinet__trgOperational____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgOperational____nodes.setTrg(trgOperational);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgOperational____nodes);
		trgFailToFailed__trgFail____transition.setSrc(trgFailToFailed);
		trgFailToFailed__trgFail____transition.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgFailToFailed__trgFail____transition);
		trgFail__trgFailToFailed____arcs.setSrc(trgFail);
		trgFail__trgFailToFailed____arcs.setTrg(trgFailToFailed);
		ruleresult.getCreatedEdges().add(trgFail__trgFailToFailed____arcs);
		trgFailed__trgPetrinet____petriNet.setSrc(trgFailed);
		trgFailed__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFailed__trgPetrinet____petriNet);
		trgPetrinet__trgFailed____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFailed____nodes.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFailed____nodes);
		trgFailToFailed__trgFailed____place.setSrc(trgFailToFailed);
		trgFailToFailed__trgFailed____place.setTrg(trgFailed);
		ruleresult.getCreatedEdges().add(trgFailToFailed__trgFailed____place);
		trgFail__trgPetrinet____petriNet.setSrc(trgFail);
		trgFail__trgPetrinet____petriNet.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(trgFail__trgPetrinet____petriNet);
		trgPetrinet__trgFail____nodes.setSrc(trgPetrinet);
		trgPetrinet__trgFail____nodes.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgPetrinet__trgFail____nodes);
		trgOperationToFail__trgFail____transition.setSrc(trgOperationToFail);
		trgOperationToFail__trgFail____transition.setTrg(trgFail);
		ruleresult.getCreatedEdges().add(trgOperationToFail__trgFail____transition);
		trgFail__trgOperationToFail____arcs.setSrc(trgFail);
		trgFail__trgOperationToFail____arcs.setTrg(trgOperationToFail);
		ruleresult.getCreatedEdges().add(trgFail__trgOperationToFail____arcs);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		trgFailedToRepair__trgFailed____place.setName(trgFailedToRepair__trgFailed____place_name_prime);
		semaphoreFailedCorr__srcSemaphore____source.setName(semaphoreFailedCorr__srcSemaphore____source_name_prime);
		semaphoreOperationalCorr__trgOperational____target
				.setName(semaphoreOperationalCorr__trgOperational____target_name_prime);
		trgOperationToFail__trgOperational____place.setName(trgOperationToFail__trgOperational____place_name_prime);
		trgRepairToOperational__trgOperational____place
				.setName(trgRepairToOperational__trgOperational____place_name_prime);
		srcSegment__srcSemaphore____semaphores.setName(srcSegment__srcSemaphore____semaphores_name_prime);
		trgFailedToRepair__trgRepair____transition.setName(trgFailedToRepair__trgRepair____transition_name_prime);
		trgRepair__trgFailedToRepair____arcs.setName(trgRepair__trgFailedToRepair____arcs_name_prime);
		semaphoreFailedCorr__trgFailed____target.setName(semaphoreFailedCorr__trgFailed____target_name_prime);
		trgRepair__trgPetrinet____petriNet.setName(trgRepair__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgRepair____nodes.setName(trgPetrinet__trgRepair____nodes_name_prime);
		semaphoreOperationalCorr__srcSemaphore____source
				.setName(semaphoreOperationalCorr__srcSemaphore____source_name_prime);
		trgRepairToOperational__trgRepair____transition
				.setName(trgRepairToOperational__trgRepair____transition_name_prime);
		trgRepair__trgRepairToOperational____arcs.setName(trgRepair__trgRepairToOperational____arcs_name_prime);
		trgOperational__trgPetrinet____petriNet.setName(trgOperational__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgOperational____nodes.setName(trgPetrinet__trgOperational____nodes_name_prime);
		trgFailToFailed__trgFail____transition.setName(trgFailToFailed__trgFail____transition_name_prime);
		trgFail__trgFailToFailed____arcs.setName(trgFail__trgFailToFailed____arcs_name_prime);
		trgFailed__trgPetrinet____petriNet.setName(trgFailed__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFailed____nodes.setName(trgPetrinet__trgFailed____nodes_name_prime);
		trgFailToFailed__trgFailed____place.setName(trgFailToFailed__trgFailed____place_name_prime);
		trgFail__trgPetrinet____petriNet.setName(trgFail__trgPetrinet____petriNet_name_prime);
		trgPetrinet__trgFail____nodes.setName(trgPetrinet__trgFail____nodes_name_prime);
		trgOperationToFail__trgFail____transition.setName(trgOperationToFail__trgFail____transition_name_prime);
		trgFail__trgOperationToFail____arcs.setName(trgFail__trgOperationToFail____arcs_name_prime);
		return new Object[] { ruleresult, trgFailedToRepair, srcSemaphore, semaphoreFailedCorr, trgRepair,
				trgOperational, srcSegment, trgPetrinet, semaphoreOperationalCorr, trgRepairToOperational,
				trgOperationToFail, trgFailed, trgFailToFailed, trgFail, trgFailedToRepair__trgFailed____place,
				semaphoreFailedCorr__srcSemaphore____source, semaphoreOperationalCorr__trgOperational____target,
				trgOperationToFail__trgOperational____place, trgRepairToOperational__trgOperational____place,
				srcSegment__srcSemaphore____semaphores, trgFailedToRepair__trgRepair____transition,
				trgRepair__trgFailedToRepair____arcs, semaphoreFailedCorr__trgFailed____target,
				trgRepair__trgPetrinet____petriNet, trgPetrinet__trgRepair____nodes,
				semaphoreOperationalCorr__srcSemaphore____source, trgRepairToOperational__trgRepair____transition,
				trgRepair__trgRepairToOperational____arcs, trgOperational__trgPetrinet____petriNet,
				trgPetrinet__trgOperational____nodes, trgFailToFailed__trgFail____transition,
				trgFail__trgFailToFailed____arcs, trgFailed__trgPetrinet____petriNet, trgPetrinet__trgFailed____nodes,
				trgFailToFailed__trgFailed____place, trgFail__trgPetrinet____petriNet, trgPetrinet__trgFail____nodes,
				trgOperationToFail__trgFail____transition, trgFail__trgOperationToFail____arcs };
	}

	public static final void pattern_Semaphore_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(Semaphore _this,
			PerformRuleResult ruleresult, EObject containerCorr, EObject trgFailedToRepair, EObject srcSemaphore,
			EObject semaphoreFailedCorr, EObject srcContainer, EObject trgRepair, EObject trgOperational,
			EObject srcSegment, EObject trgPetrinet, EObject semaphoreOperationalCorr, EObject trgRepairToOperational,
			EObject trgOperationToFail, EObject srcRegion, EObject trgFailed, EObject trgFailToFailed,
			EObject trgFail) {
		_this.registerObjects_FWD(ruleresult, containerCorr, trgFailedToRepair, srcSemaphore, semaphoreFailedCorr,
				srcContainer, trgRepair, trgOperational, srcSegment, trgPetrinet, semaphoreOperationalCorr,
				trgRepairToOperational, trgOperationToFail, srcRegion, trgFailed, trgFailToFailed, trgFail);

	}

	public static final PerformRuleResult pattern_Semaphore_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Semaphore_2_1_preparereturnvalue_bindingFB(Semaphore _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_2_1_preparereturnvalue_blackFBB(EClass eClass, Semaphore _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Semaphore_2_1_preparereturnvalue_bindingAndBlackFFB(Semaphore _this) {
		Object[] result_pattern_Semaphore_2_1_preparereturnvalue_binding = pattern_Semaphore_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Semaphore_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Semaphore_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Semaphore_2_1_preparereturnvalue_black = pattern_Semaphore_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Semaphore_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Semaphore_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Semaphore";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Semaphore_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcSemaphore");
		EObject _localVariable_1 = match.getObject("srcContainer");
		EObject _localVariable_2 = match.getObject("srcSegment");
		EObject _localVariable_3 = match.getObject("srcRegion");
		EObject tmpSrcSemaphore = _localVariable_0;
		EObject tmpSrcContainer = _localVariable_1;
		EObject tmpSrcSegment = _localVariable_2;
		EObject tmpSrcRegion = _localVariable_3;
		if (tmpSrcSemaphore instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) tmpSrcSemaphore;
			if (tmpSrcContainer instanceof RailwayContainer) {
				RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
				if (tmpSrcSegment instanceof Segment) {
					Segment srcSegment = (Segment) tmpSrcSegment;
					if (tmpSrcRegion instanceof Region) {
						Region srcRegion = (Region) tmpSrcRegion;
						return new Object[] { srcSemaphore, srcContainer, srcSegment, srcRegion, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Semaphore_2_2_corematch_blackFBBBFBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RailwayContainerToPetriNet containerCorr : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(srcContainer, RailwayContainerToPetriNet.class, "source")) {
			PetriNet trgPetrinet = containerCorr.getTarget();
			if (trgPetrinet != null) {
				_result.add(new Object[] { containerCorr, srcSemaphore, srcContainer, srcSegment, trgPetrinet,
						srcRegion, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Semaphore_2_3_findcontext_blackBBBBBB(
			RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, PetriNet trgPetrinet, Region srcRegion) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcContainer.getRegions().contains(srcRegion)) {
			if (srcContainer.equals(containerCorr.getSource())) {
				if (srcSegment.getSemaphores().contains(srcSemaphore)) {
					if (trgPetrinet.equals(containerCorr.getTarget())) {
						if (srcRegion.getElements().contains(srcSegment)) {
							_result.add(new Object[] { containerCorr, srcSemaphore, srcContainer, srcSegment,
									trgPetrinet, srcRegion });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Semaphore_2_3_findcontext_greenBBBBBBFFFFFF(
			RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, PetriNet trgPetrinet, Region srcRegion) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSegment__srcSemaphore____semaphores = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcRegion__srcSegment____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcContainer__srcRegion____regions_name_prime = "regions";
		String containerCorr__srcContainer____source_name_prime = "source";
		String srcSegment__srcSemaphore____semaphores_name_prime = "semaphores";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String srcRegion__srcSegment____elements_name_prime = "elements";
		isApplicableMatch.getAllContextElements().add(containerCorr);
		isApplicableMatch.getAllContextElements().add(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		isApplicableMatch.getAllContextElements().add(srcSegment);
		isApplicableMatch.getAllContextElements().add(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(srcRegion);
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRegion____regions);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		isApplicableMatch.getAllContextElements().add(containerCorr__srcContainer____source);
		srcSegment__srcSemaphore____semaphores.setSrc(srcSegment);
		srcSegment__srcSemaphore____semaphores.setTrg(srcSemaphore);
		isApplicableMatch.getAllContextElements().add(srcSegment__srcSemaphore____semaphores);
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		isApplicableMatch.getAllContextElements().add(containerCorr__trgPetrinet____target);
		srcRegion__srcSegment____elements.setSrc(srcRegion);
		srcRegion__srcSegment____elements.setTrg(srcSegment);
		isApplicableMatch.getAllContextElements().add(srcRegion__srcSegment____elements);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		srcSegment__srcSemaphore____semaphores.setName(srcSegment__srcSemaphore____semaphores_name_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		srcRegion__srcSegment____elements.setName(srcRegion__srcSegment____elements_name_prime);
		return new Object[] { containerCorr, srcSemaphore, srcContainer, srcSegment, trgPetrinet, srcRegion,
				isApplicableMatch, srcContainer__srcRegion____regions, containerCorr__srcContainer____source,
				srcSegment__srcSemaphore____semaphores, containerCorr__trgPetrinet____target,
				srcRegion__srcSegment____elements };
	}

	public static final Object[] pattern_Semaphore_2_4_solveCSP_bindingFBBBBBBBB(Semaphore _this,
			IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, PetriNet trgPetrinet, Region srcRegion) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, containerCorr, srcSemaphore,
				srcContainer, srcSegment, trgPetrinet, srcRegion);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, containerCorr, srcSemaphore, srcContainer, srcSegment,
					trgPetrinet, srcRegion };
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Semaphore_2_4_solveCSP_bindingAndBlackFBBBBBBBB(Semaphore _this,
			IsApplicableMatch isApplicableMatch, RailwayContainerToPetriNet containerCorr,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, PetriNet trgPetrinet, Region srcRegion) {
		Object[] result_pattern_Semaphore_2_4_solveCSP_binding = pattern_Semaphore_2_4_solveCSP_bindingFBBBBBBBB(_this,
				isApplicableMatch, containerCorr, srcSemaphore, srcContainer, srcSegment, trgPetrinet, srcRegion);
		if (result_pattern_Semaphore_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Semaphore_2_4_solveCSP_binding[0];

			Object[] result_pattern_Semaphore_2_4_solveCSP_black = pattern_Semaphore_2_4_solveCSP_blackB(csp);
			if (result_pattern_Semaphore_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, containerCorr, srcSemaphore, srcContainer,
						srcSegment, trgPetrinet, srcRegion };
			}
		}
		return null;
	}

	public static final boolean pattern_Semaphore_2_5_checkCSP_expressionFBB(Semaphore _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Semaphore_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Semaphore_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Semaphore";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Semaphore_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Semaphore_10_1_preparereturnvalue_bindingFB(Semaphore _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_10_1_preparereturnvalue_blackFBBF(EClass __eClass, Semaphore _this) {
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

	public static final Object[] pattern_Semaphore_10_1_preparereturnvalue_bindingAndBlackFFBF(Semaphore _this) {
		Object[] result_pattern_Semaphore_10_1_preparereturnvalue_binding = pattern_Semaphore_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Semaphore_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Semaphore_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Semaphore_10_1_preparereturnvalue_black = pattern_Semaphore_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Semaphore_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Semaphore_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Semaphore_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Semaphore_10_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_semaphores) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcSegment = _edge_semaphores.getSrc();
		if (tmpSrcSegment instanceof Segment) {
			Segment srcSegment = (Segment) tmpSrcSegment;
			EObject tmpSrcSemaphore = _edge_semaphores.getTrg();
			if (tmpSrcSemaphore instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore) tmpSrcSemaphore;
				if (srcSegment.getSemaphores().contains(srcSemaphore)) {
					for (Region srcRegion : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(srcSegment, Region.class, "elements")) {
						for (RailwayContainer srcContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(srcRegion, RailwayContainer.class, "regions")) {
							_result.add(new Object[] { srcSemaphore, srcContainer, srcSegment, srcRegion,
									_edge_semaphores });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Semaphore_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Semaphore_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			Semaphore _this, Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore,
			RailwayContainer srcContainer, Segment srcSegment, Region srcRegion) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSemaphore, srcContainer, srcSegment, srcRegion);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Semaphore_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Semaphore _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Semaphore_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Semaphore_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Semaphore_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Semaphore_13_1_matchtggpattern_blackBBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Semaphore srcSemaphore, RailwayContainer srcContainer,
			Segment srcSegment, Region srcRegion) {
		if (srcContainer.getRegions().contains(srcRegion)) {
			if (srcSegment.getSemaphores().contains(srcSemaphore)) {
				if (srcRegion.getElements().contains(srcSegment)) {
					return new Object[] { srcSemaphore, srcContainer, srcSegment, srcRegion };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_Semaphore_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Semaphore_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SemaphoreImpl
