/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Artifact containing other artifacts, e.g. a zip file
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.CompositeArtifact#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getCompositeArtifact()
 * @model
 * @generated
 */
public interface CompositeArtifact extends Artifact {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getCompositeArtifact_Children()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Artifact> getChildren();

} // CompositeArtifact
