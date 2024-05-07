package org.gateway.service;

import org.gateway.dto.CarGroupDto;
import org.gateway.dto.CountryDivisionDto;
import org.gateway.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "BASICDATA")
public interface BasicDataService {

    @PostMapping(path = "/api/baseInfoGood/add")
    Long addBaseInfoGood(@RequestBody BaseInfoGood baseInfoGood);

    @PutMapping(path = "/api/baseInfoGood/edit")
    Long editBaseInfoGood(@RequestBody BaseInfoGood baseInfoGood);

    @DeleteMapping(path = "/api/baseInfoGood/remove/{id}")
    Long removeBaseInfoGood(@PathVariable Long id);

    @GetMapping(path = "/api/baseInfoGood/{id}")
    BaseInfoGood getBaseInfoGood(@PathVariable Long id);

    @GetMapping(path = "/api/baseInfoGood")
    Page<BaseInfoGood> listBaseInfoGood(@RequestParam("page") Integer page, @RequestParam("size") Integer size);

    @PostMapping(path = "/api/carCapacity/add")
    Long addCarCapacity(@RequestBody CarCapacity carCapacity);

    @PutMapping(path = "/api/carCapacity/edit")
    Long editCarCapacity(@RequestBody CarCapacity carCapacity);

    @DeleteMapping(path = "/api/carCapacity/remove/{id}")
    Long removeCarCapacity(@PathVariable Long id);

    @GetMapping(path = "/api/carCapacity/{id}")
    CarCapacity getCarCapacity(@PathVariable Long id);

    @GetMapping(path = "/api/carCapacity")
    List<CarCapacity> listCarCapacity();

    @PostMapping(path = "/api/carGroup/add")
    Long addCarGroup(@RequestBody CarGroupDto carGroupDto);

    @PutMapping(path = "/api/carGroup/edit")
    Long editCarGroup(@RequestBody CarGroupDto carGroupDto);

    @DeleteMapping(path = "/api/carGroup/remove/{id}")
    Long removeCarGroup(@PathVariable Long id);

    @GetMapping(path = "/api/carGroup/{id}")
    CarGroup getCarGroup(@PathVariable Long id);

    @GetMapping(path = "/api/carGroup")
    List<CarGroup> listCarGroup();

    @PostMapping(path = "/api/carProperty/add")
    Long addCarProperty(@RequestBody CarProperty carProperty);

    @PutMapping(path = "/api/carProperty/edit")
    Long editCarProperty(@RequestBody CarProperty carProperty);

    @DeleteMapping(path = "/api/carProperty/remove/{id}")
    Long removeCarProperty(@PathVariable Long id);

    @GetMapping(path = "/api/carProperty/{id}")
    CarProperty getCarProperty(@PathVariable Long id);

    @GetMapping(path = "/api/carProperty")
    List<CarProperty> listCarProperty();

    @PostMapping(path = "/api/countryDivision/add")
    Long addCountryDivision(@RequestBody CountryDivisionDto countryDivisionDto);

    @PutMapping(path = "/api/countryDivision/edit")
    Long editCountryDivision(@RequestBody CountryDivisionDto countryDivisionDto);

    @DeleteMapping(path = "/api/countryDivision/remove/{id}")
    Long removeCountryDivision(@PathVariable Long id);

    @GetMapping(path = "/api/countryDivision/{id}")
    CountryDivision getCountryDivision(@PathVariable Long id);

    @GetMapping(path = "/api/countryDivision")
    List<CountryDivision> listCountryDivision();

    @PostMapping(path = "/api/driverLicenseType/add")
    Long addDriverLicenseType(@RequestBody DriverLicenseType driverLicenseType);

    @PutMapping(path = "/api/driverLicenseType/edit")
    Long editDriverLicenseType(@RequestBody DriverLicenseType driverLicenseType);

    @DeleteMapping(path = "/api/driverLicenseType/remove/{id}")
    Long removeDriverLicenseType(@PathVariable Long id);

    @GetMapping(path = "/api/driverLicenseType/{id}")
    DriverLicenseType getDriverLicenseType(@PathVariable Long id);

    @GetMapping(path = "/api/driverLicenseType")
    List<DriverLicenseType> listDriverLicenseType();

    @PostMapping(path = "/api/fleetType/add")
    Long addFleetType(@RequestBody FleetType fleetType);

