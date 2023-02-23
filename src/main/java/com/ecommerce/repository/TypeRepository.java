package com.ecommerce.repository;

import com.ecommerce.entities.ProductEntity;
import com.ecommerce.entities.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<TypeEntity,Long> {
}
