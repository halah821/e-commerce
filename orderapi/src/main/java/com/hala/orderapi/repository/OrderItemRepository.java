package com.hala.orderapi.repository;

import com.hala.orderapi.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
    //custom query methods if required
}
