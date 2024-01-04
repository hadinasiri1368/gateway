package org.getWay.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubsidiaryLedger {
    private Long id;
    private Integer number;
    private String name;
    private GeneralLedger generalLedger;
}
