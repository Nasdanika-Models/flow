/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transition passes control and payload from its source to its target. Fire-and-forget semantics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Transition#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Connection {
	/**
	 * Returns the value of the '<em><b>Payload</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transition palyoad - references to source outputs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getTransition_Payload()
	 * @model
	 * @generated
	 */
	EList<ArtifactInfo> getPayload();

} // Transition
