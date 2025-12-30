/**
 */
package runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replica Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link runtime.ReplicaSet#getPods <em>Pods</em>}</li>
 * </ul>
 *
 * @see runtime.RuntimePackage#getReplicaSet()
 * @model
 * @generated
 */
public interface ReplicaSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Pods</b></em>' containment reference list.
	 * The list contents are of type {@link runtime.Pod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pods</em>' containment reference list.
	 * @see runtime.RuntimePackage#getReplicaSet_Pods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pod> getPods();

} // ReplicaSet
