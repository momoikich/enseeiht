/**
 * generated by Xtext 2.23.0
 */
package fr.n7.gAME;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Etat Visibilite</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.n7.gAME.GAMEPackage#getEtatVisibilite()
 * @model
 * @generated
 */
public enum EtatVisibilite implements Enumerator
{
  /**
   * The '<em><b>Visible</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIBLE_VALUE
   * @generated
   * @ordered
   */
  VISIBLE(0, "visible", "visible"),

  /**
   * The '<em><b>Nonvisible</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONVISIBLE_VALUE
   * @generated
   * @ordered
   */
  NONVISIBLE(1, "nonvisible", "non visible");

  /**
   * The '<em><b>Visible</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIBLE
   * @model name="visible"
   * @generated
   * @ordered
   */
  public static final int VISIBLE_VALUE = 0;

  /**
   * The '<em><b>Nonvisible</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONVISIBLE
   * @model name="nonvisible" literal="non visible"
   * @generated
   * @ordered
   */
  public static final int NONVISIBLE_VALUE = 1;

  /**
   * An array of all the '<em><b>Etat Visibilite</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EtatVisibilite[] VALUES_ARRAY =
    new EtatVisibilite[]
    {
      VISIBLE,
      NONVISIBLE,
    };

  /**
   * A public read-only list of all the '<em><b>Etat Visibilite</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EtatVisibilite> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Etat Visibilite</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EtatVisibilite get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EtatVisibilite result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Etat Visibilite</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EtatVisibilite getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EtatVisibilite result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Etat Visibilite</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EtatVisibilite get(int value)
  {
    switch (value)
    {
      case VISIBLE_VALUE: return VISIBLE;
      case NONVISIBLE_VALUE: return NONVISIBLE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EtatVisibilite(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EtatVisibilite
