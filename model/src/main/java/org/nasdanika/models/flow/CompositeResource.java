/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resource containing other resources, e.g. a file system or a tool suite
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.CompositeResource#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getCompositeResource()
 * @model
 * @generated
 */
public interface CompositeResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getCompositeResource_Children()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Resource> getChildren();

} // CompositeResource
