package ru.yandex.zhmyd.hotel.service.exceptions;


public class EntityNonFoundException extends ServiceException {
    private String msg = "Entity non found";

    public EntityNonFoundException() {
    }

    public EntityNonFoundException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
