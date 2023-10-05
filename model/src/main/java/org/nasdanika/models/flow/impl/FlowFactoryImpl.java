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
import org.nasdanika.models.flow.ArtifactInfo;
import org.nasdanika.models.flow.Call;
import org.nasdanika.models.flow.ComplexDataElement;
import org.nasdanika.models.flow.Connection;
import org.nasdanika.models.flow.DataElement;
import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.EcoreDataType;
import org.nasdanika.models.flow.End;
import org.nasdanika.models.flow.FlowFactory;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Gateway;
import org.nasdanika.models.flow.InputPort;
import org.nasdanika.models.flow.Node;
import org.nasdanika.models.flow.OutputPort;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.ProcessElement;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.Role;
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
			case FlowPackage.ARTIFACT: return createArtifact();
			case FlowPackage.ARTIFACT_INFO: return createArtifactInfo();
			case FlowPackage.CONNECTION: return createConnection();
			case FlowPackage.PROCESS_ELEMENT: return createProcessElement();
			case FlowPackage.START: return createStart();
			case FlowPackage.INPUT_PORT: return createInputPort();
			case FlowPackage.END: return createEnd();
			case FlowPackage.OUTPUT_PORT: return createOutputPort();
			case FlowPackage.ROLE: return createRole();
			case FlowPackage.NODE: return createNode();
			case FlowPackage.GATEWAY: return createGateway();
			case FlowPackage.TRANSITION: return createTransition();
			case FlowPackage.CALL: return createCall();
			case FlowPackage.ACTIVITY: return createActivity();
			case FlowPackage.PROCESS: return createProcess();
			case FlowPackage.RESOURCE: return createResource();
			case FlowPackage.PARTICIPANT: return createParticipant();
			case FlowPackage.PACKAGE: return createPackage();
			case FlowPackage.DATA_TYPE: return createDataType();
			case FlowPackage.DATA_ELEMENT: return createDataElement();
			case FlowPackage.COMPLEX_DATA_ELEMENT: return createComplexDataElement();
			case FlowPackage.SIMPLE_DATA_ELEMENT: return createSimpleDataElement();
			case FlowPackage.ECORE_DATA_TYPE: return createEcoreDataType();
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
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
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
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
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
