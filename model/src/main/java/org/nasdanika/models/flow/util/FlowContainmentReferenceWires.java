package org.nasdanika.models.flow.util;

import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ReflectiveContentMapper.ReferenceWire;
import org.nasdanika.models.capability.CapabilityDomain;
import org.nasdanika.models.capability.CapabilityDomainElement;
import org.nasdanika.models.capability.CapabilityPackage;
import org.nasdanika.models.flow.ArtifactDomain;
import org.nasdanika.models.flow.ArtifactDomainElement;
import org.nasdanika.models.flow.DataDomain;
import org.nasdanika.models.flow.DataDomainElement;
import org.nasdanika.models.flow.DataTypeDomain;
import org.nasdanika.models.flow.DataTypeDomainElement;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Package;
import org.nasdanika.models.flow.ParticipantDomain;
import org.nasdanika.models.flow.ParticipantDomainElement;
import org.nasdanika.models.flow.ProcessDomain;
import org.nasdanika.models.flow.ProcessDomainElement;
import org.nasdanika.models.flow.ResourceDomain;
import org.nasdanika.models.flow.ResourceDomainElement;

/**
 * Methods for wiring containment references
 */
public class FlowContainmentReferenceWires {
	
	/**
	 * References (ref-id) or definitions of data elements can be put inside of the artifact container 
	 */
//	@ReferenceWire(FlowPackage.ARTIFACT__DATA_ELEMENTS)
	// TODO
	
//	@ReferenceWire(FlowPackage.ARTIFACT__INFOS) - Not applicable
	
	/**
	 * Participants using this artifact. Check for duplicates - if the opposite already defined an association
	 */
//	@ReferenceWire(FlowPackage.ARTIFACT__PARTICIPANTS)
	
	/**
	 * Resources 
	 */	
//	@ReferenceWire(FlowPackage.ARTIFACT__RESOURCES)
//	@ReferenceWire(FlowPackage.ARTIFACT_CONSUMER__INPUTS)	

	@ReferenceWire(FlowPackage.ARTIFACT_DOMAIN__ARTIFACTS)
	public boolean wireArtifactDomainElements(
			EObject source,
			ArtifactDomain artifactDomain,
			EReference eReference,
			ArtifactDomainElement artifactDomainElement,
			LinkedList<EObject> sourcePath,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		EObject artifactDomainElementContainer = artifactDomainElement.eContainer();
		if (artifactDomainElementContainer == null || EcoreUtil.isAncestor(artifactDomainElementContainer, artifactDomain)) {
			artifactDomain.getArtifacts().add(artifactDomainElement);
		}
		
		return true;
	}
	
//	@ReferenceWire(FlowPackage.ARTIFACT_INFO__ARTIFACT)
//	@ReferenceWire(FlowPackage.ARTIFACT_INFO__PARTICIPANTS)
//	@ReferenceWire(FlowPackage.ARTIFACT_INFO__RESOURCES)
//	@ReferenceWire(FlowPackage.ARTIFACT_PRODUCER__OUTPUTS)
//	@ReferenceWire(FlowPackage.CALL__RESPONSE)
//	@ReferenceWire(FlowPackage.COLLABORATABLE__ROLES)
//	@ReferenceWire(FlowPackage.COMPLEX_DATA_ELEMENT__FEATURES)
//	@ReferenceWire(FlowPackage.COMPOSITE_ARTIFACT__CHILDREN)
//	@ReferenceWire(FlowPackage.COMPOSITE_RESOURCE__CHILDREN)
//	@ReferenceWire(FlowPackage.CONNECTION__TARGET)
	
	// Data domain
	@ReferenceWire(FlowPackage.DATA_DOMAIN__DATA_ELEMENTS)
	public boolean wireDataDomainElements(
			EObject source,
			DataDomain dataDomain,
			EReference eReference,
			DataDomainElement dataDomainElement,
			LinkedList<EObject> sourcePath,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		EObject dataDomainElementContainer = dataDomainElement.eContainer();
		if (dataDomainElementContainer == null || EcoreUtil.isAncestor(dataDomainElementContainer, dataDomain)) {
			dataDomain.getDataElements().add(dataDomainElement);
		}
		
		return true;
	}

//	@ReferenceWire(FlowPackage.DATA_ELEMENT__ARTIFACTS)
//	@ReferenceWire(FlowPackage.DATA_TYPE__BASE)
//	@ReferenceWire(FlowPackage.DATA_TYPE__EXTENSIONS)

