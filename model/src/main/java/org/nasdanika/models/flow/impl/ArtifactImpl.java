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
import org.nasdanika.models.flow.ArtifactInfo;
import org.nasdanika.models.flow.DataElement;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactImpl#getDataElements <em>Data Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactImpl#getInfos <em>Infos</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends ModelElementImpl implements Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(FlowPackage.ARTIFACT__RESOURCES, FlowPackage.Literals.ARTIFACT__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataElement> getDataElements() {
		return (EList<DataElement>)eDynamicGet(FlowPackage.ARTIFACT__DATA_ELEMENTS, FlowPackage.Literals.ARTIFACT__DATA_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getInfos() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.ARTIFACT__INFOS, FlowPackage.Literals.ARTIFACT__INFOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Participant> getParticipants() {
		return (EList<Participant>)eDynamicGet(FlowPackage.ARTIFACT__PARTICIPANTS, FlowPackage.Literals.ARTIFACT__PARTICIPANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(FlowPackage.ARTIFACT__ROLES, FlowPackage.Literals.ARTIFACT__ROLES, true, true);
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
			case FlowPackage.ARTIFACT__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case FlowPackage.ARTIFACT__DATA_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataElements()).basicAdd(otherEnd, msgs);
			case FlowPackage.ARTIFACT__INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfos()).basicAdd(otherEnd, msgs);
			case FlowPackage.ARTIFACT__PARTICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipants()).basicAdd(otherEnd, msgs);
			case FlowPackage.ARTIFACT__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.ARTIFACT__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case FlowPackage.ARTIFACT__DATA_ELEMENTS:
				return ((InternalEList<?>)getDataElements()).basicRemove(otherEnd, msgs);
			case FlowPackage.ARTIFACT__INFOS:
				return ((InternalEList<?>)getInfos()).basicRemove(otherEnd, msgs);
			case FlowPackage.ARTIFACT__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case FlowPackage.ARTIFACT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.ARTIFACT__RESOURCES:
				return getResources();
			case FlowPackage.ARTIFACT__DATA_ELEMENTS:
				return getDataElements();
			case FlowPackage.ARTIFACT__INFOS:
				return getInfos();
			case FlowPackage.ARTIFACT__PARTICIPANTS:
				return getParticipants();
			case FlowPackage.ARTIFACT__ROLES:
				return getRoles();
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
			case FlowPackage.ARTIFACT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case FlowPackage.ARTIFACT__DATA_ELEMENTS:
				getDataElements().clear();
				getDataElements().addAll((Collection<? extends DataElement>)newValue);
				return;
			case FlowPackage.ARTIFACT__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends ArtifactInfo>)newValue);
				return;
			case FlowPackage.ARTIFACT__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case FlowPackage.ARTIFACT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case FlowPackage.ARTIFACT__RESOURCES:
				getResources().clear();
				return;
			case FlowPackage.ARTIFACT__DATA_ELEMENTS:
				getDataElements().clear();
				return;
			case FlowPackage.ARTIFACT__INFOS:
				getInfos().clear();
				return;
			case FlowPackage.ARTIFACT__PARTICIPANTS:
				getParticipants().clear();
				return;
			case FlowPackage.ARTIFACT__ROLES:
				getRoles().clear();
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
			case FlowPackage.ARTIFACT__RESOURCES:
				return !getResources().isEmpty();
			case FlowPackage.ARTIFACT__DATA_ELEMENTS:
				return !getDataElements().isEmpty();
			case FlowPackage.ARTIFACT__INFOS:
				return !getInfos().isEmpty();
			case FlowPackage.ARTIFACT__PARTICIPANTS:
				return !getParticipants().isEmpty();
			case FlowPackage.ARTIFACT__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
