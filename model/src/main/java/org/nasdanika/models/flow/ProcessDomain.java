/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of processes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.ProcessDomain#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getProcessDomain()
 * @model
 * @generated
 */
public interface ProcessDomain extends ProcessDomainElement {
	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.ProcessDomainElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flows defined in this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getProcessDomain_Processes()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<ProcessDomainElement> getProcesses();

} // ProcessDomain
