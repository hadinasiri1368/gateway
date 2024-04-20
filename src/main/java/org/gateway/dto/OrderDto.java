package org.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class OrderDto {
    private Long id;
    private Long userId;
    private Long sourceId;
    private Long driverId;
    private Long carId;
    private Long destinationId;
    private Long orderStatusId;
    private Long carPropertyId;
    private String orderDate;
    private String loadingDate;
    private String loadingTime;
    private String sourcePostalCode;
    private String destinationPostalCode;
    private String description;
    private Long price;
    private Long minPrice;
    private Boolean onlyMyCompanyDriver;
    private List<OrderDetailDto> orderDetails;
}
