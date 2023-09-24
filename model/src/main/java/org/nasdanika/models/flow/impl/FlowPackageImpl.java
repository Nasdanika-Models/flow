/**
 */
package org.nasdanika.models.flow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.flow.Activity;
import org.nasdanika.models.flow.Artifact;
import org.nasdanika.models.flow.ArtifactInfo;
import org.nasdanika.models.flow.Call;
import org.nasdanika.models.flow.ComplexDataElement;
import org.nasdanika.models.flow.Connection;
import org.nasdanika.models.flow.DataElement;
import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.EcoreDataType;
import org.nasdanika.models.flow.End;
import org.nasdanika.models.flow.Flow;
import org.nasdanika.models.flow.FlowElement;
import org.nasdanika.models.flow.FlowFactory;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.ForkJoin;
import org.nasdanika.models.flow.InputPort;
import org.nasdanika.models.flow.ModelElement;
import org.nasdanika.models.flow.Node;
import org.nasdanika.models.flow.OutputPort;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.Role;
import org.nasdanika.models.flow.SimpleDataElement;
import org.nasdanika.models.flow.Source;
import org.nasdanika.models.flow.Start;
import org.nasdanika.models.flow.Target;
import org.nasdanika.models.flow.Transition;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowPackageImpl extends EPackageImpl implements FlowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkJoinEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexDataElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecoreDataTypeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactInfoEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.flow.FlowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlowPackageImpl() {
		super(eNS_URI, FlowFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FlowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlowPackage init() {
		if (isInited) return (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFlowPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FlowPackageImpl theFlowPackage = registeredFlowPackage instanceof FlowPackageImpl ? (FlowPackageImpl)registeredFlowPackage : new FlowPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFlowPackage.createPackageContents();

		// Initialize created meta-data
		theFlowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlowPackage.eNS_URI, theFlowPackage);
		return theFlowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Id() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Target() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_OutgoingConnections() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Outputs() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTarget_IncomingConnections() {
		return (EReference)targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTarget_Inputs() {
		return (EReference)targetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_InputPorts() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_OutputPorts() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForkJoin() {
		return forkJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Payload() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCall_Response() {
		return (EReference)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Roles() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Resources() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Participants() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_SubPackages() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Flows() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Participants() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Resources() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Artifacts() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_DataElements() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_DataTypes() {
		return (EReference)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_Base() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataElement() {
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataElement_LowerBound() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataElement_UpperBound() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataElement_Artifacts() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplexDataElement() {
		return complexDataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplexDataElement_Features() {
		return (EReference)complexDataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleDataElement() {
		return simpleDataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleDataElement_Type() {
		return (EReference)simpleDataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEcoreDataType() {
		return ecoreDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEcoreDataType_Type() {
		return (EReference)ecoreDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Elements() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Resources() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_DataElements() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Infos() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Participants() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Roles() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Artifacts() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Roles() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Participants() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Infos() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Activities() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipant_Roles() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipant_Resources() {
		return (EReference)participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipant_Artifacts() {
		return (EReference)participantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipant_Activities() {
		return (EReference)participantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipant_Infos() {
		return (EReference)participantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Players() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Artifacts() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Resources() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Infos() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifactInfo() {
		return artifactInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifactInfo_Artifact() {
		return (EReference)artifactInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifactInfo_Roles() {
		return (EReference)artifactInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifactInfo_Resources() {
		return (EReference)artifactInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifactInfo_Participants() {
		return (EReference)artifactInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowFactory getFlowFactory() {
		return (FlowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ID);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__TARGET);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__OUTGOING_CONNECTIONS);
		createEReference(sourceEClass, SOURCE__OUTPUTS);

		startEClass = createEClass(START);

		inputPortEClass = createEClass(INPUT_PORT);

		targetEClass = createEClass(TARGET);
		createEReference(targetEClass, TARGET__INCOMING_CONNECTIONS);
		createEReference(targetEClass, TARGET__INPUTS);

		endEClass = createEClass(END);

		outputPortEClass = createEClass(OUTPUT_PORT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__INPUT_PORTS);
		createEReference(nodeEClass, NODE__OUTPUT_PORTS);

		forkJoinEClass = createEClass(FORK_JOIN);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__PAYLOAD);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__RESPONSE);

		flowElementEClass = createEClass(FLOW_ELEMENT);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__ROLES);
		createEReference(activityEClass, ACTIVITY__RESOURCES);
		createEReference(activityEClass, ACTIVITY__PARTICIPANTS);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__ELEMENTS);

		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__RESOURCES);
		createEReference(artifactEClass, ARTIFACT__DATA_ELEMENTS);
		createEReference(artifactEClass, ARTIFACT__INFOS);
		createEReference(artifactEClass, ARTIFACT__PARTICIPANTS);
		createEReference(artifactEClass, ARTIFACT__ROLES);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__ARTIFACTS);
		createEReference(resourceEClass, RESOURCE__ROLES);
		createEReference(resourceEClass, RESOURCE__PARTICIPANTS);
		createEReference(resourceEClass, RESOURCE__INFOS);
		createEReference(resourceEClass, RESOURCE__ACTIVITIES);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__ROLES);
		createEReference(participantEClass, PARTICIPANT__RESOURCES);
		createEReference(participantEClass, PARTICIPANT__ARTIFACTS);
		createEReference(participantEClass, PARTICIPANT__ACTIVITIES);
		createEReference(participantEClass, PARTICIPANT__INFOS);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PLAYERS);
		createEReference(roleEClass, ROLE__ARTIFACTS);
		createEReference(roleEClass, ROLE__RESOURCES);
		createEReference(roleEClass, ROLE__INFOS);

		artifactInfoEClass = createEClass(ARTIFACT_INFO);
		createEReference(artifactInfoEClass, ARTIFACT_INFO__ARTIFACT);
		createEReference(artifactInfoEClass, ARTIFACT_INFO__ROLES);
		createEReference(artifactInfoEClass, ARTIFACT_INFO__RESOURCES);
		createEReference(artifactInfoEClass, ARTIFACT_INFO__PARTICIPANTS);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__SUB_PACKAGES);
		createEReference(packageEClass, PACKAGE__FLOWS);
		createEReference(packageEClass, PACKAGE__PARTICIPANTS);
		createEReference(packageEClass, PACKAGE__RESOURCES);
		createEReference(packageEClass, PACKAGE__ARTIFACTS);
		createEReference(packageEClass, PACKAGE__DATA_ELEMENTS);
		createEReference(packageEClass, PACKAGE__DATA_TYPES);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__BASE);

		dataElementEClass = createEClass(DATA_ELEMENT);
		createEAttribute(dataElementEClass, DATA_ELEMENT__LOWER_BOUND);
		createEAttribute(dataElementEClass, DATA_ELEMENT__UPPER_BOUND);
		createEReference(dataElementEClass, DATA_ELEMENT__ARTIFACTS);

		complexDataElementEClass = createEClass(COMPLEX_DATA_ELEMENT);
		createEReference(complexDataElementEClass, COMPLEX_DATA_ELEMENT__FEATURES);

		simpleDataElementEClass = createEClass(SIMPLE_DATA_ELEMENT);
		createEReference(simpleDataElementEClass, SIMPLE_DATA_ELEMENT__TYPE);

		ecoreDataTypeEClass = createEClass(ECORE_DATA_TYPE);
		createEReference(ecoreDataTypeEClass, ECORE_DATA_TYPE__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelElementEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		connectionEClass.getESuperTypes().add(this.getModelElement());
		startEClass.getESuperTypes().add(this.getFlowElement());
		startEClass.getESuperTypes().add(this.getSource());
		inputPortEClass.getESuperTypes().add(this.getModelElement());
		inputPortEClass.getESuperTypes().add(this.getSource());
		endEClass.getESuperTypes().add(this.getFlowElement());
		endEClass.getESuperTypes().add(this.getTarget());
		outputPortEClass.getESuperTypes().add(this.getModelElement());
		outputPortEClass.getESuperTypes().add(this.getTarget());
		nodeEClass.getESuperTypes().add(this.getFlowElement());
		nodeEClass.getESuperTypes().add(this.getSource());
		nodeEClass.getESuperTypes().add(this.getTarget());
		forkJoinEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getConnection());
		callEClass.getESuperTypes().add(this.getTransition());
		flowElementEClass.getESuperTypes().add(this.getModelElement());
		activityEClass.getESuperTypes().add(this.getNode());
		flowEClass.getESuperTypes().add(this.getActivity());
		artifactEClass.getESuperTypes().add(this.getModelElement());
		resourceEClass.getESuperTypes().add(this.getModelElement());
		participantEClass.getESuperTypes().add(this.getModelElement());
		roleEClass.getESuperTypes().add(this.getModelElement());
		artifactInfoEClass.getESuperTypes().add(this.getModelElement());
		packageEClass.getESuperTypes().add(this.getModelElement());
		dataTypeEClass.getESuperTypes().add(this.getModelElement());
		dataElementEClass.getESuperTypes().add(this.getModelElement());
		complexDataElementEClass.getESuperTypes().add(this.getDataElement());
		complexDataElementEClass.getESuperTypes().add(this.getDataType());
		simpleDataElementEClass.getESuperTypes().add(this.getDataElement());
		ecoreDataTypeEClass.getESuperTypes().add(this.getDataType());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Target(), this.getTarget(), this.getTarget_IncomingConnections(), "target", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_OutgoingConnections(), this.getConnection(), null, "outgoingConnections", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSource_OutgoingConnections().getEKeys().add(this.getModelElement_Id());
		initEReference(getSource_Outputs(), this.getArtifactInfo(), null, "outputs", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTarget_IncomingConnections(), this.getConnection(), this.getConnection_Target(), "incomingConnections", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Inputs(), this.getArtifactInfo(), null, "inputs", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_InputPorts(), this.getInputPort(), null, "inputPorts", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNode_InputPorts().getEKeys().add(this.getModelElement_Id());
		initEReference(getNode_OutputPorts(), this.getOutputPort(), null, "outputPorts", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNode_OutputPorts().getEKeys().add(this.getModelElement_Id());

		initEClass(forkJoinEClass, ForkJoin.class, "ForkJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Payload(), this.getArtifactInfo(), null, "payload", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Response(), this.getArtifactInfo(), null, "response", null, 0, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Roles(), this.getRole(), null, "roles", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getActivity_Roles().getEKeys().add(this.getModelElement_Id());
		initEReference(getActivity_Resources(), this.getResource(), this.getResource_Activities(), "resources", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Participants(), this.getParticipant(), this.getParticipant_Activities(), "participants", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_Elements(), this.getFlowElement(), null, "elements", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFlow_Elements().getEKeys().add(this.getModelElement_Id());

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_Resources(), this.getResource(), this.getResource_Artifacts(), "resources", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_DataElements(), this.getDataElement(), this.getDataElement_Artifacts(), "dataElements", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Infos(), this.getArtifactInfo(), this.getArtifactInfo_Artifact(), "infos", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Participants(), this.getParticipant(), this.getParticipant_Artifacts(), "participants", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Roles(), this.getRole(), this.getRole_Artifacts(), "roles", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Artifacts(), this.getArtifact(), this.getArtifact_Resources(), "artifacts", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Roles(), this.getRole(), this.getRole_Resources(), "roles", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Participants(), this.getParticipant(), this.getParticipant_Resources(), "participants", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Infos(), this.getArtifactInfo(), this.getArtifactInfo_Resources(), "infos", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Activities(), this.getActivity(), this.getActivity_Resources(), "activities", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Roles(), this.getRole(), this.getRole_Players(), "roles", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Resources(), this.getResource(), this.getResource_Participants(), "resources", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Artifacts(), this.getArtifact(), this.getArtifact_Participants(), "artifacts", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Activities(), this.getActivity(), this.getActivity_Participants(), "activities", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipant_Infos(), this.getArtifactInfo(), this.getArtifactInfo_Participants(), "infos", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Players(), this.getParticipant(), this.getParticipant_Roles(), "players", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Artifacts(), this.getArtifact(), this.getArtifact_Roles(), "artifacts", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Resources(), this.getResource(), this.getResource_Roles(), "resources", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Infos(), this.getArtifactInfo(), this.getArtifactInfo_Roles(), "infos", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactInfoEClass, ArtifactInfo.class, "ArtifactInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactInfo_Artifact(), this.getArtifact(), this.getArtifact_Infos(), "artifact", null, 1, 1, ArtifactInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactInfo_Roles(), this.getRole(), this.getRole_Infos(), "roles", null, 0, -1, ArtifactInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactInfo_Resources(), this.getResource(), this.getResource_Infos(), "resources", null, 0, -1, ArtifactInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactInfo_Participants(), this.getParticipant(), this.getParticipant_Infos(), "participants", null, 0, -1, ArtifactInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.nasdanika.models.flow.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_SubPackages(), this.getPackage(), null, "subPackages", null, 0, -1, org.nasdanika.models.flow.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_SubPackages().getEKeys().add(this.getModelElement_Id());
		initEReference(getPackage_Flows(), this.getFlow(), null, "flows", null, 0, -1, org.nasdanika.models.flow.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_Flows().getEKeys().add(this.getModelElement_Id());
		initEReference(getPackage_Participants(), this.getParticipant(), null, "participants", null, 0, -1, org.nasdanika.models.flow.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_Participants().getEKeys().add(this.getModelElement_Id());
		initEReference(getPackage_Resources(), this.getResource(), null, "resources", null, 0, -1, org.nasdanika.models.flow.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_Resources().getEKeys().add(this.getModelElement_Id());
		initEReference(getPackage_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, org.nasdanika.models.flow.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_DataElements(), this.getDataElement(), null, "dataElements", null, 0, -1, org.nasdanika.models.flow.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_DataElements().getEKeys().add(this.getModelElement_Id());
		initEReference(getPackage_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, org.nasdanika.models.flow.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_DataTypes().getEKeys().add(this.getModelElement_Id());

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Base(), this.getDataType(), null, "base", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataElementEClass, DataElement.class, "DataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataElement_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataElement_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataElement_Artifacts(), this.getArtifact(), this.getArtifact_DataElements(), "artifacts", null, 0, -1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexDataElementEClass, ComplexDataElement.class, "ComplexDataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexDataElement_Features(), this.getDataElement(), null, "features", null, 0, -1, ComplexDataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getComplexDataElement_Features().getEKeys().add(this.getModelElement_Id());

		initEClass(simpleDataElementEClass, SimpleDataElement.class, "SimpleDataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleDataElement_Type(), this.getDataType(), null, "type", null, 0, 1, SimpleDataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecoreDataTypeEClass, EcoreDataType.class, "EcoreDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcoreDataType_Type(), theEcorePackage.getEClassifier(), null, "type", null, 0, 1, EcoreDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for flow model elements"
		   });
		addAnnotation
		  (getModelElement_Id(),
		   source,
		   new String[] {
			   "documentation", "Element ID used as eKey in containment references"
		   });
		addAnnotation
		  (connectionEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for Transitions and Calls. Contained by its source."
		   });
		addAnnotation
		  (getConnection_Target(),
		   source,
		   new String[] {
			   "documentation", "Connection target"
		   });
		addAnnotation
		  (sourceEClass,
		   source,
		   new String[] {
			   "documentation", "Source of connections"
		   });
		addAnnotation
		  (getSource_OutgoingConnections(),
		   source,
		   new String[] {
			   "documentation", "Source outgoing connections"
		   });
		addAnnotation
		  (getSource_Outputs(),
		   source,
		   new String[] {
			   "documentation", "Outputs of this source used by one or more transitions"
		   });
		addAnnotation
		  (startEClass,
		   source,
		   new String[] {
			   "documentation", "Start pseudo-state"
		   });
		addAnnotation
		  (inputPortEClass,
		   source,
		   new String[] {
			   "documentation", "Nodes may have input ports and connections may use input ports as targets"
		   });
		addAnnotation
		  (targetEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for connection targets"
		   });
		addAnnotation
		  (getTarget_IncomingConnections(),
		   source,
		   new String[] {
			   "documentation", "Incoming connections - opposite to Connection.target"
		   });
		addAnnotation
		  (getTarget_Inputs(),
		   source,
		   new String[] {
			   "documentation", "Inputs to this target coming from one or more connections"
		   });
		addAnnotation
		  (endEClass,
		   source,
		   new String[] {
			   "documentation", "End pseudo-state"
		   });
		addAnnotation
		  (outputPortEClass,
		   source,
		   new String[] {
			   "documentation", "Nodes may have output ports with connection starting from those ports"
		   });
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "documentation", "A flow element which supports both outgoing and incoming connections"
		   });
		addAnnotation
		  (getNode_InputPorts(),
		   source,
		   new String[] {
			   "documentation", "Input ports may be used to group incoming connections"
		   });
		addAnnotation
		  (getNode_OutputPorts(),
		   source,
		   new String[] {
			   "documentation", "Output ports can be used to group outgoing connections"
		   });
		addAnnotation
		  (forkJoinEClass,
		   source,
		   new String[] {
			   "documentation", "A flow element which can combine (join) and dispatch (fork) its inputs"
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "documentation", "Transition passes control and payload from its source to its target. Fire-and-forget semantics."
		   });
		addAnnotation
		  (getTransition_Payload(),
		   source,
		   new String[] {
			   "documentation", "Transition palyoad - references to source outputs"
		   });
		addAnnotation
		  (callEClass,
		   source,
		   new String[] {
			   "documentation", "Sends a request payload to its target and returns response to its source. Request-response semantics."
		   });
		addAnnotation
		  (getCall_Response(),
		   source,
		   new String[] {
			   "documentation", "Call response - references to target outputs"
		   });
		addAnnotation
		  (flowElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for flow elements"
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "documentation", "An activity is performed by participants in roles using resources and input artifacts to produce output artifacts"
		   });
		addAnnotation
		  (getActivity_Roles(),
		   source,
		   new String[] {
			   "documentation", "Participant roles for this activity"
		   });
		addAnnotation
		  (getActivity_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources used in this activity. Resources can also be specified via roles and artifact info."
		   });
		addAnnotation
		  (getActivity_Participants(),
		   source,
		   new String[] {
			   "documentation", "Partipants of this activity. Can be used if grouping by roles is not required."
		   });
		addAnnotation
		  (flowEClass,
		   source,
		   new String[] {
			   "documentation", "Flow is a composite activity"
		   });
		addAnnotation
		  (getFlow_Elements(),
		   source,
		   new String[] {
			   "documentation", "Flow elements"
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "documentation", "Information passed between flow elements and operated on by participants using resources"
		   });
		addAnnotation
		  (getArtifact_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resorces which operate with this artifact. E.g. a Java source file artifact is edited in a Java IDE resource and stored in a version control repository resource."
		   });
		addAnnotation
		  (getArtifact_DataElements(),
		   source,
		   new String[] {
			   "documentation", "Data element used in this artifact. E.g. a JSON structure may use Person data element/type"
		   });
		addAnnotation
		  (getArtifact_Infos(),
		   source,
		   new String[] {
			   "documentation", "Opposite to ArtifactInfo.artifact - all infos which use this artifact."
		   });
		addAnnotation
		  (getArtifact_Participants(),
		   source,
		   new String[] {
			   "documentation", "Participants which use this artifact"
		   });
		addAnnotation
		  (getArtifact_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles which use this artifact"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "Resource is something used by participants/roles to work with artifacts. It may be a tool, or a repository."
		   });
		addAnnotation
		  (getResource_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Artifacts which this resource operates with. "
		   });
		addAnnotation
		  (getResource_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles which use this resource"
		   });
		addAnnotation
		  (getResource_Participants(),
		   source,
		   new String[] {
			   "documentation", "Participants using this resource"
		   });
		addAnnotation
		  (getResource_Infos(),
		   source,
		   new String[] {
			   "documentation", "ArtifactInfo which reference this resource"
		   });
		addAnnotation
		  (getResource_Activities(),
		   source,
		   new String[] {
			   "documentation", "Activities which use this resource"
		   });
		addAnnotation
		  (participantEClass,
		   source,
		   new String[] {
			   "documentation", "Participates in flow execution by playing roles in activities "
		   });
		addAnnotation
		  (getParticipant_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles played by this participant"
		   });
		addAnnotation
		  (getParticipant_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources used by this participant"
		   });
		addAnnotation
		  (getParticipant_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Artifacts this participant works on"
		   });
		addAnnotation
		  (getParticipant_Activities(),
		   source,
		   new String[] {
			   "documentation", "Activities of this participant."
		   });
		addAnnotation
		  (getParticipant_Infos(),
		   source,
		   new String[] {
			   "documentation", "Artifact infos referencing this participant. An alternative to using roles."
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "documentation", "A role of a participant in an activity"
		   });
		addAnnotation
		  (getRole_Players(),
		   source,
		   new String[] {
			   "documentation", "Participants playing this role"
		   });
		addAnnotation
		  (getRole_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Artifacts used by this role"
		   });
		addAnnotation
		  (getRole_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources used by this role"
		   });
		addAnnotation
		  (getRole_Infos(),
		   source,
		   new String[] {
			   "documentation", "Artifact infos mentioning this role"
		   });
		addAnnotation
		  (artifactInfoEClass,
		   source,
		   new String[] {
			   "documentation", "An information about how an artifact is used"
		   });
		addAnnotation
		  (getArtifactInfo_Artifact(),
		   source,
		   new String[] {
			   "documentation", "Artifact"
		   });
		addAnnotation
		  (getArtifactInfo_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles workig on the artifact"
		   });
		addAnnotation
		  (getArtifactInfo_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources used to work on the artifact"
		   });
		addAnnotation
		  (getArtifactInfo_Participants(),
		   source,
		   new String[] {
			   "documentation", "Participants working on the artifact using resources - an alternative to roles"
		   });
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "documentation", "A group of flows and elements they reference - participants, ..."
		   });
		addAnnotation
		  (getPackage_SubPackages(),
		   source,
		   new String[] {
			   "documentation", "Packages may form a hierarchy"
		   });
		addAnnotation
		  (getPackage_Flows(),
		   source,
		   new String[] {
			   "documentation", "Flows defined in this package"
		   });
		addAnnotation
		  (getPackage_Participants(),
		   source,
		   new String[] {
			   "documentation", "Participants of activities in this package and sub-packages"
		   });
		addAnnotation
		  (getPackage_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources used in activities in this package and sub-packages"
		   });
		addAnnotation
		  (getPackage_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Artifacts used in this package and sub-packages"
		   });
		addAnnotation
		  (getPackage_DataElements(),
		   source,
		   new String[] {
			   "documentation", "Data elements used in this package and sub-packages"
		   });
		addAnnotation
		  (getPackage_DataTypes(),
		   source,
		   new String[] {
			   "documentation", "Data types used in this package and sub-packages"
		   });
		addAnnotation
		  (dataTypeEClass,
		   source,
		   new String[] {
			   "documentation", "Type of data. E.g. Number, Date, Text, Person"
		   });
		addAnnotation
		  (getDataType_Base(),
		   source,
		   new String[] {
			   "documentation", "Base of this data type. E.g. SSN data type may have Text data type as its base."
		   });
		addAnnotation
		  (dataElementEClass,
		   source,
		   new String[] {
			   "documentation", "Element of data"
		   });
		addAnnotation
		  (getDataElement_LowerBound(),
		   source,
		   new String[] {
			   "documentation", "Lower bound. E.g. if it is 1 then a data element is mandatory."
		   });
		addAnnotation
		  (getDataElement_UpperBound(),
		   source,
		   new String[] {
			   "documentation", "Upper value. -1 means unlimited."
		   });
		addAnnotation
		  (getDataElement_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Data element may be used in multiple artifacts"
		   });
		addAnnotation
		  (complexDataElementEClass,
		   source,
		   new String[] {
			   "documentation", "A data element consisting of other data elements, a structure/class"
		   });
		addAnnotation
		  (getComplexDataElement_Features(),
		   source,
		   new String[] {
			   "documentation", "Elements of the complex data elment. Also known as properties/fields/attributes"
		   });
		addAnnotation
		  (simpleDataElementEClass,
		   source,
		   new String[] {
			   "documentation", "A scalar, but may contain multiple values of the same type"
		   });
		addAnnotation
		  (getSimpleDataElement_Type(),
		   source,
		   new String[] {
			   "documentation", "Element\'s type. E.g. ssn data element may be of SSN data type."
		   });
		addAnnotation
		  (ecoreDataTypeEClass,
		   source,
		   new String[] {
			   "documentation", "A data type defined in Ecore model"
		   });
		addAnnotation
		  (getEcoreDataType_Type(),
		   source,
		   new String[] {
			   "documentation", "Type Eclassifier"
		   });
	}

} //FlowPackageImpl
