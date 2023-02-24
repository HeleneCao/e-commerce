package com.ecommerce.dto.mapper;

import com.ecommerce.dto.OrderDto;
import com.ecommerce.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {OrderLineMapper.class}, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OrderMapper {

    OrderDto toOrderDto(OrderEntity orderEntity);

    OrderEntity toOrder(OrderDto orderDto);

    OrderEntity toOrder(OrderDto orderDto, @MappingTarget OrderEntity orderEntity);
}
