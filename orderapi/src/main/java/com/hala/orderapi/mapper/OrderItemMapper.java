package com.hala.orderapi.mapper;

import com.hala.orderapi.dto.OrderItemDTO;
import com.hala.orderapi.model.OrderItem;
import org.mapstruct.Mapper;

@Mapper()
public interface OrderItemMapper {
    OrderItemDTO entityToDto(OrderItem orderItem);
    OrderItem dtoToEntity(OrderItemDTO orderItemDTO);
}
