/**
 */
package hotel.impl;

import hotel.HotelPackage;
import hotel.HotelUnit;
import hotel.Room;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotel.impl.RoomImpl#getId <em>Id</em>}</li>
 *   <li>{@link hotel.impl.RoomImpl#getHotel <em>Hotel</em>}</li>
 *   <li>{@link hotel.impl.RoomImpl#getRoomName <em>Room Name</em>}</li>
 *   <li>{@link hotel.impl.RoomImpl#getPricePerDay <em>Price Per Day</em>}</li>
 *   <li>{@link hotel.impl.RoomImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link hotel.impl.RoomImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
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
	 * The default value of the '{@link #getRoomName() <em>Room Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomName() <em>Room Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomName()
	 * @generated
	 * @ordered
	 */
	protected String roomName = ROOM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPricePerDay() <em>Price Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerDay()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_PER_DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPricePerDay() <em>Price Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerDay()
	 * @generated
	 * @ordered
	 */
	protected int pricePerDay = PRICE_PER_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final byte SIZE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected byte size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.ROOM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, HotelPackage.ROOM__ID, oldId, ID_EDEFAULT, oldIdESet));
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
	public HotelUnit getHotel() {
		if (eContainerFeatureID() != HotelPackage.ROOM__HOTEL) return null;
		return (HotelUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHotel(HotelUnit newHotel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHotel, HotelPackage.ROOM__HOTEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotel(HotelUnit newHotel) {
		if (newHotel != eInternalContainer() || (eContainerFeatureID() != HotelPackage.ROOM__HOTEL && newHotel != null)) {
			if (EcoreUtil.isAncestor(this, newHotel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHotel != null)
				msgs = ((InternalEObject)newHotel).eInverseAdd(this, HotelPackage.HOTEL_UNIT__ROOM_LIST, HotelUnit.class, msgs);
			msgs = basicSetHotel(newHotel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM__HOTEL, newHotel, newHotel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomName(String newRoomName) {
		String oldRoomName = roomName;
		roomName = newRoomName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM__ROOM_NAME, oldRoomName, roomName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPricePerDay() {
		return pricePerDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricePerDay(int newPricePerDay) {
		int oldPricePerDay = pricePerDay;
		pricePerDay = newPricePerDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM__PRICE_PER_DAY, oldPricePerDay, pricePerDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(byte newSize) {
		byte oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HotelPackage.ROOM__HOTEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHotel((HotelUnit)otherEnd, msgs);
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
			case HotelPackage.ROOM__HOTEL:
				return basicSetHotel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HotelPackage.ROOM__HOTEL:
				return eInternalContainer().eInverseRemove(this, HotelPackage.HOTEL_UNIT__ROOM_LIST, HotelUnit.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.ROOM__ID:
				return getId();
			case HotelPackage.ROOM__HOTEL:
				return getHotel();
			case HotelPackage.ROOM__ROOM_NAME:
				return getRoomName();
			case HotelPackage.ROOM__PRICE_PER_DAY:
				return getPricePerDay();
			case HotelPackage.ROOM__DESCRIPTION:
				return getDescription();
			case HotelPackage.ROOM__SIZE:
				return getSize();
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
			case HotelPackage.ROOM__ID:
				setId((Integer)newValue);
				return;
			case HotelPackage.ROOM__HOTEL:
				setHotel((HotelUnit)newValue);
				return;
			case HotelPackage.ROOM__ROOM_NAME:
				setRoomName((String)newValue);
				return;
			case HotelPackage.ROOM__PRICE_PER_DAY:
				setPricePerDay((Integer)newValue);
				return;
			case HotelPackage.ROOM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case HotelPackage.ROOM__SIZE:
				setSize((Byte)newValue);
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
			case HotelPackage.ROOM__ID:
				unsetId();
				return;
			case HotelPackage.ROOM__HOTEL:
				setHotel((HotelUnit)null);
				return;
			case HotelPackage.ROOM__ROOM_NAME:
				setRoomName(ROOM_NAME_EDEFAULT);
				return;
			case HotelPackage.ROOM__PRICE_PER_DAY:
				setPricePerDay(PRICE_PER_DAY_EDEFAULT);
				return;
			case HotelPackage.ROOM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case HotelPackage.ROOM__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case HotelPackage.ROOM__ID:
				return isSetId();
			case HotelPackage.ROOM__HOTEL:
				return getHotel() != null;
			case HotelPackage.ROOM__ROOM_NAME:
				return ROOM_NAME_EDEFAULT == null ? roomName != null : !ROOM_NAME_EDEFAULT.equals(roomName);
			case HotelPackage.ROOM__PRICE_PER_DAY:
				return pricePerDay != PRICE_PER_DAY_EDEFAULT;
			case HotelPackage.ROOM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case HotelPackage.ROOM__SIZE:
				return size != SIZE_EDEFAULT;
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
		result.append(", roomName: ");
		result.append(roomName);
		result.append(", pricePerDay: ");
		result.append(pricePerDay);
		result.append(", description: ");
		result.append(description);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
