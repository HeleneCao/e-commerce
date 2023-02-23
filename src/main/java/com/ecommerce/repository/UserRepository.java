package com.ecommerce.repository;

import com.ecommerce.entities.ProductEntity;
import com.ecommerce.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
