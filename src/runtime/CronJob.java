/**
 */
package runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cron Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link runtime.CronJob#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see runtime.RuntimePackage#getCronJob()
 * @model
 * @generated
 */
public interface CronJob extends EObject {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link runtime.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see runtime.RuntimePackage#getCronJob_Jobs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Job> getJobs();

} // CronJob
