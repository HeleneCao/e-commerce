package com.ecommerce.service.impl;

import com.ecommerce.dto.OrderLineDto;

import com.ecommerce.repository.OrderLineRepository;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderLineService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class OrderLineServiceImpl implements OrderLineService {


    private final OrderLineRepository orderLineRepository;
    @Override
    public OrderLineDto save(OrderLineDto OrderLineDto) {
        return null;
    }

    @Override
    public OrderLineDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public OrderLineDto update(Long id, OrderLineDto orderLineDto) {
        return null;
    }
}
