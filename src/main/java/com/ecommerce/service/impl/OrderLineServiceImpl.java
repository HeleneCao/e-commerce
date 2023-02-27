package com.ecommerce.service.impl;


import com.ecommerce.entity.OrderLineEntity;
import com.ecommerce.entity.UserEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.OrderLineRepository;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderLineService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class OrderLineServiceImpl implements OrderLineService {


    private final OrderLineRepository orderLineRepository;
    @Override
    public OrderLineEntity save(OrderLineEntity orderLineEntity) {
        log.debug("Saving order line {}", orderLineEntity );
        return orderLineRepository.save(orderLineEntity);
    }

    @Override
    public OrderLineEntity findById(Long id) {
        log.debug("Finding order line by id {}", id);
        Optional<OrderLineEntity> orderLineEntity = orderLineRepository.findById(id);
        return orderLineEntity.orElseThrow(() -> new NotFoundException("Order line not found"));
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting order line by id {}", id);
        Optional<OrderLineEntity> orderLineEntity = orderLineRepository.findById(id);
        if (orderLineEntity.isEmpty()) {
            throw new NotFoundException("error.orderLine.notFound");
        }

    }

    @Override
    public OrderLineEntity update(Long id, OrderLineEntity orderLineEntity) {
        log.debug("Updating user {}", orderLineEntity);
        OrderLineEntity orderLineOptional = orderLineRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.user.notFound"));
        orderLineOptional.setNumber(orderLineEntity.getNumber());
        orderLineOptional.setUnit_price(orderLineEntity.getUnit_price());

        return orderLineRepository.save(orderLineOptional);
    }


}
