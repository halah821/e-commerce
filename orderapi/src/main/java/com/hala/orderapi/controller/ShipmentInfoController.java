package com.hala.orderapi.controller;

import com.hala.orderapi.dto.ShipmentInfoDTO;
import com.hala.orderapi.mapper.ShipmentInfoMapper;
import com.hala.orderapi.model.Order;
import com.hala.orderapi.model.ShipmentInfo;
import com.hala.orderapi.service.ShipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/OrderApi/shipment_info")
public class ShipmentInfoController {
    @Autowired
    private ShipmentInfoService shipmentInfoService;
    @Autowired
    private ShipmentInfoMapper shipmentInfoMapper;

    @PostMapping
    public ShipmentInfoDTO createShipmentInfo(ShipmentInfoDTO shipmentInfoDTO){
        ShipmentInfo createdShipmentInfo = shipmentInfoService.createShipmentInfo(shipmentInfoMapper.dtoToEntity(shipmentInfoDTO));
        return shipmentInfoMapper.entityToDto(createdShipmentInfo);
    }

    @PutMapping
    public ShipmentInfoDTO updateSshipmentInfo(Long id, ShipmentInfoDTO shipmentInfoDTO){
        ShipmentInfo updatedShipmentInfo =shipmentInfoService.updateShipmentInfo(id, shipmentInfoMapper.dtoToEntity(shipmentInfoDTO));
        return shipmentInfoMapper.entityToDto(updatedShipmentInfo);
    }

    @GetMapping
    public ShipmentInfoDTO getShipmentInfo(Long id){
        ShipmentInfo theShipmentInfo=shipmentInfoService.getShipmentInfo(id);
        return shipmentInfoMapper.entityToDto(theShipmentInfo);

    }

    @DeleteMapping
    public void deleteShipmentInfo(Long id){
        shipmentInfoService.deleteShipmentInfo(id);
    }
}
