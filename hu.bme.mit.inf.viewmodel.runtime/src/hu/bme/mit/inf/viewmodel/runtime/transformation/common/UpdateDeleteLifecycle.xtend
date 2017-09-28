package hu.bme.mit.inf.viewmodel.runtime.transformation.common

import org.eclipse.viatra.transformation.evm.api.ActivationLifeCycle
import org.eclipse.viatra.transformation.evm.api.event.EventType
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDActivationStateEnum
import org.eclipse.viatra.transformation.evm.specific.crud.CRUDEventTypeEnum
import org.eclipse.viatra.transformation.evm.specific.lifecycle.UnmodifiableActivationLifeCycle

/**
 * An {@link ActivationLifeCycle} with no <code>CREATED</code> activation.
 */
class UpdateDeleteLifecycle extends UnmodifiableActivationLifeCycle {

	new(boolean useUpdated) {
		super(CRUDActivationStateEnum.INACTIVE)

		internalAddStateTransition(CRUDActivationStateEnum.INACTIVE, CRUDEventTypeEnum.CREATED,
			CRUDActivationStateEnum.FIRED)

		if (useUpdated) {
			internalAddStateTransition(CRUDActivationStateEnum.FIRED, CRUDEventTypeEnum.UPDATED,
				CRUDActivationStateEnum.UPDATED)
			internalAddStateTransition(CRUDActivationStateEnum.UPDATED, EventType.RuleEngineEventType.FIRE,
				CRUDActivationStateEnum.FIRED)
			internalAddStateTransition(CRUDActivationStateEnum.UPDATED, CRUDEventTypeEnum.DELETED,
				CRUDActivationStateEnum.DELETED)
		}

		internalAddStateTransition(CRUDActivationStateEnum.FIRED, CRUDEventTypeEnum.DELETED,
			CRUDActivationStateEnum.DELETED)

		if (useUpdated) {
			internalAddStateTransition(CRUDActivationStateEnum.DELETED, CRUDEventTypeEnum.CREATED,
				CRUDActivationStateEnum.UPDATED)
		} else {
			internalAddStateTransition(CRUDActivationStateEnum.DELETED, CRUDEventTypeEnum.CREATED,
				CRUDActivationStateEnum.FIRED)
		}
		internalAddStateTransition(CRUDActivationStateEnum.DELETED, EventType.RuleEngineEventType.FIRE,
			CRUDActivationStateEnum.INACTIVE)
	}

}
