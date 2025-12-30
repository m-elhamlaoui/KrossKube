/**
 */
package runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link runtime.Service#getPods <em>Pods</em>}</li>
 * </ul>
 *
 * @see runtime.RuntimePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Pods</b></em>' reference list.
	 * The list contents are of type {@link runtime.Pod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pods</em>' reference list.
	 * @see runtime.RuntimePackage#getService_Pods()
	 * @model
	 * @generated
	 */
	EList<Pod> getPods();

} // Service
