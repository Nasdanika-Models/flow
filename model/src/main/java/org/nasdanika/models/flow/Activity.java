/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An activity is performed by participants in roles using resources and input artifacts to produce output artifacts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Activity#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Node, Role {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participant roles for this activity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getActivity_Roles()
	 * @model keys="id"
	 * @generated
	 */
	EList<Role> getRoles();

} // Activity
