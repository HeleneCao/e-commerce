package com.ecommerce.service;


import com.ecommerce.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface OrderService {

    OrderEntity save(OrderEntity orderEntity);

    OrderEntity findById(Long id);

    void deleteById(Long id);

    OrderEntity update(Long id, OrderEntity orderEntity);

    Page<OrderEntity> findAll(Pageable pageable);
}
