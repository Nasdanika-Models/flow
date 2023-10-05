/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.flow.ArtifactConsumer;
import org.nasdanika.models.flow.ArtifactInfo;
import org.nasdanika.models.flow.ArtifactProcessor;
import org.nasdanika.models.flow.ArtifactProducer;
import org.nasdanika.models.flow.Connection;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.InputPort;
import org.nasdanika.models.flow.Node;
import org.nasdanika.models.flow.OutputPort;
import org.nasdanika.models.flow.Source;
import org.nasdanika.models.flow.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.NodeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.NodeImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.NodeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.NodeImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.NodeImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.NodeImpl#getOutputPorts <em>Output Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends ProcessElementImpl implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection> getOutgoingConnections() {
		return (EList<Connection>)eDynamicGet(FlowPackage.NODE__OUTGOING_CONNECTIONS, FlowPackage.Literals.SOURCE__OUTGOING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getOutputs() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.NODE__OUTPUTS, FlowPackage.Literals.ARTIFACT_PRODUCER__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection> getIncomingConnections() {
		return (EList<Connection>)eDynamicGet(FlowPackage.NODE__INCOMING_CONNECTIONS, FlowPackage.Literals.TARGET__INCOMING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getInputs() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.NODE__INPUTS, FlowPackage.Literals.ARTIFACT_CONSUMER__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<InputPort> getInputPorts() {
		return (EList<InputPort>)eDynamicGet(FlowPackage.NODE__INPUT_PORTS, FlowPackage.Literals.NODE__INPUT_PORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OutputPort> getOutputPorts() {
		return (EList<OutputPort>)eDynamicGet(FlowPackage.NODE__OUTPUT_PORTS, FlowPackage.Literals.NODE__OUTPUT_PORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.NODE__INCOMING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.NODE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case FlowPackage.NODE__OUTGOING_CONNECTIONS:
				return ((InternalEList<?>)getOutgoingConnections()).basicRemove(otherEnd, msgs);
			case FlowPackage.NODE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case FlowPackage.NODE__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
			case FlowPackage.NODE__INPUT_PORTS:
				return ((InternalEList<?>)getInputPorts()).basicRemove(otherEnd, msgs);
			case FlowPackage.NODE__OUTPUT_PORTS:
				return ((InternalEList<?>)getOutputPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.NODE__OUTPUTS:
				return getOutputs();
			case FlowPackage.NODE__OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
			case FlowPackage.NODE__INPUTS:
				return getInputs();
			case FlowPackage.NODE__INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case FlowPackage.NODE__INPUT_PORTS:
				return getInputPorts();
			case FlowPackage.NODE__OUTPUT_PORTS:
				return getOutputPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.NODE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ArtifactInfo>)newValue);
				return;
			case FlowPackage.NODE__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				getOutgoingConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case FlowPackage.NODE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends ArtifactInfo>)newValue);
				return;
			case FlowPackage.NODE__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case FlowPackage.NODE__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends InputPort>)newValue);
				return;
			case FlowPackage.NODE__OUTPUT_PORTS:
				getOutputPorts().clear();
				getOutputPorts().addAll((Collection<? extends OutputPort>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FlowPackage.NODE__OUTPUTS:
				getOutputs().clear();
				return;
			case FlowPackage.NODE__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				return;
			case FlowPackage.NODE__INPUTS:
				getInputs().clear();
				return;
			case FlowPackage.NODE__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
			case FlowPackage.NODE__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case FlowPackage.NODE__OUTPUT_PORTS:
				getOutputPorts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FlowPackage.NODE__OUTPUTS:
				return !getOutputs().isEmpty();
			case FlowPackage.NODE__OUTGOING_CONNECTIONS:
				return !getOutgoingConnections().isEmpty();
			case FlowPackage.NODE__INPUTS:
				return !getInputs().isEmpty();
			case FlowPackage.NODE__INCOMING_CONNECTIONS:
				return !getIncomingConnections().isEmpty();
			case FlowPackage.NODE__INPUT_PORTS:
				return !getInputPorts().isEmpty();
			case FlowPackage.NODE__OUTPUT_PORTS:
				return !getOutputPorts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ArtifactProducer.class) {
			switch (derivedFeatureID) {
				case FlowPackage.NODE__OUTPUTS: return FlowPackage.ARTIFACT_PRODUCER__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == Source.class) {
			switch (derivedFeatureID) {
				case FlowPackage.NODE__OUTGOING_CONNECTIONS: return FlowPackage.SOURCE__OUTGOING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == ArtifactConsumer.class) {
			switch (derivedFeatureID) {
				case FlowPackage.NODE__INPUTS: return FlowPackage.ARTIFACT_CONSUMER__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == Target.class) {
			switch (derivedFeatureID) {
				case FlowPackage.NODE__INCOMING_CONNECTIONS: return FlowPackage.TARGET__INCOMING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == ArtifactProcessor.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ArtifactProducer.class) {
			switch (baseFeatureID) {
				case FlowPackage.ARTIFACT_PRODUCER__OUTPUTS: return FlowPackage.NODE__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == Source.class) {
			switch (baseFeatureID) {
				case FlowPackage.SOURCE__OUTGOING_CONNECTIONS: return FlowPackage.NODE__OUTGOING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == ArtifactConsumer.class) {
			switch (baseFeatureID) {
				case FlowPackage.ARTIFACT_CONSUMER__INPUTS: return FlowPackage.NODE__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == Target.class) {
			switch (baseFeatureID) {
				case FlowPackage.TARGET__INCOMING_CONNECTIONS: return FlowPackage.NODE__INCOMING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == ArtifactProcessor.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NodeImpl
