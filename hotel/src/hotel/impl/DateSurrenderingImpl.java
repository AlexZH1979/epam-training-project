/**
 */
package hotel.impl;

import hotel.DateSurrendering;
import hotel.HotelPackage;
import hotel.RoomSurrendering;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Surrendering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotel.impl.DateSurrenderingImpl#getDate <em>Date</em>}</li>
 *   <li>{@link hotel.impl.DateSurrenderingImpl#getRoomSurrendering <em>Room Surrendering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateSurrenderingImpl extends MinimalEObjectImpl.Container implements DateSurrendering {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomSurrendering() <em>Room Surrendering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomSurrendering()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomSurrendering> roomSurrendering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateSurrenderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.DATE_SURRENDERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.DATE_SURRENDERING__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomSurrendering> getRoomSurrendering() {
		if (roomSurrendering == null) {
			roomSurrendering = new EObjectResolvingEList<RoomSurrendering>(RoomSurrendering.class, this, HotelPackage.DATE_SURRENDERING__ROOM_SURRENDERING);
		}
		return roomSurrendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackage.DATE_SURRENDERING__DATE:
				return getDate();
			case HotelPackage.DATE_SURRENDERING__ROOM_SURRENDERING:
				return getRoomSurrendering();
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
			case HotelPackage.DATE_SURRENDERING__DATE:
				setDate((Date)newValue);
				return;
			case HotelPackage.DATE_SURRENDERING__ROOM_SURRENDERING:
				getRoomSurrendering().clear();
				getRoomSurrendering().addAll((Collection<? extends RoomSurrendering>)newValue);
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
			case HotelPackage.DATE_SURRENDERING__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case HotelPackage.DATE_SURRENDERING__ROOM_SURRENDERING:
				getRoomSurrendering().clear();
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
			case HotelPackage.DATE_SURRENDERING__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case HotelPackage.DATE_SURRENDERING__ROOM_SURRENDERING:
				return roomSurrendering != null && !roomSurrendering.isEmpty();
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
		result.append(" (date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //DateSurrenderingImpl
