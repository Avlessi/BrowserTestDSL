/**
 */
package org.xtext.example.browser.browser.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xtext.example.browser.browser.BrowserFactory;
import org.xtext.example.browser.browser.BrowserPackage;
import org.xtext.example.browser.browser.Instructions;

/**
 * This is the item provider adapter for a {@link org.xtext.example.browser.browser.Instructions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstructionsItemProvider 
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
	public InstructionsItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BrowserPackage.Literals.INSTRUCTIONS__FUNC);
			childrenFeatures.add(BrowserPackage.Literals.INSTRUCTIONS__IF_COND);
			childrenFeatures.add(BrowserPackage.Literals.INSTRUCTIONS__LOOP);
			childrenFeatures.add(BrowserPackage.Literals.INSTRUCTIONS__COLL);
			childrenFeatures.add(BrowserPackage.Literals.INSTRUCTIONS__MEM);
			childrenFeatures.add(BrowserPackage.Literals.INSTRUCTIONS__PROCS);
			childrenFeatures.add(BrowserPackage.Literals.INSTRUCTIONS__L);
			childrenFeatures.add(BrowserPackage.Literals.INSTRUCTIONS__V);
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
	 * This returns Instructions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Instructions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Instructions_type");
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

		switch (notification.getFeatureID(Instructions.class)) {
			case BrowserPackage.INSTRUCTIONS__FUNC:
			case BrowserPackage.INSTRUCTIONS__IF_COND:
			case BrowserPackage.INSTRUCTIONS__LOOP:
			case BrowserPackage.INSTRUCTIONS__COLL:
			case BrowserPackage.INSTRUCTIONS__MEM:
			case BrowserPackage.INSTRUCTIONS__PROCS:
			case BrowserPackage.INSTRUCTIONS__L:
			case BrowserPackage.INSTRUCTIONS__V:
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
				(BrowserPackage.Literals.INSTRUCTIONS__FUNC,
				 BrowserFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.INSTRUCTIONS__IF_COND,
				 BrowserFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.INSTRUCTIONS__LOOP,
				 BrowserFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.INSTRUCTIONS__COLL,
				 BrowserFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.INSTRUCTIONS__MEM,
				 BrowserFactory.eINSTANCE.createMemorise()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.INSTRUCTIONS__PROCS,
				 BrowserFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.INSTRUCTIONS__L,
				 BrowserFactory.eINSTANCE.createProcedureLaunch()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.INSTRUCTIONS__V,
				 BrowserFactory.eINSTANCE.createVariable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BrowserEditPlugin.INSTANCE;
	}

}
