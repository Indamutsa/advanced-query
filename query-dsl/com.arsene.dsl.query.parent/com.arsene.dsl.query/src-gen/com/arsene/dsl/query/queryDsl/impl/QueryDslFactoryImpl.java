/**
 * generated by Xtext 2.25.0
 */
package com.arsene.dsl.query.queryDsl.impl;

import com.arsene.dsl.query.queryDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryDslFactoryImpl extends EFactoryImpl implements QueryDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QueryDslFactory init()
  {
    try
    {
      QueryDslFactory theQueryDslFactory = (QueryDslFactory)EPackage.Registry.INSTANCE.getEFactory(QueryDslPackage.eNS_URI);
      if (theQueryDslFactory != null)
      {
        return theQueryDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QueryDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QueryDslPackage.MODEL: return createModel();
      case QueryDslPackage.INSTRUCTION: return createInstruction();
      case QueryDslPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case QueryDslPackage.VAR_REF: return createVarRef();
      case QueryDslPackage.ASSIGNMENT: return createAssignment();
      case QueryDslPackage.GLOBAL_COMMAND: return createGlobalCommand();
      case QueryDslPackage.EXPRESSION: return createExpression();
      case QueryDslPackage.PRINT_COMMAND: return createPrintCommand();
      case QueryDslPackage.OR: return createOr();
      case QueryDslPackage.AND: return createAnd();
      case QueryDslPackage.EQUALITY: return createEquality();
      case QueryDslPackage.COMPARISON: return createComparison();
      case QueryDslPackage.PLUS: return createPlus();
      case QueryDslPackage.MINUS: return createMinus();
      case QueryDslPackage.MOD: return createMod();
      case QueryDslPackage.MUL_OR_DIV: return createMulOrDiv();
      case QueryDslPackage.EXPO: return createExpo();
      case QueryDslPackage.NOT: return createNot();
      case QueryDslPackage.ARITHMETIC_SIGNED: return createArithmeticSigned();
      case QueryDslPackage.PRIMARY: return createPrimary();
      case QueryDslPackage.INT_CONSTANT: return createIntConstant();
      case QueryDslPackage.BOOL_CONSTANT: return createBoolConstant();
      case QueryDslPackage.STRING_CONSTANT: return createStringConstant();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarRef createVarRef()
  {
    VarRefImpl varRef = new VarRefImpl();
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalCommand createGlobalCommand()
  {
    GlobalCommandImpl globalCommand = new GlobalCommandImpl();
    return globalCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintCommand createPrintCommand()
  {
    PrintCommandImpl printCommand = new PrintCommandImpl();
    return printCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mod createMod()
  {
    ModImpl mod = new ModImpl();
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expo createExpo()
  {
    ExpoImpl expo = new ExpoImpl();
    return expo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticSigned createArithmeticSigned()
  {
    ArithmeticSignedImpl arithmeticSigned = new ArithmeticSignedImpl();
    return arithmeticSigned;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public QueryDslPackage getQueryDslPackage()
  {
    return (QueryDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QueryDslPackage getPackage()
  {
    return QueryDslPackage.eINSTANCE;
  }

} //QueryDslFactoryImpl
