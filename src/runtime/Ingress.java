/**
 */
package runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link runtime.Ingress#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see runtime.RuntimePackage#getIngress()
 * @model
 * @generated
 */
public interface Ingress extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link runtime.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see runtime.RuntimePackage#getIngress_Services()
	 * @model
	 * @generated
	 */
	EList<Service> getServices();

} // Ingress
