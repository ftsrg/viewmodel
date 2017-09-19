package hu.bme.mit.inf.viewmodel.runtime.utils

import java.util.function.Function

final class FunctionalUtils {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}
	
	/**
	 * Asserts that the function passed to <code>map</code> or <code>bimap</code> will never be called.
	 * 
	 * This is only safe if <code>T</code> is {@link Void}.
	 * However, there may be situations where this function must be passed to assert that
	 * some type parameter <code>T</code> does not appear is a data structure instance.
	 */
	static def <T, U> Function<T, U> absurd() {
		[throw new IllegalArgumentException("Absurd function called.")]
	}
}
