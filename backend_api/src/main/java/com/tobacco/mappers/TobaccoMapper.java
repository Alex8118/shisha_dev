package com.tobacco.mappers;

import com.tobacco.dto.TobaccoDto;
import com.tobacco.models.TobaccoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TobaccoMapper {

    public abstract TobaccoDto fromTobaccoEntity(TobaccoEntity source);

    @InheritInverseConfiguration
    public abstract TobaccoEntity toTobaccoEntity(TobaccoDto target);

}
