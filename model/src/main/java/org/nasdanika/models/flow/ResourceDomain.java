/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.ResourceDomain#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getResourceDomain()
 * @model
 * @generated
 */
public interface ResourceDomain extends ResourceDomainElement {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ResourceDomainElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources used in activities in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getResourceDomain_Resources()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<ResourceDomainElement> getResources();

} // ResourceDomain
