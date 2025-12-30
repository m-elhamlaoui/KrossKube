/**
 */
package multicluster;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Cluster Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link multicluster.MultiClusterResource#getName <em>Name</em>}</li>
 *   <li>{@link multicluster.MultiClusterResource#getClusterSelector <em>Cluster Selector</em>}</li>
 *   <li>{@link multicluster.MultiClusterResource#getPlacementPolicy <em>Placement Policy</em>}</li>
 * </ul>
 *
 * @see multicluster.MulticlusterPackage#getMultiClusterResource()
 * @model abstract="true"
 * @generated
 */
public interface MultiClusterResource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see multicluster.MulticlusterPackage#getMultiClusterResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link multicluster.MultiClusterResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cluster Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Selector</em>' containment reference.
	 * @see #setClusterSelector(ClusterSelector)
	 * @see multicluster.MulticlusterPackage#getMultiClusterResource_ClusterSelector()
	 * @model containment="true"
	 * @generated
	 */
	ClusterSelector getClusterSelector();

	/**
	 * Sets the value of the '{@link multicluster.MultiClusterResource#getClusterSelector <em>Cluster Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Selector</em>' containment reference.
	 * @see #getClusterSelector()
	 * @generated
	 */
	void setClusterSelector(ClusterSelector value);

	/**
	 * Returns the value of the '<em><b>Placement Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link multicluster.PlacementPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Policy</em>' attribute.
	 * @see multicluster.PlacementPolicy
	 * @see #setPlacementPolicy(PlacementPolicy)
	 * @see multicluster.MulticlusterPackage#getMultiClusterResource_PlacementPolicy()
	 * @model
	 * @generated
	 */
	PlacementPolicy getPlacementPolicy();

	/**
	 * Sets the value of the '{@link multicluster.MultiClusterResource#getPlacementPolicy <em>Placement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Policy</em>' attribute.
	 * @see multicluster.PlacementPolicy
	 * @see #getPlacementPolicy()
	 * @generated
	 */
	void setPlacementPolicy(PlacementPolicy value);

} // MultiClusterResource
