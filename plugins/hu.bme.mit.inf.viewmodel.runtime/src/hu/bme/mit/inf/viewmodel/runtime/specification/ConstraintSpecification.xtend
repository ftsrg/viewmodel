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
package hu.bme.mit.inf.viewmodel.runtime.specification

import com.google.common.collect.ImmutableList
import java.util.List
import java.util.function.Function
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey
import org.eclipse.xtend.lib.annotations.Data

abstract class ConstraintSpecification<T> {
	package new() {
	}

	abstract def <U> ConstraintSpecification<U> map(Function<? super T, ? extends U> f)
}

@Data
final class TemplateConstraintSpecification<T> extends ConstraintSpecification<T> {
	val T templatePattern
	val List<VariableReference> arguments

	override <U> TemplateConstraintSpecification<U> map(Function<? super T, ? extends U> f) {
		new TemplateConstraintSpecification(f.apply(templatePattern), arguments)
	}

	static def <T> of(T templatePattern, VariableReference... arguments) {
		new TemplateConstraintSpecification<T>(templatePattern, ImmutableList.copyOf(arguments))
	}
}

@Data
final class EquivalenceConstraintSpecification<T> extends ConstraintSpecification<T> {
	val VariableReference left
	val VariableReference right

	override <U> EquivalenceConstraintSpecification<U> map(Function<? super T, ? extends U> f) {
		new EquivalenceConstraintSpecification(left, right)
	}

	static def <T> of(VariableReference left, VariableReference right) {
		new EquivalenceConstraintSpecification<T>(left, right)
	}
}

@Data
final class AssignmentConstraintSpecification<T> extends ConstraintSpecification<T> {
	val VariableReference left
	val String right

	override <U> AssignmentConstraintSpecification<U> map(Function<? super T, ? extends U> f) {
		new AssignmentConstraintSpecification(left, right)
	}

	static def <T> of(VariableReference left, String right) {
		new AssignmentConstraintSpecification<T>(left, right)
	}
}

@Data
final class ConstantConstraintSpecification<T> extends ConstraintSpecification<T> {
	val VariableReference left
	val Object right

	override <U> ConstantConstraintSpecification<U> map(Function<? super T, ? extends U> f) {
		new ConstantConstraintSpecification(left, right)
	}

	static def <T> of(VariableReference left, Object right) {
		new ConstantConstraintSpecification<T>(left, right)
	}
}

@Data
final class TypeConstraintSpecification<T> extends ConstraintSpecification<T> {
	val IInputKey inputKey
	val List<VariableReference> arguments

	override <U> TypeConstraintSpecification<U> map(Function<? super T, ? extends U> f) {
		new TypeConstraintSpecification(inputKey, arguments)
	}

	static def <T> of(IInputKey inputKey, VariableReference... arguments) {
		new TypeConstraintSpecification<T>(inputKey, ImmutableList.copyOf(arguments))
	}
}