	// Data type domain
	@ReferenceWire(FlowPackage.DATA_TYPE_DOMAIN__DATA_TYPES)
	public boolean wireDataTypeDomainElements(
			EObject source,
			DataTypeDomain dataTypeDomain,
			EReference eReference,
			DataTypeDomainElement dataTypeDomainElement,
			LinkedList<EObject> sourcePath,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		EObject dataTypeDomainElementContainer = dataTypeDomainElement.eContainer();
		if (dataTypeDomainElementContainer == null || EcoreUtil.isAncestor(dataTypeDomainElementContainer, dataTypeDomain)) {
			dataTypeDomain.getDataTypes().add(dataTypeDomainElement);
		}
		
		return true;
	}
	
//	@ReferenceWire(FlowPackage.ECORE_DATA_TYPE__TYPE)
//	@ReferenceWire(FlowPackage.NODE__INPUT_PORTS)
//	@ReferenceWire(FlowPackage.NODE__OUTPUT_PORTS)
	
	
	// Sub-packages
	@ReferenceWire(FlowPackage.PACKAGE__SUB_PACKAGES)
	public boolean wireSubPackages(
			EObject source,
			Package pkg,
			EReference eReference,
			Package subPackage,
			LinkedList<EObject> sourcePath,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		EObject subPackageContainer = subPackage.eContainer();
		if (subPackageContainer == null || EcoreUtil.isAncestor(subPackageContainer, pkg)) {
			pkg.getSubPackages().add(subPackage);
		}
		
		return true;
	}
	
//	@ReferenceWire(FlowPackage.PARTICIPANT : EClass
//	@ReferenceWire(FlowPackage.PARTICIPANT__ARTIFACTS)
//	@ReferenceWire(FlowPackage.PARTICIPANT__INFOS)
//	@ReferenceWire(FlowPackage.PARTICIPANT__RESOURCES)
//	@ReferenceWire(FlowPackage.PARTICIPANT__ROLES)

	// Participant domain
	@ReferenceWire(FlowPackage.PARTICIPANT_DOMAIN__PARTICIPANTS)
	public boolean wireParticipantDomainElements(
			EObject source,
			ParticipantDomain participantDomain,
			EReference eReference,
			ParticipantDomainElement participantDomainElement,
			LinkedList<EObject> sourcePath,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		EObject participantDomainElementContainer = participantDomainElement.eContainer();
		if (participantDomainElementContainer == null || EcoreUtil.isAncestor(participantDomainElementContainer, participantDomain)) {
			participantDomain.getParticipants().add(participantDomainElement);
		}
		
		return true;
	}
	
//	@ReferenceWire(FlowPackage.PROCESS__ELEMENTS)
//	@ReferenceWire(FlowPackage.PROCESS__SERVICES)

	// Process domain
	@ReferenceWire(FlowPackage.PROCESS_DOMAIN__PROCESSES)
	public boolean wireProcessDomainElements(
			EObject source,
			ProcessDomain processDomain,
			EReference eReference,
			ProcessDomainElement processDomainElement,
			LinkedList<EObject> sourcePath,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		EObject processDomainElementContainer = processDomainElement.eContainer();
		if (processDomainElementContainer == null || EcoreUtil.isAncestor(processDomainElementContainer, processDomain)) {
			processDomain.getProcesses().add(processDomainElement);
		}
		
		return true;
	}
	
//	@ReferenceWire(FlowPackage.RESOURCE__ARTIFACTS)
//	@ReferenceWire(FlowPackage.RESOURCE__INFOS)
//	@ReferenceWire(FlowPackage.RESOURCE__PARTICIPANTS)
//	@ReferenceWire(FlowPackage.RESOURCE__ROLES)
//	@ReferenceWire(FlowPackage.RESOURCE_DOMAIN : EClass

	// Resource domain
	@ReferenceWire(FlowPackage.RESOURCE_DOMAIN__RESOURCES)
	public boolean wireResourceDomainElements(
			EObject source,
			ResourceDomain resourceDomain,
			EReference eReference,
			ResourceDomainElement resourceDomainElement,
			LinkedList<EObject> sourcePath,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		EObject resourceDomainElementContainer = resourceDomainElement.eContainer();
		if (resourceDomainElementContainer == null || EcoreUtil.isAncestor(resourceDomainElementContainer, resourceDomain)) {
			resourceDomain.getResources().add(resourceDomainElement);
		}
		
		return true;
	}
	
//	@ReferenceWire(FlowPackage.ROLE__PARTICIPANTS)
//	@ReferenceWire(FlowPackage.ROLE__RESOURCES)
//	@ReferenceWire(FlowPackage.SERVICE__PROCESS)
//	@ReferenceWire(FlowPackage.SIMPLE_DATA_ELEMENT__TYPE)
//	@ReferenceWire(FlowPackage.SOURCE__OUTGOING_CONNECTIONS)
//	@ReferenceWire(FlowPackage.TARGET__INCOMING_CONNECTIONS)
//	@ReferenceWire(FlowPackage.TRANSITION__PAYLOAD)

	// Capability domain
	@ReferenceWire(CapabilityPackage.CAPABILITY_DOMAIN__CAPABILITIES)
	public boolean wireCapabilityDomainElements(
			EObject source,
			CapabilityDomain capabilityDomain,
			EReference eReference,
			CapabilityDomainElement capabilityDomainElement,
			LinkedList<EObject> sourcePath,
			Map<EObject, EObject> registry,
			ProgressMonitor progressMonitor) {
		
		EObject capabilityDomainElementContainer = capabilityDomainElement.eContainer();
		if (capabilityDomainElementContainer == null || EcoreUtil.isAncestor(capabilityDomainElementContainer, capabilityDomain)) {
			capabilityDomain.getCapabilities().add(capabilityDomainElement);
		}
		
		return true;
	}
	
	// TODO - skill, skill consumer, participant & role skills, resource areas
		
}
