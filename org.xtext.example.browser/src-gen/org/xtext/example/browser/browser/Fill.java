/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Fill#getTf <em>Tf</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Fill#getPass <em>Pass</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Fill#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Fill#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getFill()
 * @model
 * @generated
 */
public interface Fill extends EObject
{
  /**
   * Returns the value of the '<em><b>Tf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tf</em>' containment reference.
   * @see #setTf(TextField)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFill_Tf()
   * @model containment="true"
   * @generated
   */
  TextField getTf();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Fill#getTf <em>Tf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tf</em>' containment reference.
   * @see #getTf()
   * @generated
   */
  void setTf(TextField value);

  /**
   * Returns the value of the '<em><b>Pass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pass</em>' containment reference.
   * @see #setPass(Password)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFill_Pass()
   * @model containment="true"
   * @generated
   */
  Password getPass();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Fill#getPass <em>Pass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pass</em>' containment reference.
   * @see #getPass()
   * @generated
   */
  void setPass(Password value);

  /**
   * Returns the value of the '<em><b>V</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' reference.
   * @see #setV(Variable)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFill_V()
   * @model
   * @generated
   */
  Variable getV();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Fill#getV <em>V</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' reference.
   * @see #getV()
   * @generated
   */
  void setV(Variable value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' attribute.
   * @see #setInput(String)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFill_Input()
   * @model
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Fill#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

} // Fill
