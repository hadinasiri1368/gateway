package org.getWay.api;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.getWay.dto.*;
import org.getWay.model.*;
import org.getWay.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@SecurityRequirement(name = "Bearer Authentication")
public class TransportAPI {
    @Autowired
    TransportService transportService;

    @PostMapping(path = "/api/person/add")
    Long addPerson(@RequestBody Person person) {
        return transportService.addPerson(person);
    }

    @PostMapping(path = "/api/person/edit")
    Long editPerson(@RequestBody Person person) {
        return transportService.editPerson(person);
    }

    @PostMapping(path = "/api/person/remove/{id}")
    Long removePerson(@PathVariable Long id) {
        return transportService.removePerson(id);
    }

    @GetMapping(path = "/api/person/{id}")
    Person getPerson(@PathVariable Long id) {
        return transportService.getPerson(id);
    }

    @GetMapping(path = "/api/person")
    List<Person> listPerson() {
        return transportService.listPerson();
    }

    @PostMapping(path = "/api/driver/add")
    Long addDriver(@RequestBody DriverDto driverDto) {
        return transportService.addDriver(driverDto);
    }

    @PostMapping(path = "/api/driver/edit")
    Long editDriver(@RequestBody DriverDto driverDto) {
        return transportService.editDriver(driverDto);
    }

    @PostMapping(path = "/api/driver/remove/{id}")
    Long removeDriver(@PathVariable Long id) {
        return transportService.removeDriver(id);
    }

    @GetMapping(path = "/api/driver/{id}")
    Driver getDriver(@PathVariable Long id) {
        return transportService.getDriver(id);
    }

    @GetMapping(path = "/api/driver")
    List<Driver> listDriver() {
        return transportService.listDriver();
    }

    @PostMapping(path = "/api/car/add")
    Long addCar(@RequestBody CarDto carDto) {
        return transportService.addCar(carDto);
    }

    @PostMapping(path = "/api/car/edit")
    Long editCar(@RequestBody CarDto carDto) {
        return transportService.editCar(carDto);
    }

    @PostMapping(path = "/api/car/remove/{id}")
    Long removeCar(@PathVariable Long id) {
        return transportService.removeCar(id);
    }

    @GetMapping(path = "/api/car/{id}")
    Car getCar(@PathVariable Long id) {
        return transportService.getCar(id);
    }

    @GetMapping(path = "/api/car")
    public List<Car> listCar() {
        return transportService.listCar();
    }

    @PostMapping(path = "/api/plaque/add")
    Long addPlaque(@RequestBody PlaqueDto plaqueDto) {
        return transportService.addPlaque(plaqueDto);
    }

    @PostMapping(path = "/api/plaque/edit")
    Long editPlaque(@RequestBody PlaqueDto plaqueDto) {
        return transportService.editPlaque(plaqueDto);
    }

    @PostMapping(path = "/api/plaque/remove/{id}")
    Long removePlaque(@PathVariable Long id) {
        return transportService.removePlaque(id);
    }

    @GetMapping(path = "/api/plaque/{id}")
    Plaque getPlaque(@PathVariable Long id) {
        return transportService.getPlaque(id);
    }

    @GetMapping(path = "/api/plaque")
    List<Plaque> listPlaque() {
        return transportService.listPlaque();
    }

    @PostMapping(path = "/api/generalLedger/add")
    Long addGeneralLedger(@RequestBody GeneralLedger generalLedger) {
        return transportService.addGeneralLedger(generalLedger);
    }

    @PostMapping(path = "/api/generalLedger/edit")
    Long editGeneralLedger(@RequestBody GeneralLedger generalLedger) {
        return transportService.editGeneralLedger(generalLedger);
    }

    @PostMapping(path = "/api/generalLedger/remove/{id}")
    Long removeGeneralLedger(@PathVariable Long id) {
        return transportService.removeGeneralLedger(id);
    }

    @GetMapping(path = "/api/generalLedger/{id}")
    GeneralLedger getGeneralLedger(@PathVariable Long id) {
        return transportService.getGeneralLedger(id);
    }

    @GetMapping(path = "/api/generalLedger")
    List<GeneralLedger> listGeneralLedger() {
        return transportService.listGeneralLedger();
    }

    @PostMapping(path = "/api/subsidiaryLedger/add")
    Long addSubsidiaryLedger(@RequestBody SubsidiaryLedgerDto subsidiaryLedgerDto) {
        return transportService.addSubsidiaryLedger(subsidiaryLedgerDto);
    }

    @PostMapping(path = "/api/subsidiaryLedger/edit")
    Long editSubsidiaryLedger(@RequestBody SubsidiaryLedgerDto subsidiaryLedgerDto) {
        return transportService.editSubsidiaryLedger(subsidiaryLedgerDto);
    }

    @PostMapping(path = "/api/subsidiaryLedger/remove/{id}")
    Long removeSubsidiaryLedger(@PathVariable Long id) {
        return transportService.removeSubsidiaryLedger(id);
    }

    @GetMapping(path = "/api/subsidiaryLedger/{id}")
    SubsidiaryLedger getSubsidiaryLedger(@PathVariable Long id) {
        return transportService.getSubsidiaryLedger(id);
    }

    @GetMapping(path = "/api/subsidiaryLedger")
    List<SubsidiaryLedger> listSubsidiaryLedger() {
        return transportService.listSubsidiaryLedger();
    }

