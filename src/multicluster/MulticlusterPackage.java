/**
 */
package multicluster;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see multicluster.MulticlusterFactory
 * @model kind="package"
 * @generated
 */
public interface MulticlusterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "multicluster";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://krosskube/multicluster";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "multicluster";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MulticlusterPackage eINSTANCE = multicluster.impl.MulticlusterPackageImpl.init();

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterResourceImpl <em>Multi Cluster Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterResourceImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterResource()
	 * @generated
	 */
	int MULTI_CLUSTER_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR = 1;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY = 2;

	/**
	 * The number of structural features of the '<em>Multi Cluster Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Multi Cluster Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.ClusterSelectorImpl <em>Cluster Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.ClusterSelectorImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getClusterSelector()
	 * @generated
	 */
	int CLUSTER_SELECTOR = 1;

	/**
	 * The feature id for the '<em><b>Match Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_SELECTOR__MATCH_LABELS = 0;

	/**
	 * The feature id for the '<em><b>Match Expressions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_SELECTOR__MATCH_EXPRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>Cluster Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cluster Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterWorkloadImpl <em>Multi Cluster Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterWorkloadImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterWorkload()
	 * @generated
	 */
	int MULTI_CLUSTER_WORKLOAD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_WORKLOAD__NAME = MULTI_CLUSTER_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_WORKLOAD__CLUSTER_SELECTOR = MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_WORKLOAD__PLACEMENT_POLICY = MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_WORKLOAD_FEATURE_COUNT = MULTI_CLUSTER_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_WORKLOAD_OPERATION_COUNT = MULTI_CLUSTER_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterDeploymentImpl <em>Multi Cluster Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterDeploymentImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterDeployment()
	 * @generated
	 */
	int MULTI_CLUSTER_DEPLOYMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DEPLOYMENT__NAME = MULTI_CLUSTER_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DEPLOYMENT__CLUSTER_SELECTOR = MULTI_CLUSTER_WORKLOAD__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DEPLOYMENT__PLACEMENT_POLICY = MULTI_CLUSTER_WORKLOAD__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DEPLOYMENT_FEATURE_COUNT = MULTI_CLUSTER_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DEPLOYMENT_OPERATION_COUNT = MULTI_CLUSTER_WORKLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterStatefulSetImpl <em>Multi Cluster Stateful Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterStatefulSetImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterStatefulSet()
	 * @generated
	 */
	int MULTI_CLUSTER_STATEFUL_SET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STATEFUL_SET__NAME = MULTI_CLUSTER_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STATEFUL_SET__CLUSTER_SELECTOR = MULTI_CLUSTER_WORKLOAD__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STATEFUL_SET__PLACEMENT_POLICY = MULTI_CLUSTER_WORKLOAD__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Stateful Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STATEFUL_SET_FEATURE_COUNT = MULTI_CLUSTER_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Stateful Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STATEFUL_SET_OPERATION_COUNT = MULTI_CLUSTER_WORKLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterDaemonSetImpl <em>Multi Cluster Daemon Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterDaemonSetImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterDaemonSet()
	 * @generated
	 */
	int MULTI_CLUSTER_DAEMON_SET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DAEMON_SET__NAME = MULTI_CLUSTER_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DAEMON_SET__CLUSTER_SELECTOR = MULTI_CLUSTER_WORKLOAD__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DAEMON_SET__PLACEMENT_POLICY = MULTI_CLUSTER_WORKLOAD__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Daemon Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DAEMON_SET_FEATURE_COUNT = MULTI_CLUSTER_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Daemon Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_DAEMON_SET_OPERATION_COUNT = MULTI_CLUSTER_WORKLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterCronJobImpl <em>Multi Cluster Cron Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterCronJobImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterCronJob()
	 * @generated
	 */
	int MULTI_CLUSTER_CRON_JOB = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CRON_JOB__NAME = MULTI_CLUSTER_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CRON_JOB__CLUSTER_SELECTOR = MULTI_CLUSTER_WORKLOAD__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CRON_JOB__PLACEMENT_POLICY = MULTI_CLUSTER_WORKLOAD__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Cron Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CRON_JOB_FEATURE_COUNT = MULTI_CLUSTER_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Cron Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CRON_JOB_OPERATION_COUNT = MULTI_CLUSTER_WORKLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterPodImpl <em>Multi Cluster Pod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterPodImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterPod()
	 * @generated
	 */
	int MULTI_CLUSTER_POD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_POD__NAME = MULTI_CLUSTER_WORKLOAD__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_POD__CLUSTER_SELECTOR = MULTI_CLUSTER_WORKLOAD__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_POD__PLACEMENT_POLICY = MULTI_CLUSTER_WORKLOAD__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_POD_FEATURE_COUNT = MULTI_CLUSTER_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_POD_OPERATION_COUNT = MULTI_CLUSTER_WORKLOAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterNetworkImpl <em>Multi Cluster Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterNetworkImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterNetwork()
	 * @generated
	 */
	int MULTI_CLUSTER_NETWORK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_NETWORK__NAME = MULTI_CLUSTER_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_NETWORK__CLUSTER_SELECTOR = MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_NETWORK__PLACEMENT_POLICY = MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_NETWORK_FEATURE_COUNT = MULTI_CLUSTER_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_NETWORK_OPERATION_COUNT = MULTI_CLUSTER_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterServiceImpl <em>Multi Cluster Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterServiceImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterService()
	 * @generated
	 */
	int MULTI_CLUSTER_SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SERVICE__NAME = MULTI_CLUSTER_NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SERVICE__CLUSTER_SELECTOR = MULTI_CLUSTER_NETWORK__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SERVICE__PLACEMENT_POLICY = MULTI_CLUSTER_NETWORK__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SERVICE_FEATURE_COUNT = MULTI_CLUSTER_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SERVICE_OPERATION_COUNT = MULTI_CLUSTER_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterIngressImpl <em>Multi Cluster Ingress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterIngressImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterIngress()
	 * @generated
	 */
	int MULTI_CLUSTER_INGRESS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_INGRESS__NAME = MULTI_CLUSTER_NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_INGRESS__CLUSTER_SELECTOR = MULTI_CLUSTER_NETWORK__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_INGRESS__PLACEMENT_POLICY = MULTI_CLUSTER_NETWORK__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_INGRESS_FEATURE_COUNT = MULTI_CLUSTER_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_INGRESS_OPERATION_COUNT = MULTI_CLUSTER_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterStorageImpl <em>Multi Cluster Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterStorageImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterStorage()
	 * @generated
	 */
	int MULTI_CLUSTER_STORAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STORAGE__NAME = MULTI_CLUSTER_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STORAGE__CLUSTER_SELECTOR = MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STORAGE__PLACEMENT_POLICY = MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STORAGE_FEATURE_COUNT = MULTI_CLUSTER_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_STORAGE_OPERATION_COUNT = MULTI_CLUSTER_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterPersistentVolumeImpl <em>Multi Cluster Persistent Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterPersistentVolumeImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterPersistentVolume()
	 * @generated
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME__NAME = MULTI_CLUSTER_STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME__CLUSTER_SELECTOR = MULTI_CLUSTER_STORAGE__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME__PLACEMENT_POLICY = MULTI_CLUSTER_STORAGE__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Persistent Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME_FEATURE_COUNT = MULTI_CLUSTER_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Persistent Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME_OPERATION_COUNT = MULTI_CLUSTER_STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterPersistentVolumeClaimImpl <em>Multi Cluster Persistent Volume Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterPersistentVolumeClaimImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterPersistentVolumeClaim()
	 * @generated
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM__NAME = MULTI_CLUSTER_STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM__CLUSTER_SELECTOR = MULTI_CLUSTER_STORAGE__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM__PLACEMENT_POLICY = MULTI_CLUSTER_STORAGE__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Persistent Volume Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM_FEATURE_COUNT = MULTI_CLUSTER_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Persistent Volume Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM_OPERATION_COUNT = MULTI_CLUSTER_STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterSecurityImpl <em>Multi Cluster Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterSecurityImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterSecurity()
	 * @generated
	 */
	int MULTI_CLUSTER_SECURITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECURITY__NAME = MULTI_CLUSTER_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECURITY__CLUSTER_SELECTOR = MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECURITY__PLACEMENT_POLICY = MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECURITY_FEATURE_COUNT = MULTI_CLUSTER_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECURITY_OPERATION_COUNT = MULTI_CLUSTER_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterRoleImpl <em>Multi Cluster Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterRoleImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterRole()
	 * @generated
	 */
	int MULTI_CLUSTER_ROLE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE__NAME = MULTI_CLUSTER_SECURITY__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE__CLUSTER_SELECTOR = MULTI_CLUSTER_SECURITY__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE__PLACEMENT_POLICY = MULTI_CLUSTER_SECURITY__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE_FEATURE_COUNT = MULTI_CLUSTER_SECURITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE_OPERATION_COUNT = MULTI_CLUSTER_SECURITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterRoleBindingImpl <em>Multi Cluster Role Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterRoleBindingImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterRoleBinding()
	 * @generated
	 */
	int MULTI_CLUSTER_ROLE_BINDING = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE_BINDING__NAME = MULTI_CLUSTER_SECURITY__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE_BINDING__CLUSTER_SELECTOR = MULTI_CLUSTER_SECURITY__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE_BINDING__PLACEMENT_POLICY = MULTI_CLUSTER_SECURITY__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Role Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE_BINDING_FEATURE_COUNT = MULTI_CLUSTER_SECURITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Role Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_ROLE_BINDING_OPERATION_COUNT = MULTI_CLUSTER_SECURITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterSecretImpl <em>Multi Cluster Secret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterSecretImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterSecret()
	 * @generated
	 */
	int MULTI_CLUSTER_SECRET = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECRET__NAME = MULTI_CLUSTER_SECURITY__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECRET__CLUSTER_SELECTOR = MULTI_CLUSTER_SECURITY__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECRET__PLACEMENT_POLICY = MULTI_CLUSTER_SECURITY__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECRET_FEATURE_COUNT = MULTI_CLUSTER_SECURITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_SECRET_OPERATION_COUNT = MULTI_CLUSTER_SECURITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.impl.MultiClusterConfigMapImpl <em>Multi Cluster Config Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.impl.MultiClusterConfigMapImpl
	 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterConfigMap()
	 * @generated
	 */
	int MULTI_CLUSTER_CONFIG_MAP = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CONFIG_MAP__NAME = MULTI_CLUSTER_SECURITY__NAME;

	/**
	 * The feature id for the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CONFIG_MAP__CLUSTER_SELECTOR = MULTI_CLUSTER_SECURITY__CLUSTER_SELECTOR;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CONFIG_MAP__PLACEMENT_POLICY = MULTI_CLUSTER_SECURITY__PLACEMENT_POLICY;

	/**
	 * The number of structural features of the '<em>Multi Cluster Config Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CONFIG_MAP_FEATURE_COUNT = MULTI_CLUSTER_SECURITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Cluster Config Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CLUSTER_CONFIG_MAP_OPERATION_COUNT = MULTI_CLUSTER_SECURITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link multicluster.PlacementPolicy <em>Placement Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see multicluster.PlacementPolicy
	 * @see multicluster.impl.MulticlusterPackageImpl#getPlacementPolicy()
	 * @generated
	 */
	int PLACEMENT_POLICY = 19;


	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterResource <em>Multi Cluster Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Resource</em>'.
	 * @see multicluster.MultiClusterResource
	 * @generated
	 */
	EClass getMultiClusterResource();

	/**
	 * Returns the meta object for the attribute '{@link multicluster.MultiClusterResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see multicluster.MultiClusterResource#getName()
	 * @see #getMultiClusterResource()
	 * @generated
	 */
	EAttribute getMultiClusterResource_Name();

	/**
	 * Returns the meta object for the containment reference '{@link multicluster.MultiClusterResource#getClusterSelector <em>Cluster Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cluster Selector</em>'.
	 * @see multicluster.MultiClusterResource#getClusterSelector()
	 * @see #getMultiClusterResource()
	 * @generated
	 */
	EReference getMultiClusterResource_ClusterSelector();

	/**
	 * Returns the meta object for the attribute '{@link multicluster.MultiClusterResource#getPlacementPolicy <em>Placement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement Policy</em>'.
	 * @see multicluster.MultiClusterResource#getPlacementPolicy()
	 * @see #getMultiClusterResource()
	 * @generated
	 */
	EAttribute getMultiClusterResource_PlacementPolicy();

	/**
	 * Returns the meta object for class '{@link multicluster.ClusterSelector <em>Cluster Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Selector</em>'.
	 * @see multicluster.ClusterSelector
	 * @generated
	 */
	EClass getClusterSelector();

	/**
	 * Returns the meta object for the attribute list '{@link multicluster.ClusterSelector#getMatchLabels <em>Match Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Match Labels</em>'.
	 * @see multicluster.ClusterSelector#getMatchLabels()
	 * @see #getClusterSelector()
	 * @generated
	 */
	EAttribute getClusterSelector_MatchLabels();

	/**
	 * Returns the meta object for the attribute list '{@link multicluster.ClusterSelector#getMatchExpressions <em>Match Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Match Expressions</em>'.
	 * @see multicluster.ClusterSelector#getMatchExpressions()
	 * @see #getClusterSelector()
	 * @generated
	 */
	EAttribute getClusterSelector_MatchExpressions();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterWorkload <em>Multi Cluster Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Workload</em>'.
	 * @see multicluster.MultiClusterWorkload
	 * @generated
	 */
	EClass getMultiClusterWorkload();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterDeployment <em>Multi Cluster Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Deployment</em>'.
	 * @see multicluster.MultiClusterDeployment
	 * @generated
	 */
	EClass getMultiClusterDeployment();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterStatefulSet <em>Multi Cluster Stateful Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Stateful Set</em>'.
	 * @see multicluster.MultiClusterStatefulSet
	 * @generated
	 */
	EClass getMultiClusterStatefulSet();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterDaemonSet <em>Multi Cluster Daemon Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Daemon Set</em>'.
	 * @see multicluster.MultiClusterDaemonSet
	 * @generated
	 */
	EClass getMultiClusterDaemonSet();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterCronJob <em>Multi Cluster Cron Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Cron Job</em>'.
	 * @see multicluster.MultiClusterCronJob
	 * @generated
	 */
	EClass getMultiClusterCronJob();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterPod <em>Multi Cluster Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Pod</em>'.
	 * @see multicluster.MultiClusterPod
	 * @generated
	 */
	EClass getMultiClusterPod();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterNetwork <em>Multi Cluster Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Network</em>'.
	 * @see multicluster.MultiClusterNetwork
	 * @generated
	 */
	EClass getMultiClusterNetwork();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterService <em>Multi Cluster Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Service</em>'.
	 * @see multicluster.MultiClusterService
	 * @generated
	 */
	EClass getMultiClusterService();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterIngress <em>Multi Cluster Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Ingress</em>'.
	 * @see multicluster.MultiClusterIngress
	 * @generated
	 */
	EClass getMultiClusterIngress();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterStorage <em>Multi Cluster Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Storage</em>'.
	 * @see multicluster.MultiClusterStorage
	 * @generated
	 */
	EClass getMultiClusterStorage();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterPersistentVolume <em>Multi Cluster Persistent Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Persistent Volume</em>'.
	 * @see multicluster.MultiClusterPersistentVolume
	 * @generated
	 */
	EClass getMultiClusterPersistentVolume();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterPersistentVolumeClaim <em>Multi Cluster Persistent Volume Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Persistent Volume Claim</em>'.
	 * @see multicluster.MultiClusterPersistentVolumeClaim
	 * @generated
	 */
	EClass getMultiClusterPersistentVolumeClaim();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterSecurity <em>Multi Cluster Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Security</em>'.
	 * @see multicluster.MultiClusterSecurity
	 * @generated
	 */
	EClass getMultiClusterSecurity();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterRole <em>Multi Cluster Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Role</em>'.
	 * @see multicluster.MultiClusterRole
	 * @generated
	 */
	EClass getMultiClusterRole();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterRoleBinding <em>Multi Cluster Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Role Binding</em>'.
	 * @see multicluster.MultiClusterRoleBinding
	 * @generated
	 */
	EClass getMultiClusterRoleBinding();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterSecret <em>Multi Cluster Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Secret</em>'.
	 * @see multicluster.MultiClusterSecret
	 * @generated
	 */
	EClass getMultiClusterSecret();

	/**
	 * Returns the meta object for class '{@link multicluster.MultiClusterConfigMap <em>Multi Cluster Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cluster Config Map</em>'.
	 * @see multicluster.MultiClusterConfigMap
	 * @generated
	 */
	EClass getMultiClusterConfigMap();

	/**
	 * Returns the meta object for enum '{@link multicluster.PlacementPolicy <em>Placement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placement Policy</em>'.
	 * @see multicluster.PlacementPolicy
	 * @generated
	 */
	EEnum getPlacementPolicy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MulticlusterFactory getMulticlusterFactory();

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
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterResourceImpl <em>Multi Cluster Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterResourceImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterResource()
		 * @generated
		 */
		EClass MULTI_CLUSTER_RESOURCE = eINSTANCE.getMultiClusterResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_CLUSTER_RESOURCE__NAME = eINSTANCE.getMultiClusterResource_Name();

		/**
		 * The meta object literal for the '<em><b>Cluster Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR = eINSTANCE.getMultiClusterResource_ClusterSelector();

		/**
		 * The meta object literal for the '<em><b>Placement Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY = eINSTANCE.getMultiClusterResource_PlacementPolicy();

		/**
		 * The meta object literal for the '{@link multicluster.impl.ClusterSelectorImpl <em>Cluster Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.ClusterSelectorImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getClusterSelector()
		 * @generated
		 */
		EClass CLUSTER_SELECTOR = eINSTANCE.getClusterSelector();

		/**
		 * The meta object literal for the '<em><b>Match Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_SELECTOR__MATCH_LABELS = eINSTANCE.getClusterSelector_MatchLabels();

		/**
		 * The meta object literal for the '<em><b>Match Expressions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_SELECTOR__MATCH_EXPRESSIONS = eINSTANCE.getClusterSelector_MatchExpressions();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterWorkloadImpl <em>Multi Cluster Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterWorkloadImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterWorkload()
		 * @generated
		 */
		EClass MULTI_CLUSTER_WORKLOAD = eINSTANCE.getMultiClusterWorkload();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterDeploymentImpl <em>Multi Cluster Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterDeploymentImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterDeployment()
		 * @generated
		 */
		EClass MULTI_CLUSTER_DEPLOYMENT = eINSTANCE.getMultiClusterDeployment();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterStatefulSetImpl <em>Multi Cluster Stateful Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterStatefulSetImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterStatefulSet()
		 * @generated
		 */
		EClass MULTI_CLUSTER_STATEFUL_SET = eINSTANCE.getMultiClusterStatefulSet();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterDaemonSetImpl <em>Multi Cluster Daemon Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterDaemonSetImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterDaemonSet()
		 * @generated
		 */
		EClass MULTI_CLUSTER_DAEMON_SET = eINSTANCE.getMultiClusterDaemonSet();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterCronJobImpl <em>Multi Cluster Cron Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterCronJobImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterCronJob()
		 * @generated
		 */
		EClass MULTI_CLUSTER_CRON_JOB = eINSTANCE.getMultiClusterCronJob();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterPodImpl <em>Multi Cluster Pod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterPodImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterPod()
		 * @generated
		 */
		EClass MULTI_CLUSTER_POD = eINSTANCE.getMultiClusterPod();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterNetworkImpl <em>Multi Cluster Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterNetworkImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterNetwork()
		 * @generated
		 */
		EClass MULTI_CLUSTER_NETWORK = eINSTANCE.getMultiClusterNetwork();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterServiceImpl <em>Multi Cluster Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterServiceImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterService()
		 * @generated
		 */
		EClass MULTI_CLUSTER_SERVICE = eINSTANCE.getMultiClusterService();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterIngressImpl <em>Multi Cluster Ingress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterIngressImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterIngress()
		 * @generated
		 */
		EClass MULTI_CLUSTER_INGRESS = eINSTANCE.getMultiClusterIngress();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterStorageImpl <em>Multi Cluster Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterStorageImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterStorage()
		 * @generated
		 */
		EClass MULTI_CLUSTER_STORAGE = eINSTANCE.getMultiClusterStorage();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterPersistentVolumeImpl <em>Multi Cluster Persistent Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterPersistentVolumeImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterPersistentVolume()
		 * @generated
		 */
		EClass MULTI_CLUSTER_PERSISTENT_VOLUME = eINSTANCE.getMultiClusterPersistentVolume();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterPersistentVolumeClaimImpl <em>Multi Cluster Persistent Volume Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterPersistentVolumeClaimImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterPersistentVolumeClaim()
		 * @generated
		 */
		EClass MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM = eINSTANCE.getMultiClusterPersistentVolumeClaim();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterSecurityImpl <em>Multi Cluster Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterSecurityImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterSecurity()
		 * @generated
		 */
		EClass MULTI_CLUSTER_SECURITY = eINSTANCE.getMultiClusterSecurity();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterRoleImpl <em>Multi Cluster Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterRoleImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterRole()
		 * @generated
		 */
		EClass MULTI_CLUSTER_ROLE = eINSTANCE.getMultiClusterRole();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterRoleBindingImpl <em>Multi Cluster Role Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterRoleBindingImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterRoleBinding()
		 * @generated
		 */
		EClass MULTI_CLUSTER_ROLE_BINDING = eINSTANCE.getMultiClusterRoleBinding();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterSecretImpl <em>Multi Cluster Secret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterSecretImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterSecret()
		 * @generated
		 */
		EClass MULTI_CLUSTER_SECRET = eINSTANCE.getMultiClusterSecret();

		/**
		 * The meta object literal for the '{@link multicluster.impl.MultiClusterConfigMapImpl <em>Multi Cluster Config Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.impl.MultiClusterConfigMapImpl
		 * @see multicluster.impl.MulticlusterPackageImpl#getMultiClusterConfigMap()
		 * @generated
		 */
		EClass MULTI_CLUSTER_CONFIG_MAP = eINSTANCE.getMultiClusterConfigMap();

		/**
		 * The meta object literal for the '{@link multicluster.PlacementPolicy <em>Placement Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see multicluster.PlacementPolicy
		 * @see multicluster.impl.MulticlusterPackageImpl#getPlacementPolicy()
		 * @generated
		 */
		EEnum PLACEMENT_POLICY = eINSTANCE.getPlacementPolicy();

	}

} //MulticlusterPackage
