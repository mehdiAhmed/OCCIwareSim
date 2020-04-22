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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see occ.simulation.SimulationFactory
 * @model kind="package"
 * @generated
 */
public interface SimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/simulation/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulationPackage eINSTANCE = occ.simulation.impl.SimulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link occ.simulation.impl.DatacenterImpl <em>Datacenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.DatacenterImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getDatacenter()
	 * @generated
	 */
	int DATACENTER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Datacenter Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_OS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datacenter Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_LOCATION = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datacenter Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_TIMEZONE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datacenter Cost Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_COST_MEM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datacenter Cost Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_COST_BW = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datacenter Cost Storge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_COST_STORGE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Datacenter Cost Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_COST_PROCESS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Datacenter Vmm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_VMM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Datacenter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__DATACENTER_NAME = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Datacenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Datacenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.VmImpl <em>Vm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.VmImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getVm()
	 * @generated
	 */
	int VM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Vm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vm Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_MIPS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vm Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_CORES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vm Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_IMAGE_SIZE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vm Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_BW = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vm Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_RAM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vm Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_OS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vm Cloudlet Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_CLOUDLET_SCHEDULER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Vm Elasticity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_ELASTICITY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Vm Vmm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_VMM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Vm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Vm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.HostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.HostImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getHost()
	 * @generated
	 */
	int HOST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Host Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host Ram Provisionner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_RAM_PROVISIONNER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host Bw Provisionner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_BW_PROVISIONNER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_STORAGE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_CORES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Host Vm Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_VM_SCHEDULER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Host Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_RAM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Host Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_MIPS = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Host Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_BW = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Host Pe Provisionner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_PE_PROVISIONNER = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Host Elasticity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__HOST_ELASTICITY = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.CloudletImpl <em>Cloudlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.CloudletImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getCloudlet()
	 * @generated
	 */
	int CLOUDLET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Cloudlet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_ID = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloudlet Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_LENGTH = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cloudlet Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_CORES = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cloudlet File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_FILE_SIZE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cloudlet Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_OUTPUT_SIZE = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cloudlet Utilization Model Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cloudlet Utilization Model Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cloudlet Utilization Model Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Cloudlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Cloudlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.HarddriveImpl <em>Harddrive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.HarddriveImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getHarddrive()
	 * @generated
	 */
	int HARDDRIVE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__LOCATION = InfrastructurePackage.STORAGE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__PARTS = InfrastructurePackage.STORAGE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__RLINKS = InfrastructurePackage.STORAGE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__OCCI_STORAGE_SIZE = InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Occi Storage State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__OCCI_STORAGE_STATE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Storage State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE__OCCI_STORAGE_STATE_MESSAGE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Harddrive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Harddrive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVE_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.SanstorageImpl <em>Sanstorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.SanstorageImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getSanstorage()
	 * @generated
	 */
	int SANSTORAGE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__LOCATION = InfrastructurePackage.STORAGE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__PARTS = InfrastructurePackage.STORAGE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__RLINKS = InfrastructurePackage.STORAGE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__OCCI_STORAGE_SIZE = InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Occi Storage State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__OCCI_STORAGE_STATE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Storage State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__OCCI_STORAGE_STATE_MESSAGE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Bandwith</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__BANDWITH = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__LATENCY = InfrastructurePackage.STORAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sanstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Sanstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.PricestrategyImpl <em>Pricestrategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.PricestrategyImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getPricestrategy()
	 * @generated
	 */
	int PRICESTRATEGY = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGY__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGY__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGY__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Pricestrategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGY_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pricestrategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGY_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.SpotImpl <em>Spot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.SpotImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getSpot()
	 * @generated
	 */
	int SPOT = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT__MIXIN = PRICESTRATEGY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT__ENTITY = PRICESTRATEGY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT__ATTRIBUTES = PRICESTRATEGY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Spot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_FEATURE_COUNT = PRICESTRATEGY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = PRICESTRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Spot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOT_OPERATION_COUNT = PRICESTRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.OndemandImpl <em>Ondemand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.OndemandImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getOndemand()
	 * @generated
	 */
	int ONDEMAND = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND__MIXIN = PRICESTRATEGY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND__ENTITY = PRICESTRATEGY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND__ATTRIBUTES = PRICESTRATEGY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Ondemand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND_FEATURE_COUNT = PRICESTRATEGY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = PRICESTRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Ondemand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND_OPERATION_COUNT = PRICESTRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.impl.UpfrontImpl <em>Upfront</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.impl.UpfrontImpl
	 * @see occ.simulation.impl.SimulationPackageImpl#getUpfront()
	 * @generated
	 */
	int UPFRONT = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT__MIXIN = PRICESTRATEGY__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT__ENTITY = PRICESTRATEGY__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT__ATTRIBUTES = PRICESTRATEGY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Upfront</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT_FEATURE_COUNT = PRICESTRATEGY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = PRICESTRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Upfront</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT_OPERATION_COUNT = PRICESTRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link occ.simulation.ElasticityType <em>Elasticity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.ElasticityType
	 * @see occ.simulation.impl.SimulationPackageImpl#getElasticityType()
	 * @generated
	 */
	int ELASTICITY_TYPE = 10;

	/**
	 * The meta object id for the '{@link occ.simulation.CloudletScheduler <em>Cloudlet Scheduler</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.CloudletScheduler
	 * @see occ.simulation.impl.SimulationPackageImpl#getCloudletScheduler()
	 * @generated
	 */
	int CLOUDLET_SCHEDULER = 11;

	/**
	 * The meta object id for the '{@link occ.simulation.utilizationModel <em>utilization Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.utilizationModel
	 * @see occ.simulation.impl.SimulationPackageImpl#getutilizationModel()
	 * @generated
	 */
	int UTILIZATION_MODEL = 12;

	/**
	 * The meta object id for the '{@link occ.simulation.VmScheduler <em>Vm Scheduler</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.VmScheduler
	 * @see occ.simulation.impl.SimulationPackageImpl#getVmScheduler()
	 * @generated
	 */
	int VM_SCHEDULER = 13;

	/**
	 * The meta object id for the '{@link occ.simulation.PeProvisionner <em>Pe Provisionner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.PeProvisionner
	 * @see occ.simulation.impl.SimulationPackageImpl#getPeProvisionner()
	 * @generated
	 */
	int PE_PROVISIONNER = 14;

	/**
	 * The meta object id for the '{@link occ.simulation.RamProvisionner <em>Ram Provisionner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.RamProvisionner
	 * @see occ.simulation.impl.SimulationPackageImpl#getRamProvisionner()
	 * @generated
	 */
	int RAM_PROVISIONNER = 15;

	/**
	 * The meta object id for the '{@link occ.simulation.BwProvisionner <em>Bw Provisionner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see occ.simulation.BwProvisionner
	 * @see occ.simulation.impl.SimulationPackageImpl#getBwProvisionner()
	 * @generated
	 */
	int BW_PROVISIONNER = 16;

	/**
	 * The meta object id for the '<em>double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see occ.simulation.impl.SimulationPackageImpl#getdouble()
	 * @generated
	 */
	int DOUBLE = 17;

	/**
	 * The meta object id for the '<em>Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see occ.simulation.impl.SimulationPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 18;


	/**
	 * Returns the meta object for class '{@link occ.simulation.Datacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datacenter</em>'.
	 * @see occ.simulation.Datacenter
	 * @generated
	 */
	EClass getDatacenter();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterOs <em>Datacenter Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Os</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterOs()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterOs();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterLocation <em>Datacenter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Location</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterLocation()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterLocation();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterTimezone <em>Datacenter Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Timezone</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterTimezone()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterTimezone();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterCostMem <em>Datacenter Cost Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Cost Mem</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterCostMem()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterCostMem();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterCostBw <em>Datacenter Cost Bw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Cost Bw</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterCostBw()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterCostBw();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterCostStorge <em>Datacenter Cost Storge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Cost Storge</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterCostStorge()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterCostStorge();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterCostProcess <em>Datacenter Cost Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Cost Process</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterCostProcess()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterCostProcess();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterVmm <em>Datacenter Vmm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Vmm</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterVmm()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterVmm();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Datacenter#getDatacenterName <em>Datacenter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datacenter Name</em>'.
	 * @see occ.simulation.Datacenter#getDatacenterName()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_DatacenterName();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Vm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vm</em>'.
	 * @see occ.simulation.Vm
	 * @generated
	 */
	EClass getVm();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmId <em>Vm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Id</em>'.
	 * @see occ.simulation.Vm#getVmId()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmId();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmMips <em>Vm Mips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Mips</em>'.
	 * @see occ.simulation.Vm#getVmMips()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmMips();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmCores <em>Vm Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Cores</em>'.
	 * @see occ.simulation.Vm#getVmCores()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmCores();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmImageSize <em>Vm Image Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Image Size</em>'.
	 * @see occ.simulation.Vm#getVmImageSize()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmImageSize();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmBw <em>Vm Bw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Bw</em>'.
	 * @see occ.simulation.Vm#getVmBw()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmBw();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmRam <em>Vm Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Ram</em>'.
	 * @see occ.simulation.Vm#getVmRam()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmRam();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmOs <em>Vm Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Os</em>'.
	 * @see occ.simulation.Vm#getVmOs()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmOs();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmCloudletScheduler <em>Vm Cloudlet Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Cloudlet Scheduler</em>'.
	 * @see occ.simulation.Vm#getVmCloudletScheduler()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmCloudletScheduler();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmElasticity <em>Vm Elasticity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Elasticity</em>'.
	 * @see occ.simulation.Vm#getVmElasticity()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmElasticity();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Vm#getVmVmm <em>Vm Vmm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Vmm</em>'.
	 * @see occ.simulation.Vm#getVmVmm()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_VmVmm();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see occ.simulation.Host
	 * @generated
	 */
	EClass getHost();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostId <em>Host Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Id</em>'.
	 * @see occ.simulation.Host#getHostId()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostId();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostRamProvisionner <em>Host Ram Provisionner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Ram Provisionner</em>'.
	 * @see occ.simulation.Host#getHostRamProvisionner()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostRamProvisionner();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostBwProvisionner <em>Host Bw Provisionner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Bw Provisionner</em>'.
	 * @see occ.simulation.Host#getHostBwProvisionner()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostBwProvisionner();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostStorage <em>Host Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Storage</em>'.
	 * @see occ.simulation.Host#getHostStorage()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostStorage();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostCores <em>Host Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Cores</em>'.
	 * @see occ.simulation.Host#getHostCores()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostCores();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostVmScheduler <em>Host Vm Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Vm Scheduler</em>'.
	 * @see occ.simulation.Host#getHostVmScheduler()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostVmScheduler();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostRam <em>Host Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Ram</em>'.
	 * @see occ.simulation.Host#getHostRam()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostRam();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostMips <em>Host Mips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Mips</em>'.
	 * @see occ.simulation.Host#getHostMips()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostMips();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostBw <em>Host Bw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Bw</em>'.
	 * @see occ.simulation.Host#getHostBw()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostBw();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostPeProvisionner <em>Host Pe Provisionner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Pe Provisionner</em>'.
	 * @see occ.simulation.Host#getHostPeProvisionner()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostPeProvisionner();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Host#getHostElasticity <em>Host Elasticity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Elasticity</em>'.
	 * @see occ.simulation.Host#getHostElasticity()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_HostElasticity();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Cloudlet <em>Cloudlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudlet</em>'.
	 * @see occ.simulation.Cloudlet
	 * @generated
	 */
	EClass getCloudlet();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Cloudlet#getCloudletId <em>Cloudlet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Id</em>'.
	 * @see occ.simulation.Cloudlet#getCloudletId()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletId();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Cloudlet#getCloudletLength <em>Cloudlet Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Length</em>'.
	 * @see occ.simulation.Cloudlet#getCloudletLength()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletLength();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Cloudlet#getCloudletCores <em>Cloudlet Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Cores</em>'.
	 * @see occ.simulation.Cloudlet#getCloudletCores()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletCores();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Cloudlet#getCloudletFileSize <em>Cloudlet File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet File Size</em>'.
	 * @see occ.simulation.Cloudlet#getCloudletFileSize()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletFileSize();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Cloudlet#getCloudletOutputSize <em>Cloudlet Output Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Output Size</em>'.
	 * @see occ.simulation.Cloudlet#getCloudletOutputSize()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletOutputSize();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelCpu <em>Cloudlet Utilization Model Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Utilization Model Cpu</em>'.
	 * @see occ.simulation.Cloudlet#getCloudletUtilizationModelCpu()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletUtilizationModelCpu();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelRam <em>Cloudlet Utilization Model Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Utilization Model Ram</em>'.
	 * @see occ.simulation.Cloudlet#getCloudletUtilizationModelRam()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletUtilizationModelRam();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelBw <em>Cloudlet Utilization Model Bw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Utilization Model Bw</em>'.
	 * @see occ.simulation.Cloudlet#getCloudletUtilizationModelBw()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletUtilizationModelBw();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Harddrive <em>Harddrive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Harddrive</em>'.
	 * @see occ.simulation.Harddrive
	 * @generated
	 */
	EClass getHarddrive();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Sanstorage <em>Sanstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sanstorage</em>'.
	 * @see occ.simulation.Sanstorage
	 * @generated
	 */
	EClass getSanstorage();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Sanstorage#getBandwith <em>Bandwith</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwith</em>'.
	 * @see occ.simulation.Sanstorage#getBandwith()
	 * @see #getSanstorage()
	 * @generated
	 */
	EAttribute getSanstorage_Bandwith();

	/**
	 * Returns the meta object for the attribute '{@link occ.simulation.Sanstorage#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see occ.simulation.Sanstorage#getLatency()
	 * @see #getSanstorage()
	 * @generated
	 */
	EAttribute getSanstorage_Latency();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Pricestrategy <em>Pricestrategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricestrategy</em>'.
	 * @see occ.simulation.Pricestrategy
	 * @generated
	 */
	EClass getPricestrategy();

	/**
	 * Returns the meta object for the '{@link occ.simulation.Pricestrategy#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see occ.simulation.Pricestrategy#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPricestrategy__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Spot <em>Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spot</em>'.
	 * @see occ.simulation.Spot
	 * @generated
	 */
	EClass getSpot();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Ondemand <em>Ondemand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ondemand</em>'.
	 * @see occ.simulation.Ondemand
	 * @generated
	 */
	EClass getOndemand();

	/**
	 * Returns the meta object for class '{@link occ.simulation.Upfront <em>Upfront</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upfront</em>'.
	 * @see occ.simulation.Upfront
	 * @generated
	 */
	EClass getUpfront();

	/**
	 * Returns the meta object for enum '{@link occ.simulation.ElasticityType <em>Elasticity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Elasticity Type</em>'.
	 * @see occ.simulation.ElasticityType
	 * @generated
	 */
	EEnum getElasticityType();

	/**
	 * Returns the meta object for enum '{@link occ.simulation.CloudletScheduler <em>Cloudlet Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cloudlet Scheduler</em>'.
	 * @see occ.simulation.CloudletScheduler
	 * @generated
	 */
	EEnum getCloudletScheduler();

	/**
	 * Returns the meta object for enum '{@link occ.simulation.utilizationModel <em>utilization Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>utilization Model</em>'.
	 * @see occ.simulation.utilizationModel
	 * @generated
	 */
	EEnum getutilizationModel();

	/**
	 * Returns the meta object for enum '{@link occ.simulation.VmScheduler <em>Vm Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vm Scheduler</em>'.
	 * @see occ.simulation.VmScheduler
	 * @generated
	 */
	EEnum getVmScheduler();

	/**
	 * Returns the meta object for enum '{@link occ.simulation.PeProvisionner <em>Pe Provisionner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pe Provisionner</em>'.
	 * @see occ.simulation.PeProvisionner
	 * @generated
	 */
	EEnum getPeProvisionner();

	/**
	 * Returns the meta object for enum '{@link occ.simulation.RamProvisionner <em>Ram Provisionner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ram Provisionner</em>'.
	 * @see occ.simulation.RamProvisionner
	 * @generated
	 */
	EEnum getRamProvisionner();

	/**
	 * Returns the meta object for enum '{@link occ.simulation.BwProvisionner <em>Bw Provisionner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bw Provisionner</em>'.
	 * @see occ.simulation.BwProvisionner
	 * @generated
	 */
	EEnum getBwProvisionner();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getdouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getLong();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulationFactory getSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link occ.simulation.impl.DatacenterImpl <em>Datacenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.DatacenterImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getDatacenter()
		 * @generated
		 */
		EClass DATACENTER = eINSTANCE.getDatacenter();

		/**
		 * The meta object literal for the '<em><b>Datacenter Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_OS = eINSTANCE.getDatacenter_DatacenterOs();

		/**
		 * The meta object literal for the '<em><b>Datacenter Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_LOCATION = eINSTANCE.getDatacenter_DatacenterLocation();

		/**
		 * The meta object literal for the '<em><b>Datacenter Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_TIMEZONE = eINSTANCE.getDatacenter_DatacenterTimezone();

		/**
		 * The meta object literal for the '<em><b>Datacenter Cost Mem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_COST_MEM = eINSTANCE.getDatacenter_DatacenterCostMem();

		/**
		 * The meta object literal for the '<em><b>Datacenter Cost Bw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_COST_BW = eINSTANCE.getDatacenter_DatacenterCostBw();

		/**
		 * The meta object literal for the '<em><b>Datacenter Cost Storge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_COST_STORGE = eINSTANCE.getDatacenter_DatacenterCostStorge();

		/**
		 * The meta object literal for the '<em><b>Datacenter Cost Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_COST_PROCESS = eINSTANCE.getDatacenter_DatacenterCostProcess();

		/**
		 * The meta object literal for the '<em><b>Datacenter Vmm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_VMM = eINSTANCE.getDatacenter_DatacenterVmm();

		/**
		 * The meta object literal for the '<em><b>Datacenter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__DATACENTER_NAME = eINSTANCE.getDatacenter_DatacenterName();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.VmImpl <em>Vm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.VmImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getVm()
		 * @generated
		 */
		EClass VM = eINSTANCE.getVm();

		/**
		 * The meta object literal for the '<em><b>Vm Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_ID = eINSTANCE.getVm_VmId();

		/**
		 * The meta object literal for the '<em><b>Vm Mips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_MIPS = eINSTANCE.getVm_VmMips();

		/**
		 * The meta object literal for the '<em><b>Vm Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_CORES = eINSTANCE.getVm_VmCores();

		/**
		 * The meta object literal for the '<em><b>Vm Image Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_IMAGE_SIZE = eINSTANCE.getVm_VmImageSize();

		/**
		 * The meta object literal for the '<em><b>Vm Bw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_BW = eINSTANCE.getVm_VmBw();

		/**
		 * The meta object literal for the '<em><b>Vm Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_RAM = eINSTANCE.getVm_VmRam();

		/**
		 * The meta object literal for the '<em><b>Vm Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_OS = eINSTANCE.getVm_VmOs();

		/**
		 * The meta object literal for the '<em><b>Vm Cloudlet Scheduler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_CLOUDLET_SCHEDULER = eINSTANCE.getVm_VmCloudletScheduler();

		/**
		 * The meta object literal for the '<em><b>Vm Elasticity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_ELASTICITY = eINSTANCE.getVm_VmElasticity();

		/**
		 * The meta object literal for the '<em><b>Vm Vmm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VM_VMM = eINSTANCE.getVm_VmVmm();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.HostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.HostImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getHost()
		 * @generated
		 */
		EClass HOST = eINSTANCE.getHost();

		/**
		 * The meta object literal for the '<em><b>Host Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_ID = eINSTANCE.getHost_HostId();

		/**
		 * The meta object literal for the '<em><b>Host Ram Provisionner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_RAM_PROVISIONNER = eINSTANCE.getHost_HostRamProvisionner();

		/**
		 * The meta object literal for the '<em><b>Host Bw Provisionner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_BW_PROVISIONNER = eINSTANCE.getHost_HostBwProvisionner();

		/**
		 * The meta object literal for the '<em><b>Host Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_STORAGE = eINSTANCE.getHost_HostStorage();

		/**
		 * The meta object literal for the '<em><b>Host Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_CORES = eINSTANCE.getHost_HostCores();

		/**
		 * The meta object literal for the '<em><b>Host Vm Scheduler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_VM_SCHEDULER = eINSTANCE.getHost_HostVmScheduler();

		/**
		 * The meta object literal for the '<em><b>Host Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_RAM = eINSTANCE.getHost_HostRam();

		/**
		 * The meta object literal for the '<em><b>Host Mips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_MIPS = eINSTANCE.getHost_HostMips();

		/**
		 * The meta object literal for the '<em><b>Host Bw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_BW = eINSTANCE.getHost_HostBw();

		/**
		 * The meta object literal for the '<em><b>Host Pe Provisionner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_PE_PROVISIONNER = eINSTANCE.getHost_HostPeProvisionner();

		/**
		 * The meta object literal for the '<em><b>Host Elasticity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__HOST_ELASTICITY = eINSTANCE.getHost_HostElasticity();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.CloudletImpl <em>Cloudlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.CloudletImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getCloudlet()
		 * @generated
		 */
		EClass CLOUDLET = eINSTANCE.getCloudlet();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_ID = eINSTANCE.getCloudlet_CloudletId();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_LENGTH = eINSTANCE.getCloudlet_CloudletLength();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_CORES = eINSTANCE.getCloudlet_CloudletCores();

		/**
		 * The meta object literal for the '<em><b>Cloudlet File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_FILE_SIZE = eINSTANCE.getCloudlet_CloudletFileSize();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Output Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_OUTPUT_SIZE = eINSTANCE.getCloudlet_CloudletOutputSize();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Utilization Model Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU = eINSTANCE.getCloudlet_CloudletUtilizationModelCpu();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Utilization Model Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM = eINSTANCE.getCloudlet_CloudletUtilizationModelRam();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Utilization Model Bw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW = eINSTANCE.getCloudlet_CloudletUtilizationModelBw();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.HarddriveImpl <em>Harddrive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.HarddriveImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getHarddrive()
		 * @generated
		 */
		EClass HARDDRIVE = eINSTANCE.getHarddrive();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.SanstorageImpl <em>Sanstorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.SanstorageImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getSanstorage()
		 * @generated
		 */
		EClass SANSTORAGE = eINSTANCE.getSanstorage();

		/**
		 * The meta object literal for the '<em><b>Bandwith</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SANSTORAGE__BANDWITH = eINSTANCE.getSanstorage_Bandwith();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SANSTORAGE__LATENCY = eINSTANCE.getSanstorage_Latency();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.PricestrategyImpl <em>Pricestrategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.PricestrategyImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getPricestrategy()
		 * @generated
		 */
		EClass PRICESTRATEGY = eINSTANCE.getPricestrategy();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRICESTRATEGY___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPricestrategy__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.SpotImpl <em>Spot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.SpotImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getSpot()
		 * @generated
		 */
		EClass SPOT = eINSTANCE.getSpot();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.OndemandImpl <em>Ondemand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.OndemandImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getOndemand()
		 * @generated
		 */
		EClass ONDEMAND = eINSTANCE.getOndemand();

		/**
		 * The meta object literal for the '{@link occ.simulation.impl.UpfrontImpl <em>Upfront</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.impl.UpfrontImpl
		 * @see occ.simulation.impl.SimulationPackageImpl#getUpfront()
		 * @generated
		 */
		EClass UPFRONT = eINSTANCE.getUpfront();

		/**
		 * The meta object literal for the '{@link occ.simulation.ElasticityType <em>Elasticity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.ElasticityType
		 * @see occ.simulation.impl.SimulationPackageImpl#getElasticityType()
		 * @generated
		 */
		EEnum ELASTICITY_TYPE = eINSTANCE.getElasticityType();

		/**
		 * The meta object literal for the '{@link occ.simulation.CloudletScheduler <em>Cloudlet Scheduler</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.CloudletScheduler
		 * @see occ.simulation.impl.SimulationPackageImpl#getCloudletScheduler()
		 * @generated
		 */
		EEnum CLOUDLET_SCHEDULER = eINSTANCE.getCloudletScheduler();

		/**
		 * The meta object literal for the '{@link occ.simulation.utilizationModel <em>utilization Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.utilizationModel
		 * @see occ.simulation.impl.SimulationPackageImpl#getutilizationModel()
		 * @generated
		 */
		EEnum UTILIZATION_MODEL = eINSTANCE.getutilizationModel();

		/**
		 * The meta object literal for the '{@link occ.simulation.VmScheduler <em>Vm Scheduler</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.VmScheduler
		 * @see occ.simulation.impl.SimulationPackageImpl#getVmScheduler()
		 * @generated
		 */
		EEnum VM_SCHEDULER = eINSTANCE.getVmScheduler();

		/**
		 * The meta object literal for the '{@link occ.simulation.PeProvisionner <em>Pe Provisionner</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.PeProvisionner
		 * @see occ.simulation.impl.SimulationPackageImpl#getPeProvisionner()
		 * @generated
		 */
		EEnum PE_PROVISIONNER = eINSTANCE.getPeProvisionner();

		/**
		 * The meta object literal for the '{@link occ.simulation.RamProvisionner <em>Ram Provisionner</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.RamProvisionner
		 * @see occ.simulation.impl.SimulationPackageImpl#getRamProvisionner()
		 * @generated
		 */
		EEnum RAM_PROVISIONNER = eINSTANCE.getRamProvisionner();

		/**
		 * The meta object literal for the '{@link occ.simulation.BwProvisionner <em>Bw Provisionner</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see occ.simulation.BwProvisionner
		 * @see occ.simulation.impl.SimulationPackageImpl#getBwProvisionner()
		 * @generated
		 */
		EEnum BW_PROVISIONNER = eINSTANCE.getBwProvisionner();

		/**
		 * The meta object literal for the '<em>double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see occ.simulation.impl.SimulationPackageImpl#getdouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getdouble();

		/**
		 * The meta object literal for the '<em>Long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see occ.simulation.impl.SimulationPackageImpl#getLong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getLong();

	}

} //SimulationPackage
