/**
 */
package org.xtext.example.browser.browser.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.browser.browser.BooleanCondition;
import org.xtext.example.browser.browser.BrowserPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.impl.BooleanConditionImpl#getArg1 <em>Arg1</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.BooleanConditionImpl#getArg2 <em>Arg2</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.BooleanConditionImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.BooleanConditionImpl#getBool <em>Bool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanConditionImpl extends MinimalEObjectImpl.Container implements BooleanCondition
{
  /**
   * The cached value of the '{@link #getArg1() <em>Arg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg1()
   * @generated
   * @ordered
   */
  protected EObject arg1;

  /**
   * The cached value of the '{@link #getArg2() <em>Arg2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg2()
   * @generated
   * @ordered
   */
  protected EObject arg2;

  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected EObject arg;

  /**
   * The cached value of the '{@link #getBool() <em>Bool</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool()
   * @generated
   * @ordered
   */
  protected EObject bool;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanConditionImpl()
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
    return BrowserPackage.Literals.BOOLEAN_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getArg1()
  {
    return arg1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg1(EObject newArg1, NotificationChain msgs)
  {
    EObject oldArg1 = arg1;
    arg1 = newArg1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.BOOLEAN_CONDITION__ARG1, oldArg1, newArg1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg1(EObject newArg1)
  {
    if (newArg1 != arg1)
    {
      NotificationChain msgs = null;
      if (arg1 != null)
        msgs = ((InternalEObject)arg1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.BOOLEAN_CONDITION__ARG1, null, msgs);
      if (newArg1 != null)
        msgs = ((InternalEObject)newArg1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.BOOLEAN_CONDITION__ARG1, null, msgs);
      msgs = basicSetArg1(newArg1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.BOOLEAN_CONDITION__ARG1, newArg1, newArg1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getArg2()
  {
    return arg2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg2(EObject newArg2, NotificationChain msgs)
  {
    EObject oldArg2 = arg2;
    arg2 = newArg2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.BOOLEAN_CONDITION__ARG2, oldArg2, newArg2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg2(EObject newArg2)
  {
    if (newArg2 != arg2)
    {
      NotificationChain msgs = null;
      if (arg2 != null)
        msgs = ((InternalEObject)arg2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.BOOLEAN_CONDITION__ARG2, null, msgs);
      if (newArg2 != null)
        msgs = ((InternalEObject)newArg2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.BOOLEAN_CONDITION__ARG2, null, msgs);
      msgs = basicSetArg2(newArg2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.BOOLEAN_CONDITION__ARG2, newArg2, newArg2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(EObject newArg, NotificationChain msgs)
  {
    EObject oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.BOOLEAN_CONDITION__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(EObject newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.BOOLEAN_CONDITION__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.BOOLEAN_CONDITION__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.BOOLEAN_CONDITION__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBool(EObject newBool, NotificationChain msgs)
  {
    EObject oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.BOOLEAN_CONDITION__BOOL, oldBool, newBool);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBool(EObject newBool)
  {
    if (newBool != bool)
    {
      NotificationChain msgs = null;
      if (bool != null)
        msgs = ((InternalEObject)bool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.BOOLEAN_CONDITION__BOOL, null, msgs);
      if (newBool != null)
        msgs = ((InternalEObject)newBool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.BOOLEAN_CONDITION__BOOL, null, msgs);
      msgs = basicSetBool(newBool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.BOOLEAN_CONDITION__BOOL, newBool, newBool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BrowserPackage.BOOLEAN_CONDITION__ARG1:
        return basicSetArg1(null, msgs);
      case BrowserPackage.BOOLEAN_CONDITION__ARG2:
        return basicSetArg2(null, msgs);
      case BrowserPackage.BOOLEAN_CONDITION__ARG:
        return basicSetArg(null, msgs);
      case BrowserPackage.BOOLEAN_CONDITION__BOOL:
        return basicSetBool(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BrowserPackage.BOOLEAN_CONDITION__ARG1:
        return getArg1();
      case BrowserPackage.BOOLEAN_CONDITION__ARG2:
        return getArg2();
      case BrowserPackage.BOOLEAN_CONDITION__ARG:
        return getArg();
      case BrowserPackage.BOOLEAN_CONDITION__BOOL:
        return getBool();
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
      case BrowserPackage.BOOLEAN_CONDITION__ARG1:
        setArg1((EObject)newValue);
        return;
      case BrowserPackage.BOOLEAN_CONDITION__ARG2:
        setArg2((EObject)newValue);
        return;
      case BrowserPackage.BOOLEAN_CONDITION__ARG:
        setArg((EObject)newValue);
        return;
      case BrowserPackage.BOOLEAN_CONDITION__BOOL:
        setBool((EObject)newValue);
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
      case BrowserPackage.BOOLEAN_CONDITION__ARG1:
        setArg1((EObject)null);
        return;
      case BrowserPackage.BOOLEAN_CONDITION__ARG2:
        setArg2((EObject)null);
        return;
      case BrowserPackage.BOOLEAN_CONDITION__ARG:
        setArg((EObject)null);
        return;
      case BrowserPackage.BOOLEAN_CONDITION__BOOL:
        setBool((EObject)null);
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
      case BrowserPackage.BOOLEAN_CONDITION__ARG1:
        return arg1 != null;
      case BrowserPackage.BOOLEAN_CONDITION__ARG2:
        return arg2 != null;
      case BrowserPackage.BOOLEAN_CONDITION__ARG:
        return arg != null;
      case BrowserPackage.BOOLEAN_CONDITION__BOOL:
        return bool != null;
    }
    return super.eIsSet(featureID);
  }

} //BooleanConditionImpl
