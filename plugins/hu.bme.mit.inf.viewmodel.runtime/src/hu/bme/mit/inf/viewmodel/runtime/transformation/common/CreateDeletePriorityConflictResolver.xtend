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