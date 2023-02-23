package com.ecommerce.repository;

import com.ecommerce.entities.ProductEntity;
import com.ecommerce.entities.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity,Long> {
}
