/**
 */
package hotel.impl;

import hotel.HotelPackage;
import hotel.Room;
import hotel.RoomOrder;
import hotel.User;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotel.impl.RoomOrderImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#isConfirmed <em>Confirmed</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomOrderImpl extends MinimalEObjectImpl.Container implements RoomOrder {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

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
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConfirmed() <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFIRMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConfirmed() <em>Confirmed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConfirmed()
	 * @generated
	 * @ordered
	 */
	protected boolean confirmed = CONFIRMED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected User customer;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.ROOM_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.ROOM_ORDER__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__ROOM, oldRoom, room));
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
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HotelPackage.ROOM_ORDER__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConfirmed() {
		return confirmed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmed(boolean newConfirmed) {
		boolean oldConfirmed = confirmed;
		confirmed = newConfirmed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__CONFIRMED, oldConfirmed, confirmed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (User)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.ROOM_ORDER__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(User newCustomer) {
		User oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.ROOM_ORDER__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case HotelPackage.ROOM_ORDER__ID:
				return getId();
			case HotelPackage.ROOM_ORDER__PRICE:
				return getPrice();
			case HotelPackage.ROOM_ORDER__CONFIRMED:
				return isConfirmed();
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case HotelPackage.ROOM_ORDER__START_DATE:
				return getStartDate();
			case HotelPackage.ROOM_ORDER__END_DATE:
				return getEndDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelPackage.ROOM_ORDER__ROOM:
				setRoom((Room)newValue);
				return;
			case HotelPackage.ROOM_ORDER__ID:
				setId((Integer)newValue);
				return;
			case HotelPackage.ROOM_ORDER__PRICE:
				setPrice((Integer)newValue);
				return;
			case HotelPackage.ROOM_ORDER__CONFIRMED:
				setConfirmed((Boolean)newValue);
				return;
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				setCustomer((User)newValue);
				return;
			case HotelPackage.ROOM_ORDER__START_DATE:
				setStartDate((Date)newValue);
				return;
			case HotelPackage.ROOM_ORDER__END_DATE:
				setEndDate((Date)newValue);
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
			case HotelPackage.ROOM_ORDER__ROOM:
				setRoom((Room)null);
				return;
			case HotelPackage.ROOM_ORDER__ID:
				unsetId();
				return;
			case HotelPackage.ROOM_ORDER__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case HotelPackage.ROOM_ORDER__CONFIRMED:
				setConfirmed(CONFIRMED_EDEFAULT);
				return;
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				setCustomer((User)null);
				return;
			case HotelPackage.ROOM_ORDER__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case HotelPackage.ROOM_ORDER__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case HotelPackage.ROOM_ORDER__ROOM:
				return room != null;
			case HotelPackage.ROOM_ORDER__ID:
				return isSetId();
			case HotelPackage.ROOM_ORDER__PRICE:
				return price != PRICE_EDEFAULT;
			case HotelPackage.ROOM_ORDER__CONFIRMED:
				return confirmed != CONFIRMED_EDEFAULT;
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				return customer != null;
			case HotelPackage.ROOM_ORDER__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case HotelPackage.ROOM_ORDER__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", price: ");
		result.append(price);
		result.append(", confirmed: ");
		result.append(confirmed);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //RoomOrderImpl
