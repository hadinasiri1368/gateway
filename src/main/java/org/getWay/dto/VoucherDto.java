package org.getWay.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class VoucherDto {
    private Long id;
    private String description;
    private String voucherDate;
    private List<VoucherDetailDto> voucherDetails;
}
