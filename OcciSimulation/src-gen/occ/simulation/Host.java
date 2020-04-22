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
 * A representation of the model object '<em><b>Host</b></em>'.
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
 *   <li>{@link occ.simulation.Host#getHostId <em>Host Id</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostRamProvisionner <em>Host Ram Provisionner</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostBwProvisionner <em>Host Bw Provisionner</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostStorage <em>Host Storage</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostCores <em>Host Cores</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostVmScheduler <em>Host Vm Scheduler</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostRam <em>Host Ram</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostMips <em>Host Mips</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostBw <em>Host Bw</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostPeProvisionner <em>Host Pe Provisionner</em>}</li>
 *   <li>{@link occ.simulation.Host#getHostElasticity <em>Host Elasticity</em>}</li>
 * </ul>
 *
 * @see occ.simulation.SimulationPackage#getHost()
 * @model
 * @generated
 */
public interface Host extends Compute {
	/**
	 * Returns the value of the '<em><b>Host Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Id</em>' attribute.
	 * @see #setHostId(Integer)
	 * @see occ.simulation.SimulationPackage#getHost_HostId()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostId'"
	 * @generated
	 */
	Integer getHostId();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostId <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Id</em>' attribute.
	 * @see #getHostId()
	 * @generated
	 */
	void setHostId(Integer value);

	/**
	 * Returns the value of the '<em><b>Host Ram Provisionner</b></em>' attribute.
	 * The default value is <code>"RamProvisionerSimple"</code>.
	 * The literals are from the enumeration {@link occ.simulation.RamProvisionner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Ram Provisionner</em>' attribute.
	 * @see occ.simulation.RamProvisionner
	 * @see #setHostRamProvisionner(RamProvisionner)
	 * @see occ.simulation.SimulationPackage#getHost_HostRamProvisionner()
	 * @model default="RamProvisionerSimple"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostRamProvisionner'"
	 * @generated
	 */
	RamProvisionner getHostRamProvisionner();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostRamProvisionner <em>Host Ram Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Ram Provisionner</em>' attribute.
	 * @see occ.simulation.RamProvisionner
	 * @see #getHostRamProvisionner()
	 * @generated
	 */
	void setHostRamProvisionner(RamProvisionner value);

	/**
	 * Returns the value of the '<em><b>Host Bw Provisionner</b></em>' attribute.
	 * The default value is <code>"BwProvisionerSimple"</code>.
	 * The literals are from the enumeration {@link occ.simulation.BwProvisionner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Bw Provisionner</em>' attribute.
	 * @see occ.simulation.BwProvisionner
	 * @see #setHostBwProvisionner(BwProvisionner)
	 * @see occ.simulation.SimulationPackage#getHost_HostBwProvisionner()
	 * @model default="BwProvisionerSimple"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostBwProvisionner'"
	 * @generated
	 */
	BwProvisionner getHostBwProvisionner();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostBwProvisionner <em>Host Bw Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Bw Provisionner</em>' attribute.
	 * @see occ.simulation.BwProvisionner
	 * @see #getHostBwProvisionner()
	 * @generated
	 */
	void setHostBwProvisionner(BwProvisionner value);

	/**
	 * Returns the value of the '<em><b>Host Storage</b></em>' attribute.
	 * The default value is <code>"1000000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Storage</em>' attribute.
	 * @see #setHostStorage(Long)
	 * @see occ.simulation.SimulationPackage#getHost_HostStorage()
	 * @model default="1000000" dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostStorage'"
	 * @generated
	 */
	Long getHostStorage();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostStorage <em>Host Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Storage</em>' attribute.
	 * @see #getHostStorage()
	 * @generated
	 */
	void setHostStorage(Long value);

	/**
	 * Returns the value of the '<em><b>Host Cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Cores</em>' attribute.
	 * @see #setHostCores(Integer)
	 * @see occ.simulation.SimulationPackage#getHost_HostCores()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostCores'"
	 * @generated
	 */
	Integer getHostCores();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostCores <em>Host Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Cores</em>' attribute.
	 * @see #getHostCores()
	 * @generated
	 */
	void setHostCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Host Vm Scheduler</b></em>' attribute.
	 * The default value is <code>"VmSchedulerTimeShared"</code>.
	 * The literals are from the enumeration {@link occ.simulation.VmScheduler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Vm Scheduler</em>' attribute.
	 * @see occ.simulation.VmScheduler
	 * @see #setHostVmScheduler(VmScheduler)
	 * @see occ.simulation.SimulationPackage#getHost_HostVmScheduler()
	 * @model default="VmSchedulerTimeShared"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostVmScheduler'"
	 * @generated
	 */
	VmScheduler getHostVmScheduler();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostVmScheduler <em>Host Vm Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Vm Scheduler</em>' attribute.
	 * @see occ.simulation.VmScheduler
	 * @see #getHostVmScheduler()
	 * @generated
	 */
	void setHostVmScheduler(VmScheduler value);

	/**
	 * Returns the value of the '<em><b>Host Ram</b></em>' attribute.
	 * The default value is <code>"2048"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Ram</em>' attribute.
	 * @see #setHostRam(Integer)
	 * @see occ.simulation.SimulationPackage#getHost_HostRam()
	 * @model default="2048" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostRam'"
	 * @generated
	 */
	Integer getHostRam();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostRam <em>Host Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Ram</em>' attribute.
	 * @see #getHostRam()
	 * @generated
	 */
	void setHostRam(Integer value);

	/**
	 * Returns the value of the '<em><b>Host Mips</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Mips</em>' attribute.
	 * @see #setHostMips(Integer)
	 * @see occ.simulation.SimulationPackage#getHost_HostMips()
	 * @model default="1000" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostMips'"
	 * @generated
	 */
	Integer getHostMips();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostMips <em>Host Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Mips</em>' attribute.
	 * @see #getHostMips()
	 * @generated
	 */
	void setHostMips(Integer value);

	/**
	 * Returns the value of the '<em><b>Host Bw</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Bw</em>' attribute.
	 * @see #setHostBw(Integer)
	 * @see occ.simulation.SimulationPackage#getHost_HostBw()
	 * @model default="10000" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostBw'"
	 * @generated
	 */
	Integer getHostBw();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostBw <em>Host Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Bw</em>' attribute.
	 * @see #getHostBw()
	 * @generated
	 */
	void setHostBw(Integer value);

	/**
	 * Returns the value of the '<em><b>Host Pe Provisionner</b></em>' attribute.
	 * The default value is <code>"PeProvisionerSimple"</code>.
	 * The literals are from the enumeration {@link occ.simulation.PeProvisionner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Pe Provisionner</em>' attribute.
	 * @see occ.simulation.PeProvisionner
	 * @see #setHostPeProvisionner(PeProvisionner)
	 * @see occ.simulation.SimulationPackage#getHost_HostPeProvisionner()
	 * @model default="PeProvisionerSimple"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostPeProvisionner'"
	 * @generated
	 */
	PeProvisionner getHostPeProvisionner();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostPeProvisionner <em>Host Pe Provisionner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Pe Provisionner</em>' attribute.
	 * @see occ.simulation.PeProvisionner
	 * @see #getHostPeProvisionner()
	 * @generated
	 */
	void setHostPeProvisionner(PeProvisionner value);

	/**
	 * Returns the value of the '<em><b>Host Elasticity</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link occ.simulation.ElasticityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Elasticity</em>' attribute.
	 * @see occ.simulation.ElasticityType
	 * @see #setHostElasticity(ElasticityType)
	 * @see occ.simulation.SimulationPackage#getHost_HostElasticity()
	 * @model default="None"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!hostElasticity'"
	 * @generated
	 */
	ElasticityType getHostElasticity();

	/**
	 * Sets the value of the '{@link occ.simulation.Host#getHostElasticity <em>Host Elasticity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Elasticity</em>' attribute.
	 * @see occ.simulation.ElasticityType
	 * @see #getHostElasticity()
	 * @generated
	 */
	void setHostElasticity(ElasticityType value);

} // Host
