package com.ecommerce.service;

import com.ecommerce.dto.TypeDto;

import java.lang.reflect.Type;

public interface TypeService {

    TypeDto save(TypeDto typeDto);

    TypeDto findById(Long id);

    void deleteById(Long id);

    TypeDto update(Long id, TypeDto typeDto);
}
