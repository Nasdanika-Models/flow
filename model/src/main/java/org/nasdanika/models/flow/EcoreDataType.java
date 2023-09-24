/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecore Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type defined in Ecore model
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.EcoreDataType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getEcoreDataType()
 * @model
 * @generated
 */
public interface EcoreDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type Eclassifier
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClassifier)
	 * @see org.nasdanika.models.flow.FlowPackage#getEcoreDataType_Type()
	 * @model
	 * @generated
	 */
	EClassifier getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.flow.EcoreDataType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClassifier value);

} // EcoreDataType
