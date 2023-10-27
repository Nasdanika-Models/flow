/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.flow.ArtifactDomainElement;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Skill;
import org.nasdanika.models.flow.SkillConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Domain Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.ArtifactDomainElementImpl#getRequiredSkills <em>Required Skills</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArtifactDomainElementImpl extends ModelElementImpl implements ArtifactDomainElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactDomainElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.ARTIFACT_DOMAIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getRequiredSkills() {
		return (EList<Skill>)eDynamicGet(FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS, FlowPackage.Literals.SKILL_CONSUMER__REQUIRED_SKILLS, true, true);
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
			case FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredSkills()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS:
				return ((InternalEList<?>)getRequiredSkills()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS:
				return getRequiredSkills();
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
			case FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS:
				getRequiredSkills().clear();
				getRequiredSkills().addAll((Collection<? extends Skill>)newValue);
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
			case FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS:
				getRequiredSkills().clear();
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
			case FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS:
				return !getRequiredSkills().isEmpty();
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
				case FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS: return FlowPackage.SKILL_CONSUMER__REQUIRED_SKILLS;
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
				case FlowPackage.SKILL_CONSUMER__REQUIRED_SKILLS: return FlowPackage.ARTIFACT_DOMAIN_ELEMENT__REQUIRED_SKILLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ArtifactDomainElementImpl
