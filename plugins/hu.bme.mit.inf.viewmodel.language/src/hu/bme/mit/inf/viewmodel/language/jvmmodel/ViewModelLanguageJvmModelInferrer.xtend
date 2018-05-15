/********************************************************************************
 * Copyright (c) 2018 Contributors to the ViewModel project
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-1.0
 ********************************************************************************/
package hu.bme.mit.inf.viewmodel.language.jvmmodel

import com.google.common.base.CaseFormat
import com.google.inject.Inject
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.ViewDefinitionModel
import hu.bme.mit.inf.viewmodel.language.specification.ViewModelSpecificationCompiler
import hu.bme.mit.inf.viewmodel.runtime.specification.AssignmentConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.DependencyRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.EquivalenceConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.LookupPreconditionSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.LookupVariableReference
import hu.bme.mit.inf.viewmodel.runtime.specification.MatchPreconditionSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.PreconditionSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.RuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.TemplateConstraintSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableReference
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import hu.bme.mit.inf.viewmodel.runtime.transformation.ViewModel
import org.apache.commons.lang.StringEscapeUtils
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.viatra.query.patternlanguage.helper.CorePatternLanguageHelper
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class ViewModelLanguageJvmModelInferrer extends AbstractModelInferrer {
	static val QUERY_SPECIFICATION_SUFFIX = "QuerySpecification"
	static val VIEW_SPECIFICATION_SUFFIX = ""

	@Inject ViewModelSpecificationCompiler specificationCompiler
	@Inject IQualifiedNameProvider qualifiedNameProvider
	@Inject extension IQualifiedNameConverter
	@Inject IJvmModelAssociations jvmModelAssociations
	@Inject extension JvmTypesBuilder

	def dispatch void infer(ViewDefinitionModel viewDefinitionModel, IJvmDeclaredTypeAcceptor acceptor,
		boolean isPreIndexingPhase) {
		val viewDefinitionName = qualifiedNameProvider.getFullyQualifiedName(viewDefinitionModel)
		val viewSpecification = specificationCompiler.getSpecification(viewDefinitionModel)
		val querySpecificationTypeRef = IQuerySpecification.typeRef(wildcard)
		val viewSpecificationTypeRef = ViewSpecification.typeRef(querySpecificationTypeRef, querySpecificationTypeRef)
		val viewSpecificationClass = viewDefinitionModel.toClass(viewDefinitionName + VIEW_SPECIFICATION_SUFFIX)
		acceptor.accept(viewSpecificationClass) [
			visibility = JvmVisibility.PUBLIC
			final = true
			members += viewDefinitionModel.toConstructor [
				visibility = JvmVisibility.PRIVATE
				body = '''
					throw new «IllegalArgumentException.typeRef»("This class should not be instantiated directly. Use the #create() static method instead.");
				'''
			]
			members += viewDefinitionModel.toMethod("createSpecification", viewSpecificationTypeRef) [
				visibility = JvmVisibility.PUBLIC
				static = true
				exceptions += ViatraQueryException.typeRef
				body = '''
					return «serializeViewSpecification(viewSpecification)»;
				'''
			]
			members += viewDefinitionModel.toMethod("create", ViewModel.typeRef) [
				visibility = JvmVisibility.PUBLIC
				static = true
				exceptions += ViatraQueryException.typeRef
				parameters += viewDefinitionModel.toParameter("queryEngine", ViatraQueryEngine.typeRef)
				body = '''
					return «ViewModel.typeRef».create(queryEngine, «viewSpecificationClass.typeRef».createSpecification());
				'''
			]
			members += viewDefinitionModel.toMethod("create", ViewModel.typeRef) [
				visibility = JvmVisibility.PUBLIC
				static = true
				exceptions += ViatraQueryException.typeRef
				parameters += viewDefinitionModel.toParameter("notifier", Notifier.typeRef)
				body = '''
					return «ViewModel.typeRef».create(notifier, «viewSpecificationClass.typeRef».createSpecification());
				'''
			]
		]
	}

	protected def StringConcatenationClient serializeViewSpecification(
		ViewSpecification<Pattern, Pattern> viewSpecification) {
		val typedViewSpecification = viewSpecification.bimap([querySpecificationTypeRef], [querySpecificationTypeRef])
		serializeTypedViewSpecification(typedViewSpecification)
	}

	protected def StringConcatenationClient serializeTypedViewSpecification(
		ViewSpecification<JvmTypeReference, JvmTypeReference> viewSpecification) {
		'''
		«ViewSpecification.typeRef».createOrThrow(b0 -> b0
				«FOR requiredMetamodel : viewSpecification.requiredMetamodels»
					.addRequiredMetamodel(«requiredMetamodel.literal»)
				«ENDFOR»
				«FOR ruleSpecification : viewSpecification.ruleSpecifications»
					«serializeRuleSpecification(ruleSpecification)»
				«ENDFOR»
			)'''
	}

	protected dispatch def StringConcatenationClient serializeRuleSpecification(
		VariableInstantiationRuleSpecification<? extends JvmTypeReference, ? extends JvmTypeReference> ruleSpecification) {
		'''
			.addVariableInstantiationRuleOrThrow(b -> b
				.setPreconditionPattern(«ruleSpecification.preconditionPattern».instance())
				«FOR variable : ruleSpecification.variables»
					.addVariable(«variable.literal»)
				«ENDFOR»
			)
		'''
	}

	protected dispatch def StringConcatenationClient serializeRuleSpecification(
		ConstraintRuleSpecification<? extends JvmTypeReference, ? extends JvmTypeReference> ruleSpecification) {
		'''
			.addConstraintRuleOrThrow(b -> b
				.setName(«ruleSpecification.name.literal»)
				«FOR parameter : ruleSpecification.parameters»
					.addParameter(«parameter.literal»)
				«ENDFOR»
				«FOR localVariable : ruleSpecification.localVariables»
					.addLocalVariable(«serializeVariableSpecification(localVariable)»)
				«ENDFOR»
				«FOR preconditionSpecification : ruleSpecification.preconditionSpecifications»
					.addPrecondition(«serializePreconditionSpecification(preconditionSpecification)»)
				«ENDFOR»
				«FOR constraintSpecification : ruleSpecification.constraintSpecifications»
					.addConstraint(«serializeConstraintSpecification(constraintSpecification)»)
				«ENDFOR»
			)
		'''
	}

	protected def StringConcatenationClient serializeVariableSpecification(
		VariableSpecification variableSpecification) {
		'''«VariableSpecification.typeRef».of(«variableSpecification.name.literal»)'''
	}

	protected dispatch def StringConcatenationClient serializePreconditionSpecification(
		MatchPreconditionSpecification<? extends JvmTypeReference> preconditionSpecification) {
		'''«MatchPreconditionSpecification.typeRef».of(«preconditionSpecification.preconditionPattern».instance(), «FOR argument : preconditionSpecification.arguments SEPARATOR ", "»«argument.literal»«ENDFOR»)'''
	}

	protected dispatch def StringConcatenationClient serializePreconditionSpecification(
		LookupPreconditionSpecification<? extends JvmTypeReference> preconditionSpecification) {
		'''«LookupPreconditionSpecification.typeRef».of(«preconditionSpecification.name.literal», «preconditionSpecification.preconditionPattern».instance(), «FOR argument : preconditionSpecification.arguments SEPARATOR ", "»«argument.literal»«ENDFOR»)'''
	}

	protected dispatch def StringConcatenationClient serializePreconditionSpecification(
		PreconditionSpecification<? extends JvmTypeReference> preconditionSpecification) {
		throw new IllegalArgumentException("Unknown precondition specification: " + preconditionSpecification)
	}

	protected dispatch def StringConcatenationClient serializeConstraintSpecification(
		TemplateConstraintSpecification<? extends JvmTypeReference> constraintSpecification) {
		'''«TemplateConstraintSpecification.typeRef».of(«constraintSpecification.templatePattern».instance(), «FOR argument : constraintSpecification.arguments SEPARATOR ", "»«serializeVariableReference(argument)»«ENDFOR»)'''
	}

	protected dispatch def StringConcatenationClient serializeConstraintSpecification(
		EquivalenceConstraintSpecification<? extends JvmTypeReference> constraintSpecification) {
		'''«EquivalenceConstraintSpecification.typeRef».of(«serializeVariableReference(constraintSpecification.left)», «serializeVariableReference(constraintSpecification.right)»)'''
	}

	protected dispatch def StringConcatenationClient serializeConstraintSpecification(
		AssignmentConstraintSpecification<? extends JvmTypeReference> constraintSpecification) {
		'''«AssignmentConstraintSpecification.typeRef».of(«serializeVariableReference(constraintSpecification.left)», «constraintSpecification.right.literal»)'''
	}

	protected dispatch def StringConcatenationClient serializeConstraintSpecification(
		ConstraintSpecification<? extends JvmTypeReference> constraintSpecification) {
		throw new IllegalArgumentException("Unknown constraint specification: " + constraintSpecification)
	}

	protected dispatch def StringConcatenationClient serializeVariableReference(
		LookupVariableReference variableReference) {
		'''«LookupVariableReference.typeRef».of(«variableReference.lookupName.literal», «variableReference.variableName.literal»)'''
	}

	protected dispatch def StringConcatenationClient serializeVariableReference(VariableReference variableReference) {
		throw new IllegalArgumentException("Unknown variable reference: " + variableReference)
	}

	protected dispatch def StringConcatenationClient serializeRuleSpecification(
		DependencyRuleSpecification<? extends JvmTypeReference, ? extends JvmTypeReference> ruleSpecification) {
		'''
			.addDependencyRuleOrThrow(b -> b
				«FOR parameter : ruleSpecification.parameters»
					.addParameter(«parameter.literal»)
				«ENDFOR»
				.setPrecondition(«serializePreconditionSpecification(ruleSpecification.precondition)»)
				.setConsequence(«serializePreconditionSpecification(ruleSpecification.consequence)»)
			)
		'''
	}

	protected dispatch def StringConcatenationClient serializeRuleSpecification(
		RuleSpecification<? extends JvmTypeReference, ? extends JvmTypeReference> ruleSpecification) {
		throw new IllegalArgumentException("Unknown rule specification: " + ruleSpecification)
	}

	private def getQuerySpecificationTypeRef(Pattern pattern) {
		val querySpecification = jvmModelAssociations.getJvmElements(pattern).filter(JvmDeclaredType).findFirst [
			qualifiedName.endsWith(QUERY_SPECIFICATION_SUFFIX)
		]
		val className = if (querySpecification === null) {
				// It seems this fallback is always called, because we cannot find the JVM element.
				getQuerySpecificationClassName(pattern)
			} else {
				querySpecification.qualifiedName
			}
		className.typeRef
	}

	private def getQuerySpecificationClassName(Pattern pattern) {
		val patternQualifiedName = CorePatternLanguageHelper.getFullyQualifiedName(pattern).toQualifiedName
		if (patternQualifiedName.empty) {
			return null
		}
		val packageName = QualifiedName.create(patternQualifiedName.segments.take(patternQualifiedName.segmentCount - 1))
		val patternName = patternQualifiedName.lastSegment
		val className = CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, patternName) + QUERY_SPECIFICATION_SUFFIX
		packageName.append("util").append(className).toString
	}

	protected static def literal(String s) {
		'"' + StringEscapeUtils.escapeJava(s) + '"'
	}
}
