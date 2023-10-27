/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something requiring skills
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.SkillConsumer#getRequiredSkills <em>Required Skills</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getSkillConsumer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SkillConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Skills</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Skill}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.flow.Skill#getSkillConsumers <em>Skill Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skills required by this consumer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Skills</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getSkillConsumer_RequiredSkills()
	 * @see org.nasdanika.models.flow.Skill#getSkillConsumers
	 * @model opposite="skillConsumers"
	 * @generated
	 */
	EList<Skill> getRequiredSkills();

} // SkillConsumer
