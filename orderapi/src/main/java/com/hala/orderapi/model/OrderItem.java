package com.hala.orderapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "orderItem")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column(name = "order_id")
    Long order_id ;
    @Column(name = "product_id")
    Long product_id;
    @Column(name = "store_id")
    Long store_id;
    @Column(name = "shipment_id")
    Long shipment_id;

    //define constructors

    public OrderItem(){

    }
    public OrderItem(Long order_id, Long product_id, Long store_id, Long shipment_id) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.store_id = store_id;
        this.shipment_id = shipment_id;
    }

    //define toString() method

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", product_id=" + product_id +
                ", store_id=" + store_id +
                ", shipment_id=" + shipment_id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getStore_id() {
        return store_id;
    }

    public void setStore_id(Long store_id) {
        this.store_id = store_id;
    }

    public Long getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(Long shipment_id) {
        this.shipment_id = shipment_id;
    }
}
