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
 * A representation of the model object '<em><b>Vm</b></em>'.
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
 *   <li>{@link occ.simulation.Vm#getVmId <em>Vm Id</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmMips <em>Vm Mips</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmCores <em>Vm Cores</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmImageSize <em>Vm Image Size</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmBw <em>Vm Bw</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmRam <em>Vm Ram</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmOs <em>Vm Os</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmCloudletScheduler <em>Vm Cloudlet Scheduler</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmElasticity <em>Vm Elasticity</em>}</li>
 *   <li>{@link occ.simulation.Vm#getVmVmm <em>Vm Vmm</em>}</li>
 * </ul>
 *
 * @see occ.simulation.SimulationPackage#getVm()
 * @model
 * @generated
 */
public interface Vm extends Compute {
	/**
	 * Returns the value of the '<em><b>Vm Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Id</em>' attribute.
	 * @see #setVmId(Integer)
	 * @see occ.simulation.SimulationPackage#getVm_VmId()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmId'"
	 * @generated
	 */
	Integer getVmId();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmId <em>Vm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Id</em>' attribute.
	 * @see #getVmId()
	 * @generated
	 */
	void setVmId(Integer value);

	/**
	 * Returns the value of the '<em><b>Vm Mips</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Mips</em>' attribute.
	 * @see #setVmMips(Integer)
	 * @see occ.simulation.SimulationPackage#getVm_VmMips()
	 * @model default="1000" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmMips'"
	 * @generated
	 */
	Integer getVmMips();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmMips <em>Vm Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Mips</em>' attribute.
	 * @see #getVmMips()
	 * @generated
	 */
	void setVmMips(Integer value);

	/**
	 * Returns the value of the '<em><b>Vm Cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Cores</em>' attribute.
	 * @see #setVmCores(Integer)
	 * @see occ.simulation.SimulationPackage#getVm_VmCores()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmCores'"
	 * @generated
	 */
	Integer getVmCores();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmCores <em>Vm Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Cores</em>' attribute.
	 * @see #getVmCores()
	 * @generated
	 */
	void setVmCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Vm Image Size</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Image Size</em>' attribute.
	 * @see #setVmImageSize(Long)
	 * @see occ.simulation.SimulationPackage#getVm_VmImageSize()
	 * @model default="10000" dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmImageSize'"
	 * @generated
	 */
	Long getVmImageSize();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmImageSize <em>Vm Image Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Image Size</em>' attribute.
	 * @see #getVmImageSize()
	 * @generated
	 */
	void setVmImageSize(Long value);

	/**
	 * Returns the value of the '<em><b>Vm Bw</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Bw</em>' attribute.
	 * @see #setVmBw(Long)
	 * @see occ.simulation.SimulationPackage#getVm_VmBw()
	 * @model default="1000" dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmBw'"
	 * @generated
	 */
	Long getVmBw();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmBw <em>Vm Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Bw</em>' attribute.
	 * @see #getVmBw()
	 * @generated
	 */
	void setVmBw(Long value);

	/**
	 * Returns the value of the '<em><b>Vm Ram</b></em>' attribute.
	 * The default value is <code>"512"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Ram</em>' attribute.
	 * @see #setVmRam(Integer)
	 * @see occ.simulation.SimulationPackage#getVm_VmRam()
	 * @model default="512" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmRam'"
	 * @generated
	 */
	Integer getVmRam();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmRam <em>Vm Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Ram</em>' attribute.
	 * @see #getVmRam()
	 * @generated
	 */
	void setVmRam(Integer value);

	/**
	 * Returns the value of the '<em><b>Vm Os</b></em>' attribute.
	 * The default value is <code>"Linux"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Os</em>' attribute.
	 * @see #setVmOs(String)
	 * @see occ.simulation.SimulationPackage#getVm_VmOs()
	 * @model default="Linux" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmOs'"
	 * @generated
	 */
	String getVmOs();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmOs <em>Vm Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Os</em>' attribute.
	 * @see #getVmOs()
	 * @generated
	 */
	void setVmOs(String value);

	/**
	 * Returns the value of the '<em><b>Vm Cloudlet Scheduler</b></em>' attribute.
	 * The default value is <code>"CloudletSchedulerTimeShared"</code>.
	 * The literals are from the enumeration {@link occ.simulation.CloudletScheduler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Cloudlet Scheduler</em>' attribute.
	 * @see occ.simulation.CloudletScheduler
	 * @see #setVmCloudletScheduler(CloudletScheduler)
	 * @see occ.simulation.SimulationPackage#getVm_VmCloudletScheduler()
	 * @model default="CloudletSchedulerTimeShared"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmCloudletScheduler'"
	 * @generated
	 */
	CloudletScheduler getVmCloudletScheduler();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmCloudletScheduler <em>Vm Cloudlet Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Cloudlet Scheduler</em>' attribute.
	 * @see occ.simulation.CloudletScheduler
	 * @see #getVmCloudletScheduler()
	 * @generated
	 */
	void setVmCloudletScheduler(CloudletScheduler value);

	/**
	 * Returns the value of the '<em><b>Vm Elasticity</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link occ.simulation.ElasticityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Elasticity</em>' attribute.
	 * @see occ.simulation.ElasticityType
	 * @see #setVmElasticity(ElasticityType)
	 * @see occ.simulation.SimulationPackage#getVm_VmElasticity()
	 * @model default="None"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmElasticity'"
	 * @generated
	 */
	ElasticityType getVmElasticity();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmElasticity <em>Vm Elasticity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Elasticity</em>' attribute.
	 * @see occ.simulation.ElasticityType
	 * @see #getVmElasticity()
	 * @generated
	 */
	void setVmElasticity(ElasticityType value);

	/**
	 * Returns the value of the '<em><b>Vm Vmm</b></em>' attribute.
	 * The default value is <code>"Xen"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Vmm</em>' attribute.
	 * @see #setVmVmm(String)
	 * @see occ.simulation.SimulationPackage#getVm_VmVmm()
	 * @model default="Xen" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmVmm'"
	 * @generated
	 */
	String getVmVmm();

	/**
	 * Sets the value of the '{@link occ.simulation.Vm#getVmVmm <em>Vm Vmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Vmm</em>' attribute.
	 * @see #getVmVmm()
	 * @generated
	 */
	void setVmVmm(String value);

} // Vm
