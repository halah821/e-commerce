package com.hala.orderapi.service;

import com.hala.orderapi.model.Order;

import java.util.Optional;

public interface OrderService {
   public Order createOrder(Order order);
   public Order updateOrder(Long id,Order updatedOrder);
   public Order getOrder(Long id);
   public void deleteOrder(Long id);

}
