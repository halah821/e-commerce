package com.hala.orderapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "shipmentInfo")
public class ShipmentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    @Column(name = "order_id")
    Long order_id ;
    @Column(name = "customer_id")
    Long customer_id;
    @Column(name = "track_order_link")
    String track_order_link;
    @Column(name = "status")
    String status;

    //define constructors
    public ShipmentInfo(){

    }

    public ShipmentInfo(Long order_id, Long customer_id, String track_order_link, String status) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.track_order_link = track_order_link;
        this.status = status;
    }
    //define toString() method

    @Override
    public String toString() {
        return "ShipmentInfo{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", customer_id=" + customer_id +
                ", track_order_link='" + track_order_link + '\'' +
                ", status='" + status + '\'' +
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

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getTrack_order_link() {
        return track_order_link;
    }

    public void setTrack_order_link(String track_order_link) {
        this.track_order_link = track_order_link;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
