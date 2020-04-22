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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see occ.simulation.SimulationPackage
 * @generated
 */
public interface SimulationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulationFactory eINSTANCE = occ.simulation.impl.SimulationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datacenter</em>'.
	 * @generated
	 */
	Datacenter createDatacenter();

	/**
	 * Returns a new object of class '<em>Vm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vm</em>'.
	 * @generated
	 */
	Vm createVm();

	/**
	 * Returns a new object of class '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host</em>'.
	 * @generated
	 */
	Host createHost();

	/**
	 * Returns a new object of class '<em>Cloudlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudlet</em>'.
	 * @generated
	 */
	Cloudlet createCloudlet();

	/**
	 * Returns a new object of class '<em>Harddrive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Harddrive</em>'.
	 * @generated
	 */
	Harddrive createHarddrive();

	/**
	 * Returns a new object of class '<em>Sanstorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sanstorage</em>'.
	 * @generated
	 */
	Sanstorage createSanstorage();

	/**
	 * Returns a new object of class '<em>Pricestrategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pricestrategy</em>'.
	 * @generated
	 */
	Pricestrategy createPricestrategy();

	/**
	 * Returns a new object of class '<em>Spot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spot</em>'.
	 * @generated
	 */
	Spot createSpot();

	/**
	 * Returns a new object of class '<em>Ondemand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ondemand</em>'.
	 * @generated
	 */
	Ondemand createOndemand();

	/**
	 * Returns a new object of class '<em>Upfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upfront</em>'.
	 * @generated
	 */
	Upfront createUpfront();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimulationPackage getSimulationPackage();

} //SimulationFactory
