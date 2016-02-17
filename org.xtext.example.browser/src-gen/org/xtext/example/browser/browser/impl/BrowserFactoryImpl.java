/**
 */
package org.xtext.example.browser.browser.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.browser.browser.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrowserFactoryImpl extends EFactoryImpl implements BrowserFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BrowserFactory init()
  {
    try
    {
      BrowserFactory theBrowserFactory = (BrowserFactory)EPackage.Registry.INSTANCE.getEFactory(BrowserPackage.eNS_URI);
      if (theBrowserFactory != null)
      {
        return theBrowserFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BrowserFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BrowserPackage.WEB_BROWSER: return createWebBrowser();
      case BrowserPackage.ONGLET: return createOnglet();
      case BrowserPackage.INSTRUCTIONS: return createInstructions();
      case BrowserPackage.PROCEDURE_LAUNCH: return createProcedureLaunch();
      case BrowserPackage.FUNCTION: return createFunction();
      case BrowserPackage.GO_TO: return createGoTo();
      case BrowserPackage.CLICK_ON: return createClickOn();
      case BrowserPackage.FILL: return createFill();
      case BrowserPackage.SELECT: return createSelect();
      case BrowserPackage.CHECK_IF: return createCheckIf();
      case BrowserPackage.CLEAR: return createClear();
      case BrowserPackage.BOOLEAN_CONDITION: return createBooleanCondition();
      case BrowserPackage.CONDITION: return createCondition();
      case BrowserPackage.LOOP: return createLoop();
      case BrowserPackage.WEB_PAGE_OBJ: return createWebPageObj();
      case BrowserPackage.TEXT_FIELD: return createTextField();
      case BrowserPackage.PASSWORD: return createPassword();
      case BrowserPackage.BUTTON: return createButton();
      case BrowserPackage.CHECK_BOX: return createCheckBox();
      case BrowserPackage.TEXT: return createText();
      case BrowserPackage.LINK: return createLink();
      case BrowserPackage.COLLECTIONS: return createCollections();
      case BrowserPackage.FILL_ALL_TEXT_FIELDS: return createFillAllTextFields();
      case BrowserPackage.VARIABLE: return createVariable();
      case BrowserPackage.MEMORISE: return createMemorise();
      case BrowserPackage.PARAMETERS: return createParameters();
      case BrowserPackage.PROCEDURE: return createProcedure();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebBrowser createWebBrowser()
  {
    WebBrowserImpl webBrowser = new WebBrowserImpl();
    return webBrowser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Onglet createOnglet()
  {
    OngletImpl onglet = new OngletImpl();
    return onglet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instructions createInstructions()
  {
    InstructionsImpl instructions = new InstructionsImpl();
    return instructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureLaunch createProcedureLaunch()
  {
    ProcedureLaunchImpl procedureLaunch = new ProcedureLaunchImpl();
    return procedureLaunch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoTo createGoTo()
  {
    GoToImpl goTo = new GoToImpl();
    return goTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickOn createClickOn()
  {
    ClickOnImpl clickOn = new ClickOnImpl();
    return clickOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fill createFill()
  {
    FillImpl fill = new FillImpl();
    return fill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckIf createCheckIf()
  {
    CheckIfImpl checkIf = new CheckIfImpl();
    return checkIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clear createClear()
  {
    ClearImpl clear = new ClearImpl();
    return clear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanCondition createBooleanCondition()
  {
    BooleanConditionImpl booleanCondition = new BooleanConditionImpl();
    return booleanCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebPageObj createWebPageObj()
  {
    WebPageObjImpl webPageObj = new WebPageObjImpl();
    return webPageObj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextField createTextField()
  {
    TextFieldImpl textField = new TextFieldImpl();
    return textField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Password createPassword()
  {
    PasswordImpl password = new PasswordImpl();
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckBox createCheckBox()
  {
    CheckBoxImpl checkBox = new CheckBoxImpl();
    return checkBox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collections createCollections()
  {
    CollectionsImpl collections = new CollectionsImpl();
    return collections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FillAllTextFields createFillAllTextFields()
  {
    FillAllTextFieldsImpl fillAllTextFields = new FillAllTextFieldsImpl();
    return fillAllTextFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Memorise createMemorise()
  {
    MemoriseImpl memorise = new MemoriseImpl();
    return memorise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters createParameters()
  {
    ParametersImpl parameters = new ParametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserPackage getBrowserPackage()
  {
    return (BrowserPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BrowserPackage getPackage()
  {
    return BrowserPackage.eINSTANCE;
  }

} //BrowserFactoryImpl
