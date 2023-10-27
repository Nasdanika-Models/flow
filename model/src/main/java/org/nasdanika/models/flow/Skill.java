/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information passed between flow elements and operated on by participants using resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Skill#getSkillConsumers <em>Skill Consumers</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Skill#getProficiencyLevels <em>Proficiency Levels</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends SkillDomainElement {
	/**
	 * Returns the value of the '<em><b>Skill Consumers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.SkillConsumer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.SkillConsumer#getRequiredSkills <em>Required Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles which utilize this skill
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skill Consumers</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getSkill_SkillConsumers()
	 * @see org.nasdanika.models.flow.SkillConsumer#getRequiredSkills
	 * @model opposite="requiredSkills"
	 * @generated
	 */
	EList<SkillConsumer> getSkillConsumers();

	/**
	 * Returns the value of the '<em><b>Proficiency Levels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills can be sub-divided into proficiency levels. E.g. "Beginner", "Intermediate", "Advanced". Or "Junior", "Senior".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proficiency Levels</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getSkill_ProficiencyLevels()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Skill> getProficiencyLevels();

} // Skill
