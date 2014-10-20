/**
 */
package hotel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Surrendering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotel.RoomSurrendering#getId <em>Id</em>}</li>
 *   <li>{@link hotel.RoomSurrendering#getHotel <em>Hotel</em>}</li>
 *   <li>{@link hotel.RoomSurrendering#getNumberName <em>Number Name</em>}</li>
 *   <li>{@link hotel.RoomSurrendering#getPricePerDay <em>Price Per Day</em>}</li>
 *   <li>{@link hotel.RoomSurrendering#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getRoomSurrendering()
 * @model
 * @generated
 */
public interface RoomSurrendering extends EObject {
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
	 * @see hotel.HotelPackage#getRoomSurrendering_Id()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hotel.RoomSurrendering#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link hotel.RoomSurrendering#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link hotel.RoomSurrendering#getId <em>Id</em>}' attribute is set.
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
	 * @see hotel.HotelPackage#getRoomSurrendering_Hotel()
	 * @see hotel.HotelUnit#getRoomList
	 * @model opposite="roomList" required="true" transient="false"
	 * @generated
	 */
	HotelUnit getHotel();

	/**
	 * Sets the value of the '{@link hotel.RoomSurrendering#getHotel <em>Hotel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel</em>' container reference.
	 * @see #getHotel()
	 * @generated
	 */
	void setHotel(HotelUnit value);

	/**
	 * Returns the value of the '<em><b>Number Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Name</em>' attribute.
	 * @see #setNumberName(String)
	 * @see hotel.HotelPackage#getRoomSurrendering_NumberName()
	 * @model required="true"
	 * @generated
	 */
	String getNumberName();

	/**
	 * Sets the value of the '{@link hotel.RoomSurrendering#getNumberName <em>Number Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Name</em>' attribute.
	 * @see #getNumberName()
	 * @generated
	 */
	void setNumberName(String value);

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
	 * @see hotel.HotelPackage#getRoomSurrendering_PricePerDay()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getPricePerDay();

	/**
	 * Sets the value of the '{@link hotel.RoomSurrendering#getPricePerDay <em>Price Per Day</em>}' attribute.
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
	 * @see hotel.HotelPackage#getRoomSurrendering_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link hotel.RoomSurrendering#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // RoomSurrendering
