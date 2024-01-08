package org.getWay.service;

import org.getWay.dto.CarGroupDto;
import org.getWay.dto.CountryDivisionDto;
import org.getWay.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(name = "BASICDATA")
public interface BasicDataService {

    @PostMapping(path = "/api/baseInfoGood/add")
    Long addBaseInfoGood(@RequestBody BaseInfoGood baseInfoGood);

    @PostMapping(path = "/api/baseInfoGood/edit")
    Long editBaseInfoGood(@RequestBody BaseInfoGood baseInfoGood);

    @PostMapping(path = "/api/baseInfoGood/remove/{id}")
    Long removeBaseInfoGood(@PathVariable Long id);

    @GetMapping(path = "/api/baseInfoGood/{id}")
    BaseInfoGood getBaseInfoGood(@PathVariable Long id);

    @GetMapping(path = "/api/baseInfoGood")
    List<BaseInfoGood> listBaseInfoGood();

    @PostMapping(path = "/api/carCapacity/add")
    Long addCarCapacity(@RequestBody CarCapacity carCapacity);

    @PostMapping(path = "/api/carCapacity/edit")
    Long editCarCapacity(@RequestBody CarCapacity carCapacity);

    @PostMapping(path = "/api/carCapacity/remove/{id}")
    Long removeCarCapacity(@PathVariable Long id);

    @GetMapping(path = "/api/carCapacity/{id}")
    CarCapacity getCarCapacity(@PathVariable Long id);

    @GetMapping(path = "/api/carCapacity")
    List<CarCapacity> listCarCapacity();

    @PostMapping(path = "/api/carGroup/add")
    Long addCarGroup(@RequestBody CarGroupDto carGroupDto);

    @PostMapping(path = "/api/carGroup/edit")
    Long editCarGroup(@RequestBody CarGroupDto carGroupDto);

    @PostMapping(path = "/api/carGroup/remove/{id}")
    Long removeCarGroup(@PathVariable Long id);

    @GetMapping(path = "/api/carGroup/{id}")
    CarGroup getCarGroup(@PathVariable Long id);

    @GetMapping(path = "/api/carGroup")
    List<CarGroup> listCarGroup();

    @PostMapping(path = "/api/carProperty/add")
    Long addCarProperty(@RequestBody CarProperty carProperty);

    @PostMapping(path = "/api/carProperty/edit")
    Long editCarProperty(@RequestBody CarProperty carProperty);

    @PostMapping(path = "/api/carProperty/remove/{id}")
    Long removeCarProperty(@PathVariable Long id);

    @GetMapping(path = "/api/carProperty/{id}")
    CarProperty getCarProperty(@PathVariable Long id);

    @GetMapping(path = "/api/carProperty")
    List<CarProperty> listCarProperty();

    @PostMapping(path = "/api/countryDivision/add")
    Long addCountryDivision(@RequestBody CountryDivisionDto countryDivisionDto);

    @PostMapping(path = "/api/countryDivision/edit")
    Long editCountryDivision(@RequestBody CountryDivisionDto countryDivisionDto);

    @PostMapping(path = "/api/countryDivision/remove/{id}")
    Long removeCountryDivision(@PathVariable Long id);

    @GetMapping(path = "/api/countryDivision/{id}")
    CountryDivision getCountryDivision(@PathVariable Long id);

    @GetMapping(path = "/api/countryDivision")
    List<CountryDivision> listCountryDivision();

    @PostMapping(path = "/api/driverLicenseType/add")
    Long addDriverLicenseType(@RequestBody DriverLicenseType driverLicenseType);

    @PostMapping(path = "/api/driverLicenseType/edit")
    Long editDriverLicenseType(@RequestBody DriverLicenseType driverLicenseType);

    @PostMapping(path = "/api/driverLicenseType/remove/{id}")
    Long removeDriverLicenseType(@PathVariable Long id);

    @GetMapping(path = "/api/driverLicenseType/{id}")
    DriverLicenseType getDriverLicenseType(@PathVariable Long id);

    @GetMapping(path = "/api/driverLicenseType")
    List<DriverLicenseType> listDriverLicenseType();

    @PostMapping(path = "/api/fleetType/add")
    Long addFleetType(@RequestBody FleetType fleetType);

