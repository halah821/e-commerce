package com.hala.orderapi.repository;

import com.hala.orderapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository <Order,Long> {

    List<Order> findByCustomerId(Long customerId);
    List<Order> findByProductId(Long productId);
    List<Order> findByCustomerIdAndProductId(Long customerId,Long productId);

    //custom query methods if required

}
