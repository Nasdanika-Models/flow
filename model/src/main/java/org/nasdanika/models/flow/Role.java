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
 *   <li>{@link org.nasdanika.models.flow.Role#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Role#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Role#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Role#getInfos <em>Infos</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Participant}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Participant#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants playing this role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getRole_Players()
	 * @see org.nasdanika.models.flow.Participant#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Participant> getPlayers();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Artifact#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts used by this role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getRole_Artifacts()
	 * @see org.nasdanika.models.flow.Artifact#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

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

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.ArtifactInfo#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifact infos mentioning this role
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Infos</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getRole_Infos()
	 * @see org.nasdanika.models.flow.ArtifactInfo#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<ArtifactInfo> getInfos();

} // Role
