/**
 */
package runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link runtime.Deployment#getReplicaSet <em>Replica Set</em>}</li>
 * </ul>
 *
 * @see runtime.RuntimePackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Replica Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replica Set</em>' containment reference.
	 * @see #setReplicaSet(ReplicaSet)
	 * @see runtime.RuntimePackage#getDeployment_ReplicaSet()
	 * @model containment="true"
	 * @generated
	 */
	ReplicaSet getReplicaSet();

	/**
	 * Sets the value of the '{@link runtime.Deployment#getReplicaSet <em>Replica Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replica Set</em>' containment reference.
	 * @see #getReplicaSet()
	 * @generated
	 */
	void setReplicaSet(ReplicaSet value);

} // Deployment
