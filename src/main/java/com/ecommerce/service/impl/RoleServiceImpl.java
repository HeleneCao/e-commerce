package com.ecommerce.service.impl;

import com.ecommerce.dto.RoleDto;

import com.ecommerce.repository.RoleRepository;
import com.ecommerce.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class RoleServiceImpl implements RoleService {



    private final RoleRepository roleRepository;
    @Override
    public RoleDto save(RoleDto roleDto) {
        return null;
    }

    @Override
    public RoleDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public RoleDto update(Long id, RoleDto roleDto) {
        return null;
    }
}
