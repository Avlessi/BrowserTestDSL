/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill All Text Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.FillAllTextFields#getInput <em>Input</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.FillAllTextFields#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getFillAllTextFields()
 * @model
 * @generated
 */
public interface FillAllTextFields extends EObject
{
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
   * @see org.xtext.example.browser.browser.BrowserPackage#getFillAllTextFields_Input()
   * @model
   * @generated
   */
  String getInput();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.FillAllTextFields#getInput <em>Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' attribute.
   * @see #getInput()
   * @generated
   */
  void setInput(String value);

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
   * @see org.xtext.example.browser.browser.BrowserPackage#getFillAllTextFields_V()
   * @model
   * @generated
   */
  Variable getV();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.FillAllTextFields#getV <em>V</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' reference.
   * @see #getV()
   * @generated
   */
  void setV(Variable value);

} // FillAllTextFields
