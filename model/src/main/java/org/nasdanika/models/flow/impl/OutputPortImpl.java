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
import org.nasdanika.models.flow.OutputPort;
import org.nasdanika.models.flow.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.OutputPortImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.OutputPortImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputPortImpl extends ModelElementImpl implements OutputPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.OUTPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection> getIncomingConnections() {
		return (EList<Connection>)eDynamicGet(FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS, FlowPackage.Literals.TARGET__INCOMING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getInputs() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.OUTPUT_PORT__INPUTS, FlowPackage.Literals.TARGET__INPUTS, true, true);
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
			case FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS:
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
			case FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
			case FlowPackage.OUTPUT_PORT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case FlowPackage.OUTPUT_PORT__INPUTS:
				return getInputs();
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
			case FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case FlowPackage.OUTPUT_PORT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends ArtifactInfo>)newValue);
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
			case FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
			case FlowPackage.OUTPUT_PORT__INPUTS:
				getInputs().clear();
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
			case FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS:
				return !getIncomingConnections().isEmpty();
			case FlowPackage.OUTPUT_PORT__INPUTS:
				return !getInputs().isEmpty();
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
		if (baseClass == Target.class) {
			switch (derivedFeatureID) {
				case FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS: return FlowPackage.TARGET__INCOMING_CONNECTIONS;
				case FlowPackage.OUTPUT_PORT__INPUTS: return FlowPackage.TARGET__INPUTS;
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
		if (baseClass == Target.class) {
			switch (baseFeatureID) {
				case FlowPackage.TARGET__INCOMING_CONNECTIONS: return FlowPackage.OUTPUT_PORT__INCOMING_CONNECTIONS;
				case FlowPackage.TARGET__INPUTS: return FlowPackage.OUTPUT_PORT__INPUTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OutputPortImpl
