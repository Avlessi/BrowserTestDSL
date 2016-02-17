/**
 */
package org.xtext.example.browser.browser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.browser.browser.Function#getGtl <em>Gtl</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Function#getCob <em>Cob</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Function#getFtf <em>Ftf</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Function#getSel <em>Sel</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Function#getCi <em>Ci</em>}</li>
 *   <li>{@link org.xtext.example.browser.browser.Function#getCl <em>Cl</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.browser.browser.BrowserPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Gtl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gtl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gtl</em>' containment reference.
   * @see #setGtl(GoTo)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFunction_Gtl()
   * @model containment="true"
   * @generated
   */
  GoTo getGtl();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Function#getGtl <em>Gtl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gtl</em>' containment reference.
   * @see #getGtl()
   * @generated
   */
  void setGtl(GoTo value);

  /**
   * Returns the value of the '<em><b>Cob</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cob</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cob</em>' containment reference.
   * @see #setCob(ClickOn)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFunction_Cob()
   * @model containment="true"
   * @generated
   */
  ClickOn getCob();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Function#getCob <em>Cob</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cob</em>' containment reference.
   * @see #getCob()
   * @generated
   */
  void setCob(ClickOn value);

  /**
   * Returns the value of the '<em><b>Ftf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ftf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ftf</em>' containment reference.
   * @see #setFtf(Fill)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFunction_Ftf()
   * @model containment="true"
   * @generated
   */
  Fill getFtf();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Function#getFtf <em>Ftf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ftf</em>' containment reference.
   * @see #getFtf()
   * @generated
   */
  void setFtf(Fill value);

  /**
   * Returns the value of the '<em><b>Sel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sel</em>' containment reference.
   * @see #setSel(Select)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFunction_Sel()
   * @model containment="true"
   * @generated
   */
  Select getSel();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Function#getSel <em>Sel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sel</em>' containment reference.
   * @see #getSel()
   * @generated
   */
  void setSel(Select value);

  /**
   * Returns the value of the '<em><b>Ci</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ci</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ci</em>' containment reference.
   * @see #setCi(CheckIf)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFunction_Ci()
   * @model containment="true"
   * @generated
   */
  CheckIf getCi();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Function#getCi <em>Ci</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ci</em>' containment reference.
   * @see #getCi()
   * @generated
   */
  void setCi(CheckIf value);

  /**
   * Returns the value of the '<em><b>Cl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cl</em>' containment reference.
   * @see #setCl(Clear)
   * @see org.xtext.example.browser.browser.BrowserPackage#getFunction_Cl()
   * @model containment="true"
   * @generated
   */
  Clear getCl();

  /**
   * Sets the value of the '{@link org.xtext.example.browser.browser.Function#getCl <em>Cl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cl</em>' containment reference.
   * @see #getCl()
   * @generated
   */
  void setCl(Clear value);

} // Function
