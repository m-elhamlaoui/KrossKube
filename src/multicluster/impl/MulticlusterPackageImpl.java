/**
 */
package multicluster.impl;

import config.ConfigPackage;

import config.impl.ConfigPackageImpl;

import multicluster.ClusterSelector;
import multicluster.MultiClusterConfigMap;
import multicluster.MultiClusterCronJob;
import multicluster.MultiClusterDaemonSet;
import multicluster.MultiClusterDeployment;
import multicluster.MultiClusterIngress;
import multicluster.MultiClusterNetwork;
import multicluster.MultiClusterPersistentVolume;
import multicluster.MultiClusterPersistentVolumeClaim;
import multicluster.MultiClusterPod;
import multicluster.MultiClusterResource;
import multicluster.MultiClusterRole;
import multicluster.MultiClusterRoleBinding;
import multicluster.MultiClusterSecret;
import multicluster.MultiClusterSecurity;
import multicluster.MultiClusterService;
import multicluster.MultiClusterStatefulSet;
import multicluster.MultiClusterStorage;
import multicluster.MultiClusterWorkload;
import multicluster.MulticlusterFactory;
import multicluster.MulticlusterPackage;
import multicluster.PlacementPolicy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import runtime.RuntimePackage;

import runtime.impl.RuntimePackageImpl;

import security.SecurityPackage;

import security.impl.SecurityPackageImpl;

import storage.StoragePackage;

