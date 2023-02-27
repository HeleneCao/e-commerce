package com.ecommerce.service.impl;

import com.ecommerce.entity.OrderEntity;
import com.ecommerce.entity.UserEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;


    @Override
    public OrderEntity save(OrderEntity orderEntity) {
        log.debug("Saving order {}", orderEntity);
        return orderRepository.save(orderEntity);
    }

    @Override
    public OrderEntity findById(Long id) {
        log.debug("Finding order by id {}", id);
        Optional<OrderEntity> orderEntity = orderRepository.findById(id);
        return orderEntity.orElseThrow(() -> new NotFoundException("Order not found"));
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting user by id {}", id);
        Optional<OrderEntity> orderEntity = orderRepository.findById(id);
        if (orderEntity.isEmpty()) {
            throw new NotFoundException("error.order.notFound");
        }
        orderRepository.deleteById(id);
    }

    @Override
    public OrderEntity update(Long id, OrderEntity orderEntity) {
        log.debug("Updating order {}", orderEntity);
        OrderEntity orderOptional = orderRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.order.notFound"));
        orderOptional.setOrderDate(orderEntity.getOrderDate());
        orderOptional.setStatusDate(orderEntity.getStatusDate());
        orderOptional.setComment(orderEntity.getComment());
        return orderRepository.save(orderOptional);
    }

    @Override
    public Page<OrderEntity> findAll(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }

}
