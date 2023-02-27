package com.ecommerce.service.impl;

import com.ecommerce.entity.RoleEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.RoleRepository;
import com.ecommerce.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class RoleServiceImpl implements RoleService {


    private final RoleRepository roleRepository;

    @Override
    public RoleEntity save(RoleEntity roleEntity) {
        log.debug("Saving type {}", roleEntity);
        return roleRepository.save(roleEntity);
    }

    @Override
    public RoleEntity findById(Long id) {
        log.debug("Finding role by id {}", id);
        Optional<RoleEntity> role = roleRepository.findById(id);
        return role.orElseThrow(() -> new NotFoundException("Role not found"));
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting role by id {}", id);
        Optional<RoleEntity> type = roleRepository.findById(id);
        if (type.isEmpty()) {
            throw new NotFoundException("error.role.notFound");
        }
        roleRepository.deleteById(id);
    }

    @Override
    public Page<RoleEntity> findAll(Pageable pageable) {
        return roleRepository.findAll(pageable);
    }


}
