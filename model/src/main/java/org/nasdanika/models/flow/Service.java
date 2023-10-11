/**
 */
package org.nasdanika.models.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A flow element which references a (shared) process
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Service#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Node {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Process#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A process which this service represents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(org.nasdanika.models.flow.Process)
	 * @see org.nasdanika.models.flow.FlowPackage#getService_Process()
	 * @see org.nasdanika.models.flow.Process#getServices
	 * @model opposite="services"
	 * @generated
	 */
	org.nasdanika.models.flow.Process getProcess();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.flow.Service#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(org.nasdanika.models.flow.Process value);

} // Service
