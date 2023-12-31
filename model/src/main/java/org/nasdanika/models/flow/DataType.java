/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type of data. E.g. Number, Date, Text, Person
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.DataType#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.DataType#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends DataTypeDomainElement, Collaboratable<Role> {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.DataType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base of this data type. E.g. SSN data type may have Text data type as its base.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(DataType)
	 * @see org.nasdanika.models.flow.FlowPackage#getDataType_Base()
	 * @see org.nasdanika.models.flow.DataType#getExtensions
	 * @model opposite="extensions"
	 * @generated
	 */
	DataType getBase();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.flow.DataType#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(DataType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.DataType}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.DataType#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getDataType_Extensions()
	 * @see org.nasdanika.models.flow.DataType#getBase
	 * @model opposite="base"
	 * @generated
	 */
	EList<DataType> getExtensions();

} // DataType
