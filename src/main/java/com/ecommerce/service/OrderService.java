package com.ecommerce.service;

import com.ecommerce.dto.OrderDto;


public interface OrderService {

    OrderDto save(OrderDto orderDto);

    OrderDto findById(Long id);

    void deleteById(Long id);

    OrderDto update(Long id, OrderDto orderDto);
}
