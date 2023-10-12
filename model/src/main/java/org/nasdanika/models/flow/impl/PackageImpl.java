/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.capability.CapabilityDomain;
import org.nasdanika.models.capability.CapabilityDomainElement;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.flow.Artifact;
import org.nasdanika.models.flow.ArtifactDomain;
import org.nasdanika.models.flow.ArtifactDomainElement;
import org.nasdanika.models.flow.DataDomain;
import org.nasdanika.models.flow.DataDomainElement;
import org.nasdanika.models.flow.DataElement;
import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.DataTypeDomain;
import org.nasdanika.models.flow.DataTypeDomainElement;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.ParticipantDomain;
import org.nasdanika.models.flow.ParticipantDomainElement;
import org.nasdanika.models.flow.ProcessDomain;
import org.nasdanika.models.flow.ProcessDomainElement;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.ResourceDomain;
import org.nasdanika.models.flow.ResourceDomainElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getDataElements <em>Data Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends ModelElementImpl implements org.nasdanika.models.flow.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.flow.Package> getSubPackages() {
		return (EList<org.nasdanika.models.flow.Package>)eDynamicGet(FlowPackage.PACKAGE__SUB_PACKAGES, FlowPackage.Literals.PACKAGE__SUB_PACKAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.flow.Process> getProcesses() {
		return (EList<org.nasdanika.models.flow.Process>)eDynamicGet(FlowPackage.PACKAGE__PROCESSES, FlowPackage.Literals.PROCESS_DOMAIN__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ParticipantDomainElement> getParticipants() {
		return (EList<ParticipantDomainElement>)eDynamicGet(FlowPackage.PACKAGE__PARTICIPANTS, FlowPackage.Literals.PARTICIPANT_DOMAIN__PARTICIPANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(FlowPackage.PACKAGE__RESOURCES, FlowPackage.Literals.RESOURCE_DOMAIN__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(FlowPackage.PACKAGE__ARTIFACTS, FlowPackage.Literals.ARTIFACT_DOMAIN__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataElement> getDataElements() {
		return (EList<DataElement>)eDynamicGet(FlowPackage.PACKAGE__DATA_ELEMENTS, FlowPackage.Literals.DATA_DOMAIN__DATA_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CapabilityDomainElement> getCapabilities() {
		return (EList<CapabilityDomainElement>)eDynamicGet(FlowPackage.PACKAGE__CAPABILITIES, CapabilityPackage.Literals.CAPABILITY_DOMAIN__CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataType> getDataTypes() {
		return (EList<DataType>)eDynamicGet(FlowPackage.PACKAGE__DATA_TYPES, FlowPackage.Literals.DATA_TYPE_DOMAIN__DATA_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.PACKAGE__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				return ((InternalEList<?>)getDataElements()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.PACKAGE__PARTICIPANTS:
				return getParticipants();
			case FlowPackage.PACKAGE__ARTIFACTS:
				return getArtifacts();
			case FlowPackage.PACKAGE__RESOURCES:
				return getResources();
			case FlowPackage.PACKAGE__PROCESSES:
				return getProcesses();
			case FlowPackage.PACKAGE__DATA_TYPES:
				return getDataTypes();
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				return getDataElements();
			case FlowPackage.PACKAGE__CAPABILITIES:
				return getCapabilities();
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				return getSubPackages();
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
			case FlowPackage.PACKAGE__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends ParticipantDomainElement>)newValue);
				return;
			case FlowPackage.PACKAGE__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case FlowPackage.PACKAGE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case FlowPackage.PACKAGE__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends org.nasdanika.models.flow.Process>)newValue);
				return;
			case FlowPackage.PACKAGE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				getDataElements().clear();
				getDataElements().addAll((Collection<? extends DataElement>)newValue);
				return;
			case FlowPackage.PACKAGE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends CapabilityDomainElement>)newValue);
				return;
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends org.nasdanika.models.flow.Package>)newValue);
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
			case FlowPackage.PACKAGE__PARTICIPANTS:
				getParticipants().clear();
				return;
			case FlowPackage.PACKAGE__ARTIFACTS:
				getArtifacts().clear();
				return;
			case FlowPackage.PACKAGE__RESOURCES:
				getResources().clear();
				return;
			case FlowPackage.PACKAGE__PROCESSES:
				getProcesses().clear();
				return;
			case FlowPackage.PACKAGE__DATA_TYPES:
				getDataTypes().clear();
				return;
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				getDataElements().clear();
				return;
			case FlowPackage.PACKAGE__CAPABILITIES:
				getCapabilities().clear();
				return;
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
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
			case FlowPackage.PACKAGE__PARTICIPANTS:
				return !getParticipants().isEmpty();
			case FlowPackage.PACKAGE__ARTIFACTS:
				return !getArtifacts().isEmpty();
			case FlowPackage.PACKAGE__RESOURCES:
				return !getResources().isEmpty();
			case FlowPackage.PACKAGE__PROCESSES:
				return !getProcesses().isEmpty();
			case FlowPackage.PACKAGE__DATA_TYPES:
				return !getDataTypes().isEmpty();
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				return !getDataElements().isEmpty();
			case FlowPackage.PACKAGE__CAPABILITIES:
				return !getCapabilities().isEmpty();
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				return !getSubPackages().isEmpty();
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
		if (baseClass == ParticipantDomainElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ParticipantDomain.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PACKAGE__PARTICIPANTS: return FlowPackage.PARTICIPANT_DOMAIN__PARTICIPANTS;
				default: return -1;
			}
		}
		if (baseClass == ArtifactDomainElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArtifactDomain.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PACKAGE__ARTIFACTS: return FlowPackage.ARTIFACT_DOMAIN__ARTIFACTS;
				default: return -1;
			}
		}
		if (baseClass == ResourceDomainElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ResourceDomain.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PACKAGE__RESOURCES: return FlowPackage.RESOURCE_DOMAIN__RESOURCES;
				default: return -1;
			}
		}
		if (baseClass == ProcessDomainElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessDomain.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PACKAGE__PROCESSES: return FlowPackage.PROCESS_DOMAIN__PROCESSES;
				default: return -1;
			}
		}
		if (baseClass == DataTypeDomainElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataTypeDomain.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PACKAGE__DATA_TYPES: return FlowPackage.DATA_TYPE_DOMAIN__DATA_TYPES;
				default: return -1;
			}
		}
		if (baseClass == DataDomainElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataDomain.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PACKAGE__DATA_ELEMENTS: return FlowPackage.DATA_DOMAIN__DATA_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomainElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomain.class) {
			switch (derivedFeatureID) {
				case FlowPackage.PACKAGE__CAPABILITIES: return CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES;
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
		if (baseClass == ParticipantDomainElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ParticipantDomain.class) {
			switch (baseFeatureID) {
				case FlowPackage.PARTICIPANT_DOMAIN__PARTICIPANTS: return FlowPackage.PACKAGE__PARTICIPANTS;
				default: return -1;
			}
		}
		if (baseClass == ArtifactDomainElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ArtifactDomain.class) {
			switch (baseFeatureID) {
				case FlowPackage.ARTIFACT_DOMAIN__ARTIFACTS: return FlowPackage.PACKAGE__ARTIFACTS;
				default: return -1;
			}
		}
		if (baseClass == ResourceDomainElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ResourceDomain.class) {
			switch (baseFeatureID) {
				case FlowPackage.RESOURCE_DOMAIN__RESOURCES: return FlowPackage.PACKAGE__RESOURCES;
				default: return -1;
			}
		}
		if (baseClass == ProcessDomainElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessDomain.class) {
			switch (baseFeatureID) {
				case FlowPackage.PROCESS_DOMAIN__PROCESSES: return FlowPackage.PACKAGE__PROCESSES;
				default: return -1;
			}
		}
		if (baseClass == DataTypeDomainElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataTypeDomain.class) {
			switch (baseFeatureID) {
				case FlowPackage.DATA_TYPE_DOMAIN__DATA_TYPES: return FlowPackage.PACKAGE__DATA_TYPES;
				default: return -1;
			}
		}
		if (baseClass == DataDomainElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataDomain.class) {
			switch (baseFeatureID) {
				case FlowPackage.DATA_DOMAIN__DATA_ELEMENTS: return FlowPackage.PACKAGE__DATA_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomainElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CapabilityDomain.class) {
			switch (baseFeatureID) {
				case CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES: return FlowPackage.PACKAGE__CAPABILITIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PackageImpl
