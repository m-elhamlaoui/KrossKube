/**
 */
package storage.provider;


import java.util.Collection;
import java.util.List;

import multicluster.provider.KrosskubeEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import storage.PersistentVolumeClaim;
import storage.StorageFactory;
import storage.StoragePackage;

/**
 * This is the item provider adapter for a {@link storage.PersistentVolumeClaim} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistentVolumeClaimItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentVolumeClaimItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addNamespacePropertyDescriptor(object);
			addLabelsPropertyDescriptor(object);
			addAnnotationsPropertyDescriptor(object);
			addAccessModesPropertyDescriptor(object);
			addStorageRequestPropertyDescriptor(object);
			addStorageClassNamePropertyDescriptor(object);
			addVolumeNamePropertyDescriptor(object);
			addPersistentVolumePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_name_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_namespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_namespace_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_labels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_labels_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__LABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Annotations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnnotationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_annotations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_annotations_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__ANNOTATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Modes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessModesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_accessModes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_accessModes_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__ACCESS_MODES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Storage Request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageRequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_storageRequest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_storageRequest_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__STORAGE_REQUEST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Storage Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_storageClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_storageClassName_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volume Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumeNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_volumeName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_volumeName_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__VOLUME_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persistent Volume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentVolumePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PersistentVolumeClaim_persistentVolume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PersistentVolumeClaim_persistentVolume_feature", "_UI_PersistentVolumeClaim_type"),
				 StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__PERSISTENT_VOLUME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__SELECTOR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PersistentVolumeClaim.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PersistentVolumeClaim"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PersistentVolumeClaim)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PersistentVolumeClaim_type") :
			getString("_UI_PersistentVolumeClaim_type") + " " + label;
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

		switch (notification.getFeatureID(PersistentVolumeClaim.class)) {
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__NAME:
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__NAMESPACE:
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__LABELS:
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__ANNOTATIONS:
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__ACCESS_MODES:
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__STORAGE_REQUEST:
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__STORAGE_CLASS_NAME:
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__VOLUME_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StoragePackage.PERSISTENT_VOLUME_CLAIM__SELECTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(StoragePackage.Literals.PERSISTENT_VOLUME_CLAIM__SELECTOR,
				 StorageFactory.eINSTANCE.createLabelSelector()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KrosskubeEditPlugin.INSTANCE;
	}

}
