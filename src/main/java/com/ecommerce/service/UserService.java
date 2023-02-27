package com.ecommerce.service;

import com.ecommerce.dto.UserDto;
import com.ecommerce.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {


    UserEntity save(UserEntity userEntity);

    UserEntity findByEmail(String email);

    UserEntity findById(Long id);

    void deleteById(Long id);

    Page<UserEntity> findAll(Pageable pageable);

    UserEntity update(Long id, UserEntity userEntity);
}
