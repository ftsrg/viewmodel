package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import com.google.common.base.Preconditions
import java.util.HashMap
import java.util.Map
import org.eclipse.viatra.transformation.evm.api.RuleSpecification
import org.eclipse.viatra.transformation.evm.specific.resolver.ReconfigurableConflictResolver

class CreateDeletePriorityConflictResolver extends ReconfigurableConflictResolver<CreateDeletePriorityConflictSet> {
	
	val Map<RuleSpecification<?>, CreateDeletePriority> priorities = new HashMap
	
	public def void setPriority(RuleSpecification<?> specification, CreateDeletePriority priority) {
        Preconditions.checkArgument(specification !== null, "Specification cannot be null!")
        val oldPriority = priorities.get(specification)
        if(oldPriority !== null && oldPriority == priority) {
            return // no change required
        }
        priorities.put(specification, priority)
        for (weakReference : conflictSets) {
            val conflictSet = weakReference.get
            if(conflictSet !== null) {
                conflictSet.setPriority(specification, priority)
            }
        }
    }
	
	override protected createReconfigurableConflictSet() {
		new CreateDeletePriorityConflictSet(this, priorities)
	}
	
}