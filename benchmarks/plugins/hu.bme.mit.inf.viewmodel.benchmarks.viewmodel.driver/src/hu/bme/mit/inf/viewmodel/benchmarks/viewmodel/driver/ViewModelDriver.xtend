package hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.driver

import com.google.common.collect.Iterators
import hu.bme.mit.inf.viewmodel.benchmarks.core.configuration.TransformationCase
import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import hu.bme.mit.inf.viewmodel.benchmarks.core.driver.ExperimentDriver
import hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.dependability.Dependability2PetriNet
import hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.stochasticpetrinet.TrainBenchmark2PetriNet
import hu.bme.mit.inf.viewmodel.benchmarks.viewmodel.virtualswitchview.RailwayModel2VirtualSwitchModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.InterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.LogicModel
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.PrimitiveManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.logicmodel.UninterpretedManifestation
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.ConstraintTrace
import hu.bme.mit.inf.viewmodel.runtime.model.viewmodeltrace.VariableInstantiationTrace
import hu.bme.mit.inf.viewmodel.runtime.specification.VariableInstantiationRuleSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.ViewSpecification
import hu.bme.mit.inf.viewmodel.runtime.specification.viatraquery.QuerySpecificationTemplateParser
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.IChainableTransformation
import hu.bme.mit.inf.viewmodel.runtime.transformation.common.TransformationChain.ChainedTransformation
import hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter.LogicModelManager
import hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter.ViewModelTraceManager
import hu.bme.mit.inf.viewmodel.runtime.transformation.interpreter.ViewModelTransformation
import hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation.ManifestationTraceManager
import hu.bme.mit.inf.viewmodel.runtime.transformation.manifestation.ViewModelManifestation
import hu.bme.mit.inf.viewmodel.runtime.utils.BadlyBehavingFeatureUtils
import hu.bme.mit.inf.viewmodel.runtime.utils.EmfScopeUtils
import hu.bme.mit.inf.viewmodel.runtime.utils.NullScheduler
import java.util.HashSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IQueryGroup
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.base.api.BaseIndexOptions
import org.eclipse.viatra.query.runtime.base.api.IndexingLevel
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.evm.api.ExecutionSchema
import org.eclipse.viatra.transformation.evm.specific.ExecutionSchemas

abstract class ViewModelDriver extends ExperimentDriver {
	protected val ManifestationMode manifestationMode
	protected val ViewSpecification<? extends IQuerySpecification<?>, ? extends IQuerySpecification<?>> viewSpecification
	protected val IQueryGroup preconditionQueryGroup

	protected var ViatraQueryEngine queryEngine
	protected var LogicModelManager logicModelManager
	protected var ViewModelTraceManager traceManager
	protected var ManifestationStatisticsDecorator manifestationManager
	protected var IChainableTransformation viewTransformation
	protected var IChainableTransformation manifestationTransformation
	protected var IChainableTransformation chainedTransformation
	protected var ExecutionSchema executionSchema

	new(ExperimentContext experimentContext, ManifestationMode manifestationMode) {
		super(experimentContext)
		this.manifestationMode = manifestationMode
		viewSpecification = getViewSpecification(transformationCase)
		val preconditionQueries = new HashSet
		for (specification : viewSpecification.ruleSpecifications) {
			switch (specification) {
				VariableInstantiationRuleSpecification<? extends IQuerySpecification<?>, ? extends IQuerySpecification<?>>:
					preconditionQueries += specification.preconditionPattern
			}
		}
		preconditionQueryGroup = new GenericQueryGroup(preconditionQueries)
	}

	private static def getViewSpecification(TransformationCase transformationCase) {
		switch (transformationCase) {
			case PETRI_NET: TrainBenchmark2PetriNet.createSpecification
			case VIRTUAL_SWITCH: RailwayModel2VirtualSwitchModel.createSpecification
			case DEPENDABILITY: Dependability2PetriNet.createSpecification
			default: throw new IllegalArgumentException("Unknown case: " + transformationCase)
		}
	}

	override protected loadModel() {
		super.loadModel()
		if (dependabilityModel !== null) {
			// Move the dependability model to the same resource as the railway model,
			// so that the VIATRA Query scope roots can be managed more easily.
			resource.contents += dependabilityModel
		}
	}

