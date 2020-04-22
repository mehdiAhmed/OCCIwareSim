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
package occ.simulation.provider;


import java.util.Collection;
import java.util.List;

import occ.simulation.Datacenter;
import occ.simulation.SimulationFactory;
import occ.simulation.SimulationPackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.provider.ComputeItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link occ.simulation.Datacenter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatacenterItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatacenterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDatacenterOsPropertyDescriptor(object);
			addDatacenterLocationPropertyDescriptor(object);
			addDatacenterTimezonePropertyDescriptor(object);
			addDatacenterCostMemPropertyDescriptor(object);
			addDatacenterCostBwPropertyDescriptor(object);
			addDatacenterCostStorgePropertyDescriptor(object);
			addDatacenterCostProcessPropertyDescriptor(object);
			addDatacenterVmmPropertyDescriptor(object);
			addDatacenterNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Datacenter Os feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterOsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterOs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterOs_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_OS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterLocation_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter Timezone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterTimezonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterTimezone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterTimezone_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_TIMEZONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter Cost Mem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterCostMemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterCostMem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterCostMem_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_COST_MEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter Cost Bw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterCostBwPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterCostBw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterCostBw_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_COST_BW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter Cost Storge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterCostStorgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterCostStorge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterCostStorge_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_COST_STORGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter Cost Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterCostProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterCostProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterCostProcess_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_COST_PROCESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter Vmm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterVmmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterVmm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterVmm_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_VMM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datacenter Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatacenterNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datacenter_datacenterName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datacenter_datacenterName_feature", "_UI_Datacenter_type"),
				 SimulationPackage.Literals.DATACENTER__DATACENTER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Datacenter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Datacenter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Datacenter)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Datacenter_type") :
			getString("_UI_Datacenter_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Datacenter.class)) {
			case SimulationPackage.DATACENTER__DATACENTER_OS:
			case SimulationPackage.DATACENTER__DATACENTER_LOCATION:
			case SimulationPackage.DATACENTER__DATACENTER_TIMEZONE:
			case SimulationPackage.DATACENTER__DATACENTER_COST_MEM:
			case SimulationPackage.DATACENTER__DATACENTER_COST_BW:
			case SimulationPackage.DATACENTER__DATACENTER_COST_STORGE:
			case SimulationPackage.DATACENTER__DATACENTER_COST_PROCESS:
			case SimulationPackage.DATACENTER__DATACENTER_VMM:
			case SimulationPackage.DATACENTER__DATACENTER_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 SimulationFactory.eINSTANCE.createPricestrategy()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 SimulationFactory.eINSTANCE.createSpot()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 SimulationFactory.eINSTANCE.createOndemand()));

		newChildDescriptors.add
			(createChildParameter
				(OCCIPackage.Literals.ENTITY__PARTS,
				 SimulationFactory.eINSTANCE.createUpfront()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SimulationEditPlugin.INSTANCE;
	}

}
