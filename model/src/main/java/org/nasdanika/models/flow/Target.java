/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for connection targets
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Target#getIncomingConnections <em>Incoming Connections</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getTarget()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Target extends ArtifactConsumer {
	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Connection}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming connections - opposite to Connection.target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getTarget_IncomingConnections()
	 * @see org.nasdanika.models.flow.Connection#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Connection> getIncomingConnections();

} // Target
