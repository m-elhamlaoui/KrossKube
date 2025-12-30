/**
 */
package config;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link config.ConfigMap#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see config.ConfigPackage#getConfigMap()
 * @model
 * @generated
 */
public interface ConfigMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see config.ConfigPackage#getConfigMap_Data()
	 * @model
	 * @generated
	 */
	EList<String> getData();

} // ConfigMap
