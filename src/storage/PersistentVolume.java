/**
 */
package storage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link storage.PersistentVolume#getExternalStorage <em>External Storage</em>}</li>
 * </ul>
 *
 * @see storage.StoragePackage#getPersistentVolume()
 * @model
 * @generated
 */
public interface PersistentVolume extends EObject {
	/**
	 * Returns the value of the '<em><b>External Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Storage</em>' reference.
	 * @see #setExternalStorage(ExternalStorage)
	 * @see storage.StoragePackage#getPersistentVolume_ExternalStorage()
	 * @model
	 * @generated
	 */
	ExternalStorage getExternalStorage();

	/**
	 * Sets the value of the '{@link storage.PersistentVolume#getExternalStorage <em>External Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Storage</em>' reference.
	 * @see #getExternalStorage()
	 * @generated
	 */
	void setExternalStorage(ExternalStorage value);

} // PersistentVolume
