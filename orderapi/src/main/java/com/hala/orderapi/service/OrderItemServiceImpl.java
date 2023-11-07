package com.hala.orderapi.service;

import com.hala.orderapi.exception.OrderItemException;
import com.hala.orderapi.model.OrderItem;
import com.hala.orderapi.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImpl implements OrderItemService{

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public OrderItem updateOrderItem(Long id, OrderItem updatedOrderItem) {
        OrderItem existingOrderItem = orderItemRepository.findById(id).orElseThrow(()->new OrderItemException("Order Not Found!"));
        existingOrderItem.setOrder_id(updatedOrderItem.getOrder_id());
        existingOrderItem.setProduct_id(updatedOrderItem.getProduct_id());
        existingOrderItem.setStore_id(updatedOrderItem.getStore_id());
        existingOrderItem.setShipment_id(updatedOrderItem.getShipment_id());
        return orderItemRepository.save(existingOrderItem);
    }

    @Override
    public OrderItem getOrderItem(Long id) {
        return orderItemRepository.findById(id).orElseThrow(()->new OrderItemException("Order Not Found!"));
    }

    @Override
    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}
