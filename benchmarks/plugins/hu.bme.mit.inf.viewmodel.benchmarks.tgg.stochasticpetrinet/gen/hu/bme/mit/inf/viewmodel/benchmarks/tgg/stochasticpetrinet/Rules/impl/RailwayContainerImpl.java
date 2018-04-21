/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.impl;

import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.PetriNet;
import hu.bme.mit.inf.viewmodel.benchmarks.models.stochasticpetrinet.StochasticPetriNetFactory;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.RailwayContainerToPetriNet;

import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RailwayContainer;
import hu.bme.mit.inf.viewmodel.benchmarks.tgg.stochasticpetrinet.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Railway Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RailwayContainerImpl extends AbstractRuleImpl implements RailwayContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailwayContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getRailwayContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {

		Object[] result1_black = RailwayContainerImpl.pattern_RailwayContainer_0_1_initialbindings_blackBBB(this, match,
				srcContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcContainer] = " + srcContainer + ".");
		}

		Object[] result2_bindingAndBlack = RailwayContainerImpl
				.pattern_RailwayContainer_0_2_SolveCSP_bindingAndBlackFBBB(this, match, srcContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[srcContainer] = " + srcContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (RailwayContainerImpl.pattern_RailwayContainer_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = RailwayContainerImpl
					.pattern_RailwayContainer_0_4_collectelementstobetranslated_blackBB(match, srcContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcContainer] = " + srcContainer + ".");
			}
			RailwayContainerImpl.pattern_RailwayContainer_0_4_collectelementstobetranslated_greenBB(match,
					srcContainer);

			Object[] result5_black = RailwayContainerImpl
					.pattern_RailwayContainer_0_5_collectcontextelements_blackBB(match, srcContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[srcContainer] = " + srcContainer + ".");
			}
			// 
			RailwayContainerImpl.pattern_RailwayContainer_0_6_registerobjectstomatch_expressionBBB(this, match,
					srcContainer);
			return RailwayContainerImpl.pattern_RailwayContainer_0_7_expressionF();
		} else {
			return RailwayContainerImpl.pattern_RailwayContainer_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = RailwayContainerImpl
				.pattern_RailwayContainer_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = RailwayContainerImpl
				.pattern_RailwayContainer_1_1_performtransformation_greenBFF(srcContainer);
		PetriNet trgPetrinet = (PetriNet) result1_green[1];
		RailwayContainerToPetriNet containerCorr = (RailwayContainerToPetriNet) result1_green[2];

		Object[] result2_black = RailwayContainerImpl.pattern_RailwayContainer_1_2_collecttranslatedelements_blackBBB(
				srcContainer, trgPetrinet, containerCorr);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[srcContainer] = " + srcContainer
					+ ", " + "[trgPetrinet] = " + trgPetrinet + ", " + "[containerCorr] = " + containerCorr + ".");
		}
		Object[] result2_green = RailwayContainerImpl.pattern_RailwayContainer_1_2_collecttranslatedelements_greenFBBB(
				srcContainer, trgPetrinet, containerCorr);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = RailwayContainerImpl.pattern_RailwayContainer_1_3_bookkeepingforedges_blackBBBB(
				ruleresult, srcContainer, trgPetrinet, containerCorr);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[srcContainer] = " + srcContainer + ", " + "[trgPetrinet] = " + trgPetrinet + ", "
					+ "[containerCorr] = " + containerCorr + ".");
		}
		RailwayContainerImpl.pattern_RailwayContainer_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, srcContainer,
				trgPetrinet, containerCorr);
		//nothing EMoflonEdge containerCorr__trgPetrinet____target = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge containerCorr__srcContainer____source = (EMoflonEdge) result3_green[5];

		// 
		// 
		RailwayContainerImpl.pattern_RailwayContainer_1_5_registerobjects_expressionBBBBB(this, ruleresult,
				srcContainer, trgPetrinet, containerCorr);
		return RailwayContainerImpl.pattern_RailwayContainer_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = RailwayContainerImpl
				.pattern_RailwayContainer_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = RailwayContainerImpl
				.pattern_RailwayContainer_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = RailwayContainerImpl.pattern_RailwayContainer_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) result2_binding[0];
		for (Object[] result2_black : RailwayContainerImpl.pattern_RailwayContainer_2_2_corematch_blackBB(srcContainer,
				match)) {
			// ForEach 
			for (Object[] result3_black : RailwayContainerImpl
					.pattern_RailwayContainer_2_3_findcontext_blackB(srcContainer)) {
				Object[] result3_green = RailwayContainerImpl
						.pattern_RailwayContainer_2_3_findcontext_greenBF(srcContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = RailwayContainerImpl
						.pattern_RailwayContainer_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								srcContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[srcContainer] = " + srcContainer
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (RailwayContainerImpl.pattern_RailwayContainer_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = RailwayContainerImpl
							.pattern_RailwayContainer_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					RailwayContainerImpl.pattern_RailwayContainer_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return RailwayContainerImpl.pattern_RailwayContainer_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		match.registerObject("srcContainer", srcContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {// Create CSP
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
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject srcContainer, EObject trgPetrinet,
			EObject containerCorr) {
		ruleresult.registerObject("srcContainer", srcContainer);
		ruleresult.registerObject("trgPetrinet", trgPetrinet);
		ruleresult.registerObject("containerCorr", containerCorr);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("srcContainer").eClass())
				.equals("railway.RailwayContainer.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_RailwayContainer_0(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {

		Object[] result1_bindingAndBlack = RailwayContainerImpl
				.pattern_RailwayContainer_10_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = RailwayContainerImpl.pattern_RailwayContainer_10_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : RailwayContainerImpl
				.pattern_RailwayContainer_10_2_testcorematchandDECs_blackB(srcContainer)) {
			Object[] result2_green = RailwayContainerImpl
					.pattern_RailwayContainer_10_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (RailwayContainerImpl
					.pattern_RailwayContainer_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
							srcContainer)) {
				// 
				if (RailwayContainerImpl
						.pattern_RailwayContainer_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = RailwayContainerImpl
							.pattern_RailwayContainer_10_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					RailwayContainerImpl.pattern_RailwayContainer_10_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return RailwayContainerImpl.pattern_RailwayContainer_10_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("RailwayContainer");
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
	public boolean checkDEC_FWD(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {// 
		Object[] result1_black = RailwayContainerImpl
				.pattern_RailwayContainer_13_1_matchtggpattern_blackB(srcContainer);
		if (result1_black != null) {
			return RailwayContainerImpl.pattern_RailwayContainer_13_2_expressionF();
		} else {
			return RailwayContainerImpl.pattern_RailwayContainer_13_3_expressionF();
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
		case RulesPackage.RAILWAY_CONTAINER___IS_APPROPRIATE_FWD__MATCH_RAILWAYCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) arguments.get(1));
		case RulesPackage.RAILWAY_CONTAINER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.RAILWAY_CONTAINER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.RAILWAY_CONTAINER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_RAILWAYCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) arguments.get(1));
			return null;
		case RulesPackage.RAILWAY_CONTAINER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_RAILWAYCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) arguments.get(1));
		case RulesPackage.RAILWAY_CONTAINER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RAILWAY_CONTAINER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_RAILWAYCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) arguments.get(1));
		case RulesPackage.RAILWAY_CONTAINER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.RAILWAY_CONTAINER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.RAILWAY_CONTAINER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.RAILWAY_CONTAINER___IS_APPROPRIATE_FWD_RAILWAY_CONTAINER_0__RAILWAYCONTAINER:
			return isAppropriate_FWD_RailwayContainer_0(
					(hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) arguments.get(0));
		case RulesPackage.RAILWAY_CONTAINER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.RAILWAY_CONTAINER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.RAILWAY_CONTAINER___CHECK_DEC_FWD__RAILWAYCONTAINER:
			return checkDEC_FWD((hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_RailwayContainer_0_1_initialbindings_blackBBB(RailwayContainer _this,
			Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		return new Object[] { _this, match, srcContainer };
	}

	public static final Object[] pattern_RailwayContainer_0_2_SolveCSP_bindingFBBB(RailwayContainer _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RailwayContainer_0_2_SolveCSP_bindingAndBlackFBBB(RailwayContainer _this,
			Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		Object[] result_pattern_RailwayContainer_0_2_SolveCSP_binding = pattern_RailwayContainer_0_2_SolveCSP_bindingFBBB(
				_this, match, srcContainer);
		if (result_pattern_RailwayContainer_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RailwayContainer_0_2_SolveCSP_binding[0];

			Object[] result_pattern_RailwayContainer_0_2_SolveCSP_black = pattern_RailwayContainer_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_RailwayContainer_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_RailwayContainer_0_3_CheckCSP_expressionFBB(RailwayContainer _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_0_4_collectelementstobetranslated_blackBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		return new Object[] { match, srcContainer };
	}

	public static final Object[] pattern_RailwayContainer_0_4_collectelementstobetranslated_greenBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		match.getToBeTranslatedNodes().add(srcContainer);
		return new Object[] { match, srcContainer };
	}

	public static final Object[] pattern_RailwayContainer_0_5_collectcontextelements_blackBB(Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		return new Object[] { match, srcContainer };
	}

	public static final void pattern_RailwayContainer_0_6_registerobjectstomatch_expressionBBB(RailwayContainer _this,
			Match match, hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		_this.registerObjectsToMatch_FWD(match, srcContainer);

	}

	public static final boolean pattern_RailwayContainer_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RailwayContainer_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("srcContainer");
		EObject tmpSrcContainer = _localVariable_0;
		if (tmpSrcContainer instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) tmpSrcContainer;
			return new Object[] { srcContainer, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_1_1_performtransformation_blackBFBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer, RailwayContainer _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { srcContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_1_1_performtransformation_bindingAndBlackFFBB(
			RailwayContainer _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_RailwayContainer_1_1_performtransformation_binding = pattern_RailwayContainer_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_RailwayContainer_1_1_performtransformation_binding != null) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) result_pattern_RailwayContainer_1_1_performtransformation_binding[0];

			Object[] result_pattern_RailwayContainer_1_1_performtransformation_black = pattern_RailwayContainer_1_1_performtransformation_blackBFBB(
					srcContainer, _this, isApplicableMatch);
			if (result_pattern_RailwayContainer_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_RailwayContainer_1_1_performtransformation_black[1];

				return new Object[] { srcContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_1_1_performtransformation_greenBFF(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		PetriNet trgPetrinet = StochasticPetriNetFactory.eINSTANCE.createPetriNet();
		RailwayContainerToPetriNet containerCorr = StochasticpetrinetFactory.eINSTANCE
				.createRailwayContainerToPetriNet();
		containerCorr.setTarget(trgPetrinet);
		containerCorr.setSource(srcContainer);
		return new Object[] { srcContainer, trgPetrinet, containerCorr };
	}

	public static final Object[] pattern_RailwayContainer_1_2_collecttranslatedelements_blackBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer, PetriNet trgPetrinet,
			RailwayContainerToPetriNet containerCorr) {
		return new Object[] { srcContainer, trgPetrinet, containerCorr };
	}

	public static final Object[] pattern_RailwayContainer_1_2_collecttranslatedelements_greenFBBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer, PetriNet trgPetrinet,
			RailwayContainerToPetriNet containerCorr) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(srcContainer);
		ruleresult.getCreatedElements().add(trgPetrinet);
		ruleresult.getCreatedLinkElements().add(containerCorr);
		return new Object[] { ruleresult, srcContainer, trgPetrinet, containerCorr };
	}

	public static final Object[] pattern_RailwayContainer_1_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject srcContainer, EObject trgPetrinet, EObject containerCorr) {
		if (!srcContainer.equals(trgPetrinet)) {
			if (!containerCorr.equals(srcContainer)) {
				if (!containerCorr.equals(trgPetrinet)) {
					return new Object[] { ruleresult, srcContainer, trgPetrinet, containerCorr };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject srcContainer, EObject trgPetrinet, EObject containerCorr) {
		EMoflonEdge containerCorr__trgPetrinet____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge containerCorr__srcContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "RailwayContainer";
		String containerCorr__trgPetrinet____target_name_prime = "target";
		String containerCorr__srcContainer____source_name_prime = "source";
		containerCorr__trgPetrinet____target.setSrc(containerCorr);
		containerCorr__trgPetrinet____target.setTrg(trgPetrinet);
		ruleresult.getCreatedEdges().add(containerCorr__trgPetrinet____target);
		containerCorr__srcContainer____source.setSrc(containerCorr);
		containerCorr__srcContainer____source.setTrg(srcContainer);
		ruleresult.getCreatedEdges().add(containerCorr__srcContainer____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		containerCorr__trgPetrinet____target.setName(containerCorr__trgPetrinet____target_name_prime);
		containerCorr__srcContainer____source.setName(containerCorr__srcContainer____source_name_prime);
		return new Object[] { ruleresult, srcContainer, trgPetrinet, containerCorr,
				containerCorr__trgPetrinet____target, containerCorr__srcContainer____source };
	}

	public static final void pattern_RailwayContainer_1_5_registerobjects_expressionBBBBB(RailwayContainer _this,
			PerformRuleResult ruleresult, EObject srcContainer, EObject trgPetrinet, EObject containerCorr) {
		_this.registerObjects_FWD(ruleresult, srcContainer, trgPetrinet, containerCorr);

	}

	public static final PerformRuleResult pattern_RailwayContainer_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_2_1_preparereturnvalue_bindingFB(RailwayContainer _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_2_1_preparereturnvalue_blackFBB(EClass eClass,
			RailwayContainer _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_2_1_preparereturnvalue_bindingAndBlackFFB(
			RailwayContainer _this) {
		Object[] result_pattern_RailwayContainer_2_1_preparereturnvalue_binding = pattern_RailwayContainer_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RailwayContainer_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_RailwayContainer_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RailwayContainer_2_1_preparereturnvalue_black = pattern_RailwayContainer_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_RailwayContainer_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_RailwayContainer_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "RailwayContainer";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_RailwayContainer_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("srcContainer");
		EObject tmpSrcContainer = _localVariable_0;
		if (tmpSrcContainer instanceof hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) {
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer = (hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer) tmpSrcContainer;
			return new Object[] { srcContainer, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_RailwayContainer_2_2_corematch_blackBB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcContainer, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_RailwayContainer_2_3_findcontext_blackB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcContainer });
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_2_3_findcontext_greenBF(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(srcContainer);
		return new Object[] { srcContainer, isApplicableMatch };
	}

	public static final Object[] pattern_RailwayContainer_2_4_solveCSP_bindingFBBB(RailwayContainer _this,
			IsApplicableMatch isApplicableMatch,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, srcContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, srcContainer };
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_RailwayContainer_2_4_solveCSP_bindingAndBlackFBBB(RailwayContainer _this,
			IsApplicableMatch isApplicableMatch,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		Object[] result_pattern_RailwayContainer_2_4_solveCSP_binding = pattern_RailwayContainer_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, srcContainer);
		if (result_pattern_RailwayContainer_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_RailwayContainer_2_4_solveCSP_binding[0];

			Object[] result_pattern_RailwayContainer_2_4_solveCSP_black = pattern_RailwayContainer_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_RailwayContainer_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, srcContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_RailwayContainer_2_5_checkCSP_expressionFBB(RailwayContainer _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_RailwayContainer_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "RailwayContainer";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_RailwayContainer_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_10_1_preparereturnvalue_bindingFB(RailwayContainer _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_10_1_preparereturnvalue_blackFBBF(EClass __eClass,
			RailwayContainer _this) {
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

	public static final Object[] pattern_RailwayContainer_10_1_preparereturnvalue_bindingAndBlackFFBF(
			RailwayContainer _this) {
		Object[] result_pattern_RailwayContainer_10_1_preparereturnvalue_binding = pattern_RailwayContainer_10_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_RailwayContainer_10_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_RailwayContainer_10_1_preparereturnvalue_binding[0];

			Object[] result_pattern_RailwayContainer_10_1_preparereturnvalue_black = pattern_RailwayContainer_10_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_RailwayContainer_10_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_RailwayContainer_10_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_RailwayContainer_10_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_10_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_RailwayContainer_10_2_testcorematchandDECs_blackB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { srcContainer });
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_10_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_RailwayContainer_10_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			RailwayContainer _this, Match match,
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, srcContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_RailwayContainer_10_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			RailwayContainer _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_10_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_RailwayContainer_10_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_RailwayContainer_10_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_RailwayContainer_13_1_matchtggpattern_blackB(
			hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayContainer srcContainer) {
		return new Object[] { srcContainer };
	}

	public static final boolean pattern_RailwayContainer_13_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_RailwayContainer_13_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RailwayContainerImpl
