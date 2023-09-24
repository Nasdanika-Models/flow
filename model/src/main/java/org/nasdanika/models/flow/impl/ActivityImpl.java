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
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.ActivityImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ActivityImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ActivityImpl#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends NodeImpl implements Activity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(FlowPackage.ACTIVITY__ROLES, FlowPackage.Literals.ACTIVITY__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(FlowPackage.ACTIVITY__RESOURCES, FlowPackage.Literals.ACTIVITY__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Participant> getParticipants() {
		return (EList<Participant>)eDynamicGet(FlowPackage.ACTIVITY__PARTICIPANTS, FlowPackage.Literals.ACTIVITY__PARTICIPANTS, true, true);
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
			case FlowPackage.ACTIVITY__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case FlowPackage.ACTIVITY__PARTICIPANTS:
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
			case FlowPackage.ACTIVITY__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case FlowPackage.ACTIVITY__PARTICIPANTS:
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
			case FlowPackage.ACTIVITY__ROLES:
				return getRoles();
			case FlowPackage.ACTIVITY__RESOURCES:
				return getResources();
			case FlowPackage.ACTIVITY__PARTICIPANTS:
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
			case FlowPackage.ACTIVITY__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case FlowPackage.ACTIVITY__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case FlowPackage.ACTIVITY__PARTICIPANTS:
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
			case FlowPackage.ACTIVITY__ROLES:
				getRoles().clear();
				return;
			case FlowPackage.ACTIVITY__RESOURCES:
				getResources().clear();
				return;
			case FlowPackage.ACTIVITY__PARTICIPANTS:
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
			case FlowPackage.ACTIVITY__ROLES:
				return !getRoles().isEmpty();
			case FlowPackage.ACTIVITY__RESOURCES:
				return !getResources().isEmpty();
			case FlowPackage.ACTIVITY__PARTICIPANTS:
				return !getParticipants().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
