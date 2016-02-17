/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Select#getSb <em>Sb</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Select#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends EObject
{
  /**
   * Returns the value of the '<em><b>Sb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sb</em>' containment reference.
   * @see #setSb(CheckBox)
   * @see org.xtext.example.browser.browser.BrowserPackage#getSelect_Sb()
   * @model containment="true"
   * @generated
   */
  CheckBox getSb();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Select#getSb <em>Sb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sb</em>' containment reference.
   * @see #getSb()
   * @generated
   */
  void setSb(CheckBox value);

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
   * @see org.xtext.example.browser.browser.BrowserPackage#getSelect_V()
   * @model
   * @generated
   */
  Variable getV();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Select#getV <em>V</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' reference.
   * @see #getV()
   * @generated
   */
  void setV(Variable value);

} // Select
