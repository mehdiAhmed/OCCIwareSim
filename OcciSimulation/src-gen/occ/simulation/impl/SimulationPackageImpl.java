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
import occ.simulation.Cloudlet;
import occ.simulation.CloudletScheduler;
import occ.simulation.Datacenter;
import occ.simulation.ElasticityType;
import occ.simulation.Harddrive;
import occ.simulation.Host;
import occ.simulation.Ondemand;
import occ.simulation.PeProvisionner;
import occ.simulation.Pricestrategy;
import occ.simulation.RamProvisionner;
import occ.simulation.Sanstorage;
import occ.simulation.SimulationFactory;
import occ.simulation.SimulationPackage;
import occ.simulation.Spot;
import occ.simulation.Upfront;
import occ.simulation.Vm;
import occ.simulation.VmScheduler;

import occ.simulation.util.SimulationValidator;

import occ.simulation.utilizationModel;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationPackageImpl extends EPackageImpl implements SimulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datacenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass harddriveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sanstorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricestrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ondemandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upfrontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elasticityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudletSchedulerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum utilizationModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vmSchedulerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum peProvisionnerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ramProvisionnerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bwProvisionnerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see occ.simulation.SimulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimulationPackageImpl() {
		super(eNS_URI, SimulationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SimulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimulationPackage init() {
		if (isInited) return (SimulationPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimulationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimulationPackageImpl theSimulationPackage = registeredSimulationPackage instanceof SimulationPackageImpl ? (SimulationPackageImpl)registeredSimulationPackage : new SimulationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimulationPackage.createPackageContents();

		// Initialize created meta-data
		theSimulationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSimulationPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SimulationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSimulationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimulationPackage.eNS_URI, theSimulationPackage);
		return theSimulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatacenter() {
		return datacenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterOs() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterLocation() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterTimezone() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterCostMem() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterCostBw() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterCostStorge() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterCostProcess() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterVmm() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_DatacenterName() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVm() {
		return vmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmId() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmMips() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmCores() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmImageSize() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmBw() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmRam() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmOs() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmCloudletScheduler() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmElasticity() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_VmVmm() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHost() {
		return hostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostId() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostRamProvisionner() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostBwProvisionner() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostStorage() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostCores() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostVmScheduler() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostRam() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostMips() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostBw() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostPeProvisionner() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_HostElasticity() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudlet() {
		return cloudletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletId() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletLength() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletCores() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletFileSize() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletOutputSize() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletUtilizationModelCpu() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletUtilizationModelRam() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletUtilizationModelBw() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHarddrive() {
		return harddriveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSanstorage() {
		return sanstorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSanstorage_Bandwith() {
		return (EAttribute)sanstorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSanstorage_Latency() {
		return (EAttribute)sanstorageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPricestrategy() {
		return pricestrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPricestrategy__AppliesConstraint__DiagnosticChain_Map() {
		return pricestrategyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpot() {
		return spotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOndemand() {
		return ondemandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpfront() {
		return upfrontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElasticityType() {
		return elasticityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloudletScheduler() {
		return cloudletSchedulerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getutilizationModel() {
		return utilizationModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVmScheduler() {
		return vmSchedulerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPeProvisionner() {
		return peProvisionnerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRamProvisionner() {
		return ramProvisionnerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBwProvisionner() {
		return bwProvisionnerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getdouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLong() {
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationFactory getSimulationFactory() {
		return (SimulationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		datacenterEClass = createEClass(DATACENTER);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_OS);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_LOCATION);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_TIMEZONE);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_COST_MEM);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_COST_BW);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_COST_STORGE);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_COST_PROCESS);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_VMM);
		createEAttribute(datacenterEClass, DATACENTER__DATACENTER_NAME);

		vmEClass = createEClass(VM);
		createEAttribute(vmEClass, VM__VM_ID);
		createEAttribute(vmEClass, VM__VM_MIPS);
		createEAttribute(vmEClass, VM__VM_CORES);
		createEAttribute(vmEClass, VM__VM_IMAGE_SIZE);
		createEAttribute(vmEClass, VM__VM_BW);
		createEAttribute(vmEClass, VM__VM_RAM);
		createEAttribute(vmEClass, VM__VM_OS);
		createEAttribute(vmEClass, VM__VM_CLOUDLET_SCHEDULER);
		createEAttribute(vmEClass, VM__VM_ELASTICITY);
		createEAttribute(vmEClass, VM__VM_VMM);

		hostEClass = createEClass(HOST);
		createEAttribute(hostEClass, HOST__HOST_ID);
		createEAttribute(hostEClass, HOST__HOST_RAM_PROVISIONNER);
		createEAttribute(hostEClass, HOST__HOST_BW_PROVISIONNER);
		createEAttribute(hostEClass, HOST__HOST_STORAGE);
		createEAttribute(hostEClass, HOST__HOST_CORES);
		createEAttribute(hostEClass, HOST__HOST_VM_SCHEDULER);
		createEAttribute(hostEClass, HOST__HOST_RAM);
		createEAttribute(hostEClass, HOST__HOST_MIPS);
		createEAttribute(hostEClass, HOST__HOST_BW);
		createEAttribute(hostEClass, HOST__HOST_PE_PROVISIONNER);
		createEAttribute(hostEClass, HOST__HOST_ELASTICITY);

		cloudletEClass = createEClass(CLOUDLET);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_ID);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_LENGTH);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_CORES);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_FILE_SIZE);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_OUTPUT_SIZE);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW);

		harddriveEClass = createEClass(HARDDRIVE);

		sanstorageEClass = createEClass(SANSTORAGE);
		createEAttribute(sanstorageEClass, SANSTORAGE__BANDWITH);
		createEAttribute(sanstorageEClass, SANSTORAGE__LATENCY);

		pricestrategyEClass = createEClass(PRICESTRATEGY);
		createEOperation(pricestrategyEClass, PRICESTRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		spotEClass = createEClass(SPOT);

		ondemandEClass = createEClass(ONDEMAND);

		upfrontEClass = createEClass(UPFRONT);

		// Create enums
		elasticityTypeEEnum = createEEnum(ELASTICITY_TYPE);
		cloudletSchedulerEEnum = createEEnum(CLOUDLET_SCHEDULER);
		utilizationModelEEnum = createEEnum(UTILIZATION_MODEL);
		vmSchedulerEEnum = createEEnum(VM_SCHEDULER);
		peProvisionnerEEnum = createEEnum(PE_PROVISIONNER);
		ramProvisionnerEEnum = createEEnum(RAM_PROVISIONNER);
		bwProvisionnerEEnum = createEEnum(BW_PROVISIONNER);

		// Create data types
		doubleEDataType = createEDataType(DOUBLE);
		longEDataType = createEDataType(LONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		datacenterEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		vmEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		hostEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		cloudletEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		harddriveEClass.getESuperTypes().add(theInfrastructurePackage.getStorage());
		sanstorageEClass.getESuperTypes().add(theInfrastructurePackage.getStorage());
		pricestrategyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		spotEClass.getESuperTypes().add(this.getPricestrategy());
		spotEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ondemandEClass.getESuperTypes().add(this.getPricestrategy());
		ondemandEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		upfrontEClass.getESuperTypes().add(this.getPricestrategy());
		upfrontEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(datacenterEClass, Datacenter.class, "Datacenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatacenter_DatacenterOs(), theOCCIPackage.getString(), "datacenterOs", "Linux", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_DatacenterLocation(), theOCCIPackage.getString(), "datacenterLocation", "US East (N. Virginia)", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_DatacenterTimezone(), this.getdouble(), "datacenterTimezone", "10.0", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_DatacenterCostMem(), this.getdouble(), "datacenterCostMem", "0.05", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_DatacenterCostBw(), this.getdouble(), "datacenterCostBw", "0.0", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_DatacenterCostStorge(), this.getdouble(), "datacenterCostStorge", "0.001", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_DatacenterCostProcess(), this.getdouble(), "datacenterCostProcess", "3.0", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_DatacenterVmm(), theOCCIPackage.getString(), "datacenterVmm", "Xen", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_DatacenterName(), theOCCIPackage.getString(), "datacenterName", "datacenter", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmEClass, Vm.class, "Vm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVm_VmId(), theOCCIPackage.getInteger(), "vmId", "0", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmMips(), theOCCIPackage.getInteger(), "vmMips", "1000", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmCores(), theOCCIPackage.getInteger(), "vmCores", "1", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmImageSize(), this.getLong(), "vmImageSize", "10000", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmBw(), this.getLong(), "vmBw", "1000", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmRam(), theOCCIPackage.getInteger(), "vmRam", "512", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmOs(), theOCCIPackage.getString(), "vmOs", "Linux", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmCloudletScheduler(), this.getCloudletScheduler(), "vmCloudletScheduler", "CloudletSchedulerTimeShared", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmElasticity(), this.getElasticityType(), "vmElasticity", "None", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_VmVmm(), theOCCIPackage.getString(), "vmVmm", "Xen", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHost_HostId(), theOCCIPackage.getInteger(), "hostId", "0", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostRamProvisionner(), this.getRamProvisionner(), "hostRamProvisionner", "RamProvisionerSimple", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostBwProvisionner(), this.getBwProvisionner(), "hostBwProvisionner", "BwProvisionerSimple", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostStorage(), this.getLong(), "hostStorage", "1000000", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostCores(), theOCCIPackage.getInteger(), "hostCores", "1", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostVmScheduler(), this.getVmScheduler(), "hostVmScheduler", "VmSchedulerTimeShared", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostRam(), theOCCIPackage.getInteger(), "hostRam", "2048", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostMips(), theOCCIPackage.getInteger(), "hostMips", "1000", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostBw(), theOCCIPackage.getInteger(), "hostBw", "10000", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostPeProvisionner(), this.getPeProvisionner(), "hostPeProvisionner", "PeProvisionerSimple", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_HostElasticity(), this.getElasticityType(), "hostElasticity", "None", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudletEClass, Cloudlet.class, "Cloudlet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudlet_CloudletId(), theOCCIPackage.getInteger(), "cloudletId", "0", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletLength(), this.getLong(), "cloudletLength", "400000", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletCores(), theOCCIPackage.getInteger(), "cloudletCores", "1", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletFileSize(), this.getLong(), "cloudletFileSize", "300", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletOutputSize(), this.getLong(), "cloudletOutputSize", "300", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletUtilizationModelCpu(), this.getutilizationModel(), "cloudletUtilizationModelCpu", "UtilizationModelFull", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletUtilizationModelRam(), this.getutilizationModel(), "cloudletUtilizationModelRam", "UtilizationModelFull", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletUtilizationModelBw(), this.getutilizationModel(), "cloudletUtilizationModelBw", "UtilizationModelFull", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(harddriveEClass, Harddrive.class, "Harddrive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sanstorageEClass, Sanstorage.class, "Sanstorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSanstorage_Bandwith(), theOCCIPackage.getInteger(), "bandwith", null, 0, 1, Sanstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSanstorage_Latency(), this.getdouble(), "latency", null, 0, 1, Sanstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pricestrategyEClass, Pricestrategy.class, "Pricestrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getPricestrategy__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(spotEClass, Spot.class, "Spot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ondemandEClass, Ondemand.class, "Ondemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(upfrontEClass, Upfront.class, "Upfront", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(elasticityTypeEEnum, ElasticityType.class, "ElasticityType");
		addEEnumLiteral(elasticityTypeEEnum, ElasticityType.NONE);
		addEEnumLiteral(elasticityTypeEEnum, ElasticityType.VERTICAL);
		addEEnumLiteral(elasticityTypeEEnum, ElasticityType.HORIZONTAL);

		initEEnum(cloudletSchedulerEEnum, CloudletScheduler.class, "CloudletScheduler");
		addEEnumLiteral(cloudletSchedulerEEnum, CloudletScheduler.CLOUDLET_SCHEDULER_SPACE_SHARED);
		addEEnumLiteral(cloudletSchedulerEEnum, CloudletScheduler.CLOUDLET_SCHEDULER_TIME_SHARED);

		initEEnum(utilizationModelEEnum, utilizationModel.class, "utilizationModel");
		addEEnumLiteral(utilizationModelEEnum, utilizationModel.UTILIZATION_MODEL_FULL);
		addEEnumLiteral(utilizationModelEEnum, utilizationModel.UTILIZATION_MODEL_NULL);
		addEEnumLiteral(utilizationModelEEnum, utilizationModel.UTILIZATION_MODEL_PLANET_LAB_IN_MEMORY);
		addEEnumLiteral(utilizationModelEEnum, utilizationModel.UTILIZATION_MODEL_STOCHASTIC);

		initEEnum(vmSchedulerEEnum, VmScheduler.class, "VmScheduler");
		addEEnumLiteral(vmSchedulerEEnum, VmScheduler.VM_SCHEDULER_SPACE_SHARED);
		addEEnumLiteral(vmSchedulerEEnum, VmScheduler.VM_SCHEDULER_TIME_SHARED);

		initEEnum(peProvisionnerEEnum, PeProvisionner.class, "PeProvisionner");
		addEEnumLiteral(peProvisionnerEEnum, PeProvisionner.PE_PROVISIONER_SIMPLE);

		initEEnum(ramProvisionnerEEnum, RamProvisionner.class, "RamProvisionner");
		addEEnumLiteral(ramProvisionnerEEnum, RamProvisionner.RAM_PROVISIONER_SIMPLE);

		initEEnum(bwProvisionnerEEnum, BwProvisionner.class, "BwProvisionner");
		addEEnumLiteral(bwProvisionnerEEnum, BwProvisionner.BW_PROVISIONER_SIMPLE);

		// Initialize data types
		initEDataType(doubleEDataType, Double.class, "double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longEDataType, Long.class, "Long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (pricestrategyEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
	}

} //SimulationPackageImpl
