/**
 */
package security.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import security.Role;
import security.RoleBinding;
import security.SecurityPackage;
import security.ServiceAccount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link security.impl.RoleBindingImpl#getRole <em>Role</em>}</li>
 *   <li>{@link security.impl.RoleBindingImpl#getServiceAccount <em>Service Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleBindingImpl extends MinimalEObjectImpl.Container implements RoleBinding {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getServiceAccount() <em>Service Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceAccount()
	 * @generated
	 * @ordered
	 */
	protected ServiceAccount serviceAccount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.ROLE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.ROLE_BINDING__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.ROLE_BINDING__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceAccount getServiceAccount() {
		if (serviceAccount != null && serviceAccount.eIsProxy()) {
			InternalEObject oldServiceAccount = (InternalEObject)serviceAccount;
			serviceAccount = (ServiceAccount)eResolveProxy(oldServiceAccount);
			if (serviceAccount != oldServiceAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.ROLE_BINDING__SERVICE_ACCOUNT, oldServiceAccount, serviceAccount));
			}
		}
		return serviceAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAccount basicGetServiceAccount() {
		return serviceAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceAccount(ServiceAccount newServiceAccount) {
		ServiceAccount oldServiceAccount = serviceAccount;
		serviceAccount = newServiceAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.ROLE_BINDING__SERVICE_ACCOUNT, oldServiceAccount, serviceAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.ROLE_BINDING__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case SecurityPackage.ROLE_BINDING__SERVICE_ACCOUNT:
				if (resolve) return getServiceAccount();
				return basicGetServiceAccount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPackage.ROLE_BINDING__ROLE:
				setRole((Role)newValue);
				return;
			case SecurityPackage.ROLE_BINDING__SERVICE_ACCOUNT:
				setServiceAccount((ServiceAccount)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SecurityPackage.ROLE_BINDING__ROLE:
				setRole((Role)null);
				return;
			case SecurityPackage.ROLE_BINDING__SERVICE_ACCOUNT:
				setServiceAccount((ServiceAccount)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecurityPackage.ROLE_BINDING__ROLE:
				return role != null;
			case SecurityPackage.ROLE_BINDING__SERVICE_ACCOUNT:
				return serviceAccount != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleBindingImpl
