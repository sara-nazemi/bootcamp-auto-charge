package com.example.bootcampautocharge.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AutoChargeEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "BALANCE")
    private Long balance;
    @Column(name = "CHARGE_AMOUNT")
    private Long chargeAmount;
    @Column(name = "WALLET_ID")
    private Long walletId;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "autoCharge", cascade = CascadeType.MERGE)
    private List<CardInfoEntity> cards;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "autoCharge2", cascade = CascadeType.MERGE)
    private List<TransactionLogEntity> transactions;

}
