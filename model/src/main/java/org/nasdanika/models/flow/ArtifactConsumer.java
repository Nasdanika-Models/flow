/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.ArtifactConsumer#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getArtifactConsumer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ArtifactConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inputs to this target coming from one or more connections
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifactConsumer_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactInfo> getInputs();

} // ArtifactConsumer
