package org.getWay.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private Long id;
    private Order order;
    private Long baseInfoGoodId;
    private Long packingTypeId;
    private Long loadingTypeId;
    private Long carGroupId;
    private Long carCapacityId;
    private Float weight;
    private Integer packageCount;
    private Long valuePrice;
}
