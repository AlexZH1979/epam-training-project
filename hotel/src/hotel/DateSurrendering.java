/**
 */
package hotel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Surrendering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotel.DateSurrendering#getDate <em>Date</em>}</li>
 *   <li>{@link hotel.DateSurrendering#getRoomSurrendering <em>Room Surrendering</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getDateSurrendering()
 * @model
 * @generated
 */
public interface DateSurrendering extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see hotel.HotelPackage#getDateSurrendering_Date()
	 * @model id="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link hotel.DateSurrendering#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Room Surrendering</b></em>' reference list.
	 * The list contents are of type {@link hotel.RoomSurrendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Surrendering</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Surrendering</em>' reference list.
	 * @see hotel.HotelPackage#getDateSurrendering_RoomSurrendering()
	 * @model
	 * @generated
	 */
	EList<RoomSurrendering> getRoomSurrendering();

} // DateSurrendering
