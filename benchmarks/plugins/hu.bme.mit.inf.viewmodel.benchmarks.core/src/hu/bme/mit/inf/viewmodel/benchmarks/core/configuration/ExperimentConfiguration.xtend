package hu.bme.mit.inf.viewmodel.benchmarks.core.configuration

import com.google.gson.annotations.SerializedName
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class ExperimentConfiguration {
	public static val DEFAULT_MODIFICATION_MIX = "none"

	@SerializedName("model")
	String modelName

	@SerializedName("transformationCase")
	TransformationCase transformationCase

	@SerializedName("experiment")
	String experimentName

	@SerializedName("modificationMix")
	String modificationMixName

	def getModificationMixNameOrDefault() {
		modificationMixName ?: DEFAULT_MODIFICATION_MIX
	}
}
