package com.hala.orderapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShipmentInfoDTO {
    Long order_id ;
    Long customer_id;
    String track_order_link;
    String status;

    public ShipmentInfoDTO(Long order_id, Long customer_id, String track_order_link, String status) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.track_order_link = track_order_link;
        this.status = status;
    }
}
