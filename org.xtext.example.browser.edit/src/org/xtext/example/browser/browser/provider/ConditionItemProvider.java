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
import org.xtext.example.browser.browser.Condition;

/**
 * This is the item provider adapter for a {@link org.xtext.example.browser.browser.Condition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionItemProvider 
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
	public ConditionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BrowserPackage.Literals.CONDITION__IF_COND);
			childrenFeatures.add(BrowserPackage.Literals.CONDITION__FUNC);
			childrenFeatures.add(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS);
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
	 * This returns Condition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Condition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Condition_type");
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

		switch (notification.getFeatureID(Condition.class)) {
			case BrowserPackage.CONDITION__IF_COND:
			case BrowserPackage.CONDITION__FUNC:
			case BrowserPackage.CONDITION__ELSEIF_CONDS:
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
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createWebBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createOnglet()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createProcedureLaunch()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createClickOn()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createCheckIf()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createClear()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createBooleanCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createWebPageObj()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createFillAllTextFields()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createMemorise()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createParameters()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__IF_COND,
				 BrowserFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__FUNC,
				 BrowserFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createWebBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createOnglet()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createProcedureLaunch()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createClickOn()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createCheckIf()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createClear()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createBooleanCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createWebPageObj()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createFillAllTextFields()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createMemorise()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createParameters()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.CONDITION__ELSEIF_CONDS,
				 BrowserFactory.eINSTANCE.createProcedure()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BrowserPackage.Literals.CONDITION__IF_COND ||
			childFeature == BrowserPackage.Literals.CONDITION__ELSEIF_CONDS ||
			childFeature == BrowserPackage.Literals.CONDITION__FUNC;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
