/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Participates in flow execution by playing roles in activities 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Participant#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Participant#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Participant#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Participant#getInfos <em>Infos</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends ParticipantDomainElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Role#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles played by this participant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getParticipant_Roles()
	 * @see org.nasdanika.models.flow.Role#getParticipants
	 * @model opposite="participants"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Resource#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources used by this participant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getParticipant_Resources()
	 * @see org.nasdanika.models.flow.Resource#getParticipants
	 * @model opposite="participants"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Artifact#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts this participant works on
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getParticipant_Artifacts()
	 * @see org.nasdanika.models.flow.Artifact#getParticipants
	 * @model opposite="participants"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.ArtifactInfo#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifact infos referencing this participant. An alternative to using roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Infos</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getParticipant_Infos()
	 * @see org.nasdanika.models.flow.ArtifactInfo#getParticipants
	 * @model opposite="participants"
	 * @generated
	 */
	EList<ArtifactInfo> getInfos();

} // Participant
