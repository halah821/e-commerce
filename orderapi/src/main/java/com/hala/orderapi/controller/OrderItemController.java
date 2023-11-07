package com.hala.orderapi.controller;

import com.hala.orderapi.dto.OrderItemDTO;
import com.hala.orderapi.mapper.OrderItemMapper;
import com.hala.orderapi.model.OrderItem;
import com.hala.orderapi.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/OrderApi/order/item")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;
    @Autowired
    private OrderItemMapper orderItemMapper;

    @PostMapping
    public OrderItemDTO createItem(OrderItemDTO orderItemDTO){
        OrderItem createdOrderItem = orderItemService.createOrderItem(orderItemMapper.dtoToEntity(orderItemDTO));
        return orderItemMapper.entityToDto(createdOrderItem);
    }

    @PutMapping
    public OrderItemDTO updateItem(Long id, OrderItemDTO orderItemDTO){
        OrderItem updatedOrderItem =orderItemService.updateOrderItem(id, orderItemMapper.dtoToEntity(orderItemDTO));
        return orderItemMapper.entityToDto(updatedOrderItem);
    }

    @GetMapping
    public OrderItemDTO getItem(Long id){
        OrderItem theOrderItem=orderItemService.getOrderItem(id);
        return orderItemMapper.entityToDto(theOrderItem);

    }

    @DeleteMapping
    public void deleteItem(Long id){
        orderItemService.deleteOrderItem(id);
    }
}
