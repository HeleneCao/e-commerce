package com.ecommerce.service;

import com.ecommerce.dto.RoleDto;


public interface RoleService {

    RoleDto save(RoleDto roleDto);

    RoleDto findById(Long id);

    void deleteById(Long id);

    RoleDto update(Long id, RoleDto roleDto);
}
