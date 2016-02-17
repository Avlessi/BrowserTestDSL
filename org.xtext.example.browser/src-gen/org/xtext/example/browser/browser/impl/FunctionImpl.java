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
import org.xtext.example.browser.browser.CheckIf;
import org.xtext.example.browser.browser.Clear;
import org.xtext.example.browser.browser.ClickOn;
import org.xtext.example.browser.browser.Fill;
import org.xtext.example.browser.browser.Function;
import org.xtext.example.browser.browser.GoTo;
import org.xtext.example.browser.browser.Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.impl.FunctionImpl#getGtl <em>Gtl</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.FunctionImpl#getCob <em>Cob</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.FunctionImpl#getFtf <em>Ftf</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.FunctionImpl#getSel <em>Sel</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.FunctionImpl#getCi <em>Ci</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.FunctionImpl#getCl <em>Cl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MinimalEObjectImpl.Container implements Function
{
  /**
   * The cached value of the '{@link #getGtl() <em>Gtl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGtl()
   * @generated
   * @ordered
   */
  protected GoTo gtl;

  /**
   * The cached value of the '{@link #getCob() <em>Cob</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCob()
   * @generated
   * @ordered
   */
  protected ClickOn cob;

  /**
   * The cached value of the '{@link #getFtf() <em>Ftf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFtf()
   * @generated
   * @ordered
   */
  protected Fill ftf;

  /**
   * The cached value of the '{@link #getSel() <em>Sel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSel()
   * @generated
   * @ordered
   */
  protected Select sel;

  /**
   * The cached value of the '{@link #getCi() <em>Ci</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCi()
   * @generated
   * @ordered
   */
  protected CheckIf ci;

  /**
   * The cached value of the '{@link #getCl() <em>Cl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCl()
   * @generated
   * @ordered
   */
  protected Clear cl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
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
    return BrowserPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoTo getGtl()
  {
    return gtl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGtl(GoTo newGtl, NotificationChain msgs)
  {
    GoTo oldGtl = gtl;
    gtl = newGtl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__GTL, oldGtl, newGtl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGtl(GoTo newGtl)
  {
    if (newGtl != gtl)
    {
      NotificationChain msgs = null;
      if (gtl != null)
        msgs = ((InternalEObject)gtl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__GTL, null, msgs);
      if (newGtl != null)
        msgs = ((InternalEObject)newGtl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__GTL, null, msgs);
      msgs = basicSetGtl(newGtl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__GTL, newGtl, newGtl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickOn getCob()
  {
    return cob;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCob(ClickOn newCob, NotificationChain msgs)
  {
    ClickOn oldCob = cob;
    cob = newCob;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__COB, oldCob, newCob);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCob(ClickOn newCob)
  {
    if (newCob != cob)
    {
      NotificationChain msgs = null;
      if (cob != null)
        msgs = ((InternalEObject)cob).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__COB, null, msgs);
      if (newCob != null)
        msgs = ((InternalEObject)newCob).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__COB, null, msgs);
      msgs = basicSetCob(newCob, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__COB, newCob, newCob));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fill getFtf()
  {
    return ftf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFtf(Fill newFtf, NotificationChain msgs)
  {
    Fill oldFtf = ftf;
    ftf = newFtf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__FTF, oldFtf, newFtf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFtf(Fill newFtf)
  {
    if (newFtf != ftf)
    {
      NotificationChain msgs = null;
      if (ftf != null)
        msgs = ((InternalEObject)ftf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__FTF, null, msgs);
      if (newFtf != null)
        msgs = ((InternalEObject)newFtf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__FTF, null, msgs);
      msgs = basicSetFtf(newFtf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__FTF, newFtf, newFtf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Select getSel()
  {
    return sel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSel(Select newSel, NotificationChain msgs)
  {
    Select oldSel = sel;
    sel = newSel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__SEL, oldSel, newSel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSel(Select newSel)
  {
    if (newSel != sel)
    {
      NotificationChain msgs = null;
      if (sel != null)
        msgs = ((InternalEObject)sel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__SEL, null, msgs);
      if (newSel != null)
        msgs = ((InternalEObject)newSel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__SEL, null, msgs);
      msgs = basicSetSel(newSel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__SEL, newSel, newSel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CheckIf getCi()
  {
    return ci;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCi(CheckIf newCi, NotificationChain msgs)
  {
    CheckIf oldCi = ci;
    ci = newCi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__CI, oldCi, newCi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCi(CheckIf newCi)
  {
    if (newCi != ci)
    {
      NotificationChain msgs = null;
      if (ci != null)
        msgs = ((InternalEObject)ci).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__CI, null, msgs);
      if (newCi != null)
        msgs = ((InternalEObject)newCi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__CI, null, msgs);
      msgs = basicSetCi(newCi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__CI, newCi, newCi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clear getCl()
  {
    return cl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCl(Clear newCl, NotificationChain msgs)
  {
    Clear oldCl = cl;
    cl = newCl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__CL, oldCl, newCl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCl(Clear newCl)
  {
    if (newCl != cl)
    {
      NotificationChain msgs = null;
      if (cl != null)
        msgs = ((InternalEObject)cl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__CL, null, msgs);
      if (newCl != null)
        msgs = ((InternalEObject)newCl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FUNCTION__CL, null, msgs);
      msgs = basicSetCl(newCl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FUNCTION__CL, newCl, newCl));
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
      case BrowserPackage.FUNCTION__GTL:
        return basicSetGtl(null, msgs);
      case BrowserPackage.FUNCTION__COB:
        return basicSetCob(null, msgs);
      case BrowserPackage.FUNCTION__FTF:
        return basicSetFtf(null, msgs);
      case BrowserPackage.FUNCTION__SEL:
        return basicSetSel(null, msgs);
      case BrowserPackage.FUNCTION__CI:
        return basicSetCi(null, msgs);
      case BrowserPackage.FUNCTION__CL:
        return basicSetCl(null, msgs);
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
      case BrowserPackage.FUNCTION__GTL:
        return getGtl();
      case BrowserPackage.FUNCTION__COB:
        return getCob();
      case BrowserPackage.FUNCTION__FTF:
        return getFtf();
      case BrowserPackage.FUNCTION__SEL:
        return getSel();
      case BrowserPackage.FUNCTION__CI:
        return getCi();
      case BrowserPackage.FUNCTION__CL:
        return getCl();
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
      case BrowserPackage.FUNCTION__GTL:
        setGtl((GoTo)newValue);
        return;
      case BrowserPackage.FUNCTION__COB:
        setCob((ClickOn)newValue);
        return;
      case BrowserPackage.FUNCTION__FTF:
        setFtf((Fill)newValue);
        return;
      case BrowserPackage.FUNCTION__SEL:
        setSel((Select)newValue);
        return;
      case BrowserPackage.FUNCTION__CI:
        setCi((CheckIf)newValue);
        return;
      case BrowserPackage.FUNCTION__CL:
        setCl((Clear)newValue);
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
      case BrowserPackage.FUNCTION__GTL:
        setGtl((GoTo)null);
        return;
      case BrowserPackage.FUNCTION__COB:
        setCob((ClickOn)null);
        return;
      case BrowserPackage.FUNCTION__FTF:
        setFtf((Fill)null);
        return;
      case BrowserPackage.FUNCTION__SEL:
        setSel((Select)null);
        return;
      case BrowserPackage.FUNCTION__CI:
        setCi((CheckIf)null);
        return;
      case BrowserPackage.FUNCTION__CL:
        setCl((Clear)null);
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
      case BrowserPackage.FUNCTION__GTL:
        return gtl != null;
      case BrowserPackage.FUNCTION__COB:
        return cob != null;
      case BrowserPackage.FUNCTION__FTF:
        return ftf != null;
      case BrowserPackage.FUNCTION__SEL:
        return sel != null;
      case BrowserPackage.FUNCTION__CI:
        return ci != null;
      case BrowserPackage.FUNCTION__CL:
        return cl != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionImpl
