/**
 */
package org.xtext.example.browser.browser.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.xtext.example.browser.browser.util.BrowserAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserItemProviderAdapterFactory extends BrowserAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowserItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.WebBrowser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebBrowserItemProvider webBrowserItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.WebBrowser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebBrowserAdapter() {
		if (webBrowserItemProvider == null) {
			webBrowserItemProvider = new WebBrowserItemProvider(this);
		}

		return webBrowserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Onglet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OngletItemProvider ongletItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Onglet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOngletAdapter() {
		if (ongletItemProvider == null) {
			ongletItemProvider = new OngletItemProvider(this);
		}

		return ongletItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Instructions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionsItemProvider instructionsItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Instructions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstructionsAdapter() {
		if (instructionsItemProvider == null) {
			instructionsItemProvider = new InstructionsItemProvider(this);
		}

		return instructionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.ProcedureLaunch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureLaunchItemProvider procedureLaunchItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.ProcedureLaunch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcedureLaunchAdapter() {
		if (procedureLaunchItemProvider == null) {
			procedureLaunchItemProvider = new ProcedureLaunchItemProvider(this);
		}

		return procedureLaunchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.GoTo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoToItemProvider goToItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.GoTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGoToAdapter() {
		if (goToItemProvider == null) {
			goToItemProvider = new GoToItemProvider(this);
		}

		return goToItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.ClickOn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClickOnItemProvider clickOnItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.ClickOn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClickOnAdapter() {
		if (clickOnItemProvider == null) {
			clickOnItemProvider = new ClickOnItemProvider(this);
		}

		return clickOnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Fill} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FillItemProvider fillItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Fill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFillAdapter() {
		if (fillItemProvider == null) {
			fillItemProvider = new FillItemProvider(this);
		}

		return fillItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Select} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectItemProvider selectItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Select}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectAdapter() {
		if (selectItemProvider == null) {
			selectItemProvider = new SelectItemProvider(this);
		}

		return selectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.CheckIf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckIfItemProvider checkIfItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.CheckIf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheckIfAdapter() {
		if (checkIfItemProvider == null) {
			checkIfItemProvider = new CheckIfItemProvider(this);
		}

		return checkIfItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Clear} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearItemProvider clearItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Clear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClearAdapter() {
		if (clearItemProvider == null) {
			clearItemProvider = new ClearItemProvider(this);
		}

		return clearItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.BooleanCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConditionItemProvider booleanConditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.BooleanCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanConditionAdapter() {
		if (booleanConditionItemProvider == null) {
			booleanConditionItemProvider = new BooleanConditionItemProvider(this);
		}

		return booleanConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Condition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemProvider conditionItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAdapter() {
		if (conditionItemProvider == null) {
			conditionItemProvider = new ConditionItemProvider(this);
		}

		return conditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Loop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopItemProvider loopItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Loop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopAdapter() {
		if (loopItemProvider == null) {
			loopItemProvider = new LoopItemProvider(this);
		}

		return loopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.WebPageObj} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebPageObjItemProvider webPageObjItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.WebPageObj}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebPageObjAdapter() {
		if (webPageObjItemProvider == null) {
			webPageObjItemProvider = new WebPageObjItemProvider(this);
		}

		return webPageObjItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.TextField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFieldItemProvider textFieldItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.TextField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextFieldAdapter() {
		if (textFieldItemProvider == null) {
			textFieldItemProvider = new TextFieldItemProvider(this);
		}

		return textFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Password} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasswordItemProvider passwordItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Password}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPasswordAdapter() {
		if (passwordItemProvider == null) {
			passwordItemProvider = new PasswordItemProvider(this);
		}

		return passwordItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Button} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonItemProvider buttonItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonAdapter() {
		if (buttonItemProvider == null) {
			buttonItemProvider = new ButtonItemProvider(this);
		}

		return buttonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.CheckBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckBoxItemProvider checkBoxItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.CheckBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheckBoxAdapter() {
		if (checkBoxItemProvider == null) {
			checkBoxItemProvider = new CheckBoxItemProvider(this);
		}

		return checkBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Text} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextItemProvider textItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextAdapter() {
		if (textItemProvider == null) {
			textItemProvider = new TextItemProvider(this);
		}

		return textItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Collections} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionsItemProvider collectionsItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Collections}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollectionsAdapter() {
		if (collectionsItemProvider == null) {
			collectionsItemProvider = new CollectionsItemProvider(this);
		}

		return collectionsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.FillAllTextFields} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FillAllTextFieldsItemProvider fillAllTextFieldsItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.FillAllTextFields}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFillAllTextFieldsAdapter() {
		if (fillAllTextFieldsItemProvider == null) {
			fillAllTextFieldsItemProvider = new FillAllTextFieldsItemProvider(this);
		}

		return fillAllTextFieldsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Memorise} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoriseItemProvider memoriseItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Memorise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoriseAdapter() {
		if (memoriseItemProvider == null) {
			memoriseItemProvider = new MemoriseItemProvider(this);
		}

		return memoriseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Parameters} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametersItemProvider parametersItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Parameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParametersAdapter() {
		if (parametersItemProvider == null) {
			parametersItemProvider = new ParametersItemProvider(this);
		}

		return parametersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xtext.example.browser.browser.Procedure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureItemProvider procedureItemProvider;

	/**
	 * This creates an adapter for a {@link org.xtext.example.browser.browser.Procedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcedureAdapter() {
		if (procedureItemProvider == null) {
			procedureItemProvider = new ProcedureItemProvider(this);
		}

		return procedureItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (webBrowserItemProvider != null) webBrowserItemProvider.dispose();
		if (ongletItemProvider != null) ongletItemProvider.dispose();
		if (instructionsItemProvider != null) instructionsItemProvider.dispose();
		if (procedureLaunchItemProvider != null) procedureLaunchItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (goToItemProvider != null) goToItemProvider.dispose();
		if (clickOnItemProvider != null) clickOnItemProvider.dispose();
		if (fillItemProvider != null) fillItemProvider.dispose();
		if (selectItemProvider != null) selectItemProvider.dispose();
		if (checkIfItemProvider != null) checkIfItemProvider.dispose();
		if (clearItemProvider != null) clearItemProvider.dispose();
		if (booleanConditionItemProvider != null) booleanConditionItemProvider.dispose();
		if (conditionItemProvider != null) conditionItemProvider.dispose();
		if (loopItemProvider != null) loopItemProvider.dispose();
		if (webPageObjItemProvider != null) webPageObjItemProvider.dispose();
		if (textFieldItemProvider != null) textFieldItemProvider.dispose();
		if (passwordItemProvider != null) passwordItemProvider.dispose();
		if (buttonItemProvider != null) buttonItemProvider.dispose();
		if (checkBoxItemProvider != null) checkBoxItemProvider.dispose();
		if (textItemProvider != null) textItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (collectionsItemProvider != null) collectionsItemProvider.dispose();
		if (fillAllTextFieldsItemProvider != null) fillAllTextFieldsItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (memoriseItemProvider != null) memoriseItemProvider.dispose();
		if (parametersItemProvider != null) parametersItemProvider.dispose();
		if (procedureItemProvider != null) procedureItemProvider.dispose();
	}

}
