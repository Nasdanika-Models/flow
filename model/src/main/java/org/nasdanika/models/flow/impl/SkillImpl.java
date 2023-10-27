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
import org.nasdanika.models.flow.Skill;
import org.nasdanika.models.flow.SkillConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.SkillImpl#getSkillConsumers <em>Skill Consumers</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.SkillImpl#getProficiencyLevels <em>Proficiency Levels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends SkillDomainElementImpl implements Skill {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SkillConsumer> getSkillConsumers() {
		return (EList<SkillConsumer>)eDynamicGet(FlowPackage.SKILL__SKILL_CONSUMERS, FlowPackage.Literals.SKILL__SKILL_CONSUMERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getProficiencyLevels() {
		return (EList<Skill>)eDynamicGet(FlowPackage.SKILL__PROFICIENCY_LEVELS, FlowPackage.Literals.SKILL__PROFICIENCY_LEVELS, true, true);
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
			case FlowPackage.SKILL__SKILL_CONSUMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSkillConsumers()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.SKILL__SKILL_CONSUMERS:
				return ((InternalEList<?>)getSkillConsumers()).basicRemove(otherEnd, msgs);
			case FlowPackage.SKILL__PROFICIENCY_LEVELS:
				return ((InternalEList<?>)getProficiencyLevels()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.SKILL__SKILL_CONSUMERS:
				return getSkillConsumers();
			case FlowPackage.SKILL__PROFICIENCY_LEVELS:
				return getProficiencyLevels();
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
			case FlowPackage.SKILL__SKILL_CONSUMERS:
				getSkillConsumers().clear();
				getSkillConsumers().addAll((Collection<? extends SkillConsumer>)newValue);
				return;
			case FlowPackage.SKILL__PROFICIENCY_LEVELS:
				getProficiencyLevels().clear();
				getProficiencyLevels().addAll((Collection<? extends Skill>)newValue);
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
			case FlowPackage.SKILL__SKILL_CONSUMERS:
				getSkillConsumers().clear();
				return;
			case FlowPackage.SKILL__PROFICIENCY_LEVELS:
				getProficiencyLevels().clear();
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
			case FlowPackage.SKILL__SKILL_CONSUMERS:
				return !getSkillConsumers().isEmpty();
			case FlowPackage.SKILL__PROFICIENCY_LEVELS:
				return !getProficiencyLevels().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SkillImpl
