/**
 */
package hotel.impl;

import hotel.Customer;
import hotel.Gender;
import hotel.HotelPackage;
import hotel.RoomOrder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotel.impl.CustomerImpl#getId <em>Id</em>}</li>
 *   <li>{@link hotel.impl.CustomerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link hotel.impl.CustomerImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link hotel.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link hotel.impl.CustomerImpl#getPasswordHashCode <em>Password Hash Code</em>}</li>
 *   <li>{@link hotel.impl.CustomerImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link hotel.impl.CustomerImpl#getNick <em>Nick</em>}</li>
 *   <li>{@link hotel.impl.CustomerImpl#getRoomOrderList <em>Room Order List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected EList<String> email;

	/**
	 * The default value of the '{@link #getPasswordHashCode() <em>Password Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordHashCode()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSWORD_HASH_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPasswordHashCode() <em>Password Hash Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordHashCode()
	 * @generated
	 * @ordered
	 */
	protected int passwordHashCode = PASSWORD_HASH_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.UNKNOWN;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNick() <em>Nick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNick()
	 * @generated
	 * @ordered
	 */
	protected static final String NICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNick() <em>Nick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNick()
	 * @generated
	 * @ordered
	 */
	protected String nick = NICK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomOrderList() <em>Room Order List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomOrderList()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomOrder> roomOrderList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.CUSTOMER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.CUSTOMER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.CUSTOMER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmail() {
		if (email == null) {
			email = new EDataTypeUniqueEList<String>(String.class, this, HotelPackage.CUSTOMER__EMAIL);
		}
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPasswordHashCode() {
		return passwordHashCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordHashCode(int newPasswordHashCode) {
		int oldPasswordHashCode = passwordHashCode;
		passwordHashCode = newPasswordHashCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.CUSTOMER__PASSWORD_HASH_CODE, oldPasswordHashCode, passwordHashCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.CUSTOMER__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNick(String newNick) {
		String oldNick = nick;
		nick = newNick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.CUSTOMER__NICK, oldNick, nick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomOrder> getRoomOrderList() {
		if (roomOrderList == null) {
			roomOrderList = new EObjectWithInverseResolvingEList<RoomOrder>(RoomOrder.class, this, HotelPackage.CUSTOMER__ROOM_ORDER_LIST, HotelPackage.ROOM_ORDER__CUSTOMER);
		}
		return roomOrderList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HotelPackage.CUSTOMER__ROOM_ORDER_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoomOrderList()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HotelPackage.CUSTOMER__ROOM_ORDER_LIST:
				return ((InternalEList<?>)getRoomOrderList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.CUSTOMER__ID:
				return getId();
			case HotelPackage.CUSTOMER__FIRST_NAME:
				return getFirstName();
			case HotelPackage.CUSTOMER__LAST_NAME:
				return getLastName();
			case HotelPackage.CUSTOMER__EMAIL:
				return getEmail();
			case HotelPackage.CUSTOMER__PASSWORD_HASH_CODE:
				return getPasswordHashCode();
			case HotelPackage.CUSTOMER__GENDER:
				return getGender();
			case HotelPackage.CUSTOMER__NICK:
				return getNick();
			case HotelPackage.CUSTOMER__ROOM_ORDER_LIST:
				return getRoomOrderList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelPackage.CUSTOMER__ID:
				setId((Integer)newValue);
				return;
			case HotelPackage.CUSTOMER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case HotelPackage.CUSTOMER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case HotelPackage.CUSTOMER__EMAIL:
				getEmail().clear();
				getEmail().addAll((Collection<? extends String>)newValue);
				return;
			case HotelPackage.CUSTOMER__PASSWORD_HASH_CODE:
				setPasswordHashCode((Integer)newValue);
				return;
			case HotelPackage.CUSTOMER__GENDER:
				setGender((Gender)newValue);
				return;
			case HotelPackage.CUSTOMER__NICK:
				setNick((String)newValue);
				return;
			case HotelPackage.CUSTOMER__ROOM_ORDER_LIST:
				getRoomOrderList().clear();
				getRoomOrderList().addAll((Collection<? extends RoomOrder>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HotelPackage.CUSTOMER__ID:
				setId(ID_EDEFAULT);
				return;
			case HotelPackage.CUSTOMER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case HotelPackage.CUSTOMER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case HotelPackage.CUSTOMER__EMAIL:
				getEmail().clear();
				return;
			case HotelPackage.CUSTOMER__PASSWORD_HASH_CODE:
				setPasswordHashCode(PASSWORD_HASH_CODE_EDEFAULT);
				return;
			case HotelPackage.CUSTOMER__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case HotelPackage.CUSTOMER__NICK:
				setNick(NICK_EDEFAULT);
				return;
			case HotelPackage.CUSTOMER__ROOM_ORDER_LIST:
				getRoomOrderList().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HotelPackage.CUSTOMER__ID:
				return id != ID_EDEFAULT;
			case HotelPackage.CUSTOMER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case HotelPackage.CUSTOMER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case HotelPackage.CUSTOMER__EMAIL:
				return email != null && !email.isEmpty();
			case HotelPackage.CUSTOMER__PASSWORD_HASH_CODE:
				return passwordHashCode != PASSWORD_HASH_CODE_EDEFAULT;
			case HotelPackage.CUSTOMER__GENDER:
				return gender != GENDER_EDEFAULT;
			case HotelPackage.CUSTOMER__NICK:
				return NICK_EDEFAULT == null ? nick != null : !NICK_EDEFAULT.equals(nick);
			case HotelPackage.CUSTOMER__ROOM_ORDER_LIST:
				return roomOrderList != null && !roomOrderList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", email: ");
		result.append(email);
		result.append(", passwordHashCode: ");
		result.append(passwordHashCode);
		result.append(", gender: ");
		result.append(gender);
		result.append(", nick: ");
		result.append(nick);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
