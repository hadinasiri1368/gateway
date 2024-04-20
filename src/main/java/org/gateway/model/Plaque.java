package org.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Plaque {
    private Long id;
    private boolean isFreeZone;
    private String leftPlaqueTag;
    private Long plaqueTagPersianPartId;
    private String middlePlaqueTag;
    private String rightPlaqueTag;
    private String leftPlaqueFreeZoneTag;
    private String rightPlaqueFreeZoneTag;
}
