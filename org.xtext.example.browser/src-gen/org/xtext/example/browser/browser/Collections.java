/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Collections#getS <em>S</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Collections#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Collections#getF <em>F</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Collections#getG <em>G</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getCollections()
 * @model
 * @generated
 */
public interface Collections extends EObject
{
  /**
   * Returns the value of the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' attribute.
   * @see #setS(String)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCollections_S()
   * @model
   * @generated
   */
  String getS();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Collections#getS <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' attribute.
   * @see #getS()
   * @generated
   */
  void setS(String value);

  /**
   * Returns the value of the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' attribute.
   * @see #setC(String)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCollections_C()
   * @model
   * @generated
   */
  String getC();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Collections#getC <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' attribute.
   * @see #getC()
   * @generated
   */
  void setC(String value);

  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(FillAllTextFields)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCollections_F()
   * @model containment="true"
   * @generated
   */
  FillAllTextFields getF();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Collections#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(FillAllTextFields value);

  /**
   * Returns the value of the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>G</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>G</em>' attribute.
   * @see #setG(String)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCollections_G()
   * @model
   * @generated
   */
  String getG();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Collections#getG <em>G</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>G</em>' attribute.
   * @see #getG()
   * @generated
   */
  void setG(String value);

} // Collections
