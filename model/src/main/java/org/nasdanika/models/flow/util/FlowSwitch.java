/**
 */
package org.nasdanika.models.flow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;
import org.nasdanika.models.capability.RequirementConsumer;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.persistence.Marked;
import org.nasdanika.models.flow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.flow.FlowPackage
 * @generated
 */
public class FlowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSwitch() {
		if (modelPackage == null) {
			modelPackage = FlowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FlowPackage.MODEL_ELEMENT: {
				org.nasdanika.models.flow.ModelElement modelElement = (org.nasdanika.models.flow.ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseDocumentedNamedElement(modelElement);
				if (result == null) result = caseNamedElement(modelElement);
				if (result == null) result = caseDocumented(modelElement);
				if (result == null) result = caseNcore_ModelElement(modelElement);
				if (result == null) result = caseMarked(modelElement);
				if (result == null) result = caseAdaptable(modelElement);
				if (result == null) result = caseIMarked(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseModelElement(artifact);
				if (result == null) result = caseCollaboratable(artifact);
				if (result == null) result = caseDocumentedNamedElement(artifact);
				if (result == null) result = caseNamedElement(artifact);
				if (result == null) result = caseDocumented(artifact);
				if (result == null) result = caseNcore_ModelElement(artifact);
				if (result == null) result = caseMarked(artifact);
				if (result == null) result = caseAdaptable(artifact);
				if (result == null) result = caseIMarked(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT_INFO: {
				ArtifactInfo artifactInfo = (ArtifactInfo)theEObject;
				T result = caseArtifactInfo(artifactInfo);
				if (result == null) result = caseModelElement(artifactInfo);
				if (result == null) result = caseDocumentedNamedElement(artifactInfo);
				if (result == null) result = caseNamedElement(artifactInfo);
				if (result == null) result = caseDocumented(artifactInfo);
				if (result == null) result = caseNcore_ModelElement(artifactInfo);
				if (result == null) result = caseMarked(artifactInfo);
				if (result == null) result = caseAdaptable(artifactInfo);
				if (result == null) result = caseIMarked(artifactInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseModelElement(connection);
				if (result == null) result = caseDocumentedNamedElement(connection);
				if (result == null) result = caseNamedElement(connection);
				if (result == null) result = caseDocumented(connection);
				if (result == null) result = caseNcore_ModelElement(connection);
				if (result == null) result = caseMarked(connection);
				if (result == null) result = caseAdaptable(connection);
				if (result == null) result = caseIMarked(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT_PRODUCER: {
				ArtifactProducer artifactProducer = (ArtifactProducer)theEObject;
				T result = caseArtifactProducer(artifactProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PROCESS_ELEMENT: {
				ProcessElement processElement = (ProcessElement)theEObject;
				T result = caseProcessElement(processElement);
				if (result == null) result = caseModelElement(processElement);
				if (result == null) result = caseRequirementConsumer(processElement);
				if (result == null) result = caseDocumentedNamedElement(processElement);
				if (result == null) result = caseNamedElement(processElement);
				if (result == null) result = caseDocumented(processElement);
				if (result == null) result = caseNcore_ModelElement(processElement);
				if (result == null) result = caseMarked(processElement);
				if (result == null) result = caseAdaptable(processElement);
				if (result == null) result = caseIMarked(processElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = caseArtifactProducer(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseProcessElement(start);
				if (result == null) result = caseSource(start);
				if (result == null) result = caseModelElement(start);
				if (result == null) result = caseRequirementConsumer(start);
				if (result == null) result = caseArtifactProducer(start);
				if (result == null) result = caseDocumentedNamedElement(start);
				if (result == null) result = caseNamedElement(start);
				if (result == null) result = caseDocumented(start);
				if (result == null) result = caseNcore_ModelElement(start);
				if (result == null) result = caseMarked(start);
				if (result == null) result = caseAdaptable(start);
				if (result == null) result = caseIMarked(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.INPUT_PORT: {
				InputPort inputPort = (InputPort)theEObject;
				T result = caseInputPort(inputPort);
				if (result == null) result = caseModelElement(inputPort);
				if (result == null) result = caseSource(inputPort);
				if (result == null) result = caseDocumentedNamedElement(inputPort);
				if (result == null) result = caseArtifactProducer(inputPort);
				if (result == null) result = caseNamedElement(inputPort);
				if (result == null) result = caseDocumented(inputPort);
				if (result == null) result = caseNcore_ModelElement(inputPort);
				if (result == null) result = caseMarked(inputPort);
				if (result == null) result = caseAdaptable(inputPort);
				if (result == null) result = caseIMarked(inputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT_CONSUMER: {
				ArtifactConsumer artifactConsumer = (ArtifactConsumer)theEObject;
				T result = caseArtifactConsumer(artifactConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.TARGET: {
				Target target = (Target)theEObject;
				T result = caseTarget(target);
				if (result == null) result = caseArtifactConsumer(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseProcessElement(end);
				if (result == null) result = caseTarget(end);
				if (result == null) result = caseModelElement(end);
				if (result == null) result = caseRequirementConsumer(end);
				if (result == null) result = caseArtifactConsumer(end);
				if (result == null) result = caseDocumentedNamedElement(end);
				if (result == null) result = caseNamedElement(end);
				if (result == null) result = caseDocumented(end);
				if (result == null) result = caseNcore_ModelElement(end);
				if (result == null) result = caseMarked(end);
				if (result == null) result = caseAdaptable(end);
				if (result == null) result = caseIMarked(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.OUTPUT_PORT: {
				OutputPort outputPort = (OutputPort)theEObject;
				T result = caseOutputPort(outputPort);
				if (result == null) result = caseModelElement(outputPort);
				if (result == null) result = caseTarget(outputPort);
				if (result == null) result = caseDocumentedNamedElement(outputPort);
				if (result == null) result = caseArtifactConsumer(outputPort);
				if (result == null) result = caseNamedElement(outputPort);
				if (result == null) result = caseDocumented(outputPort);
				if (result == null) result = caseNcore_ModelElement(outputPort);
				if (result == null) result = caseMarked(outputPort);
				if (result == null) result = caseAdaptable(outputPort);
				if (result == null) result = caseIMarked(outputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT_PROCESSOR: {
				ArtifactProcessor artifactProcessor = (ArtifactProcessor)theEObject;
				T result = caseArtifactProcessor(artifactProcessor);
				if (result == null) result = caseArtifactProducer(artifactProcessor);
				if (result == null) result = caseArtifactConsumer(artifactProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.COLLABORATABLE: {
				Collaboratable<?> collaboratable = (Collaboratable<?>)theEObject;
				T result = caseCollaboratable(collaboratable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseDocumentedNamedElement(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = caseDocumented(role);
				if (result == null) result = caseNcore_ModelElement(role);
				if (result == null) result = caseMarked(role);
				if (result == null) result = caseAdaptable(role);
				if (result == null) result = caseIMarked(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT_PROCESSOR_ROLE: {
				ArtifactProcessorRole artifactProcessorRole = (ArtifactProcessorRole)theEObject;
				T result = caseArtifactProcessorRole(artifactProcessorRole);
				if (result == null) result = caseRole(artifactProcessorRole);
				if (result == null) result = caseArtifactProcessor(artifactProcessorRole);
				if (result == null) result = caseModelElement(artifactProcessorRole);
				if (result == null) result = caseArtifactProducer(artifactProcessorRole);
				if (result == null) result = caseArtifactConsumer(artifactProcessorRole);
				if (result == null) result = caseDocumentedNamedElement(artifactProcessorRole);
				if (result == null) result = caseNamedElement(artifactProcessorRole);
				if (result == null) result = caseDocumented(artifactProcessorRole);
				if (result == null) result = caseNcore_ModelElement(artifactProcessorRole);
				if (result == null) result = caseMarked(artifactProcessorRole);
				if (result == null) result = caseAdaptable(artifactProcessorRole);
				if (result == null) result = caseIMarked(artifactProcessorRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseProcessElement(node);
				if (result == null) result = caseSource(node);
				if (result == null) result = caseTarget(node);
				if (result == null) result = caseArtifactProcessor(node);
				if (result == null) result = caseModelElement(node);
				if (result == null) result = caseRequirementConsumer(node);
				if (result == null) result = caseArtifactProducer(node);
				if (result == null) result = caseArtifactConsumer(node);
				if (result == null) result = caseDocumentedNamedElement(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseDocumented(node);
				if (result == null) result = caseNcore_ModelElement(node);
				if (result == null) result = caseMarked(node);
				if (result == null) result = caseAdaptable(node);
				if (result == null) result = caseIMarked(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.GATEWAY: {
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = caseNode(gateway);
				if (result == null) result = caseProcessElement(gateway);
				if (result == null) result = caseSource(gateway);
				if (result == null) result = caseTarget(gateway);
				if (result == null) result = caseArtifactProcessor(gateway);
				if (result == null) result = caseModelElement(gateway);
				if (result == null) result = caseRequirementConsumer(gateway);
				if (result == null) result = caseArtifactProducer(gateway);
				if (result == null) result = caseArtifactConsumer(gateway);
				if (result == null) result = caseDocumentedNamedElement(gateway);
				if (result == null) result = caseNamedElement(gateway);
				if (result == null) result = caseDocumented(gateway);
				if (result == null) result = caseNcore_ModelElement(gateway);
				if (result == null) result = caseMarked(gateway);
				if (result == null) result = caseAdaptable(gateway);
				if (result == null) result = caseIMarked(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNode(service);
				if (result == null) result = caseProcessElement(service);
				if (result == null) result = caseSource(service);
				if (result == null) result = caseTarget(service);
				if (result == null) result = caseArtifactProcessor(service);
				if (result == null) result = caseModelElement(service);
				if (result == null) result = caseRequirementConsumer(service);
				if (result == null) result = caseArtifactProducer(service);
				if (result == null) result = caseArtifactConsumer(service);
				if (result == null) result = caseDocumentedNamedElement(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = caseDocumented(service);
				if (result == null) result = caseNcore_ModelElement(service);
				if (result == null) result = caseMarked(service);
				if (result == null) result = caseAdaptable(service);
				if (result == null) result = caseIMarked(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseConnection(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = caseDocumentedNamedElement(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = caseDocumented(transition);
				if (result == null) result = caseNcore_ModelElement(transition);
				if (result == null) result = caseMarked(transition);
				if (result == null) result = caseAdaptable(transition);
				if (result == null) result = caseIMarked(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseTransition(call);
				if (result == null) result = caseConnection(call);
				if (result == null) result = caseModelElement(call);
				if (result == null) result = caseDocumentedNamedElement(call);
				if (result == null) result = caseNamedElement(call);
				if (result == null) result = caseDocumented(call);
				if (result == null) result = caseNcore_ModelElement(call);
				if (result == null) result = caseMarked(call);
				if (result == null) result = caseAdaptable(call);
				if (result == null) result = caseIMarked(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseNode(activity);
				if (result == null) result = caseArtifactProcessorRole(activity);
				if (result == null) result = caseCollaboratable(activity);
				if (result == null) result = caseProcessElement(activity);
				if (result == null) result = caseSource(activity);
				if (result == null) result = caseTarget(activity);
				if (result == null) result = caseArtifactProcessor(activity);
				if (result == null) result = caseRole(activity);
				if (result == null) result = caseModelElement(activity);
				if (result == null) result = caseRequirementConsumer(activity);
				if (result == null) result = caseArtifactProducer(activity);
				if (result == null) result = caseArtifactConsumer(activity);
				if (result == null) result = caseDocumentedNamedElement(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseDocumented(activity);
				if (result == null) result = caseNcore_ModelElement(activity);
				if (result == null) result = caseMarked(activity);
				if (result == null) result = caseAdaptable(activity);
				if (result == null) result = caseIMarked(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PROCESS: {
				org.nasdanika.models.flow.Process process = (org.nasdanika.models.flow.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseActivity(process);
				if (result == null) result = caseNode(process);
				if (result == null) result = caseArtifactProcessorRole(process);
				if (result == null) result = caseCollaboratable(process);
				if (result == null) result = caseProcessElement(process);
				if (result == null) result = caseSource(process);
				if (result == null) result = caseTarget(process);
				if (result == null) result = caseArtifactProcessor(process);
				if (result == null) result = caseRole(process);
				if (result == null) result = caseModelElement(process);
				if (result == null) result = caseRequirementConsumer(process);
				if (result == null) result = caseArtifactProducer(process);
				if (result == null) result = caseArtifactConsumer(process);
				if (result == null) result = caseDocumentedNamedElement(process);
				if (result == null) result = caseNamedElement(process);
				if (result == null) result = caseDocumented(process);
				if (result == null) result = caseNcore_ModelElement(process);
				if (result == null) result = caseMarked(process);
				if (result == null) result = caseAdaptable(process);
				if (result == null) result = caseIMarked(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseModelElement(resource);
				if (result == null) result = caseDocumentedNamedElement(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = caseDocumented(resource);
				if (result == null) result = caseNcore_ModelElement(resource);
				if (result == null) result = caseMarked(resource);
				if (result == null) result = caseAdaptable(resource);
				if (result == null) result = caseIMarked(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T result = caseParticipant(participant);
				if (result == null) result = caseModelElement(participant);
				if (result == null) result = caseDocumentedNamedElement(participant);
				if (result == null) result = caseNamedElement(participant);
				if (result == null) result = caseDocumented(participant);
				if (result == null) result = caseNcore_ModelElement(participant);
				if (result == null) result = caseMarked(participant);
				if (result == null) result = caseAdaptable(participant);
				if (result == null) result = caseIMarked(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PACKAGE: {
				org.nasdanika.models.flow.Package package_ = (org.nasdanika.models.flow.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = caseDocumentedNamedElement(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseDocumented(package_);
				if (result == null) result = caseNcore_ModelElement(package_);
				if (result == null) result = caseMarked(package_);
				if (result == null) result = caseAdaptable(package_);
				if (result == null) result = caseIMarked(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseModelElement(dataType);
				if (result == null) result = caseCollaboratable(dataType);
				if (result == null) result = caseDocumentedNamedElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseDocumented(dataType);
				if (result == null) result = caseNcore_ModelElement(dataType);
				if (result == null) result = caseMarked(dataType);
				if (result == null) result = caseAdaptable(dataType);
				if (result == null) result = caseIMarked(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseModelElement(dataElement);
				if (result == null) result = caseCollaboratable(dataElement);
				if (result == null) result = caseDocumentedNamedElement(dataElement);
				if (result == null) result = caseNamedElement(dataElement);
				if (result == null) result = caseDocumented(dataElement);
				if (result == null) result = caseNcore_ModelElement(dataElement);
				if (result == null) result = caseMarked(dataElement);
				if (result == null) result = caseAdaptable(dataElement);
				if (result == null) result = caseIMarked(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.COMPLEX_DATA_ELEMENT: {
				ComplexDataElement complexDataElement = (ComplexDataElement)theEObject;
				T result = caseComplexDataElement(complexDataElement);
				if (result == null) result = caseDataElement(complexDataElement);
				if (result == null) result = caseDataType(complexDataElement);
				if (result == null) result = caseModelElement(complexDataElement);
				if (result == null) result = caseCollaboratable(complexDataElement);
				if (result == null) result = caseDocumentedNamedElement(complexDataElement);
				if (result == null) result = caseNamedElement(complexDataElement);
				if (result == null) result = caseDocumented(complexDataElement);
				if (result == null) result = caseNcore_ModelElement(complexDataElement);
				if (result == null) result = caseMarked(complexDataElement);
				if (result == null) result = caseAdaptable(complexDataElement);
				if (result == null) result = caseIMarked(complexDataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SIMPLE_DATA_ELEMENT: {
				SimpleDataElement simpleDataElement = (SimpleDataElement)theEObject;
				T result = caseSimpleDataElement(simpleDataElement);
				if (result == null) result = caseDataElement(simpleDataElement);
				if (result == null) result = caseModelElement(simpleDataElement);
				if (result == null) result = caseCollaboratable(simpleDataElement);
				if (result == null) result = caseDocumentedNamedElement(simpleDataElement);
				if (result == null) result = caseNamedElement(simpleDataElement);
				if (result == null) result = caseDocumented(simpleDataElement);
				if (result == null) result = caseNcore_ModelElement(simpleDataElement);
				if (result == null) result = caseMarked(simpleDataElement);
				if (result == null) result = caseAdaptable(simpleDataElement);
				if (result == null) result = caseIMarked(simpleDataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ECORE_DATA_TYPE: {
				EcoreDataType ecoreDataType = (EcoreDataType)theEObject;
				T result = caseEcoreDataType(ecoreDataType);
				if (result == null) result = caseDataType(ecoreDataType);
				if (result == null) result = caseModelElement(ecoreDataType);
				if (result == null) result = caseCollaboratable(ecoreDataType);
				if (result == null) result = caseDocumentedNamedElement(ecoreDataType);
				if (result == null) result = caseNamedElement(ecoreDataType);
				if (result == null) result = caseDocumented(ecoreDataType);
				if (result == null) result = caseNcore_ModelElement(ecoreDataType);
				if (result == null) result = caseMarked(ecoreDataType);
				if (result == null) result = caseAdaptable(ecoreDataType);
				if (result == null) result = caseIMarked(ecoreDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(org.nasdanika.models.flow.ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Producer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Producer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactProducer(ArtifactProducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactConsumer(ArtifactConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarget(Target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactProcessor(ArtifactProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboratable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboratable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <R extends Role> T caseCollaboratable(Collaboratable<R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.nasdanika.models.flow.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.nasdanika.models.flow.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexDataElement(ComplexDataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDataElement(SimpleDataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreDataType(EcoreDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Processor Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Processor Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactProcessorRole(ArtifactProcessorRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactInfo(ArtifactInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMarked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(org.nasdanika.ncore.Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNcore_ModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementConsumer(RequirementConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FlowSwitch
