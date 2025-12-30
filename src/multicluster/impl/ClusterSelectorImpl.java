/**
 */
package multicluster.impl;

import java.util.Collection;

import multicluster.ClusterSelector;
import multicluster.MulticlusterPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link multicluster.impl.ClusterSelectorImpl#getMatchLabels <em>Match Labels</em>}</li>
 *   <li>{@link multicluster.impl.ClusterSelectorImpl#getMatchExpressions <em>Match Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterSelectorImpl extends MinimalEObjectImpl.Container implements ClusterSelector {
	/**
	 * The cached value of the '{@link #getMatchLabels() <em>Match Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> matchLabels;

	/**
	 * The cached value of the '{@link #getMatchExpressions() <em>Match Expressions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> matchExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MulticlusterPackage.Literals.CLUSTER_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMatchLabels() {
		if (matchLabels == null) {
			matchLabels = new EDataTypeUniqueEList<String>(String.class, this, MulticlusterPackage.CLUSTER_SELECTOR__MATCH_LABELS);
		}
		return matchLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMatchExpressions() {
		if (matchExpressions == null) {
			matchExpressions = new EDataTypeUniqueEList<String>(String.class, this, MulticlusterPackage.CLUSTER_SELECTOR__MATCH_EXPRESSIONS);
		}
		return matchExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MulticlusterPackage.CLUSTER_SELECTOR__MATCH_LABELS:
				return getMatchLabels();
			case MulticlusterPackage.CLUSTER_SELECTOR__MATCH_EXPRESSIONS:
				return getMatchExpressions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MulticlusterPackage.CLUSTER_SELECTOR__MATCH_LABELS:
				getMatchLabels().clear();
				getMatchLabels().addAll((Collection<? extends String>)newValue);
				return;
			case MulticlusterPackage.CLUSTER_SELECTOR__MATCH_EXPRESSIONS:
				getMatchExpressions().clear();
				getMatchExpressions().addAll((Collection<? extends String>)newValue);
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
			case MulticlusterPackage.CLUSTER_SELECTOR__MATCH_LABELS:
				getMatchLabels().clear();
				return;
			case MulticlusterPackage.CLUSTER_SELECTOR__MATCH_EXPRESSIONS:
				getMatchExpressions().clear();
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
			case MulticlusterPackage.CLUSTER_SELECTOR__MATCH_LABELS:
				return matchLabels != null && !matchLabels.isEmpty();
			case MulticlusterPackage.CLUSTER_SELECTOR__MATCH_EXPRESSIONS:
				return matchExpressions != null && !matchExpressions.isEmpty();
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
		result.append(" (matchLabels: ");
		result.append(matchLabels);
		result.append(", matchExpressions: ");
		result.append(matchExpressions);
		result.append(')');
		return result.toString();
	}

} //ClusterSelectorImpl
