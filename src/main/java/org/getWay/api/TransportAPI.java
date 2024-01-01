package org.getWay.api;

import org.getWay.model.Car;
import org.getWay.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransportAPI {
    @Autowired
    TransportService transportService;

    @GetMapping(path = "/api/car")
    public List<Car> listCar() {
        return transportService.listCar();
    }
}
