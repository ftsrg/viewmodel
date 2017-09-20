package hu.bme.mit.inf.viewmodel.language

import org.eclipse.emf.ecore.EObject

final class ViewModelLanguageUtils {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	public static def nullOrProxy(EObject obj) {
		obj === null || obj.eIsProxy
	}
}
