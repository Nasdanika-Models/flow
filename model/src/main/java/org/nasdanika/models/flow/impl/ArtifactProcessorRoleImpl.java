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
import org.nasdanika.models.flow.ArtifactProcessorRole;
import org.nasdanika.models.flow.ArtifactProducer;
import org.nasdanika.models.flow.FlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Processor Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactProcessorRoleImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactProcessorRoleImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactProcessorRoleImpl extends RoleImpl implements ArtifactProcessorRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactProcessorRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.ARTIFACT_PROCESSOR_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getOutputs() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.ARTIFACT_PROCESSOR_ROLE__OUTPUTS, FlowPackage.Literals.ARTIFACT_PRODUCER__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getInputs() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.ARTIFACT_PROCESSOR_ROLE__INPUTS, FlowPackage.Literals.ARTIFACT_CONSUMER__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__INPUTS:
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
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__OUTPUTS:
				return getOutputs();
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__INPUTS:
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
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ArtifactInfo>)newValue);
				return;
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__INPUTS:
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
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__OUTPUTS:
				getOutputs().clear();
				return;
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__INPUTS:
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
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__OUTPUTS:
				return !getOutputs().isEmpty();
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE__INPUTS:
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
		if (baseClass == ArtifactProducer.class) {
			switch (derivedFeatureID) {
				case FlowPackage.ARTIFACT_PROCESSOR_ROLE__OUTPUTS: return FlowPackage.ARTIFACT_PRODUCER__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == ArtifactConsumer.class) {
			switch (derivedFeatureID) {
				case FlowPackage.ARTIFACT_PROCESSOR_ROLE__INPUTS: return FlowPackage.ARTIFACT_CONSUMER__INPUTS;
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
				case FlowPackage.ARTIFACT_PRODUCER__OUTPUTS: return FlowPackage.ARTIFACT_PROCESSOR_ROLE__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == ArtifactConsumer.class) {
			switch (baseFeatureID) {
				case FlowPackage.ARTIFACT_CONSUMER__INPUTS: return FlowPackage.ARTIFACT_PROCESSOR_ROLE__INPUTS;
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

} //ArtifactProcessorRoleImpl
