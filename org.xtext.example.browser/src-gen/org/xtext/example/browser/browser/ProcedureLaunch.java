/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Launch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.ProcedureLaunch#getProc <em>Proc</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getProcedureLaunch()
 * @model
 * @generated
 */
public interface ProcedureLaunch extends EObject
{
  /**
   * Returns the value of the '<em><b>Proc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc</em>' reference.
   * @see #setProc(Procedure)
   * @see org.xtext.example.browser.browser.BrowserPackage#getProcedureLaunch_Proc()
   * @model
   * @generated
   */
  Procedure getProc();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.ProcedureLaunch#getProc <em>Proc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc</em>' reference.
   * @see #getProc()
   * @generated
   */
  void setProc(Procedure value);

} // ProcedureLaunch
