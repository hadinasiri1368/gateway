package org.getWay.service;

import org.getWay.model.OrderStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "BASICDATA")
public interface BasicDataService {
    @GetMapping(path = "/api/orderStatus")
    List<OrderStatus> listOrderStatus();
}
