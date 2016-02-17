/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Condition#getIfCond <em>If Cond</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Condition#getFunc <em>Func</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Condition#getElseifConds <em>Elseif Conds</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>If Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Cond</em>' containment reference.
   * @see #setIfCond(EObject)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCondition_IfCond()
   * @model containment="true"
   * @generated
   */
  EObject getIfCond();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Condition#getIfCond <em>If Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If Cond</em>' containment reference.
   * @see #getIfCond()
   * @generated
   */
  void setIfCond(EObject value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.browser.browser.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference list.
   * @see org.xtext.example.browser.browser.BrowserPackage#getCondition_Func()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunc();

  /**
   * Returns the value of the '<em><b>Elseif Conds</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseif Conds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseif Conds</em>' containment reference list.
   * @see org.xtext.example.browser.browser.BrowserPackage#getCondition_ElseifConds()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElseifConds();

} // Condition
