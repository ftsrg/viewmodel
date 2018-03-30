package hu.bme.mit.inf.viewmodel.runtime.specification.viatraquery

import com.google.common.collect.ImmutableMap
import com.google.common.collect.ImmutableSet
import com.google.common.collect.Maps
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstantConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification.ConstraintAcceptor
import hu.bme.mit.inf.viewmodel.runtime.specification.EquivalenceConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.TemplateConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.TypeConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableReference
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import java.util.function.BiConsumer
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.emf.EMFQueryMetaContext
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.viatra.query.runtime.matchers.psystem.rewriters.DefaultFlattenCallPredicate
import org.eclipse.viatra.query.runtime.matchers.psystem.rewriters.PBodyNormalizer
import org.eclipse.viatra.query.runtime.matchers.psystem.rewriters.PQueryFlattener
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple

class QuerySpecificationTemplateParser implements BiConsumer<ConstraintAcceptor<Void>, TemplateConstraintSpecification<? extends IQuerySpecification<?>>> {

	val TemplateParserOptimizationLevel optimizationLevel
	val PQueryFlattener flattener
	val PBodyNormalizer normalizer
	val bodyCache = new HashMap<PQuery, Set<PBody>>

	new() {
		this(TemplateParserOptimizationLevel.FLATTEN_IMPLIED)
	}

	new(TemplateParserOptimizationLevel optimizationLevel) {
		this.optimizationLevel = optimizationLevel
		val flattenCallPredicate = new DefaultFlattenCallPredicate
		flattener = new PQueryFlattener(flattenCallPredicate)
		normalizer = new PBodyNormalizer(EMFQueryMetaContext.DEFAULT) {
			
			override protected shouldCalculateImpliedTypes(PQuery query) {
				optimizationLevel.calculateImpliedTypes
			}
			
		}
	}

	protected def normalize(PQuery pQuery) {
		if (optimizationLevel.flattenAndNormalize) {
			bodyCache.computeIfAbsent(pQuery) [
				val flatDisjunction = flattener.rewrite(pQuery.disjunctBodies)
				val normalizedDisjunction = normalizer.rewrite(flatDisjunction)
				ImmutableSet.copyOf(normalizedDisjunction.bodies)
			]
		} else {
			pQuery.disjunctBodies.bodies
		}
	}

	override accept(ConstraintAcceptor<Void> acceptor,
		TemplateConstraintSpecification<? extends IQuerySpecification<?>> templateConstraint) {
		val pQuery = templateConstraint.templatePattern.internalQueryRepresentation
		val arguments = templateConstraint.arguments
		parsePQuery(acceptor, pQuery, arguments)
	}

	protected def void parsePQuery(ConstraintAcceptor<? super Void> acceptor, PQuery pQuery,
		List<VariableReference> arguments) {

		val bodies = normalize(pQuery)
		if (bodies.size != 1) {
			throw new IllegalArgumentException("Valid templates must have a single body, got " + bodies.size +
				" bodies instead.")
		}
		val parameterBinding = getParameterBindingMap(pQuery, arguments)
		val body = bodies.get(0)
		val variables = Maps.newHashMapWithExpectedSize(body.allVariables.size)
		for (exportedParameter : body.symbolicParameters) {
			val exportedVariable = exportedParameter.parameterVariable
			val patternParameter = exportedParameter.patternParameter
			val argumentReference = parameterBinding.get(patternParameter)
			variables.put(exportedVariable.unifiedIntoRoot, argumentReference)
		}
		for (variable : body.allVariables) {
			val unifiedIntoRoot = variable.unifiedIntoRoot
			if (!variables.containsKey(unifiedIntoRoot)) {
				val variableReference = acceptor.newLocalVariable(unifiedIntoRoot.name)
				variables.put(unifiedIntoRoot, variableReference)
			}
		}
		parsePBody(acceptor, body, variables)
	}

