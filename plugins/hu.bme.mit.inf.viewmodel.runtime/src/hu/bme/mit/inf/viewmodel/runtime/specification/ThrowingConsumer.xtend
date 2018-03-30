package hu.bme.mit.inf.viewmodel.runtime.specification

@FunctionalInterface
interface ThrowingConsumer<T, E extends Throwable> {
	def void accept(T t) throws E
}