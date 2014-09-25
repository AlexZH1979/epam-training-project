/**
 */
package hotel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link hotel.RoomOrder#getDateInOrder <em>Date In Order</em>}</li>
 *   <li>{@link hotel.RoomOrder#getAdministrator <em>Administrator</em>}</li>
 *   <li>{@link hotel.RoomOrder#getCustomer <em>Customer</em>}</li>
 *   <li>{@link hotel.RoomOrder#getId <em>Id</em>}</li>
 *   <li>{@link hotel.RoomOrder#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getRoomOrder()
 * @model
 * @generated
 */
public interface RoomOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Room In Order</b></em>' reference list.
	 * The list contents are of type {@link hotel.RoomSurrendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room In Order</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room In Order</em>' reference list.
	 * @see hotel.HotelPackage#getRoomOrder_RoomInOrder()
	 * @model required="true"
	 * @generated
	 */
	EList<RoomSurrendering> getRoomInOrder();

	/**
	 * Returns the value of the '<em><b>Date In Order</b></em>' reference list.
	 * The list contents are of type {@link hotel.DateSurrendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date In Order</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date In Order</em>' reference list.
	 * @see hotel.HotelPackage#getRoomOrder_DateInOrder()
	 * @model required="true"
	 * @generated
	 */
	EList<DateSurrendering> getDateInOrder();

	/**
	 * Returns the value of the '<em><b>Administrator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hotel.Administrator#getConfirmedOrderList <em>Confirmed Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrator</em>' reference.
	 * @see #setAdministrator(Administrator)
	 * @see hotel.HotelPackage#getRoomOrder_Administrator()
	 * @see hotel.Administrator#getConfirmedOrderList
	 * @model opposite="confirmedOrderList"
	 * @generated
	 */
	Administrator getAdministrator();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getAdministrator <em>Administrator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrator</em>' reference.
	 * @see #getAdministrator()
	 * @generated
	 */
	void setAdministrator(Administrator value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hotel.Customer#getRoomOrderList <em>Room Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see hotel.HotelPackage#getRoomOrder_Customer()
	 * @see hotel.Customer#getRoomOrderList
	 * @model opposite="roomOrderList" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see hotel.HotelPackage#getRoomOrder_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hotel.RoomOrder#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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

} // RoomOrder
