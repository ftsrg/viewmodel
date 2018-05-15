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
package hu.bme.mit.inf.viewmodel.runtime.utils

import java.util.HashMap
import java.util.regex.Pattern

class VariableNameGenerator {
	static val NUMBERED_NAME_PATTERN = Pattern.compile("(.+)<(\\d+)>?")

	val variableNumbering = new HashMap<String, Integer>

	new() {
		this(emptyList)
	}

	new(Iterable<String> variableNames) {
		for (variableName : variableNames) {
			registerName(variableName)
		}
	}

	private def registerName(String variableName) {
		val matcher = NUMBERED_NAME_PATTERN.matcher(variableName)
		if (matcher.matches) {
			try {
				val prefix = matcher.group(1)
				val number = Integer.parseUnsignedInt(matcher.group(2))
				increateCurrentNumberIfLess(prefix, number)
			} catch (NumberFormatException e) {
				// Variable does not have a valid number, interpret it as a name.
				increateCurrentNumberIfLess(variableName, 0)
			}
		} else {
			increateCurrentNumberIfLess(variableName, 0)
		}
	}

	def getNextName(String prefix) {
		val number = getCurrentNumber(prefix)
		variableNumbering.put(prefix, number + 1)
		if (number == 0) {
			prefix
		} else {
			prefix + "<" + number + ">"
		}
	}

	private def getCurrentNumber(String prefix) {
		variableNumbering.getOrDefault(prefix, 0).intValue
	}

	private def increateCurrentNumberIfLess(String prefix, int newNumber) {
		val currentNumber = getCurrentNumber(prefix)
		if (currentNumber <= newNumber) {
			variableNumbering.put(prefix, newNumber + 1)
		}
	}
}
