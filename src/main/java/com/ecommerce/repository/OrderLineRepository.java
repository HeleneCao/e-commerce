package com.ecommerce.repository;

import com.ecommerce.entity.OrderLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLineEntity,Long> {
}
