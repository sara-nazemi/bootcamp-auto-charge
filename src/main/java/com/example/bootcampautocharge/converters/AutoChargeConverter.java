package com.example.bootcampautocharge.converters;

import com.example.bootcampautocharge.models.dtoes.AutoChargeDto;
import com.example.bootcampautocharge.models.entities.AutoChargeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AutoChargeConverter extends BaseConverter<AutoChargeEntity, AutoChargeDto>{

}
