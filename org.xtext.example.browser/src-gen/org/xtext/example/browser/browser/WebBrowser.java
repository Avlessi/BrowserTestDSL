/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Browser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.WebBrowser#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.WebBrowser#getOnglets <em>Onglets</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getWebBrowser()
 * @model
 * @generated
 */
public interface WebBrowser extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.browser.browser.BrowserPackage#getWebBrowser_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.WebBrowser#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Onglets</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.browser.browser.Onglet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Onglets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Onglets</em>' containment reference list.
   * @see org.xtext.example.browser.browser.BrowserPackage#getWebBrowser_Onglets()
   * @model containment="true"
   * @generated
   */
  EList<Onglet> getOnglets();

} // WebBrowser
