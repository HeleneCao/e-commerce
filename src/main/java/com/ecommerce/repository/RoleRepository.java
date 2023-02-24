package com.ecommerce.repository;

import com.ecommerce.entities.ProductEntity;
import com.ecommerce.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
}