	protected def createQueryEngine() {
		val baseIndexOptions = new BaseIndexOptions().withWildcardLevel(IndexingLevel.FULL)
		queryEngine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(resource, baseIndexOptions))
		preconditionQueryGroup.prepare(queryEngine)
	}

	protected def initTransformation() {
		logicModelManager = new LogicModelManager(resource)
		traceManager = new ViewModelTraceManager(resource, logicModelManager.logicModel)
		val baseManifestationManager = getBaseManifestationManager(resource, logicModelManager.logicModel)
		manifestationManager = new ManifestationStatisticsDecorator(baseManifestationManager)
		val specification = QuerySpecificationTemplateParser.parse(viewSpecification)
		BadlyBehavingFeatureUtils.registerEcorePackageAsWellBehaving
		EmfScopeUtils.addMetamodelsToScope(queryEngine, specification.requiredMetamodels)
		viewTransformation = new ViewModelTransformation(specification, traceManager, logicModelManager).
			createTransformation(queryEngine)
		manifestationTransformation = new ViewModelManifestation(manifestationManager).createTransformation(queryEngine)
		chainedTransformation = new ChainedTransformation(queryEngine,
			#[viewTransformation, manifestationTransformation], false)
		val schedulerFactory = NullScheduler.factory
		val conflictResolver = chainedTransformation.conflictResolver
		executionSchema = ExecutionSchemas.createViatraQueryExecutionSchema(queryEngine, schedulerFactory,
			conflictResolver)
	}

	protected def getBaseManifestationManager(Resource resource, LogicModel logicModel) {
		switch (manifestationMode) {
			case PHYSICAL: new ManifestationTraceManager(resource, logicModel)
			case MOCK: new MockManifestationTraceManager(resource, logicModel)
			default: throw new IllegalArgumentException("Unknown manifestation mode: " + manifestationMode)
		}
	}

	protected def logViewModelTrace(String checkpoint) {
		var int variableInstantiationTraces = 0
		var int constraintTraces = 0
		var int variables = 0
		var int constraints = 0
		for (trace : traceManager.traceModel.traces) {
			switch (trace) {
				VariableInstantiationTrace: {
					variableInstantiationTraces++
					variables += trace.variables.size
				}
				ConstraintTrace: {
					constraintTraces++
					variables += trace.localVariables.size
					constraints += trace.constraints.size
				}
				default:
					throw new IllegalStateException("Unknown trace: " + trace)
			}
		}
		logValue(checkpoint, "trace", "variableInstantiationTraceCount", variableInstantiationTraces)
		logValue(checkpoint, "trace", "constraintTraceCount", constraintTraces)
		logValue(checkpoint, "trace", "traceCount", variableInstantiationTraces + constraintTraces)
		logValue(checkpoint, "trace", "variableCount", variables)
		logValue(checkpoint, "trace", "constraintCount", constraints)
	}

	protected def logLogicModel(String checkpoint) {
		val clusters = logicModelManager.logicModel.clusters.size
		logValue(checkpoint, "logicModel", "clusterCount", clusters)
	}

	protected def logManifestationTrace(String checkpoint) {
		var int interpretedManifestations = 0
		var int uninterpretedManifestations = 0
		var int primitiveManifestations = 0
		for (cluster : logicModelManager.logicModel.clusters) {
			switch (manifestation : cluster.manifestation) {
				InterpretedManifestation:
					interpretedManifestations++
				UninterpretedManifestation:
					uninterpretedManifestations++
				PrimitiveManifestation:
					primitiveManifestations++
				case null: {
					// Do nothing.
				}
				default:
					new IllegalStateException("Unknown manifestation: " + manifestation)
			}
		}
		logValue(checkpoint, "manif", "interpretedManifCount", interpretedManifestations)
		logValue(checkpoint, "manif", "uninterpretedManifCount", uninterpretedManifestations)
		logValue(checkpoint, "manif", "primitiveManifCount", primitiveManifestations)
		logValue(checkpoint, "manif", "manifCount",
			interpretedManifestations + uninterpretedManifestations + primitiveManifestations)
		logValue(checkpoint, "manif", "eObjectsCreated", manifestationManager.EObjectsCreated)
		logValue(checkpoint, "manif", "eObjectConstantsCreated", manifestationManager.EObjectConstantsCreated)
		logValue(checkpoint, "manif", "primitiveConstantsCreated", manifestationManager.primitiveConstantsCreated)
		logValue(checkpoint, "manif", "manisRemoved", manifestationManager.manifestationsRemoved)
		logValue(checkpoint, "manif", "relationsSet", manifestationManager.relationsSet)
		logValue(checkpoint, "manif", "relationsUnset", manifestationManager.relationsUnset)
		manifestationManager.resetStatistics()
	}

	protected def logTarget(String checkpoint) {
		val resultList = manifestationManager.results
		logValue(checkpoint, "target", "rootCount", resultList.size)
		val allResultsIterator = Iterators.concat(resultList.iterator,
			Iterators.concat(resultList.map[it.eAllContents].iterator))
		logModelStatistics(checkpoint, "target", allResultsIterator)
	}

	override void dispose() {
		if (executionSchema !== null) {
			executionSchema.dispose
		}
		if (queryEngine !== null) {
			AdvancedViatraQueryEngine.from(queryEngine).dispose
		}
		super.dispose()
	}
}
