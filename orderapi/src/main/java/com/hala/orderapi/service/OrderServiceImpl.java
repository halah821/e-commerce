package com.hala.orderapi.service;

import com.hala.orderapi.exception.OrderException;
import com.hala.orderapi.mapper.OrderMapper;
import com.hala.orderapi.model.Order;
import com.hala.orderapi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {

        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Long id, Order updatedOrder) {
        Order existingOrder = orderRepository.findById(id).orElseThrow(()->new OrderException("Order Not Found!"));
        existingOrder.setOrder_date(updatedOrder.getOrder_date());
        existingOrder.setCustomer_id(updatedOrder.getCustomer_id());
        existingOrder.setTotal_price(updatedOrder.getTotal_price());
        existingOrder.setCoupon_id(updatedOrder.getCoupon_id());
        existingOrder.setExpectedDelivery(updatedOrder.getExpectedDelivery());
        return orderRepository.save(existingOrder);
    }

    @Override
    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElseThrow(()->new OrderException("Order Not Found!"));
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
