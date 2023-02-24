package com.ecommerce.repository;

import com.ecommerce.entity.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<TypeEntity,Long> {
}
