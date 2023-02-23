package com.ecommerce.repository;

import com.ecommerce.entities.OrderLineEntity;
import com.ecommerce.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLineEntity,Long> {
}
