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

import org.xtext.example.browser.browser.BooleanCondition;
import org.xtext.example.browser.browser.BrowserFactory;
import org.xtext.example.browser.browser.BrowserPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.example.browser.browser.BooleanCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanConditionItemProvider 
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
	public BooleanConditionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1);
			childrenFeatures.add(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2);
			childrenFeatures.add(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG);
			childrenFeatures.add(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL);
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
	 * This returns BooleanCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BooleanCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BooleanCondition_type");
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

		switch (notification.getFeatureID(BooleanCondition.class)) {
			case BrowserPackage.BOOLEAN_CONDITION__ARG1:
			case BrowserPackage.BOOLEAN_CONDITION__ARG2:
			case BrowserPackage.BOOLEAN_CONDITION__ARG:
			case BrowserPackage.BOOLEAN_CONDITION__BOOL:
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
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createWebBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createOnglet()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createProcedureLaunch()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createClickOn()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createCheckIf()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createClear()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createBooleanCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createWebPageObj()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createFillAllTextFields()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createMemorise()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createParameters()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1,
				 BrowserFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createWebBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createOnglet()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createProcedureLaunch()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createClickOn()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createCheckIf()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createClear()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createBooleanCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createWebPageObj()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createFillAllTextFields()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createMemorise()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createParameters()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2,
				 BrowserFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createWebBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createOnglet()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createProcedureLaunch()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createClickOn()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createCheckIf()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createClear()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createBooleanCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createWebPageObj()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createFillAllTextFields()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createMemorise()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createParameters()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__ARG,
				 BrowserFactory.eINSTANCE.createProcedure()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createWebBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createOnglet()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createInstructions()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createProcedureLaunch()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createClickOn()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createCheckIf()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createClear()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createBooleanCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createWebPageObj()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createCollections()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createFillAllTextFields()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createMemorise()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
				 BrowserFactory.eINSTANCE.createParameters()));

		newChildDescriptors.add
			(createChildParameter
				(BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL,
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
			childFeature == BrowserPackage.Literals.BOOLEAN_CONDITION__ARG1 ||
			childFeature == BrowserPackage.Literals.BOOLEAN_CONDITION__ARG2 ||
			childFeature == BrowserPackage.Literals.BOOLEAN_CONDITION__ARG ||
			childFeature == BrowserPackage.Literals.BOOLEAN_CONDITION__BOOL;

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
