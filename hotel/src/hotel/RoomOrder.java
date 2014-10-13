/**
 */
package hotel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotel.RoomOrder#getRoomInOrder <em>Room In Order</em>}</li>
 *   <li>{@link hotel.RoomOrder#getId <em>Id</em>}</li>
 *   <li>{@link hotel.RoomOrder#getPrice <em>Price</em>}</li>
 *   <li>{@link hotel.RoomOrder#isConfirmed <em>Confirmed</em>}</li>
 *   <li>{@link hotel.RoomOrder#getCustomer <em>Customer</em>}</li>
 *   <li>{@link hotel.RoomOrder#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link hotel.RoomOrder#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getRoomOrder()
 * @model
 * @generated
 */
public interface RoomOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Room In Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room In Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room In Order</em>' reference.
	 * @see #setRoomInOrder(RoomSurrendering)
	 * @see hotel.HotelPackage#getRoomOrder_RoomInOrder()
	 * @model required="true"
	 * @generated
	 */
	RoomSurrendering getRoomInOrder();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getRoomInOrder <em>Room In Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room In Order</em>' reference.
	 * @see #getRoomInOrder()
	 * @generated
	 */
	void setRoomInOrder(RoomSurrendering value);

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
	 * @see hotel.HotelPackage#getRoomOrder_Id()
	 * @model unsettable="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getId <em>Id</em>}' attribute.
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
	 * Unsets the value of the '{@link hotel.RoomOrder#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link hotel.RoomOrder#getId <em>Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see hotel.HotelPackage#getRoomOrder_Price()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Confirmed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmed</em>' attribute.
	 * @see #setConfirmed(boolean)
	 * @see hotel.HotelPackage#getRoomOrder_Confirmed()
	 * @model default="false" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isConfirmed();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#isConfirmed <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmed</em>' attribute.
	 * @see #isConfirmed()
	 * @generated
	 */
	void setConfirmed(boolean value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(User)
	 * @see hotel.HotelPackage#getRoomOrder_Customer()
	 * @model required="true"
	 * @generated
	 */
	User getCustomer();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(User value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see hotel.HotelPackage#getRoomOrder_StartDate()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see hotel.HotelPackage#getRoomOrder_EndDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

} // RoomOrder
