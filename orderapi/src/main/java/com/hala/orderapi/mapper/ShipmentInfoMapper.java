package com.hala.orderapi.mapper;

import com.hala.orderapi.dto.ShipmentInfoDTO;
import com.hala.orderapi.model.ShipmentInfo;
import org.mapstruct.Mapper;

@Mapper()
public interface ShipmentInfoMapper {
    ShipmentInfoDTO entityToDto(ShipmentInfo shipmentInfo);
    ShipmentInfo dtoToEntity(ShipmentInfoDTO shipmentInfoDTO);
}
