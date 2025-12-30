/**
 */
package runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link runtime.Container#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link runtime.Container#getDockerImage <em>Docker Image</em>}</li>
 * </ul>
 *
 * @see runtime.RuntimePackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' containment reference list.
	 * The list contents are of type {@link runtime.EnvironmentVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' containment reference list.
	 * @see runtime.RuntimePackage#getContainer_EnvironmentVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentVariable> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Docker Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Image</em>' reference.
	 * @see #setDockerImage(DockerImage)
	 * @see runtime.RuntimePackage#getContainer_DockerImage()
	 * @model
	 * @generated
	 */
	DockerImage getDockerImage();

	/**
	 * Sets the value of the '{@link runtime.Container#getDockerImage <em>Docker Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Image</em>' reference.
	 * @see #getDockerImage()
	 * @generated
	 */
	void setDockerImage(DockerImage value);

} // Container
