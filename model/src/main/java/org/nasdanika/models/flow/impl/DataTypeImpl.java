/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.flow.Collaboratable;
import org.nasdanika.models.flow.DataType;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.DataTypeImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.DataTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.DataTypeImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends ModelElementImpl implements DataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(FlowPackage.DATA_TYPE__ROLES, FlowPackage.Literals.COLLABORATABLE__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getBase() {
		return (DataType)eDynamicGet(FlowPackage.DATA_TYPE__BASE, FlowPackage.Literals.DATA_TYPE__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBase() {
		return (DataType)eDynamicGet(FlowPackage.DATA_TYPE__BASE, FlowPackage.Literals.DATA_TYPE__BASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(DataType newBase, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBase, FlowPackage.DATA_TYPE__BASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(DataType newBase) {
		eDynamicSet(FlowPackage.DATA_TYPE__BASE, FlowPackage.Literals.DATA_TYPE__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataType> getExtensions() {
		return (EList<DataType>)eDynamicGet(FlowPackage.DATA_TYPE__EXTENSIONS, FlowPackage.Literals.DATA_TYPE__EXTENSIONS, true, true);
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
			case FlowPackage.DATA_TYPE__BASE:
				DataType base = basicGetBase();
				if (base != null)
					msgs = ((InternalEObject)base).eInverseRemove(this, FlowPackage.DATA_TYPE__EXTENSIONS, DataType.class, msgs);
				return basicSetBase((DataType)otherEnd, msgs);
			case FlowPackage.DATA_TYPE__EXTENSIONS:
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
			case FlowPackage.DATA_TYPE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case FlowPackage.DATA_TYPE__BASE:
				return basicSetBase(null, msgs);
			case FlowPackage.DATA_TYPE__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.DATA_TYPE__ROLES:
				return getRoles();
			case FlowPackage.DATA_TYPE__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case FlowPackage.DATA_TYPE__EXTENSIONS:
				return getExtensions();
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
			case FlowPackage.DATA_TYPE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case FlowPackage.DATA_TYPE__BASE:
				setBase((DataType)newValue);
				return;
			case FlowPackage.DATA_TYPE__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends DataType>)newValue);
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
			case FlowPackage.DATA_TYPE__ROLES:
				getRoles().clear();
				return;
			case FlowPackage.DATA_TYPE__BASE:
				setBase((DataType)null);
				return;
			case FlowPackage.DATA_TYPE__EXTENSIONS:
				getExtensions().clear();
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
			case FlowPackage.DATA_TYPE__ROLES:
				return !getRoles().isEmpty();
			case FlowPackage.DATA_TYPE__BASE:
				return basicGetBase() != null;
			case FlowPackage.DATA_TYPE__EXTENSIONS:
				return !getExtensions().isEmpty();
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
		if (baseClass == Collaboratable.class) {
			switch (derivedFeatureID) {
				case FlowPackage.DATA_TYPE__ROLES: return FlowPackage.COLLABORATABLE__ROLES;
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
		if (baseClass == Collaboratable.class) {
			switch (baseFeatureID) {
				case FlowPackage.COLLABORATABLE__ROLES: return FlowPackage.DATA_TYPE__ROLES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DataTypeImpl
