package com.tobacco.mappers;

import com.tobacco.dto.MyListDto;
import com.tobacco.models.MyList;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MyListMapper {

    MyListDto fromMyList(MyList source);

    @InheritInverseConfiguration
    @Mapping(target = "status", constant = "IN_PROGRESS")
    MyList toMyList(MyListDto target);


}
