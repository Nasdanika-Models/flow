/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Package#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Package#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Package ID unique within the containing package or other containing element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.flow.Package#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_SubPackages()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Package> getSubPackages();

} // Package
