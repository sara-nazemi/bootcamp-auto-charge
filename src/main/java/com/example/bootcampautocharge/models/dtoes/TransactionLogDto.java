package com.example.bootcampautocharge.models.dtoes;

import com.example.bootcampautocharge.models.entities.AutoChargeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionLogDto {
    private Long id;
    private Date date;
    private Long amount;
    private Long walletId;
    private Long autoChargeId;
    private Long autoCharge2;
    private Integer versionAuto;
}
