package com.example.bootcampautocharge.models.dtoes;

import com.example.bootcampautocharge.models.entities.AutoChargeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardInfoDto {
    private Long id;
    private String cardNumber;
    private String cvv2;
    private String expireMonth;
    private String expireYear;
    private String fixPassword;
    private Long autoCharge;
    private Integer versionAuto;

}
