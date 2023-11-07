package com.hala.orderapi.service;

import com.hala.orderapi.model.ShipmentInfo;

public interface ShipmentInfoService {
    public ShipmentInfo createShipmentInfo(ShipmentInfo shipmentInfo);
    public ShipmentInfo updateShipmentInfo(Long id,ShipmentInfo UpdatedShipmentInfo);
    public ShipmentInfo getShipmentInfo(Long id);
    public void deleteShipmentInfo(Long id);
}
