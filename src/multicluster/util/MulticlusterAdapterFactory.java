/**
 */
package multicluster.util;

import multicluster.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see multicluster.MulticlusterPackage
 * @generated
 */
public class MulticlusterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MulticlusterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticlusterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MulticlusterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticlusterSwitch<Adapter> modelSwitch =
		new MulticlusterSwitch<Adapter>() {
			@Override
			public Adapter caseMultiClusterResource(MultiClusterResource object) {
				return createMultiClusterResourceAdapter();
			}
			@Override
			public Adapter caseClusterSelector(ClusterSelector object) {
				return createClusterSelectorAdapter();
			}
			@Override
			public Adapter caseMultiClusterWorkload(MultiClusterWorkload object) {
				return createMultiClusterWorkloadAdapter();
			}
			@Override
			public Adapter caseMultiClusterDeployment(MultiClusterDeployment object) {
				return createMultiClusterDeploymentAdapter();
			}
			@Override
			public Adapter caseMultiClusterStatefulSet(MultiClusterStatefulSet object) {
				return createMultiClusterStatefulSetAdapter();
			}
			@Override
			public Adapter caseMultiClusterDaemonSet(MultiClusterDaemonSet object) {
				return createMultiClusterDaemonSetAdapter();
			}
			@Override
			public Adapter caseMultiClusterCronJob(MultiClusterCronJob object) {
				return createMultiClusterCronJobAdapter();
			}
			@Override
			public Adapter caseMultiClusterPod(MultiClusterPod object) {
				return createMultiClusterPodAdapter();
			}
			@Override
			public Adapter caseMultiClusterNetwork(MultiClusterNetwork object) {
				return createMultiClusterNetworkAdapter();
			}
			@Override
			public Adapter caseMultiClusterService(MultiClusterService object) {
				return createMultiClusterServiceAdapter();
			}
			@Override
			public Adapter caseMultiClusterIngress(MultiClusterIngress object) {
				return createMultiClusterIngressAdapter();
			}
			@Override
			public Adapter caseMultiClusterStorage(MultiClusterStorage object) {
				return createMultiClusterStorageAdapter();
			}
			@Override
			public Adapter caseMultiClusterPersistentVolume(MultiClusterPersistentVolume object) {
				return createMultiClusterPersistentVolumeAdapter();
			}
			@Override
			public Adapter caseMultiClusterPersistentVolumeClaim(MultiClusterPersistentVolumeClaim object) {
				return createMultiClusterPersistentVolumeClaimAdapter();
			}
			@Override
			public Adapter caseMultiClusterSecurity(MultiClusterSecurity object) {
				return createMultiClusterSecurityAdapter();
			}
			@Override
			public Adapter caseMultiClusterRole(MultiClusterRole object) {
				return createMultiClusterRoleAdapter();
			}
			@Override
			public Adapter caseMultiClusterRoleBinding(MultiClusterRoleBinding object) {
				return createMultiClusterRoleBindingAdapter();
			}
			@Override
			public Adapter caseMultiClusterSecret(MultiClusterSecret object) {
				return createMultiClusterSecretAdapter();
			}
			@Override
			public Adapter caseMultiClusterConfigMap(MultiClusterConfigMap object) {
				return createMultiClusterConfigMapAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterResource <em>Multi Cluster Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterResource
	 * @generated
	 */
	public Adapter createMultiClusterResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.ClusterSelector <em>Cluster Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.ClusterSelector
	 * @generated
	 */
	public Adapter createClusterSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterWorkload <em>Multi Cluster Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterWorkload
	 * @generated
	 */
	public Adapter createMultiClusterWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterDeployment <em>Multi Cluster Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterDeployment
	 * @generated
	 */
	public Adapter createMultiClusterDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterStatefulSet <em>Multi Cluster Stateful Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterStatefulSet
	 * @generated
	 */
	public Adapter createMultiClusterStatefulSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterDaemonSet <em>Multi Cluster Daemon Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterDaemonSet
	 * @generated
	 */
	public Adapter createMultiClusterDaemonSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterCronJob <em>Multi Cluster Cron Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterCronJob
	 * @generated
	 */
	public Adapter createMultiClusterCronJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterPod <em>Multi Cluster Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterPod
	 * @generated
	 */
	public Adapter createMultiClusterPodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterNetwork <em>Multi Cluster Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterNetwork
	 * @generated
	 */
	public Adapter createMultiClusterNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterService <em>Multi Cluster Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterService
	 * @generated
	 */
	public Adapter createMultiClusterServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterIngress <em>Multi Cluster Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterIngress
	 * @generated
	 */
	public Adapter createMultiClusterIngressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterStorage <em>Multi Cluster Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterStorage
	 * @generated
	 */
	public Adapter createMultiClusterStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterPersistentVolume <em>Multi Cluster Persistent Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterPersistentVolume
	 * @generated
	 */
	public Adapter createMultiClusterPersistentVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterPersistentVolumeClaim <em>Multi Cluster Persistent Volume Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterPersistentVolumeClaim
	 * @generated
	 */
	public Adapter createMultiClusterPersistentVolumeClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterSecurity <em>Multi Cluster Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterSecurity
	 * @generated
	 */
	public Adapter createMultiClusterSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterRole <em>Multi Cluster Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterRole
	 * @generated
	 */
	public Adapter createMultiClusterRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterRoleBinding <em>Multi Cluster Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterRoleBinding
	 * @generated
	 */
	public Adapter createMultiClusterRoleBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterSecret <em>Multi Cluster Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterSecret
	 * @generated
	 */
	public Adapter createMultiClusterSecretAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link multicluster.MultiClusterConfigMap <em>Multi Cluster Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see multicluster.MultiClusterConfigMap
	 * @generated
	 */
	public Adapter createMultiClusterConfigMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MulticlusterAdapterFactory
