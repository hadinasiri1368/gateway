package org.getWay.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Voucher  {
    private Long id;
    private String description;
    private String voucherDate;
    private List<VoucherDetail> voucherDetails;
}
