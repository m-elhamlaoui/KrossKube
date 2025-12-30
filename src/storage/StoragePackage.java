/**
 */
package storage;

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
 * @see storage.StorageFactory
 * @model kind="package"
 * @generated
 */
public interface StoragePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "storage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://krosskube/kubernetes/storage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "storage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoragePackage eINSTANCE = storage.impl.StoragePackageImpl.init();

	/**
	 * The meta object id for the '{@link storage.impl.ExternalStorageImpl <em>External Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see storage.impl.ExternalStorageImpl
	 * @see storage.impl.StoragePackageImpl#getExternalStorage()
	 * @generated
	 */
	int EXTERNAL_STORAGE = 0;

	/**
	 * The number of structural features of the '<em>External Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_STORAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>External Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_STORAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link storage.impl.PersistentVolumeImpl <em>Persistent Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see storage.impl.PersistentVolumeImpl
	 * @see storage.impl.StoragePackageImpl#getPersistentVolume()
	 * @generated
	 */
	int PERSISTENT_VOLUME = 1;

	/**
	 * The feature id for the '<em><b>External Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__EXTERNAL_STORAGE = 0;

	/**
	 * The number of structural features of the '<em>Persistent Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Persistent Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link storage.impl.PersistentVolumeClaimImpl <em>Persistent Volume Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see storage.impl.PersistentVolumeClaimImpl
	 * @see storage.impl.StoragePackageImpl#getPersistentVolumeClaim()
	 * @generated
	 */
	int PERSISTENT_VOLUME_CLAIM = 2;

	/**
	 * The feature id for the '<em><b>Persistent Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME = 0;

	/**
	 * The number of structural features of the '<em>Persistent Volume Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Persistent Volume Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_CLAIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link storage.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see storage.impl.VolumeImpl
	 * @see storage.impl.StoragePackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 3;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__CLAIM = 0;

	/**
	 * The feature id for the '<em><b>Secret</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SECRET = 1;

	/**
	 * The feature id for the '<em><b>Config Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__CONFIG_MAP = 2;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link storage.ExternalStorage <em>External Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Storage</em>'.
	 * @see storage.ExternalStorage
	 * @generated
	 */
	EClass getExternalStorage();

	/**
	 * Returns the meta object for class '{@link storage.PersistentVolume <em>Persistent Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistent Volume</em>'.
	 * @see storage.PersistentVolume
	 * @generated
	 */
	EClass getPersistentVolume();

	/**
	 * Returns the meta object for the reference '{@link storage.PersistentVolume#getExternalStorage <em>External Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>External Storage</em>'.
	 * @see storage.PersistentVolume#getExternalStorage()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EReference getPersistentVolume_ExternalStorage();

	/**
	 * Returns the meta object for class '{@link storage.PersistentVolumeClaim <em>Persistent Volume Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistent Volume Claim</em>'.
	 * @see storage.PersistentVolumeClaim
	 * @generated
	 */
	EClass getPersistentVolumeClaim();

	/**
	 * Returns the meta object for the reference '{@link storage.PersistentVolumeClaim#getPersistentVolume <em>Persistent Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persistent Volume</em>'.
	 * @see storage.PersistentVolumeClaim#getPersistentVolume()
	 * @see #getPersistentVolumeClaim()
	 * @generated
	 */
	EReference getPersistentVolumeClaim_PersistentVolume();

	/**
	 * Returns the meta object for class '{@link storage.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see storage.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the reference '{@link storage.Volume#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claim</em>'.
	 * @see storage.Volume#getClaim()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Claim();

	/**
	 * Returns the meta object for the reference '{@link storage.Volume#getSecret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secret</em>'.
	 * @see storage.Volume#getSecret()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Secret();

	/**
	 * Returns the meta object for the reference '{@link storage.Volume#getConfigMap <em>Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Map</em>'.
	 * @see storage.Volume#getConfigMap()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_ConfigMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StorageFactory getStorageFactory();

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
		 * The meta object literal for the '{@link storage.impl.ExternalStorageImpl <em>External Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see storage.impl.ExternalStorageImpl
		 * @see storage.impl.StoragePackageImpl#getExternalStorage()
		 * @generated
		 */
		EClass EXTERNAL_STORAGE = eINSTANCE.getExternalStorage();

		/**
		 * The meta object literal for the '{@link storage.impl.PersistentVolumeImpl <em>Persistent Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see storage.impl.PersistentVolumeImpl
		 * @see storage.impl.StoragePackageImpl#getPersistentVolume()
		 * @generated
		 */
		EClass PERSISTENT_VOLUME = eINSTANCE.getPersistentVolume();

		/**
		 * The meta object literal for the '<em><b>External Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENT_VOLUME__EXTERNAL_STORAGE = eINSTANCE.getPersistentVolume_ExternalStorage();

		/**
		 * The meta object literal for the '{@link storage.impl.PersistentVolumeClaimImpl <em>Persistent Volume Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see storage.impl.PersistentVolumeClaimImpl
		 * @see storage.impl.StoragePackageImpl#getPersistentVolumeClaim()
		 * @generated
		 */
		EClass PERSISTENT_VOLUME_CLAIM = eINSTANCE.getPersistentVolumeClaim();

		/**
		 * The meta object literal for the '<em><b>Persistent Volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME = eINSTANCE.getPersistentVolumeClaim_PersistentVolume();

		/**
		 * The meta object literal for the '{@link storage.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see storage.impl.VolumeImpl
		 * @see storage.impl.StoragePackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Claim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__CLAIM = eINSTANCE.getVolume_Claim();

		/**
		 * The meta object literal for the '<em><b>Secret</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__SECRET = eINSTANCE.getVolume_Secret();

		/**
		 * The meta object literal for the '<em><b>Config Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__CONFIG_MAP = eINSTANCE.getVolume_ConfigMap();

	}

} //StoragePackage
