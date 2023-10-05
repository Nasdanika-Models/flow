/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.ArtifactProducer#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getArtifactProducer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ArtifactProducer extends EObject {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ArtifactInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about produced artifacts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getArtifactProducer_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactInfo> getOutputs();

} // ArtifactProducer
