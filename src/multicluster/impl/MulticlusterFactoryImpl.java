/**
 */
package multicluster.impl;

import multicluster.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MulticlusterFactoryImpl extends EFactoryImpl implements MulticlusterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MulticlusterFactory init() {
		try {
			MulticlusterFactory theMulticlusterFactory = (MulticlusterFactory)EPackage.Registry.INSTANCE.getEFactory(MulticlusterPackage.eNS_URI);
			if (theMulticlusterFactory != null) {
				return theMulticlusterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MulticlusterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulticlusterFactoryImpl() {
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
			case MulticlusterPackage.CLUSTER_SELECTOR: return createClusterSelector();
			case MulticlusterPackage.MULTI_CLUSTER_DEPLOYMENT: return createMultiClusterDeployment();
			case MulticlusterPackage.MULTI_CLUSTER_STATEFUL_SET: return createMultiClusterStatefulSet();
			case MulticlusterPackage.MULTI_CLUSTER_DAEMON_SET: return createMultiClusterDaemonSet();
			case MulticlusterPackage.MULTI_CLUSTER_CRON_JOB: return createMultiClusterCronJob();
			case MulticlusterPackage.MULTI_CLUSTER_POD: return createMultiClusterPod();
			case MulticlusterPackage.MULTI_CLUSTER_SERVICE: return createMultiClusterService();
			case MulticlusterPackage.MULTI_CLUSTER_INGRESS: return createMultiClusterIngress();
			case MulticlusterPackage.MULTI_CLUSTER_PERSISTENT_VOLUME: return createMultiClusterPersistentVolume();
			case MulticlusterPackage.MULTI_CLUSTER_PERSISTENT_VOLUME_CLAIM: return createMultiClusterPersistentVolumeClaim();
			case MulticlusterPackage.MULTI_CLUSTER_ROLE: return createMultiClusterRole();
			case MulticlusterPackage.MULTI_CLUSTER_ROLE_BINDING: return createMultiClusterRoleBinding();
			case MulticlusterPackage.MULTI_CLUSTER_SECRET: return createMultiClusterSecret();
			case MulticlusterPackage.MULTI_CLUSTER_CONFIG_MAP: return createMultiClusterConfigMap();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MulticlusterPackage.PLACEMENT_POLICY:
				return createPlacementPolicyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MulticlusterPackage.PLACEMENT_POLICY:
				return convertPlacementPolicyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClusterSelector createClusterSelector() {
		ClusterSelectorImpl clusterSelector = new ClusterSelectorImpl();
		return clusterSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterDeployment createMultiClusterDeployment() {
		MultiClusterDeploymentImpl multiClusterDeployment = new MultiClusterDeploymentImpl();
		return multiClusterDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterStatefulSet createMultiClusterStatefulSet() {
		MultiClusterStatefulSetImpl multiClusterStatefulSet = new MultiClusterStatefulSetImpl();
		return multiClusterStatefulSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterDaemonSet createMultiClusterDaemonSet() {
		MultiClusterDaemonSetImpl multiClusterDaemonSet = new MultiClusterDaemonSetImpl();
		return multiClusterDaemonSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterCronJob createMultiClusterCronJob() {
		MultiClusterCronJobImpl multiClusterCronJob = new MultiClusterCronJobImpl();
		return multiClusterCronJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterPod createMultiClusterPod() {
		MultiClusterPodImpl multiClusterPod = new MultiClusterPodImpl();
		return multiClusterPod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterService createMultiClusterService() {
		MultiClusterServiceImpl multiClusterService = new MultiClusterServiceImpl();
		return multiClusterService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterIngress createMultiClusterIngress() {
		MultiClusterIngressImpl multiClusterIngress = new MultiClusterIngressImpl();
		return multiClusterIngress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterPersistentVolume createMultiClusterPersistentVolume() {
		MultiClusterPersistentVolumeImpl multiClusterPersistentVolume = new MultiClusterPersistentVolumeImpl();
		return multiClusterPersistentVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterPersistentVolumeClaim createMultiClusterPersistentVolumeClaim() {
		MultiClusterPersistentVolumeClaimImpl multiClusterPersistentVolumeClaim = new MultiClusterPersistentVolumeClaimImpl();
		return multiClusterPersistentVolumeClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterRole createMultiClusterRole() {
		MultiClusterRoleImpl multiClusterRole = new MultiClusterRoleImpl();
		return multiClusterRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterRoleBinding createMultiClusterRoleBinding() {
		MultiClusterRoleBindingImpl multiClusterRoleBinding = new MultiClusterRoleBindingImpl();
		return multiClusterRoleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterSecret createMultiClusterSecret() {
		MultiClusterSecretImpl multiClusterSecret = new MultiClusterSecretImpl();
		return multiClusterSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiClusterConfigMap createMultiClusterConfigMap() {
		MultiClusterConfigMapImpl multiClusterConfigMap = new MultiClusterConfigMapImpl();
		return multiClusterConfigMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementPolicy createPlacementPolicyFromString(EDataType eDataType, String initialValue) {
		PlacementPolicy result = PlacementPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlacementPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulticlusterPackage getMulticlusterPackage() {
		return (MulticlusterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MulticlusterPackage getPackage() {
		return MulticlusterPackage.eINSTANCE;
	}

} //MulticlusterFactoryImpl