import storage.impl.StoragePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MulticlusterPackageImpl extends EPackageImpl implements MulticlusterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterWorkloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterStatefulSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterDaemonSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterCronJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterPodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterIngressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterPersistentVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterPersistentVolumeClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterRoleBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterSecretEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiClusterConfigMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placementPolicyEEnum = null;

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
	 * @see multicluster.MulticlusterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MulticlusterPackageImpl() {
		super(eNS_URI, MulticlusterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MulticlusterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MulticlusterPackage init() {
		if (isInited) return (MulticlusterPackage)EPackage.Registry.INSTANCE.getEPackage(MulticlusterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMulticlusterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MulticlusterPackageImpl theMulticlusterPackage = registeredMulticlusterPackage instanceof MulticlusterPackageImpl ? (MulticlusterPackageImpl)registeredMulticlusterPackage : new MulticlusterPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(registeredPackage instanceof ConfigPackageImpl ? registeredPackage : ConfigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(registeredPackage instanceof RuntimePackageImpl ? registeredPackage : RuntimePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(registeredPackage instanceof SecurityPackageImpl ? registeredPackage : SecurityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);

		// Create package meta-data objects
		theMulticlusterPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theStoragePackage.createPackageContents();

		// Initialize created meta-data
		theMulticlusterPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMulticlusterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MulticlusterPackage.eNS_URI, theMulticlusterPackage);
		return theMulticlusterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterResource() {
		return multiClusterResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiClusterResource_Name() {
		return (EAttribute)multiClusterResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiClusterResource_ClusterSelector() {
		return (EReference)multiClusterResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiClusterResource_PlacementPolicy() {
		return (EAttribute)multiClusterResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClusterSelector() {
		return clusterSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClusterSelector_MatchLabels() {
		return (EAttribute)clusterSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClusterSelector_MatchExpressions() {
		return (EAttribute)clusterSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterWorkload() {
		return multiClusterWorkloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterDeployment() {
		return multiClusterDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterStatefulSet() {
		return multiClusterStatefulSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterDaemonSet() {
		return multiClusterDaemonSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterCronJob() {
		return multiClusterCronJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterPod() {
		return multiClusterPodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterNetwork() {
		return multiClusterNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterService() {
		return multiClusterServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterIngress() {
		return multiClusterIngressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterStorage() {
		return multiClusterStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterPersistentVolume() {
		return multiClusterPersistentVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterPersistentVolumeClaim() {
		return multiClusterPersistentVolumeClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterSecurity() {
		return multiClusterSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterRole() {
		return multiClusterRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterRoleBinding() {
		return multiClusterRoleBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterSecret() {
		return multiClusterSecretEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiClusterConfigMap() {
		return multiClusterConfigMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPlacementPolicy() {
		return placementPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulticlusterFactory getMulticlusterFactory() {
		return (MulticlusterFactory)getEFactoryInstance();
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
		multiClusterResourceEClass = createEClass(MULTI_CLUSTER_RESOURCE);
		createEAttribute(multiClusterResourceEClass, MULTI_CLUSTER_RESOURCE__NAME);
		createEReference(multiClusterResourceEClass, MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR);
		createEAttribute(multiClusterResourceEClass, MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY);

		clusterSelectorEClass = createEClass(CLUSTER_SELECTOR);
		createEAttribute(clusterSelectorEClass, CLUSTER_SELECTOR__MATCH_LABELS);
		createEAttribute(clusterSelectorEClass, CLUSTER_SELECTOR__MATCH_EXPRESSIONS);

		multiClusterWorkloadEClass = createEClass(MULTI_CLUSTER_WORKLOAD);

		multiClusterDeploymentEClass = createEClass(MULTI_CLUSTER_DEPLOYMENT);

		multiClusterStatefulSetEClass = createEClass(MULTI_CLUSTER_STATEFUL_SET);

		multiClusterDaemonSetEClass = createEClass(MULTI_CLUSTER_DAEMON_SET);

		multiClusterCronJobEClass = createEClass(MULTI_CLUSTER_CRON_JOB);

		multiClusterPodEClass = createEClass(MULTI_CLUSTER_POD);

		multiClusterNetworkEClass = createEClass(MULTI_CLUSTER_NETWORK);

		multiClusterServiceEClass = createEClass(MULTI_CLUSTER_SERVICE);

		multiClusterIngressEClass = createEClass(MULTI_CLUSTER_INGRESS);

		multiClusterStorageEClass = createEClass(MULTI_CLUSTER_STORAGE);

		multiClusterPersistentVolumeEClass = createEClass(MULTI_CLUSTER_PERSISTENT_VOLUME);

		multiClusterPersistentVolumeClaimEClass = createEClass(MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM);

		multiClusterSecurityEClass = createEClass(MULTI_CLUSTER_SECURITY);

		multiClusterRoleEClass = createEClass(MULTI_CLUSTER_ROLE);

		multiClusterRoleBindingEClass = createEClass(MULTI_CLUSTER_ROLE_BINDING);

		multiClusterSecretEClass = createEClass(MULTI_CLUSTER_SECRET);

		multiClusterConfigMapEClass = createEClass(MULTI_CLUSTER_CONFIG_MAP);

		// Create enums
		placementPolicyEEnum = createEEnum(PLACEMENT_POLICY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multiClusterWorkloadEClass.getESuperTypes().add(this.getMultiClusterResource());
		multiClusterDeploymentEClass.getESuperTypes().add(this.getMultiClusterWorkload());
		multiClusterStatefulSetEClass.getESuperTypes().add(this.getMultiClusterWorkload());
		multiClusterDaemonSetEClass.getESuperTypes().add(this.getMultiClusterWorkload());
		multiClusterCronJobEClass.getESuperTypes().add(this.getMultiClusterWorkload());
		multiClusterPodEClass.getESuperTypes().add(this.getMultiClusterWorkload());
		multiClusterNetworkEClass.getESuperTypes().add(this.getMultiClusterResource());
		multiClusterServiceEClass.getESuperTypes().add(this.getMultiClusterNetwork());
		multiClusterIngressEClass.getESuperTypes().add(this.getMultiClusterNetwork());
		multiClusterStorageEClass.getESuperTypes().add(this.getMultiClusterResource());
		multiClusterPersistentVolumeEClass.getESuperTypes().add(this.getMultiClusterStorage());
		multiClusterPersistentVolumeClaimEClass.getESuperTypes().add(this.getMultiClusterStorage());
		multiClusterSecurityEClass.getESuperTypes().add(this.getMultiClusterResource());
		multiClusterRoleEClass.getESuperTypes().add(this.getMultiClusterSecurity());
		multiClusterRoleBindingEClass.getESuperTypes().add(this.getMultiClusterSecurity());
		multiClusterSecretEClass.getESuperTypes().add(this.getMultiClusterSecurity());
		multiClusterConfigMapEClass.getESuperTypes().add(this.getMultiClusterSecurity());

		// Initialize classes, features, and operations; add parameters
		initEClass(multiClusterResourceEClass, MultiClusterResource.class, "MultiClusterResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiClusterResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, MultiClusterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiClusterResource_ClusterSelector(), this.getClusterSelector(), null, "clusterSelector", null, 0, 1, MultiClusterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiClusterResource_PlacementPolicy(), this.getPlacementPolicy(), "placementPolicy", null, 0, 1, MultiClusterResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusterSelectorEClass, ClusterSelector.class, "ClusterSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClusterSelector_MatchLabels(), ecorePackage.getEString(), "matchLabels", null, 0, -1, ClusterSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClusterSelector_MatchExpressions(), ecorePackage.getEString(), "matchExpressions", null, 0, -1, ClusterSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiClusterWorkloadEClass, MultiClusterWorkload.class, "MultiClusterWorkload", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterDeploymentEClass, MultiClusterDeployment.class, "MultiClusterDeployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterStatefulSetEClass, MultiClusterStatefulSet.class, "MultiClusterStatefulSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterDaemonSetEClass, MultiClusterDaemonSet.class, "MultiClusterDaemonSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterCronJobEClass, MultiClusterCronJob.class, "MultiClusterCronJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterPodEClass, MultiClusterPod.class, "MultiClusterPod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterNetworkEClass, MultiClusterNetwork.class, "MultiClusterNetwork", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterServiceEClass, MultiClusterService.class, "MultiClusterService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterIngressEClass, MultiClusterIngress.class, "MultiClusterIngress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterStorageEClass, MultiClusterStorage.class, "MultiClusterStorage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterPersistentVolumeEClass, MultiClusterPersistentVolume.class, "MultiClusterPersistentVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterPersistentVolumeClaimEClass, MultiClusterPersistentVolumeClaim.class, "MultiClusterPersistentVolumeClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterSecurityEClass, MultiClusterSecurity.class, "MultiClusterSecurity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterRoleEClass, MultiClusterRole.class, "MultiClusterRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterRoleBindingEClass, MultiClusterRoleBinding.class, "MultiClusterRoleBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterSecretEClass, MultiClusterSecret.class, "MultiClusterSecret", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiClusterConfigMapEClass, MultiClusterConfigMap.class, "MultiClusterConfigMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(placementPolicyEEnum, PlacementPolicy.class, "PlacementPolicy");
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.REPLICATED);
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.DISTRIBUTED);
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.BALANCED);

		// Create resource
		createResource(eNS_URI);
	}

} //MulticlusterPackageImpl
