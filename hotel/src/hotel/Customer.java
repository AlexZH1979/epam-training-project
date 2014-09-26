/**
 */
package hotel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hotel.Customer#getId <em>Id</em>}</li>
 *   <li>{@link hotel.Customer#getFirstName <em>First Name</em>}</li>
 *   <li>{@link hotel.Customer#getLastName <em>Last Name</em>}</li>
 *   <li>{@link hotel.Customer#getEmail <em>Email</em>}</li>
 *   <li>{@link hotel.Customer#getPasswordHashCode <em>Password Hash Code</em>}</li>
 *   <li>{@link hotel.Customer#getGender <em>Gender</em>}</li>
 *   <li>{@link hotel.Customer#getNick <em>Nick</em>}</li>
 *   <li>{@link hotel.Customer#getRoomOrderList <em>Room Order List</em>}</li>
 * </ul>
 * </p>
 *
 * @see hotel.HotelPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
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
	 * @see hotel.HotelPackage#getCustomer_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hotel.Customer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see hotel.HotelPackage#getCustomer_FirstName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link hotel.Customer#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see hotel.HotelPackage#getCustomer_LastName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link hotel.Customer#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute list.
	 * @see hotel.HotelPackage#getCustomer_Email()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getEmail();

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
	 * @see hotel.HotelPackage#getCustomer_PasswordHashCode()
	 * @model unique="false" required="true"
	 * @generated
	 */
	int getPasswordHashCode();

	/**
	 * Sets the value of the '{@link hotel.Customer#getPasswordHashCode <em>Password Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Hash Code</em>' attribute.
	 * @see #getPasswordHashCode()
	 * @generated
	 */
	void setPasswordHashCode(int value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link hotel.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see hotel.Gender
	 * @see #setGender(Gender)
	 * @see hotel.HotelPackage#getCustomer_Gender()
	 * @model default="unknown"
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link hotel.Customer#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see hotel.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Nick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nick</em>' attribute.
	 * @see #setNick(String)
	 * @see hotel.HotelPackage#getCustomer_Nick()
	 * @model required="true"
	 * @generated
	 */
	String getNick();

	/**
	 * Sets the value of the '{@link hotel.Customer#getNick <em>Nick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nick</em>' attribute.
	 * @see #getNick()
	 * @generated
	 */
	void setNick(String value);

	/**
	 * Returns the value of the '<em><b>Room Order List</b></em>' reference list.
	 * The list contents are of type {@link hotel.RoomOrder}.
	 * It is bidirectional and its opposite is '{@link hotel.RoomOrder#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Order List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Order List</em>' reference list.
	 * @see hotel.HotelPackage#getCustomer_RoomOrderList()
	 * @see hotel.RoomOrder#getCustomer
	 * @model opposite="customer"
	 * @generated
	 */
	EList<RoomOrder> getRoomOrderList();

} // Customer
