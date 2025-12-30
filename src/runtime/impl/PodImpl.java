/**
 */
package runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import runtime.Namespace;
import runtime.Pod;
import runtime.RuntimePackage;

import security.ServiceAccount;

import storage.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link runtime.impl.PodImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link runtime.impl.PodImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link runtime.impl.PodImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link runtime.impl.PodImpl#getServiceAccount <em>Service Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PodImpl extends MinimalEObjectImpl.Container implements Pod {
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<runtime.Container> containers;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace namespace;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

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
	protected PodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.POD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<runtime.Container> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<runtime.Container>(runtime.Container.class, this, RuntimePackage.POD__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace() {
		if (namespace != null && namespace.eIsProxy()) {
			InternalEObject oldNamespace = (InternalEObject)namespace;
			namespace = (Namespace)eResolveProxy(oldNamespace);
			if (namespace != oldNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.POD__NAMESPACE, oldNamespace, namespace));
			}
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(Namespace newNamespace) {
		Namespace oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.POD__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectResolvingEList<Volume>(Volume.class, this, RuntimePackage.POD__VOLUMES);
		}
		return volumes;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.POD__SERVICE_ACCOUNT, oldServiceAccount, serviceAccount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.POD__SERVICE_ACCOUNT, oldServiceAccount, serviceAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.POD__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.POD__CONTAINERS:
				return getContainers();
			case RuntimePackage.POD__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
			case RuntimePackage.POD__VOLUMES:
				return getVolumes();
			case RuntimePackage.POD__SERVICE_ACCOUNT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.POD__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends runtime.Container>)newValue);
				return;
			case RuntimePackage.POD__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case RuntimePackage.POD__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends Volume>)newValue);
				return;
			case RuntimePackage.POD__SERVICE_ACCOUNT:
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
			case RuntimePackage.POD__CONTAINERS:
				getContainers().clear();
				return;
			case RuntimePackage.POD__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case RuntimePackage.POD__VOLUMES:
				getVolumes().clear();
				return;
			case RuntimePackage.POD__SERVICE_ACCOUNT:
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
			case RuntimePackage.POD__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case RuntimePackage.POD__NAMESPACE:
				return namespace != null;
			case RuntimePackage.POD__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case RuntimePackage.POD__SERVICE_ACCOUNT:
				return serviceAccount != null;
		}
		return super.eIsSet(featureID);
	}

} //PodImpl
