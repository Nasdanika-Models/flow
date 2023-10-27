/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.Role;
import org.nasdanika.models.flow.Skill;
import org.nasdanika.models.flow.SkillConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.RoleImpl#getRequiredSkills <em>Required Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.RoleImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.RoleImpl#getResources <em>Resources</em>}</li>
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
	public EList<Skill> getRequiredSkills() {
		return (EList<Skill>)eDynamicGet(FlowPackage.ROLE__REQUIRED_SKILLS, FlowPackage.Literals.SKILL_CONSUMER__REQUIRED_SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Participant> getParticipants() {
		return (EList<Participant>)eDynamicGet(FlowPackage.ROLE__PARTICIPANTS, FlowPackage.Literals.ROLE__PARTICIPANTS, true, true);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.ROLE__REQUIRED_SKILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredSkills()).basicAdd(otherEnd, msgs);
			case FlowPackage.ROLE__PARTICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipants()).basicAdd(otherEnd, msgs);
			case FlowPackage.ROLE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.ROLE__REQUIRED_SKILLS:
				return ((InternalEList<?>)getRequiredSkills()).basicRemove(otherEnd, msgs);
			case FlowPackage.ROLE__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case FlowPackage.ROLE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.ROLE__REQUIRED_SKILLS:
				return getRequiredSkills();
			case FlowPackage.ROLE__PARTICIPANTS:
				return getParticipants();
			case FlowPackage.ROLE__RESOURCES:
				return getResources();
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
			case FlowPackage.ROLE__REQUIRED_SKILLS:
				getRequiredSkills().clear();
				getRequiredSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case FlowPackage.ROLE__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>)newValue);
				return;
			case FlowPackage.ROLE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
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
			case FlowPackage.ROLE__REQUIRED_SKILLS:
				getRequiredSkills().clear();
				return;
			case FlowPackage.ROLE__PARTICIPANTS:
				getParticipants().clear();
				return;
			case FlowPackage.ROLE__RESOURCES:
				getResources().clear();
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
			case FlowPackage.ROLE__REQUIRED_SKILLS:
				return !getRequiredSkills().isEmpty();
			case FlowPackage.ROLE__PARTICIPANTS:
				return !getParticipants().isEmpty();
			case FlowPackage.ROLE__RESOURCES:
				return !getResources().isEmpty();
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
		if (baseClass == SkillConsumer.class) {
			switch (derivedFeatureID) {
				case FlowPackage.ROLE__REQUIRED_SKILLS: return FlowPackage.SKILL_CONSUMER__REQUIRED_SKILLS;
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
		if (baseClass == SkillConsumer.class) {
			switch (baseFeatureID) {
				case FlowPackage.SKILL_CONSUMER__REQUIRED_SKILLS: return FlowPackage.ROLE__REQUIRED_SKILLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RoleImpl
