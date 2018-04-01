package hu.bme.mit.inf.viewmodel.benchmarks.core.configuration

import com.google.gson.annotations.SerializedName
import hu.bme.mit.inf.viewmodel.benchmarks.core.modification.ModelModification
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class BenchmarksConfiguration {

	@SerializedName("randomSeed")
	long randomSeed

	@SerializedName("warmup")
	int warmupIterations

	@SerializedName("iterations")
	int iterations
	
	@SerializedName("saveTargets")
	boolean saveTargets
	
	@SerializedName("gcSleep")
	int gcSleep

	@SerializedName("modelPath")
	String modelPath

	@SerializedName("outputPath")
	String outputPath

	@SerializedName("modifications")
	Map<String, Map<ModelModification, Integer>> modificationMixes

	@SerializedName("experiments")
	List<ExperimentConfiguration> experimentConfigurations
}
