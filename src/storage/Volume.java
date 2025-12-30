/**
 */
package storage;

import config.ConfigMap;
import config.Secret;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link storage.Volume#getClaim <em>Claim</em>}</li>
 *   <li>{@link storage.Volume#getSecret <em>Secret</em>}</li>
 *   <li>{@link storage.Volume#getConfigMap <em>Config Map</em>}</li>
 * </ul>
 *
 * @see storage.StoragePackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim</em>' reference.
	 * @see #setClaim(PersistentVolumeClaim)
	 * @see storage.StoragePackage#getVolume_Claim()
	 * @model
	 * @generated
	 */
	PersistentVolumeClaim getClaim();

	/**
	 * Sets the value of the '{@link storage.Volume#getClaim <em>Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(PersistentVolumeClaim value);

	/**
	 * Returns the value of the '<em><b>Secret</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' reference.
	 * @see #setSecret(Secret)
	 * @see storage.StoragePackage#getVolume_Secret()
	 * @model
	 * @generated
	 */
	Secret getSecret();

	/**
	 * Sets the value of the '{@link storage.Volume#getSecret <em>Secret</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' reference.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(Secret value);

	/**
	 * Returns the value of the '<em><b>Config Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Map</em>' reference.
	 * @see #setConfigMap(ConfigMap)
	 * @see storage.StoragePackage#getVolume_ConfigMap()
	 * @model
	 * @generated
	 */
	ConfigMap getConfigMap();

	/**
	 * Sets the value of the '{@link storage.Volume#getConfigMap <em>Config Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Map</em>' reference.
	 * @see #getConfigMap()
	 * @generated
	 */
	void setConfigMap(ConfigMap value);

} // Volume
