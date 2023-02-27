package com.ecommerce.service;

import com.ecommerce.dto.TypeDto;
import com.ecommerce.entity.TypeEntity;
import com.ecommerce.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.lang.reflect.Type;

public interface TypeService {

    TypeEntity save(TypeEntity typeEntity);

    TypeEntity findById(Long id);

    void deleteById(Long id);

    Page<TypeEntity> findAll(Pageable pageable);

    TypeEntity update(Long id, TypeEntity typeEntity);
}
