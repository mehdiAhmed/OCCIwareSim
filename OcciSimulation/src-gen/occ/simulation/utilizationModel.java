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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>utilization Model</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see occ.simulation.SimulationPackage#getutilizationModel()
 * @model
 * @generated
 */
public enum utilizationModel implements Enumerator {
	/**
	 * The '<em><b>Utilization Model Full</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTILIZATION_MODEL_FULL_VALUE
	 * @generated
	 * @ordered
	 */
	UTILIZATION_MODEL_FULL(0, "UtilizationModelFull", "UtilizationModelFull"),

	/**
	 * The '<em><b>Utilization Model Null</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTILIZATION_MODEL_NULL_VALUE
	 * @generated
	 * @ordered
	 */
	UTILIZATION_MODEL_NULL(1, "UtilizationModelNull", "UtilizationModelNull"),

	/**
	 * The '<em><b>Utilization Model Planet Lab In Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTILIZATION_MODEL_PLANET_LAB_IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	UTILIZATION_MODEL_PLANET_LAB_IN_MEMORY(2, "UtilizationModelPlanetLabInMemory", "UtilizationModelPlanetLabInMemory"),

	/**
	 * The '<em><b>Utilization Model Stochastic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTILIZATION_MODEL_STOCHASTIC_VALUE
	 * @generated
	 * @ordered
	 */
	UTILIZATION_MODEL_STOCHASTIC(3, "UtilizationModelStochastic", "UtilizationModelStochastic");

	/**
	 * The '<em><b>Utilization Model Full</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Utilization Model Full</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTILIZATION_MODEL_FULL
	 * @model name="UtilizationModelFull"
	 * @generated
	 * @ordered
	 */
	public static final int UTILIZATION_MODEL_FULL_VALUE = 0;

	/**
	 * The '<em><b>Utilization Model Null</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Utilization Model Null</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTILIZATION_MODEL_NULL
	 * @model name="UtilizationModelNull"
	 * @generated
	 * @ordered
	 */
	public static final int UTILIZATION_MODEL_NULL_VALUE = 1;

	/**
	 * The '<em><b>Utilization Model Planet Lab In Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Utilization Model Planet Lab In Memory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTILIZATION_MODEL_PLANET_LAB_IN_MEMORY
	 * @model name="UtilizationModelPlanetLabInMemory"
	 * @generated
	 * @ordered
	 */
	public static final int UTILIZATION_MODEL_PLANET_LAB_IN_MEMORY_VALUE = 2;

	/**
	 * The '<em><b>Utilization Model Stochastic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Utilization Model Stochastic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTILIZATION_MODEL_STOCHASTIC
	 * @model name="UtilizationModelStochastic"
	 * @generated
	 * @ordered
	 */
	public static final int UTILIZATION_MODEL_STOCHASTIC_VALUE = 3;

	/**
	 * An array of all the '<em><b>utilization Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final utilizationModel[] VALUES_ARRAY =
		new utilizationModel[] {
			UTILIZATION_MODEL_FULL,
			UTILIZATION_MODEL_NULL,
			UTILIZATION_MODEL_PLANET_LAB_IN_MEMORY,
			UTILIZATION_MODEL_STOCHASTIC,
		};

	/**
	 * A public read-only list of all the '<em><b>utilization Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<utilizationModel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>utilization Model</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static utilizationModel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			utilizationModel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>utilization Model</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static utilizationModel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			utilizationModel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>utilization Model</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static utilizationModel get(int value) {
		switch (value) {
			case UTILIZATION_MODEL_FULL_VALUE: return UTILIZATION_MODEL_FULL;
			case UTILIZATION_MODEL_NULL_VALUE: return UTILIZATION_MODEL_NULL;
			case UTILIZATION_MODEL_PLANET_LAB_IN_MEMORY_VALUE: return UTILIZATION_MODEL_PLANET_LAB_IN_MEMORY;
			case UTILIZATION_MODEL_STOCHASTIC_VALUE: return UTILIZATION_MODEL_STOCHASTIC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private utilizationModel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //utilizationModel
