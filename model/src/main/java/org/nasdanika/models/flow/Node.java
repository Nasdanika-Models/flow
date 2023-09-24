/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A flow element which supports both outgoing and incoming connections
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Node#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Node#getOutputPorts <em>Output Ports</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends FlowElement, Source, Target {
	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.InputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input ports may be used to group incoming connections
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getNode_InputPorts()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<InputPort> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Output Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Output ports can be used to group outgoing connections
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Ports</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getNode_OutputPorts()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<OutputPort> getOutputPorts();

} // Node
