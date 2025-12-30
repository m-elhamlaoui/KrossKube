/**
 */
package multicluster;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Placement Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see multicluster.MulticlusterPackage#getPlacementPolicy()
 * @model
 * @generated
 */
public enum PlacementPolicy implements Enumerator {
	/**
	 * The '<em><b>REPLICATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLICATED_VALUE
	 * @generated
	 * @ordered
	 */
	REPLICATED(0, "REPLICATED", "REPLICATED"),

	/**
	 * The '<em><b>DISTRIBUTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTED_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTED(0, "DISTRIBUTED", "DISTRIBUTED"),

	/**
	 * The '<em><b>BALANCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALANCED_VALUE
	 * @generated
	 * @ordered
	 */
	BALANCED(0, "BALANCED", "BALANCED");

	/**
	 * The '<em><b>REPLICATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLICATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPLICATED_VALUE = 0;

	/**
	 * The '<em><b>DISTRIBUTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTED_VALUE = 0;

	/**
	 * The '<em><b>BALANCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALANCED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BALANCED_VALUE = 0;

	/**
	 * An array of all the '<em><b>Placement Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlacementPolicy[] VALUES_ARRAY =
		new PlacementPolicy[] {
			REPLICATED,
			DISTRIBUTED,
			BALANCED,
		};

	/**
	 * A public read-only list of all the '<em><b>Placement Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlacementPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Placement Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlacementPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlacementPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Placement Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlacementPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlacementPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Placement Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PlacementPolicy get(int value) {
		switch (value) {
			case REPLICATED_VALUE: return REPLICATED;
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
	private PlacementPolicy(int value, String name, String literal) {
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
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //PlacementPolicy
