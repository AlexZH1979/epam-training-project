/**
 */
package hotel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotel.Room#getId <em>Id</em>}</li>
 *   <li>{@link hotel.Room#getHotel <em>Hotel</em>}</li>
 *   <li>{@link hotel.Room#getRoomName <em>Room Name</em>}</li>
 *   <li>{@link hotel.Room#getPricePerDay <em>Price Per Day</em>}</li>
 *   <li>{@link hotel.Room#getDescription <em>Description</em>}</li>
 *   <li>{@link hotel.Room#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
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
	 * @see hotel.HotelPackage#getRoom_Id()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hotel.Room#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link hotel.Room#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link hotel.Room#getId <em>Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Hotel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hotel.HotelUnit#getRoomList <em>Room List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel</em>' container reference.
	 * @see #setHotel(HotelUnit)
	 * @see hotel.HotelPackage#getRoom_Hotel()
	 * @see hotel.HotelUnit#getRoomList
	 * @model opposite="roomList" required="true" transient="false"
	 * @generated
	 */
	HotelUnit getHotel();

	/**
	 * Sets the value of the '{@link hotel.Room#getHotel <em>Hotel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel</em>' container reference.
	 * @see #getHotel()
	 * @generated
	 */
	void setHotel(HotelUnit value);

	/**
	 * Returns the value of the '<em><b>Room Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Name</em>' attribute.
	 * @see #setRoomName(String)
	 * @see hotel.HotelPackage#getRoom_RoomName()
	 * @model required="true"
	 * @generated
	 */
	String getRoomName();

	/**
	 * Sets the value of the '{@link hotel.Room#getRoomName <em>Room Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Name</em>' attribute.
	 * @see #getRoomName()
	 * @generated
	 */
	void setRoomName(String value);

	/**
	 * Returns the value of the '<em><b>Price Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Per Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Per Day</em>' attribute.
	 * @see #setPricePerDay(int)
	 * @see hotel.HotelPackage#getRoom_PricePerDay()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getPricePerDay();

	/**
	 * Sets the value of the '{@link hotel.Room#getPricePerDay <em>Price Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Per Day</em>' attribute.
	 * @see #getPricePerDay()
	 * @generated
	 */
	void setPricePerDay(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see hotel.HotelPackage#getRoom_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link hotel.Room#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(byte)
	 * @see hotel.HotelPackage#getRoom_Size()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Byte" required="true"
	 * @generated
	 */
	byte getSize();

	/**
	 * Sets the value of the '{@link hotel.Room#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(byte value);

} // Room
