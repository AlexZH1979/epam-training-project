/**
 */
package hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotel.Administrator#getId <em>Id</em>}</li>
 *   <li>{@link hotel.Administrator#getAdministratorNick <em>Administrator Nick</em>}</li>
 *   <li>{@link hotel.Administrator#getPasswordHashCode <em>Password Hash Code</em>}</li>
 *   <li>{@link hotel.Administrator#getConfirmedOrderList <em>Confirmed Order List</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getAdministrator()
 * @model
 * @generated
 */
public interface Administrator extends EObject {
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
	 * @see hotel.HotelPackage#getAdministrator_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hotel.Administrator#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Administrator Nick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrator Nick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrator Nick</em>' attribute.
	 * @see #setAdministratorNick(String)
	 * @see hotel.HotelPackage#getAdministrator_AdministratorNick()
	 * @model required="true"
	 * @generated
	 */
	String getAdministratorNick();

	/**
	 * Sets the value of the '{@link hotel.Administrator#getAdministratorNick <em>Administrator Nick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrator Nick</em>' attribute.
	 * @see #getAdministratorNick()
	 * @generated
	 */
	void setAdministratorNick(String value);

	/**
	 * Returns the value of the '<em><b>Password Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password Hash Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Hash Code</em>' attribute.
	 * @see #setPasswordHashCode(int)
	 * @see hotel.HotelPackage#getAdministrator_PasswordHashCode()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getPasswordHashCode();

	/**
	 * Sets the value of the '{@link hotel.Administrator#getPasswordHashCode <em>Password Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Hash Code</em>' attribute.
	 * @see #getPasswordHashCode()
	 * @generated
	 */
	void setPasswordHashCode(int value);

	/**
	 * Returns the value of the '<em><b>Confirmed Order List</b></em>' reference list.
	 * The list contents are of type {@link hotel.RoomOrder}.
	 * It is bidirectional and its opposite is '{@link hotel.RoomOrder#getAdministrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmed Order List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmed Order List</em>' reference list.
	 * @see hotel.HotelPackage#getAdministrator_ConfirmedOrderList()
	 * @see hotel.RoomOrder#getAdministrator
	 * @model opposite="administrator"
	 * @generated
	 */
	EList<RoomOrder> getConfirmedOrderList();

} // Administrator
