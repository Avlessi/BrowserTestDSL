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
import org.xtext.example.browser.browser.Collections;
import org.xtext.example.browser.browser.Condition;
import org.xtext.example.browser.browser.Function;
import org.xtext.example.browser.browser.Instructions;
import org.xtext.example.browser.browser.Loop;
import org.xtext.example.browser.browser.Memorise;
import org.xtext.example.browser.browser.Procedure;
import org.xtext.example.browser.browser.ProcedureLaunch;
import org.xtext.example.browser.browser.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.impl.InstructionsImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.InstructionsImpl#getIfCond <em>If Cond</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.InstructionsImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.InstructionsImpl#getColl <em>Coll</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.InstructionsImpl#getMem <em>Mem</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.InstructionsImpl#getProcs <em>Procs</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.InstructionsImpl#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.impl.InstructionsImpl#getV <em>V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionsImpl extends MinimalEObjectImpl.Container implements Instructions
{
  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected Function func;

  /**
   * The cached value of the '{@link #getIfCond() <em>If Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfCond()
   * @generated
   * @ordered
   */
  protected Condition ifCond;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected Loop loop;

  /**
   * The cached value of the '{@link #getColl() <em>Coll</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColl()
   * @generated
   * @ordered
   */
  protected Collections coll;

  /**
   * The cached value of the '{@link #getMem() <em>Mem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMem()
   * @generated
   * @ordered
   */
  protected Memorise mem;

  /**
   * The cached value of the '{@link #getProcs() <em>Procs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcs()
   * @generated
   * @ordered
   */
  protected Procedure procs;

  /**
   * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL()
   * @generated
   * @ordered
   */
  protected ProcedureLaunch l;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
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
  protected InstructionsImpl()
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
    return BrowserPackage.Literals.INSTRUCTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunc(Function newFunc, NotificationChain msgs)
  {
    Function oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__FUNC, oldFunc, newFunc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(Function newFunc)
  {
    if (newFunc != func)
    {
      NotificationChain msgs = null;
      if (func != null)
        msgs = ((InternalEObject)func).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__FUNC, null, msgs);
      if (newFunc != null)
        msgs = ((InternalEObject)newFunc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__FUNC, null, msgs);
      msgs = basicSetFunc(newFunc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__FUNC, newFunc, newFunc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getIfCond()
  {
    return ifCond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfCond(Condition newIfCond, NotificationChain msgs)
  {
    Condition oldIfCond = ifCond;
    ifCond = newIfCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__IF_COND, oldIfCond, newIfCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfCond(Condition newIfCond)
  {
    if (newIfCond != ifCond)
    {
      NotificationChain msgs = null;
      if (ifCond != null)
        msgs = ((InternalEObject)ifCond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__IF_COND, null, msgs);
      if (newIfCond != null)
        msgs = ((InternalEObject)newIfCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__IF_COND, null, msgs);
      msgs = basicSetIfCond(newIfCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__IF_COND, newIfCond, newIfCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop(Loop newLoop, NotificationChain msgs)
  {
    Loop oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__LOOP, oldLoop, newLoop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoop(Loop newLoop)
  {
    if (newLoop != loop)
    {
      NotificationChain msgs = null;
      if (loop != null)
        msgs = ((InternalEObject)loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__LOOP, null, msgs);
      if (newLoop != null)
        msgs = ((InternalEObject)newLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__LOOP, null, msgs);
      msgs = basicSetLoop(newLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__LOOP, newLoop, newLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collections getColl()
  {
    return coll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColl(Collections newColl, NotificationChain msgs)
  {
    Collections oldColl = coll;
    coll = newColl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__COLL, oldColl, newColl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColl(Collections newColl)
  {
    if (newColl != coll)
    {
      NotificationChain msgs = null;
      if (coll != null)
        msgs = ((InternalEObject)coll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__COLL, null, msgs);
      if (newColl != null)
        msgs = ((InternalEObject)newColl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__COLL, null, msgs);
      msgs = basicSetColl(newColl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__COLL, newColl, newColl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Memorise getMem()
  {
    return mem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMem(Memorise newMem, NotificationChain msgs)
  {
    Memorise oldMem = mem;
    mem = newMem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__MEM, oldMem, newMem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMem(Memorise newMem)
  {
    if (newMem != mem)
    {
      NotificationChain msgs = null;
      if (mem != null)
        msgs = ((InternalEObject)mem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__MEM, null, msgs);
      if (newMem != null)
        msgs = ((InternalEObject)newMem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__MEM, null, msgs);
      msgs = basicSetMem(newMem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__MEM, newMem, newMem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure getProcs()
  {
    return procs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcs(Procedure newProcs, NotificationChain msgs)
  {
    Procedure oldProcs = procs;
    procs = newProcs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__PROCS, oldProcs, newProcs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcs(Procedure newProcs)
  {
    if (newProcs != procs)
    {
      NotificationChain msgs = null;
      if (procs != null)
        msgs = ((InternalEObject)procs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__PROCS, null, msgs);
      if (newProcs != null)
        msgs = ((InternalEObject)newProcs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__PROCS, null, msgs);
      msgs = basicSetProcs(newProcs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__PROCS, newProcs, newProcs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcedureLaunch getL()
  {
    return l;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL(ProcedureLaunch newL, NotificationChain msgs)
  {
    ProcedureLaunch oldL = l;
    l = newL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__L, oldL, newL);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL(ProcedureLaunch newL)
  {
    if (newL != l)
    {
      NotificationChain msgs = null;
      if (l != null)
        msgs = ((InternalEObject)l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__L, null, msgs);
      if (newL != null)
        msgs = ((InternalEObject)newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__L, null, msgs);
      msgs = basicSetL(newL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__L, newL, newL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV(Variable newV, NotificationChain msgs)
  {
    Variable oldV = v;
    v = newV;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__V, oldV, newV);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(Variable newV)
  {
    if (newV != v)
    {
      NotificationChain msgs = null;
      if (v != null)
        msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__V, null, msgs);
      if (newV != null)
        msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrowserPackage.INSTRUCTIONS__V, null, msgs);
      msgs = basicSetV(newV, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrowserPackage.INSTRUCTIONS__V, newV, newV));
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
      case BrowserPackage.INSTRUCTIONS__FUNC:
        return basicSetFunc(null, msgs);
      case BrowserPackage.INSTRUCTIONS__IF_COND:
        return basicSetIfCond(null, msgs);
      case BrowserPackage.INSTRUCTIONS__LOOP:
        return basicSetLoop(null, msgs);
      case BrowserPackage.INSTRUCTIONS__COLL:
        return basicSetColl(null, msgs);
      case BrowserPackage.INSTRUCTIONS__MEM:
        return basicSetMem(null, msgs);
      case BrowserPackage.INSTRUCTIONS__PROCS:
        return basicSetProcs(null, msgs);
      case BrowserPackage.INSTRUCTIONS__L:
        return basicSetL(null, msgs);
      case BrowserPackage.INSTRUCTIONS__V:
        return basicSetV(null, msgs);
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
      case BrowserPackage.INSTRUCTIONS__FUNC:
        return getFunc();
      case BrowserPackage.INSTRUCTIONS__IF_COND:
        return getIfCond();
      case BrowserPackage.INSTRUCTIONS__LOOP:
        return getLoop();
      case BrowserPackage.INSTRUCTIONS__COLL:
        return getColl();
      case BrowserPackage.INSTRUCTIONS__MEM:
        return getMem();
      case BrowserPackage.INSTRUCTIONS__PROCS:
        return getProcs();
      case BrowserPackage.INSTRUCTIONS__L:
        return getL();
      case BrowserPackage.INSTRUCTIONS__V:
        return getV();
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
      case BrowserPackage.INSTRUCTIONS__FUNC:
        setFunc((Function)newValue);
        return;
      case BrowserPackage.INSTRUCTIONS__IF_COND:
        setIfCond((Condition)newValue);
        return;
      case BrowserPackage.INSTRUCTIONS__LOOP:
        setLoop((Loop)newValue);
        return;
      case BrowserPackage.INSTRUCTIONS__COLL:
        setColl((Collections)newValue);
        return;
      case BrowserPackage.INSTRUCTIONS__MEM:
        setMem((Memorise)newValue);
        return;
      case BrowserPackage.INSTRUCTIONS__PROCS:
        setProcs((Procedure)newValue);
        return;
      case BrowserPackage.INSTRUCTIONS__L:
        setL((ProcedureLaunch)newValue);
        return;
      case BrowserPackage.INSTRUCTIONS__V:
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
      case BrowserPackage.INSTRUCTIONS__FUNC:
        setFunc((Function)null);
        return;
      case BrowserPackage.INSTRUCTIONS__IF_COND:
        setIfCond((Condition)null);
        return;
      case BrowserPackage.INSTRUCTIONS__LOOP:
        setLoop((Loop)null);
        return;
      case BrowserPackage.INSTRUCTIONS__COLL:
        setColl((Collections)null);
        return;
      case BrowserPackage.INSTRUCTIONS__MEM:
        setMem((Memorise)null);
        return;
      case BrowserPackage.INSTRUCTIONS__PROCS:
        setProcs((Procedure)null);
        return;
      case BrowserPackage.INSTRUCTIONS__L:
        setL((ProcedureLaunch)null);
        return;
      case BrowserPackage.INSTRUCTIONS__V:
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
      case BrowserPackage.INSTRUCTIONS__FUNC:
        return func != null;
      case BrowserPackage.INSTRUCTIONS__IF_COND:
        return ifCond != null;
      case BrowserPackage.INSTRUCTIONS__LOOP:
        return loop != null;
      case BrowserPackage.INSTRUCTIONS__COLL:
        return coll != null;
      case BrowserPackage.INSTRUCTIONS__MEM:
        return mem != null;
      case BrowserPackage.INSTRUCTIONS__PROCS:
        return procs != null;
      case BrowserPackage.INSTRUCTIONS__L:
        return l != null;
      case BrowserPackage.INSTRUCTIONS__V:
        return v != null;
    }
    return super.eIsSet(featureID);
  }

} //InstructionsImpl
