package org.getWay.api;

import org.getWay.model.OrderStatus;
import org.getWay.service.BasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasicDataAPI {
    @Autowired
    BasicDataService basicDataService;

    @GetMapping(path = "/api/orderStatus")
    public List<OrderStatus> listOrderStatus() {
        return basicDataService.listOrderStatus();
    }
}
