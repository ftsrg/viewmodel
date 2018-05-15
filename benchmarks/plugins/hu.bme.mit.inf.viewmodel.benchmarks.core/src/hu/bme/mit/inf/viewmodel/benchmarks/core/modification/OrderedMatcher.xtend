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

import com.scottlogic.util.SortedList
import java.util.Random
import java.util.function.Consumer
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.IMatchUpdateListener
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

class OrderedMatcher<Match extends IPatternMatch> implements IMatchUpdateListener<Match> {
	val ViatraQueryMatcher<? extends Match> matcher
	val SortedList<Match> orderedMatches
	
	new(ViatraQueryMatcher<? extends Match> matcher) {
		this.matcher = matcher
		AdvancedViatraQueryEngine.from(matcher.engine).addMatchUpdateListener(matcher, this, false)
		orderedMatches = new SortedList(new MatchComparator)
		orderedMatches.addAll(matcher.allMatches)
	}
	
	def dispose() {
		AdvancedViatraQueryEngine.from(matcher.engine).removeMatchUpdateListener(matcher, this)
	}
	
	override notifyAppearance(Match match) {
		orderedMatches += match
	}
	
	override notifyDisappearance(Match match) {
		orderedMatches -= match
	}
	
	def getOneRandomMatch(Random r) {
		val index = r.nextInt(orderedMatches.size)
		orderedMatches.get(index)
	}
	
	def forOneRandomMatch(Random r, Consumer<? super Match> f) {
		f.accept(getOneRandomMatch(r))
	}
	
	static def <Match extends IPatternMatch> from(ViatraQueryMatcher<? extends Match> matcher) {
		new OrderedMatcher(matcher)
	}
}
