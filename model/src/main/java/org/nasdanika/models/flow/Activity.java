/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An activity is performed by participants in roles using resources and input artifacts to produce output artifacts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Activity#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Activity#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Activity#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Node {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participant roles for this activity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getActivity_Roles()
	 * @model keys="id"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Resource#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources used in this activity. Resources can also be specified via roles and artifact info.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getActivity_Resources()
	 * @see org.nasdanika.models.flow.Resource#getActivities
	 * @model opposite="activities"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Participant}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Participant#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partipants of this activity. Can be used if grouping by roles is not required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getActivity_Participants()
	 * @see org.nasdanika.models.flow.Participant#getActivities
	 * @model opposite="activities"
	 * @generated
	 */
	EList<Participant> getParticipants();

} // Activity
