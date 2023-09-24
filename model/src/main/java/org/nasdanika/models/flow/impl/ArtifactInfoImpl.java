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
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactInfoImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactInfoImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactInfoImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactInfoImpl#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactInfoImpl extends ModelElementImpl implements ArtifactInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.ARTIFACT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getArtifact() {
		return (Artifact)eDynamicGet(FlowPackage.ARTIFACT_INFO__ARTIFACT, FlowPackage.Literals.ARTIFACT_INFO__ARTIFACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetArtifact() {
		return (Artifact)eDynamicGet(FlowPackage.ARTIFACT_INFO__ARTIFACT, FlowPackage.Literals.ARTIFACT_INFO__ARTIFACT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(Artifact newArtifact, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newArtifact, FlowPackage.ARTIFACT_INFO__ARTIFACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifact(Artifact newArtifact) {
		eDynamicSet(FlowPackage.ARTIFACT_INFO__ARTIFACT, FlowPackage.Literals.ARTIFACT_INFO__ARTIFACT, newArtifact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(FlowPackage.ARTIFACT_INFO__ROLES, FlowPackage.Literals.ARTIFACT_INFO__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(FlowPackage.ARTIFACT_INFO__RESOURCES, FlowPackage.Literals.ARTIFACT_INFO__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Participant> getParticipants() {
		return (EList<Participant>)eDynamicGet(FlowPackage.ARTIFACT_INFO__PARTICIPANTS, FlowPackage.Literals.ARTIFACT_INFO__PARTICIPANTS, true, true);
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
			case FlowPackage.ARTIFACT_INFO__ARTIFACT:
				Artifact artifact = basicGetArtifact();
				if (artifact != null)
					msgs = ((InternalEObject)artifact).eInverseRemove(this, FlowPackage.ARTIFACT__INFOS, Artifact.class, msgs);
				return basicSetArtifact((Artifact)otherEnd, msgs);
			case FlowPackage.ARTIFACT_INFO__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case FlowPackage.ARTIFACT_INFO__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case FlowPackage.ARTIFACT_INFO__PARTICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipants()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.ARTIFACT_INFO__ARTIFACT:
				return basicSetArtifact(null, msgs);
			case FlowPackage.ARTIFACT_INFO__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case FlowPackage.ARTIFACT_INFO__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case FlowPackage.ARTIFACT_INFO__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.ARTIFACT_INFO__ARTIFACT:
				if (resolve) return getArtifact();
				return basicGetArtifact();
			case FlowPackage.ARTIFACT_INFO__ROLES:
				return getRoles();
			case FlowPackage.ARTIFACT_INFO__RESOURCES:
				return getResources();
			case FlowPackage.ARTIFACT_INFO__PARTICIPANTS:
				return getParticipants();
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
			case FlowPackage.ARTIFACT_INFO__ARTIFACT:
				setArtifact((Artifact)newValue);
				return;
			case FlowPackage.ARTIFACT_INFO__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case FlowPackage.ARTIFACT_INFO__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case FlowPackage.ARTIFACT_INFO__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
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
			case FlowPackage.ARTIFACT_INFO__ARTIFACT:
				setArtifact((Artifact)null);
				return;
			case FlowPackage.ARTIFACT_INFO__ROLES:
				getRoles().clear();
				return;
			case FlowPackage.ARTIFACT_INFO__RESOURCES:
				getResources().clear();
				return;
			case FlowPackage.ARTIFACT_INFO__PARTICIPANTS:
				getParticipants().clear();
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
			case FlowPackage.ARTIFACT_INFO__ARTIFACT:
				return basicGetArtifact() != null;
			case FlowPackage.ARTIFACT_INFO__ROLES:
				return !getRoles().isEmpty();
			case FlowPackage.ARTIFACT_INFO__RESOURCES:
				return !getResources().isEmpty();
			case FlowPackage.ARTIFACT_INFO__PARTICIPANTS:
				return !getParticipants().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactInfoImpl
