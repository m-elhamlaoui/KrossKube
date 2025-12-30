/**
 */
package storage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent Volume Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link storage.PersistentVolumeClaim#getPersistentVolume <em>Persistent Volume</em>}</li>
 * </ul>
 *
 * @see storage.StoragePackage#getPersistentVolumeClaim()
 * @model
 * @generated
 */
public interface PersistentVolumeClaim extends EObject {
	/**
	 * Returns the value of the '<em><b>Persistent Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent Volume</em>' reference.
	 * @see #setPersistentVolume(PersistentVolume)
	 * @see storage.StoragePackage#getPersistentVolumeClaim_PersistentVolume()
	 * @model
	 * @generated
	 */
	PersistentVolume getPersistentVolume();

	/**
	 * Sets the value of the '{@link storage.PersistentVolumeClaim#getPersistentVolume <em>Persistent Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent Volume</em>' reference.
	 * @see #getPersistentVolume()
	 * @generated
	 */
	void setPersistentVolume(PersistentVolume value);

} // PersistentVolumeClaim
