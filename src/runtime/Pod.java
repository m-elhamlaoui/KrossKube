/**
 */
package runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import security.ServiceAccount;

import storage.Volume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link runtime.Pod#getContainers <em>Containers</em>}</li>
 *   <li>{@link runtime.Pod#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link runtime.Pod#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link runtime.Pod#getServiceAccount <em>Service Account</em>}</li>
 * </ul>
 *
 * @see runtime.RuntimePackage#getPod()
 * @model
 * @generated
 */
public interface Pod extends EObject {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link runtime.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see runtime.RuntimePackage#getPod_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see runtime.RuntimePackage#getPod_Namespace()
	 * @model
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link runtime.Pod#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' reference list.
	 * The list contents are of type {@link storage.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' reference list.
	 * @see runtime.RuntimePackage#getPod_Volumes()
	 * @model
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Service Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Account</em>' reference.
	 * @see #setServiceAccount(ServiceAccount)
	 * @see runtime.RuntimePackage#getPod_ServiceAccount()
	 * @model
	 * @generated
	 */
	ServiceAccount getServiceAccount();

	/**
	 * Sets the value of the '{@link runtime.Pod#getServiceAccount <em>Service Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Account</em>' reference.
	 * @see #getServiceAccount()
	 * @generated
	 */
	void setServiceAccount(ServiceAccount value);

} // Pod
