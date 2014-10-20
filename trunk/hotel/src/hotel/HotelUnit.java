/**
 */
package hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotel.HotelUnit#getId <em>Id</em>}</li>
 *   <li>{@link hotel.HotelUnit#getName <em>Name</em>}</li>
 *   <li>{@link hotel.HotelUnit#getRoomList <em>Room List</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getHotelUnit()
 * @model
 * @generated
 */
public interface HotelUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see hotel.HotelPackage#getHotelUnit_Id()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hotel.HotelUnit#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Unsets the value of the '{@link hotel.HotelUnit#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link hotel.HotelUnit#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hotel.HotelPackage#getHotelUnit_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hotel.HotelUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Room List</b></em>' containment reference list.
	 * The list contents are of type {@link hotel.Room}.
	 * It is bidirectional and its opposite is '{@link hotel.Room#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room List</em>' containment reference list.
	 * @see hotel.HotelPackage#getHotelUnit_RoomList()
	 * @see hotel.Room#getHotel
	 * @model opposite="hotel" containment="true"
	 * @generated
	 */
	EList<Room> getRoomList();

} // HotelUnit
