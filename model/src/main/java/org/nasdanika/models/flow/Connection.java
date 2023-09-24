/**
 */
package org.nasdanika.models.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for Transitions and Calls. Contained by its source.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Target#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connection target
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Target)
	 * @see org.nasdanika.models.flow.FlowPackage#getConnection_Target()
	 * @see org.nasdanika.models.flow.Target#getIncomingConnections
	 * @model opposite="incomingConnections"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.flow.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

} // Connection
