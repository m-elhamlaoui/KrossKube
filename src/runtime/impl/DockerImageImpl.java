/**
 */
package runtime.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import runtime.DockerImage;
import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DockerImageImpl extends MinimalEObjectImpl.Container implements DockerImage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.DOCKER_IMAGE;
	}

} //DockerImageImpl
