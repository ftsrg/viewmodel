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

import org.eclipse.xtend.lib.annotations.Data

@Data
class CreateDeletePriority {
	public static val DEFAULT = CreateDeletePriority.of(0)
	
	val int createPriority
	val int deletePriority
	
	def getMin() {
		Math.min(createPriority, deletePriority)
	}
	
	def getMax() {
		Math.max(createPriority, deletePriority)
	}
	
	def operator_plus(int i) {
		new CreateDeletePriority(createPriority + i, deletePriority + i)
	}
	
	static def of(int createPriority, int deletePriority) {
		new CreateDeletePriority(createPriority, deletePriority)	
	}
	
	static def of(int priority) {
		of(priority, priority)
	}
}