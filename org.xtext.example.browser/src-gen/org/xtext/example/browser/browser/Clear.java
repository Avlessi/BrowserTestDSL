/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Clear#getT <em>T</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Clear#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Clear#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getClear()
 * @model
 * @generated
 */
public interface Clear extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(TextField)
   * @see org.xtext.example.browser.browser.BrowserPackage#getClear_T()
   * @model containment="true"
   * @generated
   */
  TextField getT();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Clear#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(TextField value);

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(Password)
   * @see org.xtext.example.browser.browser.BrowserPackage#getClear_P()
   * @model containment="true"
   * @generated
   */
  Password getP();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Clear#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(Password value);

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
   * @see org.xtext.example.browser.browser.BrowserPackage#getClear_V()
   * @model
   * @generated
   */
  Variable getV();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Clear#getV <em>V</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' reference.
   * @see #getV()
   * @generated
   */
  void setV(Variable value);

} // Clear
