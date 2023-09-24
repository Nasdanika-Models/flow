/**
 */
package org.nasdanika.models.flow.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.SimpleDataElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.SimpleDataElementImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleDataElementImpl extends DataElementImpl implements SimpleDataElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleDataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.SIMPLE_DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getType() {
		return (DataType)eDynamicGet(FlowPackage.SIMPLE_DATA_ELEMENT__TYPE, FlowPackage.Literals.SIMPLE_DATA_ELEMENT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return (DataType)eDynamicGet(FlowPackage.SIMPLE_DATA_ELEMENT__TYPE, FlowPackage.Literals.SIMPLE_DATA_ELEMENT__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DataType newType) {
		eDynamicSet(FlowPackage.SIMPLE_DATA_ELEMENT__TYPE, FlowPackage.Literals.SIMPLE_DATA_ELEMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.SIMPLE_DATA_ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.SIMPLE_DATA_ELEMENT__TYPE:
				setType((DataType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FlowPackage.SIMPLE_DATA_ELEMENT__TYPE:
				setType((DataType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FlowPackage.SIMPLE_DATA_ELEMENT__TYPE:
				return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleDataElementImpl
