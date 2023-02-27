package com.ecommerce.dto.mapper;

import com.ecommerce.dto.RoleDto;
import com.ecommerce.entity.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface RoleMapper {

    RoleDto toRoleDto(RoleEntity roleEntity);

    RoleEntity toRoleEntity(RoleDto roleDto);

    RoleEntity toRole(RoleDto roleDto, @MappingTarget RoleEntity roleEntity);
}
