package com.ecommerce.service;

import com.ecommerce.dto.ProductDto;


public interface ProductService {

    ProductDto save(ProductDto productDto);

    ProductDto findById(Long id);

    void deleteById(Long id);

    ProductDto update(Long id, ProductDto productDto);
}
