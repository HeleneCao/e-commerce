package com.ecommerce.service;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ProductService {

    ProductEntity save(ProductEntity productEntity);

    ProductEntity findById(Long id) ;

    void deleteById(Long id);

    ProductEntity update(Long id, ProductEntity productEntity);

    Page<ProductEntity> findAll(Pageable pageable);
}