    @PostMapping(path = "/api/fleetType/edit")
    Long editFleetType(@RequestBody FleetType fleetType);

    @PostMapping(path = "/api/fleetType/remove/{id}")
    Long removeFleetType(@PathVariable Long id);

    @GetMapping(path = "/api/fleetType/{id}")
    FleetType getFleetType(@PathVariable Long id);

    @GetMapping(path = "/api/fleetType")
    List<FleetType> listFleetType();

    @PostMapping(path = "/api/fuelType/add")
    Long addFuelType(@RequestBody FuelType fuelType);

    @PostMapping(path = "/api/fuelType/edit")
    Long editFuelType(@RequestBody FuelType fuelType);

    @PostMapping(path = "/api/fuelType/remove/{id}")
    Long removeFuelType(@PathVariable Long id);

    @GetMapping(path = "/api/fuelType/{id}")
    FuelType getFuelType(@PathVariable Long id);

    @GetMapping(path = "/api/fuelType")
    List<FuelType> listFuelType();

    @PostMapping(path = "/api/loadingType/add")
    Long addLoadingType(@RequestBody LoadingType loadingType);

    @PostMapping(path = "/api/loadingType/edit")
    Long editLoadingType(@RequestBody LoadingType loadingType);

    @PostMapping(path = "/api/loadingType/remove/{id}")
    Long removeLoadingType(@PathVariable Long id);

    @GetMapping(path = "/api/loadingType/{id}")
    LoadingType getLoadingType(@PathVariable Long id);

    @GetMapping(path = "/api/loadingType")
    List<LoadingType> listLoadingType();

    @PostMapping(path = "/api/orderStatus/add")
    Long addOrderStatus(@RequestBody OrderStatus orderStatus);

    @PostMapping(path = "/api/orderStatus/edit")
    Long editOrderStatus(@RequestBody OrderStatus orderStatus);

    @PostMapping(path = "/api/orderStatus/remove/{id}")
    Long removeOrderStatus(@PathVariable Long id);

    @GetMapping(path = "/api/orderStatus/{id}")
    OrderStatus getOrderStatus(@PathVariable Long id);

    @GetMapping(path = "/api/orderStatus")
    List<OrderStatus> listOrderStatus();

    @PostMapping(path = "/api/packingType/add")
    Long addPackingType(@RequestBody PackingType packingType);

    @PostMapping(path = "/api/packingType/edit")
    Long editPackingType(@RequestBody PackingType packingType);

    @PostMapping(path = "/api/packingType/remove/{id}")
    Long removePackingType(@PathVariable Long id);

    @GetMapping(path = "/api/packingType/{id}")
    PackingType getPackingType(@PathVariable Long id);

    @GetMapping(path = "/api/packingType")
    List<PackingType> listPackingType();

    @PostMapping(path = "/api/plaqueTagPersianPart/add")
    Long addPlaqueTagPersianPart(@RequestBody PlaqueTagPersianPart plaqueTagPersianPart);

    @PostMapping(path = "/api/plaqueTagPersianPart/edit")
    Long editPlaqueTagPersianPart(@RequestBody PlaqueTagPersianPart plaqueTagPersianPart);;

    @PostMapping(path = "/api/plaqueTagPersianPart/remove/{id}")
    Long removePlaqueTagPersianPart(@PathVariable Long id);;

    @GetMapping(path = "/api/plaqueTagPersianPart/{id}")
    PlaqueTagPersianPart getPlaqueTagPersianPart(@PathVariable Long id);

    @GetMapping(path = "/api/plaqueTagPersianPart")
    List<PlaqueTagPersianPart> listPlaqueTagPersianPart();

    @PostMapping(path = "/api/requestStatus/add")
    Long addRequestStatus(@RequestBody RequestStatus requestStatus);

    @PostMapping(path = "/api/requestStatus/edit")
    Long editRequestStatus(@RequestBody RequestStatus requestStatus);

    @PostMapping(path = "/api/requestStatus/remove/{id}")
    Long removeRequestStatus(@PathVariable Long id);

    @GetMapping(path = "/api/requestStatus/{id}")
    RequestStatus getRequestStatus(@PathVariable Long id);

    @GetMapping(path = "/api/requestStatus")
    List<RequestStatus> listRequestStatus();

}

