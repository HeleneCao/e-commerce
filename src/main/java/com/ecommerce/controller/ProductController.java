package com.ecommerce.controller;

import com.ecommerce.entity.ProductEntity;
import com.ecommerce.entity.UserEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
@Slf4j
public class ProductController {

    private final ProductService productService;

    @PostMapping("/register")
    public ResponseEntity<ProductEntity> register(@RequestBody @Valid ProductEntity productEntity) {
        log.debug("Registering product {}", productEntity);
        return ResponseEntity.ok(productService.save(productEntity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        log.debug("Deleting product by id {}", id);
        productService.deleteById(id);
        try {
            productService.findById(id);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } catch (NotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<Page<ProductEntity>> findAllWithPagination(Pageable pageable) {
        log.debug("Finding all products");
        return ResponseEntity.ok(productService.findAll(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductEntity> update(@PathVariable Long id, @RequestBody ProductEntity productEntity) {
        log.debug("Updating product {}", productEntity);
        return ResponseEntity.ok(productService.update(id, productEntity));
    }
}
