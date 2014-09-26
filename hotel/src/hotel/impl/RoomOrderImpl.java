/**
 */
package hotel.impl;

import hotel.Administrator;
import hotel.Customer;
import hotel.DateSurrendering;
import hotel.HotelPackage;
import hotel.RoomOrder;
import hotel.RoomSurrendering;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hotel.impl.RoomOrderImpl#getRoomInOrder <em>Room In Order</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getDateInOrder <em>Date In Order</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getAdministrator <em>Administrator</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link hotel.impl.RoomOrderImpl#isConfirmed <em>Confirmed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomOrderImpl extends MinimalEObjectImpl.Container implements RoomOrder {
	/**
	 * The cached value of the '{@link #getRoomInOrder() <em>Room In Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomInOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomSurrendering> roomInOrder;

	/**
	 * The cached value of the '{@link #getDateInOrder() <em>Date In Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateInOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<DateSurrendering> dateInOrder;

	/**
	 * The cached value of the '{@link #getAdministrator() <em>Administrator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrator()
	 * @generated
	 * @ordered
	 */
	protected Administrator administrator;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

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
	public EList<RoomSurrendering> getRoomInOrder() {
		if (roomInOrder == null) {
			roomInOrder = new EObjectResolvingEList<RoomSurrendering>(RoomSurrendering.class, this, HotelPackage.ROOM_ORDER__ROOM_IN_ORDER);
		}
		return roomInOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateSurrendering> getDateInOrder() {
		if (dateInOrder == null) {
			dateInOrder = new EObjectResolvingEList<DateSurrendering>(DateSurrendering.class, this, HotelPackage.ROOM_ORDER__DATE_IN_ORDER);
		}
		return dateInOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administrator getAdministrator() {
		if (administrator != null && administrator.eIsProxy()) {
			InternalEObject oldAdministrator = (InternalEObject)administrator;
			administrator = (Administrator)eResolveProxy(oldAdministrator);
			if (administrator != oldAdministrator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelPackage.ROOM_ORDER__ADMINISTRATOR, oldAdministrator, administrator));
			}
		}
		return administrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administrator basicGetAdministrator() {
		return administrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrator(Administrator newAdministrator, NotificationChain msgs) {
		Administrator oldAdministrator = administrator;
		administrator = newAdministrator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__ADMINISTRATOR, oldAdministrator, newAdministrator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrator(Administrator newAdministrator) {
		if (newAdministrator != administrator) {
			NotificationChain msgs = null;
			if (administrator != null)
				msgs = ((InternalEObject)administrator).eInverseRemove(this, HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST, Administrator.class, msgs);
			if (newAdministrator != null)
				msgs = ((InternalEObject)newAdministrator).eInverseAdd(this, HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST, Administrator.class, msgs);
			msgs = basicSetAdministrator(newAdministrator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__ADMINISTRATOR, newAdministrator, newAdministrator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
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
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__CUSTOMER, oldCustomer, newCustomer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject)customer).eInverseRemove(this, HotelPackage.CUSTOMER__ROOM_ORDER_LIST, Customer.class, msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject)newCustomer).eInverseAdd(this, HotelPackage.CUSTOMER__ROOM_ORDER_LIST, Customer.class, msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__CUSTOMER, newCustomer, newCustomer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelPackage.ROOM_ORDER__ID, oldId, id));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HotelPackage.ROOM_ORDER__ADMINISTRATOR:
				if (administrator != null)
					msgs = ((InternalEObject)administrator).eInverseRemove(this, HotelPackage.ADMINISTRATOR__CONFIRMED_ORDER_LIST, Administrator.class, msgs);
				return basicSetAdministrator((Administrator)otherEnd, msgs);
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				if (customer != null)
					msgs = ((InternalEObject)customer).eInverseRemove(this, HotelPackage.CUSTOMER__ROOM_ORDER_LIST, Customer.class, msgs);
				return basicSetCustomer((Customer)otherEnd, msgs);
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
			case HotelPackage.ROOM_ORDER__ADMINISTRATOR:
				return basicSetAdministrator(null, msgs);
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				return basicSetCustomer(null, msgs);
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
			case HotelPackage.ROOM_ORDER__ROOM_IN_ORDER:
				return getRoomInOrder();
			case HotelPackage.ROOM_ORDER__DATE_IN_ORDER:
				return getDateInOrder();
			case HotelPackage.ROOM_ORDER__ADMINISTRATOR:
				if (resolve) return getAdministrator();
				return basicGetAdministrator();
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case HotelPackage.ROOM_ORDER__ID:
				return getId();
			case HotelPackage.ROOM_ORDER__PRICE:
				return getPrice();
			case HotelPackage.ROOM_ORDER__CONFIRMED:
				return isConfirmed();
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
			case HotelPackage.ROOM_ORDER__ROOM_IN_ORDER:
				getRoomInOrder().clear();
				getRoomInOrder().addAll((Collection<? extends RoomSurrendering>)newValue);
				return;
			case HotelPackage.ROOM_ORDER__DATE_IN_ORDER:
				getDateInOrder().clear();
				getDateInOrder().addAll((Collection<? extends DateSurrendering>)newValue);
				return;
			case HotelPackage.ROOM_ORDER__ADMINISTRATOR:
				setAdministrator((Administrator)newValue);
				return;
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				setCustomer((Customer)newValue);
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
			case HotelPackage.ROOM_ORDER__ROOM_IN_ORDER:
				getRoomInOrder().clear();
				return;
			case HotelPackage.ROOM_ORDER__DATE_IN_ORDER:
				getDateInOrder().clear();
				return;
			case HotelPackage.ROOM_ORDER__ADMINISTRATOR:
				setAdministrator((Administrator)null);
				return;
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case HotelPackage.ROOM_ORDER__ID:
				setId(ID_EDEFAULT);
				return;
			case HotelPackage.ROOM_ORDER__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case HotelPackage.ROOM_ORDER__CONFIRMED:
				setConfirmed(CONFIRMED_EDEFAULT);
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
			case HotelPackage.ROOM_ORDER__ROOM_IN_ORDER:
				return roomInOrder != null && !roomInOrder.isEmpty();
			case HotelPackage.ROOM_ORDER__DATE_IN_ORDER:
				return dateInOrder != null && !dateInOrder.isEmpty();
			case HotelPackage.ROOM_ORDER__ADMINISTRATOR:
				return administrator != null;
			case HotelPackage.ROOM_ORDER__CUSTOMER:
				return customer != null;
			case HotelPackage.ROOM_ORDER__ID:
				return id != ID_EDEFAULT;
			case HotelPackage.ROOM_ORDER__PRICE:
				return price != PRICE_EDEFAULT;
			case HotelPackage.ROOM_ORDER__CONFIRMED:
				return confirmed != CONFIRMED_EDEFAULT;
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
		result.append(", price: ");
		result.append(price);
		result.append(", confirmed: ");
		result.append(confirmed);
		result.append(')');
		return result.toString();
	}

} //RoomOrderImpl
