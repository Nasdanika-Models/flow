/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of particpants
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.ParticipantDomain#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getParticipantDomain()
 * @model
 * @generated
 */
public interface ParticipantDomain extends ParticipantDomainElement {
	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ParticipantDomainElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants of activities in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getParticipantDomain_Participants()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<ParticipantDomainElement> getParticipants();

} // ParticipantDomain
