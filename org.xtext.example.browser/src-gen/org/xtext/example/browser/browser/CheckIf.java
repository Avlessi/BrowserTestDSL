/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.CheckIf#getArgs <em>Args</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.CheckIf#getV1 <em>V1</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.CheckIf#getLinKToCheck <em>Lin KTo Check</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.CheckIf#getV2 <em>V2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getCheckIf()
 * @model
 * @generated
 */
public interface CheckIf extends EObject
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute.
   * @see #setArgs(String)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCheckIf_Args()
   * @model
   * @generated
   */
  String getArgs();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.CheckIf#getArgs <em>Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' attribute.
   * @see #getArgs()
   * @generated
   */
  void setArgs(String value);

  /**
   * Returns the value of the '<em><b>V1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V1</em>' reference.
   * @see #setV1(Variable)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCheckIf_V1()
   * @model
   * @generated
   */
  Variable getV1();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.CheckIf#getV1 <em>V1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V1</em>' reference.
   * @see #getV1()
   * @generated
   */
  void setV1(Variable value);

  /**
   * Returns the value of the '<em><b>Lin KTo Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lin KTo Check</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lin KTo Check</em>' attribute.
   * @see #setLinKToCheck(String)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCheckIf_LinKToCheck()
   * @model
   * @generated
   */
  String getLinKToCheck();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.CheckIf#getLinKToCheck <em>Lin KTo Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lin KTo Check</em>' attribute.
   * @see #getLinKToCheck()
   * @generated
   */
  void setLinKToCheck(String value);

  /**
   * Returns the value of the '<em><b>V2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V2</em>' reference.
   * @see #setV2(Variable)
   * @see org.xtext.example.browser.browser.BrowserPackage#getCheckIf_V2()
   * @model
   * @generated
   */
  Variable getV2();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.CheckIf#getV2 <em>V2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V2</em>' reference.
   * @see #getV2()
   * @generated
   */
  void setV2(Variable value);

} // CheckIf
