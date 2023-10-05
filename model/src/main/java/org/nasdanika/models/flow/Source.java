/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getSource()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Source extends ArtifactProducer {
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

} // Source
