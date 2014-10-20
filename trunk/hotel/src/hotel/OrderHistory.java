/**
 */
package hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotel.OrderHistory#getId <em>Id</em>}</li>
 *   <li>{@link hotel.OrderHistory#getOrder <em>Order</em>}</li>
 *   <li>{@link hotel.OrderHistory#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getOrderHistory()
 * @model
 * @generated
 */
public interface OrderHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see hotel.HotelPackage#getOrderHistory_Id()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link hotel.OrderHistory#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(RoomOrder)
	 * @see hotel.HotelPackage#getOrderHistory_Order()
	 * @model required="true"
	 * @generated
	 */
	RoomOrder getOrder();

	/**
	 * Sets the value of the '{@link hotel.OrderHistory#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(RoomOrder value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link hotel.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see hotel.HotelPackage#getOrderHistory_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

} // OrderHistory
