/**
 */
package security;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://krosskube/kubernetes/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link security.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.impl.RoleImpl
	 * @see security.impl.SecurityPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security.impl.ServiceAccountImpl <em>Service Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.impl.ServiceAccountImpl
	 * @see security.impl.SecurityPackageImpl#getServiceAccount()
	 * @generated
	 */
	int SERVICE_ACCOUNT = 1;

	/**
	 * The number of structural features of the '<em>Service Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACCOUNT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link security.impl.RoleBindingImpl <em>Role Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see security.impl.RoleBindingImpl
	 * @see security.impl.SecurityPackageImpl#getRoleBinding()
	 * @generated
	 */
	int ROLE_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Service Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__SERVICE_ACCOUNT = 1;

	/**
	 * The number of structural features of the '<em>Role Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link security.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see security.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link security.ServiceAccount <em>Service Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Account</em>'.
	 * @see security.ServiceAccount
	 * @generated
	 */
	EClass getServiceAccount();

	/**
	 * Returns the meta object for class '{@link security.RoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Binding</em>'.
	 * @see security.RoleBinding
	 * @generated
	 */
	EClass getRoleBinding();

	/**
	 * Returns the meta object for the reference '{@link security.RoleBinding#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see security.RoleBinding#getRole()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EReference getRoleBinding_Role();

	/**
	 * Returns the meta object for the reference '{@link security.RoleBinding#getServiceAccount <em>Service Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Account</em>'.
	 * @see security.RoleBinding#getServiceAccount()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EReference getRoleBinding_ServiceAccount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link security.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.impl.RoleImpl
		 * @see security.impl.SecurityPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link security.impl.ServiceAccountImpl <em>Service Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.impl.ServiceAccountImpl
		 * @see security.impl.SecurityPackageImpl#getServiceAccount()
		 * @generated
		 */
		EClass SERVICE_ACCOUNT = eINSTANCE.getServiceAccount();

		/**
		 * The meta object literal for the '{@link security.impl.RoleBindingImpl <em>Role Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see security.impl.RoleBindingImpl
		 * @see security.impl.SecurityPackageImpl#getRoleBinding()
		 * @generated
		 */
		EClass ROLE_BINDING = eINSTANCE.getRoleBinding();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING__ROLE = eINSTANCE.getRoleBinding_Role();

		/**
		 * The meta object literal for the '<em><b>Service Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING__SERVICE_ACCOUNT = eINSTANCE.getRoleBinding_ServiceAccount();

	}

} //SecurityPackage
