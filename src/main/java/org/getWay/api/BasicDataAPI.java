package org.getWay.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.getWay.dto.CarGroupDto;
import org.getWay.dto.CountryDivisionDto;
import org.getWay.model.*;
import org.getWay.service.BasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SecurityRequirement(name = "Bearer Authentication")
public class BasicDataAPI {
    @Autowired
    BasicDataService basicDataService;

    @PostMapping(path = "/api/baseInfoGood/add")
    Long addBaseInfoGood(@RequestBody BaseInfoGood baseInfoGood) {
        return basicDataService.addBaseInfoGood(baseInfoGood);
    }

    @PostMapping(path = "/api/baseInfoGood/edit")
    Long editBaseInfoGood(@RequestBody BaseInfoGood baseInfoGood) {
        return basicDataService.editBaseInfoGood(baseInfoGood);
    }

    @PostMapping(path = "/api/baseInfoGood/remove/{id}")
    Long removeBaseInfoGood(@PathVariable Long id) {
        return basicDataService.removeBaseInfoGood(id);
    }

    @GetMapping(path = "/api/baseInfoGood/{id}")
    BaseInfoGood getBaseInfoGood(@PathVariable Long id) {
        return basicDataService.getBaseInfoGood(id);
    }

    @GetMapping(path = "/api/baseInfoGood")
    List<BaseInfoGood> listBaseInfoGood() {
        return basicDataService.listBaseInfoGood();
    }

    @PostMapping(path = "/api/carCapacity/add")
    Long addCarCapacity(@RequestBody CarCapacity carCapacity) {
        return basicDataService.addCarCapacity(carCapacity);
    }

    @PostMapping(path = "/api/carCapacity/edit")
    Long editCarCapacity(@RequestBody CarCapacity carCapacity) {
        return basicDataService.editCarCapacity(carCapacity);
    }

    @PostMapping(path = "/api/carCapacity/remove/{id}")
    Long removeCarCapacity(@PathVariable Long id) {
        return basicDataService.removeCarCapacity(id);
    }

    @GetMapping(path = "/api/carCapacity/{id}")
    CarCapacity getCarCapacity(@PathVariable Long id) {
        return basicDataService.getCarCapacity(id);
    }

    @GetMapping(path = "/api/carCapacity")
    List<CarCapacity> listCarCapacity() {
        return basicDataService.listCarCapacity();
    }

    @PostMapping(path = "/api/carGroup/add")
    Long addCarGroup(@RequestBody CarGroupDto carGroupDto) {
        return basicDataService.addCarGroup(carGroupDto);
    }

    @PostMapping(path = "/api/carGroup/edit")
    Long editCarGroup(@RequestBody CarGroupDto carGroupDto) {
        return basicDataService.editCarGroup(carGroupDto);
    }

    @PostMapping(path = "/api/carGroup/remove/{id}")
    Long removeCarGroup(@PathVariable Long id) {
        return basicDataService.removeCarGroup(id);
    }

    @GetMapping(path = "/api/carGroup/{id}")
    CarGroup getCarGroup(@PathVariable Long id) {
        return basicDataService.getCarGroup(id);
    }

    @GetMapping(path = "/api/carGroup")
    List<CarGroup> listCarGroup() {
        return basicDataService.listCarGroup();
    }

    @PostMapping(path = "/api/carProperty/add")
    Long addCarProperty(@RequestBody CarProperty carProperty) {
        return basicDataService.addCarProperty(carProperty);
    }

    @PostMapping(path = "/api/carProperty/edit")
    Long editCarProperty(@RequestBody CarProperty carProperty) {
        return basicDataService.editCarProperty(carProperty);
    }

    @PostMapping(path = "/api/carProperty/remove/{id}")
    Long removeCarProperty(@PathVariable Long id) {
        return basicDataService.removeCarProperty(id);
    }

    @GetMapping(path = "/api/carProperty/{id}")
    CarProperty getCarProperty(@PathVariable Long id) {
        return basicDataService.getCarProperty(id);
    }

    @GetMapping(path = "/api/carProperty")
    List<CarProperty> listCarProperty() {
        return basicDataService.listCarProperty();
    }

