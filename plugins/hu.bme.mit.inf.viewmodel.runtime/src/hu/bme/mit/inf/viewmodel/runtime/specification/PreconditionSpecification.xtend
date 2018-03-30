package hu.bme.mit.inf.viewmodel.runtime.specification

import com.google.common.collect.ImmutableList
import java.util.List
import java.util.function.Function
import org.eclipse.xtend.lib.annotations.Data

abstract class PreconditionSpecification<T> {
	package new() {
	}

	abstract def <U> PreconditionSpecification<U> map(Function<? super T, ? extends U> f)	
}

@Data
final class MatchPreconditionSpecification<T> extends PreconditionSpecification<T> {
	val T preconditionPattern
	val List<String> arguments

	override <U> MatchPreconditionSpecification<U> map(Function<? super T, ? extends U> f) {
		new MatchPreconditionSpecification(f.apply(preconditionPattern), arguments)
	}

	static def <T> of(T preconditionPattern, String... arguments) {
		new MatchPreconditionSpecification(preconditionPattern, ImmutableList.copyOf(arguments))
	}
}

@Data
final class LookupPreconditionSpecification<T> extends PreconditionSpecification<T> {
	val String name
	val T preconditionPattern
	val List<String> arguments

	override <U> LookupPreconditionSpecification<U> map(Function<? super T, ? extends U> f) {
		new LookupPreconditionSpecification(name, f.apply(preconditionPattern), arguments)
	}
	
	static def <T> of(String name, T preconditionPattern, String... arguments) {
		new LookupPreconditionSpecification(name, preconditionPattern, ImmutableList.copyOf(arguments))
	}
}
