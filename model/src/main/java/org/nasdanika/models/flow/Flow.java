/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Flow is a composite activity
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Flow#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends Activity {

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flow elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getFlow_Elements()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<FlowElement> getElements();
} // Flow
