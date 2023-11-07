package com.hala.orderapi.service;

import com.hala.orderapi.model.OrderItem;

public interface OrderItemService {
    public OrderItem createOrderItem(OrderItem orderItem);
    public OrderItem updateOrderItem(Long id,OrderItem updatedOrderItem);
    public OrderItem getOrderItem(Long id);
    public void deleteOrderItem(Long id);
}
