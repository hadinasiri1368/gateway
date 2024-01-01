package org.getWay.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    private Long id;
    private Driver driver;
    private Person person;
    private Long fuelTypeId;
    private Long carGroupId;
    private Long carCapacityId;
    private Plaque plaque;
    private Long fleetTypeId;
    private String VIN;
    private String chassieNumber;
    private String engineNumber;
    private String PIN;
    private String PAN;
    private String trackingCode;
}
