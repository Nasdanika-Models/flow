/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about input/output artifact
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.ArtifactInfo#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.ArtifactInfo#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.ArtifactInfo#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getArtifactInfo()
 * @model
 * @generated
 */
public interface ArtifactInfo extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Artifact#getInfos <em>Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact</em>' reference.
	 * @see #setArtifact(Artifact)
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifactInfo_Artifact()
	 * @see org.nasdanika.models.flow.Artifact#getInfos
	 * @model opposite="infos" required="true"
	 * @generated
	 */
	Artifact getArtifact();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.flow.ArtifactInfo#getArtifact <em>Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Resource#getInfos <em>Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources used to work on the artifact or store the artifact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifactInfo_Resources()
	 * @see org.nasdanika.models.flow.Resource#getInfos
	 * @model opposite="infos"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Participant}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Participant#getInfos <em>Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants working on the artifact using resources - an alternative to roles
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifactInfo_Participants()
	 * @see org.nasdanika.models.flow.Participant#getInfos
	 * @model opposite="infos"
	 * @generated
	 */
	EList<Participant> getParticipants();

} // ArtifactInfo
