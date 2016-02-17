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
import org.xtext.example.browser.browser.CheckBox;
import org.xtext.example.browser.browser.Link;
import org.xtext.example.browser.browser.Password;
import org.xtext.example.browser.browser.Text;
import org.xtext.example.browser.browser.TextField;
import org.xtext.example.browser.browser.WebPageObj;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Page Obj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.impl.WebPageObjImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.WebPageObjImpl#getPsw <em>Psw</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.WebPageObjImpl#getBtn <em>Btn</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.WebPageObjImpl#getCk <em>Ck</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.WebPageObjImpl#getT <em>T</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.WebPageObjImpl#getL <em>L</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebPageObjImpl extends MinimalEObjectImpl.Container implements WebPageObj
{
  /**
   * The cached value of the '{@link #getTf() <em>Tf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTf()
   * @generated
   * @ordered
   */
  protected TextField tf;

  /**
   * The cached value of the '{@link #getPsw() <em>Psw</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPsw()
   * @generated
   * @ordered
   */
  protected Password psw;

  /**
   * The cached value of the '{@link #getBtn() <em>Btn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBtn()
   * @generated
   * @ordered
   */
  protected Button btn;

  /**
   * The cached value of the '{@link #getCk() <em>Ck</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCk()
   * @generated
   * @ordered
   */
  protected CheckBox ck;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Text t;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected Link l;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebPageObjImpl()
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
    return BrowserPackage.Literals.WEB_PAGE_OBJ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextField getTf()
  {
    return tf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTf(TextField newTf, NotificationChain msgs)
  {
    TextField oldTf = tf;
    tf = newTf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__TF, oldTf, newTf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTf(TextField newTf)
  {
    if (newTf != tf)
    {
      NotificationChain msgs = null;
      if (tf != null)
        msgs = ((InternalEObject)tf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__TF, null, msgs);
      if (newTf != null)
        msgs = ((InternalEObject)newTf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__TF, null, msgs);
      msgs = basicSetTf(newTf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__TF, newTf, newTf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Password getPsw()
  {
    return psw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPsw(Password newPsw, NotificationChain msgs)
  {
    Password oldPsw = psw;
    psw = newPsw;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__PSW, oldPsw, newPsw);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPsw(Password newPsw)
  {
    if (newPsw != psw)
    {
      NotificationChain msgs = null;
      if (psw != null)
        msgs = ((InternalEObject)psw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__PSW, null, msgs);
      if (newPsw != null)
        msgs = ((InternalEObject)newPsw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__PSW, null, msgs);
      msgs = basicSetPsw(newPsw, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__PSW, newPsw, newPsw));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button getBtn()
  {
    return btn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBtn(Button newBtn, NotificationChain msgs)
  {
    Button oldBtn = btn;
    btn = newBtn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__BTN, oldBtn, newBtn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBtn(Button newBtn)
  {
    if (newBtn != btn)
    {
      NotificationChain msgs = null;
      if (btn != null)
        msgs = ((InternalEObject)btn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__BTN, null, msgs);
      if (newBtn != null)
        msgs = ((InternalEObject)newBtn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__BTN, null, msgs);
      msgs = basicSetBtn(newBtn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__BTN, newBtn, newBtn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckBox getCk()
  {
    return ck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCk(CheckBox newCk, NotificationChain msgs)
  {
    CheckBox oldCk = ck;
    ck = newCk;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__CK, oldCk, newCk);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCk(CheckBox newCk)
  {
    if (newCk != ck)
    {
      NotificationChain msgs = null;
      if (ck != null)
        msgs = ((InternalEObject)ck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__CK, null, msgs);
      if (newCk != null)
        msgs = ((InternalEObject)newCk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__CK, null, msgs);
      msgs = basicSetCk(newCk, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__CK, newCk, newCk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Text newT, NotificationChain msgs)
  {
    Text oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(Text newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(Link newL, NotificationChain msgs)
  {
    Link oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(Link newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.WEB_PAGE_OBJ__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.WEB_PAGE_OBJ__L, newL, newL));
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
      case BrowserPackage.WEB_PAGE_OBJ__TF:
        return basicSetTf(null, msgs);
      case BrowserPackage.WEB_PAGE_OBJ__PSW:
        return basicSetPsw(null, msgs);
      case BrowserPackage.WEB_PAGE_OBJ__BTN:
        return basicSetBtn(null, msgs);
      case BrowserPackage.WEB_PAGE_OBJ__CK:
        return basicSetCk(null, msgs);
      case BrowserPackage.WEB_PAGE_OBJ__T:
        return basicSetT(null, msgs);
      case BrowserPackage.WEB_PAGE_OBJ__L:
        return basicSetL(null, msgs);
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
      case BrowserPackage.WEB_PAGE_OBJ__TF:
        return getTf();
      case BrowserPackage.WEB_PAGE_OBJ__PSW:
        return getPsw();
      case BrowserPackage.WEB_PAGE_OBJ__BTN:
        return getBtn();
      case BrowserPackage.WEB_PAGE_OBJ__CK:
        return getCk();
      case BrowserPackage.WEB_PAGE_OBJ__T:
        return getT();
      case BrowserPackage.WEB_PAGE_OBJ__L:
        return getL();
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
      case BrowserPackage.WEB_PAGE_OBJ__TF:
        setTf((TextField)newValue);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__PSW:
        setPsw((Password)newValue);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__BTN:
        setBtn((Button)newValue);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__CK:
        setCk((CheckBox)newValue);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__T:
        setT((Text)newValue);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__L:
        setL((Link)newValue);
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
      case BrowserPackage.WEB_PAGE_OBJ__TF:
        setTf((TextField)null);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__PSW:
        setPsw((Password)null);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__BTN:
        setBtn((Button)null);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__CK:
        setCk((CheckBox)null);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__T:
        setT((Text)null);
        return;
      case BrowserPackage.WEB_PAGE_OBJ__L:
        setL((Link)null);
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
      case BrowserPackage.WEB_PAGE_OBJ__TF:
        return tf != null;
      case BrowserPackage.WEB_PAGE_OBJ__PSW:
        return psw != null;
      case BrowserPackage.WEB_PAGE_OBJ__BTN:
        return btn != null;
      case BrowserPackage.WEB_PAGE_OBJ__CK:
        return ck != null;
      case BrowserPackage.WEB_PAGE_OBJ__T:
        return t != null;
      case BrowserPackage.WEB_PAGE_OBJ__L:
        return l != null;
    }
    return super.eIsSet(featureID);
  }

} //WebPageObjImpl
