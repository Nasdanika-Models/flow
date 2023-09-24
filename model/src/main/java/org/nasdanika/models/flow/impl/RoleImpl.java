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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.RoleImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.RoleImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.RoleImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.RoleImpl#getInfos <em>Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends ModelElementImpl implements Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Participant> getPlayers() {
		return (EList<Participant>)eDynamicGet(FlowPackage.ROLE__PLAYERS, FlowPackage.Literals.ROLE__PLAYERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(FlowPackage.ROLE__ARTIFACTS, FlowPackage.Literals.ROLE__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(FlowPackage.ROLE__RESOURCES, FlowPackage.Literals.ROLE__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getInfos() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.ROLE__INFOS, FlowPackage.Literals.ROLE__INFOS, true, true);
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
			case FlowPackage.ROLE__PLAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayers()).basicAdd(otherEnd, msgs);
			case FlowPackage.ROLE__ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtifacts()).basicAdd(otherEnd, msgs);
			case FlowPackage.ROLE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case FlowPackage.ROLE__INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfos()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.ROLE__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case FlowPackage.ROLE__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case FlowPackage.ROLE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case FlowPackage.ROLE__INFOS:
				return ((InternalEList<?>)getInfos()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.ROLE__PLAYERS:
				return getPlayers();
			case FlowPackage.ROLE__ARTIFACTS:
				return getArtifacts();
			case FlowPackage.ROLE__RESOURCES:
				return getResources();
			case FlowPackage.ROLE__INFOS:
				return getInfos();
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
			case FlowPackage.ROLE__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Participant>)newValue);
				return;
			case FlowPackage.ROLE__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case FlowPackage.ROLE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case FlowPackage.ROLE__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends ArtifactInfo>)newValue);
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
			case FlowPackage.ROLE__PLAYERS:
				getPlayers().clear();
				return;
			case FlowPackage.ROLE__ARTIFACTS:
				getArtifacts().clear();
				return;
			case FlowPackage.ROLE__RESOURCES:
				getResources().clear();
				return;
			case FlowPackage.ROLE__INFOS:
				getInfos().clear();
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
			case FlowPackage.ROLE__PLAYERS:
				return !getPlayers().isEmpty();
			case FlowPackage.ROLE__ARTIFACTS:
				return !getArtifacts().isEmpty();
			case FlowPackage.ROLE__RESOURCES:
				return !getResources().isEmpty();
			case FlowPackage.ROLE__INFOS:
				return !getInfos().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
