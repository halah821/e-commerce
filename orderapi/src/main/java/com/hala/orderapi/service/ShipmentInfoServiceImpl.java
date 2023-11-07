package com.hala.orderapi.service;

import com.hala.orderapi.exception.ShipmentInfoException;
import com.hala.orderapi.model.ShipmentInfo;
import com.hala.orderapi.repository.ShipmentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentInfoServiceImpl implements ShipmentInfoService{
    @Autowired
    private ShipmentInfoRepository shipmentInfoRepository;

    @Override
    public ShipmentInfo createShipmentInfo(ShipmentInfo shipmentInfo) {
        return shipmentInfoRepository.save(shipmentInfo);
    }

    @Override
    public ShipmentInfo updateShipmentInfo(Long id, ShipmentInfo updatedShipmentInfo) {
        ShipmentInfo existingShipmentInfo = shipmentInfoRepository.findById(id).orElseThrow(()->new ShipmentInfoException("ShipmentInfo Not Found!"));
        existingShipmentInfo.setOrder_id(updatedShipmentInfo.getOrder_id());
        existingShipmentInfo.setCustomer_id(updatedShipmentInfo.getCustomer_id());
        existingShipmentInfo.setTrack_order_link(updatedShipmentInfo.getTrack_order_link());
        existingShipmentInfo.setStatus(updatedShipmentInfo.getStatus());
        return shipmentInfoRepository.save(existingShipmentInfo);

    }

    @Override
    public ShipmentInfo getShipmentInfo(Long id) {
        return shipmentInfoRepository.findById(id).orElseThrow(()->new ShipmentInfoException("Order Not Found!"));

    }

    @Override
    public void deleteShipmentInfo(Long id) {
        shipmentInfoRepository.deleteById(id);
    }
}
