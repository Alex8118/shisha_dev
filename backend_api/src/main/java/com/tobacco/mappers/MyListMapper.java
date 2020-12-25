package com.tobacco.mappers;

import com.tobacco.dto.MyListDto;
import com.tobacco.models.MyListEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class MyListMapper {

    public abstract MyListDto fromMyListEntity(MyListEntity source);

    @InheritInverseConfiguration
    public abstract MyListEntity toMyListEntity(MyListDto target);

}
