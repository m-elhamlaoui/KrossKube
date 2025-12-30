/**
 */
package storage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import storage.ExternalStorage;
import storage.PersistentVolume;
import storage.StoragePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistent Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link storage.impl.PersistentVolumeImpl#getExternalStorage <em>External Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistentVolumeImpl extends MinimalEObjectImpl.Container implements PersistentVolume {
	/**
	 * The cached value of the '{@link #getExternalStorage() <em>External Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalStorage()
	 * @generated
	 * @ordered
	 */
	protected ExternalStorage externalStorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistentVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StoragePackage.Literals.PERSISTENT_VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalStorage getExternalStorage() {
		if (externalStorage != null && externalStorage.eIsProxy()) {
			InternalEObject oldExternalStorage = (InternalEObject)externalStorage;
			externalStorage = (ExternalStorage)eResolveProxy(oldExternalStorage);
			if (externalStorage != oldExternalStorage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StoragePackage.PERSISTENT_VOLUME__EXTERNAL_STORAGE, oldExternalStorage, externalStorage));
			}
		}
		return externalStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalStorage basicGetExternalStorage() {
		return externalStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalStorage(ExternalStorage newExternalStorage) {
		ExternalStorage oldExternalStorage = externalStorage;
		externalStorage = newExternalStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StoragePackage.PERSISTENT_VOLUME__EXTERNAL_STORAGE, oldExternalStorage, externalStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StoragePackage.PERSISTENT_VOLUME__EXTERNAL_STORAGE:
				if (resolve) return getExternalStorage();
				return basicGetExternalStorage();
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
			case StoragePackage.PERSISTENT_VOLUME__EXTERNAL_STORAGE:
				setExternalStorage((ExternalStorage)newValue);
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
			case StoragePackage.PERSISTENT_VOLUME__EXTERNAL_STORAGE:
				setExternalStorage((ExternalStorage)null);
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
			case StoragePackage.PERSISTENT_VOLUME__EXTERNAL_STORAGE:
				return externalStorage != null;
		}
		return super.eIsSet(featureID);
	}

} //PersistentVolumeImpl
