package com.ecommerce.service;

import com.ecommerce.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save(UserDto userDto);

    UserDto findByEmail(String email);

    UserDto findById(Long id);

    void deleteById(Long id);

    Page<UserDto> findAll(Pageable pageable);

    UserDto update(Long id, UserDto userDto);
}
