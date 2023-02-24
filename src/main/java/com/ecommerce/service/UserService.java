package com.ecommerce.service;

import com.ecommerce.dto.UserDto;

public interface UserService {

    UserDto save(UserDto userDto);

    UserDto findByEmail(String email);

    UserDto findById(Long id);

    void deleteById(Long id);

    UserDto update(Long id, UserDto userDto);
}
