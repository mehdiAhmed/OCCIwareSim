/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package occ.simulation;

import org.eclipse.cmf.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datacenter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterOs <em>Datacenter Os</em>}</li>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterLocation <em>Datacenter Location</em>}</li>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterTimezone <em>Datacenter Timezone</em>}</li>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterCostMem <em>Datacenter Cost Mem</em>}</li>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterCostBw <em>Datacenter Cost Bw</em>}</li>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterCostStorge <em>Datacenter Cost Storge</em>}</li>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterCostProcess <em>Datacenter Cost Process</em>}</li>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterVmm <em>Datacenter Vmm</em>}</li>
 *   <li>{@link occ.simulation.Datacenter#getDatacenterName <em>Datacenter Name</em>}</li>
 * </ul>
 *
 * @see occ.simulation.SimulationPackage#getDatacenter()
 * @model
 * @generated
 */
public interface Datacenter extends Compute {
	/**
	 * Returns the value of the '<em><b>Datacenter Os</b></em>' attribute.
	 * The default value is <code>"Linux"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Os</em>' attribute.
	 * @see #setDatacenterOs(String)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterOs()
	 * @model default="Linux" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterOs'"
	 * @generated
	 */
	String getDatacenterOs();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterOs <em>Datacenter Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Os</em>' attribute.
	 * @see #getDatacenterOs()
	 * @generated
	 */
	void setDatacenterOs(String value);

	/**
	 * Returns the value of the '<em><b>Datacenter Location</b></em>' attribute.
	 * The default value is <code>"US East (N. Virginia)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Location</em>' attribute.
	 * @see #setDatacenterLocation(String)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterLocation()
	 * @model default="US East (N. Virginia)" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterLocation'"
	 * @generated
	 */
	String getDatacenterLocation();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterLocation <em>Datacenter Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Location</em>' attribute.
	 * @see #getDatacenterLocation()
	 * @generated
	 */
	void setDatacenterLocation(String value);

	/**
	 * Returns the value of the '<em><b>Datacenter Timezone</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Timezone</em>' attribute.
	 * @see #setDatacenterTimezone(Double)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterTimezone()
	 * @model default="10.0" dataType="occ.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterTimezone'"
	 * @generated
	 */
	Double getDatacenterTimezone();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterTimezone <em>Datacenter Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Timezone</em>' attribute.
	 * @see #getDatacenterTimezone()
	 * @generated
	 */
	void setDatacenterTimezone(Double value);

	/**
	 * Returns the value of the '<em><b>Datacenter Cost Mem</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Cost Mem</em>' attribute.
	 * @see #setDatacenterCostMem(Double)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterCostMem()
	 * @model default="0.05" dataType="occ.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterCostMem'"
	 * @generated
	 */
	Double getDatacenterCostMem();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterCostMem <em>Datacenter Cost Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Cost Mem</em>' attribute.
	 * @see #getDatacenterCostMem()
	 * @generated
	 */
	void setDatacenterCostMem(Double value);

	/**
	 * Returns the value of the '<em><b>Datacenter Cost Bw</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Cost Bw</em>' attribute.
	 * @see #setDatacenterCostBw(Double)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterCostBw()
	 * @model default="0.0" dataType="occ.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterCostBw'"
	 * @generated
	 */
	Double getDatacenterCostBw();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterCostBw <em>Datacenter Cost Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Cost Bw</em>' attribute.
	 * @see #getDatacenterCostBw()
	 * @generated
	 */
	void setDatacenterCostBw(Double value);

	/**
	 * Returns the value of the '<em><b>Datacenter Cost Storge</b></em>' attribute.
	 * The default value is <code>"0.001"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Cost Storge</em>' attribute.
	 * @see #setDatacenterCostStorge(Double)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterCostStorge()
	 * @model default="0.001" dataType="occ.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterCostStorge'"
	 * @generated
	 */
	Double getDatacenterCostStorge();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterCostStorge <em>Datacenter Cost Storge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Cost Storge</em>' attribute.
	 * @see #getDatacenterCostStorge()
	 * @generated
	 */
	void setDatacenterCostStorge(Double value);

	/**
	 * Returns the value of the '<em><b>Datacenter Cost Process</b></em>' attribute.
	 * The default value is <code>"3.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Cost Process</em>' attribute.
	 * @see #setDatacenterCostProcess(Double)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterCostProcess()
	 * @model default="3.0" dataType="occ.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterCostProcess'"
	 * @generated
	 */
	Double getDatacenterCostProcess();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterCostProcess <em>Datacenter Cost Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Cost Process</em>' attribute.
	 * @see #getDatacenterCostProcess()
	 * @generated
	 */
	void setDatacenterCostProcess(Double value);

	/**
	 * Returns the value of the '<em><b>Datacenter Vmm</b></em>' attribute.
	 * The default value is <code>"Xen"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Vmm</em>' attribute.
	 * @see #setDatacenterVmm(String)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterVmm()
	 * @model default="Xen" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterVmm'"
	 * @generated
	 */
	String getDatacenterVmm();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterVmm <em>Datacenter Vmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Vmm</em>' attribute.
	 * @see #getDatacenterVmm()
	 * @generated
	 */
	void setDatacenterVmm(String value);

	/**
	 * Returns the value of the '<em><b>Datacenter Name</b></em>' attribute.
	 * The default value is <code>"datacenter"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacenter Name</em>' attribute.
	 * @see #setDatacenterName(String)
	 * @see occ.simulation.SimulationPackage#getDatacenter_DatacenterName()
	 * @model default="datacenter" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!datacenterName'"
	 * @generated
	 */
	String getDatacenterName();

	/**
	 * Sets the value of the '{@link occ.simulation.Datacenter#getDatacenterName <em>Datacenter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacenter Name</em>' attribute.
	 * @see #getDatacenterName()
	 * @generated
	 */
	void setDatacenterName(String value);

} // Datacenter
