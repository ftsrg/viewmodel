/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Sensor;
import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.TrackElement;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SensorMonitors;

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
 * An implementation of the model object '<em><b>Sensor Monitors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SensorMonitorsImpl extends AbstractRuleImpl implements SensorMonitors {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorMonitorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSensorMonitors();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TrackElement srcTrackElement, Sensor srcSensor) {

		Object[] result1_black = SensorMonitorsImpl.pattern_SensorMonitors_0_1_initialbindings_blackBBBB(this, match,
				srcTrackElement, srcSensor);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcTrackElement] = " + srcTrackElement + ", " + "[srcSensor] = "
					+ srcSensor + ".");
		}

		Object[] result2_bindingAndBlack = SensorMonitorsImpl
				.pattern_SensorMonitors_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, srcTrackElement, srcSensor);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcTrackElement] = " + srcTrackElement + ", " + "[srcSensor] = "
					+ srcSensor + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SensorMonitorsImpl.pattern_SensorMonitors_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SensorMonitorsImpl
					.pattern_SensorMonitors_0_4_collectelementstobetranslated_blackBBB(match, srcTrackElement,
							srcSensor);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcTrackElement] = " + srcTrackElement + ", " + "[srcSensor] = " + srcSensor + ".");
			}
			SensorMonitorsImpl.pattern_SensorMonitors_0_4_collectelementstobetranslated_greenBBBFF(match,
					srcTrackElement, srcSensor);
			//nothing EMoflonEdge srcSensor__srcTrackElement____monitors = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge srcTrackElement__srcSensor____monitoredBy = (EMoflonEdge) result4_green[4];

			Object[] result5_black = SensorMonitorsImpl
					.pattern_SensorMonitors_0_5_collectcontextelements_blackBBB(match, srcTrackElement, srcSensor);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcTrackElement] = " + srcTrackElement + ", " + "[srcSensor] = " + srcSensor + ".");
			}
			SensorMonitorsImpl.pattern_SensorMonitors_0_5_collectcontextelements_greenBBB(match, srcTrackElement,
					srcSensor);

			// 
			SensorMonitorsImpl.pattern_SensorMonitors_0_6_registerobjectstomatch_expressionBBBB(this, match,
					srcTrackElement, srcSensor);
			return SensorMonitorsImpl.pattern_SensorMonitors_0_7_expressionF();
		} else {
			return SensorMonitorsImpl.pattern_SensorMonitors_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SensorMonitorsImpl
				.pattern_SensorMonitors_1_1_performtransformation_bindingAndBlackFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TrackElement srcTrackElement = (TrackElement) result1_bindingAndBlack[0];
		Sensor srcSensor = (Sensor) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];

		Object[] result2_green = SensorMonitorsImpl.pattern_SensorMonitors_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SensorMonitorsImpl.pattern_SensorMonitors_1_3_bookkeepingforedges_blackBBB(ruleresult,
				srcTrackElement, srcSensor);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[srcTrackElement] = " + srcTrackElement + ", " + "[srcSensor] = " + srcSensor + ".");
		}
		SensorMonitorsImpl.pattern_SensorMonitors_1_3_bookkeepingforedges_greenBBBFF(ruleresult, srcTrackElement,
				srcSensor);
		//nothing EMoflonEdge srcSensor__srcTrackElement____monitors = (EMoflonEdge) result3_green[3];
		//nothing EMoflonEdge srcTrackElement__srcSensor____monitoredBy = (EMoflonEdge) result3_green[4];

		// 
		// 
		SensorMonitorsImpl.pattern_SensorMonitors_1_5_registerobjects_expressionBBBB(this, ruleresult, srcTrackElement,
				srcSensor);
		return SensorMonitorsImpl.pattern_SensorMonitors_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SensorMonitorsImpl
				.pattern_SensorMonitors_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SensorMonitorsImpl
				.pattern_SensorMonitors_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SensorMonitorsImpl.pattern_SensorMonitors_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TrackElement srcTrackElement = (TrackElement) result2_binding[0];
		Sensor srcSensor = (Sensor) result2_binding[1];
		for (Object[] result2_black : SensorMonitorsImpl.pattern_SensorMonitors_2_2_corematch_blackBBB(srcTrackElement,
				srcSensor, match)) {
			// ForEach 
			for (Object[] result3_black : SensorMonitorsImpl
					.pattern_SensorMonitors_2_3_findcontext_blackBB(srcTrackElement, srcSensor)) {
				Object[] result3_green = SensorMonitorsImpl
						.pattern_SensorMonitors_2_3_findcontext_greenBBFFF(srcTrackElement, srcSensor);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge srcSensor__srcTrackElement____monitors = (EMoflonEdge) result3_green[3];
				//nothing EMoflonEdge srcTrackElement__srcSensor____monitoredBy = (EMoflonEdge) result3_green[4];

				Object[] result4_bindingAndBlack = SensorMonitorsImpl
						.pattern_SensorMonitors_2_4_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch,
								srcTrackElement, srcSensor);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[srcTrackElement] = "
							+ srcTrackElement + ", " + "[srcSensor] = " + srcSensor + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SensorMonitorsImpl.pattern_SensorMonitors_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SensorMonitorsImpl
							.pattern_SensorMonitors_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SensorMonitorsImpl.pattern_SensorMonitors_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SensorMonitorsImpl.pattern_SensorMonitors_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TrackElement srcTrackElement, Sensor srcSensor) {
		match.registerObject("srcTrackElement", srcTrackElement);
		match.registerObject("srcSensor", srcSensor);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TrackElement srcTrackElement, Sensor srcSensor) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TrackElement srcTrackElement,
			Sensor srcSensor) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcTrackElement", srcTrackElement);
		isApplicableMatch.registerObject("srcSensor", srcSensor);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcTrackElement, EObject srcSensor) {
		ruleresult.registerObject("srcTrackElement", srcTrackElement);
		ruleresult.registerObject("srcSensor", srcSensor);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_23(EMoflonEdge _edge_monitors) {

		Object[] result1_bindingAndBlack = SensorMonitorsImpl
				.pattern_SensorMonitors_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SensorMonitorsImpl.pattern_SensorMonitors_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SensorMonitorsImpl
				.pattern_SensorMonitors_10_2_testcorematchandDECs_blackFFB(_edge_monitors)) {
			TrackElement srcTrackElement = (TrackElement) result2_black[0];
			Sensor srcSensor = (Sensor) result2_black[1];
			Object[] result2_green = SensorMonitorsImpl
					.pattern_SensorMonitors_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SensorMonitorsImpl
					.pattern_SensorMonitors_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							srcTrackElement, srcSensor)) {
				// 
				if (SensorMonitorsImpl
						.pattern_SensorMonitors_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = SensorMonitorsImpl
							.pattern_SensorMonitors_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SensorMonitorsImpl.pattern_SensorMonitors_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SensorMonitorsImpl.pattern_SensorMonitors_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SensorMonitors");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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
	public boolean checkDEC_FWD(TrackElement srcTrackElement, Sensor srcSensor) {// 
		Object[] result1_black = SensorMonitorsImpl.pattern_SensorMonitors_13_1_matchtggpattern_blackBB(srcTrackElement,
				srcSensor);
		if (result1_black != null) {
			return SensorMonitorsImpl.pattern_SensorMonitors_13_2_expressionF();
		} else {
			return SensorMonitorsImpl.pattern_SensorMonitors_13_3_expressionF();
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
		case RulesPackage.SENSOR_MONITORS___IS_APPROPRIATE_FWD__MATCH_TRACKELEMENT_SENSOR:
			return isAppropriate_FWD((Match) arguments.get(0), (TrackElement) arguments.get(1),
					(Sensor) arguments.get(2));
		case RulesPackage.SENSOR_MONITORS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SENSOR_MONITORS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SENSOR_MONITORS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TRACKELEMENT_SENSOR:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TrackElement) arguments.get(1),
					(Sensor) arguments.get(2));
			return null;
		case RulesPackage.SENSOR_MONITORS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TRACKELEMENT_SENSOR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TrackElement) arguments.get(1),
					(Sensor) arguments.get(2));
		case RulesPackage.SENSOR_MONITORS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SENSOR_MONITORS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TRACKELEMENT_SENSOR:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TrackElement) arguments.get(1),
					(Sensor) arguments.get(2));
		case RulesPackage.SENSOR_MONITORS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SENSOR_MONITORS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2));
			return null;
		case RulesPackage.SENSOR_MONITORS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SENSOR_MONITORS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_23((EMoflonEdge) arguments.get(0));
		case RulesPackage.SENSOR_MONITORS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SENSOR_MONITORS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SENSOR_MONITORS___CHECK_DEC_FWD__TRACKELEMENT_SENSOR:
			return checkDEC_FWD((TrackElement) arguments.get(0), (Sensor) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SensorMonitors_0_1_initialbindings_blackBBBB(SensorMonitors _this, Match match,
			TrackElement srcTrackElement, Sensor srcSensor) {
		return new Object[] { _this, match, srcTrackElement, srcSensor };
	}

	public static final Object[] pattern_SensorMonitors_0_2_SolveCSP_bindingFBBBB(SensorMonitors _this, Match match,
			TrackElement srcTrackElement, Sensor srcSensor) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcTrackElement, srcSensor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcTrackElement, srcSensor };
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SensorMonitors_0_2_SolveCSP_bindingAndBlackFBBBB(SensorMonitors _this,
			Match match, TrackElement srcTrackElement, Sensor srcSensor) {
		Object[] result_pattern_SensorMonitors_0_2_SolveCSP_binding = pattern_SensorMonitors_0_2_SolveCSP_bindingFBBBB(
				_this, match, srcTrackElement, srcSensor);
		if (result_pattern_SensorMonitors_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SensorMonitors_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SensorMonitors_0_2_SolveCSP_black = pattern_SensorMonitors_0_2_SolveCSP_blackB(csp);
			if (result_pattern_SensorMonitors_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcTrackElement, srcSensor };
			}
		}
		return null;
	}

	public static final boolean pattern_SensorMonitors_0_3_CheckCSP_expressionFBB(SensorMonitors _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SensorMonitors_0_4_collectelementstobetranslated_blackBBB(Match match,
			TrackElement srcTrackElement, Sensor srcSensor) {
		return new Object[] { match, srcTrackElement, srcSensor };
	}

	public static final Object[] pattern_SensorMonitors_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			TrackElement srcTrackElement, Sensor srcSensor) {
		EMoflonEdge srcSensor__srcTrackElement____monitors = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTrackElement__srcSensor____monitoredBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcSensor__srcTrackElement____monitors_name_prime = "monitors";
		String srcTrackElement__srcSensor____monitoredBy_name_prime = "monitoredBy";
		srcSensor__srcTrackElement____monitors.setSrc(srcSensor);
		srcSensor__srcTrackElement____monitors.setTrg(srcTrackElement);
		match.getToBeTranslatedEdges().add(srcSensor__srcTrackElement____monitors);
		srcTrackElement__srcSensor____monitoredBy.setSrc(srcTrackElement);
		srcTrackElement__srcSensor____monitoredBy.setTrg(srcSensor);
		match.getToBeTranslatedEdges().add(srcTrackElement__srcSensor____monitoredBy);
		srcSensor__srcTrackElement____monitors.setName(srcSensor__srcTrackElement____monitors_name_prime);
		srcTrackElement__srcSensor____monitoredBy.setName(srcTrackElement__srcSensor____monitoredBy_name_prime);
		return new Object[] { match, srcTrackElement, srcSensor, srcSensor__srcTrackElement____monitors,
				srcTrackElement__srcSensor____monitoredBy };
	}

	public static final Object[] pattern_SensorMonitors_0_5_collectcontextelements_blackBBB(Match match,
			TrackElement srcTrackElement, Sensor srcSensor) {
		return new Object[] { match, srcTrackElement, srcSensor };
	}

	public static final Object[] pattern_SensorMonitors_0_5_collectcontextelements_greenBBB(Match match,
			TrackElement srcTrackElement, Sensor srcSensor) {
		match.getContextNodes().add(srcTrackElement);
		match.getContextNodes().add(srcSensor);
		return new Object[] { match, srcTrackElement, srcSensor };
	}

	public static final void pattern_SensorMonitors_0_6_registerobjectstomatch_expressionBBBB(SensorMonitors _this,
			Match match, TrackElement srcTrackElement, Sensor srcSensor) {
		_this.registerObjectsToMatch_FWD(match, srcTrackElement, srcSensor);

	}

	public static final boolean pattern_SensorMonitors_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SensorMonitors_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SensorMonitors_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcTrackElement");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcSensor");
		EObject tmpSrcTrackElement = _localVariable_0;
		EObject tmpSrcSensor = _localVariable_1;
		if (tmpSrcTrackElement instanceof TrackElement) {
			TrackElement srcTrackElement = (TrackElement) tmpSrcTrackElement;
			if (tmpSrcSensor instanceof Sensor) {
				Sensor srcSensor = (Sensor) tmpSrcSensor;
				return new Object[] { srcTrackElement, srcSensor, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_1_1_performtransformation_blackBBFBB(
			TrackElement srcTrackElement, Sensor srcSensor, SensorMonitors _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcTrackElement, srcSensor, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_1_1_performtransformation_bindingAndBlackFFFBB(
			SensorMonitors _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SensorMonitors_1_1_performtransformation_binding = pattern_SensorMonitors_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_SensorMonitors_1_1_performtransformation_binding != null) {
			TrackElement srcTrackElement = (TrackElement) result_pattern_SensorMonitors_1_1_performtransformation_binding[0];
			Sensor srcSensor = (Sensor) result_pattern_SensorMonitors_1_1_performtransformation_binding[1];

			Object[] result_pattern_SensorMonitors_1_1_performtransformation_black = pattern_SensorMonitors_1_1_performtransformation_blackBBFBB(
					srcTrackElement, srcSensor, _this, isApplicableMatch);
			if (result_pattern_SensorMonitors_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SensorMonitors_1_1_performtransformation_black[2];

				return new Object[] { srcTrackElement, srcSensor, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_SensorMonitors_1_3_bookkeepingforedges_blackBBB(PerformRuleResult ruleresult,
			EObject srcTrackElement, EObject srcSensor) {
		if (!srcSensor.equals(srcTrackElement)) {
			return new Object[] { ruleresult, srcTrackElement, srcSensor };
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_1_3_bookkeepingforedges_greenBBBFF(PerformRuleResult ruleresult,
			EObject srcTrackElement, EObject srcSensor) {
		EMoflonEdge srcSensor__srcTrackElement____monitors = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTrackElement__srcSensor____monitoredBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SensorMonitors";
		String srcSensor__srcTrackElement____monitors_name_prime = "monitors";
		String srcTrackElement__srcSensor____monitoredBy_name_prime = "monitoredBy";
		srcSensor__srcTrackElement____monitors.setSrc(srcSensor);
		srcSensor__srcTrackElement____monitors.setTrg(srcTrackElement);
		ruleresult.getTranslatedEdges().add(srcSensor__srcTrackElement____monitors);
		srcTrackElement__srcSensor____monitoredBy.setSrc(srcTrackElement);
		srcTrackElement__srcSensor____monitoredBy.setTrg(srcSensor);
		ruleresult.getTranslatedEdges().add(srcTrackElement__srcSensor____monitoredBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcSensor__srcTrackElement____monitors.setName(srcSensor__srcTrackElement____monitors_name_prime);
		srcTrackElement__srcSensor____monitoredBy.setName(srcTrackElement__srcSensor____monitoredBy_name_prime);
		return new Object[] { ruleresult, srcTrackElement, srcSensor, srcSensor__srcTrackElement____monitors,
				srcTrackElement__srcSensor____monitoredBy };
	}

	public static final void pattern_SensorMonitors_1_5_registerobjects_expressionBBBB(SensorMonitors _this,
			PerformRuleResult ruleresult, EObject srcTrackElement, EObject srcSensor) {
		_this.registerObjects_FWD(ruleresult, srcTrackElement, srcSensor);

	}

	public static final PerformRuleResult pattern_SensorMonitors_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SensorMonitors_2_1_preparereturnvalue_bindingFB(SensorMonitors _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SensorMonitors _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_2_1_preparereturnvalue_bindingAndBlackFFB(
			SensorMonitors _this) {
		Object[] result_pattern_SensorMonitors_2_1_preparereturnvalue_binding = pattern_SensorMonitors_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SensorMonitors_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SensorMonitors_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SensorMonitors_2_1_preparereturnvalue_black = pattern_SensorMonitors_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SensorMonitors_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SensorMonitors_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SensorMonitors";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SensorMonitors_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcTrackElement");
		EObject _localVariable_1 = match.getObject("srcSensor");
		EObject tmpSrcTrackElement = _localVariable_0;
		EObject tmpSrcSensor = _localVariable_1;
		if (tmpSrcTrackElement instanceof TrackElement) {
			TrackElement srcTrackElement = (TrackElement) tmpSrcTrackElement;
			if (tmpSrcSensor instanceof Sensor) {
				Sensor srcSensor = (Sensor) tmpSrcSensor;
				return new Object[] { srcTrackElement, srcSensor, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SensorMonitors_2_2_corematch_blackBBB(TrackElement srcTrackElement,
			Sensor srcSensor, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcTrackElement, srcSensor, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_SensorMonitors_2_3_findcontext_blackBB(TrackElement srcTrackElement,
			Sensor srcSensor) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcSensor.getMonitors().contains(srcTrackElement)) {
			_result.add(new Object[] { srcTrackElement, srcSensor });
		}
		return _result;
	}

	public static final Object[] pattern_SensorMonitors_2_3_findcontext_greenBBFFF(TrackElement srcTrackElement,
			Sensor srcSensor) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcSensor__srcTrackElement____monitors = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcTrackElement__srcSensor____monitoredBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcSensor__srcTrackElement____monitors_name_prime = "monitors";
		String srcTrackElement__srcSensor____monitoredBy_name_prime = "monitoredBy";
		isApplicableMatch.getAllContextElements().add(srcTrackElement);
		isApplicableMatch.getAllContextElements().add(srcSensor);
		srcSensor__srcTrackElement____monitors.setSrc(srcSensor);
		srcSensor__srcTrackElement____monitors.setTrg(srcTrackElement);
		isApplicableMatch.getAllContextElements().add(srcSensor__srcTrackElement____monitors);
		srcTrackElement__srcSensor____monitoredBy.setSrc(srcTrackElement);
		srcTrackElement__srcSensor____monitoredBy.setTrg(srcSensor);
		isApplicableMatch.getAllContextElements().add(srcTrackElement__srcSensor____monitoredBy);
		srcSensor__srcTrackElement____monitors.setName(srcSensor__srcTrackElement____monitors_name_prime);
		srcTrackElement__srcSensor____monitoredBy.setName(srcTrackElement__srcSensor____monitoredBy_name_prime);
		return new Object[] { srcTrackElement, srcSensor, isApplicableMatch, srcSensor__srcTrackElement____monitors,
				srcTrackElement__srcSensor____monitoredBy };
	}

	public static final Object[] pattern_SensorMonitors_2_4_solveCSP_bindingFBBBB(SensorMonitors _this,
			IsApplicableMatch isApplicableMatch, TrackElement srcTrackElement, Sensor srcSensor) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcTrackElement, srcSensor);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcTrackElement, srcSensor };
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SensorMonitors_2_4_solveCSP_bindingAndBlackFBBBB(SensorMonitors _this,
			IsApplicableMatch isApplicableMatch, TrackElement srcTrackElement, Sensor srcSensor) {
		Object[] result_pattern_SensorMonitors_2_4_solveCSP_binding = pattern_SensorMonitors_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, srcTrackElement, srcSensor);
		if (result_pattern_SensorMonitors_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SensorMonitors_2_4_solveCSP_binding[0];

			Object[] result_pattern_SensorMonitors_2_4_solveCSP_black = pattern_SensorMonitors_2_4_solveCSP_blackB(csp);
			if (result_pattern_SensorMonitors_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcTrackElement, srcSensor };
			}
		}
		return null;
	}

	public static final boolean pattern_SensorMonitors_2_5_checkCSP_expressionFBB(SensorMonitors _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SensorMonitors_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SensorMonitors_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SensorMonitors";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SensorMonitors_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SensorMonitors_10_1_preparereturnvalue_bindingFB(SensorMonitors _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SensorMonitors _this) {
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

	public static final Object[] pattern_SensorMonitors_10_1_preparereturnvalue_bindingAndBlackFFBF(
			SensorMonitors _this) {
		Object[] result_pattern_SensorMonitors_10_1_preparereturnvalue_binding = pattern_SensorMonitors_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SensorMonitors_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SensorMonitors_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SensorMonitors_10_1_preparereturnvalue_black = pattern_SensorMonitors_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SensorMonitors_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SensorMonitors_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SensorMonitors_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SensorMonitors_10_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_monitors) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcSensor = _edge_monitors.getSrc();
		if (tmpSrcSensor instanceof Sensor) {
			Sensor srcSensor = (Sensor) tmpSrcSensor;
			EObject tmpSrcTrackElement = _edge_monitors.getTrg();
			if (tmpSrcTrackElement instanceof TrackElement) {
				TrackElement srcTrackElement = (TrackElement) tmpSrcTrackElement;
				if (srcSensor.getMonitors().contains(srcTrackElement)) {
					_result.add(new Object[] { srcTrackElement, srcSensor, _edge_monitors });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SensorMonitors_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SensorMonitors_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SensorMonitors _this, Match match, TrackElement srcTrackElement, Sensor srcSensor) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcTrackElement, srcSensor);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SensorMonitors_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SensorMonitors _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SensorMonitors_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SensorMonitors_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SensorMonitors_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SensorMonitors_13_1_matchtggpattern_blackBB(TrackElement srcTrackElement,
			Sensor srcSensor) {
		if (srcSensor.getMonitors().contains(srcTrackElement)) {
			return new Object[] { srcTrackElement, srcSensor };
		}
		return null;
	}

	public static final boolean pattern_SensorMonitors_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SensorMonitors_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SensorMonitorsImpl
