/**
 */
package storage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see storage.StoragePackage
 * @generated
 */
public interface StorageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StorageFactory eINSTANCE = storage.impl.StorageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>External Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Storage</em>'.
	 * @generated
	 */
	ExternalStorage createExternalStorage();

	/**
	 * Returns a new object of class '<em>Persistent Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistent Volume</em>'.
	 * @generated
	 */
	PersistentVolume createPersistentVolume();

	/**
	 * Returns a new object of class '<em>Persistent Volume Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistent Volume Claim</em>'.
	 * @generated
	 */
	PersistentVolumeClaim createPersistentVolumeClaim();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StoragePackage getStoragePackage();

} //StorageFactory
