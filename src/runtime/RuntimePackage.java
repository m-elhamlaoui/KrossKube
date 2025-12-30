/**
 */
package runtime;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://krosskube/kubernetes/runtime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link runtime.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.NamespaceImpl
	 * @see runtime.impl.RuntimePackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.EnvironmentVariableImpl
	 * @see runtime.impl.RuntimePackageImpl#getEnvironmentVariable()
	 * @generated
	 */
	int ENVIRONMENT_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.DockerImageImpl <em>Docker Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.DockerImageImpl
	 * @see runtime.impl.RuntimePackageImpl#getDockerImage()
	 * @generated
	 */
	int DOCKER_IMAGE = 2;

	/**
	 * The number of structural features of the '<em>Docker Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Docker Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.ContainerImpl
	 * @see runtime.impl.RuntimePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENVIRONMENT_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Docker Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOCKER_IMAGE = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.PodImpl <em>Pod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.PodImpl
	 * @see runtime.impl.RuntimePackageImpl#getPod()
	 * @generated
	 */
	int POD = 4;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__CONTAINERS = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__VOLUMES = 2;

	/**
	 * The feature id for the '<em><b>Service Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__SERVICE_ACCOUNT = 3;

	/**
	 * The number of structural features of the '<em>Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.ReplicaSetImpl <em>Replica Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.ReplicaSetImpl
	 * @see runtime.impl.RuntimePackageImpl#getReplicaSet()
	 * @generated
	 */
	int REPLICA_SET = 5;

	/**
	 * The feature id for the '<em><b>Pods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET__PODS = 0;

	/**
	 * The number of structural features of the '<em>Replica Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Replica Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICA_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.DeploymentImpl
	 * @see runtime.impl.RuntimePackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 6;

	/**
	 * The feature id for the '<em><b>Replica Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__REPLICA_SET = 0;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.StatefulSetImpl <em>Stateful Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.StatefulSetImpl
	 * @see runtime.impl.RuntimePackageImpl#getStatefulSet()
	 * @generated
	 */
	int STATEFUL_SET = 7;

	/**
	 * The feature id for the '<em><b>Pods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET__PODS = 0;

	/**
	 * The number of structural features of the '<em>Stateful Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stateful Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.DaemonSetImpl <em>Daemon Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.DaemonSetImpl
	 * @see runtime.impl.RuntimePackageImpl#getDaemonSet()
	 * @generated
	 */
	int DAEMON_SET = 8;

	/**
	 * The feature id for the '<em><b>Pods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET__PODS = 0;

	/**
	 * The number of structural features of the '<em>Daemon Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Daemon Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAEMON_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.JobImpl
	 * @see runtime.impl.RuntimePackageImpl#getJob()
	 * @generated
	 */
	int JOB = 9;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.CronJobImpl <em>Cron Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.CronJobImpl
	 * @see runtime.impl.RuntimePackageImpl#getCronJob()
	 * @generated
	 */
	int CRON_JOB = 10;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB__JOBS = 0;

	/**
	 * The number of structural features of the '<em>Cron Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cron Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.ServiceImpl
	 * @see runtime.impl.RuntimePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Pods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PODS = 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link runtime.impl.IngressImpl <em>Ingress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see runtime.impl.IngressImpl
	 * @see runtime.impl.RuntimePackageImpl#getIngress()
	 * @generated
	 */
	int INGRESS = 12;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__SERVICES = 0;

	/**
	 * The number of structural features of the '<em>Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link runtime.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see runtime.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for class '{@link runtime.EnvironmentVariable <em>Environment Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Variable</em>'.
	 * @see runtime.EnvironmentVariable
	 * @generated
	 */
	EClass getEnvironmentVariable();

	/**
	 * Returns the meta object for the attribute '{@link runtime.EnvironmentVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see runtime.EnvironmentVariable#getName()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
	EAttribute getEnvironmentVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link runtime.EnvironmentVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see runtime.EnvironmentVariable#getValue()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
	EAttribute getEnvironmentVariable_Value();

	/**
	 * Returns the meta object for class '{@link runtime.DockerImage <em>Docker Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Image</em>'.
	 * @see runtime.DockerImage
	 * @generated
	 */
	EClass getDockerImage();

	/**
	 * Returns the meta object for class '{@link runtime.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see runtime.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link runtime.Container#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Variables</em>'.
	 * @see runtime.Container#getEnvironmentVariables()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_EnvironmentVariables();

	/**
	 * Returns the meta object for the reference '{@link runtime.Container#getDockerImage <em>Docker Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Docker Image</em>'.
	 * @see runtime.Container#getDockerImage()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_DockerImage();

	/**
	 * Returns the meta object for class '{@link runtime.Pod <em>Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pod</em>'.
	 * @see runtime.Pod
	 * @generated
	 */
	EClass getPod();

	/**
	 * Returns the meta object for the containment reference list '{@link runtime.Pod#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see runtime.Pod#getContainers()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_Containers();

	/**
	 * Returns the meta object for the reference '{@link runtime.Pod#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see runtime.Pod#getNamespace()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_Namespace();

	/**
	 * Returns the meta object for the reference list '{@link runtime.Pod#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Volumes</em>'.
	 * @see runtime.Pod#getVolumes()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_Volumes();

	/**
	 * Returns the meta object for the reference '{@link runtime.Pod#getServiceAccount <em>Service Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Account</em>'.
	 * @see runtime.Pod#getServiceAccount()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_ServiceAccount();

	/**
	 * Returns the meta object for class '{@link runtime.ReplicaSet <em>Replica Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replica Set</em>'.
	 * @see runtime.ReplicaSet
	 * @generated
	 */
	EClass getReplicaSet();

	/**
	 * Returns the meta object for the containment reference list '{@link runtime.ReplicaSet#getPods <em>Pods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pods</em>'.
	 * @see runtime.ReplicaSet#getPods()
	 * @see #getReplicaSet()
	 * @generated
	 */
	EReference getReplicaSet_Pods();

	/**
	 * Returns the meta object for class '{@link runtime.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see runtime.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the containment reference '{@link runtime.Deployment#getReplicaSet <em>Replica Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replica Set</em>'.
	 * @see runtime.Deployment#getReplicaSet()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_ReplicaSet();

	/**
	 * Returns the meta object for class '{@link runtime.StatefulSet <em>Stateful Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateful Set</em>'.
	 * @see runtime.StatefulSet
	 * @generated
	 */
	EClass getStatefulSet();

	/**
	 * Returns the meta object for the containment reference list '{@link runtime.StatefulSet#getPods <em>Pods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pods</em>'.
	 * @see runtime.StatefulSet#getPods()
	 * @see #getStatefulSet()
	 * @generated
	 */
	EReference getStatefulSet_Pods();

	/**
	 * Returns the meta object for class '{@link runtime.DaemonSet <em>Daemon Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daemon Set</em>'.
	 * @see runtime.DaemonSet
	 * @generated
	 */
	EClass getDaemonSet();

	/**
	 * Returns the meta object for the containment reference list '{@link runtime.DaemonSet#getPods <em>Pods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pods</em>'.
	 * @see runtime.DaemonSet#getPods()
	 * @see #getDaemonSet()
	 * @generated
	 */
	EReference getDaemonSet_Pods();

	/**
	 * Returns the meta object for class '{@link runtime.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see runtime.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for class '{@link runtime.CronJob <em>Cron Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron Job</em>'.
	 * @see runtime.CronJob
	 * @generated
	 */
	EClass getCronJob();

	/**
	 * Returns the meta object for the containment reference list '{@link runtime.CronJob#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see runtime.CronJob#getJobs()
	 * @see #getCronJob()
	 * @generated
	 */
	EReference getCronJob_Jobs();

	/**
	 * Returns the meta object for class '{@link runtime.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see runtime.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link runtime.Service#getPods <em>Pods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pods</em>'.
	 * @see runtime.Service#getPods()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Pods();

	/**
	 * Returns the meta object for class '{@link runtime.Ingress <em>Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingress</em>'.
	 * @see runtime.Ingress
	 * @generated
	 */
	EClass getIngress();

	/**
	 * Returns the meta object for the reference list '{@link runtime.Ingress#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see runtime.Ingress#getServices()
	 * @see #getIngress()
	 * @generated
	 */
	EReference getIngress_Services();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
		 * The meta object literal for the '{@link runtime.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.NamespaceImpl
		 * @see runtime.impl.RuntimePackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '{@link runtime.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.EnvironmentVariableImpl
		 * @see runtime.impl.RuntimePackageImpl#getEnvironmentVariable()
		 * @generated
		 */
		EClass ENVIRONMENT_VARIABLE = eINSTANCE.getEnvironmentVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_VARIABLE__NAME = eINSTANCE.getEnvironmentVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_VARIABLE__VALUE = eINSTANCE.getEnvironmentVariable_Value();

		/**
		 * The meta object literal for the '{@link runtime.impl.DockerImageImpl <em>Docker Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.DockerImageImpl
		 * @see runtime.impl.RuntimePackageImpl#getDockerImage()
		 * @generated
		 */
		EClass DOCKER_IMAGE = eINSTANCE.getDockerImage();

		/**
		 * The meta object literal for the '{@link runtime.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.ContainerImpl
		 * @see runtime.impl.RuntimePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ENVIRONMENT_VARIABLES = eINSTANCE.getContainer_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Docker Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__DOCKER_IMAGE = eINSTANCE.getContainer_DockerImage();

		/**
		 * The meta object literal for the '{@link runtime.impl.PodImpl <em>Pod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.PodImpl
		 * @see runtime.impl.RuntimePackageImpl#getPod()
		 * @generated
		 */
		EClass POD = eINSTANCE.getPod();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__CONTAINERS = eINSTANCE.getPod_Containers();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__NAMESPACE = eINSTANCE.getPod_Namespace();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__VOLUMES = eINSTANCE.getPod_Volumes();

		/**
		 * The meta object literal for the '<em><b>Service Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__SERVICE_ACCOUNT = eINSTANCE.getPod_ServiceAccount();

		/**
		 * The meta object literal for the '{@link runtime.impl.ReplicaSetImpl <em>Replica Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.ReplicaSetImpl
		 * @see runtime.impl.RuntimePackageImpl#getReplicaSet()
		 * @generated
		 */
		EClass REPLICA_SET = eINSTANCE.getReplicaSet();

		/**
		 * The meta object literal for the '<em><b>Pods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICA_SET__PODS = eINSTANCE.getReplicaSet_Pods();

		/**
		 * The meta object literal for the '{@link runtime.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.DeploymentImpl
		 * @see runtime.impl.RuntimePackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Replica Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__REPLICA_SET = eINSTANCE.getDeployment_ReplicaSet();

		/**
		 * The meta object literal for the '{@link runtime.impl.StatefulSetImpl <em>Stateful Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.StatefulSetImpl
		 * @see runtime.impl.RuntimePackageImpl#getStatefulSet()
		 * @generated
		 */
		EClass STATEFUL_SET = eINSTANCE.getStatefulSet();

		/**
		 * The meta object literal for the '<em><b>Pods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEFUL_SET__PODS = eINSTANCE.getStatefulSet_Pods();

		/**
		 * The meta object literal for the '{@link runtime.impl.DaemonSetImpl <em>Daemon Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.DaemonSetImpl
		 * @see runtime.impl.RuntimePackageImpl#getDaemonSet()
		 * @generated
		 */
		EClass DAEMON_SET = eINSTANCE.getDaemonSet();

		/**
		 * The meta object literal for the '<em><b>Pods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAEMON_SET__PODS = eINSTANCE.getDaemonSet_Pods();

		/**
		 * The meta object literal for the '{@link runtime.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.JobImpl
		 * @see runtime.impl.RuntimePackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '{@link runtime.impl.CronJobImpl <em>Cron Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.CronJobImpl
		 * @see runtime.impl.RuntimePackageImpl#getCronJob()
		 * @generated
		 */
		EClass CRON_JOB = eINSTANCE.getCronJob();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRON_JOB__JOBS = eINSTANCE.getCronJob_Jobs();

		/**
		 * The meta object literal for the '{@link runtime.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.ServiceImpl
		 * @see runtime.impl.RuntimePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Pods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PODS = eINSTANCE.getService_Pods();

		/**
		 * The meta object literal for the '{@link runtime.impl.IngressImpl <em>Ingress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see runtime.impl.IngressImpl
		 * @see runtime.impl.RuntimePackageImpl#getIngress()
		 * @generated
		 */
		EClass INGRESS = eINSTANCE.getIngress();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGRESS__SERVICES = eINSTANCE.getIngress_Services();

	}

} //RuntimePackage
