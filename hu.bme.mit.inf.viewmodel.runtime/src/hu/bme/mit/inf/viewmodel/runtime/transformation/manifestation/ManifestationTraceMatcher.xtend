package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.queries.manifestationtrace.ManifestationMatcher
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

class ManifestationTraceMatcher {
	val String traceModelId
	val ManifestationMatcher manifestationMatcher

	new(String traceModelId, ViatraQueryEngine queryEngine) {
		this.traceModelId = traceModelId
		manifestationMatcher = ManifestationMatcher.on(queryEngine)
	}

	def getManifestation(Variable variable) {
		val iterator = manifestationMatcher.getAllValuesOfManifestation(traceModelId, variable).iterator
		if (!iterator.hasNext) {
			throw new IllegalArgumentException("No manifestation for variable: " + variable)
		}
		val manifestation = iterator.next
		if (iterator.hasNext) {
			throw new IllegalArgumentException("Multiple manifestations for variable: " + variable)
		}
		manifestation
	}
}
