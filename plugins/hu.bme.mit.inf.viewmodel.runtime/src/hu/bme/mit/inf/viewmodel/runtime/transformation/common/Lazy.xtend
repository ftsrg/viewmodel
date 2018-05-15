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

import java.util.function.Supplier
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class Lazy<T> {
	val Supplier<T> supplier
	var T t
	
	def get() {
		if (t === null) {
			t = supplier.get
		}
		t
	}
	
	static def <T> of(Supplier<T> supplier) {
		new Lazy(supplier)
	}
	
	static def <T> of(T t) {
		new Lazy[t]
	}
}