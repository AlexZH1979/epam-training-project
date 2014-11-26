package ru.yandex.zhmyd.hotel.service.exceptions;

public class ServiceException extends RuntimeException {

    private String msg="SERVICE EXCEPTION";

    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public ServiceException() {
    }

    public ServiceException(String msg) {
        this.msg=msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}