    @PutMapping(path = "/api/fleetType/edit")
    Long editFleetType(@RequestBody FleetType fleetType);

    @DeleteMapping(path = "/api/fleetType/remove/{id}")
    Long removeFleetType(@PathVariable Long id);

    @GetMapping(path = "/api/fleetType/{id}")
    FleetType getFleetType(@PathVariable Long id);

    @GetMapping(path = "/api/fleetType")
    List<FleetType> listFleetType();

    @PostMapping(path = "/api/fuelType/add")
    Long addFuelType(@RequestBody FuelType fuelType);

    @PutMapping(path = "/api/fuelType/edit")
    Long editFuelType(@RequestBody FuelType fuelType);

    @DeleteMapping(path = "/api/fuelType/remove/{id}")
    Long removeFuelType(@PathVariable Long id);

    @GetMapping(path = "/api/fuelType/{id}")
    FuelType getFuelType(@PathVariable Long id);

    @GetMapping(path = "/api/fuelType")
    List<FuelType> listFuelType();

    @PostMapping(path = "/api/loadingType/add")
    Long addLoadingType(@RequestBody LoadingType loadingType);

    @PutMapping(path = "/api/loadingType/edit")
    Long editLoadingType(@RequestBody LoadingType loadingType);

    @DeleteMapping(path = "/api/loadingType/remove/{id}")
    Long removeLoadingType(@PathVariable Long id);

    @GetMapping(path = "/api/loadingType/{id}")
    LoadingType getLoadingType(@PathVariable Long id);

    @GetMapping(path = "/api/loadingType")
    List<LoadingType> listLoadingType();

    @PostMapping(path = "/api/orderStatus/add")
    Long addOrderStatus(@RequestBody OrderStatus orderStatus);

    @PutMapping(path = "/api/orderStatus/edit")
    Long editOrderStatus(@RequestBody OrderStatus orderStatus);

    @DeleteMapping(path = "/api/orderStatus/remove/{id}")
    Long removeOrderStatus(@PathVariable Long id);

    @GetMapping(path = "/api/orderStatus/{id}")
    OrderStatus getOrderStatus(@PathVariable Long id);

    @GetMapping(path = "/api/orderStatus")
    List<OrderStatus> listOrderStatus();

    @PostMapping(path = "/api/packingType/add")
    Long addPackingType(@RequestBody PackingType packingType);

    @PutMapping(path = "/api/packingType/edit")
    Long editPackingType(@RequestBody PackingType packingType);

    @DeleteMapping(path = "/api/packingType/remove/{id}")
    Long removePackingType(@PathVariable Long id);

    @GetMapping(path = "/api/packingType/{id}")
    PackingType getPackingType(@PathVariable Long id);

    @GetMapping(path = "/api/packingType")
    List<PackingType> listPackingType();

    @PostMapping(path = "/api/plaqueTagPersianPart/add")
    Long addPlaqueTagPersianPart(@RequestBody PlaqueTagPersianPart plaqueTagPersianPart);

    @PutMapping(path = "/api/plaqueTagPersianPart/edit")
    Long editPlaqueTagPersianPart(@RequestBody PlaqueTagPersianPart plaqueTagPersianPart);;

    @DeleteMapping(path = "/api/plaqueTagPersianPart/remove/{id}")
    Long removePlaqueTagPersianPart(@PathVariable Long id);;

    @GetMapping(path = "/api/plaqueTagPersianPart/{id}")
    PlaqueTagPersianPart getPlaqueTagPersianPart(@PathVariable Long id);

    @GetMapping(path = "/api/plaqueTagPersianPart")
    List<PlaqueTagPersianPart> listPlaqueTagPersianPart();

    @PostMapping(path = "/api/requestStatus/add")
    Long addRequestStatus(@RequestBody RequestStatus requestStatus);

    @PutMapping(path = "/api/requestStatus/edit")
    Long editRequestStatus(@RequestBody RequestStatus requestStatus);

    @DeleteMapping(path = "/api/requestStatus/remove/{id}")
    Long removeRequestStatus(@PathVariable Long id);

    @GetMapping(path = "/api/requestStatus/{id}")
    RequestStatus getRequestStatus(@PathVariable Long id);

    @GetMapping(path = "/api/requestStatus")
    List<RequestStatus> listRequestStatus();

}