	protected def void parsePBody(ConstraintAcceptor<? super Void> acceptor, PBody body,
		Map<PVariable, VariableReference> variables) {
		for (constraint : body.constraints) {
			parsePConstraint(acceptor, constraint, variables)
		}
	}

	protected dispatch def void parsePConstraint(ConstraintAcceptor<? super Void> acceptor,
		ExportedParameter constraint, Map<PVariable, VariableReference> variables) {
		// Nothing to do for exported parameters.
	}

	protected dispatch def void parsePConstraint(ConstraintAcceptor<? super Void> acceptor, TypeConstraint constraint,
		Map<PVariable, VariableReference> variables) {
		val inputKey = constraint.supplierKey
		val arguments = getVariableTuple(constraint.variablesTuple, variables)
		acceptor.acceptConstraint(TypeConstraintSpecification.<Void>of(inputKey, arguments))
	}

	protected dispatch def void parsePConstraint(ConstraintAcceptor<? super Void> acceptor,
		TypeFilterConstraint constraint, Map<PVariable, VariableReference> variables) {
		val inputKey = constraint.inputKey
		val arguments = getVariableTuple(constraint.variablesTuple, variables)
		acceptor.acceptConstraint(TypeConstraintSpecification.<Void>of(inputKey, arguments))
	}

	protected dispatch def void parsePConstraint(ConstraintAcceptor<? super Void> acceptor, ConstantValue constraint,
		Map<PVariable, VariableReference> variables) {
		val arguments = getVariableTuple(constraint.variablesTuple, variables)
		if (arguments.size != 1) {
			throw new IllegalArgumentException("Expected 1 argument for ConstantValue constraint.")
		}
		val left = arguments.get(0)
		val right = constraint.supplierKey
		acceptor.acceptConstraint(ConstantConstraintSpecification.<Void>of(left, right))
	}

	protected dispatch def void parsePConstraint(ConstraintAcceptor<? super Void> acceptor, Equality constraint,
		Map<PVariable, VariableReference> variables) {
		val left = variables.get(constraint.who)
		val right = variables.get(constraint.withWhom)
		acceptor.acceptConstraint(EquivalenceConstraintSpecification.<Void>of(left, right))
	}

	protected dispatch def void parsePConstraint(ConstraintAcceptor<? super Void> acceptor, PConstraint constraint,
		Map<PVariable, VariableReference> variables) {
		throw new IllegalArgumentException("Unknown PConstraint: " + constraint)
	}

	protected dispatch def void parsePConstraint(ConstraintAcceptor<? super Void> acceptor,
		PositivePatternCall constraint, Map<PVariable, VariableReference> variables) {
		val pQuery = constraint.supplierKey
		val arguments = getVariableTuple(constraint.variablesTuple, variables)
		parsePQuery(acceptor, pQuery, arguments)
	}

	protected def getVariableTuple(Tuple tuple, Map<PVariable, VariableReference> variables) {
		tuple.elements.map [ element |
			if (element instanceof PVariable) {
				variables.get(element.unifiedIntoRoot)
			} else {
				throw new IllegalArgumentException("Expected PVariable in tuple, got " + element + " instead.")
			}
		]
	}

	private def getParameterBindingMap(PQuery pQuery, List<VariableReference> arguments) {
		val parameters = pQuery.parameters
		val parameterCount = parameters.size
		if (parameterCount != arguments.size) {
			throw new IllegalArgumentException(
				"Pattern expected " + parameterCount + " arguments, but got " + arguments.size + " instead.")
		}
		val builder = ImmutableMap.builder
		for (var int i = 0; i < parameterCount; i++) {
			builder.put(parameters.get(i), arguments.get(i))
		}
		builder.build
	}

	static def parse(
		ViewSpecification<? extends IQuerySpecification<?>, ? extends IQuerySpecification<?>> viewSpecification) {
		viewSpecification.parseTemplates(new QuerySpecificationTemplateParser)
	}
}
