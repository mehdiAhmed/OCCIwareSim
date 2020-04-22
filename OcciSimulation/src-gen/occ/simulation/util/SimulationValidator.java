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
package occ.simulation.util;

import java.util.Map;

import occ.simulation.*;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see occ.simulation.SimulationPackage
 * @generated
 */
public class SimulationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimulationValidator INSTANCE = new SimulationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "occ.simulation";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Pricestrategy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRICESTRATEGY__APPLIES_CONSTRAINT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SimulationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SimulationPackage.DATACENTER:
				return validateDatacenter((Datacenter)value, diagnostics, context);
			case SimulationPackage.VM:
				return validateVm((Vm)value, diagnostics, context);
			case SimulationPackage.HOST:
				return validateHost((Host)value, diagnostics, context);
			case SimulationPackage.CLOUDLET:
				return validateCloudlet((Cloudlet)value, diagnostics, context);
			case SimulationPackage.HARDDRIVE:
				return validateHarddrive((Harddrive)value, diagnostics, context);
			case SimulationPackage.SANSTORAGE:
				return validateSanstorage((Sanstorage)value, diagnostics, context);
			case SimulationPackage.PRICESTRATEGY:
				return validatePricestrategy((Pricestrategy)value, diagnostics, context);
			case SimulationPackage.SPOT:
				return validateSpot((Spot)value, diagnostics, context);
			case SimulationPackage.ONDEMAND:
				return validateOndemand((Ondemand)value, diagnostics, context);
			case SimulationPackage.UPFRONT:
				return validateUpfront((Upfront)value, diagnostics, context);
			case SimulationPackage.ELASTICITY_TYPE:
				return validateElasticityType((ElasticityType)value, diagnostics, context);
			case SimulationPackage.CLOUDLET_SCHEDULER:
				return validateCloudletScheduler((CloudletScheduler)value, diagnostics, context);
			case SimulationPackage.UTILIZATION_MODEL:
				return validateutilizationModel((utilizationModel)value, diagnostics, context);
			case SimulationPackage.VM_SCHEDULER:
				return validateVmScheduler((VmScheduler)value, diagnostics, context);
			case SimulationPackage.PE_PROVISIONNER:
				return validatePeProvisionner((PeProvisionner)value, diagnostics, context);
			case SimulationPackage.RAM_PROVISIONNER:
				return validateRamProvisionner((RamProvisionner)value, diagnostics, context);
			case SimulationPackage.BW_PROVISIONNER:
				return validateBwProvisionner((BwProvisionner)value, diagnostics, context);
			case SimulationPackage.DOUBLE:
				return validatedouble((Double)value, diagnostics, context);
			case SimulationPackage.LONG:
				return validateLong((Long)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatacenter(Datacenter datacenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(datacenter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(datacenter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVm(Vm vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(vm, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(vm, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(vm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHost(Host host, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(host, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(host, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(host, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(host, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(host, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(host, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(host, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudlet(Cloudlet cloudlet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudlet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(cloudlet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHarddrive(Harddrive harddrive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(harddrive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(harddrive, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(harddrive, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSanstorage(Sanstorage sanstorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sanstorage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(sanstorage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePricestrategy(Pricestrategy pricestrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pricestrategy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pricestrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pricestrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pricestrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pricestrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pricestrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pricestrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pricestrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pricestrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validatePricestrategy_appliesConstraint(pricestrategy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Pricestrategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePricestrategy_appliesConstraint(Pricestrategy pricestrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pricestrategy.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpot(Spot spot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(spot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(spot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(spot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(spot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(spot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(spot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(spot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(spot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(spot, diagnostics, context);
		if (result || diagnostics != null) result &= validatePricestrategy_appliesConstraint(spot, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOndemand(Ondemand ondemand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ondemand, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validatePricestrategy_appliesConstraint(ondemand, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpfront(Upfront upfront, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(upfront, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validatePricestrategy_appliesConstraint(upfront, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElasticityType(ElasticityType elasticityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudletScheduler(CloudletScheduler cloudletScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateutilizationModel(utilizationModel utilizationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmScheduler(VmScheduler vmScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeProvisionner(PeProvisionner peProvisionner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRamProvisionner(RamProvisionner ramProvisionner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBwProvisionner(BwProvisionner bwProvisionner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong(Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SimulationValidator
