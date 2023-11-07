package com.hala.orderapi.controller;

import com.hala.orderapi.dto.OrderDTO;
import com.hala.orderapi.mapper.OrderMapper;
import com.hala.orderapi.model.Order;
import com.hala.orderapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/OrderApi/")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderMapper orderMapper;

    @PostMapping
    public OrderDTO createOrder(OrderDTO orderDTO){
        Order createdOrder = orderService.createOrder(orderMapper.dtoToEntity(orderDTO));
        return orderMapper.entityToDto(createdOrder);
    }

    @PutMapping
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO){
        Order updatedOrder =orderService.updateOrder(id, orderMapper.dtoToEntity(orderDTO));
        return orderMapper.entityToDto(updatedOrder);
    }

    @GetMapping
    public OrderDTO getOrder(Long id){
        Order theOrder=orderService.getOrder(id);
        return orderMapper.entityToDto(theOrder);

    }

    @DeleteMapping
    public void deleteOrder(Long id){
        orderService.deleteOrder(id);
    }

}
