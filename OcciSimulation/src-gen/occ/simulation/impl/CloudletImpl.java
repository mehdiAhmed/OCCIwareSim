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

import occ.simulation.Cloudlet;
import occ.simulation.SimulationPackage;
import occ.simulation.utilizationModel;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloudlet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link occ.simulation.impl.CloudletImpl#getCloudletId <em>Cloudlet Id</em>}</li>
 *   <li>{@link occ.simulation.impl.CloudletImpl#getCloudletLength <em>Cloudlet Length</em>}</li>
 *   <li>{@link occ.simulation.impl.CloudletImpl#getCloudletCores <em>Cloudlet Cores</em>}</li>
 *   <li>{@link occ.simulation.impl.CloudletImpl#getCloudletFileSize <em>Cloudlet File Size</em>}</li>
 *   <li>{@link occ.simulation.impl.CloudletImpl#getCloudletOutputSize <em>Cloudlet Output Size</em>}</li>
 *   <li>{@link occ.simulation.impl.CloudletImpl#getCloudletUtilizationModelCpu <em>Cloudlet Utilization Model Cpu</em>}</li>
 *   <li>{@link occ.simulation.impl.CloudletImpl#getCloudletUtilizationModelRam <em>Cloudlet Utilization Model Ram</em>}</li>
 *   <li>{@link occ.simulation.impl.CloudletImpl#getCloudletUtilizationModelBw <em>Cloudlet Utilization Model Bw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudletImpl extends ComputeImpl implements Cloudlet {
	/**
	 * The default value of the '{@link #getCloudletId() <em>Cloudlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLOUDLET_ID_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getCloudletId() <em>Cloudlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletId()
	 * @generated
	 * @ordered
	 */
	protected Integer cloudletId = CLOUDLET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletLength() <em>Cloudlet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOUDLET_LENGTH_EDEFAULT = new Long(400000L);

	/**
	 * The cached value of the '{@link #getCloudletLength() <em>Cloudlet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletLength()
	 * @generated
	 * @ordered
	 */
	protected Long cloudletLength = CLOUDLET_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletCores() <em>Cloudlet Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLOUDLET_CORES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getCloudletCores() <em>Cloudlet Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletCores()
	 * @generated
	 * @ordered
	 */
	protected Integer cloudletCores = CLOUDLET_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletFileSize() <em>Cloudlet File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOUDLET_FILE_SIZE_EDEFAULT = new Long(300L);

	/**
	 * The cached value of the '{@link #getCloudletFileSize() <em>Cloudlet File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletFileSize()
	 * @generated
	 * @ordered
	 */
	protected Long cloudletFileSize = CLOUDLET_FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletOutputSize() <em>Cloudlet Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletOutputSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOUDLET_OUTPUT_SIZE_EDEFAULT = new Long(300L);

	/**
	 * The cached value of the '{@link #getCloudletOutputSize() <em>Cloudlet Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletOutputSize()
	 * @generated
	 * @ordered
	 */
	protected Long cloudletOutputSize = CLOUDLET_OUTPUT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletUtilizationModelCpu() <em>Cloudlet Utilization Model Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletUtilizationModelCpu()
	 * @generated
	 * @ordered
	 */
	protected static final utilizationModel CLOUDLET_UTILIZATION_MODEL_CPU_EDEFAULT = utilizationModel.UTILIZATION_MODEL_FULL;

	/**
	 * The cached value of the '{@link #getCloudletUtilizationModelCpu() <em>Cloudlet Utilization Model Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletUtilizationModelCpu()
	 * @generated
	 * @ordered
	 */
	protected utilizationModel cloudletUtilizationModelCpu = CLOUDLET_UTILIZATION_MODEL_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletUtilizationModelRam() <em>Cloudlet Utilization Model Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletUtilizationModelRam()
	 * @generated
	 * @ordered
	 */
	protected static final utilizationModel CLOUDLET_UTILIZATION_MODEL_RAM_EDEFAULT = utilizationModel.UTILIZATION_MODEL_FULL;

	/**
	 * The cached value of the '{@link #getCloudletUtilizationModelRam() <em>Cloudlet Utilization Model Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletUtilizationModelRam()
	 * @generated
	 * @ordered
	 */
	protected utilizationModel cloudletUtilizationModelRam = CLOUDLET_UTILIZATION_MODEL_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletUtilizationModelBw() <em>Cloudlet Utilization Model Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletUtilizationModelBw()
	 * @generated
	 * @ordered
	 */
	protected static final utilizationModel CLOUDLET_UTILIZATION_MODEL_BW_EDEFAULT = utilizationModel.UTILIZATION_MODEL_FULL;

	/**
	 * The cached value of the '{@link #getCloudletUtilizationModelBw() <em>Cloudlet Utilization Model Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletUtilizationModelBw()
	 * @generated
	 * @ordered
	 */
	protected utilizationModel cloudletUtilizationModelBw = CLOUDLET_UTILIZATION_MODEL_BW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.CLOUDLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCloudletId() {
		return cloudletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletId(Integer newCloudletId) {
		Integer oldCloudletId = cloudletId;
		cloudletId = newCloudletId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_ID, oldCloudletId, cloudletId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCloudletLength() {
		return cloudletLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletLength(Long newCloudletLength) {
		Long oldCloudletLength = cloudletLength;
		cloudletLength = newCloudletLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_LENGTH, oldCloudletLength, cloudletLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCloudletCores() {
		return cloudletCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletCores(Integer newCloudletCores) {
		Integer oldCloudletCores = cloudletCores;
		cloudletCores = newCloudletCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_CORES, oldCloudletCores, cloudletCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCloudletFileSize() {
		return cloudletFileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletFileSize(Long newCloudletFileSize) {
		Long oldCloudletFileSize = cloudletFileSize;
		cloudletFileSize = newCloudletFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE, oldCloudletFileSize, cloudletFileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCloudletOutputSize() {
		return cloudletOutputSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletOutputSize(Long newCloudletOutputSize) {
		Long oldCloudletOutputSize = cloudletOutputSize;
		cloudletOutputSize = newCloudletOutputSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE, oldCloudletOutputSize, cloudletOutputSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public utilizationModel getCloudletUtilizationModelCpu() {
		return cloudletUtilizationModelCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletUtilizationModelCpu(utilizationModel newCloudletUtilizationModelCpu) {
		utilizationModel oldCloudletUtilizationModelCpu = cloudletUtilizationModelCpu;
		cloudletUtilizationModelCpu = newCloudletUtilizationModelCpu == null ? CLOUDLET_UTILIZATION_MODEL_CPU_EDEFAULT : newCloudletUtilizationModelCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU, oldCloudletUtilizationModelCpu, cloudletUtilizationModelCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public utilizationModel getCloudletUtilizationModelRam() {
		return cloudletUtilizationModelRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletUtilizationModelRam(utilizationModel newCloudletUtilizationModelRam) {
		utilizationModel oldCloudletUtilizationModelRam = cloudletUtilizationModelRam;
		cloudletUtilizationModelRam = newCloudletUtilizationModelRam == null ? CLOUDLET_UTILIZATION_MODEL_RAM_EDEFAULT : newCloudletUtilizationModelRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM, oldCloudletUtilizationModelRam, cloudletUtilizationModelRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public utilizationModel getCloudletUtilizationModelBw() {
		return cloudletUtilizationModelBw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletUtilizationModelBw(utilizationModel newCloudletUtilizationModelBw) {
		utilizationModel oldCloudletUtilizationModelBw = cloudletUtilizationModelBw;
		cloudletUtilizationModelBw = newCloudletUtilizationModelBw == null ? CLOUDLET_UTILIZATION_MODEL_BW_EDEFAULT : newCloudletUtilizationModelBw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW, oldCloudletUtilizationModelBw, cloudletUtilizationModelBw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
				return getCloudletId();
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
				return getCloudletLength();
			case SimulationPackage.CLOUDLET__CLOUDLET_CORES:
				return getCloudletCores();
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
				return getCloudletFileSize();
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
				return getCloudletOutputSize();
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU:
				return getCloudletUtilizationModelCpu();
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM:
				return getCloudletUtilizationModelRam();
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW:
				return getCloudletUtilizationModelBw();
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
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
				setCloudletId((Integer)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
				setCloudletLength((Long)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_CORES:
				setCloudletCores((Integer)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
				setCloudletFileSize((Long)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
				setCloudletOutputSize((Long)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU:
				setCloudletUtilizationModelCpu((utilizationModel)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM:
				setCloudletUtilizationModelRam((utilizationModel)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW:
				setCloudletUtilizationModelBw((utilizationModel)newValue);
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
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
				setCloudletId(CLOUDLET_ID_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
				setCloudletLength(CLOUDLET_LENGTH_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_CORES:
				setCloudletCores(CLOUDLET_CORES_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
				setCloudletFileSize(CLOUDLET_FILE_SIZE_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
				setCloudletOutputSize(CLOUDLET_OUTPUT_SIZE_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU:
				setCloudletUtilizationModelCpu(CLOUDLET_UTILIZATION_MODEL_CPU_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM:
				setCloudletUtilizationModelRam(CLOUDLET_UTILIZATION_MODEL_RAM_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW:
				setCloudletUtilizationModelBw(CLOUDLET_UTILIZATION_MODEL_BW_EDEFAULT);
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
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
				return CLOUDLET_ID_EDEFAULT == null ? cloudletId != null : !CLOUDLET_ID_EDEFAULT.equals(cloudletId);
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
				return CLOUDLET_LENGTH_EDEFAULT == null ? cloudletLength != null : !CLOUDLET_LENGTH_EDEFAULT.equals(cloudletLength);
			case SimulationPackage.CLOUDLET__CLOUDLET_CORES:
				return CLOUDLET_CORES_EDEFAULT == null ? cloudletCores != null : !CLOUDLET_CORES_EDEFAULT.equals(cloudletCores);
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
				return CLOUDLET_FILE_SIZE_EDEFAULT == null ? cloudletFileSize != null : !CLOUDLET_FILE_SIZE_EDEFAULT.equals(cloudletFileSize);
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
				return CLOUDLET_OUTPUT_SIZE_EDEFAULT == null ? cloudletOutputSize != null : !CLOUDLET_OUTPUT_SIZE_EDEFAULT.equals(cloudletOutputSize);
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU:
				return cloudletUtilizationModelCpu != CLOUDLET_UTILIZATION_MODEL_CPU_EDEFAULT;
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM:
				return cloudletUtilizationModelRam != CLOUDLET_UTILIZATION_MODEL_RAM_EDEFAULT;
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW:
				return cloudletUtilizationModelBw != CLOUDLET_UTILIZATION_MODEL_BW_EDEFAULT;
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
		result.append(" (cloudletId: ");
		result.append(cloudletId);
		result.append(", cloudletLength: ");
		result.append(cloudletLength);
		result.append(", cloudletCores: ");
		result.append(cloudletCores);
		result.append(", cloudletFileSize: ");
		result.append(cloudletFileSize);
		result.append(", cloudletOutputSize: ");
		result.append(cloudletOutputSize);
		result.append(", cloudletUtilizationModelCpu: ");
		result.append(cloudletUtilizationModelCpu);
		result.append(", cloudletUtilizationModelRam: ");
		result.append(cloudletUtilizationModelRam);
		result.append(", cloudletUtilizationModelBw: ");
		result.append(cloudletUtilizationModelBw);
		result.append(')');
		return result.toString();
	}

} //CloudletImpl
