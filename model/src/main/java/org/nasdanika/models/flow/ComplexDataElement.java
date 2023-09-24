/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data element consisting of other data elements, a structure/class
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.ComplexDataElement#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getComplexDataElement()
 * @model
 * @generated
 */
public interface ComplexDataElement extends DataElement, DataType {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.DataElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements of the complex data elment. Also known as properties/fields/attributes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getComplexDataElement_Features()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<DataElement> getFeatures();

} // ComplexDataElement
