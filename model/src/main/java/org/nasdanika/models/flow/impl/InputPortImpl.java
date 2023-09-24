/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.flow.ArtifactInfo;
import org.nasdanika.models.flow.Connection;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.InputPort;
import org.nasdanika.models.flow.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.InputPortImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.InputPortImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPortImpl extends ModelElementImpl implements InputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection> getOutgoingConnections() {
		return (EList<Connection>)eDynamicGet(FlowPackage.INPUT_PORT__OUTGOING_CONNECTIONS, FlowPackage.Literals.SOURCE__OUTGOING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getOutputs() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.INPUT_PORT__OUTPUTS, FlowPackage.Literals.SOURCE__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.INPUT_PORT__OUTGOING_CONNECTIONS:
				return ((InternalEList<?>)getOutgoingConnections()).basicRemove(otherEnd, msgs);
			case FlowPackage.INPUT_PORT__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.INPUT_PORT__OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
			case FlowPackage.INPUT_PORT__OUTPUTS:
				return getOutputs();
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
			case FlowPackage.INPUT_PORT__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				getOutgoingConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case FlowPackage.INPUT_PORT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ArtifactInfo>)newValue);
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
			case FlowPackage.INPUT_PORT__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				return;
			case FlowPackage.INPUT_PORT__OUTPUTS:
				getOutputs().clear();
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
			case FlowPackage.INPUT_PORT__OUTGOING_CONNECTIONS:
				return !getOutgoingConnections().isEmpty();
			case FlowPackage.INPUT_PORT__OUTPUTS:
				return !getOutputs().isEmpty();
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
		if (baseClass == Source.class) {
			switch (derivedFeatureID) {
				case FlowPackage.INPUT_PORT__OUTGOING_CONNECTIONS: return FlowPackage.SOURCE__OUTGOING_CONNECTIONS;
				case FlowPackage.INPUT_PORT__OUTPUTS: return FlowPackage.SOURCE__OUTPUTS;
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
		if (baseClass == Source.class) {
			switch (baseFeatureID) {
				case FlowPackage.SOURCE__OUTGOING_CONNECTIONS: return FlowPackage.INPUT_PORT__OUTGOING_CONNECTIONS;
				case FlowPackage.SOURCE__OUTPUTS: return FlowPackage.INPUT_PORT__OUTPUTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InputPortImpl
