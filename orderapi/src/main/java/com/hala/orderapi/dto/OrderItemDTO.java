package com.hala.orderapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemDTO {
    Long order_id ;
    Long product_id;
    Long store_id;
    Long shipment_id;

    public OrderItemDTO(Long order_id, Long product_id, Long store_id, Long shipment_id) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.store_id = store_id;
        this.shipment_id = shipment_id;
    }
}
