/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.capability.CapabilityDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of processes and elements they reference - participants, ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Package#getSubPackages <em>Sub Packages</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelElement, ParticipantDomain, ArtifactDomain, ResourceDomain, ProcessDomain, DataTypeDomain, DataDomain, CapabilityDomain, SkillDomain {
	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Packages may form a hierarchy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_SubPackages()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Package> getSubPackages();

} // Package
