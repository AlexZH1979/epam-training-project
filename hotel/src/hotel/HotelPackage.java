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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Room List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT__ROOM_LIST = 2;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.UserImpl
	 * @see hotel.impl.HotelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Password Hash Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD_HASH_CODE = 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GENDER = 5;

	/**
	 * The feature id for the '<em><b>Nick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NICK = 6;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLE = 7;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Room In Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__ROOM_IN_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__ID = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Confirmed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__CONFIRMED = 3;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__START_DATE = 5;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ORDER__END_DATE = 6;

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
	 * The meta object id for the '{@link hotel.impl.RoomSurrenderingImpl <em>Room Surrendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.RoomSurrenderingImpl
	 * @see hotel.impl.HotelPackageImpl#getRoomSurrendering()
	 * @generated
	 */
	int ROOM_SURRENDERING = 3;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Room Surrendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Room Surrendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SURRENDERING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.impl.OrderHistoryImpl <em>Order History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.impl.OrderHistoryImpl
	 * @see hotel.impl.HotelPackageImpl#getOrderHistory()
	 * @generated
	 */
	int ORDER_HISTORY = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HISTORY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HISTORY__ID = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HISTORY__ORDER = 2;

	/**
	 * The number of structural features of the '<em>Order History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HISTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Order History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hotel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.Gender
	 * @see hotel.impl.HotelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 5;

	/**
	 * The meta object id for the '{@link hotel.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hotel.Role
	 * @see hotel.impl.HotelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;


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
	 * Returns the meta object for class '{@link hotel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see hotel.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link hotel.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotel.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link hotel.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see hotel.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link hotel.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see hotel.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link hotel.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see hotel.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link hotel.User#getPasswordHashCode <em>Password Hash Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Hash Code</em>'.
	 * @see hotel.User#getPasswordHashCode()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_PasswordHashCode();

	/**
	 * Returns the meta object for the attribute '{@link hotel.User#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see hotel.User#getGender()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Gender();

	/**
	 * Returns the meta object for the attribute '{@link hotel.User#getNick <em>Nick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nick</em>'.
	 * @see hotel.User#getNick()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Nick();

	/**
	 * Returns the meta object for the attribute '{@link hotel.User#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see hotel.User#getRole()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Role();

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
	 * Returns the meta object for the reference '{@link hotel.RoomOrder#getRoomInOrder <em>Room In Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room In Order</em>'.
	 * @see hotel.RoomOrder#getRoomInOrder()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EReference getRoomOrder_RoomInOrder();

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
	 * Returns the meta object for the attribute '{@link hotel.RoomOrder#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see hotel.RoomOrder#getStartDate()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EAttribute getRoomOrder_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link hotel.RoomOrder#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see hotel.RoomOrder#getEndDate()
	 * @see #getRoomOrder()
	 * @generated
	 */
	EAttribute getRoomOrder_EndDate();

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
	 * Returns the meta object for the attribute '{@link hotel.RoomSurrendering#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hotel.RoomSurrendering#getDescription()
	 * @see #getRoomSurrendering()
	 * @generated
	 */
	EAttribute getRoomSurrendering_Description();

	/**
	 * Returns the meta object for class '{@link hotel.OrderHistory <em>Order History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order History</em>'.
	 * @see hotel.OrderHistory
	 * @generated
	 */
	EClass getOrderHistory();

	/**
	 * Returns the meta object for the attribute '{@link hotel.OrderHistory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hotel.OrderHistory#getDescription()
	 * @see #getOrderHistory()
	 * @generated
	 */
	EAttribute getOrderHistory_Description();

	/**
	 * Returns the meta object for the attribute '{@link hotel.OrderHistory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hotel.OrderHistory#getId()
	 * @see #getOrderHistory()
	 * @generated
	 */
	EAttribute getOrderHistory_Id();

	/**
	 * Returns the meta object for the reference '{@link hotel.OrderHistory#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see hotel.OrderHistory#getOrder()
	 * @see #getOrderHistory()
	 * @generated
	 */
	EReference getOrderHistory_Order();

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
	 * Returns the meta object for enum '{@link hotel.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see hotel.Role
	 * @generated
	 */
	EEnum getRole();

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
		 * The meta object literal for the '{@link hotel.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.UserImpl
		 * @see hotel.impl.HotelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Password Hash Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD_HASH_CODE = eINSTANCE.getUser_PasswordHashCode();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__GENDER = eINSTANCE.getUser_Gender();

		/**
		 * The meta object literal for the '<em><b>Nick</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NICK = eINSTANCE.getUser_Nick();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ROLE = eINSTANCE.getUser_Role();

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
		 * The meta object literal for the '<em><b>Room In Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ORDER__ROOM_IN_ORDER = eINSTANCE.getRoomOrder_RoomInOrder();

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
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ORDER__CUSTOMER = eINSTANCE.getRoomOrder_Customer();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ORDER__START_DATE = eINSTANCE.getRoomOrder_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ORDER__END_DATE = eINSTANCE.getRoomOrder_EndDate();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SURRENDERING__DESCRIPTION = eINSTANCE.getRoomSurrendering_Description();

		/**
		 * The meta object literal for the '{@link hotel.impl.OrderHistoryImpl <em>Order History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.impl.OrderHistoryImpl
		 * @see hotel.impl.HotelPackageImpl#getOrderHistory()
		 * @generated
		 */
		EClass ORDER_HISTORY = eINSTANCE.getOrderHistory();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HISTORY__DESCRIPTION = eINSTANCE.getOrderHistory_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_HISTORY__ID = eINSTANCE.getOrderHistory_Id();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_HISTORY__ORDER = eINSTANCE.getOrderHistory_Order();

		/**
		 * The meta object literal for the '{@link hotel.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.Gender
		 * @see hotel.impl.HotelPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link hotel.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hotel.Role
		 * @see hotel.impl.HotelPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //HotelPackage
