/**
 */
package hu.bme.mit.inf.viewmodel.benchmarks.models.dependability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityModel#getErrorModels <em>Error Models</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage#getDependabilityModel()
 * @model
 * @generated
 */
public interface DependabilityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Models</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.ErrorModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Models</em>' containment reference list.
	 * @see hu.bme.mit.inf.viewmodel.benchmarks.models.dependability.DependabilityPackage#getDependabilityModel_ErrorModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ErrorModel> getErrorModels();

} // DependabilityModel
