package hu.bme.mit.inf.viewmodel.benchmarks.tgg.driver

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper
import org.moflon.tgg.language.analysis.StaticAnalysis
import org.moflon.tgg.algorithm.configuration.Configurator

class PlatformPluginSynchronizationHelper extends SynchronizationHelper {
	new(EPackage corrPackage, ResourceSet resourceSet) {
		this(corrPackage, getSmaUri(corrPackage.nsURI), resourceSet)
	}

	new(EPackage corrPackage, URI smaUri, ResourceSet resourceSet) {
		set = resourceSet
		this.corrPackage = corrPackage
		rules = set.getResource(smaUri, true).contents.get(0) as StaticAnalysis
		configurator = new Configurator {
		}
		changeSrc = []
		changeTrg = []
	}

	private static def URI getSmaUri(String corrPackageNsUri) {
		val ecoreEnding = ".ecore"
		if (corrPackageNsUri.endsWith(ecoreEnding)) {
			val prefix = corrPackageNsUri.substring(0, corrPackageNsUri.length - ecoreEnding.length)
			val smaUriString = prefix + ".sma.xmi"
			URI.createURI(smaUriString, true)
		} else {
			throw new IllegalArgumentException("Corr package URI must end with .ecore: " + corrPackageNsUri)
		}
	}
}
