/**
 */
package security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link security.RoleBinding#getRole <em>Role</em>}</li>
 *   <li>{@link security.RoleBinding#getServiceAccount <em>Service Account</em>}</li>
 * </ul>
 *
 * @see security.SecurityPackage#getRoleBinding()
 * @model
 * @generated
 */
public interface RoleBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see security.SecurityPackage#getRoleBinding_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link security.RoleBinding#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Service Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Account</em>' reference.
	 * @see #setServiceAccount(ServiceAccount)
	 * @see security.SecurityPackage#getRoleBinding_ServiceAccount()
	 * @model
	 * @generated
	 */
	ServiceAccount getServiceAccount();

	/**
	 * Sets the value of the '{@link security.RoleBinding#getServiceAccount <em>Service Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Account</em>' reference.
	 * @see #getServiceAccount()
	 * @generated
	 */
	void setServiceAccount(ServiceAccount value);

} // RoleBinding
