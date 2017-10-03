package hu.bme.mit.inf.viewmodel.runtime.utils

import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.viatra.query.runtime.base.comprehension.WellbehavingDerivedFeatureRegistry

final class BadlyBehavingFeatureUtils {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}
	
	static def registerEcorePackageAsWellBehaving() {
		WellbehavingDerivedFeatureRegistry.registerWellbehavingDerivedPackage(EcorePackage.eINSTANCE)
	}
}
