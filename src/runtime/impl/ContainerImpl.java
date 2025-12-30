/**
 */
package runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import runtime.DockerImage;
import runtime.EnvironmentVariable;
import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link runtime.impl.ContainerImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link runtime.impl.ContainerImpl#getDockerImage <em>Docker Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements runtime.Container {
	/**
	 * The cached value of the '{@link #getEnvironmentVariables() <em>Environment Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentVariable> environmentVariables;

	/**
	 * The cached value of the '{@link #getDockerImage() <em>Docker Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerImage()
	 * @generated
	 * @ordered
	 */
	protected DockerImage dockerImage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvironmentVariable> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EObjectContainmentEList<EnvironmentVariable>(EnvironmentVariable.class, this, RuntimePackage.CONTAINER__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerImage getDockerImage() {
		if (dockerImage != null && dockerImage.eIsProxy()) {
			InternalEObject oldDockerImage = (InternalEObject)dockerImage;
			dockerImage = (DockerImage)eResolveProxy(oldDockerImage);
			if (dockerImage != oldDockerImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.CONTAINER__DOCKER_IMAGE, oldDockerImage, dockerImage));
			}
		}
		return dockerImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerImage basicGetDockerImage() {
		return dockerImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerImage(DockerImage newDockerImage) {
		DockerImage oldDockerImage = dockerImage;
		dockerImage = newDockerImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.CONTAINER__DOCKER_IMAGE, oldDockerImage, dockerImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.CONTAINER__ENVIRONMENT_VARIABLES:
				return ((InternalEList<?>)getEnvironmentVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.CONTAINER__ENVIRONMENT_VARIABLES:
				return getEnvironmentVariables();
			case RuntimePackage.CONTAINER__DOCKER_IMAGE:
				if (resolve) return getDockerImage();
				return basicGetDockerImage();
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
			case RuntimePackage.CONTAINER__ENVIRONMENT_VARIABLES:
				getEnvironmentVariables().clear();
				getEnvironmentVariables().addAll((Collection<? extends EnvironmentVariable>)newValue);
				return;
			case RuntimePackage.CONTAINER__DOCKER_IMAGE:
				setDockerImage((DockerImage)newValue);
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
			case RuntimePackage.CONTAINER__ENVIRONMENT_VARIABLES:
				getEnvironmentVariables().clear();
				return;
			case RuntimePackage.CONTAINER__DOCKER_IMAGE:
				setDockerImage((DockerImage)null);
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
			case RuntimePackage.CONTAINER__ENVIRONMENT_VARIABLES:
				return environmentVariables != null && !environmentVariables.isEmpty();
			case RuntimePackage.CONTAINER__DOCKER_IMAGE:
				return dockerImage != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
