/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Validator#getRestriction <em>Restriction</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getValidator()
 * @model
 * @generated
 */
public interface Validator extends EObject
{
  /**
   * Returns the value of the '<em><b>Restriction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restriction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restriction</em>' attribute.
   * @see #setRestriction(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getValidator_Restriction()
   * @model
   * @generated
   */
  String getRestriction();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Validator#getRestriction <em>Restriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restriction</em>' attribute.
   * @see #getRestriction()
   * @generated
   */
  void setRestriction(String value);

} // Validator
