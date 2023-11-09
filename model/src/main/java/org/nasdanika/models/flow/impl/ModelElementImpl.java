/**
 */
package org.nasdanika.models.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.capability.impl.CapabilityDomainElementImpl;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ModelElementImpl extends CapabilityDomainElementImpl implements ModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.MODEL_ELEMENT;
	}

} //ModelElementImpl
