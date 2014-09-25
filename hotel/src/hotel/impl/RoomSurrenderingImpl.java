/**
 */
package hotel.impl;

import hotel.HotelPackage;
import hotel.HotelUnit;
import hotel.RoomSurrendering;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Surrendering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotel.impl.RoomSurrenderingImpl#getId <em>Id</em>}</li>
 *   <li>{@link hotel.impl.RoomSurrenderingImpl#getHotel <em>Hotel</em>}</li>
 *   <li>{@link hotel.impl.RoomSurrenderingImpl#getNumberName <em>Number Name</em>}</li>
 *   <li>{@link hotel.impl.RoomSurrenderingImpl#getPricePerDay <em>Price Per Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomSurrenderingImpl extends MinimalEObjectImpl.Container implements RoomSurrendering {
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
	 * The default value of the '{@link #getNumberName() <em>Number Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberName()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberName() <em>Number Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberName()
	 * @generated
	 * @ordered
	 */
	protected String numberName = NUMBER_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomSurrenderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.ROOM_SURRENDERING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_SURRENDERING__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, HotelPackage.ROOM_SURRENDERING__ID, oldId, ID_EDEFAULT, oldIdESet));
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
		if (eContainerFeatureID() != HotelPackage.ROOM_SURRENDERING__HOTEL) return null;
		return (HotelUnit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHotel(HotelUnit newHotel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHotel, HotelPackage.ROOM_SURRENDERING__HOTEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotel(HotelUnit newHotel) {
		if (newHotel != eInternalContainer() || (eContainerFeatureID() != HotelPackage.ROOM_SURRENDERING__HOTEL && newHotel != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_SURRENDERING__HOTEL, newHotel, newHotel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumberName() {
		return numberName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberName(String newNumberName) {
		String oldNumberName = numberName;
		numberName = newNumberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_SURRENDERING__NUMBER_NAME, oldNumberName, numberName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_SURRENDERING__PRICE_PER_DAY, oldPricePerDay, pricePerDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HotelPackage.ROOM_SURRENDERING__HOTEL:
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
			case HotelPackage.ROOM_SURRENDERING__HOTEL:
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
			case HotelPackage.ROOM_SURRENDERING__HOTEL:
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
			case HotelPackage.ROOM_SURRENDERING__ID:
				return getId();
			case HotelPackage.ROOM_SURRENDERING__HOTEL:
				return getHotel();
			case HotelPackage.ROOM_SURRENDERING__NUMBER_NAME:
				return getNumberName();
			case HotelPackage.ROOM_SURRENDERING__PRICE_PER_DAY:
				return getPricePerDay();
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
			case HotelPackage.ROOM_SURRENDERING__ID:
				setId((Integer)newValue);
				return;
			case HotelPackage.ROOM_SURRENDERING__HOTEL:
				setHotel((HotelUnit)newValue);
				return;
			case HotelPackage.ROOM_SURRENDERING__NUMBER_NAME:
				setNumberName((String)newValue);
				return;
			case HotelPackage.ROOM_SURRENDERING__PRICE_PER_DAY:
				setPricePerDay((Integer)newValue);
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
			case HotelPackage.ROOM_SURRENDERING__ID:
				unsetId();
				return;
			case HotelPackage.ROOM_SURRENDERING__HOTEL:
				setHotel((HotelUnit)null);
				return;
			case HotelPackage.ROOM_SURRENDERING__NUMBER_NAME:
				setNumberName(NUMBER_NAME_EDEFAULT);
				return;
			case HotelPackage.ROOM_SURRENDERING__PRICE_PER_DAY:
				setPricePerDay(PRICE_PER_DAY_EDEFAULT);
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
			case HotelPackage.ROOM_SURRENDERING__ID:
				return isSetId();
			case HotelPackage.ROOM_SURRENDERING__HOTEL:
				return getHotel() != null;
			case HotelPackage.ROOM_SURRENDERING__NUMBER_NAME:
				return NUMBER_NAME_EDEFAULT == null ? numberName != null : !NUMBER_NAME_EDEFAULT.equals(numberName);
			case HotelPackage.ROOM_SURRENDERING__PRICE_PER_DAY:
				return pricePerDay != PRICE_PER_DAY_EDEFAULT;
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
		result.append(", numberName: ");
		result.append(numberName);
		result.append(", pricePerDay: ");
		result.append(pricePerDay);
		result.append(')');
		return result.toString();
	}

} //RoomSurrenderingImpl
