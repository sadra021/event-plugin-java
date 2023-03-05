package org.tron.eventplugin.customModel;

import java.math.BigDecimal;
import java.util.List;

public class Response {
    private String toAddress;
    private String fromAddress;


    public Response(String toAddress, String fromAddress) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
    }

    public Response() {
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

}