/**
 */
package org.nasdanika.models.flow.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.ModelPackage;
import org.nasdanika.models.flow.Connection;
import org.nasdanika.models.flow.FlowPackage;
import org.nasdanika.models.flow.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.flow.impl.ConnectionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.flow.impl.ConnectionImpl#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends ModelElementImpl implements Connection {
	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Target getTarget() {
		return (Target)eDynamicGet(FlowPackage.CONNECTION__TARGET, ModelPackage.Literals.CONNECTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target basicGetTarget() {
		return (Target)eDynamicGet(FlowPackage.CONNECTION__TARGET, ModelPackage.Literals.CONNECTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Target newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, FlowPackage.CONNECTION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Target newTarget) {
		eDynamicSet(FlowPackage.CONNECTION__TARGET, ModelPackage.Literals.CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBidirectional() {
		return (Boolean)eDynamicGet(FlowPackage.CONNECTION__BIDIRECTIONAL, ModelPackage.Literals.CONNECTION__BIDIRECTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBidirectional(boolean newBidirectional) {
		eDynamicSet(FlowPackage.CONNECTION__BIDIRECTIONAL, ModelPackage.Literals.CONNECTION__BIDIRECTIONAL, newBidirectional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.CONNECTION__TARGET:
				Target target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS, ConnectionTarget.class, msgs);
				return basicSetTarget((Target)otherEnd, msgs);
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
			case FlowPackage.CONNECTION__TARGET:
				return basicSetTarget(null, msgs);
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
			case FlowPackage.CONNECTION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FlowPackage.CONNECTION__BIDIRECTIONAL:
				return isBidirectional();
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
			case FlowPackage.CONNECTION__TARGET:
				setTarget((Target)newValue);
				return;
			case FlowPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
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
			case FlowPackage.CONNECTION__TARGET:
				setTarget((Target)null);
				return;
			case FlowPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
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
			case FlowPackage.CONNECTION__TARGET:
				return basicGetTarget() != null;
			case FlowPackage.CONNECTION__BIDIRECTIONAL:
				return isBidirectional() != BIDIRECTIONAL_EDEFAULT;
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
		if (baseClass == org.nasdanika.graph.model.Connection.class) {
			switch (derivedFeatureID) {
				case FlowPackage.CONNECTION__TARGET: return ModelPackage.CONNECTION__TARGET;
				case FlowPackage.CONNECTION__BIDIRECTIONAL: return ModelPackage.CONNECTION__BIDIRECTIONAL;
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
		if (baseClass == org.nasdanika.graph.model.Connection.class) {
			switch (baseFeatureID) {
				case ModelPackage.CONNECTION__TARGET: return FlowPackage.CONNECTION__TARGET;
				case ModelPackage.CONNECTION__BIDIRECTIONAL: return FlowPackage.CONNECTION__BIDIRECTIONAL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectionImpl
