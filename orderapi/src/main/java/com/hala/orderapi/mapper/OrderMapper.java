package com.hala.orderapi.mapper;


import com.hala.orderapi.dto.OrderDTO;
import com.hala.orderapi.model.Order;
import org.mapstruct.Mapper;

@Mapper()
public interface OrderMapper {
    OrderDTO entityToDto(Order order);
    Order dtoToEntity(OrderDTO orderDTO);
}
