package hu.bme.mit.inf.viewmodel.runtime.utils

import java.util.Iterator
import java.util.function.Function
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

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
	
	static def <T, U> Iterable<Pair<T, U>> zip(Iterable<T> ts, Iterable<U> us) {
		new ZipIterable(ts, us)
	}
	
	@FinalFieldsConstructor
	private static class ZipIterable<T, U> implements Iterable<Pair<T, U>> {
		val Iterable<T> ts
		val Iterable<U> us
		
		override iterator() {
			new ZipIterator(ts.iterator, us.iterator)
		}
		
	}
	
	@FinalFieldsConstructor
	private static class ZipIterator<T, U> implements Iterator<Pair<T, U>> {
		val Iterator<T> tIterator
		val Iterator<U> uIterator
		
		override hasNext() {
			tIterator.hasNext && uIterator.hasNext
		}
		
		override next() {
			tIterator.next -> uIterator.next
		}
		
	}
}
