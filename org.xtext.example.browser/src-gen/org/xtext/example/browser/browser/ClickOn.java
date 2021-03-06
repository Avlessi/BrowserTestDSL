/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.ClickOn#getButton <em>Button</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.ClickOn#getLink <em>Link</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.ClickOn#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getClickOn()
 * @model
 * @generated
 */
public interface ClickOn extends EObject
{
  /**
   * Returns the value of the '<em><b>Button</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Button</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Button</em>' containment reference.
   * @see #setButton(Button)
   * @see org.xtext.example.browser.browser.BrowserPackage#getClickOn_Button()
   * @model containment="true"
   * @generated
   */
  Button getButton();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.ClickOn#getButton <em>Button</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Button</em>' containment reference.
   * @see #getButton()
   * @generated
   */
  void setButton(Button value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' containment reference.
   * @see #setLink(Link)
   * @see org.xtext.example.browser.browser.BrowserPackage#getClickOn_Link()
   * @model containment="true"
   * @generated
   */
  Link getLink();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.ClickOn#getLink <em>Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' containment reference.
   * @see #getLink()
   * @generated
   */
  void setLink(Link value);

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
   * @see org.xtext.example.browser.browser.BrowserPackage#getClickOn_V()
   * @model
   * @generated
   */
  Variable getV();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.ClickOn#getV <em>V</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' reference.
   * @see #getV()
   * @generated
   */
  void setV(Variable value);

} // ClickOn
