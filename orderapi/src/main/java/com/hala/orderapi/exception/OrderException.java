package com.hala.orderapi.exception;

public class OrderException extends RuntimeException{
    public OrderException(String message){
        super(message);
    }
}
