package com.example.bootcampautocharge.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardInfoEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "CVV2")
    private String cvv2;
    @Column(name = "EXPIRE_MONTH")
    private String expireMonth;
    @Column(name = "EXPIRE_YEAR")
    private String expireYear;
    @Column(name = "FIX_PASSWORD")
    private String fixPassword;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTO_CHARGE_ID", nullable = false)
    private AutoChargeEntity autoCharge;
}
