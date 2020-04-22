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
 * A representation of the literals of the enumeration '<em><b>Vm Scheduler</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see occ.simulation.SimulationPackage#getVmScheduler()
 * @model
 * @generated
 */
public enum VmScheduler implements Enumerator {
	/**
	 * The '<em><b>Vm Scheduler Space Shared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_SCHEDULER_SPACE_SHARED_VALUE
	 * @generated
	 * @ordered
	 */
	VM_SCHEDULER_SPACE_SHARED(0, "VmSchedulerSpaceShared", "VmSchedulerSpaceShared"),

	/**
	 * The '<em><b>Vm Scheduler Time Shared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_SCHEDULER_TIME_SHARED_VALUE
	 * @generated
	 * @ordered
	 */
	VM_SCHEDULER_TIME_SHARED(1, "VmSchedulerTimeShared", "VmSchedulerTimeShared");

	/**
	 * The '<em><b>Vm Scheduler Space Shared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vm Scheduler Space Shared</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VM_SCHEDULER_SPACE_SHARED
	 * @model name="VmSchedulerSpaceShared"
	 * @generated
	 * @ordered
	 */
	public static final int VM_SCHEDULER_SPACE_SHARED_VALUE = 0;

	/**
	 * The '<em><b>Vm Scheduler Time Shared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vm Scheduler Time Shared</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VM_SCHEDULER_TIME_SHARED
	 * @model name="VmSchedulerTimeShared"
	 * @generated
	 * @ordered
	 */
	public static final int VM_SCHEDULER_TIME_SHARED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Vm Scheduler</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VmScheduler[] VALUES_ARRAY =
		new VmScheduler[] {
			VM_SCHEDULER_SPACE_SHARED,
			VM_SCHEDULER_TIME_SHARED,
		};

	/**
	 * A public read-only list of all the '<em><b>Vm Scheduler</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VmScheduler> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vm Scheduler</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VmScheduler get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VmScheduler result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vm Scheduler</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VmScheduler getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VmScheduler result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vm Scheduler</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VmScheduler get(int value) {
		switch (value) {
			case VM_SCHEDULER_SPACE_SHARED_VALUE: return VM_SCHEDULER_SPACE_SHARED;
			case VM_SCHEDULER_TIME_SHARED_VALUE: return VM_SCHEDULER_TIME_SHARED;
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
	private VmScheduler(int value, String name, String literal) {
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
	
} //VmScheduler
