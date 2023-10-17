/**
 */
package org.nasdanika.models.flow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.models.flow.Activity;
import org.nasdanika.models.flow.Artifact;
import org.nasdanika.models.flow.ArtifactDomain;
import org.nasdanika.models.flow.ArtifactInfo;
import org.nasdanika.models.flow.ArtifactProcessorRole;
import org.nasdanika.models.flow.Call;
import org.nasdanika.models.flow.ComplexDataElement;
import org.nasdanika.models.flow.CompositeArtifact;
import org.nasdanika.models.flow.CompositeResource;
import org.nasdanika.models.flow.Connection;
import org.nasdanika.models.flow.DataDomain;
import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.DataTypeDomain;
import org.nasdanika.models.flow.EcoreDataType;
import org.nasdanika.models.flow.End;
import org.nasdanika.models.flow.FlowFactory;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Gateway;
import org.nasdanika.models.flow.InputPort;
import org.nasdanika.models.flow.OutputPort;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.ParticipantDomain;
import org.nasdanika.models.flow.ProcessDomain;
import org.nasdanika.models.flow.ProcessElement;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.ResourceDomain;
import org.nasdanika.models.flow.Role;
import org.nasdanika.models.flow.Service;
import org.nasdanika.models.flow.SimpleDataElement;
import org.nasdanika.models.flow.Start;
import org.nasdanika.models.flow.Transition;
import org.nasdanika.models.flow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowFactoryImpl extends EFactoryImpl implements FlowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlowFactory init() {
		try {
			FlowFactory theFlowFactory = (FlowFactory)EPackage.Registry.INSTANCE.getEFactory(FlowPackage.eNS_URI);
			if (theFlowFactory != null) {
				return theFlowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FlowPackage.ARTIFACT_DOMAIN: return createArtifactDomain();
			case FlowPackage.ARTIFACT: return createArtifact();
			case FlowPackage.COMPOSITE_ARTIFACT: return createCompositeArtifact();
			case FlowPackage.ARTIFACT_INFO: return createArtifactInfo();
			case FlowPackage.CONNECTION: return createConnection();
			case FlowPackage.PROCESS_ELEMENT: return createProcessElement();
			case FlowPackage.START: return createStart();
			case FlowPackage.INPUT_PORT: return createInputPort();
			case FlowPackage.END: return createEnd();
			case FlowPackage.OUTPUT_PORT: return createOutputPort();
			case FlowPackage.ROLE: return createRole();
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE: return createArtifactProcessorRole();
			case FlowPackage.GATEWAY: return createGateway();
			case FlowPackage.SERVICE: return createService();
			case FlowPackage.TRANSITION: return createTransition();
			case FlowPackage.CALL: return createCall();
			case FlowPackage.ACTIVITY: return createActivity();
			case FlowPackage.PROCESS_DOMAIN: return createProcessDomain();
			case FlowPackage.PROCESS: return createProcess();
			case FlowPackage.RESOURCE_DOMAIN: return createResourceDomain();
			case FlowPackage.RESOURCE: return createResource();
			case FlowPackage.COMPOSITE_RESOURCE: return createCompositeResource();
			case FlowPackage.PARTICIPANT_DOMAIN: return createParticipantDomain();
			case FlowPackage.PARTICIPANT: return createParticipant();
			case FlowPackage.DATA_TYPE_DOMAIN: return createDataTypeDomain();
			case FlowPackage.DATA_TYPE: return createDataType();
			case FlowPackage.ECORE_DATA_TYPE: return createEcoreDataType();
			case FlowPackage.DATA_DOMAIN: return createDataDomain();
			case FlowPackage.COMPLEX_DATA_ELEMENT: return createComplexDataElement();
			case FlowPackage.SIMPLE_DATA_ELEMENT: return createSimpleDataElement();
			case FlowPackage.PACKAGE: return createPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactDomain createArtifactDomain() {
		ArtifactDomainImpl artifactDomain = new ArtifactDomainImpl();
		return artifactDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessElement createProcessElement() {
		ProcessElementImpl processElement = new ProcessElementImpl();
		return processElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessDomain createProcessDomain() {
		ProcessDomainImpl processDomain = new ProcessDomainImpl();
		return processDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.flow.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceDomain createResourceDomain() {
		ResourceDomainImpl resourceDomain = new ResourceDomainImpl();
		return resourceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.models.flow.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexDataElement createComplexDataElement() {
		ComplexDataElementImpl complexDataElement = new ComplexDataElementImpl();
		return complexDataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleDataElement createSimpleDataElement() {
		SimpleDataElementImpl simpleDataElement = new SimpleDataElementImpl();
		return simpleDataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcoreDataType createEcoreDataType() {
		EcoreDataTypeImpl ecoreDataType = new EcoreDataTypeImpl();
		return ecoreDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDomain createDataDomain() {
		DataDomainImpl dataDomain = new DataDomainImpl();
		return dataDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeArtifact createCompositeArtifact() {
		CompositeArtifactImpl compositeArtifact = new CompositeArtifactImpl();
		return compositeArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeResource createCompositeResource() {
		CompositeResourceImpl compositeResource = new CompositeResourceImpl();
		return compositeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipantDomain createParticipantDomain() {
		ParticipantDomainImpl participantDomain = new ParticipantDomainImpl();
		return participantDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTypeDomain createDataTypeDomain() {
		DataTypeDomainImpl dataTypeDomain = new DataTypeDomainImpl();
		return dataTypeDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactProcessorRole createArtifactProcessorRole() {
		ArtifactProcessorRoleImpl artifactProcessorRole = new ArtifactProcessorRoleImpl();
		return artifactProcessorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactInfo createArtifactInfo() {
		ArtifactInfoImpl artifactInfo = new ArtifactInfoImpl();
		return artifactInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowPackage getFlowPackage() {
		return (FlowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlowPackage getPackage() {
		return FlowPackage.eINSTANCE;
	}

} //FlowFactoryImpl
