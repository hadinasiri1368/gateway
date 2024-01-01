package org.getWay.service;

import org.getWay.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "TRANSPORT")
public interface TransportService {
    @GetMapping(path = "/api/car")
    List<Car> listCar() ;
}
