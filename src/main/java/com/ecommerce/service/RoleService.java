package com.ecommerce.service;

import com.ecommerce.dto.RoleDto;
import com.ecommerce.entity.RoleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface RoleService {

    RoleEntity save(RoleEntity roleEntity);

    RoleEntity findById(Long id);

    void deleteById(Long id);


    Page<RoleEntity> findAll(Pageable pageable);
}
