/**
 * generated by Xtext 2.25.0
 */
package com.arsene.dsl.query.queryDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arsene.dsl.query.queryDsl.StringConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.arsene.dsl.query.queryDsl.QueryDslPackage#getStringConstant()
 * @model
 * @generated
 */
public interface StringConstant extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.arsene.dsl.query.queryDsl.QueryDslPackage#getStringConstant_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.arsene.dsl.query.queryDsl.StringConstant#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StringConstant
