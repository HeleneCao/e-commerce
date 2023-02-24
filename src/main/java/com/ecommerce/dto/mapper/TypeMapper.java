package com.ecommerce.dto.mapper;

import com.ecommerce.dto.TypeDto;
import com.ecommerce.entity.TypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TypeMapper {

    TypeDto toTypeDto(TypeEntity typeEntity);

    TypeEntity toType(TypeDto typeDto);

    TypeEntity toType(TypeDto typeDto, @MappingTarget TypeEntity typeEntity);
}
