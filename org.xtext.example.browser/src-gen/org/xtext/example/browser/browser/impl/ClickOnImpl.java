/**
 */
package org.xtext.example.browser.browser.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.browser.browser.BrowserPackage;
import org.xtext.example.browser.browser.Button;
import org.xtext.example.browser.browser.ClickOn;
import org.xtext.example.browser.browser.Link;
import org.xtext.example.browser.browser.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Click On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.impl.ClickOnImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.ClickOnImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.ClickOnImpl#getV <em>V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClickOnImpl extends MinimalEObjectImpl.Container implements ClickOn
{
  /**
   * The cached value of the '{@link #getButton() <em>Button</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButton()
   * @generated
   * @ordered
   */
  protected Button button;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected Link link;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected Variable v;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClickOnImpl()
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
    return BrowserPackage.Literals.CLICK_ON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button getButton()
  {
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetButton(Button newButton, NotificationChain msgs)
  {
    Button oldButton = button;
    button = newButton;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.CLICK_ON__BUTTON, oldButton, newButton);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setButton(Button newButton)
  {
    if (newButton != button)
    {
      NotificationChain msgs = null;
      if (button != null)
        msgs = ((InternalEObject)button).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.CLICK_ON__BUTTON, null, msgs);
      if (newButton != null)
        msgs = ((InternalEObject)newButton).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.CLICK_ON__BUTTON, null, msgs);
      msgs = basicSetButton(newButton, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CLICK_ON__BUTTON, newButton, newButton));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link getLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLink(Link newLink, NotificationChain msgs)
  {
    Link oldLink = link;
    link = newLink;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.CLICK_ON__LINK, oldLink, newLink);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(Link newLink)
  {
    if (newLink != link)
    {
      NotificationChain msgs = null;
      if (link != null)
        msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.CLICK_ON__LINK, null, msgs);
      if (newLink != null)
        msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.CLICK_ON__LINK, null, msgs);
      msgs = basicSetLink(newLink, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CLICK_ON__LINK, newLink, newLink));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getV()
  {
    if (v != null && v.eIsProxy())
    {
      InternalEObject oldV = (InternalEObject)v;
      v = (Variable)eResolveProxy(oldV);
      if (v != oldV)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrowserPackage.CLICK_ON__V, oldV, v));
      }
    }
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(Variable newV)
  {
    Variable oldV = v;
    v = newV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.CLICK_ON__V, oldV, v));
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
      case BrowserPackage.CLICK_ON__BUTTON:
        return basicSetButton(null, msgs);
      case BrowserPackage.CLICK_ON__LINK:
        return basicSetLink(null, msgs);
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
      case BrowserPackage.CLICK_ON__BUTTON:
        return getButton();
      case BrowserPackage.CLICK_ON__LINK:
        return getLink();
      case BrowserPackage.CLICK_ON__V:
        if (resolve) return getV();
        return basicGetV();
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
      case BrowserPackage.CLICK_ON__BUTTON:
        setButton((Button)newValue);
        return;
      case BrowserPackage.CLICK_ON__LINK:
        setLink((Link)newValue);
        return;
      case BrowserPackage.CLICK_ON__V:
        setV((Variable)newValue);
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
      case BrowserPackage.CLICK_ON__BUTTON:
        setButton((Button)null);
        return;
      case BrowserPackage.CLICK_ON__LINK:
        setLink((Link)null);
        return;
      case BrowserPackage.CLICK_ON__V:
        setV((Variable)null);
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
      case BrowserPackage.CLICK_ON__BUTTON:
        return button != null;
      case BrowserPackage.CLICK_ON__LINK:
        return link != null;
      case BrowserPackage.CLICK_ON__V:
        return v != null;
    }
    return super.eIsSet(featureID);
  }

} //ClickOnImpl
