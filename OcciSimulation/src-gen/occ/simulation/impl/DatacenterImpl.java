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
package occ.simulation.impl;

import occ.simulation.Datacenter;
import occ.simulation.SimulationPackage;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datacenter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterOs <em>Datacenter Os</em>}</li>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterLocation <em>Datacenter Location</em>}</li>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterTimezone <em>Datacenter Timezone</em>}</li>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterCostMem <em>Datacenter Cost Mem</em>}</li>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterCostBw <em>Datacenter Cost Bw</em>}</li>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterCostStorge <em>Datacenter Cost Storge</em>}</li>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterCostProcess <em>Datacenter Cost Process</em>}</li>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterVmm <em>Datacenter Vmm</em>}</li>
 *   <li>{@link occ.simulation.impl.DatacenterImpl#getDatacenterName <em>Datacenter Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatacenterImpl extends ComputeImpl implements Datacenter {
	/**
	 * The default value of the '{@link #getDatacenterOs() <em>Datacenter Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterOs()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACENTER_OS_EDEFAULT = "Linux";

	/**
	 * The cached value of the '{@link #getDatacenterOs() <em>Datacenter Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterOs()
	 * @generated
	 * @ordered
	 */
	protected String datacenterOs = DATACENTER_OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenterLocation() <em>Datacenter Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACENTER_LOCATION_EDEFAULT = "US East (N. Virginia)";

	/**
	 * The cached value of the '{@link #getDatacenterLocation() <em>Datacenter Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterLocation()
	 * @generated
	 * @ordered
	 */
	protected String datacenterLocation = DATACENTER_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenterTimezone() <em>Datacenter Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final Double DATACENTER_TIMEZONE_EDEFAULT = new Double(10.0);

	/**
	 * The cached value of the '{@link #getDatacenterTimezone() <em>Datacenter Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterTimezone()
	 * @generated
	 * @ordered
	 */
	protected Double datacenterTimezone = DATACENTER_TIMEZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenterCostMem() <em>Datacenter Cost Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterCostMem()
	 * @generated
	 * @ordered
	 */
	protected static final Double DATACENTER_COST_MEM_EDEFAULT = new Double(0.05);

	/**
	 * The cached value of the '{@link #getDatacenterCostMem() <em>Datacenter Cost Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterCostMem()
	 * @generated
	 * @ordered
	 */
	protected Double datacenterCostMem = DATACENTER_COST_MEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenterCostBw() <em>Datacenter Cost Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterCostBw()
	 * @generated
	 * @ordered
	 */
	protected static final Double DATACENTER_COST_BW_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getDatacenterCostBw() <em>Datacenter Cost Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterCostBw()
	 * @generated
	 * @ordered
	 */
	protected Double datacenterCostBw = DATACENTER_COST_BW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenterCostStorge() <em>Datacenter Cost Storge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterCostStorge()
	 * @generated
	 * @ordered
	 */
	protected static final Double DATACENTER_COST_STORGE_EDEFAULT = new Double(0.001);

	/**
	 * The cached value of the '{@link #getDatacenterCostStorge() <em>Datacenter Cost Storge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterCostStorge()
	 * @generated
	 * @ordered
	 */
	protected Double datacenterCostStorge = DATACENTER_COST_STORGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenterCostProcess() <em>Datacenter Cost Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterCostProcess()
	 * @generated
	 * @ordered
	 */
	protected static final Double DATACENTER_COST_PROCESS_EDEFAULT = new Double(3.0);

	/**
	 * The cached value of the '{@link #getDatacenterCostProcess() <em>Datacenter Cost Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterCostProcess()
	 * @generated
	 * @ordered
	 */
	protected Double datacenterCostProcess = DATACENTER_COST_PROCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenterVmm() <em>Datacenter Vmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterVmm()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACENTER_VMM_EDEFAULT = "Xen";

	/**
	 * The cached value of the '{@link #getDatacenterVmm() <em>Datacenter Vmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterVmm()
	 * @generated
	 * @ordered
	 */
	protected String datacenterVmm = DATACENTER_VMM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacenterName() <em>Datacenter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACENTER_NAME_EDEFAULT = "datacenter";

	/**
	 * The cached value of the '{@link #getDatacenterName() <em>Datacenter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacenterName()
	 * @generated
	 * @ordered
	 */
	protected String datacenterName = DATACENTER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatacenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.DATACENTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatacenterOs() {
		return datacenterOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterOs(String newDatacenterOs) {
		String oldDatacenterOs = datacenterOs;
		datacenterOs = newDatacenterOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_OS, oldDatacenterOs, datacenterOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatacenterLocation() {
		return datacenterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterLocation(String newDatacenterLocation) {
		String oldDatacenterLocation = datacenterLocation;
		datacenterLocation = newDatacenterLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_LOCATION, oldDatacenterLocation, datacenterLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDatacenterTimezone() {
		return datacenterTimezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterTimezone(Double newDatacenterTimezone) {
		Double oldDatacenterTimezone = datacenterTimezone;
		datacenterTimezone = newDatacenterTimezone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_TIMEZONE, oldDatacenterTimezone, datacenterTimezone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDatacenterCostMem() {
		return datacenterCostMem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterCostMem(Double newDatacenterCostMem) {
		Double oldDatacenterCostMem = datacenterCostMem;
		datacenterCostMem = newDatacenterCostMem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_COST_MEM, oldDatacenterCostMem, datacenterCostMem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDatacenterCostBw() {
		return datacenterCostBw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterCostBw(Double newDatacenterCostBw) {
		Double oldDatacenterCostBw = datacenterCostBw;
		datacenterCostBw = newDatacenterCostBw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_COST_BW, oldDatacenterCostBw, datacenterCostBw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDatacenterCostStorge() {
		return datacenterCostStorge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterCostStorge(Double newDatacenterCostStorge) {
		Double oldDatacenterCostStorge = datacenterCostStorge;
		datacenterCostStorge = newDatacenterCostStorge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_COST_STORGE, oldDatacenterCostStorge, datacenterCostStorge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDatacenterCostProcess() {
		return datacenterCostProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterCostProcess(Double newDatacenterCostProcess) {
		Double oldDatacenterCostProcess = datacenterCostProcess;
		datacenterCostProcess = newDatacenterCostProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_COST_PROCESS, oldDatacenterCostProcess, datacenterCostProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatacenterVmm() {
		return datacenterVmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterVmm(String newDatacenterVmm) {
		String oldDatacenterVmm = datacenterVmm;
		datacenterVmm = newDatacenterVmm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_VMM, oldDatacenterVmm, datacenterVmm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatacenterName() {
		return datacenterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacenterName(String newDatacenterName) {
		String oldDatacenterName = datacenterName;
		datacenterName = newDatacenterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__DATACENTER_NAME, oldDatacenterName, datacenterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulationPackage.DATACENTER__DATACENTER_OS:
				return getDatacenterOs();
			case SimulationPackage.DATACENTER__DATACENTER_LOCATION:
				return getDatacenterLocation();
			case SimulationPackage.DATACENTER__DATACENTER_TIMEZONE:
				return getDatacenterTimezone();
			case SimulationPackage.DATACENTER__DATACENTER_COST_MEM:
				return getDatacenterCostMem();
			case SimulationPackage.DATACENTER__DATACENTER_COST_BW:
				return getDatacenterCostBw();
			case SimulationPackage.DATACENTER__DATACENTER_COST_STORGE:
				return getDatacenterCostStorge();
			case SimulationPackage.DATACENTER__DATACENTER_COST_PROCESS:
				return getDatacenterCostProcess();
			case SimulationPackage.DATACENTER__DATACENTER_VMM:
				return getDatacenterVmm();
			case SimulationPackage.DATACENTER__DATACENTER_NAME:
				return getDatacenterName();
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
			case SimulationPackage.DATACENTER__DATACENTER_OS:
				setDatacenterOs((String)newValue);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_LOCATION:
				setDatacenterLocation((String)newValue);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_TIMEZONE:
				setDatacenterTimezone((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_COST_MEM:
				setDatacenterCostMem((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_COST_BW:
				setDatacenterCostBw((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_COST_STORGE:
				setDatacenterCostStorge((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_COST_PROCESS:
				setDatacenterCostProcess((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_VMM:
				setDatacenterVmm((String)newValue);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_NAME:
				setDatacenterName((String)newValue);
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
			case SimulationPackage.DATACENTER__DATACENTER_OS:
				setDatacenterOs(DATACENTER_OS_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_LOCATION:
				setDatacenterLocation(DATACENTER_LOCATION_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_TIMEZONE:
				setDatacenterTimezone(DATACENTER_TIMEZONE_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_COST_MEM:
				setDatacenterCostMem(DATACENTER_COST_MEM_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_COST_BW:
				setDatacenterCostBw(DATACENTER_COST_BW_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_COST_STORGE:
				setDatacenterCostStorge(DATACENTER_COST_STORGE_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_COST_PROCESS:
				setDatacenterCostProcess(DATACENTER_COST_PROCESS_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_VMM:
				setDatacenterVmm(DATACENTER_VMM_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__DATACENTER_NAME:
				setDatacenterName(DATACENTER_NAME_EDEFAULT);
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
			case SimulationPackage.DATACENTER__DATACENTER_OS:
				return DATACENTER_OS_EDEFAULT == null ? datacenterOs != null : !DATACENTER_OS_EDEFAULT.equals(datacenterOs);
			case SimulationPackage.DATACENTER__DATACENTER_LOCATION:
				return DATACENTER_LOCATION_EDEFAULT == null ? datacenterLocation != null : !DATACENTER_LOCATION_EDEFAULT.equals(datacenterLocation);
			case SimulationPackage.DATACENTER__DATACENTER_TIMEZONE:
				return DATACENTER_TIMEZONE_EDEFAULT == null ? datacenterTimezone != null : !DATACENTER_TIMEZONE_EDEFAULT.equals(datacenterTimezone);
			case SimulationPackage.DATACENTER__DATACENTER_COST_MEM:
				return DATACENTER_COST_MEM_EDEFAULT == null ? datacenterCostMem != null : !DATACENTER_COST_MEM_EDEFAULT.equals(datacenterCostMem);
			case SimulationPackage.DATACENTER__DATACENTER_COST_BW:
				return DATACENTER_COST_BW_EDEFAULT == null ? datacenterCostBw != null : !DATACENTER_COST_BW_EDEFAULT.equals(datacenterCostBw);
			case SimulationPackage.DATACENTER__DATACENTER_COST_STORGE:
				return DATACENTER_COST_STORGE_EDEFAULT == null ? datacenterCostStorge != null : !DATACENTER_COST_STORGE_EDEFAULT.equals(datacenterCostStorge);
			case SimulationPackage.DATACENTER__DATACENTER_COST_PROCESS:
				return DATACENTER_COST_PROCESS_EDEFAULT == null ? datacenterCostProcess != null : !DATACENTER_COST_PROCESS_EDEFAULT.equals(datacenterCostProcess);
			case SimulationPackage.DATACENTER__DATACENTER_VMM:
				return DATACENTER_VMM_EDEFAULT == null ? datacenterVmm != null : !DATACENTER_VMM_EDEFAULT.equals(datacenterVmm);
			case SimulationPackage.DATACENTER__DATACENTER_NAME:
				return DATACENTER_NAME_EDEFAULT == null ? datacenterName != null : !DATACENTER_NAME_EDEFAULT.equals(datacenterName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (datacenterOs: ");
		result.append(datacenterOs);
		result.append(", datacenterLocation: ");
		result.append(datacenterLocation);
		result.append(", datacenterTimezone: ");
		result.append(datacenterTimezone);
		result.append(", datacenterCostMem: ");
		result.append(datacenterCostMem);
		result.append(", datacenterCostBw: ");
		result.append(datacenterCostBw);
		result.append(", datacenterCostStorge: ");
		result.append(datacenterCostStorge);
		result.append(", datacenterCostProcess: ");
		result.append(datacenterCostProcess);
		result.append(", datacenterVmm: ");
		result.append(datacenterVmm);
		result.append(", datacenterName: ");
		result.append(datacenterName);
		result.append(')');
		return result.toString();
	}

} //DatacenterImpl
