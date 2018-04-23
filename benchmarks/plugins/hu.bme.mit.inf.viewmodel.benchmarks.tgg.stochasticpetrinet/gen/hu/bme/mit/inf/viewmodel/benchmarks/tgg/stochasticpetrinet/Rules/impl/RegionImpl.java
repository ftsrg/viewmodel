/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.Region;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RegionImpl extends AbstractRuleImpl implements Region {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getRegion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion,
			RailwayContainer srcContainer) {

		Object[] result1_black = RegionImpl.pattern_Region_0_1_initialbindings_blackBBBB(this, match, srcRegion,
				srcContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[srcRegion] = " + srcRegion + ", " + "[srcContainer] = " + srcContainer + ".");
		}

		Object[] result2_bindingAndBlack = RegionImpl.pattern_Region_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
				srcRegion, srcContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[srcRegion] = " + srcRegion + ", " + "[srcContainer] = " + srcContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RegionImpl.pattern_Region_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RegionImpl.pattern_Region_0_4_collectelementstobetranslated_blackBBB(match,
					srcRegion, srcContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcRegion] = " + srcRegion + ", " + "[srcContainer] = " + srcContainer + ".");
			}
			RegionImpl.pattern_Region_0_4_collectelementstobetranslated_greenBBBF(match, srcRegion, srcContainer);
			//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result4_green[3];

			Object[] result5_black = RegionImpl.pattern_Region_0_5_collectcontextelements_blackBBB(match, srcRegion,
					srcContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcRegion] = " + srcRegion + ", " + "[srcContainer] = " + srcContainer + ".");
			}
			RegionImpl.pattern_Region_0_5_collectcontextelements_greenBB(match, srcContainer);

			// 
			RegionImpl.pattern_Region_0_6_registerobjectstomatch_expressionBBBB(this, match, srcRegion, srcContainer);
			return RegionImpl.pattern_Region_0_7_expressionF();
		} else {
			return RegionImpl.pattern_Region_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = RegionImpl
				.pattern_Region_1_1_performtransformation_bindingAndBlackFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) result1_bindingAndBlack[0];
		RailwayContainer srcContainer = (RailwayContainer) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];

		Object[] result2_black = RegionImpl.pattern_Region_1_2_collecttranslatedelements_blackB(srcRegion);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[srcRegion] = " + srcRegion + ".");
		}
		Object[] result2_green = RegionImpl.pattern_Region_1_2_collecttranslatedelements_greenFB(srcRegion);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RegionImpl.pattern_Region_1_3_bookkeepingforedges_blackBBB(ruleresult, srcRegion,
				srcContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[srcRegion] = " + srcRegion + ", " + "[srcContainer] = " + srcContainer + ".");
		}
		RegionImpl.pattern_Region_1_3_bookkeepingforedges_greenBBBF(ruleresult, srcRegion, srcContainer);
		//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result3_green[3];

		// 
		// 
		RegionImpl.pattern_Region_1_5_registerobjects_expressionBBBB(this, ruleresult, srcRegion, srcContainer);
		return RegionImpl.pattern_Region_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = RegionImpl.pattern_Region_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = RegionImpl.pattern_Region_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = RegionImpl.pattern_Region_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) result2_binding[0];
		RailwayContainer srcContainer = (RailwayContainer) result2_binding[1];
		for (Object[] result2_black : RegionImpl.pattern_Region_2_2_corematch_blackBBB(srcRegion, srcContainer,
				match)) {
			// ForEach 
			for (Object[] result3_black : RegionImpl.pattern_Region_2_3_findcontext_blackBB(srcRegion, srcContainer)) {
				Object[] result3_green = RegionImpl.pattern_Region_2_3_findcontext_greenBBFF(srcRegion, srcContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge srcContainer__srcRegion____regions = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = RegionImpl.pattern_Region_2_4_solveCSP_bindingAndBlackFBBBB(this,
						isApplicableMatch, srcRegion, srcContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[srcRegion] = " + srcRegion + ", "
							+ "[srcContainer] = " + srcContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (RegionImpl.pattern_Region_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = RegionImpl.pattern_Region_2_6_addmatchtoruleresult_blackBB(ruleresult,
							isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					RegionImpl.pattern_Region_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return RegionImpl.pattern_Region_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		match.registerObject("srcRegion", srcRegion);
		match.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {// Create CSP
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("srcRegion", srcRegion);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcRegion, EObject srcContainer) {
		ruleresult.registerObject("srcRegion", srcRegion);
		ruleresult.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcRegion").eClass())
				.equals("railway.Region.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_6(EMoflonEdge _edge_regions) {

		Object[] result1_bindingAndBlack = RegionImpl.pattern_Region_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = RegionImpl.pattern_Region_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : RegionImpl.pattern_Region_10_2_testcorematchandDECs_blackFFB(_edge_regions)) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) result2_black[0];
			RailwayContainer srcContainer = (RailwayContainer) result2_black[1];
			Object[] result2_green = RegionImpl.pattern_Region_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RegionImpl.pattern_Region_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
					srcRegion, srcContainer)) {
				// 
				if (RegionImpl.pattern_Region_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
						match)) {

					Object[] result5_black = RegionImpl.pattern_Region_10_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					RegionImpl.pattern_Region_10_5_Addmatchtoruleresult_greenBBBB(match, __performOperation, __result,
							isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return RegionImpl.pattern_Region_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Region");
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
	public boolean checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion,
			RailwayContainer srcContainer) {// 
		Object[] result1_black = RegionImpl.pattern_Region_13_1_matchtggpattern_blackBB(srcRegion, srcContainer);
		if (result1_black != null) {
			return RegionImpl.pattern_Region_13_2_expressionF();
		} else {
			return RegionImpl.pattern_Region_13_3_expressionF();
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
		case RulesPackage.REGION___IS_APPROPRIATE_FWD__MATCH_REGION_RAILWAYCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) arguments.get(1),
					(RailwayContainer) arguments.get(2));
		case RulesPackage.REGION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REGION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REGION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_REGION_RAILWAYCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) arguments.get(1),
					(RailwayContainer) arguments.get(2));
			return null;
		case RulesPackage.REGION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_REGION_RAILWAYCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) arguments.get(1),
					(RailwayContainer) arguments.get(2));
		case RulesPackage.REGION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REGION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_REGION_RAILWAYCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) arguments.get(1),
					(RailwayContainer) arguments.get(2));
		case RulesPackage.REGION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REGION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2));
			return null;
		case RulesPackage.REGION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REGION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.REGION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REGION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REGION___CHECK_DEC_FWD__REGION_RAILWAYCONTAINER:
			return checkDEC_FWD((hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) arguments.get(0),
					(RailwayContainer) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Region_0_1_initialbindings_blackBBBB(Region _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		return new Object[] { _this, match, srcRegion, srcContainer };
	}

	public static final Object[] pattern_Region_0_2_SolveCSP_bindingFBBBB(Region _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcRegion, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcRegion, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_Region_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Region_0_2_SolveCSP_bindingAndBlackFBBBB(Region _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		Object[] result_pattern_Region_0_2_SolveCSP_binding = pattern_Region_0_2_SolveCSP_bindingFBBBB(_this, match,
				srcRegion, srcContainer);
		if (result_pattern_Region_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Region_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Region_0_2_SolveCSP_black = pattern_Region_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Region_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcRegion, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_Region_0_3_CheckCSP_expressionFBB(Region _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Region_0_4_collectelementstobetranslated_blackBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		return new Object[] { match, srcRegion, srcContainer };
	}

	public static final Object[] pattern_Region_0_4_collectelementstobetranslated_greenBBBF(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(srcRegion);
		String srcContainer__srcRegion____regions_name_prime = "regions";
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		match.getToBeTranslatedEdges().add(srcContainer__srcRegion____regions);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		return new Object[] { match, srcRegion, srcContainer, srcContainer__srcRegion____regions };
	}

	public static final Object[] pattern_Region_0_5_collectcontextelements_blackBBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		return new Object[] { match, srcRegion, srcContainer };
	}

	public static final Object[] pattern_Region_0_5_collectcontextelements_greenBB(Match match,
			RailwayContainer srcContainer) {
		match.getContextNodes().add(srcContainer);
		return new Object[] { match, srcContainer };
	}

	public static final void pattern_Region_0_6_registerobjectstomatch_expressionBBBB(Region _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		_this.registerObjectsToMatch_FWD(match, srcRegion, srcContainer);

	}

	public static final boolean pattern_Region_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Region_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Region_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcRegion");
		EObject _localVariable_1 = isApplicableMatch.getObject("srcContainer");
		EObject tmpSrcRegion = _localVariable_0;
		EObject tmpSrcContainer = _localVariable_1;
		if (tmpSrcRegion instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) tmpSrcRegion;
			if (tmpSrcContainer instanceof RailwayContainer) {
				RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
				return new Object[] { srcRegion, srcContainer, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Region_1_1_performtransformation_blackBBFBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer,
			Region _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcRegion, srcContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Region_1_1_performtransformation_bindingAndBlackFFFBB(Region _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Region_1_1_performtransformation_binding = pattern_Region_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_Region_1_1_performtransformation_binding != null) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) result_pattern_Region_1_1_performtransformation_binding[0];
			RailwayContainer srcContainer = (RailwayContainer) result_pattern_Region_1_1_performtransformation_binding[1];

			Object[] result_pattern_Region_1_1_performtransformation_black = pattern_Region_1_1_performtransformation_blackBBFBB(
					srcRegion, srcContainer, _this, isApplicableMatch);
			if (result_pattern_Region_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Region_1_1_performtransformation_black[2];

				return new Object[] { srcRegion, srcContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Region_1_2_collecttranslatedelements_blackB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion) {
		return new Object[] { srcRegion };
	}

	public static final Object[] pattern_Region_1_2_collecttranslatedelements_greenFB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcRegion);
		return new Object[] { ruleresult, srcRegion };
	}

	public static final Object[] pattern_Region_1_3_bookkeepingforedges_blackBBB(PerformRuleResult ruleresult,
			EObject srcRegion, EObject srcContainer) {
		if (!srcContainer.equals(srcRegion)) {
			return new Object[] { ruleresult, srcRegion, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_Region_1_3_bookkeepingforedges_greenBBBF(PerformRuleResult ruleresult,
			EObject srcRegion, EObject srcContainer) {
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Region";
		String srcContainer__srcRegion____regions_name_prime = "regions";
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		ruleresult.getTranslatedEdges().add(srcContainer__srcRegion____regions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		return new Object[] { ruleresult, srcRegion, srcContainer, srcContainer__srcRegion____regions };
	}

	public static final void pattern_Region_1_5_registerobjects_expressionBBBB(Region _this,
			PerformRuleResult ruleresult, EObject srcRegion, EObject srcContainer) {
		_this.registerObjects_FWD(ruleresult, srcRegion, srcContainer);

	}

	public static final PerformRuleResult pattern_Region_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Region_2_1_preparereturnvalue_bindingFB(Region _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Region_2_1_preparereturnvalue_blackFBB(EClass eClass, Region _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Region_2_1_preparereturnvalue_bindingAndBlackFFB(Region _this) {
		Object[] result_pattern_Region_2_1_preparereturnvalue_binding = pattern_Region_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Region_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Region_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Region_2_1_preparereturnvalue_black = pattern_Region_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Region_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Region_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Region_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Region";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Region_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcRegion");
		EObject _localVariable_1 = match.getObject("srcContainer");
		EObject tmpSrcRegion = _localVariable_0;
		EObject tmpSrcContainer = _localVariable_1;
		if (tmpSrcRegion instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) tmpSrcRegion;
			if (tmpSrcContainer instanceof RailwayContainer) {
				RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
				return new Object[] { srcRegion, srcContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Region_2_2_corematch_blackBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcRegion, srcContainer, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_Region_2_3_findcontext_blackBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (srcContainer.getRegions().contains(srcRegion)) {
			_result.add(new Object[] { srcRegion, srcContainer });
		}
		return _result;
	}

	public static final Object[] pattern_Region_2_3_findcontext_greenBBFF(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge srcContainer__srcRegion____regions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String srcContainer__srcRegion____regions_name_prime = "regions";
		isApplicableMatch.getAllContextElements().add(srcRegion);
		isApplicableMatch.getAllContextElements().add(srcContainer);
		srcContainer__srcRegion____regions.setSrc(srcContainer);
		srcContainer__srcRegion____regions.setTrg(srcRegion);
		isApplicableMatch.getAllContextElements().add(srcContainer__srcRegion____regions);
		srcContainer__srcRegion____regions.setName(srcContainer__srcRegion____regions_name_prime);
		return new Object[] { srcRegion, srcContainer, isApplicableMatch, srcContainer__srcRegion____regions };
	}

	public static final Object[] pattern_Region_2_4_solveCSP_bindingFBBBB(Region _this,
			IsApplicableMatch isApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion,
			RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcRegion, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcRegion, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_Region_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Region_2_4_solveCSP_bindingAndBlackFBBBB(Region _this,
			IsApplicableMatch isApplicableMatch, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion,
			RailwayContainer srcContainer) {
		Object[] result_pattern_Region_2_4_solveCSP_binding = pattern_Region_2_4_solveCSP_bindingFBBBB(_this,
				isApplicableMatch, srcRegion, srcContainer);
		if (result_pattern_Region_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Region_2_4_solveCSP_binding[0];

			Object[] result_pattern_Region_2_4_solveCSP_black = pattern_Region_2_4_solveCSP_blackB(csp);
			if (result_pattern_Region_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcRegion, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_Region_2_5_checkCSP_expressionFBB(Region _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Region_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Region_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Region";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Region_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Region_10_1_preparereturnvalue_bindingFB(Region _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Region_10_1_preparereturnvalue_blackFBBF(EClass __eClass, Region _this) {
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

	public static final Object[] pattern_Region_10_1_preparereturnvalue_bindingAndBlackFFBF(Region _this) {
		Object[] result_pattern_Region_10_1_preparereturnvalue_binding = pattern_Region_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Region_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Region_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Region_10_1_preparereturnvalue_black = pattern_Region_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Region_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Region_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Region_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Region_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Region_10_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_regions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpSrcContainer = _edge_regions.getSrc();
		if (tmpSrcContainer instanceof RailwayContainer) {
			RailwayContainer srcContainer = (RailwayContainer) tmpSrcContainer;
			EObject tmpSrcRegion = _edge_regions.getTrg();
			if (tmpSrcRegion instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) {
				hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region) tmpSrcRegion;
				if (srcContainer.getRegions().contains(srcRegion)) {
					_result.add(new Object[] { srcRegion, srcContainer, _edge_regions });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Region_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Region_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			Region _this, Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion,
			RailwayContainer srcContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcRegion, srcContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Region_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Region _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Region_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Region_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Region_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Region_13_1_matchtggpattern_blackBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.Region srcRegion, RailwayContainer srcContainer) {
		if (srcContainer.getRegions().contains(srcRegion)) {
			return new Object[] { srcRegion, srcContainer };
		}
		return null;
	}

	public static final boolean pattern_Region_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Region_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RegionImpl
