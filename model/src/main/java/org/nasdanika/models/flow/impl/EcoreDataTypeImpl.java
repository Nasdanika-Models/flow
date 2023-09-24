/**
 */
package org.nasdanika.models.flow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.nasdanika.models.flow.EcoreDataType;
import org.nasdanika.models.flow.FlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.EcoreDataTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcoreDataTypeImpl extends DataTypeImpl implements EcoreDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcoreDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.ECORE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getType() {
		return (EClassifier)eDynamicGet(FlowPackage.ECORE_DATA_TYPE__TYPE, FlowPackage.Literals.ECORE_DATA_TYPE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetType() {
		return (EClassifier)eDynamicGet(FlowPackage.ECORE_DATA_TYPE__TYPE, FlowPackage.Literals.ECORE_DATA_TYPE__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(EClassifier newType) {
		eDynamicSet(FlowPackage.ECORE_DATA_TYPE__TYPE, FlowPackage.Literals.ECORE_DATA_TYPE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.ECORE_DATA_TYPE__TYPE:
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
			case FlowPackage.ECORE_DATA_TYPE__TYPE:
				setType((EClassifier)newValue);
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
			case FlowPackage.ECORE_DATA_TYPE__TYPE:
				setType((EClassifier)null);
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
			case FlowPackage.ECORE_DATA_TYPE__TYPE:
				return basicGetType() != null;
		}
		return super.eIsSet(featureID);
	}

} //EcoreDataTypeImpl
