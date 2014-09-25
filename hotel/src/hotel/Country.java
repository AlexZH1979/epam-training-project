/**
 */
package hotel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Country</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hotel.HotelPackage#getCountry()
 * @model
 * @generated
 */
public enum Country implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(-1, "Unknown", "Unknown"),

	/**
	 * The '<em><b>England</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENGLAND_VALUE
	 * @generated
	 * @ordered
	 */
	ENGLAND(1, "England", "EN"),

	/**
	 * The '<em><b>United States Of America</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNITED_STATES_OF_AMERICA_VALUE
	 * @generated
	 * @ordered
	 */
	UNITED_STATES_OF_AMERICA(3, "UnitedStatesOfAmerica", "USA"),

	/**
	 * The '<em><b>Belarus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELARUS_VALUE
	 * @generated
	 * @ordered
	 */
	BELARUS(2, "Belarus", "BEL"),

	/**
	 * The '<em><b>Russian Federation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUSSIAN_FEDERATION_VALUE
	 * @generated
	 * @ordered
	 */
	RUSSIAN_FEDERATION(0, "RussianFederation", "RF");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = -1;

	/**
	 * The '<em><b>England</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>England</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENGLAND
	 * @model name="England" literal="EN"
	 * @generated
	 * @ordered
	 */
	public static final int ENGLAND_VALUE = 1;

	/**
	 * The '<em><b>United States Of America</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>United States Of America</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNITED_STATES_OF_AMERICA
	 * @model name="UnitedStatesOfAmerica" literal="USA"
	 * @generated
	 * @ordered
	 */
	public static final int UNITED_STATES_OF_AMERICA_VALUE = 3;

	/**
	 * The '<em><b>Belarus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Belarus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BELARUS
	 * @model name="Belarus" literal="BEL"
	 * @generated
	 * @ordered
	 */
	public static final int BELARUS_VALUE = 2;

	/**
	 * The '<em><b>Russian Federation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Russian Federation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUSSIAN_FEDERATION
	 * @model name="RussianFederation" literal="RF"
	 * @generated
	 * @ordered
	 */
	public static final int RUSSIAN_FEDERATION_VALUE = 0;

	/**
	 * An array of all the '<em><b>Country</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Country[] VALUES_ARRAY =
		new Country[] {
			UNKNOWN,
			ENGLAND,
			UNITED_STATES_OF_AMERICA,
			BELARUS,
			RUSSIAN_FEDERATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Country</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Country> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Country</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Country get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Country result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Country</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Country getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Country result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Country</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Country get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case ENGLAND_VALUE: return ENGLAND;
			case UNITED_STATES_OF_AMERICA_VALUE: return UNITED_STATES_OF_AMERICA;
			case BELARUS_VALUE: return BELARUS;
			case RUSSIAN_FEDERATION_VALUE: return RUSSIAN_FEDERATION;
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
	private Country(int value, String name, String literal) {
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
	
} //Country
