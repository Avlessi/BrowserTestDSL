/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.browser.browser.BrowserFactory
 * @model kind="package"
 * @generated
 */
public interface BrowserPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "browser";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/browser/Browser";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "browser";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BrowserPackage eINSTANCE = org.xtext.example.browser.browser.impl.BrowserPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.WebBrowserImpl <em>Web Browser</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.WebBrowserImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getWebBrowser()
   * @generated
   */
  int WEB_BROWSER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_BROWSER__NAME = 0;

  /**
   * The feature id for the '<em><b>Onglets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_BROWSER__ONGLETS = 1;

  /**
   * The number of structural features of the '<em>Web Browser</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_BROWSER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.OngletImpl <em>Onglet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.OngletImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getOnglet()
   * @generated
   */
  int ONGLET = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONGLET__URL = 0;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONGLET__INS = 1;

  /**
   * The number of structural features of the '<em>Onglet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONGLET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.InstructionsImpl <em>Instructions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.InstructionsImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getInstructions()
   * @generated
   */
  int INSTRUCTIONS = 2;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__FUNC = 0;

  /**
   * The feature id for the '<em><b>If Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__IF_COND = 1;

  /**
   * The feature id for the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__LOOP = 2;

  /**
   * The feature id for the '<em><b>Coll</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__COLL = 3;

  /**
   * The feature id for the '<em><b>Mem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__MEM = 4;

  /**
   * The feature id for the '<em><b>Procs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__PROCS = 5;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__L = 6;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__V = 7;

  /**
   * The number of structural features of the '<em>Instructions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.ProcedureLaunchImpl <em>Procedure Launch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.ProcedureLaunchImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getProcedureLaunch()
   * @generated
   */
  int PROCEDURE_LAUNCH = 3;

  /**
   * The feature id for the '<em><b>Proc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_LAUNCH__PROC = 0;

  /**
   * The number of structural features of the '<em>Procedure Launch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_LAUNCH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.FunctionImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 4;

  /**
   * The feature id for the '<em><b>Gtl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__GTL = 0;

  /**
   * The feature id for the '<em><b>Cob</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__COB = 1;

  /**
   * The feature id for the '<em><b>Ftf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__FTF = 2;

  /**
   * The feature id for the '<em><b>Sel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__SEL = 3;

  /**
   * The feature id for the '<em><b>Ci</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__CI = 4;

  /**
   * The feature id for the '<em><b>Cl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__CL = 5;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.GoToImpl <em>Go To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.GoToImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getGoTo()
   * @generated
   */
  int GO_TO = 5;

  /**
   * The feature id for the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO__LINK = 0;

  /**
   * The feature id for the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO__V = 1;

  /**
   * The number of structural features of the '<em>Go To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.ClickOnImpl <em>Click On</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.ClickOnImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getClickOn()
   * @generated
   */
  int CLICK_ON = 6;

  /**
   * The feature id for the '<em><b>Button</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_ON__BUTTON = 0;

  /**
   * The feature id for the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_ON__LINK = 1;

  /**
   * The feature id for the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_ON__V = 2;

  /**
   * The number of structural features of the '<em>Click On</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_ON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.FillImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getFill()
   * @generated
   */
  int FILL = 7;

  /**
   * The feature id for the '<em><b>Tf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__TF = 0;

  /**
   * The feature id for the '<em><b>Pass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__PASS = 1;

  /**
   * The feature id for the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__V = 2;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__INPUT = 3;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.SelectImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 8;

  /**
   * The feature id for the '<em><b>Sb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__SB = 0;

  /**
   * The feature id for the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__V = 1;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.CheckIfImpl <em>Check If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.CheckIfImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getCheckIf()
   * @generated
   */
  int CHECK_IF = 9;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_IF__ARGS = 0;

  /**
   * The feature id for the '<em><b>V1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_IF__V1 = 1;

  /**
   * The feature id for the '<em><b>Lin KTo Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_IF__LIN_KTO_CHECK = 2;

  /**
   * The feature id for the '<em><b>V2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_IF__V2 = 3;

  /**
   * The number of structural features of the '<em>Check If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_IF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.ClearImpl <em>Clear</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.ClearImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getClear()
   * @generated
   */
  int CLEAR = 10;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__T = 0;

  /**
   * The feature id for the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__P = 1;

  /**
   * The feature id for the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR__V = 2;

  /**
   * The number of structural features of the '<em>Clear</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.BooleanConditionImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getBooleanCondition()
   * @generated
   */
  int BOOLEAN_CONDITION = 11;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONDITION__ARG1 = 0;

  /**
   * The feature id for the '<em><b>Arg2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONDITION__ARG2 = 1;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONDITION__ARG = 2;

  /**
   * The feature id for the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONDITION__BOOL = 3;

  /**
   * The number of structural features of the '<em>Boolean Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_CONDITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.ConditionImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 12;

  /**
   * The feature id for the '<em><b>If Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__IF_COND = 0;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__FUNC = 1;

  /**
   * The feature id for the '<em><b>Elseif Conds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ELSEIF_CONDS = 2;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.LoopImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 13;

  /**
   * The feature id for the '<em><b>Func</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__FUNC = 0;

  /**
   * The feature id for the '<em><b>Bool</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__BOOL = 1;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.WebPageObjImpl <em>Web Page Obj</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.WebPageObjImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getWebPageObj()
   * @generated
   */
  int WEB_PAGE_OBJ = 14;

  /**
   * The feature id for the '<em><b>Tf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_PAGE_OBJ__TF = 0;

  /**
   * The feature id for the '<em><b>Psw</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_PAGE_OBJ__PSW = 1;

  /**
   * The feature id for the '<em><b>Btn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_PAGE_OBJ__BTN = 2;

  /**
   * The feature id for the '<em><b>Ck</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_PAGE_OBJ__CK = 3;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_PAGE_OBJ__T = 4;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_PAGE_OBJ__L = 5;

  /**
   * The number of structural features of the '<em>Web Page Obj</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_PAGE_OBJ_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.TextFieldImpl <em>Text Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.TextFieldImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getTextField()
   * @generated
   */
  int TEXT_FIELD = 15;

  /**
   * The feature id for the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__USERNAME = 0;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.PasswordImpl <em>Password</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.PasswordImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getPassword()
   * @generated
   */
  int PASSWORD = 16;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD__PASSWORD = 0;

  /**
   * The number of structural features of the '<em>Password</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSWORD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.ButtonImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 17;

  /**
   * The feature id for the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__BUTTON = 0;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.CheckBoxImpl <em>Check Box</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.CheckBoxImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getCheckBox()
   * @generated
   */
  int CHECK_BOX = 18;

  /**
   * The feature id for the '<em><b>Check Box</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX__CHECK_BOX = 0;

  /**
   * The number of structural features of the '<em>Check Box</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_BOX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.TextImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getText()
   * @generated
   */
  int TEXT = 19;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__TEXT = 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.LinkImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getLink()
   * @generated
   */
  int LINK = 20;

  /**
   * The feature id for the '<em><b>Link</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LINK = 0;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.CollectionsImpl <em>Collections</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.CollectionsImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getCollections()
   * @generated
   */
  int COLLECTIONS = 21;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIONS__S = 0;

  /**
   * The feature id for the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIONS__C = 1;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIONS__F = 2;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIONS__G = 3;

  /**
   * The number of structural features of the '<em>Collections</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIONS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.FillAllTextFieldsImpl <em>Fill All Text Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.FillAllTextFieldsImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getFillAllTextFields()
   * @generated
   */
  int FILL_ALL_TEXT_FIELDS = 22;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_ALL_TEXT_FIELDS__INPUT = 0;

  /**
   * The feature id for the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_ALL_TEXT_FIELDS__V = 1;

  /**
   * The number of structural features of the '<em>Fill All Text Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_ALL_TEXT_FIELDS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.VariableImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 23;

  /**
   * The feature id for the '<em><b>O</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__O = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.MemoriseImpl <em>Memorise</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.MemoriseImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getMemorise()
   * @generated
   */
  int MEMORISE = 24;

  /**
   * The feature id for the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORISE__OBJ = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORISE__VAR = 1;

  /**
   * The number of structural features of the '<em>Memorise</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORISE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.ParametersImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 25;

  /**
   * The feature id for the '<em><b>Pars</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS__PARS = 0;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.browser.browser.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.browser.browser.impl.ProcedureImpl
   * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__INS = 2;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.WebBrowser <em>Web Browser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Browser</em>'.
   * @see org.xtext.example.browser.browser.WebBrowser
   * @generated
   */
  EClass getWebBrowser();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.WebBrowser#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.browser.browser.WebBrowser#getName()
   * @see #getWebBrowser()
   * @generated
   */
  EAttribute getWebBrowser_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.browser.browser.WebBrowser#getOnglets <em>Onglets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Onglets</em>'.
   * @see org.xtext.example.browser.browser.WebBrowser#getOnglets()
   * @see #getWebBrowser()
   * @generated
   */
  EReference getWebBrowser_Onglets();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Onglet <em>Onglet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Onglet</em>'.
   * @see org.xtext.example.browser.browser.Onglet
   * @generated
   */
  EClass getOnglet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Onglet#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.xtext.example.browser.browser.Onglet#getUrl()
   * @see #getOnglet()
   * @generated
   */
  EAttribute getOnglet_Url();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.browser.browser.Onglet#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see org.xtext.example.browser.browser.Onglet#getIns()
   * @see #getOnglet()
   * @generated
   */
  EReference getOnglet_Ins();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Instructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instructions</em>'.
   * @see org.xtext.example.browser.browser.Instructions
   * @generated
   */
  EClass getInstructions();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Instructions#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Func</em>'.
   * @see org.xtext.example.browser.browser.Instructions#getFunc()
   * @see #getInstructions()
   * @generated
   */
  EReference getInstructions_Func();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Instructions#getIfCond <em>If Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Cond</em>'.
   * @see org.xtext.example.browser.browser.Instructions#getIfCond()
   * @see #getInstructions()
   * @generated
   */
  EReference getInstructions_IfCond();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Instructions#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Loop</em>'.
   * @see org.xtext.example.browser.browser.Instructions#getLoop()
   * @see #getInstructions()
   * @generated
   */
  EReference getInstructions_Loop();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Instructions#getColl <em>Coll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coll</em>'.
   * @see org.xtext.example.browser.browser.Instructions#getColl()
   * @see #getInstructions()
   * @generated
   */
  EReference getInstructions_Coll();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Instructions#getMem <em>Mem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mem</em>'.
   * @see org.xtext.example.browser.browser.Instructions#getMem()
   * @see #getInstructions()
   * @generated
   */
  EReference getInstructions_Mem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Instructions#getProcs <em>Procs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Procs</em>'.
   * @see org.xtext.example.browser.browser.Instructions#getProcs()
   * @see #getInstructions()
   * @generated
   */
  EReference getInstructions_Procs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Instructions#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.example.browser.browser.Instructions#getL()
   * @see #getInstructions()
   * @generated
   */
  EReference getInstructions_L();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Instructions#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.xtext.example.browser.browser.Instructions#getV()
   * @see #getInstructions()
   * @generated
   */
  EReference getInstructions_V();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.ProcedureLaunch <em>Procedure Launch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure Launch</em>'.
   * @see org.xtext.example.browser.browser.ProcedureLaunch
   * @generated
   */
  EClass getProcedureLaunch();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.ProcedureLaunch#getProc <em>Proc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Proc</em>'.
   * @see org.xtext.example.browser.browser.ProcedureLaunch#getProc()
   * @see #getProcedureLaunch()
   * @generated
   */
  EReference getProcedureLaunch_Proc();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.example.browser.browser.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Function#getGtl <em>Gtl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gtl</em>'.
   * @see org.xtext.example.browser.browser.Function#getGtl()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Gtl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Function#getCob <em>Cob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cob</em>'.
   * @see org.xtext.example.browser.browser.Function#getCob()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Cob();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Function#getFtf <em>Ftf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ftf</em>'.
   * @see org.xtext.example.browser.browser.Function#getFtf()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Ftf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Function#getSel <em>Sel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sel</em>'.
   * @see org.xtext.example.browser.browser.Function#getSel()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Sel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Function#getCi <em>Ci</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ci</em>'.
   * @see org.xtext.example.browser.browser.Function#getCi()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Ci();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Function#getCl <em>Cl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cl</em>'.
   * @see org.xtext.example.browser.browser.Function#getCl()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Cl();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.GoTo <em>Go To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go To</em>'.
   * @see org.xtext.example.browser.browser.GoTo
   * @generated
   */
  EClass getGoTo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.GoTo#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link</em>'.
   * @see org.xtext.example.browser.browser.GoTo#getLink()
   * @see #getGoTo()
   * @generated
   */
  EReference getGoTo_Link();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.GoTo#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V</em>'.
   * @see org.xtext.example.browser.browser.GoTo#getV()
   * @see #getGoTo()
   * @generated
   */
  EReference getGoTo_V();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.ClickOn <em>Click On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Click On</em>'.
   * @see org.xtext.example.browser.browser.ClickOn
   * @generated
   */
  EClass getClickOn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.ClickOn#getButton <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Button</em>'.
   * @see org.xtext.example.browser.browser.ClickOn#getButton()
   * @see #getClickOn()
   * @generated
   */
  EReference getClickOn_Button();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.ClickOn#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link</em>'.
   * @see org.xtext.example.browser.browser.ClickOn#getLink()
   * @see #getClickOn()
   * @generated
   */
  EReference getClickOn_Link();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.ClickOn#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V</em>'.
   * @see org.xtext.example.browser.browser.ClickOn#getV()
   * @see #getClickOn()
   * @generated
   */
  EReference getClickOn_V();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Fill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fill</em>'.
   * @see org.xtext.example.browser.browser.Fill
   * @generated
   */
  EClass getFill();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Fill#getTf <em>Tf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tf</em>'.
   * @see org.xtext.example.browser.browser.Fill#getTf()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Tf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Fill#getPass <em>Pass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pass</em>'.
   * @see org.xtext.example.browser.browser.Fill#getPass()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Pass();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.Fill#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V</em>'.
   * @see org.xtext.example.browser.browser.Fill#getV()
   * @see #getFill()
   * @generated
   */
  EReference getFill_V();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Fill#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see org.xtext.example.browser.browser.Fill#getInput()
   * @see #getFill()
   * @generated
   */
  EAttribute getFill_Input();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see org.xtext.example.browser.browser.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Select#getSb <em>Sb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sb</em>'.
   * @see org.xtext.example.browser.browser.Select#getSb()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Sb();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.Select#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V</em>'.
   * @see org.xtext.example.browser.browser.Select#getV()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_V();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.CheckIf <em>Check If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check If</em>'.
   * @see org.xtext.example.browser.browser.CheckIf
   * @generated
   */
  EClass getCheckIf();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.CheckIf#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Args</em>'.
   * @see org.xtext.example.browser.browser.CheckIf#getArgs()
   * @see #getCheckIf()
   * @generated
   */
  EAttribute getCheckIf_Args();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.CheckIf#getV1 <em>V1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V1</em>'.
   * @see org.xtext.example.browser.browser.CheckIf#getV1()
   * @see #getCheckIf()
   * @generated
   */
  EReference getCheckIf_V1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.CheckIf#getLinKToCheck <em>Lin KTo Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lin KTo Check</em>'.
   * @see org.xtext.example.browser.browser.CheckIf#getLinKToCheck()
   * @see #getCheckIf()
   * @generated
   */
  EAttribute getCheckIf_LinKToCheck();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.CheckIf#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V2</em>'.
   * @see org.xtext.example.browser.browser.CheckIf#getV2()
   * @see #getCheckIf()
   * @generated
   */
  EReference getCheckIf_V2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Clear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clear</em>'.
   * @see org.xtext.example.browser.browser.Clear
   * @generated
   */
  EClass getClear();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Clear#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.xtext.example.browser.browser.Clear#getT()
   * @see #getClear()
   * @generated
   */
  EReference getClear_T();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Clear#getP <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>P</em>'.
   * @see org.xtext.example.browser.browser.Clear#getP()
   * @see #getClear()
   * @generated
   */
  EReference getClear_P();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.Clear#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V</em>'.
   * @see org.xtext.example.browser.browser.Clear#getV()
   * @see #getClear()
   * @generated
   */
  EReference getClear_V();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.BooleanCondition <em>Boolean Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Condition</em>'.
   * @see org.xtext.example.browser.browser.BooleanCondition
   * @generated
   */
  EClass getBooleanCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.BooleanCondition#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg1</em>'.
   * @see org.xtext.example.browser.browser.BooleanCondition#getArg1()
   * @see #getBooleanCondition()
   * @generated
   */
  EReference getBooleanCondition_Arg1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.BooleanCondition#getArg2 <em>Arg2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg2</em>'.
   * @see org.xtext.example.browser.browser.BooleanCondition#getArg2()
   * @see #getBooleanCondition()
   * @generated
   */
  EReference getBooleanCondition_Arg2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.BooleanCondition#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.xtext.example.browser.browser.BooleanCondition#getArg()
   * @see #getBooleanCondition()
   * @generated
   */
  EReference getBooleanCondition_Arg();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.BooleanCondition#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bool</em>'.
   * @see org.xtext.example.browser.browser.BooleanCondition#getBool()
   * @see #getBooleanCondition()
   * @generated
   */
  EReference getBooleanCondition_Bool();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.example.browser.browser.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Condition#getIfCond <em>If Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Cond</em>'.
   * @see org.xtext.example.browser.browser.Condition#getIfCond()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_IfCond();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.browser.browser.Condition#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Func</em>'.
   * @see org.xtext.example.browser.browser.Condition#getFunc()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Func();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.browser.browser.Condition#getElseifConds <em>Elseif Conds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseif Conds</em>'.
   * @see org.xtext.example.browser.browser.Condition#getElseifConds()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ElseifConds();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see org.xtext.example.browser.browser.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.browser.browser.Loop#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Func</em>'.
   * @see org.xtext.example.browser.browser.Loop#getFunc()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Func();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Loop#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bool</em>'.
   * @see org.xtext.example.browser.browser.Loop#getBool()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Bool();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.WebPageObj <em>Web Page Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Page Obj</em>'.
   * @see org.xtext.example.browser.browser.WebPageObj
   * @generated
   */
  EClass getWebPageObj();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.WebPageObj#getTf <em>Tf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tf</em>'.
   * @see org.xtext.example.browser.browser.WebPageObj#getTf()
   * @see #getWebPageObj()
   * @generated
   */
  EReference getWebPageObj_Tf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.WebPageObj#getPsw <em>Psw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Psw</em>'.
   * @see org.xtext.example.browser.browser.WebPageObj#getPsw()
   * @see #getWebPageObj()
   * @generated
   */
  EReference getWebPageObj_Psw();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.WebPageObj#getBtn <em>Btn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Btn</em>'.
   * @see org.xtext.example.browser.browser.WebPageObj#getBtn()
   * @see #getWebPageObj()
   * @generated
   */
  EReference getWebPageObj_Btn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.WebPageObj#getCk <em>Ck</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ck</em>'.
   * @see org.xtext.example.browser.browser.WebPageObj#getCk()
   * @see #getWebPageObj()
   * @generated
   */
  EReference getWebPageObj_Ck();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.WebPageObj#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.xtext.example.browser.browser.WebPageObj#getT()
   * @see #getWebPageObj()
   * @generated
   */
  EReference getWebPageObj_T();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.WebPageObj#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.xtext.example.browser.browser.WebPageObj#getL()
   * @see #getWebPageObj()
   * @generated
   */
  EReference getWebPageObj_L();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.TextField <em>Text Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Field</em>'.
   * @see org.xtext.example.browser.browser.TextField
   * @generated
   */
  EClass getTextField();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.TextField#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Username</em>'.
   * @see org.xtext.example.browser.browser.TextField#getUsername()
   * @see #getTextField()
   * @generated
   */
  EAttribute getTextField_Username();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Password <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Password</em>'.
   * @see org.xtext.example.browser.browser.Password
   * @generated
   */
  EClass getPassword();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Password#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see org.xtext.example.browser.browser.Password#getPassword()
   * @see #getPassword()
   * @generated
   */
  EAttribute getPassword_Password();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.xtext.example.browser.browser.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Button#getButton <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Button</em>'.
   * @see org.xtext.example.browser.browser.Button#getButton()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Button();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.CheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check Box</em>'.
   * @see org.xtext.example.browser.browser.CheckBox
   * @generated
   */
  EClass getCheckBox();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.CheckBox#getCheckBox <em>Check Box</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check Box</em>'.
   * @see org.xtext.example.browser.browser.CheckBox#getCheckBox()
   * @see #getCheckBox()
   * @generated
   */
  EAttribute getCheckBox_CheckBox();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see org.xtext.example.browser.browser.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Text#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.example.browser.browser.Text#getText()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.xtext.example.browser.browser.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Link#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link</em>'.
   * @see org.xtext.example.browser.browser.Link#getLink()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Link();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Collections <em>Collections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collections</em>'.
   * @see org.xtext.example.browser.browser.Collections
   * @generated
   */
  EClass getCollections();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Collections#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see org.xtext.example.browser.browser.Collections#getS()
   * @see #getCollections()
   * @generated
   */
  EAttribute getCollections_S();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Collections#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>C</em>'.
   * @see org.xtext.example.browser.browser.Collections#getC()
   * @see #getCollections()
   * @generated
   */
  EAttribute getCollections_C();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Collections#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.xtext.example.browser.browser.Collections#getF()
   * @see #getCollections()
   * @generated
   */
  EReference getCollections_F();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Collections#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.xtext.example.browser.browser.Collections#getG()
   * @see #getCollections()
   * @generated
   */
  EAttribute getCollections_G();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.FillAllTextFields <em>Fill All Text Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fill All Text Fields</em>'.
   * @see org.xtext.example.browser.browser.FillAllTextFields
   * @generated
   */
  EClass getFillAllTextFields();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.FillAllTextFields#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see org.xtext.example.browser.browser.FillAllTextFields#getInput()
   * @see #getFillAllTextFields()
   * @generated
   */
  EAttribute getFillAllTextFields_Input();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.FillAllTextFields#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>V</em>'.
   * @see org.xtext.example.browser.browser.FillAllTextFields#getV()
   * @see #getFillAllTextFields()
   * @generated
   */
  EReference getFillAllTextFields_V();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.example.browser.browser.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Variable#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>O</em>'.
   * @see org.xtext.example.browser.browser.Variable#getO()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_O();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.browser.browser.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Memorise <em>Memorise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Memorise</em>'.
   * @see org.xtext.example.browser.browser.Memorise
   * @generated
   */
  EClass getMemorise();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Memorise#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj</em>'.
   * @see org.xtext.example.browser.browser.Memorise#getObj()
   * @see #getMemorise()
   * @generated
   */
  EReference getMemorise_Obj();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.browser.browser.Memorise#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.example.browser.browser.Memorise#getVar()
   * @see #getMemorise()
   * @generated
   */
  EReference getMemorise_Var();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see org.xtext.example.browser.browser.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.browser.browser.Parameters#getPars <em>Pars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pars</em>'.
   * @see org.xtext.example.browser.browser.Parameters#getPars()
   * @see #getParameters()
   * @generated
   */
  EAttribute getParameters_Pars();

  /**
   * Returns the meta object for class '{@link org.xtext.example.browser.browser.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see org.xtext.example.browser.browser.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.browser.browser.Procedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.browser.browser.Procedure#getName()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.browser.browser.Procedure#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params</em>'.
   * @see org.xtext.example.browser.browser.Procedure#getParams()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Params();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.browser.browser.Procedure#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see org.xtext.example.browser.browser.Procedure#getIns()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Ins();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BrowserFactory getBrowserFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.WebBrowserImpl <em>Web Browser</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.WebBrowserImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getWebBrowser()
     * @generated
     */
    EClass WEB_BROWSER = eINSTANCE.getWebBrowser();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_BROWSER__NAME = eINSTANCE.getWebBrowser_Name();

    /**
     * The meta object literal for the '<em><b>Onglets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_BROWSER__ONGLETS = eINSTANCE.getWebBrowser_Onglets();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.OngletImpl <em>Onglet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.OngletImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getOnglet()
     * @generated
     */
    EClass ONGLET = eINSTANCE.getOnglet();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONGLET__URL = eINSTANCE.getOnglet_Url();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONGLET__INS = eINSTANCE.getOnglet_Ins();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.InstructionsImpl <em>Instructions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.InstructionsImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getInstructions()
     * @generated
     */
    EClass INSTRUCTIONS = eINSTANCE.getInstructions();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTIONS__FUNC = eINSTANCE.getInstructions_Func();

    /**
     * The meta object literal for the '<em><b>If Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTIONS__IF_COND = eINSTANCE.getInstructions_IfCond();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTIONS__LOOP = eINSTANCE.getInstructions_Loop();

    /**
     * The meta object literal for the '<em><b>Coll</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTIONS__COLL = eINSTANCE.getInstructions_Coll();

    /**
     * The meta object literal for the '<em><b>Mem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTIONS__MEM = eINSTANCE.getInstructions_Mem();

    /**
     * The meta object literal for the '<em><b>Procs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTIONS__PROCS = eINSTANCE.getInstructions_Procs();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTIONS__L = eINSTANCE.getInstructions_L();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTIONS__V = eINSTANCE.getInstructions_V();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.ProcedureLaunchImpl <em>Procedure Launch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.ProcedureLaunchImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getProcedureLaunch()
     * @generated
     */
    EClass PROCEDURE_LAUNCH = eINSTANCE.getProcedureLaunch();

    /**
     * The meta object literal for the '<em><b>Proc</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_LAUNCH__PROC = eINSTANCE.getProcedureLaunch_Proc();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.FunctionImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Gtl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__GTL = eINSTANCE.getFunction_Gtl();

    /**
     * The meta object literal for the '<em><b>Cob</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__COB = eINSTANCE.getFunction_Cob();

    /**
     * The meta object literal for the '<em><b>Ftf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__FTF = eINSTANCE.getFunction_Ftf();

    /**
     * The meta object literal for the '<em><b>Sel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__SEL = eINSTANCE.getFunction_Sel();

    /**
     * The meta object literal for the '<em><b>Ci</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__CI = eINSTANCE.getFunction_Ci();

    /**
     * The meta object literal for the '<em><b>Cl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__CL = eINSTANCE.getFunction_Cl();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.GoToImpl <em>Go To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.GoToImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getGoTo()
     * @generated
     */
    EClass GO_TO = eINSTANCE.getGoTo();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GO_TO__LINK = eINSTANCE.getGoTo_Link();

    /**
     * The meta object literal for the '<em><b>V</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GO_TO__V = eINSTANCE.getGoTo_V();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.ClickOnImpl <em>Click On</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.ClickOnImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getClickOn()
     * @generated
     */
    EClass CLICK_ON = eINSTANCE.getClickOn();

    /**
     * The meta object literal for the '<em><b>Button</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK_ON__BUTTON = eINSTANCE.getClickOn_Button();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK_ON__LINK = eINSTANCE.getClickOn_Link();

    /**
     * The meta object literal for the '<em><b>V</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK_ON__V = eINSTANCE.getClickOn_V();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.FillImpl <em>Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.FillImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getFill()
     * @generated
     */
    EClass FILL = eINSTANCE.getFill();

    /**
     * The meta object literal for the '<em><b>Tf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__TF = eINSTANCE.getFill_Tf();

    /**
     * The meta object literal for the '<em><b>Pass</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__PASS = eINSTANCE.getFill_Pass();

    /**
     * The meta object literal for the '<em><b>V</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__V = eINSTANCE.getFill_V();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILL__INPUT = eINSTANCE.getFill_Input();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.SelectImpl <em>Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.SelectImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getSelect()
     * @generated
     */
    EClass SELECT = eINSTANCE.getSelect();

    /**
     * The meta object literal for the '<em><b>Sb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__SB = eINSTANCE.getSelect_Sb();

    /**
     * The meta object literal for the '<em><b>V</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__V = eINSTANCE.getSelect_V();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.CheckIfImpl <em>Check If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.CheckIfImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getCheckIf()
     * @generated
     */
    EClass CHECK_IF = eINSTANCE.getCheckIf();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_IF__ARGS = eINSTANCE.getCheckIf_Args();

    /**
     * The meta object literal for the '<em><b>V1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_IF__V1 = eINSTANCE.getCheckIf_V1();

    /**
     * The meta object literal for the '<em><b>Lin KTo Check</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_IF__LIN_KTO_CHECK = eINSTANCE.getCheckIf_LinKToCheck();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK_IF__V2 = eINSTANCE.getCheckIf_V2();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.ClearImpl <em>Clear</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.ClearImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getClear()
     * @generated
     */
    EClass CLEAR = eINSTANCE.getClear();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLEAR__T = eINSTANCE.getClear_T();

    /**
     * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLEAR__P = eINSTANCE.getClear_P();

    /**
     * The meta object literal for the '<em><b>V</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLEAR__V = eINSTANCE.getClear_V();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.BooleanConditionImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getBooleanCondition()
     * @generated
     */
    EClass BOOLEAN_CONDITION = eINSTANCE.getBooleanCondition();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_CONDITION__ARG1 = eINSTANCE.getBooleanCondition_Arg1();

    /**
     * The meta object literal for the '<em><b>Arg2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_CONDITION__ARG2 = eINSTANCE.getBooleanCondition_Arg2();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_CONDITION__ARG = eINSTANCE.getBooleanCondition_Arg();

    /**
     * The meta object literal for the '<em><b>Bool</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_CONDITION__BOOL = eINSTANCE.getBooleanCondition_Bool();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.ConditionImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>If Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__IF_COND = eINSTANCE.getCondition_IfCond();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__FUNC = eINSTANCE.getCondition_Func();

    /**
     * The meta object literal for the '<em><b>Elseif Conds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__ELSEIF_CONDS = eINSTANCE.getCondition_ElseifConds();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.LoopImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__FUNC = eINSTANCE.getLoop_Func();

    /**
     * The meta object literal for the '<em><b>Bool</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__BOOL = eINSTANCE.getLoop_Bool();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.WebPageObjImpl <em>Web Page Obj</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.WebPageObjImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getWebPageObj()
     * @generated
     */
    EClass WEB_PAGE_OBJ = eINSTANCE.getWebPageObj();

    /**
     * The meta object literal for the '<em><b>Tf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_PAGE_OBJ__TF = eINSTANCE.getWebPageObj_Tf();

    /**
     * The meta object literal for the '<em><b>Psw</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_PAGE_OBJ__PSW = eINSTANCE.getWebPageObj_Psw();

    /**
     * The meta object literal for the '<em><b>Btn</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_PAGE_OBJ__BTN = eINSTANCE.getWebPageObj_Btn();

    /**
     * The meta object literal for the '<em><b>Ck</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_PAGE_OBJ__CK = eINSTANCE.getWebPageObj_Ck();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_PAGE_OBJ__T = eINSTANCE.getWebPageObj_T();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_PAGE_OBJ__L = eINSTANCE.getWebPageObj_L();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.TextFieldImpl <em>Text Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.TextFieldImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getTextField()
     * @generated
     */
    EClass TEXT_FIELD = eINSTANCE.getTextField();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_FIELD__USERNAME = eINSTANCE.getTextField_Username();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.PasswordImpl <em>Password</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.PasswordImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getPassword()
     * @generated
     */
    EClass PASSWORD = eINSTANCE.getPassword();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PASSWORD__PASSWORD = eINSTANCE.getPassword_Password();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.ButtonImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__BUTTON = eINSTANCE.getButton_Button();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.CheckBoxImpl <em>Check Box</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.CheckBoxImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getCheckBox()
     * @generated
     */
    EClass CHECK_BOX = eINSTANCE.getCheckBox();

    /**
     * The meta object literal for the '<em><b>Check Box</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK_BOX__CHECK_BOX = eINSTANCE.getCheckBox_CheckBox();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.TextImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.LinkImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__LINK = eINSTANCE.getLink_Link();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.CollectionsImpl <em>Collections</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.CollectionsImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getCollections()
     * @generated
     */
    EClass COLLECTIONS = eINSTANCE.getCollections();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTIONS__S = eINSTANCE.getCollections_S();

    /**
     * The meta object literal for the '<em><b>C</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTIONS__C = eINSTANCE.getCollections_C();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTIONS__F = eINSTANCE.getCollections_F();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTIONS__G = eINSTANCE.getCollections_G();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.FillAllTextFieldsImpl <em>Fill All Text Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.FillAllTextFieldsImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getFillAllTextFields()
     * @generated
     */
    EClass FILL_ALL_TEXT_FIELDS = eINSTANCE.getFillAllTextFields();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILL_ALL_TEXT_FIELDS__INPUT = eINSTANCE.getFillAllTextFields_Input();

    /**
     * The meta object literal for the '<em><b>V</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL_ALL_TEXT_FIELDS__V = eINSTANCE.getFillAllTextFields_V();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.VariableImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>O</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__O = eINSTANCE.getVariable_O();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.MemoriseImpl <em>Memorise</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.MemoriseImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getMemorise()
     * @generated
     */
    EClass MEMORISE = eINSTANCE.getMemorise();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMORISE__OBJ = eINSTANCE.getMemorise_Obj();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMORISE__VAR = eINSTANCE.getMemorise_Var();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.ParametersImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getParameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getParameters();

    /**
     * The meta object literal for the '<em><b>Pars</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETERS__PARS = eINSTANCE.getParameters_Pars();

    /**
     * The meta object literal for the '{@link org.xtext.example.browser.browser.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.browser.browser.impl.ProcedureImpl
     * @see org.xtext.example.browser.browser.impl.BrowserPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__NAME = eINSTANCE.getProcedure_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__PARAMS = eINSTANCE.getProcedure_Params();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__INS = eINSTANCE.getProcedure_Ins();

  }

} //BrowserPackage
