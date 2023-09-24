/**
 */
package org.nasdanika.models.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of flows and elements they reference - participants, ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Package#getFlows <em>Flows</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Package#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Package#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Package#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Package#getDataElements <em>Data Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.Package#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.flow.FlowPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelElement {
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

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flows defined in this package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_Flows()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Flow> getFlows();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants of activities in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_Participants()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources used in activities in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_Resources()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts used in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Data Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.DataElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data elements used in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Elements</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_DataElements()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<DataElement> getDataElements();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.flow.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data types used in this package and sub-packages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see org.nasdanika.models.flow.FlowPackage#getPackage_DataTypes()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<DataType> getDataTypes();

} // Package
