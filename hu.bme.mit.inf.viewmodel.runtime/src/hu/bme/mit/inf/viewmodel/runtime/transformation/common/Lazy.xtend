package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import java.util.function.Supplier
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class Lazy<T> {
	val Supplier<T> supplier
	var T t
	
	def get() {
		if (t === null) {
			t = supplier.get
		}
		t
	}
	
	static def <T> of(Supplier<T> supplier) {
		new Lazy(supplier)
	}
	
	static def <T> of(T t) {
		new Lazy[t]
	}
}