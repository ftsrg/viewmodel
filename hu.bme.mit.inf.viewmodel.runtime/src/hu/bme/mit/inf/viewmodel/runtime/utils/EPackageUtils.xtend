package hu.bme.mit.inf.viewmodel.runtime.utils

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

final class EPackageUtils {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def getEClass(String nsUri, String className) {
		val ePackage = EPackage.Registry.INSTANCE.getEPackage(nsUri)
		if (ePackage === null) {
			throw new IllegalArgumentException("No such EPackage " + nsUri)
		}
		val eClassifier = ePackage.EClassifiers.findFirst[name == className]
		if (eClassifier === null) {
			throw new IllegalArgumentException("No such EClass " + nsUri + "#" + className)
		}
		if (!(eClassifier instanceof EClass)) {
			throw new IllegalArgumentException(eClassifier + " is not an EClass")
		}
		eClassifier as EClass
	}

	static def getEStructuralFeature(String nsUri, String className, String featureName) {
		val eClass = getEClass(nsUri, className)
		val eStructuralFeature = eClass.EAllStructuralFeatures.findFirst[name == featureName]
		if (eStructuralFeature === null) {
			throw new IllegalArgumentException(className + " has no EStructuralFeature named " + featureName)
		}
		eStructuralFeature
	}
}
