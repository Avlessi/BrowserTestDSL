/**
 */
package org.xtext.example.browser.browser.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.browser.browser.BrowserPackage;
import org.xtext.example.browser.browser.Condition;
import org.xtext.example.browser.browser.Function;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.impl.ConditionImpl#getIfCond <em>If Cond</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.ConditionImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.ConditionImpl#getElseifConds <em>Elseif Conds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The cached value of the '{@link #getIfCond() <em>If Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfCond()
   * @generated
   * @ordered
   */
  protected EObject ifCond;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected EList<Function> func;

  /**
   * The cached value of the '{@link #getElseifConds() <em>Elseif Conds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseifConds()
   * @generated
   * @ordered
   */
  protected EList<EObject> elseifConds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return BrowserPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getIfCond()
  {
    return ifCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfCond(EObject newIfCond, NotificationChain msgs)
  {
    EObject oldIfCond = ifCond;
    ifCond = newIfCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.CONDITION__IF_COND, oldIfCond, newIfCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfCond(EObject newIfCond)
  {
    if (newIfCond != ifCond)
    {
      NotificationChain msgs = null;
      if (ifCond != null)
        msgs = ((InternalEObject)ifCond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.CONDITION__IF_COND, null, msgs);
      if (newIfCond != null)
        msgs = ((InternalEObject)newIfCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.CONDITION__IF_COND, null, msgs);
      msgs = basicSetIfCond(newIfCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CONDITION__IF_COND, newIfCond, newIfCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function> getFunc()
  {
    if (func == null)
    {
      func = new EObjectContainmentEList<Function>(Function.class, this, BrowserPackage.CONDITION__FUNC);
    }
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getElseifConds()
  {
    if (elseifConds == null)
    {
      elseifConds = new EObjectContainmentEList<EObject>(EObject.class, this, BrowserPackage.CONDITION__ELSEIF_CONDS);
    }
    return elseifConds;
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
      case BrowserPackage.CONDITION__IF_COND:
        return basicSetIfCond(null, msgs);
      case BrowserPackage.CONDITION__FUNC:
        return ((InternalEList<?>)getFunc()).basicRemove(otherEnd, msgs);
      case BrowserPackage.CONDITION__ELSEIF_CONDS:
        return ((InternalEList<?>)getElseifConds()).basicRemove(otherEnd, msgs);
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
      case BrowserPackage.CONDITION__IF_COND:
        return getIfCond();
      case BrowserPackage.CONDITION__FUNC:
        return getFunc();
      case BrowserPackage.CONDITION__ELSEIF_CONDS:
        return getElseifConds();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BrowserPackage.CONDITION__IF_COND:
        setIfCond((EObject)newValue);
        return;
      case BrowserPackage.CONDITION__FUNC:
        getFunc().clear();
        getFunc().addAll((Collection<? extends Function>)newValue);
        return;
      case BrowserPackage.CONDITION__ELSEIF_CONDS:
        getElseifConds().clear();
        getElseifConds().addAll((Collection<? extends EObject>)newValue);
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
      case BrowserPackage.CONDITION__IF_COND:
        setIfCond((EObject)null);
        return;
      case BrowserPackage.CONDITION__FUNC:
        getFunc().clear();
        return;
      case BrowserPackage.CONDITION__ELSEIF_CONDS:
        getElseifConds().clear();
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
      case BrowserPackage.CONDITION__IF_COND:
        return ifCond != null;
      case BrowserPackage.CONDITION__FUNC:
        return func != null && !func.isEmpty();
      case BrowserPackage.CONDITION__ELSEIF_CONDS:
        return elseifConds != null && !elseifConds.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
