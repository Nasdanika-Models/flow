/**
 */
package org.nasdanika.models.flow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.common.Adaptable;
import org.nasdanika.graph.model.ConnectionSource;
import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.GraphElement;
import org.nasdanika.models.capability.CapabilityDomain;
import org.nasdanika.models.capability.CapabilityDomainElement;
import org.nasdanika.models.capability.RequirementConsumer;
import org.nasdanika.models.flow.Activity;
import org.nasdanika.models.flow.Artifact;
import org.nasdanika.models.flow.ArtifactConsumer;
import org.nasdanika.models.flow.ArtifactDomain;
import org.nasdanika.models.flow.ArtifactDomainElement;
import org.nasdanika.models.flow.ArtifactInfo;
import org.nasdanika.models.flow.ArtifactProcessor;
import org.nasdanika.models.flow.ArtifactProcessorRole;
import org.nasdanika.models.flow.ArtifactProducer;
import org.nasdanika.models.flow.Call;
import org.nasdanika.models.flow.Collaboratable;
import org.nasdanika.models.flow.ComplexDataElement;
import org.nasdanika.models.flow.CompositeArtifact;
import org.nasdanika.models.flow.CompositeResource;
import org.nasdanika.models.flow.Connection;
import org.nasdanika.models.flow.DataDomain;
import org.nasdanika.models.flow.DataDomainElement;
import org.nasdanika.models.flow.DataElement;
import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.DataTypeDomain;
import org.nasdanika.models.flow.DataTypeDomainElement;
import org.nasdanika.models.flow.EcoreDataType;
import org.nasdanika.models.flow.End;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Gateway;
import org.nasdanika.models.flow.InputPort;
import org.nasdanika.models.flow.Node;
import org.nasdanika.models.flow.OutputPort;
import org.nasdanika.models.flow.Participant;
import org.nasdanika.models.flow.ParticipantDomain;
import org.nasdanika.models.flow.ParticipantDomainElement;
import org.nasdanika.models.flow.ProcessDomain;
import org.nasdanika.models.flow.ProcessDomainElement;
import org.nasdanika.models.flow.ProcessElement;
import org.nasdanika.models.flow.Resource;
import org.nasdanika.models.flow.ResourceDomain;
import org.nasdanika.models.flow.ResourceDomainElement;
import org.nasdanika.models.flow.Role;
import org.nasdanika.models.flow.Service;
import org.nasdanika.models.flow.SimpleDataElement;
import org.nasdanika.models.flow.Skill;
import org.nasdanika.models.flow.SkillConsumer;
import org.nasdanika.models.flow.SkillDomain;
import org.nasdanika.models.flow.SkillDomainElement;
import org.nasdanika.models.flow.Source;
import org.nasdanika.models.flow.Start;
import org.nasdanika.models.flow.Target;
import org.nasdanika.models.flow.Transition;
import org.nasdanika.ncore.Documented;
import org.nasdanika.ncore.DocumentedNamedElement;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.ncore.StringIdentity;
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
public class FlowSwitch<T1> extends Switch<T1> {
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FlowPackage.MODEL_ELEMENT: {
				org.nasdanika.models.flow.ModelElement modelElement = (org.nasdanika.models.flow.ModelElement)theEObject;
				T1 result = caseModelElement(modelElement);
				if (result == null) result = caseCapabilityDomainElement(modelElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(modelElement);
				if (result == null) result = caseDocumentedNamedElement(modelElement);
				if (result == null) result = caseStringIdentity(modelElement);
				if (result == null) result = caseNamedElement(modelElement);
				if (result == null) result = caseDocumented(modelElement);
				if (result == null) result = caseNcore_ModelElement(modelElement);
				if (result == null) result = caseMarked(modelElement);
				if (result == null) result = caseAdaptable(modelElement);
				if (result == null) result = caseIMarked(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SKILL_DOMAIN_ELEMENT: {
				SkillDomainElement skillDomainElement = (SkillDomainElement)theEObject;
				T1 result = caseSkillDomainElement(skillDomainElement);
				if (result == null) result = caseModelElement(skillDomainElement);
				if (result == null) result = caseCapabilityDomainElement(skillDomainElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(skillDomainElement);
				if (result == null) result = caseDocumentedNamedElement(skillDomainElement);
				if (result == null) result = caseStringIdentity(skillDomainElement);
				if (result == null) result = caseNamedElement(skillDomainElement);
				if (result == null) result = caseDocumented(skillDomainElement);
				if (result == null) result = caseNcore_ModelElement(skillDomainElement);
				if (result == null) result = caseMarked(skillDomainElement);
				if (result == null) result = caseAdaptable(skillDomainElement);
				if (result == null) result = caseIMarked(skillDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SKILL_DOMAIN: {
				SkillDomain skillDomain = (SkillDomain)theEObject;
				T1 result = caseSkillDomain(skillDomain);
				if (result == null) result = caseSkillDomainElement(skillDomain);
				if (result == null) result = caseModelElement(skillDomain);
				if (result == null) result = caseCapabilityDomainElement(skillDomain);
				if (result == null) result = caseDocumentedNamedStringIdentity(skillDomain);
				if (result == null) result = caseDocumentedNamedElement(skillDomain);
				if (result == null) result = caseStringIdentity(skillDomain);
				if (result == null) result = caseNamedElement(skillDomain);
				if (result == null) result = caseDocumented(skillDomain);
				if (result == null) result = caseNcore_ModelElement(skillDomain);
				if (result == null) result = caseMarked(skillDomain);
				if (result == null) result = caseAdaptable(skillDomain);
				if (result == null) result = caseIMarked(skillDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SKILL: {
				Skill skill = (Skill)theEObject;
				T1 result = caseSkill(skill);
				if (result == null) result = caseSkillDomainElement(skill);
				if (result == null) result = caseModelElement(skill);
				if (result == null) result = caseCapabilityDomainElement(skill);
				if (result == null) result = caseDocumentedNamedStringIdentity(skill);
				if (result == null) result = caseDocumentedNamedElement(skill);
				if (result == null) result = caseStringIdentity(skill);
				if (result == null) result = caseNamedElement(skill);
				if (result == null) result = caseDocumented(skill);
				if (result == null) result = caseNcore_ModelElement(skill);
				if (result == null) result = caseMarked(skill);
				if (result == null) result = caseAdaptable(skill);
				if (result == null) result = caseIMarked(skill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.SKILL_CONSUMER: {
				SkillConsumer skillConsumer = (SkillConsumer)theEObject;
				T1 result = caseSkillConsumer(skillConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT_DOMAIN_ELEMENT: {
				ArtifactDomainElement artifactDomainElement = (ArtifactDomainElement)theEObject;
				T1 result = caseArtifactDomainElement(artifactDomainElement);
				if (result == null) result = caseModelElement(artifactDomainElement);
				if (result == null) result = caseSkillConsumer(artifactDomainElement);
				if (result == null) result = caseCapabilityDomainElement(artifactDomainElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(artifactDomainElement);
				if (result == null) result = caseDocumentedNamedElement(artifactDomainElement);
				if (result == null) result = caseStringIdentity(artifactDomainElement);
				if (result == null) result = caseNamedElement(artifactDomainElement);
				if (result == null) result = caseDocumented(artifactDomainElement);
				if (result == null) result = caseNcore_ModelElement(artifactDomainElement);
				if (result == null) result = caseMarked(artifactDomainElement);
				if (result == null) result = caseAdaptable(artifactDomainElement);
				if (result == null) result = caseIMarked(artifactDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT_DOMAIN: {
				ArtifactDomain artifactDomain = (ArtifactDomain)theEObject;
				T1 result = caseArtifactDomain(artifactDomain);
				if (result == null) result = caseArtifactDomainElement(artifactDomain);
				if (result == null) result = caseModelElement(artifactDomain);
				if (result == null) result = caseSkillConsumer(artifactDomain);
				if (result == null) result = caseCapabilityDomainElement(artifactDomain);
				if (result == null) result = caseDocumentedNamedStringIdentity(artifactDomain);
				if (result == null) result = caseDocumentedNamedElement(artifactDomain);
				if (result == null) result = caseStringIdentity(artifactDomain);
				if (result == null) result = caseNamedElement(artifactDomain);
				if (result == null) result = caseDocumented(artifactDomain);
				if (result == null) result = caseNcore_ModelElement(artifactDomain);
				if (result == null) result = caseMarked(artifactDomain);
				if (result == null) result = caseAdaptable(artifactDomain);
				if (result == null) result = caseIMarked(artifactDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T1 result = caseArtifact(artifact);
				if (result == null) result = caseArtifactDomainElement(artifact);
				if (result == null) result = caseCollaboratable(artifact);
				if (result == null) result = caseModelElement(artifact);
				if (result == null) result = caseSkillConsumer(artifact);
				if (result == null) result = caseCapabilityDomainElement(artifact);
				if (result == null) result = caseDocumentedNamedStringIdentity(artifact);
				if (result == null) result = caseDocumentedNamedElement(artifact);
				if (result == null) result = caseStringIdentity(artifact);
				if (result == null) result = caseNamedElement(artifact);
				if (result == null) result = caseDocumented(artifact);
				if (result == null) result = caseNcore_ModelElement(artifact);
				if (result == null) result = caseMarked(artifact);
				if (result == null) result = caseAdaptable(artifact);
				if (result == null) result = caseIMarked(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.COMPOSITE_ARTIFACT: {
				CompositeArtifact compositeArtifact = (CompositeArtifact)theEObject;
				T1 result = caseCompositeArtifact(compositeArtifact);
				if (result == null) result = caseArtifact(compositeArtifact);
				if (result == null) result = caseArtifactDomainElement(compositeArtifact);
				if (result == null) result = caseCollaboratable(compositeArtifact);
				if (result == null) result = caseModelElement(compositeArtifact);
				if (result == null) result = caseSkillConsumer(compositeArtifact);
				if (result == null) result = caseCapabilityDomainElement(compositeArtifact);
				if (result == null) result = caseDocumentedNamedStringIdentity(compositeArtifact);
				if (result == null) result = caseDocumentedNamedElement(compositeArtifact);
				if (result == null) result = caseStringIdentity(compositeArtifact);
				if (result == null) result = caseNamedElement(compositeArtifact);
				if (result == null) result = caseDocumented(compositeArtifact);
				if (result == null) result = caseNcore_ModelElement(compositeArtifact);
				if (result == null) result = caseMarked(compositeArtifact);
				if (result == null) result = caseAdaptable(compositeArtifact);
				if (result == null) result = caseIMarked(compositeArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ARTIFACT_INFO: {
				ArtifactInfo artifactInfo = (ArtifactInfo)theEObject;
				T1 result = caseArtifactInfo(artifactInfo);
				if (result == null) result = caseModelElement(artifactInfo);
				if (result == null) result = caseCapabilityDomainElement(artifactInfo);
				if (result == null) result = caseDocumentedNamedStringIdentity(artifactInfo);
				if (result == null) result = caseDocumentedNamedElement(artifactInfo);
				if (result == null) result = caseStringIdentity(artifactInfo);
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
				T1 result = caseConnection(connection);
				if (result == null) result = caseModelElement(connection);
				if (result == null) result = caseModel_Connection(connection);
				if (result == null) result = caseCapabilityDomainElement(connection);
				if (result == null) result = caseDocumentedNamedStringIdentity(connection);
				if (result == null) result = caseDocumentedNamedElement(connection);
				if (result == null) result = caseStringIdentity(connection);
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
				T1 result = caseArtifactProducer(artifactProducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PROCESS_ELEMENT: {
				ProcessElement processElement = (ProcessElement)theEObject;
				T1 result = caseProcessElement(processElement);
				if (result == null) result = caseModelElement(processElement);
				if (result == null) result = caseRequirementConsumer(processElement);
				if (result == null) result = caseGraphElement(processElement);
				if (result == null) result = caseCapabilityDomainElement(processElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(processElement);
				if (result == null) result = caseDocumentedNamedElement(processElement);
				if (result == null) result = caseStringIdentity(processElement);
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
				T1 result = caseSource(source);
				if (result == null) result = caseArtifactProducer(source);
				if (result == null) result = caseConnectionSource(source);
				if (result == null) result = caseGraphElement(source);
				if (result == null) result = caseStringIdentity(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.START: {
				Start start = (Start)theEObject;
				T1 result = caseStart(start);
				if (result == null) result = caseProcessElement(start);
				if (result == null) result = caseSource(start);
				if (result == null) result = caseModelElement(start);
				if (result == null) result = caseRequirementConsumer(start);
				if (result == null) result = caseArtifactProducer(start);
				if (result == null) result = caseConnectionSource(start);
				if (result == null) result = caseCapabilityDomainElement(start);
				if (result == null) result = caseGraphElement(start);
				if (result == null) result = caseDocumentedNamedStringIdentity(start);
				if (result == null) result = caseDocumentedNamedElement(start);
				if (result == null) result = caseStringIdentity(start);
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
				T1 result = caseInputPort(inputPort);
				if (result == null) result = caseModelElement(inputPort);
				if (result == null) result = caseSource(inputPort);
				if (result == null) result = caseCapabilityDomainElement(inputPort);
				if (result == null) result = caseArtifactProducer(inputPort);
				if (result == null) result = caseConnectionSource(inputPort);
				if (result == null) result = caseDocumentedNamedStringIdentity(inputPort);
				if (result == null) result = caseGraphElement(inputPort);
				if (result == null) result = caseDocumentedNamedElement(inputPort);
				if (result == null) result = caseStringIdentity(inputPort);
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
				T1 result = caseArtifactConsumer(artifactConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.TARGET: {
				Target target = (Target)theEObject;
				T1 result = caseTarget(target);
				if (result == null) result = caseArtifactConsumer(target);
				if (result == null) result = caseConnectionTarget(target);
				if (result == null) result = caseGraphElement(target);
				if (result == null) result = caseStringIdentity(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.END: {
				End end = (End)theEObject;
				T1 result = caseEnd(end);
				if (result == null) result = caseProcessElement(end);
				if (result == null) result = caseTarget(end);
				if (result == null) result = caseModelElement(end);
				if (result == null) result = caseRequirementConsumer(end);
				if (result == null) result = caseArtifactConsumer(end);
				if (result == null) result = caseConnectionTarget(end);
				if (result == null) result = caseCapabilityDomainElement(end);
				if (result == null) result = caseGraphElement(end);
				if (result == null) result = caseDocumentedNamedStringIdentity(end);
				if (result == null) result = caseDocumentedNamedElement(end);
				if (result == null) result = caseStringIdentity(end);
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
				T1 result = caseOutputPort(outputPort);
				if (result == null) result = caseModelElement(outputPort);
				if (result == null) result = caseTarget(outputPort);
				if (result == null) result = caseCapabilityDomainElement(outputPort);
				if (result == null) result = caseArtifactConsumer(outputPort);
				if (result == null) result = caseConnectionTarget(outputPort);
				if (result == null) result = caseDocumentedNamedStringIdentity(outputPort);
				if (result == null) result = caseGraphElement(outputPort);
				if (result == null) result = caseDocumentedNamedElement(outputPort);
				if (result == null) result = caseStringIdentity(outputPort);
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
				T1 result = caseArtifactProcessor(artifactProcessor);
				if (result == null) result = caseArtifactProducer(artifactProcessor);
				if (result == null) result = caseArtifactConsumer(artifactProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.COLLABORATABLE: {
				Collaboratable<?> collaboratable = (Collaboratable<?>)theEObject;
				T1 result = caseCollaboratable(collaboratable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ROLE: {
				Role role = (Role)theEObject;
				T1 result = caseRole(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseSkillConsumer(role);
				if (result == null) result = caseCapabilityDomainElement(role);
				if (result == null) result = caseDocumentedNamedStringIdentity(role);
				if (result == null) result = caseDocumentedNamedElement(role);
				if (result == null) result = caseStringIdentity(role);
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
				T1 result = caseArtifactProcessorRole(artifactProcessorRole);
				if (result == null) result = caseRole(artifactProcessorRole);
				if (result == null) result = caseArtifactProcessor(artifactProcessorRole);
				if (result == null) result = caseModelElement(artifactProcessorRole);
				if (result == null) result = caseSkillConsumer(artifactProcessorRole);
				if (result == null) result = caseArtifactProducer(artifactProcessorRole);
				if (result == null) result = caseArtifactConsumer(artifactProcessorRole);
				if (result == null) result = caseCapabilityDomainElement(artifactProcessorRole);
				if (result == null) result = caseDocumentedNamedStringIdentity(artifactProcessorRole);
				if (result == null) result = caseDocumentedNamedElement(artifactProcessorRole);
				if (result == null) result = caseStringIdentity(artifactProcessorRole);
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
				T1 result = caseNode(node);
				if (result == null) result = caseProcessElement(node);
				if (result == null) result = caseSource(node);
				if (result == null) result = caseTarget(node);
				if (result == null) result = caseArtifactProcessor(node);
				if (result == null) result = caseModelElement(node);
				if (result == null) result = caseRequirementConsumer(node);
				if (result == null) result = caseArtifactProducer(node);
				if (result == null) result = caseConnectionSource(node);
				if (result == null) result = caseArtifactConsumer(node);
				if (result == null) result = caseConnectionTarget(node);
				if (result == null) result = caseCapabilityDomainElement(node);
				if (result == null) result = caseGraphElement(node);
				if (result == null) result = caseDocumentedNamedStringIdentity(node);
				if (result == null) result = caseDocumentedNamedElement(node);
				if (result == null) result = caseStringIdentity(node);
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
				T1 result = caseGateway(gateway);
				if (result == null) result = caseNode(gateway);
				if (result == null) result = caseProcessElement(gateway);
				if (result == null) result = caseSource(gateway);
				if (result == null) result = caseTarget(gateway);
				if (result == null) result = caseArtifactProcessor(gateway);
				if (result == null) result = caseModelElement(gateway);
				if (result == null) result = caseRequirementConsumer(gateway);
				if (result == null) result = caseArtifactProducer(gateway);
				if (result == null) result = caseConnectionSource(gateway);
				if (result == null) result = caseArtifactConsumer(gateway);
				if (result == null) result = caseConnectionTarget(gateway);
				if (result == null) result = caseCapabilityDomainElement(gateway);
				if (result == null) result = caseGraphElement(gateway);
				if (result == null) result = caseDocumentedNamedStringIdentity(gateway);
				if (result == null) result = caseDocumentedNamedElement(gateway);
				if (result == null) result = caseStringIdentity(gateway);
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
				T1 result = caseService(service);
				if (result == null) result = caseNode(service);
				if (result == null) result = caseProcessElement(service);
				if (result == null) result = caseSource(service);
				if (result == null) result = caseTarget(service);
				if (result == null) result = caseArtifactProcessor(service);
				if (result == null) result = caseModelElement(service);
				if (result == null) result = caseRequirementConsumer(service);
				if (result == null) result = caseArtifactProducer(service);
				if (result == null) result = caseConnectionSource(service);
				if (result == null) result = caseArtifactConsumer(service);
				if (result == null) result = caseConnectionTarget(service);
				if (result == null) result = caseCapabilityDomainElement(service);
				if (result == null) result = caseGraphElement(service);
				if (result == null) result = caseDocumentedNamedStringIdentity(service);
				if (result == null) result = caseDocumentedNamedElement(service);
				if (result == null) result = caseStringIdentity(service);
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
				T1 result = caseTransition(transition);
				if (result == null) result = caseConnection(transition);
				if (result == null) result = caseModelElement(transition);
				if (result == null) result = caseModel_Connection(transition);
				if (result == null) result = caseCapabilityDomainElement(transition);
				if (result == null) result = caseDocumentedNamedStringIdentity(transition);
				if (result == null) result = caseDocumentedNamedElement(transition);
				if (result == null) result = caseStringIdentity(transition);
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
				T1 result = caseCall(call);
				if (result == null) result = caseTransition(call);
				if (result == null) result = caseConnection(call);
				if (result == null) result = caseModelElement(call);
				if (result == null) result = caseModel_Connection(call);
				if (result == null) result = caseCapabilityDomainElement(call);
				if (result == null) result = caseDocumentedNamedStringIdentity(call);
				if (result == null) result = caseDocumentedNamedElement(call);
				if (result == null) result = caseStringIdentity(call);
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
				T1 result = caseActivity(activity);
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
				if (result == null) result = caseConnectionSource(activity);
				if (result == null) result = caseArtifactConsumer(activity);
				if (result == null) result = caseConnectionTarget(activity);
				if (result == null) result = caseSkillConsumer(activity);
				if (result == null) result = caseCapabilityDomainElement(activity);
				if (result == null) result = caseGraphElement(activity);
				if (result == null) result = caseDocumentedNamedStringIdentity(activity);
				if (result == null) result = caseDocumentedNamedElement(activity);
				if (result == null) result = caseStringIdentity(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseDocumented(activity);
				if (result == null) result = caseNcore_ModelElement(activity);
				if (result == null) result = caseMarked(activity);
				if (result == null) result = caseAdaptable(activity);
				if (result == null) result = caseIMarked(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PROCESS_DOMAIN_ELEMENT: {
				ProcessDomainElement processDomainElement = (ProcessDomainElement)theEObject;
				T1 result = caseProcessDomainElement(processDomainElement);
				if (result == null) result = caseModelElement(processDomainElement);
				if (result == null) result = caseCapabilityDomainElement(processDomainElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(processDomainElement);
				if (result == null) result = caseDocumentedNamedElement(processDomainElement);
				if (result == null) result = caseStringIdentity(processDomainElement);
				if (result == null) result = caseNamedElement(processDomainElement);
				if (result == null) result = caseDocumented(processDomainElement);
				if (result == null) result = caseNcore_ModelElement(processDomainElement);
				if (result == null) result = caseMarked(processDomainElement);
				if (result == null) result = caseAdaptable(processDomainElement);
				if (result == null) result = caseIMarked(processDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PROCESS_DOMAIN: {
				ProcessDomain processDomain = (ProcessDomain)theEObject;
				T1 result = caseProcessDomain(processDomain);
				if (result == null) result = caseProcessDomainElement(processDomain);
				if (result == null) result = caseModelElement(processDomain);
				if (result == null) result = caseCapabilityDomainElement(processDomain);
				if (result == null) result = caseDocumentedNamedStringIdentity(processDomain);
				if (result == null) result = caseDocumentedNamedElement(processDomain);
				if (result == null) result = caseStringIdentity(processDomain);
				if (result == null) result = caseNamedElement(processDomain);
				if (result == null) result = caseDocumented(processDomain);
				if (result == null) result = caseNcore_ModelElement(processDomain);
				if (result == null) result = caseMarked(processDomain);
				if (result == null) result = caseAdaptable(processDomain);
				if (result == null) result = caseIMarked(processDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PROCESS: {
				org.nasdanika.models.flow.Process process = (org.nasdanika.models.flow.Process)theEObject;
				T1 result = caseProcess(process);
				if (result == null) result = caseActivity(process);
				if (result == null) result = caseProcessDomainElement(process);
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
				if (result == null) result = caseConnectionSource(process);
				if (result == null) result = caseArtifactConsumer(process);
				if (result == null) result = caseConnectionTarget(process);
				if (result == null) result = caseSkillConsumer(process);
				if (result == null) result = caseCapabilityDomainElement(process);
				if (result == null) result = caseGraphElement(process);
				if (result == null) result = caseDocumentedNamedStringIdentity(process);
				if (result == null) result = caseDocumentedNamedElement(process);
				if (result == null) result = caseStringIdentity(process);
				if (result == null) result = caseNamedElement(process);
				if (result == null) result = caseDocumented(process);
				if (result == null) result = caseNcore_ModelElement(process);
				if (result == null) result = caseMarked(process);
				if (result == null) result = caseAdaptable(process);
				if (result == null) result = caseIMarked(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.RESOURCE_DOMAIN_ELEMENT: {
				ResourceDomainElement resourceDomainElement = (ResourceDomainElement)theEObject;
				T1 result = caseResourceDomainElement(resourceDomainElement);
				if (result == null) result = caseModelElement(resourceDomainElement);
				if (result == null) result = caseSkillConsumer(resourceDomainElement);
				if (result == null) result = caseCapabilityDomainElement(resourceDomainElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(resourceDomainElement);
				if (result == null) result = caseDocumentedNamedElement(resourceDomainElement);
				if (result == null) result = caseStringIdentity(resourceDomainElement);
				if (result == null) result = caseNamedElement(resourceDomainElement);
				if (result == null) result = caseDocumented(resourceDomainElement);
				if (result == null) result = caseNcore_ModelElement(resourceDomainElement);
				if (result == null) result = caseMarked(resourceDomainElement);
				if (result == null) result = caseAdaptable(resourceDomainElement);
				if (result == null) result = caseIMarked(resourceDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.RESOURCE_DOMAIN: {
				ResourceDomain resourceDomain = (ResourceDomain)theEObject;
				T1 result = caseResourceDomain(resourceDomain);
				if (result == null) result = caseResourceDomainElement(resourceDomain);
				if (result == null) result = caseModelElement(resourceDomain);
				if (result == null) result = caseSkillConsumer(resourceDomain);
				if (result == null) result = caseCapabilityDomainElement(resourceDomain);
				if (result == null) result = caseDocumentedNamedStringIdentity(resourceDomain);
				if (result == null) result = caseDocumentedNamedElement(resourceDomain);
				if (result == null) result = caseStringIdentity(resourceDomain);
				if (result == null) result = caseNamedElement(resourceDomain);
				if (result == null) result = caseDocumented(resourceDomain);
				if (result == null) result = caseNcore_ModelElement(resourceDomain);
				if (result == null) result = caseMarked(resourceDomain);
				if (result == null) result = caseAdaptable(resourceDomain);
				if (result == null) result = caseIMarked(resourceDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T1 result = caseResource(resource);
				if (result == null) result = caseResourceDomainElement(resource);
				if (result == null) result = caseModelElement(resource);
				if (result == null) result = caseSkillConsumer(resource);
				if (result == null) result = caseCapabilityDomainElement(resource);
				if (result == null) result = caseDocumentedNamedStringIdentity(resource);
				if (result == null) result = caseDocumentedNamedElement(resource);
				if (result == null) result = caseStringIdentity(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = caseDocumented(resource);
				if (result == null) result = caseNcore_ModelElement(resource);
				if (result == null) result = caseMarked(resource);
				if (result == null) result = caseAdaptable(resource);
				if (result == null) result = caseIMarked(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.COMPOSITE_RESOURCE: {
				CompositeResource compositeResource = (CompositeResource)theEObject;
				T1 result = caseCompositeResource(compositeResource);
				if (result == null) result = caseResource(compositeResource);
				if (result == null) result = caseResourceDomainElement(compositeResource);
				if (result == null) result = caseModelElement(compositeResource);
				if (result == null) result = caseSkillConsumer(compositeResource);
				if (result == null) result = caseCapabilityDomainElement(compositeResource);
				if (result == null) result = caseDocumentedNamedStringIdentity(compositeResource);
				if (result == null) result = caseDocumentedNamedElement(compositeResource);
				if (result == null) result = caseStringIdentity(compositeResource);
				if (result == null) result = caseNamedElement(compositeResource);
				if (result == null) result = caseDocumented(compositeResource);
				if (result == null) result = caseNcore_ModelElement(compositeResource);
				if (result == null) result = caseMarked(compositeResource);
				if (result == null) result = caseAdaptable(compositeResource);
				if (result == null) result = caseIMarked(compositeResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PARTICIPANT_DOMAIN_ELEMENT: {
				ParticipantDomainElement participantDomainElement = (ParticipantDomainElement)theEObject;
				T1 result = caseParticipantDomainElement(participantDomainElement);
				if (result == null) result = caseModelElement(participantDomainElement);
				if (result == null) result = caseSkillConsumer(participantDomainElement);
				if (result == null) result = caseCapabilityDomainElement(participantDomainElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(participantDomainElement);
				if (result == null) result = caseDocumentedNamedElement(participantDomainElement);
				if (result == null) result = caseStringIdentity(participantDomainElement);
				if (result == null) result = caseNamedElement(participantDomainElement);
				if (result == null) result = caseDocumented(participantDomainElement);
				if (result == null) result = caseNcore_ModelElement(participantDomainElement);
				if (result == null) result = caseMarked(participantDomainElement);
				if (result == null) result = caseAdaptable(participantDomainElement);
				if (result == null) result = caseIMarked(participantDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PARTICIPANT_DOMAIN: {
				ParticipantDomain participantDomain = (ParticipantDomain)theEObject;
				T1 result = caseParticipantDomain(participantDomain);
				if (result == null) result = caseParticipantDomainElement(participantDomain);
				if (result == null) result = caseModelElement(participantDomain);
				if (result == null) result = caseSkillConsumer(participantDomain);
				if (result == null) result = caseCapabilityDomainElement(participantDomain);
				if (result == null) result = caseDocumentedNamedStringIdentity(participantDomain);
				if (result == null) result = caseDocumentedNamedElement(participantDomain);
				if (result == null) result = caseStringIdentity(participantDomain);
				if (result == null) result = caseNamedElement(participantDomain);
				if (result == null) result = caseDocumented(participantDomain);
				if (result == null) result = caseNcore_ModelElement(participantDomain);
				if (result == null) result = caseMarked(participantDomain);
				if (result == null) result = caseAdaptable(participantDomain);
				if (result == null) result = caseIMarked(participantDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PARTICIPANT: {
				Participant participant = (Participant)theEObject;
				T1 result = caseParticipant(participant);
				if (result == null) result = caseParticipantDomainElement(participant);
				if (result == null) result = caseModelElement(participant);
				if (result == null) result = caseSkillConsumer(participant);
				if (result == null) result = caseCapabilityDomainElement(participant);
				if (result == null) result = caseDocumentedNamedStringIdentity(participant);
				if (result == null) result = caseDocumentedNamedElement(participant);
				if (result == null) result = caseStringIdentity(participant);
				if (result == null) result = caseNamedElement(participant);
				if (result == null) result = caseDocumented(participant);
				if (result == null) result = caseNcore_ModelElement(participant);
				if (result == null) result = caseMarked(participant);
				if (result == null) result = caseAdaptable(participant);
				if (result == null) result = caseIMarked(participant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_TYPE_DOMAIN_ELEMENT: {
				DataTypeDomainElement dataTypeDomainElement = (DataTypeDomainElement)theEObject;
				T1 result = caseDataTypeDomainElement(dataTypeDomainElement);
				if (result == null) result = caseModelElement(dataTypeDomainElement);
				if (result == null) result = caseCapabilityDomainElement(dataTypeDomainElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(dataTypeDomainElement);
				if (result == null) result = caseDocumentedNamedElement(dataTypeDomainElement);
				if (result == null) result = caseStringIdentity(dataTypeDomainElement);
				if (result == null) result = caseNamedElement(dataTypeDomainElement);
				if (result == null) result = caseDocumented(dataTypeDomainElement);
				if (result == null) result = caseNcore_ModelElement(dataTypeDomainElement);
				if (result == null) result = caseMarked(dataTypeDomainElement);
				if (result == null) result = caseAdaptable(dataTypeDomainElement);
				if (result == null) result = caseIMarked(dataTypeDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_TYPE_DOMAIN: {
				DataTypeDomain dataTypeDomain = (DataTypeDomain)theEObject;
				T1 result = caseDataTypeDomain(dataTypeDomain);
				if (result == null) result = caseDataTypeDomainElement(dataTypeDomain);
				if (result == null) result = caseModelElement(dataTypeDomain);
				if (result == null) result = caseCapabilityDomainElement(dataTypeDomain);
				if (result == null) result = caseDocumentedNamedStringIdentity(dataTypeDomain);
				if (result == null) result = caseDocumentedNamedElement(dataTypeDomain);
				if (result == null) result = caseStringIdentity(dataTypeDomain);
				if (result == null) result = caseNamedElement(dataTypeDomain);
				if (result == null) result = caseDocumented(dataTypeDomain);
				if (result == null) result = caseNcore_ModelElement(dataTypeDomain);
				if (result == null) result = caseMarked(dataTypeDomain);
				if (result == null) result = caseAdaptable(dataTypeDomain);
				if (result == null) result = caseIMarked(dataTypeDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T1 result = caseDataType(dataType);
				if (result == null) result = caseDataTypeDomainElement(dataType);
				if (result == null) result = caseCollaboratable(dataType);
				if (result == null) result = caseModelElement(dataType);
				if (result == null) result = caseCapabilityDomainElement(dataType);
				if (result == null) result = caseDocumentedNamedStringIdentity(dataType);
				if (result == null) result = caseDocumentedNamedElement(dataType);
				if (result == null) result = caseStringIdentity(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseDocumented(dataType);
				if (result == null) result = caseNcore_ModelElement(dataType);
				if (result == null) result = caseMarked(dataType);
				if (result == null) result = caseAdaptable(dataType);
				if (result == null) result = caseIMarked(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.ECORE_DATA_TYPE: {
				EcoreDataType ecoreDataType = (EcoreDataType)theEObject;
				T1 result = caseEcoreDataType(ecoreDataType);
				if (result == null) result = caseDataType(ecoreDataType);
				if (result == null) result = caseDataTypeDomainElement(ecoreDataType);
				if (result == null) result = caseCollaboratable(ecoreDataType);
				if (result == null) result = caseModelElement(ecoreDataType);
				if (result == null) result = caseCapabilityDomainElement(ecoreDataType);
				if (result == null) result = caseDocumentedNamedStringIdentity(ecoreDataType);
				if (result == null) result = caseDocumentedNamedElement(ecoreDataType);
				if (result == null) result = caseStringIdentity(ecoreDataType);
				if (result == null) result = caseNamedElement(ecoreDataType);
				if (result == null) result = caseDocumented(ecoreDataType);
				if (result == null) result = caseNcore_ModelElement(ecoreDataType);
				if (result == null) result = caseMarked(ecoreDataType);
				if (result == null) result = caseAdaptable(ecoreDataType);
				if (result == null) result = caseIMarked(ecoreDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_DOMAIN_ELEMENT: {
				DataDomainElement dataDomainElement = (DataDomainElement)theEObject;
				T1 result = caseDataDomainElement(dataDomainElement);
				if (result == null) result = caseModelElement(dataDomainElement);
				if (result == null) result = caseCapabilityDomainElement(dataDomainElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(dataDomainElement);
				if (result == null) result = caseDocumentedNamedElement(dataDomainElement);
				if (result == null) result = caseStringIdentity(dataDomainElement);
				if (result == null) result = caseNamedElement(dataDomainElement);
				if (result == null) result = caseDocumented(dataDomainElement);
				if (result == null) result = caseNcore_ModelElement(dataDomainElement);
				if (result == null) result = caseMarked(dataDomainElement);
				if (result == null) result = caseAdaptable(dataDomainElement);
				if (result == null) result = caseIMarked(dataDomainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_DOMAIN: {
				DataDomain dataDomain = (DataDomain)theEObject;
				T1 result = caseDataDomain(dataDomain);
				if (result == null) result = caseDataDomainElement(dataDomain);
				if (result == null) result = caseModelElement(dataDomain);
				if (result == null) result = caseCapabilityDomainElement(dataDomain);
				if (result == null) result = caseDocumentedNamedStringIdentity(dataDomain);
				if (result == null) result = caseDocumentedNamedElement(dataDomain);
				if (result == null) result = caseStringIdentity(dataDomain);
				if (result == null) result = caseNamedElement(dataDomain);
				if (result == null) result = caseDocumented(dataDomain);
				if (result == null) result = caseNcore_ModelElement(dataDomain);
				if (result == null) result = caseMarked(dataDomain);
				if (result == null) result = caseAdaptable(dataDomain);
				if (result == null) result = caseIMarked(dataDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T1 result = caseDataElement(dataElement);
				if (result == null) result = caseDataDomainElement(dataElement);
				if (result == null) result = caseCollaboratable(dataElement);
				if (result == null) result = caseModelElement(dataElement);
				if (result == null) result = caseCapabilityDomainElement(dataElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(dataElement);
				if (result == null) result = caseDocumentedNamedElement(dataElement);
				if (result == null) result = caseStringIdentity(dataElement);
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
				T1 result = caseComplexDataElement(complexDataElement);
				if (result == null) result = caseDataElement(complexDataElement);
				if (result == null) result = caseDataType(complexDataElement);
				if (result == null) result = caseDataDomainElement(complexDataElement);
				if (result == null) result = caseCollaboratable(complexDataElement);
				if (result == null) result = caseDataTypeDomainElement(complexDataElement);
				if (result == null) result = caseModelElement(complexDataElement);
				if (result == null) result = caseCapabilityDomainElement(complexDataElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(complexDataElement);
				if (result == null) result = caseDocumentedNamedElement(complexDataElement);
				if (result == null) result = caseStringIdentity(complexDataElement);
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
				T1 result = caseSimpleDataElement(simpleDataElement);
				if (result == null) result = caseDataElement(simpleDataElement);
				if (result == null) result = caseDataDomainElement(simpleDataElement);
				if (result == null) result = caseCollaboratable(simpleDataElement);
				if (result == null) result = caseModelElement(simpleDataElement);
				if (result == null) result = caseCapabilityDomainElement(simpleDataElement);
				if (result == null) result = caseDocumentedNamedStringIdentity(simpleDataElement);
				if (result == null) result = caseDocumentedNamedElement(simpleDataElement);
				if (result == null) result = caseStringIdentity(simpleDataElement);
				if (result == null) result = caseNamedElement(simpleDataElement);
				if (result == null) result = caseDocumented(simpleDataElement);
				if (result == null) result = caseNcore_ModelElement(simpleDataElement);
				if (result == null) result = caseMarked(simpleDataElement);
				if (result == null) result = caseAdaptable(simpleDataElement);
				if (result == null) result = caseIMarked(simpleDataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlowPackage.PACKAGE: {
				org.nasdanika.models.flow.Package package_ = (org.nasdanika.models.flow.Package)theEObject;
				T1 result = casePackage(package_);
				if (result == null) result = caseParticipantDomain(package_);
				if (result == null) result = caseArtifactDomain(package_);
				if (result == null) result = caseResourceDomain(package_);
				if (result == null) result = caseProcessDomain(package_);
				if (result == null) result = caseDataTypeDomain(package_);
				if (result == null) result = caseDataDomain(package_);
				if (result == null) result = caseCapabilityDomain(package_);
				if (result == null) result = caseSkillDomain(package_);
				if (result == null) result = caseCapabilityDomainElement(package_);
				if (result == null) result = caseParticipantDomainElement(package_);
				if (result == null) result = caseArtifactDomainElement(package_);
				if (result == null) result = caseResourceDomainElement(package_);
				if (result == null) result = caseProcessDomainElement(package_);
				if (result == null) result = caseDataTypeDomainElement(package_);
				if (result == null) result = caseDataDomainElement(package_);
				if (result == null) result = caseSkillDomainElement(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = caseDocumentedNamedStringIdentity(package_);
				if (result == null) result = caseSkillConsumer(package_);
				if (result == null) result = caseDocumentedNamedElement(package_);
				if (result == null) result = caseStringIdentity(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = caseDocumented(package_);
				if (result == null) result = caseNcore_ModelElement(package_);
				if (result == null) result = caseMarked(package_);
				if (result == null) result = caseAdaptable(package_);
				if (result == null) result = caseIMarked(package_);
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
	public T1 caseModelElement(org.nasdanika.models.flow.ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSkillDomainElement(SkillDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSkillDomain(SkillDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSkill(Skill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSkillConsumer(SkillConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArtifactDomainElement(ArtifactDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArtifactDomain(ArtifactDomain object) {
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
	public T1 caseConnection(Connection object) {
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
	public T1 caseArtifactProducer(ArtifactProducer object) {
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
	public T1 caseProcessElement(ProcessElement object) {
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
	public T1 caseSource(Source object) {
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
	public T1 caseStart(Start object) {
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
	public T1 caseInputPort(InputPort object) {
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
	public T1 caseArtifactConsumer(ArtifactConsumer object) {
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
	public T1 caseTarget(Target object) {
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
	public T1 caseEnd(End object) {
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
	public T1 caseOutputPort(OutputPort object) {
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
	public T1 caseArtifactProcessor(ArtifactProcessor object) {
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
	public <R extends Role> T1 caseCollaboratable(Collaboratable<R> object) {
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
	public T1 caseNode(Node object) {
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
	public T1 caseGateway(Gateway object) {
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
	public T1 caseService(Service object) {
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
	public T1 caseTransition(Transition object) {
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
	public T1 caseCall(Call object) {
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
	public T1 caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessDomainElement(ProcessDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProcessDomain(ProcessDomain object) {
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
	public T1 caseProcess(org.nasdanika.models.flow.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceDomainElement(ResourceDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResourceDomain(ResourceDomain object) {
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
	public T1 casePackage(org.nasdanika.models.flow.Package object) {
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
	public T1 caseDataType(DataType object) {
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
	public T1 caseDataElement(DataElement object) {
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
	public T1 caseComplexDataElement(ComplexDataElement object) {
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
	public T1 caseSimpleDataElement(SimpleDataElement object) {
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
	public T1 caseEcoreDataType(EcoreDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataDomainElement(DataDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataDomain(DataDomain object) {
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
	public T1 caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeArtifact(CompositeArtifact object) {
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
	public T1 caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCompositeResource(CompositeResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParticipantDomainElement(ParticipantDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParticipantDomain(ParticipantDomain object) {
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
	public T1 caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataTypeDomainElement(DataTypeDomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataTypeDomain(DataTypeDomain object) {
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
	public T1 caseRole(Role object) {
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
	public T1 caseArtifactProcessorRole(ArtifactProcessorRole object) {
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
	public T1 caseArtifactInfo(ArtifactInfo object) {
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
	public T1 caseIMarked(Marked object) {
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
	public T1 caseMarked(org.nasdanika.ncore.Marked object) {
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
	public T1 caseAdaptable(Adaptable object) {
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
	public T1 caseNcore_ModelElement(ModelElement object) {
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
	public T1 caseNamedElement(NamedElement object) {
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
	public T1 caseDocumented(Documented object) {
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
	public T1 caseDocumentedNamedElement(DocumentedNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Named String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumentedNamedStringIdentity(DocumentedNamedStringIdentity object) {
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
	public T1 caseRequirementConsumer(RequirementConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphElement(GraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends org.nasdanika.graph.model.Connection<?>> T1 caseConnectionSource(ConnectionSource<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends org.nasdanika.graph.model.Connection<?>> T1 caseConnectionTarget(ConnectionTarget<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCapabilityDomainElement(CapabilityDomainElement object) {
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
	public <T extends ConnectionTarget<?>> T1 caseModel_Connection(org.nasdanika.graph.model.Connection<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCapabilityDomain(CapabilityDomain object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //FlowSwitch
