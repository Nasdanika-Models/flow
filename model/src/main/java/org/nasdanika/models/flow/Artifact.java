/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information passed between flow elements and operated on by participants using resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Artifact#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Artifact#getDataElements <em>Data Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Artifact#getInfos <em>Infos</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Artifact#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Artifact#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Resource#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resorces which operate with this artifact. E.g. a Java source file artifact is edited in a Java IDE resource and stored in a version control repository resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifact_Resources()
	 * @see org.nasdanika.models.flow.Resource#getArtifacts
	 * @model opposite="artifacts"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Data Elements</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.DataElement}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.DataElement#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data element used in this artifact. E.g. a JSON structure may use Person data element/type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Elements</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifact_DataElements()
	 * @see org.nasdanika.models.flow.DataElement#getArtifacts
	 * @model opposite="artifacts"
	 * @generated
	 */
	EList<DataElement> getDataElements();

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.ArtifactInfo#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opposite to ArtifactInfo.artifact - all infos which use this artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Infos</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifact_Infos()
	 * @see org.nasdanika.models.flow.ArtifactInfo#getArtifact
	 * @model opposite="artifact"
	 * @generated
	 */
	EList<ArtifactInfo> getInfos();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Participant}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Participant#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants which use this artifact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifact_Participants()
	 * @see org.nasdanika.models.flow.Participant#getArtifacts
	 * @model opposite="artifacts"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Role#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles which use this artifact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifact_Roles()
	 * @see org.nasdanika.models.flow.Role#getArtifacts
	 * @model opposite="artifacts"
	 * @generated
	 */
	EList<Role> getRoles();

} // Artifact
