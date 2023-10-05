/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.flow.Artifact;
import org.nasdanika.models.flow.DataElement;
import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.FlowPackage;

import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getDataElements <em>Data Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.PackageImpl#getDataTypes <em>Data Types</em>}</li>
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
		return (EList<org.nasdanika.models.flow.Process>)eDynamicGet(FlowPackage.PACKAGE__PROCESSES, FlowPackage.Literals.PACKAGE__PROCESSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Participant> getParticipants() {
		return (EList<Participant>)eDynamicGet(FlowPackage.PACKAGE__PARTICIPANTS, FlowPackage.Literals.PACKAGE__PARTICIPANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(FlowPackage.PACKAGE__RESOURCES, FlowPackage.Literals.PACKAGE__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(FlowPackage.PACKAGE__ARTIFACTS, FlowPackage.Literals.PACKAGE__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataElement> getDataElements() {
		return (EList<DataElement>)eDynamicGet(FlowPackage.PACKAGE__DATA_ELEMENTS, FlowPackage.Literals.PACKAGE__DATA_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataType> getDataTypes() {
		return (EList<DataType>)eDynamicGet(FlowPackage.PACKAGE__DATA_TYPES, FlowPackage.Literals.PACKAGE__DATA_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				return ((InternalEList<?>)getDataElements()).basicRemove(otherEnd, msgs);
			case FlowPackage.PACKAGE__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				return getSubPackages();
			case FlowPackage.PACKAGE__PROCESSES:
				return getProcesses();
			case FlowPackage.PACKAGE__PARTICIPANTS:
				return getParticipants();
			case FlowPackage.PACKAGE__RESOURCES:
				return getResources();
			case FlowPackage.PACKAGE__ARTIFACTS:
				return getArtifacts();
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				return getDataElements();
			case FlowPackage.PACKAGE__DATA_TYPES:
				return getDataTypes();
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
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends org.nasdanika.models.flow.Package>)newValue);
				return;
			case FlowPackage.PACKAGE__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends org.nasdanika.models.flow.Process>)newValue);
				return;
			case FlowPackage.PACKAGE__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case FlowPackage.PACKAGE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case FlowPackage.PACKAGE__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				getDataElements().clear();
				getDataElements().addAll((Collection<? extends DataElement>)newValue);
				return;
			case FlowPackage.PACKAGE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
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
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				return;
			case FlowPackage.PACKAGE__PROCESSES:
				getProcesses().clear();
				return;
			case FlowPackage.PACKAGE__PARTICIPANTS:
				getParticipants().clear();
				return;
			case FlowPackage.PACKAGE__RESOURCES:
				getResources().clear();
				return;
			case FlowPackage.PACKAGE__ARTIFACTS:
				getArtifacts().clear();
				return;
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				getDataElements().clear();
				return;
			case FlowPackage.PACKAGE__DATA_TYPES:
				getDataTypes().clear();
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
			case FlowPackage.PACKAGE__SUB_PACKAGES:
				return !getSubPackages().isEmpty();
			case FlowPackage.PACKAGE__PROCESSES:
				return !getProcesses().isEmpty();
			case FlowPackage.PACKAGE__PARTICIPANTS:
				return !getParticipants().isEmpty();
			case FlowPackage.PACKAGE__RESOURCES:
				return !getResources().isEmpty();
			case FlowPackage.PACKAGE__ARTIFACTS:
				return !getArtifacts().isEmpty();
			case FlowPackage.PACKAGE__DATA_ELEMENTS:
				return !getDataElements().isEmpty();
			case FlowPackage.PACKAGE__DATA_TYPES:
				return !getDataTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
