package com.example.bootcampautocharge.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionLogEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "DATE")
    private Date date;
    @Column(name = "AMOUNT")
    private Long amount;
    @Column(name = "WALLET_ID")
    private Long walletId;
    @Column(name = "AUTO_CHARGE_ID")
    private Long autoChargeId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTO_CHARGE_ID", nullable = false)
    private AutoChargeEntity autoCharge2;
}
