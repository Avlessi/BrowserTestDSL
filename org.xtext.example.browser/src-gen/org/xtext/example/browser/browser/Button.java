/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Button#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends EObject
{
  /**
   * Returns the value of the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Button</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Button</em>' attribute.
   * @see #setButton(String)
   * @see org.xtext.example.browser.browser.BrowserPackage#getButton_Button()
   * @model
   * @generated
   */
  String getButton();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Button#getButton <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Button</em>' attribute.
   * @see #getButton()
   * @generated
   */
  void setButton(String value);

} // Button
