package hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation

import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Constraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.EquivalenceConstraint
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.Variable
import hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter.ILogicModelManager
import java.util.Collection
import org.eclipse.xtend.lib.annotations.Delegate
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class DirtyMarkingLogicModelManager implements ILogicModelManager {
	@Delegate val ILogicModelManager delegateManager
	val ManifestationTraceManager manifestationTraceManager

	override newVariable() {
		val variable = newVariable
		markClustersDirty()
		variable
	}

	override addEquivalenceConstraint(Variable left, Variable right) {
		val constraint = delegateManager.addEquivalenceConstraint(left, right)
		markClustersDirty()
		constraint
	}
	
	override removeVariables(Collection<Variable> variables) {
		delegateManager.removeVariables(variables)
		markClustersDirty()
	}

	override removeConstraints(Collection<Constraint> constraints) {
		delegateManager.removeConstraints(constraints)
		if (constraints.exists[it instanceof EquivalenceConstraint]) {
			markClustersDirty()
		}
	}

	protected def markClustersDirty() {
		manifestationTraceManager.markDirty
	}
}
