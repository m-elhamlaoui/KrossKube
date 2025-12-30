/**
 */
package storage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import storage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StorageFactoryImpl extends EFactoryImpl implements StorageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StorageFactory init() {
		try {
			StorageFactory theStorageFactory = (StorageFactory)EPackage.Registry.INSTANCE.getEFactory(StoragePackage.eNS_URI);
			if (theStorageFactory != null) {
				return theStorageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StorageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StoragePackage.EXTERNAL_STORAGE: return createExternalStorage();
			case StoragePackage.PERSISTENT_VOLUME: return createPersistentVolume();
			case StoragePackage.PERSISTENT_VOLUME_CLAIM: return createPersistentVolumeClaim();
			case StoragePackage.VOLUME: return createVolume();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalStorage createExternalStorage() {
		ExternalStorageImpl externalStorage = new ExternalStorageImpl();
		return externalStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistentVolume createPersistentVolume() {
		PersistentVolumeImpl persistentVolume = new PersistentVolumeImpl();
		return persistentVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistentVolumeClaim createPersistentVolumeClaim() {
		PersistentVolumeClaimImpl persistentVolumeClaim = new PersistentVolumeClaimImpl();
		return persistentVolumeClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoragePackage getStoragePackage() {
		return (StoragePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StoragePackage getPackage() {
		return StoragePackage.eINSTANCE;
	}

} //StorageFactoryImpl
