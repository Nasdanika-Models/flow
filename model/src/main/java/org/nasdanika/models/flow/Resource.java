/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resource is something used by participants/roles to work with artifacts. It may be a tool, or a repository.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Resource#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Resource#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Resource#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Resource#getInfos <em>Infos</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Resource#getResourceAreas <em>Resource Areas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends ResourceDomainElement {
	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Artifact#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts which this resource operates with. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getResource_Artifacts()
	 * @see org.nasdanika.models.flow.Artifact#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Role#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles which use this resource
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getResource_Roles()
	 * @see org.nasdanika.models.flow.Role#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Participant}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Participant#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants using this resource
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getResource_Participants()
	 * @see org.nasdanika.models.flow.Participant#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.ArtifactInfo#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ArtifactInfo which reference this resource
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Infos</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getResource_Infos()
	 * @see org.nasdanika.models.flow.ArtifactInfo#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	EList<ArtifactInfo> getInfos();

	/**
	 * Returns the value of the '<em><b>Resource Areas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource may be sub-divided into areas. E.g. GitHub has Git repositories, Actions, Pages, Wiki.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Areas</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getResource_ResourceAreas()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Resource> getResourceAreas();

} // Resource
