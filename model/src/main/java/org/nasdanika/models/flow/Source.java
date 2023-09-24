/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source of connections
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Source#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Source#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getSource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Source extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source outgoing connections
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getSource_OutgoingConnections()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Connection> getOutgoingConnections();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outputs of this source used by one or more transitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getSource_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactInfo> getOutputs();

} // Source
