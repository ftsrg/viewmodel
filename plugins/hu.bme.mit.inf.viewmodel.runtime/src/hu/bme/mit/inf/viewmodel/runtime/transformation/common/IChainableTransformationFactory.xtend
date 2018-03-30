package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

interface IChainableTransformationFactory {
	def IChainableTransformation createTransformation(ViatraQueryEngine queryEngine)
}