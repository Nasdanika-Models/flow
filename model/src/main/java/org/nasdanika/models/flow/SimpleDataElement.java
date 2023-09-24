/**
 */
package org.nasdanika.models.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A scalar, but may contain multiple values of the same type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.SimpleDataElement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getSimpleDataElement()
 * @model
 * @generated
 */
public interface SimpleDataElement extends DataElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element's type. E.g. ssn data element may be of SSN data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.nasdanika.models.flow.FlowPackage#getSimpleDataElement_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.flow.SimpleDataElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // SimpleDataElement
