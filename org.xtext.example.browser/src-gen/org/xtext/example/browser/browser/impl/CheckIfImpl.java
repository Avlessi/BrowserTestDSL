/**
 */
package org.xtext.example.browser.browser.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.browser.browser.BrowserPackage;
import org.xtext.example.browser.browser.CheckIf;
import org.xtext.example.browser.browser.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.impl.CheckIfImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.CheckIfImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.CheckIfImpl#getLinKToCheck <em>Lin KTo Check</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.CheckIfImpl#getV2 <em>V2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckIfImpl extends MinimalEObjectImpl.Container implements CheckIf
{
  /**
   * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected static final String ARGS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected String args = ARGS_EDEFAULT;

  /**
   * The cached value of the '{@link #getV1() <em>V1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected Variable v1;

  /**
   * The default value of the '{@link #getLinKToCheck() <em>Lin KTo Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinKToCheck()
   * @generated
   * @ordered
   */
  protected static final String LIN_KTO_CHECK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLinKToCheck() <em>Lin KTo Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinKToCheck()
   * @generated
   * @ordered
   */
  protected String linKToCheck = LIN_KTO_CHECK_EDEFAULT;

  /**
   * The cached value of the '{@link #getV2() <em>V2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected Variable v2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckIfImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BrowserPackage.Literals.CHECK_IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(String newArgs)
  {
    String oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CHECK_IF__ARGS, oldArgs, args));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getV1()
  {
    if (v1 != null && v1.eIsProxy())
    {
      InternalEObject oldV1 = (InternalEObject)v1;
      v1 = (Variable)eResolveProxy(oldV1);
      if (v1 != oldV1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrowserPackage.CHECK_IF__V1, oldV1, v1));
      }
    }
    return v1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetV1()
  {
    return v1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV1(Variable newV1)
  {
    Variable oldV1 = v1;
    v1 = newV1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CHECK_IF__V1, oldV1, v1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLinKToCheck()
  {
    return linKToCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinKToCheck(String newLinKToCheck)
  {
    String oldLinKToCheck = linKToCheck;
    linKToCheck = newLinKToCheck;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CHECK_IF__LIN_KTO_CHECK, oldLinKToCheck, linKToCheck));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getV2()
  {
    if (v2 != null && v2.eIsProxy())
    {
      InternalEObject oldV2 = (InternalEObject)v2;
      v2 = (Variable)eResolveProxy(oldV2);
      if (v2 != oldV2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrowserPackage.CHECK_IF__V2, oldV2, v2));
      }
    }
    return v2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetV2()
  {
    return v2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV2(Variable newV2)
  {
    Variable oldV2 = v2;
    v2 = newV2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CHECK_IF__V2, oldV2, v2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BrowserPackage.CHECK_IF__ARGS:
        return getArgs();
      case BrowserPackage.CHECK_IF__V1:
        if (resolve) return getV1();
        return basicGetV1();
      case BrowserPackage.CHECK_IF__LIN_KTO_CHECK:
        return getLinKToCheck();
      case BrowserPackage.CHECK_IF__V2:
        if (resolve) return getV2();
        return basicGetV2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BrowserPackage.CHECK_IF__ARGS:
        setArgs((String)newValue);
        return;
      case BrowserPackage.CHECK_IF__V1:
        setV1((Variable)newValue);
        return;
      case BrowserPackage.CHECK_IF__LIN_KTO_CHECK:
        setLinKToCheck((String)newValue);
        return;
      case BrowserPackage.CHECK_IF__V2:
        setV2((Variable)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BrowserPackage.CHECK_IF__ARGS:
        setArgs(ARGS_EDEFAULT);
        return;
      case BrowserPackage.CHECK_IF__V1:
        setV1((Variable)null);
        return;
      case BrowserPackage.CHECK_IF__LIN_KTO_CHECK:
        setLinKToCheck(LIN_KTO_CHECK_EDEFAULT);
        return;
      case BrowserPackage.CHECK_IF__V2:
        setV2((Variable)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BrowserPackage.CHECK_IF__ARGS:
        return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
      case BrowserPackage.CHECK_IF__V1:
        return v1 != null;
      case BrowserPackage.CHECK_IF__LIN_KTO_CHECK:
        return LIN_KTO_CHECK_EDEFAULT == null ? linKToCheck != null : !LIN_KTO_CHECK_EDEFAULT.equals(linKToCheck);
      case BrowserPackage.CHECK_IF__V2:
        return v2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (args: ");
    result.append(args);
    result.append(", linKToCheck: ");
    result.append(linKToCheck);
    result.append(')');
    return result.toString();
  }

} //CheckIfImpl
