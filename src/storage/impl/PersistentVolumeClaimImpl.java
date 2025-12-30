/**
 */
package storage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import storage.PersistentVolume;
import storage.PersistentVolumeClaim;
import storage.StoragePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistent Volume Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link storage.impl.PersistentVolumeClaimImpl#getPersistentVolume <em>Persistent Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistentVolumeClaimImpl extends MinimalEObjectImpl.Container implements PersistentVolumeClaim {
	/**
	 * The cached value of the '{@link #getPersistentVolume() <em>Persistent Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentVolume()
	 * @generated
	 * @ordered
	 */
	protected PersistentVolume persistentVolume;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistentVolumeClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistentVolume getPersistentVolume() {
		if (persistentVolume != null && persistentVolume.eIsProxy()) {
			InternalEObject oldPersistentVolume = (InternalEObject)persistentVolume;
			persistentVolume = (PersistentVolume)eResolveProxy(oldPersistentVolume);
			if (persistentVolume != oldPersistentVolume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StoragePackage.PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME, oldPersistentVolume, persistentVolume));
			}
		}
		return persistentVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentVolume basicGetPersistentVolume() {
		return persistentVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistentVolume(PersistentVolume newPersistentVolume) {
		PersistentVolume oldPersistentVolume = persistentVolume;
		persistentVolume = newPersistentVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoragePackage.PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME, oldPersistentVolume, persistentVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME:
				if (resolve) return getPersistentVolume();
				return basicGetPersistentVolume();
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
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME:
				setPersistentVolume((PersistentVolume)newValue);
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
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME:
				setPersistentVolume((PersistentVolume)null);
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
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME:
				return persistentVolume != null;
		}
		return super.eIsSet(featureID);
	}

} //PersistentVolumeClaimImpl
