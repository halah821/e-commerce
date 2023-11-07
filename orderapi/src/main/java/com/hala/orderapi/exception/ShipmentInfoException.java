package com.hala.orderapi.exception;

import com.hala.orderapi.model.ShipmentInfo;

public class ShipmentInfoException  extends RuntimeException {
    public ShipmentInfoException(String message) {
        super(message);
    }
}
