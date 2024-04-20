package org.gateway.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    private Long id;
    private Long userId;
    private Driver driver;
    private Car car;
    private Long sourceId;
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
    private List<OrderDetail> orderDetails;
    private List<OrderImage> orderImages;
}
