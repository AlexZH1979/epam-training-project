/**
 */
package hotel.impl;

import hotel.Administrator;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotel.impl.AdministratorImpl#getId <em>Id</em>}</li>
 *   <li>{@link hotel.impl.AdministratorImpl#getAdministratorNick <em>Administrator Nick</em>}</li>
 *   <li>{@link hotel.impl.AdministratorImpl#getPasswordHashCode <em>Password Hash Code</em>}</li>
 *   <li>{@link hotel.impl.AdministratorImpl#getConfirmedOrderList <em>Confirmed Order List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdministratorImpl extends MinimalEObjectImpl.Container implements Administrator {
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
	 * The default value of the '{@link #getAdministratorNick() <em>Administrator Nick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministratorNick()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMINISTRATOR_NICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdministratorNick() <em>Administrator Nick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministratorNick()
	 * @generated
	 * @ordered
	 */
	protected String administratorNick = ADMINISTRATOR_NICK_EDEFAULT;

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
	 * The cached value of the '{@link #getConfirmedOrderList() <em>Confirmed Order List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedOrderList()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomOrder> confirmedOrderList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackage.Literals.ADMINISTRATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ADMINISTRATOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdministratorNick() {
		return administratorNick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministratorNick(String newAdministratorNick) {
		String oldAdministratorNick = administratorNick;
		administratorNick = newAdministratorNick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ADMINISTRATOR__ADMINISTRATOR_NICK, oldAdministratorNick, administratorNick));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ADMINISTRATOR__PASSWORD_HASH_CODE, oldPasswordHashCode, passwordHashCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomOrder> getConfirmedOrderList() {
		if (confirmedOrderList == null) {
			confirmedOrderList = new EObjectWithInverseResolvingEList<RoomOrder>(RoomOrder.class, this, HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST, HotelPackage.ROOM_ORDER__ADMINISTRATOR);
		}
		return confirmedOrderList;
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
			case HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfirmedOrderList()).basicAdd(otherEnd, msgs);
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
			case HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST:
				return ((InternalEList<?>)getConfirmedOrderList()).basicRemove(otherEnd, msgs);
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
			case HotelPackage.ADMINISTRATOR__ID:
				return getId();
			case HotelPackage.ADMINISTRATOR__ADMINISTRATOR_NICK:
				return getAdministratorNick();
			case HotelPackage.ADMINISTRATOR__PASSWORD_HASH_CODE:
				return getPasswordHashCode();
			case HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST:
				return getConfirmedOrderList();
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
			case HotelPackage.ADMINISTRATOR__ID:
				setId((Integer)newValue);
				return;
			case HotelPackage.ADMINISTRATOR__ADMINISTRATOR_NICK:
				setAdministratorNick((String)newValue);
				return;
			case HotelPackage.ADMINISTRATOR__PASSWORD_HASH_CODE:
				setPasswordHashCode((Integer)newValue);
				return;
			case HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST:
				getConfirmedOrderList().clear();
				getConfirmedOrderList().addAll((Collection<? extends RoomOrder>)newValue);
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
			case HotelPackage.ADMINISTRATOR__ID:
				setId(ID_EDEFAULT);
				return;
			case HotelPackage.ADMINISTRATOR__ADMINISTRATOR_NICK:
				setAdministratorNick(ADMINISTRATOR_NICK_EDEFAULT);
				return;
			case HotelPackage.ADMINISTRATOR__PASSWORD_HASH_CODE:
				setPasswordHashCode(PASSWORD_HASH_CODE_EDEFAULT);
				return;
			case HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST:
				getConfirmedOrderList().clear();
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
			case HotelPackage.ADMINISTRATOR__ID:
				return id != ID_EDEFAULT;
			case HotelPackage.ADMINISTRATOR__ADMINISTRATOR_NICK:
				return ADMINISTRATOR_NICK_EDEFAULT == null ? administratorNick != null : !ADMINISTRATOR_NICK_EDEFAULT.equals(administratorNick);
			case HotelPackage.ADMINISTRATOR__PASSWORD_HASH_CODE:
				return passwordHashCode != PASSWORD_HASH_CODE_EDEFAULT;
			case HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST:
				return confirmedOrderList != null && !confirmedOrderList.isEmpty();
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
		result.append(", administratorNick: ");
		result.append(administratorNick);
		result.append(", passwordHashCode: ");
		result.append(passwordHashCode);
		result.append(')');
		return result.toString();
	}

} //AdministratorImpl
