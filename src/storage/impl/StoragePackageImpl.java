/**
 */
package storage.impl;

import config.ConfigPackage;

import config.impl.ConfigPackageImpl;

import multicluster.MulticlusterPackage;

import multicluster.impl.MulticlusterPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import runtime.RuntimePackage;

import runtime.impl.RuntimePackageImpl;

import security.SecurityPackage;

import security.impl.SecurityPackageImpl;

import storage.ExternalStorage;
import storage.PersistentVolume;
import storage.PersistentVolumeClaim;
import storage.StorageFactory;
import storage.StoragePackage;
import storage.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoragePackageImpl extends EPackageImpl implements StoragePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistentVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistentVolumeClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see storage.StoragePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StoragePackageImpl() {
		super(eNS_URI, StorageFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StoragePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StoragePackage init() {
		if (isInited) return (StoragePackage)EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStoragePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StoragePackageImpl theStoragePackage = registeredStoragePackage instanceof StoragePackageImpl ? (StoragePackageImpl)registeredStoragePackage : new StoragePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MulticlusterPackage.eNS_URI);
		MulticlusterPackageImpl theMulticlusterPackage = (MulticlusterPackageImpl)(registeredPackage instanceof MulticlusterPackageImpl ? registeredPackage : MulticlusterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(registeredPackage instanceof ConfigPackageImpl ? registeredPackage : ConfigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(registeredPackage instanceof RuntimePackageImpl ? registeredPackage : RuntimePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(registeredPackage instanceof SecurityPackageImpl ? registeredPackage : SecurityPackage.eINSTANCE);

		// Create package meta-data objects
		theStoragePackage.createPackageContents();
		theMulticlusterPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theStoragePackage.initializePackageContents();
		theMulticlusterPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStoragePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StoragePackage.eNS_URI, theStoragePackage);
		return theStoragePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalStorage() {
		return externalStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistentVolume() {
		return persistentVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistentVolume_ExternalStorage() {
		return (EReference)persistentVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistentVolumeClaim() {
		return persistentVolumeClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistentVolumeClaim_PersistentVolume() {
		return (EReference)persistentVolumeClaimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolume_Claim() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolume_Secret() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolume_ConfigMap() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageFactory getStorageFactory() {
		return (StorageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		externalStorageEClass = createEClass(EXTERNAL_STORAGE);

		persistentVolumeEClass = createEClass(PERSISTENT_VOLUME);
		createEReference(persistentVolumeEClass, PERSISTENT_VOLUME__EXTERNAL_STORAGE);

		persistentVolumeClaimEClass = createEClass(PERSISTENT_VOLUME_CLAIM);
		createEReference(persistentVolumeClaimEClass, PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME);

		volumeEClass = createEClass(VOLUME);
		createEReference(volumeEClass, VOLUME__CLAIM);
		createEReference(volumeEClass, VOLUME__SECRET);
		createEReference(volumeEClass, VOLUME__CONFIG_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConfigPackage theConfigPackage = (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(externalStorageEClass, ExternalStorage.class, "ExternalStorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(persistentVolumeEClass, PersistentVolume.class, "PersistentVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistentVolume_ExternalStorage(), this.getExternalStorage(), null, "externalStorage", null, 0, 1, PersistentVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistentVolumeClaimEClass, PersistentVolumeClaim.class, "PersistentVolumeClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistentVolumeClaim_PersistentVolume(), this.getPersistentVolume(), null, "persistentVolume", null, 0, 1, PersistentVolumeClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVolume_Claim(), this.getPersistentVolumeClaim(), null, "claim", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolume_Secret(), theConfigPackage.getSecret(), null, "secret", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolume_ConfigMap(), theConfigPackage.getConfigMap(), null, "configMap", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StoragePackageImpl
