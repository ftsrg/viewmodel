package hu.bme.mit.inf.viewmodel.benchmarks.core.modification

import hu.bme.mit.inf.viewmodel.benchmarks.models.railway.RailwayElement
import java.util.Comparator
import org.eclipse.viatra.query.runtime.api.IPatternMatch

class MatchComparator implements Comparator<IPatternMatch> {
	
	override compare(IPatternMatch o1, IPatternMatch o2) {
		val parameterCount = o1.specification.parameters.size
		for (var int i = 0; i < parameterCount; i++) {
			val left = o1.get(i) as RailwayElement
			val right = o2.get(i) as RailwayElement
			val result = left.id.compareTo(right.id)
			if (result != 0) {
				return result
			}
		}
		0
	}
	
}
