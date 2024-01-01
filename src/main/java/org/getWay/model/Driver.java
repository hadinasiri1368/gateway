package org.getWay.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Driver {
    private Long id;
    private Person person;
    private String trackingCode;
    private Long driverLicenseTypeId;
    private String driverLicenseIssueDate;
    private Integer driverLicenseValidDuration;
}
