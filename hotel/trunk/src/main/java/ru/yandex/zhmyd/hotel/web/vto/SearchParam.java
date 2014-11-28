package ru.yandex.zhmyd.hotel.web.vto;


import java.io.Serializable;

public class SearchParam implements Serializable{
    private String parameter;
    private String value;

    public SearchParam() {
    }

    public String getParameter() {
        return parameter;
    }

    public SearchParam(String parameter, String value) {
        this.parameter = parameter;
        this.value = value;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SearchParam{" +
                "parameter='" + parameter + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
