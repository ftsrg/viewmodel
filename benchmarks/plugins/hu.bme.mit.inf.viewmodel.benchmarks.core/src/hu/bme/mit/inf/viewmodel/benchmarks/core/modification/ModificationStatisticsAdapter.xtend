package hu.bme.mit.inf.viewmodel.benchmarks.core.modification

import hu.bme.mit.inf.viewmodel.benchmarks.core.context.ExperimentContext
import java.util.Collection
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EContentAdapter
import org.eclipse.xtend.lib.annotations.Accessors

class ModificationStatisticsAdapter extends EContentAdapter {

	val Set<EObject> createdObjects = new HashSet

	int objectsCreatedBaseline
	@Accessors(PUBLIC_GETTER) int containedObjectsAdded
	@Accessors(PUBLIC_GETTER) int containedObjectsRemoved
	@Accessors(PUBLIC_GETTER) int referencesSet
	@Accessors(PUBLIC_GETTER) int referencesUnset
	@Accessors(PUBLIC_GETTER) int attributesSet
	@Accessors(PUBLIC_GETTER) int attributesUnset

	def getObjectsCreated() {
		objectsCreatedRaw - objectsCreatedBaseline
	}

	private def getObjectsCreatedRaw() {
		createdObjects.size
	}

	def reset() {
		objectsCreatedBaseline = objectsCreatedRaw
		containedObjectsAdded = 0
		containedObjectsRemoved = 0
		referencesSet = 0
		referencesUnset = 0
		attributesSet = 0
		attributesUnset = 0
	}

	def logValues(ExperimentContext it, String checkpoint, String category) {
		logValue(checkpoint, category, "objectsCreated", objectsCreated)
		logValue(checkpoint, category, "containedObjectsAdded", containedObjectsAdded)
		logValue(checkpoint, category, "containedObjectsRemoved", containedObjectsRemoved)
		logValue(checkpoint, category, "referencesSet", referencesSet)
		logValue(checkpoint, category, "referencesUnset", referencesUnset)
		logValue(checkpoint, category, "attributesSet", attributesSet)
		logValue(checkpoint, category, "attributesUnset", attributesUnset)
		reset()
	}

	override notifyChanged(Notification notification) {
		updateFeatureCount(notification)
		super.notifyChanged(notification)
	}

	protected def void updateFeatureCount(Notification notification) {
		switch (feature : notification.feature) {
			EReference:
				switch (notification.eventType) {
					case Notification.SET:
						referencesSet++
					case Notification.UNSET:
						if (notification.oldValue != Boolean.TRUE || notification.oldValue != Boolean.FALSE) {
							referencesUnset++
						}
					case Notification.ADD:
						referencesSet++
					case Notification.REMOVE:
						referencesUnset++
					case Notification.ADD_MANY: {
						val collection = notification.newValue as Collection<?>
						referencesSet += collection.size
					}
					case Notification.REMOVE_MANY: {
						val collection = notification.oldValue as Collection<?>
						referencesUnset += collection.size
					}
					default: {
						// Nothing to do.
					}
				}
			EAttribute:
				switch (notification.eventType) {
					case Notification.SET:
						attributesSet++
					case Notification.UNSET:
						attributesUnset--
					case Notification.ADD:
						attributesSet++
					case Notification.REMOVE:
						attributesUnset++
					case Notification.ADD_MANY: {
						val collection = notification.newValue as Collection<?>
						attributesSet += collection.size
					}
					case Notification.REMOVE_MANY: {
						val collection = notification.oldValue as Collection<?>
						attributesUnset += collection.size
					}
					default: {
						// Nothing to do.
					}
				}
			case null: {
				// Resource and ResourceSet contents.
			}
			default:
				throw new IllegalArgumentException("Unknown feature: " + feature)
		}
	}

	override public addAdapter(Notifier notifier) {
		super.addAdapter(notifier)
		if (notifier instanceof EObject) {
			// containedObjectsAdded may be increased multiple times if
			// notifier is repeatedly added and removed from the containment hierarchy,
			// but createdObjects will stay the same.
			createdObjects += notifier
			containedObjectsAdded++
		}
	}

	override public removeAdapter(Notifier notifier) {
		super.removeAdapter(notifier)
		if (notifier instanceof EObject) {
			containedObjectsRemoved++
		}
	}

}
