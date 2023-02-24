package com.ecommerce.service;

import com.ecommerce.dto.OrderLineDto;

public interface OrderLineService {

    OrderLineDto save(OrderLineDto OrderLineDto);

    OrderLineDto findById(Long id);

    void deleteById(Long id);

    OrderLineDto update(Long id, OrderLineDto orderLineDto);
}
