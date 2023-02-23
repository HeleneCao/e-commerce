package com.ecommerce.repository;

import com.ecommerce.entities.OrderEntity;
import com.ecommerce.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
}
