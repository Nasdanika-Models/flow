/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.flow.ComplexDataElement;
import org.nasdanika.models.flow.DataElement;
import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.FlowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.ComplexDataElementImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ComplexDataElementImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ComplexDataElementImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexDataElementImpl extends DataElementImpl implements ComplexDataElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexDataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.COMPLEX_DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getBase() {
		return (DataType)eDynamicGet(FlowPackage.COMPLEX_DATA_ELEMENT__BASE, FlowPackage.Literals.DATA_TYPE__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBase() {
		return (DataType)eDynamicGet(FlowPackage.COMPLEX_DATA_ELEMENT__BASE, FlowPackage.Literals.DATA_TYPE__BASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(DataType newBase, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBase, FlowPackage.COMPLEX_DATA_ELEMENT__BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(DataType newBase) {
		eDynamicSet(FlowPackage.COMPLEX_DATA_ELEMENT__BASE, FlowPackage.Literals.DATA_TYPE__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataType> getExtensions() {
		return (EList<DataType>)eDynamicGet(FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS, FlowPackage.Literals.DATA_TYPE__EXTENSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataElement> getFeatures() {
		return (EList<DataElement>)eDynamicGet(FlowPackage.COMPLEX_DATA_ELEMENT__FEATURES, FlowPackage.Literals.COMPLEX_DATA_ELEMENT__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.COMPLEX_DATA_ELEMENT__BASE:
				DataType base = basicGetBase();
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, FlowPackage.DATA_TYPE__EXTENSIONS, DataType.class, msgs);
				return basicSetBase((DataType)otherEnd, msgs);
			case FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.COMPLEX_DATA_ELEMENT__BASE:
				return basicSetBase(null, msgs);
			case FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case FlowPackage.COMPLEX_DATA_ELEMENT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.COMPLEX_DATA_ELEMENT__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS:
				return getExtensions();
			case FlowPackage.COMPLEX_DATA_ELEMENT__FEATURES:
				return getFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlowPackage.COMPLEX_DATA_ELEMENT__BASE:
				setBase((DataType)newValue);
				return;
			case FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends DataType>)newValue);
				return;
			case FlowPackage.COMPLEX_DATA_ELEMENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends DataElement>)newValue);
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
			case FlowPackage.COMPLEX_DATA_ELEMENT__BASE:
				setBase((DataType)null);
				return;
			case FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS:
				getExtensions().clear();
				return;
			case FlowPackage.COMPLEX_DATA_ELEMENT__FEATURES:
				getFeatures().clear();
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
			case FlowPackage.COMPLEX_DATA_ELEMENT__BASE:
				return basicGetBase() != null;
			case FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS:
				return !getExtensions().isEmpty();
			case FlowPackage.COMPLEX_DATA_ELEMENT__FEATURES:
				return !getFeatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				case FlowPackage.COMPLEX_DATA_ELEMENT__BASE: return FlowPackage.DATA_TYPE__BASE;
				case FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS: return FlowPackage.DATA_TYPE__EXTENSIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				case FlowPackage.DATA_TYPE__BASE: return FlowPackage.COMPLEX_DATA_ELEMENT__BASE;
				case FlowPackage.DATA_TYPE__EXTENSIONS: return FlowPackage.COMPLEX_DATA_ELEMENT__EXTENSIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComplexDataElementImpl
