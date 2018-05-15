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
