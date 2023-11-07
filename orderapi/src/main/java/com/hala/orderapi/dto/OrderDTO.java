package com.hala.orderapi.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class OrderDTO {

    //define
    Date order_date;
    Integer customer_id;
    Integer total_price;
    Integer coupon_id;
    Date expectedDeliveryPeriod;


    //define constructor

    public OrderDTO(Date order_date, Integer customer_id, Integer total_price, Integer coupon_id, Date expectedDeliveryPeriod) {
        this.order_date = order_date;
        this.customer_id = customer_id;
        this.total_price = total_price;
        this.coupon_id = coupon_id;
        this.expectedDeliveryPeriod = expectedDeliveryPeriod;
    }
}
