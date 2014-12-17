package ru.yandex.zhmyd.hotel.repository.dao.util;

public final class SearchParameter {
    public static final String NAME="name";
    public static final String ID="id";
    public static final String LOGIN="login";
    public static final String PASSWORD_HASH_CODE="passwordHashCode";
    public static final String ADDRESS="address";
    public static final String EMAIL="email";

    public static final class Associations{
        public static final String ROOM="room";
        public static final String USERS="users";
        public static final String HOTEL_ADDRESS="hotelAddress";
        public static final String CUSTOMER="customer";
        public static final String HOTEL="hotel";
    }
}
