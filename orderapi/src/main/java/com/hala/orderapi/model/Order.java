package com.hala.orderapi.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.Period;

@Entity
@Table(name = "order")
public class Order {
    //define
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id  ;
    @Column(name = "order_date")
    Date order_date;
    @Column(name = "customer_id")
    Long customer_id;
    @Column(name = "total_price")
    int total_price;
    @Column(name = "coupon_id")
    Long coupon_id;
    @Column(name = "expectedDeliveryPeriod")
    Period expectedDelivery;


    //define constructors
    public Order(){

    }

    public Order(Long id, Date order_date, Long customer_id, Integer total_price, Long coupon_id, Period expectedDelivery) {
        this.id = id;
        this.order_date = order_date;
        this.customer_id = customer_id;
        this.total_price = total_price;
        this.coupon_id = coupon_id;
        this.expectedDelivery = expectedDelivery;
    }
    //define toString() method

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", order_date=" + order_date +
                ", customer_id=" + customer_id +
                ", total_price=" + total_price +
                ", coupon_id=" + coupon_id +
                ", ExpectedDeliveryStart=" + expectedDelivery +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public Long getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(Long coupon_id) {
        this.coupon_id = coupon_id;
    }

    public Period getExpectedDelivery() {
        return expectedDelivery;
    }

    public void setExpectedDelivery(Period expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }
}
