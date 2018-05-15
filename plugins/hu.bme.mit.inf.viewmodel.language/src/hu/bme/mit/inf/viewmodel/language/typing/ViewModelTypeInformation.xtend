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
package hu.bme.mit.inf.viewmodel.language.typing

import com.google.inject.Inject
import hu.bme.mit.inf.viewmodel.language.model.viewmodellanguage.RuleDefinition
import java.util.HashSet
import org.eclipse.viatra.query.patternlanguage.typing.ITypeSystem
import org.eclipse.viatra.query.patternlanguage.typing.TypeInformation

class ViewModelTypeInformation extends TypeInformation {
	
	val processedRuleDefinitions = new HashSet<RuleDefinition>
	
	@Inject
	new(ITypeSystem typeSystem) {
		super(typeSystem)
	}
	
	def isProcessed(RuleDefinition pattern) {
		processedRuleDefinitions.contains(pattern)
	}
	
	def void setProcessed(RuleDefinition pattern) {
		processedRuleDefinitions.add(pattern)
	}
}