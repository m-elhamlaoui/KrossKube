/**
 */
package multicluster.util;

import multicluster.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see multicluster.MulticlusterPackage
 * @generated
 */
public class MulticlusterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MulticlusterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticlusterSwitch() {
		if (modelPackage == null) {
			modelPackage = MulticlusterPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE: {
				MultiClusterResource multiClusterResource = (MultiClusterResource)theEObject;
				T result = caseMultiClusterResource(multiClusterResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.CLUSTER_SELECTOR: {
				ClusterSelector clusterSelector = (ClusterSelector)theEObject;
				T result = caseClusterSelector(clusterSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_WORKLOAD: {
				MultiClusterWorkload multiClusterWorkload = (MultiClusterWorkload)theEObject;
				T result = caseMultiClusterWorkload(multiClusterWorkload);
				if (result == null) result = caseMultiClusterResource(multiClusterWorkload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_DEPLOYMENT: {
				MultiClusterDeployment multiClusterDeployment = (MultiClusterDeployment)theEObject;
				T result = caseMultiClusterDeployment(multiClusterDeployment);
				if (result == null) result = caseMultiClusterWorkload(multiClusterDeployment);
				if (result == null) result = caseMultiClusterResource(multiClusterDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_STATEFUL_SET: {
				MultiClusterStatefulSet multiClusterStatefulSet = (MultiClusterStatefulSet)theEObject;
				T result = caseMultiClusterStatefulSet(multiClusterStatefulSet);
				if (result == null) result = caseMultiClusterWorkload(multiClusterStatefulSet);
				if (result == null) result = caseMultiClusterResource(multiClusterStatefulSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_DAEMON_SET: {
				MultiClusterDaemonSet multiClusterDaemonSet = (MultiClusterDaemonSet)theEObject;
				T result = caseMultiClusterDaemonSet(multiClusterDaemonSet);
				if (result == null) result = caseMultiClusterWorkload(multiClusterDaemonSet);
				if (result == null) result = caseMultiClusterResource(multiClusterDaemonSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_CRON_JOB: {
				MultiClusterCronJob multiClusterCronJob = (MultiClusterCronJob)theEObject;
				T result = caseMultiClusterCronJob(multiClusterCronJob);
				if (result == null) result = caseMultiClusterWorkload(multiClusterCronJob);
				if (result == null) result = caseMultiClusterResource(multiClusterCronJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_POD: {
				MultiClusterPod multiClusterPod = (MultiClusterPod)theEObject;
				T result = caseMultiClusterPod(multiClusterPod);
				if (result == null) result = caseMultiClusterWorkload(multiClusterPod);
				if (result == null) result = caseMultiClusterResource(multiClusterPod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_NETWORK: {
				MultiClusterNetwork multiClusterNetwork = (MultiClusterNetwork)theEObject;
				T result = caseMultiClusterNetwork(multiClusterNetwork);
				if (result == null) result = caseMultiClusterResource(multiClusterNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_SERVICE: {
				MultiClusterService multiClusterService = (MultiClusterService)theEObject;
				T result = caseMultiClusterService(multiClusterService);
				if (result == null) result = caseMultiClusterNetwork(multiClusterService);
				if (result == null) result = caseMultiClusterResource(multiClusterService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_INGRESS: {
				MultiClusterIngress multiClusterIngress = (MultiClusterIngress)theEObject;
				T result = caseMultiClusterIngress(multiClusterIngress);
				if (result == null) result = caseMultiClusterNetwork(multiClusterIngress);
				if (result == null) result = caseMultiClusterResource(multiClusterIngress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_STORAGE: {
				MultiClusterStorage multiClusterStorage = (MultiClusterStorage)theEObject;
				T result = caseMultiClusterStorage(multiClusterStorage);
				if (result == null) result = caseMultiClusterResource(multiClusterStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_PERSISTENT_VOLUME: {
				MultiClusterPersistentVolume multiClusterPersistentVolume = (MultiClusterPersistentVolume)theEObject;
				T result = caseMultiClusterPersistentVolume(multiClusterPersistentVolume);
				if (result == null) result = caseMultiClusterStorage(multiClusterPersistentVolume);
				if (result == null) result = caseMultiClusterResource(multiClusterPersistentVolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM: {
				MultiClusterPersistentVolumeClaim multiClusterPersistentVolumeClaim = (MultiClusterPersistentVolumeClaim)theEObject;
				T result = caseMultiClusterPersistentVolumeClaim(multiClusterPersistentVolumeClaim);
				if (result == null) result = caseMultiClusterStorage(multiClusterPersistentVolumeClaim);
				if (result == null) result = caseMultiClusterResource(multiClusterPersistentVolumeClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_SECURITY: {
				MultiClusterSecurity multiClusterSecurity = (MultiClusterSecurity)theEObject;
				T result = caseMultiClusterSecurity(multiClusterSecurity);
				if (result == null) result = caseMultiClusterResource(multiClusterSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_ROLE: {
				MultiClusterRole multiClusterRole = (MultiClusterRole)theEObject;
				T result = caseMultiClusterRole(multiClusterRole);
				if (result == null) result = caseMultiClusterSecurity(multiClusterRole);
				if (result == null) result = caseMultiClusterResource(multiClusterRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_ROLE_BINDING: {
				MultiClusterRoleBinding multiClusterRoleBinding = (MultiClusterRoleBinding)theEObject;
				T result = caseMultiClusterRoleBinding(multiClusterRoleBinding);
				if (result == null) result = caseMultiClusterSecurity(multiClusterRoleBinding);
				if (result == null) result = caseMultiClusterResource(multiClusterRoleBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_SECRET: {
				MultiClusterSecret multiClusterSecret = (MultiClusterSecret)theEObject;
				T result = caseMultiClusterSecret(multiClusterSecret);
				if (result == null) result = caseMultiClusterSecurity(multiClusterSecret);
				if (result == null) result = caseMultiClusterResource(multiClusterSecret);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MulticlusterPackage.MULTI_CLUSTER_CONFIG_MAP: {
				MultiClusterConfigMap multiClusterConfigMap = (MultiClusterConfigMap)theEObject;
				T result = caseMultiClusterConfigMap(multiClusterConfigMap);
				if (result == null) result = caseMultiClusterSecurity(multiClusterConfigMap);
				if (result == null) result = caseMultiClusterResource(multiClusterConfigMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterResource(MultiClusterResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusterSelector(ClusterSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterWorkload(MultiClusterWorkload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterDeployment(MultiClusterDeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Stateful Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Stateful Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterStatefulSet(MultiClusterStatefulSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Daemon Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Daemon Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterDaemonSet(MultiClusterDaemonSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Cron Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Cron Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterCronJob(MultiClusterCronJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Pod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Pod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterPod(MultiClusterPod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterNetwork(MultiClusterNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterService(MultiClusterService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Ingress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Ingress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterIngress(MultiClusterIngress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterStorage(MultiClusterStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Persistent Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Persistent Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterPersistentVolume(MultiClusterPersistentVolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Persistent Volume Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Persistent Volume Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterPersistentVolumeClaim(MultiClusterPersistentVolumeClaim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterSecurity(MultiClusterSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterRole(MultiClusterRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Role Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Role Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterRoleBinding(MultiClusterRoleBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Secret</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Secret</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterSecret(MultiClusterSecret object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cluster Config Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cluster Config Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiClusterConfigMap(MultiClusterConfigMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MulticlusterSwitch
