/**
 * generated by Xtext 2.25.0
 */
package com.arsene.dsl.query.queryDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arsene.dsl.query.queryDsl.Assignment#getV <em>V</em>}</li>
 *   <li>{@link com.arsene.dsl.query.queryDsl.Assignment#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see com.arsene.dsl.query.queryDsl.QueryDslPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Instruction
{
  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(VarRef)
   * @see com.arsene.dsl.query.queryDsl.QueryDslPackage#getAssignment_V()
   * @model containment="true"
   * @generated
   */
  VarRef getV();

  /**
   * Sets the value of the '{@link com.arsene.dsl.query.queryDsl.Assignment#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(VarRef value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see com.arsene.dsl.query.queryDsl.QueryDslPackage#getAssignment_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link com.arsene.dsl.query.queryDsl.Assignment#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // Assignment
