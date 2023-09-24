/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sends a request payload to its target and returns response to its source. Request-response semantics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Call#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Transition {
	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Call response - references to target outputs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getCall_Response()
	 * @model
	 * @generated
	 */
	EList<ArtifactInfo> getResponse();

} // Call
