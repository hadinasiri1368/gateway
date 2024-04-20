package org.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryDivision {
    private Long id;
    private CountryDivision parent;
    private String code;
    private String name;
    private Integer levelToRoot;
    private Boolean isFreeZone;
}