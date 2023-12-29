package com.example.bootcampautocharge.converters;

import com.example.bootcampautocharge.models.dtoes.CardInfoDto;
import com.example.bootcampautocharge.models.entities.CardInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CardInfoConverter extends BaseConverter<CardInfoEntity, CardInfoDto>{
    @Override
    @Mapping(source = "autoCharge.id",target = "autoCharge")
    @Mapping(source = "autoCharge.version",target = "versionAuto")
    CardInfoEntity convertEntity(CardInfoDto model);

    @Override
    @Mapping(source = "autoCharge",target = "autoCharge.id")
    @Mapping(source = "versionAuto",target = "autoCharge.version")
    CardInfoDto convertDto(CardInfoEntity model);
}
