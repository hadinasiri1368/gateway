package org.getWay.service;

import jakarta.servlet.http.HttpServletRequest;
import org.getWay.dto.*;
import org.getWay.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(name = "TRANSPORT")
public interface TransportService {

    @PostMapping(path = "/api/person/add")
    Long addPerson(@RequestBody Person Person);

    @PostMapping(path = "/api/person/edit")
    Long editPerson(@RequestBody Person person);

    @PostMapping(path = "/api/person/remove/{id}")
    Long removePerson(@PathVariable Long id);

    @GetMapping(path = "/api/person/{id}")
    Person getPerson(@PathVariable Long id);

    @GetMapping(path = "/api/person")
    List<Person> listPerson();

    @PostMapping(path = "/api/driver/add")
    Long addDriver(@RequestBody DriverDto driverDto);

    @PostMapping(path = "/api/driver/edit")
    Long editDriver(@RequestBody DriverDto driverDto);

    @PostMapping(path = "/api/driver/remove/{id}")
    Long removeDriver(@PathVariable Long id);

    @GetMapping(path = "/api/driver/{id}")
    Driver getDriver(@PathVariable Long id);

    @GetMapping(path = "/api/driver")
    List<Driver> listDriver();

    @PostMapping(path = "/api/car/add")
    Long addCar(@RequestBody CarDto carDto);

    @PostMapping(path = "/api/car/edit")
    Long editCar(@RequestBody CarDto carDto);

    @PostMapping(path = "/api/car/remove/{id}")
    Long removeCar(@PathVariable Long id);

    @GetMapping(path = "/api/car/{id}")
    Car getCar(@PathVariable Long id);

    @GetMapping(path = "/api/car")
    List<Car> listCar();

    @PostMapping(path = "/api/plaque/add")
    Long addPlaque(@RequestBody PlaqueDto plaqueDto);

    @PostMapping(path = "/api/plaque/edit")
    Long editPlaque(@RequestBody PlaqueDto plaqueDto);

    @PostMapping(path = "/api/plaque/remove/{id}")
    Long removePlaque(@PathVariable Long id);

    @GetMapping(path = "/api/plaque/{id}")
    Plaque getPlaque(@PathVariable Long id);

    @GetMapping(path = "/api/plaque")
    List<Plaque> listPlaque();

    @PostMapping(path = "/api/generalLedger/add")
    Long addGeneralLedger(@RequestBody GeneralLedger generalLedger);

    @PostMapping(path = "/api/generalLedger/edit")
    Long editGeneralLedger(@RequestBody GeneralLedger generalLedger);

    @PostMapping(path = "/api/generalLedger/remove/{id}")
    Long removeGeneralLedger(@PathVariable Long id);

    @GetMapping(path = "/api/generalLedger/{id}")
    GeneralLedger getGeneralLedger(@PathVariable Long id);

    @GetMapping(path = "/api/generalLedger")
    List<GeneralLedger> listGeneralLedger();

    @PostMapping(path = "/api/subsidiaryLedger/add")
    Long addSubsidiaryLedger(@RequestBody SubsidiaryLedgerDto subsidiaryLedgerDto);

    @PostMapping(path = "/api/subsidiaryLedger/edit")
    Long editSubsidiaryLedger(@RequestBody SubsidiaryLedgerDto subsidiaryLedgerDto);

    @PostMapping(path = "/api/subsidiaryLedger/remove/{id}")
    Long removeSubsidiaryLedger(@PathVariable Long id);

    @GetMapping(path = "/api/subsidiaryLedger/{id}")
    SubsidiaryLedger getSubsidiaryLedger(@PathVariable Long id);

    @GetMapping(path = "/api/subsidiaryLedger")
    List<SubsidiaryLedger> listSubsidiaryLedger();

    @PostMapping(path = "/api/detailLedger/add")
    Long addDetailLedger(@RequestBody DetailLedgerDto detailLedgerDto);

    @PostMapping(path = "/api/detailLedger/edit")
    Long editDetailLedger(@RequestBody DetailLedgerDto detailLedgerDto);

    @PostMapping(path = "/api/detailLedger/remove/{id}")
    Long removeDetailLedger(@PathVariable Long id);

    @GetMapping(path = "/api/detailLedger/{id}")
    DetailLedger getDetailLedger(@PathVariable Long id);

    @GetMapping(path = "/api/detailLedger")
    List<DetailLedger> listDetailLedger();

    @PostMapping(path = "/api/voucher/add")
    Long addVoucher(@RequestBody VoucherDto voucherDto);

    @PostMapping(path = "/api/voucher/edit")
    Long editVoucher(@RequestBody Voucher voucher);

    @PostMapping(path = "/api/voucherDetail/edit")
    Long editVoucherDetail(@RequestBody VoucherDetailDto voucherDetailDto);

    @PostMapping(path = "/api/voucherDetailList/edit")
    Long editVoucherDetailList(@RequestBody List<VoucherDetailDto> voucherDetailDtos);

    @PostMapping(path = "/api/voucher/remove/{id}")
    Long removeVoucher(@PathVariable Long id);

    @PostMapping(path = "/api/voucherDetail/remove")
    Long removeVoucherDetail(@RequestBody List<VoucherDetailDto> voucherDetailDtos);

    @GetMapping(path = "/api/voucher/{id}")
    Voucher getVoucher(@PathVariable Long id);

    @GetMapping(path = "/api/voucher")
    List<Voucher> listVoucher();

    @PostMapping(path = "/api/order/add")
    Long addOrder(@RequestBody OrderDto orderDto);

    @PostMapping(path = "/api/orderDetail/add")
    Long addOrderDetail(@RequestBody List<OrderDetailDto> orderDetailDtos);

    @PostMapping(path = "/api/orderImage/add", consumes = {"multipart/form-data"})
    Long addOrderImage(@RequestParam("orderId") Long orderId, @RequestParam("image") MultipartFile[] multipartFiles);

    @PostMapping(path = "/api/order/remove/{id}")
    Long removeOrder(@PathVariable Long id);

    @GetMapping(path = "/api/order/{id}")
    Order getOrder(@PathVariable Long id);

    @GetMapping(path = "/api/order")
    List<Order> listOrder();

    @PostMapping(path = "/api/acceptOrderCarDriver")
    Long acceptOrderCarDriver(@RequestParam("orderId") Long orderId, @RequestParam("carId") Long carId);

    @PostMapping(path = "/api/changeOrderStatus")
    Long changeOrderStatus(@ModelAttribute("orderId") Long orderId);

    @PostMapping(path = "/api/cancelledOrder")
    Long cancelledOrder(@ModelAttribute("orderId") Long orderId);

    @PostMapping(path = "/api/userCompany/add")
    Long addUserCompany(@RequestBody UserCompanyDto userCompanyDto);

    @PostMapping(path = "/api/userCompany/edit")
    Long editUserCompany(@RequestBody UserCompanyDto userCompanyDto);

    @PostMapping(path = "/api/userCompany/remove/{id}")
    Long removeGUserCompany(@PathVariable Long id);

    @GetMapping(path = "/api/userCompany/{id}")
    UserCompany getUserCompany(@PathVariable Long id);

    @GetMapping(path = "/api/userCompanyByUserId/{userId}")
    List<UserCompany> getUserCompanyByUserId(@PathVariable Long userId);

    @GetMapping(path = "/api/userCompany")
    List<UserCompany> listUserCompany();

}



