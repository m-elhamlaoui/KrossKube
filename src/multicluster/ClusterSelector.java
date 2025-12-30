/**
 */
package multicluster;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link multicluster.ClusterSelector#getMatchLabels <em>Match Labels</em>}</li>
 *   <li>{@link multicluster.ClusterSelector#getMatchExpressions <em>Match Expressions</em>}</li>
 * </ul>
 *
 * @see multicluster.MulticlusterPackage#getClusterSelector()
 * @model
 * @generated
 */
public interface ClusterSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Labels</em>' attribute list.
	 * @see multicluster.MulticlusterPackage#getClusterSelector_MatchLabels()
	 * @model
	 * @generated
	 */
	EList<String> getMatchLabels();

	/**
	 * Returns the value of the '<em><b>Match Expressions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Expressions</em>' attribute list.
	 * @see multicluster.MulticlusterPackage#getClusterSelector_MatchExpressions()
	 * @model
	 * @generated
	 */
	EList<String> getMatchExpressions();

} // ClusterSelector
