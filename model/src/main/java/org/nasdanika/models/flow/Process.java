/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
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
 *   <li>{@link org.nasdanika.models.flow.Process#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Process#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Activity {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ProcessElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flow elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getProcess_Elements()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<ProcessElement> getElements();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Service}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Service#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Services referencing this process
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getProcess_Services()
	 * @see org.nasdanika.models.flow.Service#getProcess
	 * @model opposite="process"
	 * @generated
	 */
	EList<Service> getServices();

} // Process
