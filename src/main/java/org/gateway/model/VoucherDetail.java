package org.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VoucherDetail {
    private Voucher voucher;
    private SubsidiaryLedger subsidiaryLedger;
    private DetailLedger detailLedger;
    private Long debitAmount;
    private Long creditAmount;
}
