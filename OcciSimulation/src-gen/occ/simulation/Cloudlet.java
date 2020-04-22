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
 * A representation of the model object '<em><b>Cloudlet</b></em>'.
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
 *   <li>{@link occ.simulation.Cloudlet#getCloudletId <em>Cloudlet Id</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletLength <em>Cloudlet Length</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletCores <em>Cloudlet Cores</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletFileSize <em>Cloudlet File Size</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletOutputSize <em>Cloudlet Output Size</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletUtilizationModelCpu <em>Cloudlet Utilization Model Cpu</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletUtilizationModelRam <em>Cloudlet Utilization Model Ram</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletUtilizationModelBw <em>Cloudlet Utilization Model Bw</em>}</li>
 * </ul>
 *
 * @see occ.simulation.SimulationPackage#getCloudlet()
 * @model
 * @generated
 */
public interface Cloudlet extends Compute {
	/**
	 * Returns the value of the '<em><b>Cloudlet Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Id</em>' attribute.
	 * @see #setCloudletId(Integer)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletId()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletId'"
	 * @generated
	 */
	Integer getCloudletId();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletId <em>Cloudlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Id</em>' attribute.
	 * @see #getCloudletId()
	 * @generated
	 */
	void setCloudletId(Integer value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Length</b></em>' attribute.
	 * The default value is <code>"400000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Length</em>' attribute.
	 * @see #setCloudletLength(Long)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletLength()
	 * @model default="400000" dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletLength'"
	 * @generated
	 */
	Long getCloudletLength();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletLength <em>Cloudlet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Length</em>' attribute.
	 * @see #getCloudletLength()
	 * @generated
	 */
	void setCloudletLength(Long value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Cores</em>' attribute.
	 * @see #setCloudletCores(Integer)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletCores()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletCores'"
	 * @generated
	 */
	Integer getCloudletCores();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletCores <em>Cloudlet Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Cores</em>' attribute.
	 * @see #getCloudletCores()
	 * @generated
	 */
	void setCloudletCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Cloudlet File Size</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet File Size</em>' attribute.
	 * @see #setCloudletFileSize(Long)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletFileSize()
	 * @model default="300" dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletFileSize'"
	 * @generated
	 */
	Long getCloudletFileSize();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletFileSize <em>Cloudlet File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet File Size</em>' attribute.
	 * @see #getCloudletFileSize()
	 * @generated
	 */
	void setCloudletFileSize(Long value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Output Size</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Output Size</em>' attribute.
	 * @see #setCloudletOutputSize(Long)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletOutputSize()
	 * @model default="300" dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletOutputSize'"
	 * @generated
	 */
	Long getCloudletOutputSize();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletOutputSize <em>Cloudlet Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Output Size</em>' attribute.
	 * @see #getCloudletOutputSize()
	 * @generated
	 */
	void setCloudletOutputSize(Long value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Utilization Model Cpu</b></em>' attribute.
	 * The default value is <code>"UtilizationModelFull"</code>.
	 * The literals are from the enumeration {@link occ.simulation.utilizationModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Utilization Model Cpu</em>' attribute.
	 * @see occ.simulation.utilizationModel
	 * @see #setCloudletUtilizationModelCpu(utilizationModel)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletUtilizationModelCpu()
	 * @model default="UtilizationModelFull"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletUtilizationModelCpu'"
	 * @generated
	 */
	utilizationModel getCloudletUtilizationModelCpu();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelCpu <em>Cloudlet Utilization Model Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Utilization Model Cpu</em>' attribute.
	 * @see occ.simulation.utilizationModel
	 * @see #getCloudletUtilizationModelCpu()
	 * @generated
	 */
	void setCloudletUtilizationModelCpu(utilizationModel value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Utilization Model Ram</b></em>' attribute.
	 * The default value is <code>"UtilizationModelFull"</code>.
	 * The literals are from the enumeration {@link occ.simulation.utilizationModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Utilization Model Ram</em>' attribute.
	 * @see occ.simulation.utilizationModel
	 * @see #setCloudletUtilizationModelRam(utilizationModel)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletUtilizationModelRam()
	 * @model default="UtilizationModelFull"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletUtilizationModelRam'"
	 * @generated
	 */
	utilizationModel getCloudletUtilizationModelRam();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelRam <em>Cloudlet Utilization Model Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Utilization Model Ram</em>' attribute.
	 * @see occ.simulation.utilizationModel
	 * @see #getCloudletUtilizationModelRam()
	 * @generated
	 */
	void setCloudletUtilizationModelRam(utilizationModel value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Utilization Model Bw</b></em>' attribute.
	 * The default value is <code>"UtilizationModelFull"</code>.
	 * The literals are from the enumeration {@link occ.simulation.utilizationModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Utilization Model Bw</em>' attribute.
	 * @see occ.simulation.utilizationModel
	 * @see #setCloudletUtilizationModelBw(utilizationModel)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletUtilizationModelBw()
	 * @model default="UtilizationModelFull"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletUtilizationModelBw'"
	 * @generated
	 */
	utilizationModel getCloudletUtilizationModelBw();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelBw <em>Cloudlet Utilization Model Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Utilization Model Bw</em>' attribute.
	 * @see occ.simulation.utilizationModel
	 * @see #getCloudletUtilizationModelBw()
	 * @generated
	 */
	void setCloudletUtilizationModelBw(utilizationModel value);

} // Cloudlet