    @PostMapping(path = "/api/detailLedger/add")
    Long addDetailLedger(@RequestBody DetailLedgerDto detailLedgerDto) {
        return transportService.addDetailLedger(detailLedgerDto);
    }

    @PostMapping(path = "/api/detailLedger/edit")
    Long editDetailLedger(@RequestBody DetailLedgerDto detailLedgerDto) {
        return transportService.editDetailLedger(detailLedgerDto);
    }

    @PostMapping(path = "/api/detailLedger/remove/{id}")
    Long removeDetailLedger(@PathVariable Long id) {
        return transportService.removeDetailLedger(id);
    }

    @GetMapping(path = "/api/detailLedger/{id}")
    DetailLedger getDetailLedger(@PathVariable Long id) {
        return transportService.getDetailLedger(id);
    }

    @GetMapping(path = "/api/detailLedger")
    List<DetailLedger> listDetailLedger() {
        return transportService.listDetailLedger();
    }

    @PostMapping(path = "/api/voucher/add")
    Long addVoucher(@RequestBody VoucherDto voucherDto) {
        return transportService.addVoucher(voucherDto);
    }

    @PostMapping(path = "/api/voucher/edit")
    Long editVoucher(@RequestBody Voucher voucher) {
        return transportService.editVoucher(voucher);
    }

    @PostMapping(path = "/api/voucherDetail/edit")
    Long editVoucherDetail(@RequestBody VoucherDetailDto voucherDetailDto) {
        return transportService.editVoucherDetail(voucherDetailDto);
    }

    @PostMapping(path = "/api/voucherDetailList/edit")
    Long editVoucherDetailList(@RequestBody List<VoucherDetailDto> voucherDetailDtos) {
        return transportService.editVoucherDetailList(voucherDetailDtos);
    }

    @PostMapping(path = "/api/voucher/remove/{id}")
    Long removeVoucher(@PathVariable Long id) {
        return transportService.removeVoucher(id);
    }

    @PostMapping(path = "/api/voucherDetail/remove")
    Long removeVoucherDetail(@RequestBody List<VoucherDetailDto> voucherDetailDtos) {
        return transportService.removeVoucherDetail(voucherDetailDtos);
    }

    @GetMapping(path = "/api/voucher/{id}")
    Voucher getVoucher(@PathVariable Long id) {
        return transportService.getVoucher(id);
    }

    @GetMapping(path = "/api/voucher")
    List<Voucher> listVoucher() {
        return transportService.listVoucher();
    }

    @PostMapping(path = "/api/order/add")
    Long addOrder(@RequestBody OrderDto orderDto) {
        return transportService.addOrder(orderDto);
    }

    @PostMapping(path = "/api/orderDetail/add")
    Long addOrderDetail(@RequestBody List<OrderDetailDto> orderDetailDtos) {
        return transportService.addOrderDetail(orderDetailDtos);
    }

    @PostMapping(path = "/api/orderImage/add", consumes = {"multipart/form-data"})
    Long addOrderImage(@RequestParam("orderId") Long orderId, @RequestParam("image") MultipartFile[] multipartFiles) {
        return transportService.addOrderImage(orderId, multipartFiles);
    }

    @PostMapping(path = "/api/order/remove/{id}")
    Long removeOrder(@PathVariable Long id) {
        return transportService.removeOrder(id);
    }

    @GetMapping(path = "/api/order/{id}")
    Order getOrder(@PathVariable Long id) {
        return transportService.getOrder(id);
    }

    @GetMapping(path = "/api/order")
    List<Order> listOrder() {
        return transportService.listOrder();
    }

    @PostMapping(path = "/api/acceptOrderCarDriver")
    Long acceptOrderCarDriver(@RequestParam("orderId") Long orderId, @RequestParam("carId") Long carId) {
        return transportService.acceptOrderCarDriver(orderId, carId);
    }

    @PostMapping(path = "/api/changeOrderStatus")
    Long changeOrderStatus(@ModelAttribute("orderId") Long orderId) {
        return transportService.changeOrderStatus(orderId);
    }

    @PostMapping(path = "/api/cancelledOrder")
    Long cancelledOrder(@ModelAttribute("orderId") Long orderId) {
        return transportService.cancelledOrder(orderId);
    }

    @PostMapping(path = "/api/userCompany/add")
    Long addUserCompany(@RequestBody UserCompanyDto userCompanyDto) {
        return transportService.addUserCompany(userCompanyDto);
    }

    @PostMapping(path = "/api/userCompany/edit")
    Long editUserCompany(@RequestBody UserCompanyDto userCompanyDto){
        return transportService.editUserCompany(userCompanyDto);
    }

    @PostMapping(path = "/api/userCompany/remove/{id}")
    Long removeGUserCompany(@PathVariable Long id){
        return transportService.removeGUserCompany(id);
    }

    @GetMapping(path = "/api/userCompany/{id}")
    UserCompany getUserCompany(@PathVariable Long id){
        return transportService.getUserCompany(id);
    }

    @GetMapping(path = "/api/getUserCompanyByUserId/{userId}")
    List<UserCompany> getCompany(@PathVariable Long userId){
        return transportService.getUserCompanyByUserId(userId);
    }

    @GetMapping(path = "/api/userCompany")
    List<UserCompany> listUserCompany(){
        return transportService.listUserCompany();
    }

}
