/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of data elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.DataDomain#getDataElements <em>Data Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getDataDomain()
 * @model
 * @generated
 */
public interface DataDomain extends DataDomainElement {
	/**
	 * Returns the value of the '<em><b>Data Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.DataDomainElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data elements used in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Elements</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getDataDomain_DataElements()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<DataDomainElement> getDataElements();

} // DataDomain
