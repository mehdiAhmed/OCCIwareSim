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

import occ.simulation.*;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Storage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see occ.simulation.SimulationPackage
 * @generated
 */
public class SimulationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimulationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationSwitch() {
		if (modelPackage == null) {
			modelPackage = SimulationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimulationPackage.DATACENTER: {
				Datacenter datacenter = (Datacenter)theEObject;
				T result = caseDatacenter(datacenter);
				if (result == null) result = caseCompute(datacenter);
				if (result == null) result = caseResource(datacenter);
				if (result == null) result = caseEntity(datacenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.VM: {
				Vm vm = (Vm)theEObject;
				T result = caseVm(vm);
				if (result == null) result = caseCompute(vm);
				if (result == null) result = caseResource(vm);
				if (result == null) result = caseEntity(vm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.HOST: {
				Host host = (Host)theEObject;
				T result = caseHost(host);
				if (result == null) result = caseCompute(host);
				if (result == null) result = caseResource(host);
				if (result == null) result = caseEntity(host);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.CLOUDLET: {
				Cloudlet cloudlet = (Cloudlet)theEObject;
				T result = caseCloudlet(cloudlet);
				if (result == null) result = caseCompute(cloudlet);
				if (result == null) result = caseResource(cloudlet);
				if (result == null) result = caseEntity(cloudlet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.HARDDRIVE: {
				Harddrive harddrive = (Harddrive)theEObject;
				T result = caseHarddrive(harddrive);
				if (result == null) result = caseStorage(harddrive);
				if (result == null) result = caseResource(harddrive);
				if (result == null) result = caseEntity(harddrive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.SANSTORAGE: {
				Sanstorage sanstorage = (Sanstorage)theEObject;
				T result = caseSanstorage(sanstorage);
				if (result == null) result = caseStorage(sanstorage);
				if (result == null) result = caseResource(sanstorage);
				if (result == null) result = caseEntity(sanstorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.PRICESTRATEGY: {
				Pricestrategy pricestrategy = (Pricestrategy)theEObject;
				T result = casePricestrategy(pricestrategy);
				if (result == null) result = caseMixinBase(pricestrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.SPOT: {
				Spot spot = (Spot)theEObject;
				T result = caseSpot(spot);
				if (result == null) result = casePricestrategy(spot);
				if (result == null) result = caseMixinBase(spot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.ONDEMAND: {
				Ondemand ondemand = (Ondemand)theEObject;
				T result = caseOndemand(ondemand);
				if (result == null) result = casePricestrategy(ondemand);
				if (result == null) result = caseMixinBase(ondemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.UPFRONT: {
				Upfront upfront = (Upfront)theEObject;
				T result = caseUpfront(upfront);
				if (result == null) result = casePricestrategy(upfront);
				if (result == null) result = caseMixinBase(upfront);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datacenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatacenter(Datacenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVm(Vm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHost(Host object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloudlet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloudlet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudlet(Cloudlet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Harddrive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Harddrive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHarddrive(Harddrive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sanstorage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sanstorage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSanstorage(Sanstorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pricestrategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pricestrategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePricestrategy(Pricestrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpot(Spot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ondemand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ondemand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOndemand(Ondemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpfront(Upfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimulationSwitch
