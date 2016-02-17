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
import org.xtext.example.browser.browser.Fill;
import org.xtext.example.browser.browser.Password;
import org.xtext.example.browser.browser.TextField;
import org.xtext.example.browser.browser.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.impl.FillImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.FillImpl#getPass <em>Pass</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.FillImpl#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.FillImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FillImpl extends MinimalEObjectImpl.Container implements Fill
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
   * The cached value of the '{@link #getPass() <em>Pass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPass()
   * @generated
   * @ordered
   */
  protected Password pass;

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
   * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected static final String INPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected String input = INPUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FillImpl()
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
    return BrowserPackage.Literals.FILL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.FILL__TF, oldTf, newTf);
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
        msgs = ((InternalEObject)tf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FILL__TF, null, msgs);
      if (newTf != null)
        msgs = ((InternalEObject)newTf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FILL__TF, null, msgs);
      msgs = basicSetTf(newTf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FILL__TF, newTf, newTf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Password getPass()
  {
    return pass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPass(Password newPass, NotificationChain msgs)
  {
    Password oldPass = pass;
    pass = newPass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.FILL__PASS, oldPass, newPass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPass(Password newPass)
  {
    if (newPass != pass)
    {
      NotificationChain msgs = null;
      if (pass != null)
        msgs = ((InternalEObject)pass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FILL__PASS, null, msgs);
      if (newPass != null)
        msgs = ((InternalEObject)newPass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.FILL__PASS, null, msgs);
      msgs = basicSetPass(newPass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FILL__PASS, newPass, newPass));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BrowserPackage.FILL__V, oldV, v));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FILL__V, oldV, v));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(String newInput)
  {
    String oldInput = input;
    input = newInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.FILL__INPUT, oldInput, input));
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
      case BrowserPackage.FILL__TF:
        return basicSetTf(null, msgs);
      case BrowserPackage.FILL__PASS:
        return basicSetPass(null, msgs);
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
      case BrowserPackage.FILL__TF:
        return getTf();
      case BrowserPackage.FILL__PASS:
        return getPass();
      case BrowserPackage.FILL__V:
        if (resolve) return getV();
        return basicGetV();
      case BrowserPackage.FILL__INPUT:
        return getInput();
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
      case BrowserPackage.FILL__TF:
        setTf((TextField)newValue);
        return;
      case BrowserPackage.FILL__PASS:
        setPass((Password)newValue);
        return;
      case BrowserPackage.FILL__V:
        setV((Variable)newValue);
        return;
      case BrowserPackage.FILL__INPUT:
        setInput((String)newValue);
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
      case BrowserPackage.FILL__TF:
        setTf((TextField)null);
        return;
      case BrowserPackage.FILL__PASS:
        setPass((Password)null);
        return;
      case BrowserPackage.FILL__V:
        setV((Variable)null);
        return;
      case BrowserPackage.FILL__INPUT:
        setInput(INPUT_EDEFAULT);
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
      case BrowserPackage.FILL__TF:
        return tf != null;
      case BrowserPackage.FILL__PASS:
        return pass != null;
      case BrowserPackage.FILL__V:
        return v != null;
      case BrowserPackage.FILL__INPUT:
        return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
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
    result.append(" (input: ");
    result.append(input);
    result.append(')');
    return result.toString();
  }

} //FillImpl
