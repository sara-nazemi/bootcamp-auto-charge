package com.example.bootcampautocharge.models.dtoes;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AutoChargeDto {

    private Long id;
    private Long balance;
    private Long chargeAmount;
    private Long walletId;
}
