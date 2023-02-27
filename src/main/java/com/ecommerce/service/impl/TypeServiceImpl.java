package com.ecommerce.service.impl;

import com.ecommerce.entity.TypeEntity;
import com.ecommerce.exception.NotFoundException;
import com.ecommerce.repository.TypeRepository;
import com.ecommerce.service.TypeService;
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
public class TypeServiceImpl implements TypeService {

    private final TypeRepository typeRepository;
    @Override
    public TypeEntity save(TypeEntity typeEntity) {
        log.debug("Saving type {}", typeEntity);
        return typeRepository.save(typeEntity);
    }


    @Override
    public TypeEntity findById(Long id) {
        log.debug("Finding type by id {}", id);
        Optional<TypeEntity> type = typeRepository.findById(id);
        return type.orElseThrow(() -> new NotFoundException("Type not found"));
    }

    @Override
    public void deleteById(Long id) {
        log.debug("Deleting type by id {}", id);
        Optional<TypeEntity> type = typeRepository.findById(id);
        if (type.isEmpty()) {
            throw new NotFoundException("error.type.notFound");
        }
        typeRepository.deleteById(id);
    }

    @Override
    public Page<TypeEntity> findAll(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }


    @Override
    public TypeEntity update(Long id, TypeEntity typeEntity) {
        log.debug("Updating type {}", typeEntity);
        TypeEntity typeOptional = typeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("error.type.notFound"));
        typeOptional.setTitle(typeEntity.getTitle());
        return typeRepository.save(typeOptional);
    }
}