    @PostMapping(path = "/api/countryDivision/add")
    Long addCountryDivision(@RequestBody CountryDivisionDto countryDivisionDto) {
        return basicDataService.addCountryDivision(countryDivisionDto);
    }

    @PostMapping(path = "/api/countryDivision/edit")
    Long editCountryDivision(@RequestBody CountryDivisionDto countryDivisionDto) {
        return basicDataService.editCountryDivision(countryDivisionDto);
    }

    @PostMapping(path = "/api/countryDivision/remove/{id}")
    Long removeCountryDivision(@PathVariable Long id) {
        return basicDataService.removeCountryDivision(id);
    }

    @GetMapping(path = "/api/countryDivision/{id}")
    CountryDivision getCountryDivision(@PathVariable Long id) {
        return basicDataService.getCountryDivision(id);
    }

    @GetMapping(path = "/api/countryDivision")
    List<CountryDivision> listCountryDivision() {
        return basicDataService.listCountryDivision();
    }

    @PostMapping(path = "/api/driverLicenseType/add")
    Long addDriverLicenseType(@RequestBody DriverLicenseType driverLicenseType) {
        return basicDataService.addDriverLicenseType(driverLicenseType);
    }

    @PostMapping(path = "/api/driverLicenseType/edit")
    Long editDriverLicenseType(@RequestBody DriverLicenseType driverLicenseType) {
        return basicDataService.editDriverLicenseType(driverLicenseType);
    }

    @PostMapping(path = "/api/driverLicenseType/remove/{id}")
    Long removeDriverLicenseType(@PathVariable Long id) {
        return basicDataService.removeDriverLicenseType(id);
    }

    @GetMapping(path = "/api/driverLicenseType/{id}")
    DriverLicenseType getDriverLicenseType(@PathVariable Long id) {
        return basicDataService.getDriverLicenseType(id);
    }

    @GetMapping(path = "/api/driverLicenseType")
    List<DriverLicenseType> listDriverLicenseType() {
        return basicDataService.listDriverLicenseType();
    }

    @PostMapping(path = "/api/fleetType/add")
    Long addFleetType(@RequestBody FleetType fleetType) {
        return basicDataService.addFleetType(fleetType);
    }

    @PostMapping(path = "/api/fleetType/edit")
    Long editFleetType(@RequestBody FleetType fleetType) {
        return basicDataService.editFleetType(fleetType);
    }

    @PostMapping(path = "/api/fleetType/remove/{id}")
    Long removeFleetType(@PathVariable Long id) {
        return basicDataService.removeFleetType(id);
    }

    @GetMapping(path = "/api/fleetType/{id}")
    FleetType getFleetType(@PathVariable Long id) {
        return basicDataService.getFleetType(id);
    }

    @GetMapping(path = "/api/fleetType")
    List<FleetType> listFleetType() {
        return basicDataService.listFleetType();
    }

    @PostMapping(path = "/api/fuelType/add")
    Long addFuelType(@RequestBody FuelType fuelType) {
        return basicDataService.addFuelType(fuelType);
    }

    @PostMapping(path = "/api/fuelType/edit")
    Long editFuelType(@RequestBody FuelType fuelType) {
        return basicDataService.editFuelType(fuelType);
    }

    @PostMapping(path = "/api/fuelType/remove/{id}")
    Long removeFuelType(@PathVariable Long id) {
        return basicDataService.removeFuelType(id);
    }

    @GetMapping(path = "/api/fuelType/{id}")
    FuelType getFuelType(@PathVariable Long id) {
        return basicDataService.getFuelType(id);
    }

    @GetMapping(path = "/api/fuelType")
    List<FuelType> listFuelType() {
        return basicDataService.listFuelType();
    }

    @PostMapping(path = "/api/loadingType/add")
    Long addLoadingType(@RequestBody LoadingType loadingType) {
        return basicDataService.addLoadingType(loadingType);
    }

    @PostMapping(path = "/api/loadingType/edit")
    Long editLoadingType(@RequestBody LoadingType loadingType) {
        return basicDataService.editLoadingType(loadingType);
    }

    @PostMapping(path = "/api/loadingType/remove/{id}")
    Long removeLoadingType(@PathVariable Long id) {
        return basicDataService.removeLoadingType(id);
    }

