package hu.bme.mit.inf.viewmodel.runtime.utils

import org.eclipse.viatra.transformation.evm.api.ScheduledExecution
import org.eclipse.viatra.transformation.evm.api.Scheduler
import org.eclipse.viatra.transformation.evm.api.Scheduler.ISchedulerFactory

class NullScheduler extends Scheduler {
	
	protected new(ScheduledExecution execution) {
		super(execution)
	}
	
	static def ISchedulerFactory factory() {
		new Factory()
	}
	
	private static class Factory implements ISchedulerFactory {
		
		override prepareScheduler(ScheduledExecution execution) {
			new NullScheduler(execution)
		}
		
	}
	
}