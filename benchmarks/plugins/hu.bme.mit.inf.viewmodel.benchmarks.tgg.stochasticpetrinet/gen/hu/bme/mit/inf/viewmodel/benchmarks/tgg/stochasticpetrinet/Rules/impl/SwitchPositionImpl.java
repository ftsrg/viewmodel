/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Switch;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.SwitchPosition;

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
 * An implementation of the model object '<em><b>Switch Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SwitchPositionImpl extends AbstractRuleImpl implements SwitchPosition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSwitchPosition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {

		Object[] result1_black = SwitchPositionImpl.pattern_SwitchPosition_0_1_initialbindings_blackBBBB(this, match,
				srcSwitchPosition, srcSwitch);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", "
					+ "[srcSwitch] = " + srcSwitch + ".");
		}

		Object[] result2_bindingAndBlack = SwitchPositionImpl
				.pattern_SwitchPosition_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, srcSwitchPosition, srcSwitch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", "
					+ "[srcSwitch] = " + srcSwitch + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SwitchPositionImpl.pattern_SwitchPosition_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SwitchPositionImpl
					.pattern_SwitchPosition_0_4_collectelementstobetranslated_blackBBB(match, srcSwitchPosition,
							srcSwitch);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSwitchPosition] = " + srcSwitchPosition + ", " + "[srcSwitch] = " + srcSwitch + ".");
			}
			SwitchPositionImpl.pattern_SwitchPosition_0_4_collectelementstobetranslated_greenBBBFF(match,
					srcSwitchPosition, srcSwitch);
			//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result4_green[4];

			Object[] result5_black = SwitchPositionImpl
					.pattern_SwitchPosition_0_5_collectcontextelements_blackBBB(match, srcSwitchPosition, srcSwitch);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcSwitchPosition] = " + srcSwitchPosition + ", " + "[srcSwitch] = " + srcSwitch + ".");
			}
			SwitchPositionImpl.pattern_SwitchPosition_0_5_collectcontextelements_greenBB(match, srcSwitch);

			// 
			SwitchPositionImpl.pattern_SwitchPosition_0_6_registerobjectstomatch_expressionBBBB(this, match,
					srcSwitchPosition, srcSwitch);
			return SwitchPositionImpl.pattern_SwitchPosition_0_7_expressionF();
		} else {
			return SwitchPositionImpl.pattern_SwitchPosition_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SwitchPositionImpl
				.pattern_SwitchPosition_1_1_performtransformation_bindingAndBlackFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) result1_bindingAndBlack[0];
		Switch srcSwitch = (Switch) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];

		Object[] result2_black = SwitchPositionImpl
				.pattern_SwitchPosition_1_2_collecttranslatedelements_blackB(srcSwitchPosition);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[srcSwitchPosition] = " + srcSwitchPosition + ".");
		}
		Object[] result2_green = SwitchPositionImpl
				.pattern_SwitchPosition_1_2_collecttranslatedelements_greenFB(srcSwitchPosition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SwitchPositionImpl.pattern_SwitchPosition_1_3_bookkeepingforedges_blackBBB(ruleresult,
				srcSwitchPosition, srcSwitch);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[srcSwitchPosition] = " + srcSwitchPosition + ", " + "[srcSwitch] = " + srcSwitch + ".");
		}
		SwitchPositionImpl.pattern_SwitchPosition_1_3_bookkeepingforedges_greenBBBFF(ruleresult, srcSwitchPosition,
				srcSwitch);
		//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result3_green[3];
		//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result3_green[4];

		// 
		// 
		SwitchPositionImpl.pattern_SwitchPosition_1_5_registerobjects_expressionBBBB(this, ruleresult,
				srcSwitchPosition, srcSwitch);
		return SwitchPositionImpl.pattern_SwitchPosition_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SwitchPositionImpl
				.pattern_SwitchPosition_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SwitchPositionImpl
				.pattern_SwitchPosition_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SwitchPositionImpl.pattern_SwitchPosition_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) result2_binding[0];
		Switch srcSwitch = (Switch) result2_binding[1];
		for (Object[] result2_black : SwitchPositionImpl
				.pattern_SwitchPosition_2_2_corematch_blackBBB(srcSwitchPosition, srcSwitch, match)) {
			// ForEach 
			for (Object[] result3_black : SwitchPositionImpl
					.pattern_SwitchPosition_2_3_findcontext_blackBB(srcSwitchPosition, srcSwitch)) {
				Object[] result3_green = SwitchPositionImpl
						.pattern_SwitchPosition_2_3_findcontext_greenBBFFF(srcSwitchPosition, srcSwitch);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge srcSwitch__srcSwitchPosition____positions = (EMoflonEdge) result3_green[3];
				//nothing EMoflonEdge srcSwitchPosition__srcSwitch____target = (EMoflonEdge) result3_green[4];

				Object[] result4_bindingAndBlack = SwitchPositionImpl
						.pattern_SwitchPosition_2_4_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch,
								srcSwitchPosition, srcSwitch);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[srcSwitchPosition] = "
							+ srcSwitchPosition + ", " + "[srcSwitch] = " + srcSwitch + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SwitchPositionImpl.pattern_SwitchPosition_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SwitchPositionImpl
							.pattern_SwitchPosition_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SwitchPositionImpl.pattern_SwitchPosition_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SwitchPositionImpl.pattern_SwitchPosition_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		match.registerObject("srcSwitchPosition", srcSwitchPosition);
		match.registerObject("srcSwitch", srcSwitch);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {// Create CSP
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcSwitchPosition", srcSwitchPosition);
		isApplicableMatch.registerObject("srcSwitch", srcSwitch);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcSwitchPosition, EObject srcSwitch) {
		ruleresult.registerObject("srcSwitchPosition", srcSwitchPosition);
		ruleresult.registerObject("srcSwitch", srcSwitch);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcSwitchPosition").eClass())
				.equals("railway.SwitchPosition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_205(EMoflonEdge _edge_positions) {

		Object[] result1_bindingAndBlack = SwitchPositionImpl
				.pattern_SwitchPosition_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SwitchPositionImpl.pattern_SwitchPosition_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SwitchPositionImpl
				.pattern_SwitchPosition_10_2_testcorematchandDECs_blackFFB(_edge_positions)) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) result2_black[0];
			Switch srcSwitch = (Switch) result2_black[1];
			Object[] result2_green = SwitchPositionImpl
					.pattern_SwitchPosition_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SwitchPositionImpl
					.pattern_SwitchPosition_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							srcSwitchPosition, srcSwitch)) {
				// 
				if (SwitchPositionImpl
						.pattern_SwitchPosition_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = SwitchPositionImpl
							.pattern_SwitchPosition_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SwitchPositionImpl.pattern_SwitchPosition_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SwitchPositionImpl.pattern_SwitchPosition_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SwitchPosition");
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
	public boolean checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition,
			Switch srcSwitch) {// 
		Object[] result1_black = SwitchPositionImpl
				.pattern_SwitchPosition_13_1_matchtggpattern_blackBB(srcSwitchPosition, srcSwitch);
		if (result1_black != null) {
			return SwitchPositionImpl.pattern_SwitchPosition_13_2_expressionF();
		} else {
			return SwitchPositionImpl.pattern_SwitchPosition_13_3_expressionF();
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
		case RulesPackage.SWITCH_POSITION___IS_APPROPRIATE_FWD__MATCH_SWITCHPOSITION_SWITCH:
			return isAppropriate_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) arguments.get(1),
					(Switch) arguments.get(2));
		case RulesPackage.SWITCH_POSITION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SWITCH_POSITION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SWITCH_POSITION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SWITCHPOSITION_SWITCH:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) arguments.get(1),
					(Switch) arguments.get(2));
			return null;
		case RulesPackage.SWITCH_POSITION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SWITCHPOSITION_SWITCH:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) arguments.get(1),
					(Switch) arguments.get(2));
		case RulesPackage.SWITCH_POSITION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SWITCH_POSITION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SWITCHPOSITION_SWITCH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) arguments.get(1),
					(Switch) arguments.get(2));
		case RulesPackage.SWITCH_POSITION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SWITCH_POSITION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2));
			return null;
		case RulesPackage.SWITCH_POSITION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SWITCH_POSITION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_205__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_205((EMoflonEdge) arguments.get(0));
		case RulesPackage.SWITCH_POSITION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SWITCH_POSITION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SWITCH_POSITION___CHECK_DEC_FWD__SWITCHPOSITION_SWITCH:
			return checkDEC_FWD((hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) arguments.get(0),
					(Switch) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SwitchPosition_0_1_initialbindings_blackBBBB(SwitchPosition _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		return new Object[] { _this, match, srcSwitchPosition, srcSwitch };
	}

	public static final Object[] pattern_SwitchPosition_0_2_SolveCSP_bindingFBBBB(SwitchPosition _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcSwitchPosition, srcSwitch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcSwitchPosition, srcSwitch };
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SwitchPosition_0_2_SolveCSP_bindingAndBlackFBBBB(SwitchPosition _this,
			Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition,
			Switch srcSwitch) {
		Object[] result_pattern_SwitchPosition_0_2_SolveCSP_binding = pattern_SwitchPosition_0_2_SolveCSP_bindingFBBBB(
				_this, match, srcSwitchPosition, srcSwitch);
		if (result_pattern_SwitchPosition_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SwitchPosition_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SwitchPosition_0_2_SolveCSP_black = pattern_SwitchPosition_0_2_SolveCSP_blackB(csp);
			if (result_pattern_SwitchPosition_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcSwitchPosition, srcSwitch };
			}
		}
		return null;
	}

	public static final boolean pattern_SwitchPosition_0_3_CheckCSP_expressionFBB(SwitchPosition _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SwitchPosition_0_4_collectelementstobetranslated_blackBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		return new Object[] { match, srcSwitchPosition, srcSwitch };
	}

	public static final Object[] pattern_SwitchPosition_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcSwitchPosition);
		String srcSwitch__srcSwitchPosition____positions_name_prime = "positions";
		String srcSwitchPosition__srcSwitch____target_name_prime = "target";
		srcSwitch__srcSwitchPosition____positions.setSrc(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setTrg(srcSwitchPosition);
		match.getToBeTranslatedEdges().add(srcSwitch__srcSwitchPosition____positions);
		srcSwitchPosition__srcSwitch____target.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcSwitch____target.setTrg(srcSwitch);
		match.getToBeTranslatedEdges().add(srcSwitchPosition__srcSwitch____target);
		srcSwitch__srcSwitchPosition____positions.setName(srcSwitch__srcSwitchPosition____positions_name_prime);
		srcSwitchPosition__srcSwitch____target.setName(srcSwitchPosition__srcSwitch____target_name_prime);
		return new Object[] { match, srcSwitchPosition, srcSwitch, srcSwitch__srcSwitchPosition____positions,
				srcSwitchPosition__srcSwitch____target };
	}

	public static final Object[] pattern_SwitchPosition_0_5_collectcontextelements_blackBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		return new Object[] { match, srcSwitchPosition, srcSwitch };
	}

	public static final Object[] pattern_SwitchPosition_0_5_collectcontextelements_greenBB(Match match,
			Switch srcSwitch) {
		match.getContextNodes().add(srcSwitch);
		return new Object[] { match, srcSwitch };
	}

	public static final void pattern_SwitchPosition_0_6_registerobjectstomatch_expressionBBBB(SwitchPosition _this,
			Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition,
			Switch srcSwitch) {
		_this.registerObjectsToMatch_FWD(match, srcSwitchPosition, srcSwitch);

	}

	public static final boolean pattern_SwitchPosition_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SwitchPosition_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SwitchPosition_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcSwitchPosition");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcSwitch");
		EObject tmpSrcSwitchPosition = _localVariable_0;
		EObject tmpSrcSwitch = _localVariable_1;
		if (tmpSrcSwitchPosition instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) tmpSrcSwitchPosition;
			if (tmpSrcSwitch instanceof Switch) {
				Switch srcSwitch = (Switch) tmpSrcSwitch;
				return new Object[] { srcSwitchPosition, srcSwitch, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_1_1_performtransformation_blackBBFBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch,
			SwitchPosition _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcSwitchPosition, srcSwitch, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_1_1_performtransformation_bindingAndBlackFFFBB(
			SwitchPosition _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SwitchPosition_1_1_performtransformation_binding = pattern_SwitchPosition_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_SwitchPosition_1_1_performtransformation_binding != null) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) result_pattern_SwitchPosition_1_1_performtransformation_binding[0];
			Switch srcSwitch = (Switch) result_pattern_SwitchPosition_1_1_performtransformation_binding[1];

			Object[] result_pattern_SwitchPosition_1_1_performtransformation_black = pattern_SwitchPosition_1_1_performtransformation_blackBBFBB(
					srcSwitchPosition, srcSwitch, _this, isApplicableMatch);
			if (result_pattern_SwitchPosition_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SwitchPosition_1_1_performtransformation_black[2];

				return new Object[] { srcSwitchPosition, srcSwitch, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_1_2_collecttranslatedelements_blackB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition) {
		return new Object[] { srcSwitchPosition };
	}

	public static final Object[] pattern_SwitchPosition_1_2_collecttranslatedelements_greenFB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcSwitchPosition);
		return new Object[] { ruleresult, srcSwitchPosition };
	}

	public static final Object[] pattern_SwitchPosition_1_3_bookkeepingforedges_blackBBB(PerformRuleResult ruleresult,
			EObject srcSwitchPosition, EObject srcSwitch) {
		if (!srcSwitch.equals(srcSwitchPosition)) {
			return new Object[] { ruleresult, srcSwitchPosition, srcSwitch };
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_1_3_bookkeepingforedges_greenBBBFF(PerformRuleResult ruleresult,
			EObject srcSwitchPosition, EObject srcSwitch) {
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SwitchPosition";
		String srcSwitch__srcSwitchPosition____positions_name_prime = "positions";
		String srcSwitchPosition__srcSwitch____target_name_prime = "target";
		srcSwitch__srcSwitchPosition____positions.setSrc(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setTrg(srcSwitchPosition);
		ruleresult.getTranslatedEdges().add(srcSwitch__srcSwitchPosition____positions);
		srcSwitchPosition__srcSwitch____target.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcSwitch____target.setTrg(srcSwitch);
		ruleresult.getTranslatedEdges().add(srcSwitchPosition__srcSwitch____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcSwitch__srcSwitchPosition____positions.setName(srcSwitch__srcSwitchPosition____positions_name_prime);
		srcSwitchPosition__srcSwitch____target.setName(srcSwitchPosition__srcSwitch____target_name_prime);
		return new Object[] { ruleresult, srcSwitchPosition, srcSwitch, srcSwitch__srcSwitchPosition____positions,
				srcSwitchPosition__srcSwitch____target };
	}

	public static final void pattern_SwitchPosition_1_5_registerobjects_expressionBBBB(SwitchPosition _this,
			PerformRuleResult ruleresult, EObject srcSwitchPosition, EObject srcSwitch) {
		_this.registerObjects_FWD(ruleresult, srcSwitchPosition, srcSwitch);

	}

	public static final PerformRuleResult pattern_SwitchPosition_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SwitchPosition_2_1_preparereturnvalue_bindingFB(SwitchPosition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SwitchPosition _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_2_1_preparereturnvalue_bindingAndBlackFFB(
			SwitchPosition _this) {
		Object[] result_pattern_SwitchPosition_2_1_preparereturnvalue_binding = pattern_SwitchPosition_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SwitchPosition_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SwitchPosition_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SwitchPosition_2_1_preparereturnvalue_black = pattern_SwitchPosition_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SwitchPosition_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SwitchPosition_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SwitchPosition";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SwitchPosition_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcSwitchPosition");
		EObject _localVariable_1 = match.getObject("srcSwitch");
		EObject tmpSrcSwitchPosition = _localVariable_0;
		EObject tmpSrcSwitch = _localVariable_1;
		if (tmpSrcSwitchPosition instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) tmpSrcSwitchPosition;
			if (tmpSrcSwitch instanceof Switch) {
				Switch srcSwitch = (Switch) tmpSrcSwitch;
				return new Object[] { srcSwitchPosition, srcSwitch, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SwitchPosition_2_2_corematch_blackBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcSwitchPosition, srcSwitch, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_SwitchPosition_2_3_findcontext_blackBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcSwitch.getPositions().contains(srcSwitchPosition)) {
			_result.add(new Object[] { srcSwitchPosition, srcSwitch });
		}
		return _result;
	}

	public static final Object[] pattern_SwitchPosition_2_3_findcontext_greenBBFFF(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcSwitch__srcSwitchPosition____positions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge srcSwitchPosition__srcSwitch____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcSwitch__srcSwitchPosition____positions_name_prime = "positions";
		String srcSwitchPosition__srcSwitch____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setSrc(srcSwitch);
		srcSwitch__srcSwitchPosition____positions.setTrg(srcSwitchPosition);
		isApplicableMatch.getAllContextElements().add(srcSwitch__srcSwitchPosition____positions);
		srcSwitchPosition__srcSwitch____target.setSrc(srcSwitchPosition);
		srcSwitchPosition__srcSwitch____target.setTrg(srcSwitch);
		isApplicableMatch.getAllContextElements().add(srcSwitchPosition__srcSwitch____target);
		srcSwitch__srcSwitchPosition____positions.setName(srcSwitch__srcSwitchPosition____positions_name_prime);
		srcSwitchPosition__srcSwitch____target.setName(srcSwitchPosition__srcSwitch____target_name_prime);
		return new Object[] { srcSwitchPosition, srcSwitch, isApplicableMatch,
				srcSwitch__srcSwitchPosition____positions, srcSwitchPosition__srcSwitch____target };
	}

	public static final Object[] pattern_SwitchPosition_2_4_solveCSP_bindingFBBBB(SwitchPosition _this,
			IsApplicableMatch isApplicableMatch,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcSwitchPosition, srcSwitch);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcSwitchPosition, srcSwitch };
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SwitchPosition_2_4_solveCSP_bindingAndBlackFBBBB(SwitchPosition _this,
			IsApplicableMatch isApplicableMatch,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		Object[] result_pattern_SwitchPosition_2_4_solveCSP_binding = pattern_SwitchPosition_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, srcSwitchPosition, srcSwitch);
		if (result_pattern_SwitchPosition_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SwitchPosition_2_4_solveCSP_binding[0];

			Object[] result_pattern_SwitchPosition_2_4_solveCSP_black = pattern_SwitchPosition_2_4_solveCSP_blackB(csp);
			if (result_pattern_SwitchPosition_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcSwitchPosition, srcSwitch };
			}
		}
		return null;
	}

	public static final boolean pattern_SwitchPosition_2_5_checkCSP_expressionFBB(SwitchPosition _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SwitchPosition_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SwitchPosition_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SwitchPosition";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SwitchPosition_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SwitchPosition_10_1_preparereturnvalue_bindingFB(SwitchPosition _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SwitchPosition _this) {
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

	public static final Object[] pattern_SwitchPosition_10_1_preparereturnvalue_bindingAndBlackFFBF(
			SwitchPosition _this) {
		Object[] result_pattern_SwitchPosition_10_1_preparereturnvalue_binding = pattern_SwitchPosition_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SwitchPosition_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SwitchPosition_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SwitchPosition_10_1_preparereturnvalue_black = pattern_SwitchPosition_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SwitchPosition_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SwitchPosition_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SwitchPosition_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SwitchPosition_10_2_testcorematchandDECs_black_nac_0BB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		Switch __DEC_srcSwitchPosition_positions_480086 = srcSwitchPosition.getTarget();
		if (__DEC_srcSwitchPosition_positions_480086 != null) {
			if (!srcSwitch.equals(__DEC_srcSwitchPosition_positions_480086)) {
				return new Object[] { srcSwitchPosition, srcSwitch };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_SwitchPosition_10_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_positions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcSwitch = _edge_positions.getSrc();
		if (tmpSrcSwitch instanceof Switch) {
			Switch srcSwitch = (Switch) tmpSrcSwitch;
			EObject tmpSrcSwitchPosition = _edge_positions.getTrg();
			if (tmpSrcSwitchPosition instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition) tmpSrcSwitchPosition;
				if (srcSwitch.getPositions().contains(srcSwitchPosition)) {
					if (pattern_SwitchPosition_10_2_testcorematchandDECs_black_nac_0BB(srcSwitchPosition,
							srcSwitch) == null) {
						_result.add(new Object[] { srcSwitchPosition, srcSwitch, _edge_positions });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SwitchPosition_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SwitchPosition_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SwitchPosition _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcSwitchPosition, srcSwitch);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SwitchPosition_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SwitchPosition _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SwitchPosition_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SwitchPosition_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SwitchPosition_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SwitchPosition_13_1_matchtggpattern_black_nac_0BB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		Switch __DEC_srcSwitchPosition_positions_861108 = srcSwitchPosition.getTarget();
		if (__DEC_srcSwitchPosition_positions_861108 != null) {
			if (!srcSwitch.equals(__DEC_srcSwitchPosition_positions_861108)) {
				return new Object[] { srcSwitchPosition, srcSwitch };
			}
		}

		return null;
	}

	public static final Object[] pattern_SwitchPosition_13_1_matchtggpattern_blackBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.SwitchPosition srcSwitchPosition, Switch srcSwitch) {
		if (srcSwitch.getPositions().contains(srcSwitchPosition)) {
			if (pattern_SwitchPosition_13_1_matchtggpattern_black_nac_0BB(srcSwitchPosition, srcSwitch) == null) {
				return new Object[] { srcSwitchPosition, srcSwitch };
			}
		}
		return null;
	}

	public static final boolean pattern_SwitchPosition_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SwitchPosition_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SwitchPositionImpl
