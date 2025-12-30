/**
 */
package multicluster;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see multicluster.MulticlusterPackage
 * @generated
 */
public interface MulticlusterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MulticlusterFactory eINSTANCE = multicluster.impl.MulticlusterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cluster Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Selector</em>'.
	 * @generated
	 */
	ClusterSelector createClusterSelector();

	/**
	 * Returns a new object of class '<em>Multi Cluster Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Deployment</em>'.
	 * @generated
	 */
	MultiClusterDeployment createMultiClusterDeployment();

	/**
	 * Returns a new object of class '<em>Multi Cluster Stateful Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Stateful Set</em>'.
	 * @generated
	 */
	MultiClusterStatefulSet createMultiClusterStatefulSet();

	/**
	 * Returns a new object of class '<em>Multi Cluster Daemon Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Daemon Set</em>'.
	 * @generated
	 */
	MultiClusterDaemonSet createMultiClusterDaemonSet();

	/**
	 * Returns a new object of class '<em>Multi Cluster Cron Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Cron Job</em>'.
	 * @generated
	 */
	MultiClusterCronJob createMultiClusterCronJob();

	/**
	 * Returns a new object of class '<em>Multi Cluster Pod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Pod</em>'.
	 * @generated
	 */
	MultiClusterPod createMultiClusterPod();

	/**
	 * Returns a new object of class '<em>Multi Cluster Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Service</em>'.
	 * @generated
	 */
	MultiClusterService createMultiClusterService();

	/**
	 * Returns a new object of class '<em>Multi Cluster Ingress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Ingress</em>'.
	 * @generated
	 */
	MultiClusterIngress createMultiClusterIngress();

	/**
	 * Returns a new object of class '<em>Multi Cluster Persistent Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Persistent Volume</em>'.
	 * @generated
	 */
	MultiClusterPersistentVolume createMultiClusterPersistentVolume();

	/**
	 * Returns a new object of class '<em>Multi Cluster Persistent Volume Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Persistent Volume Claim</em>'.
	 * @generated
	 */
	MultiClusterPersistentVolumeClaim createMultiClusterPersistentVolumeClaim();

	/**
	 * Returns a new object of class '<em>Multi Cluster Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Role</em>'.
	 * @generated
	 */
	MultiClusterRole createMultiClusterRole();

	/**
	 * Returns a new object of class '<em>Multi Cluster Role Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Role Binding</em>'.
	 * @generated
	 */
	MultiClusterRoleBinding createMultiClusterRoleBinding();

	/**
	 * Returns a new object of class '<em>Multi Cluster Secret</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Secret</em>'.
	 * @generated
	 */
	MultiClusterSecret createMultiClusterSecret();

	/**
	 * Returns a new object of class '<em>Multi Cluster Config Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cluster Config Map</em>'.
	 * @generated
	 */
	MultiClusterConfigMap createMultiClusterConfigMap();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MulticlusterPackage getMulticlusterPackage();

} //MulticlusterFactory