    @GetMapping(path = "/api/loadingType/{id}")
    LoadingType getLoadingType(@PathVariable Long id) {
        return basicDataService.getLoadingType(id);
    }

    @GetMapping(path = "/api/loadingType")
    List<LoadingType> listLoadingType() {
        return basicDataService.listLoadingType();
    }

    @PostMapping(path = "/api/orderStatus/add")
    Long addOrderStatus(@RequestBody OrderStatus orderStatus) {
        return basicDataService.addOrderStatus(orderStatus);
    }

    @PostMapping(path = "/api/orderStatus/edit")
    Long editOrderStatus(@RequestBody OrderStatus orderStatus) {
        return basicDataService.editOrderStatus(orderStatus);
    }

    @PostMapping(path = "/api/orderStatus/remove/{id}")
    Long removeOrderStatus(@PathVariable Long id) {
        return basicDataService.removeOrderStatus(id);
    }

    @GetMapping(path = "/api/orderStatus/{id}")
    OrderStatus getOrderStatus(@PathVariable Long id) {
        return basicDataService.getOrderStatus(id);
    }

    @GetMapping(path = "/api/orderStatus")
    public List<OrderStatus> listOrderStatus() {
        return basicDataService.listOrderStatus();
    }

    @PostMapping(path = "/api/packingType/add")
    Long addPackingType(@RequestBody PackingType packingType) {
        return basicDataService.addPackingType(packingType);
    }

    @PostMapping(path = "/api/packingType/edit")
    Long editPackingType(@RequestBody PackingType packingType) {
        return basicDataService.editPackingType(packingType);
    }

    @PostMapping(path = "/api/packingType/remove/{id}")
    Long removePackingType(@PathVariable Long id) {
        return basicDataService.removePackingType(id);
    }

    @GetMapping(path = "/api/packingType/{id}")
    PackingType getPackingType(@PathVariable Long id) {
        return basicDataService.getPackingType(id);
    }

    @GetMapping(path = "/api/packingType")
    List<PackingType> listPackingType(){
        return basicDataService.listPackingType();
    }

    @PostMapping(path = "/api/plaqueTagPersianPart/add")
    Long addPlaqueTagPersianPart(@RequestBody PlaqueTagPersianPart plaqueTagPersianPart){
        return basicDataService.addPlaqueTagPersianPart(plaqueTagPersianPart);
    }

    @PostMapping(path = "/api/plaqueTagPersianPart/edit")
    Long editPlaqueTagPersianPart(@RequestBody PlaqueTagPersianPart plaqueTagPersianPart){
        return basicDataService.editPlaqueTagPersianPart(plaqueTagPersianPart);
    }

    @PostMapping(path = "/api/plaqueTagPersianPart/remove/{id}")
    Long removePlaqueTagPersianPart(@PathVariable Long id){
        return basicDataService.removePlaqueTagPersianPart(id);
    }

    @GetMapping(path = "/api/plaqueTagPersianPart/{id}")
    PlaqueTagPersianPart getPlaqueTagPersianPart(@PathVariable Long id){
        return basicDataService.getPlaqueTagPersianPart(id);
    }

    @GetMapping(path = "/api/plaqueTagPersianPart")
    List<PlaqueTagPersianPart> listPlaqueTagPersianPart(){
        return basicDataService.listPlaqueTagPersianPart();
    }

    @PostMapping(path = "/api/requestStatus/add")
    Long addRequestStatus(@RequestBody RequestStatus requestStatus){
        return basicDataService.addRequestStatus(requestStatus);
    }

    @PostMapping(path = "/api/requestStatus/edit")
    Long editRequestStatus(@RequestBody RequestStatus requestStatus){
        return basicDataService.editRequestStatus(requestStatus);
    }

    @PostMapping(path = "/api/requestStatus/remove/{id}")
    Long removeRequestStatus(@PathVariable Long id){
        return basicDataService.removeRequestStatus(id);
    }

    @GetMapping(path = "/api/requestStatus/{id}")
    RequestStatus getRequestStatus(@PathVariable Long id){
        return basicDataService.getRequestStatus(id);
    }

    @GetMapping(path = "/api/requestStatus")
    List<RequestStatus> listRequestStatus(){
        return basicDataService.listRequestStatus();
    }
}
