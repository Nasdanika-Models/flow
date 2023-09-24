/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.flow.Activity;
import org.nasdanika.models.flow.Artifact;
import org.nasdanika.models.flow.ArtifactInfo;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.ResourceImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ResourceImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ResourceImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ResourceImpl#getInfos <em>Infos</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ResourceImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends ModelElementImpl implements Resource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(FlowPackage.RESOURCE__ARTIFACTS, FlowPackage.Literals.RESOURCE__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(FlowPackage.RESOURCE__ROLES, FlowPackage.Literals.RESOURCE__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Participant> getParticipants() {
		return (EList<Participant>)eDynamicGet(FlowPackage.RESOURCE__PARTICIPANTS, FlowPackage.Literals.RESOURCE__PARTICIPANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ArtifactInfo> getInfos() {
		return (EList<ArtifactInfo>)eDynamicGet(FlowPackage.RESOURCE__INFOS, FlowPackage.Literals.RESOURCE__INFOS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(FlowPackage.RESOURCE__ACTIVITIES, FlowPackage.Literals.RESOURCE__ACTIVITIES, true, true);
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
			case FlowPackage.RESOURCE__ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtifacts()).basicAdd(otherEnd, msgs);
			case FlowPackage.RESOURCE__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case FlowPackage.RESOURCE__PARTICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipants()).basicAdd(otherEnd, msgs);
			case FlowPackage.RESOURCE__INFOS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfos()).basicAdd(otherEnd, msgs);
			case FlowPackage.RESOURCE__ACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivities()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.RESOURCE__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case FlowPackage.RESOURCE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case FlowPackage.RESOURCE__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case FlowPackage.RESOURCE__INFOS:
				return ((InternalEList<?>)getInfos()).basicRemove(otherEnd, msgs);
			case FlowPackage.RESOURCE__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.RESOURCE__ARTIFACTS:
				return getArtifacts();
			case FlowPackage.RESOURCE__ROLES:
				return getRoles();
			case FlowPackage.RESOURCE__PARTICIPANTS:
				return getParticipants();
			case FlowPackage.RESOURCE__INFOS:
				return getInfos();
			case FlowPackage.RESOURCE__ACTIVITIES:
				return getActivities();
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
			case FlowPackage.RESOURCE__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case FlowPackage.RESOURCE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case FlowPackage.RESOURCE__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case FlowPackage.RESOURCE__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends ArtifactInfo>)newValue);
				return;
			case FlowPackage.RESOURCE__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
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
			case FlowPackage.RESOURCE__ARTIFACTS:
				getArtifacts().clear();
				return;
			case FlowPackage.RESOURCE__ROLES:
				getRoles().clear();
				return;
			case FlowPackage.RESOURCE__PARTICIPANTS:
				getParticipants().clear();
				return;
			case FlowPackage.RESOURCE__INFOS:
				getInfos().clear();
				return;
			case FlowPackage.RESOURCE__ACTIVITIES:
				getActivities().clear();
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
			case FlowPackage.RESOURCE__ARTIFACTS:
				return !getArtifacts().isEmpty();
			case FlowPackage.RESOURCE__ROLES:
				return !getRoles().isEmpty();
			case FlowPackage.RESOURCE__PARTICIPANTS:
				return !getParticipants().isEmpty();
			case FlowPackage.RESOURCE__INFOS:
				return !getInfos().isEmpty();
			case FlowPackage.RESOURCE__ACTIVITIES:
				return !getActivities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
