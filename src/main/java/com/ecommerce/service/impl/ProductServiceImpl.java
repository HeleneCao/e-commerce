package com.ecommerce.service.impl;

import com.ecommerce.dto.ProductDto;
import com.ecommerce.entity.ProductEntity;
import com.ecommerce.entity.TypeEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
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
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        log.debug("Saving product {}", productEntity);
        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity findById(Long id) {
        log.debug("Finding product by id {}", id);
        Optional<ProductEntity> product = productRepository.findById(id);
        return product.orElseThrow(() -> new NotFoundException("Product not found"));

    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting product by id {}", id);
        Optional<ProductEntity> product = productRepository.findById(id);
        if (product.isEmpty()) {
            throw new NotFoundException("error.product.notFound");
        }
        productRepository.deleteById(id);
    }

    @Override
    public ProductEntity update(Long id, ProductEntity productEntity) {
        log.debug("Updating type {}", productEntity);
        ProductEntity productOptional = productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.product.notFound"));
        productOptional.setName(productEntity.getName());
        productOptional.setPrice(productEntity.getPrice());
        productOptional.setQuantity(productEntity.getQuantity());
        productOptional.setTagEntityList(productEntity.getTagEntityList());
        return productRepository.save(productOptional);
    }



    @Override
    public Page<ProductEntity> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
