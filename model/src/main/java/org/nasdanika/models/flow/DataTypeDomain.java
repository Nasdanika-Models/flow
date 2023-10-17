/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of data types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.DataTypeDomain#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getDataTypeDomain()
 * @model
 * @generated
 */
public interface DataTypeDomain extends DataTypeDomainElement {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.DataTypeDomainElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data types used in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getDataTypeDomain_DataTypes()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<DataTypeDomainElement> getDataTypes();

} // DataTypeDomain
