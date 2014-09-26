/**
 */
package hotel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hotel.HotelFactory
 * @model kind="package"
 * @generated
 */
public interface HotelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hotel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hotel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hotel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HotelPackage eINSTANCE = hotel.impl.HotelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hotel.impl.HotelUnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.HotelUnitImpl
	 * @see hotel.impl.HotelPackageImpl#getHotelUnit()
	 * @generated
	 */
	int HOTEL_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Room List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT__ROOM_LIST = 3;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.CustomerImpl
	 * @see hotel.impl.HotelPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Password Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PASSWORD_HASH_CODE = 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__GENDER = 5;

	/**
	 * The feature id for the '<em><b>Nick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NICK = 6;

	/**
	 * The feature id for the '<em><b>Room Order List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ROOM_ORDER_LIST = 7;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.impl.RoomOrderImpl <em>Room Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.RoomOrderImpl
	 * @see hotel.impl.HotelPackageImpl#getRoomOrder()
	 * @generated
	 */
	int ROOM_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Room In Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__ROOM_IN_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Date In Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__DATE_IN_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Administrator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__ADMINISTRATOR = 2;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__CUSTOMER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__ID = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__PRICE = 5;

	/**
	 * The feature id for the '<em><b>Confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__CONFIRMED = 6;

	/**
	 * The number of structural features of the '<em>Room Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Room Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.AdministratorImpl
	 * @see hotel.impl.HotelPackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Administrator Nick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__ADMINISTRATOR_NICK = 1;

	/**
	 * The feature id for the '<em><b>Password Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__PASSWORD_HASH_CODE = 2;

	/**
	 * The feature id for the '<em><b>Confirmed Order List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__CONFIRMED_ORDER_LIST = 3;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.impl.HotelAddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.HotelAddressImpl
	 * @see hotel.impl.HotelPackageImpl#getHotelAddress()
	 * @generated
	 */
	int HOTEL_ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADDRESS__ID = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADDRESS__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADDRESS__CITY = 2;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADDRESS__STREET = 3;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.impl.RoomSurrenderingImpl <em>Room Surrendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.RoomSurrenderingImpl
	 * @see hotel.impl.HotelPackageImpl#getRoomSurrendering()
	 * @generated
	 */
	int ROOM_SURRENDERING = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING__ID = 0;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING__HOTEL = 1;

	/**
	 * The feature id for the '<em><b>Number Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING__NUMBER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Price Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING__PRICE_PER_DAY = 3;

	/**
	 * The number of structural features of the '<em>Room Surrendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room Surrendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.impl.DateSurrenderingImpl <em>Date Surrendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.DateSurrenderingImpl
	 * @see hotel.impl.HotelPackageImpl#getDateSurrendering()
	 * @generated
	 */
	int DATE_SURRENDERING = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SURRENDERING__DATE = 0;

	/**
	 * The feature id for the '<em><b>Room Surrendering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SURRENDERING__ROOM_SURRENDERING = 1;

	/**
	 * The number of structural features of the '<em>Date Surrendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SURRENDERING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Surrendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SURRENDERING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.Country <em>Country</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.Country
	 * @see hotel.impl.HotelPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 7;

	/**
	 * The meta object id for the '{@link hotel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.Gender
	 * @see hotel.impl.HotelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 8;


	/**
	 * Returns the meta object for class '{@link hotel.HotelUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see hotel.HotelUnit
	 * @generated
	 */
	EClass getHotelUnit();

	/**
	 * Returns the meta object for the attribute '{@link hotel.HotelUnit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotel.HotelUnit#getId()
	 * @see #getHotelUnit()
	 * @generated
	 */
	EAttribute getHotelUnit_Id();

	/**
	 * Returns the meta object for the containment reference '{@link hotel.HotelUnit#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see hotel.HotelUnit#getAddress()
	 * @see #getHotelUnit()
	 * @generated
	 */
	EReference getHotelUnit_Address();

	/**
	 * Returns the meta object for the attribute '{@link hotel.HotelUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hotel.HotelUnit#getName()
	 * @see #getHotelUnit()
	 * @generated
	 */
	EAttribute getHotelUnit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hotel.HotelUnit#getRoomList <em>Room List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room List</em>'.
	 * @see hotel.HotelUnit#getRoomList()
	 * @see #getHotelUnit()
	 * @generated
	 */
	EReference getHotelUnit_RoomList();

	/**
	 * Returns the meta object for class '{@link hotel.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see hotel.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Customer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotel.Customer#getId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Customer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see hotel.Customer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Customer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see hotel.Customer#getLastName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LastName();

	/**
	 * Returns the meta object for the attribute list '{@link hotel.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Email</em>'.
	 * @see hotel.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Customer#getPasswordHashCode <em>Password Hash Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Hash Code</em>'.
	 * @see hotel.Customer#getPasswordHashCode()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PasswordHashCode();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Customer#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see hotel.Customer#getGender()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Gender();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Customer#getNick <em>Nick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nick</em>'.
	 * @see hotel.Customer#getNick()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Nick();

	/**
	 * Returns the meta object for the reference list '{@link hotel.Customer#getRoomOrderList <em>Room Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Order List</em>'.
	 * @see hotel.Customer#getRoomOrderList()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_RoomOrderList();

	/**
	 * Returns the meta object for class '{@link hotel.RoomOrder <em>Room Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Order</em>'.
	 * @see hotel.RoomOrder
	 * @generated
	 */
	EClass getRoomOrder();

	/**
	 * Returns the meta object for the reference list '{@link hotel.RoomOrder#getRoomInOrder <em>Room In Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room In Order</em>'.
	 * @see hotel.RoomOrder#getRoomInOrder()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EReference getRoomOrder_RoomInOrder();

	/**
	 * Returns the meta object for the reference list '{@link hotel.RoomOrder#getDateInOrder <em>Date In Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Date In Order</em>'.
	 * @see hotel.RoomOrder#getDateInOrder()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EReference getRoomOrder_DateInOrder();

	/**
	 * Returns the meta object for the reference '{@link hotel.RoomOrder#getAdministrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Administrator</em>'.
	 * @see hotel.RoomOrder#getAdministrator()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EReference getRoomOrder_Administrator();

	/**
	 * Returns the meta object for the reference '{@link hotel.RoomOrder#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see hotel.RoomOrder#getCustomer()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EReference getRoomOrder_Customer();

	/**
	 * Returns the meta object for the attribute '{@link hotel.RoomOrder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotel.RoomOrder#getId()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EAttribute getRoomOrder_Id();

	/**
	 * Returns the meta object for the attribute '{@link hotel.RoomOrder#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see hotel.RoomOrder#getPrice()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EAttribute getRoomOrder_Price();

	/**
	 * Returns the meta object for the attribute '{@link hotel.RoomOrder#isConfirmed <em>Confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmed</em>'.
	 * @see hotel.RoomOrder#isConfirmed()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EAttribute getRoomOrder_Confirmed();

	/**
	 * Returns the meta object for class '{@link hotel.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see hotel.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Administrator#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotel.Administrator#getId()
	 * @see #getAdministrator()
	 * @generated
	 */
	EAttribute getAdministrator_Id();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Administrator#getAdministratorNick <em>Administrator Nick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Administrator Nick</em>'.
	 * @see hotel.Administrator#getAdministratorNick()
	 * @see #getAdministrator()
	 * @generated
	 */
	EAttribute getAdministrator_AdministratorNick();

	/**
	 * Returns the meta object for the attribute '{@link hotel.Administrator#getPasswordHashCode <em>Password Hash Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Hash Code</em>'.
	 * @see hotel.Administrator#getPasswordHashCode()
	 * @see #getAdministrator()
	 * @generated
	 */
	EAttribute getAdministrator_PasswordHashCode();

	/**
	 * Returns the meta object for the reference list '{@link hotel.Administrator#getConfirmedOrderList <em>Confirmed Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Confirmed Order List</em>'.
	 * @see hotel.Administrator#getConfirmedOrderList()
	 * @see #getAdministrator()
	 * @generated
	 */
	EReference getAdministrator_ConfirmedOrderList();

	/**
	 * Returns the meta object for class '{@link hotel.HotelAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see hotel.HotelAddress
	 * @generated
	 */
	EClass getHotelAddress();

	/**
	 * Returns the meta object for the attribute '{@link hotel.HotelAddress#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotel.HotelAddress#getId()
	 * @see #getHotelAddress()
	 * @generated
	 */
	EAttribute getHotelAddress_Id();

	/**
	 * Returns the meta object for the attribute '{@link hotel.HotelAddress#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see hotel.HotelAddress#getCountry()
	 * @see #getHotelAddress()
	 * @generated
	 */
	EAttribute getHotelAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link hotel.HotelAddress#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see hotel.HotelAddress#getCity()
	 * @see #getHotelAddress()
	 * @generated
	 */
	EAttribute getHotelAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link hotel.HotelAddress#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see hotel.HotelAddress#getStreet()
	 * @see #getHotelAddress()
	 * @generated
	 */
	EAttribute getHotelAddress_Street();

	/**
	 * Returns the meta object for class '{@link hotel.RoomSurrendering <em>Room Surrendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Surrendering</em>'.
	 * @see hotel.RoomSurrendering
	 * @generated
	 */
	EClass getRoomSurrendering();

	/**
	 * Returns the meta object for the attribute '{@link hotel.RoomSurrendering#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotel.RoomSurrendering#getId()
	 * @see #getRoomSurrendering()
	 * @generated
	 */
	EAttribute getRoomSurrendering_Id();

	/**
	 * Returns the meta object for the container reference '{@link hotel.RoomSurrendering#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hotel</em>'.
	 * @see hotel.RoomSurrendering#getHotel()
	 * @see #getRoomSurrendering()
	 * @generated
	 */
	EReference getRoomSurrendering_Hotel();

	/**
	 * Returns the meta object for the attribute '{@link hotel.RoomSurrendering#getNumberName <em>Number Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Name</em>'.
	 * @see hotel.RoomSurrendering#getNumberName()
	 * @see #getRoomSurrendering()
	 * @generated
	 */
	EAttribute getRoomSurrendering_NumberName();

	/**
	 * Returns the meta object for the attribute '{@link hotel.RoomSurrendering#getPricePerDay <em>Price Per Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Day</em>'.
	 * @see hotel.RoomSurrendering#getPricePerDay()
	 * @see #getRoomSurrendering()
	 * @generated
	 */
	EAttribute getRoomSurrendering_PricePerDay();

	/**
	 * Returns the meta object for class '{@link hotel.DateSurrendering <em>Date Surrendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Surrendering</em>'.
	 * @see hotel.DateSurrendering
	 * @generated
	 */
	EClass getDateSurrendering();

	/**
	 * Returns the meta object for the attribute '{@link hotel.DateSurrendering#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see hotel.DateSurrendering#getDate()
	 * @see #getDateSurrendering()
	 * @generated
	 */
	EAttribute getDateSurrendering_Date();

	/**
	 * Returns the meta object for the reference list '{@link hotel.DateSurrendering#getRoomSurrendering <em>Room Surrendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Surrendering</em>'.
	 * @see hotel.DateSurrendering#getRoomSurrendering()
	 * @see #getDateSurrendering()
	 * @generated
	 */
	EReference getDateSurrendering_RoomSurrendering();

	/**
	 * Returns the meta object for enum '{@link hotel.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Country</em>'.
	 * @see hotel.Country
	 * @generated
	 */
	EEnum getCountry();

	/**
	 * Returns the meta object for enum '{@link hotel.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see hotel.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HotelFactory getHotelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hotel.impl.HotelUnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.HotelUnitImpl
		 * @see hotel.impl.HotelPackageImpl#getHotelUnit()
		 * @generated
		 */
		EClass HOTEL_UNIT = eINSTANCE.getHotelUnit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_UNIT__ID = eINSTANCE.getHotelUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_UNIT__ADDRESS = eINSTANCE.getHotelUnit_Address();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_UNIT__NAME = eINSTANCE.getHotelUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Room List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_UNIT__ROOM_LIST = eINSTANCE.getHotelUnit_RoomList();

		/**
		 * The meta object literal for the '{@link hotel.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.CustomerImpl
		 * @see hotel.impl.HotelPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Password Hash Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PASSWORD_HASH_CODE = eINSTANCE.getCustomer_PasswordHashCode();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__GENDER = eINSTANCE.getCustomer_Gender();

		/**
		 * The meta object literal for the '<em><b>Nick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NICK = eINSTANCE.getCustomer_Nick();

		/**
		 * The meta object literal for the '<em><b>Room Order List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ROOM_ORDER_LIST = eINSTANCE.getCustomer_RoomOrderList();

		/**
		 * The meta object literal for the '{@link hotel.impl.RoomOrderImpl <em>Room Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.RoomOrderImpl
		 * @see hotel.impl.HotelPackageImpl#getRoomOrder()
		 * @generated
		 */
		EClass ROOM_ORDER = eINSTANCE.getRoomOrder();

		/**
		 * The meta object literal for the '<em><b>Room In Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ORDER__ROOM_IN_ORDER = eINSTANCE.getRoomOrder_RoomInOrder();

		/**
		 * The meta object literal for the '<em><b>Date In Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ORDER__DATE_IN_ORDER = eINSTANCE.getRoomOrder_DateInOrder();

		/**
		 * The meta object literal for the '<em><b>Administrator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ORDER__ADMINISTRATOR = eINSTANCE.getRoomOrder_Administrator();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ORDER__CUSTOMER = eINSTANCE.getRoomOrder_Customer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ORDER__ID = eINSTANCE.getRoomOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ORDER__PRICE = eINSTANCE.getRoomOrder_Price();

		/**
		 * The meta object literal for the '<em><b>Confirmed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ORDER__CONFIRMED = eINSTANCE.getRoomOrder_Confirmed();

		/**
		 * The meta object literal for the '{@link hotel.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.AdministratorImpl
		 * @see hotel.impl.HotelPackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATOR__ID = eINSTANCE.getAdministrator_Id();

		/**
		 * The meta object literal for the '<em><b>Administrator Nick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATOR__ADMINISTRATOR_NICK = eINSTANCE.getAdministrator_AdministratorNick();

		/**
		 * The meta object literal for the '<em><b>Password Hash Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATOR__PASSWORD_HASH_CODE = eINSTANCE.getAdministrator_PasswordHashCode();

		/**
		 * The meta object literal for the '<em><b>Confirmed Order List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATOR__CONFIRMED_ORDER_LIST = eINSTANCE.getAdministrator_ConfirmedOrderList();

		/**
		 * The meta object literal for the '{@link hotel.impl.HotelAddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.HotelAddressImpl
		 * @see hotel.impl.HotelPackageImpl#getHotelAddress()
		 * @generated
		 */
		EClass HOTEL_ADDRESS = eINSTANCE.getHotelAddress();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ADDRESS__ID = eINSTANCE.getHotelAddress_Id();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ADDRESS__COUNTRY = eINSTANCE.getHotelAddress_Country();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ADDRESS__CITY = eINSTANCE.getHotelAddress_City();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ADDRESS__STREET = eINSTANCE.getHotelAddress_Street();

		/**
		 * The meta object literal for the '{@link hotel.impl.RoomSurrenderingImpl <em>Room Surrendering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.RoomSurrenderingImpl
		 * @see hotel.impl.HotelPackageImpl#getRoomSurrendering()
		 * @generated
		 */
		EClass ROOM_SURRENDERING = eINSTANCE.getRoomSurrendering();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SURRENDERING__ID = eINSTANCE.getRoomSurrendering_Id();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_SURRENDERING__HOTEL = eINSTANCE.getRoomSurrendering_Hotel();

		/**
		 * The meta object literal for the '<em><b>Number Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SURRENDERING__NUMBER_NAME = eINSTANCE.getRoomSurrendering_NumberName();

		/**
		 * The meta object literal for the '<em><b>Price Per Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SURRENDERING__PRICE_PER_DAY = eINSTANCE.getRoomSurrendering_PricePerDay();

		/**
		 * The meta object literal for the '{@link hotel.impl.DateSurrenderingImpl <em>Date Surrendering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.DateSurrenderingImpl
		 * @see hotel.impl.HotelPackageImpl#getDateSurrendering()
		 * @generated
		 */
		EClass DATE_SURRENDERING = eINSTANCE.getDateSurrendering();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_SURRENDERING__DATE = eINSTANCE.getDateSurrendering_Date();

		/**
		 * The meta object literal for the '<em><b>Room Surrendering</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_SURRENDERING__ROOM_SURRENDERING = eINSTANCE.getDateSurrendering_RoomSurrendering();

		/**
		 * The meta object literal for the '{@link hotel.Country <em>Country</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.Country
		 * @see hotel.impl.HotelPackageImpl#getCountry()
		 * @generated
		 */
		EEnum COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '{@link hotel.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.Gender
		 * @see hotel.impl.HotelPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

	}

} //HotelPackage
