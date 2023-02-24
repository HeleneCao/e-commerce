package com.ecommerce.dto.mapper;

import com.ecommerce.dto.UserDto;
import com.ecommerce.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {OrderMapper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper  {

    UserDto toUserDto(UserEntity userEntity);

    UserEntity toUserEntity(UserDto userDto);

    UserEntity toUserEntity(UserDto userDto, @MappingTarget UserEntity userEntity);
}
