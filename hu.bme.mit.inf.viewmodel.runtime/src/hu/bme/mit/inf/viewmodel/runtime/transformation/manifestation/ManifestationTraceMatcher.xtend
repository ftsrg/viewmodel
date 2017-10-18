package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.ManifestationMatcher
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

class ManifestationTraceMatcher {
	val String traceModelId
	val ManifestationMatcher manifestationMatcher

	new(String traceModelId, ViatraQueryEngine queryEngine) {
		this.traceModelId = traceModelId
		manifestationMatcher = ManifestationMatcher.on(queryEngine)
	}

	def getManifestation(long clusterId) {
		val iterator = manifestationMatcher.getAllValuesOfManifestation(traceModelId, clusterId).iterator
		if (!iterator.hasNext) {
			throw new IllegalArgumentException("No manifestation for cluster: " + clusterId)
		}
		val manifestation = iterator.next
		if (iterator.hasNext) {
			throw new IllegalArgumentException("Multiple manifestations for cluster: " + clusterId)
		}
		manifestation
	}
}
