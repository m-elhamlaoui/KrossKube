/**
 */
package runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import runtime.Deployment;
import runtime.ReplicaSet;
import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link runtime.impl.DeploymentImpl#getReplicaSet <em>Replica Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The cached value of the '{@link #getReplicaSet() <em>Replica Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaSet()
	 * @generated
	 * @ordered
	 */
	protected ReplicaSet replicaSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReplicaSet getReplicaSet() {
		return replicaSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplicaSet(ReplicaSet newReplicaSet, NotificationChain msgs) {
		ReplicaSet oldReplicaSet = replicaSet;
		replicaSet = newReplicaSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.DEPLOYMENT__REPLICA_SET, oldReplicaSet, newReplicaSet);
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
	public void setReplicaSet(ReplicaSet newReplicaSet) {
		if (newReplicaSet != replicaSet) {
			NotificationChain msgs = null;
			if (replicaSet != null)
				msgs = ((InternalEObject)replicaSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.DEPLOYMENT__REPLICA_SET, null, msgs);
			if (newReplicaSet != null)
				msgs = ((InternalEObject)newReplicaSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.DEPLOYMENT__REPLICA_SET, null, msgs);
			msgs = basicSetReplicaSet(newReplicaSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.DEPLOYMENT__REPLICA_SET, newReplicaSet, newReplicaSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.DEPLOYMENT__REPLICA_SET:
				return basicSetReplicaSet(null, msgs);
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
			case RuntimePackage.DEPLOYMENT__REPLICA_SET:
				return getReplicaSet();
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
			case RuntimePackage.DEPLOYMENT__REPLICA_SET:
				setReplicaSet((ReplicaSet)newValue);
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
			case RuntimePackage.DEPLOYMENT__REPLICA_SET:
				setReplicaSet((ReplicaSet)null);
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
			case RuntimePackage.DEPLOYMENT__REPLICA_SET:
				return replicaSet != null;
		}
		return super.eIsSet(featureID);
	}

} //DeploymentImpl
