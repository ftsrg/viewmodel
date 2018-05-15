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
package hu.bme.mit.inf.viewmodel.runtime.utils

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModelPackage
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ViewModelTracePackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

final class EPackageUtils {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}
	
	static def getEPackage(String nsUri) {
		val ePackage = EPackage.Registry.INSTANCE.getEPackage(nsUri)
		if (ePackage === null) {
			throw new IllegalArgumentException("No such EPackage " + nsUri)
		}
		ePackage
	}

	static def getEClass(String nsUri, String className) {
		val ePackage = getEPackage(nsUri)
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
	
	static def registerRequiredEPackages() {
		registerViewModelTracePackage
		registerLogicModelPackage
	}
	
	static def registerViewModelTracePackage() {
		registerEPackage(ViewModelTracePackage.eINSTANCE)
	}
	
	static def registerLogicModelPackage() {
		registerEPackage(LogicModelPackage.eINSTANCE)
	}
	
	static def void registerEPackage(EPackage ePackage) {
		val nsUri = ePackage.nsURI
		val registry = EPackage.Registry.INSTANCE
		if (registry.containsKey(nsUri)) {
			registry.put(nsUri, ePackage)
		}
	}
}
