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

import occ.simulation.Cloudlet;
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
 * This is the item provider adapter for a {@link occ.simulation.Cloudlet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudletItemProvider extends ComputeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudletItemProvider(AdapterFactory adapterFactory) {
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

			addCloudletIdPropertyDescriptor(object);
			addCloudletLengthPropertyDescriptor(object);
			addCloudletCoresPropertyDescriptor(object);
			addCloudletFileSizePropertyDescriptor(object);
			addCloudletOutputSizePropertyDescriptor(object);
			addCloudletUtilizationModelCpuPropertyDescriptor(object);
			addCloudletUtilizationModelRamPropertyDescriptor(object);
			addCloudletUtilizationModelBwPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cloudlet Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudletIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloudlet_cloudletId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloudlet_cloudletId_feature", "_UI_Cloudlet_type"),
				 SimulationPackage.Literals.CLOUDLET__CLOUDLET_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloudlet Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudletLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloudlet_cloudletLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloudlet_cloudletLength_feature", "_UI_Cloudlet_type"),
				 SimulationPackage.Literals.CLOUDLET__CLOUDLET_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloudlet Cores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudletCoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloudlet_cloudletCores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloudlet_cloudletCores_feature", "_UI_Cloudlet_type"),
				 SimulationPackage.Literals.CLOUDLET__CLOUDLET_CORES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloudlet File Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudletFileSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloudlet_cloudletFileSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloudlet_cloudletFileSize_feature", "_UI_Cloudlet_type"),
				 SimulationPackage.Literals.CLOUDLET__CLOUDLET_FILE_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloudlet Output Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudletOutputSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloudlet_cloudletOutputSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloudlet_cloudletOutputSize_feature", "_UI_Cloudlet_type"),
				 SimulationPackage.Literals.CLOUDLET__CLOUDLET_OUTPUT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloudlet Utilization Model Cpu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudletUtilizationModelCpuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloudlet_cloudletUtilizationModelCpu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloudlet_cloudletUtilizationModelCpu_feature", "_UI_Cloudlet_type"),
				 SimulationPackage.Literals.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloudlet Utilization Model Ram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudletUtilizationModelRamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloudlet_cloudletUtilizationModelRam_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloudlet_cloudletUtilizationModelRam_feature", "_UI_Cloudlet_type"),
				 SimulationPackage.Literals.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cloudlet Utilization Model Bw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloudletUtilizationModelBwPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cloudlet_cloudletUtilizationModelBw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cloudlet_cloudletUtilizationModelBw_feature", "_UI_Cloudlet_type"),
				 SimulationPackage.Literals.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Cloudlet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Cloudlet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Cloudlet)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Cloudlet_type") :
			getString("_UI_Cloudlet_type") + " " + label;
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

		switch (notification.getFeatureID(Cloudlet.class)) {
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
			case SimulationPackage.CLOUDLET__CLOUDLET_CORES:
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_CPU:
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_RAM:
			case SimulationPackage.CLOUDLET__CLOUDLET_UTILIZATION_MODEL_BW:
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
