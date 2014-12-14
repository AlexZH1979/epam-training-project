package ru.yandex.zhmyd.hotel.service.exceptions;


public class EntityNonFoundException extends ServiceException {
    private String msg = "Entity non found";

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public EntityNonFoundException() {
    }

    public EntityNonFoundException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
