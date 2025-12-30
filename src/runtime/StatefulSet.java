/**
 */
package runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateful Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link runtime.StatefulSet#getPods <em>Pods</em>}</li>
 * </ul>
 *
 * @see runtime.RuntimePackage#getStatefulSet()
 * @model
 * @generated
 */
public interface StatefulSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Pods</b></em>' containment reference list.
	 * The list contents are of type {@link runtime.Pod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pods</em>' containment reference list.
	 * @see runtime.RuntimePackage#getStatefulSet_Pods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pod> getPods();

} // StatefulSet
