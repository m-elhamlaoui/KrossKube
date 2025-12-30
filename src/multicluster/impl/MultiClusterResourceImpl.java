/**
 */
package multicluster.impl;

import multicluster.ClusterSelector;
import multicluster.MultiClusterResource;
import multicluster.MulticlusterPackage;
import multicluster.PlacementPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Cluster Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link multicluster.impl.MultiClusterResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link multicluster.impl.MultiClusterResourceImpl#getClusterSelector <em>Cluster Selector</em>}</li>
 *   <li>{@link multicluster.impl.MultiClusterResourceImpl#getPlacementPolicy <em>Placement Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MultiClusterResourceImpl extends MinimalEObjectImpl.Container implements MultiClusterResource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClusterSelector() <em>Cluster Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterSelector()
	 * @generated
	 * @ordered
	 */
	protected ClusterSelector clusterSelector;

	/**
	 * The default value of the '{@link #getPlacementPolicy() <em>Placement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final PlacementPolicy PLACEMENT_POLICY_EDEFAULT = PlacementPolicy.REPLICATED;

	/**
	 * The cached value of the '{@link #getPlacementPolicy() <em>Placement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementPolicy()
	 * @generated
	 * @ordered
	 */
	protected PlacementPolicy placementPolicy = PLACEMENT_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiClusterResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MulticlusterPackage.Literals.MULTI_CLUSTER_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MulticlusterPackage.MULTI_CLUSTER_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClusterSelector getClusterSelector() {
		return clusterSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClusterSelector(ClusterSelector newClusterSelector, NotificationChain msgs) {
		ClusterSelector oldClusterSelector = clusterSelector;
		clusterSelector = newClusterSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR, oldClusterSelector, newClusterSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterSelector(ClusterSelector newClusterSelector) {
		if (newClusterSelector != clusterSelector) {
			NotificationChain msgs = null;
			if (clusterSelector != null)
				msgs = ((InternalEObject)clusterSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR, null, msgs);
			if (newClusterSelector != null)
				msgs = ((InternalEObject)newClusterSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR, null, msgs);
			msgs = basicSetClusterSelector(newClusterSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR, newClusterSelector, newClusterSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlacementPolicy getPlacementPolicy() {
		return placementPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlacementPolicy(PlacementPolicy newPlacementPolicy) {
		PlacementPolicy oldPlacementPolicy = placementPolicy;
		placementPolicy = newPlacementPolicy == null ? PLACEMENT_POLICY_EDEFAULT : newPlacementPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MulticlusterPackage.MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY, oldPlacementPolicy, placementPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR:
				return basicSetClusterSelector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__NAME:
				return getName();
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR:
				return getClusterSelector();
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY:
				return getPlacementPolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR:
				setClusterSelector((ClusterSelector)newValue);
				return;
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY:
				setPlacementPolicy((PlacementPolicy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR:
				setClusterSelector((ClusterSelector)null);
				return;
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY:
				setPlacementPolicy(PLACEMENT_POLICY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__CLUSTER_SELECTOR:
				return clusterSelector != null;
			case MulticlusterPackage.MULTI_CLUSTER_RESOURCE__PLACEMENT_POLICY:
				return placementPolicy != PLACEMENT_POLICY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", placementPolicy: ");
		result.append(placementPolicy);
		result.append(')');
		return result.toString();
	}

} //MultiClusterResourceImpl
