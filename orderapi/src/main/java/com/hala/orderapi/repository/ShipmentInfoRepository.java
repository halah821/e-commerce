package com.hala.orderapi.repository;

import com.hala.orderapi.model.ShipmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentInfoRepository extends JpaRepository<ShipmentInfo,Long> {
    //custom query methods if required
}
