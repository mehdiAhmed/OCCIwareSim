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

import occ.simulation.BwProvisionner;
import occ.simulation.ElasticityType;
import occ.simulation.Host;
import occ.simulation.PeProvisionner;
import occ.simulation.RamProvisionner;
import occ.simulation.SimulationPackage;
import occ.simulation.VmScheduler;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostId <em>Host Id</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostRamProvisionner <em>Host Ram Provisionner</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostBwProvisionner <em>Host Bw Provisionner</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostStorage <em>Host Storage</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostCores <em>Host Cores</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostVmScheduler <em>Host Vm Scheduler</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostRam <em>Host Ram</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostMips <em>Host Mips</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostBw <em>Host Bw</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostPeProvisionner <em>Host Pe Provisionner</em>}</li>
 *   <li>{@link occ.simulation.impl.HostImpl#getHostElasticity <em>Host Elasticity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostImpl extends ComputeImpl implements Host {
	/**
	 * The default value of the '{@link #getHostId() <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOST_ID_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getHostId() <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostId()
	 * @generated
	 * @ordered
	 */
	protected Integer hostId = HOST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostRamProvisionner() <em>Host Ram Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostRamProvisionner()
	 * @generated
	 * @ordered
	 */
	protected static final RamProvisionner HOST_RAM_PROVISIONNER_EDEFAULT = RamProvisionner.RAM_PROVISIONER_SIMPLE;

	/**
	 * The cached value of the '{@link #getHostRamProvisionner() <em>Host Ram Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostRamProvisionner()
	 * @generated
	 * @ordered
	 */
	protected RamProvisionner hostRamProvisionner = HOST_RAM_PROVISIONNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostBwProvisionner() <em>Host Bw Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostBwProvisionner()
	 * @generated
	 * @ordered
	 */
	protected static final BwProvisionner HOST_BW_PROVISIONNER_EDEFAULT = BwProvisionner.BW_PROVISIONER_SIMPLE;

	/**
	 * The cached value of the '{@link #getHostBwProvisionner() <em>Host Bw Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostBwProvisionner()
	 * @generated
	 * @ordered
	 */
	protected BwProvisionner hostBwProvisionner = HOST_BW_PROVISIONNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostStorage() <em>Host Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostStorage()
	 * @generated
	 * @ordered
	 */
	protected static final Long HOST_STORAGE_EDEFAULT = new Long(1000000L);

	/**
	 * The cached value of the '{@link #getHostStorage() <em>Host Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostStorage()
	 * @generated
	 * @ordered
	 */
	protected Long hostStorage = HOST_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostCores() <em>Host Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOST_CORES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getHostCores() <em>Host Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostCores()
	 * @generated
	 * @ordered
	 */
	protected Integer hostCores = HOST_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostVmScheduler() <em>Host Vm Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostVmScheduler()
	 * @generated
	 * @ordered
	 */
	protected static final VmScheduler HOST_VM_SCHEDULER_EDEFAULT = VmScheduler.VM_SCHEDULER_TIME_SHARED;

	/**
	 * The cached value of the '{@link #getHostVmScheduler() <em>Host Vm Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostVmScheduler()
	 * @generated
	 * @ordered
	 */
	protected VmScheduler hostVmScheduler = HOST_VM_SCHEDULER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostRam() <em>Host Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostRam()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOST_RAM_EDEFAULT = new Integer(2048);

	/**
	 * The cached value of the '{@link #getHostRam() <em>Host Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostRam()
	 * @generated
	 * @ordered
	 */
	protected Integer hostRam = HOST_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostMips() <em>Host Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostMips()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOST_MIPS_EDEFAULT = new Integer(1000);

	/**
	 * The cached value of the '{@link #getHostMips() <em>Host Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostMips()
	 * @generated
	 * @ordered
	 */
	protected Integer hostMips = HOST_MIPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostBw() <em>Host Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostBw()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOST_BW_EDEFAULT = new Integer(10000);

	/**
	 * The cached value of the '{@link #getHostBw() <em>Host Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostBw()
	 * @generated
	 * @ordered
	 */
	protected Integer hostBw = HOST_BW_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostPeProvisionner() <em>Host Pe Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPeProvisionner()
	 * @generated
	 * @ordered
	 */
	protected static final PeProvisionner HOST_PE_PROVISIONNER_EDEFAULT = PeProvisionner.PE_PROVISIONER_SIMPLE;

	/**
	 * The cached value of the '{@link #getHostPeProvisionner() <em>Host Pe Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPeProvisionner()
	 * @generated
	 * @ordered
	 */
	protected PeProvisionner hostPeProvisionner = HOST_PE_PROVISIONNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostElasticity() <em>Host Elasticity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostElasticity()
	 * @generated
	 * @ordered
	 */
	protected static final ElasticityType HOST_ELASTICITY_EDEFAULT = ElasticityType.NONE;

	/**
	 * The cached value of the '{@link #getHostElasticity() <em>Host Elasticity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostElasticity()
	 * @generated
	 * @ordered
	 */
	protected ElasticityType hostElasticity = HOST_ELASTICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHostId() {
		return hostId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostId(Integer newHostId) {
		Integer oldHostId = hostId;
		hostId = newHostId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_ID, oldHostId, hostId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RamProvisionner getHostRamProvisionner() {
		return hostRamProvisionner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostRamProvisionner(RamProvisionner newHostRamProvisionner) {
		RamProvisionner oldHostRamProvisionner = hostRamProvisionner;
		hostRamProvisionner = newHostRamProvisionner == null ? HOST_RAM_PROVISIONNER_EDEFAULT : newHostRamProvisionner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_RAM_PROVISIONNER, oldHostRamProvisionner, hostRamProvisionner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BwProvisionner getHostBwProvisionner() {
		return hostBwProvisionner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostBwProvisionner(BwProvisionner newHostBwProvisionner) {
		BwProvisionner oldHostBwProvisionner = hostBwProvisionner;
		hostBwProvisionner = newHostBwProvisionner == null ? HOST_BW_PROVISIONNER_EDEFAULT : newHostBwProvisionner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_BW_PROVISIONNER, oldHostBwProvisionner, hostBwProvisionner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getHostStorage() {
		return hostStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostStorage(Long newHostStorage) {
		Long oldHostStorage = hostStorage;
		hostStorage = newHostStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_STORAGE, oldHostStorage, hostStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHostCores() {
		return hostCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostCores(Integer newHostCores) {
		Integer oldHostCores = hostCores;
		hostCores = newHostCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_CORES, oldHostCores, hostCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmScheduler getHostVmScheduler() {
		return hostVmScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostVmScheduler(VmScheduler newHostVmScheduler) {
		VmScheduler oldHostVmScheduler = hostVmScheduler;
		hostVmScheduler = newHostVmScheduler == null ? HOST_VM_SCHEDULER_EDEFAULT : newHostVmScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_VM_SCHEDULER, oldHostVmScheduler, hostVmScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHostRam() {
		return hostRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostRam(Integer newHostRam) {
		Integer oldHostRam = hostRam;
		hostRam = newHostRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_RAM, oldHostRam, hostRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHostMips() {
		return hostMips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostMips(Integer newHostMips) {
		Integer oldHostMips = hostMips;
		hostMips = newHostMips;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_MIPS, oldHostMips, hostMips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHostBw() {
		return hostBw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostBw(Integer newHostBw) {
		Integer oldHostBw = hostBw;
		hostBw = newHostBw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_BW, oldHostBw, hostBw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeProvisionner getHostPeProvisionner() {
		return hostPeProvisionner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostPeProvisionner(PeProvisionner newHostPeProvisionner) {
		PeProvisionner oldHostPeProvisionner = hostPeProvisionner;
		hostPeProvisionner = newHostPeProvisionner == null ? HOST_PE_PROVISIONNER_EDEFAULT : newHostPeProvisionner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_PE_PROVISIONNER, oldHostPeProvisionner, hostPeProvisionner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticityType getHostElasticity() {
		return hostElasticity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostElasticity(ElasticityType newHostElasticity) {
		ElasticityType oldHostElasticity = hostElasticity;
		hostElasticity = newHostElasticity == null ? HOST_ELASTICITY_EDEFAULT : newHostElasticity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__HOST_ELASTICITY, oldHostElasticity, hostElasticity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulationPackage.HOST__HOST_ID:
				return getHostId();
			case SimulationPackage.HOST__HOST_RAM_PROVISIONNER:
				return getHostRamProvisionner();
			case SimulationPackage.HOST__HOST_BW_PROVISIONNER:
				return getHostBwProvisionner();
			case SimulationPackage.HOST__HOST_STORAGE:
				return getHostStorage();
			case SimulationPackage.HOST__HOST_CORES:
				return getHostCores();
			case SimulationPackage.HOST__HOST_VM_SCHEDULER:
				return getHostVmScheduler();
			case SimulationPackage.HOST__HOST_RAM:
				return getHostRam();
			case SimulationPackage.HOST__HOST_MIPS:
				return getHostMips();
			case SimulationPackage.HOST__HOST_BW:
				return getHostBw();
			case SimulationPackage.HOST__HOST_PE_PROVISIONNER:
				return getHostPeProvisionner();
			case SimulationPackage.HOST__HOST_ELASTICITY:
				return getHostElasticity();
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
			case SimulationPackage.HOST__HOST_ID:
				setHostId((Integer)newValue);
				return;
			case SimulationPackage.HOST__HOST_RAM_PROVISIONNER:
				setHostRamProvisionner((RamProvisionner)newValue);
				return;
			case SimulationPackage.HOST__HOST_BW_PROVISIONNER:
				setHostBwProvisionner((BwProvisionner)newValue);
				return;
			case SimulationPackage.HOST__HOST_STORAGE:
				setHostStorage((Long)newValue);
				return;
			case SimulationPackage.HOST__HOST_CORES:
				setHostCores((Integer)newValue);
				return;
			case SimulationPackage.HOST__HOST_VM_SCHEDULER:
				setHostVmScheduler((VmScheduler)newValue);
				return;
			case SimulationPackage.HOST__HOST_RAM:
				setHostRam((Integer)newValue);
				return;
			case SimulationPackage.HOST__HOST_MIPS:
				setHostMips((Integer)newValue);
				return;
			case SimulationPackage.HOST__HOST_BW:
				setHostBw((Integer)newValue);
				return;
			case SimulationPackage.HOST__HOST_PE_PROVISIONNER:
				setHostPeProvisionner((PeProvisionner)newValue);
				return;
			case SimulationPackage.HOST__HOST_ELASTICITY:
				setHostElasticity((ElasticityType)newValue);
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
			case SimulationPackage.HOST__HOST_ID:
				setHostId(HOST_ID_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_RAM_PROVISIONNER:
				setHostRamProvisionner(HOST_RAM_PROVISIONNER_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_BW_PROVISIONNER:
				setHostBwProvisionner(HOST_BW_PROVISIONNER_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_STORAGE:
				setHostStorage(HOST_STORAGE_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_CORES:
				setHostCores(HOST_CORES_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_VM_SCHEDULER:
				setHostVmScheduler(HOST_VM_SCHEDULER_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_RAM:
				setHostRam(HOST_RAM_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_MIPS:
				setHostMips(HOST_MIPS_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_BW:
				setHostBw(HOST_BW_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_PE_PROVISIONNER:
				setHostPeProvisionner(HOST_PE_PROVISIONNER_EDEFAULT);
				return;
			case SimulationPackage.HOST__HOST_ELASTICITY:
				setHostElasticity(HOST_ELASTICITY_EDEFAULT);
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
			case SimulationPackage.HOST__HOST_ID:
				return HOST_ID_EDEFAULT == null ? hostId != null : !HOST_ID_EDEFAULT.equals(hostId);
			case SimulationPackage.HOST__HOST_RAM_PROVISIONNER:
				return hostRamProvisionner != HOST_RAM_PROVISIONNER_EDEFAULT;
			case SimulationPackage.HOST__HOST_BW_PROVISIONNER:
				return hostBwProvisionner != HOST_BW_PROVISIONNER_EDEFAULT;
			case SimulationPackage.HOST__HOST_STORAGE:
				return HOST_STORAGE_EDEFAULT == null ? hostStorage != null : !HOST_STORAGE_EDEFAULT.equals(hostStorage);
			case SimulationPackage.HOST__HOST_CORES:
				return HOST_CORES_EDEFAULT == null ? hostCores != null : !HOST_CORES_EDEFAULT.equals(hostCores);
			case SimulationPackage.HOST__HOST_VM_SCHEDULER:
				return hostVmScheduler != HOST_VM_SCHEDULER_EDEFAULT;
			case SimulationPackage.HOST__HOST_RAM:
				return HOST_RAM_EDEFAULT == null ? hostRam != null : !HOST_RAM_EDEFAULT.equals(hostRam);
			case SimulationPackage.HOST__HOST_MIPS:
				return HOST_MIPS_EDEFAULT == null ? hostMips != null : !HOST_MIPS_EDEFAULT.equals(hostMips);
			case SimulationPackage.HOST__HOST_BW:
				return HOST_BW_EDEFAULT == null ? hostBw != null : !HOST_BW_EDEFAULT.equals(hostBw);
			case SimulationPackage.HOST__HOST_PE_PROVISIONNER:
				return hostPeProvisionner != HOST_PE_PROVISIONNER_EDEFAULT;
			case SimulationPackage.HOST__HOST_ELASTICITY:
				return hostElasticity != HOST_ELASTICITY_EDEFAULT;
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
		result.append(" (hostId: ");
		result.append(hostId);
		result.append(", hostRamProvisionner: ");
		result.append(hostRamProvisionner);
		result.append(", hostBwProvisionner: ");
		result.append(hostBwProvisionner);
		result.append(", hostStorage: ");
		result.append(hostStorage);
		result.append(", hostCores: ");
		result.append(hostCores);
		result.append(", hostVmScheduler: ");
		result.append(hostVmScheduler);
		result.append(", hostRam: ");
		result.append(hostRam);
		result.append(", hostMips: ");
		result.append(hostMips);
		result.append(", hostBw: ");
		result.append(hostBw);
		result.append(", hostPeProvisionner: ");
		result.append(hostPeProvisionner);
		result.append(", hostElasticity: ");
		result.append(hostElasticity);
		result.append(')');
		return result.toString();
	}

} //HostImpl
