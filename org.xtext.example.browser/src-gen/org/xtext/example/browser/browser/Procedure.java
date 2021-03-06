/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Procedure#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Procedure#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Procedure#getIns <em>Ins</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends EObject
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
   * @see org.xtext.example.browser.browser.BrowserPackage#getProcedure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Procedure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference.
   * @see #setParams(Parameters)
   * @see org.xtext.example.browser.browser.BrowserPackage#getProcedure_Params()
   * @model containment="true"
   * @generated
   */
  Parameters getParams();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Procedure#getParams <em>Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params</em>' containment reference.
   * @see #getParams()
   * @generated
   */
  void setParams(Parameters value);

  /**
   * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.browser.browser.Instructions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ins</em>' containment reference list.
   * @see org.xtext.example.browser.browser.BrowserPackage#getProcedure_Ins()
   * @model containment="true"
   * @generated
   */
  EList<Instructions> getIns();

} // Procedure
