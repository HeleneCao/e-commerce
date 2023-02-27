package com.ecommerce.dto.mapper;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {TagMapper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ProductMapper {

    ProductDto toProductDto(ProductEntity productEntity);

    ProductEntity toProductEntity(ProductDto productDto);

    ProductEntity toProduct(ProductDto productDto, @MappingTarget ProductEntity productEntity);


}
