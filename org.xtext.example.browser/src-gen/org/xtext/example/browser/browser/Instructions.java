/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Instructions#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Instructions#getIfCond <em>If Cond</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Instructions#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Instructions#getColl <em>Coll</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Instructions#getMem <em>Mem</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Instructions#getProcs <em>Procs</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Instructions#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Instructions#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions()
 * @model
 * @generated
 */
public interface Instructions extends EObject
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(Function)
   * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions_Func()
   * @model containment="true"
   * @generated
   */
  Function getFunc();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Instructions#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(Function value);

  /**
   * Returns the value of the '<em><b>If Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Cond</em>' containment reference.
   * @see #setIfCond(Condition)
   * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions_IfCond()
   * @model containment="true"
   * @generated
   */
  Condition getIfCond();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Instructions#getIfCond <em>If Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Cond</em>' containment reference.
   * @see #getIfCond()
   * @generated
   */
  void setIfCond(Condition value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(Loop)
   * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions_Loop()
   * @model containment="true"
   * @generated
   */
  Loop getLoop();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Instructions#getLoop <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' containment reference.
   * @see #getLoop()
   * @generated
   */
  void setLoop(Loop value);

  /**
   * Returns the value of the '<em><b>Coll</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coll</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coll</em>' containment reference.
   * @see #setColl(Collections)
   * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions_Coll()
   * @model containment="true"
   * @generated
   */
  Collections getColl();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Instructions#getColl <em>Coll</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coll</em>' containment reference.
   * @see #getColl()
   * @generated
   */
  void setColl(Collections value);

  /**
   * Returns the value of the '<em><b>Mem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mem</em>' containment reference.
   * @see #setMem(Memorise)
   * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions_Mem()
   * @model containment="true"
   * @generated
   */
  Memorise getMem();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Instructions#getMem <em>Mem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mem</em>' containment reference.
   * @see #getMem()
   * @generated
   */
  void setMem(Memorise value);

  /**
   * Returns the value of the '<em><b>Procs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procs</em>' containment reference.
   * @see #setProcs(Procedure)
   * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions_Procs()
   * @model containment="true"
   * @generated
   */
  Procedure getProcs();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Instructions#getProcs <em>Procs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procs</em>' containment reference.
   * @see #getProcs()
   * @generated
   */
  void setProcs(Procedure value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(ProcedureLaunch)
   * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions_L()
   * @model containment="true"
   * @generated
   */
  ProcedureLaunch getL();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Instructions#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(ProcedureLaunch value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(Variable)
   * @see org.xtext.example.browser.browser.BrowserPackage#getInstructions_V()
   * @model containment="true"
   * @generated
   */
  Variable getV();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Instructions#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(Variable value);

} // Instructions
