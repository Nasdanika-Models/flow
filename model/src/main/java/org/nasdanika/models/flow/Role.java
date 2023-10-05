/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role of a participant in an activity
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Role#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Role#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ModelElement, ArtifactProcessor {
	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Participant}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Participant#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants playing this role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getRole_Participants()
	 * @see org.nasdanika.models.flow.Participant#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Resource#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources used by this role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getRole_Resources()
	 * @see org.nasdanika.models.flow.Resource#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Resource> getResources();

} // Role
