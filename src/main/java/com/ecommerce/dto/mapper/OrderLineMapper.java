package com.ecommerce.dto.mapper;

import com.ecommerce.dto.OrderLineDto;
import com.ecommerce.entity.OrderLineEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OrderLineMapper {

    OrderLineDto toOrderLineDto(OrderLineEntity orderLineEntity);

    OrderLineEntity toOrderLineEntity(OrderLineDto orderLineDto);

    OrderLineEntity toOrderLine(OrderLineDto orderLineDto, @MappingTarget OrderLineEntity orderLineEntity);
}
