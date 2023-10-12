/**
 */
package org.nasdanika.models.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.flow.Artifact;
import org.nasdanika.models.flow.Collaboratable;
import org.nasdanika.models.flow.DataElement;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.DataElementImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.DataElementImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.DataElementImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.DataElementImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataElementImpl extends DataDomainElementImpl implements DataElement {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(FlowPackage.DATA_ELEMENT__ROLES, FlowPackage.Literals.COLLABORATABLE__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLowerBound() {
		return (Integer)eDynamicGet(FlowPackage.DATA_ELEMENT__LOWER_BOUND, FlowPackage.Literals.DATA_ELEMENT__LOWER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerBound(int newLowerBound) {
		eDynamicSet(FlowPackage.DATA_ELEMENT__LOWER_BOUND, FlowPackage.Literals.DATA_ELEMENT__LOWER_BOUND, newLowerBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUpperBound() {
		return (Integer)eDynamicGet(FlowPackage.DATA_ELEMENT__UPPER_BOUND, FlowPackage.Literals.DATA_ELEMENT__UPPER_BOUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperBound(int newUpperBound) {
		eDynamicSet(FlowPackage.DATA_ELEMENT__UPPER_BOUND, FlowPackage.Literals.DATA_ELEMENT__UPPER_BOUND, newUpperBound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(FlowPackage.DATA_ELEMENT__ARTIFACTS, FlowPackage.Literals.DATA_ELEMENT__ARTIFACTS, true, true);
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
			case FlowPackage.DATA_ELEMENT__ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtifacts()).basicAdd(otherEnd, msgs);
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
			case FlowPackage.DATA_ELEMENT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case FlowPackage.DATA_ELEMENT__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.DATA_ELEMENT__ROLES:
				return getRoles();
			case FlowPackage.DATA_ELEMENT__LOWER_BOUND:
				return getLowerBound();
			case FlowPackage.DATA_ELEMENT__UPPER_BOUND:
				return getUpperBound();
			case FlowPackage.DATA_ELEMENT__ARTIFACTS:
				return getArtifacts();
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
			case FlowPackage.DATA_ELEMENT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case FlowPackage.DATA_ELEMENT__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case FlowPackage.DATA_ELEMENT__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case FlowPackage.DATA_ELEMENT__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case FlowPackage.DATA_ELEMENT__ROLES:
				getRoles().clear();
				return;
			case FlowPackage.DATA_ELEMENT__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case FlowPackage.DATA_ELEMENT__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case FlowPackage.DATA_ELEMENT__ARTIFACTS:
				getArtifacts().clear();
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
			case FlowPackage.DATA_ELEMENT__ROLES:
				return !getRoles().isEmpty();
			case FlowPackage.DATA_ELEMENT__LOWER_BOUND:
				return getLowerBound() != LOWER_BOUND_EDEFAULT;
			case FlowPackage.DATA_ELEMENT__UPPER_BOUND:
				return getUpperBound() != UPPER_BOUND_EDEFAULT;
			case FlowPackage.DATA_ELEMENT__ARTIFACTS:
				return !getArtifacts().isEmpty();
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
				case FlowPackage.DATA_ELEMENT__ROLES: return FlowPackage.COLLABORATABLE__ROLES;
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
				case FlowPackage.COLLABORATABLE__ROLES: return FlowPackage.DATA_ELEMENT__ROLES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DataElementImpl
