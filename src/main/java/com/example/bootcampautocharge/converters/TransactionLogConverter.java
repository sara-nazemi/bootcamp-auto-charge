package com.example.bootcampautocharge.converters;

import com.example.bootcampautocharge.models.dtoes.TransactionLogDto;
import com.example.bootcampautocharge.models.entities.TransactionLogEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionLogConverter extends BaseConverter<TransactionLogEntity, TransactionLogDto>{

    @Override
    @Mapping(source = "autoCharge2.id",target = "autoCharge2")
    @Mapping(source = "autoCharge2.version",target = "versionAuto")
    TransactionLogEntity convertEntity(TransactionLogDto model);

    @Override
    @Mapping(source = "autoCharge2",target = "autoCharge2.id")
    @Mapping(source = "versionAuto",target = "autoCharge2.version")
    TransactionLogDto convertDto(TransactionLogEntity model);
}
