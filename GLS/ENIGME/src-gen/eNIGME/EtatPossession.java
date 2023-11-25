/**
 */
package eNIGME;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Etat Possession</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eNIGME.ENIGMEPackage#getEtatPossession()
 * @model
 * @generated
 */
public enum EtatPossession implements Enumerator {
	/**
	 * The '<em><b>Possede</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSSEDE_VALUE
	 * @generated
	 * @ordered
	 */
	POSSEDE(0, "possede", "possede"),

	/**
	 * The '<em><b>Npossede</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NPOSSEDE_VALUE
	 * @generated
	 * @ordered
	 */
	NPOSSEDE(1, "npossede", "npossede");

	/**
	 * The '<em><b>Possede</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSSEDE
	 * @model name="possede"
	 * @generated
	 * @ordered
	 */
	public static final int POSSEDE_VALUE = 0;

	/**
	 * The '<em><b>Npossede</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NPOSSEDE
	 * @model name="npossede"
	 * @generated
	 * @ordered
	 */
	public static final int NPOSSEDE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Etat Possession</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EtatPossession[] VALUES_ARRAY = new EtatPossession[] { POSSEDE, NPOSSEDE, };

	/**
	 * A public read-only list of all the '<em><b>Etat Possession</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EtatPossession> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Etat Possession</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EtatPossession get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EtatPossession result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Etat Possession</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EtatPossession getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EtatPossession result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Etat Possession</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EtatPossession get(int value) {
		switch (value) {
		case POSSEDE_VALUE:
			return POSSEDE;
		case NPOSSEDE_VALUE:
			return NPOSSEDE;
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
	private EtatPossession(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EtatPossession