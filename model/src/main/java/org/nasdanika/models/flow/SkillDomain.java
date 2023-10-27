/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A grouping construct for skills
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.SkillDomain#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getSkillDomain()
 * @model
 * @generated
 */
public interface SkillDomain extends SkillDomainElement {
	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.SkillDomainElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts used in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getSkillDomain_Skills()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<SkillDomainElement> getSkills();

} // SkillDomain
