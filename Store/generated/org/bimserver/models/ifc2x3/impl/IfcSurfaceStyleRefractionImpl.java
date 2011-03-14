/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcSurfaceStyleRefraction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Refraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcSurfaceStyleRefractionImpl#getRefractionIndex <em>Refraction Index</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcSurfaceStyleRefractionImpl#getRefractionIndexAsString <em>Refraction Index As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcSurfaceStyleRefractionImpl#getDispersionFactor <em>Dispersion Factor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcSurfaceStyleRefractionImpl#getDispersionFactorAsString <em>Dispersion Factor As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleRefractionImpl extends IdEObjectImpl implements IfcSurfaceStyleRefraction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleRefractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRefractionIndex() {
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefractionIndex(float newRefractionIndex) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndex(), newRefractionIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefractionIndex() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefractionIndex() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefractionIndexAsString() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndexAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefractionIndexAsString(String newRefractionIndexAsString) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndexAsString(), newRefractionIndexAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefractionIndexAsString() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndexAsString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefractionIndexAsString() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_RefractionIndexAsString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDispersionFactor() {
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispersionFactor(float newDispersionFactor) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactor(), newDispersionFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDispersionFactor() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDispersionFactor() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDispersionFactorAsString() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactorAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispersionFactorAsString(String newDispersionFactorAsString) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactorAsString(), newDispersionFactorAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDispersionFactorAsString() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactorAsString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDispersionFactorAsString() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSurfaceStyleRefraction_DispersionFactorAsString());
	}

} //IfcSurfaceStyleRefractionImpl
