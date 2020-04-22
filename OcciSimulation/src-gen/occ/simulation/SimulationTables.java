/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /OcciSimulation/model/simulation.ecore
 * using:
 *   /OcciSimulation/model/simulation.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package occ.simulation;

import occ.simulation.SimulationTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

/**
 * SimulationTables provides the dispatch tables for the simulation for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SimulationTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SimulationPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", null, org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/simulation/ecore", null, occ.simulation.SimulationPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = occ.simulation.SimulationTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Pricestrategy = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Pricestrategy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_Long = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("Long", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_double = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("double", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_BwProvisionner = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getEnumerationId("BwProvisionner");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_CloudletScheduler = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getEnumerationId("CloudletScheduler");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_ElasticityType = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getEnumerationId("ElasticityType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_PeProvisionner = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getEnumerationId("PeProvisionner");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_RamProvisionner = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getEnumerationId("RamProvisionner");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_VmScheduler = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getEnumerationId("VmScheduler");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_utilizationModel = occ.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getEnumerationId("utilizationModel");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Pricestrategy_c_c_appliesConstraint = "Pricestrategy::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SimulationTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumeration _BwProvisionner = new EcoreExecutorEnumeration(SimulationPackage.Literals.BW_PROVISIONNER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cloudlet = new EcoreExecutorType(SimulationPackage.Literals.CLOUDLET, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _CloudletScheduler = new EcoreExecutorEnumeration(SimulationPackage.Literals.CLOUDLET_SCHEDULER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Datacenter = new EcoreExecutorType(SimulationPackage.Literals.DATACENTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ElasticityType = new EcoreExecutorEnumeration(SimulationPackage.Literals.ELASTICITY_TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Harddrive = new EcoreExecutorType(SimulationPackage.Literals.HARDDRIVE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Host = new EcoreExecutorType(SimulationPackage.Literals.HOST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Long = new EcoreExecutorType("Long", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ondemand = new EcoreExecutorType(SimulationPackage.Literals.ONDEMAND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _PeProvisionner = new EcoreExecutorEnumeration(SimulationPackage.Literals.PE_PROVISIONNER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Pricestrategy = new EcoreExecutorType(SimulationPackage.Literals.PRICESTRATEGY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _RamProvisionner = new EcoreExecutorEnumeration(SimulationPackage.Literals.RAM_PROVISIONNER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sanstorage = new EcoreExecutorType(SimulationPackage.Literals.SANSTORAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Spot = new EcoreExecutorType(SimulationPackage.Literals.SPOT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Upfront = new EcoreExecutorType(SimulationPackage.Literals.UPFRONT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vm = new EcoreExecutorType(SimulationPackage.Literals.VM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _VmScheduler = new EcoreExecutorEnumeration(SimulationPackage.Literals.VM_SCHEDULER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _double = new EcoreExecutorType("double", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _utilizationModel = new EcoreExecutorEnumeration(SimulationPackage.Literals.UTILIZATION_MODEL, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_BwProvisionner,
			_Cloudlet,
			_CloudletScheduler,
			_Datacenter,
			_ElasticityType,
			_Harddrive,
			_Host,
			_Long,
			_Ondemand,
			_PeProvisionner,
			_Pricestrategy,
			_RamProvisionner,
			_Sanstorage,
			_Spot,
			_Upfront,
			_Vm,
			_VmScheduler,
			_double,
			_utilizationModel
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _BwProvisionner__BwProvisionner = new ExecutorFragment(Types._BwProvisionner, SimulationTables.Types._BwProvisionner);
		private static final /*@NonNull*/ ExecutorFragment _BwProvisionner__OclAny = new ExecutorFragment(Types._BwProvisionner, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _BwProvisionner__OclElement = new ExecutorFragment(Types._BwProvisionner, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _BwProvisionner__OclEnumeration = new ExecutorFragment(Types._BwProvisionner, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _BwProvisionner__OclType = new ExecutorFragment(Types._BwProvisionner, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__Cloudlet = new ExecutorFragment(Types._Cloudlet, SimulationTables.Types._Cloudlet);
		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__Compute = new ExecutorFragment(Types._Cloudlet, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__Entity = new ExecutorFragment(Types._Cloudlet, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__OclAny = new ExecutorFragment(Types._Cloudlet, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__OclElement = new ExecutorFragment(Types._Cloudlet, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__Resource = new ExecutorFragment(Types._Cloudlet, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _CloudletScheduler__CloudletScheduler = new ExecutorFragment(Types._CloudletScheduler, SimulationTables.Types._CloudletScheduler);
		private static final /*@NonNull*/ ExecutorFragment _CloudletScheduler__OclAny = new ExecutorFragment(Types._CloudletScheduler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _CloudletScheduler__OclElement = new ExecutorFragment(Types._CloudletScheduler, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _CloudletScheduler__OclEnumeration = new ExecutorFragment(Types._CloudletScheduler, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _CloudletScheduler__OclType = new ExecutorFragment(Types._CloudletScheduler, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Datacenter__Compute = new ExecutorFragment(Types._Datacenter, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Datacenter__Datacenter = new ExecutorFragment(Types._Datacenter, SimulationTables.Types._Datacenter);
		private static final /*@NonNull*/ ExecutorFragment _Datacenter__Entity = new ExecutorFragment(Types._Datacenter, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Datacenter__OclAny = new ExecutorFragment(Types._Datacenter, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Datacenter__OclElement = new ExecutorFragment(Types._Datacenter, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Datacenter__Resource = new ExecutorFragment(Types._Datacenter, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _ElasticityType__ElasticityType = new ExecutorFragment(Types._ElasticityType, SimulationTables.Types._ElasticityType);
		private static final /*@NonNull*/ ExecutorFragment _ElasticityType__OclAny = new ExecutorFragment(Types._ElasticityType, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ElasticityType__OclElement = new ExecutorFragment(Types._ElasticityType, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ElasticityType__OclEnumeration = new ExecutorFragment(Types._ElasticityType, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ElasticityType__OclType = new ExecutorFragment(Types._ElasticityType, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Harddrive__Entity = new ExecutorFragment(Types._Harddrive, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Harddrive__Harddrive = new ExecutorFragment(Types._Harddrive, SimulationTables.Types._Harddrive);
		private static final /*@NonNull*/ ExecutorFragment _Harddrive__OclAny = new ExecutorFragment(Types._Harddrive, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Harddrive__OclElement = new ExecutorFragment(Types._Harddrive, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Harddrive__Resource = new ExecutorFragment(Types._Harddrive, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Harddrive__Storage = new ExecutorFragment(Types._Harddrive, InfrastructureTables.Types._Storage);

		private static final /*@NonNull*/ ExecutorFragment _Host__Compute = new ExecutorFragment(Types._Host, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Host__Entity = new ExecutorFragment(Types._Host, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Host__Host = new ExecutorFragment(Types._Host, SimulationTables.Types._Host);
		private static final /*@NonNull*/ ExecutorFragment _Host__OclAny = new ExecutorFragment(Types._Host, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Host__OclElement = new ExecutorFragment(Types._Host, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Host__Resource = new ExecutorFragment(Types._Host, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Long__Long = new ExecutorFragment(Types._Long, SimulationTables.Types._Long);
		private static final /*@NonNull*/ ExecutorFragment _Long__OclAny = new ExecutorFragment(Types._Long, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Ondemand__MixinBase = new ExecutorFragment(Types._Ondemand, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ondemand__OclAny = new ExecutorFragment(Types._Ondemand, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ondemand__OclElement = new ExecutorFragment(Types._Ondemand, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ondemand__Ondemand = new ExecutorFragment(Types._Ondemand, SimulationTables.Types._Ondemand);
		private static final /*@NonNull*/ ExecutorFragment _Ondemand__Pricestrategy = new ExecutorFragment(Types._Ondemand, SimulationTables.Types._Pricestrategy);

		private static final /*@NonNull*/ ExecutorFragment _PeProvisionner__OclAny = new ExecutorFragment(Types._PeProvisionner, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PeProvisionner__OclElement = new ExecutorFragment(Types._PeProvisionner, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _PeProvisionner__OclEnumeration = new ExecutorFragment(Types._PeProvisionner, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _PeProvisionner__OclType = new ExecutorFragment(Types._PeProvisionner, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _PeProvisionner__PeProvisionner = new ExecutorFragment(Types._PeProvisionner, SimulationTables.Types._PeProvisionner);

		private static final /*@NonNull*/ ExecutorFragment _Pricestrategy__MixinBase = new ExecutorFragment(Types._Pricestrategy, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Pricestrategy__OclAny = new ExecutorFragment(Types._Pricestrategy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Pricestrategy__OclElement = new ExecutorFragment(Types._Pricestrategy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Pricestrategy__Pricestrategy = new ExecutorFragment(Types._Pricestrategy, SimulationTables.Types._Pricestrategy);

		private static final /*@NonNull*/ ExecutorFragment _RamProvisionner__OclAny = new ExecutorFragment(Types._RamProvisionner, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RamProvisionner__OclElement = new ExecutorFragment(Types._RamProvisionner, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _RamProvisionner__OclEnumeration = new ExecutorFragment(Types._RamProvisionner, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _RamProvisionner__OclType = new ExecutorFragment(Types._RamProvisionner, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _RamProvisionner__RamProvisionner = new ExecutorFragment(Types._RamProvisionner, SimulationTables.Types._RamProvisionner);

		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__Entity = new ExecutorFragment(Types._Sanstorage, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__OclAny = new ExecutorFragment(Types._Sanstorage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__OclElement = new ExecutorFragment(Types._Sanstorage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__Resource = new ExecutorFragment(Types._Sanstorage, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__Sanstorage = new ExecutorFragment(Types._Sanstorage, SimulationTables.Types._Sanstorage);
		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__Storage = new ExecutorFragment(Types._Sanstorage, InfrastructureTables.Types._Storage);

		private static final /*@NonNull*/ ExecutorFragment _Spot__MixinBase = new ExecutorFragment(Types._Spot, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Spot__OclAny = new ExecutorFragment(Types._Spot, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Spot__OclElement = new ExecutorFragment(Types._Spot, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Spot__Pricestrategy = new ExecutorFragment(Types._Spot, SimulationTables.Types._Pricestrategy);
		private static final /*@NonNull*/ ExecutorFragment _Spot__Spot = new ExecutorFragment(Types._Spot, SimulationTables.Types._Spot);

		private static final /*@NonNull*/ ExecutorFragment _Upfront__MixinBase = new ExecutorFragment(Types._Upfront, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Upfront__OclAny = new ExecutorFragment(Types._Upfront, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Upfront__OclElement = new ExecutorFragment(Types._Upfront, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Upfront__Pricestrategy = new ExecutorFragment(Types._Upfront, SimulationTables.Types._Pricestrategy);
		private static final /*@NonNull*/ ExecutorFragment _Upfront__Upfront = new ExecutorFragment(Types._Upfront, SimulationTables.Types._Upfront);

		private static final /*@NonNull*/ ExecutorFragment _Vm__Compute = new ExecutorFragment(Types._Vm, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Vm__Entity = new ExecutorFragment(Types._Vm, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Vm__OclAny = new ExecutorFragment(Types._Vm, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vm__OclElement = new ExecutorFragment(Types._Vm, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vm__Resource = new ExecutorFragment(Types._Vm, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Vm__Vm = new ExecutorFragment(Types._Vm, SimulationTables.Types._Vm);

		private static final /*@NonNull*/ ExecutorFragment _VmScheduler__OclAny = new ExecutorFragment(Types._VmScheduler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VmScheduler__OclElement = new ExecutorFragment(Types._VmScheduler, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VmScheduler__OclEnumeration = new ExecutorFragment(Types._VmScheduler, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _VmScheduler__OclType = new ExecutorFragment(Types._VmScheduler, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _VmScheduler__VmScheduler = new ExecutorFragment(Types._VmScheduler, SimulationTables.Types._VmScheduler);

		private static final /*@NonNull*/ ExecutorFragment _double__OclAny = new ExecutorFragment(Types._double, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _double__double = new ExecutorFragment(Types._double, SimulationTables.Types._double);

		private static final /*@NonNull*/ ExecutorFragment _utilizationModel__OclAny = new ExecutorFragment(Types._utilizationModel, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _utilizationModel__OclElement = new ExecutorFragment(Types._utilizationModel, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _utilizationModel__OclEnumeration = new ExecutorFragment(Types._utilizationModel, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _utilizationModel__OclType = new ExecutorFragment(Types._utilizationModel, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _utilizationModel__utilizationModel = new ExecutorFragment(Types._utilizationModel, SimulationTables.Types._utilizationModel);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletCores = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_CORES, Types._Cloudlet, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletFileSize = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_FILE_SIZE, Types._Cloudlet, 1);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletId = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_ID, Types._Cloudlet, 2);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletLength = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_LENGTH, Types._Cloudlet, 3);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletOutputSize = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_OUTPUT_SIZE, Types._Cloudlet, 4);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletUtilizationModelBw = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW, Types._Cloudlet, 5);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletUtilizationModelCpu = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU, Types._Cloudlet, 6);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletUtilizationModelRam = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM, Types._Cloudlet, 7);

		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterCostBw = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_COST_BW, Types._Datacenter, 0);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterCostMem = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_COST_MEM, Types._Datacenter, 1);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterCostProcess = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_COST_PROCESS, Types._Datacenter, 2);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterCostStorge = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_COST_STORGE, Types._Datacenter, 3);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterLocation = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_LOCATION, Types._Datacenter, 4);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterName = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_NAME, Types._Datacenter, 5);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterOs = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_OS, Types._Datacenter, 6);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterTimezone = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_TIMEZONE, Types._Datacenter, 7);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__datacenterVmm = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__DATACENTER_VMM, Types._Datacenter, 8);

		public static final /*@NonNull*/ ExecutorProperty _Host__hostBw = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_BW, Types._Host, 0);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostBwProvisionner = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_BW_PROVISIONNER, Types._Host, 1);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostCores = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_CORES, Types._Host, 2);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostElasticity = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_ELASTICITY, Types._Host, 3);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostId = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_ID, Types._Host, 4);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostMips = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_MIPS, Types._Host, 5);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostPeProvisionner = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_PE_PROVISIONNER, Types._Host, 6);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostRam = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_RAM, Types._Host, 7);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostRamProvisionner = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_RAM_PROVISIONNER, Types._Host, 8);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostStorage = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_STORAGE, Types._Host, 9);
		public static final /*@NonNull*/ ExecutorProperty _Host__hostVmScheduler = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__HOST_VM_SCHEDULER, Types._Host, 10);

		public static final /*@NonNull*/ ExecutorProperty _Sanstorage__bandwith = new EcoreExecutorProperty(SimulationPackage.Literals.SANSTORAGE__BANDWITH, Types._Sanstorage, 0);
		public static final /*@NonNull*/ ExecutorProperty _Sanstorage__latency = new EcoreExecutorProperty(SimulationPackage.Literals.SANSTORAGE__LATENCY, Types._Sanstorage, 1);

		public static final /*@NonNull*/ ExecutorProperty _Vm__vmBw = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_BW, Types._Vm, 0);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmCloudletScheduler = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_CLOUDLET_SCHEDULER, Types._Vm, 1);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmCores = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_CORES, Types._Vm, 2);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmElasticity = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_ELASTICITY, Types._Vm, 3);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmId = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_ID, Types._Vm, 4);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmImageSize = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_IMAGE_SIZE, Types._Vm, 5);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmMips = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_MIPS, Types._Vm, 6);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmOs = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_OS, Types._Vm, 7);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmRam = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_RAM, Types._Vm, 8);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmVmm = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VM_VMM, Types._Vm, 9);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BwProvisionner =
			{
				Fragments._BwProvisionner__OclAny /* 0 */,
				Fragments._BwProvisionner__OclElement /* 1 */,
				Fragments._BwProvisionner__OclType /* 2 */,
				Fragments._BwProvisionner__OclEnumeration /* 3 */,
				Fragments._BwProvisionner__BwProvisionner /* 4 */
			};
		private static final int /*@NonNull*/ [] __BwProvisionner = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudlet =
			{
				Fragments._Cloudlet__OclAny /* 0 */,
				Fragments._Cloudlet__OclElement /* 1 */,
				Fragments._Cloudlet__Entity /* 2 */,
				Fragments._Cloudlet__Resource /* 3 */,
				Fragments._Cloudlet__Compute /* 4 */,
				Fragments._Cloudlet__Cloudlet /* 5 */
			};
		private static final int /*@NonNull*/ [] __Cloudlet = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CloudletScheduler =
			{
				Fragments._CloudletScheduler__OclAny /* 0 */,
				Fragments._CloudletScheduler__OclElement /* 1 */,
				Fragments._CloudletScheduler__OclType /* 2 */,
				Fragments._CloudletScheduler__OclEnumeration /* 3 */,
				Fragments._CloudletScheduler__CloudletScheduler /* 4 */
			};
		private static final int /*@NonNull*/ [] __CloudletScheduler = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Datacenter =
			{
				Fragments._Datacenter__OclAny /* 0 */,
				Fragments._Datacenter__OclElement /* 1 */,
				Fragments._Datacenter__Entity /* 2 */,
				Fragments._Datacenter__Resource /* 3 */,
				Fragments._Datacenter__Compute /* 4 */,
				Fragments._Datacenter__Datacenter /* 5 */
			};
		private static final int /*@NonNull*/ [] __Datacenter = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ElasticityType =
			{
				Fragments._ElasticityType__OclAny /* 0 */,
				Fragments._ElasticityType__OclElement /* 1 */,
				Fragments._ElasticityType__OclType /* 2 */,
				Fragments._ElasticityType__OclEnumeration /* 3 */,
				Fragments._ElasticityType__ElasticityType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ElasticityType = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Harddrive =
			{
				Fragments._Harddrive__OclAny /* 0 */,
				Fragments._Harddrive__OclElement /* 1 */,
				Fragments._Harddrive__Entity /* 2 */,
				Fragments._Harddrive__Resource /* 3 */,
				Fragments._Harddrive__Storage /* 4 */,
				Fragments._Harddrive__Harddrive /* 5 */
			};
		private static final int /*@NonNull*/ [] __Harddrive = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Host =
			{
				Fragments._Host__OclAny /* 0 */,
				Fragments._Host__OclElement /* 1 */,
				Fragments._Host__Entity /* 2 */,
				Fragments._Host__Resource /* 3 */,
				Fragments._Host__Compute /* 4 */,
				Fragments._Host__Host /* 5 */
			};
		private static final int /*@NonNull*/ [] __Host = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Long =
			{
				Fragments._Long__OclAny /* 0 */,
				Fragments._Long__Long /* 1 */
			};
		private static final int /*@NonNull*/ [] __Long = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ondemand =
			{
				Fragments._Ondemand__OclAny /* 0 */,
				Fragments._Ondemand__OclElement /* 1 */,
				Fragments._Ondemand__MixinBase /* 2 */,
				Fragments._Ondemand__Pricestrategy /* 3 */,
				Fragments._Ondemand__Ondemand /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ondemand = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PeProvisionner =
			{
				Fragments._PeProvisionner__OclAny /* 0 */,
				Fragments._PeProvisionner__OclElement /* 1 */,
				Fragments._PeProvisionner__OclType /* 2 */,
				Fragments._PeProvisionner__OclEnumeration /* 3 */,
				Fragments._PeProvisionner__PeProvisionner /* 4 */
			};
		private static final int /*@NonNull*/ [] __PeProvisionner = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Pricestrategy =
			{
				Fragments._Pricestrategy__OclAny /* 0 */,
				Fragments._Pricestrategy__OclElement /* 1 */,
				Fragments._Pricestrategy__MixinBase /* 2 */,
				Fragments._Pricestrategy__Pricestrategy /* 3 */
			};
		private static final int /*@NonNull*/ [] __Pricestrategy = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RamProvisionner =
			{
				Fragments._RamProvisionner__OclAny /* 0 */,
				Fragments._RamProvisionner__OclElement /* 1 */,
				Fragments._RamProvisionner__OclType /* 2 */,
				Fragments._RamProvisionner__OclEnumeration /* 3 */,
				Fragments._RamProvisionner__RamProvisionner /* 4 */
			};
		private static final int /*@NonNull*/ [] __RamProvisionner = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sanstorage =
			{
				Fragments._Sanstorage__OclAny /* 0 */,
				Fragments._Sanstorage__OclElement /* 1 */,
				Fragments._Sanstorage__Entity /* 2 */,
				Fragments._Sanstorage__Resource /* 3 */,
				Fragments._Sanstorage__Storage /* 4 */,
				Fragments._Sanstorage__Sanstorage /* 5 */
			};
		private static final int /*@NonNull*/ [] __Sanstorage = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Spot =
			{
				Fragments._Spot__OclAny /* 0 */,
				Fragments._Spot__OclElement /* 1 */,
				Fragments._Spot__MixinBase /* 2 */,
				Fragments._Spot__Pricestrategy /* 3 */,
				Fragments._Spot__Spot /* 4 */
			};
		private static final int /*@NonNull*/ [] __Spot = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Upfront =
			{
				Fragments._Upfront__OclAny /* 0 */,
				Fragments._Upfront__OclElement /* 1 */,
				Fragments._Upfront__MixinBase /* 2 */,
				Fragments._Upfront__Pricestrategy /* 3 */,
				Fragments._Upfront__Upfront /* 4 */
			};
		private static final int /*@NonNull*/ [] __Upfront = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vm =
			{
				Fragments._Vm__OclAny /* 0 */,
				Fragments._Vm__OclElement /* 1 */,
				Fragments._Vm__Entity /* 2 */,
				Fragments._Vm__Resource /* 3 */,
				Fragments._Vm__Compute /* 4 */,
				Fragments._Vm__Vm /* 5 */
			};
		private static final int /*@NonNull*/ [] __Vm = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VmScheduler =
			{
				Fragments._VmScheduler__OclAny /* 0 */,
				Fragments._VmScheduler__OclElement /* 1 */,
				Fragments._VmScheduler__OclType /* 2 */,
				Fragments._VmScheduler__OclEnumeration /* 3 */,
				Fragments._VmScheduler__VmScheduler /* 4 */
			};
		private static final int /*@NonNull*/ [] __VmScheduler = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _double =
			{
				Fragments._double__OclAny /* 0 */,
				Fragments._double__double /* 1 */
			};
		private static final int /*@NonNull*/ [] __double = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _utilizationModel =
			{
				Fragments._utilizationModel__OclAny /* 0 */,
				Fragments._utilizationModel__OclElement /* 1 */,
				Fragments._utilizationModel__OclType /* 2 */,
				Fragments._utilizationModel__OclEnumeration /* 3 */,
				Fragments._utilizationModel__utilizationModel /* 4 */
			};
		private static final int /*@NonNull*/ [] __utilizationModel = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._BwProvisionner.initFragments(_BwProvisionner, __BwProvisionner);
			Types._Cloudlet.initFragments(_Cloudlet, __Cloudlet);
			Types._CloudletScheduler.initFragments(_CloudletScheduler, __CloudletScheduler);
			Types._Datacenter.initFragments(_Datacenter, __Datacenter);
			Types._ElasticityType.initFragments(_ElasticityType, __ElasticityType);
			Types._Harddrive.initFragments(_Harddrive, __Harddrive);
			Types._Host.initFragments(_Host, __Host);
			Types._Long.initFragments(_Long, __Long);
			Types._Ondemand.initFragments(_Ondemand, __Ondemand);
			Types._PeProvisionner.initFragments(_PeProvisionner, __PeProvisionner);
			Types._Pricestrategy.initFragments(_Pricestrategy, __Pricestrategy);
			Types._RamProvisionner.initFragments(_RamProvisionner, __RamProvisionner);
			Types._Sanstorage.initFragments(_Sanstorage, __Sanstorage);
			Types._Spot.initFragments(_Spot, __Spot);
			Types._Upfront.initFragments(_Upfront, __Upfront);
			Types._Vm.initFragments(_Vm, __Vm);
			Types._VmScheduler.initFragments(_VmScheduler, __VmScheduler);
			Types._double.initFragments(_double, __double);
			Types._utilizationModel.initFragments(_utilizationModel, __utilizationModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BwProvisionner__BwProvisionner = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BwProvisionner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BwProvisionner__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BwProvisionner__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BwProvisionner__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__Cloudlet = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CloudletScheduler__CloudletScheduler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CloudletScheduler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CloudletScheduler__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CloudletScheduler__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CloudletScheduler__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__Datacenter = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElasticityType__ElasticityType = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElasticityType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElasticityType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElasticityType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ElasticityType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrive__Harddrive = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrive__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrive__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrive__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrive__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrive__Storage = {
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__online /* online() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__Host = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Long__Long = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Long__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__Ondemand = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__Pricestrategy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PeProvisionner__PeProvisionner = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PeProvisionner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PeProvisionner__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PeProvisionner__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PeProvisionner__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Pricestrategy__Pricestrategy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Pricestrategy__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Pricestrategy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Pricestrategy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RamProvisionner__RamProvisionner = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RamProvisionner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RamProvisionner__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RamProvisionner__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RamProvisionner__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__Sanstorage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__Storage = {
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__online /* online() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spot__Spot = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spot__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spot__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spot__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Spot__Pricestrategy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__Upfront = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__Pricestrategy = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__Vm = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VmScheduler__VmScheduler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VmScheduler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VmScheduler__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VmScheduler__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VmScheduler__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _double__double = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _double__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _utilizationModel__utilizationModel = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _utilizationModel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _utilizationModel__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _utilizationModel__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _utilizationModel__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BwProvisionner__BwProvisionner.initOperations(_BwProvisionner__BwProvisionner);
			Fragments._BwProvisionner__OclAny.initOperations(_BwProvisionner__OclAny);
			Fragments._BwProvisionner__OclElement.initOperations(_BwProvisionner__OclElement);
			Fragments._BwProvisionner__OclEnumeration.initOperations(_BwProvisionner__OclEnumeration);
			Fragments._BwProvisionner__OclType.initOperations(_BwProvisionner__OclType);

			Fragments._Cloudlet__Cloudlet.initOperations(_Cloudlet__Cloudlet);
			Fragments._Cloudlet__Compute.initOperations(_Cloudlet__Compute);
			Fragments._Cloudlet__Entity.initOperations(_Cloudlet__Entity);
			Fragments._Cloudlet__OclAny.initOperations(_Cloudlet__OclAny);
			Fragments._Cloudlet__OclElement.initOperations(_Cloudlet__OclElement);
			Fragments._Cloudlet__Resource.initOperations(_Cloudlet__Resource);

			Fragments._CloudletScheduler__CloudletScheduler.initOperations(_CloudletScheduler__CloudletScheduler);
			Fragments._CloudletScheduler__OclAny.initOperations(_CloudletScheduler__OclAny);
			Fragments._CloudletScheduler__OclElement.initOperations(_CloudletScheduler__OclElement);
			Fragments._CloudletScheduler__OclEnumeration.initOperations(_CloudletScheduler__OclEnumeration);
			Fragments._CloudletScheduler__OclType.initOperations(_CloudletScheduler__OclType);

			Fragments._Datacenter__Compute.initOperations(_Datacenter__Compute);
			Fragments._Datacenter__Datacenter.initOperations(_Datacenter__Datacenter);
			Fragments._Datacenter__Entity.initOperations(_Datacenter__Entity);
			Fragments._Datacenter__OclAny.initOperations(_Datacenter__OclAny);
			Fragments._Datacenter__OclElement.initOperations(_Datacenter__OclElement);
			Fragments._Datacenter__Resource.initOperations(_Datacenter__Resource);

			Fragments._ElasticityType__ElasticityType.initOperations(_ElasticityType__ElasticityType);
			Fragments._ElasticityType__OclAny.initOperations(_ElasticityType__OclAny);
			Fragments._ElasticityType__OclElement.initOperations(_ElasticityType__OclElement);
			Fragments._ElasticityType__OclEnumeration.initOperations(_ElasticityType__OclEnumeration);
			Fragments._ElasticityType__OclType.initOperations(_ElasticityType__OclType);

			Fragments._Harddrive__Entity.initOperations(_Harddrive__Entity);
			Fragments._Harddrive__Harddrive.initOperations(_Harddrive__Harddrive);
			Fragments._Harddrive__OclAny.initOperations(_Harddrive__OclAny);
			Fragments._Harddrive__OclElement.initOperations(_Harddrive__OclElement);
			Fragments._Harddrive__Resource.initOperations(_Harddrive__Resource);
			Fragments._Harddrive__Storage.initOperations(_Harddrive__Storage);

			Fragments._Host__Compute.initOperations(_Host__Compute);
			Fragments._Host__Entity.initOperations(_Host__Entity);
			Fragments._Host__Host.initOperations(_Host__Host);
			Fragments._Host__OclAny.initOperations(_Host__OclAny);
			Fragments._Host__OclElement.initOperations(_Host__OclElement);
			Fragments._Host__Resource.initOperations(_Host__Resource);

			Fragments._Long__Long.initOperations(_Long__Long);
			Fragments._Long__OclAny.initOperations(_Long__OclAny);

			Fragments._Ondemand__MixinBase.initOperations(_Ondemand__MixinBase);
			Fragments._Ondemand__OclAny.initOperations(_Ondemand__OclAny);
			Fragments._Ondemand__OclElement.initOperations(_Ondemand__OclElement);
			Fragments._Ondemand__Ondemand.initOperations(_Ondemand__Ondemand);
			Fragments._Ondemand__Pricestrategy.initOperations(_Ondemand__Pricestrategy);

			Fragments._PeProvisionner__OclAny.initOperations(_PeProvisionner__OclAny);
			Fragments._PeProvisionner__OclElement.initOperations(_PeProvisionner__OclElement);
			Fragments._PeProvisionner__OclEnumeration.initOperations(_PeProvisionner__OclEnumeration);
			Fragments._PeProvisionner__OclType.initOperations(_PeProvisionner__OclType);
			Fragments._PeProvisionner__PeProvisionner.initOperations(_PeProvisionner__PeProvisionner);

			Fragments._Pricestrategy__MixinBase.initOperations(_Pricestrategy__MixinBase);
			Fragments._Pricestrategy__OclAny.initOperations(_Pricestrategy__OclAny);
			Fragments._Pricestrategy__OclElement.initOperations(_Pricestrategy__OclElement);
			Fragments._Pricestrategy__Pricestrategy.initOperations(_Pricestrategy__Pricestrategy);

			Fragments._RamProvisionner__OclAny.initOperations(_RamProvisionner__OclAny);
			Fragments._RamProvisionner__OclElement.initOperations(_RamProvisionner__OclElement);
			Fragments._RamProvisionner__OclEnumeration.initOperations(_RamProvisionner__OclEnumeration);
			Fragments._RamProvisionner__OclType.initOperations(_RamProvisionner__OclType);
			Fragments._RamProvisionner__RamProvisionner.initOperations(_RamProvisionner__RamProvisionner);

			Fragments._Sanstorage__Entity.initOperations(_Sanstorage__Entity);
			Fragments._Sanstorage__OclAny.initOperations(_Sanstorage__OclAny);
			Fragments._Sanstorage__OclElement.initOperations(_Sanstorage__OclElement);
			Fragments._Sanstorage__Resource.initOperations(_Sanstorage__Resource);
			Fragments._Sanstorage__Sanstorage.initOperations(_Sanstorage__Sanstorage);
			Fragments._Sanstorage__Storage.initOperations(_Sanstorage__Storage);

			Fragments._Spot__MixinBase.initOperations(_Spot__MixinBase);
			Fragments._Spot__OclAny.initOperations(_Spot__OclAny);
			Fragments._Spot__OclElement.initOperations(_Spot__OclElement);
			Fragments._Spot__Pricestrategy.initOperations(_Spot__Pricestrategy);
			Fragments._Spot__Spot.initOperations(_Spot__Spot);

			Fragments._Upfront__MixinBase.initOperations(_Upfront__MixinBase);
			Fragments._Upfront__OclAny.initOperations(_Upfront__OclAny);
			Fragments._Upfront__OclElement.initOperations(_Upfront__OclElement);
			Fragments._Upfront__Pricestrategy.initOperations(_Upfront__Pricestrategy);
			Fragments._Upfront__Upfront.initOperations(_Upfront__Upfront);

			Fragments._Vm__Compute.initOperations(_Vm__Compute);
			Fragments._Vm__Entity.initOperations(_Vm__Entity);
			Fragments._Vm__OclAny.initOperations(_Vm__OclAny);
			Fragments._Vm__OclElement.initOperations(_Vm__OclElement);
			Fragments._Vm__Resource.initOperations(_Vm__Resource);
			Fragments._Vm__Vm.initOperations(_Vm__Vm);

			Fragments._VmScheduler__OclAny.initOperations(_VmScheduler__OclAny);
			Fragments._VmScheduler__OclElement.initOperations(_VmScheduler__OclElement);
			Fragments._VmScheduler__OclEnumeration.initOperations(_VmScheduler__OclEnumeration);
			Fragments._VmScheduler__OclType.initOperations(_VmScheduler__OclType);
			Fragments._VmScheduler__VmScheduler.initOperations(_VmScheduler__VmScheduler);

			Fragments._double__OclAny.initOperations(_double__OclAny);
			Fragments._double__double.initOperations(_double__double);

			Fragments._utilizationModel__OclAny.initOperations(_utilizationModel__OclAny);
			Fragments._utilizationModel__OclElement.initOperations(_utilizationModel__OclElement);
			Fragments._utilizationModel__OclEnumeration.initOperations(_utilizationModel__OclEnumeration);
			Fragments._utilizationModel__OclType.initOperations(_utilizationModel__OclType);
			Fragments._utilizationModel__utilizationModel.initOperations(_utilizationModel__utilizationModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BwProvisionner = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudlet = {
			SimulationTables.Properties._Cloudlet__cloudletCores,
			SimulationTables.Properties._Cloudlet__cloudletFileSize,
			SimulationTables.Properties._Cloudlet__cloudletId,
			SimulationTables.Properties._Cloudlet__cloudletLength,
			SimulationTables.Properties._Cloudlet__cloudletOutputSize,
			SimulationTables.Properties._Cloudlet__cloudletUtilizationModelBw,
			SimulationTables.Properties._Cloudlet__cloudletUtilizationModelCpu,
			SimulationTables.Properties._Cloudlet__cloudletUtilizationModelRam
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CloudletScheduler = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Datacenter = {
			SimulationTables.Properties._Datacenter__datacenterCostBw,
			SimulationTables.Properties._Datacenter__datacenterCostMem,
			SimulationTables.Properties._Datacenter__datacenterCostProcess,
			SimulationTables.Properties._Datacenter__datacenterCostStorge,
			SimulationTables.Properties._Datacenter__datacenterLocation,
			SimulationTables.Properties._Datacenter__datacenterName,
			SimulationTables.Properties._Datacenter__datacenterOs,
			SimulationTables.Properties._Datacenter__datacenterTimezone,
			SimulationTables.Properties._Datacenter__datacenterVmm
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ElasticityType = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Harddrive = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Host = {
			SimulationTables.Properties._Host__hostBw,
			SimulationTables.Properties._Host__hostBwProvisionner,
			SimulationTables.Properties._Host__hostCores,
			SimulationTables.Properties._Host__hostElasticity,
			SimulationTables.Properties._Host__hostId,
			SimulationTables.Properties._Host__hostMips,
			SimulationTables.Properties._Host__hostPeProvisionner,
			SimulationTables.Properties._Host__hostRam,
			SimulationTables.Properties._Host__hostRamProvisionner,
			SimulationTables.Properties._Host__hostStorage,
			SimulationTables.Properties._Host__hostVmScheduler
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Long = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ondemand = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PeProvisionner = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Pricestrategy = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RamProvisionner = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sanstorage = {
			SimulationTables.Properties._Sanstorage__bandwith,
			SimulationTables.Properties._Sanstorage__latency
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Spot = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Upfront = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vm = {
			SimulationTables.Properties._Vm__vmBw,
			SimulationTables.Properties._Vm__vmCloudletScheduler,
			SimulationTables.Properties._Vm__vmCores,
			SimulationTables.Properties._Vm__vmElasticity,
			SimulationTables.Properties._Vm__vmId,
			SimulationTables.Properties._Vm__vmImageSize,
			SimulationTables.Properties._Vm__vmMips,
			SimulationTables.Properties._Vm__vmOs,
			SimulationTables.Properties._Vm__vmRam,
			SimulationTables.Properties._Vm__vmVmm
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VmScheduler = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _double = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _utilizationModel = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._BwProvisionner__BwProvisionner.initProperties(_BwProvisionner);
			Fragments._Cloudlet__Cloudlet.initProperties(_Cloudlet);
			Fragments._CloudletScheduler__CloudletScheduler.initProperties(_CloudletScheduler);
			Fragments._Datacenter__Datacenter.initProperties(_Datacenter);
			Fragments._ElasticityType__ElasticityType.initProperties(_ElasticityType);
			Fragments._Harddrive__Harddrive.initProperties(_Harddrive);
			Fragments._Host__Host.initProperties(_Host);
			Fragments._Long__Long.initProperties(_Long);
			Fragments._Ondemand__Ondemand.initProperties(_Ondemand);
			Fragments._PeProvisionner__PeProvisionner.initProperties(_PeProvisionner);
			Fragments._Pricestrategy__Pricestrategy.initProperties(_Pricestrategy);
			Fragments._RamProvisionner__RamProvisionner.initProperties(_RamProvisionner);
			Fragments._Sanstorage__Sanstorage.initProperties(_Sanstorage);
			Fragments._Spot__Spot.initProperties(_Spot);
			Fragments._Upfront__Upfront.initProperties(_Upfront);
			Fragments._Vm__Vm.initProperties(_Vm);
			Fragments._VmScheduler__VmScheduler.initProperties(_VmScheduler);
			Fragments._double__double.initProperties(_double);
			Fragments._utilizationModel__utilizationModel.initProperties(_utilizationModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _BwProvisionner__BwProvisionerSimple = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.BW_PROVISIONNER.getEEnumLiteral("BwProvisionerSimple"), Types._BwProvisionner, 0);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _BwProvisionner = {
			_BwProvisionner__BwProvisionerSimple
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _CloudletScheduler__CloudletSchedulerSpaceShared = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.CLOUDLET_SCHEDULER.getEEnumLiteral("CloudletSchedulerSpaceShared"), Types._CloudletScheduler, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _CloudletScheduler__CloudletSchedulerTimeShared = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.CLOUDLET_SCHEDULER.getEEnumLiteral("CloudletSchedulerTimeShared"), Types._CloudletScheduler, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CloudletScheduler = {
			_CloudletScheduler__CloudletSchedulerSpaceShared,
			_CloudletScheduler__CloudletSchedulerTimeShared
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElasticityType__None = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.ELASTICITY_TYPE.getEEnumLiteral("None"), Types._ElasticityType, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElasticityType__Vertical = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.ELASTICITY_TYPE.getEEnumLiteral("Vertical"), Types._ElasticityType, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ElasticityType__Horizontal = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.ELASTICITY_TYPE.getEEnumLiteral("Horizontal"), Types._ElasticityType, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ElasticityType = {
			_ElasticityType__None,
			_ElasticityType__Vertical,
			_ElasticityType__Horizontal
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _PeProvisionner__PeProvisionerSimple = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.PE_PROVISIONNER.getEEnumLiteral("PeProvisionerSimple"), Types._PeProvisionner, 0);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PeProvisionner = {
			_PeProvisionner__PeProvisionerSimple
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _RamProvisionner__RamProvisionerSimple = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.RAM_PROVISIONNER.getEEnumLiteral("RamProvisionerSimple"), Types._RamProvisionner, 0);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _RamProvisionner = {
			_RamProvisionner__RamProvisionerSimple
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VmScheduler__VmSchedulerSpaceShared = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.VM_SCHEDULER.getEEnumLiteral("VmSchedulerSpaceShared"), Types._VmScheduler, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VmScheduler__VmSchedulerTimeShared = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.VM_SCHEDULER.getEEnumLiteral("VmSchedulerTimeShared"), Types._VmScheduler, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VmScheduler = {
			_VmScheduler__VmSchedulerSpaceShared,
			_VmScheduler__VmSchedulerTimeShared
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _utilizationModel__UtilizationModelFull = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.UTILIZATION_MODEL.getEEnumLiteral("UtilizationModelFull"), Types._utilizationModel, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _utilizationModel__UtilizationModelNull = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.UTILIZATION_MODEL.getEEnumLiteral("UtilizationModelNull"), Types._utilizationModel, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _utilizationModel__UtilizationModelPlanetLabInMemory = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.UTILIZATION_MODEL.getEEnumLiteral("UtilizationModelPlanetLabInMemory"), Types._utilizationModel, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _utilizationModel__UtilizationModelStochastic = new EcoreExecutorEnumerationLiteral(SimulationPackage.Literals.UTILIZATION_MODEL.getEEnumLiteral("UtilizationModelStochastic"), Types._utilizationModel, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _utilizationModel = {
			_utilizationModel__UtilizationModelFull,
			_utilizationModel__UtilizationModelNull,
			_utilizationModel__UtilizationModelPlanetLabInMemory,
			_utilizationModel__UtilizationModelStochastic
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._BwProvisionner.initLiterals(_BwProvisionner);
			Types._CloudletScheduler.initLiterals(_CloudletScheduler);
			Types._ElasticityType.initLiterals(_ElasticityType);
			Types._PeProvisionner.initLiterals(_PeProvisionner);
			Types._RamProvisionner.initLiterals(_RamProvisionner);
			Types._VmScheduler.initLiterals(_VmScheduler);
			Types._utilizationModel.initLiterals(_utilizationModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
