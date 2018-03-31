/**
 */
package hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.util;

import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.viatra.query.patternlanguage.patternLanguage.Expression;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewModelLanguagePackage
 * @generated
 */
public class ViewModelLanguageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewModelLanguagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelLanguageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewModelLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewModelLanguageSwitch<Adapter> modelSwitch =
		new ViewModelLanguageSwitch<Adapter>() {
			@Override
			public Adapter caseViewDefinitionModel(ViewDefinitionModel object) {
				return createViewDefinitionModelAdapter();
			}
			@Override
			public Adapter caseImportSection(ImportSection object) {
				return createImportSectionAdapter();
			}
			@Override
			public Adapter caseNamespaceImport(NamespaceImport object) {
				return createNamespaceImportAdapter();
			}
			@Override
			public Adapter caseRuleDefinition(RuleDefinition object) {
				return createRuleDefinitionAdapter();
			}
			@Override
			public Adapter casePatternReference(PatternReference object) {
				return createPatternReferenceAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseLookup(Lookup object) {
				return createLookupAdapter();
			}
			@Override
			public Adapter caseLookupResult(LookupResult object) {
				return createLookupResultAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter casePatternLanguage_Variable(org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable object) {
				return createPatternLanguage_VariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel <em>View Definition Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
	 * @generated
	 */
	public Adapter createViewDefinitionModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection <em>Import Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ImportSection
	 * @generated
	 */
	public Adapter createImportSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport <em>Namespace Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.NamespaceImport
	 * @generated
	 */
	public Adapter createNamespaceImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition <em>Rule Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
	 * @generated
	 */
	public Adapter createRuleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference <em>Pattern Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.PatternReference
	 * @generated
	 */
	public Adapter createPatternReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.Lookup
	 * @generated
	 */
	public Adapter createLookupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult <em>Lookup Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.LookupResult
	 * @generated
	 */
	public Adapter createLookupResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.query.patternlanguage.patternLanguage.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.query.patternlanguage.patternLanguage.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable
	 * @generated
	 */
	public Adapter createPatternLanguage_VariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ViewModelLanguageAdapterFactory
