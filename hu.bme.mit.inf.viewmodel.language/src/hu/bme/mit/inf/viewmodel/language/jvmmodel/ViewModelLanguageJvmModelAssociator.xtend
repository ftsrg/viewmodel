package hu.bme.mit.inf.viewmodel.language.jvmmodel

import com.google.inject.Inject
import org.eclipse.viatra.query.patternlanguage.emf.util.IErrorFeedback
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator

class ViewModelLanguageJvmModelAssociator extends JvmModelAssociator {
	
	@Inject IErrorFeedback feedback
	
	override installDerivedState(DerivedStateAwareResource resource, boolean preIndexingPhase) {
		feedback.clearMarkers(resource, IErrorFeedback.JVMINFERENCE_ERROR_TYPE)
		super.installDerivedState(resource, preIndexingPhase)
	}
}