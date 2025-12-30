/**
 */
package storage.impl;

import config.ConfigMap;
import config.Secret;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import storage.PersistentVolumeClaim;
import storage.StoragePackage;
import storage.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link storage.impl.VolumeImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link storage.impl.VolumeImpl#getSecret <em>Secret</em>}</li>
 *   <li>{@link storage.impl.VolumeImpl#getConfigMap <em>Config Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends MinimalEObjectImpl.Container implements Volume {
	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected PersistentVolumeClaim claim;

	/**
	 * The cached value of the '{@link #getSecret() <em>Secret</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected Secret secret;

	/**
	 * The cached value of the '{@link #getConfigMap() <em>Config Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigMap()
	 * @generated
	 * @ordered
	 */
	protected ConfigMap configMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoragePackage.Literals.VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistentVolumeClaim getClaim() {
		if (claim != null && claim.eIsProxy()) {
			InternalEObject oldClaim = (InternalEObject)claim;
			claim = (PersistentVolumeClaim)eResolveProxy(oldClaim);
			if (claim != oldClaim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StoragePackage.VOLUME__CLAIM, oldClaim, claim));
			}
		}
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentVolumeClaim basicGetClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClaim(PersistentVolumeClaim newClaim) {
		PersistentVolumeClaim oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoragePackage.VOLUME__CLAIM, oldClaim, claim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Secret getSecret() {
		if (secret != null && secret.eIsProxy()) {
			InternalEObject oldSecret = (InternalEObject)secret;
			secret = (Secret)eResolveProxy(oldSecret);
			if (secret != oldSecret) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StoragePackage.VOLUME__SECRET, oldSecret, secret));
			}
		}
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secret basicGetSecret() {
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecret(Secret newSecret) {
		Secret oldSecret = secret;
		secret = newSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoragePackage.VOLUME__SECRET, oldSecret, secret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigMap getConfigMap() {
		if (configMap != null && configMap.eIsProxy()) {
			InternalEObject oldConfigMap = (InternalEObject)configMap;
			configMap = (ConfigMap)eResolveProxy(oldConfigMap);
			if (configMap != oldConfigMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StoragePackage.VOLUME__CONFIG_MAP, oldConfigMap, configMap));
			}
		}
		return configMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigMap basicGetConfigMap() {
		return configMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigMap(ConfigMap newConfigMap) {
		ConfigMap oldConfigMap = configMap;
		configMap = newConfigMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoragePackage.VOLUME__CONFIG_MAP, oldConfigMap, configMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StoragePackage.VOLUME__CLAIM:
				if (resolve) return getClaim();
				return basicGetClaim();
			case StoragePackage.VOLUME__SECRET:
				if (resolve) return getSecret();
				return basicGetSecret();
			case StoragePackage.VOLUME__CONFIG_MAP:
				if (resolve) return getConfigMap();
				return basicGetConfigMap();
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
			case StoragePackage.VOLUME__CLAIM:
				setClaim((PersistentVolumeClaim)newValue);
				return;
			case StoragePackage.VOLUME__SECRET:
				setSecret((Secret)newValue);
				return;
			case StoragePackage.VOLUME__CONFIG_MAP:
				setConfigMap((ConfigMap)newValue);
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
			case StoragePackage.VOLUME__CLAIM:
				setClaim((PersistentVolumeClaim)null);
				return;
			case StoragePackage.VOLUME__SECRET:
				setSecret((Secret)null);
				return;
			case StoragePackage.VOLUME__CONFIG_MAP:
				setConfigMap((ConfigMap)null);
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
			case StoragePackage.VOLUME__CLAIM:
				return claim != null;
			case StoragePackage.VOLUME__SECRET:
				return secret != null;
			case StoragePackage.VOLUME__CONFIG_MAP:
				return configMap != null;
		}
		return super.eIsSet(featureID);
	}

} //VolumeImpl
