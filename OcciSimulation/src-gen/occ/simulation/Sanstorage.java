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

import org.eclipse.cmf.occi.infrastructure.Storage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sanstorage</b></em>'.
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
 *   <li>{@link occ.simulation.Sanstorage#getBandwith <em>Bandwith</em>}</li>
 *   <li>{@link occ.simulation.Sanstorage#getLatency <em>Latency</em>}</li>
 * </ul>
 *
 * @see occ.simulation.SimulationPackage#getSanstorage()
 * @model
 * @generated
 */
public interface Sanstorage extends Storage {
	/**
	 * Returns the value of the '<em><b>Bandwith</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bandwith</em>' attribute.
	 * @see #setBandwith(Integer)
	 * @see occ.simulation.SimulationPackage#getSanstorage_Bandwith()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Sanstorage!bandwith'"
	 * @generated
	 */
	Integer getBandwith();

	/**
	 * Sets the value of the '{@link occ.simulation.Sanstorage#getBandwith <em>Bandwith</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwith</em>' attribute.
	 * @see #getBandwith()
	 * @generated
	 */
	void setBandwith(Integer value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(Double)
	 * @see occ.simulation.SimulationPackage#getSanstorage_Latency()
	 * @model dataType="occ.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Sanstorage!latency'"
	 * @generated
	 */
	Double getLatency();

	/**
	 * Sets the value of the '{@link occ.simulation.Sanstorage#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(Double value);

} // Sanstorage
