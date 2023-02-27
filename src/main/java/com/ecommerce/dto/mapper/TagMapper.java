package com.ecommerce.dto.mapper;

import com.ecommerce.dto.TagDto;
import com.ecommerce.entity.TagEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {ProductMapper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TagMapper {

    TagDto toTagDto(TagEntity tagEntity);

    TagEntity toTagEntity(TagDto tagDto);

    TagEntity toTag(TagDto tagDto, @MappingTarget TagEntity tagEntity);
}
