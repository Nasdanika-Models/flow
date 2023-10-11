/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboratable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something that particpants in roles can collaborate on
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Collaboratable#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getCollaboratable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Collaboratable<R extends Role> extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getCollaboratable_Roles()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<R> getRoles();

} // Collaboratable
