package com.ecommerce.service;

import com.ecommerce.dto.OrderLineDto;
import com.ecommerce.entity.OrderLineEntity;


public interface OrderLineService {

    OrderLineEntity save(OrderLineEntity orderLineEntity);

    OrderLineEntity findById(Long id);

    void deleteById(Long id);

    OrderLineEntity update(Long id, OrderLineEntity orderLineEntity);


}
